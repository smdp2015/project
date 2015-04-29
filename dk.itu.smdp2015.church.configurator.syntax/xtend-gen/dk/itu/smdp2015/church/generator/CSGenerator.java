package dk.itu.smdp2015.church.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Constraint;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.InRange;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CSGenerator implements IGenerator {
  private LinkedList<String> groupParameterclasses = new LinkedList<String>();
  
  private LinkedList<String> parameterInstance = new LinkedList<String>();
  
  private LinkedList<String> confBuilder = new LinkedList<String>();
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Configurator> _filter = Iterables.<Configurator>filter(_iterable, Configurator.class);
    for (final Configurator e : _filter) {
      {
        StringBuilder generated = this.compile(e);
        for (final String s : this.groupParameterclasses) {
          String _string = s.toString();
          generated.append(_string);
        }
        for (final String s_1 : this.confBuilder) {
          String _string_1 = s_1.toString();
          generated.append(_string_1);
        }
        fsa.generateFile("Configurator.cs", generated);
      }
    }
  }
  
  public StringBuilder compile(final Configurator configurator) {
    StringBuilder _xblockexpression = null;
    {
      this.parameterInstance.clear();
      EList<AbstractParameter> _parameters = configurator.getParameters();
      this.compileBuilder(_parameters);
      StringBuilder parameters = new StringBuilder();
      for (final String s : this.parameterInstance) {
        String _string = s.toString();
        parameters.append(_string);
      }
      StringBuilder sb = new StringBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static class ConfigurationBuilder");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static Configurator Build()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{\t");
      _builder.newLine();
      _builder.append("\t\t");
      String _string_1 = parameters.toString();
      _builder.append(_string_1, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("var model = ");
      EList<AbstractParameter> _parameters_1 = configurator.getParameters();
      StringBuilder _compileBuilder = this.compileBuilder(_parameters_1);
      _builder.append(_compileBuilder, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("   \t    ");
      _builder.append("return new Configurator(model); ");
      _builder.newLine();
      _builder.append("   \t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      sb.append(_builder);
      String _string_2 = sb.toString();
      this.confBuilder.addLast(_string_2);
      EList<AbstractParameter> _parameters_2 = configurator.getParameters();
      _xblockexpression = this.compile(_parameters_2);
    }
    return _xblockexpression;
  }
  
  public StringBuilder compile(final EList<AbstractParameter> p) {
    StringBuilder _stringBuilder = new StringBuilder();
    final Function2<StringBuilder, AbstractParameter, StringBuilder> _function = new Function2<StringBuilder, AbstractParameter, StringBuilder>() {
      public StringBuilder apply(final StringBuilder sb, final AbstractParameter parameter) {
        StringBuilder _xblockexpression = null;
        {
          CharSequence _compileParameter = CSGenerator.this.compileParameter(parameter);
          sb.append(_compileParameter);
          _xblockexpression = sb;
        }
        return _xblockexpression;
      }
    };
    return IterableExtensions.<AbstractParameter, StringBuilder>fold(p, _stringBuilder, _function);
  }
  
  public StringBuilder compileBuilder(final EList<AbstractParameter> p) {
    StringBuilder _stringBuilder = new StringBuilder();
    final Function2<StringBuilder, AbstractParameter, StringBuilder> _function = new Function2<StringBuilder, AbstractParameter, StringBuilder>() {
      public StringBuilder apply(final StringBuilder sb, final AbstractParameter parameter) {
        StringBuilder _xblockexpression = null;
        {
          CharSequence _compileParameterBuilder = CSGenerator.this.compileParameterBuilder(parameter);
          sb.append(_compileParameterBuilder);
          _xblockexpression = sb;
        }
        return _xblockexpression;
      }
    };
    return IterableExtensions.<AbstractParameter, StringBuilder>fold(p, _stringBuilder, _function);
  }
  
  protected CharSequence _compileParameterBuilder(final ParameterGroup parameterGroup) {
    CharSequence _xblockexpression = null;
    {
      EList<AbstractParameter> _parameters = parameterGroup.getParameters();
      this.compileBuilder(_parameters);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var ");
      String _name = parameterGroup.getName();
      _builder.append(_name, "");
      _builder.append(" = new ");
      String _name_1 = parameterGroup.getName();
      _builder.append(_name_1, "");
      _builder.append("GroupParameter");
      _builder.newLineIfNotEmpty();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Name = \"");
      String _name_2 = parameterGroup.getName();
      _builder.append(_name_2, "\t\t");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      EList<AbstractParameter> _parameters_1 = parameterGroup.getParameters();
      CharSequence _compileParameterGroupBuilder = this.compileParameterGroupBuilder(_parameters_1);
      _builder.append(_compileParameterGroupBuilder, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("};\t");
      _builder.newLine();
      String _name_3 = parameterGroup.getName();
      _builder.append(_name_3, "");
      _builder.append(".IsVisible = () => ");
      Expression _visibility = parameterGroup.getVisibility();
      Object _safeAddVisibleIf = this.safeAddVisibleIf(_visibility);
      _builder.append(_safeAddVisibleIf, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _name_4 = parameterGroup.getName();
      _builder.append(_name_4, "");
      _builder.append(".Validate = () => ");
      EList<Constraint> _constraints = parameterGroup.getConstraints();
      Object _safeAddConstraints = this.safeAddConstraints(_constraints);
      _builder.append(_safeAddConstraints, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      this.parameterInstance.addLast(_builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name_5 = parameterGroup.getName();
      _builder_1.append(_name_5, "");
      _builder_1.append(" = ");
      String _name_6 = parameterGroup.getName();
      _builder_1.append(_name_6, "");
      _builder_1.append("GroupParameter;");
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compileParameterBuilder(final Parameter parameter) {
    ValueRange _valueRange = parameter.getValueRange();
    if ((_valueRange instanceof Bounded)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var ");
      String _name = parameter.getName();
      _builder.append(_name, "");
      _builder.append(" = new ");
      String _parameterType = this.getParameterType(parameter);
      _builder.append(_parameterType, "");
      _builder.append(" {");
      String _safeAddDefault = this.safeAddDefault(parameter);
      _builder.append(_safeAddDefault, "");
      _builder.append(" Name = \"");
      String _name_1 = parameter.getName();
      _builder.append(_name_1, "");
      _builder.append("\", Description = \"");
      String _description = parameter.getDescription();
      _builder.append(_description, "");
      _builder.append("\", Optional = ");
      boolean _isOptional = parameter.isOptional();
      _builder.append(_isOptional, "");
      _builder.append(", ");
      ValueRange _valueRange_1 = parameter.getValueRange();
      String _safeAddUpperLower = this.safeAddUpperLower(_valueRange_1);
      _builder.append(_safeAddUpperLower, "");
      _builder.append("};");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _name_2 = parameter.getName();
      _builder.append(_name_2, "\t");
      _builder.append(".IsVisible = () => ");
      Expression _visibility = parameter.getVisibility();
      Object _safeAddVisibleIf = this.safeAddVisibleIf(_visibility);
      _builder.append(_safeAddVisibleIf, "\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _name_3 = parameter.getName();
      _builder.append(_name_3, "\t");
      _builder.append(".Validate = () => ");
      EList<Constraint> _constraints = parameter.getConstraints();
      Object _safeAddConstraints = this.safeAddConstraints(_constraints);
      _builder.append(_safeAddConstraints, "\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      this.parameterInstance.addLast(_builder.toString());
    } else {
      ValueRange _valueRange_2 = parameter.getValueRange();
      if ((_valueRange_2 instanceof Enumerated)) {
        ValueRange _valueRange_3 = parameter.getValueRange();
        Enumerated v = ((Enumerated) _valueRange_3);
        EList<Expression> _values = v.getValues();
        final Function1<Expression, Object> _function = new Function1<Expression, Object>() {
          public Object apply(final Expression value) {
            return CSGenerator.this.compileExpression(value);
          }
        };
        List<Object> _map = ListExtensions.<Expression, Object>map(_values, _function);
        String enumValues = IterableExtensions.join(_map, ",");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("var ");
        String _name_4 = parameter.getName();
        _builder_1.append(_name_4, "");
        _builder_1.append(" = new ");
        String _parameterType_1 = this.getParameterType(parameter);
        _builder_1.append(_parameterType_1, "");
        _builder_1.append("  { ");
        String _safeAddDefault_1 = this.safeAddDefault(parameter);
        _builder_1.append(_safeAddDefault_1, "");
        _builder_1.append(" Name = \"");
        String _name_5 = parameter.getName();
        _builder_1.append(_name_5, "");
        _builder_1.append("\", Description = \"");
        String _description_1 = parameter.getDescription();
        _builder_1.append(_description_1, "");
        _builder_1.append("\", SelectableValues = new List<string>{");
        String _string = enumValues.toString();
        _builder_1.append(_string, "");
        _builder_1.append("}};");
        _builder_1.newLineIfNotEmpty();
        String _name_6 = parameter.getName();
        _builder_1.append(_name_6, "");
        _builder_1.append(".IsVisible = () => ");
        Expression _visibility_1 = parameter.getVisibility();
        Object _safeAddVisibleIf_1 = this.safeAddVisibleIf(_visibility_1);
        _builder_1.append(_safeAddVisibleIf_1, "");
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        String _name_7 = parameter.getName();
        _builder_1.append(_name_7, "");
        _builder_1.append(".Validate = () => ");
        EList<Constraint> _constraints_1 = parameter.getConstraints();
        Object _safeAddConstraints_1 = this.safeAddConstraints(_constraints_1);
        _builder_1.append(_safeAddConstraints_1, "");
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.newLine();
        this.parameterInstance.addLast(_builder_1.toString());
      }
    }
    return null;
  }
  
  public String safeAddDefault(final Parameter parameter) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(parameter, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Expression _default = parameter.getDefault();
      boolean _notEquals_1 = (!Objects.equal(_default, null));
      _and = _notEquals_1;
    }
    if (_and) {
      if ((parameter instanceof dk.itu.smdp2015.church.model.configurator.String)) {
        Expression _default_1 = parameter.getDefault();
        Object _compileExpression = this.compileExpression(_default_1);
        String _plus = ("Value = \"" + _compileExpression);
        return (_plus + "\", ");
      } else {
        Expression _default_2 = parameter.getDefault();
        Object _compileExpression_1 = this.compileExpression(_default_2);
        String _plus_1 = ("Value = " + _compileExpression_1);
        return (_plus_1 + ", ");
      }
    }
    return null;
  }
  
  public Object safeAddConstraints(final EList<Constraint> constraint) {
    Object _xifexpression = null;
    boolean _or = false;
    boolean _equals = Objects.equal(constraint, null);
    if (_equals) {
      _or = true;
    } else {
      int _length = ((Object[])Conversions.unwrapArray(constraint, Object.class)).length;
      boolean _equals_1 = (_length == 0);
      _or = _equals_1;
    }
    if (_or) {
      _xifexpression = "true";
    } else {
      _xifexpression = this.compileExpression(constraint);
    }
    return _xifexpression;
  }
  
  public Object safeAddVisibleIf(final Expression expression) {
    Object _xifexpression = null;
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      _xifexpression = Boolean.valueOf(true);
    } else {
      _xifexpression = this.compileExpression(expression);
    }
    return _xifexpression;
  }
  
  public String safeAddUpperLower(final ValueRange valueRange) {
    String _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(valueRange, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (valueRange instanceof Bounded);
    }
    if (_and) {
      String _xblockexpression = null;
      {
        Bounded boundedvalueRange = ((Bounded) valueRange);
        String _xifexpression_1 = null;
        boolean _and_1 = false;
        Expression _upperBound = boundedvalueRange.getUpperBound();
        boolean _notEquals_1 = (!Objects.equal(_upperBound, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          Expression _upperBound_1 = boundedvalueRange.getUpperBound();
          _and_1 = (_upperBound_1 instanceof dk.itu.smdp2015.church.model.configurator.Integer);
        }
        if (_and_1) {
          Expression _upperBound_2 = boundedvalueRange.getUpperBound();
          Object _compileExpression = this.compileExpression(_upperBound_2);
          String _plus = ("UpperBound = " + _compileExpression);
          String _plus_1 = (_plus + ", LowerBound = ");
          Expression _lowerBound = boundedvalueRange.getLowerBound();
          Object _compileExpression_1 = this.compileExpression(_lowerBound);
          _xifexpression_1 = (_plus_1 + _compileExpression_1);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected CharSequence _compileParameterGroupBuilder(final EList<AbstractParameter> p) {
    StringBuilder _stringBuilder = new StringBuilder();
    final Function2<StringBuilder, AbstractParameter, StringBuilder> _function = new Function2<StringBuilder, AbstractParameter, StringBuilder>() {
      public StringBuilder apply(final StringBuilder sb, final AbstractParameter parameter) {
        StringBuilder _xblockexpression = null;
        {
          Object _compileParameterGroupBuilder = CSGenerator.this.compileParameterGroupBuilder(parameter);
          sb.append(_compileParameterGroupBuilder);
          _xblockexpression = sb;
        }
        return _xblockexpression;
      }
    };
    return IterableExtensions.<AbstractParameter, StringBuilder>fold(p, _stringBuilder, _function);
  }
  
  protected CharSequence _compileParameterGroupBuilder(final ParameterGroup parameterGroup) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = parameterGroup.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    String _name_1 = parameterGroup.getName();
    _builder.append(_name_1, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileParameterGroupBuilder(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = parameter.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    String _name_1 = parameter.getName();
    _builder.append(_name_1, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileParameter(final ParameterGroup parameterGroup) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("/// <summary>");
      _builder.newLine();
      _builder.append("/// Parametergroup ");
      String _name = parameterGroup.getName();
      _builder.append(_name, "");
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      _builder.append("/// ");
      String _description = parameterGroup.getDescription();
      _builder.append(_description, "");
      _builder.newLineIfNotEmpty();
      _builder.append("/// </summary>");
      _builder.newLine();
      _builder.append("public class ");
      String _name_1 = parameterGroup.getName();
      _builder.append(_name_1, "");
      _builder.append("GroupParameter:GroupParameter");
      _builder.newLineIfNotEmpty();
      _builder.append("{\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public string Name { get; set; }\t\t");
      _builder.newLine();
      _builder.append("\t");
      EList<AbstractParameter> _parameters = parameterGroup.getParameters();
      Object _compile = this.compile(_parameters);
      _builder.append(_compile, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      this.groupParameterclasses.addLast(_builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/// <summary>");
      _builder_1.newLine();
      _builder_1.append("/// Parametergroup ");
      String _name_2 = parameterGroup.getName();
      _builder_1.append(_name_2, "");
      _builder_1.append(" ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("/// ");
      String _description_1 = parameterGroup.getDescription();
      _builder_1.append(_description_1, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("/// </summary>");
      _builder_1.newLine();
      _builder_1.append("public ");
      String _name_3 = parameterGroup.getName();
      _builder_1.append(_name_3, "");
      _builder_1.append("GroupParameter ");
      String _name_4 = parameterGroup.getName();
      _builder_1.append(_name_4, "");
      _builder_1.append(" {get; set;}");
      _builder_1.newLineIfNotEmpty();
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compileParameter(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/// <summary>");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("/// parameter ");
    String _name = parameter.getName();
    _builder.append(_name, "  \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t\t");
    _builder.append("/// ");
    String _description = parameter.getDescription();
    _builder.append(_description, "  \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t\t");
    _builder.append("/// </summary>");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("public ");
    String _parameterType = this.getParameterType(parameter);
    _builder.append(_parameterType, "  \t\t");
    _builder.append(" ");
    String _name_1 = parameter.getName();
    _builder.append(_name_1, "  \t\t");
    _builder.append(" { get; set; }\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String getParameterType(final Parameter parameter) {
    ValueRange _valueRange = parameter.getValueRange();
    if ((_valueRange instanceof Bounded)) {
      ValueRange _valueRange_1 = parameter.getValueRange();
      Bounded bounded1 = ((Bounded) _valueRange_1);
      Expression _upperBound = bounded1.getUpperBound();
      if ((_upperBound instanceof dk.itu.smdp2015.church.model.configurator.Integer)) {
        return "IntParameter";
      }
      Expression _upperBound_1 = bounded1.getUpperBound();
      if ((_upperBound_1 instanceof dk.itu.smdp2015.church.model.configurator.String)) {
        return "StringParameter";
      }
      Expression _upperBound_2 = bounded1.getUpperBound();
      if ((_upperBound_2 instanceof dk.itu.smdp2015.church.model.configurator.Boolean)) {
        return "BoolParameter";
      }
    }
    ValueRange _valueRange_2 = parameter.getValueRange();
    if ((_valueRange_2 instanceof Enumerated)) {
      return "EnumeratedParameter";
    }
    return null;
  }
  
  protected Object _compileExpression(final EList<Constraint> p) {
    final Function1<Constraint, String> _function = new Function1<Constraint, String>() {
      public String apply(final Constraint constraint) {
        Expression _expression = constraint.getExpression();
        Object _compileExpression = CSGenerator.this.compileExpression(_expression);
        return _compileExpression.toString();
      }
    };
    List<String> _map = ListExtensions.<Constraint, String>map(p, _function);
    return IterableExtensions.join(_map, " && ");
  }
  
  protected Object _compileExpression(final Binary binary) {
    Expression _left = binary.getLeft();
    Object _compileExpression = this.compileExpression(_left);
    BinaryOperator _operator = binary.getOperator();
    String _compileBinaryOperator = this.compileBinaryOperator(_operator);
    String _plus = (_compileExpression + _compileBinaryOperator);
    Expression _right = binary.getRight();
    Object _compileExpression_1 = this.compileExpression(_right);
    return (_plus + _compileExpression_1);
  }
  
  protected Object _compileExpression(final Unary unary) {
    return unary.getOperator();
  }
  
  protected Object _compileExpression(final Identifier identifier) {
    Parameter _id = identifier.getId();
    String _name = _id.getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".Value");
    return (_name + _builder);
  }
  
  protected Object _compileExpression(final dk.itu.smdp2015.church.model.configurator.Integer integer) {
    return integer.getValue();
  }
  
  protected Object _compileExpression(final dk.itu.smdp2015.church.model.configurator.Boolean bool) {
    return bool.isValue();
  }
  
  protected Object _compileExpression(final dk.itu.smdp2015.church.model.configurator.String str) {
    String _value = str.getValue();
    String _plus = ("\"" + _value);
    return (_plus + "\"");
  }
  
  protected Object _compileExpression(final InRange inRange) {
    String _xifexpression = null;
    ValueRange _range = inRange.getRange();
    if ((_range instanceof Enumerated)) {
      Parameter _parameter = inRange.getParameter();
      String _name = _parameter.getName();
      String _plus = (_name + ".SelectableValues.Exists( x => x == ");
      Parameter _parameter_1 = inRange.getParameter();
      String _name_1 = _parameter_1.getName();
      String _plus_1 = (_plus + _name_1);
      _xifexpression = (_plus_1 + ".Value)");
    } else {
      String _xifexpression_1 = null;
      ValueRange _range_1 = inRange.getRange();
      if ((_range_1 instanceof Bounded)) {
        String _xblockexpression = null;
        {
          ValueRange _range_2 = inRange.getRange();
          Bounded bounded = ((Bounded) _range_2);
          Expression _lowerBound = bounded.getLowerBound();
          Object _compileExpression = this.compileExpression(_lowerBound);
          String _plus_2 = (_compileExpression + " < ");
          Parameter _parameter_2 = inRange.getParameter();
          String _name_2 = _parameter_2.getName();
          String _plus_3 = (_plus_2 + _name_2);
          String _plus_4 = (_plus_3 + ".Value < ");
          Expression _upperBound = bounded.getUpperBound();
          Object _compileExpression_1 = this.compileExpression(_upperBound);
          _xblockexpression = (_plus_4 + _compileExpression_1);
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String compileBinaryOperator(final BinaryOperator binaryOperator) {
    String _switchResult = null;
    String _literal = binaryOperator.getLiteral();
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
  
  public CharSequence compileParameterBuilder(final AbstractParameter parameter) {
    if (parameter instanceof Parameter) {
      return _compileParameterBuilder((Parameter)parameter);
    } else if (parameter instanceof ParameterGroup) {
      return _compileParameterBuilder((ParameterGroup)parameter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parameter).toString());
    }
  }
  
  public CharSequence compileParameterGroupBuilder(final Object parameter) {
    if (parameter instanceof Parameter) {
      return _compileParameterGroupBuilder((Parameter)parameter);
    } else if (parameter instanceof ParameterGroup) {
      return _compileParameterGroupBuilder((ParameterGroup)parameter);
    } else if (parameter instanceof EList) {
      return _compileParameterGroupBuilder((EList<AbstractParameter>)parameter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parameter).toString());
    }
  }
  
  public CharSequence compileParameter(final AbstractParameter parameter) {
    if (parameter instanceof Parameter) {
      return _compileParameter((Parameter)parameter);
    } else if (parameter instanceof ParameterGroup) {
      return _compileParameter((ParameterGroup)parameter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parameter).toString());
    }
  }
  
  public Object compileExpression(final Object bool) {
    if (bool instanceof dk.itu.smdp2015.church.model.configurator.Boolean) {
      return _compileExpression((dk.itu.smdp2015.church.model.configurator.Boolean)bool);
    } else if (bool instanceof dk.itu.smdp2015.church.model.configurator.Integer) {
      return _compileExpression((dk.itu.smdp2015.church.model.configurator.Integer)bool);
    } else if (bool instanceof dk.itu.smdp2015.church.model.configurator.String) {
      return _compileExpression((dk.itu.smdp2015.church.model.configurator.String)bool);
    } else if (bool instanceof Binary) {
      return _compileExpression((Binary)bool);
    } else if (bool instanceof Identifier) {
      return _compileExpression((Identifier)bool);
    } else if (bool instanceof InRange) {
      return _compileExpression((InRange)bool);
    } else if (bool instanceof Unary) {
      return _compileExpression((Unary)bool);
    } else if (bool instanceof EList) {
      return _compileExpression((EList<Constraint>)bool);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bool).toString());
    }
  }
}
