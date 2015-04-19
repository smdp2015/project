package dk.itu.smdp2015.church.validation

import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.Boolean
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.Constant
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Identifier
import dk.itu.smdp2015.church.model.configurator.InRange
import dk.itu.smdp2015.church.model.configurator.Integer
import dk.itu.smdp2015.church.model.configurator.String
import dk.itu.smdp2015.church.model.configurator.Unary
import dk.itu.smdp2015.church.model.configurator.ValueRange

import static dk.itu.smdp2015.church.model.configurator.BinaryOperator.*
import static dk.itu.smdp2015.church.model.configurator.UnaryOperator.*

class ExpressionTypeProvider {

	def dispatch ExpressionType typeFor(Constant constant) {
		switch (constant) {
			String: ExpressionType.String
			Boolean: ExpressionType.Boolean
			Integer: ExpressionType.Integer
		}
	}

	def dispatch ExpressionType typeFor(Binary binary) {
		switch (binary.operator) {
			case ADDITION:
				ExpressionType.Integer
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
				ExpressionType.Integer
			case NOT_EQUAL:
				ExpressionType.Boolean
			case SUBTRACTION:
				ExpressionType.Integer
		}
	}

	def dispatch ExpressionType typeFor(Unary unary) {
		switch (unary.operator) {
			case INVERSION: ExpressionType.Integer
			case LOGICAL_NOT: ExpressionType.Boolean
		}
	}

	def dispatch ExpressionType typeFor(InRange inrange) {
		ExpressionType.Boolean
	}

	def dispatch ExpressionType typeFor(Identifier identifier) {
		identifier.id.valueRange?.rangeType
	}
	
	def ExpressionType rangeType(ValueRange range) {
		switch (range) {
			Enumerated: range.values.get(0)?.typeFor
			Bounded: range.lowerBound?.typeFor
		}
	}
}