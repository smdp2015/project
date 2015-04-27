package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator

import org.junit.Test
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator
import java.beans.Expression
import dk.itu.smdp2015.church.generator.jqm.JqmCommon
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider
import org.junit.Assert
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import dk.itu.smdp2015.church.ConfiguratorInjectorProvider
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import org.junit.Before
import org.junit.BeforeClass
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest

abstract class BaseTestJqmGenerator extends BaseXtextTest{

	//helpers
	def String addPrefix (String it){
		'configuration testconfig ' + it
	}
	def firstGroup (Configurator it){
		parameters.filter(typeof(ParameterGroup)).get(0)
	}
	def firstParam (Configurator it){
		parameters.filter(typeof(Parameter)).get(0)
	}
	def dispatch void assertHtmlWithExpectedOutput(CharSequence actual, String expected)
	{
		assertHtmlWithExpectedOutput(actual.toString,expected)
	}
	def dispatch void assertHtmlWithExpectedOutput(String actual, String expected)
	{
		Assert.assertEquals(expected.debuggableWhitespace,actual.debuggableWhitespace)
	}	
	def String debuggableWhitespace(String it)
	{
		return it
		//replace(" ","+")
	}	
}