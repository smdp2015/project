package dk.itu.smdp2015.church.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.smdp2015.church.services.ConfiguratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfiguratorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'*'", "'optional'", "'true'", "'false'", "'=='", "'!='", "'<'", "'>'", "'+'", "'-'", "'not'", "'configurator'", "'{'", "'}'", "','", "'group'", "'visible-if'", "'constraints'", "'parameter'", "'default-value'", "'values'", "'('", "')'", "'['", "';'", "']'", "'description'", "'in'", "'mandatory'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConfiguratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfiguratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfiguratorParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g"; }


     
     	private ConfiguratorGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ConfiguratorGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleConfigurator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:60:1: entryRuleConfigurator : ruleConfigurator EOF ;
    public final void entryRuleConfigurator() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:61:1: ( ruleConfigurator EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:62:1: ruleConfigurator EOF
            {
             before(grammarAccess.getConfiguratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurator_in_entryRuleConfigurator61);
            ruleConfigurator();

            state._fsp--;

             after(grammarAccess.getConfiguratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurator68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurator"


    // $ANTLR start "ruleConfigurator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:69:1: ruleConfigurator : ( ( rule__Configurator__Group__0 ) ) ;
    public final void ruleConfigurator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:73:2: ( ( ( rule__Configurator__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:74:1: ( ( rule__Configurator__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:74:1: ( ( rule__Configurator__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:75:1: ( rule__Configurator__Group__0 )
            {
             before(grammarAccess.getConfiguratorAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:76:1: ( rule__Configurator__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:76:2: rule__Configurator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__0_in_ruleConfigurator94);
            rule__Configurator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurator"


    // $ANTLR start "entryRuleAbstractParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:88:1: entryRuleAbstractParameter : ruleAbstractParameter EOF ;
    public final void entryRuleAbstractParameter() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:89:1: ( ruleAbstractParameter EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:90:1: ruleAbstractParameter EOF
            {
             before(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_entryRuleAbstractParameter121);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getAbstractParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractParameter128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:97:1: ruleAbstractParameter : ( ( rule__AbstractParameter__Alternatives ) ) ;
    public final void ruleAbstractParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:101:2: ( ( ( rule__AbstractParameter__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:102:1: ( ( rule__AbstractParameter__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:102:1: ( ( rule__AbstractParameter__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:103:1: ( rule__AbstractParameter__Alternatives )
            {
             before(grammarAccess.getAbstractParameterAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:104:1: ( rule__AbstractParameter__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:104:2: rule__AbstractParameter__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractParameter__Alternatives_in_ruleAbstractParameter154);
            rule__AbstractParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleParameterGroup"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:116:1: entryRuleParameterGroup : ruleParameterGroup EOF ;
    public final void entryRuleParameterGroup() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:117:1: ( ruleParameterGroup EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:118:1: ruleParameterGroup EOF
            {
             before(grammarAccess.getParameterGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterGroup_in_entryRuleParameterGroup181);
            ruleParameterGroup();

            state._fsp--;

             after(grammarAccess.getParameterGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterGroup188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterGroup"


    // $ANTLR start "ruleParameterGroup"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:125:1: ruleParameterGroup : ( ( rule__ParameterGroup__Group__0 ) ) ;
    public final void ruleParameterGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:129:2: ( ( ( rule__ParameterGroup__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:130:1: ( ( rule__ParameterGroup__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:130:1: ( ( rule__ParameterGroup__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:131:1: ( rule__ParameterGroup__Group__0 )
            {
             before(grammarAccess.getParameterGroupAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:132:1: ( rule__ParameterGroup__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:132:2: rule__ParameterGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__0_in_ruleParameterGroup214);
            rule__ParameterGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterGroup"


    // $ANTLR start "entryRuleParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:144:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:145:1: ( ruleParameter EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:146:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter241);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:153:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:157:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:158:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:158:1: ( ( rule__Parameter__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:159:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:160:1: ( rule__Parameter__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:160:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter274);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleValueRange"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:172:1: entryRuleValueRange : ruleValueRange EOF ;
    public final void entryRuleValueRange() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:173:1: ( ruleValueRange EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:174:1: ruleValueRange EOF
            {
             before(grammarAccess.getValueRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_entryRuleValueRange301);
            ruleValueRange();

            state._fsp--;

             after(grammarAccess.getValueRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueRange308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueRange"


    // $ANTLR start "ruleValueRange"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:181:1: ruleValueRange : ( ( rule__ValueRange__Alternatives ) ) ;
    public final void ruleValueRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:185:2: ( ( ( rule__ValueRange__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:186:1: ( ( rule__ValueRange__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:186:1: ( ( rule__ValueRange__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:187:1: ( rule__ValueRange__Alternatives )
            {
             before(grammarAccess.getValueRangeAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:188:1: ( rule__ValueRange__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:188:2: rule__ValueRange__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueRange__Alternatives_in_ruleValueRange334);
            rule__ValueRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueRange"


    // $ANTLR start "entryRuleEnumerated"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:200:1: entryRuleEnumerated : ruleEnumerated EOF ;
    public final void entryRuleEnumerated() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:201:1: ( ruleEnumerated EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:202:1: ruleEnumerated EOF
            {
             before(grammarAccess.getEnumeratedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerated_in_entryRuleEnumerated361);
            ruleEnumerated();

            state._fsp--;

             after(grammarAccess.getEnumeratedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerated368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerated"


    // $ANTLR start "ruleEnumerated"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:209:1: ruleEnumerated : ( ( rule__Enumerated__Group__0 ) ) ;
    public final void ruleEnumerated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:213:2: ( ( ( rule__Enumerated__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:214:1: ( ( rule__Enumerated__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:214:1: ( ( rule__Enumerated__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:215:1: ( rule__Enumerated__Group__0 )
            {
             before(grammarAccess.getEnumeratedAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:216:1: ( rule__Enumerated__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:216:2: rule__Enumerated__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__0_in_ruleEnumerated394);
            rule__Enumerated__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerated"


    // $ANTLR start "entryRuleBounded"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:228:1: entryRuleBounded : ruleBounded EOF ;
    public final void entryRuleBounded() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:229:1: ( ruleBounded EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:230:1: ruleBounded EOF
            {
             before(grammarAccess.getBoundedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBounded_in_entryRuleBounded421);
            ruleBounded();

            state._fsp--;

             after(grammarAccess.getBoundedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBounded428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBounded"


    // $ANTLR start "ruleBounded"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:237:1: ruleBounded : ( ( rule__Bounded__Group__0 ) ) ;
    public final void ruleBounded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:241:2: ( ( ( rule__Bounded__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:242:1: ( ( rule__Bounded__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:242:1: ( ( rule__Bounded__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:243:1: ( rule__Bounded__Group__0 )
            {
             before(grammarAccess.getBoundedAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:244:1: ( rule__Bounded__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:244:2: rule__Bounded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__0_in_ruleBounded454);
            rule__Bounded__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBounded"


    // $ANTLR start "entryRuleConstraint"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:256:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:257:1: ( ruleConstraint EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:258:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint481);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:265:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:269:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:270:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:270:1: ( ( rule__Constraint__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:271:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:272:1: ( rule__Constraint__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:272:2: rule__Constraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0_in_ruleConstraint514);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleExpression"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:284:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:285:1: ( ruleExpression EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:286:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression541);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:293:1: ruleExpression : ( ruleLogicalOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:297:2: ( ( ruleLogicalOr ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:298:1: ( ruleLogicalOr )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:298:1: ( ruleLogicalOr )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:299:1: ruleLogicalOr
            {
             before(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOr_in_ruleExpression574);
            ruleLogicalOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogicalOr"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:312:1: entryRuleLogicalOr : ruleLogicalOr EOF ;
    public final void entryRuleLogicalOr() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:313:1: ( ruleLogicalOr EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:314:1: ruleLogicalOr EOF
            {
             before(grammarAccess.getLogicalOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr600);
            ruleLogicalOr();

            state._fsp--;

             after(grammarAccess.getLogicalOrRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOr607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalOr"


    // $ANTLR start "ruleLogicalOr"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:321:1: ruleLogicalOr : ( ( rule__LogicalOr__Group__0 ) ) ;
    public final void ruleLogicalOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:325:2: ( ( ( rule__LogicalOr__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:326:1: ( ( rule__LogicalOr__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:326:1: ( ( rule__LogicalOr__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:327:1: ( rule__LogicalOr__Group__0 )
            {
             before(grammarAccess.getLogicalOrAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:328:1: ( rule__LogicalOr__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:328:2: rule__LogicalOr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group__0_in_ruleLogicalOr633);
            rule__LogicalOr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOr"


    // $ANTLR start "entryRuleLogicalAnd"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:340:1: entryRuleLogicalAnd : ruleLogicalAnd EOF ;
    public final void entryRuleLogicalAnd() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:341:1: ( ruleLogicalAnd EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:342:1: ruleLogicalAnd EOF
            {
             before(grammarAccess.getLogicalAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd660);
            ruleLogicalAnd();

            state._fsp--;

             after(grammarAccess.getLogicalAndRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAnd667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalAnd"


    // $ANTLR start "ruleLogicalAnd"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:349:1: ruleLogicalAnd : ( ( rule__LogicalAnd__Group__0 ) ) ;
    public final void ruleLogicalAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:353:2: ( ( ( rule__LogicalAnd__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:354:1: ( ( rule__LogicalAnd__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:354:1: ( ( rule__LogicalAnd__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:355:1: ( rule__LogicalAnd__Group__0 )
            {
             before(grammarAccess.getLogicalAndAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:356:1: ( rule__LogicalAnd__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:356:2: rule__LogicalAnd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group__0_in_ruleLogicalAnd693);
            rule__LogicalAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAnd"


    // $ANTLR start "entryRuleEquality"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:368:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:369:1: ( ruleEquality EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:370:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_entryRuleEquality720);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquality727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:377:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:381:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:382:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:382:1: ( ( rule__Equality__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:383:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:384:1: ( rule__Equality__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:384:2: rule__Equality__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__0_in_ruleEquality753);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparative"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:396:1: entryRuleComparative : ruleComparative EOF ;
    public final void entryRuleComparative() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:397:1: ( ruleComparative EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:398:1: ruleComparative EOF
            {
             before(grammarAccess.getComparativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_entryRuleComparative780);
            ruleComparative();

            state._fsp--;

             after(grammarAccess.getComparativeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparative787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparative"


    // $ANTLR start "ruleComparative"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:405:1: ruleComparative : ( ( rule__Comparative__Group__0 ) ) ;
    public final void ruleComparative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:409:2: ( ( ( rule__Comparative__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:410:1: ( ( rule__Comparative__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:410:1: ( ( rule__Comparative__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:411:1: ( rule__Comparative__Group__0 )
            {
             before(grammarAccess.getComparativeAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:412:1: ( rule__Comparative__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:412:2: rule__Comparative__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__0_in_ruleComparative813);
            rule__Comparative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparative"


    // $ANTLR start "entryRuleAdditive"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:424:1: entryRuleAdditive : ruleAdditive EOF ;
    public final void entryRuleAdditive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:425:1: ( ruleAdditive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:426:1: ruleAdditive EOF
            {
             before(grammarAccess.getAdditiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_entryRuleAdditive840);
            ruleAdditive();

            state._fsp--;

             after(grammarAccess.getAdditiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditive847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditive"


    // $ANTLR start "ruleAdditive"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:433:1: ruleAdditive : ( ( rule__Additive__Group__0 ) ) ;
    public final void ruleAdditive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:437:2: ( ( ( rule__Additive__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:438:1: ( ( rule__Additive__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:438:1: ( ( rule__Additive__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:439:1: ( rule__Additive__Group__0 )
            {
             before(grammarAccess.getAdditiveAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:440:1: ( rule__Additive__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:440:2: rule__Additive__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__0_in_ruleAdditive873);
            rule__Additive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditive"


    // $ANTLR start "entryRuleMultiplicative"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:452:1: entryRuleMultiplicative : ruleMultiplicative EOF ;
    public final void entryRuleMultiplicative() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:453:1: ( ruleMultiplicative EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:454:1: ruleMultiplicative EOF
            {
             before(grammarAccess.getMultiplicativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_entryRuleMultiplicative900);
            ruleMultiplicative();

            state._fsp--;

             after(grammarAccess.getMultiplicativeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicative907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicative"


    // $ANTLR start "ruleMultiplicative"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:461:1: ruleMultiplicative : ( ( rule__Multiplicative__Group__0 ) ) ;
    public final void ruleMultiplicative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:465:2: ( ( ( rule__Multiplicative__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:466:1: ( ( rule__Multiplicative__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:466:1: ( ( rule__Multiplicative__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:467:1: ( rule__Multiplicative__Group__0 )
            {
             before(grammarAccess.getMultiplicativeAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:468:1: ( rule__Multiplicative__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:468:2: rule__Multiplicative__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__0_in_ruleMultiplicative933);
            rule__Multiplicative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicative"


    // $ANTLR start "entryRulePrimitive"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:480:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:481:1: ( rulePrimitive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:482:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_entryRulePrimitive960);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitive967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:489:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:493:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:494:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:494:1: ( ( rule__Primitive__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:495:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:496:1: ( rule__Primitive__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:496:2: rule__Primitive__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive993);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleUnary"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:508:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:509:1: ( ruleUnary EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:510:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnary_in_entryRuleUnary1020);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnary1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:517:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:521:2: ( ( ( rule__Unary__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:522:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:522:1: ( ( rule__Unary__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:523:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:524:1: ( rule__Unary__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:524:2: rule__Unary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__0_in_ruleUnary1053);
            rule__Unary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleInRange"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:538:1: entryRuleInRange : ruleInRange EOF ;
    public final void entryRuleInRange() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:539:1: ( ruleInRange EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:540:1: ruleInRange EOF
            {
             before(grammarAccess.getInRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInRange_in_entryRuleInRange1082);
            ruleInRange();

            state._fsp--;

             after(grammarAccess.getInRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInRange1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInRange"


    // $ANTLR start "ruleInRange"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:547:1: ruleInRange : ( ( rule__InRange__Group__0 ) ) ;
    public final void ruleInRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:551:2: ( ( ( rule__InRange__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:552:1: ( ( rule__InRange__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:552:1: ( ( rule__InRange__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:553:1: ( rule__InRange__Group__0 )
            {
             before(grammarAccess.getInRangeAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:554:1: ( rule__InRange__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:554:2: rule__InRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__0_in_ruleInRange1115);
            rule__InRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInRange"


    // $ANTLR start "entryRuleInteger"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:566:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:567:1: ( ruleInteger EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:568:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1142);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:575:1: ruleInteger : ( ( rule__Integer__ValueAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:579:2: ( ( ( rule__Integer__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:580:1: ( ( rule__Integer__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:580:1: ( ( rule__Integer__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:581:1: ( rule__Integer__ValueAssignment )
            {
             before(grammarAccess.getIntegerAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:582:1: ( rule__Integer__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:582:2: rule__Integer__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger1175);
            rule__Integer__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:594:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:595:1: ( ruleBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:596:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1202);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:603:1: ruleBoolean : ( ( rule__Boolean__ValueAssignment ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:607:2: ( ( ( rule__Boolean__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:608:1: ( ( rule__Boolean__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:608:1: ( ( rule__Boolean__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:609:1: ( rule__Boolean__ValueAssignment )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:610:1: ( rule__Boolean__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:610:2: rule__Boolean__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1235);
            rule__Boolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleString0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:622:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:623:1: ( ruleString0 EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:624:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01262);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:631:1: ruleString0 : ( ( rule__String0__ValueAssignment ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:635:2: ( ( ( rule__String0__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:636:1: ( ( rule__String0__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:636:1: ( ( rule__String0__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:637:1: ( rule__String0__ValueAssignment )
            {
             before(grammarAccess.getString0Access().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:638:1: ( rule__String0__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:638:2: rule__String0__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__ValueAssignment_in_ruleString01295);
            rule__String0__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleIdentifier"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:650:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:651:1: ( ruleIdentifier EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:652:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier1322);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:659:1: ruleIdentifier : ( ( rule__Identifier__IdAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:663:2: ( ( ( rule__Identifier__IdAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:664:1: ( ( rule__Identifier__IdAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:664:1: ( ( rule__Identifier__IdAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:665:1: ( rule__Identifier__IdAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:666:1: ( rule__Identifier__IdAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:666:2: rule__Identifier__IdAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1355);
            rule__Identifier__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:678:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:679:1: ( ruleEInt EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:680:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1382);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:687:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:691:2: ( ( RULE_INT ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:692:1: ( RULE_INT )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:692:1: ( RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:693:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1415); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:708:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:709:1: ( ruleEBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:710:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1443);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:717:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:721:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:722:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:722:1: ( ( rule__EBoolean__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:723:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:724:1: ( rule__EBoolean__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:724:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1476);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleLogicalOrOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:737:1: ruleLogicalOrOperator : ( ( 'or' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:741:1: ( ( ( 'or' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:742:1: ( ( 'or' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:742:1: ( ( 'or' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:743:1: ( 'or' )
            {
             before(grammarAccess.getLogicalOrOperatorAccess().getLogicalOrEnumLiteralDeclaration()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:744:1: ( 'or' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:744:3: 'or'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleLogicalOrOperator1514); 

            }

             after(grammarAccess.getLogicalOrOperatorAccess().getLogicalOrEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:757:1: ruleLogicalAndOperator : ( ( 'and' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:761:1: ( ( ( 'and' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:762:1: ( ( 'and' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:762:1: ( ( 'and' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:763:1: ( 'and' )
            {
             before(grammarAccess.getLogicalAndOperatorAccess().getLogicalAndEnumLiteralDeclaration()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:764:1: ( 'and' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:764:3: 'and'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLogicalAndOperator1553); 

            }

             after(grammarAccess.getLogicalAndOperatorAccess().getLogicalAndEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:777:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:781:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:782:1: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:782:1: ( ( rule__EqualityOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:783:1: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:784:1: ( rule__EqualityOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:784:2: rule__EqualityOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1591);
            rule__EqualityOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleComparativeOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:796:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:800:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:801:1: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:801:1: ( ( rule__ComparativeOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:802:1: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:803:1: ( rule__ComparativeOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:803:2: rule__ComparativeOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1627);
            rule__ComparativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparativeOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:815:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:819:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:820:1: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:820:1: ( ( rule__AdditiveOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:821:1: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:822:1: ( rule__AdditiveOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:822:2: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditiveOperator__Alternatives_in_ruleAdditiveOperator1663);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:834:1: ruleMultiplicativeOperator : ( ( '*' ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:838:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:839:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:839:1: ( ( '*' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:840:1: ( '*' )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:841:1: ( '*' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:841:3: '*'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiplicativeOperator1700); 

            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:854:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:858:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:859:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:859:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:860:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:861:1: ( rule__UnaryOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:861:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1738);
            rule__UnaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "rule__AbstractParameter__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:872:1: rule__AbstractParameter__Alternatives : ( ( ruleParameterGroup ) | ( ruleParameter ) );
    public final void rule__AbstractParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:876:1: ( ( ruleParameterGroup ) | ( ruleParameter ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==31) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:877:1: ( ruleParameterGroup )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:877:1: ( ruleParameterGroup )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:878:1: ruleParameterGroup
                    {
                     before(grammarAccess.getAbstractParameterAccess().getParameterGroupParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameterGroup_in_rule__AbstractParameter__Alternatives1773);
                    ruleParameterGroup();

                    state._fsp--;

                     after(grammarAccess.getAbstractParameterAccess().getParameterGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:883:6: ( ruleParameter )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:883:6: ( ruleParameter )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:884:1: ruleParameter
                    {
                     before(grammarAccess.getAbstractParameterAccess().getParameterParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__AbstractParameter__Alternatives1790);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getAbstractParameterAccess().getParameterParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractParameter__Alternatives"


    // $ANTLR start "rule__Parameter__Alternatives_3_0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:894:1: rule__Parameter__Alternatives_3_0 : ( ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) ) | ( 'optional' ) );
    public final void rule__Parameter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:898:1: ( ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) ) | ( 'optional' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:899:1: ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:899:1: ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:900:1: ( rule__Parameter__MandatoryAssignment_3_0_0 )
                    {
                     before(grammarAccess.getParameterAccess().getMandatoryAssignment_3_0_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:901:1: ( rule__Parameter__MandatoryAssignment_3_0_0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:901:2: rule__Parameter__MandatoryAssignment_3_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__MandatoryAssignment_3_0_0_in_rule__Parameter__Alternatives_3_01822);
                    rule__Parameter__MandatoryAssignment_3_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getMandatoryAssignment_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:905:6: ( 'optional' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:905:6: ( 'optional' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:906:1: 'optional'
                    {
                     before(grammarAccess.getParameterAccess().getOptionalKeyword_3_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Parameter__Alternatives_3_01841); 
                     after(grammarAccess.getParameterAccess().getOptionalKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Alternatives_3_0"


    // $ANTLR start "rule__ValueRange__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:918:1: rule__ValueRange__Alternatives : ( ( ruleEnumerated ) | ( ruleBounded ) );
    public final void rule__ValueRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:922:1: ( ( ruleEnumerated ) | ( ruleBounded ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:923:1: ( ruleEnumerated )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:923:1: ( ruleEnumerated )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:924:1: ruleEnumerated
                    {
                     before(grammarAccess.getValueRangeAccess().getEnumeratedParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerated_in_rule__ValueRange__Alternatives1875);
                    ruleEnumerated();

                    state._fsp--;

                     after(grammarAccess.getValueRangeAccess().getEnumeratedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:929:6: ( ruleBounded )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:929:6: ( ruleBounded )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:930:1: ruleBounded
                    {
                     before(grammarAccess.getValueRangeAccess().getBoundedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBounded_in_rule__ValueRange__Alternatives1892);
                    ruleBounded();

                    state._fsp--;

                     after(grammarAccess.getValueRangeAccess().getBoundedParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueRange__Alternatives"


    // $ANTLR start "rule__Primitive__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:940:1: rule__Primitive__Alternatives : ( ( ruleUnary ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_6__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:944:1: ( ( ruleUnary ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||(LA4_2>=11 && LA4_2<=14)||(LA4_2>=17 && LA4_2<=22)||(LA4_2>=25 && LA4_2<=33)||LA4_2==35||(LA4_2>=37 && LA4_2<=38)||LA4_2==41) ) {
                    alt4=6;
                }
                else if ( (LA4_2==40) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case 15:
            case 16:
                {
                alt4=4;
                }
                break;
            case RULE_STRING:
                {
                alt4=5;
                }
                break;
            case 34:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:945:1: ( ruleUnary )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:945:1: ( ruleUnary )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:946:1: ruleUnary
                    {
                     before(grammarAccess.getPrimitiveAccess().getUnaryParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnary_in_rule__Primitive__Alternatives1924);
                    ruleUnary();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getUnaryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:951:6: ( ruleInRange )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:951:6: ( ruleInRange )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:952:1: ruleInRange
                    {
                     before(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInRange_in_rule__Primitive__Alternatives1941);
                    ruleInRange();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:957:6: ( ruleInteger )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:957:6: ( ruleInteger )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:958:1: ruleInteger
                    {
                     before(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__Primitive__Alternatives1958);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:963:6: ( ruleBoolean )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:963:6: ( ruleBoolean )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:964:1: ruleBoolean
                    {
                     before(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Primitive__Alternatives1975);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:969:6: ( ruleString0 )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:969:6: ( ruleString0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:970:1: ruleString0
                    {
                     before(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Primitive__Alternatives1992);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:975:6: ( ruleIdentifier )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:975:6: ( ruleIdentifier )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:976:1: ruleIdentifier
                    {
                     before(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Primitive__Alternatives2009);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:981:6: ( ( rule__Primitive__Group_6__0 ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:981:6: ( ( rule__Primitive__Group_6__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:982:1: ( rule__Primitive__Group_6__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_6()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:983:1: ( rule__Primitive__Group_6__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:983:2: rule__Primitive__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_6__0_in_rule__Primitive__Alternatives2026);
                    rule__Primitive__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:994:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:998:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:999:1: ( 'true' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:999:1: ( 'true' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1000:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__EBoolean__Alternatives2062); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1007:6: ( 'false' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1007:6: ( 'false' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1008:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__EBoolean__Alternatives2082); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1020:1: rule__EqualityOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1024:1: ( ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1025:1: ( ( '==' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1025:1: ( ( '==' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1026:1: ( '==' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1027:1: ( '==' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1027:3: '=='
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__EqualityOperator__Alternatives2117); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1032:6: ( ( '!=' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1032:6: ( ( '!=' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1033:1: ( '!=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNotEqualEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1034:1: ( '!=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1034:3: '!='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__EqualityOperator__Alternatives2138); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getNotEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperator__Alternatives"


    // $ANTLR start "rule__ComparativeOperator__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1044:1: rule__ComparativeOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1048:1: ( ( ( '<' ) ) | ( ( '>' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1049:1: ( ( '<' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1049:1: ( ( '<' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1050:1: ( '<' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1051:1: ( '<' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1051:3: '<'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ComparativeOperator__Alternatives2174); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1056:6: ( ( '>' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1056:6: ( ( '>' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1057:1: ( '>' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1058:1: ( '>' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1058:3: '>'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ComparativeOperator__Alternatives2195); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeOperator__Alternatives"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1068:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1072:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1073:1: ( ( '+' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1073:1: ( ( '+' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1074:1: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1075:1: ( '+' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1075:3: '+'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__AdditiveOperator__Alternatives2231); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1080:6: ( ( '-' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1080:6: ( ( '-' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1081:1: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSubtractionEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1082:1: ( '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1082:3: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__AdditiveOperator__Alternatives2252); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getSubtractionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1092:1: rule__UnaryOperator__Alternatives : ( ( ( '-' ) ) | ( ( 'not' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1096:1: ( ( ( '-' ) ) | ( ( 'not' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1097:1: ( ( '-' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1097:1: ( ( '-' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1098:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1099:1: ( '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1099:3: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__UnaryOperator__Alternatives2288); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1104:6: ( ( 'not' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1104:6: ( ( 'not' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1105:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1106:1: ( 'not' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1106:3: 'not'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__UnaryOperator__Alternatives2309); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperator__Alternatives"


    // $ANTLR start "rule__Configurator__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1118:1: rule__Configurator__Group__0 : rule__Configurator__Group__0__Impl rule__Configurator__Group__1 ;
    public final void rule__Configurator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1122:1: ( rule__Configurator__Group__0__Impl rule__Configurator__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1123:2: rule__Configurator__Group__0__Impl rule__Configurator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__02342);
            rule__Configurator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__02345);
            rule__Configurator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__0"


    // $ANTLR start "rule__Configurator__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1130:1: rule__Configurator__Group__0__Impl : ( 'configurator' ) ;
    public final void rule__Configurator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1134:1: ( ( 'configurator' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1135:1: ( 'configurator' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1135:1: ( 'configurator' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1136:1: 'configurator'
            {
             before(grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Configurator__Group__0__Impl2373); 
             after(grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__0__Impl"


    // $ANTLR start "rule__Configurator__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1149:1: rule__Configurator__Group__1 : rule__Configurator__Group__1__Impl rule__Configurator__Group__2 ;
    public final void rule__Configurator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1153:1: ( rule__Configurator__Group__1__Impl rule__Configurator__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1154:2: rule__Configurator__Group__1__Impl rule__Configurator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__12404);
            rule__Configurator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__12407);
            rule__Configurator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__1"


    // $ANTLR start "rule__Configurator__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1161:1: rule__Configurator__Group__1__Impl : ( ( rule__Configurator__NameAssignment_1 ) ) ;
    public final void rule__Configurator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1165:1: ( ( ( rule__Configurator__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1166:1: ( ( rule__Configurator__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1166:1: ( ( rule__Configurator__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1167:1: ( rule__Configurator__NameAssignment_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1168:1: ( rule__Configurator__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1168:2: rule__Configurator__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__NameAssignment_1_in_rule__Configurator__Group__1__Impl2434);
            rule__Configurator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__1__Impl"


    // $ANTLR start "rule__Configurator__Group__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1178:1: rule__Configurator__Group__2 : rule__Configurator__Group__2__Impl rule__Configurator__Group__3 ;
    public final void rule__Configurator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1182:1: ( rule__Configurator__Group__2__Impl rule__Configurator__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1183:2: rule__Configurator__Group__2__Impl rule__Configurator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__22464);
            rule__Configurator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__22467);
            rule__Configurator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__2"


    // $ANTLR start "rule__Configurator__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1190:1: rule__Configurator__Group__2__Impl : ( ( rule__Configurator__DescriptionAssignment_2 )? ) ;
    public final void rule__Configurator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1194:1: ( ( ( rule__Configurator__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1195:1: ( ( rule__Configurator__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1195:1: ( ( rule__Configurator__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1196:1: ( rule__Configurator__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getConfiguratorAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1197:1: ( rule__Configurator__DescriptionAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1197:2: rule__Configurator__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configurator__DescriptionAssignment_2_in_rule__Configurator__Group__2__Impl2494);
                    rule__Configurator__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguratorAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__2__Impl"


    // $ANTLR start "rule__Configurator__Group__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1207:1: rule__Configurator__Group__3 : rule__Configurator__Group__3__Impl rule__Configurator__Group__4 ;
    public final void rule__Configurator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1211:1: ( rule__Configurator__Group__3__Impl rule__Configurator__Group__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1212:2: rule__Configurator__Group__3__Impl rule__Configurator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__32525);
            rule__Configurator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__32528);
            rule__Configurator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__3"


    // $ANTLR start "rule__Configurator__Group__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1219:1: rule__Configurator__Group__3__Impl : ( '{' ) ;
    public final void rule__Configurator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1223:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1224:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1224:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1225:1: '{'
            {
             before(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Configurator__Group__3__Impl2556); 
             after(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__3__Impl"


    // $ANTLR start "rule__Configurator__Group__4"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1238:1: rule__Configurator__Group__4 : rule__Configurator__Group__4__Impl rule__Configurator__Group__5 ;
    public final void rule__Configurator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1242:1: ( rule__Configurator__Group__4__Impl rule__Configurator__Group__5 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1243:2: rule__Configurator__Group__4__Impl rule__Configurator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__42587);
            rule__Configurator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__42590);
            rule__Configurator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__4"


    // $ANTLR start "rule__Configurator__Group__4__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1250:1: rule__Configurator__Group__4__Impl : ( ( rule__Configurator__ParametersAssignment_4 ) ) ;
    public final void rule__Configurator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1254:1: ( ( ( rule__Configurator__ParametersAssignment_4 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1255:1: ( ( rule__Configurator__ParametersAssignment_4 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1255:1: ( ( rule__Configurator__ParametersAssignment_4 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1256:1: ( rule__Configurator__ParametersAssignment_4 )
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAssignment_4()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1257:1: ( rule__Configurator__ParametersAssignment_4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1257:2: rule__Configurator__ParametersAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__ParametersAssignment_4_in_rule__Configurator__Group__4__Impl2617);
            rule__Configurator__ParametersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__4__Impl"


    // $ANTLR start "rule__Configurator__Group__5"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1267:1: rule__Configurator__Group__5 : rule__Configurator__Group__5__Impl rule__Configurator__Group__6 ;
    public final void rule__Configurator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1271:1: ( rule__Configurator__Group__5__Impl rule__Configurator__Group__6 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1272:2: rule__Configurator__Group__5__Impl rule__Configurator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__52647);
            rule__Configurator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__52650);
            rule__Configurator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__5"


    // $ANTLR start "rule__Configurator__Group__5__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1279:1: rule__Configurator__Group__5__Impl : ( ( rule__Configurator__Group_5__0 )* ) ;
    public final void rule__Configurator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1283:1: ( ( ( rule__Configurator__Group_5__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1284:1: ( ( rule__Configurator__Group_5__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1284:1: ( ( rule__Configurator__Group_5__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1285:1: ( rule__Configurator__Group_5__0 )*
            {
             before(grammarAccess.getConfiguratorAccess().getGroup_5()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1286:1: ( rule__Configurator__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=27 && LA11_0<=28)||LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1286:2: rule__Configurator__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl2677);
            	    rule__Configurator__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConfiguratorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__5__Impl"


    // $ANTLR start "rule__Configurator__Group__6"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1296:1: rule__Configurator__Group__6 : rule__Configurator__Group__6__Impl ;
    public final void rule__Configurator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1300:1: ( rule__Configurator__Group__6__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1301:2: rule__Configurator__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__62708);
            rule__Configurator__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__6"


    // $ANTLR start "rule__Configurator__Group__6__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1307:1: rule__Configurator__Group__6__Impl : ( '}' ) ;
    public final void rule__Configurator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1311:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1312:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1312:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1313:1: '}'
            {
             before(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Configurator__Group__6__Impl2736); 
             after(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__6__Impl"


    // $ANTLR start "rule__Configurator__Group_5__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1340:1: rule__Configurator__Group_5__0 : rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 ;
    public final void rule__Configurator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1344:1: ( rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1345:2: rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__02781);
            rule__Configurator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__02784);
            rule__Configurator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group_5__0"


    // $ANTLR start "rule__Configurator__Group_5__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1352:1: rule__Configurator__Group_5__0__Impl : ( ( ',' )? ) ;
    public final void rule__Configurator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1356:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1357:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1357:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1358:1: ( ',' )?
            {
             before(grammarAccess.getConfiguratorAccess().getCommaKeyword_5_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1359:1: ( ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1360:2: ','
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Configurator__Group_5__0__Impl2813); 

                    }
                    break;

            }

             after(grammarAccess.getConfiguratorAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group_5__0__Impl"


    // $ANTLR start "rule__Configurator__Group_5__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1371:1: rule__Configurator__Group_5__1 : rule__Configurator__Group_5__1__Impl ;
    public final void rule__Configurator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1375:1: ( rule__Configurator__Group_5__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1376:2: rule__Configurator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__12846);
            rule__Configurator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group_5__1"


    // $ANTLR start "rule__Configurator__Group_5__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1382:1: rule__Configurator__Group_5__1__Impl : ( ( rule__Configurator__ParametersAssignment_5_1 ) ) ;
    public final void rule__Configurator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1386:1: ( ( ( rule__Configurator__ParametersAssignment_5_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1387:1: ( ( rule__Configurator__ParametersAssignment_5_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1387:1: ( ( rule__Configurator__ParametersAssignment_5_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1388:1: ( rule__Configurator__ParametersAssignment_5_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAssignment_5_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1389:1: ( rule__Configurator__ParametersAssignment_5_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1389:2: rule__Configurator__ParametersAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__ParametersAssignment_5_1_in_rule__Configurator__Group_5__1__Impl2873);
            rule__Configurator__ParametersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getParametersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group_5__1__Impl"


    // $ANTLR start "rule__ParameterGroup__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1403:1: rule__ParameterGroup__Group__0 : rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1 ;
    public final void rule__ParameterGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1407:1: ( rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1408:2: rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__0__Impl_in_rule__ParameterGroup__Group__02907);
            rule__ParameterGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__1_in_rule__ParameterGroup__Group__02910);
            rule__ParameterGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__0"


    // $ANTLR start "rule__ParameterGroup__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1415:1: rule__ParameterGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__ParameterGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1419:1: ( ( 'group' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1420:1: ( 'group' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1420:1: ( 'group' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1421:1: 'group'
            {
             before(grammarAccess.getParameterGroupAccess().getGroupKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ParameterGroup__Group__0__Impl2938); 
             after(grammarAccess.getParameterGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__0__Impl"


    // $ANTLR start "rule__ParameterGroup__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1434:1: rule__ParameterGroup__Group__1 : rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2 ;
    public final void rule__ParameterGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1438:1: ( rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1439:2: rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__1__Impl_in_rule__ParameterGroup__Group__12969);
            rule__ParameterGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__2_in_rule__ParameterGroup__Group__12972);
            rule__ParameterGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__1"


    // $ANTLR start "rule__ParameterGroup__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1446:1: rule__ParameterGroup__Group__1__Impl : ( ( rule__ParameterGroup__NameAssignment_1 ) ) ;
    public final void rule__ParameterGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1450:1: ( ( ( rule__ParameterGroup__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1451:1: ( ( rule__ParameterGroup__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1451:1: ( ( rule__ParameterGroup__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1452:1: ( rule__ParameterGroup__NameAssignment_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1453:1: ( rule__ParameterGroup__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1453:2: rule__ParameterGroup__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__NameAssignment_1_in_rule__ParameterGroup__Group__1__Impl2999);
            rule__ParameterGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__1__Impl"


    // $ANTLR start "rule__ParameterGroup__Group__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1463:1: rule__ParameterGroup__Group__2 : rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3 ;
    public final void rule__ParameterGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1467:1: ( rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1468:2: rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__2__Impl_in_rule__ParameterGroup__Group__23029);
            rule__ParameterGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__3_in_rule__ParameterGroup__Group__23032);
            rule__ParameterGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__2"


    // $ANTLR start "rule__ParameterGroup__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1475:1: rule__ParameterGroup__Group__2__Impl : ( ( rule__ParameterGroup__DescriptionAssignment_2 )? ) ;
    public final void rule__ParameterGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1479:1: ( ( ( rule__ParameterGroup__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1480:1: ( ( rule__ParameterGroup__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1480:1: ( ( rule__ParameterGroup__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1481:1: ( rule__ParameterGroup__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getParameterGroupAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1482:1: ( rule__ParameterGroup__DescriptionAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1482:2: rule__ParameterGroup__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__DescriptionAssignment_2_in_rule__ParameterGroup__Group__2__Impl3059);
                    rule__ParameterGroup__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterGroupAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__2__Impl"


    // $ANTLR start "rule__ParameterGroup__Group__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1492:1: rule__ParameterGroup__Group__3 : rule__ParameterGroup__Group__3__Impl ;
    public final void rule__ParameterGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1496:1: ( rule__ParameterGroup__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1497:2: rule__ParameterGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__3__Impl_in_rule__ParameterGroup__Group__33090);
            rule__ParameterGroup__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__3"


    // $ANTLR start "rule__ParameterGroup__Group__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1503:1: rule__ParameterGroup__Group__3__Impl : ( ( rule__ParameterGroup__UnorderedGroup_3 ) ) ;
    public final void rule__ParameterGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1507:1: ( ( ( rule__ParameterGroup__UnorderedGroup_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1508:1: ( ( rule__ParameterGroup__UnorderedGroup_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1508:1: ( ( rule__ParameterGroup__UnorderedGroup_3 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1509:1: ( rule__ParameterGroup__UnorderedGroup_3 )
            {
             before(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1510:1: ( rule__ParameterGroup__UnorderedGroup_3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1510:2: rule__ParameterGroup__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3_in_rule__ParameterGroup__Group__3__Impl3117);
            rule__ParameterGroup__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group__3__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_0__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1528:1: rule__ParameterGroup__Group_3_0__0 : rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1 ;
    public final void rule__ParameterGroup__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1532:1: ( rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1533:2: rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__0__Impl_in_rule__ParameterGroup__Group_3_0__03155);
            rule__ParameterGroup__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__1_in_rule__ParameterGroup__Group_3_0__03158);
            rule__ParameterGroup__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_0__0"


    // $ANTLR start "rule__ParameterGroup__Group_3_0__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1540:1: rule__ParameterGroup__Group_3_0__0__Impl : ( 'visible-if' ) ;
    public final void rule__ParameterGroup__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1544:1: ( ( 'visible-if' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1545:1: ( 'visible-if' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1545:1: ( 'visible-if' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1546:1: 'visible-if'
            {
             before(grammarAccess.getParameterGroupAccess().getVisibleIfKeyword_3_0_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParameterGroup__Group_3_0__0__Impl3186); 
             after(grammarAccess.getParameterGroupAccess().getVisibleIfKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_0__0__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_0__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1559:1: rule__ParameterGroup__Group_3_0__1 : rule__ParameterGroup__Group_3_0__1__Impl ;
    public final void rule__ParameterGroup__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1563:1: ( rule__ParameterGroup__Group_3_0__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1564:2: rule__ParameterGroup__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__1__Impl_in_rule__ParameterGroup__Group_3_0__13217);
            rule__ParameterGroup__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_0__1"


    // $ANTLR start "rule__ParameterGroup__Group_3_0__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1570:1: rule__ParameterGroup__Group_3_0__1__Impl : ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1574:1: ( ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1575:1: ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1575:1: ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1576:1: ( rule__ParameterGroup__VisibilityAssignment_3_0_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getVisibilityAssignment_3_0_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1577:1: ( rule__ParameterGroup__VisibilityAssignment_3_0_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1577:2: rule__ParameterGroup__VisibilityAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__VisibilityAssignment_3_0_1_in_rule__ParameterGroup__Group_3_0__1__Impl3244);
            rule__ParameterGroup__VisibilityAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getVisibilityAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_0__1__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1591:1: rule__ParameterGroup__Group_3_1__0 : rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1 ;
    public final void rule__ParameterGroup__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1595:1: ( rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1596:2: rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__0__Impl_in_rule__ParameterGroup__Group_3_1__03278);
            rule__ParameterGroup__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__1_in_rule__ParameterGroup__Group_3_1__03281);
            rule__ParameterGroup__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__0"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1603:1: rule__ParameterGroup__Group_3_1__0__Impl : ( 'constraints' ) ;
    public final void rule__ParameterGroup__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1607:1: ( ( 'constraints' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1608:1: ( 'constraints' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1608:1: ( 'constraints' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1609:1: 'constraints'
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsKeyword_3_1_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParameterGroup__Group_3_1__0__Impl3309); 
             after(grammarAccess.getParameterGroupAccess().getConstraintsKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__0__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1622:1: rule__ParameterGroup__Group_3_1__1 : rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2 ;
    public final void rule__ParameterGroup__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1626:1: ( rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1627:2: rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__1__Impl_in_rule__ParameterGroup__Group_3_1__13340);
            rule__ParameterGroup__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__2_in_rule__ParameterGroup__Group_3_1__13343);
            rule__ParameterGroup__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__1"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1634:1: rule__ParameterGroup__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__ParameterGroup__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1638:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1639:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1639:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1640:1: '{'
            {
             before(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ParameterGroup__Group_3_1__1__Impl3371); 
             after(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__1__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1653:1: rule__ParameterGroup__Group_3_1__2 : rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3 ;
    public final void rule__ParameterGroup__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1657:1: ( rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1658:2: rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__2__Impl_in_rule__ParameterGroup__Group_3_1__23402);
            rule__ParameterGroup__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__3_in_rule__ParameterGroup__Group_3_1__23405);
            rule__ParameterGroup__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__2"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1665:1: rule__ParameterGroup__Group_3_1__2__Impl : ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) ) ;
    public final void rule__ParameterGroup__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1669:1: ( ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1670:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1670:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1671:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 )
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1672:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1672:2: rule__ParameterGroup__ConstraintsAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_2_in_rule__ParameterGroup__Group_3_1__2__Impl3432);
            rule__ParameterGroup__ConstraintsAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__2__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1682:1: rule__ParameterGroup__Group_3_1__3 : rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4 ;
    public final void rule__ParameterGroup__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1686:1: ( rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1687:2: rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__3__Impl_in_rule__ParameterGroup__Group_3_1__33462);
            rule__ParameterGroup__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__4_in_rule__ParameterGroup__Group_3_1__33465);
            rule__ParameterGroup__Group_3_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__3"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1694:1: rule__ParameterGroup__Group_3_1__3__Impl : ( ( rule__ParameterGroup__Group_3_1_3__0 )* ) ;
    public final void rule__ParameterGroup__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1698:1: ( ( ( rule__ParameterGroup__Group_3_1_3__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1699:1: ( ( rule__ParameterGroup__Group_3_1_3__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1699:1: ( ( rule__ParameterGroup__Group_3_1_3__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1700:1: ( rule__ParameterGroup__Group_3_1_3__0 )*
            {
             before(grammarAccess.getParameterGroupAccess().getGroup_3_1_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1701:1: ( rule__ParameterGroup__Group_3_1_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=RULE_INT && LA14_1<=RULE_STRING)||(LA14_1>=15 && LA14_1<=16)||(LA14_1>=22 && LA14_1<=23)||LA14_1==34||LA14_1==39) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1701:2: rule__ParameterGroup__Group_3_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__0_in_rule__ParameterGroup__Group_3_1__3__Impl3492);
            	    rule__ParameterGroup__Group_3_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getParameterGroupAccess().getGroup_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__3__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__4"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1711:1: rule__ParameterGroup__Group_3_1__4 : rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5 ;
    public final void rule__ParameterGroup__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1715:1: ( rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1716:2: rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__4__Impl_in_rule__ParameterGroup__Group_3_1__43523);
            rule__ParameterGroup__Group_3_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__5_in_rule__ParameterGroup__Group_3_1__43526);
            rule__ParameterGroup__Group_3_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__4"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__4__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1723:1: rule__ParameterGroup__Group_3_1__4__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1727:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1728:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1728:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1729:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_4()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1730:1: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1731:2: ','
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__ParameterGroup__Group_3_1__4__Impl3555); 

                    }
                    break;

            }

             after(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__4__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__5"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1742:1: rule__ParameterGroup__Group_3_1__5 : rule__ParameterGroup__Group_3_1__5__Impl ;
    public final void rule__ParameterGroup__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1746:1: ( rule__ParameterGroup__Group_3_1__5__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1747:2: rule__ParameterGroup__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__5__Impl_in_rule__ParameterGroup__Group_3_1__53588);
            rule__ParameterGroup__Group_3_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__5"


    // $ANTLR start "rule__ParameterGroup__Group_3_1__5__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1753:1: rule__ParameterGroup__Group_3_1__5__Impl : ( '}' ) ;
    public final void rule__ParameterGroup__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1757:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1758:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1758:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1759:1: '}'
            {
             before(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_1_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ParameterGroup__Group_3_1__5__Impl3616); 
             after(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1__5__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1_3__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1784:1: rule__ParameterGroup__Group_3_1_3__0 : rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1 ;
    public final void rule__ParameterGroup__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1788:1: ( rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1789:2: rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__0__Impl_in_rule__ParameterGroup__Group_3_1_3__03659);
            rule__ParameterGroup__Group_3_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__1_in_rule__ParameterGroup__Group_3_1_3__03662);
            rule__ParameterGroup__Group_3_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1_3__0"


    // $ANTLR start "rule__ParameterGroup__Group_3_1_3__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1796:1: rule__ParameterGroup__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__ParameterGroup__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1800:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1801:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1801:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1802:1: ','
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ParameterGroup__Group_3_1_3__0__Impl3690); 
             after(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1_3__0__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_1_3__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1815:1: rule__ParameterGroup__Group_3_1_3__1 : rule__ParameterGroup__Group_3_1_3__1__Impl ;
    public final void rule__ParameterGroup__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1819:1: ( rule__ParameterGroup__Group_3_1_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1820:2: rule__ParameterGroup__Group_3_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__1__Impl_in_rule__ParameterGroup__Group_3_1_3__13721);
            rule__ParameterGroup__Group_3_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1_3__1"


    // $ANTLR start "rule__ParameterGroup__Group_3_1_3__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1826:1: rule__ParameterGroup__Group_3_1_3__1__Impl : ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1830:1: ( ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1831:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1831:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1832:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1833:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1833:2: rule__ParameterGroup__ConstraintsAssignment_3_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_3_1_in_rule__ParameterGroup__Group_3_1_3__1__Impl3748);
            rule__ParameterGroup__ConstraintsAssignment_3_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_1_3__1__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1847:1: rule__ParameterGroup__Group_3_2__0 : rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1 ;
    public final void rule__ParameterGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1851:1: ( rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1852:2: rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__0__Impl_in_rule__ParameterGroup__Group_3_2__03782);
            rule__ParameterGroup__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__1_in_rule__ParameterGroup__Group_3_2__03785);
            rule__ParameterGroup__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__0"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1859:1: rule__ParameterGroup__Group_3_2__0__Impl : ( '{' ) ;
    public final void rule__ParameterGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1863:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1864:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1864:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1865:1: '{'
            {
             before(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ParameterGroup__Group_3_2__0__Impl3813); 
             after(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__0__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1878:1: rule__ParameterGroup__Group_3_2__1 : rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2 ;
    public final void rule__ParameterGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1882:1: ( rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1883:2: rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__1__Impl_in_rule__ParameterGroup__Group_3_2__13844);
            rule__ParameterGroup__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__2_in_rule__ParameterGroup__Group_3_2__13847);
            rule__ParameterGroup__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__1"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1890:1: rule__ParameterGroup__Group_3_2__1__Impl : ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1894:1: ( ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1895:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1895:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1896:1: ( rule__ParameterGroup__ParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1897:1: ( rule__ParameterGroup__ParametersAssignment_3_2_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1897:2: rule__ParameterGroup__ParametersAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_1_in_rule__ParameterGroup__Group_3_2__1__Impl3874);
            rule__ParameterGroup__ParametersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__1__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1907:1: rule__ParameterGroup__Group_3_2__2 : rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3 ;
    public final void rule__ParameterGroup__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1911:1: ( rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1912:2: rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__2__Impl_in_rule__ParameterGroup__Group_3_2__23904);
            rule__ParameterGroup__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__3_in_rule__ParameterGroup__Group_3_2__23907);
            rule__ParameterGroup__Group_3_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__2"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1919:1: rule__ParameterGroup__Group_3_2__2__Impl : ( ( rule__ParameterGroup__Group_3_2_2__0 )* ) ;
    public final void rule__ParameterGroup__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1923:1: ( ( ( rule__ParameterGroup__Group_3_2_2__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1924:1: ( ( rule__ParameterGroup__Group_3_2_2__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1924:1: ( ( rule__ParameterGroup__Group_3_2_2__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1925:1: ( rule__ParameterGroup__Group_3_2_2__0 )*
            {
             before(grammarAccess.getParameterGroupAccess().getGroup_3_2_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1926:1: ( rule__ParameterGroup__Group_3_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==28||LA16_1==31) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==28||LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1926:2: rule__ParameterGroup__Group_3_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__0_in_rule__ParameterGroup__Group_3_2__2__Impl3934);
            	    rule__ParameterGroup__Group_3_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getParameterGroupAccess().getGroup_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__2__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1936:1: rule__ParameterGroup__Group_3_2__3 : rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4 ;
    public final void rule__ParameterGroup__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1940:1: ( rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1941:2: rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__3__Impl_in_rule__ParameterGroup__Group_3_2__33965);
            rule__ParameterGroup__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__4_in_rule__ParameterGroup__Group_3_2__33968);
            rule__ParameterGroup__Group_3_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__3"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1948:1: rule__ParameterGroup__Group_3_2__3__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1952:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1953:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1953:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1954:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1955:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1956:2: ','
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__ParameterGroup__Group_3_2__3__Impl3997); 

                    }
                    break;

            }

             after(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__3__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__4"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1967:1: rule__ParameterGroup__Group_3_2__4 : rule__ParameterGroup__Group_3_2__4__Impl ;
    public final void rule__ParameterGroup__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1971:1: ( rule__ParameterGroup__Group_3_2__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1972:2: rule__ParameterGroup__Group_3_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__4__Impl_in_rule__ParameterGroup__Group_3_2__44030);
            rule__ParameterGroup__Group_3_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__4"


    // $ANTLR start "rule__ParameterGroup__Group_3_2__4__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1978:1: rule__ParameterGroup__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__ParameterGroup__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1982:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1983:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1983:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1984:1: '}'
            {
             before(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ParameterGroup__Group_3_2__4__Impl4058); 
             after(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2__4__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_2_2__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2007:1: rule__ParameterGroup__Group_3_2_2__0 : rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1 ;
    public final void rule__ParameterGroup__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2011:1: ( rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2012:2: rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__0__Impl_in_rule__ParameterGroup__Group_3_2_2__04099);
            rule__ParameterGroup__Group_3_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__1_in_rule__ParameterGroup__Group_3_2_2__04102);
            rule__ParameterGroup__Group_3_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2_2__0"


    // $ANTLR start "rule__ParameterGroup__Group_3_2_2__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2019:1: rule__ParameterGroup__Group_3_2_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2023:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2024:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2024:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2025:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_2_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2026:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2027:2: ','
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__ParameterGroup__Group_3_2_2__0__Impl4131); 

                    }
                    break;

            }

             after(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2_2__0__Impl"


    // $ANTLR start "rule__ParameterGroup__Group_3_2_2__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2038:1: rule__ParameterGroup__Group_3_2_2__1 : rule__ParameterGroup__Group_3_2_2__1__Impl ;
    public final void rule__ParameterGroup__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2042:1: ( rule__ParameterGroup__Group_3_2_2__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2043:2: rule__ParameterGroup__Group_3_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__1__Impl_in_rule__ParameterGroup__Group_3_2_2__14164);
            rule__ParameterGroup__Group_3_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2_2__1"


    // $ANTLR start "rule__ParameterGroup__Group_3_2_2__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2049:1: rule__ParameterGroup__Group_3_2_2__1__Impl : ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2053:1: ( ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2054:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2054:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2055:1: ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2056:1: ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2056:2: rule__ParameterGroup__ParametersAssignment_3_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_2_1_in_rule__ParameterGroup__Group_3_2_2__1__Impl4191);
            rule__ParameterGroup__ParametersAssignment_3_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__Group_3_2_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2070:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2074:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2075:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04225);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04228);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2082:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2086:1: ( ( 'parameter' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2087:1: ( 'parameter' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2087:1: ( 'parameter' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2088:1: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Parameter__Group__0__Impl4256); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2101:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2105:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2106:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14287);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14290);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2113:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2117:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2118:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2118:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2119:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2120:1: ( rule__Parameter__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2120:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4317);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2130:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2134:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2135:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24347);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24350);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2142:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__DescriptionAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2146:1: ( ( ( rule__Parameter__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2147:1: ( ( rule__Parameter__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2147:1: ( ( rule__Parameter__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2148:1: ( rule__Parameter__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2149:1: ( rule__Parameter__DescriptionAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2149:2: rule__Parameter__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__DescriptionAssignment_2_in_rule__Parameter__Group__2__Impl4377);
                    rule__Parameter__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2159:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2163:1: ( rule__Parameter__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2164:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34408);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2170:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__UnorderedGroup_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2174:1: ( ( ( rule__Parameter__UnorderedGroup_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2175:1: ( ( rule__Parameter__UnorderedGroup_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2175:1: ( ( rule__Parameter__UnorderedGroup_3 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2176:1: ( rule__Parameter__UnorderedGroup_3 )
            {
             before(grammarAccess.getParameterAccess().getUnorderedGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2177:1: ( rule__Parameter__UnorderedGroup_3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2177:2: rule__Parameter__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3_in_rule__Parameter__Group__3__Impl4435);
            rule__Parameter__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group_3_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2195:1: rule__Parameter__Group_3_1__0 : rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1 ;
    public final void rule__Parameter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2199:1: ( rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2200:2: rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__0__Impl_in_rule__Parameter__Group_3_1__04473);
            rule__Parameter__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__1_in_rule__Parameter__Group_3_1__04476);
            rule__Parameter__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_1__0"


    // $ANTLR start "rule__Parameter__Group_3_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2207:1: rule__Parameter__Group_3_1__0__Impl : ( 'visible-if' ) ;
    public final void rule__Parameter__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2211:1: ( ( 'visible-if' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2212:1: ( 'visible-if' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2212:1: ( 'visible-if' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2213:1: 'visible-if'
            {
             before(grammarAccess.getParameterAccess().getVisibleIfKeyword_3_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Parameter__Group_3_1__0__Impl4504); 
             after(grammarAccess.getParameterAccess().getVisibleIfKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2226:1: rule__Parameter__Group_3_1__1 : rule__Parameter__Group_3_1__1__Impl ;
    public final void rule__Parameter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2230:1: ( rule__Parameter__Group_3_1__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2231:2: rule__Parameter__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__1__Impl_in_rule__Parameter__Group_3_1__14535);
            rule__Parameter__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_1__1"


    // $ANTLR start "rule__Parameter__Group_3_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2237:1: rule__Parameter__Group_3_1__1__Impl : ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) ) ;
    public final void rule__Parameter__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2241:1: ( ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2242:1: ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2242:1: ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2243:1: ( rule__Parameter__VisibilityAssignment_3_1_1 )
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_3_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2244:1: ( rule__Parameter__VisibilityAssignment_3_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2244:2: rule__Parameter__VisibilityAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__VisibilityAssignment_3_1_1_in_rule__Parameter__Group_3_1__1__Impl4562);
            rule__Parameter__VisibilityAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getVisibilityAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2258:1: rule__Parameter__Group_3_2__0 : rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 ;
    public final void rule__Parameter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2262:1: ( rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2263:2: rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__04596);
            rule__Parameter__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__04599);
            rule__Parameter__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__0"


    // $ANTLR start "rule__Parameter__Group_3_2__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2270:1: rule__Parameter__Group_3_2__0__Impl : ( 'default-value' ) ;
    public final void rule__Parameter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2274:1: ( ( 'default-value' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2275:1: ( 'default-value' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2275:1: ( 'default-value' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2276:1: 'default-value'
            {
             before(grammarAccess.getParameterAccess().getDefaultValueKeyword_3_2_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Parameter__Group_3_2__0__Impl4627); 
             after(grammarAccess.getParameterAccess().getDefaultValueKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2289:1: rule__Parameter__Group_3_2__1 : rule__Parameter__Group_3_2__1__Impl ;
    public final void rule__Parameter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2293:1: ( rule__Parameter__Group_3_2__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2294:2: rule__Parameter__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__14658);
            rule__Parameter__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__1"


    // $ANTLR start "rule__Parameter__Group_3_2__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2300:1: rule__Parameter__Group_3_2__1__Impl : ( ( rule__Parameter__DefaultAssignment_3_2_1 ) ) ;
    public final void rule__Parameter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2304:1: ( ( ( rule__Parameter__DefaultAssignment_3_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2305:1: ( ( rule__Parameter__DefaultAssignment_3_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2305:1: ( ( rule__Parameter__DefaultAssignment_3_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2306:1: ( rule__Parameter__DefaultAssignment_3_2_1 )
            {
             before(grammarAccess.getParameterAccess().getDefaultAssignment_3_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2307:1: ( rule__Parameter__DefaultAssignment_3_2_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2307:2: rule__Parameter__DefaultAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__DefaultAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl4685);
            rule__Parameter__DefaultAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDefaultAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2321:1: rule__Parameter__Group_3_3__0 : rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1 ;
    public final void rule__Parameter__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2325:1: ( rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2326:2: rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__0__Impl_in_rule__Parameter__Group_3_3__04719);
            rule__Parameter__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__1_in_rule__Parameter__Group_3_3__04722);
            rule__Parameter__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__0"


    // $ANTLR start "rule__Parameter__Group_3_3__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2333:1: rule__Parameter__Group_3_3__0__Impl : ( 'constraints' ) ;
    public final void rule__Parameter__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2337:1: ( ( 'constraints' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2338:1: ( 'constraints' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2338:1: ( 'constraints' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2339:1: 'constraints'
            {
             before(grammarAccess.getParameterAccess().getConstraintsKeyword_3_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Parameter__Group_3_3__0__Impl4750); 
             after(grammarAccess.getParameterAccess().getConstraintsKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2352:1: rule__Parameter__Group_3_3__1 : rule__Parameter__Group_3_3__1__Impl rule__Parameter__Group_3_3__2 ;
    public final void rule__Parameter__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2356:1: ( rule__Parameter__Group_3_3__1__Impl rule__Parameter__Group_3_3__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2357:2: rule__Parameter__Group_3_3__1__Impl rule__Parameter__Group_3_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__1__Impl_in_rule__Parameter__Group_3_3__14781);
            rule__Parameter__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__2_in_rule__Parameter__Group_3_3__14784);
            rule__Parameter__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__1"


    // $ANTLR start "rule__Parameter__Group_3_3__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2364:1: rule__Parameter__Group_3_3__1__Impl : ( '{' ) ;
    public final void rule__Parameter__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2368:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2369:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2369:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2370:1: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3_3_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Parameter__Group_3_3__1__Impl4812); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2383:1: rule__Parameter__Group_3_3__2 : rule__Parameter__Group_3_3__2__Impl rule__Parameter__Group_3_3__3 ;
    public final void rule__Parameter__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2387:1: ( rule__Parameter__Group_3_3__2__Impl rule__Parameter__Group_3_3__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2388:2: rule__Parameter__Group_3_3__2__Impl rule__Parameter__Group_3_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__2__Impl_in_rule__Parameter__Group_3_3__24843);
            rule__Parameter__Group_3_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__3_in_rule__Parameter__Group_3_3__24846);
            rule__Parameter__Group_3_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__2"


    // $ANTLR start "rule__Parameter__Group_3_3__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2395:1: rule__Parameter__Group_3_3__2__Impl : ( ( rule__Parameter__ConstraintsAssignment_3_3_2 ) ) ;
    public final void rule__Parameter__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2399:1: ( ( ( rule__Parameter__ConstraintsAssignment_3_3_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2400:1: ( ( rule__Parameter__ConstraintsAssignment_3_3_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2400:1: ( ( rule__Parameter__ConstraintsAssignment_3_3_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2401:1: ( rule__Parameter__ConstraintsAssignment_3_3_2 )
            {
             before(grammarAccess.getParameterAccess().getConstraintsAssignment_3_3_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2402:1: ( rule__Parameter__ConstraintsAssignment_3_3_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2402:2: rule__Parameter__ConstraintsAssignment_3_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ConstraintsAssignment_3_3_2_in_rule__Parameter__Group_3_3__2__Impl4873);
            rule__Parameter__ConstraintsAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getConstraintsAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__2__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2412:1: rule__Parameter__Group_3_3__3 : rule__Parameter__Group_3_3__3__Impl rule__Parameter__Group_3_3__4 ;
    public final void rule__Parameter__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2416:1: ( rule__Parameter__Group_3_3__3__Impl rule__Parameter__Group_3_3__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2417:2: rule__Parameter__Group_3_3__3__Impl rule__Parameter__Group_3_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__3__Impl_in_rule__Parameter__Group_3_3__34903);
            rule__Parameter__Group_3_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__4_in_rule__Parameter__Group_3_3__34906);
            rule__Parameter__Group_3_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__3"


    // $ANTLR start "rule__Parameter__Group_3_3__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2424:1: rule__Parameter__Group_3_3__3__Impl : ( ( rule__Parameter__Group_3_3_3__0 )* ) ;
    public final void rule__Parameter__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2428:1: ( ( ( rule__Parameter__Group_3_3_3__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2429:1: ( ( rule__Parameter__Group_3_3_3__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2429:1: ( ( rule__Parameter__Group_3_3_3__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2430:1: ( rule__Parameter__Group_3_3_3__0 )*
            {
             before(grammarAccess.getParameterAccess().getGroup_3_3_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2431:1: ( rule__Parameter__Group_3_3_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2431:2: rule__Parameter__Group_3_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3_3__0_in_rule__Parameter__Group_3_3__3__Impl4933);
            	    rule__Parameter__Group_3_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getGroup_3_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__3__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3__4"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2441:1: rule__Parameter__Group_3_3__4 : rule__Parameter__Group_3_3__4__Impl ;
    public final void rule__Parameter__Group_3_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2445:1: ( rule__Parameter__Group_3_3__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2446:2: rule__Parameter__Group_3_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__4__Impl_in_rule__Parameter__Group_3_3__44964);
            rule__Parameter__Group_3_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__4"


    // $ANTLR start "rule__Parameter__Group_3_3__4__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2452:1: rule__Parameter__Group_3_3__4__Impl : ( '}' ) ;
    public final void rule__Parameter__Group_3_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2456:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2457:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2457:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2458:1: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3_3_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Parameter__Group_3_3__4__Impl4992); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3__4__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3_3__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2481:1: rule__Parameter__Group_3_3_3__0 : rule__Parameter__Group_3_3_3__0__Impl rule__Parameter__Group_3_3_3__1 ;
    public final void rule__Parameter__Group_3_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2485:1: ( rule__Parameter__Group_3_3_3__0__Impl rule__Parameter__Group_3_3_3__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2486:2: rule__Parameter__Group_3_3_3__0__Impl rule__Parameter__Group_3_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3_3__0__Impl_in_rule__Parameter__Group_3_3_3__05033);
            rule__Parameter__Group_3_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3_3__1_in_rule__Parameter__Group_3_3_3__05036);
            rule__Parameter__Group_3_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3_3__0"


    // $ANTLR start "rule__Parameter__Group_3_3_3__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2493:1: rule__Parameter__Group_3_3_3__0__Impl : ( ',' ) ;
    public final void rule__Parameter__Group_3_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2497:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2498:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2498:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2499:1: ','
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_3_3_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Parameter__Group_3_3_3__0__Impl5064); 
             after(grammarAccess.getParameterAccess().getCommaKeyword_3_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3_3__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2512:1: rule__Parameter__Group_3_3_3__1 : rule__Parameter__Group_3_3_3__1__Impl ;
    public final void rule__Parameter__Group_3_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2516:1: ( rule__Parameter__Group_3_3_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2517:2: rule__Parameter__Group_3_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3_3__1__Impl_in_rule__Parameter__Group_3_3_3__15095);
            rule__Parameter__Group_3_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3_3__1"


    // $ANTLR start "rule__Parameter__Group_3_3_3__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2523:1: rule__Parameter__Group_3_3_3__1__Impl : ( ( rule__Parameter__ConstraintsAssignment_3_3_3_1 ) ) ;
    public final void rule__Parameter__Group_3_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2527:1: ( ( ( rule__Parameter__ConstraintsAssignment_3_3_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2528:1: ( ( rule__Parameter__ConstraintsAssignment_3_3_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2528:1: ( ( rule__Parameter__ConstraintsAssignment_3_3_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2529:1: ( rule__Parameter__ConstraintsAssignment_3_3_3_1 )
            {
             before(grammarAccess.getParameterAccess().getConstraintsAssignment_3_3_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2530:1: ( rule__Parameter__ConstraintsAssignment_3_3_3_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2530:2: rule__Parameter__ConstraintsAssignment_3_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ConstraintsAssignment_3_3_3_1_in_rule__Parameter__Group_3_3_3__1__Impl5122);
            rule__Parameter__ConstraintsAssignment_3_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getConstraintsAssignment_3_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_3_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3_4__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2544:1: rule__Parameter__Group_3_4__0 : rule__Parameter__Group_3_4__0__Impl rule__Parameter__Group_3_4__1 ;
    public final void rule__Parameter__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2548:1: ( rule__Parameter__Group_3_4__0__Impl rule__Parameter__Group_3_4__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2549:2: rule__Parameter__Group_3_4__0__Impl rule__Parameter__Group_3_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_4__0__Impl_in_rule__Parameter__Group_3_4__05156);
            rule__Parameter__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_4__1_in_rule__Parameter__Group_3_4__05159);
            rule__Parameter__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_4__0"


    // $ANTLR start "rule__Parameter__Group_3_4__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2556:1: rule__Parameter__Group_3_4__0__Impl : ( 'values' ) ;
    public final void rule__Parameter__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2560:1: ( ( 'values' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2561:1: ( 'values' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2561:1: ( 'values' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2562:1: 'values'
            {
             before(grammarAccess.getParameterAccess().getValuesKeyword_3_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter__Group_3_4__0__Impl5187); 
             after(grammarAccess.getParameterAccess().getValuesKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_4__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_4__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2575:1: rule__Parameter__Group_3_4__1 : rule__Parameter__Group_3_4__1__Impl ;
    public final void rule__Parameter__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2579:1: ( rule__Parameter__Group_3_4__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2580:2: rule__Parameter__Group_3_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_4__1__Impl_in_rule__Parameter__Group_3_4__15218);
            rule__Parameter__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_4__1"


    // $ANTLR start "rule__Parameter__Group_3_4__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2586:1: rule__Parameter__Group_3_4__1__Impl : ( ( rule__Parameter__ValueRangeAssignment_3_4_1 ) ) ;
    public final void rule__Parameter__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2590:1: ( ( ( rule__Parameter__ValueRangeAssignment_3_4_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2591:1: ( ( rule__Parameter__ValueRangeAssignment_3_4_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2591:1: ( ( rule__Parameter__ValueRangeAssignment_3_4_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2592:1: ( rule__Parameter__ValueRangeAssignment_3_4_1 )
            {
             before(grammarAccess.getParameterAccess().getValueRangeAssignment_3_4_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2593:1: ( rule__Parameter__ValueRangeAssignment_3_4_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2593:2: rule__Parameter__ValueRangeAssignment_3_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ValueRangeAssignment_3_4_1_in_rule__Parameter__Group_3_4__1__Impl5245);
            rule__Parameter__ValueRangeAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueRangeAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_4__1__Impl"


    // $ANTLR start "rule__Enumerated__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2607:1: rule__Enumerated__Group__0 : rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1 ;
    public final void rule__Enumerated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2611:1: ( rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2612:2: rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__0__Impl_in_rule__Enumerated__Group__05279);
            rule__Enumerated__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__1_in_rule__Enumerated__Group__05282);
            rule__Enumerated__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__0"


    // $ANTLR start "rule__Enumerated__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2619:1: rule__Enumerated__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2623:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2624:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2624:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2625:1: '('
            {
             before(grammarAccess.getEnumeratedAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Enumerated__Group__0__Impl5310); 
             after(grammarAccess.getEnumeratedAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__0__Impl"


    // $ANTLR start "rule__Enumerated__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2638:1: rule__Enumerated__Group__1 : rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2 ;
    public final void rule__Enumerated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2642:1: ( rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2643:2: rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__1__Impl_in_rule__Enumerated__Group__15341);
            rule__Enumerated__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__2_in_rule__Enumerated__Group__15344);
            rule__Enumerated__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__1"


    // $ANTLR start "rule__Enumerated__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2650:1: rule__Enumerated__Group__1__Impl : ( ( rule__Enumerated__ValuesAssignment_1 ) ) ;
    public final void rule__Enumerated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2654:1: ( ( ( rule__Enumerated__ValuesAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2655:1: ( ( rule__Enumerated__ValuesAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2655:1: ( ( rule__Enumerated__ValuesAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2656:1: ( rule__Enumerated__ValuesAssignment_1 )
            {
             before(grammarAccess.getEnumeratedAccess().getValuesAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2657:1: ( rule__Enumerated__ValuesAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2657:2: rule__Enumerated__ValuesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__ValuesAssignment_1_in_rule__Enumerated__Group__1__Impl5371);
            rule__Enumerated__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__1__Impl"


    // $ANTLR start "rule__Enumerated__Group__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2667:1: rule__Enumerated__Group__2 : rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3 ;
    public final void rule__Enumerated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2671:1: ( rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2672:2: rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__2__Impl_in_rule__Enumerated__Group__25401);
            rule__Enumerated__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__3_in_rule__Enumerated__Group__25404);
            rule__Enumerated__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__2"


    // $ANTLR start "rule__Enumerated__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2679:1: rule__Enumerated__Group__2__Impl : ( ( rule__Enumerated__Group_2__0 )* ) ;
    public final void rule__Enumerated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2683:1: ( ( ( rule__Enumerated__Group_2__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2684:1: ( ( rule__Enumerated__Group_2__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2684:1: ( ( rule__Enumerated__Group_2__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2685:1: ( rule__Enumerated__Group_2__0 )*
            {
             before(grammarAccess.getEnumeratedAccess().getGroup_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2686:1: ( rule__Enumerated__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2686:2: rule__Enumerated__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__0_in_rule__Enumerated__Group__2__Impl5431);
            	    rule__Enumerated__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEnumeratedAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__2__Impl"


    // $ANTLR start "rule__Enumerated__Group__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2696:1: rule__Enumerated__Group__3 : rule__Enumerated__Group__3__Impl ;
    public final void rule__Enumerated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2700:1: ( rule__Enumerated__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2701:2: rule__Enumerated__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__3__Impl_in_rule__Enumerated__Group__35462);
            rule__Enumerated__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__3"


    // $ANTLR start "rule__Enumerated__Group__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2707:1: rule__Enumerated__Group__3__Impl : ( ')' ) ;
    public final void rule__Enumerated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2711:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2712:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2712:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2713:1: ')'
            {
             before(grammarAccess.getEnumeratedAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Enumerated__Group__3__Impl5490); 
             after(grammarAccess.getEnumeratedAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group__3__Impl"


    // $ANTLR start "rule__Enumerated__Group_2__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2734:1: rule__Enumerated__Group_2__0 : rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1 ;
    public final void rule__Enumerated__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2738:1: ( rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2739:2: rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__0__Impl_in_rule__Enumerated__Group_2__05529);
            rule__Enumerated__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__1_in_rule__Enumerated__Group_2__05532);
            rule__Enumerated__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group_2__0"


    // $ANTLR start "rule__Enumerated__Group_2__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2746:1: rule__Enumerated__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enumerated__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2750:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2751:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2751:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2752:1: ','
            {
             before(grammarAccess.getEnumeratedAccess().getCommaKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Enumerated__Group_2__0__Impl5560); 
             after(grammarAccess.getEnumeratedAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group_2__0__Impl"


    // $ANTLR start "rule__Enumerated__Group_2__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2765:1: rule__Enumerated__Group_2__1 : rule__Enumerated__Group_2__1__Impl ;
    public final void rule__Enumerated__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2769:1: ( rule__Enumerated__Group_2__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2770:2: rule__Enumerated__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__1__Impl_in_rule__Enumerated__Group_2__15591);
            rule__Enumerated__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group_2__1"


    // $ANTLR start "rule__Enumerated__Group_2__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2776:1: rule__Enumerated__Group_2__1__Impl : ( ( rule__Enumerated__ValuesAssignment_2_1 ) ) ;
    public final void rule__Enumerated__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2780:1: ( ( ( rule__Enumerated__ValuesAssignment_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2781:1: ( ( rule__Enumerated__ValuesAssignment_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2781:1: ( ( rule__Enumerated__ValuesAssignment_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2782:1: ( rule__Enumerated__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getEnumeratedAccess().getValuesAssignment_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2783:1: ( rule__Enumerated__ValuesAssignment_2_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2783:2: rule__Enumerated__ValuesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__ValuesAssignment_2_1_in_rule__Enumerated__Group_2__1__Impl5618);
            rule__Enumerated__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__Group_2__1__Impl"


    // $ANTLR start "rule__Bounded__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2797:1: rule__Bounded__Group__0 : rule__Bounded__Group__0__Impl rule__Bounded__Group__1 ;
    public final void rule__Bounded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2801:1: ( rule__Bounded__Group__0__Impl rule__Bounded__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2802:2: rule__Bounded__Group__0__Impl rule__Bounded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__0__Impl_in_rule__Bounded__Group__05652);
            rule__Bounded__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__1_in_rule__Bounded__Group__05655);
            rule__Bounded__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__0"


    // $ANTLR start "rule__Bounded__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2809:1: rule__Bounded__Group__0__Impl : ( '[' ) ;
    public final void rule__Bounded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2813:1: ( ( '[' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2814:1: ( '[' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2814:1: ( '[' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2815:1: '['
            {
             before(grammarAccess.getBoundedAccess().getLeftSquareBracketKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Bounded__Group__0__Impl5683); 
             after(grammarAccess.getBoundedAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__0__Impl"


    // $ANTLR start "rule__Bounded__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2828:1: rule__Bounded__Group__1 : rule__Bounded__Group__1__Impl rule__Bounded__Group__2 ;
    public final void rule__Bounded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2832:1: ( rule__Bounded__Group__1__Impl rule__Bounded__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2833:2: rule__Bounded__Group__1__Impl rule__Bounded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__1__Impl_in_rule__Bounded__Group__15714);
            rule__Bounded__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__2_in_rule__Bounded__Group__15717);
            rule__Bounded__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__1"


    // $ANTLR start "rule__Bounded__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2840:1: rule__Bounded__Group__1__Impl : ( ( rule__Bounded__LowerBoundAssignment_1 ) ) ;
    public final void rule__Bounded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2844:1: ( ( ( rule__Bounded__LowerBoundAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2845:1: ( ( rule__Bounded__LowerBoundAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2845:1: ( ( rule__Bounded__LowerBoundAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2846:1: ( rule__Bounded__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getBoundedAccess().getLowerBoundAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2847:1: ( rule__Bounded__LowerBoundAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2847:2: rule__Bounded__LowerBoundAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__LowerBoundAssignment_1_in_rule__Bounded__Group__1__Impl5744);
            rule__Bounded__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundedAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__1__Impl"


    // $ANTLR start "rule__Bounded__Group__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2857:1: rule__Bounded__Group__2 : rule__Bounded__Group__2__Impl rule__Bounded__Group__3 ;
    public final void rule__Bounded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2861:1: ( rule__Bounded__Group__2__Impl rule__Bounded__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2862:2: rule__Bounded__Group__2__Impl rule__Bounded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__2__Impl_in_rule__Bounded__Group__25774);
            rule__Bounded__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__3_in_rule__Bounded__Group__25777);
            rule__Bounded__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__2"


    // $ANTLR start "rule__Bounded__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2869:1: rule__Bounded__Group__2__Impl : ( ';' ) ;
    public final void rule__Bounded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2873:1: ( ( ';' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2874:1: ( ';' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2874:1: ( ';' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2875:1: ';'
            {
             before(grammarAccess.getBoundedAccess().getSemicolonKeyword_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Bounded__Group__2__Impl5805); 
             after(grammarAccess.getBoundedAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__2__Impl"


    // $ANTLR start "rule__Bounded__Group__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2888:1: rule__Bounded__Group__3 : rule__Bounded__Group__3__Impl rule__Bounded__Group__4 ;
    public final void rule__Bounded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2892:1: ( rule__Bounded__Group__3__Impl rule__Bounded__Group__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2893:2: rule__Bounded__Group__3__Impl rule__Bounded__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__3__Impl_in_rule__Bounded__Group__35836);
            rule__Bounded__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__4_in_rule__Bounded__Group__35839);
            rule__Bounded__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__3"


    // $ANTLR start "rule__Bounded__Group__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2900:1: rule__Bounded__Group__3__Impl : ( ( rule__Bounded__UpperBoundAssignment_3 ) ) ;
    public final void rule__Bounded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2904:1: ( ( ( rule__Bounded__UpperBoundAssignment_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2905:1: ( ( rule__Bounded__UpperBoundAssignment_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2905:1: ( ( rule__Bounded__UpperBoundAssignment_3 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2906:1: ( rule__Bounded__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getBoundedAccess().getUpperBoundAssignment_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2907:1: ( rule__Bounded__UpperBoundAssignment_3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2907:2: rule__Bounded__UpperBoundAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__UpperBoundAssignment_3_in_rule__Bounded__Group__3__Impl5866);
            rule__Bounded__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoundedAccess().getUpperBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__3__Impl"


    // $ANTLR start "rule__Bounded__Group__4"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2917:1: rule__Bounded__Group__4 : rule__Bounded__Group__4__Impl ;
    public final void rule__Bounded__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2921:1: ( rule__Bounded__Group__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2922:2: rule__Bounded__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__4__Impl_in_rule__Bounded__Group__45896);
            rule__Bounded__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__4"


    // $ANTLR start "rule__Bounded__Group__4__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2928:1: rule__Bounded__Group__4__Impl : ( ']' ) ;
    public final void rule__Bounded__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2932:1: ( ( ']' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2933:1: ( ']' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2933:1: ( ']' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2934:1: ']'
            {
             before(grammarAccess.getBoundedAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Bounded__Group__4__Impl5924); 
             after(grammarAccess.getBoundedAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2957:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2961:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2962:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__05965);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__05968);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2969:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__Group_0__0 )? ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2973:1: ( ( ( rule__Constraint__Group_0__0 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2974:1: ( ( rule__Constraint__Group_0__0 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2974:1: ( ( rule__Constraint__Group_0__0 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2975:1: ( rule__Constraint__Group_0__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2976:1: ( rule__Constraint__Group_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2976:2: rule__Constraint__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__0_in_rule__Constraint__Group__0__Impl5995);
                    rule__Constraint__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2986:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2990:1: ( rule__Constraint__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2991:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16026);
            rule__Constraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2997:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ExpressionAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3001:1: ( ( ( rule__Constraint__ExpressionAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3002:1: ( ( rule__Constraint__ExpressionAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3002:1: ( ( rule__Constraint__ExpressionAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3003:1: ( rule__Constraint__ExpressionAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getExpressionAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3004:1: ( rule__Constraint__ExpressionAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3004:2: rule__Constraint__ExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__ExpressionAssignment_1_in_rule__Constraint__Group__1__Impl6053);
            rule__Constraint__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group_0__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3018:1: rule__Constraint__Group_0__0 : rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 ;
    public final void rule__Constraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3022:1: ( rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3023:2: rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__0__Impl_in_rule__Constraint__Group_0__06087);
            rule__Constraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__1_in_rule__Constraint__Group_0__06090);
            rule__Constraint__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__0"


    // $ANTLR start "rule__Constraint__Group_0__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3030:1: rule__Constraint__Group_0__0__Impl : ( 'description' ) ;
    public final void rule__Constraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3034:1: ( ( 'description' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3035:1: ( 'description' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3035:1: ( 'description' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3036:1: 'description'
            {
             before(grammarAccess.getConstraintAccess().getDescriptionKeyword_0_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Constraint__Group_0__0__Impl6118); 
             after(grammarAccess.getConstraintAccess().getDescriptionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__0__Impl"


    // $ANTLR start "rule__Constraint__Group_0__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3049:1: rule__Constraint__Group_0__1 : rule__Constraint__Group_0__1__Impl ;
    public final void rule__Constraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3053:1: ( rule__Constraint__Group_0__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3054:2: rule__Constraint__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__1__Impl_in_rule__Constraint__Group_0__16149);
            rule__Constraint__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__1"


    // $ANTLR start "rule__Constraint__Group_0__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3060:1: rule__Constraint__Group_0__1__Impl : ( ( rule__Constraint__DescriptionAssignment_0_1 ) ) ;
    public final void rule__Constraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3064:1: ( ( ( rule__Constraint__DescriptionAssignment_0_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3065:1: ( ( rule__Constraint__DescriptionAssignment_0_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3065:1: ( ( rule__Constraint__DescriptionAssignment_0_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3066:1: ( rule__Constraint__DescriptionAssignment_0_1 )
            {
             before(grammarAccess.getConstraintAccess().getDescriptionAssignment_0_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3067:1: ( rule__Constraint__DescriptionAssignment_0_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3067:2: rule__Constraint__DescriptionAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__DescriptionAssignment_0_1_in_rule__Constraint__Group_0__1__Impl6176);
            rule__Constraint__DescriptionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getDescriptionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__1__Impl"


    // $ANTLR start "rule__LogicalOr__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3081:1: rule__LogicalOr__Group__0 : rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 ;
    public final void rule__LogicalOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3085:1: ( rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3086:2: rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group__0__Impl_in_rule__LogicalOr__Group__06210);
            rule__LogicalOr__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group__1_in_rule__LogicalOr__Group__06213);
            rule__LogicalOr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__0"


    // $ANTLR start "rule__LogicalOr__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3093:1: rule__LogicalOr__Group__0__Impl : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3097:1: ( ( ruleLogicalAnd ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3098:1: ( ruleLogicalAnd )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3098:1: ( ruleLogicalAnd )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3099:1: ruleLogicalAnd
            {
             before(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__Group__0__Impl6240);
            ruleLogicalAnd();

            state._fsp--;

             after(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__0__Impl"


    // $ANTLR start "rule__LogicalOr__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3110:1: rule__LogicalOr__Group__1 : rule__LogicalOr__Group__1__Impl ;
    public final void rule__LogicalOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3114:1: ( rule__LogicalOr__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3115:2: rule__LogicalOr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group__1__Impl_in_rule__LogicalOr__Group__16269);
            rule__LogicalOr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__1"


    // $ANTLR start "rule__LogicalOr__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3121:1: rule__LogicalOr__Group__1__Impl : ( ( rule__LogicalOr__Group_1__0 )* ) ;
    public final void rule__LogicalOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3125:1: ( ( ( rule__LogicalOr__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3126:1: ( ( rule__LogicalOr__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3126:1: ( ( rule__LogicalOr__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3127:1: ( rule__LogicalOr__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3128:1: ( rule__LogicalOr__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==11) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3128:2: rule__LogicalOr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group_1__0_in_rule__LogicalOr__Group__1__Impl6296);
            	    rule__LogicalOr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getLogicalOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__1__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3142:1: rule__LogicalOr__Group_1__0 : rule__LogicalOr__Group_1__0__Impl rule__LogicalOr__Group_1__1 ;
    public final void rule__LogicalOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3146:1: ( rule__LogicalOr__Group_1__0__Impl rule__LogicalOr__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3147:2: rule__LogicalOr__Group_1__0__Impl rule__LogicalOr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group_1__0__Impl_in_rule__LogicalOr__Group_1__06331);
            rule__LogicalOr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group_1__1_in_rule__LogicalOr__Group_1__06334);
            rule__LogicalOr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__0"


    // $ANTLR start "rule__LogicalOr__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3154:1: rule__LogicalOr__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3158:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3159:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3159:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3160:1: ()
            {
             before(grammarAccess.getLogicalOrAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3161:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3163:1: 
            {
            }

             after(grammarAccess.getLogicalOrAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3173:1: rule__LogicalOr__Group_1__1 : rule__LogicalOr__Group_1__1__Impl rule__LogicalOr__Group_1__2 ;
    public final void rule__LogicalOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3177:1: ( rule__LogicalOr__Group_1__1__Impl rule__LogicalOr__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3178:2: rule__LogicalOr__Group_1__1__Impl rule__LogicalOr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group_1__1__Impl_in_rule__LogicalOr__Group_1__16392);
            rule__LogicalOr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group_1__2_in_rule__LogicalOr__Group_1__16395);
            rule__LogicalOr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__1"


    // $ANTLR start "rule__LogicalOr__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3185:1: rule__LogicalOr__Group_1__1__Impl : ( ( rule__LogicalOr__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3189:1: ( ( ( rule__LogicalOr__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3190:1: ( ( rule__LogicalOr__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3190:1: ( ( rule__LogicalOr__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3191:1: ( rule__LogicalOr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalOrAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3192:1: ( rule__LogicalOr__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3192:2: rule__LogicalOr__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__OperatorAssignment_1_1_in_rule__LogicalOr__Group_1__1__Impl6422);
            rule__LogicalOr__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3202:1: rule__LogicalOr__Group_1__2 : rule__LogicalOr__Group_1__2__Impl ;
    public final void rule__LogicalOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3206:1: ( rule__LogicalOr__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3207:2: rule__LogicalOr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__Group_1__2__Impl_in_rule__LogicalOr__Group_1__26452);
            rule__LogicalOr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__2"


    // $ANTLR start "rule__LogicalOr__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3213:1: rule__LogicalOr__Group_1__2__Impl : ( ( rule__LogicalOr__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3217:1: ( ( ( rule__LogicalOr__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3218:1: ( ( rule__LogicalOr__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3218:1: ( ( rule__LogicalOr__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3219:1: ( rule__LogicalOr__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3220:1: ( rule__LogicalOr__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3220:2: rule__LogicalOr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOr__RightAssignment_1_2_in_rule__LogicalOr__Group_1__2__Impl6479);
            rule__LogicalOr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalAnd__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3236:1: rule__LogicalAnd__Group__0 : rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 ;
    public final void rule__LogicalAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3240:1: ( rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3241:2: rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group__0__Impl_in_rule__LogicalAnd__Group__06515);
            rule__LogicalAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group__1_in_rule__LogicalAnd__Group__06518);
            rule__LogicalAnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__0"


    // $ANTLR start "rule__LogicalAnd__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3248:1: rule__LogicalAnd__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__LogicalAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3252:1: ( ( ruleEquality ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3253:1: ( ruleEquality )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3253:1: ( ruleEquality )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3254:1: ruleEquality
            {
             before(grammarAccess.getLogicalAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_rule__LogicalAnd__Group__0__Impl6545);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getLogicalAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__0__Impl"


    // $ANTLR start "rule__LogicalAnd__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3265:1: rule__LogicalAnd__Group__1 : rule__LogicalAnd__Group__1__Impl ;
    public final void rule__LogicalAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3269:1: ( rule__LogicalAnd__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3270:2: rule__LogicalAnd__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group__1__Impl_in_rule__LogicalAnd__Group__16574);
            rule__LogicalAnd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__1"


    // $ANTLR start "rule__LogicalAnd__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3276:1: rule__LogicalAnd__Group__1__Impl : ( ( rule__LogicalAnd__Group_1__0 )* ) ;
    public final void rule__LogicalAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3280:1: ( ( ( rule__LogicalAnd__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3281:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3281:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3282:1: ( rule__LogicalAnd__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3283:1: ( rule__LogicalAnd__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==12) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3283:2: rule__LogicalAnd__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group_1__0_in_rule__LogicalAnd__Group__1__Impl6601);
            	    rule__LogicalAnd__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLogicalAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__1__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3297:1: rule__LogicalAnd__Group_1__0 : rule__LogicalAnd__Group_1__0__Impl rule__LogicalAnd__Group_1__1 ;
    public final void rule__LogicalAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3301:1: ( rule__LogicalAnd__Group_1__0__Impl rule__LogicalAnd__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3302:2: rule__LogicalAnd__Group_1__0__Impl rule__LogicalAnd__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group_1__0__Impl_in_rule__LogicalAnd__Group_1__06636);
            rule__LogicalAnd__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group_1__1_in_rule__LogicalAnd__Group_1__06639);
            rule__LogicalAnd__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__0"


    // $ANTLR start "rule__LogicalAnd__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3309:1: rule__LogicalAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3313:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3314:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3314:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3315:1: ()
            {
             before(grammarAccess.getLogicalAndAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3316:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3318:1: 
            {
            }

             after(grammarAccess.getLogicalAndAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3328:1: rule__LogicalAnd__Group_1__1 : rule__LogicalAnd__Group_1__1__Impl rule__LogicalAnd__Group_1__2 ;
    public final void rule__LogicalAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3332:1: ( rule__LogicalAnd__Group_1__1__Impl rule__LogicalAnd__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3333:2: rule__LogicalAnd__Group_1__1__Impl rule__LogicalAnd__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group_1__1__Impl_in_rule__LogicalAnd__Group_1__16697);
            rule__LogicalAnd__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group_1__2_in_rule__LogicalAnd__Group_1__16700);
            rule__LogicalAnd__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__1"


    // $ANTLR start "rule__LogicalAnd__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3340:1: rule__LogicalAnd__Group_1__1__Impl : ( ( rule__LogicalAnd__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3344:1: ( ( ( rule__LogicalAnd__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3345:1: ( ( rule__LogicalAnd__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3345:1: ( ( rule__LogicalAnd__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3346:1: ( rule__LogicalAnd__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalAndAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3347:1: ( rule__LogicalAnd__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3347:2: rule__LogicalAnd__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__OperatorAssignment_1_1_in_rule__LogicalAnd__Group_1__1__Impl6727);
            rule__LogicalAnd__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3357:1: rule__LogicalAnd__Group_1__2 : rule__LogicalAnd__Group_1__2__Impl ;
    public final void rule__LogicalAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3361:1: ( rule__LogicalAnd__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3362:2: rule__LogicalAnd__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__Group_1__2__Impl_in_rule__LogicalAnd__Group_1__26757);
            rule__LogicalAnd__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__2"


    // $ANTLR start "rule__LogicalAnd__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3368:1: rule__LogicalAnd__Group_1__2__Impl : ( ( rule__LogicalAnd__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3372:1: ( ( ( rule__LogicalAnd__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3373:1: ( ( rule__LogicalAnd__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3373:1: ( ( rule__LogicalAnd__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3374:1: ( rule__LogicalAnd__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3375:1: ( rule__LogicalAnd__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3375:2: rule__LogicalAnd__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalAnd__RightAssignment_1_2_in_rule__LogicalAnd__Group_1__2__Impl6784);
            rule__LogicalAnd__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3391:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3395:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3396:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06820);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06823);
            rule__Equality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3403:1: rule__Equality__Group__0__Impl : ( ruleComparative ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3407:1: ( ( ruleComparative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3408:1: ( ruleComparative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3408:1: ( ruleComparative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3409:1: ruleComparative
            {
             before(grammarAccess.getEqualityAccess().getComparativeParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_rule__Equality__Group__0__Impl6850);
            ruleComparative();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparativeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3420:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3424:1: ( rule__Equality__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3425:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16879);
            rule__Equality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3431:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3435:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3436:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3436:1: ( ( rule__Equality__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3437:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3438:1: ( rule__Equality__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=17 && LA25_0<=18)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3438:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6906);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3452:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3456:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3457:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06941);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06944);
            rule__Equality__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3464:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3468:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3469:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3469:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3470:1: ()
            {
             before(grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3471:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3473:1: 
            {
            }

             after(grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3483:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3487:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3488:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__17002);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__17005);
            rule__Equality__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3495:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OperatorAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3499:1: ( ( ( rule__Equality__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3500:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3500:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3501:1: ( rule__Equality__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3502:1: ( rule__Equality__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3502:2: rule__Equality__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl7032);
            rule__Equality__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3512:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3516:1: ( rule__Equality__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3517:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__27062);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3523:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3527:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3528:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3528:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3529:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3530:1: ( rule__Equality__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3530:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl7089);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparative__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3546:1: rule__Comparative__Group__0 : rule__Comparative__Group__0__Impl rule__Comparative__Group__1 ;
    public final void rule__Comparative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3550:1: ( rule__Comparative__Group__0__Impl rule__Comparative__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3551:2: rule__Comparative__Group__0__Impl rule__Comparative__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__0__Impl_in_rule__Comparative__Group__07125);
            rule__Comparative__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__1_in_rule__Comparative__Group__07128);
            rule__Comparative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group__0"


    // $ANTLR start "rule__Comparative__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3558:1: rule__Comparative__Group__0__Impl : ( ruleAdditive ) ;
    public final void rule__Comparative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3562:1: ( ( ruleAdditive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3563:1: ( ruleAdditive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3563:1: ( ruleAdditive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3564:1: ruleAdditive
            {
             before(grammarAccess.getComparativeAccess().getAdditiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_rule__Comparative__Group__0__Impl7155);
            ruleAdditive();

            state._fsp--;

             after(grammarAccess.getComparativeAccess().getAdditiveParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group__0__Impl"


    // $ANTLR start "rule__Comparative__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3575:1: rule__Comparative__Group__1 : rule__Comparative__Group__1__Impl ;
    public final void rule__Comparative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3579:1: ( rule__Comparative__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3580:2: rule__Comparative__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__1__Impl_in_rule__Comparative__Group__17184);
            rule__Comparative__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group__1"


    // $ANTLR start "rule__Comparative__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3586:1: rule__Comparative__Group__1__Impl : ( ( rule__Comparative__Group_1__0 )* ) ;
    public final void rule__Comparative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3590:1: ( ( ( rule__Comparative__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3591:1: ( ( rule__Comparative__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3591:1: ( ( rule__Comparative__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3592:1: ( rule__Comparative__Group_1__0 )*
            {
             before(grammarAccess.getComparativeAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3593:1: ( rule__Comparative__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=19 && LA26_0<=20)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3593:2: rule__Comparative__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__0_in_rule__Comparative__Group__1__Impl7211);
            	    rule__Comparative__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getComparativeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group__1__Impl"


    // $ANTLR start "rule__Comparative__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3607:1: rule__Comparative__Group_1__0 : rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1 ;
    public final void rule__Comparative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3611:1: ( rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3612:2: rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__0__Impl_in_rule__Comparative__Group_1__07246);
            rule__Comparative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__1_in_rule__Comparative__Group_1__07249);
            rule__Comparative__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group_1__0"


    // $ANTLR start "rule__Comparative__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3619:1: rule__Comparative__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3623:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3624:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3624:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3625:1: ()
            {
             before(grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3626:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3628:1: 
            {
            }

             after(grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group_1__0__Impl"


    // $ANTLR start "rule__Comparative__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3638:1: rule__Comparative__Group_1__1 : rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2 ;
    public final void rule__Comparative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3642:1: ( rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3643:2: rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__1__Impl_in_rule__Comparative__Group_1__17307);
            rule__Comparative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__2_in_rule__Comparative__Group_1__17310);
            rule__Comparative__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group_1__1"


    // $ANTLR start "rule__Comparative__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3650:1: rule__Comparative__Group_1__1__Impl : ( ( rule__Comparative__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3654:1: ( ( ( rule__Comparative__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3655:1: ( ( rule__Comparative__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3655:1: ( ( rule__Comparative__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3656:1: ( rule__Comparative__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparativeAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3657:1: ( rule__Comparative__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3657:2: rule__Comparative__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__OperatorAssignment_1_1_in_rule__Comparative__Group_1__1__Impl7337);
            rule__Comparative__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparativeAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group_1__1__Impl"


    // $ANTLR start "rule__Comparative__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3667:1: rule__Comparative__Group_1__2 : rule__Comparative__Group_1__2__Impl ;
    public final void rule__Comparative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3671:1: ( rule__Comparative__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3672:2: rule__Comparative__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__2__Impl_in_rule__Comparative__Group_1__27367);
            rule__Comparative__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group_1__2"


    // $ANTLR start "rule__Comparative__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3678:1: rule__Comparative__Group_1__2__Impl : ( ( rule__Comparative__RightAssignment_1_2 ) ) ;
    public final void rule__Comparative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3682:1: ( ( ( rule__Comparative__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3683:1: ( ( rule__Comparative__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3683:1: ( ( rule__Comparative__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3684:1: ( rule__Comparative__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparativeAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3685:1: ( rule__Comparative__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3685:2: rule__Comparative__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__RightAssignment_1_2_in_rule__Comparative__Group_1__2__Impl7394);
            rule__Comparative__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparativeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__Group_1__2__Impl"


    // $ANTLR start "rule__Additive__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3701:1: rule__Additive__Group__0 : rule__Additive__Group__0__Impl rule__Additive__Group__1 ;
    public final void rule__Additive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3705:1: ( rule__Additive__Group__0__Impl rule__Additive__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3706:2: rule__Additive__Group__0__Impl rule__Additive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__0__Impl_in_rule__Additive__Group__07430);
            rule__Additive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__1_in_rule__Additive__Group__07433);
            rule__Additive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group__0"


    // $ANTLR start "rule__Additive__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3713:1: rule__Additive__Group__0__Impl : ( ruleMultiplicative ) ;
    public final void rule__Additive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3717:1: ( ( ruleMultiplicative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3718:1: ( ruleMultiplicative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3718:1: ( ruleMultiplicative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3719:1: ruleMultiplicative
            {
             before(grammarAccess.getAdditiveAccess().getMultiplicativeParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_rule__Additive__Group__0__Impl7460);
            ruleMultiplicative();

            state._fsp--;

             after(grammarAccess.getAdditiveAccess().getMultiplicativeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group__0__Impl"


    // $ANTLR start "rule__Additive__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3730:1: rule__Additive__Group__1 : rule__Additive__Group__1__Impl ;
    public final void rule__Additive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3734:1: ( rule__Additive__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3735:2: rule__Additive__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__1__Impl_in_rule__Additive__Group__17489);
            rule__Additive__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group__1"


    // $ANTLR start "rule__Additive__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3741:1: rule__Additive__Group__1__Impl : ( ( rule__Additive__Group_1__0 )* ) ;
    public final void rule__Additive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3745:1: ( ( ( rule__Additive__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3746:1: ( ( rule__Additive__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3746:1: ( ( rule__Additive__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3747:1: ( rule__Additive__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3748:1: ( rule__Additive__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=21 && LA27_0<=22)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3748:2: rule__Additive__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__0_in_rule__Additive__Group__1__Impl7516);
            	    rule__Additive__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getAdditiveAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group__1__Impl"


    // $ANTLR start "rule__Additive__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3762:1: rule__Additive__Group_1__0 : rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1 ;
    public final void rule__Additive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3766:1: ( rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3767:2: rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__0__Impl_in_rule__Additive__Group_1__07551);
            rule__Additive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__1_in_rule__Additive__Group_1__07554);
            rule__Additive__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group_1__0"


    // $ANTLR start "rule__Additive__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3774:1: rule__Additive__Group_1__0__Impl : ( () ) ;
    public final void rule__Additive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3778:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3779:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3779:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3780:1: ()
            {
             before(grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3781:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3783:1: 
            {
            }

             after(grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group_1__0__Impl"


    // $ANTLR start "rule__Additive__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3793:1: rule__Additive__Group_1__1 : rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2 ;
    public final void rule__Additive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3797:1: ( rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3798:2: rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__1__Impl_in_rule__Additive__Group_1__17612);
            rule__Additive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__2_in_rule__Additive__Group_1__17615);
            rule__Additive__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group_1__1"


    // $ANTLR start "rule__Additive__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3805:1: rule__Additive__Group_1__1__Impl : ( ( rule__Additive__OperatorAssignment_1_1 ) ) ;
    public final void rule__Additive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3809:1: ( ( ( rule__Additive__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3810:1: ( ( rule__Additive__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3810:1: ( ( rule__Additive__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3811:1: ( rule__Additive__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3812:1: ( rule__Additive__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3812:2: rule__Additive__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__OperatorAssignment_1_1_in_rule__Additive__Group_1__1__Impl7642);
            rule__Additive__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group_1__1__Impl"


    // $ANTLR start "rule__Additive__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3822:1: rule__Additive__Group_1__2 : rule__Additive__Group_1__2__Impl ;
    public final void rule__Additive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3826:1: ( rule__Additive__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3827:2: rule__Additive__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__2__Impl_in_rule__Additive__Group_1__27672);
            rule__Additive__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group_1__2"


    // $ANTLR start "rule__Additive__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3833:1: rule__Additive__Group_1__2__Impl : ( ( rule__Additive__RightAssignment_1_2 ) ) ;
    public final void rule__Additive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3837:1: ( ( ( rule__Additive__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3838:1: ( ( rule__Additive__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3838:1: ( ( rule__Additive__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3839:1: ( rule__Additive__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3840:1: ( rule__Additive__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3840:2: rule__Additive__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__RightAssignment_1_2_in_rule__Additive__Group_1__2__Impl7699);
            rule__Additive__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplicative__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3856:1: rule__Multiplicative__Group__0 : rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1 ;
    public final void rule__Multiplicative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3860:1: ( rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3861:2: rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__0__Impl_in_rule__Multiplicative__Group__07735);
            rule__Multiplicative__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__1_in_rule__Multiplicative__Group__07738);
            rule__Multiplicative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group__0"


    // $ANTLR start "rule__Multiplicative__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3868:1: rule__Multiplicative__Group__0__Impl : ( rulePrimitive ) ;
    public final void rule__Multiplicative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3872:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3873:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3873:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3874:1: rulePrimitive
            {
             before(grammarAccess.getMultiplicativeAccess().getPrimitiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Multiplicative__Group__0__Impl7765);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getMultiplicativeAccess().getPrimitiveParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group__0__Impl"


    // $ANTLR start "rule__Multiplicative__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3885:1: rule__Multiplicative__Group__1 : rule__Multiplicative__Group__1__Impl ;
    public final void rule__Multiplicative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3889:1: ( rule__Multiplicative__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3890:2: rule__Multiplicative__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__1__Impl_in_rule__Multiplicative__Group__17794);
            rule__Multiplicative__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group__1"


    // $ANTLR start "rule__Multiplicative__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3896:1: rule__Multiplicative__Group__1__Impl : ( ( rule__Multiplicative__Group_1__0 )* ) ;
    public final void rule__Multiplicative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3900:1: ( ( ( rule__Multiplicative__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3901:1: ( ( rule__Multiplicative__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3901:1: ( ( rule__Multiplicative__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3902:1: ( rule__Multiplicative__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3903:1: ( rule__Multiplicative__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3903:2: rule__Multiplicative__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__0_in_rule__Multiplicative__Group__1__Impl7821);
            	    rule__Multiplicative__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group__1__Impl"


    // $ANTLR start "rule__Multiplicative__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3917:1: rule__Multiplicative__Group_1__0 : rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1 ;
    public final void rule__Multiplicative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3921:1: ( rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3922:2: rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__0__Impl_in_rule__Multiplicative__Group_1__07856);
            rule__Multiplicative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__1_in_rule__Multiplicative__Group_1__07859);
            rule__Multiplicative__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group_1__0"


    // $ANTLR start "rule__Multiplicative__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3929:1: rule__Multiplicative__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3933:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3934:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3934:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3935:1: ()
            {
             before(grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3936:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3938:1: 
            {
            }

             after(grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplicative__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3948:1: rule__Multiplicative__Group_1__1 : rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2 ;
    public final void rule__Multiplicative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3952:1: ( rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3953:2: rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__1__Impl_in_rule__Multiplicative__Group_1__17917);
            rule__Multiplicative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__2_in_rule__Multiplicative__Group_1__17920);
            rule__Multiplicative__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group_1__1"


    // $ANTLR start "rule__Multiplicative__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3960:1: rule__Multiplicative__Group_1__1__Impl : ( ( rule__Multiplicative__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3964:1: ( ( ( rule__Multiplicative__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3965:1: ( ( rule__Multiplicative__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3965:1: ( ( rule__Multiplicative__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3966:1: ( rule__Multiplicative__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3967:1: ( rule__Multiplicative__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3967:2: rule__Multiplicative__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__OperatorAssignment_1_1_in_rule__Multiplicative__Group_1__1__Impl7947);
            rule__Multiplicative__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplicative__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3977:1: rule__Multiplicative__Group_1__2 : rule__Multiplicative__Group_1__2__Impl ;
    public final void rule__Multiplicative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3981:1: ( rule__Multiplicative__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3982:2: rule__Multiplicative__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__2__Impl_in_rule__Multiplicative__Group_1__27977);
            rule__Multiplicative__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group_1__2"


    // $ANTLR start "rule__Multiplicative__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3988:1: rule__Multiplicative__Group_1__2__Impl : ( ( rule__Multiplicative__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplicative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3992:1: ( ( ( rule__Multiplicative__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3993:1: ( ( rule__Multiplicative__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3993:1: ( ( rule__Multiplicative__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3994:1: ( rule__Multiplicative__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3995:1: ( rule__Multiplicative__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3995:2: rule__Multiplicative__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__RightAssignment_1_2_in_rule__Multiplicative__Group_1__2__Impl8004);
            rule__Multiplicative__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__Group_1__2__Impl"


    // $ANTLR start "rule__Primitive__Group_6__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4011:1: rule__Primitive__Group_6__0 : rule__Primitive__Group_6__0__Impl rule__Primitive__Group_6__1 ;
    public final void rule__Primitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4015:1: ( rule__Primitive__Group_6__0__Impl rule__Primitive__Group_6__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4016:2: rule__Primitive__Group_6__0__Impl rule__Primitive__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_6__0__Impl_in_rule__Primitive__Group_6__08040);
            rule__Primitive__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_6__1_in_rule__Primitive__Group_6__08043);
            rule__Primitive__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_6__0"


    // $ANTLR start "rule__Primitive__Group_6__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4023:1: rule__Primitive__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4027:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4028:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4028:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4029:1: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Primitive__Group_6__0__Impl8071); 
             after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_6__0__Impl"


    // $ANTLR start "rule__Primitive__Group_6__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4042:1: rule__Primitive__Group_6__1 : rule__Primitive__Group_6__1__Impl rule__Primitive__Group_6__2 ;
    public final void rule__Primitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4046:1: ( rule__Primitive__Group_6__1__Impl rule__Primitive__Group_6__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4047:2: rule__Primitive__Group_6__1__Impl rule__Primitive__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_6__1__Impl_in_rule__Primitive__Group_6__18102);
            rule__Primitive__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_6__2_in_rule__Primitive__Group_6__18105);
            rule__Primitive__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_6__1"


    // $ANTLR start "rule__Primitive__Group_6__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4054:1: rule__Primitive__Group_6__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4058:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4059:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4059:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4060:1: ruleExpression
            {
             before(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_6_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Primitive__Group_6__1__Impl8132);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_6__1__Impl"


    // $ANTLR start "rule__Primitive__Group_6__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4071:1: rule__Primitive__Group_6__2 : rule__Primitive__Group_6__2__Impl ;
    public final void rule__Primitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4075:1: ( rule__Primitive__Group_6__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4076:2: rule__Primitive__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_6__2__Impl_in_rule__Primitive__Group_6__28161);
            rule__Primitive__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_6__2"


    // $ANTLR start "rule__Primitive__Group_6__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4082:1: rule__Primitive__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4086:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4087:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4087:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4088:1: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_6_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Primitive__Group_6__2__Impl8189); 
             after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_6__2__Impl"


    // $ANTLR start "rule__Unary__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4107:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4111:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4112:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08226);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08229);
            rule__Unary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__0"


    // $ANTLR start "rule__Unary__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4119:1: rule__Unary__Group__0__Impl : ( ( rule__Unary__OperatorAssignment_0 ) ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4123:1: ( ( ( rule__Unary__OperatorAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4124:1: ( ( rule__Unary__OperatorAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4124:1: ( ( rule__Unary__OperatorAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4125:1: ( rule__Unary__OperatorAssignment_0 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4126:1: ( rule__Unary__OperatorAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4126:2: rule__Unary__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__OperatorAssignment_0_in_rule__Unary__Group__0__Impl8256);
            rule__Unary__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__0__Impl"


    // $ANTLR start "rule__Unary__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4136:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4140:1: ( rule__Unary__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4141:2: rule__Unary__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18286);
            rule__Unary__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__1"


    // $ANTLR start "rule__Unary__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4147:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__InnerAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4151:1: ( ( ( rule__Unary__InnerAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4152:1: ( ( rule__Unary__InnerAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4152:1: ( ( rule__Unary__InnerAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4153:1: ( rule__Unary__InnerAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getInnerAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4154:1: ( rule__Unary__InnerAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4154:2: rule__Unary__InnerAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__InnerAssignment_1_in_rule__Unary__Group__1__Impl8313);
            rule__Unary__InnerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getInnerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__1__Impl"


    // $ANTLR start "rule__InRange__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4168:1: rule__InRange__Group__0 : rule__InRange__Group__0__Impl rule__InRange__Group__1 ;
    public final void rule__InRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4172:1: ( rule__InRange__Group__0__Impl rule__InRange__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4173:2: rule__InRange__Group__0__Impl rule__InRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__0__Impl_in_rule__InRange__Group__08347);
            rule__InRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__1_in_rule__InRange__Group__08350);
            rule__InRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__Group__0"


    // $ANTLR start "rule__InRange__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4180:1: rule__InRange__Group__0__Impl : ( ( rule__InRange__ParameterAssignment_0 ) ) ;
    public final void rule__InRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4184:1: ( ( ( rule__InRange__ParameterAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4185:1: ( ( rule__InRange__ParameterAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4185:1: ( ( rule__InRange__ParameterAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4186:1: ( rule__InRange__ParameterAssignment_0 )
            {
             before(grammarAccess.getInRangeAccess().getParameterAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4187:1: ( rule__InRange__ParameterAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4187:2: rule__InRange__ParameterAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__ParameterAssignment_0_in_rule__InRange__Group__0__Impl8377);
            rule__InRange__ParameterAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInRangeAccess().getParameterAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__Group__0__Impl"


    // $ANTLR start "rule__InRange__Group__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4197:1: rule__InRange__Group__1 : rule__InRange__Group__1__Impl rule__InRange__Group__2 ;
    public final void rule__InRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4201:1: ( rule__InRange__Group__1__Impl rule__InRange__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4202:2: rule__InRange__Group__1__Impl rule__InRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__1__Impl_in_rule__InRange__Group__18407);
            rule__InRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__2_in_rule__InRange__Group__18410);
            rule__InRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__Group__1"


    // $ANTLR start "rule__InRange__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4209:1: rule__InRange__Group__1__Impl : ( 'in' ) ;
    public final void rule__InRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4213:1: ( ( 'in' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4214:1: ( 'in' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4214:1: ( 'in' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4215:1: 'in'
            {
             before(grammarAccess.getInRangeAccess().getInKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InRange__Group__1__Impl8438); 
             after(grammarAccess.getInRangeAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__Group__1__Impl"


    // $ANTLR start "rule__InRange__Group__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4228:1: rule__InRange__Group__2 : rule__InRange__Group__2__Impl ;
    public final void rule__InRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4232:1: ( rule__InRange__Group__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4233:2: rule__InRange__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__2__Impl_in_rule__InRange__Group__28469);
            rule__InRange__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__Group__2"


    // $ANTLR start "rule__InRange__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4239:1: rule__InRange__Group__2__Impl : ( ( rule__InRange__RangeAssignment_2 ) ) ;
    public final void rule__InRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4243:1: ( ( ( rule__InRange__RangeAssignment_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4244:1: ( ( rule__InRange__RangeAssignment_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4244:1: ( ( rule__InRange__RangeAssignment_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4245:1: ( rule__InRange__RangeAssignment_2 )
            {
             before(grammarAccess.getInRangeAccess().getRangeAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4246:1: ( rule__InRange__RangeAssignment_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4246:2: rule__InRange__RangeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__RangeAssignment_2_in_rule__InRange__Group__2__Impl8496);
            rule__InRange__RangeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInRangeAccess().getRangeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__Group__2__Impl"


    // $ANTLR start "rule__ParameterGroup__UnorderedGroup_3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4265:1: rule__ParameterGroup__UnorderedGroup_3 : rule__ParameterGroup__UnorderedGroup_3__0 {...}?;
    public final void rule__ParameterGroup__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4270:1: ( rule__ParameterGroup__UnorderedGroup_3__0 {...}?)
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4271:2: rule__ParameterGroup__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__0_in_rule__ParameterGroup__UnorderedGroup_38535);
            rule__ParameterGroup__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__UnorderedGroup_3"


    // $ANTLR start "rule__ParameterGroup__UnorderedGroup_3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4282:1: rule__ParameterGroup__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__ParameterGroup__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4287:1: ( ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4288:3: ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4288:3: ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt29=2;
            }
            else if ( LA29_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt29=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4290:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4290:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4291:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4291:111: ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4292:6: ( ( rule__ParameterGroup__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4298:6: ( ( rule__ParameterGroup__Group_3_0__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4300:7: ( rule__ParameterGroup__Group_3_0__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4301:7: ( rule__ParameterGroup__Group_3_0__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4301:8: rule__ParameterGroup__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl8624);
                    rule__ParameterGroup__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterGroupAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4307:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4307:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4308:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4308:111: ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4309:6: ( ( rule__ParameterGroup__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4315:6: ( ( rule__ParameterGroup__Group_3_1__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4317:7: ( rule__ParameterGroup__Group_3_1__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4318:7: ( rule__ParameterGroup__Group_3_1__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4318:8: rule__ParameterGroup__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl8715);
                    rule__ParameterGroup__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterGroupAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4324:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4324:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4325:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4325:111: ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4326:6: ( ( rule__ParameterGroup__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4332:6: ( ( rule__ParameterGroup__Group_3_2__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4334:7: ( rule__ParameterGroup__Group_3_2__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_2()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4335:7: ( rule__ParameterGroup__Group_3_2__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4335:8: rule__ParameterGroup__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl8806);
                    rule__ParameterGroup__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterGroupAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ParameterGroup__UnorderedGroup_3__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4350:1: rule__ParameterGroup__UnorderedGroup_3__0 : rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )? ;
    public final void rule__ParameterGroup__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4354:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4355:2: rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__08865);
            rule__ParameterGroup__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4356:2: ( rule__ParameterGroup__UnorderedGroup_3__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4356:2: rule__ParameterGroup__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__1_in_rule__ParameterGroup__UnorderedGroup_3__08868);
                    rule__ParameterGroup__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__UnorderedGroup_3__0"


    // $ANTLR start "rule__ParameterGroup__UnorderedGroup_3__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4363:1: rule__ParameterGroup__UnorderedGroup_3__1 : rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )? ;
    public final void rule__ParameterGroup__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4367:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4368:2: rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__18893);
            rule__ParameterGroup__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4369:2: ( rule__ParameterGroup__UnorderedGroup_3__2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4369:2: rule__ParameterGroup__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__2_in_rule__ParameterGroup__UnorderedGroup_3__18896);
                    rule__ParameterGroup__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__UnorderedGroup_3__1"


    // $ANTLR start "rule__ParameterGroup__UnorderedGroup_3__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4376:1: rule__ParameterGroup__UnorderedGroup_3__2 : rule__ParameterGroup__UnorderedGroup_3__Impl ;
    public final void rule__ParameterGroup__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4380:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4381:2: rule__ParameterGroup__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__28921);
            rule__ParameterGroup__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__UnorderedGroup_3__2"


    // $ANTLR start "rule__Parameter__UnorderedGroup_3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4394:1: rule__Parameter__UnorderedGroup_3 : rule__Parameter__UnorderedGroup_3__0 {...}?;
    public final void rule__Parameter__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4399:1: ( rule__Parameter__UnorderedGroup_3__0 {...}?)
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4400:2: rule__Parameter__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__0_in_rule__Parameter__UnorderedGroup_38951);
            rule__Parameter__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup_3"


    // $ANTLR start "rule__Parameter__UnorderedGroup_3__Impl"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4411:1: rule__Parameter__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_4__0 ) ) ) ) ) ;
    public final void rule__Parameter__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4416:1: ( ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_4__0 ) ) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4417:3: ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_4__0 ) ) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4417:3: ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_4__0 ) ) ) ) )
            int alt32=5;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==14||LA32_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt32=2;
            }
            else if ( LA32_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt32=3;
            }
            else if ( LA32_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt32=4;
            }
            else if ( LA32_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4) ) {
                alt32=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4419:4: ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4419:4: ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4420:5: {...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4420:106: ( ( ( rule__Parameter__Alternatives_3_0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4421:6: ( ( rule__Parameter__Alternatives_3_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4427:6: ( ( rule__Parameter__Alternatives_3_0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4429:7: ( rule__Parameter__Alternatives_3_0 )
                    {
                     before(grammarAccess.getParameterAccess().getAlternatives_3_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4430:7: ( rule__Parameter__Alternatives_3_0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4430:8: rule__Parameter__Alternatives_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Alternatives_3_0_in_rule__Parameter__UnorderedGroup_3__Impl9040);
                    rule__Parameter__Alternatives_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getAlternatives_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4436:4: ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4436:4: ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4437:5: {...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4437:106: ( ( ( rule__Parameter__Group_3_1__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4438:6: ( ( rule__Parameter__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4444:6: ( ( rule__Parameter__Group_3_1__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4446:7: ( rule__Parameter__Group_3_1__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4447:7: ( rule__Parameter__Group_3_1__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4447:8: rule__Parameter__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__0_in_rule__Parameter__UnorderedGroup_3__Impl9131);
                    rule__Parameter__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4453:4: ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4453:4: ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4454:5: {...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4454:106: ( ( ( rule__Parameter__Group_3_2__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4455:6: ( ( rule__Parameter__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4461:6: ( ( rule__Parameter__Group_3_2__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4463:7: ( rule__Parameter__Group_3_2__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_2()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4464:7: ( rule__Parameter__Group_3_2__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4464:8: rule__Parameter__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__UnorderedGroup_3__Impl9222);
                    rule__Parameter__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4470:4: ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4470:4: ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4471:5: {...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4471:106: ( ( ( rule__Parameter__Group_3_3__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4472:6: ( ( rule__Parameter__Group_3_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4478:6: ( ( rule__Parameter__Group_3_3__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4480:7: ( rule__Parameter__Group_3_3__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_3()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4481:7: ( rule__Parameter__Group_3_3__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4481:8: rule__Parameter__Group_3_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__0_in_rule__Parameter__UnorderedGroup_3__Impl9313);
                    rule__Parameter__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_3_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4487:4: ({...}? => ( ( ( rule__Parameter__Group_3_4__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4487:4: ({...}? => ( ( ( rule__Parameter__Group_3_4__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4488:5: {...}? => ( ( ( rule__Parameter__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4488:106: ( ( ( rule__Parameter__Group_3_4__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4489:6: ( ( rule__Parameter__Group_3_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4495:6: ( ( rule__Parameter__Group_3_4__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4497:7: ( rule__Parameter__Group_3_4__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_4()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4498:7: ( rule__Parameter__Group_3_4__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4498:8: rule__Parameter__Group_3_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_4__0_in_rule__Parameter__UnorderedGroup_3__Impl9404);
                    rule__Parameter__Group_3_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_3_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Parameter__UnorderedGroup_3__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4513:1: rule__Parameter__UnorderedGroup_3__0 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )? ;
    public final void rule__Parameter__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4517:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4518:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__09463);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4519:2: ( rule__Parameter__UnorderedGroup_3__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==14||LA33_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt33=1;
            }
            else if ( LA33_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt33=1;
            }
            else if ( LA33_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4519:2: rule__Parameter__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__1_in_rule__Parameter__UnorderedGroup_3__09466);
                    rule__Parameter__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup_3__0"


    // $ANTLR start "rule__Parameter__UnorderedGroup_3__1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4526:1: rule__Parameter__UnorderedGroup_3__1 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )? ;
    public final void rule__Parameter__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4530:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4531:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__19491);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4532:2: ( rule__Parameter__UnorderedGroup_3__2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==14||LA34_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt34=1;
            }
            else if ( LA34_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4532:2: rule__Parameter__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__2_in_rule__Parameter__UnorderedGroup_3__19494);
                    rule__Parameter__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup_3__1"


    // $ANTLR start "rule__Parameter__UnorderedGroup_3__2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4539:1: rule__Parameter__UnorderedGroup_3__2 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )? ;
    public final void rule__Parameter__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4543:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4544:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__29519);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4545:2: ( rule__Parameter__UnorderedGroup_3__3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14||LA35_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4545:2: rule__Parameter__UnorderedGroup_3__3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__3_in_rule__Parameter__UnorderedGroup_3__29522);
                    rule__Parameter__UnorderedGroup_3__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup_3__2"


    // $ANTLR start "rule__Parameter__UnorderedGroup_3__3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4552:1: rule__Parameter__UnorderedGroup_3__3 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__4 )? ;
    public final void rule__Parameter__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4556:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__4 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4557:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__39547);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4558:2: ( rule__Parameter__UnorderedGroup_3__4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14||LA36_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt36=1;
            }
            else if ( LA36_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 4) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4558:2: rule__Parameter__UnorderedGroup_3__4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__4_in_rule__Parameter__UnorderedGroup_3__39550);
                    rule__Parameter__UnorderedGroup_3__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup_3__3"


    // $ANTLR start "rule__Parameter__UnorderedGroup_3__4"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4565:1: rule__Parameter__UnorderedGroup_3__4 : rule__Parameter__UnorderedGroup_3__Impl ;
    public final void rule__Parameter__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4569:1: ( rule__Parameter__UnorderedGroup_3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4570:2: rule__Parameter__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__49575);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup_3__4"


    // $ANTLR start "rule__Configurator__NameAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4587:1: rule__Configurator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Configurator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4591:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4592:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4592:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4593:1: RULE_ID
            {
             before(grammarAccess.getConfiguratorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Configurator__NameAssignment_19613); 
             after(grammarAccess.getConfiguratorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__NameAssignment_1"


    // $ANTLR start "rule__Configurator__DescriptionAssignment_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4602:1: rule__Configurator__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Configurator__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4606:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4607:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4607:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4608:1: RULE_STRING
            {
             before(grammarAccess.getConfiguratorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Configurator__DescriptionAssignment_29644); 
             after(grammarAccess.getConfiguratorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__DescriptionAssignment_2"


    // $ANTLR start "rule__Configurator__ParametersAssignment_4"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4617:1: rule__Configurator__ParametersAssignment_4 : ( ruleAbstractParameter ) ;
    public final void rule__Configurator__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4621:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4622:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4622:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4623:1: ruleAbstractParameter
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_49675);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__ParametersAssignment_4"


    // $ANTLR start "rule__Configurator__ParametersAssignment_5_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4632:1: rule__Configurator__ParametersAssignment_5_1 : ( ruleAbstractParameter ) ;
    public final void rule__Configurator__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4636:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4637:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4637:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4638:1: ruleAbstractParameter
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_5_19706);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__ParametersAssignment_5_1"


    // $ANTLR start "rule__ParameterGroup__NameAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4647:1: rule__ParameterGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4651:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4652:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4652:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4653:1: RULE_ID
            {
             before(grammarAccess.getParameterGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ParameterGroup__NameAssignment_19737); 
             after(grammarAccess.getParameterGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__NameAssignment_1"


    // $ANTLR start "rule__ParameterGroup__DescriptionAssignment_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4662:1: rule__ParameterGroup__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ParameterGroup__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4666:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4667:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4667:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4668:1: RULE_STRING
            {
             before(grammarAccess.getParameterGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ParameterGroup__DescriptionAssignment_29768); 
             after(grammarAccess.getParameterGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__DescriptionAssignment_2"


    // $ANTLR start "rule__ParameterGroup__VisibilityAssignment_3_0_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4677:1: rule__ParameterGroup__VisibilityAssignment_3_0_1 : ( ruleExpression ) ;
    public final void rule__ParameterGroup__VisibilityAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4681:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4682:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4682:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4683:1: ruleExpression
            {
             before(grammarAccess.getParameterGroupAccess().getVisibilityExpressionParserRuleCall_3_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParameterGroup__VisibilityAssignment_3_0_19799);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterGroupAccess().getVisibilityExpressionParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__VisibilityAssignment_3_0_1"


    // $ANTLR start "rule__ParameterGroup__ConstraintsAssignment_3_1_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4692:1: rule__ParameterGroup__ConstraintsAssignment_3_1_2 : ( ruleConstraint ) ;
    public final void rule__ParameterGroup__ConstraintsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4696:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4697:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4697:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4698:1: ruleConstraint
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_29830);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__ConstraintsAssignment_3_1_2"


    // $ANTLR start "rule__ParameterGroup__ConstraintsAssignment_3_1_3_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4707:1: rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 : ( ruleConstraint ) ;
    public final void rule__ParameterGroup__ConstraintsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4711:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4712:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4712:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4713:1: ruleConstraint
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_3_19861);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__ConstraintsAssignment_3_1_3_1"


    // $ANTLR start "rule__ParameterGroup__ParametersAssignment_3_2_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4722:1: rule__ParameterGroup__ParametersAssignment_3_2_1 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterGroup__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4726:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4727:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4727:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4728:1: ruleAbstractParameter
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_19892);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__ParametersAssignment_3_2_1"


    // $ANTLR start "rule__ParameterGroup__ParametersAssignment_3_2_2_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4737:1: rule__ParameterGroup__ParametersAssignment_3_2_2_1 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterGroup__ParametersAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4741:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4742:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4742:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4743:1: ruleAbstractParameter
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_2_19923);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterGroup__ParametersAssignment_3_2_2_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4752:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4756:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4757:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4757:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4758:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_19954); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__DescriptionAssignment_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4767:1: rule__Parameter__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Parameter__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4771:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4772:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4772:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4773:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_29985); 
             after(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__DescriptionAssignment_2"


    // $ANTLR start "rule__Parameter__MandatoryAssignment_3_0_0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4782:1: rule__Parameter__MandatoryAssignment_3_0_0 : ( ( 'mandatory' ) ) ;
    public final void rule__Parameter__MandatoryAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4786:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4787:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4787:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4788:1: ( 'mandatory' )
            {
             before(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4789:1: ( 'mandatory' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4790:1: 'mandatory'
            {
             before(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Parameter__MandatoryAssignment_3_0_010021); 
             after(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 

            }

             after(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__MandatoryAssignment_3_0_0"


    // $ANTLR start "rule__Parameter__VisibilityAssignment_3_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4805:1: rule__Parameter__VisibilityAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__Parameter__VisibilityAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4809:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4810:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4810:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4811:1: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getVisibilityExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__VisibilityAssignment_3_1_110060);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getVisibilityExpressionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__VisibilityAssignment_3_1_1"


    // $ANTLR start "rule__Parameter__DefaultAssignment_3_2_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4820:1: rule__Parameter__DefaultAssignment_3_2_1 : ( ruleExpression ) ;
    public final void rule__Parameter__DefaultAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4824:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4825:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4825:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4826:1: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getDefaultExpressionParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__DefaultAssignment_3_2_110091);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getDefaultExpressionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__DefaultAssignment_3_2_1"


    // $ANTLR start "rule__Parameter__ConstraintsAssignment_3_3_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4835:1: rule__Parameter__ConstraintsAssignment_3_3_2 : ( ruleConstraint ) ;
    public final void rule__Parameter__ConstraintsAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4839:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4840:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4840:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4841:1: ruleConstraint
            {
             before(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_3_210122);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ConstraintsAssignment_3_3_2"


    // $ANTLR start "rule__Parameter__ConstraintsAssignment_3_3_3_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4850:1: rule__Parameter__ConstraintsAssignment_3_3_3_1 : ( ruleConstraint ) ;
    public final void rule__Parameter__ConstraintsAssignment_3_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4854:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4855:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4855:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4856:1: ruleConstraint
            {
             before(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_3_3_110153);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ConstraintsAssignment_3_3_3_1"


    // $ANTLR start "rule__Parameter__ValueRangeAssignment_3_4_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4865:1: rule__Parameter__ValueRangeAssignment_3_4_1 : ( ruleValueRange ) ;
    public final void rule__Parameter__ValueRangeAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4869:1: ( ( ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4870:1: ( ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4870:1: ( ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4871:1: ruleValueRange
            {
             before(grammarAccess.getParameterAccess().getValueRangeValueRangeParserRuleCall_3_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_rule__Parameter__ValueRangeAssignment_3_4_110184);
            ruleValueRange();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueRangeValueRangeParserRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueRangeAssignment_3_4_1"


    // $ANTLR start "rule__Enumerated__ValuesAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4880:1: rule__Enumerated__ValuesAssignment_1 : ( ruleExpression ) ;
    public final void rule__Enumerated__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4884:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4885:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4885:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4886:1: ruleExpression
            {
             before(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_110215);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__ValuesAssignment_1"


    // $ANTLR start "rule__Enumerated__ValuesAssignment_2_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4895:1: rule__Enumerated__ValuesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Enumerated__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4899:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4900:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4900:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4901:1: ruleExpression
            {
             before(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_2_110246);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated__ValuesAssignment_2_1"


    // $ANTLR start "rule__Bounded__LowerBoundAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4910:1: rule__Bounded__LowerBoundAssignment_1 : ( ruleExpression ) ;
    public final void rule__Bounded__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4914:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4915:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4915:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4916:1: ruleExpression
            {
             before(grammarAccess.getBoundedAccess().getLowerBoundExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Bounded__LowerBoundAssignment_110277);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBoundedAccess().getLowerBoundExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__LowerBoundAssignment_1"


    // $ANTLR start "rule__Bounded__UpperBoundAssignment_3"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4925:1: rule__Bounded__UpperBoundAssignment_3 : ( ruleExpression ) ;
    public final void rule__Bounded__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4929:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4930:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4930:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4931:1: ruleExpression
            {
             before(grammarAccess.getBoundedAccess().getUpperBoundExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Bounded__UpperBoundAssignment_310308);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBoundedAccess().getUpperBoundExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounded__UpperBoundAssignment_3"


    // $ANTLR start "rule__Constraint__DescriptionAssignment_0_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4940:1: rule__Constraint__DescriptionAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__DescriptionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4944:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4945:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4945:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4946:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Constraint__DescriptionAssignment_0_110339); 
             after(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__DescriptionAssignment_0_1"


    // $ANTLR start "rule__Constraint__ExpressionAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4955:1: rule__Constraint__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Constraint__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4959:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4960:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4960:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4961:1: ruleExpression
            {
             before(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Constraint__ExpressionAssignment_110370);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExpressionAssignment_1"


    // $ANTLR start "rule__LogicalOr__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4970:1: rule__LogicalOr__OperatorAssignment_1_1 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4974:1: ( ( ruleLogicalOrOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4975:1: ( ruleLogicalOrOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4975:1: ( ruleLogicalOrOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4976:1: ruleLogicalOrOperator
            {
             before(grammarAccess.getLogicalOrAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_rule__LogicalOr__OperatorAssignment_1_110401);
            ruleLogicalOrOperator();

            state._fsp--;

             after(grammarAccess.getLogicalOrAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__OperatorAssignment_1_1"


    // $ANTLR start "rule__LogicalOr__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4985:1: rule__LogicalOr__RightAssignment_1_2 : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4989:1: ( ( ruleLogicalAnd ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4990:1: ( ruleLogicalAnd )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4990:1: ( ruleLogicalAnd )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4991:1: ruleLogicalAnd
            {
             before(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__RightAssignment_1_210432);
            ruleLogicalAnd();

            state._fsp--;

             after(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__RightAssignment_1_2"


    // $ANTLR start "rule__LogicalAnd__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5000:1: rule__LogicalAnd__OperatorAssignment_1_1 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAnd__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5004:1: ( ( ruleLogicalAndOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5005:1: ( ruleLogicalAndOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5005:1: ( ruleLogicalAndOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5006:1: ruleLogicalAndOperator
            {
             before(grammarAccess.getLogicalAndAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_rule__LogicalAnd__OperatorAssignment_1_110463);
            ruleLogicalAndOperator();

            state._fsp--;

             after(grammarAccess.getLogicalAndAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__OperatorAssignment_1_1"


    // $ANTLR start "rule__LogicalAnd__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5015:1: rule__LogicalAnd__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__LogicalAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5019:1: ( ( ruleEquality ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5020:1: ( ruleEquality )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5020:1: ( ruleEquality )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5021:1: ruleEquality
            {
             before(grammarAccess.getLogicalAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_rule__LogicalAnd__RightAssignment_1_210494);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getLogicalAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5030:1: rule__Equality__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__Equality__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5034:1: ( ( ruleEqualityOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5035:1: ( ruleEqualityOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5035:1: ( ruleEqualityOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5036:1: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_110525);
            ruleEqualityOperator();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OperatorAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5045:1: rule__Equality__RightAssignment_1_2 : ( ruleComparative ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5049:1: ( ( ruleComparative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5050:1: ( ruleComparative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5050:1: ( ruleComparative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5051:1: ruleComparative
            {
             before(grammarAccess.getEqualityAccess().getRightComparativeParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_rule__Equality__RightAssignment_1_210556);
            ruleComparative();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparativeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparative__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5060:1: rule__Comparative__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__Comparative__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5064:1: ( ( ruleComparativeOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5065:1: ( ruleComparativeOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5065:1: ( ruleComparativeOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5066:1: ruleComparativeOperator
            {
             before(grammarAccess.getComparativeAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparativeOperator_in_rule__Comparative__OperatorAssignment_1_110587);
            ruleComparativeOperator();

            state._fsp--;

             after(grammarAccess.getComparativeAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__OperatorAssignment_1_1"


    // $ANTLR start "rule__Comparative__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5075:1: rule__Comparative__RightAssignment_1_2 : ( ruleAdditive ) ;
    public final void rule__Comparative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5079:1: ( ( ruleAdditive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5080:1: ( ruleAdditive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5080:1: ( ruleAdditive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5081:1: ruleAdditive
            {
             before(grammarAccess.getComparativeAccess().getRightAdditiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_rule__Comparative__RightAssignment_1_210618);
            ruleAdditive();

            state._fsp--;

             after(grammarAccess.getComparativeAccess().getRightAdditiveParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparative__RightAssignment_1_2"


    // $ANTLR start "rule__Additive__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5090:1: rule__Additive__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__Additive__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5094:1: ( ( ruleAdditiveOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5095:1: ( ruleAdditiveOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5095:1: ( ruleAdditiveOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5096:1: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveOperator_in_rule__Additive__OperatorAssignment_1_110649);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__OperatorAssignment_1_1"


    // $ANTLR start "rule__Additive__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5105:1: rule__Additive__RightAssignment_1_2 : ( ruleMultiplicative ) ;
    public final void rule__Additive__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5109:1: ( ( ruleMultiplicative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5110:1: ( ruleMultiplicative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5110:1: ( ruleMultiplicative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5111:1: ruleMultiplicative
            {
             before(grammarAccess.getAdditiveAccess().getRightMultiplicativeParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_rule__Additive__RightAssignment_1_210680);
            ruleMultiplicative();

            state._fsp--;

             after(grammarAccess.getAdditiveAccess().getRightMultiplicativeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplicative__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5120:1: rule__Multiplicative__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__Multiplicative__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5124:1: ( ( ruleMultiplicativeOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5125:1: ( ruleMultiplicativeOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5125:1: ( ruleMultiplicativeOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5126:1: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeOperator_in_rule__Multiplicative__OperatorAssignment_1_110711);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplicative__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5135:1: rule__Multiplicative__RightAssignment_1_2 : ( rulePrimitive ) ;
    public final void rule__Multiplicative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5139:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5140:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5140:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5141:1: rulePrimitive
            {
             before(grammarAccess.getMultiplicativeAccess().getRightPrimitiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Multiplicative__RightAssignment_1_210742);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getMultiplicativeAccess().getRightPrimitiveParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative__RightAssignment_1_2"


    // $ANTLR start "rule__Unary__OperatorAssignment_0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5150:1: rule__Unary__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__Unary__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5154:1: ( ( ruleUnaryOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5155:1: ( ruleUnaryOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5155:1: ( ruleUnaryOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5156:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__Unary__OperatorAssignment_010773);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__OperatorAssignment_0"


    // $ANTLR start "rule__Unary__InnerAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5165:1: rule__Unary__InnerAssignment_1 : ( rulePrimitive ) ;
    public final void rule__Unary__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5169:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5170:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5170:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5171:1: rulePrimitive
            {
             before(grammarAccess.getUnaryAccess().getInnerPrimitiveParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Unary__InnerAssignment_110804);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getUnaryAccess().getInnerPrimitiveParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__InnerAssignment_1"


    // $ANTLR start "rule__InRange__ParameterAssignment_0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5180:1: rule__InRange__ParameterAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InRange__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5184:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5185:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5185:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5186:1: ( RULE_ID )
            {
             before(grammarAccess.getInRangeAccess().getParameterParameterCrossReference_0_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5187:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5188:1: RULE_ID
            {
             before(grammarAccess.getInRangeAccess().getParameterParameterIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__InRange__ParameterAssignment_010839); 
             after(grammarAccess.getInRangeAccess().getParameterParameterIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInRangeAccess().getParameterParameterCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__ParameterAssignment_0"


    // $ANTLR start "rule__InRange__RangeAssignment_2"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5199:1: rule__InRange__RangeAssignment_2 : ( ruleValueRange ) ;
    public final void rule__InRange__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5203:1: ( ( ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5204:1: ( ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5204:1: ( ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5205:1: ruleValueRange
            {
             before(grammarAccess.getInRangeAccess().getRangeValueRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_rule__InRange__RangeAssignment_210874);
            ruleValueRange();

            state._fsp--;

             after(grammarAccess.getInRangeAccess().getRangeValueRangeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRange__RangeAssignment_2"


    // $ANTLR start "rule__Integer__ValueAssignment"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5214:1: rule__Integer__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Integer__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5218:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5219:1: ( ruleEInt )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5219:1: ( ruleEInt )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5220:1: ruleEInt
            {
             before(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment10905);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__ValueAssignment"


    // $ANTLR start "rule__Boolean__ValueAssignment"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5229:1: rule__Boolean__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5233:1: ( ( ruleEBoolean ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5234:1: ( ruleEBoolean )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5234:1: ( ruleEBoolean )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5235:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment10936);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__ValueAssignment"


    // $ANTLR start "rule__String0__ValueAssignment"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5244:1: rule__String0__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__String0__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5248:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5249:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5249:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5250:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__String0__ValueAssignment10967); 
             after(grammarAccess.getString0Access().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__ValueAssignment"


    // $ANTLR start "rule__Identifier__IdAssignment"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5259:1: rule__Identifier__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Identifier__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5263:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5264:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5264:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5265:1: ( RULE_ID )
            {
             before(grammarAccess.getIdentifierAccess().getIdParameterCrossReference_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5266:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5267:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment11002); 
             after(grammarAccess.getIdentifierAccess().getIdParameterIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIdentifierAccess().getIdParameterCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__IdAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfigurator_in_entryRuleConfigurator61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurator68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__0_in_ruleConfigurator94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_entryRuleAbstractParameter121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractParameter128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractParameter__Alternatives_in_ruleAbstractParameter154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterGroup_in_entryRuleParameterGroup181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterGroup188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__0_in_ruleParameterGroup214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueRange_in_entryRuleValueRange301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueRange308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueRange__Alternatives_in_ruleValueRange334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerated_in_entryRuleEnumerated361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerated368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__0_in_ruleEnumerated394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBounded_in_entryRuleBounded421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBounded428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__0_in_ruleBounded454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOr_in_ruleExpression574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOr607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group__0_in_ruleLogicalOr633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAnd667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group__0_in_ruleLogicalAnd693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquality727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_entryRuleComparative780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparative787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__0_in_ruleComparative813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_entryRuleAdditive840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditive847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__0_in_ruleAdditive873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_entryRuleMultiplicative900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicative907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__0_in_ruleMultiplicative933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitive967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnary1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__0_in_ruleUnary1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_entryRuleInRange1082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInRange1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__0_in_ruleInRange1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__ValueAssignment_in_ruleString01295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleLogicalOrOperator1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleLogicalAndOperator1553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditiveOperator__Alternatives_in_ruleAdditiveOperator1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleMultiplicativeOperator1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterGroup_in_rule__AbstractParameter__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__AbstractParameter__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__MandatoryAssignment_3_0_0_in_rule__Parameter__Alternatives_3_01822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Parameter__Alternatives_3_01841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerated_in_rule__ValueRange__Alternatives1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBounded_in_rule__ValueRange__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_rule__Primitive__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_rule__Primitive__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__Primitive__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Primitive__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Primitive__Alternatives1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Primitive__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_6__0_in_rule__Primitive__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EBoolean__Alternatives2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EBoolean__Alternatives2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__EqualityOperator__Alternatives2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EqualityOperator__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ComparativeOperator__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ComparativeOperator__Alternatives2195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__AdditiveOperator__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__AdditiveOperator__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__UnaryOperator__Alternatives2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__UnaryOperator__Alternatives2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__02342 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__02345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Configurator__Group__0__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__12404 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__12407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__NameAssignment_1_in_rule__Configurator__Group__1__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__22464 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__22467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__DescriptionAssignment_2_in_rule__Configurator__Group__2__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__32525 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__32528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Configurator__Group__3__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__42587 = new BitSet(new long[]{0x000000009C000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__42590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__ParametersAssignment_4_in_rule__Configurator__Group__4__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__52647 = new BitSet(new long[]{0x000000009C000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__52650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl2677 = new BitSet(new long[]{0x0000000098000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__62708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Configurator__Group__6__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__02781 = new BitSet(new long[]{0x0000000098000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__02784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Configurator__Group_5__0__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__12846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__ParametersAssignment_5_1_in_rule__Configurator__Group_5__1__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__0__Impl_in_rule__ParameterGroup__Group__02907 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__1_in_rule__ParameterGroup__Group__02910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ParameterGroup__Group__0__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__1__Impl_in_rule__ParameterGroup__Group__12969 = new BitSet(new long[]{0x0000000062000040L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__2_in_rule__ParameterGroup__Group__12972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__NameAssignment_1_in_rule__ParameterGroup__Group__1__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__2__Impl_in_rule__ParameterGroup__Group__23029 = new BitSet(new long[]{0x0000000062000040L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__3_in_rule__ParameterGroup__Group__23032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__DescriptionAssignment_2_in_rule__ParameterGroup__Group__2__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__3__Impl_in_rule__ParameterGroup__Group__33090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3_in_rule__ParameterGroup__Group__3__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__0__Impl_in_rule__ParameterGroup__Group_3_0__03155 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__1_in_rule__ParameterGroup__Group_3_0__03158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParameterGroup__Group_3_0__0__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__1__Impl_in_rule__ParameterGroup__Group_3_0__13217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__VisibilityAssignment_3_0_1_in_rule__ParameterGroup__Group_3_0__1__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__0__Impl_in_rule__ParameterGroup__Group_3_1__03278 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__1_in_rule__ParameterGroup__Group_3_1__03281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParameterGroup__Group_3_1__0__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__1__Impl_in_rule__ParameterGroup__Group_3_1__13340 = new BitSet(new long[]{0x0000008400C18070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__2_in_rule__ParameterGroup__Group_3_1__13343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ParameterGroup__Group_3_1__1__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__2__Impl_in_rule__ParameterGroup__Group_3_1__23402 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__3_in_rule__ParameterGroup__Group_3_1__23405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_2_in_rule__ParameterGroup__Group_3_1__2__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__3__Impl_in_rule__ParameterGroup__Group_3_1__33462 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__4_in_rule__ParameterGroup__Group_3_1__33465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__0_in_rule__ParameterGroup__Group_3_1__3__Impl3492 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__4__Impl_in_rule__ParameterGroup__Group_3_1__43523 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__5_in_rule__ParameterGroup__Group_3_1__43526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ParameterGroup__Group_3_1__4__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__5__Impl_in_rule__ParameterGroup__Group_3_1__53588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ParameterGroup__Group_3_1__5__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__0__Impl_in_rule__ParameterGroup__Group_3_1_3__03659 = new BitSet(new long[]{0x0000008400C18070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__1_in_rule__ParameterGroup__Group_3_1_3__03662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ParameterGroup__Group_3_1_3__0__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__1__Impl_in_rule__ParameterGroup__Group_3_1_3__13721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_3_1_in_rule__ParameterGroup__Group_3_1_3__1__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__0__Impl_in_rule__ParameterGroup__Group_3_2__03782 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__1_in_rule__ParameterGroup__Group_3_2__03785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ParameterGroup__Group_3_2__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__1__Impl_in_rule__ParameterGroup__Group_3_2__13844 = new BitSet(new long[]{0x000000009C000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__2_in_rule__ParameterGroup__Group_3_2__13847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_1_in_rule__ParameterGroup__Group_3_2__1__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__2__Impl_in_rule__ParameterGroup__Group_3_2__23904 = new BitSet(new long[]{0x000000009C000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__3_in_rule__ParameterGroup__Group_3_2__23907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__0_in_rule__ParameterGroup__Group_3_2__2__Impl3934 = new BitSet(new long[]{0x0000000098000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__3__Impl_in_rule__ParameterGroup__Group_3_2__33965 = new BitSet(new long[]{0x000000009C000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__4_in_rule__ParameterGroup__Group_3_2__33968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ParameterGroup__Group_3_2__3__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__4__Impl_in_rule__ParameterGroup__Group_3_2__44030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ParameterGroup__Group_3_2__4__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__0__Impl_in_rule__ParameterGroup__Group_3_2_2__04099 = new BitSet(new long[]{0x0000000098000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__1_in_rule__ParameterGroup__Group_3_2_2__04102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ParameterGroup__Group_3_2_2__0__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__1__Impl_in_rule__ParameterGroup__Group_3_2_2__14164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_2_1_in_rule__ParameterGroup__Group_3_2_2__1__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04225 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Parameter__Group__0__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14287 = new BitSet(new long[]{0x0000020360004040L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24347 = new BitSet(new long[]{0x0000020360004040L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_2_in_rule__Parameter__Group__2__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3_in_rule__Parameter__Group__3__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__0__Impl_in_rule__Parameter__Group_3_1__04473 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__1_in_rule__Parameter__Group_3_1__04476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Parameter__Group_3_1__0__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__1__Impl_in_rule__Parameter__Group_3_1__14535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__VisibilityAssignment_3_1_1_in_rule__Parameter__Group_3_1__1__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__04596 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__04599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Parameter__Group_3_2__0__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__14658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__DefaultAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__0__Impl_in_rule__Parameter__Group_3_3__04719 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__1_in_rule__Parameter__Group_3_3__04722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Parameter__Group_3_3__0__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__1__Impl_in_rule__Parameter__Group_3_3__14781 = new BitSet(new long[]{0x0000008400C18070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__2_in_rule__Parameter__Group_3_3__14784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Parameter__Group_3_3__1__Impl4812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__2__Impl_in_rule__Parameter__Group_3_3__24843 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__3_in_rule__Parameter__Group_3_3__24846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ConstraintsAssignment_3_3_2_in_rule__Parameter__Group_3_3__2__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__3__Impl_in_rule__Parameter__Group_3_3__34903 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__4_in_rule__Parameter__Group_3_3__34906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3_3__0_in_rule__Parameter__Group_3_3__3__Impl4933 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__4__Impl_in_rule__Parameter__Group_3_3__44964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Parameter__Group_3_3__4__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3_3__0__Impl_in_rule__Parameter__Group_3_3_3__05033 = new BitSet(new long[]{0x0000008400C18070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3_3__1_in_rule__Parameter__Group_3_3_3__05036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Parameter__Group_3_3_3__0__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3_3__1__Impl_in_rule__Parameter__Group_3_3_3__15095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ConstraintsAssignment_3_3_3_1_in_rule__Parameter__Group_3_3_3__1__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_4__0__Impl_in_rule__Parameter__Group_3_4__05156 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_4__1_in_rule__Parameter__Group_3_4__05159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter__Group_3_4__0__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_4__1__Impl_in_rule__Parameter__Group_3_4__15218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ValueRangeAssignment_3_4_1_in_rule__Parameter__Group_3_4__1__Impl5245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__0__Impl_in_rule__Enumerated__Group__05279 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__1_in_rule__Enumerated__Group__05282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Enumerated__Group__0__Impl5310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__1__Impl_in_rule__Enumerated__Group__15341 = new BitSet(new long[]{0x0000000808000000L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__2_in_rule__Enumerated__Group__15344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__ValuesAssignment_1_in_rule__Enumerated__Group__1__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__2__Impl_in_rule__Enumerated__Group__25401 = new BitSet(new long[]{0x0000000808000000L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__3_in_rule__Enumerated__Group__25404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__0_in_rule__Enumerated__Group__2__Impl5431 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__3__Impl_in_rule__Enumerated__Group__35462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Enumerated__Group__3__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__0__Impl_in_rule__Enumerated__Group_2__05529 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__1_in_rule__Enumerated__Group_2__05532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Enumerated__Group_2__0__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__1__Impl_in_rule__Enumerated__Group_2__15591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__ValuesAssignment_2_1_in_rule__Enumerated__Group_2__1__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__0__Impl_in_rule__Bounded__Group__05652 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Bounded__Group__1_in_rule__Bounded__Group__05655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Bounded__Group__0__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__1__Impl_in_rule__Bounded__Group__15714 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Bounded__Group__2_in_rule__Bounded__Group__15717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__LowerBoundAssignment_1_in_rule__Bounded__Group__1__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__2__Impl_in_rule__Bounded__Group__25774 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Bounded__Group__3_in_rule__Bounded__Group__25777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Bounded__Group__2__Impl5805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__3__Impl_in_rule__Bounded__Group__35836 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Bounded__Group__4_in_rule__Bounded__Group__35839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__UpperBoundAssignment_3_in_rule__Bounded__Group__3__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__4__Impl_in_rule__Bounded__Group__45896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Bounded__Group__4__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__05965 = new BitSet(new long[]{0x0000008400C18070L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__05968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__0_in_rule__Constraint__Group__0__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__ExpressionAssignment_1_in_rule__Constraint__Group__1__Impl6053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__0__Impl_in_rule__Constraint__Group_0__06087 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__1_in_rule__Constraint__Group_0__06090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Constraint__Group_0__0__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__1__Impl_in_rule__Constraint__Group_0__16149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__DescriptionAssignment_0_1_in_rule__Constraint__Group_0__1__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group__0__Impl_in_rule__LogicalOr__Group__06210 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group__1_in_rule__LogicalOr__Group__06213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__Group__0__Impl6240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group__1__Impl_in_rule__LogicalOr__Group__16269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group_1__0_in_rule__LogicalOr__Group__1__Impl6296 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group_1__0__Impl_in_rule__LogicalOr__Group_1__06331 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group_1__1_in_rule__LogicalOr__Group_1__06334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group_1__1__Impl_in_rule__LogicalOr__Group_1__16392 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group_1__2_in_rule__LogicalOr__Group_1__16395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__OperatorAssignment_1_1_in_rule__LogicalOr__Group_1__1__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__Group_1__2__Impl_in_rule__LogicalOr__Group_1__26452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOr__RightAssignment_1_2_in_rule__LogicalOr__Group_1__2__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group__0__Impl_in_rule__LogicalAnd__Group__06515 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group__1_in_rule__LogicalAnd__Group__06518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_rule__LogicalAnd__Group__0__Impl6545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group__1__Impl_in_rule__LogicalAnd__Group__16574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__0_in_rule__LogicalAnd__Group__1__Impl6601 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__0__Impl_in_rule__LogicalAnd__Group_1__06636 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__1_in_rule__LogicalAnd__Group_1__06639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__1__Impl_in_rule__LogicalAnd__Group_1__16697 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__2_in_rule__LogicalAnd__Group_1__16700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__OperatorAssignment_1_1_in_rule__LogicalAnd__Group_1__1__Impl6727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__2__Impl_in_rule__LogicalAnd__Group_1__26757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalAnd__RightAssignment_1_2_in_rule__LogicalAnd__Group_1__2__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06820 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_rule__Equality__Group__0__Impl6850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6906 = new BitSet(new long[]{0x0000000000060002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06941 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__17002 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__17005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__27062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl7089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__0__Impl_in_rule__Comparative__Group__07125 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__Comparative__Group__1_in_rule__Comparative__Group__07128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_rule__Comparative__Group__0__Impl7155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__1__Impl_in_rule__Comparative__Group__17184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__0_in_rule__Comparative__Group__1__Impl7211 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__0__Impl_in_rule__Comparative__Group_1__07246 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__1_in_rule__Comparative__Group_1__07249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__1__Impl_in_rule__Comparative__Group_1__17307 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__2_in_rule__Comparative__Group_1__17310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__OperatorAssignment_1_1_in_rule__Comparative__Group_1__1__Impl7337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__2__Impl_in_rule__Comparative__Group_1__27367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__RightAssignment_1_2_in_rule__Comparative__Group_1__2__Impl7394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__0__Impl_in_rule__Additive__Group__07430 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Additive__Group__1_in_rule__Additive__Group__07433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_rule__Additive__Group__0__Impl7460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__1__Impl_in_rule__Additive__Group__17489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__0_in_rule__Additive__Group__1__Impl7516 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__0__Impl_in_rule__Additive__Group_1__07551 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__1_in_rule__Additive__Group_1__07554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__1__Impl_in_rule__Additive__Group_1__17612 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__2_in_rule__Additive__Group_1__17615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__OperatorAssignment_1_1_in_rule__Additive__Group_1__1__Impl7642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__2__Impl_in_rule__Additive__Group_1__27672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__RightAssignment_1_2_in_rule__Additive__Group_1__2__Impl7699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__0__Impl_in_rule__Multiplicative__Group__07735 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__1_in_rule__Multiplicative__Group__07738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Multiplicative__Group__0__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__1__Impl_in_rule__Multiplicative__Group__17794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__0_in_rule__Multiplicative__Group__1__Impl7821 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__0__Impl_in_rule__Multiplicative__Group_1__07856 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__1_in_rule__Multiplicative__Group_1__07859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__1__Impl_in_rule__Multiplicative__Group_1__17917 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__2_in_rule__Multiplicative__Group_1__17920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__OperatorAssignment_1_1_in_rule__Multiplicative__Group_1__1__Impl7947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__2__Impl_in_rule__Multiplicative__Group_1__27977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__RightAssignment_1_2_in_rule__Multiplicative__Group_1__2__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_6__0__Impl_in_rule__Primitive__Group_6__08040 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Primitive__Group_6__1_in_rule__Primitive__Group_6__08043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Primitive__Group_6__0__Impl8071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_6__1__Impl_in_rule__Primitive__Group_6__18102 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Primitive__Group_6__2_in_rule__Primitive__Group_6__18105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Primitive__Group_6__1__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_6__2__Impl_in_rule__Primitive__Group_6__28161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Primitive__Group_6__2__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08226 = new BitSet(new long[]{0x0000000400C18070L});
        public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__OperatorAssignment_0_in_rule__Unary__Group__0__Impl8256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__InnerAssignment_1_in_rule__Unary__Group__1__Impl8313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__0__Impl_in_rule__InRange__Group__08347 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__InRange__Group__1_in_rule__InRange__Group__08350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__ParameterAssignment_0_in_rule__InRange__Group__0__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__1__Impl_in_rule__InRange__Group__18407 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_rule__InRange__Group__2_in_rule__InRange__Group__18410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InRange__Group__1__Impl8438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__2__Impl_in_rule__InRange__Group__28469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__RangeAssignment_2_in_rule__InRange__Group__2__Impl8496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__0_in_rule__ParameterGroup__UnorderedGroup_38535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl8624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl8806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__08865 = new BitSet(new long[]{0x0000000062000042L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__1_in_rule__ParameterGroup__UnorderedGroup_3__08868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__18893 = new BitSet(new long[]{0x0000000062000042L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__2_in_rule__ParameterGroup__UnorderedGroup_3__18896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__28921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__0_in_rule__Parameter__UnorderedGroup_38951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Alternatives_3_0_in_rule__Parameter__UnorderedGroup_3__Impl9040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__0_in_rule__Parameter__UnorderedGroup_3__Impl9131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__UnorderedGroup_3__Impl9222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__0_in_rule__Parameter__UnorderedGroup_3__Impl9313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_4__0_in_rule__Parameter__UnorderedGroup_3__Impl9404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__09463 = new BitSet(new long[]{0x0000020360004042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__1_in_rule__Parameter__UnorderedGroup_3__09466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__19491 = new BitSet(new long[]{0x0000020360004042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__2_in_rule__Parameter__UnorderedGroup_3__19494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__29519 = new BitSet(new long[]{0x0000020360004042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__3_in_rule__Parameter__UnorderedGroup_3__29522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__39547 = new BitSet(new long[]{0x0000020360004042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__4_in_rule__Parameter__UnorderedGroup_3__39550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__49575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Configurator__NameAssignment_19613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Configurator__DescriptionAssignment_29644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_49675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_5_19706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterGroup__NameAssignment_19737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ParameterGroup__DescriptionAssignment_29768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterGroup__VisibilityAssignment_3_0_19799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_29830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_3_19861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_19892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_2_19923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_19954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_29985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Parameter__MandatoryAssignment_3_0_010021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__VisibilityAssignment_3_1_110060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__DefaultAssignment_3_2_110091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_3_210122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_3_3_110153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueRange_in_rule__Parameter__ValueRangeAssignment_3_4_110184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_110215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_2_110246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Bounded__LowerBoundAssignment_110277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Bounded__UpperBoundAssignment_310308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__DescriptionAssignment_0_110339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Constraint__ExpressionAssignment_110370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_rule__LogicalOr__OperatorAssignment_1_110401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__RightAssignment_1_210432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_rule__LogicalAnd__OperatorAssignment_1_110463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_rule__LogicalAnd__RightAssignment_1_210494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_110525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_rule__Equality__RightAssignment_1_210556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparativeOperator_in_rule__Comparative__OperatorAssignment_1_110587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_rule__Comparative__RightAssignment_1_210618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveOperator_in_rule__Additive__OperatorAssignment_1_110649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_rule__Additive__RightAssignment_1_210680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_rule__Multiplicative__OperatorAssignment_1_110711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Multiplicative__RightAssignment_1_210742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Unary__OperatorAssignment_010773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Unary__InnerAssignment_110804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__InRange__ParameterAssignment_010839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueRange_in_rule__InRange__RangeAssignment_210874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment10905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment10936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__String0__ValueAssignment10967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment11002 = new BitSet(new long[]{0x0000000000000002L});
    }


}