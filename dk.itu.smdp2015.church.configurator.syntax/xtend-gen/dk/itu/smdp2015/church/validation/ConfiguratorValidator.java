package dk.itu.smdp2015.church.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
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
import dk.itu.smdp2015.church.validation.AbstractConfiguratorValidator;
import dk.itu.smdp2015.church.validation.ExpressionValueProvider;
import dk.itu.smdp2015.church.xtext.common.ExpressionType;
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class ConfiguratorValidator extends AbstractConfiguratorValidator {
  public final static String INVALID_BOUND = "invalidBound";
  
  public final static String INVALID_ENUMERATION = "invalid enumeration";
  
  public final static String INVALID_BINARYTYPE = "invalid binary operand type";
  
  public final static String WRONG_TYPE = "dk.itu.smdp2015.church.WrongType";
  
  public final static String OPTIONAL_PARAMETER_INVALID = "optional Parameter invalid";
  
  public final static String PARAMETER_NAME_NOT_UNIQUE = "parameter name not unique";
  
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Inject
  @Extension
  private ExpressionValueProvider _expressionValueProvider;
  
  @Check
  public void checkEnumeratedExpressionIsConstant(final Enumerated it) {
    EList<Expression> _values = it.getValues();
    final Consumer<Expression> _function = new Consumer<Expression>() {
      public void accept(final Expression it) {
        Object _staticValue = ConfiguratorValidator.this._expressionValueProvider.staticValue(it);
        boolean _equals = Objects.equal(_staticValue, null);
        if (_equals) {
          ConfiguratorValidator.this.error("Enumerated item should be a constant.", ConfiguratorPackage.Literals.ENUMERATED__VALUES, 
            ConfiguratorValidator.INVALID_ENUMERATION);
        }
      }
    };
    _values.forEach(_function);
  }
  
  @Check
  public void checkBoundedExpressionUpperBoundIsConstant(final Bounded bounded) {
    Expression _upperBound = bounded.getUpperBound();
    Object _staticValue = this._expressionValueProvider.staticValue(_upperBound);
    boolean _equals = Objects.equal(_staticValue, null);
    if (_equals) {
      this.error("Upper bound should be a constant.", ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND, 
        ConfiguratorValidator.INVALID_BOUND);
    }
  }
  
  @Check
  public void checkBoundedExpressionLowerBoundIsConstant(final Bounded bounded) {
    Expression _lowerBound = bounded.getLowerBound();
    Object _staticValue = this._expressionValueProvider.staticValue(_lowerBound);
    boolean _equals = Objects.equal(_staticValue, null);
    if (_equals) {
      this.error("Lower bound should be a constant.", ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND, 
        ConfiguratorValidator.INVALID_BOUND);
    }
  }
  
  @Check
  public void checkBoundedExpressionLowerIsBelowUpper(final Bounded bounded) {
    Expression _lowerBound = bounded.getLowerBound();
    Object _staticValue = null;
    if (_lowerBound!=null) {
      _staticValue=this._expressionValueProvider.staticValue(_lowerBound);
    }
    final Object lowerVal = _staticValue;
    Expression _upperBound = bounded.getUpperBound();
    Object _staticValue_1 = null;
    if (_upperBound!=null) {
      _staticValue_1=this._expressionValueProvider.staticValue(_upperBound);
    }
    final Object upperVal = _staticValue_1;
    int c = (-1);
    boolean _and = false;
    if (!(lowerVal instanceof Integer)) {
      _and = false;
    } else {
      _and = (upperVal instanceof Integer);
    }
    if (_and) {
      int _compareTo = ((Integer) lowerVal).compareTo(((Integer) upperVal));
      c = _compareTo;
    }
    boolean _and_1 = false;
    if (!(lowerVal instanceof String)) {
      _and_1 = false;
    } else {
      _and_1 = (upperVal instanceof String);
    }
    if (_and_1) {
      int _compareTo_1 = ((String) lowerVal).compareTo(((String) upperVal));
      c = _compareTo_1;
    }
    boolean _and_2 = false;
    if (!(lowerVal instanceof Boolean)) {
      _and_2 = false;
    } else {
      _and_2 = (upperVal instanceof Boolean);
    }
    if (_and_2) {
      int _compareTo_2 = ((Boolean) lowerVal).compareTo(((Boolean) upperVal));
      c = _compareTo_2;
    }
    if ((c >= 0)) {
      this.error("Lower bound should be less than upper bound", ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND, 
        ConfiguratorValidator.INVALID_BOUND);
    }
  }
  
  @Check
  public void checkEnumeratedSequence(final Enumerated enumerated) {
    EList<Expression> _values = enumerated.getValues();
    final Consumer<Expression> _function = new Consumer<Expression>() {
      public void accept(final Expression v) {
        EList<Expression> _values = enumerated.getValues();
        final Function1<Expression, Boolean> _function = new Function1<Expression, Boolean>() {
          public Boolean apply(final Expression it) {
            Object _staticValue = ConfiguratorValidator.this._expressionValueProvider.staticValue(it);
            Object _staticValue_1 = ConfiguratorValidator.this._expressionValueProvider.staticValue(v);
            return Boolean.valueOf(Objects.equal(_staticValue, _staticValue_1));
          }
        };
        Iterable<Expression> _filter = IterableExtensions.<Expression>filter(_values, _function);
        int _size = IterableExtensions.size(_filter);
        boolean _notEquals = (_size != 1);
        if (_notEquals) {
          ConfiguratorValidator.this.error("Enumerated values should be unique", ConfiguratorPackage.Literals.ENUMERATED__VALUES, 
            ConfiguratorValidator.INVALID_ENUMERATION);
        }
      }
    };
    _values.forEach(_function);
  }
  
  @Check
  public void checkType(final Constraint constraint) {
    final EReference literal = ConfiguratorPackage.Literals.CONSTRAINT__EXPRESSION;
    Expression _expression = constraint.getExpression();
    final ExpressionType type = this.getTypeAndCheckNotNull(_expression, literal);
    this.checkExpectedType(type, ExpressionType.Boolean, literal);
  }
  
  @Check
  public void checkType(final Binary binary) {
    final EReference leftLiteral = ConfiguratorPackage.Literals.BINARY__LEFT;
    final EReference rightLiteral = ConfiguratorPackage.Literals.BINARY__RIGHT;
    final EAttribute binaryLiteral = ConfiguratorPackage.Literals.BINARY__OPERATOR;
    Expression _left = binary.getLeft();
    final ExpressionType leftType = this.getTypeAndCheckNotNull(_left, leftLiteral);
    Expression _right = binary.getRight();
    final ExpressionType rightType = this.getTypeAndCheckNotNull(_right, rightLiteral);
    BinaryOperator _operator = binary.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case ADDITION:
          this.checkExpectedType(leftType, ExpressionType.Integer, leftLiteral);
          this.checkExpectedType(rightType, ExpressionType.Integer, rightLiteral);
          break;
        case LOGICAL_AND:
          this.checkExpectedType(leftType, ExpressionType.Boolean, leftLiteral);
          this.checkExpectedType(rightType, ExpressionType.Boolean, rightLiteral);
          break;
        case LOGICAL_OR:
          this.checkExpectedType(leftType, ExpressionType.Boolean, leftLiteral);
          this.checkExpectedType(rightType, ExpressionType.Boolean, rightLiteral);
          break;
        case EQUAL:
          boolean _notEquals = (!Objects.equal(leftType, rightType));
          if (_notEquals) {
            this.error(((("expected the same type, but the types are " + leftType) + " and ") + rightType), binaryLiteral, 
              ConfiguratorValidator.WRONG_TYPE);
          }
          break;
        case GREATER_THAN:
          this.checkExpectedType(leftType, ExpressionType.Integer, leftLiteral);
          this.checkExpectedType(rightType, ExpressionType.Integer, rightLiteral);
          break;
        case LESS_THAN:
          this.checkExpectedType(leftType, ExpressionType.Integer, leftLiteral);
          this.checkExpectedType(rightType, ExpressionType.Integer, rightLiteral);
          break;
        case MULTIPLICATION:
          this.checkExpectedType(leftType, ExpressionType.Integer, leftLiteral);
          this.checkExpectedType(rightType, ExpressionType.Integer, rightLiteral);
          break;
        case NOT_EQUAL:
          boolean _notEquals_1 = (!Objects.equal(leftType, rightType));
          if (_notEquals_1) {
            this.error(((("expected the same type, but the types are " + leftType) + " and ") + rightType), binaryLiteral, 
              ConfiguratorValidator.WRONG_TYPE);
          }
          break;
        case SUBTRACTION:
          this.checkExpectedType(leftType, ExpressionType.Integer, leftLiteral);
          this.checkExpectedType(rightType, ExpressionType.Integer, rightLiteral);
          break;
        default:
          break;
      }
    }
  }
  
  @Check
  public void checkType(final Unary unary) {
    final EReference innerLiteral = ConfiguratorPackage.Literals.UNARY__INNER;
    Expression _inner = unary.getInner();
    final ExpressionType innerType = this.getTypeAndCheckNotNull(_inner, innerLiteral);
    UnaryOperator _operator = unary.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case INVERSION:
          this.checkExpectedType(innerType, ExpressionType.Integer, innerLiteral);
          break;
        case LOGICAL_NOT:
          this.checkExpectedType(innerType, ExpressionType.Boolean, innerLiteral);
          break;
        default:
          break;
      }
    }
  }
  
  @Check
  public void checkType(final InRange inRange) {
    final EReference leftLiteral = ConfiguratorPackage.Literals.IN_RANGE__PARAMETER;
    final EReference rightLiteral = ConfiguratorPackage.Literals.IN_RANGE__RANGE;
    Parameter _parameter = inRange.getParameter();
    ValueRange _valueRange = _parameter.getValueRange();
    final ExpressionType leftType = this.getTypeAndCheckNotNull(_valueRange, leftLiteral);
    ValueRange _range = inRange.getRange();
    final ExpressionType rightType = this.getTypeAndCheckNotNull(_range, rightLiteral);
    boolean _notEquals = (!Objects.equal(leftType, rightType));
    if (_notEquals) {
      this.error(((("expected the same type, but the types are " + leftType) + " and ") + rightType), rightLiteral, 
        ConfiguratorValidator.WRONG_TYPE);
    }
  }
  
  @Check
  public void checkType(final Enumerated range) {
    EList<Expression> _values = range.getValues();
    Expression _get = _values.get(0);
    final ExpressionType firstType = this.getTypeAndCheckNotNull(_get, ConfiguratorPackage.Literals.ENUMERATED__VALUES);
    EList<Expression> _values_1 = range.getValues();
    final Consumer<Expression> _function = new Consumer<Expression>() {
      public void accept(final Expression it) {
        final ExpressionType nextType = ConfiguratorValidator.this.getTypeAndCheckNotNull(it, ConfiguratorPackage.Literals.ENUMERATED__VALUES);
        boolean _notEquals = (!Objects.equal(firstType, nextType));
        if (_notEquals) {
          ConfiguratorValidator.this.error(((("expected the same type, but the types are " + firstType) + " and ") + nextType), 
            ConfiguratorPackage.Literals.ENUMERATED__VALUES, ConfiguratorValidator.WRONG_TYPE);
        }
      }
    };
    _values_1.forEach(_function);
  }
  
  @Check
  public void checkType(final Bounded range) {
    Expression _lowerBound = range.getLowerBound();
    final ExpressionType lowerType = this.getTypeAndCheckNotNull(_lowerBound, ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND);
    Expression _upperBound = range.getUpperBound();
    final ExpressionType upperType = this.getTypeAndCheckNotNull(_upperBound, ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND);
    boolean _notEquals = (!Objects.equal(lowerType, upperType));
    if (_notEquals) {
      this.error(((("expected the same type, but the types are " + lowerType) + " and ") + upperType), 
        ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND, ConfiguratorValidator.WRONG_TYPE);
    }
  }
  
  @Check
  public void checkType(final Parameter parameter) {
    Expression _default = parameter.getDefault();
    boolean _notEquals = (!Objects.equal(_default, null));
    if (_notEquals) {
      Expression _default_1 = parameter.getDefault();
      final ExpressionType defType = this.getTypeAndCheckNotNull(_default_1, ConfiguratorPackage.Literals.PARAMETER__DEFAULT);
      ValueRange _valueRange = parameter.getValueRange();
      final ExpressionType rangeType = this.getTypeAndCheckNotNull(_valueRange, 
        ConfiguratorPackage.Literals.PARAMETER__VALUE_RANGE);
      boolean _notEquals_1 = (!Objects.equal(defType, rangeType));
      if (_notEquals_1) {
        this.error(((("expected the same type, but the types are " + defType) + " and ") + rangeType), 
          ConfiguratorPackage.Literals.PARAMETER__DEFAULT, ConfiguratorValidator.WRONG_TYPE);
      }
    }
  }
  
  @Check
  public void checkDefaultValue(final Parameter parameter) {
    Expression _default = parameter.getDefault();
    boolean _notEquals = (!Objects.equal(_default, null));
    if (_notEquals) {
      Expression _default_1 = parameter.getDefault();
      final Object defVal = this._expressionValueProvider.staticValue(_default_1);
      final ValueRange range = parameter.getValueRange();
      boolean _matched = false;
      if (!_matched) {
        if (range instanceof Enumerated) {
          _matched=true;
          EList<Expression> _values = ((Enumerated)range).getValues();
          final Function1<Expression, Boolean> _function = new Function1<Expression, Boolean>() {
            public Boolean apply(final Expression it) {
              Object _staticValue = ConfiguratorValidator.this._expressionValueProvider.staticValue(it);
              return Boolean.valueOf(Objects.equal(_staticValue, defVal));
            }
          };
          boolean _exists = IterableExtensions.<Expression>exists(_values, _function);
          boolean _not = (!_exists);
          if (_not) {
            this.error("Default value should be among the listed values", 
              ConfiguratorPackage.Literals.PARAMETER__DEFAULT, ConfiguratorValidator.INVALID_BOUND);
          }
        }
      }
      if (!_matched) {
        if (range instanceof Bounded) {
          _matched=true;
          boolean defaultValueIsValid = true;
          Expression _lowerBound = ((Bounded)range).getLowerBound();
          Object _staticValue = this._expressionValueProvider.staticValue(_lowerBound);
          if ((_staticValue instanceof Integer)) {
            boolean _and = false;
            Expression _lowerBound_1 = ((Bounded)range).getLowerBound();
            Object _staticValue_1 = this._expressionValueProvider.staticValue(_lowerBound_1);
            boolean _lessEqualsThan = (((Integer) _staticValue_1).compareTo(((Integer) defVal)) <= 0);
            if (!_lessEqualsThan) {
              _and = false;
            } else {
              Expression _upperBound = ((Bounded)range).getUpperBound();
              Object _staticValue_2 = this._expressionValueProvider.staticValue(_upperBound);
              boolean _greaterEqualsThan = (((Integer) _staticValue_2).compareTo(((Integer) defVal)) >= 0);
              _and = _greaterEqualsThan;
            }
            defaultValueIsValid = _and;
          } else {
            Expression _lowerBound_2 = ((Bounded)range).getLowerBound();
            Object _staticValue_3 = this._expressionValueProvider.staticValue(_lowerBound_2);
            if ((_staticValue_3 instanceof String)) {
              boolean _and_1 = false;
              Expression _lowerBound_3 = ((Bounded)range).getLowerBound();
              Object _staticValue_4 = this._expressionValueProvider.staticValue(_lowerBound_3);
              boolean _lessEqualsThan_1 = (((String) _staticValue_4).compareTo(((String) defVal)) <= 0);
              if (!_lessEqualsThan_1) {
                _and_1 = false;
              } else {
                Expression _upperBound_1 = ((Bounded)range).getUpperBound();
                Object _staticValue_5 = this._expressionValueProvider.staticValue(_upperBound_1);
                boolean _greaterEqualsThan_1 = (((String) _staticValue_5).compareTo(((String) defVal)) >= 0);
                _and_1 = _greaterEqualsThan_1;
              }
              defaultValueIsValid = _and_1;
            }
          }
          if ((!defaultValueIsValid)) {
            this.error("Default value should be within the specified value range", ConfiguratorPackage.Literals.PARAMETER__DEFAULT, ConfiguratorValidator.INVALID_BOUND);
          }
        }
      }
    }
  }
  
  @Check
  public void checkIdentifierOptional(final Identifier identifier) {
    Parameter _id = identifier.getId();
    boolean _isOptional = _id.isOptional();
    if (_isOptional) {
      this.error("Identifier cannot refer to an optional parameter", ConfiguratorPackage.Literals.IDENTIFIER__ID, ConfiguratorValidator.OPTIONAL_PARAMETER_INVALID);
    }
  }
  
  @Check
  public void checkInRangeOptional(final InRange inRange) {
    Parameter _parameter = inRange.getParameter();
    boolean _isOptional = _parameter.isOptional();
    if (_isOptional) {
      this.error("Identifier cannot refer to an optional parameter", ConfiguratorPackage.Literals.IN_RANGE__PARAMETER, ConfiguratorValidator.OPTIONAL_PARAMETER_INVALID);
    }
  }
  
  @Check
  public void checkUniqueParameterNames(final Configurator configurator) {
    EList<AbstractParameter> _parameters = configurator.getParameters();
    List<String> params = this.names(_parameters);
    final List<String> _converted_params = (List<String>)params;
    int _length = ((Object[])Conversions.unwrapArray(_converted_params, Object.class)).length;
    Set<String> _set = IterableExtensions.<String>toSet(params);
    int _length_1 = ((Object[])Conversions.unwrapArray(_set, Object.class)).length;
    boolean _notEquals = (_length != _length_1);
    if (_notEquals) {
      this.error("All parameters and parameter groups must have globally unique names", ConfiguratorPackage.Literals.NAMED_ELEMENT__NAME, ConfiguratorValidator.PARAMETER_NAME_NOT_UNIQUE);
    }
  }
  
  private List<String> names(final EList<AbstractParameter> it) {
    ArrayList<String> _xblockexpression = null;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final Function2<ArrayList<String>, AbstractParameter, ArrayList<String>> _function = new Function2<ArrayList<String>, AbstractParameter, ArrayList<String>>() {
        public ArrayList<String> apply(final ArrayList<String> parameterNames, final AbstractParameter abstractParameter) {
          ArrayList<String> _xblockexpression = null;
          {
            String _name = abstractParameter.getName();
            parameterNames.add(_name);
            _xblockexpression = parameterNames;
          }
          return _xblockexpression;
        }
      };
      ArrayList<String> paramNames = IterableExtensions.<AbstractParameter, ArrayList<String>>fold(it, _arrayList, _function);
      Iterable<ParameterGroup> _filter = Iterables.<ParameterGroup>filter(it, ParameterGroup.class);
      ArrayList<String> _arrayList_1 = new ArrayList<String>();
      final Function2<ArrayList<String>, ParameterGroup, ArrayList<String>> _function_1 = new Function2<ArrayList<String>, ParameterGroup, ArrayList<String>>() {
        public ArrayList<String> apply(final ArrayList<String> parameterNames, final ParameterGroup parameterGroup) {
          ArrayList<String> _xblockexpression = null;
          {
            EList<AbstractParameter> _parameters = parameterGroup.getParameters();
            List<String> _names = ConfiguratorValidator.this.names(_parameters);
            parameterNames.addAll(_names);
            _xblockexpression = parameterNames;
          }
          return _xblockexpression;
        }
      };
      ArrayList<String> _fold = IterableExtensions.<ParameterGroup, ArrayList<String>>fold(_filter, _arrayList_1, _function_1);
      paramNames.addAll(_fold);
      _xblockexpression = paramNames;
    }
    return _xblockexpression;
  }
  
  private void checkExpectedType(final ExpressionType actualType, final ExpressionType expectedType, final EReference reference) {
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      this.error(((("expected type " + expectedType) + ", actual type is ") + actualType), reference, ConfiguratorValidator.WRONG_TYPE);
    }
  }
  
  private ExpressionType getTypeAndCheckNotNull(final Expression expression, final EReference reference) {
    ExpressionType _xblockexpression = null;
    {
      ExpressionType _typeFor = null;
      if (expression!=null) {
        _typeFor=this._expressionTypeProvider.typeFor(expression);
      }
      ExpressionType type = _typeFor;
      boolean _equals = Objects.equal(type, null);
      if (_equals) {
        this.error("unknown type", reference, ConfiguratorValidator.WRONG_TYPE);
      }
      _xblockexpression = type;
    }
    return _xblockexpression;
  }
  
  private ExpressionType getTypeAndCheckNotNull(final ValueRange range, final EReference reference) {
    ExpressionType _xblockexpression = null;
    {
      ExpressionType _rangeType = null;
      if (range!=null) {
        _rangeType=this._expressionTypeProvider.rangeType(range);
      }
      ExpressionType type = _rangeType;
      boolean _equals = Objects.equal(type, null);
      if (_equals) {
        this.error("unknown type", reference, ConfiguratorValidator.WRONG_TYPE);
      }
      _xblockexpression = type;
    }
    return _xblockexpression;
  }
}
