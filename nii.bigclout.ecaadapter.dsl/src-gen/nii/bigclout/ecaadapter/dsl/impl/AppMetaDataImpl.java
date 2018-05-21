/**
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.dsl.impl;

import java.util.Collection;

import nii.bigclout.ecaadapter.dsl.AppMetaData;
import nii.bigclout.ecaadapter.dsl.AppSpecification;
import nii.bigclout.ecaadapter.dsl.DslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.AppMetaDataImpl#getAppID <em>App ID</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.AppMetaDataImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppMetaDataImpl extends MinimalEObjectImpl.Container implements AppMetaData
{
  /**
   * The default value of the '{@link #getAppID() <em>App ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppID()
   * @generated
   * @ordered
   */
  protected static final String APP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppID() <em>App ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppID()
   * @generated
   * @ordered
   */
  protected String appID = APP_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifications()
   * @generated
   * @ordered
   */
  protected EList<AppSpecification> specifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AppMetaDataImpl()
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
    return DslPackage.Literals.APP_META_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppID()
  {
    return appID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppID(String newAppID)
  {
    String oldAppID = appID;
    appID = newAppID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.APP_META_DATA__APP_ID, oldAppID, appID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppSpecification> getSpecifications()
  {
    if (specifications == null)
    {
      specifications = new EObjectContainmentEList<AppSpecification>(AppSpecification.class, this, DslPackage.APP_META_DATA__SPECIFICATIONS);
    }
    return specifications;
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
      case DslPackage.APP_META_DATA__SPECIFICATIONS:
        return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
      case DslPackage.APP_META_DATA__APP_ID:
        return getAppID();
      case DslPackage.APP_META_DATA__SPECIFICATIONS:
        return getSpecifications();
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
      case DslPackage.APP_META_DATA__APP_ID:
        setAppID((String)newValue);
        return;
      case DslPackage.APP_META_DATA__SPECIFICATIONS:
        getSpecifications().clear();
        getSpecifications().addAll((Collection<? extends AppSpecification>)newValue);
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
      case DslPackage.APP_META_DATA__APP_ID:
        setAppID(APP_ID_EDEFAULT);
        return;
      case DslPackage.APP_META_DATA__SPECIFICATIONS:
        getSpecifications().clear();
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
      case DslPackage.APP_META_DATA__APP_ID:
        return APP_ID_EDEFAULT == null ? appID != null : !APP_ID_EDEFAULT.equals(appID);
      case DslPackage.APP_META_DATA__SPECIFICATIONS:
        return specifications != null && !specifications.isEmpty();
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
    result.append(" (appID: ");
    result.append(appID);
    result.append(')');
    return result.toString();
  }

} //AppMetaDataImpl
