package avroclipse.model.utils

import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.RPCMessage
import avroclipse.avroIDL.TypeDef
import avroclipse.avroIDL.Protocol
import org.eclipse.xtext.EcoreUtil2

public class AvroIDLHelper {
	protected new() {
	}
	
	static def getNamespace(AvroIDLFile file) {
		return file.name
	}
	
	static def getMessages(AvroIDLFile file) {
		return file.elements.filter(RPCMessage)
	}
	
	static def getTypeDefs(AvroIDLFile file) {
		return file.elements.filter(TypeDef)
	}
	
	static def getNamespace(Protocol protocol) {
		val file = EcoreUtil2.getContainerOfType(protocol, AvroIDLFile)
		if(file != null) {
			return getNamespace(file)
		}
	}
	
	static def getMessages(Protocol protocol) {
		val file = EcoreUtil2.getContainerOfType(protocol, AvroIDLFile)
		if(file != null) {
			return getMessages(file)
		}
	}
	
	static def getTypeDefs(Protocol protocol) {
		val file = EcoreUtil2.getContainerOfType(protocol, AvroIDLFile)
		if(file != null) {
			return getTypeDefs(file)
		}
	}
}