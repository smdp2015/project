package dk.itu.smdp2015.church.configurator.syntax.tests;

import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.ConfiguratorInjectorProvider;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ConfiguratorInjectorProvider.class)
@SuppressWarnings("all")
public abstract class BaseXtextTest {
  @Inject
  @Extension
  protected ParseHelper<Configurator> _parseHelper;
  
  @BeforeClass
  public static void globalSetup() {
    ConfiguratorPackage.eINSTANCE.eClass();
  }
  
  public String addPrefix(final String it) {
    return ("configuration testconfig " + it);
  }
  
  public ParameterGroup firstGroup(final Configurator it) {
    EList<AbstractParameter> _parameters = it.getParameters();
    Iterable<ParameterGroup> _filter = Iterables.<ParameterGroup>filter(_parameters, ParameterGroup.class);
    return ((ParameterGroup[])Conversions.unwrapArray(_filter, ParameterGroup.class))[0];
  }
  
  public Parameter firstParam(final Configurator it) {
    EList<AbstractParameter> _parameters = it.getParameters();
    Iterable<Parameter> _filter = Iterables.<Parameter>filter(_parameters, Parameter.class);
    return ((Parameter[])Conversions.unwrapArray(_filter, Parameter.class))[0];
  }
  
  public Enumerated firstEnumerated(final Configurator it) {
    EList<AbstractParameter> _parameters = it.getParameters();
    Iterable<Parameter> _filter = Iterables.<Parameter>filter(_parameters, Parameter.class);
    Parameter _get = ((Parameter[])Conversions.unwrapArray(_filter, Parameter.class))[0];
    ValueRange _valueRange = _get.getValueRange();
    return ((Enumerated) _valueRange);
  }
  
  protected void _assertCodeWithExpectedOutput(final CharSequence actual, final String expected) {
    String _string = actual.toString();
    this.assertCodeWithExpectedOutput(_string, expected);
  }
  
  protected void _assertCodeWithExpectedOutput(final String actual, final String expected) {
    String _debuggableWhitespace = this.debuggableWhitespace(expected);
    String _debuggableWhitespace_1 = this.debuggableWhitespace(actual);
    Assert.assertEquals(_debuggableWhitespace, _debuggableWhitespace_1);
  }
  
  public String debuggableWhitespace(final String it) {
    return it;
  }
  
  public void assertCodeWithExpectedOutput(final CharSequence actual, final String expected) {
    if (actual instanceof String) {
      _assertCodeWithExpectedOutput((String)actual, expected);
      return;
    } else if (actual != null) {
      _assertCodeWithExpectedOutput(actual, expected);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(actual, expected).toString());
    }
  }
}
