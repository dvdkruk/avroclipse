package avroclipse.generator.java

import avroclipse.avroIDL.ArrayFieldType
import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.CustomTypeLink
import avroclipse.avroIDL.EnumType
import avroclipse.avroIDL.ErrorType
import avroclipse.avroIDL.FieldType
import avroclipse.avroIDL.FixedType
import avroclipse.avroIDL.MapFieldType
import avroclipse.avroIDL.PrimativeTypeLink
import avroclipse.avroIDL.RPCMessage
import avroclipse.avroIDL.RecordType
import avroclipse.avroIDL.ReturnTypeLink
import avroclipse.avroIDL.SimpleFieldType
import avroclipse.avroIDL.Type
import avroclipse.avroIDL.TypeDef
import avroclipse.avroIDL.TypeLink
import avroclipse.avroIDL.UnionFieldType
import avroclipse.avroIDL.VoidTypeLink
import java.text.SimpleDateFormat
import java.util.Date
import java.util.List
import java.util.Set
import java.util.TreeSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.emf.common.util.EList
import avroclipse.avroIDL.Argument

class JavaWithAnnotationsGenerator implements IGenerator {

	var Set<String> importNamespaces
	var AvroIDLFile idlFile

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		idlFile = input.contents.get(0) as AvroIDLFile

		var String targetFilePath
		for (typeDef : idlFile.types) { //generate classes
			targetFilePath = typeDef.targetFilePath

			fsa.generateFile(targetFilePath, typeDef.compile)
		}
		if(!idlFile.messages.empty) { //generate interface
			targetFilePath = idlFile.namespacePath
			val targetFileName = idlFile.protocolName + ".java"
			if(targetFilePath.isNullOrEmpty) {
				targetFilePath = targetFileName
			} else {
				targetFilePath += "/" + targetFileName
			}
			
			fsa.generateFile(targetFilePath, idlFile.messages.compile)
		}
	}
	
	def compile(List<RPCMessage> messages) {
		importNamespaces = new TreeSet<String>
		importNamespaces.add("org.apache.avro.specific.AvroGenerated")
		
		val idlFile = messages.get(0).idlFile
		val namespace = idlFile.name
		val javaInterface = generateJavaInterface(idlFile.protocolName, messages)
		
		return '''
			«IF !namespace.isNullOrEmpty»
				package «idlFile.name»;
					
			«ENDIF»
			«IF !importNamespaces.empty»
				«FOR imprt : importNamespaces»
					import «imprt»;
				«ENDFOR»
				
			«ENDIF»
			@AvroGenerated //«currentDateTime» (Avroclipse)
			«javaInterface»
		'''
	}
	
	def generateJavaInterface(String name, List<RPCMessage> messages) '''
		public interface «name» {
			«FOR message : messages»
				«message.returnType.compileToJavaType» «message.name»(«message.arguments.compileToArguments»);
			«ENDFOR»
		}
	'''
	
	def compileToArguments(EList<Argument> args) {
		if(args.nullOrEmpty) return null
		
		val firstArg = args.get(0);
		val restArgs = args.filter[it != firstArg]
		
		return '''«firstArg.type.nameAndRegisterImport» «firstArg.name»«FOR arg : restArgs», «arg.type.nameAndRegisterImport» «arg.name»«ENDFOR»'''
	}
	
	def compileToJavaType(ReturnTypeLink link) {
		switch (link) {
			VoidTypeLink: "void"
			TypeLink: link.getNameAndRegisterImport
			ArrayFieldType: link.javaListAndRegisterImport
			MapFieldType: link.getJavaMapAndRegisterImport
		}
	}

	def compile(TypeDef typeDef) {
		importNamespaces = new TreeSet<String>
		importNamespaces.add("org.apache.avro.specific.AvroGenerated")
		val namespace = typeDef.namespace
		val javaClass = typeDef.type.compile
		return '''
			«IF !namespace.isNullOrEmpty»
				package «namespace»;
					
			«ENDIF»
			«IF !importNamespaces.empty»
				«FOR imprt : importNamespaces»
					import «imprt»;
				«ENDFOR»
				
			«ENDIF»
			@AvroGenerated //«currentDateTime» (Avroclipse)
			«javaClass»
		'''
	}

	def compile(Type type) {
		switch (type) {
			RecordType: type.compile
			EnumType: type.compile
			FixedType: type.compile
			ErrorType: type.compile
		}
	}

	def compile(ErrorType type) '''
		public class «type.name» extends Exception {
			
		}
	''' // TODO: class/exception body

	def compile(FixedType type) {
		importNamespaces.add("org.apache.avro.specific.SpecificFixed")
		importNamespaces.add("org.apache.avro.specific.FixedSize")

		return '''
			@FixedSize(«type.size»)
			public class «type.name» extends SpecificFixed {
				public «type.name»() {
					super();
				}
				
				public «type.name»(byte[] bytes) {
					super(bytes);
				}
			}
		'''
	}

	def compile(EnumType type) '''
		public enum «type.name» {
			«FOR literal : type.literals»
				«literal»,
			«ENDFOR»	
		}
	'''

	def compile(RecordType type) '''
		public class «type.name» {
			«FOR field : type.fields»
				«IF field.type.isNullableAndRegisterImport»
					
					@Nullable
				«ENDIF»
				«field.type.nameAndRegisterImport» «field.name»;
			«ENDFOR»
			«FOR field : type.fields»
				
				public «field.type.nameAndRegisterImport» get«field.name.capitalize»() {
					return this.«field.name»;
				}
				
				public void set«field.name.capitalize»(«field.type.nameAndRegisterImport» «field.name») {
					this.«field.name» = «field.name»;
				}
			«ENDFOR»
		}
	'''
	
	def getIsNullableAndRegisterImport(FieldType type) {
		if(type instanceof UnionFieldType) {
			val unionFieldType = type as UnionFieldType 
			if(unionFieldType.types.filter(PrimativeTypeLink).findFirst[target.equals("null")] != null) {
				importNamespaces.add("org.apache.avro.reflect.Nullable")
				return true;
			}
		}
		return false;
	}

	def getNameAndRegisterImport(FieldType type) {
		switch (type) {
			SimpleFieldType: type.type.getNameAndRegisterImport
			ArrayFieldType: type.getJavaListAndRegisterImport
			MapFieldType: type.getJavaMapAndRegisterImport
			UnionFieldType: type.types.findFirst[!(it instanceof PrimativeTypeLink && (it as PrimativeTypeLink).target.equals("null"))].nameAndRegisterImport
		} //TODO: union field now support only two types. It should support many types.
	}

	def getGetJavaMapAndRegisterImport(MapFieldType type) {
		importNamespaces.add("java.util.Map");

		return '''Map<String, «type.type.getNameAndRegisterImport»>'''
	}

	def getJavaListAndRegisterImport(ArrayFieldType type) {
		importNamespaces.add("java.util.List");

		return '''List<«type.type.getNameAndRegisterImport»>'''
	}

	def getNameAndRegisterImport(TypeLink link) {
		switch (link) {
			PrimativeTypeLink: link.javaType
			CustomTypeLink: link.target.nameAndRegisterImport
		}
	}

	def getNameAndRegisterImport(Type type) {
		importNamespaces.addImportFor(type)

		return type.name
	}

	def addImportFor(Set<String> strings, Type type) {
		val otherIdlFile = type.idlFile

		if (otherIdlFile != idlFile && !otherIdlFile.name.equals(idlFile.name)) {
			importNamespaces.add(otherIdlFile.name + "." + type.name)
		}
	}

	def static getIdlFile(EObject object) {
		if(object instanceof AvroIDLFile) return object as AvroIDLFile

		return object.getContainerOfType(AvroIDLFile)
	}

	/**
	 * Mapped as in @see https://avro.apache.org/docs/1.7.6/api/java/org/apache/avro/reflect/package-summary.html
	 */
	def static getJavaType(PrimativeTypeLink link) {
		val javaType = switch (link.target) {
			case "string": "String"
			case "int": "Integer"
			case "long": "Long"
			case "boolean": "Boolean"
			case "float": "Float"
			case "double": "Double"
			case "bytes": "byte[]"
		}

		return javaType
	}

	def static String getTargetFilePath(TypeDef typeDef) {
		var path = typeDef.namespacePath

		if (path.nullOrEmpty) {
			path = typeDef.type.name
		} else {
			path += '/' + typeDef.type.name
		}
		path + '.java'
	}

	def static getNamespace(EObject object) {
		return object.idlFile.name
	}

	def static getNamespacePath(EObject object) {
		val namespace = object.namespace

		if(namespace.isNullOrEmpty) return null
		return namespace.replace('.', '/')
	}

	def static currentDateTime() {
		val dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		val date = new Date();
		dateFormat.format(date)
	}

	def static String capitalize(String line) {
		Character.toUpperCase(line.charAt(0)) + line.substring(1);
	}

}