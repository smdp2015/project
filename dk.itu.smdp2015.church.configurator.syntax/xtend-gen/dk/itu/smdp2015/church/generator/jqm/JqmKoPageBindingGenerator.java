package dk.itu.smdp2015.church.generator.jqm;

import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.generator.jqm.IJqmPartGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmCommon;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JqmKoPageBindingGenerator implements IJqmPartGenerator {
  private String _rootFolder;
  
  @Inject
  @Extension
  private JqmCommon _jqmCommon;
  
  public JqmKoPageBindingGenerator() {
  }
  
  public JqmKoPageBindingGenerator(final JqmCommon common, final String rootFolder) {
    this._jqmCommon = common;
    this._rootFolder = rootFolder;
  }
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Configurator> _filter = Iterables.<Configurator>filter(_iterable, Configurator.class);
    for (final Configurator e : _filter) {
      {
        CharSequence generated = this.compile(e);
        String _resourceFileName = this._jqmCommon.getResourceFileName(input);
        String _plus = ((this._rootFolder + "/") + _resourceFileName);
        String _plus_1 = (_plus + "-ko-initpagebinding.js");
        fsa.generateFile(_plus_1, generated);
      }
    }
  }
  
  public CharSequence compile(final Configurator it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$(document).ready(function(){");
    _builder.newLine();
    _builder.append("\t");
    String _renderPageBindingStatement = this.renderPageBindingStatement("main");
    _builder.append(_renderPageBindingStatement, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<AbstractParameter> _parameters = it.getParameters();
    String _renderNestedGroups = this.renderNestedGroups(_parameters, "");
    _builder.append(_renderNestedGroups, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public String renderPageBindingStatement(final String pageId) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$(\"#");
    _builder.append(pageId, "");
    _builder.append("\").on(\'pagecreate\', function (event, ui) {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ko.applyBindings(App.ViewModel, this );");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String renderNestedGroups(final Iterable<AbstractParameter> it, final String result) {
    Iterable<ParameterGroup> _filter = Iterables.<ParameterGroup>filter(it, ParameterGroup.class);
    return this.renderBindingForGroups(_filter, result);
  }
  
  public String renderBindingForGroups(final Iterable<ParameterGroup> it, final String result) {
    final Function2<String, ParameterGroup, String> _function = new Function2<String, ParameterGroup, String>() {
      public String apply(final String prev, final ParameterGroup it) {
        Object _renderBindingForGroups = JqmKoPageBindingGenerator.this.renderBindingForGroups(it);
        return (prev + _renderBindingForGroups);
      }
    };
    return IterableExtensions.<ParameterGroup, String>fold(it, result, _function);
  }
  
  public Object renderBindingForGroups(final ParameterGroup group) {
    EList<AbstractParameter> _parameters = group.getParameters();
    String _name = group.getName();
    String _renderPageBindingStatement = this.renderPageBindingStatement(_name);
    return this.renderNestedGroups(_parameters, _renderPageBindingStatement);
  }
}
