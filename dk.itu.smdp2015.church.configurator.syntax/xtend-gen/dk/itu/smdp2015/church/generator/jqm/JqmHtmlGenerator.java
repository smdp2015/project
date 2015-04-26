package dk.itu.smdp2015.church.generator.jqm;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.generator.jqm.IJqmPartGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmCommon;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import dk.itu.smdp2015.church.xtext.common.ExpressionType;
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JqmHtmlGenerator implements IJqmPartGenerator {
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Inject
  @Extension
  private JqmCommon _jqmCommon;
  
  private String _rootFolder;
  
  private Resource _input;
  
  public JqmHtmlGenerator(final ExpressionTypeProvider extTypeProvider, final JqmCommon common, final String rootFolder) {
    this._rootFolder = rootFolder;
    this._expressionTypeProvider = extTypeProvider;
    this._jqmCommon = common;
  }
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this._input = input;
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Configurator> _filter = Iterables.<Configurator>filter(_iterable, Configurator.class);
    for (final Configurator e : _filter) {
      {
        CharSequence generated = this.compile(e);
        URI _uRI = input.getURI();
        String _lastSegment = _uRI.lastSegment();
        String _replace = _lastSegment.replace(".conf", ".html");
        String _plus = ((this._rootFolder + "/") + _replace);
        fsa.generateFile(_plus, generated);
      }
    }
  }
  
  public CharSequence compile(final Configurator it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>car</title>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" href=\"Content/Lib/jquery.mobile-1.4.5.min.css\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" href=\"Content/style.css\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/jquery-1.11.1.min.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/knockout-3.3.0.debug.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/knockout.mapping-latest.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/knockout.validation.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/submit-configuration.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/ko-init.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/ko-initcustomhandlers.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Src-gen/");
    String _resourceFileName = this._jqmCommon.getResourceFileName(this._input);
    _builder.append(_resourceFileName, "    ");
    _builder.append("-app-viewmodel.js\"></script>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Src-gen/");
    String _resourceFileName_1 = this._jqmCommon.getResourceFileName(this._input);
    _builder.append(_resourceFileName_1, "    ");
    _builder.append("-ko-initpagebinding.js\"></script>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/jqm-init.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/jquery.mobile-1.4.5.min.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div id=\"main\" data-role=\"page\">");
    _builder.newLine();
    _builder.append("        ");
    String _name = it.getName();
    CharSequence _renderHeader = this.renderHeader(_name);
    _builder.append(_renderHeader, "        ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div role=\"main\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<section class=\"main-description\">");
    _builder.newLine();
    _builder.append("                ");
    String _description = it.getDescription();
    _builder.append(_description, "                ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("</section>");
    _builder.newLine();
    _builder.append("            ");
    CharSequence _renderValidatonSummary = this.renderValidatonSummary();
    _builder.append(_renderValidatonSummary, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("<ul data-role=\"listview\">");
    _builder.newLine();
    {
      EList<AbstractParameter> _parameters = it.getParameters();
      for(final AbstractParameter it_1 : _parameters) {
        _builder.append("\t            ");
        CharSequence _compileParameterLink = this.compileParameterLink(it_1);
        _builder.append(_compileParameterLink, "\t            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    EList<AbstractParameter> _parameters_1 = it.getParameters();
    String _renderGroupPages = this.renderGroupPages(_parameters_1, "");
    _builder.append(_renderGroupPages, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderHeader(final String title) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div data-role=\"header\" data-add-back-btn=\"true\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<h1>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(title, "                ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("</h1>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<button class=\"ui-btn-right ui-icon-check ui-btn-icon-right ui-btn\" onclick=\"submitconfiguration();\">submit</button>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public String renderGroupPages(final Iterable<AbstractParameter> it, final String result) {
    Iterable<ParameterGroup> _filter = Iterables.<ParameterGroup>filter(it, ParameterGroup.class);
    final Function2<String, ParameterGroup, String> _function = new Function2<String, ParameterGroup, String>() {
      public String apply(final String more, final ParameterGroup it) {
        String _renderGroupPage = JqmHtmlGenerator.this.renderGroupPage(it);
        return (more + _renderGroupPage);
      }
    };
    return IterableExtensions.<ParameterGroup, String>fold(_filter, result, _function);
  }
  
  public String renderGroupPage(final ParameterGroup it) {
    String _xblockexpression = null;
    {
      EList<AbstractParameter> _parameters = it.getParameters();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div id=\"");
      String _name = it.getName();
      _builder.append(_name, "");
      _builder.append("\" data-role=\"page\" data-bind=\"with: $root.");
      String _fullPath = this._jqmCommon.getFullPath(it);
      _builder.append(_fullPath, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _elvis = null;
      String _description = it.getDescription();
      if (_description != null) {
        _elvis = _description;
      } else {
        String _name_1 = it.getName();
        _elvis = _name_1;
      }
      CharSequence _renderHeader = this.renderHeader(_elvis);
      _builder.append(_renderHeader, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t        ");
      _builder.append("<div role=\"main\">");
      _builder.newLine();
      _builder.append("\t            ");
      CharSequence _renderValidatonSummary = this.renderValidatonSummary();
      _builder.append(_renderValidatonSummary, "\t            ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t            ");
      _builder.append("<ul data-role=\"listview\" >");
      _builder.newLine();
      {
        EList<AbstractParameter> _parameters_1 = it.getParameters();
        for(final AbstractParameter it_1 : _parameters_1) {
          CharSequence _compileParameterLink = this.compileParameterLink(it_1);
          _builder.append(_compileParameterLink, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t            ");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("    \t");
      _builder.newLine();
      final String result = this.renderGroupPages(_parameters, _builder.toString());
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public CharSequence renderValidatonSummary() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<section class=\"validationSection\" data-bind=\"css:{showValidationSummary: !$root.isModelValid()}\">");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<div class=\"validationSummary\">");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<h4>Validation summary</h4>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<ul data-bind=\"foreach: $root.currentErrors\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<li><span data-bind=\"text: $data\"> </span> </li>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</section>");
    return _builder;
  }
  
  public CharSequence renderLocalValidatonMessage(final Parameter it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(".value\"></p>");
    return _builder;
  }
  
  public CharSequence renderLocalValidatonMessage(final ParameterGroup it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p class=\"validationMessage\" data-bind=\"validationMessage: ");
    String _groupName = this._jqmCommon.getGroupName(it);
    _builder.append(_groupName, "");
    _builder.append("\"></p>");
    return _builder;
  }
  
  protected CharSequence _compileParameterLink(final ParameterGroup it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li");
    {
      Expression _visibility = it.getVisibility();
      boolean _notEquals = (!Objects.equal(_visibility, null));
      if (_notEquals) {
        _builder.append(" data-bind=\"visible: ");
        String _groupName = this._jqmCommon.getGroupName(it);
        _builder.append(_groupName, "");
        _builder.append("().isVisible\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("<a href=\"#");
    String _name = it.getName();
    _builder.append(_name, "                ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("                \t");
    String _elvis = null;
    String _description = it.getDescription();
    if (_description != null) {
      _elvis = _description;
    } else {
      String _name_1 = it.getName();
      _elvis = _name_1;
    }
    _builder.append(_elvis, "                \t");
    _builder.newLineIfNotEmpty();
    _builder.append("                    ");
    CharSequence _renderLocalValidatonMessage = this.renderLocalValidatonMessage(it);
    _builder.append(_renderLocalValidatonMessage, "                    ");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("</a>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compileParameterLink(final Parameter it) {
    CharSequence _xblockexpression = null;
    {
      final boolean isCollapsible = it.isOptional();
      final String dataBindExprPrefix = " data-bind=\"";
      String dataBindExpr = dataBindExprPrefix;
      if (isCollapsible) {
        String _name = it.getName();
        String _plus = ((dataBindExprPrefix + "isExpanded: ") + _name);
        String _plus_1 = (_plus + ".isOn");
        dataBindExpr = _plus_1;
      }
      Expression _visibility = it.getVisibility();
      boolean _notEquals = (!Objects.equal(_visibility, null));
      if (_notEquals) {
        boolean _equals = Objects.equal(dataBindExpr, dataBindExprPrefix);
        if (_equals) {
          String _name_1 = it.getName();
          String _plus_2 = ((dataBindExprPrefix + "visible: ") + _name_1);
          String _plus_3 = (_plus_2 + ".isVisible");
          dataBindExpr = _plus_3;
        } else {
          String _name_2 = it.getName();
          String _plus_4 = (", visible: " + _name_2);
          String _plus_5 = (_plus_4 + ".isVisible");
          dataBindExpr = _plus_5;
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<li");
      {
        if (isCollapsible) {
          _builder.append(" data-role=\"collapsible\"");
        }
      }
      {
        boolean _notEquals_1 = (!Objects.equal(dataBindExpr, dataBindExprPrefix));
        if (_notEquals_1) {
          _builder.append(dataBindExpr, "");
          _builder.append("\"");
        }
      }
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t        ");
      {
        if (isCollapsible) {
          _builder.append("<h2>");
        }
      }
      _builder.append("<label for=\"");
      String _name_3 = it.getName();
      _builder.append(_name_3, "\t        ");
      _builder.append("-param\" >");
      String _elvis = null;
      String _description = it.getDescription();
      if (_description != null) {
        _elvis = _description;
      } else {
        String _name_4 = it.getName();
        _elvis = _name_4;
      }
      _builder.append(_elvis, "\t        ");
      _builder.append(":</label>");
      {
        if (isCollapsible) {
          _builder.append("</h2>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t            ");
      ValueRange _valueRange = it.getValueRange();
      CharSequence _renderRangeInputElement = this.renderRangeInputElement(_valueRange, it);
      _builder.append(_renderRangeInputElement, "\t            ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t        \t");
      CharSequence _renderLocalValidatonMessage = this.renderLocalValidatonMessage(it);
      _builder.append(_renderLocalValidatonMessage, "\t        \t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t       ");
      _builder.append("</li>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _renderRangeInputElement(final Enumerated it, final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ExpressionType _rangeType = this._expressionTypeProvider.rangeType(it);
      boolean _equals = Objects.equal(_rangeType, ExpressionType.Boolean);
      if (_equals) {
        _builder.newLineIfNotEmpty();
        CharSequence _renderBooleanInputElement = this.renderBooleanInputElement(it, param);
        _builder.append(_renderBooleanInputElement, "");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<select id=\"");
        String _name = param.getName();
        _builder.append(_name, "");
        _builder.append("-param\" data-bind=\"options: ");
        String _name_1 = param.getName();
        _builder.append(_name_1, "");
        _builder.append(".choices, selectedOptions: ");
        String _name_2 = param.getName();
        _builder.append(_name_2, "");
        _builder.append(".value,optionsCaption:\'Choose...\'\"></select>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _renderRangeInputElement(final Bounded it, final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<input data-bind=\"value: ");
    String _name = param.getName();
    _builder.append(_name, "");
    _builder.append(".value, attr:{ min: ");
    String _name_1 = param.getName();
    _builder.append(_name_1, "");
    _builder.append(".boundedRange.lower, max: ");
    String _name_2 = param.getName();
    _builder.append(_name_2, "");
    _builder.append(".boundedRange.upper}\" type=\"range\" name=\"");
    String _name_3 = param.getName();
    _builder.append(_name_3, "");
    _builder.append("\" id=\"");
    String _name_4 = param.getName();
    _builder.append(_name_4, "");
    _builder.append("-param\">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderBooleanInputElement(final Enumerated it, final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<label data-bind=\"text: ");
    String _name = param.getName();
    _builder.append(_name, "");
    _builder.append(".value()?\'on\':\'off\'\"> <input type=\"checkbox\" id=\"");
    String _name_1 = param.getName();
    _builder.append(_name_1, "");
    _builder.append("-param\" data-bind=\"checked:");
    String _name_2 = param.getName();
    _builder.append(_name_2, "");
    _builder.append(".value\"> </label>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileParameterLink(final AbstractParameter it) {
    if (it instanceof Parameter) {
      return _compileParameterLink((Parameter)it);
    } else if (it instanceof ParameterGroup) {
      return _compileParameterLink((ParameterGroup)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence renderRangeInputElement(final ValueRange it, final Parameter param) {
    if (it instanceof Bounded) {
      return _renderRangeInputElement((Bounded)it, param);
    } else if (it instanceof Enumerated) {
      return _renderRangeInputElement((Enumerated)it, param);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, param).toString());
    }
  }
}
