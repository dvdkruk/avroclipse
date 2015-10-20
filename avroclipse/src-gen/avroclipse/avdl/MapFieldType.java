/**
 */
package avroclipse.avdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.MapFieldType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link avroclipse.avdl.MapFieldType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getMapFieldType()
 * @model
 * @generated
 */
public interface MapFieldType extends FieldType
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see avroclipse.avdl.AvdlPackage#getMapFieldType_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link avroclipse.avdl.MapFieldType#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

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
   * @see avroclipse.avdl.AvdlPackage#getMapFieldType_Type()
   * @model containment="true"
   * @generated
   */
  TypeLink getType();

  /**
   * Sets the value of the '{@link avroclipse.avdl.MapFieldType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeLink value);

} // MapFieldType
