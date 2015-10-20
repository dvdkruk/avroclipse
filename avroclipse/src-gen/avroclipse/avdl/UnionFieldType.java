/**
 */
package avroclipse.avdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.UnionFieldType#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getUnionFieldType()
 * @model
 * @generated
 */
public interface UnionFieldType extends FieldType
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avdl.TypeLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see avroclipse.avdl.AvdlPackage#getUnionFieldType_Types()
   * @model containment="true"
   * @generated
   */
  EList<TypeLink> getTypes();

} // UnionFieldType
