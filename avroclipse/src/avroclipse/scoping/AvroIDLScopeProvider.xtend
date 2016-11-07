/*
 */
package avroclipse.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 */
class AvroIDLScopeProvider extends AbstractDeclarativeScopeProvider {
	
	/*@Inject XtextResourceSet _rs;
	
	def IScope scope_CustomTypeLink_target(CustomTypeLink complexTypeLink, EReference ref) {
		val protocol = complexTypeLink.getContainerOfType(Protocol)
		val allTypes = new ArrayList<Type>() 
		
		allTypes.addAll(protocol.types.map[it.type])
		//allTypes.addExternalTypes(protocol.imports)
		
		Scopes.scopeFor(allTypes)
	}
	
	def List<Type> addExternalTypes(List<Type> types, List<Import> imports) {
		var Resource res
		var URI uri
		var AvroIDLFile IdlFile;
		
		for(import : imports) {
			uri = URI.createURI(import.importURI)
			res = _rs.getResource(uri, true);
			if (res.contents.size > 0) {
				IdlFile = res.contents.get(0) as AvroIDLFile
				if(IdlFile != null && IdlFile.protocol != null) {
					types.addAll(IdlFile.protocol.types.map[it.type])
				}
			}
			
		}
		
		return types;
	}*/

}

