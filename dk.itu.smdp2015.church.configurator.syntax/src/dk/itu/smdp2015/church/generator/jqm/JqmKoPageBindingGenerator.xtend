package dk.itu.smdp2015.church.generator.jqm

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import java.beans.Visibility
import dk.itu.smdp2015.church.xtext.common.*
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Expression
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.model.configurator.Constraint
import dk.itu.smdp2015.church.model.configurator.AbstractParameter
import java.util.function.BinaryOperator
import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.Unary
import dk.itu.smdp2015.church.model.configurator.UnaryOperator
import dk.itu.smdp2015.church.model.configurator.Identifier
import dk.itu.smdp2015.church.model.configurator.InRange
import dk.itu.smdp2015.church.model.configurator.impl.IdentifierImpl
import org.eclipse.xtext.generator.parser.antlr.splitting.services.SimpleExpressionsGrammarAccess.ArgumentElements
import java.security.InvalidParameterException

class JqmKoPageBindingGenerator implements IJqmPartGenerator {
	String _rootFolder
	new(String rootFolder){
		_rootFolder =rootFolder
	}
	override doGenerate(Resource input, IFileSystemAccess fsa) {
			
		for (e : input.allContents.toIterable.filter(typeof(Configurator))) {
			var generated = compile(e);
			fsa.generateFile(_rootFolder + "/ko-initpagebinding.js", generated)
		}
	}
	def compile(Configurator it) {
		'''
$(document).ready(function(){
	«renderPageBindingStatement("main")»
	«renderNestedGroups(parameters,'')»
});
'''
	}
	
	def String renderPageBindingStatement(String pageId){
'''
$("#«pageId»").on('pagecreate', function (event, ui) {

    ko.applyBindings(App.ViewModel, this );
});
'''
	}
	
	def renderNestedGroups(Iterable<AbstractParameter> it,String result) {
		filter(typeof(ParameterGroup)).renderBindingForGroups(result)
	}
	
	def renderBindingForGroups(Iterable<ParameterGroup> it, String result){
		fold(result)[prev,it|prev + renderBindingForGroups]
		
	}
	def  renderBindingForGroups(ParameterGroup group){
		renderNestedGroups(group.parameters, renderPageBindingStatement(group.name))
	}
}