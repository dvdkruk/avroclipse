package avroclipse.generator.java

import avroclipse.avroIDL.AvroIDLFile
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class GeneratorExtension implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		if (input != null && input.contents.size > 0) {
			val avroIdl = input.contents.get(0) as AvroIDLFile
			println(avroIdl)
			//TODO: implement avro compiler
		}
	}

}