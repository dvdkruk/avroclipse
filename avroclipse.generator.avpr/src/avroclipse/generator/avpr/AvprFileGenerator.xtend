package avroclipse.generator.avpr

import avroclipse.Helper
import java.io.File
import org.apache.avro.Protocol
import org.apache.avro.compiler.idl.Idl
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class AvprFileGenerator implements IGenerator {
	
	public static val DEFAULT_AVPR_PATH = "../avpr-gen/"
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		if (input != null && input.contents.size > 0) {
			
			var filePath = input.toOSURI
			val parser = new Idl(new File(filePath))
			val p = parser.CompilationUnit
			
			fsa.generateFile(DEFAULT_AVPR_PATH + p.getTargetFileName, p.toString(true))
		}
	}
	
	def static toOSURI(Resource input) {
		var filePath = input.getURI.toPlatformString(true)
		
		if(Helper.isEclipseRunning) {
			val workspaceLocation = Platform.getLocation.toOSString
			filePath =  workspaceLocation + filePath 
		}
		
		return filePath
	}
	
	def static getGetTargetFileName(Protocol protocol) {
		var targetFilePath = protocol.name + ".avpr";
		
		if(!protocol.namespace.isNullOrEmpty) {
			targetFilePath = protocol.namespace + "." + targetFilePath
		}
		
		return targetFilePath
	}

}