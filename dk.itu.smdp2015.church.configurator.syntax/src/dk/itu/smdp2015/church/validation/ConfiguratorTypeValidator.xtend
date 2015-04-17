package dk.itu.smdp2015.church.validation

import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import dk.itu.smdp2015.church.model.configurator.Constraint
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Expression
import dk.itu.smdp2015.church.model.configurator.Unary
import javax.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check

import static dk.itu.smdp2015.church.model.configurator.BinaryOperator.*

class ConfiguratorTypeValidator extends AbstractConfiguratorValidator {
	public static val WRONG_TYPE = "dk.itu.smdp2015.church.WrongType"

	@Inject extension ExpressionTypeProvider

	@Check
	def cwheckType(Constraint constraint) {
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
}
