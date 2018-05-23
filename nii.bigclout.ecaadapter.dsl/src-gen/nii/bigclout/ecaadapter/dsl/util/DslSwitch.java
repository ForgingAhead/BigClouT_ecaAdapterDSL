/**
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.dsl.util;

import nii.bigclout.ecaadapter.dsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nii.bigclout.ecaadapter.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslPackage.RUN_TIME_MODEL:
      {
        RunTimeModel runTimeModel = (RunTimeModel)theEObject;
        T result = caseRunTimeModel(runTimeModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.APP_META_DATA:
      {
        AppMetaData appMetaData = (AppMetaData)theEObject;
        T result = caseAppMetaData(appMetaData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.APP_SPECIFICATION:
      {
        AppSpecification appSpecification = (AppSpecification)theEObject;
        T result = caseAppSpecification(appSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRIGGER:
      {
        Trigger trigger = (Trigger)theEObject;
        T result = caseTrigger(trigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.OR_ELEMENT:
      {
        OrElement orElement = (OrElement)theEObject;
        T result = caseOrElement(orElement);
        if (result == null) result = caseElement(orElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.AND_ELEMENT:
      {
        AndElement andElement = (AndElement)theEObject;
        T result = caseAndElement(andElement);
        if (result == null) result = caseElement(andElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DIFF_ELEMENT:
      {
        DiffElement diffElement = (DiffElement)theEObject;
        T result = caseDiffElement(diffElement);
        if (result == null) result = caseElement(diffElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.EQUAL_ELEMENT:
      {
        EqualElement equalElement = (EqualElement)theEObject;
        T result = caseEqualElement(equalElement);
        if (result == null) result = caseElement(equalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LARGER_ELEMENT:
      {
        LargerElement largerElement = (LargerElement)theEObject;
        T result = caseLargerElement(largerElement);
        if (result == null) result = caseElement(largerElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LARGER_EQUAL_ELEMENT:
      {
        LargerEqualElement largerEqualElement = (LargerEqualElement)theEObject;
        T result = caseLargerEqualElement(largerEqualElement);
        if (result == null) result = caseElement(largerEqualElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SMALLER_ELEMENT:
      {
        SmallerElement smallerElement = (SmallerElement)theEObject;
        T result = caseSmallerElement(smallerElement);
        if (result == null) result = caseElement(smallerElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SMALLER_EQUAL_ELEMENT:
      {
        SmallerEqualElement smallerEqualElement = (SmallerEqualElement)theEObject;
        T result = caseSmallerEqualElement(smallerEqualElement);
        if (result == null) result = caseElement(smallerEqualElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PLUS_ELEMENT:
      {
        PlusElement plusElement = (PlusElement)theEObject;
        T result = casePlusElement(plusElement);
        if (result == null) result = caseElement(plusElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.MINUS_ELEMENT:
      {
        MinusElement minusElement = (MinusElement)theEObject;
        T result = caseMinusElement(minusElement);
        if (result == null) result = caseElement(minusElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.MULTIPLICATION_ELEMENT:
      {
        MultiplicationElement multiplicationElement = (MultiplicationElement)theEObject;
        T result = caseMultiplicationElement(multiplicationElement);
        if (result == null) result = caseElement(multiplicationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DIVISION_ELEMENT:
      {
        DivisionElement divisionElement = (DivisionElement)theEObject;
        T result = caseDivisionElement(divisionElement);
        if (result == null) result = caseElement(divisionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.MODULO_ELEMENT:
      {
        ModuloElement moduloElement = (ModuloElement)theEObject;
        T result = caseModuloElement(moduloElement);
        if (result == null) result = caseElement(moduloElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.NUMBER_OBJECT:
      {
        Number_Object number_Object = (Number_Object)theEObject;
        T result = caseNumber_Object(number_Object);
        if (result == null) result = caseElement(number_Object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.STRING_OBJECT:
      {
        String_Object string_Object = (String_Object)theEObject;
        T result = caseString_Object(string_Object);
        if (result == null) result = caseElement(string_Object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.BOOLEAN_OBJECT:
      {
        Boolean_Object boolean_Object = (Boolean_Object)theEObject;
        T result = caseBoolean_Object(boolean_Object);
        if (result == null) result = caseElement(boolean_Object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.NEGATE_ELEMENT:
      {
        NegateElement negateElement = (NegateElement)theEObject;
        T result = caseNegateElement(negateElement);
        if (result == null) result = caseElement(negateElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Time Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Time Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunTimeModel(RunTimeModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>App Meta Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>App Meta Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppMetaData(AppMetaData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>App Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>App Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppSpecification(AppSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrigger(Trigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrElement(OrElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndElement(AndElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diff Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diff Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiffElement(DiffElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualElement(EqualElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Larger Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Larger Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLargerElement(LargerElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Larger Equal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Larger Equal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLargerEqualElement(LargerEqualElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smaller Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smaller Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmallerElement(SmallerElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smaller Equal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smaller Equal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmallerEqualElement(SmallerEqualElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusElement(PlusElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinusElement(MinusElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicationElement(MultiplicationElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Division Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivisionElement(DivisionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modulo Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modulo Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuloElement(ModuloElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber_Object(Number_Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseString_Object(String_Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean_Object(Boolean_Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negate Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negate Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegateElement(NegateElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslSwitch
