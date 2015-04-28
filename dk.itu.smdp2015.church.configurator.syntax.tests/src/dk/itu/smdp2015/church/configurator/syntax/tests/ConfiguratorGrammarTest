package dk.itu.smdp2015.church.configurator.syntax.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.ConfiguratorInjectorProvider
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import org.junit.Before

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ConfiguratorInjectorProvider))
class MyTest {
	
	@Inject
	extension ParseHelper<Configurator>
	
	@Inject
	extension ValidationTestHelper
	
	@Before
	def void before() {
		ConfiguratorPackage.eINSTANCE.eClass		
	}
	
	@Test
	def void testFoo() {
		'''configurator car { parameter foo values [2;3] }'''.parse.assertNoErrors
	}
}