/**
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.AppSpecification#getSpecID <em>Spec ID</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.AppSpecification#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.AppSpecification#getCondition <em>Condition</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.AppSpecification#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getAppSpecification()
 * @model
 * @generated
 */
public interface AppSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Spec ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec ID</em>' attribute.
   * @see #setSpecID(String)
   * @see nii.bigclout.ecaadapter.dsl.DslPackage#getAppSpecification_SpecID()
   * @model
   * @generated
   */
  String getSpecID();

  /**
   * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.AppSpecification#getSpecID <em>Spec ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec ID</em>' attribute.
   * @see #getSpecID()
   * @generated
   */
  void setSpecID(String value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
   * The list contents are of type {@link nii.bigclout.ecaadapter.dsl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference list.
   * @see nii.bigclout.ecaadapter.dsl.DslPackage#getAppSpecification_Trigger()
   * @model containment="true"
   * @generated
   */
  EList<Element> getTrigger();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link nii.bigclout.ecaadapter.dsl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see nii.bigclout.ecaadapter.dsl.DslPackage#getAppSpecification_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Element> getCondition();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link nii.bigclout.ecaadapter.dsl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see nii.bigclout.ecaadapter.dsl.DslPackage#getAppSpecification_Action()
   * @model containment="true"
   * @generated
   */
  EList<Element> getAction();

} // AppSpecification
