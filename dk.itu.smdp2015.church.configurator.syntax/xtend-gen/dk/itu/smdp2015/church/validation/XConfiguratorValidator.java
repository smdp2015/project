package dk.itu.smdp2015.church.validation;

import com.google.common.base.Objects;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.Constraint;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.validation.AbstractConfiguratorValidator;
import dk.itu.smdp2015.church.validation.ExpressionType;
import dk.itu.smdp2015.church.validation.ExpressionTypeProvider;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class XConfiguratorValidator extends AbstractConfiguratorValidator {
  public final static String WRONG_TYPE = "dk.itu.smdp2015.church.WrongType";
  
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Check
  public void checkType(final Constraint constraint) {
    Expression _expression = constraint.getExpression();
    this.checkExpectedBoolean(_expression, ConfiguratorPackage.Literals.CONSTRAINT__EXPRESSION);
  }
  
  @Check
  public Object checkType(final Binary binary) {
    Object _xblockexpression = null;
    {
      final EReference leftLiteral = ConfiguratorPackage.Literals.BINARY__LEFT;
      final EReference rightLiteral = ConfiguratorPackage.Literals.BINARY__RIGHT;
      final EAttribute binaryLiteral = ConfiguratorPackage.Literals.BINARY__OPERATOR;
      Object _switchResult = null;
      BinaryOperator _operator = binary.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case ADDITION:
            _switchResult = null;
            break;
          case LOGICAL_AND:
            Expression _left = binary.getLeft();
            this.checkExpectedBoolean(_left, leftLiteral);
            Expression _right = binary.getRight();
            this.checkExpectedBoolean(_right, rightLiteral);
            break;
          case LOGICAL_OR:
            Expression _left_1 = binary.getLeft();
            this.checkExpectedBoolean(_left_1, leftLiteral);
            Expression _right_1 = binary.getRight();
            this.checkExpectedBoolean(_right_1, rightLiteral);
            break;
          case EQUAL:
            Expression _left_2 = binary.getLeft();
            final ExpressionType leftType = this.getTypeAndCheckNotNull(_left_2, leftLiteral);
            Expression _right_2 = binary.getRight();
            final ExpressionType rightType = this.getTypeAndCheckNotNull(_right_2, rightLiteral);
            boolean _notEquals = (!Objects.equal(leftType, rightType));
            if (_notEquals) {
              this.error(((("expected the same type, but the types are " + leftType) + " and ") + rightType), binaryLiteral, 
                XConfiguratorValidator.WRONG_TYPE);
            }
            break;
          case GREATER_THAN:
            _switchResult = null;
            break;
          case LESS_THAN:
            _switchResult = null;
            break;
          case MULTIPLICATION:
            _switchResult = null;
            break;
          case NOT_EQUAL:
            _switchResult = null;
            break;
          case SUBTRACTION:
            _switchResult = null;
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkType(final Enumerated range) {
    EList<Expression> _values = range.getValues();
    Expression _get = _values.get(0);
    final ExpressionType firstType = this.getTypeAndCheckNotNull(_get, ConfiguratorPackage.Literals.ENUMERATED__VALUES);
    EList<Expression> _values_1 = range.getValues();
    for (final Expression value : _values_1) {
      {
        final ExpressionType nextType = this.getTypeAndCheckNotNull(value, ConfiguratorPackage.Literals.ENUMERATED__VALUES);
        boolean _notEquals = (!Objects.equal(firstType, nextType));
        if (_notEquals) {
          this.error(((("expected the same type, but the types are " + firstType) + " and ") + nextType), 
            ConfiguratorPackage.Literals.ENUMERATED__VALUES, XConfiguratorValidator.WRONG_TYPE);
        }
      }
    }
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
        ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND, XConfiguratorValidator.WRONG_TYPE);
    }
  }
  
  private void checkExpectedBoolean(final Expression exp, final EReference reference) {
    this.checkExpectedType(exp, ExpressionType.Boolean, reference);
  }
  
  private void checkExpectedType(final Expression expression, final ExpressionType expectedType, final EReference reference) {
    final ExpressionType actualType = this.getTypeAndCheckNotNull(expression, reference);
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      this.error(((("expected type " + expectedType) + ", actual type is ") + actualType), reference, XConfiguratorValidator.WRONG_TYPE);
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
        this.error("unknown", reference, XConfiguratorValidator.WRONG_TYPE);
      }
      _xblockexpression = type;
    }
    return _xblockexpression;
  }
}
