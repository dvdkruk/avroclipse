/*
 */
package avroclipse.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.emf.ecore.EObject
import avroclipse.avroIDL.AvroIDLFile

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 */
class AvroIDLScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
		
		override protected getImportedNamespace(EObject object) {
			if(object.eContainer != null) {
				val container = object.eContainer
				if(container instanceof AvroIDLFile) {
					if(!container.name.nullOrEmpty) {
						return container.name + '.*'
					}
				}
			}
			return super.getImportedNamespace(object)
		}
		
}

