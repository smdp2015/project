package dk.itu.smdp2015.church.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Parameter
import org.eclipse.emf.common.util.EList
import dk.itu.smdp2015.church.model.configurator.AbstractParameter
import dk.itu.smdp2015.church.model.configurator.Unary
import dk.itu.smdp2015.church.model.configurator.Identifier
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.BinaryOperator
import dk.itu.smdp2015.church.model.configurator.Constraint
import java.util.LinkedList
import dk.itu.smdp2015.church.model.configurator.impl.ParameterGroupImpl
import dk.itu.smdp2015.church.model.configurator.Expression

class CSGenerator implements IGenerator {
	var classes = new LinkedList<String>
	var confBuilder = new LinkedList<String>

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(typeof(Configurator))) {
			var generated = compile(e);

			for (s : classes) {
				generated.append(s.toString)
			}

			for (s : confBuilder) {
				generated.append(s.toString)
			}
			
			fsa.generateFile("Configurator.cs", generated)
		}
	}

	def compile(Configurator configurator) {
         
        
		//ModelBuilder
		var sb = new StringBuilder
		sb.append(
			'''
				public static class ConfigurationBuilder
				{
					public static Configurator Build()
					{						
						var model = «compileBuilder(configurator.parameters)»;
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
		'''«parameterGroup.name» = new «parameterGroup.name»
			{
				Name = "«parameterGroup.name»",
				«compileBuilder(parameterGroup.parameters)»
			}'''
	}

	def dispatch compileParameterBuilder(Parameter parameter) {
		if(parameter.valueRange instanceof Bounded )
		{
			''' «parameter.name» = new «parameter.name» { Value = «compileExpression(parameter.^default)», Name = "«parameter.name»", Description = "«parameter.description»" },'''
		} else
		if(parameter.valueRange instanceof Enumerated )
		{
			var v = parameter.valueRange as Enumerated
			var enumValues = v.values.map[value|'"' + compileExpression(value) + '"'].join(',')
			''' «parameter.name» = new «parameter.name» { Value = "«compileExpression(parameter.^default)
									»", Name = "«parameter.name»", Description = "«parameter.description
									»", SelectableValues = new List<string>{«enumValues.toString» }},'''
		}		
	}

	def dispatch compileParameter(ParameterGroup parameterGroup) //named compileParameter because of the dispatch keyword
	{
		var sb = new StringBuilder
		sb.append(
			'''
				/// <summary>
				/// Parametergroup «parameterGroup.name» 
				/// «parameterGroup.description»
				/// </summary>
				public class «parameterGroup.name»:IGroupParameter
				{	
					public string Name { get; set; }		
					«compile(parameterGroup.parameters)»
					
					public bool IsVisible()
					{
						return 	«if (parameterGroup.visibility == null) {'''true; //visibility is null'''} else {compileExpression(parameterGroup.visibility)}»;
					}
						 
					public bool Validate()
					{ 
						return true;
					}
				}
			''')
		classes.addLast(sb.toString)

		'''
			/// <summary>
			/// parameter «parameterGroup.name» 
			/// «parameterGroup.description»
			/// </summary>
			public «parameterGroup.name» «parameterGroup.name» { get; set; }
		'''
	}



	def dispatch compileParameter(Parameter parameter) {
		var sb = new StringBuilder
		if(parameter.valueRange instanceof Bounded)
		{			
		sb.append(
			'''
				/// <summary>
				/// Parameter «parameter.name» 
				/// «parameter.description»
				/// </summary>
				public class «parameter.name»: IntParameter
				{	
					public string Name { get; set; }		
										
					public override bool IsVisible()
					{
						return 	«if (parameter.visibility == null) {'''true; //visibility is null'''} else {compileExpression(parameter.visibility)}»;
					}
						 
					public override bool Validate()
					{
						return  «if(parameter.constraints != 224324){'''true; //constraints is null'''} else {
							compileExpression(parameter.constraints)''';'''
							}» 
						
					}
				}
			''')
		} 
		if(parameter.valueRange instanceof Enumerated)
		{
			sb.append(
			'''
				/// <summary>
				/// Parameter «parameter.name» 
				/// «parameter.description»
				/// </summary>
				public class «parameter.name»: EnumeratedParameter
				{	
					public string Name { get; set; }		
										
					public override bool IsVisible()
					{
						return 	«if (parameter.visibility == null) {'''true; //visibility is null'''} else {compileExpression(parameter.visibility)}»;
					}
						 
					public override bool Validate()
					{
							return true;
					}
				}
			''')
		}
		
		classes.addLast(sb.toString)
		
		'''
			/// <summary>
			/// parameter «parameter.name» 
			/// «parameter.description»
			/// </summary>
			public «parameter.name» «parameter.name» { get; set; }
					
		'''
	}

	def dispatch compileExpression(EList<Constraint> p) {
		p.fold(new StringBuilder)[sb, con|sb.append(compileExpression(con.expression)); sb].toString  //virker ikke

//		for(c:p){
//			compileExpression(c.expression)	
//		}
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
		identifier.id.name
	}

	def dispatch compileExpression(dk.itu.smdp2015.church.model.configurator.Integer integer) {
		integer.value
	}

	def dispatch compileExpression(dk.itu.smdp2015.church.model.configurator.Boolean bool) {
		bool.value
	}

	def dispatch compileExpression(dk.itu.smdp2015.church.model.configurator.String str) {
		str.value
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
