/**
 */
package dk.itu.smdp2015.church.model.configurator;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorFactory
 * @model kind="package"
 * @generated
 */
public interface ConfiguratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configurator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://itu.dk/smdp/configurator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configurator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfiguratorPackage eINSTANCE = dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.DescribedElementImpl <em>Described Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.DescribedElementImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getDescribedElement()
	 * @generated
	 */
	int DESCRIBED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.AbstractParameterImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getAbstractParameter()
	 * @generated
	 */
	int ABSTRACT_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__NAME = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__VISIBILITY = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__CONSTRAINTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ParameterGroupImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getParameterGroup()
	 * @generated
	 */
	int PARAMETER_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__DESCRIPTION = ABSTRACT_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__NAME = ABSTRACT_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__VISIBILITY = ABSTRACT_PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__CONSTRAINTS = ABSTRACT_PARAMETER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__PARAMETERS = ABSTRACT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_FEATURE_COUNT = ABSTRACT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_OPERATION_COUNT = ABSTRACT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ParameterImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = ABSTRACT_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ABSTRACT_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VISIBILITY = ABSTRACT_PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTRAINTS = ABSTRACT_PARAMETER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = ABSTRACT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_RANGE = ABSTRACT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = ABSTRACT_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ABSTRACT_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ABSTRACT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorImpl <em>Configurator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getConfigurator()
	 * @generated
	 */
	int CONFIGURATOR = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR__NAME = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR__PARAMETERS = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ValueRangeImpl <em>Value Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ValueRangeImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getValueRange()
	 * @generated
	 */
	int VALUE_RANGE = 4;

	/**
	 * The number of structural features of the '<em>Value Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.EnumeratedImpl <em>Enumerated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.EnumeratedImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__VALUES = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.BoundedImpl <em>Bounded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.BoundedImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBounded()
	 * @generated
	 */
	int BOUNDED = 6;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED__UPPER_BOUND = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED__LOWER_BOUND = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ExpressionImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.UnaryImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 8;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__INNER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.BinaryImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 9;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConstantImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 10;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.InRangeImpl <em>In Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.InRangeImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getInRange()
	 * @generated
	 */
	int IN_RANGE = 11;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_RANGE__RANGE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_RANGE__PARAMETER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_RANGE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_RANGE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.IntegerImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.BooleanImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.StringImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getString()
	 * @generated
	 */
	int STRING = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.IdentifierImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.NamedElementImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConstraintImpl
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.BinaryOperator
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 19;

	/**
	 * The meta object id for the '{@link dk.itu.smdp2015.church.model.configurator.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.smdp2015.church.model.configurator.UnaryOperator
	 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 20;


	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.AbstractParameter <em>Abstract Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Parameter</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.AbstractParameter
	 * @generated
	 */
	EClass getAbstractParameter();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.AbstractParameter#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.AbstractParameter#getVisibility()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EReference getAbstractParameter_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.smdp2015.church.model.configurator.AbstractParameter#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.AbstractParameter#getConstraints()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EReference getAbstractParameter_Constraints();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Group</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.ParameterGroup
	 * @generated
	 */
	EClass getParameterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.smdp2015.church.model.configurator.ParameterGroup#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.ParameterGroup#getParameters()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EReference getParameterGroup_Parameters();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.Parameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Parameter#isOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Parameter#getValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Range</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Parameter#getValueRange()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ValueRange();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Default();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Configurator <em>Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurator</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Configurator
	 * @generated
	 */
	EClass getConfigurator();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.smdp2015.church.model.configurator.Configurator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Configurator#getParameters()
	 * @see #getConfigurator()
	 * @generated
	 */
	EReference getConfigurator_Parameters();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.ValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Range</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.ValueRange
	 * @generated
	 */
	EClass getValueRange();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Enumerated
	 * @generated
	 */
	EClass getEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.smdp2015.church.model.configurator.Enumerated#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Enumerated#getValues()
	 * @see #getEnumerated()
	 * @generated
	 */
	EReference getEnumerated_Values();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Bounded <em>Bounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Bounded
	 * @generated
	 */
	EClass getBounded();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Bounded#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Bounded#getUpperBound()
	 * @see #getBounded()
	 * @generated
	 */
	EReference getBounded_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Bounded#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Bounded#getLowerBound()
	 * @see #getBounded()
	 * @generated
	 */
	EReference getBounded_LowerBound();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.Unary#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Unary#getOperator()
	 * @see #getUnary()
	 * @generated
	 */
	EAttribute getUnary_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Unary#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Unary#getInner()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Inner();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.Binary#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Binary#getOperator()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Binary#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Binary#getLeft()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Left();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Binary#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Binary#getRight()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Right();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.InRange <em>In Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Range</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.InRange
	 * @generated
	 */
	EClass getInRange();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.InRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.InRange#getRange()
	 * @see #getInRange()
	 * @generated
	 */
	EReference getInRange_Range();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.smdp2015.church.model.configurator.InRange#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.InRange#getParameter()
	 * @see #getInRange()
	 * @generated
	 */
	EReference getInRange_Parameter();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.smdp2015.church.model.configurator.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Element</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.DescribedElement
	 * @generated
	 */
	EClass getDescribedElement();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.DescribedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.DescribedElement#getDescription()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Description();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.smdp2015.church.model.configurator.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link dk.itu.smdp2015.church.model.configurator.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.smdp2015.church.model.configurator.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Expression();

	/**
	 * Returns the meta object for enum '{@link dk.itu.smdp2015.church.model.configurator.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link dk.itu.smdp2015.church.model.configurator.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see dk.itu.smdp2015.church.model.configurator.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfiguratorFactory getConfiguratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.AbstractParameterImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getAbstractParameter()
		 * @generated
		 */
		EClass ABSTRACT_PARAMETER = eINSTANCE.getAbstractParameter();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PARAMETER__VISIBILITY = eINSTANCE.getAbstractParameter_Visibility();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PARAMETER__CONSTRAINTS = eINSTANCE.getAbstractParameter_Constraints();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ParameterGroupImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getParameterGroup()
		 * @generated
		 */
		EClass PARAMETER_GROUP = eINSTANCE.getParameterGroup();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_GROUP__PARAMETERS = eINSTANCE.getParameterGroup_Parameters();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ParameterImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Value Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE_RANGE = eINSTANCE.getParameter_ValueRange();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorImpl <em>Configurator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getConfigurator()
		 * @generated
		 */
		EClass CONFIGURATOR = eINSTANCE.getConfigurator();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATOR__PARAMETERS = eINSTANCE.getConfigurator_Parameters();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ValueRangeImpl <em>Value Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ValueRangeImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getValueRange()
		 * @generated
		 */
		EClass VALUE_RANGE = eINSTANCE.getValueRange();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.EnumeratedImpl <em>Enumerated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.EnumeratedImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getEnumerated()
		 * @generated
		 */
		EClass ENUMERATED = eINSTANCE.getEnumerated();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED__VALUES = eINSTANCE.getEnumerated_Values();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.BoundedImpl <em>Bounded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.BoundedImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBounded()
		 * @generated
		 */
		EClass BOUNDED = eINSTANCE.getBounded();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED__UPPER_BOUND = eINSTANCE.getBounded_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED__LOWER_BOUND = eINSTANCE.getBounded_LowerBound();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ExpressionImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.UnaryImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY__OPERATOR = eINSTANCE.getUnary_Operator();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__INNER = eINSTANCE.getUnary_Inner();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.BinaryImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__OPERATOR = eINSTANCE.getBinary_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__LEFT = eINSTANCE.getBinary_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__RIGHT = eINSTANCE.getBinary_Right();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConstantImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.InRangeImpl <em>In Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.InRangeImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getInRange()
		 * @generated
		 */
		EClass IN_RANGE = eINSTANCE.getInRange();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_RANGE__RANGE = eINSTANCE.getInRange_Range();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_RANGE__PARAMETER = eINSTANCE.getInRange_Parameter();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.IntegerImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.BooleanImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.StringImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.IdentifierImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.DescribedElementImpl <em>Described Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.DescribedElementImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getDescribedElement()
		 * @generated
		 */
		EClass DESCRIBED_ELEMENT = eINSTANCE.getDescribedElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__DESCRIPTION = eINSTANCE.getDescribedElement_Description();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.NamedElementImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConstraintImpl
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.BinaryOperator
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link dk.itu.smdp2015.church.model.configurator.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.smdp2015.church.model.configurator.UnaryOperator
		 * @see dk.itu.smdp2015.church.model.configurator.impl.ConfiguratorPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

	}

} //ConfiguratorPackage
