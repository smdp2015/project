package dk.itu.smdp2015.church.configurator.syntax.tests;

import dk.itu.smdp2015.church.ConfiguratorInjectorProvider;
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ConfiguratorInjectorProvider.class)
@SuppressWarnings("all")
public class TestJqmHtmlGenerator {
  @Inject
  @Extension
  private ParseHelper<Configurator> _parseHelper;
  
  @Inject
  @Extension
  private JqmHtmlGenerator _jqmHtmlGenerator;
  
  @BeforeClass
  public static void beforeClass() {
    ConfiguratorPackage.eINSTANCE.eClass();
  }
  
  public void testGroupLink_RendersAsListItem() {
    try {
      Configurator _parse = this._parseHelper.parse("configuration test {group test{}}}");
      final Procedure1<Configurator> _function = new Procedure1<Configurator>() {
        public void apply(final Configurator it) {
          EList<AbstractParameter> _parameters = it.getParameters();
          AbstractParameter _get = _parameters.get(0);
          String _compileParameterLink = TestJqmHtmlGenerator.this._jqmHtmlGenerator.compileParameterLink(_get);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<li>");
          _builder.newLine();
          _builder.append("                ");
          _builder.append("<a href=\"#test\">");
          _builder.newLine();
          _builder.append("                \t");
          _builder.append("test");
          _builder.newLine();
          _builder.append("                    ");
          _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: group_test\"></p>");
          _builder.newLine();
          _builder.append("                ");
          _builder.append("</a>");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("</li>");
          _builder.newLine();
          TestJqmHtmlGenerator.this.assertHtml(_compileParameterLink, _builder.toString());
        }
      };
      ObjectExtensions.<Configurator>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertHtml(final String actual, final String expected) {
    String _debuggableWhitespace = this.debuggableWhitespace(expected);
    String _debuggableWhitespace_1 = this.debuggableWhitespace(actual);
    Assert.assertEquals(_debuggableWhitespace, _debuggableWhitespace_1);
  }
  
  public String debuggableWhitespace(final String it) {
    return it.replace(" ", "+");
  }
}
