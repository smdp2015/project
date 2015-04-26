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

class JqmViewModelGenerator implements IJqmPartGenerator {
	private var currentPath = "";
	@Inject extension ExpressionTypeProvider
	@Inject extension JqmCommon
	
	String _rootFolder
	
	new(ExpressionTypeProvider extTypeProvider, JqmCommon common, String rootFolder){
		_rootFolder =rootFolder
		_expressionTypeProvider = extTypeProvider
		_jqmCommon = common
	}
	override doGenerate(Resource input, IFileSystemAccess fsa) {
			
		for (e : input.allContents.toIterable.filter(typeof(Configurator))) {
			var generated = compile(e);
			fsa.generateFile(_rootFolder + "/app-viewmodel.js", generated)
		}
	}
	def compile(Configurator it) {
		'''
var App = window.App = {};

App.ViewModel = ko.validatedObservable({
   
    currentErrors:ko.observableArray([]),
    isModelValid: ko.deferredPureComputed(function()
    {
        var isValid= App.ViewModel.isValid();

        App.ViewModel().currentErrors(App.ViewModel.errors());
        return isValid;
    },this),
    «parameters.renderParameters»

});

//Init special group validations, by resetting objects value
«parameters.filter(typeof(ParameterGroup)).renderGroupValidationInit('')»
'''
	}
	
	def renderGroupValidationInit(Iterable<ParameterGroup> it,String result) {
		fold(result)[prev,it|prev + renderGroupValidationInit]
	}
	def renderGroupValidationInit(ParameterGroup it) {
		parameters.filter(typeof(ParameterGroup)).renderGroupValidationInit(
			'''
			App.ViewModel().«fullPath»(App.ViewModel().«fullPath»());
			'''
		)
	}
	def renderParameters(EList<AbstractParameter> it){
		drop(1).fold(get(0).renderParam)[previous,it|previous + ", \n" + renderParam]
	}
	def dispatch String renderParam(Parameter it) {
		'''«name»: {
	    	«IF (valueRange.rangeType != ExpressionType.Boolean)»«valueRange.renderValueRange»,«ENDIF»
	    	«IF optional»isOn: ko.observable(false),«ENDIF»
	    	value: ko.observable(«^default?.renderExpression»)«IF !optional»«renderRequiredValidation»«ENDIF»
	    	«FOR it : constraints»
	    		«renderConstraint»
	    	«ENDFOR»
	    }
    '''
	}
	
	def dispatch String renderParam(ParameterGroup it) {
		'''
		«groupName»: ko.observable({
			«IF visibility!=null»isVisible: ko.deferredPureComputed(function(){
           	return «visibility.renderExpression»
        }),«ENDIF»
			«parameters.renderParameters»
		})«FOR it:constraints»«renderConstraint»«ENDFOR»'''
	}
	def renderRequiredValidation(Parameter it) {
		'''.extend({
	                required: {params: true, message: "«name» is required"}
	            })'''
	}
	
	
	def renderConstraint(Constraint it){
'''.extend({
	validation: {
		validator: function (val, param) {
            if(App.ViewModel==null)//not initialized
                return true;
            //Expression here:
            var result =
              «expression.renderExpression»
            return result;
        },
        message: "«description?:'Unspecified validation error'»"
		}
	})'''
	}
	
	def dispatch renderValueRange(Bounded it){
		'''boundedRange:{
	            lower: «lowerBound.renderExpression»,
	            upper: «upperBound.renderExpression»
	        }'''
	}
	def dispatch renderValueRange(Enumerated it){
		'''choices: «renderJavaScriptArray»'''
	}
	def renderJavaScriptArray(Enumerated it){
		'''[«values.drop(1).fold(it.values.get(0).renderExpression)[result, it|result + ',' + renderExpression]»]'''
	}
	def dispatch renderExpression(Expression it){
		"Unknown expression"
	}
	def dispatch renderExpression(dk.itu.smdp2015.church.model.configurator.Constant it){
		toString
	}
	def dispatch renderExpression(dk.itu.smdp2015.church.model.configurator.String it){
		'''"«it.value»"'''
	}
	def dispatch renderExpression(dk.itu.smdp2015.church.model.configurator.Boolean it){
		it.value
	}
	def dispatch renderExpression(dk.itu.smdp2015.church.model.configurator.Integer it){
		it.value
	}
	def dispatch renderExpression(InRange it){
		'''«IF it.range instanceof Enumerated»
			$.inArray(«parameter.jsValueReference»,
			 «(range as Enumerated).renderJavaScriptArray») > -1
			 «ELSEIF it.range instanceof Bounded»
			 	«val bound = range as Bounded»
			 	(«parameter.jsValueReference» ">" «bound.lowerBound.renderExpression» && «parameter.jsValueReference» < «bound.upperBound.renderExpression»)
			 «ELSE»
			 	«"Unknown valuerange: " + it.range.class.name»
			 «ENDIF»
			 '''
	}
	def dispatch renderExpression(Binary it){
		'''(«left.renderExpression»
			«operator.renderOperator»
			«right.renderExpression»
			)'''
	}
	def dispatch renderExpression(Identifier it){
		it.id.jsValueReference
	}
	def dispatch renderExpression(Unary it){
		val isLogical= operator == UnaryOperator.LOGICAL_NOT
		'''«operator.renderOperator»
			«IF isLogical»(«inner»)
			«ELSE»
			«inner»
			«ENDIF»
		'''
	}
	
	def renderOperator(UnaryOperator it){
	
		switch literal {
			case "inversion": "-"
			case "logicalNot": "!"
			default: "no operatormatch"
		}
	}
	def renderOperator(dk.itu.smdp2015.church.model.configurator.BinaryOperator operator) {
		switch operator.literal {
			case "logicalOr": " || "
			case "logicalAnd": " && "
			case "addition": " + "
			case "multiplication": " * "
			case "lessThan": " < "
			case "greaterThan": " > "
			case "equal": " == "
			case "notEqual": " != "
			default: " no operatormatch "
		}
	}
	def jsValueReference(Parameter it){
		'''App.ViewModel().«fullPath».value()«IF it.valueRange instanceof Enumerated»==null? '' : App.ViewModel().«fullPath».value()[0]«ENDIF»'''
	}
	
}
/*
 
		'''length:
    {
        boundedRange:{
            lower: 2,
            upper: 10
        },
        value : ko.observable()
            .extend({
                required: {params: true, message: "Length is required"}
            })//if Mandatory
    },
    variant:
    {
        choices: ['standard', 'sport', 'luxury'],
        value: ko.observable(),
        isOn: ko.observable(false)
    },
    engine:
    {
        choices: ['TFSI 1.2', 'TFSI 1.4', 'TFSI 2.02'],
        value: ko.observable()
            .extend({
                validation: {
                    validator: function (val, param) {
                        if(App.ViewModel==null)//not initialized
                            return true;
                        //Expression here:
                        var result =
                            (
                                $.inArray("TFSI 1.2", App.ViewModel().engine.value()) > -1 ||
                                $.inArray("TFSI 1.4", App.ViewModel().engine.value()) > -1
                            ) ||
                            $.inArray("sport", App.ViewModel().variant.value()) > -1
                        return result;

                    },
                    message: "validation error"
                }})
    },
    fog_lights:
    {
        value: ko.observable(),
        isOn: ko.observable(false)
    },

    group_seats: ko.observable({
        isVisible:ko.deferredPureComputed(function(){
        //Example of evaluating value where value is pointing to enumeration where value will be in an array (select input element)
            return $.inArray("standard", App.ViewModel().variant.value()) > -1;
        }),
        material:
        {
            choices: ['leather', 'cloth'],
            value: ko.observable(/!*set default if applies*!/)
        },
        colour:
        {
            choices: ['red', 'blue','black'],
            value: ko.observable(/!*set default if applies*!/),

            isOn: ko.observable(false)
        }
    }).extend({
        validation: {
            validator: function (val, param) {
               if(App.ViewModel==null)//not initialized
                    return true;
                //Expression here:
                var result =
                    $.inArray("leather", App.ViewModel().group_seats().material.value()) == -1 ||
                    (
                        $.inArray("red", App.ViewModel().group_seats().colour.value()) > -1 ||
                        $.inArray("black", App.ViewModel().group_seats().colour.value()) > -1
                    )
                return result;
            },
            message: "groups_seats invalid, leather can only have colour red, black"
        }}).extend({
            validation: {
                validator: function (val, param) {
                    if(App.ViewModel==null)//not initialized
                        return true;
                    //Expression here:
                    var result =
                        $.inArray("cloth", App.ViewModel().group_seats().material.value()) == -1 ||
                        (
                        $.inArray("blue", App.ViewModel().group_seats().colour.value()) > -1 ||
                        $.inArray("black", App.ViewModel().group_seats().colour.value()) > -1
                        )
                    return result;
                },
                message: "invalid seats: cloth can only be blue or black"
            }})'''
            
            
 */