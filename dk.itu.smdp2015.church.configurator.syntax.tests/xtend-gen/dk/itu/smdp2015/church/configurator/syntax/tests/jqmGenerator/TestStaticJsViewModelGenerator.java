package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator;

import dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator.BaseTestJqmGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmViewModelGenerator;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class TestStaticJsViewModelGenerator extends BaseTestJqmGenerator {
  @Inject
  @Extension
  private JqmViewModelGenerator _jqmViewModelGenerator;
  
  @Test
  public void testRenderRootJsViewModelCode() {
    try {
      Configurator _parse = this._parseHelper.parse("configurator app");
      CharSequence _compile = this._jqmViewModelGenerator.compile(_parse);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var App = window.App = {};");
      _builder.newLine();
      _builder.newLine();
      _builder.append("App.ViewModel = ko.validatedObservable({");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("currentErrors:ko.observableArray([]),");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("isModelValid: ko.deferredPureComputed(function()");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("var isValid= App.ViewModel.isValid();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("App.ViewModel().currentErrors(App.ViewModel.errors());");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return isValid;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("},this),");
      _builder.newLine();
      _builder.newLine();
      _builder.append("});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Init special group validations, by resetting objects value");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_compile, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
