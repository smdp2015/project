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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'optional'", "'E'", "'e'", "'true'", "'false'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'sum'", "'min'", "'max'", "'configurator'", "'{'", "'}'", "','", "'group'", "'visible-if'", "'constraints'", "'parameter'", "'values'", "'('", "')'", "'['", "';'", "']'", "'in'", "'.'", "'mandatory'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalConfiguratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfiguratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfiguratorParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g"; }


     
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:60:1: entryRuleConfigurator : ruleConfigurator EOF ;
    public final void entryRuleConfigurator() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:61:1: ( ruleConfigurator EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:62:1: ruleConfigurator EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:69:1: ruleConfigurator : ( ( rule__Configurator__Group__0 ) ) ;
    public final void ruleConfigurator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:73:2: ( ( ( rule__Configurator__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:74:1: ( ( rule__Configurator__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:74:1: ( ( rule__Configurator__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:75:1: ( rule__Configurator__Group__0 )
            {
             before(grammarAccess.getConfiguratorAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:76:1: ( rule__Configurator__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:76:2: rule__Configurator__Group__0
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:88:1: entryRuleAbstractParameter : ruleAbstractParameter EOF ;
    public final void entryRuleAbstractParameter() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:89:1: ( ruleAbstractParameter EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:90:1: ruleAbstractParameter EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:97:1: ruleAbstractParameter : ( ( rule__AbstractParameter__Alternatives ) ) ;
    public final void ruleAbstractParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:101:2: ( ( ( rule__AbstractParameter__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:102:1: ( ( rule__AbstractParameter__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:102:1: ( ( rule__AbstractParameter__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:103:1: ( rule__AbstractParameter__Alternatives )
            {
             before(grammarAccess.getAbstractParameterAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:104:1: ( rule__AbstractParameter__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:104:2: rule__AbstractParameter__Alternatives
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:116:1: entryRuleParameterGroup : ruleParameterGroup EOF ;
    public final void entryRuleParameterGroup() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:117:1: ( ruleParameterGroup EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:118:1: ruleParameterGroup EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:125:1: ruleParameterGroup : ( ( rule__ParameterGroup__Group__0 ) ) ;
    public final void ruleParameterGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:129:2: ( ( ( rule__ParameterGroup__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:130:1: ( ( rule__ParameterGroup__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:130:1: ( ( rule__ParameterGroup__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:131:1: ( rule__ParameterGroup__Group__0 )
            {
             before(grammarAccess.getParameterGroupAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:132:1: ( rule__ParameterGroup__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:132:2: rule__ParameterGroup__Group__0
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:144:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:145:1: ( ruleParameter EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:146:1: ruleParameter EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:153:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:157:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:158:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:158:1: ( ( rule__Parameter__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:159:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:160:1: ( rule__Parameter__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:160:2: rule__Parameter__Group__0
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:172:1: entryRuleValueRange : ruleValueRange EOF ;
    public final void entryRuleValueRange() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:173:1: ( ruleValueRange EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:174:1: ruleValueRange EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:181:1: ruleValueRange : ( ( rule__ValueRange__Alternatives ) ) ;
    public final void ruleValueRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:185:2: ( ( ( rule__ValueRange__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:186:1: ( ( rule__ValueRange__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:186:1: ( ( rule__ValueRange__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:187:1: ( rule__ValueRange__Alternatives )
            {
             before(grammarAccess.getValueRangeAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:188:1: ( rule__ValueRange__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:188:2: rule__ValueRange__Alternatives
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:200:1: entryRuleEnumerated : ruleEnumerated EOF ;
    public final void entryRuleEnumerated() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:201:1: ( ruleEnumerated EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:202:1: ruleEnumerated EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:209:1: ruleEnumerated : ( ( rule__Enumerated__Group__0 ) ) ;
    public final void ruleEnumerated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:213:2: ( ( ( rule__Enumerated__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:214:1: ( ( rule__Enumerated__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:214:1: ( ( rule__Enumerated__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:215:1: ( rule__Enumerated__Group__0 )
            {
             before(grammarAccess.getEnumeratedAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:216:1: ( rule__Enumerated__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:216:2: rule__Enumerated__Group__0
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:228:1: entryRuleBounded : ruleBounded EOF ;
    public final void entryRuleBounded() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:229:1: ( ruleBounded EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:230:1: ruleBounded EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:237:1: ruleBounded : ( ( rule__Bounded__Group__0 ) ) ;
    public final void ruleBounded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:241:2: ( ( ( rule__Bounded__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:242:1: ( ( rule__Bounded__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:242:1: ( ( rule__Bounded__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:243:1: ( rule__Bounded__Group__0 )
            {
             before(grammarAccess.getBoundedAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:244:1: ( rule__Bounded__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:244:2: rule__Bounded__Group__0
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


    // $ANTLR start "entryRuleExpression"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:256:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:257:1: ( ruleExpression EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:258:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression481);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression488); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:265:1: ruleExpression : ( ruleDisjunctive ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:269:2: ( ( ruleDisjunctive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:270:1: ( ruleDisjunctive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:270:1: ( ruleDisjunctive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:271:1: ruleDisjunctive
            {
             before(grammarAccess.getExpressionAccess().getDisjunctiveParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctive_in_ruleExpression514);
            ruleDisjunctive();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getDisjunctiveParserRuleCall()); 

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


    // $ANTLR start "entryRuleDisjunctive"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:284:1: entryRuleDisjunctive : ruleDisjunctive EOF ;
    public final void entryRuleDisjunctive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:285:1: ( ruleDisjunctive EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:286:1: ruleDisjunctive EOF
            {
             before(grammarAccess.getDisjunctiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctive_in_entryRuleDisjunctive540);
            ruleDisjunctive();

            state._fsp--;

             after(grammarAccess.getDisjunctiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisjunctive547); 

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
    // $ANTLR end "entryRuleDisjunctive"


    // $ANTLR start "ruleDisjunctive"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:293:1: ruleDisjunctive : ( ( rule__Disjunctive__Group__0 ) ) ;
    public final void ruleDisjunctive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:297:2: ( ( ( rule__Disjunctive__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:298:1: ( ( rule__Disjunctive__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:298:1: ( ( rule__Disjunctive__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:299:1: ( rule__Disjunctive__Group__0 )
            {
             before(grammarAccess.getDisjunctiveAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:300:1: ( rule__Disjunctive__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:300:2: rule__Disjunctive__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__0_in_ruleDisjunctive573);
            rule__Disjunctive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctiveAccess().getGroup()); 

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
    // $ANTLR end "ruleDisjunctive"


    // $ANTLR start "entryRuleConjunctive"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:312:1: entryRuleConjunctive : ruleConjunctive EOF ;
    public final void entryRuleConjunctive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:313:1: ( ruleConjunctive EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:314:1: ruleConjunctive EOF
            {
             before(grammarAccess.getConjunctiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_entryRuleConjunctive600);
            ruleConjunctive();

            state._fsp--;

             after(grammarAccess.getConjunctiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConjunctive607); 

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
    // $ANTLR end "entryRuleConjunctive"


    // $ANTLR start "ruleConjunctive"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:321:1: ruleConjunctive : ( ( rule__Conjunctive__Group__0 ) ) ;
    public final void ruleConjunctive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:325:2: ( ( ( rule__Conjunctive__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:326:1: ( ( rule__Conjunctive__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:326:1: ( ( rule__Conjunctive__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:327:1: ( rule__Conjunctive__Group__0 )
            {
             before(grammarAccess.getConjunctiveAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:328:1: ( rule__Conjunctive__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:328:2: rule__Conjunctive__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__0_in_ruleConjunctive633);
            rule__Conjunctive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConjunctiveAccess().getGroup()); 

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
    // $ANTLR end "ruleConjunctive"


    // $ANTLR start "entryRuleEquality"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:340:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:341:1: ( ruleEquality EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:342:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_entryRuleEquality660);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquality667); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:349:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:353:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:354:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:354:1: ( ( rule__Equality__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:355:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:356:1: ( rule__Equality__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:356:2: rule__Equality__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__0_in_ruleEquality693);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:368:1: entryRuleComparative : ruleComparative EOF ;
    public final void entryRuleComparative() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:369:1: ( ruleComparative EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:370:1: ruleComparative EOF
            {
             before(grammarAccess.getComparativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_entryRuleComparative720);
            ruleComparative();

            state._fsp--;

             after(grammarAccess.getComparativeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparative727); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:377:1: ruleComparative : ( ( rule__Comparative__Group__0 ) ) ;
    public final void ruleComparative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:381:2: ( ( ( rule__Comparative__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:382:1: ( ( rule__Comparative__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:382:1: ( ( rule__Comparative__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:383:1: ( rule__Comparative__Group__0 )
            {
             before(grammarAccess.getComparativeAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:384:1: ( rule__Comparative__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:384:2: rule__Comparative__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__0_in_ruleComparative753);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:396:1: entryRuleAdditive : ruleAdditive EOF ;
    public final void entryRuleAdditive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:397:1: ( ruleAdditive EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:398:1: ruleAdditive EOF
            {
             before(grammarAccess.getAdditiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_entryRuleAdditive780);
            ruleAdditive();

            state._fsp--;

             after(grammarAccess.getAdditiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditive787); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:405:1: ruleAdditive : ( ( rule__Additive__Group__0 ) ) ;
    public final void ruleAdditive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:409:2: ( ( ( rule__Additive__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:410:1: ( ( rule__Additive__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:410:1: ( ( rule__Additive__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:411:1: ( rule__Additive__Group__0 )
            {
             before(grammarAccess.getAdditiveAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:412:1: ( rule__Additive__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:412:2: rule__Additive__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__0_in_ruleAdditive813);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:424:1: entryRuleMultiplicative : ruleMultiplicative EOF ;
    public final void entryRuleMultiplicative() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:425:1: ( ruleMultiplicative EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:426:1: ruleMultiplicative EOF
            {
             before(grammarAccess.getMultiplicativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_entryRuleMultiplicative840);
            ruleMultiplicative();

            state._fsp--;

             after(grammarAccess.getMultiplicativeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicative847); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:433:1: ruleMultiplicative : ( ( rule__Multiplicative__Group__0 ) ) ;
    public final void ruleMultiplicative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:437:2: ( ( ( rule__Multiplicative__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:438:1: ( ( rule__Multiplicative__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:438:1: ( ( rule__Multiplicative__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:439:1: ( rule__Multiplicative__Group__0 )
            {
             before(grammarAccess.getMultiplicativeAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:440:1: ( rule__Multiplicative__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:440:2: rule__Multiplicative__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__0_in_ruleMultiplicative873);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:452:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:453:1: ( rulePrimitive EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:454:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_entryRulePrimitive900);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitive907); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:461:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:465:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:466:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:466:1: ( ( rule__Primitive__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:467:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:468:1: ( rule__Primitive__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:468:2: rule__Primitive__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive933);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:480:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:481:1: ( ruleUnary EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:482:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnary_in_entryRuleUnary960);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnary967); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:489:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:493:2: ( ( ( rule__Unary__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:494:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:494:1: ( ( rule__Unary__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:495:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:496:1: ( rule__Unary__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:496:2: rule__Unary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__0_in_ruleUnary993);
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


    // $ANTLR start "entryRuleScalar"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:508:1: entryRuleScalar : ruleScalar EOF ;
    public final void entryRuleScalar() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:509:1: ( ruleScalar EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:510:1: ruleScalar EOF
            {
             before(grammarAccess.getScalarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScalar_in_entryRuleScalar1020);
            ruleScalar();

            state._fsp--;

             after(grammarAccess.getScalarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScalar1027); 

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
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:517:1: ruleScalar : ( ( rule__Scalar__Group__0 ) ) ;
    public final void ruleScalar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:521:2: ( ( ( rule__Scalar__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:522:1: ( ( rule__Scalar__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:522:1: ( ( rule__Scalar__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:523:1: ( rule__Scalar__Group__0 )
            {
             before(grammarAccess.getScalarAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:524:1: ( rule__Scalar__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:524:2: rule__Scalar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__0_in_ruleScalar1053);
            rule__Scalar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScalarAccess().getGroup()); 

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
    // $ANTLR end "ruleScalar"


    // $ANTLR start "entryRuleInRange"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:538:1: entryRuleInRange : ruleInRange EOF ;
    public final void entryRuleInRange() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:539:1: ( ruleInRange EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:540:1: ruleInRange EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:547:1: ruleInRange : ( ( rule__InRange__Group__0 ) ) ;
    public final void ruleInRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:551:2: ( ( ( rule__InRange__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:552:1: ( ( rule__InRange__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:552:1: ( ( rule__InRange__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:553:1: ( rule__InRange__Group__0 )
            {
             before(grammarAccess.getInRangeAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:554:1: ( rule__InRange__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:554:2: rule__InRange__Group__0
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:566:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:567:1: ( ruleInteger EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:568:1: ruleInteger EOF
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:575:1: ruleInteger : ( ( rule__Integer__ValueAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:579:2: ( ( ( rule__Integer__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:580:1: ( ( rule__Integer__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:580:1: ( ( rule__Integer__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:581:1: ( rule__Integer__ValueAssignment )
            {
             before(grammarAccess.getIntegerAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:582:1: ( rule__Integer__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:582:2: rule__Integer__ValueAssignment
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


    // $ANTLR start "entryRuleDouble"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:594:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:595:1: ( ruleDouble EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:596:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_entryRuleDouble1202);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDouble1209); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:603:1: ruleDouble : ( ( rule__Double__ValueAssignment ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:607:2: ( ( ( rule__Double__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:608:1: ( ( rule__Double__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:608:1: ( ( rule__Double__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:609:1: ( rule__Double__ValueAssignment )
            {
             before(grammarAccess.getDoubleAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:610:1: ( rule__Double__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:610:2: rule__Double__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Double__ValueAssignment_in_ruleDouble1235);
            rule__Double__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleBoolean"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:622:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:623:1: ( ruleBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:624:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1262);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1269); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:631:1: ruleBoolean : ( ( rule__Boolean__ValueAssignment ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:635:2: ( ( ( rule__Boolean__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:636:1: ( ( rule__Boolean__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:636:1: ( ( rule__Boolean__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:637:1: ( rule__Boolean__ValueAssignment )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:638:1: ( rule__Boolean__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:638:2: rule__Boolean__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1295);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:650:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:651:1: ( ruleString0 EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:652:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01322);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01329); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:659:1: ruleString0 : ( ( rule__String0__ValueAssignment ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:663:2: ( ( ( rule__String0__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:664:1: ( ( rule__String0__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:664:1: ( ( rule__String0__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:665:1: ( rule__String0__ValueAssignment )
            {
             before(grammarAccess.getString0Access().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:666:1: ( rule__String0__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:666:2: rule__String0__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__ValueAssignment_in_ruleString01355);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:678:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:679:1: ( ruleIdentifier EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:680:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier1382);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier1389); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:687:1: ruleIdentifier : ( ( rule__Identifier__IdAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:691:2: ( ( ( rule__Identifier__IdAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:692:1: ( ( rule__Identifier__IdAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:692:1: ( ( rule__Identifier__IdAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:693:1: ( rule__Identifier__IdAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:694:1: ( rule__Identifier__IdAssignment )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:694:2: rule__Identifier__IdAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1415);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:706:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:707:1: ( ruleEInt EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:708:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1442);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1449); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:715:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:719:2: ( ( RULE_INT ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:720:1: ( RULE_INT )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:720:1: ( RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:721:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1475); 
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


    // $ANTLR start "entryRuleEDouble"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:734:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:735:1: ( ruleEDouble EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:736:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1501);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1508); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:743:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:747:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:748:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:748:1: ( ( rule__EDouble__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:749:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:750:1: ( rule__EDouble__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:750:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1534);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:762:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:763:1: ( ruleEBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:764:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1561);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1568); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:771:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:775:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:776:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:776:1: ( ( rule__EBoolean__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:777:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:778:1: ( rule__EBoolean__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:778:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1594);
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


    // $ANTLR start "ruleDisjunctiveOperator"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:791:1: ruleDisjunctiveOperator : ( ( 'or' ) ) ;
    public final void ruleDisjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:795:1: ( ( ( 'or' ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:796:1: ( ( 'or' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:796:1: ( ( 'or' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:797:1: ( 'or' )
            {
             before(grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:798:1: ( 'or' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:798:3: 'or'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleDisjunctiveOperator1632); 

            }

             after(grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleDisjunctiveOperator"


    // $ANTLR start "ruleConjunctiveOperator"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:811:1: ruleConjunctiveOperator : ( ( 'and' ) ) ;
    public final void ruleConjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:815:1: ( ( ( 'and' ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:816:1: ( ( 'and' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:816:1: ( ( 'and' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:817:1: ( 'and' )
            {
             before(grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:818:1: ( 'and' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:818:3: 'and'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleConjunctiveOperator1671); 

            }

             after(grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleConjunctiveOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:831:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:835:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:836:1: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:836:1: ( ( rule__EqualityOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:837:1: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:838:1: ( rule__EqualityOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:838:2: rule__EqualityOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1709);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:850:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:854:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:855:1: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:855:1: ( ( rule__ComparativeOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:856:1: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:857:1: ( rule__ComparativeOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:857:2: rule__ComparativeOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1745);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:869:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:873:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:874:1: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:874:1: ( ( rule__AdditiveOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:875:1: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:876:1: ( rule__AdditiveOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:876:2: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditiveOperator__Alternatives_in_ruleAdditiveOperator1781);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:888:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:892:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:893:1: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:893:1: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:894:1: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:895:1: ( rule__MultiplicativeOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:895:2: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicativeOperator__Alternatives_in_ruleMultiplicativeOperator1817);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:907:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:911:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:912:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:912:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:913:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:914:1: ( rule__UnaryOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:914:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1853);
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


    // $ANTLR start "ruleScalarOperator"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:926:1: ruleScalarOperator : ( ( rule__ScalarOperator__Alternatives ) ) ;
    public final void ruleScalarOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:930:1: ( ( ( rule__ScalarOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:931:1: ( ( rule__ScalarOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:931:1: ( ( rule__ScalarOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:932:1: ( rule__ScalarOperator__Alternatives )
            {
             before(grammarAccess.getScalarOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:933:1: ( rule__ScalarOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:933:2: rule__ScalarOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScalarOperator__Alternatives_in_ruleScalarOperator1889);
            rule__ScalarOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScalarOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleScalarOperator"


    // $ANTLR start "rule__AbstractParameter__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:944:1: rule__AbstractParameter__Alternatives : ( ( ruleParameterGroup ) | ( ruleParameter ) );
    public final void rule__AbstractParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:948:1: ( ( ruleParameterGroup ) | ( ruleParameter ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==39) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:949:1: ( ruleParameterGroup )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:949:1: ( ruleParameterGroup )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:950:1: ruleParameterGroup
                    {
                     before(grammarAccess.getAbstractParameterAccess().getParameterGroupParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameterGroup_in_rule__AbstractParameter__Alternatives1924);
                    ruleParameterGroup();

                    state._fsp--;

                     after(grammarAccess.getAbstractParameterAccess().getParameterGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:955:6: ( ruleParameter )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:955:6: ( ruleParameter )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:956:1: ruleParameter
                    {
                     before(grammarAccess.getAbstractParameterAccess().getParameterParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__AbstractParameter__Alternatives1941);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:966:1: rule__Parameter__Alternatives_3_0 : ( ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) ) | ( 'optional' ) );
    public final void rule__Parameter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:970:1: ( ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) ) | ( 'optional' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==48) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:971:1: ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:971:1: ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:972:1: ( rule__Parameter__MandatoryAssignment_3_0_0 )
                    {
                     before(grammarAccess.getParameterAccess().getMandatoryAssignment_3_0_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:973:1: ( rule__Parameter__MandatoryAssignment_3_0_0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:973:2: rule__Parameter__MandatoryAssignment_3_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__MandatoryAssignment_3_0_0_in_rule__Parameter__Alternatives_3_01973);
                    rule__Parameter__MandatoryAssignment_3_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getMandatoryAssignment_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:977:6: ( 'optional' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:977:6: ( 'optional' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:978:1: 'optional'
                    {
                     before(grammarAccess.getParameterAccess().getOptionalKeyword_3_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Parameter__Alternatives_3_01992); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:990:1: rule__ValueRange__Alternatives : ( ( ruleEnumerated ) | ( ruleBounded ) );
    public final void rule__ValueRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:994:1: ( ( ruleEnumerated ) | ( ruleBounded ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==43) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:995:1: ( ruleEnumerated )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:995:1: ( ruleEnumerated )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:996:1: ruleEnumerated
                    {
                     before(grammarAccess.getValueRangeAccess().getEnumeratedParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerated_in_rule__ValueRange__Alternatives2026);
                    ruleEnumerated();

                    state._fsp--;

                     after(grammarAccess.getValueRangeAccess().getEnumeratedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1001:6: ( ruleBounded )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1001:6: ( ruleBounded )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1002:1: ruleBounded
                    {
                     before(grammarAccess.getValueRangeAccess().getBoundedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBounded_in_rule__ValueRange__Alternatives2043);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1012:1: rule__Primitive__Alternatives : ( ( ruleUnary ) | ( ruleScalar ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_8__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1016:1: ( ( ruleUnary ) | ( ruleScalar ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_8__0 ) ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1017:1: ( ruleUnary )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1017:1: ( ruleUnary )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1018:1: ruleUnary
                    {
                     before(grammarAccess.getPrimitiveAccess().getUnaryParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnary_in_rule__Primitive__Alternatives2075);
                    ruleUnary();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getUnaryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1023:6: ( ruleScalar )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1023:6: ( ruleScalar )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1024:1: ruleScalar
                    {
                     before(grammarAccess.getPrimitiveAccess().getScalarParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleScalar_in_rule__Primitive__Alternatives2092);
                    ruleScalar();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getScalarParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1029:6: ( ruleInRange )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1029:6: ( ruleInRange )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1030:1: ruleInRange
                    {
                     before(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInRange_in_rule__Primitive__Alternatives2109);
                    ruleInRange();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1035:6: ( ruleInteger )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1035:6: ( ruleInteger )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1036:1: ruleInteger
                    {
                     before(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__Primitive__Alternatives2126);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1041:6: ( ruleDouble )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1041:6: ( ruleDouble )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1042:1: ruleDouble
                    {
                     before(grammarAccess.getPrimitiveAccess().getDoubleParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_rule__Primitive__Alternatives2143);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getDoubleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1047:6: ( ruleBoolean )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1047:6: ( ruleBoolean )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1048:1: ruleBoolean
                    {
                     before(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Primitive__Alternatives2160);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1053:6: ( ruleString0 )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1053:6: ( ruleString0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1054:1: ruleString0
                    {
                     before(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Primitive__Alternatives2177);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1059:6: ( ruleIdentifier )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1059:6: ( ruleIdentifier )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1060:1: ruleIdentifier
                    {
                     before(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Primitive__Alternatives2194);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1065:6: ( ( rule__Primitive__Group_8__0 ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1065:6: ( ( rule__Primitive__Group_8__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1066:1: ( rule__Primitive__Group_8__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_8()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1067:1: ( rule__Primitive__Group_8__0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1067:2: rule__Primitive__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__0_in_rule__Primitive__Alternatives2211);
                    rule__Primitive__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_8()); 

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


    // $ANTLR start "rule__EDouble__Alternatives_3_0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1077:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1081:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1082:1: ( 'E' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1082:1: ( 'E' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1083:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__EDouble__Alternatives_3_02246); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1090:6: ( 'e' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1090:6: ( 'e' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1091:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__EDouble__Alternatives_3_02266); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_3_0"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1103:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1107:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1108:1: ( 'true' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1108:1: ( 'true' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1109:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__EBoolean__Alternatives2301); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1116:6: ( 'false' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1116:6: ( 'false' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1117:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__EBoolean__Alternatives2321); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1129:1: rule__EqualityOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1133:1: ( ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1134:1: ( ( '==' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1134:1: ( ( '==' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1135:1: ( '==' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1136:1: ( '==' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1136:3: '=='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__EqualityOperator__Alternatives2356); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1141:6: ( ( '!=' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1141:6: ( ( '!=' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1142:1: ( '!=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNotEqualEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1143:1: ( '!=' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1143:3: '!='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__EqualityOperator__Alternatives2377); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1153:1: rule__ComparativeOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1157:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1158:1: ( ( '<' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1158:1: ( ( '<' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1159:1: ( '<' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1160:1: ( '<' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1160:3: '<'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ComparativeOperator__Alternatives2413); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1165:6: ( ( '<=' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1165:6: ( ( '<=' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1166:1: ( '<=' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessThanEqualEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1167:1: ( '<=' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1167:3: '<='
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ComparativeOperator__Alternatives2434); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessThanEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1172:6: ( ( '>' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1172:6: ( ( '>' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1173:1: ( '>' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_2()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1174:1: ( '>' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1174:3: '>'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ComparativeOperator__Alternatives2455); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1179:6: ( ( '>=' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1179:6: ( ( '>=' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1180:1: ( '>=' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterThanEqualEnumLiteralDeclaration_3()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1181:1: ( '>=' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1181:3: '>='
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__ComparativeOperator__Alternatives2476); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterThanEqualEnumLiteralDeclaration_3()); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1191:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1195:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1196:1: ( ( '+' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1196:1: ( ( '+' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1197:1: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1198:1: ( '+' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1198:3: '+'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__AdditiveOperator__Alternatives2512); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1203:6: ( ( '-' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1203:6: ( ( '-' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1204:1: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSubtractionEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1205:1: ( '-' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1205:3: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__AdditiveOperator__Alternatives2533); 

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


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1215:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1219:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1220:1: ( ( '*' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1220:1: ( ( '*' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1221:1: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1222:1: ( '*' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1222:3: '*'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__MultiplicativeOperator__Alternatives2569); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1227:6: ( ( '/' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1227:6: ( ( '/' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1228:1: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1229:1: ( '/' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1229:3: '/'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__MultiplicativeOperator__Alternatives2590); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1239:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1243:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1244:1: ( ( 'not' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1244:1: ( ( 'not' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1245:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1246:1: ( 'not' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1246:3: 'not'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__UnaryOperator__Alternatives2626); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1251:6: ( ( '-' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1251:6: ( ( '-' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1252:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNegationEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1253:1: ( '-' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1253:3: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__UnaryOperator__Alternatives2647); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNegationEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__ScalarOperator__Alternatives"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1263:1: rule__ScalarOperator__Alternatives : ( ( ( 'sum' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) );
    public final void rule__ScalarOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1267:1: ( ( ( 'sum' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1268:1: ( ( 'sum' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1268:1: ( ( 'sum' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1269:1: ( 'sum' )
                    {
                     before(grammarAccess.getScalarOperatorAccess().getSumEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1270:1: ( 'sum' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1270:3: 'sum'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__ScalarOperator__Alternatives2683); 

                    }

                     after(grammarAccess.getScalarOperatorAccess().getSumEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1275:6: ( ( 'min' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1275:6: ( ( 'min' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1276:1: ( 'min' )
                    {
                     before(grammarAccess.getScalarOperatorAccess().getMinEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1277:1: ( 'min' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1277:3: 'min'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__ScalarOperator__Alternatives2704); 

                    }

                     after(grammarAccess.getScalarOperatorAccess().getMinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1282:6: ( ( 'max' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1282:6: ( ( 'max' ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1283:1: ( 'max' )
                    {
                     before(grammarAccess.getScalarOperatorAccess().getMaxEnumLiteralDeclaration_2()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1284:1: ( 'max' )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1284:3: 'max'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__ScalarOperator__Alternatives2725); 

                    }

                     after(grammarAccess.getScalarOperatorAccess().getMaxEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ScalarOperator__Alternatives"


    // $ANTLR start "rule__Configurator__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1296:1: rule__Configurator__Group__0 : rule__Configurator__Group__0__Impl rule__Configurator__Group__1 ;
    public final void rule__Configurator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1300:1: ( rule__Configurator__Group__0__Impl rule__Configurator__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1301:2: rule__Configurator__Group__0__Impl rule__Configurator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__02758);
            rule__Configurator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__02761);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1308:1: rule__Configurator__Group__0__Impl : ( 'configurator' ) ;
    public final void rule__Configurator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1312:1: ( ( 'configurator' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1313:1: ( 'configurator' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1313:1: ( 'configurator' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1314:1: 'configurator'
            {
             before(grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Configurator__Group__0__Impl2789); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1327:1: rule__Configurator__Group__1 : rule__Configurator__Group__1__Impl rule__Configurator__Group__2 ;
    public final void rule__Configurator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1331:1: ( rule__Configurator__Group__1__Impl rule__Configurator__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1332:2: rule__Configurator__Group__1__Impl rule__Configurator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__12820);
            rule__Configurator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__12823);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1339:1: rule__Configurator__Group__1__Impl : ( ( rule__Configurator__NameAssignment_1 ) ) ;
    public final void rule__Configurator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1343:1: ( ( ( rule__Configurator__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1344:1: ( ( rule__Configurator__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1344:1: ( ( rule__Configurator__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1345:1: ( rule__Configurator__NameAssignment_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1346:1: ( rule__Configurator__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1346:2: rule__Configurator__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__NameAssignment_1_in_rule__Configurator__Group__1__Impl2850);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1356:1: rule__Configurator__Group__2 : rule__Configurator__Group__2__Impl rule__Configurator__Group__3 ;
    public final void rule__Configurator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1360:1: ( rule__Configurator__Group__2__Impl rule__Configurator__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1361:2: rule__Configurator__Group__2__Impl rule__Configurator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__22880);
            rule__Configurator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__22883);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1368:1: rule__Configurator__Group__2__Impl : ( ( rule__Configurator__DescriptionAssignment_2 )? ) ;
    public final void rule__Configurator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1372:1: ( ( ( rule__Configurator__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1373:1: ( ( rule__Configurator__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1373:1: ( ( rule__Configurator__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1374:1: ( rule__Configurator__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getConfiguratorAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1375:1: ( rule__Configurator__DescriptionAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1375:2: rule__Configurator__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configurator__DescriptionAssignment_2_in_rule__Configurator__Group__2__Impl2910);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1385:1: rule__Configurator__Group__3 : rule__Configurator__Group__3__Impl rule__Configurator__Group__4 ;
    public final void rule__Configurator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1389:1: ( rule__Configurator__Group__3__Impl rule__Configurator__Group__4 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1390:2: rule__Configurator__Group__3__Impl rule__Configurator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__32941);
            rule__Configurator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__32944);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1397:1: rule__Configurator__Group__3__Impl : ( '{' ) ;
    public final void rule__Configurator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1401:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1402:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1402:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1403:1: '{'
            {
             before(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Configurator__Group__3__Impl2972); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1416:1: rule__Configurator__Group__4 : rule__Configurator__Group__4__Impl rule__Configurator__Group__5 ;
    public final void rule__Configurator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1420:1: ( rule__Configurator__Group__4__Impl rule__Configurator__Group__5 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1421:2: rule__Configurator__Group__4__Impl rule__Configurator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__43003);
            rule__Configurator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__43006);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1428:1: rule__Configurator__Group__4__Impl : ( ( rule__Configurator__ParametersAssignment_4 ) ) ;
    public final void rule__Configurator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1432:1: ( ( ( rule__Configurator__ParametersAssignment_4 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1433:1: ( ( rule__Configurator__ParametersAssignment_4 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1433:1: ( ( rule__Configurator__ParametersAssignment_4 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1434:1: ( rule__Configurator__ParametersAssignment_4 )
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAssignment_4()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1435:1: ( rule__Configurator__ParametersAssignment_4 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1435:2: rule__Configurator__ParametersAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__ParametersAssignment_4_in_rule__Configurator__Group__4__Impl3033);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1445:1: rule__Configurator__Group__5 : rule__Configurator__Group__5__Impl rule__Configurator__Group__6 ;
    public final void rule__Configurator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1449:1: ( rule__Configurator__Group__5__Impl rule__Configurator__Group__6 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1450:2: rule__Configurator__Group__5__Impl rule__Configurator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__53063);
            rule__Configurator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__53066);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1457:1: rule__Configurator__Group__5__Impl : ( ( rule__Configurator__Group_5__0 )* ) ;
    public final void rule__Configurator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1461:1: ( ( ( rule__Configurator__Group_5__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1462:1: ( ( rule__Configurator__Group_5__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1462:1: ( ( rule__Configurator__Group_5__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1463:1: ( rule__Configurator__Group_5__0 )*
            {
             before(grammarAccess.getConfiguratorAccess().getGroup_5()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1464:1: ( rule__Configurator__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=36)||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1464:2: rule__Configurator__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl3093);
            	    rule__Configurator__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1474:1: rule__Configurator__Group__6 : rule__Configurator__Group__6__Impl ;
    public final void rule__Configurator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1478:1: ( rule__Configurator__Group__6__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1479:2: rule__Configurator__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__63124);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1485:1: rule__Configurator__Group__6__Impl : ( '}' ) ;
    public final void rule__Configurator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1489:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1490:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1490:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1491:1: '}'
            {
             before(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Configurator__Group__6__Impl3152); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1518:1: rule__Configurator__Group_5__0 : rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 ;
    public final void rule__Configurator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1522:1: ( rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1523:2: rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__03197);
            rule__Configurator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__03200);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1530:1: rule__Configurator__Group_5__0__Impl : ( ( ',' )? ) ;
    public final void rule__Configurator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1534:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1535:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1535:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1536:1: ( ',' )?
            {
             before(grammarAccess.getConfiguratorAccess().getCommaKeyword_5_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1537:1: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1538:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Configurator__Group_5__0__Impl3229); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1549:1: rule__Configurator__Group_5__1 : rule__Configurator__Group_5__1__Impl ;
    public final void rule__Configurator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1553:1: ( rule__Configurator__Group_5__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1554:2: rule__Configurator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__13262);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1560:1: rule__Configurator__Group_5__1__Impl : ( ( rule__Configurator__ParametersAssignment_5_1 ) ) ;
    public final void rule__Configurator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1564:1: ( ( ( rule__Configurator__ParametersAssignment_5_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1565:1: ( ( rule__Configurator__ParametersAssignment_5_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1565:1: ( ( rule__Configurator__ParametersAssignment_5_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1566:1: ( rule__Configurator__ParametersAssignment_5_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAssignment_5_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1567:1: ( rule__Configurator__ParametersAssignment_5_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1567:2: rule__Configurator__ParametersAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__ParametersAssignment_5_1_in_rule__Configurator__Group_5__1__Impl3289);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1581:1: rule__ParameterGroup__Group__0 : rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1 ;
    public final void rule__ParameterGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1585:1: ( rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1586:2: rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__0__Impl_in_rule__ParameterGroup__Group__03323);
            rule__ParameterGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__1_in_rule__ParameterGroup__Group__03326);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1593:1: rule__ParameterGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__ParameterGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1597:1: ( ( 'group' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1598:1: ( 'group' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1598:1: ( 'group' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1599:1: 'group'
            {
             before(grammarAccess.getParameterGroupAccess().getGroupKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ParameterGroup__Group__0__Impl3354); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1612:1: rule__ParameterGroup__Group__1 : rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2 ;
    public final void rule__ParameterGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1616:1: ( rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1617:2: rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__1__Impl_in_rule__ParameterGroup__Group__13385);
            rule__ParameterGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__2_in_rule__ParameterGroup__Group__13388);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1624:1: rule__ParameterGroup__Group__1__Impl : ( ( rule__ParameterGroup__NameAssignment_1 ) ) ;
    public final void rule__ParameterGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1628:1: ( ( ( rule__ParameterGroup__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1629:1: ( ( rule__ParameterGroup__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1629:1: ( ( rule__ParameterGroup__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1630:1: ( rule__ParameterGroup__NameAssignment_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1631:1: ( rule__ParameterGroup__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1631:2: rule__ParameterGroup__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__NameAssignment_1_in_rule__ParameterGroup__Group__1__Impl3415);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1641:1: rule__ParameterGroup__Group__2 : rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3 ;
    public final void rule__ParameterGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1645:1: ( rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1646:2: rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__2__Impl_in_rule__ParameterGroup__Group__23445);
            rule__ParameterGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__3_in_rule__ParameterGroup__Group__23448);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1653:1: rule__ParameterGroup__Group__2__Impl : ( ( rule__ParameterGroup__DescriptionAssignment_2 )? ) ;
    public final void rule__ParameterGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1657:1: ( ( ( rule__ParameterGroup__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1658:1: ( ( rule__ParameterGroup__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1658:1: ( ( rule__ParameterGroup__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1659:1: ( rule__ParameterGroup__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getParameterGroupAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1660:1: ( rule__ParameterGroup__DescriptionAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1660:2: rule__ParameterGroup__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__DescriptionAssignment_2_in_rule__ParameterGroup__Group__2__Impl3475);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1670:1: rule__ParameterGroup__Group__3 : rule__ParameterGroup__Group__3__Impl ;
    public final void rule__ParameterGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1674:1: ( rule__ParameterGroup__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1675:2: rule__ParameterGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__3__Impl_in_rule__ParameterGroup__Group__33506);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1681:1: rule__ParameterGroup__Group__3__Impl : ( ( rule__ParameterGroup__UnorderedGroup_3 ) ) ;
    public final void rule__ParameterGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1685:1: ( ( ( rule__ParameterGroup__UnorderedGroup_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1686:1: ( ( rule__ParameterGroup__UnorderedGroup_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1686:1: ( ( rule__ParameterGroup__UnorderedGroup_3 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1687:1: ( rule__ParameterGroup__UnorderedGroup_3 )
            {
             before(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1688:1: ( rule__ParameterGroup__UnorderedGroup_3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1688:2: rule__ParameterGroup__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3_in_rule__ParameterGroup__Group__3__Impl3533);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1706:1: rule__ParameterGroup__Group_3_0__0 : rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1 ;
    public final void rule__ParameterGroup__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1710:1: ( rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1711:2: rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__0__Impl_in_rule__ParameterGroup__Group_3_0__03571);
            rule__ParameterGroup__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__1_in_rule__ParameterGroup__Group_3_0__03574);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1718:1: rule__ParameterGroup__Group_3_0__0__Impl : ( 'visible-if' ) ;
    public final void rule__ParameterGroup__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1722:1: ( ( 'visible-if' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1723:1: ( 'visible-if' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1723:1: ( 'visible-if' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1724:1: 'visible-if'
            {
             before(grammarAccess.getParameterGroupAccess().getVisibleIfKeyword_3_0_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ParameterGroup__Group_3_0__0__Impl3602); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1737:1: rule__ParameterGroup__Group_3_0__1 : rule__ParameterGroup__Group_3_0__1__Impl ;
    public final void rule__ParameterGroup__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1741:1: ( rule__ParameterGroup__Group_3_0__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1742:2: rule__ParameterGroup__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__1__Impl_in_rule__ParameterGroup__Group_3_0__13633);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1748:1: rule__ParameterGroup__Group_3_0__1__Impl : ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1752:1: ( ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1753:1: ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1753:1: ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1754:1: ( rule__ParameterGroup__VisibilityAssignment_3_0_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getVisibilityAssignment_3_0_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1755:1: ( rule__ParameterGroup__VisibilityAssignment_3_0_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1755:2: rule__ParameterGroup__VisibilityAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__VisibilityAssignment_3_0_1_in_rule__ParameterGroup__Group_3_0__1__Impl3660);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1769:1: rule__ParameterGroup__Group_3_1__0 : rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1 ;
    public final void rule__ParameterGroup__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1773:1: ( rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1774:2: rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__0__Impl_in_rule__ParameterGroup__Group_3_1__03694);
            rule__ParameterGroup__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__1_in_rule__ParameterGroup__Group_3_1__03697);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1781:1: rule__ParameterGroup__Group_3_1__0__Impl : ( 'constraints' ) ;
    public final void rule__ParameterGroup__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1785:1: ( ( 'constraints' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1786:1: ( 'constraints' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1786:1: ( 'constraints' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1787:1: 'constraints'
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsKeyword_3_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ParameterGroup__Group_3_1__0__Impl3725); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1800:1: rule__ParameterGroup__Group_3_1__1 : rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2 ;
    public final void rule__ParameterGroup__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1804:1: ( rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1805:2: rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__1__Impl_in_rule__ParameterGroup__Group_3_1__13756);
            rule__ParameterGroup__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__2_in_rule__ParameterGroup__Group_3_1__13759);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1812:1: rule__ParameterGroup__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__ParameterGroup__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1816:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1817:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1817:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1818:1: '{'
            {
             before(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ParameterGroup__Group_3_1__1__Impl3787); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1831:1: rule__ParameterGroup__Group_3_1__2 : rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3 ;
    public final void rule__ParameterGroup__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1835:1: ( rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1836:2: rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__2__Impl_in_rule__ParameterGroup__Group_3_1__23818);
            rule__ParameterGroup__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__3_in_rule__ParameterGroup__Group_3_1__23821);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1843:1: rule__ParameterGroup__Group_3_1__2__Impl : ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) ) ;
    public final void rule__ParameterGroup__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1847:1: ( ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1848:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1848:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1849:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 )
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1850:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1850:2: rule__ParameterGroup__ConstraintsAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_2_in_rule__ParameterGroup__Group_3_1__2__Impl3848);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1860:1: rule__ParameterGroup__Group_3_1__3 : rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4 ;
    public final void rule__ParameterGroup__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1864:1: ( rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1865:2: rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__3__Impl_in_rule__ParameterGroup__Group_3_1__33878);
            rule__ParameterGroup__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__4_in_rule__ParameterGroup__Group_3_1__33881);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1872:1: rule__ParameterGroup__Group_3_1__3__Impl : ( ( rule__ParameterGroup__Group_3_1_3__0 )* ) ;
    public final void rule__ParameterGroup__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1876:1: ( ( ( rule__ParameterGroup__Group_3_1_3__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1877:1: ( ( rule__ParameterGroup__Group_3_1_3__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1877:1: ( ( rule__ParameterGroup__Group_3_1_3__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1878:1: ( rule__ParameterGroup__Group_3_1_3__0 )*
            {
             before(grammarAccess.getParameterGroupAccess().getGroup_3_1_3()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1879:1: ( rule__ParameterGroup__Group_3_1_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    int LA17_1 = input.LA(2);

                    if ( ((LA17_1>=RULE_INT && LA17_1<=RULE_STRING)||(LA17_1>=16 && LA17_1<=17)||LA17_1==25||(LA17_1>=28 && LA17_1<=31)||LA17_1==41||LA17_1==47) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1879:2: rule__ParameterGroup__Group_3_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__0_in_rule__ParameterGroup__Group_3_1__3__Impl3908);
            	    rule__ParameterGroup__Group_3_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1889:1: rule__ParameterGroup__Group_3_1__4 : rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5 ;
    public final void rule__ParameterGroup__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1893:1: ( rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1894:2: rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__4__Impl_in_rule__ParameterGroup__Group_3_1__43939);
            rule__ParameterGroup__Group_3_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__5_in_rule__ParameterGroup__Group_3_1__43942);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1901:1: rule__ParameterGroup__Group_3_1__4__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1905:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1906:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1906:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1907:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_4()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1908:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1909:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_1__4__Impl3971); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1920:1: rule__ParameterGroup__Group_3_1__5 : rule__ParameterGroup__Group_3_1__5__Impl ;
    public final void rule__ParameterGroup__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1924:1: ( rule__ParameterGroup__Group_3_1__5__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1925:2: rule__ParameterGroup__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__5__Impl_in_rule__ParameterGroup__Group_3_1__54004);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1931:1: rule__ParameterGroup__Group_3_1__5__Impl : ( '}' ) ;
    public final void rule__ParameterGroup__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1935:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1936:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1936:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1937:1: '}'
            {
             before(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_1_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ParameterGroup__Group_3_1__5__Impl4032); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1962:1: rule__ParameterGroup__Group_3_1_3__0 : rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1 ;
    public final void rule__ParameterGroup__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1966:1: ( rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1967:2: rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__0__Impl_in_rule__ParameterGroup__Group_3_1_3__04075);
            rule__ParameterGroup__Group_3_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__1_in_rule__ParameterGroup__Group_3_1_3__04078);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1974:1: rule__ParameterGroup__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__ParameterGroup__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1978:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1979:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1979:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1980:1: ','
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_1_3__0__Impl4106); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1993:1: rule__ParameterGroup__Group_3_1_3__1 : rule__ParameterGroup__Group_3_1_3__1__Impl ;
    public final void rule__ParameterGroup__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1997:1: ( rule__ParameterGroup__Group_3_1_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1998:2: rule__ParameterGroup__Group_3_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__1__Impl_in_rule__ParameterGroup__Group_3_1_3__14137);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2004:1: rule__ParameterGroup__Group_3_1_3__1__Impl : ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2008:1: ( ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2009:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2009:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2010:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2011:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2011:2: rule__ParameterGroup__ConstraintsAssignment_3_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_3_1_in_rule__ParameterGroup__Group_3_1_3__1__Impl4164);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2025:1: rule__ParameterGroup__Group_3_2__0 : rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1 ;
    public final void rule__ParameterGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2029:1: ( rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2030:2: rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__0__Impl_in_rule__ParameterGroup__Group_3_2__04198);
            rule__ParameterGroup__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__1_in_rule__ParameterGroup__Group_3_2__04201);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2037:1: rule__ParameterGroup__Group_3_2__0__Impl : ( '{' ) ;
    public final void rule__ParameterGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2041:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2042:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2042:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2043:1: '{'
            {
             before(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ParameterGroup__Group_3_2__0__Impl4229); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2056:1: rule__ParameterGroup__Group_3_2__1 : rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2 ;
    public final void rule__ParameterGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2060:1: ( rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2061:2: rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__1__Impl_in_rule__ParameterGroup__Group_3_2__14260);
            rule__ParameterGroup__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__2_in_rule__ParameterGroup__Group_3_2__14263);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2068:1: rule__ParameterGroup__Group_3_2__1__Impl : ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2072:1: ( ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2073:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2073:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2074:1: ( rule__ParameterGroup__ParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2075:1: ( rule__ParameterGroup__ParametersAssignment_3_2_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2075:2: rule__ParameterGroup__ParametersAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_1_in_rule__ParameterGroup__Group_3_2__1__Impl4290);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2085:1: rule__ParameterGroup__Group_3_2__2 : rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3 ;
    public final void rule__ParameterGroup__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2089:1: ( rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2090:2: rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__2__Impl_in_rule__ParameterGroup__Group_3_2__24320);
            rule__ParameterGroup__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__3_in_rule__ParameterGroup__Group_3_2__24323);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2097:1: rule__ParameterGroup__Group_3_2__2__Impl : ( ( rule__ParameterGroup__Group_3_2_2__0 )* ) ;
    public final void rule__ParameterGroup__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2101:1: ( ( ( rule__ParameterGroup__Group_3_2_2__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2102:1: ( ( rule__ParameterGroup__Group_3_2_2__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2102:1: ( ( rule__ParameterGroup__Group_3_2_2__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2103:1: ( rule__ParameterGroup__Group_3_2_2__0 )*
            {
             before(grammarAccess.getParameterGroupAccess().getGroup_3_2_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2104:1: ( rule__ParameterGroup__Group_3_2_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==36||LA19_1==39) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==36||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2104:2: rule__ParameterGroup__Group_3_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__0_in_rule__ParameterGroup__Group_3_2__2__Impl4350);
            	    rule__ParameterGroup__Group_3_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2114:1: rule__ParameterGroup__Group_3_2__3 : rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4 ;
    public final void rule__ParameterGroup__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2118:1: ( rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2119:2: rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__3__Impl_in_rule__ParameterGroup__Group_3_2__34381);
            rule__ParameterGroup__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__4_in_rule__ParameterGroup__Group_3_2__34384);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2126:1: rule__ParameterGroup__Group_3_2__3__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2130:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2131:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2131:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2132:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_3()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2133:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2134:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_2__3__Impl4413); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2145:1: rule__ParameterGroup__Group_3_2__4 : rule__ParameterGroup__Group_3_2__4__Impl ;
    public final void rule__ParameterGroup__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2149:1: ( rule__ParameterGroup__Group_3_2__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2150:2: rule__ParameterGroup__Group_3_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__4__Impl_in_rule__ParameterGroup__Group_3_2__44446);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2156:1: rule__ParameterGroup__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__ParameterGroup__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2160:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2161:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2161:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2162:1: '}'
            {
             before(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ParameterGroup__Group_3_2__4__Impl4474); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2185:1: rule__ParameterGroup__Group_3_2_2__0 : rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1 ;
    public final void rule__ParameterGroup__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2189:1: ( rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2190:2: rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__0__Impl_in_rule__ParameterGroup__Group_3_2_2__04515);
            rule__ParameterGroup__Group_3_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__1_in_rule__ParameterGroup__Group_3_2_2__04518);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2197:1: rule__ParameterGroup__Group_3_2_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2201:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2202:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2202:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2203:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_2_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2204:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2205:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_2_2__0__Impl4547); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2216:1: rule__ParameterGroup__Group_3_2_2__1 : rule__ParameterGroup__Group_3_2_2__1__Impl ;
    public final void rule__ParameterGroup__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2220:1: ( rule__ParameterGroup__Group_3_2_2__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2221:2: rule__ParameterGroup__Group_3_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__1__Impl_in_rule__ParameterGroup__Group_3_2_2__14580);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2227:1: rule__ParameterGroup__Group_3_2_2__1__Impl : ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2231:1: ( ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2232:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2232:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2233:1: ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2234:1: ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2234:2: rule__ParameterGroup__ParametersAssignment_3_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_2_1_in_rule__ParameterGroup__Group_3_2_2__1__Impl4607);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2248:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2252:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2253:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04641);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04644);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2260:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2264:1: ( ( 'parameter' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2265:1: ( 'parameter' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2265:1: ( 'parameter' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2266:1: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Parameter__Group__0__Impl4672); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2279:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2283:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2284:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14703);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14706);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2291:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2295:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2296:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2296:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2297:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2298:1: ( rule__Parameter__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2298:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4733);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2308:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2312:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2313:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24763);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24766);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2320:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__DescriptionAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2324:1: ( ( ( rule__Parameter__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2325:1: ( ( rule__Parameter__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2325:1: ( ( rule__Parameter__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2326:1: ( rule__Parameter__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2327:1: ( rule__Parameter__DescriptionAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2327:2: rule__Parameter__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__DescriptionAssignment_2_in_rule__Parameter__Group__2__Impl4793);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2337:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2341:1: ( rule__Parameter__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2342:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34824);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2348:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__UnorderedGroup_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2352:1: ( ( ( rule__Parameter__UnorderedGroup_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2353:1: ( ( rule__Parameter__UnorderedGroup_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2353:1: ( ( rule__Parameter__UnorderedGroup_3 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2354:1: ( rule__Parameter__UnorderedGroup_3 )
            {
             before(grammarAccess.getParameterAccess().getUnorderedGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2355:1: ( rule__Parameter__UnorderedGroup_3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2355:2: rule__Parameter__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3_in_rule__Parameter__Group__3__Impl4851);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2373:1: rule__Parameter__Group_3_1__0 : rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1 ;
    public final void rule__Parameter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2377:1: ( rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2378:2: rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__0__Impl_in_rule__Parameter__Group_3_1__04889);
            rule__Parameter__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__1_in_rule__Parameter__Group_3_1__04892);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2385:1: rule__Parameter__Group_3_1__0__Impl : ( 'visible-if' ) ;
    public final void rule__Parameter__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2389:1: ( ( 'visible-if' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2390:1: ( 'visible-if' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2390:1: ( 'visible-if' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2391:1: 'visible-if'
            {
             before(grammarAccess.getParameterAccess().getVisibleIfKeyword_3_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Parameter__Group_3_1__0__Impl4920); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2404:1: rule__Parameter__Group_3_1__1 : rule__Parameter__Group_3_1__1__Impl ;
    public final void rule__Parameter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2408:1: ( rule__Parameter__Group_3_1__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2409:2: rule__Parameter__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__1__Impl_in_rule__Parameter__Group_3_1__14951);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2415:1: rule__Parameter__Group_3_1__1__Impl : ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) ) ;
    public final void rule__Parameter__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2419:1: ( ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2420:1: ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2420:1: ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2421:1: ( rule__Parameter__VisibilityAssignment_3_1_1 )
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_3_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2422:1: ( rule__Parameter__VisibilityAssignment_3_1_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2422:2: rule__Parameter__VisibilityAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__VisibilityAssignment_3_1_1_in_rule__Parameter__Group_3_1__1__Impl4978);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2436:1: rule__Parameter__Group_3_2__0 : rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 ;
    public final void rule__Parameter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2440:1: ( rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2441:2: rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__05012);
            rule__Parameter__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__05015);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2448:1: rule__Parameter__Group_3_2__0__Impl : ( 'constraints' ) ;
    public final void rule__Parameter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2452:1: ( ( 'constraints' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2453:1: ( 'constraints' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2453:1: ( 'constraints' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2454:1: 'constraints'
            {
             before(grammarAccess.getParameterAccess().getConstraintsKeyword_3_2_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Parameter__Group_3_2__0__Impl5043); 
             after(grammarAccess.getParameterAccess().getConstraintsKeyword_3_2_0()); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2467:1: rule__Parameter__Group_3_2__1 : rule__Parameter__Group_3_2__1__Impl rule__Parameter__Group_3_2__2 ;
    public final void rule__Parameter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2471:1: ( rule__Parameter__Group_3_2__1__Impl rule__Parameter__Group_3_2__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2472:2: rule__Parameter__Group_3_2__1__Impl rule__Parameter__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__15074);
            rule__Parameter__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__2_in_rule__Parameter__Group_3_2__15077);
            rule__Parameter__Group_3_2__2();

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2479:1: rule__Parameter__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__Parameter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2483:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2484:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2484:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2485:1: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter__Group_3_2__1__Impl5105); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3_2_1()); 

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


    // $ANTLR start "rule__Parameter__Group_3_2__2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2498:1: rule__Parameter__Group_3_2__2 : rule__Parameter__Group_3_2__2__Impl rule__Parameter__Group_3_2__3 ;
    public final void rule__Parameter__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2502:1: ( rule__Parameter__Group_3_2__2__Impl rule__Parameter__Group_3_2__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2503:2: rule__Parameter__Group_3_2__2__Impl rule__Parameter__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__2__Impl_in_rule__Parameter__Group_3_2__25136);
            rule__Parameter__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__3_in_rule__Parameter__Group_3_2__25139);
            rule__Parameter__Group_3_2__3();

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
    // $ANTLR end "rule__Parameter__Group_3_2__2"


    // $ANTLR start "rule__Parameter__Group_3_2__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2510:1: rule__Parameter__Group_3_2__2__Impl : ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) ) ;
    public final void rule__Parameter__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2514:1: ( ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2515:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2515:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2516:1: ( rule__Parameter__ConstraintsAssignment_3_2_2 )
            {
             before(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2517:1: ( rule__Parameter__ConstraintsAssignment_3_2_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2517:2: rule__Parameter__ConstraintsAssignment_3_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_2_in_rule__Parameter__Group_3_2__2__Impl5166);
            rule__Parameter__ConstraintsAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_2()); 

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
    // $ANTLR end "rule__Parameter__Group_3_2__2__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2__3"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2527:1: rule__Parameter__Group_3_2__3 : rule__Parameter__Group_3_2__3__Impl rule__Parameter__Group_3_2__4 ;
    public final void rule__Parameter__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2531:1: ( rule__Parameter__Group_3_2__3__Impl rule__Parameter__Group_3_2__4 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2532:2: rule__Parameter__Group_3_2__3__Impl rule__Parameter__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__3__Impl_in_rule__Parameter__Group_3_2__35196);
            rule__Parameter__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__4_in_rule__Parameter__Group_3_2__35199);
            rule__Parameter__Group_3_2__4();

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
    // $ANTLR end "rule__Parameter__Group_3_2__3"


    // $ANTLR start "rule__Parameter__Group_3_2__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2539:1: rule__Parameter__Group_3_2__3__Impl : ( ( rule__Parameter__Group_3_2_3__0 )* ) ;
    public final void rule__Parameter__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2543:1: ( ( ( rule__Parameter__Group_3_2_3__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2544:1: ( ( rule__Parameter__Group_3_2_3__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2544:1: ( ( rule__Parameter__Group_3_2_3__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2545:1: ( rule__Parameter__Group_3_2_3__0 )*
            {
             before(grammarAccess.getParameterAccess().getGroup_3_2_3()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2546:1: ( rule__Parameter__Group_3_2_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2546:2: rule__Parameter__Group_3_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__0_in_rule__Parameter__Group_3_2__3__Impl5226);
            	    rule__Parameter__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getGroup_3_2_3()); 

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
    // $ANTLR end "rule__Parameter__Group_3_2__3__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2__4"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2556:1: rule__Parameter__Group_3_2__4 : rule__Parameter__Group_3_2__4__Impl ;
    public final void rule__Parameter__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2560:1: ( rule__Parameter__Group_3_2__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2561:2: rule__Parameter__Group_3_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__4__Impl_in_rule__Parameter__Group_3_2__45257);
            rule__Parameter__Group_3_2__4__Impl();

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
    // $ANTLR end "rule__Parameter__Group_3_2__4"


    // $ANTLR start "rule__Parameter__Group_3_2__4__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2567:1: rule__Parameter__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__Parameter__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2571:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2572:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2572:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2573:1: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Parameter__Group_3_2__4__Impl5285); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3_2_4()); 

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
    // $ANTLR end "rule__Parameter__Group_3_2__4__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2_3__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2596:1: rule__Parameter__Group_3_2_3__0 : rule__Parameter__Group_3_2_3__0__Impl rule__Parameter__Group_3_2_3__1 ;
    public final void rule__Parameter__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2600:1: ( rule__Parameter__Group_3_2_3__0__Impl rule__Parameter__Group_3_2_3__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2601:2: rule__Parameter__Group_3_2_3__0__Impl rule__Parameter__Group_3_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__0__Impl_in_rule__Parameter__Group_3_2_3__05326);
            rule__Parameter__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__1_in_rule__Parameter__Group_3_2_3__05329);
            rule__Parameter__Group_3_2_3__1();

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
    // $ANTLR end "rule__Parameter__Group_3_2_3__0"


    // $ANTLR start "rule__Parameter__Group_3_2_3__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2608:1: rule__Parameter__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__Parameter__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2612:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2613:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2613:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2614:1: ','
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_3_2_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Parameter__Group_3_2_3__0__Impl5357); 
             after(grammarAccess.getParameterAccess().getCommaKeyword_3_2_3_0()); 

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
    // $ANTLR end "rule__Parameter__Group_3_2_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2_3__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2627:1: rule__Parameter__Group_3_2_3__1 : rule__Parameter__Group_3_2_3__1__Impl ;
    public final void rule__Parameter__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2631:1: ( rule__Parameter__Group_3_2_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2632:2: rule__Parameter__Group_3_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__1__Impl_in_rule__Parameter__Group_3_2_3__15388);
            rule__Parameter__Group_3_2_3__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_3_2_3__1"


    // $ANTLR start "rule__Parameter__Group_3_2_3__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2638:1: rule__Parameter__Group_3_2_3__1__Impl : ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) ) ;
    public final void rule__Parameter__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2642:1: ( ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2643:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2643:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2644:1: ( rule__Parameter__ConstraintsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2645:1: ( rule__Parameter__ConstraintsAssignment_3_2_3_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2645:2: rule__Parameter__ConstraintsAssignment_3_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_3_1_in_rule__Parameter__Group_3_2_3__1__Impl5415);
            rule__Parameter__ConstraintsAssignment_3_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_3_1()); 

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
    // $ANTLR end "rule__Parameter__Group_3_2_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3_3__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2659:1: rule__Parameter__Group_3_3__0 : rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1 ;
    public final void rule__Parameter__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2663:1: ( rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2664:2: rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__0__Impl_in_rule__Parameter__Group_3_3__05449);
            rule__Parameter__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__1_in_rule__Parameter__Group_3_3__05452);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2671:1: rule__Parameter__Group_3_3__0__Impl : ( 'values' ) ;
    public final void rule__Parameter__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2675:1: ( ( 'values' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2676:1: ( 'values' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2676:1: ( 'values' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2677:1: 'values'
            {
             before(grammarAccess.getParameterAccess().getValuesKeyword_3_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Parameter__Group_3_3__0__Impl5480); 
             after(grammarAccess.getParameterAccess().getValuesKeyword_3_3_0()); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2690:1: rule__Parameter__Group_3_3__1 : rule__Parameter__Group_3_3__1__Impl ;
    public final void rule__Parameter__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2694:1: ( rule__Parameter__Group_3_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2695:2: rule__Parameter__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__1__Impl_in_rule__Parameter__Group_3_3__15511);
            rule__Parameter__Group_3_3__1__Impl();

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2701:1: rule__Parameter__Group_3_3__1__Impl : ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) ) ;
    public final void rule__Parameter__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2705:1: ( ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2706:1: ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2706:1: ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2707:1: ( rule__Parameter__ValueRangeAssignment_3_3_1 )
            {
             before(grammarAccess.getParameterAccess().getValueRangeAssignment_3_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2708:1: ( rule__Parameter__ValueRangeAssignment_3_3_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2708:2: rule__Parameter__ValueRangeAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ValueRangeAssignment_3_3_1_in_rule__Parameter__Group_3_3__1__Impl5538);
            rule__Parameter__ValueRangeAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueRangeAssignment_3_3_1()); 

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


    // $ANTLR start "rule__Enumerated__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2722:1: rule__Enumerated__Group__0 : rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1 ;
    public final void rule__Enumerated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2726:1: ( rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2727:2: rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__0__Impl_in_rule__Enumerated__Group__05572);
            rule__Enumerated__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__1_in_rule__Enumerated__Group__05575);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2734:1: rule__Enumerated__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2738:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2739:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2739:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2740:1: '('
            {
             before(grammarAccess.getEnumeratedAccess().getLeftParenthesisKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Enumerated__Group__0__Impl5603); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2753:1: rule__Enumerated__Group__1 : rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2 ;
    public final void rule__Enumerated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2757:1: ( rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2758:2: rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__1__Impl_in_rule__Enumerated__Group__15634);
            rule__Enumerated__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__2_in_rule__Enumerated__Group__15637);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2765:1: rule__Enumerated__Group__1__Impl : ( ( rule__Enumerated__ValuesAssignment_1 ) ) ;
    public final void rule__Enumerated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2769:1: ( ( ( rule__Enumerated__ValuesAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2770:1: ( ( rule__Enumerated__ValuesAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2770:1: ( ( rule__Enumerated__ValuesAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2771:1: ( rule__Enumerated__ValuesAssignment_1 )
            {
             before(grammarAccess.getEnumeratedAccess().getValuesAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2772:1: ( rule__Enumerated__ValuesAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2772:2: rule__Enumerated__ValuesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__ValuesAssignment_1_in_rule__Enumerated__Group__1__Impl5664);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2782:1: rule__Enumerated__Group__2 : rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3 ;
    public final void rule__Enumerated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2786:1: ( rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2787:2: rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__2__Impl_in_rule__Enumerated__Group__25694);
            rule__Enumerated__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__3_in_rule__Enumerated__Group__25697);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2794:1: rule__Enumerated__Group__2__Impl : ( ( rule__Enumerated__Group_2__0 )* ) ;
    public final void rule__Enumerated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2798:1: ( ( ( rule__Enumerated__Group_2__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2799:1: ( ( rule__Enumerated__Group_2__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2799:1: ( ( rule__Enumerated__Group_2__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2800:1: ( rule__Enumerated__Group_2__0 )*
            {
             before(grammarAccess.getEnumeratedAccess().getGroup_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2801:1: ( rule__Enumerated__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2801:2: rule__Enumerated__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__0_in_rule__Enumerated__Group__2__Impl5724);
            	    rule__Enumerated__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2811:1: rule__Enumerated__Group__3 : rule__Enumerated__Group__3__Impl ;
    public final void rule__Enumerated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2815:1: ( rule__Enumerated__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2816:2: rule__Enumerated__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__3__Impl_in_rule__Enumerated__Group__35755);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2822:1: rule__Enumerated__Group__3__Impl : ( ')' ) ;
    public final void rule__Enumerated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2826:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2827:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2827:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2828:1: ')'
            {
             before(grammarAccess.getEnumeratedAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Enumerated__Group__3__Impl5783); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2849:1: rule__Enumerated__Group_2__0 : rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1 ;
    public final void rule__Enumerated__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2853:1: ( rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2854:2: rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__0__Impl_in_rule__Enumerated__Group_2__05822);
            rule__Enumerated__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__1_in_rule__Enumerated__Group_2__05825);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2861:1: rule__Enumerated__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enumerated__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2865:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2866:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2866:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2867:1: ','
            {
             before(grammarAccess.getEnumeratedAccess().getCommaKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Enumerated__Group_2__0__Impl5853); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2880:1: rule__Enumerated__Group_2__1 : rule__Enumerated__Group_2__1__Impl ;
    public final void rule__Enumerated__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2884:1: ( rule__Enumerated__Group_2__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2885:2: rule__Enumerated__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__1__Impl_in_rule__Enumerated__Group_2__15884);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2891:1: rule__Enumerated__Group_2__1__Impl : ( ( rule__Enumerated__ValuesAssignment_2_1 ) ) ;
    public final void rule__Enumerated__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2895:1: ( ( ( rule__Enumerated__ValuesAssignment_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2896:1: ( ( rule__Enumerated__ValuesAssignment_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2896:1: ( ( rule__Enumerated__ValuesAssignment_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2897:1: ( rule__Enumerated__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getEnumeratedAccess().getValuesAssignment_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2898:1: ( rule__Enumerated__ValuesAssignment_2_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2898:2: rule__Enumerated__ValuesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__ValuesAssignment_2_1_in_rule__Enumerated__Group_2__1__Impl5911);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2912:1: rule__Bounded__Group__0 : rule__Bounded__Group__0__Impl rule__Bounded__Group__1 ;
    public final void rule__Bounded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2916:1: ( rule__Bounded__Group__0__Impl rule__Bounded__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2917:2: rule__Bounded__Group__0__Impl rule__Bounded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__0__Impl_in_rule__Bounded__Group__05945);
            rule__Bounded__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__1_in_rule__Bounded__Group__05948);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2924:1: rule__Bounded__Group__0__Impl : ( '[' ) ;
    public final void rule__Bounded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2928:1: ( ( '[' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2929:1: ( '[' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2929:1: ( '[' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2930:1: '['
            {
             before(grammarAccess.getBoundedAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Bounded__Group__0__Impl5976); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2943:1: rule__Bounded__Group__1 : rule__Bounded__Group__1__Impl rule__Bounded__Group__2 ;
    public final void rule__Bounded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2947:1: ( rule__Bounded__Group__1__Impl rule__Bounded__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2948:2: rule__Bounded__Group__1__Impl rule__Bounded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__1__Impl_in_rule__Bounded__Group__16007);
            rule__Bounded__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__2_in_rule__Bounded__Group__16010);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2955:1: rule__Bounded__Group__1__Impl : ( ( rule__Bounded__LowerBoundAssignment_1 ) ) ;
    public final void rule__Bounded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2959:1: ( ( ( rule__Bounded__LowerBoundAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2960:1: ( ( rule__Bounded__LowerBoundAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2960:1: ( ( rule__Bounded__LowerBoundAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2961:1: ( rule__Bounded__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getBoundedAccess().getLowerBoundAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2962:1: ( rule__Bounded__LowerBoundAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2962:2: rule__Bounded__LowerBoundAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__LowerBoundAssignment_1_in_rule__Bounded__Group__1__Impl6037);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2972:1: rule__Bounded__Group__2 : rule__Bounded__Group__2__Impl rule__Bounded__Group__3 ;
    public final void rule__Bounded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2976:1: ( rule__Bounded__Group__2__Impl rule__Bounded__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2977:2: rule__Bounded__Group__2__Impl rule__Bounded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__2__Impl_in_rule__Bounded__Group__26067);
            rule__Bounded__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__3_in_rule__Bounded__Group__26070);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2984:1: rule__Bounded__Group__2__Impl : ( ';' ) ;
    public final void rule__Bounded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2988:1: ( ( ';' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2989:1: ( ';' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2989:1: ( ';' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2990:1: ';'
            {
             before(grammarAccess.getBoundedAccess().getSemicolonKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Bounded__Group__2__Impl6098); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3003:1: rule__Bounded__Group__3 : rule__Bounded__Group__3__Impl rule__Bounded__Group__4 ;
    public final void rule__Bounded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3007:1: ( rule__Bounded__Group__3__Impl rule__Bounded__Group__4 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3008:2: rule__Bounded__Group__3__Impl rule__Bounded__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__3__Impl_in_rule__Bounded__Group__36129);
            rule__Bounded__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__4_in_rule__Bounded__Group__36132);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3015:1: rule__Bounded__Group__3__Impl : ( ( rule__Bounded__UpperBoundAssignment_3 ) ) ;
    public final void rule__Bounded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3019:1: ( ( ( rule__Bounded__UpperBoundAssignment_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3020:1: ( ( rule__Bounded__UpperBoundAssignment_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3020:1: ( ( rule__Bounded__UpperBoundAssignment_3 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3021:1: ( rule__Bounded__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getBoundedAccess().getUpperBoundAssignment_3()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3022:1: ( rule__Bounded__UpperBoundAssignment_3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3022:2: rule__Bounded__UpperBoundAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__UpperBoundAssignment_3_in_rule__Bounded__Group__3__Impl6159);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3032:1: rule__Bounded__Group__4 : rule__Bounded__Group__4__Impl ;
    public final void rule__Bounded__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3036:1: ( rule__Bounded__Group__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3037:2: rule__Bounded__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__4__Impl_in_rule__Bounded__Group__46189);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3043:1: rule__Bounded__Group__4__Impl : ( ']' ) ;
    public final void rule__Bounded__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3047:1: ( ( ']' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3048:1: ( ']' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3048:1: ( ']' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3049:1: ']'
            {
             before(grammarAccess.getBoundedAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Bounded__Group__4__Impl6217); 
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


    // $ANTLR start "rule__Disjunctive__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3072:1: rule__Disjunctive__Group__0 : rule__Disjunctive__Group__0__Impl rule__Disjunctive__Group__1 ;
    public final void rule__Disjunctive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3076:1: ( rule__Disjunctive__Group__0__Impl rule__Disjunctive__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3077:2: rule__Disjunctive__Group__0__Impl rule__Disjunctive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__0__Impl_in_rule__Disjunctive__Group__06258);
            rule__Disjunctive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__1_in_rule__Disjunctive__Group__06261);
            rule__Disjunctive__Group__1();

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
    // $ANTLR end "rule__Disjunctive__Group__0"


    // $ANTLR start "rule__Disjunctive__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3084:1: rule__Disjunctive__Group__0__Impl : ( ruleConjunctive ) ;
    public final void rule__Disjunctive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3088:1: ( ( ruleConjunctive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3089:1: ( ruleConjunctive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3089:1: ( ruleConjunctive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3090:1: ruleConjunctive
            {
             before(grammarAccess.getDisjunctiveAccess().getConjunctiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_rule__Disjunctive__Group__0__Impl6288);
            ruleConjunctive();

            state._fsp--;

             after(grammarAccess.getDisjunctiveAccess().getConjunctiveParserRuleCall_0()); 

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
    // $ANTLR end "rule__Disjunctive__Group__0__Impl"


    // $ANTLR start "rule__Disjunctive__Group__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3101:1: rule__Disjunctive__Group__1 : rule__Disjunctive__Group__1__Impl ;
    public final void rule__Disjunctive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3105:1: ( rule__Disjunctive__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3106:2: rule__Disjunctive__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__1__Impl_in_rule__Disjunctive__Group__16317);
            rule__Disjunctive__Group__1__Impl();

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
    // $ANTLR end "rule__Disjunctive__Group__1"


    // $ANTLR start "rule__Disjunctive__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3112:1: rule__Disjunctive__Group__1__Impl : ( ( rule__Disjunctive__Group_1__0 )* ) ;
    public final void rule__Disjunctive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3116:1: ( ( ( rule__Disjunctive__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3117:1: ( ( rule__Disjunctive__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3117:1: ( ( rule__Disjunctive__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3118:1: ( rule__Disjunctive__Group_1__0 )*
            {
             before(grammarAccess.getDisjunctiveAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3119:1: ( rule__Disjunctive__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==11) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3119:2: rule__Disjunctive__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__0_in_rule__Disjunctive__Group__1__Impl6344);
            	    rule__Disjunctive__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDisjunctiveAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Disjunctive__Group__1__Impl"


    // $ANTLR start "rule__Disjunctive__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3133:1: rule__Disjunctive__Group_1__0 : rule__Disjunctive__Group_1__0__Impl rule__Disjunctive__Group_1__1 ;
    public final void rule__Disjunctive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3137:1: ( rule__Disjunctive__Group_1__0__Impl rule__Disjunctive__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3138:2: rule__Disjunctive__Group_1__0__Impl rule__Disjunctive__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__0__Impl_in_rule__Disjunctive__Group_1__06379);
            rule__Disjunctive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__1_in_rule__Disjunctive__Group_1__06382);
            rule__Disjunctive__Group_1__1();

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
    // $ANTLR end "rule__Disjunctive__Group_1__0"


    // $ANTLR start "rule__Disjunctive__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3145:1: rule__Disjunctive__Group_1__0__Impl : ( () ) ;
    public final void rule__Disjunctive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3149:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3150:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3150:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3151:1: ()
            {
             before(grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3152:1: ()
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3154:1: 
            {
            }

             after(grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunctive__Group_1__0__Impl"


    // $ANTLR start "rule__Disjunctive__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3164:1: rule__Disjunctive__Group_1__1 : rule__Disjunctive__Group_1__1__Impl rule__Disjunctive__Group_1__2 ;
    public final void rule__Disjunctive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3168:1: ( rule__Disjunctive__Group_1__1__Impl rule__Disjunctive__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3169:2: rule__Disjunctive__Group_1__1__Impl rule__Disjunctive__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__1__Impl_in_rule__Disjunctive__Group_1__16440);
            rule__Disjunctive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__2_in_rule__Disjunctive__Group_1__16443);
            rule__Disjunctive__Group_1__2();

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
    // $ANTLR end "rule__Disjunctive__Group_1__1"


    // $ANTLR start "rule__Disjunctive__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3176:1: rule__Disjunctive__Group_1__1__Impl : ( ( rule__Disjunctive__OperatorAssignment_1_1 ) ) ;
    public final void rule__Disjunctive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3180:1: ( ( ( rule__Disjunctive__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3181:1: ( ( rule__Disjunctive__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3181:1: ( ( rule__Disjunctive__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3182:1: ( rule__Disjunctive__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getDisjunctiveAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3183:1: ( rule__Disjunctive__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3183:2: rule__Disjunctive__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__OperatorAssignment_1_1_in_rule__Disjunctive__Group_1__1__Impl6470);
            rule__Disjunctive__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctiveAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Disjunctive__Group_1__1__Impl"


    // $ANTLR start "rule__Disjunctive__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3193:1: rule__Disjunctive__Group_1__2 : rule__Disjunctive__Group_1__2__Impl ;
    public final void rule__Disjunctive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3197:1: ( rule__Disjunctive__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3198:2: rule__Disjunctive__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__2__Impl_in_rule__Disjunctive__Group_1__26500);
            rule__Disjunctive__Group_1__2__Impl();

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
    // $ANTLR end "rule__Disjunctive__Group_1__2"


    // $ANTLR start "rule__Disjunctive__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3204:1: rule__Disjunctive__Group_1__2__Impl : ( ( rule__Disjunctive__RightAssignment_1_2 ) ) ;
    public final void rule__Disjunctive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3208:1: ( ( ( rule__Disjunctive__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3209:1: ( ( rule__Disjunctive__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3209:1: ( ( rule__Disjunctive__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3210:1: ( rule__Disjunctive__RightAssignment_1_2 )
            {
             before(grammarAccess.getDisjunctiveAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3211:1: ( rule__Disjunctive__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3211:2: rule__Disjunctive__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__RightAssignment_1_2_in_rule__Disjunctive__Group_1__2__Impl6527);
            rule__Disjunctive__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctiveAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Disjunctive__Group_1__2__Impl"


    // $ANTLR start "rule__Conjunctive__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3227:1: rule__Conjunctive__Group__0 : rule__Conjunctive__Group__0__Impl rule__Conjunctive__Group__1 ;
    public final void rule__Conjunctive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3231:1: ( rule__Conjunctive__Group__0__Impl rule__Conjunctive__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3232:2: rule__Conjunctive__Group__0__Impl rule__Conjunctive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__0__Impl_in_rule__Conjunctive__Group__06563);
            rule__Conjunctive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__1_in_rule__Conjunctive__Group__06566);
            rule__Conjunctive__Group__1();

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
    // $ANTLR end "rule__Conjunctive__Group__0"


    // $ANTLR start "rule__Conjunctive__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3239:1: rule__Conjunctive__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__Conjunctive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3243:1: ( ( ruleEquality ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3244:1: ( ruleEquality )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3244:1: ( ruleEquality )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3245:1: ruleEquality
            {
             before(grammarAccess.getConjunctiveAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_rule__Conjunctive__Group__0__Impl6593);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getConjunctiveAccess().getEqualityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Conjunctive__Group__0__Impl"


    // $ANTLR start "rule__Conjunctive__Group__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3256:1: rule__Conjunctive__Group__1 : rule__Conjunctive__Group__1__Impl ;
    public final void rule__Conjunctive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3260:1: ( rule__Conjunctive__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3261:2: rule__Conjunctive__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__1__Impl_in_rule__Conjunctive__Group__16622);
            rule__Conjunctive__Group__1__Impl();

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
    // $ANTLR end "rule__Conjunctive__Group__1"


    // $ANTLR start "rule__Conjunctive__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3267:1: rule__Conjunctive__Group__1__Impl : ( ( rule__Conjunctive__Group_1__0 )* ) ;
    public final void rule__Conjunctive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3271:1: ( ( ( rule__Conjunctive__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3272:1: ( ( rule__Conjunctive__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3272:1: ( ( rule__Conjunctive__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3273:1: ( rule__Conjunctive__Group_1__0 )*
            {
             before(grammarAccess.getConjunctiveAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3274:1: ( rule__Conjunctive__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==12) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3274:2: rule__Conjunctive__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__0_in_rule__Conjunctive__Group__1__Impl6649);
            	    rule__Conjunctive__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConjunctiveAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Conjunctive__Group__1__Impl"


    // $ANTLR start "rule__Conjunctive__Group_1__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3288:1: rule__Conjunctive__Group_1__0 : rule__Conjunctive__Group_1__0__Impl rule__Conjunctive__Group_1__1 ;
    public final void rule__Conjunctive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3292:1: ( rule__Conjunctive__Group_1__0__Impl rule__Conjunctive__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3293:2: rule__Conjunctive__Group_1__0__Impl rule__Conjunctive__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__0__Impl_in_rule__Conjunctive__Group_1__06684);
            rule__Conjunctive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__1_in_rule__Conjunctive__Group_1__06687);
            rule__Conjunctive__Group_1__1();

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
    // $ANTLR end "rule__Conjunctive__Group_1__0"


    // $ANTLR start "rule__Conjunctive__Group_1__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3300:1: rule__Conjunctive__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunctive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3304:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3305:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3305:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3306:1: ()
            {
             before(grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3307:1: ()
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3309:1: 
            {
            }

             after(grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunctive__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunctive__Group_1__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3319:1: rule__Conjunctive__Group_1__1 : rule__Conjunctive__Group_1__1__Impl rule__Conjunctive__Group_1__2 ;
    public final void rule__Conjunctive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3323:1: ( rule__Conjunctive__Group_1__1__Impl rule__Conjunctive__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3324:2: rule__Conjunctive__Group_1__1__Impl rule__Conjunctive__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__1__Impl_in_rule__Conjunctive__Group_1__16745);
            rule__Conjunctive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__2_in_rule__Conjunctive__Group_1__16748);
            rule__Conjunctive__Group_1__2();

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
    // $ANTLR end "rule__Conjunctive__Group_1__1"


    // $ANTLR start "rule__Conjunctive__Group_1__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3331:1: rule__Conjunctive__Group_1__1__Impl : ( ( rule__Conjunctive__OperatorAssignment_1_1 ) ) ;
    public final void rule__Conjunctive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3335:1: ( ( ( rule__Conjunctive__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3336:1: ( ( rule__Conjunctive__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3336:1: ( ( rule__Conjunctive__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3337:1: ( rule__Conjunctive__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConjunctiveAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3338:1: ( rule__Conjunctive__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3338:2: rule__Conjunctive__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__OperatorAssignment_1_1_in_rule__Conjunctive__Group_1__1__Impl6775);
            rule__Conjunctive__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConjunctiveAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Conjunctive__Group_1__1__Impl"


    // $ANTLR start "rule__Conjunctive__Group_1__2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3348:1: rule__Conjunctive__Group_1__2 : rule__Conjunctive__Group_1__2__Impl ;
    public final void rule__Conjunctive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3352:1: ( rule__Conjunctive__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3353:2: rule__Conjunctive__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__2__Impl_in_rule__Conjunctive__Group_1__26805);
            rule__Conjunctive__Group_1__2__Impl();

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
    // $ANTLR end "rule__Conjunctive__Group_1__2"


    // $ANTLR start "rule__Conjunctive__Group_1__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3359:1: rule__Conjunctive__Group_1__2__Impl : ( ( rule__Conjunctive__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunctive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3363:1: ( ( ( rule__Conjunctive__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3364:1: ( ( rule__Conjunctive__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3364:1: ( ( rule__Conjunctive__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3365:1: ( rule__Conjunctive__RightAssignment_1_2 )
            {
             before(grammarAccess.getConjunctiveAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3366:1: ( rule__Conjunctive__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3366:2: rule__Conjunctive__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__RightAssignment_1_2_in_rule__Conjunctive__Group_1__2__Impl6832);
            rule__Conjunctive__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConjunctiveAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Conjunctive__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3382:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3386:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3387:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06868);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06871);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3394:1: rule__Equality__Group__0__Impl : ( ruleComparative ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3398:1: ( ( ruleComparative ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3399:1: ( ruleComparative )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3399:1: ( ruleComparative )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3400:1: ruleComparative
            {
             before(grammarAccess.getEqualityAccess().getComparativeParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_rule__Equality__Group__0__Impl6898);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3411:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3415:1: ( rule__Equality__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3416:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16927);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3422:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3426:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3427:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3427:1: ( ( rule__Equality__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3428:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3429:1: ( rule__Equality__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=18 && LA27_0<=19)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3429:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6954);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3443:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3447:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3448:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06989);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06992);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3455:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3459:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3460:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3460:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3461:1: ()
            {
             before(grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3462:1: ()
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3464:1: 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3474:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3478:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3479:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__17050);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__17053);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3486:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OperatorAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3490:1: ( ( ( rule__Equality__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3491:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3491:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3492:1: ( rule__Equality__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3493:1: ( rule__Equality__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3493:2: rule__Equality__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl7080);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3503:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3507:1: ( rule__Equality__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3508:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__27110);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3514:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3518:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3519:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3519:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3520:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3521:1: ( rule__Equality__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3521:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl7137);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3537:1: rule__Comparative__Group__0 : rule__Comparative__Group__0__Impl rule__Comparative__Group__1 ;
    public final void rule__Comparative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3541:1: ( rule__Comparative__Group__0__Impl rule__Comparative__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3542:2: rule__Comparative__Group__0__Impl rule__Comparative__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__0__Impl_in_rule__Comparative__Group__07173);
            rule__Comparative__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__1_in_rule__Comparative__Group__07176);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3549:1: rule__Comparative__Group__0__Impl : ( ruleAdditive ) ;
    public final void rule__Comparative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3553:1: ( ( ruleAdditive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3554:1: ( ruleAdditive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3554:1: ( ruleAdditive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3555:1: ruleAdditive
            {
             before(grammarAccess.getComparativeAccess().getAdditiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_rule__Comparative__Group__0__Impl7203);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3566:1: rule__Comparative__Group__1 : rule__Comparative__Group__1__Impl ;
    public final void rule__Comparative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3570:1: ( rule__Comparative__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3571:2: rule__Comparative__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__1__Impl_in_rule__Comparative__Group__17232);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3577:1: rule__Comparative__Group__1__Impl : ( ( rule__Comparative__Group_1__0 )* ) ;
    public final void rule__Comparative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3581:1: ( ( ( rule__Comparative__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3582:1: ( ( rule__Comparative__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3582:1: ( ( rule__Comparative__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3583:1: ( rule__Comparative__Group_1__0 )*
            {
             before(grammarAccess.getComparativeAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3584:1: ( rule__Comparative__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=20 && LA28_0<=23)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3584:2: rule__Comparative__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__0_in_rule__Comparative__Group__1__Impl7259);
            	    rule__Comparative__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3598:1: rule__Comparative__Group_1__0 : rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1 ;
    public final void rule__Comparative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3602:1: ( rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3603:2: rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__0__Impl_in_rule__Comparative__Group_1__07294);
            rule__Comparative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__1_in_rule__Comparative__Group_1__07297);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3610:1: rule__Comparative__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3614:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3615:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3615:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3616:1: ()
            {
             before(grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3617:1: ()
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3619:1: 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3629:1: rule__Comparative__Group_1__1 : rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2 ;
    public final void rule__Comparative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3633:1: ( rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3634:2: rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__1__Impl_in_rule__Comparative__Group_1__17355);
            rule__Comparative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__2_in_rule__Comparative__Group_1__17358);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3641:1: rule__Comparative__Group_1__1__Impl : ( ( rule__Comparative__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3645:1: ( ( ( rule__Comparative__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3646:1: ( ( rule__Comparative__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3646:1: ( ( rule__Comparative__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3647:1: ( rule__Comparative__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparativeAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3648:1: ( rule__Comparative__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3648:2: rule__Comparative__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__OperatorAssignment_1_1_in_rule__Comparative__Group_1__1__Impl7385);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3658:1: rule__Comparative__Group_1__2 : rule__Comparative__Group_1__2__Impl ;
    public final void rule__Comparative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3662:1: ( rule__Comparative__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3663:2: rule__Comparative__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__2__Impl_in_rule__Comparative__Group_1__27415);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3669:1: rule__Comparative__Group_1__2__Impl : ( ( rule__Comparative__RightAssignment_1_2 ) ) ;
    public final void rule__Comparative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3673:1: ( ( ( rule__Comparative__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3674:1: ( ( rule__Comparative__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3674:1: ( ( rule__Comparative__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3675:1: ( rule__Comparative__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparativeAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3676:1: ( rule__Comparative__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3676:2: rule__Comparative__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__RightAssignment_1_2_in_rule__Comparative__Group_1__2__Impl7442);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3692:1: rule__Additive__Group__0 : rule__Additive__Group__0__Impl rule__Additive__Group__1 ;
    public final void rule__Additive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3696:1: ( rule__Additive__Group__0__Impl rule__Additive__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3697:2: rule__Additive__Group__0__Impl rule__Additive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__0__Impl_in_rule__Additive__Group__07478);
            rule__Additive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__1_in_rule__Additive__Group__07481);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3704:1: rule__Additive__Group__0__Impl : ( ruleMultiplicative ) ;
    public final void rule__Additive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3708:1: ( ( ruleMultiplicative ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3709:1: ( ruleMultiplicative )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3709:1: ( ruleMultiplicative )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3710:1: ruleMultiplicative
            {
             before(grammarAccess.getAdditiveAccess().getMultiplicativeParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_rule__Additive__Group__0__Impl7508);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3721:1: rule__Additive__Group__1 : rule__Additive__Group__1__Impl ;
    public final void rule__Additive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3725:1: ( rule__Additive__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3726:2: rule__Additive__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__1__Impl_in_rule__Additive__Group__17537);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3732:1: rule__Additive__Group__1__Impl : ( ( rule__Additive__Group_1__0 )* ) ;
    public final void rule__Additive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3736:1: ( ( ( rule__Additive__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3737:1: ( ( rule__Additive__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3737:1: ( ( rule__Additive__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3738:1: ( rule__Additive__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3739:1: ( rule__Additive__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=24 && LA29_0<=25)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3739:2: rule__Additive__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__0_in_rule__Additive__Group__1__Impl7564);
            	    rule__Additive__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3753:1: rule__Additive__Group_1__0 : rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1 ;
    public final void rule__Additive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3757:1: ( rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3758:2: rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__0__Impl_in_rule__Additive__Group_1__07599);
            rule__Additive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__1_in_rule__Additive__Group_1__07602);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3765:1: rule__Additive__Group_1__0__Impl : ( () ) ;
    public final void rule__Additive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3769:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3770:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3770:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3771:1: ()
            {
             before(grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3772:1: ()
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3774:1: 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3784:1: rule__Additive__Group_1__1 : rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2 ;
    public final void rule__Additive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3788:1: ( rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3789:2: rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__1__Impl_in_rule__Additive__Group_1__17660);
            rule__Additive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__2_in_rule__Additive__Group_1__17663);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3796:1: rule__Additive__Group_1__1__Impl : ( ( rule__Additive__OperatorAssignment_1_1 ) ) ;
    public final void rule__Additive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3800:1: ( ( ( rule__Additive__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3801:1: ( ( rule__Additive__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3801:1: ( ( rule__Additive__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3802:1: ( rule__Additive__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3803:1: ( rule__Additive__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3803:2: rule__Additive__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__OperatorAssignment_1_1_in_rule__Additive__Group_1__1__Impl7690);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3813:1: rule__Additive__Group_1__2 : rule__Additive__Group_1__2__Impl ;
    public final void rule__Additive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3817:1: ( rule__Additive__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3818:2: rule__Additive__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__2__Impl_in_rule__Additive__Group_1__27720);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3824:1: rule__Additive__Group_1__2__Impl : ( ( rule__Additive__RightAssignment_1_2 ) ) ;
    public final void rule__Additive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3828:1: ( ( ( rule__Additive__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3829:1: ( ( rule__Additive__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3829:1: ( ( rule__Additive__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3830:1: ( rule__Additive__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3831:1: ( rule__Additive__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3831:2: rule__Additive__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__RightAssignment_1_2_in_rule__Additive__Group_1__2__Impl7747);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3847:1: rule__Multiplicative__Group__0 : rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1 ;
    public final void rule__Multiplicative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3851:1: ( rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3852:2: rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__0__Impl_in_rule__Multiplicative__Group__07783);
            rule__Multiplicative__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__1_in_rule__Multiplicative__Group__07786);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3859:1: rule__Multiplicative__Group__0__Impl : ( rulePrimitive ) ;
    public final void rule__Multiplicative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3863:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3864:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3864:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3865:1: rulePrimitive
            {
             before(grammarAccess.getMultiplicativeAccess().getPrimitiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Multiplicative__Group__0__Impl7813);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3876:1: rule__Multiplicative__Group__1 : rule__Multiplicative__Group__1__Impl ;
    public final void rule__Multiplicative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3880:1: ( rule__Multiplicative__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3881:2: rule__Multiplicative__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__1__Impl_in_rule__Multiplicative__Group__17842);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3887:1: rule__Multiplicative__Group__1__Impl : ( ( rule__Multiplicative__Group_1__0 )* ) ;
    public final void rule__Multiplicative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3891:1: ( ( ( rule__Multiplicative__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3892:1: ( ( rule__Multiplicative__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3892:1: ( ( rule__Multiplicative__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3893:1: ( rule__Multiplicative__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3894:1: ( rule__Multiplicative__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=26 && LA30_0<=27)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3894:2: rule__Multiplicative__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__0_in_rule__Multiplicative__Group__1__Impl7869);
            	    rule__Multiplicative__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3908:1: rule__Multiplicative__Group_1__0 : rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1 ;
    public final void rule__Multiplicative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3912:1: ( rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3913:2: rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__0__Impl_in_rule__Multiplicative__Group_1__07904);
            rule__Multiplicative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__1_in_rule__Multiplicative__Group_1__07907);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3920:1: rule__Multiplicative__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3924:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3925:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3925:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3926:1: ()
            {
             before(grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3927:1: ()
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3929:1: 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3939:1: rule__Multiplicative__Group_1__1 : rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2 ;
    public final void rule__Multiplicative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3943:1: ( rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3944:2: rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__1__Impl_in_rule__Multiplicative__Group_1__17965);
            rule__Multiplicative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__2_in_rule__Multiplicative__Group_1__17968);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3951:1: rule__Multiplicative__Group_1__1__Impl : ( ( rule__Multiplicative__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3955:1: ( ( ( rule__Multiplicative__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3956:1: ( ( rule__Multiplicative__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3956:1: ( ( rule__Multiplicative__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3957:1: ( rule__Multiplicative__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3958:1: ( rule__Multiplicative__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3958:2: rule__Multiplicative__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__OperatorAssignment_1_1_in_rule__Multiplicative__Group_1__1__Impl7995);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3968:1: rule__Multiplicative__Group_1__2 : rule__Multiplicative__Group_1__2__Impl ;
    public final void rule__Multiplicative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3972:1: ( rule__Multiplicative__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3973:2: rule__Multiplicative__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__2__Impl_in_rule__Multiplicative__Group_1__28025);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3979:1: rule__Multiplicative__Group_1__2__Impl : ( ( rule__Multiplicative__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplicative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3983:1: ( ( ( rule__Multiplicative__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3984:1: ( ( rule__Multiplicative__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3984:1: ( ( rule__Multiplicative__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3985:1: ( rule__Multiplicative__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3986:1: ( rule__Multiplicative__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3986:2: rule__Multiplicative__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__RightAssignment_1_2_in_rule__Multiplicative__Group_1__2__Impl8052);
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


    // $ANTLR start "rule__Primitive__Group_8__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4002:1: rule__Primitive__Group_8__0 : rule__Primitive__Group_8__0__Impl rule__Primitive__Group_8__1 ;
    public final void rule__Primitive__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4006:1: ( rule__Primitive__Group_8__0__Impl rule__Primitive__Group_8__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4007:2: rule__Primitive__Group_8__0__Impl rule__Primitive__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__0__Impl_in_rule__Primitive__Group_8__08088);
            rule__Primitive__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__1_in_rule__Primitive__Group_8__08091);
            rule__Primitive__Group_8__1();

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
    // $ANTLR end "rule__Primitive__Group_8__0"


    // $ANTLR start "rule__Primitive__Group_8__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4014:1: rule__Primitive__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4018:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4019:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4019:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4020:1: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Primitive__Group_8__0__Impl8119); 
             after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_8_0()); 

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
    // $ANTLR end "rule__Primitive__Group_8__0__Impl"


    // $ANTLR start "rule__Primitive__Group_8__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4033:1: rule__Primitive__Group_8__1 : rule__Primitive__Group_8__1__Impl rule__Primitive__Group_8__2 ;
    public final void rule__Primitive__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4037:1: ( rule__Primitive__Group_8__1__Impl rule__Primitive__Group_8__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4038:2: rule__Primitive__Group_8__1__Impl rule__Primitive__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__1__Impl_in_rule__Primitive__Group_8__18150);
            rule__Primitive__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__2_in_rule__Primitive__Group_8__18153);
            rule__Primitive__Group_8__2();

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
    // $ANTLR end "rule__Primitive__Group_8__1"


    // $ANTLR start "rule__Primitive__Group_8__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4045:1: rule__Primitive__Group_8__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4049:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4050:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4050:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4051:1: ruleExpression
            {
             before(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_8_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Primitive__Group_8__1__Impl8180);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_8_1()); 

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
    // $ANTLR end "rule__Primitive__Group_8__1__Impl"


    // $ANTLR start "rule__Primitive__Group_8__2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4062:1: rule__Primitive__Group_8__2 : rule__Primitive__Group_8__2__Impl ;
    public final void rule__Primitive__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4066:1: ( rule__Primitive__Group_8__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4067:2: rule__Primitive__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__2__Impl_in_rule__Primitive__Group_8__28209);
            rule__Primitive__Group_8__2__Impl();

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
    // $ANTLR end "rule__Primitive__Group_8__2"


    // $ANTLR start "rule__Primitive__Group_8__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4073:1: rule__Primitive__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4077:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4078:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4078:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4079:1: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_8_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Primitive__Group_8__2__Impl8237); 
             after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_8_2()); 

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
    // $ANTLR end "rule__Primitive__Group_8__2__Impl"


    // $ANTLR start "rule__Unary__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4098:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4102:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4103:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08274);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08277);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4110:1: rule__Unary__Group__0__Impl : ( ( rule__Unary__OperatorAssignment_0 ) ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4114:1: ( ( ( rule__Unary__OperatorAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4115:1: ( ( rule__Unary__OperatorAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4115:1: ( ( rule__Unary__OperatorAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4116:1: ( rule__Unary__OperatorAssignment_0 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4117:1: ( rule__Unary__OperatorAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4117:2: rule__Unary__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__OperatorAssignment_0_in_rule__Unary__Group__0__Impl8304);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4127:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4131:1: ( rule__Unary__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4132:2: rule__Unary__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18334);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4138:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__InnerAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4142:1: ( ( ( rule__Unary__InnerAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4143:1: ( ( rule__Unary__InnerAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4143:1: ( ( rule__Unary__InnerAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4144:1: ( rule__Unary__InnerAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getInnerAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4145:1: ( rule__Unary__InnerAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4145:2: rule__Unary__InnerAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__InnerAssignment_1_in_rule__Unary__Group__1__Impl8361);
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


    // $ANTLR start "rule__Scalar__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4159:1: rule__Scalar__Group__0 : rule__Scalar__Group__0__Impl rule__Scalar__Group__1 ;
    public final void rule__Scalar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4163:1: ( rule__Scalar__Group__0__Impl rule__Scalar__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4164:2: rule__Scalar__Group__0__Impl rule__Scalar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__0__Impl_in_rule__Scalar__Group__08395);
            rule__Scalar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__1_in_rule__Scalar__Group__08398);
            rule__Scalar__Group__1();

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
    // $ANTLR end "rule__Scalar__Group__0"


    // $ANTLR start "rule__Scalar__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4171:1: rule__Scalar__Group__0__Impl : ( ( rule__Scalar__OperatorAssignment_0 ) ) ;
    public final void rule__Scalar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4175:1: ( ( ( rule__Scalar__OperatorAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4176:1: ( ( rule__Scalar__OperatorAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4176:1: ( ( rule__Scalar__OperatorAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4177:1: ( rule__Scalar__OperatorAssignment_0 )
            {
             before(grammarAccess.getScalarAccess().getOperatorAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4178:1: ( rule__Scalar__OperatorAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4178:2: rule__Scalar__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__OperatorAssignment_0_in_rule__Scalar__Group__0__Impl8425);
            rule__Scalar__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScalarAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__Scalar__Group__0__Impl"


    // $ANTLR start "rule__Scalar__Group__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4188:1: rule__Scalar__Group__1 : rule__Scalar__Group__1__Impl rule__Scalar__Group__2 ;
    public final void rule__Scalar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4192:1: ( rule__Scalar__Group__1__Impl rule__Scalar__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4193:2: rule__Scalar__Group__1__Impl rule__Scalar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__1__Impl_in_rule__Scalar__Group__18455);
            rule__Scalar__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__2_in_rule__Scalar__Group__18458);
            rule__Scalar__Group__2();

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
    // $ANTLR end "rule__Scalar__Group__1"


    // $ANTLR start "rule__Scalar__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4200:1: rule__Scalar__Group__1__Impl : ( '(' ) ;
    public final void rule__Scalar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4204:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4205:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4205:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4206:1: '('
            {
             before(grammarAccess.getScalarAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Scalar__Group__1__Impl8486); 
             after(grammarAccess.getScalarAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Scalar__Group__1__Impl"


    // $ANTLR start "rule__Scalar__Group__2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4219:1: rule__Scalar__Group__2 : rule__Scalar__Group__2__Impl rule__Scalar__Group__3 ;
    public final void rule__Scalar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4223:1: ( rule__Scalar__Group__2__Impl rule__Scalar__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4224:2: rule__Scalar__Group__2__Impl rule__Scalar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__2__Impl_in_rule__Scalar__Group__28517);
            rule__Scalar__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__3_in_rule__Scalar__Group__28520);
            rule__Scalar__Group__3();

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
    // $ANTLR end "rule__Scalar__Group__2"


    // $ANTLR start "rule__Scalar__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4231:1: rule__Scalar__Group__2__Impl : ( ( rule__Scalar__IdAssignment_2 ) ) ;
    public final void rule__Scalar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4235:1: ( ( ( rule__Scalar__IdAssignment_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4236:1: ( ( rule__Scalar__IdAssignment_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4236:1: ( ( rule__Scalar__IdAssignment_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4237:1: ( rule__Scalar__IdAssignment_2 )
            {
             before(grammarAccess.getScalarAccess().getIdAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4238:1: ( rule__Scalar__IdAssignment_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4238:2: rule__Scalar__IdAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__IdAssignment_2_in_rule__Scalar__Group__2__Impl8547);
            rule__Scalar__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScalarAccess().getIdAssignment_2()); 

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
    // $ANTLR end "rule__Scalar__Group__2__Impl"


    // $ANTLR start "rule__Scalar__Group__3"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4248:1: rule__Scalar__Group__3 : rule__Scalar__Group__3__Impl ;
    public final void rule__Scalar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4252:1: ( rule__Scalar__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4253:2: rule__Scalar__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__3__Impl_in_rule__Scalar__Group__38577);
            rule__Scalar__Group__3__Impl();

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
    // $ANTLR end "rule__Scalar__Group__3"


    // $ANTLR start "rule__Scalar__Group__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4259:1: rule__Scalar__Group__3__Impl : ( ')' ) ;
    public final void rule__Scalar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4263:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4264:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4264:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4265:1: ')'
            {
             before(grammarAccess.getScalarAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Scalar__Group__3__Impl8605); 
             after(grammarAccess.getScalarAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Scalar__Group__3__Impl"


    // $ANTLR start "rule__InRange__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4286:1: rule__InRange__Group__0 : rule__InRange__Group__0__Impl rule__InRange__Group__1 ;
    public final void rule__InRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4290:1: ( rule__InRange__Group__0__Impl rule__InRange__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4291:2: rule__InRange__Group__0__Impl rule__InRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__0__Impl_in_rule__InRange__Group__08644);
            rule__InRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__1_in_rule__InRange__Group__08647);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4298:1: rule__InRange__Group__0__Impl : ( ( rule__InRange__ParameterAssignment_0 ) ) ;
    public final void rule__InRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4302:1: ( ( ( rule__InRange__ParameterAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4303:1: ( ( rule__InRange__ParameterAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4303:1: ( ( rule__InRange__ParameterAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4304:1: ( rule__InRange__ParameterAssignment_0 )
            {
             before(grammarAccess.getInRangeAccess().getParameterAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4305:1: ( rule__InRange__ParameterAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4305:2: rule__InRange__ParameterAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__ParameterAssignment_0_in_rule__InRange__Group__0__Impl8674);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4315:1: rule__InRange__Group__1 : rule__InRange__Group__1__Impl rule__InRange__Group__2 ;
    public final void rule__InRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4319:1: ( rule__InRange__Group__1__Impl rule__InRange__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4320:2: rule__InRange__Group__1__Impl rule__InRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__1__Impl_in_rule__InRange__Group__18704);
            rule__InRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__2_in_rule__InRange__Group__18707);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4327:1: rule__InRange__Group__1__Impl : ( 'in' ) ;
    public final void rule__InRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4331:1: ( ( 'in' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4332:1: ( 'in' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4332:1: ( 'in' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4333:1: 'in'
            {
             before(grammarAccess.getInRangeAccess().getInKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__InRange__Group__1__Impl8735); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4346:1: rule__InRange__Group__2 : rule__InRange__Group__2__Impl ;
    public final void rule__InRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4350:1: ( rule__InRange__Group__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4351:2: rule__InRange__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__2__Impl_in_rule__InRange__Group__28766);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4357:1: rule__InRange__Group__2__Impl : ( ( rule__InRange__RangeAssignment_2 ) ) ;
    public final void rule__InRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4361:1: ( ( ( rule__InRange__RangeAssignment_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4362:1: ( ( rule__InRange__RangeAssignment_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4362:1: ( ( rule__InRange__RangeAssignment_2 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4363:1: ( rule__InRange__RangeAssignment_2 )
            {
             before(grammarAccess.getInRangeAccess().getRangeAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4364:1: ( rule__InRange__RangeAssignment_2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4364:2: rule__InRange__RangeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__RangeAssignment_2_in_rule__InRange__Group__2__Impl8793);
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


    // $ANTLR start "rule__EDouble__Group__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4380:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4384:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4385:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__08829);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__08832);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4392:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4396:1: ( ( ( RULE_INT )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4397:1: ( ( RULE_INT )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4397:1: ( ( RULE_INT )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4398:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4399:1: ( RULE_INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4399:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl8860); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4409:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4413:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4414:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__18891);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__18894);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4421:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4425:1: ( ( '.' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4426:1: ( '.' )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4426:1: ( '.' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4427:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__EDouble__Group__1__Impl8922); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4440:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4444:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4445:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__28953);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__28956);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4452:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4456:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4457:1: ( RULE_INT )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4457:1: ( RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4458:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl8983); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4469:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4473:1: ( rule__EDouble__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4474:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39012);
            rule__EDouble__Group__3__Impl();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4480:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4484:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4485:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4485:1: ( ( rule__EDouble__Group_3__0 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4486:1: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4487:1: ( rule__EDouble__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=14 && LA32_0<=15)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4487:2: rule__EDouble__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__0_in_rule__EDouble__Group__3__Impl9039);
                    rule__EDouble__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group_3__0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4505:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4509:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4510:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__0__Impl_in_rule__EDouble__Group_3__09078);
            rule__EDouble__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__1_in_rule__EDouble__Group_3__09081);
            rule__EDouble__Group_3__1();

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
    // $ANTLR end "rule__EDouble__Group_3__0"


    // $ANTLR start "rule__EDouble__Group_3__0__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4517:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4521:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4522:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4522:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4523:1: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4524:1: ( rule__EDouble__Alternatives_3_0 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4524:2: rule__EDouble__Alternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_3_0_in_rule__EDouble__Group_3__0__Impl9108);
            rule__EDouble__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__EDouble__Group_3__0__Impl"


    // $ANTLR start "rule__EDouble__Group_3__1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4534:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4538:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4539:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__1__Impl_in_rule__EDouble__Group_3__19138);
            rule__EDouble__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__2_in_rule__EDouble__Group_3__19141);
            rule__EDouble__Group_3__2();

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
    // $ANTLR end "rule__EDouble__Group_3__1"


    // $ANTLR start "rule__EDouble__Group_3__1__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4546:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4550:1: ( ( ( '-' )? ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4551:1: ( ( '-' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4551:1: ( ( '-' )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4552:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4553:1: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4554:2: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__EDouble__Group_3__1__Impl9170); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 

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
    // $ANTLR end "rule__EDouble__Group_3__1__Impl"


    // $ANTLR start "rule__EDouble__Group_3__2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4565:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4569:1: ( rule__EDouble__Group_3__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4570:2: rule__EDouble__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__2__Impl_in_rule__EDouble__Group_3__29203);
            rule__EDouble__Group_3__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_3__2"


    // $ANTLR start "rule__EDouble__Group_3__2__Impl"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4576:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4580:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4581:1: ( RULE_INT )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4581:1: ( RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4582:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_3__2__Impl9230); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 

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
    // $ANTLR end "rule__EDouble__Group_3__2__Impl"


    // $ANTLR start "rule__ParameterGroup__UnorderedGroup_3"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4600:1: rule__ParameterGroup__UnorderedGroup_3 : rule__ParameterGroup__UnorderedGroup_3__0 {...}?;
    public final void rule__ParameterGroup__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4605:1: ( rule__ParameterGroup__UnorderedGroup_3__0 {...}?)
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4606:2: rule__ParameterGroup__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__0_in_rule__ParameterGroup__UnorderedGroup_39266);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4617:1: rule__ParameterGroup__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__ParameterGroup__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4622:1: ( ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4623:3: ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4623:3: ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( LA34_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt34=2;
            }
            else if ( LA34_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt34=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4625:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4625:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4626:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4626:111: ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4627:6: ( ( rule__ParameterGroup__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4633:6: ( ( rule__ParameterGroup__Group_3_0__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4635:7: ( rule__ParameterGroup__Group_3_0__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4636:7: ( rule__ParameterGroup__Group_3_0__0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4636:8: rule__ParameterGroup__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9355);
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
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4642:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4642:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4643:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4643:111: ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4644:6: ( ( rule__ParameterGroup__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4650:6: ( ( rule__ParameterGroup__Group_3_1__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4652:7: ( rule__ParameterGroup__Group_3_1__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4653:7: ( rule__ParameterGroup__Group_3_1__0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4653:8: rule__ParameterGroup__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9446);
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
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4659:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4659:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4660:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4660:111: ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4661:6: ( ( rule__ParameterGroup__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4667:6: ( ( rule__ParameterGroup__Group_3_2__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4669:7: ( rule__ParameterGroup__Group_3_2__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_2()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4670:7: ( rule__ParameterGroup__Group_3_2__0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4670:8: rule__ParameterGroup__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9537);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4685:1: rule__ParameterGroup__UnorderedGroup_3__0 : rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )? ;
    public final void rule__ParameterGroup__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4689:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4690:2: rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__09596);
            rule__ParameterGroup__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4691:2: ( rule__ParameterGroup__UnorderedGroup_3__1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4691:2: rule__ParameterGroup__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__1_in_rule__ParameterGroup__UnorderedGroup_3__09599);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4698:1: rule__ParameterGroup__UnorderedGroup_3__1 : rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )? ;
    public final void rule__ParameterGroup__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4702:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4703:2: rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__19624);
            rule__ParameterGroup__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4704:2: ( rule__ParameterGroup__UnorderedGroup_3__2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4704:2: rule__ParameterGroup__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__2_in_rule__ParameterGroup__UnorderedGroup_3__19627);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4711:1: rule__ParameterGroup__UnorderedGroup_3__2 : rule__ParameterGroup__UnorderedGroup_3__Impl ;
    public final void rule__ParameterGroup__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4715:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4716:2: rule__ParameterGroup__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__29652);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4729:1: rule__Parameter__UnorderedGroup_3 : rule__Parameter__UnorderedGroup_3__0 {...}?;
    public final void rule__Parameter__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4734:1: ( rule__Parameter__UnorderedGroup_3__0 {...}?)
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4735:2: rule__Parameter__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__0_in_rule__Parameter__UnorderedGroup_39682);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4746:1: rule__Parameter__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__Parameter__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4751:1: ( ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4752:3: ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4752:3: ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13||LA37_0==48) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt37=2;
            }
            else if ( LA37_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt37=3;
            }
            else if ( LA37_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt37=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4754:4: ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4754:4: ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4755:5: {...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4755:106: ( ( ( rule__Parameter__Alternatives_3_0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4756:6: ( ( rule__Parameter__Alternatives_3_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4762:6: ( ( rule__Parameter__Alternatives_3_0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4764:7: ( rule__Parameter__Alternatives_3_0 )
                    {
                     before(grammarAccess.getParameterAccess().getAlternatives_3_0()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4765:7: ( rule__Parameter__Alternatives_3_0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4765:8: rule__Parameter__Alternatives_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Alternatives_3_0_in_rule__Parameter__UnorderedGroup_3__Impl9771);
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
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4771:4: ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4771:4: ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4772:5: {...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4772:106: ( ( ( rule__Parameter__Group_3_1__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4773:6: ( ( rule__Parameter__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4779:6: ( ( rule__Parameter__Group_3_1__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4781:7: ( rule__Parameter__Group_3_1__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_1()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4782:7: ( rule__Parameter__Group_3_1__0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4782:8: rule__Parameter__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__0_in_rule__Parameter__UnorderedGroup_3__Impl9862);
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
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4788:4: ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4788:4: ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4789:5: {...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4789:106: ( ( ( rule__Parameter__Group_3_2__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4790:6: ( ( rule__Parameter__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4796:6: ( ( rule__Parameter__Group_3_2__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4798:7: ( rule__Parameter__Group_3_2__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_2()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4799:7: ( rule__Parameter__Group_3_2__0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4799:8: rule__Parameter__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__UnorderedGroup_3__Impl9953);
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
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4805:4: ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4805:4: ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4806:5: {...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4806:106: ( ( ( rule__Parameter__Group_3_3__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4807:6: ( ( rule__Parameter__Group_3_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4813:6: ( ( rule__Parameter__Group_3_3__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4815:7: ( rule__Parameter__Group_3_3__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_3()); 
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4816:7: ( rule__Parameter__Group_3_3__0 )
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4816:8: rule__Parameter__Group_3_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__0_in_rule__Parameter__UnorderedGroup_3__Impl10044);
                    rule__Parameter__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_3_3()); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4831:1: rule__Parameter__UnorderedGroup_3__0 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )? ;
    public final void rule__Parameter__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4835:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4836:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__010103);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4837:2: ( rule__Parameter__UnorderedGroup_3__1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13||LA38_0==48) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt38=1;
            }
            else if ( LA38_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4837:2: rule__Parameter__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__1_in_rule__Parameter__UnorderedGroup_3__010106);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4844:1: rule__Parameter__UnorderedGroup_3__1 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )? ;
    public final void rule__Parameter__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4848:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4849:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__110131);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4850:2: ( rule__Parameter__UnorderedGroup_3__2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13||LA39_0==48) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4850:2: rule__Parameter__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__2_in_rule__Parameter__UnorderedGroup_3__110134);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4857:1: rule__Parameter__UnorderedGroup_3__2 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )? ;
    public final void rule__Parameter__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4861:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )? )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4862:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__210159);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4863:2: ( rule__Parameter__UnorderedGroup_3__3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==13||LA40_0==48) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4863:2: rule__Parameter__UnorderedGroup_3__3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__3_in_rule__Parameter__UnorderedGroup_3__210162);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4870:1: rule__Parameter__UnorderedGroup_3__3 : rule__Parameter__UnorderedGroup_3__Impl ;
    public final void rule__Parameter__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4874:1: ( rule__Parameter__UnorderedGroup_3__Impl )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4875:2: rule__Parameter__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__310187);
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
    // $ANTLR end "rule__Parameter__UnorderedGroup_3__3"


    // $ANTLR start "rule__Configurator__NameAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4890:1: rule__Configurator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Configurator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4894:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4895:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4895:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4896:1: RULE_ID
            {
             before(grammarAccess.getConfiguratorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Configurator__NameAssignment_110223); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4905:1: rule__Configurator__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Configurator__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4909:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4910:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4910:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4911:1: RULE_STRING
            {
             before(grammarAccess.getConfiguratorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Configurator__DescriptionAssignment_210254); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4920:1: rule__Configurator__ParametersAssignment_4 : ( ruleAbstractParameter ) ;
    public final void rule__Configurator__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4924:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4925:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4925:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4926:1: ruleAbstractParameter
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_410285);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4935:1: rule__Configurator__ParametersAssignment_5_1 : ( ruleAbstractParameter ) ;
    public final void rule__Configurator__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4939:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4940:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4940:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4941:1: ruleAbstractParameter
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_5_110316);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4950:1: rule__ParameterGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4954:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4955:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4955:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4956:1: RULE_ID
            {
             before(grammarAccess.getParameterGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ParameterGroup__NameAssignment_110347); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4965:1: rule__ParameterGroup__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ParameterGroup__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4969:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4970:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4970:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4971:1: RULE_STRING
            {
             before(grammarAccess.getParameterGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ParameterGroup__DescriptionAssignment_210378); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4980:1: rule__ParameterGroup__VisibilityAssignment_3_0_1 : ( ruleExpression ) ;
    public final void rule__ParameterGroup__VisibilityAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4984:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4985:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4985:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4986:1: ruleExpression
            {
             before(grammarAccess.getParameterGroupAccess().getVisibilityExpressionParserRuleCall_3_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParameterGroup__VisibilityAssignment_3_0_110409);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4995:1: rule__ParameterGroup__ConstraintsAssignment_3_1_2 : ( ruleExpression ) ;
    public final void rule__ParameterGroup__ConstraintsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4999:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5000:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5000:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5001:1: ruleExpression
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsExpressionParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParameterGroup__ConstraintsAssignment_3_1_210440);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterGroupAccess().getConstraintsExpressionParserRuleCall_3_1_2_0()); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5010:1: rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 : ( ruleExpression ) ;
    public final void rule__ParameterGroup__ConstraintsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5014:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5015:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5015:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5016:1: ruleExpression
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsExpressionParserRuleCall_3_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParameterGroup__ConstraintsAssignment_3_1_3_110471);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterGroupAccess().getConstraintsExpressionParserRuleCall_3_1_3_1_0()); 

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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5025:1: rule__ParameterGroup__ParametersAssignment_3_2_1 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterGroup__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5029:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5030:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5030:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5031:1: ruleAbstractParameter
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_110502);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5040:1: rule__ParameterGroup__ParametersAssignment_3_2_2_1 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterGroup__ParametersAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5044:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5045:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5045:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5046:1: ruleAbstractParameter
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_2_110533);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5055:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5059:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5060:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5060:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5061:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_110564); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5070:1: rule__Parameter__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Parameter__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5074:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5075:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5075:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5076:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_210595); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5085:1: rule__Parameter__MandatoryAssignment_3_0_0 : ( ( 'mandatory' ) ) ;
    public final void rule__Parameter__MandatoryAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5089:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5090:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5090:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5091:1: ( 'mandatory' )
            {
             before(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5092:1: ( 'mandatory' )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5093:1: 'mandatory'
            {
             before(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Parameter__MandatoryAssignment_3_0_010631); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5108:1: rule__Parameter__VisibilityAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__Parameter__VisibilityAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5112:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5113:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5113:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5114:1: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getVisibilityExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__VisibilityAssignment_3_1_110670);
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


    // $ANTLR start "rule__Parameter__ConstraintsAssignment_3_2_2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5123:1: rule__Parameter__ConstraintsAssignment_3_2_2 : ( ruleExpression ) ;
    public final void rule__Parameter__ConstraintsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5127:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5128:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5128:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5129:1: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getConstraintsExpressionParserRuleCall_3_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__ConstraintsAssignment_3_2_210701);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getConstraintsExpressionParserRuleCall_3_2_2_0()); 

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
    // $ANTLR end "rule__Parameter__ConstraintsAssignment_3_2_2"


    // $ANTLR start "rule__Parameter__ConstraintsAssignment_3_2_3_1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5138:1: rule__Parameter__ConstraintsAssignment_3_2_3_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ConstraintsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5142:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5143:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5143:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5144:1: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getConstraintsExpressionParserRuleCall_3_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__ConstraintsAssignment_3_2_3_110732);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getConstraintsExpressionParserRuleCall_3_2_3_1_0()); 

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
    // $ANTLR end "rule__Parameter__ConstraintsAssignment_3_2_3_1"


    // $ANTLR start "rule__Parameter__ValueRangeAssignment_3_3_1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5153:1: rule__Parameter__ValueRangeAssignment_3_3_1 : ( ruleValueRange ) ;
    public final void rule__Parameter__ValueRangeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5157:1: ( ( ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5158:1: ( ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5158:1: ( ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5159:1: ruleValueRange
            {
             before(grammarAccess.getParameterAccess().getValueRangeValueRangeParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_rule__Parameter__ValueRangeAssignment_3_3_110763);
            ruleValueRange();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueRangeValueRangeParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Parameter__ValueRangeAssignment_3_3_1"


    // $ANTLR start "rule__Enumerated__ValuesAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5168:1: rule__Enumerated__ValuesAssignment_1 : ( ruleExpression ) ;
    public final void rule__Enumerated__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5172:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5173:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5173:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5174:1: ruleExpression
            {
             before(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_110794);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5183:1: rule__Enumerated__ValuesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Enumerated__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5187:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5188:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5188:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5189:1: ruleExpression
            {
             before(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_2_110825);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5198:1: rule__Bounded__LowerBoundAssignment_1 : ( ruleExpression ) ;
    public final void rule__Bounded__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5202:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5203:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5203:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5204:1: ruleExpression
            {
             before(grammarAccess.getBoundedAccess().getLowerBoundExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Bounded__LowerBoundAssignment_110856);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5213:1: rule__Bounded__UpperBoundAssignment_3 : ( ruleExpression ) ;
    public final void rule__Bounded__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5217:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5218:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5218:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5219:1: ruleExpression
            {
             before(grammarAccess.getBoundedAccess().getUpperBoundExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Bounded__UpperBoundAssignment_310887);
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


    // $ANTLR start "rule__Disjunctive__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5228:1: rule__Disjunctive__OperatorAssignment_1_1 : ( ruleDisjunctiveOperator ) ;
    public final void rule__Disjunctive__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5232:1: ( ( ruleDisjunctiveOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5233:1: ( ruleDisjunctiveOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5233:1: ( ruleDisjunctiveOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5234:1: ruleDisjunctiveOperator
            {
             before(grammarAccess.getDisjunctiveAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctiveOperator_in_rule__Disjunctive__OperatorAssignment_1_110918);
            ruleDisjunctiveOperator();

            state._fsp--;

             after(grammarAccess.getDisjunctiveAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Disjunctive__OperatorAssignment_1_1"


    // $ANTLR start "rule__Disjunctive__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5243:1: rule__Disjunctive__RightAssignment_1_2 : ( ruleConjunctive ) ;
    public final void rule__Disjunctive__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5247:1: ( ( ruleConjunctive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5248:1: ( ruleConjunctive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5248:1: ( ruleConjunctive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5249:1: ruleConjunctive
            {
             before(grammarAccess.getDisjunctiveAccess().getRightConjunctiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_rule__Disjunctive__RightAssignment_1_210949);
            ruleConjunctive();

            state._fsp--;

             after(grammarAccess.getDisjunctiveAccess().getRightConjunctiveParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Disjunctive__RightAssignment_1_2"


    // $ANTLR start "rule__Conjunctive__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5258:1: rule__Conjunctive__OperatorAssignment_1_1 : ( ruleConjunctiveOperator ) ;
    public final void rule__Conjunctive__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5262:1: ( ( ruleConjunctiveOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5263:1: ( ruleConjunctiveOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5263:1: ( ruleConjunctiveOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5264:1: ruleConjunctiveOperator
            {
             before(grammarAccess.getConjunctiveAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctiveOperator_in_rule__Conjunctive__OperatorAssignment_1_110980);
            ruleConjunctiveOperator();

            state._fsp--;

             after(grammarAccess.getConjunctiveAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Conjunctive__OperatorAssignment_1_1"


    // $ANTLR start "rule__Conjunctive__RightAssignment_1_2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5273:1: rule__Conjunctive__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__Conjunctive__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5277:1: ( ( ruleEquality ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5278:1: ( ruleEquality )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5278:1: ( ruleEquality )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5279:1: ruleEquality
            {
             before(grammarAccess.getConjunctiveAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_rule__Conjunctive__RightAssignment_1_211011);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getConjunctiveAccess().getRightEqualityParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Conjunctive__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5288:1: rule__Equality__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__Equality__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5292:1: ( ( ruleEqualityOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5293:1: ( ruleEqualityOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5293:1: ( ruleEqualityOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5294:1: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_111042);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5303:1: rule__Equality__RightAssignment_1_2 : ( ruleComparative ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5307:1: ( ( ruleComparative ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5308:1: ( ruleComparative )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5308:1: ( ruleComparative )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5309:1: ruleComparative
            {
             before(grammarAccess.getEqualityAccess().getRightComparativeParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_rule__Equality__RightAssignment_1_211073);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5318:1: rule__Comparative__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__Comparative__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5322:1: ( ( ruleComparativeOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5323:1: ( ruleComparativeOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5323:1: ( ruleComparativeOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5324:1: ruleComparativeOperator
            {
             before(grammarAccess.getComparativeAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparativeOperator_in_rule__Comparative__OperatorAssignment_1_111104);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5333:1: rule__Comparative__RightAssignment_1_2 : ( ruleAdditive ) ;
    public final void rule__Comparative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5337:1: ( ( ruleAdditive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5338:1: ( ruleAdditive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5338:1: ( ruleAdditive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5339:1: ruleAdditive
            {
             before(grammarAccess.getComparativeAccess().getRightAdditiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_rule__Comparative__RightAssignment_1_211135);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5348:1: rule__Additive__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__Additive__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5352:1: ( ( ruleAdditiveOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5353:1: ( ruleAdditiveOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5353:1: ( ruleAdditiveOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5354:1: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveOperator_in_rule__Additive__OperatorAssignment_1_111166);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5363:1: rule__Additive__RightAssignment_1_2 : ( ruleMultiplicative ) ;
    public final void rule__Additive__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5367:1: ( ( ruleMultiplicative ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5368:1: ( ruleMultiplicative )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5368:1: ( ruleMultiplicative )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5369:1: ruleMultiplicative
            {
             before(grammarAccess.getAdditiveAccess().getRightMultiplicativeParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_rule__Additive__RightAssignment_1_211197);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5378:1: rule__Multiplicative__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__Multiplicative__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5382:1: ( ( ruleMultiplicativeOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5383:1: ( ruleMultiplicativeOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5383:1: ( ruleMultiplicativeOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5384:1: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeOperator_in_rule__Multiplicative__OperatorAssignment_1_111228);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5393:1: rule__Multiplicative__RightAssignment_1_2 : ( rulePrimitive ) ;
    public final void rule__Multiplicative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5397:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5398:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5398:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5399:1: rulePrimitive
            {
             before(grammarAccess.getMultiplicativeAccess().getRightPrimitiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Multiplicative__RightAssignment_1_211259);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5408:1: rule__Unary__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__Unary__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5412:1: ( ( ruleUnaryOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5413:1: ( ruleUnaryOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5413:1: ( ruleUnaryOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5414:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__Unary__OperatorAssignment_011290);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5423:1: rule__Unary__InnerAssignment_1 : ( rulePrimitive ) ;
    public final void rule__Unary__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5427:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5428:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5428:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5429:1: rulePrimitive
            {
             before(grammarAccess.getUnaryAccess().getInnerPrimitiveParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Unary__InnerAssignment_111321);
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


    // $ANTLR start "rule__Scalar__OperatorAssignment_0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5438:1: rule__Scalar__OperatorAssignment_0 : ( ruleScalarOperator ) ;
    public final void rule__Scalar__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5442:1: ( ( ruleScalarOperator ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5443:1: ( ruleScalarOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5443:1: ( ruleScalarOperator )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5444:1: ruleScalarOperator
            {
             before(grammarAccess.getScalarAccess().getOperatorScalarOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScalarOperator_in_rule__Scalar__OperatorAssignment_011352);
            ruleScalarOperator();

            state._fsp--;

             after(grammarAccess.getScalarAccess().getOperatorScalarOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Scalar__OperatorAssignment_0"


    // $ANTLR start "rule__Scalar__IdAssignment_2"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5453:1: rule__Scalar__IdAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Scalar__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5457:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5458:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5458:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5459:1: ( RULE_ID )
            {
             before(grammarAccess.getScalarAccess().getIdParameterGroupCrossReference_2_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5460:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5461:1: RULE_ID
            {
             before(grammarAccess.getScalarAccess().getIdParameterGroupIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scalar__IdAssignment_211387); 
             after(grammarAccess.getScalarAccess().getIdParameterGroupIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getScalarAccess().getIdParameterGroupCrossReference_2_0()); 

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
    // $ANTLR end "rule__Scalar__IdAssignment_2"


    // $ANTLR start "rule__InRange__ParameterAssignment_0"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5472:1: rule__InRange__ParameterAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InRange__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5476:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5477:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5477:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5478:1: ( RULE_ID )
            {
             before(grammarAccess.getInRangeAccess().getParameterParameterCrossReference_0_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5479:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5480:1: RULE_ID
            {
             before(grammarAccess.getInRangeAccess().getParameterParameterIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__InRange__ParameterAssignment_011426); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5491:1: rule__InRange__RangeAssignment_2 : ( ruleValueRange ) ;
    public final void rule__InRange__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5495:1: ( ( ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5496:1: ( ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5496:1: ( ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5497:1: ruleValueRange
            {
             before(grammarAccess.getInRangeAccess().getRangeValueRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_rule__InRange__RangeAssignment_211461);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5506:1: rule__Integer__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Integer__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5510:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5511:1: ( ruleEInt )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5511:1: ( ruleEInt )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5512:1: ruleEInt
            {
             before(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment11492);
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


    // $ANTLR start "rule__Double__ValueAssignment"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5521:1: rule__Double__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__Double__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5525:1: ( ( ruleEDouble ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5526:1: ( ruleEDouble )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5526:1: ( ruleEDouble )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5527:1: ruleEDouble
            {
             before(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Double__ValueAssignment11523);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_0()); 

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
    // $ANTLR end "rule__Double__ValueAssignment"


    // $ANTLR start "rule__Boolean__ValueAssignment"
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5536:1: rule__Boolean__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5540:1: ( ( ruleEBoolean ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5541:1: ( ruleEBoolean )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5541:1: ( ruleEBoolean )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5542:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment11554);
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5551:1: rule__String0__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__String0__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5555:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5556:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5556:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5557:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__String0__ValueAssignment11585); 
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
    // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5566:1: rule__Identifier__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Identifier__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5570:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5571:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5571:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5572:1: ( RULE_ID )
            {
             before(grammarAccess.getIdentifierAccess().getIdParameterCrossReference_0()); 
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5573:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.xtext.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5574:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment11620); 
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\3\uffff\1\12\1\13\7\uffff";
    static final String DFA4_minS =
        "\1\4\2\uffff\2\13\7\uffff";
    static final String DFA4_maxS =
        "\1\57\2\uffff\2\60\7\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\11\1\3\1\10\1\4";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\3\1\7\11\uffff\2\6\7\uffff\1\1\2\uffff\1\1\3\2\11\uffff"+
            "\1\10\5\uffff\1\5",
            "",
            "",
            "\3\12\4\uffff\12\12\5\uffff\10\12\1\uffff\1\12\1\uffff\2\12"+
            "\1\11\1\uffff\1\12",
            "\3\13\4\uffff\12\13\5\uffff\10\13\1\uffff\1\13\1\uffff\2\13"+
            "\1\uffff\1\5\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1012:1: rule__Primitive__Alternatives : ( ( ruleUnary ) | ( ruleScalar ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_8__0 ) ) );";
        }
    }
 

    
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
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctive_in_ruleExpression514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctive_in_entryRuleDisjunctive540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisjunctive547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__0_in_ruleDisjunctive573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_entryRuleConjunctive600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConjunctive607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__0_in_ruleConjunctive633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquality667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_entryRuleComparative720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparative727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__0_in_ruleComparative753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_entryRuleAdditive780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditive787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__0_in_ruleAdditive813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_entryRuleMultiplicative840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicative847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__0_in_ruleMultiplicative873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitive907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnary967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__0_in_ruleUnary993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalar_in_entryRuleScalar1020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScalar1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__0_in_ruleScalar1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_entryRuleInRange1082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInRange1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__0_in_ruleInRange1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble1202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDouble1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Double__ValueAssignment_in_ruleDouble1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__ValueAssignment_in_ruleString01355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDisjunctiveOperator1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleConjunctiveOperator1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditiveOperator__Alternatives_in_ruleAdditiveOperator1781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicativeOperator__Alternatives_in_ruleMultiplicativeOperator1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScalarOperator__Alternatives_in_ruleScalarOperator1889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterGroup_in_rule__AbstractParameter__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__AbstractParameter__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__MandatoryAssignment_3_0_0_in_rule__Parameter__Alternatives_3_01973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Parameter__Alternatives_3_01992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerated_in_rule__ValueRange__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBounded_in_rule__ValueRange__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_rule__Primitive__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalar_in_rule__Primitive__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_rule__Primitive__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__Primitive__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_rule__Primitive__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Primitive__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Primitive__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Primitive__Alternatives2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__0_in_rule__Primitive__Alternatives2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EDouble__Alternatives_3_02246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EDouble__Alternatives_3_02266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EBoolean__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__EBoolean__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EqualityOperator__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EqualityOperator__Alternatives2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ComparativeOperator__Alternatives2413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ComparativeOperator__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ComparativeOperator__Alternatives2455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ComparativeOperator__Alternatives2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AdditiveOperator__Alternatives2512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AdditiveOperator__Alternatives2533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MultiplicativeOperator__Alternatives2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MultiplicativeOperator__Alternatives2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__UnaryOperator__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__UnaryOperator__Alternatives2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ScalarOperator__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ScalarOperator__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ScalarOperator__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__02758 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__02761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Configurator__Group__0__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__12820 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__12823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__NameAssignment_1_in_rule__Configurator__Group__1__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__22880 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__22883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__DescriptionAssignment_2_in_rule__Configurator__Group__2__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__32941 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__32944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Configurator__Group__3__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__43003 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__43006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__ParametersAssignment_4_in_rule__Configurator__Group__4__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__53063 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__53066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl3093 = new BitSet(new long[]{0x0000009800000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__63124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Configurator__Group__6__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__03197 = new BitSet(new long[]{0x0000009800000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__03200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Configurator__Group_5__0__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__13262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__ParametersAssignment_5_1_in_rule__Configurator__Group_5__1__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__0__Impl_in_rule__ParameterGroup__Group__03323 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__1_in_rule__ParameterGroup__Group__03326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ParameterGroup__Group__0__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__1__Impl_in_rule__ParameterGroup__Group__13385 = new BitSet(new long[]{0x0000006200000040L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__2_in_rule__ParameterGroup__Group__13388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__NameAssignment_1_in_rule__ParameterGroup__Group__1__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__2__Impl_in_rule__ParameterGroup__Group__23445 = new BitSet(new long[]{0x0000006200000040L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__3_in_rule__ParameterGroup__Group__23448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__DescriptionAssignment_2_in_rule__ParameterGroup__Group__2__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__3__Impl_in_rule__ParameterGroup__Group__33506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3_in_rule__ParameterGroup__Group__3__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__0__Impl_in_rule__ParameterGroup__Group_3_0__03571 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__1_in_rule__ParameterGroup__Group_3_0__03574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ParameterGroup__Group_3_0__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__1__Impl_in_rule__ParameterGroup__Group_3_0__13633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__VisibilityAssignment_3_0_1_in_rule__ParameterGroup__Group_3_0__1__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__0__Impl_in_rule__ParameterGroup__Group_3_1__03694 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__1_in_rule__ParameterGroup__Group_3_1__03697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ParameterGroup__Group_3_1__0__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__1__Impl_in_rule__ParameterGroup__Group_3_1__13756 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__2_in_rule__ParameterGroup__Group_3_1__13759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ParameterGroup__Group_3_1__1__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__2__Impl_in_rule__ParameterGroup__Group_3_1__23818 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__3_in_rule__ParameterGroup__Group_3_1__23821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_2_in_rule__ParameterGroup__Group_3_1__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__3__Impl_in_rule__ParameterGroup__Group_3_1__33878 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__4_in_rule__ParameterGroup__Group_3_1__33881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__0_in_rule__ParameterGroup__Group_3_1__3__Impl3908 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__4__Impl_in_rule__ParameterGroup__Group_3_1__43939 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__5_in_rule__ParameterGroup__Group_3_1__43942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_1__4__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__5__Impl_in_rule__ParameterGroup__Group_3_1__54004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ParameterGroup__Group_3_1__5__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__0__Impl_in_rule__ParameterGroup__Group_3_1_3__04075 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__1_in_rule__ParameterGroup__Group_3_1_3__04078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_1_3__0__Impl4106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__1__Impl_in_rule__ParameterGroup__Group_3_1_3__14137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_3_1_in_rule__ParameterGroup__Group_3_1_3__1__Impl4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__0__Impl_in_rule__ParameterGroup__Group_3_2__04198 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__1_in_rule__ParameterGroup__Group_3_2__04201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ParameterGroup__Group_3_2__0__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__1__Impl_in_rule__ParameterGroup__Group_3_2__14260 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__2_in_rule__ParameterGroup__Group_3_2__14263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_1_in_rule__ParameterGroup__Group_3_2__1__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__2__Impl_in_rule__ParameterGroup__Group_3_2__24320 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__3_in_rule__ParameterGroup__Group_3_2__24323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__0_in_rule__ParameterGroup__Group_3_2__2__Impl4350 = new BitSet(new long[]{0x0000009800000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__3__Impl_in_rule__ParameterGroup__Group_3_2__34381 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__4_in_rule__ParameterGroup__Group_3_2__34384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_2__3__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__4__Impl_in_rule__ParameterGroup__Group_3_2__44446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ParameterGroup__Group_3_2__4__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__0__Impl_in_rule__ParameterGroup__Group_3_2_2__04515 = new BitSet(new long[]{0x0000009800000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__1_in_rule__ParameterGroup__Group_3_2_2__04518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_2_2__0__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__1__Impl_in_rule__ParameterGroup__Group_3_2_2__14580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_2_1_in_rule__ParameterGroup__Group_3_2_2__1__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04641 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Parameter__Group__0__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14703 = new BitSet(new long[]{0x0001016000002040L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24763 = new BitSet(new long[]{0x0001016000002040L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_2_in_rule__Parameter__Group__2__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3_in_rule__Parameter__Group__3__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__0__Impl_in_rule__Parameter__Group_3_1__04889 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__1_in_rule__Parameter__Group_3_1__04892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Parameter__Group_3_1__0__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__1__Impl_in_rule__Parameter__Group_3_1__14951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__VisibilityAssignment_3_1_1_in_rule__Parameter__Group_3_1__1__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__05012 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__05015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Parameter__Group_3_2__0__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__15074 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__2_in_rule__Parameter__Group_3_2__15077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter__Group_3_2__1__Impl5105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__2__Impl_in_rule__Parameter__Group_3_2__25136 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__3_in_rule__Parameter__Group_3_2__25139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_2_in_rule__Parameter__Group_3_2__2__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__3__Impl_in_rule__Parameter__Group_3_2__35196 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__4_in_rule__Parameter__Group_3_2__35199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__0_in_rule__Parameter__Group_3_2__3__Impl5226 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__4__Impl_in_rule__Parameter__Group_3_2__45257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Parameter__Group_3_2__4__Impl5285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__0__Impl_in_rule__Parameter__Group_3_2_3__05326 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__1_in_rule__Parameter__Group_3_2_3__05329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Parameter__Group_3_2_3__0__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__1__Impl_in_rule__Parameter__Group_3_2_3__15388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_3_1_in_rule__Parameter__Group_3_2_3__1__Impl5415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__0__Impl_in_rule__Parameter__Group_3_3__05449 = new BitSet(new long[]{0x00000A0000000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__1_in_rule__Parameter__Group_3_3__05452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Parameter__Group_3_3__0__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__1__Impl_in_rule__Parameter__Group_3_3__15511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ValueRangeAssignment_3_3_1_in_rule__Parameter__Group_3_3__1__Impl5538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__0__Impl_in_rule__Enumerated__Group__05572 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__1_in_rule__Enumerated__Group__05575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Enumerated__Group__0__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__1__Impl_in_rule__Enumerated__Group__15634 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__2_in_rule__Enumerated__Group__15637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__ValuesAssignment_1_in_rule__Enumerated__Group__1__Impl5664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__2__Impl_in_rule__Enumerated__Group__25694 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__3_in_rule__Enumerated__Group__25697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__0_in_rule__Enumerated__Group__2__Impl5724 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__3__Impl_in_rule__Enumerated__Group__35755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Enumerated__Group__3__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__0__Impl_in_rule__Enumerated__Group_2__05822 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__1_in_rule__Enumerated__Group_2__05825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Enumerated__Group_2__0__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__1__Impl_in_rule__Enumerated__Group_2__15884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__ValuesAssignment_2_1_in_rule__Enumerated__Group_2__1__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__0__Impl_in_rule__Bounded__Group__05945 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Bounded__Group__1_in_rule__Bounded__Group__05948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Bounded__Group__0__Impl5976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__1__Impl_in_rule__Bounded__Group__16007 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Bounded__Group__2_in_rule__Bounded__Group__16010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__LowerBoundAssignment_1_in_rule__Bounded__Group__1__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__2__Impl_in_rule__Bounded__Group__26067 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Bounded__Group__3_in_rule__Bounded__Group__26070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Bounded__Group__2__Impl6098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__3__Impl_in_rule__Bounded__Group__36129 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Bounded__Group__4_in_rule__Bounded__Group__36132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__UpperBoundAssignment_3_in_rule__Bounded__Group__3__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__4__Impl_in_rule__Bounded__Group__46189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Bounded__Group__4__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__0__Impl_in_rule__Disjunctive__Group__06258 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__1_in_rule__Disjunctive__Group__06261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_rule__Disjunctive__Group__0__Impl6288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__1__Impl_in_rule__Disjunctive__Group__16317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__0_in_rule__Disjunctive__Group__1__Impl6344 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__0__Impl_in_rule__Disjunctive__Group_1__06379 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__1_in_rule__Disjunctive__Group_1__06382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__1__Impl_in_rule__Disjunctive__Group_1__16440 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__2_in_rule__Disjunctive__Group_1__16443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__OperatorAssignment_1_1_in_rule__Disjunctive__Group_1__1__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__2__Impl_in_rule__Disjunctive__Group_1__26500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__RightAssignment_1_2_in_rule__Disjunctive__Group_1__2__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__0__Impl_in_rule__Conjunctive__Group__06563 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__1_in_rule__Conjunctive__Group__06566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunctive__Group__0__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__1__Impl_in_rule__Conjunctive__Group__16622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__0_in_rule__Conjunctive__Group__1__Impl6649 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__0__Impl_in_rule__Conjunctive__Group_1__06684 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__1_in_rule__Conjunctive__Group_1__06687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__1__Impl_in_rule__Conjunctive__Group_1__16745 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__2_in_rule__Conjunctive__Group_1__16748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__OperatorAssignment_1_1_in_rule__Conjunctive__Group_1__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__2__Impl_in_rule__Conjunctive__Group_1__26805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__RightAssignment_1_2_in_rule__Conjunctive__Group_1__2__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06868 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_rule__Equality__Group__0__Impl6898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6954 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06989 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__17050 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__17053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl7080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__27110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl7137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__0__Impl_in_rule__Comparative__Group__07173 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Comparative__Group__1_in_rule__Comparative__Group__07176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_rule__Comparative__Group__0__Impl7203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__1__Impl_in_rule__Comparative__Group__17232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__0_in_rule__Comparative__Group__1__Impl7259 = new BitSet(new long[]{0x0000000000F00002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__0__Impl_in_rule__Comparative__Group_1__07294 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__1_in_rule__Comparative__Group_1__07297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__1__Impl_in_rule__Comparative__Group_1__17355 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__2_in_rule__Comparative__Group_1__17358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__OperatorAssignment_1_1_in_rule__Comparative__Group_1__1__Impl7385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__2__Impl_in_rule__Comparative__Group_1__27415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__RightAssignment_1_2_in_rule__Comparative__Group_1__2__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__0__Impl_in_rule__Additive__Group__07478 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Additive__Group__1_in_rule__Additive__Group__07481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_rule__Additive__Group__0__Impl7508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__1__Impl_in_rule__Additive__Group__17537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__0_in_rule__Additive__Group__1__Impl7564 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__0__Impl_in_rule__Additive__Group_1__07599 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__1_in_rule__Additive__Group_1__07602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__1__Impl_in_rule__Additive__Group_1__17660 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__2_in_rule__Additive__Group_1__17663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__OperatorAssignment_1_1_in_rule__Additive__Group_1__1__Impl7690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__2__Impl_in_rule__Additive__Group_1__27720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__RightAssignment_1_2_in_rule__Additive__Group_1__2__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__0__Impl_in_rule__Multiplicative__Group__07783 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__1_in_rule__Multiplicative__Group__07786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Multiplicative__Group__0__Impl7813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__1__Impl_in_rule__Multiplicative__Group__17842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__0_in_rule__Multiplicative__Group__1__Impl7869 = new BitSet(new long[]{0x000000000C000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__0__Impl_in_rule__Multiplicative__Group_1__07904 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__1_in_rule__Multiplicative__Group_1__07907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__1__Impl_in_rule__Multiplicative__Group_1__17965 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__2_in_rule__Multiplicative__Group_1__17968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__OperatorAssignment_1_1_in_rule__Multiplicative__Group_1__1__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__2__Impl_in_rule__Multiplicative__Group_1__28025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__RightAssignment_1_2_in_rule__Multiplicative__Group_1__2__Impl8052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__0__Impl_in_rule__Primitive__Group_8__08088 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__1_in_rule__Primitive__Group_8__08091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Primitive__Group_8__0__Impl8119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__1__Impl_in_rule__Primitive__Group_8__18150 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__2_in_rule__Primitive__Group_8__18153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Primitive__Group_8__1__Impl8180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__2__Impl_in_rule__Primitive__Group_8__28209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Primitive__Group_8__2__Impl8237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08274 = new BitSet(new long[]{0x00008200F2030070L});
        public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__OperatorAssignment_0_in_rule__Unary__Group__0__Impl8304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__InnerAssignment_1_in_rule__Unary__Group__1__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__0__Impl_in_rule__Scalar__Group__08395 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Scalar__Group__1_in_rule__Scalar__Group__08398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__OperatorAssignment_0_in_rule__Scalar__Group__0__Impl8425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__1__Impl_in_rule__Scalar__Group__18455 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Scalar__Group__2_in_rule__Scalar__Group__18458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Scalar__Group__1__Impl8486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__2__Impl_in_rule__Scalar__Group__28517 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Scalar__Group__3_in_rule__Scalar__Group__28520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__IdAssignment_2_in_rule__Scalar__Group__2__Impl8547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__3__Impl_in_rule__Scalar__Group__38577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Scalar__Group__3__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__0__Impl_in_rule__InRange__Group__08644 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__InRange__Group__1_in_rule__InRange__Group__08647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__ParameterAssignment_0_in_rule__InRange__Group__0__Impl8674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__1__Impl_in_rule__InRange__Group__18704 = new BitSet(new long[]{0x00000A0000000000L});
        public static final BitSet FOLLOW_rule__InRange__Group__2_in_rule__InRange__Group__18707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__InRange__Group__1__Impl8735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__2__Impl_in_rule__InRange__Group__28766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__RangeAssignment_2_in_rule__InRange__Group__2__Impl8793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__08829 = new BitSet(new long[]{0x0000800000000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__08832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl8860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__18891 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__18894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__EDouble__Group__1__Impl8922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__28953 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__28956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl8983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__0_in_rule__EDouble__Group__3__Impl9039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__0__Impl_in_rule__EDouble__Group_3__09078 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__1_in_rule__EDouble__Group_3__09081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_3_0_in_rule__EDouble__Group_3__0__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__1__Impl_in_rule__EDouble__Group_3__19138 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__2_in_rule__EDouble__Group_3__19141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__EDouble__Group_3__1__Impl9170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__2__Impl_in_rule__EDouble__Group_3__29203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_3__2__Impl9230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__0_in_rule__ParameterGroup__UnorderedGroup_39266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__09596 = new BitSet(new long[]{0x0000006200000042L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__1_in_rule__ParameterGroup__UnorderedGroup_3__09599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__19624 = new BitSet(new long[]{0x0000006200000042L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__2_in_rule__ParameterGroup__UnorderedGroup_3__19627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__29652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__0_in_rule__Parameter__UnorderedGroup_39682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Alternatives_3_0_in_rule__Parameter__UnorderedGroup_3__Impl9771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__0_in_rule__Parameter__UnorderedGroup_3__Impl9862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__UnorderedGroup_3__Impl9953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__0_in_rule__Parameter__UnorderedGroup_3__Impl10044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__010103 = new BitSet(new long[]{0x0001016000002042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__1_in_rule__Parameter__UnorderedGroup_3__010106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__110131 = new BitSet(new long[]{0x0001016000002042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__2_in_rule__Parameter__UnorderedGroup_3__110134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__210159 = new BitSet(new long[]{0x0001016000002042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__3_in_rule__Parameter__UnorderedGroup_3__210162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__310187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Configurator__NameAssignment_110223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Configurator__DescriptionAssignment_210254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_410285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_5_110316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterGroup__NameAssignment_110347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ParameterGroup__DescriptionAssignment_210378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterGroup__VisibilityAssignment_3_0_110409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterGroup__ConstraintsAssignment_3_1_210440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterGroup__ConstraintsAssignment_3_1_3_110471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_110502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_2_110533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_110564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_210595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Parameter__MandatoryAssignment_3_0_010631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__VisibilityAssignment_3_1_110670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__ConstraintsAssignment_3_2_210701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__ConstraintsAssignment_3_2_3_110732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueRange_in_rule__Parameter__ValueRangeAssignment_3_3_110763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_110794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_2_110825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Bounded__LowerBoundAssignment_110856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Bounded__UpperBoundAssignment_310887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctiveOperator_in_rule__Disjunctive__OperatorAssignment_1_110918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_rule__Disjunctive__RightAssignment_1_210949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctiveOperator_in_rule__Conjunctive__OperatorAssignment_1_110980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunctive__RightAssignment_1_211011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_111042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_rule__Equality__RightAssignment_1_211073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparativeOperator_in_rule__Comparative__OperatorAssignment_1_111104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_rule__Comparative__RightAssignment_1_211135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveOperator_in_rule__Additive__OperatorAssignment_1_111166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_rule__Additive__RightAssignment_1_211197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_rule__Multiplicative__OperatorAssignment_1_111228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Multiplicative__RightAssignment_1_211259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Unary__OperatorAssignment_011290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Unary__InnerAssignment_111321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalarOperator_in_rule__Scalar__OperatorAssignment_011352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scalar__IdAssignment_211387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__InRange__ParameterAssignment_011426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueRange_in_rule__InRange__RangeAssignment_211461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment11492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Double__ValueAssignment11523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment11554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__String0__ValueAssignment11585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment11620 = new BitSet(new long[]{0x0000000000000002L});
    }


}