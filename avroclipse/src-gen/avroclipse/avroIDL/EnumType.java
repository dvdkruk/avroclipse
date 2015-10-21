/**
 */
package avroclipse.avroIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avroIDL.EnumType#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see avroclipse.avroIDL.AvroIDLPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends Type
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' attribute list.
   * @see avroclipse.avroIDL.AvroIDLPackage#getEnumType_Literals()
   * @model unique="false"
   * @generated
   */
  EList<String> getLiterals();

} // EnumType
