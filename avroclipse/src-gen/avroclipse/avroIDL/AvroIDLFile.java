/**
 */
package avroclipse.avroIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avroIDL.AvroIDLFile#getImports <em>Imports</em>}</li>
 *   <li>{@link avroclipse.avroIDL.AvroIDLFile#getProtocols <em>Protocols</em>}</li>
 * </ul>
 *
 * @see avroclipse.avroIDL.AvroIDLPackage#getAvroIDLFile()
 * @model
 * @generated
 */
public interface AvroIDLFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avroIDL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see avroclipse.avroIDL.AvroIDLPackage#getAvroIDLFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avroIDL.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocols</em>' containment reference list.
   * @see avroclipse.avroIDL.AvroIDLPackage#getAvroIDLFile_Protocols()
   * @model containment="true"
   * @generated
   */
  EList<Protocol> getProtocols();

} // AvroIDLFile
