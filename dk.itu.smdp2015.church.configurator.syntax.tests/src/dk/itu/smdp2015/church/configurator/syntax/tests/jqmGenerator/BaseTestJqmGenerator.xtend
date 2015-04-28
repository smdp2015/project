package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator


import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest
import dk.itu.smdp2015.church.model.configurator.Configurator
import org.junit.Assert

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