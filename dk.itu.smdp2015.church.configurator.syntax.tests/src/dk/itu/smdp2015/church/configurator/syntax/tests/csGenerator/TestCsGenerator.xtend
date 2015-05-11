package dk.itu.smdp2015.church.configurator.syntax.tests.csGenerator


import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest
import dk.itu.smdp2015.church.model.configurator.Configurator
import org.junit.Assert
import javax.inject.Inject
import dk.itu.smdp2015.church.generator.CSGenerator
import org.junit.Test

class TestCsGenerator extends BaseXtextTest{
	@Inject extension CSGenerator //Sut
	
	@Test
	def void testSomeCsGeneratorMethod(){
		//Arrange
		'{group test{ parameter someParam values (0,1,2)}}'.addPrefix.parse.firstGroup
		
		 //Act
		.compileParameterGroupBuilder
		
		//Assert
		.assertCodeWithExpectedOutput(
		'''put expected output here.......
            ''')
	}
}