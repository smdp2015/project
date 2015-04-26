package dk.itu.smdp2015.church.validation;

import com.google.common.base.Objects;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Constant;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.InRange;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.UnaryOperator;
import dk.itu.smdp2015.church.xtext.common.ExpressionType;
import java.util.Arrays;

@SuppressWarnings("all")
public class ExpressionValueProvider {
  protected Object _staticValue(final Constant constant) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (constant instanceof dk.itu.smdp2015.church.model.configurator.String) {
        _matched=true;
        _switchResult = ((dk.itu.smdp2015.church.model.configurator.String)constant).getValue();
      }
    }
    if (!_matched) {
      if (constant instanceof dk.itu.smdp2015.church.model.configurator.Boolean) {
        _matched=true;
        _switchResult = Boolean.valueOf(((dk.itu.smdp2015.church.model.configurator.Boolean)constant).isValue());
      }
    }
    if (!_matched) {
      if (constant instanceof dk.itu.smdp2015.church.model.configurator.Integer) {
        _matched=true;
        _switchResult = Integer.valueOf(((dk.itu.smdp2015.church.model.configurator.Integer)constant).getValue());
      }
    }
    return ((Comparable<?>)_switchResult);
  }
  
  protected Object _staticValue(final Binary binary) {
    Object _xblockexpression = null;
    {
      Expression _left = binary.getLeft();
      final Object vleft = this.staticValue(_left);
      Expression _right = binary.getRight();
      final Object vright = this.staticValue(_right);
      Object _switchResult = null;
      BinaryOperator _operator = binary.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case ADDITION:
            Integer _xifexpression = null;
            boolean _and = false;
            if (!(vleft instanceof Integer)) {
              _and = false;
            } else {
              _and = (vright instanceof Integer);
            }
            if (_and) {
              Integer _xblockexpression_1 = null;
              {
                final int ileft = ((Integer) vleft).intValue();
                final int iright = ((Integer) vright).intValue();
                _xblockexpression_1 = new Integer((ileft + iright));
              }
              _xifexpression = _xblockexpression_1;
            }
            _switchResult = _xifexpression;
            break;
          case LOGICAL_AND:
            Boolean _xifexpression_1 = null;
            boolean _and_1 = false;
            if (!(vleft instanceof Boolean)) {
              _and_1 = false;
            } else {
              _and_1 = (vright instanceof Boolean);
            }
            if (_and_1) {
              Boolean _xblockexpression_2 = null;
              {
                final boolean bleft = ((Boolean) vleft).booleanValue();
                final boolean bright = ((Boolean) vright).booleanValue();
                _xblockexpression_2 = new Boolean((bleft && bright));
              }
              _xifexpression_1 = _xblockexpression_2;
            }
            _switchResult = _xifexpression_1;
            break;
          case LOGICAL_OR:
            Boolean _xifexpression_2 = null;
            boolean _and_2 = false;
            if (!(vleft instanceof Boolean)) {
              _and_2 = false;
            } else {
              _and_2 = (vright instanceof Boolean);
            }
            if (_and_2) {
              Boolean _xblockexpression_3 = null;
              {
                final boolean bleft = ((Boolean) vleft).booleanValue();
                final boolean bright = ((Boolean) vright).booleanValue();
                _xblockexpression_3 = new Boolean((bleft || bright));
              }
              _xifexpression_2 = _xblockexpression_3;
            }
            _switchResult = _xifexpression_2;
            break;
          case EQUAL:
            Boolean _xifexpression_3 = null;
            boolean _and_3 = false;
            boolean _notEquals = (!Objects.equal(vleft, null));
            if (!_notEquals) {
              _and_3 = false;
            } else {
              Class<?> _class = vleft.getClass();
              Class<?> _class_1 = vright.getClass();
              boolean _equals = _class.equals(_class_1);
              _and_3 = _equals;
            }
            if (_and_3) {
              boolean _equals_1 = vleft.equals(vright);
              _xifexpression_3 = new Boolean(_equals_1);
            }
            _switchResult = _xifexpression_3;
            break;
          case GREATER_THAN:
            Boolean _xifexpression_4 = null;
            boolean _and_4 = false;
            if (!(vleft instanceof Integer)) {
              _and_4 = false;
            } else {
              _and_4 = (vright instanceof Integer);
            }
            if (_and_4) {
              Boolean _xblockexpression_4 = null;
              {
                final int ileft = ((Integer) vleft).intValue();
                final int iright = ((Integer) vright).intValue();
                _xblockexpression_4 = new Boolean((ileft > iright));
              }
              _xifexpression_4 = _xblockexpression_4;
            }
            _switchResult = _xifexpression_4;
            break;
          case LESS_THAN:
            Boolean _xifexpression_5 = null;
            boolean _and_5 = false;
            if (!(vleft instanceof Integer)) {
              _and_5 = false;
            } else {
              _and_5 = (vright instanceof Integer);
            }
            if (_and_5) {
              Boolean _xblockexpression_5 = null;
              {
                final int ileft = ((Integer) vleft).intValue();
                final int iright = ((Integer) vright).intValue();
                _xblockexpression_5 = new Boolean((ileft > iright));
              }
              _xifexpression_5 = _xblockexpression_5;
            }
            _switchResult = _xifexpression_5;
            break;
          case MULTIPLICATION:
            Integer _xifexpression_6 = null;
            boolean _and_6 = false;
            if (!(vleft instanceof Integer)) {
              _and_6 = false;
            } else {
              _and_6 = (vright instanceof Integer);
            }
            if (_and_6) {
              Integer _xblockexpression_6 = null;
              {
                final int ileft = ((Integer) vleft).intValue();
                final int iright = ((Integer) vright).intValue();
                _xblockexpression_6 = new Integer((ileft * iright));
              }
              _xifexpression_6 = _xblockexpression_6;
            }
            _switchResult = _xifexpression_6;
            break;
          case NOT_EQUAL:
            Boolean _xifexpression_7 = null;
            boolean _and_7 = false;
            boolean _notEquals_1 = (!Objects.equal(vleft, null));
            if (!_notEquals_1) {
              _and_7 = false;
            } else {
              Class<?> _class_2 = vleft.getClass();
              Class<?> _class_3 = vright.getClass();
              boolean _equals_2 = _class_2.equals(_class_3);
              _and_7 = _equals_2;
            }
            if (_and_7) {
              boolean _equals_3 = vleft.equals(vright);
              boolean _not = (!_equals_3);
              _xifexpression_7 = new Boolean(_not);
            }
            _switchResult = _xifexpression_7;
            break;
          case SUBTRACTION:
            Integer _xifexpression_8 = null;
            boolean _and_8 = false;
            if (!(vleft instanceof Integer)) {
              _and_8 = false;
            } else {
              _and_8 = (vright instanceof Integer);
            }
            if (_and_8) {
              Integer _xblockexpression_7 = null;
              {
                final int ileft = ((Integer) vleft).intValue();
                final int iright = ((Integer) vright).intValue();
                _xblockexpression_7 = new Integer((ileft - iright));
              }
              _xifexpression_8 = _xblockexpression_7;
            }
            _switchResult = _xifexpression_8;
            break;
          default:
            break;
        }
      }
      _xblockexpression = ((Object)_switchResult);
    }
    return ((Comparable<?>)_xblockexpression);
  }
  
  protected Object _staticValue(final Unary unary) {
    Object _xblockexpression = null;
    {
      Expression _inner = unary.getInner();
      final Object vinner = this.staticValue(_inner);
      Object _switchResult = null;
      UnaryOperator _operator = unary.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case INVERSION:
            Integer _xifexpression = null;
            if ((vinner instanceof Integer)) {
              Integer _xblockexpression_1 = null;
              {
                final int iinner = ((Integer) vinner).intValue();
                _xblockexpression_1 = new Integer((-iinner));
              }
              _xifexpression = _xblockexpression_1;
            }
            _switchResult = _xifexpression;
            break;
          case LOGICAL_NOT:
            Boolean _xifexpression_1 = null;
            if ((vinner instanceof Boolean)) {
              Boolean _xblockexpression_2 = null;
              {
                final boolean binner = ((Boolean) vinner).booleanValue();
                _xblockexpression_2 = new Boolean((!binner));
              }
              _xifexpression_1 = _xblockexpression_2;
            }
            _switchResult = _xifexpression_1;
            break;
          default:
            break;
        }
      }
      _xblockexpression = ((Object)_switchResult);
    }
    return ((Comparable<?>)_xblockexpression);
  }
  
  protected ExpressionType _staticValue(final InRange inrange) {
    return null;
  }
  
  protected ExpressionType _staticValue(final Identifier identifier) {
    return null;
  }
  
  public Object staticValue(final Expression binary) {
    if (binary instanceof Binary) {
      return _staticValue((Binary)binary);
    } else if (binary instanceof Constant) {
      return _staticValue((Constant)binary);
    } else if (binary instanceof Identifier) {
      return _staticValue((Identifier)binary);
    } else if (binary instanceof InRange) {
      return _staticValue((InRange)binary);
    } else if (binary instanceof Unary) {
      return _staticValue((Unary)binary);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(binary).toString());
    }
  }
}
