/**
 */
package avroclipse.avdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.Field#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link avroclipse.avdl.Field#getType <em>Type</em>}</li>
 *   <li>{@link avroclipse.avdl.Field#getNameAnnotations <em>Name Annotations</em>}</li>
 *   <li>{@link avroclipse.avdl.Field#getName <em>Name</em>}</li>
 *   <li>{@link avroclipse.avdl.Field#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avdl.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see avroclipse.avdl.AvdlPackage#getField_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(FieldType)
   * @see avroclipse.avdl.AvdlPackage#getField_Type()
   * @model containment="true"
   * @generated
   */
  FieldType getType();

  /**
   * Sets the value of the '{@link avroclipse.avdl.Field#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(FieldType value);

  /**
   * Returns the value of the '<em><b>Name Annotations</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avdl.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Annotations</em>' containment reference list.
   * @see avroclipse.avdl.AvdlPackage#getField_NameAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getNameAnnotations();

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
   * @see avroclipse.avdl.AvdlPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link avroclipse.avdl.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Value)
   * @see avroclipse.avdl.AvdlPackage#getField_Default()
   * @model containment="true"
   * @generated
   */
  Value getDefault();

  /**
   * Sets the value of the '{@link avroclipse.avdl.Field#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Value value);

} // Field
