package dk.itu.smdp2015.church.configurator.syntax.tests.validation

import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest
import org.junit.Test
import javax.inject.Inject
import dk.itu.smdp2015.church.validation.ConfiguratorValidator
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage

class TestConstraints extends BaseXtextTest {
	
	@Inject extension ValidationTestHelper
	@Test
	def void testSomething(){
		'{ parameter wheel_size values [24;16] }'.addPrefix.parse
		.assertError(ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be less than upper bound")
		
	}
	@Test
	def void testInvalidEnumWrongElement() {
		var model = '''configurator Car { parameter Variant values ("Standard", "Sport", Luxury) }'''.parse
		model.assertError(ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated item should be a constant")
	}
	@Test
	def void testInvalidBoundedRangeWrongTypes() {
		var model = '''configurator Bicycle { parameter wheel_size values [b;16] }'''.parse
		model.assertError(ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.WRONG_TYPE, "expected the same type")
	}
	@Test
	def void testInvalidBoundedRangeReverse() {
		var model = '''configurator Bicycle { parameter wheel_size values [24;16] }'''.parse
		model.assertError(ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be less than upper bound")
	}
}