/**
 */
package avroclipse.avdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.Import#getType <em>Type</em>}</li>
 *   <li>{@link avroclipse.avdl.Import#getImportUri <em>Import Uri</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link avroclipse.avdl.ImportType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see avroclipse.avdl.ImportType
   * @see #setType(ImportType)
   * @see avroclipse.avdl.AvdlPackage#getImport_Type()
   * @model
   * @generated
   */
  ImportType getType();

  /**
   * Sets the value of the '{@link avroclipse.avdl.Import#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see avroclipse.avdl.ImportType
   * @see #getType()
   * @generated
   */
  void setType(ImportType value);

  /**
   * Returns the value of the '<em><b>Import Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Uri</em>' attribute.
   * @see #setImportUri(String)
   * @see avroclipse.avdl.AvdlPackage#getImport_ImportUri()
   * @model
   * @generated
   */
  String getImportUri();

  /**
   * Sets the value of the '{@link avroclipse.avdl.Import#getImportUri <em>Import Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Uri</em>' attribute.
   * @see #getImportUri()
   * @generated
   */
  void setImportUri(String value);

} // Import
