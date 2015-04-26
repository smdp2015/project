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

class JqmHtmlGenerator implements IJqmPartGenerator {
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

    <script src="Scripts/Src-gen/app-viewmodel.js"></script>
    <script src="Scripts/Src-gen/ko-initpagebinding.js"></script>

    <script src="Scripts/jqm-init.js"></script>
    <script src="Scripts/Lib/jquery.mobile-1.4.5.min.js"></script>

</head>
<body>
    <div id="main" data-role="page" data-add-back-btn="true">
        «renderHeader(name)»

        <div role="main">
            <section class="main-description">
                «description»
            </section>
            «renderValidatonSummary»
            <ul data-role="listview">
	            «FOR it :  parameters»	
	            	«compileParameterLink»
	            «ENDFOR»
            </ul>
        </div>
    </div>
	«parameters.renderGroupPages('')»
    '''
	}
	
	def renderHeader(String title) {
		'''<div data-role="header">
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
		_groupNameStack.pushLevel(name)//We track full group path name, to support proper binding to the datamodel
		
    	val result = parameters.renderGroupPages(
	'''<div id="«name»" data-role="page" data-bind="with: $root.«_groupNameStack.fullPath»" data-add-back-btn="true">
			«renderHeader(description?:name)»
	        <div role="main">
	            «renderValidatonSummary»
	            <ul data-role="listview" >
	                 «FOR it :  parameters»	
	            		«compileParameterLink»
	            	«ENDFOR»
	            </ul>
	        </div>
		</div>
    	
	''')
    	
    	_groupNameStack.popLevel
    	result
	}
	
	
	def renderValidatonSummary() {
		'''<section class="validationSection" data-bind="css:{showValidationSummary: !isModelValid()}">
                <div class="validationSummary">
                    <h4>Validation summary</h4>
                    <ul data-bind="foreach: currentErrors">
                        <li><span data-bind="text: $data"> </span> </li>
                    </ul>
                </div>
            </section>'''
	}
	def fullPathForParameter(Parameter it){
		currentPath + name
	}
	def renderLocalValidatonMessage(Parameter it) {
		'''<p class="validationMessage" data-bind="validationMessage: «name».value"></p>'''
	}
	def renderLocalValidatonMessage(ParameterGroup it) {
		'''<p class="validationMessage" data-bind="validationMessage: «name.groupName».value"></p>'''
	}
	
	def dispatch compileParameterLink(ParameterGroup it){
		 '''
		  <li«IF visibility!=null» data-bind="visible: «name.groupName»().visible"«ENDIF»>
                <a href="#«name»">
                    «renderLocalValidatonMessage»
                </a>
          </li>
		 '''
               
	}
	def dispatch compileParameterLink(Parameter it){
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
	        «IF isCollapsible»<h2>«ENDIF»<label for="«name»-param" >«description»:</label>«IF isCollapsible»</h2>«ENDIF»
	            «valueRange.renderRangeInputElement(it)»
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