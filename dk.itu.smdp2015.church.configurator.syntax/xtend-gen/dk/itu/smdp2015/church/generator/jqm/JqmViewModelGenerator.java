package dk.itu.smdp2015.church.generator.jqm;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.generator.jqm.GroupNameStack;
import dk.itu.smdp2015.church.generator.jqm.IJqmPartGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmCommon;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Constant;
import dk.itu.smdp2015.church.model.configurator.Constraint;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.InRange;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.UnaryOperator;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import dk.itu.smdp2015.church.xtext.common.ExpressionType;
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider;
import java.util.Arrays;
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
public class JqmViewModelGenerator implements IJqmPartGenerator {
  private String currentPath = "";
  
  private final GroupNameStack _groupNameStack = new GroupNameStack();
  
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Inject
  @Extension
  private JqmCommon _jqmCommon;
  
  private String _rootFolder;
  
  public JqmViewModelGenerator(final ExpressionTypeProvider extTypeProvider, final JqmCommon common, final String rootFolder) {
    this._rootFolder = rootFolder;
    this._expressionTypeProvider = extTypeProvider;
    this._jqmCommon = common;
  }
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Configurator> _filter = Iterables.<Configurator>filter(_iterable, Configurator.class);
    for (final Configurator e : _filter) {
      {
        CharSequence generated = this.compile(e);
        fsa.generateFile((this._rootFolder + "/app-viewmodel.js"), generated);
      }
    }
  }
  
  public CharSequence compile(final Configurator it) {
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
    _builder.append("    ");
    EList<AbstractParameter> _parameters = it.getParameters();
    String _renderParameters = this.renderParameters(_parameters);
    _builder.append(_renderParameters, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Init special group validations, by resetting objects");
    _builder.newLine();
    _builder.append("//App.ViewModel().group_seats(App.ViewModel().group_seats());");
    _builder.newLine();
    return _builder;
  }
  
  public String renderParameters(final EList<AbstractParameter> it) {
    Iterable<AbstractParameter> _drop = IterableExtensions.<AbstractParameter>drop(it, 1);
    AbstractParameter _get = it.get(0);
    String _renderParam = this.renderParam(_get);
    final Function2<String, AbstractParameter, String> _function = new Function2<String, AbstractParameter, String>() {
      public String apply(final String previous, final AbstractParameter it) {
        String _renderParam = JqmViewModelGenerator.this.renderParam(it);
        return ((previous + ", \n") + _renderParam);
      }
    };
    return IterableExtensions.<AbstractParameter, String>fold(_drop, _renderParam, _function);
  }
  
  protected String _renderParam(final Parameter it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(": {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    \t");
    {
      ValueRange _valueRange = it.getValueRange();
      ExpressionType _rangeType = this._expressionTypeProvider.rangeType(_valueRange);
      boolean _notEquals = (!Objects.equal(_rangeType, ExpressionType.Boolean));
      if (_notEquals) {
        ValueRange _valueRange_1 = it.getValueRange();
        CharSequence _renderValueRange = this.renderValueRange(_valueRange_1);
        _builder.append(_renderValueRange, "\t    \t");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t    \t");
    {
      boolean _isOptional = it.isOptional();
      if (_isOptional) {
        _builder.append("isOn: ko.observable(false),");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t    \t");
    _builder.append("value: ko.observable(");
    Expression _default = it.getDefault();
    Object _renderExpression = null;
    if (_default!=null) {
      _renderExpression=this.renderExpression(_default);
    }
    _builder.append(_renderExpression, "\t    \t");
    _builder.append(")");
    {
      boolean _isOptional_1 = it.isOptional();
      boolean _not = (!_isOptional_1);
      if (_not) {
        CharSequence _renderRequiredValidation = this.renderRequiredValidation(it);
        _builder.append(_renderRequiredValidation, "\t    \t");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Constraint> _constraints = it.getConstraints();
      for(final Constraint it_1 : _constraints) {
        _builder.append("\t    \t");
        CharSequence _renderConstraint = this.renderConstraint(it_1);
        _builder.append(_renderConstraint, "\t    \t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _renderParam(final ParameterGroup it) {
    StringConcatenation _builder = new StringConcatenation();
    String _groupName = this._jqmCommon.getGroupName(it);
    _builder.append(_groupName, "");
    _builder.append(": ko.observable({");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Expression _visibility = it.getVisibility();
      boolean _notEquals = (!Objects.equal(_visibility, null));
      if (_notEquals) {
        _builder.append("isVisible: ko.deferredPureComputed(function(){");
        _builder.newLineIfNotEmpty();
        _builder.append("           \t");
        _builder.append("return ");
        Expression _visibility_1 = it.getVisibility();
        Object _renderExpression = this.renderExpression(_visibility_1);
        _builder.append(_renderExpression, "           \t");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("}),");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<AbstractParameter> _parameters = it.getParameters();
    String _renderParameters = this.renderParameters(_parameters);
    _builder.append(_renderParameters, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("})");
    return _builder.toString();
  }
  
  public CharSequence renderRequiredValidation(final Parameter it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".extend({");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("required: {params: true, message: \"");
    String _name = it.getName();
    _builder.append(_name, "\t                ");
    _builder.append(" is required\"}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("})");
    return _builder;
  }
  
  public CharSequence renderConstraint(final Constraint it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".extend({");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("validation: {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("validator: function (val, param) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if(App.ViewModel==null)//not initialized");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("//Expression here:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var result =");
    _builder.newLine();
    _builder.append("              ");
    Expression _expression = it.getExpression();
    Object _renderExpression = this.renderExpression(_expression);
    _builder.append(_renderExpression, "              ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("message: \"");
    String _elvis = null;
    String _description = it.getDescription();
    if (_description != null) {
      _elvis = _description;
    } else {
      _elvis = "Unspecified validation error";
    }
    _builder.append(_elvis, "        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("})");
    return _builder;
  }
  
  protected CharSequence _renderValueRange(final Bounded it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boundedRange:{");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("lower: ");
    Expression _lowerBound = it.getLowerBound();
    Object _renderExpression = this.renderExpression(_lowerBound);
    _builder.append(_renderExpression, "\t            ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("upper: ");
    Expression _upperBound = it.getUpperBound();
    Object _renderExpression_1 = this.renderExpression(_upperBound);
    _builder.append(_renderExpression_1, "\t            ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _renderValueRange(final Enumerated it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("choices: ");
    CharSequence _renderJavaScriptArray = this.renderJavaScriptArray(it);
    _builder.append(_renderJavaScriptArray, "");
    return _builder;
  }
  
  public CharSequence renderJavaScriptArray(final Enumerated it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    EList<Expression> _values = it.getValues();
    Iterable<Expression> _drop = IterableExtensions.<Expression>drop(_values, 1);
    EList<Expression> _values_1 = it.getValues();
    Expression _get = _values_1.get(0);
    Object _renderExpression = this.renderExpression(_get);
    final Function2<Object, Expression, Object> _function = new Function2<Object, Expression, Object>() {
      public Object apply(final Object result, final Expression it) {
        String _plus = (result + ",");
        Object _renderExpression = JqmViewModelGenerator.this.renderExpression(it);
        return (_plus + _renderExpression);
      }
    };
    Object _fold = IterableExtensions.<Expression, Object>fold(_drop, _renderExpression, _function);
    _builder.append(_fold, "");
    _builder.append("]");
    return _builder;
  }
  
  protected Object _renderExpression(final Expression it) {
    return "Unknown expression";
  }
  
  protected Object _renderExpression(final Constant it) {
    return it.toString();
  }
  
  protected Object _renderExpression(final dk.itu.smdp2015.church.model.configurator.String it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = it.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected Object _renderExpression(final dk.itu.smdp2015.church.model.configurator.Boolean it) {
    return it.isValue();
  }
  
  protected Object _renderExpression(final dk.itu.smdp2015.church.model.configurator.Integer it) {
    return it.getValue();
  }
  
  protected Object _renderExpression(final InRange it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ValueRange _range = it.getRange();
      if ((_range instanceof Enumerated)) {
        _builder.newLineIfNotEmpty();
        _builder.append("$.inArray(");
        Parameter _parameter = it.getParameter();
        CharSequence _jsValueReference = this.jsValueReference(_parameter);
        _builder.append(_jsValueReference, "");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        ValueRange _range_1 = it.getRange();
        CharSequence _renderJavaScriptArray = this.renderJavaScriptArray(((Enumerated) _range_1));
        _builder.append(_renderJavaScriptArray, " ");
        _builder.append(") > -1");
        _builder.newLineIfNotEmpty();
      } else {
        ValueRange _range_2 = it.getRange();
        if ((_range_2 instanceof Bounded)) {
          ValueRange _range_3 = it.getRange();
          final Bounded bound = ((Bounded) _range_3);
          _builder.newLineIfNotEmpty();
          _builder.append("(");
          Parameter _parameter_1 = it.getParameter();
          CharSequence _jsValueReference_1 = this.jsValueReference(_parameter_1);
          _builder.append(_jsValueReference_1, "");
          _builder.append(" \">\" ");
          Expression _lowerBound = bound.getLowerBound();
          Object _renderExpression = this.renderExpression(_lowerBound);
          _builder.append(_renderExpression, "");
          _builder.append(" && ");
          Parameter _parameter_2 = it.getParameter();
          CharSequence _jsValueReference_2 = this.jsValueReference(_parameter_2);
          _builder.append(_jsValueReference_2, "");
          _builder.append(" < ");
          Expression _upperBound = bound.getUpperBound();
          Object _renderExpression_1 = this.renderExpression(_upperBound);
          _builder.append(_renderExpression_1, "");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          ValueRange _range_4 = it.getRange();
          Class<? extends ValueRange> _class = _range_4.getClass();
          String _name = _class.getName();
          String _plus = ("Unknown valuerange: " + _name);
          _builder.append(_plus, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  protected Object _renderExpression(final Binary it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = it.getLeft();
    Object _renderExpression = this.renderExpression(_left);
    _builder.append(_renderExpression, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    BinaryOperator _operator = it.getOperator();
    String _renderOperator = this.renderOperator(_operator);
    _builder.append(_renderOperator, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    Expression _right = it.getRight();
    Object _renderExpression_1 = this.renderExpression(_right);
    _builder.append(_renderExpression_1, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(")");
    return _builder;
  }
  
  protected Object _renderExpression(final Identifier it) {
    Parameter _id = it.getId();
    return this.jsValueReference(_id);
  }
  
  protected Object _renderExpression(final Unary it) {
    CharSequence _xblockexpression = null;
    {
      UnaryOperator _operator = it.getOperator();
      final boolean isLogical = Objects.equal(_operator, UnaryOperator.LOGICAL_NOT);
      StringConcatenation _builder = new StringConcatenation();
      UnaryOperator _operator_1 = it.getOperator();
      String _renderOperator = this.renderOperator(_operator_1);
      _builder.append(_renderOperator, "");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      {
        if (isLogical) {
          _builder.append("(");
          Expression _inner = it.getInner();
          _builder.append(_inner, "\t\t\t");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t\t\t");
          Expression _inner_1 = it.getInner();
          _builder.append(_inner_1, "\t\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String renderOperator(final UnaryOperator it) {
    String _switchResult = null;
    String _literal = it.getLiteral();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_literal, "inversion")) {
        _matched=true;
        _switchResult = "-";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "logicalNot")) {
        _matched=true;
        _switchResult = "!";
      }
    }
    if (!_matched) {
      _switchResult = "no operatormatch";
    }
    return _switchResult;
  }
  
  public String renderOperator(final BinaryOperator operator) {
    String _switchResult = null;
    String _literal = operator.getLiteral();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_literal, "logicalOr")) {
        _matched=true;
        _switchResult = " || ";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "logicalAnd")) {
        _matched=true;
        _switchResult = " && ";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "addition")) {
        _matched=true;
        _switchResult = " + ";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "multiplication")) {
        _matched=true;
        _switchResult = " * ";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "lessThan")) {
        _matched=true;
        _switchResult = " < ";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "greaterThan")) {
        _matched=true;
        _switchResult = " > ";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "equal")) {
        _matched=true;
        _switchResult = " == ";
      }
    }
    if (!_matched) {
      if (Objects.equal(_literal, "notEqual")) {
        _matched=true;
        _switchResult = " != ";
      }
    }
    if (!_matched) {
      _switchResult = " no operatormatch ";
    }
    return _switchResult;
  }
  
  public CharSequence jsValueReference(final Parameter it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("App.ViewModel().");
    String _fullPath = this._jqmCommon.getFullPath(it);
    _builder.append(_fullPath, "");
    _builder.append(".value()");
    {
      ValueRange _valueRange = it.getValueRange();
      if ((_valueRange instanceof Enumerated)) {
        _builder.append("==null? \'\' : App.ViewModel().");
        String _fullPath_1 = this._jqmCommon.getFullPath(it);
        _builder.append(_fullPath_1, "");
        _builder.append(".value()[0]");
      }
    }
    return _builder;
  }
  
  public String renderParam(final AbstractParameter it) {
    if (it instanceof Parameter) {
      return _renderParam((Parameter)it);
    } else if (it instanceof ParameterGroup) {
      return _renderParam((ParameterGroup)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence renderValueRange(final ValueRange it) {
    if (it instanceof Bounded) {
      return _renderValueRange((Bounded)it);
    } else if (it instanceof Enumerated) {
      return _renderValueRange((Enumerated)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public Object renderExpression(final Expression it) {
    if (it instanceof dk.itu.smdp2015.church.model.configurator.Boolean) {
      return _renderExpression((dk.itu.smdp2015.church.model.configurator.Boolean)it);
    } else if (it instanceof dk.itu.smdp2015.church.model.configurator.Integer) {
      return _renderExpression((dk.itu.smdp2015.church.model.configurator.Integer)it);
    } else if (it instanceof dk.itu.smdp2015.church.model.configurator.String) {
      return _renderExpression((dk.itu.smdp2015.church.model.configurator.String)it);
    } else if (it instanceof Binary) {
      return _renderExpression((Binary)it);
    } else if (it instanceof Constant) {
      return _renderExpression((Constant)it);
    } else if (it instanceof Identifier) {
      return _renderExpression((Identifier)it);
    } else if (it instanceof InRange) {
      return _renderExpression((InRange)it);
    } else if (it instanceof Unary) {
      return _renderExpression((Unary)it);
    } else if (it != null) {
      return _renderExpression(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
