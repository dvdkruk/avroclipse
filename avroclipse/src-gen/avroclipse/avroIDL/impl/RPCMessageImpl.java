/**
 */
package avroclipse.avroIDL.impl;

import avroclipse.avroIDL.Argument;
import avroclipse.avroIDL.AvroIDLPackage;
import avroclipse.avroIDL.ErrorType;
import avroclipse.avroIDL.RPCMessage;
import avroclipse.avroIDL.ReturnTypeLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avroIDL.impl.RPCMessageImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link avroclipse.avroIDL.impl.RPCMessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link avroclipse.avroIDL.impl.RPCMessageImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link avroclipse.avroIDL.impl.RPCMessageImpl#getError <em>Error</em>}</li>
 *   <li>{@link avroclipse.avroIDL.impl.RPCMessageImpl#isOneway <em>Oneway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCMessageImpl extends ElementImpl implements RPCMessage
{
  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected ReturnTypeLink returnType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Argument> arguments;

  /**
   * The cached value of the '{@link #getError() <em>Error</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getError()
   * @generated
   * @ordered
   */
  protected ErrorType error;

  /**
   * The default value of the '{@link #isOneway() <em>Oneway</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOneway()
   * @generated
   * @ordered
   */
  protected static final boolean ONEWAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOneway() <em>Oneway</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOneway()
   * @generated
   * @ordered
   */
  protected boolean oneway = ONEWAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RPCMessageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AvroIDLPackage.Literals.RPC_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnTypeLink getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(ReturnTypeLink newReturnType, NotificationChain msgs)
  {
    ReturnTypeLink oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(ReturnTypeLink newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroIDLPackage.RPC_MESSAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Argument>(Argument.class, this, AvroIDLPackage.RPC_MESSAGE__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorType getError()
  {
    if (error != null && error.eIsProxy())
    {
      InternalEObject oldError = (InternalEObject)error;
      error = (ErrorType)eResolveProxy(oldError);
      if (error != oldError)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvroIDLPackage.RPC_MESSAGE__ERROR, oldError, error));
      }
    }
    return error;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorType basicGetError()
  {
    return error;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setError(ErrorType newError)
  {
    ErrorType oldError = error;
    error = newError;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroIDLPackage.RPC_MESSAGE__ERROR, oldError, error));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOneway()
  {
    return oneway;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOneway(boolean newOneway)
  {
    boolean oldOneway = oneway;
    oneway = newOneway;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroIDLPackage.RPC_MESSAGE__ONEWAY, oldOneway, oneway));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case AvroIDLPackage.RPC_MESSAGE__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE:
        return getReturnType();
      case AvroIDLPackage.RPC_MESSAGE__NAME:
        return getName();
      case AvroIDLPackage.RPC_MESSAGE__ARGUMENTS:
        return getArguments();
      case AvroIDLPackage.RPC_MESSAGE__ERROR:
        if (resolve) return getError();
        return basicGetError();
      case AvroIDLPackage.RPC_MESSAGE__ONEWAY:
        return isOneway();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE:
        setReturnType((ReturnTypeLink)newValue);
        return;
      case AvroIDLPackage.RPC_MESSAGE__NAME:
        setName((String)newValue);
        return;
      case AvroIDLPackage.RPC_MESSAGE__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Argument>)newValue);
        return;
      case AvroIDLPackage.RPC_MESSAGE__ERROR:
        setError((ErrorType)newValue);
        return;
      case AvroIDLPackage.RPC_MESSAGE__ONEWAY:
        setOneway((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE:
        setReturnType((ReturnTypeLink)null);
        return;
      case AvroIDLPackage.RPC_MESSAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AvroIDLPackage.RPC_MESSAGE__ARGUMENTS:
        getArguments().clear();
        return;
      case AvroIDLPackage.RPC_MESSAGE__ERROR:
        setError((ErrorType)null);
        return;
      case AvroIDLPackage.RPC_MESSAGE__ONEWAY:
        setOneway(ONEWAY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AvroIDLPackage.RPC_MESSAGE__RETURN_TYPE:
        return returnType != null;
      case AvroIDLPackage.RPC_MESSAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AvroIDLPackage.RPC_MESSAGE__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case AvroIDLPackage.RPC_MESSAGE__ERROR:
        return error != null;
      case AvroIDLPackage.RPC_MESSAGE__ONEWAY:
        return oneway != ONEWAY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", oneway: ");
    result.append(oneway);
    result.append(')');
    return result.toString();
  }

} //RPCMessageImpl
