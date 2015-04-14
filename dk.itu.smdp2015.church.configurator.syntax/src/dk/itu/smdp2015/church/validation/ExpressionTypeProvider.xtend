package dk.itu.smdp2015.church.validation

import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.Boolean
import dk.itu.smdp2015.church.model.configurator.Constant
import dk.itu.smdp2015.church.model.configurator.Identifier
import dk.itu.smdp2015.church.model.configurator.InRange
import dk.itu.smdp2015.church.model.configurator.Integer
import dk.itu.smdp2015.church.model.configurator.String
import dk.itu.smdp2015.church.model.configurator.Unary

import static dk.itu.smdp2015.church.model.configurator.BinaryOperator.*
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Bounded

class ExpressionTypeProvider {

	def dispatch ExpressionType typeFor(Constant constant) {
		switch (constant) {
			String: ExpressionType.String
			Boolean: ExpressionType.Boolean
			Integer: ExpressionType.Integer
		}
	}

	def dispatch ExpressionType typeFor(Binary binary) {
		val leftType = binary.left?.typeFor
		val rightType = binary.right?.typeFor
		switch (binary.operator) {
			case ADDITION:
				if (leftType == ExpressionType.String || rightType == ExpressionType.String)
					ExpressionType.String
				else if(leftType == ExpressionType.Integer && rightType == ExpressionType.Integer) ExpressionType.
					Integer else ExpressionType.Double
			case LOGICAL_AND:
				ExpressionType.Boolean
			case LOGICAL_OR:
				ExpressionType.Boolean
			case EQUAL:
				ExpressionType.Boolean
			case GREATER_THAN:
				ExpressionType.Boolean
			case LESS_THAN:
				ExpressionType.Boolean
			case MULTIPLICATION:
				if(leftType == ExpressionType.Integer && rightType == ExpressionType.Integer) ExpressionType.Integer else ExpressionType.
					Double
			case NOT_EQUAL:
				ExpressionType.Boolean
			case SUBTRACTION:
				if(leftType == ExpressionType.Integer && rightType == ExpressionType.Integer) ExpressionType.Integer else ExpressionType.
					Double
		}
	}

	def dispatch ExpressionType typeFor(Unary unary) {
		val innerType = unary.inner?.typeFor
		switch (unary.operator) {
			case INVERSION: if(innerType == ExpressionType.Double) ExpressionType.Double else ExpressionType.Integer
		}
	}

	def dispatch ExpressionType typeFor(InRange inrange) {
		ExpressionType.Boolean
	}

	def dispatch ExpressionType typeFor(Identifier identifier) {
		val range = identifier.id.valueRange
		switch(range) {
			Enumerated: range.values.get(0)?.typeFor
			Bounded: range.lowerBound?.typeFor
		}
	}

}
