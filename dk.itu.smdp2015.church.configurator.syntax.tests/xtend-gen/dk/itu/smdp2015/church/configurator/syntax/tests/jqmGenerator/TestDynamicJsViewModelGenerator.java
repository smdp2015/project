package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator;

import dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator.BaseTestJqmGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmViewModelGenerator;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class TestDynamicJsViewModelGenerator extends BaseTestJqmGenerator {
  @Inject
  @Extension
  private JqmViewModelGenerator _jqmViewModelGenerator;
  
  @Test
  public void testRenderParam_WhenParameterIsNonOptionalChoice_ThenParameterObjectIsWrittenWithChoices() {
    try {
      String _addPrefix = this.addPrefix("{parameter testparam values (\"a\",\"b\")}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      String _renderParam = this._jqmViewModelGenerator.renderParam(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("testparam: {");
      _builder.newLine();
      _builder.append("\t    \t");
      _builder.append("choices: [\"a\",\"b\"],");
      _builder.newLine();
      _builder.append("\t    \t");
      _builder.append("value: ko.observable().extend({");
      _builder.newLine();
      _builder.append("\t    \t\t                ");
      _builder.append("required: {params: true, message: \"testparam is required\"}");
      _builder.newLine();
      _builder.append("\t    \t\t            ");
      _builder.append("})");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("}");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_renderParam, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderParam_WhenParameterIsNonOptionalValueRange_ThenParameterObjectIsWrittenWithBoundedRange() {
    try {
      String _addPrefix = this.addPrefix("{parameter testparam values [1;10]}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      String _renderParam = this._jqmViewModelGenerator.renderParam(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("testparam: {");
      _builder.newLine();
      _builder.append("\t    \t");
      _builder.append("boundedRange:{");
      _builder.newLine();
      _builder.append("\t    \t\t            ");
      _builder.append("lower: 1,");
      _builder.newLine();
      _builder.append("\t    \t\t            ");
      _builder.append("upper: 10");
      _builder.newLine();
      _builder.append("\t    \t\t        ");
      _builder.append("},");
      _builder.newLine();
      _builder.append("\t    \t");
      _builder.append("value: ko.observable().extend({");
      _builder.newLine();
      _builder.append("\t    \t\t                ");
      _builder.append("required: {params: true, message: \"testparam is required\"}");
      _builder.newLine();
      _builder.append("\t    \t\t            ");
      _builder.append("})");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("}");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_renderParam, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderParam_WhenParameterIsOptional_ThenValueRange_Thenasdf() {
    try {
      String _addPrefix = this.addPrefix("{parameter testparam mandatory values [1;10]}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Parameter _firstParam = this.firstParam(_parse);
      String _renderParam = this._jqmViewModelGenerator.renderParam(_firstParam);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("testparam: {");
      _builder.newLine();
      _builder.append("\t    \t");
      _builder.append("boundedRange:{");
      _builder.newLine();
      _builder.append("\t    \t\t            ");
      _builder.append("lower: 1,");
      _builder.newLine();
      _builder.append("\t    \t\t            ");
      _builder.append("upper: 10");
      _builder.newLine();
      _builder.append("\t    \t\t        ");
      _builder.append("},");
      _builder.newLine();
      _builder.append("\t    \t");
      _builder.append("value: ko.observable().extend({");
      _builder.newLine();
      _builder.append("\t    \t\t                ");
      _builder.append("required: {params: true, message: \"testparam is required\"}");
      _builder.newLine();
      _builder.append("\t    \t\t            ");
      _builder.append("})");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("}");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_renderParam, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
