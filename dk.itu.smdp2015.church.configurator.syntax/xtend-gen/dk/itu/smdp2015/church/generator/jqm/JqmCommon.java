package dk.itu.smdp2015.church.generator.jqm;

import com.google.common.base.Objects;
import dk.itu.smdp2015.church.model.configurator.AbstractParameter;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class JqmCommon {
  public String getGroupName(final ParameterGroup it) {
    String _name = it.getName();
    return ("group_" + _name);
  }
  
  protected String _getFullPath(final Identifier it) {
    Parameter _id = it.getId();
    return this.getFullPath(_id);
  }
  
  protected String _getFullPath(final AbstractParameter it) {
    String _xblockexpression = null;
    {
      final ArrayList<String> parts = new ArrayList<String>();
      String firstName = it.getName();
      if ((it instanceof ParameterGroup)) {
        String _groupName = this.getGroupName(((ParameterGroup) it));
        firstName = _groupName;
      }
      parts.add(firstName);
      ParameterGroup parentGroup = it.getParent();
      boolean _notEquals = (!Objects.equal(parentGroup, null));
      boolean _while = _notEquals;
      while (_while) {
        {
          String _groupName_1 = this.getGroupName(parentGroup);
          String _plus = (_groupName_1 + "().");
          parts.add(_plus);
          ParameterGroup _parent = parentGroup.getParent();
          parentGroup = _parent;
        }
        boolean _notEquals_1 = (!Objects.equal(parentGroup, null));
        _while = _notEquals_1;
      }
      List<String> _reverse = ListExtensions.<String>reverse(parts);
      final Function2<String, String, String> _function = new Function2<String, String, String>() {
        public String apply(final String result, final String it) {
          return (result + it);
        }
      };
      _xblockexpression = IterableExtensions.<String, String>fold(_reverse, "", _function);
    }
    return _xblockexpression;
  }
  
  public String getResourceFileName(final Resource it) {
    URI _uRI = it.getURI();
    String _lastSegment = _uRI.lastSegment();
    String[] _split = _lastSegment.split(".conf");
    return _split[0];
  }
  
  public String getFullPath(final EObject it) {
    if (it instanceof AbstractParameter) {
      return _getFullPath((AbstractParameter)it);
    } else if (it instanceof Identifier) {
      return _getFullPath((Identifier)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
