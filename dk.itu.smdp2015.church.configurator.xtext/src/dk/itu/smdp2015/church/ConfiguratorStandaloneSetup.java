/*
* generated by Xtext
*/
package dk.itu.smdp2015.church;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ConfiguratorStandaloneSetup extends ConfiguratorStandaloneSetupGenerated{

	public static void doSetup() {
		new ConfiguratorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

