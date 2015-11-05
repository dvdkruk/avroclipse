package avroclipse.generator.java

import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.Field
import avroclipse.avroIDL.FieldType
import avroclipse.avroIDL.RecordType
import avroclipse.avroIDL.SimpleFieldType
import avroclipse.avroIDL.Type
import avroclipse.avroIDL.TypeDef
import java.util.Set
import java.util.TreeSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.EcoreUtil2.*
import avroclipse.avroIDL.TypeLink
import avroclipse.avroIDL.PrimativeTypeLink
import avroclipse.avroIDL.CustomTypeLink

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
		val namespace = typeDef.namespace
		val javaClass = typeDef.type.compile
		return '''
			«IF !namespace.isNullOrEmpty»
			package «namespace»
				
			«ENDIF»
			«IF !importNamespaces.empty»
			«importNamespaces.compile»
				
			«ENDIF»
			«javaClass»
		'''
	}

	def compile(Set<String> imports) '''
		
		«FOR imprt : imports»
			import «imprt»
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
		var compeleteClassName = type.namespace
		if(compeleteClassName.isNullOrEmpty) {
			compeleteClassName = type.name;
		} else {
			compeleteClassName += '.' + type.name
		}
		
		importNamespaces.add(compeleteClassName)
		
		return type.name
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
		if(object instanceof AvroIDLFile) return null
		return object.getContainerOfType(AvroIDLFile).name
	}

	def static getNamespacePath(EObject object) {
		val namespace = object.namespace

		if(namespace.isNullOrEmpty) return null
		return namespace.replace('.', '/')
	}

/*override doGenerate(Resource input, IFileSystemAccess fsa) {
 * 	if(input.contents.empty) return;
 * 	
 * 	val idlFile = input.contents.get(0) as AvroIDLFile
 * 	if(idlFile == null) return;
 * 	_idlFile= idlFile
 * 	_importNamespaces = new TreeSet<String>()
 * 	
 * 	var CharSequence javaFileContent
 * 	var String packagePath
 * 	for (typeDef : idlFile.types) {
 * 		javaFileContent = typeDef.compile(idlFile)
 * 		packagePath = idlFile.name
 * 		
 * 		if(packagePath.isNullOrEmpty) {
 * 			packagePath = typeDef.type.name + '.java'
 * 		} else {
 * 			packagePath = packagePath.replace('.', '/')
 * 			packagePath += '/' + typeDef.type.name + '.java'
 * 		}
 * 		
 * 		fsa.generateFile(packagePath, javaFileContent)
 * 	}
 }*/
/*def compile(TypeDef typeDef, AvroIDLFile idlFile) {
 * 	val javaClass = typeDef.type.compile
 * 	val imports = _importNamespaces.compile
 * 	
 * 	return '''
 * 	«IF !idlFile.name.nullOrEmpty»package "«idlFile.name»"«ENDIF»
 * 	
 * 	«imports»
 * 	
 * 	«javaClass»
 * 	''';
 * }
 * 
 * def compile(Set<String> namespaces)'''
 * «FOR namespace : namespaces»
 * import «namespace»
 * «ENDFOR»
 * '''
 * 
 * def CharSequence compile(Type type) {
 * 	return null
 * }
 * 
 * def compile(RecordType type) '''
 * public class «type.name» {
 * 	«FOR field : type.fields»
 * 	«field.compile»
 * 	«ENDFOR»
 * }
 * '''
 * 
 * def compile(Field field) {
 * 	field.type.compile(field)
 * }
 * 
 * def compile(FieldType fieldType, Field field) {
 * 	return null;
 * }
 * 
 * def compile(SimpleFieldType fieldType, Field field) {
 * 	_importNamespaces.addNamespaceOf(fieldType.type)
 * 	
 * 	return '''
 * 	private «fieldType.type.name» «field.name»;
 * 	'''
 * }
 * 
 * def addNamespaceOf(Set<String> namespaces, EObject object) {
 * 	if(object == null) return;
 * 	if(object instanceof AvroIDLFile) return;
 * 	val idlFile = object.getContainerOfType(AvroIDLFile)
 * 	
 * 	if(idlFile == _idlFile) return;
 * 	
 * 	if(idlFile.name.isNullOrEmpty) return;
 * 	
 * 	if (namespaces.contains(idlFile.name)) return;
 * 	
 * 	namespaces.add(idlFile.name)
 * }
 * 
 * def compile(EnumType type) '''
 * '''
 * 
 * def compile(FixedType type) '''
 * '''
 * 
 * def static type(SimpleFieldType simpleFieldType) {
 * 	val type = simpleFieldType.type
 * 	switch(type) {
 * 		PrimativeTypeLink: null
 * 		CustomTypeLink: type.target
 * 	}
 * }
 * 
 * def static name(TypeLink typeLink) {
 * 	switch (typeLink) {
 * 		PrimativeTypeLink: typeLink.target
 * 		CustomTypeLink: typeLink.target.name
 * 	}
 }*/
}