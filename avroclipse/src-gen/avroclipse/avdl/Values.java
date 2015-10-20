/**
 */
package avroclipse.avdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.Values#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getValues()
 * @model
 * @generated
 */
public interface Values extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avdl.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see avroclipse.avdl.AvdlPackage#getValues_Value()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValue();

} // Values
