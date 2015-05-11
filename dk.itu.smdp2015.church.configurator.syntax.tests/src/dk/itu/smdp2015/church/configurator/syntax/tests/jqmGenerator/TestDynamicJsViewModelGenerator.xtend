package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator

import org.junit.Test
import javax.inject.Inject
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Bounded
import dk.itu.smdp2015.church.generator.jqm.JqmViewModelGenerator

class TestDynamicJsViewModelGenerator extends BaseTestJqmGenerator{

	@Inject extension JqmViewModelGenerator //Sut
	@Test
	def void  testRenderParam_WhenParameterIsNonOptionalChoice_ThenParameterObjectIsWrittenWithChoices() {
		'{parameter testparam values ("a","b")}'.addPrefix.parse.firstParam
		.renderParam
		.assertCodeWithExpectedOutput(
		'''
		testparam: {
	    	choices: ["a","b"],
	    	value: ko.observable().extend({
	    		                required: {params: true, message: "testparam is required"}
	    		            })
	    }
	    ''')
	}
	@Test
	def void  testRenderParam_WhenParameterIsNonOptionalValueRange_ThenParameterObjectIsWrittenWithBoundedRange() {
		'{parameter testparam values [1;10]}'.addPrefix.parse.firstParam
		.renderParam
		.assertCodeWithExpectedOutput(
		'''
		testparam: {
	    	boundedRange:{
	    		            lower: 1,
	    		            upper: 10
	    		        },
	    	value: ko.observable().extend({
	    		                required: {params: true, message: "testparam is required"}
	    		            })
	    }
	    ''')
	}
	@Test
	def void  testRenderParam_WhenParameterIsOptional_ThenValueRange_Thenasdf() {
		'{parameter testparam mandatory values [1;10]}'.addPrefix.parse.firstParam
		.renderParam
		.assertCodeWithExpectedOutput(
		'''
		testparam: {
	    	boundedRange:{
	    		            lower: 1,
	    		            upper: 10
	    		        },
	    	value: ko.observable().extend({
	    		                required: {params: true, message: "testparam is required"}
	    		            })
	    }
	    ''')
	}
	
}