package dk.itu.smdp2015.church.validation

import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.Constant
import dk.itu.smdp2015.church.model.configurator.Identifier
import dk.itu.smdp2015.church.model.configurator.InRange
import dk.itu.smdp2015.church.model.configurator.String
import dk.itu.smdp2015.church.model.configurator.Unary

import static dk.itu.smdp2015.church.model.configurator.BinaryOperator.*
import static dk.itu.smdp2015.church.model.configurator.UnaryOperator.*

class ExpressionValueProvider {

	def dispatch Object staticValue(Constant constant) {
		switch (constant) {
			String: constant.value
			dk.itu.smdp2015.church.model.configurator.Boolean: constant.value
			dk.itu.smdp2015.church.model.configurator.Integer: constant.value
		}
	}

	def dispatch Object staticValue(Binary binary) {
		val vleft = binary.left.staticValue
		val vright = binary.right.staticValue
		switch (binary.operator) {
			case ADDITION:
				if (vleft instanceof Integer && vright instanceof Integer) {
					val ileft = (vleft as Integer).intValue  
					val iright = (vright as Integer).intValue  
					new Integer(ileft + iright)
				}
			case LOGICAL_AND:
				if (vleft instanceof Boolean && vright instanceof Boolean) {
					val bleft = (vleft as Boolean).booleanValue  
					val bright = (vright as Boolean).booleanValue  
					new Boolean(bleft && bright)
				}
			case LOGICAL_OR:
				if (vleft instanceof Boolean && vright instanceof Boolean) {
					val bleft = (vleft as Boolean).booleanValue  
					val bright = (vright as Boolean).booleanValue  
					new Boolean(bleft || bright)
				}
			case EQUAL:
				if (vleft != null && vleft.class.equals(vright.class)) {
					new Boolean(vleft.equals(vright)) 
				}
			case GREATER_THAN:
				if (vleft instanceof Integer && vright instanceof Integer) {
					val ileft = (vleft as Integer).intValue  
					val iright = (vright as Integer).intValue  
					new Boolean(ileft > iright)
				}
			case LESS_THAN:
				if (vleft instanceof Integer && vright instanceof Integer) {
					val ileft = (vleft as Integer).intValue  
					val iright = (vright as Integer).intValue  
					new Boolean(ileft > iright)
				}
			case MULTIPLICATION:
				if (vleft instanceof Integer && vright instanceof Integer) {
					val ileft = (vleft as Integer).intValue  
					val iright = (vright as Integer).intValue  
					new Integer(ileft * iright)
				} 
			case NOT_EQUAL:
				if (vleft != null && vleft.class.equals(vright.class)) {
					new Boolean(!vleft.equals(vright)) 
				}
			case SUBTRACTION:
				if (vleft instanceof Integer && vright instanceof Integer) {
					val ileft = (vleft as Integer).intValue  
					val iright = (vright as Integer).intValue  
					new Integer(ileft - iright)
				} 
		}
	}

	def dispatch Object staticValue(Unary unary) {
		val vinner = unary.inner.staticValue
		switch (unary.operator) {
			case INVERSION: 
				if (vinner instanceof Integer) {
					val iinner = (vinner as Integer).intValue
					new Integer(-iinner)
				} 
			case LOGICAL_NOT: 
				if (vinner instanceof Boolean) {
					val binner = (vinner as Boolean).booleanValue
					new Boolean(!binner)
				} 
		}
	}

	def dispatch ExpressionType staticValue(InRange inrange) {
		null
	}

	def dispatch ExpressionType staticValue(Identifier identifier) {
		null
	}
}