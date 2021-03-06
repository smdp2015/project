/**
 * generated by Xtext
 */
package dk.itu.smdp2015.church.generator;

import com.google.common.collect.Sets;
import dk.itu.smdp2015.church.generator.CSGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmGenerator;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class ConfiguratorGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CSGenerator _cSGenerator = new CSGenerator();
    JqmGenerator _jqmGenerator = new JqmGenerator();
    Set<? extends IGenerator> generators = Collections.<IGenerator>unmodifiableSet(Sets.<IGenerator>newHashSet(_cSGenerator, _jqmGenerator));
    final Consumer<IGenerator> _function = new Consumer<IGenerator>() {
      public void accept(final IGenerator it) {
        try {
          it.doGenerate(resource, fsa);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception ex = (Exception)_t;
            Class<? extends IGenerator> _class = it.getClass();
            String _name = _class.getName();
            String _message = ex.getMessage();
            String _format = String.format("Error generating code with %S: %S", _name, _message);
            System.out.println(_format);
            ex.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    };
    generators.forEach(_function);
  }
}
