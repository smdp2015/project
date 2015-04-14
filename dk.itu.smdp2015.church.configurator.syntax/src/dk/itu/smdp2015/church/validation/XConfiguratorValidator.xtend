package dk.itu.smdp2015.church.validation

import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import dk.itu.smdp2015.church.model.configurator.Constraint
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Expression
import javax.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check

import static dk.itu.smdp2015.church.model.configurator.BinaryOperator.*

class XConfiguratorValidator extends AbstractConfiguratorValidator {
	public static val WRONG_TYPE = "dk.itu.smdp2015.church.WrongType"

	@Inject extension ExpressionTypeProvider

	@Check
	def checkType(Constraint constraint) {
		checkExpectedBoolean(constraint.expr, ConfiguratorPackage.Literals.CONSTRAINT__EXPR)
	}

	@Check
	def checkType(Binary binary) {
		val leftLiteral = ConfiguratorPackage.Literals.BINARY__LEFT
		val rightLiteral = ConfiguratorPackage.Literals.BINARY__RIGHT
		val binaryLiteral = ConfiguratorPackage.Literals.BINARY__OPERATOR
		switch (binary.operator) {
			case ADDITION: {
			}
			case LOGICAL_AND: {
				checkExpectedBoolean(binary.left, leftLiteral)
				checkExpectedBoolean(binary.right, rightLiteral)
			}
			case LOGICAL_OR: {
				checkExpectedBoolean(binary.left, leftLiteral)
				checkExpectedBoolean(binary.right, rightLiteral)
			}
			case EQUAL: {
				val leftType = getTypeAndCheckNotNull(binary.left, leftLiteral)
				val rightType = getTypeAndCheckNotNull(binary.right, rightLiteral)
				if (leftType != rightType) {
					error("expected the same type, but the types are " + leftType + " and " + rightType, binaryLiteral,
						WRONG_TYPE)
				}
			}
			case GREATER_THAN: {
			}
			case LESS_THAN: {
			}
			case MULTIPLICATION: {
			}
			case NOT_EQUAL: {
			}
			case SUBTRACTION: {
			}
		}
	}

	@Check
	def checkType(Enumerated range) {
		val firstType = getTypeAndCheckNotNull(range.values.get(0), ConfiguratorPackage.Literals.ENUMERATED__VALUES)
		for (value : range.values) {
			val nextType = getTypeAndCheckNotNull(value, ConfiguratorPackage.Literals.ENUMERATED__VALUES)
			if (firstType != nextType)
				error("expected the same type, but the types are " + firstType + " and " + nextType,
					ConfiguratorPackage.Literals.ENUMERATED__VALUES, WRONG_TYPE)
		}
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

	def private checkExpectedBoolean(Expression exp, EReference reference) {
		checkExpectedType(exp, ExpressionType.Boolean, reference)
	}

	def private checkExpectedType(Expression expression, ExpressionType expectedType, EReference reference) {
		val actualType = getTypeAndCheckNotNull(expression, reference)
		if (actualType != expectedType) {
			error("expected type " + expectedType + ", actual type is " + actualType, reference, WRONG_TYPE)
		}
	}

	def private ExpressionType getTypeAndCheckNotNull(Expression expression, EReference reference) {
		var type = expression?.typeFor
		if (type == null)
			error("unknown", reference, WRONG_TYPE)
		type
	}
}
