package dk.itu.smdp2015.church.configurator.syntax.tests.validation;

import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.validation.ConfiguratorValidator;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class TestConstraints extends BaseXtextTest {
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSomething() {
    try {
      String _addPrefix = this.addPrefix("{ parameter wheel_size values [24;16] }");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      this._validationTestHelper.assertError(_parse, ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be less than upper bound");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidEnumWrongElement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("configurator Car { parameter Variant values (\"Standard\", \"Sport\", Luxury) }");
      Configurator model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ConfiguratorPackage.Literals.ENUMERATED, ConfiguratorValidator.INVALID_ENUMERATION, "Enumerated item should be a constant");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidBoundedRangeWrongTypes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("configurator Bicycle { parameter wheel_size values [b;16] }");
      Configurator model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.WRONG_TYPE, "expected the same type");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidBoundedRangeReverse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("configurator Bicycle { parameter wheel_size values [24;16] }");
      Configurator model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ConfiguratorPackage.Literals.BOUNDED, ConfiguratorValidator.INVALID_BOUND, "Lower bound should be less than upper bound");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
