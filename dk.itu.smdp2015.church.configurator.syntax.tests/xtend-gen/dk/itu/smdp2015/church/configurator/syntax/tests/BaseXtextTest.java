package dk.itu.smdp2015.church.configurator.syntax.tests;

import dk.itu.smdp2015.church.ConfiguratorInjectorProvider;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import javax.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ConfiguratorInjectorProvider.class)
@SuppressWarnings("all")
public abstract class BaseXtextTest {
  @Inject
  @Extension
  protected ParseHelper<Configurator> _parseHelper;
  
  @BeforeClass
  public static void globalSetup() {
    ConfiguratorPackage.eINSTANCE.eClass();
  }
}
