package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator

import org.junit.Test
import javax.inject.Inject
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.generator.jqm.JqmViewModelGenerator
import dk.itu.smdp2015.church.generator.jqm.JqmKoPageBindingGenerator

class TestPageBindingGenerator extends BaseTestJqmGenerator{

	@Inject extension JqmKoPageBindingGenerator //Sut
	
	@Test
	def void  testCompile_WhenFourGroups() {
		'configuration carconfig { 
			group group1 { }, 
group group2 { },
group group3 { },
group group4 { }, }'.parse.compile
			.assertCodeWithExpectedOutput('''$(document).ready(function(){
	$("#main").on('pagecreate', function (event, ui) {
	
	    ko.applyBindings(App.ViewModel, this );
	});
	$("#group1").on('pagecreate', function (event, ui) {
	
	    ko.applyBindings(App.ViewModel, this );
	});
	$("#group2").on('pagecreate', function (event, ui) {
	
	    ko.applyBindings(App.ViewModel, this );
	});
	$("#group3").on('pagecreate', function (event, ui) {
	
	    ko.applyBindings(App.ViewModel, this );
	});
	$("#group4").on('pagecreate', function (event, ui) {
	
	    ko.applyBindings(App.ViewModel, this );
	});
});
''')
	}
	
}