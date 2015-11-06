package avroclipse.generator.avpr

import avroclipse.Helper
import java.io.File
import org.apache.avro.compiler.idl.Idl
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class GeneratorExtension implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		if (input != null && input.contents.size > 0) {
			//val avroIdl = input.contents.get(0) as AvroIDLFile
			//println(avroIdl)
			
			
			var filePath = input.getURI.toPlatformString(true);
			if(Helper.isEclipseRunning) {
				val workspaceLocation = Platform.getLocation.toOSString
				filePath =  workspaceLocation + filePath 
			}
			
			val parser = new Idl(new File(filePath))
			val p = parser.CompilationUnit
			fsa.generateFile(p.name + ".avpr", p.toString(true))
		}
	}

}