package avroclipse.validation

import avroclipse.avroIDL.AvroIDLPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.Map
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import com.google.common.collect.Maps

class AvroIDLNamesAreUniqueValidationHelper extends NamesAreUniqueValidationHelper {

	override EClass getAssociatedClusterType(EClass eClass) {
		if (AvroIDLPackage.Literals.ANNOTATION == eClass) {
			return null;
		}
		return super.getAssociatedClusterType(eClass);
	}

	override checkDescriptionForDuplicatedName(IEObjectDescription description,
		Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterTypeToName, ValidationMessageAcceptor acceptor) {
		val object = description.getEObjectOrProxy();
		val eClass = object.eClass();
		val qualifiedName = description.getName();
		val clusterType = getAssociatedClusterType(eClass);
		var nameToDescription = clusterTypeToName.get(clusterType);
		if (nameToDescription == null) {
			nameToDescription = Maps.newHashMap();
			nameToDescription.put(qualifiedName, description);
			clusterTypeToName.put(clusterType, nameToDescription);
		} else {
			if (nameToDescription.containsKey(qualifiedName)) {
				val prevDescription = nameToDescription.get(qualifiedName);
				if (prevDescription != null) {
					createDuplicateNameError(prevDescription, clusterType, acceptor);
					nameToDescription.put(qualifiedName, null);
				}
				createDuplicateNameError(description, clusterType, acceptor);
			} else {
				nameToDescription.put(qualifiedName, description);
			}
		}
	}
}