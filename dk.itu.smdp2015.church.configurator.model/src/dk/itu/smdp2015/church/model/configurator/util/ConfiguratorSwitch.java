/**
 */
package dk.itu.smdp2015.church.model.configurator.util;

import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.Constant;
import dk.itu.smdp2015.church.model.configurator.Constraint;
import dk.itu.smdp2015.church.model.configurator.DescribedElement;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.InRange;
import dk.itu.smdp2015.church.model.configurator.NamedElement;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.Scalar;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.ValueRange;

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
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
 * @generated
 */
public class ConfiguratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfiguratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfiguratorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConfiguratorPackage.ABSTRACT_PARAMETER: {
				AbstractParameter abstractParameter = (AbstractParameter)theEObject;
				T result = caseAbstractParameter(abstractParameter);
				if (result == null) result = caseNamedElement(abstractParameter);
				if (result == null) result = caseDescribedElement(abstractParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.PARAMETER_GROUP: {
				ParameterGroup parameterGroup = (ParameterGroup)theEObject;
				T result = caseParameterGroup(parameterGroup);
				if (result == null) result = caseAbstractParameter(parameterGroup);
				if (result == null) result = caseNamedElement(parameterGroup);
				if (result == null) result = caseDescribedElement(parameterGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseAbstractParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseDescribedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.CONFIGURATOR: {
				Configurator configurator = (Configurator)theEObject;
				T result = caseConfigurator(configurator);
				if (result == null) result = caseNamedElement(configurator);
				if (result == null) result = caseDescribedElement(configurator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.VALUE_RANGE: {
				ValueRange valueRange = (ValueRange)theEObject;
				T result = caseValueRange(valueRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.ENUMERATED: {
				Enumerated enumerated = (Enumerated)theEObject;
				T result = caseEnumerated(enumerated);
				if (result == null) result = caseValueRange(enumerated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.BOUNDED: {
				Bounded bounded = (Bounded)theEObject;
				T result = caseBounded(bounded);
				if (result == null) result = caseValueRange(bounded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.UNARY: {
				Unary unary = (Unary)theEObject;
				T result = caseUnary(unary);
				if (result == null) result = caseExpression(unary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseExpression(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.SCALAR: {
				Scalar scalar = (Scalar)theEObject;
				T result = caseScalar(scalar);
				if (result == null) result = caseExpression(scalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseExpression(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.IN_RANGE: {
				InRange inRange = (InRange)theEObject;
				T result = caseInRange(inRange);
				if (result == null) result = caseExpression(inRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.INTEGER: {
				dk.itu.smdp2015.church.model.configurator.Integer integer = (dk.itu.smdp2015.church.model.configurator.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseConstant(integer);
				if (result == null) result = caseExpression(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.DOUBLE: {
				dk.itu.smdp2015.church.model.configurator.Double double_ = (dk.itu.smdp2015.church.model.configurator.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = caseConstant(double_);
				if (result == null) result = caseExpression(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.BOOLEAN: {
				dk.itu.smdp2015.church.model.configurator.Boolean boolean_ = (dk.itu.smdp2015.church.model.configurator.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseConstant(boolean_);
				if (result == null) result = caseExpression(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.STRING: {
				dk.itu.smdp2015.church.model.configurator.String string = (dk.itu.smdp2015.church.model.configurator.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseConstant(string);
				if (result == null) result = caseExpression(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseExpression(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseDescribedElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorPackage.DESCRIBED_ELEMENT: {
				DescribedElement describedElement = (DescribedElement)theEObject;
				T result = caseDescribedElement(describedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractParameter(AbstractParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterGroup(ParameterGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurator(Configurator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRange(ValueRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerated(Enumerated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBounded(Bounded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnary(Unary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalar(Scalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInRange(InRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(dk.itu.smdp2015.church.model.configurator.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(dk.itu.smdp2015.church.model.configurator.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(dk.itu.smdp2015.church.model.configurator.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(dk.itu.smdp2015.church.model.configurator.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedElement(DescribedElement object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ConfiguratorSwitch
