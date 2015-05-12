package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator;

import dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator.BaseTestJqmGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmKoPageBindingGenerator;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class TestPageBindingGenerator extends BaseTestJqmGenerator {
  @Inject
  @Extension
  private JqmKoPageBindingGenerator _jqmKoPageBindingGenerator;
  
  @Test
  public void testCompile_WhenFourGroups() {
    try {
      Configurator _parse = this._parseHelper.parse("configuration carconfig { \n\t\t\tgroup group1 { }, \ngroup group2 { },\ngroup group3 { },\ngroup group4 { }, }");
      CharSequence _compile = this._jqmKoPageBindingGenerator.compile(_parse);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$(document).ready(function(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$(\"#main\").on(\'pagecreate\', function (event, ui) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("ko.applyBindings(App.ViewModel, this );");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("});");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$(\"#group1\").on(\'pagecreate\', function (event, ui) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("ko.applyBindings(App.ViewModel, this );");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("});");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$(\"#group2\").on(\'pagecreate\', function (event, ui) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("ko.applyBindings(App.ViewModel, this );");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("});");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$(\"#group3\").on(\'pagecreate\', function (event, ui) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("ko.applyBindings(App.ViewModel, this );");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("});");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$(\"#group4\").on(\'pagecreate\', function (event, ui) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("ko.applyBindings(App.ViewModel, this );");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("});");
      _builder.newLine();
      _builder.append("});");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_compile, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
