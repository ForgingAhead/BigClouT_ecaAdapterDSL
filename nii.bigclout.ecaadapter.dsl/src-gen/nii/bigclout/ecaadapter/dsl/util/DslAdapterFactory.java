/**
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.dsl.util;

import nii.bigclout.ecaadapter.dsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nii.bigclout.ecaadapter.dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslSwitch<Adapter> modelSwitch =
    new DslSwitch<Adapter>()
    {
      @Override
      public Adapter caseRunTimeModel(RunTimeModel object)
      {
        return createRunTimeModelAdapter();
      }
      @Override
      public Adapter caseMetadata(Metadata object)
      {
        return createMetadataAdapter();
      }
      @Override
      public Adapter caseAppMetaData(AppMetaData object)
      {
        return createAppMetaDataAdapter();
      }
      @Override
      public Adapter caseSpecification(Specification object)
      {
        return createSpecificationAdapter();
      }
      @Override
      public Adapter caseEnvironmentMetaData(EnvironmentMetaData object)
      {
        return createEnvironmentMetaDataAdapter();
      }
      @Override
      public Adapter caseServiceMetaData(ServiceMetaData object)
      {
        return createServiceMetaDataAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseMappingPair(MappingPair object)
      {
        return createMappingPairAdapter();
      }
      @Override
      public Adapter casePair(Pair object)
      {
        return createPairAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseOrElement(OrElement object)
      {
        return createOrElementAdapter();
      }
      @Override
      public Adapter caseAndElement(AndElement object)
      {
        return createAndElementAdapter();
      }
      @Override
      public Adapter caseDiffElement(DiffElement object)
      {
        return createDiffElementAdapter();
      }
      @Override
      public Adapter caseEqualElement(EqualElement object)
      {
        return createEqualElementAdapter();
      }
      @Override
      public Adapter caseLargerElement(LargerElement object)
      {
        return createLargerElementAdapter();
      }
      @Override
      public Adapter caseLargerEqualElement(LargerEqualElement object)
      {
        return createLargerEqualElementAdapter();
      }
      @Override
      public Adapter caseSmallerElement(SmallerElement object)
      {
        return createSmallerElementAdapter();
      }
      @Override
      public Adapter caseSmallerEqualElement(SmallerEqualElement object)
      {
        return createSmallerEqualElementAdapter();
      }
      @Override
      public Adapter casePlusElement(PlusElement object)
      {
        return createPlusElementAdapter();
      }
      @Override
      public Adapter caseMinusElement(MinusElement object)
      {
        return createMinusElementAdapter();
      }
      @Override
      public Adapter caseMultiplicationElement(MultiplicationElement object)
      {
        return createMultiplicationElementAdapter();
      }
      @Override
      public Adapter caseDivisionElement(DivisionElement object)
      {
        return createDivisionElementAdapter();
      }
      @Override
      public Adapter caseModuloElement(ModuloElement object)
      {
        return createModuloElementAdapter();
      }
      @Override
      public Adapter caseNumber_Object(Number_Object object)
      {
        return createNumber_ObjectAdapter();
      }
      @Override
      public Adapter caseString_Object(String_Object object)
      {
        return createString_ObjectAdapter();
      }
      @Override
      public Adapter caseBoolean_Object(Boolean_Object object)
      {
        return createBoolean_ObjectAdapter();
      }
      @Override
      public Adapter caseResource_Object(Resource_Object object)
      {
        return createResource_ObjectAdapter();
      }
      @Override
      public Adapter caseNegateElement(NegateElement object)
      {
        return createNegateElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.RunTimeModel <em>Run Time Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.RunTimeModel
   * @generated
   */
  public Adapter createRunTimeModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Metadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Metadata
   * @generated
   */
  public Adapter createMetadataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.AppMetaData <em>App Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.AppMetaData
   * @generated
   */
  public Adapter createAppMetaDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Specification
   * @generated
   */
  public Adapter createSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.EnvironmentMetaData <em>Environment Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.EnvironmentMetaData
   * @generated
   */
  public Adapter createEnvironmentMetaDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.ServiceMetaData <em>Service Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.ServiceMetaData
   * @generated
   */
  public Adapter createServiceMetaDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.MappingPair <em>Mapping Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.MappingPair
   * @generated
   */
  public Adapter createMappingPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Pair
   * @generated
   */
  public Adapter createPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.OrElement <em>Or Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.OrElement
   * @generated
   */
  public Adapter createOrElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.AndElement <em>And Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.AndElement
   * @generated
   */
  public Adapter createAndElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.DiffElement <em>Diff Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.DiffElement
   * @generated
   */
  public Adapter createDiffElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.EqualElement <em>Equal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.EqualElement
   * @generated
   */
  public Adapter createEqualElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.LargerElement <em>Larger Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.LargerElement
   * @generated
   */
  public Adapter createLargerElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.LargerEqualElement <em>Larger Equal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.LargerEqualElement
   * @generated
   */
  public Adapter createLargerEqualElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.SmallerElement <em>Smaller Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.SmallerElement
   * @generated
   */
  public Adapter createSmallerElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.SmallerEqualElement <em>Smaller Equal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.SmallerEqualElement
   * @generated
   */
  public Adapter createSmallerEqualElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.PlusElement <em>Plus Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.PlusElement
   * @generated
   */
  public Adapter createPlusElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.MinusElement <em>Minus Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.MinusElement
   * @generated
   */
  public Adapter createMinusElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.MultiplicationElement <em>Multiplication Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.MultiplicationElement
   * @generated
   */
  public Adapter createMultiplicationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.DivisionElement <em>Division Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.DivisionElement
   * @generated
   */
  public Adapter createDivisionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.ModuloElement <em>Modulo Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.ModuloElement
   * @generated
   */
  public Adapter createModuloElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Number_Object <em>Number Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Number_Object
   * @generated
   */
  public Adapter createNumber_ObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.String_Object <em>String Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.String_Object
   * @generated
   */
  public Adapter createString_ObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Boolean_Object <em>Boolean Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Boolean_Object
   * @generated
   */
  public Adapter createBoolean_ObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.Resource_Object <em>Resource Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.Resource_Object
   * @generated
   */
  public Adapter createResource_ObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nii.bigclout.ecaadapter.dsl.NegateElement <em>Negate Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nii.bigclout.ecaadapter.dsl.NegateElement
   * @generated
   */
  public Adapter createNegateElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DslAdapterFactory
