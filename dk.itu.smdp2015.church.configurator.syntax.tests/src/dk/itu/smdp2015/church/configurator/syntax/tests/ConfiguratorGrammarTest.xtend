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

import static org.junit.Assert.*
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.impl.IntegerImpl
import dk.itu.smdp2015.church.validation.ConfiguratorValidator
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.impl.StringImpl
import org.eclipse.xtext.diagnostics.Diagnostic
import dk.itu.smdp2015.church.model.configurator.Constraint
import dk.itu.smdp2015.church.model.configurator.Binary
import dk.itu.smdp2015.church.model.configurator.BinaryOperator
import dk.itu.smdp2015.church.model.configurator.Identifier

@RunWith(XtextRunner)
@InjectWith(ConfiguratorInjectorProvider)
class ConfiguratorGrammarTest {
	
	@Inject extension ParseHelper<Configurator>
	
	@Inject extension ValidationTestHelper
	
	@Before
	def void before() {
		ConfiguratorPackage.eINSTANCE.eClass		
	}

	
	@Test
	def void testValidBoundedRange() {
		var model = '''configurator Bicycle "Bicycle configuration" { parameter wheel_size values [16;24] }'''.parse
		assertEquals("Bicycle configuration", model.description)
		var param = model.parameters.get(0) as Parameter
		assertEquals("wheel_size", param.name)
		var valueRange = param.valueRange as Bounded
		assertEquals(16, (valueRange.lowerBound as IntegerImpl).value)
		assertEquals(24, (valueRange.upperBound as IntegerImpl).value)
		model.assertNoErrors
	}

	
	@Test
	def void testInvalidModelNoParameters() {
		var model = '''configurator Empty'''.parse
		model.assertError(ConfiguratorPackage.Literals.CONFIGURATOR, Diagnostic.SYNTAX_DIAGNOSTIC, "mismatched input")
	}
	
	@Test
	def void testValidEnum() {
		var model = '''configurator Car { parameter Variant values ("Standard", "Sport", "Luxury") }'''.parse
		assertNull(model.description)
		var param = model.parameters.get(0) as Parameter
		assertEquals("Variant", param.name)
		assertFalse(param.optional)
		var enumerated = param.valueRange as Enumerated
		assertEquals(3, enumerated.values.length)
		assertEquals("Standard", (enumerated.values.get(0) as StringImpl).value)
		assertEquals("Sport", (enumerated.values.get(1) as StringImpl).value)
		assertEquals("Luxury", (enumerated.values.get(2) as StringImpl).value)
		model.assertNoErrors
	}

 /* 
	@Test
	def void testConstraints() {
		var model = '''
			configurator car "A configurator for a car" {
			parameter color "the seat color" values ("red", "blue", "black"),
			parameter seat_material "the seat material" values ("leather", "cloth")
			constraints
			{
				description "invalid seats: leather can only have colour red, black" seat_material != "leather" or (color in ("red", "black")),
				description "invalid seats: cloth can not be red" seat_material != "cloth" or color in ("blue", "black")
			}
			}
        '''.parse
		//assertEquals("A configurator for a car", model.description)
		//var param = model.parameters.get(1) as Parameter
		//assertEquals("the seat material", param.description)
		//assertEquals(2, param.constraints.length)
		//var constraint1 = param.constraints.get(0) as Constraint
		//assertEquals("invalid seats: leather can only have colour red, black", constraint1.description)
		//var exp1 = constraint1.expression as Binary
		//var exp2 = exp1.left as Binary
		//assertEquals(BinaryOperator.NOT_EQUAL, exp2.operator)
		//assertEquals(param, (exp2.left as Identifier).id)
		//assertEquals("leather", (exp2.right as StringImpl).value)
		//model.assertNoErrors
	}
*/

}