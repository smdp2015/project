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

@RunWith(XtextRunner)
@InjectWith(ConfiguratorInjectorProvider)
abstract class BaseXtextTest {
	@Inject protected extension ParseHelper<Configurator>
	
	@BeforeClass
	def static void globalSetup(){
		ConfiguratorPackage.eINSTANCE.eClass
		
	}
}