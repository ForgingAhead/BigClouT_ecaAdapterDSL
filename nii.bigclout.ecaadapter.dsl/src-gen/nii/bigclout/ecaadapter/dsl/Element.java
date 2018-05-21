/**
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Element#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Element#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Meaning</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meaning</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meaning</em>' attribute.
   * @see #setMeaning(String)
   * @see nii.bigclout.ecaadapter.dsl.DslPackage#getElement_Meaning()
   * @model
   * @generated
   */
  String getMeaning();

  /**
   * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.Element#getMeaning <em>Meaning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meaning</em>' attribute.
   * @see #getMeaning()
   * @generated
   */
  void setMeaning(String value);

  /**
   * Returns the value of the '<em><b>Concept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concept</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept</em>' containment reference.
   * @see #setConcept(Concept)
   * @see nii.bigclout.ecaadapter.dsl.DslPackage#getElement_Concept()
   * @model containment="true"
   * @generated
   */
  Concept getConcept();

  /**
   * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.Element#getConcept <em>Concept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept</em>' containment reference.
   * @see #getConcept()
   * @generated
   */
  void setConcept(Concept value);

} // Element
