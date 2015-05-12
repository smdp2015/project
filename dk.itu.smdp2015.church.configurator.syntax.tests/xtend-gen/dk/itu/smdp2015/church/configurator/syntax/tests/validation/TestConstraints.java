package dk.itu.smdp2015.church.configurator.syntax.tests.validation;

import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import dk.itu.smdp2015.church.model.configurator.impl.IntegerImpl;
import dk.itu.smdp2015.church.model.configurator.impl.StringImpl;
import dk.itu.smdp2015.church.validation.ConfiguratorValidator;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestConstraints extends BaseXtextTest {
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testBoundedValid() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("configurator Bicycle \"Bicycle configuration\" { parameter wheel_size values [16;24] }");
      Configurator model = this._parseHelper.parse(_builder);
      String _description = model.getDescription();
      Assert.assertEquals("Bicycle configuration", _description);
      EList<AbstractParameter> _parameters = model.getParameters();
      AbstractParameter _get = _parameters.get(0);
      Parameter param = ((Parameter) _get);
      String _name = param.getName();
      Assert.assertEquals("wheel_size", _name);
      ValueRange _valueRange = param.getValueRange();
      Bounded valueRange = ((Bounded) _valueRange);
      Expression _lowerBound = valueRange.getLowerBound();
      int _value = ((IntegerImpl) _lowerBound).getValue();
      Assert.assertEquals(16, _value);
      Expression _upperBound = valueRange.getUpperBound();
      int _value_1 = ((IntegerImpl) _upperBound).getValue();
      Assert.assertEquals(24, _value_1);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBoundedInvalidWrongTypes() {
    try {
      String _addPrefix = this.addPrefix("{ parameter wheel_size values [b;16] }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.WRONG_TYPE, "expected the same type");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBoundedInvalidReverse() {
    try {
      String _addPrefix = this.addPrefix("{ parameter wheel_size values [24;16] }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be less than upper bound");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBoundedInvalidLowerNotConstant() {
    try {
      String _addPrefix = this.addPrefix("{ parameter wheel_size values [2+3;5] }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be a constant.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBoundedInvalidUpperNotConstant() {
    try {
      String _addPrefix = this.addPrefix("{ parameter wheel_size values [2;5+2] }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Upper bound should be a constant.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEnumerationValid() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("configurator Car { parameter Variant values (\"Standard\", \"Sport\", \"Luxury\") }");
      Configurator model = this._parseHelper.parse(_builder);
      EList<AbstractParameter> _parameters = model.getParameters();
      AbstractParameter _get = _parameters.get(0);
      Parameter param = ((Parameter) _get);
      String _name = param.getName();
      Assert.assertEquals("Variant", _name);
      boolean _isOptional = param.isOptional();
      Assert.assertFalse(_isOptional);
      ValueRange _valueRange = param.getValueRange();
      Enumerated enumerated = ((Enumerated) _valueRange);
      EList<Expression> _values = enumerated.getValues();
      int _length = ((Object[])Conversions.unwrapArray(_values, Object.class)).length;
      Assert.assertEquals(3, _length);
      EList<Expression> _values_1 = enumerated.getValues();
      Expression _get_1 = _values_1.get(0);
      String _value = ((StringImpl) _get_1).getValue();
      Assert.assertEquals("Standard", _value);
      EList<Expression> _values_2 = enumerated.getValues();
      Expression _get_2 = _values_2.get(1);
      String _value_1 = ((StringImpl) _get_2).getValue();
      Assert.assertEquals("Sport", _value_1);
      EList<Expression> _values_3 = enumerated.getValues();
      Expression _get_3 = _values_3.get(2);
      String _value_2 = ((StringImpl) _get_3).getValue();
      Assert.assertEquals("Luxury", _value_2);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEnumerationInvalidWrongElement() {
    try {
      String _addPrefix = this.addPrefix("{ parameter Variant values (\"Standard\", \"Sport\", Luxury) }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated item should be a constant");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEnumerationInvalidNonUniqueValues() {
    try {
      String _addPrefix = this.addPrefix("{ parameter Variant values (\"Standard\", \"Luxury\", \"Standard\") }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated values should be unique");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEnumerationInvalidNotConstantValue() {
    try {
      String _addPrefix = this.addPrefix("{ parameter Variant values (1, 2+3) }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated item should be a constant");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultValueEnumerationValidInteger() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator chair { parameter legs values (3, 4) default-value 4 }");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultValueEnumerationInvalidInteger() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator chair { parameter legs values (3, 4) default-value 5 }");
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be among the listed values");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultValueEnumerationValidString() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator sofa { parameter surface values (\'leather\', \'cotton\') default-value \'cotton\' }");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultValueEnumerationInvalidString() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator sofa { parameter surface values (\'leather\', \'cotton\') default-value \'plastic\' }");
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be among the listed values");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultValueInRangeValid() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator loudspeaker { parameter effect values [10; 500] default-value 50 }");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultValueInRangeInvalidAbove() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator loudspeaker { parameter effect values [10; 500] default-value 1000 }");
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be within the specified value range");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultValueInRangeInvalidBelow() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator loudspeaker { parameter effect values [10; 500] default-value 9 }");
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.PARAMETER, ConfiguratorValidator.INVALID_BOUND, "Default value should be within the specified value range");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterReferenceValid() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator car { parameter radio values (\'Disco\', \'Funk\', \'Classic\')\n\t\tparameter antenna values (\'telescope\', \'standard\') visible-if radio==\'Disco\'\n\t\tparameter speakers values (\'Super-Bass\', \'Extra-Bass\') visible-if radio in (\'Disco\', \'Funk\') }");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterReferenceInvalidIdentifier() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator car { parameter radio values (\'Disco\', \'Funk\', \'Classic\') optional\n\t\tparameter antenna values (\'telescope\', \'standard\') visible-if radio==\'Disco\' }");
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.IDENTIFIER, ConfiguratorValidator.OPTIONAL_PARAMETER_INVALID, "Identifier cannot refer to an optional parameter");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterReferenceInvalidInRange() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator car { parameter radio values (\'Disco\', \'Funk\', \'Classic\') optional\n\t\tparameter antenna values (\'telescope\', \'standard\') visible-if radio in (\'Disco\', \'Funk\') }");
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.IN_RANGE, ConfiguratorValidator.OPTIONAL_PARAMETER_INVALID, "Identifier cannot refer to an optional parameter");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterNamesUnique() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator myconfigurator { parameter foo values [3; 5] parameter foobar values (3, 4) }");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterNamesNotUnique() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator myconfigurator { parameter foo values [3; 5] parameter foobar values (3, 4) parameter foo values (5,6) }");
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.NAMED_ELEMENT, ConfiguratorValidator.PARAMETER_NAME_NOT_UNIQUE, "All parameters and parameter groups must have globally unique names");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterNameInvalid() {
    try {
      String _addPrefix = this.addPrefix("{ parameter 3foo values [3, 4] }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.CONFIGURATOR, Diagnostic.SYNTAX_DIAGNOSTIC, "mismatched input");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
