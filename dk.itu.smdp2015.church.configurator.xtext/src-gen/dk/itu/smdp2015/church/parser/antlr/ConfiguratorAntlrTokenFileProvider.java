/*
* generated by Xtext
*/
package dk.itu.smdp2015.church.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ConfiguratorAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.tokens");
	}
}
