package dk.itu.smdp2015.church.configurator.syntax.tests;

import dk.itu.smdp2015.church.ConfiguratorInjectorProvider;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import dk.itu.smdp2015.church.model.configurator.impl.StringImpl;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ConfiguratorInjectorProvider.class)
@SuppressWarnings("all")
public class ConfiguratorGrammarTest {
  @Inject
  @Extension
  private ParseHelper<Configurator> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Before
  public void before() {
    ConfiguratorPackage.eINSTANCE.eClass();
  }
  
  @Test
  public void testInvalidModelNoParameters() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("configurator Empty");
      Configurator model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ConfiguratorPackage.Literals.CONFIGURATOR, Diagnostic.SYNTAX_DIAGNOSTIC, "mismatched input");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidEnum() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("configurator Car { parameter Variant values (\"Standard\", \"Sport\", \"Luxury\") }");
      Configurator model = this._parseHelper.parse(_builder);
      String _description = model.getDescription();
      Assert.assertNull(_description);
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
}
