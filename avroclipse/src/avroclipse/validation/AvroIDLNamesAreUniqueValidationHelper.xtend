package avroclipse.validation

import avroclipse.avroIDL.AvroIDLPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper

class AvroIDLNamesAreUniqueValidationHelper extends NamesAreUniqueValidationHelper {

	override EClass getAssociatedClusterType(EClass eClass) {
		if (AvroIDLPackage.Literals.ANNOTATION == eClass) {
			return null;
		}
		return super.getAssociatedClusterType(eClass);
	}
}