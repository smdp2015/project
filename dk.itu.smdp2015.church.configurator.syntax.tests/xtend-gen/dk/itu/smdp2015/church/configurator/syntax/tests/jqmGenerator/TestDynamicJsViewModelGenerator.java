package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator;

import dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator.BaseTestJqmGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmViewModelGenerator;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
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
      String _addPrefix = this.addPrefix("{parameter testparam optional values [1;10]}");
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
      _builder.append("isOn: ko.observable(false),");
      _builder.newLine();
      _builder.append("\t    \t");
      _builder.append("value: ko.observable()");
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
  public void testRenderParam_WhenParameterGroup() {
    try {
      String _addPrefix = this.addPrefix("{group testgroup optional values [1;10]}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      ParameterGroup _firstGroup = this.firstGroup(_parse);
      String _renderParam = this._jqmViewModelGenerator.renderParam(_firstGroup);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("group_testgroup: ko.observable({");
      _builder.newLine();
      _builder.append("})");
      this.assertCodeWithExpectedOutput(_renderParam, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderParam_WhenParameterGroupWithVisibilityExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{group testgroup visible-if variant != \"standard\" {parameter variant values(\"standard\",\"luxus\")}}");
      String _string = _builder.toString();
      String _addPrefix = this.addPrefix(_string);
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      ParameterGroup _firstGroup = this.firstGroup(_parse);
      String _renderParam = this._jqmViewModelGenerator.renderParam(_firstGroup);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("group_testgroup: ko.observable({");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("isVisible: ko.deferredPureComputed(function(){");
      _builder_1.newLine();
      _builder_1.append("           \t");
      _builder_1.append("return (App.ViewModel().group_testgroup().variant.value()==null? \'\' : App.ViewModel().group_testgroup().variant.value()[0] != \"standard\")");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("}),");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("variant: {");
      _builder_1.newLine();
      _builder_1.append("\t\t    \t");
      _builder_1.append("choices: [\"standard\",\"luxus\"],");
      _builder_1.newLine();
      _builder_1.append("\t\t    \t");
      _builder_1.append("value: ko.observable().extend({");
      _builder_1.newLine();
      _builder_1.append("\t\t    \t\t                ");
      _builder_1.append("required: {params: true, message: \"variant is required\"}");
      _builder_1.newLine();
      _builder_1.append("\t\t    \t\t            ");
      _builder_1.append("})");
      _builder_1.newLine();
      _builder_1.append("\t\t    ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("})");
      this.assertCodeWithExpectedOutput(_renderParam, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_WhenBinaryEquals() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1==2}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      this.assertCodeWithExpectedOutput(_renderOperator, 
        " == ");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_WhenBinaryNotEqual() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1!=2}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      this.assertCodeWithExpectedOutput(_renderOperator, 
        " != ");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_WhenlogicalOr() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1==2 or 3==4}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("||");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_renderOperator, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_WhenlogicalAnd() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1==2 and 3==4}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("&&");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_renderOperator, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_WhenAddition() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1 + 2}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      this.assertCodeWithExpectedOutput(_renderOperator, 
        " + ");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_Whenmultiplication() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1 * 2}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      this.assertCodeWithExpectedOutput(_renderOperator, 
        " * ");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_WhenLessThan() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1 < 2}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      this.assertCodeWithExpectedOutput(_renderOperator, 
        " < ");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRenderOperator_WhenGreaterThan() {
    try {
      String _addPrefix = this.addPrefix("{parameter test visible-if 1 > 2}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      BinaryOperator _firstBinaryOperator = this.firstBinaryOperator(_parse);
      CharSequence _renderOperator = this._jqmViewModelGenerator.renderOperator(_firstBinaryOperator);
      this.assertCodeWithExpectedOutput(_renderOperator, 
        " > ");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testComplexExpression_ThenItIsRenderedCorrectly() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{parameter test visible-if p2 == p1 or p1 == p3 or p4 == p1 or p2<p3 and test != \"somestring\" ,");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("parameter p1 ,");
      _builder.newLine();
      _builder.append("parameter p2 values (1,2,3),");
      _builder.newLine();
      _builder.append("parameter p3,");
      _builder.newLine();
      _builder.append("parameter p4 },");
      _builder.newLine();
      String u = _builder.toString();
      String _addPrefix = this.addPrefix(u);
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      Expression _firstVisibilityExpression = this.firstVisibilityExpression(_parse);
      Object _renderExpression = this._jqmViewModelGenerator.renderExpression(_firstVisibilityExpression);
      String _string = _renderExpression.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("((((App.ViewModel().p2.value()==null? \'\' : App.ViewModel().p2.value()[0] == App.ViewModel().p1.value())||");
      _builder_1.newLine();
      _builder_1.append("(App.ViewModel().p1.value() == App.ViewModel().p3.value()))||");
      _builder_1.newLine();
      _builder_1.append("(App.ViewModel().p4.value() == App.ViewModel().p1.value()))||");
      _builder_1.newLine();
      _builder_1.append("((App.ViewModel().p2.value()==null? \'\' : App.ViewModel().p2.value()[0] < App.ViewModel().p3.value())&&");
      _builder_1.newLine();
      _builder_1.append("(App.ViewModel().test.value() != \"somestring\")))");
      this.assertCodeWithExpectedOutput(_string, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
