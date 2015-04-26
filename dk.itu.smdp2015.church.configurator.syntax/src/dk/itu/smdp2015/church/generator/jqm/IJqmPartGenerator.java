package dk.itu.smdp2015.church.generator.jqm;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

public interface IJqmPartGenerator {
	void doGenerate(Resource input, IFileSystemAccess fsa, String rootFolder);
}
