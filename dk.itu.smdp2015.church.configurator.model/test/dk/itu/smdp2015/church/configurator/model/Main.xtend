package dk.itu.smdp2015.church.configurator.model

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class Main {

	val static instanceFileName = "instances/Configurator.xmi"
	
	def static void main(String[] args) {

		// register the file extension to be read as XMI
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

		// Register meta-model package:
		dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage.eINSTANCE.eClass()
				
		// load the file 
		val resourceSet = new ResourceSetImpl

		// change file name here to try other files
		val uri = URI::createURI(instanceFileName)
		val resource = resourceSet.getResource(uri, true)

		// check constraints
		if (EcoreUtil.getAllProperContents(resource, false).forall[TestConstraints.constraint(it)])
			println("All constraints are satisfied!")
		else
			println("Some constraint is violated")
	}	
}