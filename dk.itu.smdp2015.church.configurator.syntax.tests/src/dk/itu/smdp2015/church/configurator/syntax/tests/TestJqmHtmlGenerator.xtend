package dk.itu.smdp2015.church.configurator.syntax.tests

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

@RunWith(XtextRunner)
@InjectWith(ConfiguratorInjectorProvider)
class TestJqmHtmlGenerator {

	@Inject extension ParseHelper<Configurator>
	@Inject extension JqmHtmlGenerator
	@BeforeClass
	def static void beforeClass(){
		ConfiguratorPackage.eINSTANCE.eClass
		
	}
	def void testGroupLink_RendersAsListItem(){
		
		'configuration test {group test{}}}'.parse =>
		[
			compileParameterLink(parameters.get(0)).assertHtml(
		'''<li>
                <a href="#test">
                	test
                    <p class="validationMessage" data-bind="validationMessage: group_test"></p>
                </a>
          </li>
          ''')
		]
		
	}
	def void assertHtml(String actual, String expected)
	{
		Assert.assertEquals(expected.debuggableWhitespace,actual.debuggableWhitespace)
	}	
	def String debuggableWhitespace(String it)
	{
		replace(" ","+")
	}	
}