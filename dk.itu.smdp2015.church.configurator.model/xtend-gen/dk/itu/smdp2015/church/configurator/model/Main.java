package dk.itu.smdp2015.church.configurator.model;

import dk.itu.smdp2015.church.configurator.model.TestConstraints;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import java.util.Map;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Main {
  private final static String instanceFileName = "instances/Configurator.xmi";
  
  public static void main(final String[] args) {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    ConfiguratorPackage.eINSTANCE.eClass();
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    final URI uri = URI.createURI(Main.instanceFileName);
    final Resource resource = resourceSet.getResource(uri, true);
    TreeIterator<EObject> _allProperContents = EcoreUtil.<EObject>getAllProperContents(resource, false);
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject it) {
        return Boolean.valueOf(TestConstraints.constraint(it));
      }
    };
    boolean _forall = IteratorExtensions.<EObject>forall(_allProperContents, _function);
    if (_forall) {
      InputOutput.<String>println("All constraints are satisfied!");
    } else {
      InputOutput.<String>println("Some constraint is violated");
    }
  }
}
