package dk.itu.smdp2015.church.generator.jqm

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider

class JqmGenerator implements IGenerator {
	
	String rootFolder = "JQM config"
	String scriptFolder =rootFolder +"/Scripts/Src-gen"
	IJqmPartGenerator[] _gens = #{
		new JqmHtmlGenerator(new ExpressionTypeProvider,new JqmCommon,rootFolder),
		new JqmViewModelGenerator(new ExpressionTypeProvider(),new JqmCommon(),scriptFolder),
		new JqmKoPageBindingGenerator(new JqmCommon,scriptFolder)
		
	};
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		_gens.forEach[
		try{
				doGenerate(input, fsa);
			}catch(Exception ex){
				System.out.println(String.format("Error generating JQM code with %S: \n %S \n", it.class.name,ex.message))
				ex.printStackTrace
			}]
	}
	
}