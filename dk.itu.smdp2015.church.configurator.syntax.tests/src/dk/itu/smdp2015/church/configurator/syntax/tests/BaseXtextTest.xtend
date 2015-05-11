package dk.itu.smdp2015.church.configurator.syntax.tests

import dk.itu.smdp2015.church.ConfiguratorInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.BeforeClass
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Parameter
import org.junit.Assert
import dk.itu.smdp2015.church.model.configurator.Enumerated

@RunWith(XtextRunner)
@InjectWith(ConfiguratorInjectorProvider)
abstract class BaseXtextTest {
	@Inject protected extension ParseHelper<Configurator>
	
	@BeforeClass
	def static void globalSetup(){
		ConfiguratorPackage.eINSTANCE.eClass
		
	}
	
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
	def firstEnumerated (Configurator it){
		parameters.filter(typeof(Parameter)).get(0).valueRange as Enumerated
	}
	def dispatch void assertCodeWithExpectedOutput(CharSequence actual, String expected)
	{
		assertCodeWithExpectedOutput(actual.toString,expected)
	}
	def dispatch void assertCodeWithExpectedOutput(String actual, String expected)
	{
		Assert.assertEquals(expected.debuggableWhitespace,actual.debuggableWhitespace)
	}	
	def String debuggableWhitespace(String it)
	{
		return it
		//replace(" ","+")
	}	
}