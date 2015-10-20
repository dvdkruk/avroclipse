/**
 */
package avroclipse.avdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.RPCMessage#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link avroclipse.avdl.RPCMessage#getName <em>Name</em>}</li>
 *   <li>{@link avroclipse.avdl.RPCMessage#getArguments <em>Arguments</em>}</li>
 *   <li>{@link avroclipse.avdl.RPCMessage#getError <em>Error</em>}</li>
 *   <li>{@link avroclipse.avdl.RPCMessage#isOneway <em>Oneway</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getRPCMessage()
 * @model
 * @generated
 */
public interface RPCMessage extends Element
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(ReturnTypeLink)
   * @see avroclipse.avdl.AvdlPackage#getRPCMessage_ReturnType()
   * @model containment="true"
   * @generated
   */
  ReturnTypeLink getReturnType();

  /**
   * Sets the value of the '{@link avroclipse.avdl.RPCMessage#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(ReturnTypeLink value);

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
   * @see avroclipse.avdl.AvdlPackage#getRPCMessage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link avroclipse.avdl.RPCMessage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avdl.Argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see avroclipse.avdl.AvdlPackage#getRPCMessage_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getArguments();

  /**
   * Returns the value of the '<em><b>Error</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error</em>' reference.
   * @see #setError(ErrorType)
   * @see avroclipse.avdl.AvdlPackage#getRPCMessage_Error()
   * @model
   * @generated
   */
  ErrorType getError();

  /**
   * Sets the value of the '{@link avroclipse.avdl.RPCMessage#getError <em>Error</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error</em>' reference.
   * @see #getError()
   * @generated
   */
  void setError(ErrorType value);

  /**
   * Returns the value of the '<em><b>Oneway</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oneway</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oneway</em>' attribute.
   * @see #setOneway(boolean)
   * @see avroclipse.avdl.AvdlPackage#getRPCMessage_Oneway()
   * @model
   * @generated
   */
  boolean isOneway();

  /**
   * Sets the value of the '{@link avroclipse.avdl.RPCMessage#isOneway <em>Oneway</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oneway</em>' attribute.
   * @see #isOneway()
   * @generated
   */
  void setOneway(boolean value);

} // RPCMessage
