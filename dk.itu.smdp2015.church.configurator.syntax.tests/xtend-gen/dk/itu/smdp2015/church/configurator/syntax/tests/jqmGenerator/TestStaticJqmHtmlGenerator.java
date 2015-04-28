package dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator;

import dk.itu.smdp2015.church.configurator.syntax.tests.jqmGenerator.BaseTestJqmGenerator;
import dk.itu.smdp2015.church.generator.jqm.JqmHtmlGenerator;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class TestStaticJqmHtmlGenerator extends BaseTestJqmGenerator {
  @Inject
  @Extension
  private JqmHtmlGenerator _jqmHtmlGenerator;
  
  @Test
  public void testRenderValidatonSummary() {
    CharSequence _renderValidatonSummary = this._jqmHtmlGenerator.renderValidatonSummary();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<section class=\"validationSection\" data-bind=\"css:{showValidationSummary: !$root.isModelValid()}\">");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<div class=\"validationSummary\">");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<h4>Validation summary</h4>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<ul data-bind=\"foreach: $root.currentErrors\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<li><span data-bind=\"text: $data\"> </span> </li>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</section>");
    this.assertHtmlWithExpectedOutput(_renderValidatonSummary, _builder.toString());
  }
  
  @Test
  public void testRenderHeadHtmlPart() {
    CharSequence _renderHeadHtmlPart = this._jqmHtmlGenerator.renderHeadHtmlPart();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>car</title>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" href=\"Content/Lib/jquery.mobile-1.4.5.min.css\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" href=\"Content/style.css\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/jquery-1.11.1.min.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/knockout-3.3.0.debug.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/knockout.mapping-latest.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/knockout.validation.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/submit-configuration.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/ko-init.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/ko-initcustomhandlers.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Src-gen/-app-viewmodel.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Src-gen/-ko-initpagebinding.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/jqm-init.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"Scripts/Lib/jquery.mobile-1.4.5.min.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</head>");
    this.assertHtmlWithExpectedOutput(_renderHeadHtmlPart, _builder.toString());
  }
}
