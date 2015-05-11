package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator

import org.junit.Test
import javax.inject.Inject
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.generator.jqm.JqmViewModelGenerator

class TestStaticJsViewModelGenerator extends BaseTestJqmGenerator{

	@Inject extension JqmViewModelGenerator //Sut
	
	@Test
	def testRenderRootJsViewModelCode() {
		'configurator app'.parse
		.compile
		.assertCodeWithExpectedOutput(
		'''
var App = window.App = {};

App.ViewModel = ko.validatedObservable({
   
    currentErrors:ko.observableArray([]),
    isModelValid: ko.deferredPureComputed(function()
    {
        var isValid= App.ViewModel.isValid();

        App.ViewModel().currentErrors(App.ViewModel.errors());
        return isValid;
    },this),

});

//Init special group validations, by resetting objects value
''')
	}
}