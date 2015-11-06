package avroclipse.generator.java

import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.CustomTypeLink
import avroclipse.avroIDL.Field
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
			«importNamespaces.compile»
				
			«ENDIF»
			@AvroGenerated //«currentDateTime» (Avroclipse)
			«javaClass»
		'''
	}

	def compile(Set<String> imports) '''
		«FOR imprt : imports»
			import «imprt»;
		«ENDFOR»
	'''

	def compile(Type type) {
		switch (type) {
			RecordType: type.compile
		}
	}

	def compile(RecordType type) '''
		public class «type.name» {
			«FOR field : type.fields»
				«field.compile»
			«ENDFOR»
		}
	'''

	def compile(Field field) '''
		private «field.type.name» «field.name»;
	'''

	def getName(FieldType type) {
		switch (type) {
			SimpleFieldType: type.type.name
		}
	}

	def getName(TypeLink link) {
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
		
		if(otherIdlFile != idlFile && !otherIdlFile.name.equals(idlFile.name)) {
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
	def getJavaType(PrimativeTypeLink link) {
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

	def String getTargetFilePath(TypeDef typeDef) {
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

}