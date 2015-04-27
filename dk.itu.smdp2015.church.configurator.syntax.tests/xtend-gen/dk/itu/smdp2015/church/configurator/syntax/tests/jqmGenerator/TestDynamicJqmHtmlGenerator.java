package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator;

import dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator.BaseTestJqmGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestDynamicJqmHtmlGenerator extends BaseTestJqmGenerator {
  @Inject
  @Extension
  private JqmHtmlGenerator _jqmHtmlGenerator;
  
  @Test
  public void testConfigDescription_rendersAsMainSection() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator app \"main app description\"{}");
      String _renderAppDescription = this._jqmHtmlGenerator.renderAppDescription(_parse);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<section class=\"main-description\">");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("main app description");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("</section>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_renderAppDescription, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderBodyPart_rendersBodyElementAnd() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator app");
      CharSequence _renderBodyPart = this._jqmHtmlGenerator.renderBodyPart(_parse);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<body>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<div id=\"main\" data-role=\"page\">");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<div data-role=\"header\" data-add-back-btn=\"true\">");
      _builder.newLine();
      _builder.append("                    ");
      _builder.append("<h1>");
      _builder.newLine();
      _builder.append("                        ");
      _builder.append("app");
      _builder.newLine();
      _builder.append("                    ");
      _builder.append("</h1>");
      _builder.newLine();
      _builder.append("                    ");
      _builder.append("<button class=\"ui-btn-right ui-icon-check ui-btn-icon-right ui-btn\" onclick=\"submitconfiguration();\">submit</button>");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<div role=\"main\">");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("<section class=\"main-description\">");
      _builder.newLine();
      _builder.append("                       ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("<section class=\"validationSection\" data-bind=\"css:{showValidationSummary: !$root.isModelValid()}\">");
      _builder.newLine();
      _builder.append("                           ");
      _builder.append("<div class=\"validationSummary\">");
      _builder.newLine();
      _builder.append("                               ");
      _builder.append("<h4>Validation summary</h4>");
      _builder.newLine();
      _builder.append("                               ");
      _builder.append("<ul data-bind=\"foreach: $root.currentErrors\">");
      _builder.newLine();
      _builder.append("                                   ");
      _builder.append("<li><span data-bind=\"text: $data\"> </span> </li>");
      _builder.newLine();
      _builder.append("                               ");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("                           ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("                       ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("<ul data-role=\"listview\">");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</body>");
      this.assertHtmlWithExpectedOutput(_renderBodyPart, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderGroupPage_rendersPageDiv() {
    try {
      String _addPrefix = this.addPrefix("{group test{ parameter someParam values (0,1,2)}}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      ParameterGroup _firstGroup = this.firstGroup(_parse);
      String _renderGroupPage = this._jqmHtmlGenerator.renderGroupPage(_firstGroup);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("<div id=\"test\" data-role=\"page\" data-bind=\"with: $root.group_test\">");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<div data-role=\"header\" data-add-back-btn=\"true\">");
      _builder.newLine();
      _builder.append("\t\t\t            ");
      _builder.append("<h1>");
      _builder.newLine();
      _builder.append("\t\t\t                ");
      _builder.append("test");
      _builder.newLine();
      _builder.append("\t\t\t            ");
      _builder.append("</h1>");
      _builder.newLine();
      _builder.append("\t\t\t            ");
      _builder.append("<button class=\"ui-btn-right ui-icon-check ui-btn-icon-right ui-btn\" onclick=\"submitconfiguration();\">submit</button>");
      _builder.newLine();
      _builder.append("\t\t\t        ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("<div role=\"main\">");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("<section class=\"validationSection\" data-bind=\"css:{showValidationSummary: !$root.isModelValid()}\">");
      _builder.newLine();
      _builder.append("\t                            ");
      _builder.append("<div class=\"validationSummary\">");
      _builder.newLine();
      _builder.append("\t                                ");
      _builder.append("<h4>Validation summary</h4>");
      _builder.newLine();
      _builder.append("\t                                ");
      _builder.append("<ul data-bind=\"foreach: $root.currentErrors\">");
      _builder.newLine();
      _builder.append("\t                                    ");
      _builder.append("<li><span data-bind=\"text: $data\"> </span> </li>");
      _builder.newLine();
      _builder.append("\t                                ");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("\t                            ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t                        ");
      _builder.append("</section>");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("<ul data-role=\"listview\">");
      _builder.newLine();
      _builder.append("<li>");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("<label for=\"someParam-param\" >someParam:</label>");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("<select id=\"someParam-param\" data-bind=\"options: someParam.choices, selectedOptions: someParam.value,optionsCaption:\'Choose...\'\"></select>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: someParam.value\"></p>");
      _builder.newLine();
      _builder.append("\t       ");
      _builder.append("</li>");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</div>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_renderGroupPage, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderHeader_rendersGroupHeaderAsJqmHeader() {
    try {
      String _addPrefix = this.addPrefix("{group test{}}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      ParameterGroup _firstGroup = this.firstGroup(_parse);
      CharSequence _renderHeader = this._jqmHtmlGenerator.renderHeader(_firstGroup);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div data-role=\"header\" data-add-back-btn=\"true\">");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<h1>");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("test");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("</h1>");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<button class=\"ui-btn-right ui-icon-check ui-btn-icon-right ui-btn\" onclick=\"submitconfiguration();\">submit</button>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("</div>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_renderHeader, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderLocalValidatonMessage_WhenParameter_ThenRendersAsStandardDataboundValueName() {
    try {
      String _addPrefix = this.addPrefix("{parameter test{}}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      CharSequence _renderLocalValidatonMessage = this._jqmHtmlGenerator.renderLocalValidatonMessage(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: test.value\"></p>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_renderLocalValidatonMessage, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderLocalValidatonMessage_WhenParameterGroup_ThenRendersWithDataboundGroupName() {
    try {
      String _addPrefix = this.addPrefix("{group test{}}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      ParameterGroup _firstGroup = this.firstGroup(_parse);
      CharSequence _renderLocalValidatonMessage = this._jqmHtmlGenerator.renderLocalValidatonMessage(_firstGroup);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: group_test\"></p>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_renderLocalValidatonMessage, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileParameterLink_WhenGroup_ThenRendersAsListItem() {
    try {
      String _addPrefix = this.addPrefix("{group test{}}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      ParameterGroup _firstGroup = this.firstGroup(_parse);
      String _compileParameterLink = this._jqmHtmlGenerator.compileParameterLink(_firstGroup);
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
      this.assertHtmlWithExpectedOutput(_compileParameterLink, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterLink_RendersAsListItem() {
    try {
      String _addPrefix = this.addPrefix("{parameter test values (0;10)}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      String _compileParameterLink = this._jqmHtmlGenerator.compileParameterLink(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<li>");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("<label for=\"test-param\" >test:</label>");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("<select id=\"test-param\" data-bind=\"options: test.choices, selectedOptions: test.value,optionsCaption:\'Choose...\'\"></select>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: test.value\"></p>");
      _builder.newLine();
      _builder.append("\t       ");
      _builder.append("</li>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_compileParameterLink, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileParameterLink_WhenEnumeratedRange_ThenRendersAsSelectInput() {
    try {
      String _addPrefix = this.addPrefix("{parameter test values (0;10)}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      String _compileParameterLink = this._jqmHtmlGenerator.compileParameterLink(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<li>");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("<label for=\"test-param\" >test:</label>");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("<select id=\"test-param\" data-bind=\"options: test.choices, selectedOptions: test.value,optionsCaption:\'Choose...\'\"></select>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: test.value\"></p>");
      _builder.newLine();
      _builder.append("\t       ");
      _builder.append("</li>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_compileParameterLink, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileParameterLink_WhenBoundedRange_ThenRendersAsSelectInputWithRange() {
    try {
      String _addPrefix = this.addPrefix("{parameter test values (0;10)}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      String _compileParameterLink = this._jqmHtmlGenerator.compileParameterLink(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<li>");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("<label for=\"test-param\" >test:</label>");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("<select id=\"test-param\" data-bind=\"options: test.choices, selectedOptions: test.value,optionsCaption:\'Choose...\'\"></select>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: test.value\"></p>");
      _builder.newLine();
      _builder.append("\t       ");
      _builder.append("</li>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_compileParameterLink, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileParameterLink_WhenOptionalParameter_ThenListItemIsCollapsible() {
    try {
      String _addPrefix = this.addPrefix("{parameter test optional values (0;10)}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      String _compileParameterLink = this._jqmHtmlGenerator.compileParameterLink(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<li data-role=\"collapsible\" data-bind=\"isExpanded: test.isOn\">");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("<h2><label for=\"test-param\" >test:</label></h2>");
      _builder.newLine();
      _builder.append("\t            ");
      _builder.append("<select id=\"test-param\" data-bind=\"options: test.choices, selectedOptions: test.value,optionsCaption:\'Choose...\'\"></select>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: test.value\"></p>");
      _builder.newLine();
      _builder.append("\t       ");
      _builder.append("</li>");
      _builder.newLine();
      this.assertHtmlWithExpectedOutput(_compileParameterLink, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderRangeInputElement_WhenBoundedRange_ThenRendersInputWithRange() {
    try {
      String _addPrefix = this.addPrefix("{parameter test values [0;100]}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      final Procedure1<Configurator> _function = new Procedure1<Configurator>() {
        public void apply(final Configurator it) {
          Parameter _firstParam = TestDynamicJqmHtmlGenerator.this.firstParam(it);
          ValueRange _valueRange = _firstParam.getValueRange();
          Parameter _firstParam_1 = TestDynamicJqmHtmlGenerator.this.firstParam(it);
          CharSequence _renderRangeInputElement = TestDynamicJqmHtmlGenerator.this._jqmHtmlGenerator.renderRangeInputElement(((Bounded) _valueRange), _firstParam_1);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<input data-bind=\"value: test.value, attr:{ min: test.boundedRange.lower, max: test.boundedRange.upper}\" type=\"range\" name=\"test\" id=\"test-param\">");
          _builder.newLine();
          TestDynamicJqmHtmlGenerator.this.assertHtmlWithExpectedOutput(_renderRangeInputElement, _builder.toString());
        }
      };
      ObjectExtensions.<Configurator>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderBooleanInputElement_RendersAsBooleanInputElement() {
    try {
      String _addPrefix = this.addPrefix("{parameter test values (true,false)}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      final Procedure1<Configurator> _function = new Procedure1<Configurator>() {
        public void apply(final Configurator it) {
          Parameter _firstParam = TestDynamicJqmHtmlGenerator.this.firstParam(it);
          ValueRange _valueRange = _firstParam.getValueRange();
          Parameter _firstParam_1 = TestDynamicJqmHtmlGenerator.this.firstParam(it);
          CharSequence _renderBooleanInputElement = TestDynamicJqmHtmlGenerator.this._jqmHtmlGenerator.renderBooleanInputElement(((Enumerated) _valueRange), _firstParam_1);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<label data-bind=\"text: test.value()?\'on\':\'off\'\"> <input type=\"checkbox\" id=\"test-param\" data-bind=\"checked:test.value\"> </label>");
          _builder.newLine();
          TestDynamicJqmHtmlGenerator.this.assertHtmlWithExpectedOutput(_renderBooleanInputElement, _builder.toString());
        }
      };
      ObjectExtensions.<Configurator>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
