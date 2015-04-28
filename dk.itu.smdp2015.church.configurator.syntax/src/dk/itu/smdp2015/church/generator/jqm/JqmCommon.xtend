package dk.itu.smdp2015.church.generator.jqm

import dk.itu.smdp2015.church.model.configurator.ParameterGroup
import dk.itu.smdp2015.church.model.configurator.Identifier
import java.util.List
import java.util.ArrayList
import dk.itu.smdp2015.church.model.configurator.Parameter
import dk.itu.smdp2015.church.model.configurator.AbstractParameter
import org.eclipse.emf.ecore.resource.Resource

class JqmCommon {
	def getGroupName(ParameterGroup it){
		'group_' + it.name
	}
	def dispatch String getFullPath(Identifier it){
		id.getFullPath
	}
	def dispatch String getFullPath(AbstractParameter it){
		val parts = new ArrayList<String>()
		var firstName=name
		if(it instanceof ParameterGroup)
			firstName = (it as ParameterGroup).groupName
		parts.add(firstName)
		var parentGroup = parent
		while(parentGroup!=null)
		{
			parts.add(parentGroup.groupName + "().")
			parentGroup = parentGroup.parent
		}
		parts.reverse.fold('')[result,it|result + it]
	}
	
	def getResourceFileName(Resource it){
		URI.lastSegment.split(".conf").get(0)
	}
}