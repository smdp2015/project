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
		'{parameter testparam optional values [1;10]}'.addPrefix.parse.firstParam
		.renderParam
		.assertCodeWithExpectedOutput(
		'''
		testparam: {
	    	boundedRange:{
	    		            lower: 1,
	    		            upper: 10
	    		        },
	    	isOn: ko.observable(false),
	    	value: ko.observable()
	    }
	    ''')
	}
	@Test
	def void  testRenderParam_WhenParameterGroup() {
		'{group testgroup optional values [1;10]}'.addPrefix.parse.firstGroup
		.renderParam
		.assertCodeWithExpectedOutput(
		'''
		group_testgroup: ko.observable({
		})''')
	}
	
	@Test
	def void  testRenderParam_WhenParameterGroupWithVisibilityExpression() {
		'''{group testgroup visible-if variant != "standard" {parameter variant values("standard","luxus")}}'''.toString().addPrefix.parse.firstGroup
		.renderParam
		.assertCodeWithExpectedOutput(
		'''group_testgroup: ko.observable({
	isVisible: ko.deferredPureComputed(function(){
           	return (App.ViewModel().group_testgroup().variant.value()==null? '' : App.ViewModel().group_testgroup().variant.value()[0] != "standard")
        }),
	variant: {
		    	choices: ["standard","luxus"],
		    	value: ko.observable().extend({
		    		                required: {params: true, message: "variant is required"}
		    		            })
		    }
})''')
	}
	@Test
	def void  testRenderOperator_WhenBinaryEquals() {
		'{parameter test visible-if 1==2}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		' == ')
	}
	@Test
	def void  testRenderOperator_WhenBinaryNotEqual() {
		'{parameter test visible-if 1!=2}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		' != ')
	}
	@Test
	def void  testRenderOperator_WhenlogicalOr() {
		'{parameter test visible-if 1==2 or 3==4}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		'''
		||
		''')
	}@Test
	def void  testRenderOperator_WhenlogicalAnd() {
		'{parameter test visible-if 1==2 and 3==4}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		'''
		&&
		''')
	}
	@Test
	def void  testRenderOperator_WhenAddition() {
		'{parameter test visible-if 1 + 2}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		' + ')
	}
	@Test
	def void  testRenderOperator_Whenmultiplication() {
		'{parameter test visible-if 1 * 2}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		' * ')
	}
	@Test
	def void  testRenderOperator_WhenLessThan() {
		'{parameter test visible-if 1 < 2}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		' < ')
	}
	@Test
	def void  testRenderOperator_WhenGreaterThan() {
		'{parameter test visible-if 1 > 2}'.addPrefix.parse.firstBinaryOperator
		.renderOperator
		.assertCodeWithExpectedOutput(
		' > ')
	}
	
	@Test
	def void  testWhenComplexExpression_ThenItIsRenderedCorrectly() {
		'''{parameter test visible-if p2 == p1 or p1 == p3 or p4 == p1 or p2<p3 and test != "somestring" ,
		parameter p1 ,
parameter p2 values (1,2,3),
parameter p3,
parameter p4 },'''.toString.addPrefix.parse.firstVisibilityExpression
		.renderExpression.toString
		.assertCodeWithExpectedOutput(
		'''((((App.ViewModel().p2.value()==null? '' : App.ViewModel().p2.value()[0] == App.ViewModel().p1.value())||
(App.ViewModel().p1.value() == App.ViewModel().p3.value()))||
(App.ViewModel().p4.value() == App.ViewModel().p1.value()))||
((App.ViewModel().p2.value()==null? '' : App.ViewModel().p2.value()[0] < App.ViewModel().p3.value())&&
(App.ViewModel().test.value() != "somestring")))''')
	}
	
}