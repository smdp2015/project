/*
* generated by Xtext
*/
package dk.itu.smdp2015.church.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import dk.itu.smdp2015.church.services.ConfiguratorGrammarAccess;

public class ConfiguratorParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ConfiguratorGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected dk.itu.smdp2015.church.parser.antlr.internal.InternalConfiguratorParser createParser(XtextTokenStream stream) {
		return new dk.itu.smdp2015.church.parser.antlr.internal.InternalConfiguratorParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Configurator";
	}
	
	public ConfiguratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConfiguratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}