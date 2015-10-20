/**
 */
package avroclipse.avdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.Array#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Value
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(Values)
   * @see avroclipse.avdl.AvdlPackage#getArray_Values()
   * @model containment="true"
   * @generated
   */
  Values getValues();

  /**
   * Sets the value of the '{@link avroclipse.avdl.Array#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(Values value);

} // Array
