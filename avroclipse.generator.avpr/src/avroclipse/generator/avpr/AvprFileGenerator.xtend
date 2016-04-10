package avroclipse.generator.avpr

import avroclipse.Helper
import java.io.File
import java.net.URI
import java.net.URL
import org.apache.avro.Protocol
import org.apache.avro.compiler.idl.Idl
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.URIUtil
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class AvprFileGenerator implements IGenerator {

	public static val DEFAULT_AVPR_PATH = "../avpr-gen/"

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		if (input != null && input.contents.size > 0) {

			val avdlFilePath = input.osUri
			val avdlFile = new File(avdlFilePath)
			val parser = new Idl(avdlFile)
			val protocol = parser.CompilationUnit

			fsa.generateFile(DEFAULT_AVPR_PATH + protocol.getTargetFileName, protocol.toString(true))
		}
	}

	def static getOsUri(Resource input) {
		if (Helper.isEclipseRunning) {
			var url = new URL(input.URI.toString)
			url = FileLocator.resolve(url)
			URIUtil.toURI(url)
		} else {
			new URI(input.URI.toString)
		}
	}

	def static getGetTargetFileName(Protocol protocol) {
		var targetFilePath = protocol.name + ".avpr";

		if (!protocol.namespace.isNullOrEmpty) {
			targetFilePath = protocol.namespace + "." + targetFilePath
		}

		return targetFilePath
	}

}
