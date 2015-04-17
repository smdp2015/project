package dk.itu.smdp2015.church.validation;

import com.google.common.base.Objects;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.BinaryOperator;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.Constraint;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.model.configurator.UnaryOperator;
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
public class ConfiguratorTypeValidator extends AbstractConfiguratorValidator {
  public final static String WRONG_TYPE = "dk.itu.smdp2015.church.WrongType";
  
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  @Check
  public void cwheckType(final Constraint constraint) {
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
              ConfiguratorTypeValidator.WRONG_TYPE);
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
              ConfiguratorTypeValidator.WRONG_TYPE);
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
            ConfiguratorPackage.Literals.ENUMERATED__VALUES, ConfiguratorTypeValidator.WRONG_TYPE);
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
        ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND, ConfiguratorTypeValidator.WRONG_TYPE);
    }
  }
  
  private void checkExpectedType(final ExpressionType actualType, final ExpressionType expectedType, final EReference reference) {
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      this.error(((("expected type " + expectedType) + ", actual type is ") + actualType), reference, ConfiguratorTypeValidator.WRONG_TYPE);
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
        this.error("unknown type", reference, ConfiguratorTypeValidator.WRONG_TYPE);
      }
      _xblockexpression = type;
    }
    return _xblockexpression;
  }
}
