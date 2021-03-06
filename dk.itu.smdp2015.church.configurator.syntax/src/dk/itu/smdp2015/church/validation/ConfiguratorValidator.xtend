package dk.itu.smdp2015.church.validation

import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import dk.itu.smdp2015.church.model.configurator.Constraint
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Expression
import dk.itu.smdp2015.church.model.configurator.InRange
import dk.itu.smdp2015.church.model.configurator.Unary
import dk.itu.smdp2015.church.model.configurator.ValueRange
import javax.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check

import static dk.itu.smdp2015.church.model.configurator.BinaryOperator.*
import static dk.itu.smdp2015.church.model.configurator.UnaryOperator.*
import dk.itu.smdp2015.church.model.configurator.Parameter

import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider
import dk.itu.smdp2015.church.model.configurator.Identifier
import dk.itu.smdp2015.church.xtext.common.ExpressionType
import dk.itu.smdp2015.church.model.configurator.Configurator
import org.eclipse.emf.common.util.EList
import dk.itu.smdp2015.church.model.configurator.AbstractParameter
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import java.util.ArrayList
import java.util.List

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ConfiguratorValidator extends AbstractConfiguratorValidator {

	public static val INVALID_BOUND = 'invalidBound'
	public static val INVALID_ENUMERATION = 'invalid enumeration'
	public static val INVALID_BINARYTYPE = 'invalid binary operand type'
	public static val WRONG_TYPE = "dk.itu.smdp2015.church.WrongType"
	public static val OPTIONAL_PARAMETER_INVALID = 'optional Parameter invalid'
	public static val PARAMETER_NAME_NOT_UNIQUE = 'parameter name not unique'

	@Inject extension ExpressionTypeProvider
	@Inject extension ExpressionValueProvider

	@Check
	def checkEnumeratedExpressionIsConstant(Enumerated it) {
		// Check that each value in the enumerated expression can be evaluated as a static value:
		values.forEach[
			if (staticValue == null) {
				error('Enumerated item should be a constant.', ConfiguratorPackage.Literals.ENUMERATED__VALUES,
					INVALID_ENUMERATION)
			}]
	}

	@Check
	def checkBoundedExpressionUpperBoundIsConstant(Bounded bounded) {
		// Check that the upper bound in a bounded expression can be evaluated as a static value:
		if (bounded.upperBound.staticValue == null) {
			error('Upper bound should be a constant.', ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND,
				INVALID_BOUND)
		}
	}

	@Check
	def checkBoundedExpressionLowerBoundIsConstant(Bounded bounded) {
		// Check that the lower bound in a bounded expression can be evaluated as a static value:
		if (bounded.lowerBound.staticValue == null) {			
			error('Lower bound should be a constant.', ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND,
				INVALID_BOUND)
		}
	}

	@Check
	def checkBoundedExpressionLowerIsBelowUpper(Bounded bounded) {
		// Check that the lower bound in a bound expression is less than the upper bound
		val lowerVal = bounded.lowerBound?.staticValue
		val upperVal = bounded.upperBound?.staticValue
		var c = -1;
		if (lowerVal instanceof Integer && upperVal instanceof Integer) {
			// If values are of type Integer:
			c = (lowerVal as Integer).compareTo(upperVal as Integer)
		}
		if (lowerVal instanceof String && upperVal instanceof String) {
			// If values are of type String:
			c = (lowerVal as String).compareTo(upperVal as String)
		}
		if (lowerVal instanceof Boolean && upperVal instanceof Boolean) {
			// If values are of type Boolean:
			c = (lowerVal as Boolean).compareTo(upperVal as Boolean)
		}
		if (c >= 0) {
			error('Lower bound should be less than upper bound', ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND,
				INVALID_BOUND)
		}
	}

	@Check
	def checkEnumeratedSequence(Enumerated enumerated) {
		// Check that values contained in Enumerated all have unique static values
		// (e.g. 2+2 must not be in the same sequence as 4) 
		enumerated.values.forEach [ v |
			if (enumerated.values.filter[staticValue == v.staticValue].size != 1)
				error('Enumerated values should be unique', ConfiguratorPackage.Literals.ENUMERATED__VALUES,
					INVALID_ENUMERATION)
		]
	}

	@Check
	def checkType(Constraint constraint) {
		val literal = ConfiguratorPackage.Literals.CONSTRAINT__EXPRESSION
		val type = getTypeAndCheckNotNull(constraint.expression, literal)
		checkExpectedType(type, ExpressionType.Boolean, literal)
	}

	@Check
	def checkType(Binary binary) {
		val leftLiteral = ConfiguratorPackage.Literals.BINARY__LEFT
		val rightLiteral = ConfiguratorPackage.Literals.BINARY__RIGHT
		val binaryLiteral = ConfiguratorPackage.Literals.BINARY__OPERATOR
		val leftType = getTypeAndCheckNotNull(binary.left, leftLiteral)
		val rightType = getTypeAndCheckNotNull(binary.right, rightLiteral)
		switch (binary.operator) {
			case ADDITION: {
				checkExpectedType(leftType, ExpressionType.Integer, leftLiteral)
				checkExpectedType(rightType, ExpressionType.Integer, rightLiteral)
			}
			case LOGICAL_AND: {
				checkExpectedType(leftType, ExpressionType.Boolean, leftLiteral)
				checkExpectedType(rightType, ExpressionType.Boolean, rightLiteral)
			}
			case LOGICAL_OR: {
				checkExpectedType(leftType, ExpressionType.Boolean, leftLiteral)
				checkExpectedType(rightType, ExpressionType.Boolean, rightLiteral)
			}
			case EQUAL: {
				if (leftType != rightType) {
					error("expected the same type, but the types are " + leftType + " and " + rightType, binaryLiteral,
						WRONG_TYPE)
				}
			}
			case GREATER_THAN: {
				checkExpectedType(leftType, ExpressionType.Integer, leftLiteral)
				checkExpectedType(rightType, ExpressionType.Integer, rightLiteral)
			}
			case LESS_THAN: {
				checkExpectedType(leftType, ExpressionType.Integer, leftLiteral)
				checkExpectedType(rightType, ExpressionType.Integer, rightLiteral)
			}
			case MULTIPLICATION: {
				checkExpectedType(leftType, ExpressionType.Integer, leftLiteral)
				checkExpectedType(rightType, ExpressionType.Integer, rightLiteral)
			}
			case NOT_EQUAL: {
				if (leftType != rightType) {
					error("expected the same type, but the types are " + leftType + " and " + rightType, binaryLiteral,
						WRONG_TYPE)
				}
			}
			case SUBTRACTION: {
				checkExpectedType(leftType, ExpressionType.Integer, leftLiteral)
				checkExpectedType(rightType, ExpressionType.Integer, rightLiteral)
			}
		}
	}

	@Check
	def checkType(Unary unary) {
		val innerLiteral = ConfiguratorPackage.Literals.UNARY__INNER
		val innerType = getTypeAndCheckNotNull(unary.inner, innerLiteral)
		switch (unary.operator) {
			case INVERSION: {
				checkExpectedType(innerType, ExpressionType.Integer, innerLiteral)
			}
			case LOGICAL_NOT: {
				checkExpectedType(innerType, ExpressionType.Boolean, innerLiteral)
			}
		}
	}

	@Check
	def checkType(InRange inRange) {
		val leftLiteral = ConfiguratorPackage.Literals.IN_RANGE__PARAMETER
		val rightLiteral = ConfiguratorPackage.Literals.IN_RANGE__RANGE
		val leftType = getTypeAndCheckNotNull(inRange.parameter.valueRange, leftLiteral)
		val rightType = getTypeAndCheckNotNull(inRange.range, rightLiteral)
		if (leftType != rightType) {
			error("expected the same type, but the types are " + leftType + " and " + rightType, rightLiteral,
				WRONG_TYPE)
		}
	}

	@Check
	def checkType(Enumerated range) {
		val firstType = getTypeAndCheckNotNull(range.values.get(0), ConfiguratorPackage.Literals.ENUMERATED__VALUES)
		range.values.forEach [
			val nextType = getTypeAndCheckNotNull(ConfiguratorPackage.Literals.ENUMERATED__VALUES)
			if (firstType != nextType)
				error("expected the same type, but the types are " + firstType + " and " + nextType,
					ConfiguratorPackage.Literals.ENUMERATED__VALUES, WRONG_TYPE)
		]
	}

	@Check
	def checkType(Bounded range) {
		val lowerType = getTypeAndCheckNotNull(range.lowerBound, ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND)
		val upperType = getTypeAndCheckNotNull(range.upperBound, ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND)
		if (lowerType != upperType) {
			error("expected the same type, but the types are " + lowerType + " and " + upperType,
				ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND, WRONG_TYPE)
		}
	}

	@Check
	def checkType(Parameter parameter) {
		if (parameter.^default != null) {
			val defType = getTypeAndCheckNotNull(parameter.^default, ConfiguratorPackage.Literals.PARAMETER__DEFAULT)
			val rangeType = getTypeAndCheckNotNull(parameter.valueRange,
				ConfiguratorPackage.Literals.PARAMETER__VALUE_RANGE)
			if (defType != rangeType) {
				error("expected the same type, but the types are " + defType + " and " + rangeType,
					ConfiguratorPackage.Literals.PARAMETER__DEFAULT, WRONG_TYPE)
			}
		}
	}

	@Check
	def checkDefaultValue(Parameter parameter) {
		// Constraint check on parameter default value.
		// Does this parameter have a default value at all?:
		if (parameter.^default != null) {
			val defVal = parameter.^default.staticValue
			val range = parameter.valueRange
			switch (range) {
				Enumerated:
					// Constraint check on Enumerated ValueRange type:
					if (!range.values.exists[staticValue == defVal])
						// Error if default value is not among the listed elements in the Enumerated collection:
						error('Default value should be among the listed values',
							ConfiguratorPackage.Literals.PARAMETER__DEFAULT, INVALID_BOUND)
				Bounded: {
					// Constraint check on Bounded ValueRange type:
					var defaultValueIsValid = true;
					if (range.lowerBound.staticValue instanceof Integer) // Bounded ValueRange elements are of type Integer
						// Check that default value lies between lower and upper bound:
						defaultValueIsValid = (range.lowerBound.staticValue as Integer) <= (defVal as Integer) 
							&& (range.upperBound.staticValue as Integer) >= (defVal as Integer)
					else if (range.lowerBound.staticValue instanceof String) // Bounded ValueRange elements are of type String 
						// Check that default value lies between lower and upper bound (based on string values):
						defaultValueIsValid = (range.lowerBound.staticValue as String) <= (defVal as String)
							&& (range.upperBound.staticValue as String) >= (defVal as String)
					if (!defaultValueIsValid)
						// Throw an error:
						error('Default value should be within the specified value range', ConfiguratorPackage.Literals.PARAMETER__DEFAULT, INVALID_BOUND)
				}
			}
		}
	}

	@Check
	def checkIdentifierOptional(Identifier identifier) {
		// Check if any Identifier refers to an optional parameter:
		if (identifier.id.optional) {
			error('Identifier cannot refer to an optional parameter', ConfiguratorPackage.Literals.IDENTIFIER__ID, OPTIONAL_PARAMETER_INVALID)
		}
	}

	@Check
	def checkInRangeOptional(InRange inRange) {
		// Check if any InRange refers to an optional parameter:
		if (inRange.parameter.optional) {
			error('Identifier cannot refer to an optional parameter', ConfiguratorPackage.Literals.IN_RANGE__PARAMETER, OPTIONAL_PARAMETER_INVALID)
		}
	}
	
	@Check
	def checkUniqueParameterNames(Configurator configurator) {
		// Check that all parameters and parameter groups have globally unique names:
		var params = configurator.parameters.names
		if (params.length != params.toSet.length) {
			error('All parameters and parameter groups must have globally unique names', ConfiguratorPackage.Literals.NAMED_ELEMENT__NAME, PARAMETER_NAME_NOT_UNIQUE)
		}
	}
	
	def private List<String> names(EList<AbstractParameter> it) {
		 // Get all abstract parameter names:
		var paramNames = fold(new ArrayList<String>) [ parameterNames, abstractParameter | parameterNames.add(abstractParameter.name); parameterNames]
		// Add names of all parameters in any underlying parameter groups (notice the recursion):
		paramNames.addAll(
			it.filter(ParameterGroup).fold(new ArrayList<String>) 
			[parameterNames, parameterGroup | parameterNames.addAll(parameterGroup.parameters.names); parameterNames]
		)
		// Just return parameter names
		paramNames
	}
	
	def private checkExpectedType(ExpressionType actualType, ExpressionType expectedType, EReference reference) {
		if (actualType != expectedType) {
			error("expected type " + expectedType + ", actual type is " + actualType, reference, WRONG_TYPE)
		}
	}

	def private ExpressionType getTypeAndCheckNotNull(Expression expression, EReference reference) {
		var type = expression?.typeFor
		if (type == null)
			error("unknown type", reference, WRONG_TYPE)
		type
	}

	def private ExpressionType getTypeAndCheckNotNull(ValueRange range, EReference reference) {
		var type = range?.rangeType
		if (type == null)
			error("unknown type", reference, WRONG_TYPE)
		type
	}
}
