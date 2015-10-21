/**
 */
package avroclipse.avroIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Type Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avroIDL.CustomTypeLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see avroclipse.avroIDL.AvroIDLPackage#getCustomTypeLink()
 * @model
 * @generated
 */
public interface CustomTypeLink extends TypeLink
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Type)
   * @see avroclipse.avroIDL.AvroIDLPackage#getCustomTypeLink_Target()
   * @model
   * @generated
   */
  Type getTarget();

  /**
   * Sets the value of the '{@link avroclipse.avroIDL.CustomTypeLink#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Type value);

} // CustomTypeLink
