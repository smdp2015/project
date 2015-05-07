package dk.itu.smdp2015.church.configurator.model

import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Bounded
import org.eclipse.emf.ecore.EObject

class TestConstraints {
	
	def static dispatch constraint(Configurator it) {
		!parameters.empty && !name.empty
	}
	
	def static dispatch constraint(Parameter it) {
		!name.empty
	}
	
	def static dispatch constraint(ParameterGroup it) {
		!parameters.empty && !name.empty
	}
		
	def static dispatch constraint(Bounded it) {
		var lBound = (lowerBound as dk.itu.smdp2015.church.model.configurator.Integer)
		var uBound = (upperBound as dk.itu.smdp2015.church.model.configurator.Integer)
		lBound.value < uBound.value
	}
		
	def static dispatch constraint(EObject it) {
		true
	}
}