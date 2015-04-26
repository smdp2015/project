package dk.itu.smdp2015.church.generator.jqm;

import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.generator.jqm.GroupNameStack;
import dk.itu.smdp2015.church.generator.jqm.IJqmPartGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmCommon;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider;
import javax.inject.Inject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JqmViewModelGenerator implements IJqmPartGenerator {
  private String currentPath = "";
  
  private final GroupNameStack _groupNameStack = new GroupNameStack();
  
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Inject
  @Extension
  private JqmCommon _jqmCommon;
  
  public JqmViewModelGenerator(final ExpressionTypeProvider extTypeProvider, final JqmCommon common) {
    this._expressionTypeProvider = extTypeProvider;
    this._jqmCommon = common;
  }
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa, final String rootFolder) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Configurator> _filter = Iterables.<Configurator>filter(_iterable, Configurator.class);
    for (final Configurator e : _filter) {
      {
        CharSequence generated = this.compile(e);
        fsa.generateFile((rootFolder + "/main.html"), generated);
      }
    }
  }
  
  public CharSequence compile(final Configurator it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
}
