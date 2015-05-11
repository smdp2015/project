package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator

import org.junit.Test
import javax.inject.Inject
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator
import dk.itu.smdp2015.church.model.configurator.Enumerated
import dk.itu.smdp2015.church.model.configurator.Bounded

class TestDynamicJqmHtmlGenerator extends BaseTestJqmGenerator{

	@Inject extension JqmHtmlGenerator //Sut
	
	@Test
	def void testConfigDescription_rendersAsMainSection(){
		
		'configurator app "main app description"{}'.parse
		.renderAppDescription
		.assertCodeWithExpectedOutput(
		'''<section class="main-description">
                main app description
            </section>
            ''')
		
	}
	@Test
	def void testRenderBodyPart_rendersBodyElementAnd(){
		
		'configurator app'.parse
		.renderBodyPart
		.assertCodeWithExpectedOutput(
		'''<body>
    <div id="main" data-role="page">
        <div data-role="header" data-add-back-btn="true">
                    <h1>
                        app
                    </h1>
                    <button class="ui-btn-right ui-icon-check ui-btn-icon-right ui-btn" onclick="submitconfiguration();">submit</button>
                </div>
        <div role="main">
           <section class="main-description">
                       </section>
           <section class="validationSection" data-bind="css:{showValidationSummary: !$root.isModelValid()}">
                           <div class="validationSummary">
                               <h4>Validation summary</h4>
                               <ul data-bind="foreach: $root.currentErrors">
                                   <li><span data-bind="text: $data"> </span> </li>
                               </ul>
                           </div>
                       </section>
           <ul data-role="listview">
           </ul>
        </div>
    </div>
</body>''')
		
	}
	@Test
	def testRenderGroupPage_rendersPageDiv() {
	    '{group test{ parameter someParam values (0,1,2)}}'.addPrefix.parse.firstGroup 
	    .renderGroupPage
		.assertCodeWithExpectedOutput(
		'''
		<div id="test" data-role="page" data-bind="with: $root.group_test">
			<div data-role="header" data-add-back-btn="true">
			            <h1>
			                test
			            </h1>
			            <button class="ui-btn-right ui-icon-check ui-btn-icon-right ui-btn" onclick="submitconfiguration();">submit</button>
			        </div>
	        <div role="main">
	            <section class="validationSection" data-bind="css:{showValidationSummary: !$root.isModelValid()}">
	                            <div class="validationSummary">
	                                <h4>Validation summary</h4>
	                                <ul data-bind="foreach: $root.currentErrors">
	                                    <li><span data-bind="text: $data"> </span> </li>
	                                </ul>
	                            </div>
	                        </section>
	            <ul data-role="listview">
<li>
	        <label for="someParam-param" >someParam:</label>
	            <select id="someParam-param" data-bind="options: someParam.choices, selectedOptions: someParam.value,optionsCaption:'Choose...'"></select>
	        	<p class="validationMessage" data-bind="validationMessage: someParam.value"></p>
	       </li>
	            </ul>
	        </div>
		</div>
		''')
	}
	@Test
	def testRenderHeader_WhenParameterGroupWithDescription_ThenHeaderShowsDescription() {
		'{group test "some group description" {}}'.addPrefix.parse.firstGroup
		.renderHeader
		.assertCodeWithExpectedOutput
		(
		'''<div data-role="header" data-add-back-btn="true">
            <h1>
                some group description
            </h1>
            <button class="ui-btn-right ui-icon-check ui-btn-icon-right ui-btn" onclick="submitconfiguration();">submit</button>
        </div>
        '''
          )
	}
	@Test
	def testRenderLocalValidatonMessage_WhenParameter_ThenRendersAsStandardDataboundValueName() {
		'{parameter test{}}'.addPrefix.parse.firstParam
		.renderLocalValidatonMessage
		.assertCodeWithExpectedOutput(
		'''
		<p class="validationMessage" data-bind="validationMessage: test.value"></p>
		''')
	}
	@Test
	def testRenderLocalValidatonMessage_WhenParameterGroup_ThenRendersWithDataboundGroupName() {
		'{group test{}}'.addPrefix.parse.firstGroup
		.renderLocalValidatonMessage
		.assertCodeWithExpectedOutput(
		'''
		<p class="validationMessage" data-bind="validationMessage: group_test"></p>
		''')
	}
	@Test
	def void testCompileParameterLink_WhenGroup_ThenRendersAsListItem(){
		'{group test{}}'.addPrefix.parse.firstGroup
		.compileParameterLink
		.assertCodeWithExpectedOutput(
		'''<li>
                <a href="#test">
                	test
                    <p class="validationMessage" data-bind="validationMessage: group_test"></p>
                </a>
          </li>
          ''')
		
	}
	@Test
	def void testParameterLink_RendersAsListItem(){
		
		'{parameter test values (0;10)}'.addPrefix.parse.firstParam
		.compileParameterLink
		.assertCodeWithExpectedOutput(
		'''<li>
	        <label for="test-param" >test:</label>
	            <select id="test-param" data-bind="options: test.choices, selectedOptions: test.value,optionsCaption:'Choose...'"></select>
	        	<p class="validationMessage" data-bind="validationMessage: test.value"></p>
	       </li>
          ''')
		
	}
	@Test
	def void testCompileParameterLink_WhenEnumeratedRange_ThenRendersAsSelectInput(){
		
		'{parameter test values (0;10)}'.addPrefix.parse.firstParam
		.compileParameterLink
		.assertCodeWithExpectedOutput(
		'''<li>
	        <label for="test-param" >test:</label>
	            <select id="test-param" data-bind="options: test.choices, selectedOptions: test.value,optionsCaption:'Choose...'"></select>
	        	<p class="validationMessage" data-bind="validationMessage: test.value"></p>
	       </li>
          ''')
		
	}
	@Test
	def void testCompileParameterLink_WhenBoundedRange_ThenRendersAsSelectInputWithRange(){
		
		'{parameter test values [0;10]}'.addPrefix.parse.firstParam
		.compileParameterLink
		.assertCodeWithExpectedOutput(
		'''<li>
	        <label for="test-param" >test:</label>
	            <input data-bind="value: test.value, attr:{ min: test.boundedRange.lower, max: test.boundedRange.upper}" type="range" name="test" id="test-param">
	        	<p class="validationMessage" data-bind="validationMessage: test.value"></p>
	       </li>
          ''')
		
	}
	@Test
	def void testCompileParameterLink_WhenOptionalParameter_ThenListItemIsCollapsible(){
		
		'{parameter test optional values (0;10)}'.addPrefix.parse.firstParam
		.compileParameterLink
		.assertCodeWithExpectedOutput(
		'''<li data-role="collapsible" data-bind="isExpanded: test.isOn">
	        <h2><label for="test-param" >test:</label></h2>
	            <select id="test-param" data-bind="options: test.choices, selectedOptions: test.value,optionsCaption:'Choose...'"></select>
	        	<p class="validationMessage" data-bind="validationMessage: test.value"></p>
	       </li>
          ''')
		
	}
	@Test
	def void testRenderRangeInputElement_WhenBoundedRange_ThenRendersInputWithRange(){
		'{parameter test values [0;100]}'.addPrefix.parse=>[
			(firstParam.valueRange as Bounded)
			.renderRangeInputElement(firstParam)
			.assertCodeWithExpectedOutput(
			'''
			<input data-bind="value: test.value, attr:{ min: test.boundedRange.lower, max: test.boundedRange.upper}" type="range" name="test" id="test-param">
			''')
		]
	}
	
	@Test
	def void testRenderBooleanInputElement_RendersAsBooleanInputElement() {
		'{parameter test values (true,false)}'.addPrefix.parse=>[
			(firstParam.valueRange as Enumerated)
			.renderBooleanInputElement(firstParam)
			.assertCodeWithExpectedOutput(
			'''
			<label data-bind="text: test.value()?'on':'off'"> <input type="checkbox" id="test-param" data-bind="checked:test.value"> </label>
	          ''')
		]
	}
}