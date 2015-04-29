package dk.itu.smdp2015.church.generator

import dk.itu.smdp2015.church.model.configurator.AbstractParameter
import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.BinaryOperator
import dk.itu.smdp2015.church.model.configurator.Boolean
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.model.configurator.Constraint
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Identifier
import dk.itu.smdp2015.church.model.configurator.Integer
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Unary
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import dk.itu.smdp2015.church.validation.*


import javax.inject.Inject
import dk.itu.smdp2015.church.model.configurator.Expression
import dk.itu.smdp2015.church.model.configurator.ValueRangeimport dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider
import dk.itu.smdp2015.church.xtext.common.ExpressionType

class CSGenerator implements IGenerator {
	var groupParameterclasses = new LinkedList<String>
	var parameterInstance = new LinkedList<String>
	var confBuilder = new LinkedList<String>
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(typeof(Configurator))) {
			var generated = compile(e);

			for (s : groupParameterclasses) {
				generated.append(s.toString)
			}


			for (s : confBuilder) {
				generated.append(s.toString)
			}
			
			fsa.generateFile("Configurator.cs", generated)
		}
	}

	def compile(Configurator configurator) {
        //clear scope
        parameterInstance.clear
        
        //create parameter instances
        compileBuilder(configurator.parameters)
		var parameters = new StringBuilder
		for(s : parameterInstance){
				parameters.append(s.toString)
		}

		//ModelBuilder
		var sb = new StringBuilder
		sb.append(
			'''
				public static class ConfigurationBuilder
				{
					
					public static Configurator Build()
					{	
						«parameters.toString»
						var model = «compileBuilder(configurator.parameters)»
				   	    return new Configurator(model); 
				   	}
				}
			''')			
		confBuilder.addLast(sb.toString)

		//Classes
		compile(configurator.parameters)
	}

	//compiles all valueparameter and parametergroup 
	def compile(EList<AbstractParameter> p) {
		p.fold(new StringBuilder)[sb, parameter|sb.append(compileParameter(parameter)); sb]
	}

	def compileBuilder(EList<AbstractParameter> p) {
		p.fold(new StringBuilder)[sb, parameter|sb.append(compileParameterBuilder(parameter)); sb]
	}

	
	def dispatch compileParameterBuilder(ParameterGroup parameterGroup)	{
		compileBuilder(parameterGroup.parameters)			
		parameterInstance.addLast('''
		var «parameterGroup.name» = new «parameterGroup.name»GroupParameter
		{
				Name = "«parameterGroup.name»",
				«compileParameterGroupBuilder(parameterGroup.parameters)»
		};	
		«parameterGroup.name».IsVisible = () => «safeAddVisibleIf(parameterGroup.visibility)»;
		«parameterGroup.name».Validate = () => «safeAddConstraints(parameterGroup.constraints)»;
				
		''')				
		
		'''«parameterGroup.name» = «parameterGroup.name»GroupParameter;'''
	}


	def dispatch compileParameterBuilder(Parameter parameter) {
				
		if(parameter.valueRange instanceof Bounded )
		{	
							
			parameterInstance.addLast('''
			var «parameter.name» = new «getParameterType(parameter)» {«safeAddDefault(parameter)» Name = "«parameter.name
									   »", Description = "«parameter.description»", Optional = «parameter.optional», «safeAddUpperLower(parameter.valueRange)»};
				«parameter.name».IsVisible = () => «safeAddVisibleIf(parameter.visibility)»;
				«parameter.name».Validate = () => «safeAddConstraints(parameter.constraints)»;
		 	''')
		} else
		if(parameter.valueRange instanceof Enumerated )
		{
			var v = parameter.valueRange as Enumerated
			var enumValues = v.values.map[value|compileExpression(value)].join(',')
			
			parameterInstance.addLast('''
			var «parameter.name» = new «getParameterType(parameter)»  { «safeAddDefault(parameter)
									» Name = "«parameter.name»", Description = "«parameter.description
									»", SelectableValues = new List<string>{«enumValues.toString»}};
			«parameter.name».IsVisible = () => «safeAddVisibleIf(parameter.visibility)»;
			«parameter.name».Validate = () => «safeAddConstraints(parameter.constraints)»;
				
			''')
		}		
	}
	
	def safeAddDefault(Parameter parameter)
	{
		if(parameter != null && parameter.^default != null)
		{
			if(parameter instanceof dk.itu.smdp2015.church.model.configurator.String)
			{
				return  'Value = "' + compileExpression(parameter.^default) + '", '	
			}else
			{
				return  'Value = ' + compileExpression(parameter.^default) +', '
			}
			
		}
	}
	
	def safeAddConstraints(EList<Constraint> constraint)
	{
		if(constraint==null || constraint.length==0){
			"true"
		}else
		{
			compileExpression(constraint)
		}
	}
	
	def safeAddVisibleIf(Expression expression)
	{
		if(expression==null)
		{
			true
		}else
		{
			compileExpression(expression)
		}
	}
	
	def safeAddUpperLower(ValueRange valueRange)
	{		
		if(valueRange!=null && valueRange instanceof Bounded)
		{
			var boundedvalueRange = valueRange as Bounded
			
			if(	boundedvalueRange.upperBound != null && boundedvalueRange.upperBound instanceof dk.itu.smdp2015.church.model.configurator.Integer)
			{
				"UpperBound = " + compileExpression(boundedvalueRange.upperBound) +", LowerBound = " + compileExpression(boundedvalueRange.lowerBound)				
			}
		}
	}

	def dispatch compileParameterGroupBuilder(EList<AbstractParameter> p) {
		p.fold(new StringBuilder)[sb, parameter|sb.append(compileParameterGroupBuilder(parameter)); sb]
	}

	def dispatch compileParameterGroupBuilder(ParameterGroup parameterGroup){
		 '''
		«parameterGroup.name» = «parameterGroup.name»,
		'''
	}

	def dispatch compileParameterGroupBuilder(Parameter parameter)	{
		'''
		«parameter.name» = «parameter.name»,
		''' 
	}

	def dispatch compileParameter(ParameterGroup parameterGroup) //named compileParameter because of the dispatch keyword
	{		
			groupParameterclasses.addLast('''		
				 
				/// <summary>
				/// Parametergroup «parameterGroup.name» 
				/// «parameterGroup.description»
				/// </summary>
				public class «parameterGroup.name»GroupParameter:GroupParameter
				{	
					public string Name { get; set; }		
					«compile(parameterGroup.parameters)»
				}
			'''	)
			
			'''
				/// <summary>
				/// Parametergroup «parameterGroup.name» 
				/// «parameterGroup.description»
				/// </summary>
				public «parameterGroup.name»GroupParameter «parameterGroup.name» {get; set;}
			'''
	}


	def dispatch compileParameter(Parameter parameter) {
  		'''/// <summary>
  		/// parameter «parameter.name»
  		/// «parameter.description»
  		/// </summary>
  		public «getParameterType(parameter)» «parameter.name» { get; set; }		
		'''
	}
	
	def getParameterType(Parameter parameter){
		if(parameter.valueRange instanceof Bounded){	
			var bounded1 = parameter.valueRange as Bounded
			
			if(bounded1.upperBound instanceof dk.itu.smdp2015.church.model.configurator.Integer)
			{			  				 				
				return "IntParameter"  			  				
  			}
  			
  			if(bounded1.upperBound instanceof dk.itu.smdp2015.church.model.configurator.String)
  			{
  				return "StringParameter"  				
  			}
  			if(bounded1.upperBound instanceof dk.itu.smdp2015.church.model.configurator.Boolean)
  			{
  				return  "BoolParameter"  				
  			}  				
		}
		
		if(parameter.valueRange instanceof Enumerated){		
  			return "EnumeratedParameter"		
  		}   		
  	}
  	
	def dispatch compileExpression(EList<Constraint> p) {		
		p.map[constraint|compileExpression(constraint.expression).toString].join(' && ')
	}
	
	def dispatch compileExpression(Binary binary) {
		compileExpression(binary.left) +
		compileBinaryOperator(binary.operator) +
		compileExpression(binary.right)
	}

	def dispatch compileExpression(Unary unary) {
		unary.operator
	}

	def dispatch compileExpression(Identifier identifier) {
		identifier.id.name + '''.Value'''
	}

	def dispatch compileExpression(Integer integer) {
		integer.value
	}

	def dispatch compileExpression(Boolean bool) {
		bool.value
	}

	def dispatch compileExpression(dk.itu.smdp2015.church.model.configurator.String str) {
		'"' + str.value + '"' 
	}
	
	def dispatch compileExpression(dk.itu.smdp2015.church.model.configurator.InRange inRange)
	{
		if(inRange.range instanceof Enumerated)
		{			
			inRange.parameter.name + ".SelectableValues.Exists( x => x == " + inRange.parameter.name + ".Value)" 	
		}
		else if (inRange.range instanceof Bounded)
		{
			var bounded = inRange.range as Bounded 
			compileExpression(bounded.lowerBound) + " < " + inRange.parameter.name + ".Value < " + compileExpression(bounded.upperBound) 
		}
		
		
	}

	def compileBinaryOperator(BinaryOperator binaryOperator) {
		switch binaryOperator.literal {
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
}

