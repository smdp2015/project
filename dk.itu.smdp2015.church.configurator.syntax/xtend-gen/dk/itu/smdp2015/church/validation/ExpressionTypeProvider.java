package dk.itu.smdp2015.church.validation;

import com.google.common.base.Objects;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Constant;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.InRange;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.Scalar;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.UnaryOperator;
import dk.itu.smdp2015.church.model.configurator.ValueRange;
import dk.itu.smdp2015.church.validation.ExpressionType;
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
    if (!_matched) {
      if (constant instanceof dk.itu.smdp2015.church.model.configurator.Double) {
        _matched=true;
        _switchResult = ExpressionType.Double;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionType _typeFor(final Binary binary) {
    ExpressionType _xblockexpression = null;
    {
      Expression _left = binary.getLeft();
      ExpressionType _typeFor = null;
      if (_left!=null) {
        _typeFor=this.typeFor(_left);
      }
      final ExpressionType leftType = _typeFor;
      Expression _right = binary.getRight();
      ExpressionType _typeFor_1 = null;
      if (_right!=null) {
        _typeFor_1=this.typeFor(_right);
      }
      final ExpressionType rightType = _typeFor_1;
      ExpressionType _switchResult = null;
      BinaryOperator _operator = binary.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case ADDITION:
            ExpressionType _xifexpression = null;
            boolean _or = false;
            boolean _equals = Objects.equal(leftType, ExpressionType.String);
            if (_equals) {
              _or = true;
            } else {
              boolean _equals_1 = Objects.equal(rightType, ExpressionType.String);
              _or = _equals_1;
            }
            if (_or) {
              _xifexpression = ExpressionType.String;
            } else {
              ExpressionType _xifexpression_1 = null;
              boolean _and = false;
              boolean _equals_2 = Objects.equal(leftType, ExpressionType.Integer);
              if (!_equals_2) {
                _and = false;
              } else {
                boolean _equals_3 = Objects.equal(rightType, ExpressionType.Integer);
                _and = _equals_3;
              }
              if (_and) {
                _xifexpression_1 = ExpressionType.Integer;
              } else {
                _xifexpression_1 = ExpressionType.Double;
              }
              _xifexpression = _xifexpression_1;
            }
            _switchResult = _xifexpression;
            break;
          case CONJUNCTION:
            _switchResult = ExpressionType.Boolean;
            break;
          case DISJUNCTION:
            _switchResult = ExpressionType.Boolean;
            break;
          case DIVISION:
            _switchResult = ExpressionType.Double;
            break;
          case EQUAL:
            _switchResult = ExpressionType.Boolean;
            break;
          case GREATER_THAN:
            _switchResult = ExpressionType.Boolean;
            break;
          case GREATER_THAN_EQUAL:
            _switchResult = ExpressionType.Boolean;
            break;
          case LESS_THAN:
            _switchResult = ExpressionType.Boolean;
            break;
          case LESS_THAN_EQUAL:
            _switchResult = ExpressionType.Boolean;
            break;
          case MULTIPLICATION:
            ExpressionType _xifexpression_2 = null;
            boolean _and_1 = false;
            boolean _equals_4 = Objects.equal(leftType, ExpressionType.Integer);
            if (!_equals_4) {
              _and_1 = false;
            } else {
              boolean _equals_5 = Objects.equal(rightType, ExpressionType.Integer);
              _and_1 = _equals_5;
            }
            if (_and_1) {
              _xifexpression_2 = ExpressionType.Integer;
            } else {
              _xifexpression_2 = ExpressionType.Double;
            }
            _switchResult = _xifexpression_2;
            break;
          case NOT_EQUAL:
            _switchResult = ExpressionType.Boolean;
            break;
          case SUBTRACTION:
            ExpressionType _xifexpression_3 = null;
            boolean _and_2 = false;
            boolean _equals_6 = Objects.equal(leftType, ExpressionType.Integer);
            if (!_equals_6) {
              _and_2 = false;
            } else {
              boolean _equals_7 = Objects.equal(rightType, ExpressionType.Integer);
              _and_2 = _equals_7;
            }
            if (_and_2) {
              _xifexpression_3 = ExpressionType.Integer;
            } else {
              _xifexpression_3 = ExpressionType.Double;
            }
            _switchResult = _xifexpression_3;
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected ExpressionType _typeFor(final Unary unary) {
    ExpressionType _xblockexpression = null;
    {
      Expression _inner = unary.getInner();
      ExpressionType _typeFor = null;
      if (_inner!=null) {
        _typeFor=this.typeFor(_inner);
      }
      final ExpressionType innerType = _typeFor;
      ExpressionType _switchResult = null;
      UnaryOperator _operator = unary.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case INVERSION:
            ExpressionType _xifexpression = null;
            boolean _equals = Objects.equal(innerType, ExpressionType.Double);
            if (_equals) {
              _xifexpression = ExpressionType.Double;
            } else {
              _xifexpression = ExpressionType.Integer;
            }
            _switchResult = _xifexpression;
            break;
          case NEGATION:
            _switchResult = ExpressionType.Boolean;
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected ExpressionType _typeFor(final InRange inrange) {
    return ExpressionType.Boolean;
  }
  
  protected ExpressionType _typeFor(final Identifier identifier) {
    ExpressionType _xblockexpression = null;
    {
      Parameter _id = identifier.getId();
      final ValueRange range = _id.getValueRange();
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
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected ExpressionType _typeFor(final Scalar scalar) {
    return ExpressionType.Double;
  }
  
  public ExpressionType typeFor(final Expression binary) {
    if (binary instanceof Binary) {
      return _typeFor((Binary)binary);
    } else if (binary instanceof Constant) {
      return _typeFor((Constant)binary);
    } else if (binary instanceof Identifier) {
      return _typeFor((Identifier)binary);
    } else if (binary instanceof InRange) {
      return _typeFor((InRange)binary);
    } else if (binary instanceof Scalar) {
      return _typeFor((Scalar)binary);
    } else if (binary instanceof Unary) {
      return _typeFor((Unary)binary);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(binary).toString());
    }
  }
}
