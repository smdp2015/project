package dk.itu.smdp2015.church.xtext.common;

import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Constant;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.InRange;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.UnaryOperator;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import dk.itu.smdp2015.church.xtext.common.ExpressionType;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ExpressionTypeProvider {
  protected ExpressionType _typeFor(final Constant constant) {
    ExpressionType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (constant instanceof dk.itu.smdp2015.church.model.configurator.String) {
        _matched=true;
        _switchResult = ExpressionType.String;
      }
    }
    if (!_matched) {
      if (constant instanceof dk.itu.smdp2015.church.model.configurator.Boolean) {
        _matched=true;
        _switchResult = ExpressionType.Boolean;
      }
    }
    if (!_matched) {
      if (constant instanceof dk.itu.smdp2015.church.model.configurator.Integer) {
        _matched=true;
        _switchResult = ExpressionType.Integer;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionType _typeFor(final Binary binary) {
    ExpressionType _switchResult = null;
    BinaryOperator _operator = binary.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case ADDITION:
          _switchResult = ExpressionType.Integer;
          break;
        case LOGICAL_AND:
          _switchResult = ExpressionType.Boolean;
          break;
        case LOGICAL_OR:
          _switchResult = ExpressionType.Boolean;
          break;
        case EQUAL:
          _switchResult = ExpressionType.Boolean;
          break;
        case GREATER_THAN:
          _switchResult = ExpressionType.Boolean;
          break;
        case LESS_THAN:
          _switchResult = ExpressionType.Boolean;
          break;
        case MULTIPLICATION:
          _switchResult = ExpressionType.Integer;
          break;
        case NOT_EQUAL:
          _switchResult = ExpressionType.Boolean;
          break;
        case SUBTRACTION:
          _switchResult = ExpressionType.Integer;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionType _typeFor(final Unary unary) {
    ExpressionType _switchResult = null;
    UnaryOperator _operator = unary.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case INVERSION:
          _switchResult = ExpressionType.Integer;
          break;
        case LOGICAL_NOT:
          _switchResult = ExpressionType.Boolean;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionType _typeFor(final InRange inrange) {
    return ExpressionType.Boolean;
  }
  
  protected ExpressionType _typeFor(final Identifier identifier) {
    Parameter _id = identifier.getId();
    ValueRange _valueRange = _id.getValueRange();
    ExpressionType _rangeType = null;
    if (_valueRange!=null) {
      _rangeType=this.rangeType(_valueRange);
    }
    return _rangeType;
  }
  
  protected ExpressionType _typeFor(final dk.itu.smdp2015.church.model.configurator.Integer integerVal) {
    return ExpressionType.Integer;
  }
  
  protected ExpressionType _typeFor(final dk.itu.smdp2015.church.model.configurator.Boolean booleanVal) {
    return ExpressionType.Boolean;
  }
  
  protected ExpressionType _typeFor(final dk.itu.smdp2015.church.model.configurator.String stringVal) {
    return ExpressionType.String;
  }
  
  public ExpressionType rangeType(final ValueRange range) {
    ExpressionType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (range instanceof Enumerated) {
        _matched=true;
        EList<Expression> _values = ((Enumerated)range).getValues();
        Expression _get = _values.get(0);
        ExpressionType _typeFor = null;
        if (_get!=null) {
          _typeFor=this.typeFor(_get);
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (range instanceof Bounded) {
        _matched=true;
        Expression _lowerBound = ((Bounded)range).getLowerBound();
        ExpressionType _typeFor = null;
        if (_lowerBound!=null) {
          _typeFor=this.typeFor(_lowerBound);
        }
        _switchResult = _typeFor;
      }
    }
    return _switchResult;
  }
  
  public ExpressionType typeFor(final Expression booleanVal) {
    if (booleanVal instanceof dk.itu.smdp2015.church.model.configurator.Boolean) {
      return _typeFor((dk.itu.smdp2015.church.model.configurator.Boolean)booleanVal);
    } else if (booleanVal instanceof dk.itu.smdp2015.church.model.configurator.Integer) {
      return _typeFor((dk.itu.smdp2015.church.model.configurator.Integer)booleanVal);
    } else if (booleanVal instanceof dk.itu.smdp2015.church.model.configurator.String) {
      return _typeFor((dk.itu.smdp2015.church.model.configurator.String)booleanVal);
    } else if (booleanVal instanceof Binary) {
      return _typeFor((Binary)booleanVal);
    } else if (booleanVal instanceof Constant) {
      return _typeFor((Constant)booleanVal);
    } else if (booleanVal instanceof Identifier) {
      return _typeFor((Identifier)booleanVal);
    } else if (booleanVal instanceof InRange) {
      return _typeFor((InRange)booleanVal);
    } else if (booleanVal instanceof Unary) {
      return _typeFor((Unary)booleanVal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(booleanVal).toString());
    }
  }
}
