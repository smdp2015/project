package dk.itu.smdp2015.church.configurator.syntax.tests.csGenerator;

import dk.itu.smdp2015.church.configurator.syntax.tests.BaseXtextTest;
import dk.itu.smdp2015.church.generator.CSGenerator;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCsGenerator extends BaseXtextTest {
  @Inject
  @Extension
  private CSGenerator _cSGenerator;
  
  @Test
  public void testSomeCsGeneratorMethod() {
    try {
      String _addPrefix = this.addPrefix("{group test{ parameter someParam values (0,1,2)}}");
      Configurator _parse = this._parseHelper.parse(_addPrefix);
      ParameterGroup _firstGroup = this.firstGroup(_parse);
      CharSequence _compileParameterGroupBuilder = this._cSGenerator.compileParameterGroupBuilder(_firstGroup);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("put expected output here.......");
      _builder.newLine();
      this.assertCodeWithExpectedOutput(_compileParameterGroupBuilder, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
