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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CSGenerator implements IGenerator {
  private LinkedList<String> classes = new LinkedList<String>();
  
  private LinkedList<String> confBuilder = new LinkedList<String>();
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Configurator> _filter = Iterables.<Configurator>filter(_iterable, Configurator.class);
    for (final Configurator e : _filter) {
      {
        StringBuilder generated = this.compile(e);
        for (final String s : this.classes) {
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
      StringBuilder sb = new StringBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static class ConfigurationBuilder");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static Configurator Build()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("var model = ");
      EList<AbstractParameter> _parameters = configurator.getParameters();
      StringBuilder _compileBuilder = this.compileBuilder(_parameters);
      _builder.append(_compileBuilder, "\t\t");
      _builder.append(";");
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
      String _string = sb.toString();
      this.confBuilder.addLast(_string);
      EList<AbstractParameter> _parameters_1 = configurator.getParameters();
      _xblockexpression = this.compile(_parameters_1);
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
    StringConcatenation _builder = new StringConcatenation();
    String _name = parameterGroup.getName();
    _builder.append(_name, "");
    _builder.append(" = new ");
    String _name_1 = parameterGroup.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Name = \"");
    String _name_2 = parameterGroup.getName();
    _builder.append(_name_2, "\t\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    EList<AbstractParameter> _parameters = parameterGroup.getParameters();
    Object _compileBuilder = this.compileBuilder(_parameters);
    _builder.append(_compileBuilder, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _compileParameterBuilder(final Parameter parameter) {
    CharSequence _xifexpression = null;
    ValueRange _valueRange = parameter.getValueRange();
    if ((_valueRange instanceof Bounded)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      String _name = parameter.getName();
      _builder.append(_name, " ");
      _builder.append(" = new ");
      String _name_1 = parameter.getName();
      _builder.append(_name_1, " ");
      _builder.append(" { Value = ");
      Expression _default = parameter.getDefault();
      Object _compileExpression = this.compileExpression(_default);
      _builder.append(_compileExpression, " ");
      _builder.append(", Name = \"");
      String _name_2 = parameter.getName();
      _builder.append(_name_2, " ");
      _builder.append("\", Description = \"");
      String _description = parameter.getDescription();
      _builder.append(_description, " ");
      _builder.append("\" },");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      ValueRange _valueRange_1 = parameter.getValueRange();
      if ((_valueRange_1 instanceof Enumerated)) {
        CharSequence _xblockexpression = null;
        {
          ValueRange _valueRange_2 = parameter.getValueRange();
          Enumerated v = ((Enumerated) _valueRange_2);
          EList<Expression> _values = v.getValues();
          final Function1<Expression, String> _function = new Function1<Expression, String>() {
            public String apply(final Expression value) {
              Object _compileExpression = CSGenerator.this.compileExpression(value);
              String _plus = ("\"" + _compileExpression);
              return (_plus + "\"");
            }
          };
          List<String> _map = ListExtensions.<Expression, String>map(_values, _function);
          String enumValues = IterableExtensions.join(_map, ",");
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(" ");
          String _name_3 = parameter.getName();
          _builder_1.append(_name_3, " ");
          _builder_1.append(" = new ");
          String _name_4 = parameter.getName();
          _builder_1.append(_name_4, " ");
          _builder_1.append(" { Value = \"");
          Expression _default_1 = parameter.getDefault();
          Object _compileExpression_1 = this.compileExpression(_default_1);
          _builder_1.append(_compileExpression_1, " ");
          _builder_1.append("\", Name = \"");
          String _name_5 = parameter.getName();
          _builder_1.append(_name_5, " ");
          _builder_1.append("\", Description = \"");
          String _description_1 = parameter.getDescription();
          _builder_1.append(_description_1, " ");
          _builder_1.append("\", SelectableValues = new List<string>{");
          String _string = enumValues.toString();
          _builder_1.append(_string, " ");
          _builder_1.append(" }},");
          _xblockexpression = _builder_1;
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _compileParameter(final ParameterGroup parameterGroup) {
    CharSequence _xblockexpression = null;
    {
      StringBuilder sb = new StringBuilder();
      StringConcatenation _builder = new StringConcatenation();
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
      _builder.append(":IGroupParameter");
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
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public bool IsVisible()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return \t");
      Object _xifexpression = null;
      Expression _visibility = parameterGroup.getVisibility();
      boolean _equals = Objects.equal(_visibility, null);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("true; //visibility is null");
        _xifexpression = _builder_1;
      } else {
        Expression _visibility_1 = parameterGroup.getVisibility();
        _xifexpression = this.compileExpression(_visibility_1);
      }
      _builder.append(_xifexpression, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public bool Validate()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return true;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      sb.append(_builder);
      String _string = sb.toString();
      this.classes.addLast(_string);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/// <summary>");
      _builder_2.newLine();
      _builder_2.append("/// parameter ");
      String _name_2 = parameterGroup.getName();
      _builder_2.append(_name_2, "");
      _builder_2.append(" ");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("/// ");
      String _description_1 = parameterGroup.getDescription();
      _builder_2.append(_description_1, "");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("/// </summary>");
      _builder_2.newLine();
      _builder_2.append("public ");
      String _name_3 = parameterGroup.getName();
      _builder_2.append(_name_3, "");
      _builder_2.append(" ");
      String _name_4 = parameterGroup.getName();
      _builder_2.append(_name_4, "");
      _builder_2.append(" { get; set; }");
      _builder_2.newLineIfNotEmpty();
      _xblockexpression = _builder_2;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compileParameter(final Parameter parameter) {
    CharSequence _xblockexpression = null;
    {
      StringBuilder sb = new StringBuilder();
      ValueRange _valueRange = parameter.getValueRange();
      if ((_valueRange instanceof Bounded)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("/// <summary>");
        _builder.newLine();
        _builder.append("/// Parameter ");
        String _name = parameter.getName();
        _builder.append(_name, "");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("/// ");
        String _description = parameter.getDescription();
        _builder.append(_description, "");
        _builder.newLineIfNotEmpty();
        _builder.append("/// </summary>");
        _builder.newLine();
        _builder.append("public class ");
        String _name_1 = parameter.getName();
        _builder.append(_name_1, "");
        _builder.append(": IntParameter");
        _builder.newLineIfNotEmpty();
        _builder.append("{\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public string Name { get; set; }\t\t");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public override bool IsVisible()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("return \t");
        Object _xifexpression = null;
        Expression _visibility = parameter.getVisibility();
        boolean _equals = Objects.equal(_visibility, null);
        if (_equals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("true; //visibility is null");
          _xifexpression = _builder_1;
        } else {
          Expression _visibility_1 = parameter.getVisibility();
          _xifexpression = this.compileExpression(_visibility_1);
        }
        _builder.append(_xifexpression, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public override bool Validate()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("return  ");
        CharSequence _xifexpression_1 = null;
        EList<Constraint> _constraints = parameter.getConstraints();
        boolean _notEquals = (!Objects.equal(_constraints, Integer.valueOf(224324)));
        if (_notEquals) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("true; //constraints is null");
          _xifexpression_1 = _builder_2;
        } else {
          CharSequence _xblockexpression_1 = null;
          {
            EList<Constraint> _constraints_1 = parameter.getConstraints();
            this.compileExpression(_constraints_1);
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append(";");
            _xblockexpression_1 = _builder_3;
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _builder.append(_xifexpression_1, "\t\t");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        sb.append(_builder);
      }
      ValueRange _valueRange_1 = parameter.getValueRange();
      if ((_valueRange_1 instanceof Enumerated)) {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("/// <summary>");
        _builder_3.newLine();
        _builder_3.append("/// Parameter ");
        String _name_2 = parameter.getName();
        _builder_3.append(_name_2, "");
        _builder_3.append(" ");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("/// ");
        String _description_1 = parameter.getDescription();
        _builder_3.append(_description_1, "");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("/// </summary>");
        _builder_3.newLine();
        _builder_3.append("public class ");
        String _name_3 = parameter.getName();
        _builder_3.append(_name_3, "");
        _builder_3.append(": EnumeratedParameter");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("{\t");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("public string Name { get; set; }\t\t");
        _builder_3.newLine();
        _builder_3.append("\t\t\t\t\t\t");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("public override bool IsVisible()");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("{");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("return \t");
        Object _xifexpression_2 = null;
        Expression _visibility_2 = parameter.getVisibility();
        boolean _equals_1 = Objects.equal(_visibility_2, null);
        if (_equals_1) {
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("true; //visibility is null");
          _xifexpression_2 = _builder_4;
        } else {
          Expression _visibility_3 = parameter.getVisibility();
          _xifexpression_2 = this.compileExpression(_visibility_3);
        }
        _builder_3.append(_xifexpression_2, "\t\t");
        _builder_3.append(";");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t");
        _builder_3.append("}");
        _builder_3.newLine();
        _builder_3.append("\t\t ");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("public override bool Validate()");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("{");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("return true;");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("}");
        _builder_3.newLine();
        _builder_3.append("}");
        _builder_3.newLine();
        sb.append(_builder_3);
      }
      String _string = sb.toString();
      this.classes.addLast(_string);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("/// <summary>");
      _builder_5.newLine();
      _builder_5.append("/// parameter ");
      String _name_4 = parameter.getName();
      _builder_5.append(_name_4, "");
      _builder_5.append(" ");
      _builder_5.newLineIfNotEmpty();
      _builder_5.append("/// ");
      String _description_2 = parameter.getDescription();
      _builder_5.append(_description_2, "");
      _builder_5.newLineIfNotEmpty();
      _builder_5.append("/// </summary>");
      _builder_5.newLine();
      _builder_5.append("public ");
      String _name_5 = parameter.getName();
      _builder_5.append(_name_5, "");
      _builder_5.append(" ");
      String _name_6 = parameter.getName();
      _builder_5.append(_name_6, "");
      _builder_5.append(" { get; set; }");
      _builder_5.newLineIfNotEmpty();
      _builder_5.append("\t\t");
      _builder_5.newLine();
      _xblockexpression = _builder_5;
    }
    return _xblockexpression;
  }
  
  protected Object _compileExpression(final EList<Constraint> p) {
    StringBuilder _stringBuilder = new StringBuilder();
    final Function2<StringBuilder, Constraint, StringBuilder> _function = new Function2<StringBuilder, Constraint, StringBuilder>() {
      public StringBuilder apply(final StringBuilder sb, final Constraint con) {
        StringBuilder _xblockexpression = null;
        {
          Expression _expression = con.getExpression();
          Object _compileExpression = CSGenerator.this.compileExpression(_expression);
          sb.append(_compileExpression);
          _xblockexpression = sb;
        }
        return _xblockexpression;
      }
    };
    StringBuilder _fold = IterableExtensions.<Constraint, StringBuilder>fold(p, _stringBuilder, _function);
    return _fold.toString();
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
    return _id.getName();
  }
  
  protected Object _compileExpression(final dk.itu.smdp2015.church.model.configurator.Integer integer) {
    return integer.getValue();
  }
  
  protected Object _compileExpression(final dk.itu.smdp2015.church.model.configurator.Boolean bool) {
    return bool.isValue();
  }
  
  protected Object _compileExpression(final dk.itu.smdp2015.church.model.configurator.String str) {
    return str.getValue();
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
