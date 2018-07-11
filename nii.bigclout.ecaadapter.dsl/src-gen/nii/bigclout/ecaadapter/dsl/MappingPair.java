/**
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.MappingPair#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getMappingPair()
 * @model
 * @generated
 */
public interface MappingPair extends EObject
{
  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link nii.bigclout.ecaadapter.dsl.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see nii.bigclout.ecaadapter.dsl.DslPackage#getMappingPair_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getMappings();

} // MappingPair
