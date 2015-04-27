package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator

import org.junit.Test
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import dk.itu.smdp2015.church.model.configurator.Configurator
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator
import java.beans.Expression
import dk.itu.smdp2015.church.generator.jqm.JqmCommon
import dk.itu.smdp2015.church.xtext.common.ExpressionTypeProvider
import org.junit.Assert
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import dk.itu.smdp2015.church.ConfiguratorInjectorProvider
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage
import org.junit.Before
import org.junit.BeforeClass

class TestStaticJqmHtmlGenerator extends BaseTestJqmGenerator {

	@Inject extension JqmHtmlGenerator //Sut
	
	@Test
	def testRenderValidatonSummary() {
		renderValidatonSummary
		.assertHtmlWithExpectedOutput(
		'''<section class="validationSection" data-bind="css:{showValidationSummary: !$root.isModelValid()}">
                <div class="validationSummary">
                    <h4>Validation summary</h4>
                    <ul data-bind="foreach: $root.currentErrors">
                        <li><span data-bind="text: $data"> </span> </li>
                    </ul>
                </div>
            </section>'''
            )
	}
	@Test
	def testRenderHeadHtmlPart() {
		renderHeadHtmlPart
		.assertHtmlWithExpectedOutput(
		'''
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>car</title>
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="Content/Lib/jquery.mobile-1.4.5.min.css">
    <link rel="stylesheet" href="Content/style.css">

    <script src="Scripts/Lib/jquery-1.11.1.min.js"></script>
    <script src="Scripts/Lib/knockout-3.3.0.debug.js"></script>
    <script src="Scripts/Lib/knockout.mapping-latest.js"></script>
    <script src="Scripts/Lib/knockout.validation.js"></script>
    <script src="Scripts/submit-configuration.js"></script>

    <script src="Scripts/ko-init.js"></script>
    <script src="Scripts/ko-initcustomhandlers.js"></script>

    <script src="Scripts/Src-gen/-app-viewmodel.js"></script>
    <script src="Scripts/Src-gen/-ko-initpagebinding.js"></script>

    <script src="Scripts/jqm-init.js"></script>
    <script src="Scripts/Lib/jquery.mobile-1.4.5.min.js"></script>

</head>''')
	}
	
}