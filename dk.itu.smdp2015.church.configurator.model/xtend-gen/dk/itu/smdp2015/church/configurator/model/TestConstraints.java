package dk.itu.smdp2015.church.configurator.model;

import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.Expression;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TestConstraints {
  protected static boolean _constraint(final Configurator it) {
    boolean _and = false;
    EList<AbstractParameter> _parameters = it.getParameters();
    boolean _isEmpty = _parameters.isEmpty();
    boolean _not = (!_isEmpty);
    if (!_not) {
      _and = false;
    } else {
      String _name = it.getName();
      boolean _isEmpty_1 = _name.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      _and = _not_1;
    }
    return _and;
  }
  
  protected static boolean _constraint(final Parameter it) {
    String _name = it.getName();
    boolean _isEmpty = _name.isEmpty();
    return (!_isEmpty);
  }
  
  protected static boolean _constraint(final ParameterGroup it) {
    boolean _and = false;
    EList<AbstractParameter> _parameters = it.getParameters();
    boolean _isEmpty = _parameters.isEmpty();
    boolean _not = (!_isEmpty);
    if (!_not) {
      _and = false;
    } else {
      String _name = it.getName();
      boolean _isEmpty_1 = _name.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      _and = _not_1;
    }
    return _and;
  }
  
  protected static boolean _constraint(final Bounded it) {
    boolean _xblockexpression = false;
    {
      Expression _lowerBound = it.getLowerBound();
      dk.itu.smdp2015.church.model.configurator.Integer lBound = ((dk.itu.smdp2015.church.model.configurator.Integer) _lowerBound);
      Expression _upperBound = it.getUpperBound();
      dk.itu.smdp2015.church.model.configurator.Integer uBound = ((dk.itu.smdp2015.church.model.configurator.Integer) _upperBound);
      int _value = lBound.getValue();
      int _value_1 = uBound.getValue();
      _xblockexpression = (_value < _value_1);
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof Parameter) {
      return _constraint((Parameter)it);
    } else if (it instanceof ParameterGroup) {
      return _constraint((ParameterGroup)it);
    } else if (it instanceof Bounded) {
      return _constraint((Bounded)it);
    } else if (it instanceof Configurator) {
      return _constraint((Configurator)it);
    } else if (it != null) {
      return _constraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
