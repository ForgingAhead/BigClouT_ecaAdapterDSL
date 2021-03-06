/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl.impl;

import java.util.Collection;

import nii.bigclout.ecaadapter.dsl.AppMetaData;
import nii.bigclout.ecaadapter.dsl.DslPackage;
import nii.bigclout.ecaadapter.dsl.EnvironmentMetaData;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.ecaadapter.dsl.ServiceMetaData;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Time Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.RunTimeModelImpl#getEnvData <em>Env Data</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.RunTimeModelImpl#getAppData <em>App Data</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.RunTimeModelImpl#getServicesData <em>Services Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunTimeModelImpl extends MinimalEObjectImpl.Container implements RunTimeModel
{
  /**
   * The cached value of the '{@link #getEnvData() <em>Env Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvData()
   * @generated
   * @ordered
   */
  protected EList<EnvironmentMetaData> envData;

  /**
   * The cached value of the '{@link #getAppData() <em>App Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppData()
   * @generated
   * @ordered
   */
  protected EList<AppMetaData> appData;

  /**
   * The cached value of the '{@link #getServicesData() <em>Services Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicesData()
   * @generated
   * @ordered
   */
  protected EList<ServiceMetaData> servicesData;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunTimeModelImpl()
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
    return DslPackage.Literals.RUN_TIME_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnvironmentMetaData> getEnvData()
  {
    if (envData == null)
    {
      envData = new EObjectContainmentEList<EnvironmentMetaData>(EnvironmentMetaData.class, this, DslPackage.RUN_TIME_MODEL__ENV_DATA);
    }
    return envData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppMetaData> getAppData()
  {
    if (appData == null)
    {
      appData = new EObjectContainmentEList<AppMetaData>(AppMetaData.class, this, DslPackage.RUN_TIME_MODEL__APP_DATA);
    }
    return appData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceMetaData> getServicesData()
  {
    if (servicesData == null)
    {
      servicesData = new EObjectContainmentEList<ServiceMetaData>(ServiceMetaData.class, this, DslPackage.RUN_TIME_MODEL__SERVICES_DATA);
    }
    return servicesData;
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
      case DslPackage.RUN_TIME_MODEL__ENV_DATA:
        return ((InternalEList<?>)getEnvData()).basicRemove(otherEnd, msgs);
      case DslPackage.RUN_TIME_MODEL__APP_DATA:
        return ((InternalEList<?>)getAppData()).basicRemove(otherEnd, msgs);
      case DslPackage.RUN_TIME_MODEL__SERVICES_DATA:
        return ((InternalEList<?>)getServicesData()).basicRemove(otherEnd, msgs);
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
      case DslPackage.RUN_TIME_MODEL__ENV_DATA:
        return getEnvData();
      case DslPackage.RUN_TIME_MODEL__APP_DATA:
        return getAppData();
      case DslPackage.RUN_TIME_MODEL__SERVICES_DATA:
        return getServicesData();
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
      case DslPackage.RUN_TIME_MODEL__ENV_DATA:
        getEnvData().clear();
        getEnvData().addAll((Collection<? extends EnvironmentMetaData>)newValue);
        return;
      case DslPackage.RUN_TIME_MODEL__APP_DATA:
        getAppData().clear();
        getAppData().addAll((Collection<? extends AppMetaData>)newValue);
        return;
      case DslPackage.RUN_TIME_MODEL__SERVICES_DATA:
        getServicesData().clear();
        getServicesData().addAll((Collection<? extends ServiceMetaData>)newValue);
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
      case DslPackage.RUN_TIME_MODEL__ENV_DATA:
        getEnvData().clear();
        return;
      case DslPackage.RUN_TIME_MODEL__APP_DATA:
        getAppData().clear();
        return;
      case DslPackage.RUN_TIME_MODEL__SERVICES_DATA:
        getServicesData().clear();
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
      case DslPackage.RUN_TIME_MODEL__ENV_DATA:
        return envData != null && !envData.isEmpty();
      case DslPackage.RUN_TIME_MODEL__APP_DATA:
        return appData != null && !appData.isEmpty();
      case DslPackage.RUN_TIME_MODEL__SERVICES_DATA:
        return servicesData != null && !servicesData.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RunTimeModelImpl
