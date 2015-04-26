package dk.itu.smdp2015.church.generator.jqm

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.model.configurator.AbstractParameter
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Bounded
import java.beans.Visibility
import dk.itu.smdp2015.church.xtext.common.*
import javax.inject.Inject

class JqmViewModelGenerator implements IJqmPartGenerator {
	private var currentPath = "";
	val _groupNameStack = new GroupNameStack()
	@Inject extension ExpressionTypeProvider
	@Inject extension JqmCommon
	new(ExpressionTypeProvider extTypeProvider, JqmCommon common){
		_expressionTypeProvider = extTypeProvider
		_jqmCommon = common
	}
	override doGenerate(Resource input, IFileSystemAccess fsa, String rootFolder) {
			
		for (e : input.allContents.toIterable.filter(typeof(Configurator))) {
			var generated = compile(e);

			
			fsa.generateFile(rootFolder + "/main.html", generated)
		}
	}
	def compile(Configurator it) {
		'''
		
		'''
	}
	
}