/**
 */
package dk.itu.smdp2015.church.model.configurator.impl;

import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorFactory;
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
import dk.itu.smdp2015.church.model.configurator.ScalarOperator;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.UnaryOperator;
import dk.itu.smdp2015.church.model.configurator.ValueRange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguratorPackageImpl extends EPackageImpl implements ConfiguratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scalarOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfiguratorPackageImpl() {
		super(eNS_URI, ConfiguratorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfiguratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfiguratorPackage init() {
		if (isInited) return (ConfiguratorPackage)EPackage.Registry.INSTANCE.getEPackage(ConfiguratorPackage.eNS_URI);

		// Obtain or create and register package
		ConfiguratorPackageImpl theConfiguratorPackage = (ConfiguratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfiguratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfiguratorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConfiguratorPackage.createPackageContents();

		// Initialize created meta-data
		theConfiguratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfiguratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfiguratorPackage.eNS_URI, theConfiguratorPackage);
		return theConfiguratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractParameter() {
		return abstractParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractParameter_Visibility() {
		return (EReference)abstractParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractParameter_Constraints() {
		return (EReference)abstractParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterGroup() {
		return parameterGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterGroup_Parameters() {
		return (EReference)parameterGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Mandatory() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ValueRange() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Default() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurator() {
		return configuratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurator_Parameters() {
		return (EReference)configuratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRange() {
		return valueRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerated() {
		return enumeratedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerated_Values() {
		return (EReference)enumeratedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBounded() {
		return boundedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBounded_UpperBound() {
		return (EReference)boundedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBounded_LowerBound() {
		return (EReference)boundedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnary() {
		return unaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnary_Operator() {
		return (EAttribute)unaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnary_Inner() {
		return (EReference)unaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_Operator() {
		return (EAttribute)binaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Left() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Right() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalar() {
		return scalarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalar_Operator() {
		return (EAttribute)scalarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalar_Id() {
		return (EReference)scalarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInRange() {
		return inRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInRange_Range() {
		return (EReference)inRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInRange_Parameter() {
		return (EReference)inRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Value() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble() {
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_Value() {
		return (EAttribute)doubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Value() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Value() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_Id() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Expr() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribedElement() {
		return describedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribedElement_Description() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScalarOperator() {
		return scalarOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorFactory getConfiguratorFactory() {
		return (ConfiguratorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractParameterEClass = createEClass(ABSTRACT_PARAMETER);
		createEReference(abstractParameterEClass, ABSTRACT_PARAMETER__VISIBILITY);
		createEReference(abstractParameterEClass, ABSTRACT_PARAMETER__CONSTRAINTS);

		parameterGroupEClass = createEClass(PARAMETER_GROUP);
		createEReference(parameterGroupEClass, PARAMETER_GROUP__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__MANDATORY);
		createEReference(parameterEClass, PARAMETER__VALUE_RANGE);
		createEReference(parameterEClass, PARAMETER__DEFAULT);

		configuratorEClass = createEClass(CONFIGURATOR);
		createEReference(configuratorEClass, CONFIGURATOR__PARAMETERS);

		valueRangeEClass = createEClass(VALUE_RANGE);

		enumeratedEClass = createEClass(ENUMERATED);
		createEReference(enumeratedEClass, ENUMERATED__VALUES);

		boundedEClass = createEClass(BOUNDED);
		createEReference(boundedEClass, BOUNDED__UPPER_BOUND);
		createEReference(boundedEClass, BOUNDED__LOWER_BOUND);

		expressionEClass = createEClass(EXPRESSION);

		unaryEClass = createEClass(UNARY);
		createEAttribute(unaryEClass, UNARY__OPERATOR);
		createEReference(unaryEClass, UNARY__INNER);

		binaryEClass = createEClass(BINARY);
		createEAttribute(binaryEClass, BINARY__OPERATOR);
		createEReference(binaryEClass, BINARY__LEFT);
		createEReference(binaryEClass, BINARY__RIGHT);

		scalarEClass = createEClass(SCALAR);
		createEAttribute(scalarEClass, SCALAR__OPERATOR);
		createEReference(scalarEClass, SCALAR__ID);

		constantEClass = createEClass(CONSTANT);

		inRangeEClass = createEClass(IN_RANGE);
		createEReference(inRangeEClass, IN_RANGE__RANGE);
		createEReference(inRangeEClass, IN_RANGE__PARAMETER);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);

		doubleEClass = createEClass(DOUBLE);
		createEAttribute(doubleEClass, DOUBLE__VALUE);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);

		identifierEClass = createEClass(IDENTIFIER);
		createEReference(identifierEClass, IDENTIFIER__ID);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__EXPR);

		describedElementEClass = createEClass(DESCRIBED_ELEMENT);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__DESCRIPTION);

		// Create enums
		scalarOperatorEEnum = createEEnum(SCALAR_OPERATOR);
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractParameterEClass.getESuperTypes().add(this.getNamedElement());
		abstractParameterEClass.getESuperTypes().add(this.getDescribedElement());
		parameterGroupEClass.getESuperTypes().add(this.getAbstractParameter());
		parameterEClass.getESuperTypes().add(this.getAbstractParameter());
		configuratorEClass.getESuperTypes().add(this.getNamedElement());
		configuratorEClass.getESuperTypes().add(this.getDescribedElement());
		enumeratedEClass.getESuperTypes().add(this.getValueRange());
		boundedEClass.getESuperTypes().add(this.getValueRange());
		unaryEClass.getESuperTypes().add(this.getExpression());
		binaryEClass.getESuperTypes().add(this.getExpression());
		scalarEClass.getESuperTypes().add(this.getExpression());
		constantEClass.getESuperTypes().add(this.getExpression());
		inRangeEClass.getESuperTypes().add(this.getExpression());
		integerEClass.getESuperTypes().add(this.getConstant());
		doubleEClass.getESuperTypes().add(this.getConstant());
		booleanEClass.getESuperTypes().add(this.getConstant());
		stringEClass.getESuperTypes().add(this.getConstant());
		identifierEClass.getESuperTypes().add(this.getExpression());
		constraintEClass.getESuperTypes().add(this.getDescribedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractParameterEClass, AbstractParameter.class, "AbstractParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractParameter_Visibility(), this.getExpression(), null, "visibility", null, 0, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractParameter_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterGroupEClass, ParameterGroup.class, "ParameterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterGroup_Parameters(), this.getAbstractParameter(), null, "parameters", null, 1, -1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Mandatory(), ecorePackage.getEBoolean(), "mandatory", "true", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ValueRange(), this.getValueRange(), null, "valueRange", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Default(), this.getExpression(), null, "default", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configuratorEClass, Configurator.class, "Configurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurator_Parameters(), this.getAbstractParameter(), null, "parameters", null, 1, -1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueRangeEClass, ValueRange.class, "ValueRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumeratedEClass, Enumerated.class, "Enumerated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerated_Values(), this.getExpression(), null, "values", null, 1, -1, Enumerated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedEClass, Bounded.class, "Bounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBounded_UpperBound(), this.getExpression(), null, "upperBound", null, 1, 1, Bounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBounded_LowerBound(), this.getExpression(), null, "lowerBound", null, 1, 1, Bounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryEClass, Unary.class, "Unary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnary_Operator(), this.getUnaryOperator(), "operator", null, 1, 1, Unary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnary_Inner(), this.getExpression(), null, "inner", null, 1, 1, Unary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryEClass, Binary.class, "Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinary_Operator(), this.getBinaryOperator(), "operator", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Left(), this.getExpression(), null, "left", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Right(), this.getExpression(), null, "right", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalarEClass, Scalar.class, "Scalar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalar_Operator(), this.getScalarOperator(), "operator", null, 1, 1, Scalar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalar_Id(), this.getParameterGroup(), null, "id", null, 1, 1, Scalar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inRangeEClass, InRange.class, "InRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInRange_Range(), this.getValueRange(), null, "range", null, 1, 1, InRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInRange_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, InRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEClass, dk.itu.smdp2015.church.model.configurator.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1, dk.itu.smdp2015.church.model.configurator.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleEClass, dk.itu.smdp2015.church.model.configurator.Double.class, "Double", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDouble_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, dk.itu.smdp2015.church.model.configurator.Double.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, dk.itu.smdp2015.church.model.configurator.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, dk.itu.smdp2015.church.model.configurator.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEClass, dk.itu.smdp2015.church.model.configurator.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getString_Value(), ecorePackage.getEString(), "value", null, 1, 1, dk.itu.smdp2015.church.model.configurator.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifier_Id(), this.getParameter(), null, "id", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Expr(), this.getExpression(), null, "expr", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedElementEClass, DescribedElement.class, "DescribedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scalarOperatorEEnum, ScalarOperator.class, "ScalarOperator");
		addEEnumLiteral(scalarOperatorEEnum, ScalarOperator.SUM);
		addEEnumLiteral(scalarOperatorEEnum, ScalarOperator.MIN);
		addEEnumLiteral(scalarOperatorEEnum, ScalarOperator.MAX);

		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.DISJUNCTION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.CONJUNCTION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.ADDITION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.SUBTRACTION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MULTIPLICATION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.DIVISION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.LESS_THAN);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.LESS_THAN_EQUAL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.GREATER_THAN);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.GREATER_THAN_EQUAL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.EQUAL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.NOT_EQUAL);

		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.INVERSION);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NEGATION);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfiguratorPackageImpl
