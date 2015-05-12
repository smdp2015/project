package dk.itu.smdp2015.church.configurator.syntax.tests.validation

import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest
import org.junit.Test
import javax.inject.Inject
import dk.itu.smdp2015.church.validation.ConfiguratorValidator
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import static org.junit.Assert.*
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.model.configurator.impl.IntegerImpl
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.impl.StringImpl
import org.eclipse.xtext.diagnostics.Diagnostic

class TestConstraints extends BaseXtextTest {
	
	@Inject extension ValidationTestHelper
	
	// Bounded tests:

	@Test
	def void testBoundedValid() {
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
	def void testBoundedInvalidWrongTypes() {
		'{ parameter wheel_size values [b;16] }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.WRONG_TYPE, "expected the same type")
	}

	@Test
	def void testBoundedInvalidReverse() {
		'{ parameter wheel_size values [24;16] }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be less than upper bound")
	}

	@Test
	def void testBoundedInvalidLowerNotConstant(){
		'{ parameter wheel_size values [2+3;5] }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be a constant.")		
	}
	
	@Test
	def void testBoundedInvalidUpperNotConstant(){
		'{ parameter wheel_size values [2;5+2] }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Upper bound should be a constant.")	
	}
	
	
	// Enumeration tests:

	@Test
	def void testEnumerationValid() {
		var model = '''configurator Car { parameter Variant values ("Standard", "Sport", "Luxury") }'''.parse
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
		
	@Test
	def void testEnumerationInvalidWrongElement() {
		'{ parameter Variant values ("Standard", "Sport", Luxury) }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated item should be a constant")
	}
	
	@Test
	def void testEnumerationInvalidNonUniqueValues() {
		'{ parameter Variant values ("Standard", "Luxury", "Standard") }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated values should be unique")
	}

	@Test
	def void testEnumerationInvalidNotConstantValue() {
		'{ parameter Variant values (1, 2+3) }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated item should be a constant")
	}
	
	
	// Default values:
	
	@Test
	def void testDefaultValueEnumerationValidInteger() {
		"configurator chair { parameter legs values (3, 4) default-value 4 }".parse
		.assertNoErrors
	}

	@Test
	def void testDefaultValueEnumerationInvalidInteger() {
		"configurator chair { parameter legs values (3, 4) default-value 5 }".parse
		.assertError(ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be among the listed values")
	}

	@Test
	def void testDefaultValueEnumerationValidString() {
		"configurator sofa { parameter surface values ('leather', 'cotton') default-value 'cotton' }".parse
		.assertNoErrors
	}

	@Test
	def void testDefaultValueEnumerationInvalidString() {
		"configurator sofa { parameter surface values ('leather', 'cotton') default-value 'plastic' }".parse
		.assertError(ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be among the listed values")
	}
	
	@Test
	def void testDefaultValueInRangeValid() {
		"configurator loudspeaker { parameter effect values [10; 500] default-value 50 }".parse
		.assertNoErrors
	}

	@Test
	def void testDefaultValueInRangeInvalidAbove() {
		"configurator loudspeaker { parameter effect values [10; 500] default-value 1000 }".parse
		.assertError(ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be within the specified value range")
	}
	
	@Test
	def void testDefaultValueInRangeInvalidBelow() {
		"configurator loudspeaker { parameter effect values [10; 500] default-value 9 }".parse
		.assertError(ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be within the specified value range")
	}
	
	
	// Optional parameter references:
	
	@Test
	def void testParameterReferenceValid() {
		"configurator car { parameter radio values ('Disco', 'Funk', 'Classic')
		parameter antenna values ('telescope', 'standard') visible-if radio=='Disco'
		parameter speakers values ('Super-Bass', 'Extra-Bass') visible-if radio in ('Disco', 'Funk') }".parse
		.assertNoErrors
	}

	@Test
	def void testParameterReferenceInvalidIdentifier() {
		"configurator car { parameter radio values ('Disco', 'Funk', 'Classic') optional
		parameter antenna values ('telescope', 'standard') visible-if radio=='Disco' }".parse
		.assertError(ConfiguratorPackage.Literals.IDENTIFIER, ConfiguratorValidator.OPTIONAL_PARAMETER_INVALID, "Identifier cannot refer to an optional parameter")		
	}

	@Test
	def void testParameterReferenceInvalidInRange() {
		"configurator car { parameter radio values ('Disco', 'Funk', 'Classic') optional
		parameter antenna values ('telescope', 'standard') visible-if radio in ('Disco', 'Funk') }".parse
		.assertError(ConfiguratorPackage.Literals.IN_RANGE, ConfiguratorValidator.OPTIONAL_PARAMETER_INVALID, "Identifier cannot refer to an optional parameter")		
	}
	
	
	// Parameter names:
	
	@Test
	def void testParameterNamesUnique() {
		"configurator myconfigurator { parameter foo values [3; 5] parameter foobar values (3, 4) }".parse
		.assertNoErrors
	}
	
	@Test
	def void testParameterNamesNotUnique() {
		"configurator myconfigurator { parameter foo values [3; 5] parameter foobar values (3, 4) parameter foo values (5,6) }".parse
		.assertError(ConfiguratorPackage.Literals.NAMED_ELEMENT, ConfiguratorValidator.PARAMETER_NAME_NOT_UNIQUE, "All parameters and parameter groups must have globally unique names")
	}
	
	@Test
	def void testParameterNameInvalid() {
		'{ parameter 3foo values [3, 4] }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.CONFIGURATOR, Diagnostic.SYNTAX_DIAGNOSTIC, "mismatched input")
	}	
	
}