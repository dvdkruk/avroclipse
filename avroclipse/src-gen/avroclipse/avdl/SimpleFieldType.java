/**
 */
package avroclipse.avdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.SimpleFieldType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getSimpleFieldType()
 * @model
 * @generated
 */
public interface SimpleFieldType extends FieldType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeLink)
   * @see avroclipse.avdl.AvdlPackage#getSimpleFieldType_Type()
   * @model containment="true"
   * @generated
   */
  TypeLink getType();

  /**
   * Sets the value of the '{@link avroclipse.avdl.SimpleFieldType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeLink value);

} // SimpleFieldType
