package dk.itu.smdp2015.church.generator.jqm;

import com.google.common.collect.Sets;
import dk.itu.smdp2015.church.generator.jqm.IJqmPartGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmCommon;
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmKoPageBindingGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmViewModelGenerator;
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class JqmGenerator implements IGenerator {
  private String rootFolder = "JQM config";
  
  private String scriptFolder = (this.rootFolder + "/Scripts/Src-gen");
  
  private IJqmPartGenerator[] _gens = ((IJqmPartGenerator[])Conversions.unwrapArray(Collections.<IJqmPartGenerator>unmodifiableSet(Sets.<IJqmPartGenerator>newHashSet(new JqmHtmlGenerator(new ExpressionTypeProvider(), new JqmCommon(), this.rootFolder), new JqmViewModelGenerator(new ExpressionTypeProvider(), new JqmCommon(), this.scriptFolder), new JqmKoPageBindingGenerator(new JqmCommon(), this.scriptFolder))), IJqmPartGenerator.class));
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    final Consumer<IJqmPartGenerator> _function = new Consumer<IJqmPartGenerator>() {
      public void accept(final IJqmPartGenerator it) {
        try {
          it.doGenerate(input, fsa);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception ex = (Exception)_t;
            Class<? extends IJqmPartGenerator> _class = it.getClass();
            String _name = _class.getName();
            String _message = ex.getMessage();
            String _format = String.format("Error generating JQM code with %S: \n %S \n", _name, _message);
            System.out.println(_format);
            ex.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    };
    ((List<IJqmPartGenerator>)Conversions.doWrapArray(this._gens)).forEach(_function);
  }
}
