package dk.itu.smdp2015.church.generator.jqm

import org.eclipse.xtext.generator.IGenerator
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

public class JqmHtmlGenerator implements IJqmPartGenerator {
	@Inject extension ExpressionTypeProvider
	@Inject extension JqmCommon
	
	String _rootFolder
	
	Resource _input
	new(){}
	new(ExpressionTypeProvider extTypeProvider, JqmCommon common, String rootFolder){
		_rootFolder =rootFolder
		_expressionTypeProvider = extTypeProvider
		_jqmCommon = common
	}
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		_input =input
		for (e : input.allContents.toIterable.filter(typeof(Configurator))) {
			var generated = compile(e);

			
			fsa.generateFile(_rootFolder +"/" +input.URI.lastSegment.replace(".conf", ".html"), generated)
		}
	}
	def compile(Configurator it) {
		'''
«renderHeadHtmlPart»
«renderBodyPart»
    '''
	}
	
	def renderBodyPart(Configurator it){
		'''<body>
    <div id="main" data-role="page">
        «renderHeader(name)»
        <div role="main">
           «renderAppDescription»
           «renderValidatonSummary»
           <ul data-role="listview">
	           «FOR it :  parameters»	
	          		«compileParameterLink»
	           «ENDFOR»
           </ul>
        </div>
    </div>
	«parameters.renderGroupPages('')»
</body>'''
	}
	def renderHeadHtmlPart(){
		'''
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>car</title>
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="Content/Lib/jquery.mobile-1.4.5.min.css">
    <link rel="stylesheet" href="Content/style.css">

    <script src="Scripts/Lib/jquery-1.11.1.min.js"></script>
    <script src="Scripts/Lib/knockout-3.3.0.debug.js"></script>
    <script src="Scripts/Lib/knockout.mapping-latest.js"></script>
    <script src="Scripts/Lib/knockout.validation.js"></script>
    <script src="Scripts/submit-configuration.js"></script>

    <script src="Scripts/ko-init.js"></script>
    <script src="Scripts/ko-initcustomhandlers.js"></script>

    <script src="Scripts/Src-gen/«_input?.resourceFileName»-app-viewmodel.js"></script>
    <script src="Scripts/Src-gen/«_input?.resourceFileName»-ko-initpagebinding.js"></script>

    <script src="Scripts/jqm-init.js"></script>
    <script src="Scripts/Lib/jquery.mobile-1.4.5.min.js"></script>

</head>'''
	}
	def String renderAppDescription(Configurator it) {
		'''<section class="main-description">
                «description»
            </section>
            '''
	}
	def renderHeader(ParameterGroup it) {
		renderHeader(description?:name)
	}
	private def renderHeader(String title) {
		'''<div data-role="header" data-add-back-btn="true">
            <h1>
                «title»
            </h1>
            <button class="ui-btn-right ui-icon-check ui-btn-icon-right ui-btn" onclick="submitconfiguration();">submit</button>
        </div>
        '''
	}
	
	def String renderGroupPages(Iterable<AbstractParameter> it,String result){
		filter(typeof(ParameterGroup)).fold(result)[more, it| more + renderGroupPage]
	}
	
	
	def renderGroupPage(ParameterGroup it) {
    	val result = parameters.renderGroupPages(
	'''		<div id="«name»" data-role="page" data-bind="with: $root.«fullPath»">
			«renderHeader»
	        <div role="main">
	            «renderValidatonSummary»
	            <ul data-role="listview">
	                 «FOR it :  parameters»	
	            		«compileParameterLink»
	            	«ENDFOR»
	            </ul>
	        </div>
		</div>
		''')
    	result
	}
	
	
	def renderValidatonSummary() {
		'''<section class="validationSection" data-bind="css:{showValidationSummary: !$root.isModelValid()}">
                <div class="validationSummary">
                    <h4>Validation summary</h4>
                    <ul data-bind="foreach: $root.currentErrors">
                        <li><span data-bind="text: $data"> </span> </li>
                    </ul>
                </div>
            </section>'''
	}
	
	def renderLocalValidatonMessage(Parameter it) {
		'''
		<p class="validationMessage" data-bind="validationMessage: «name».value"></p>
		'''
	}
	def renderLocalValidatonMessage(ParameterGroup it) {
		'''
		<p class="validationMessage" data-bind="validationMessage: «groupName»"></p>
		'''
	}
	def dispatch String compileParameterLink(AbstractParameter it){
          //for enabling calling as base reference  
	}
	def dispatch String compileParameterLink(ParameterGroup it){
		 '''
		  <li«IF visibility!=null» data-bind="visible: «groupName»().isVisible"«ENDIF»>
                <a href="#«name»">
                	«description?:name»
                    «renderLocalValidatonMessage»
                </a>
          </li>
		 '''
               
	}
	def dispatch String compileParameterLink(Parameter it){
		val isCollapsible = optional
		val dataBindExprPrefix=' data-bind="'
		var dataBindExpr =dataBindExprPrefix
		if(isCollapsible)
			dataBindExpr = dataBindExprPrefix + "isExpanded: "+ name + ".isOn"
		if(visibility !=null)
			if(dataBindExpr==dataBindExprPrefix)
				dataBindExpr = dataBindExprPrefix + "visible: "+ name + ".isVisible"
			else
				dataBindExpr = ", visible: "+ name + ".isVisible"
		'''<li«IF isCollapsible» data-role="collapsible"«ENDIF»«IF dataBindExpr!=dataBindExprPrefix»«dataBindExpr»"«ENDIF»>
	        «IF isCollapsible»<h2>«ENDIF»<label for="«name»-param" >«description?:name»:</label>«IF isCollapsible»</h2>«ENDIF»
	            «valueRange?.renderRangeInputElement(it)»
	        	«renderLocalValidatonMessage»
	       </li>
	       '''
	}
	
	def dispatch renderRangeInputElement(Enumerated it, Parameter param){
		'''«IF rangeType == ExpressionType.Boolean»
    			«renderBooleanInputElement(param)»
		   «ELSE»
		  		<select id="«param.name»-param" data-bind="options: «param.name».choices, selectedOptions: «param.name».value,optionsCaption:'Choose...'"></select>
    		«ENDIF»
		'''
	}
	def dispatch renderRangeInputElement(Bounded it, Parameter param){
		'''<input data-bind="value: «param.name».value, attr:{ min: «param.name».boundedRange.lower, max: «param.name».boundedRange.upper}" type="range" name="«param.name»" id="«param.name»-param">
			'''	
	}
	def renderBooleanInputElement(Enumerated it, Parameter param) {
		'''<label data-bind="text: «param.name».value()?'on':'off'"> <input type="checkbox" id="«param.name»-param" data-bind="checked:«param.name».value"> </label>
		   '''
	}
	
}