package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator;

import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.junit.Assert;

@SuppressWarnings("all")
public abstract class BaseTestJqmGenerator extends BaseXtextTest {
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
  
  protected void _assertHtmlWithExpectedOutput(final CharSequence actual, final String expected) {
    String _string = actual.toString();
    this.assertHtmlWithExpectedOutput(_string, expected);
  }
  
  protected void _assertHtmlWithExpectedOutput(final String actual, final String expected) {
    String _debuggableWhitespace = this.debuggableWhitespace(expected);
    String _debuggableWhitespace_1 = this.debuggableWhitespace(actual);
    Assert.assertEquals(_debuggableWhitespace, _debuggableWhitespace_1);
  }
  
  public String debuggableWhitespace(final String it) {
    return it;
  }
  
  public void assertHtmlWithExpectedOutput(final CharSequence actual, final String expected) {
    if (actual instanceof String) {
      _assertHtmlWithExpectedOutput((String)actual, expected);
      return;
    } else if (actual != null) {
      _assertHtmlWithExpectedOutput(actual, expected);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(actual, expected).toString());
    }
  }
}
