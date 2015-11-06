package avroclipse.generator.java

import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.CustomTypeLink
import avroclipse.avroIDL.FieldType
import avroclipse.avroIDL.PrimativeTypeLink
import avroclipse.avroIDL.RecordType
import avroclipse.avroIDL.SimpleFieldType
import avroclipse.avroIDL.Type
import avroclipse.avroIDL.TypeDef
import avroclipse.avroIDL.TypeLink
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Set
import java.util.TreeSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.EcoreUtil2.*
import avroclipse.avroIDL.EnumType
import avroclipse.avroIDL.FixedType
import avroclipse.avroIDL.ArrayFieldType

class JavaWithAnnotationsGenerator implements IGenerator {

	var Set<String> importNamespaces
	var AvroIDLFile idlFile

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		idlFile = input.contents.get(0) as AvroIDLFile

		var String targetFilePath
		for (typeDef : idlFile.types) {
			targetFilePath = typeDef.targetFilePath

			val content = typeDef.compile
			fsa.generateFile(targetFilePath, content)
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
		}
	}

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

	def getNameAndRegisterImport(FieldType type) {
		switch (type) {
			SimpleFieldType: type.type.getNameAndRegisterImport
			ArrayFieldType: type.getJavaListAndRegisterImport
		}
	}
	
	def getJavaListAndRegisterImport(ArrayFieldType type) {
		importNamespaces.add("java.util.List");
		return '''
			List<«type.type.getNameAndRegisterImport»>'''
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