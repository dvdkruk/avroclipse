/**
 */
package avroclipse.avroIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avroIDL.Annotation#getName <em>Name</em>}</li>
 *   <li>{@link avroclipse.avroIDL.Annotation#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see avroclipse.avroIDL.AvroIDLPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see avroclipse.avroIDL.AvroIDLPackage#getAnnotation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link avroclipse.avroIDL.Annotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see avroclipse.avroIDL.AvroIDLPackage#getAnnotation_Values()
   * @model containment="true"
   * @generated
   */
  Values getValues();

  /**
   * Sets the value of the '{@link avroclipse.avroIDL.Annotation#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(Values value);

} // Annotation