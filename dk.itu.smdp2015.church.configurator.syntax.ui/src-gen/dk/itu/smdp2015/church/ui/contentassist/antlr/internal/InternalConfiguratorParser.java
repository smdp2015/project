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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'optional'", "'E'", "'e'", "'true'", "'false'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'sum'", "'min'", "'max'", "'configurator'", "'{'", "'}'", "','", "'group'", "'visible-if'", "'constraints'", "'parameter'", "'values'", "'('", "')'", "'['", "';'", "']'", "'description'", "'in'", "'.'", "'mandatory'"
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
    public static final int T__49=49;
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:293:1: ruleExpression : ( ruleDisjunctive ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:297:2: ( ( ruleDisjunctive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:298:1: ( ruleDisjunctive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:298:1: ( ruleDisjunctive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:299:1: ruleDisjunctive
            {
             before(grammarAccess.getExpressionAccess().getDisjunctiveParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctive_in_ruleExpression574);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:312:1: entryRuleDisjunctive : ruleDisjunctive EOF ;
    public final void entryRuleDisjunctive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:313:1: ( ruleDisjunctive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:314:1: ruleDisjunctive EOF
            {
             before(grammarAccess.getDisjunctiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctive_in_entryRuleDisjunctive600);
            ruleDisjunctive();

            state._fsp--;

             after(grammarAccess.getDisjunctiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisjunctive607); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:321:1: ruleDisjunctive : ( ( rule__Disjunctive__Group__0 ) ) ;
    public final void ruleDisjunctive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:325:2: ( ( ( rule__Disjunctive__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:326:1: ( ( rule__Disjunctive__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:326:1: ( ( rule__Disjunctive__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:327:1: ( rule__Disjunctive__Group__0 )
            {
             before(grammarAccess.getDisjunctiveAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:328:1: ( rule__Disjunctive__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:328:2: rule__Disjunctive__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__0_in_ruleDisjunctive633);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:340:1: entryRuleConjunctive : ruleConjunctive EOF ;
    public final void entryRuleConjunctive() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:341:1: ( ruleConjunctive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:342:1: ruleConjunctive EOF
            {
             before(grammarAccess.getConjunctiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_entryRuleConjunctive660);
            ruleConjunctive();

            state._fsp--;

             after(grammarAccess.getConjunctiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConjunctive667); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:349:1: ruleConjunctive : ( ( rule__Conjunctive__Group__0 ) ) ;
    public final void ruleConjunctive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:353:2: ( ( ( rule__Conjunctive__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:354:1: ( ( rule__Conjunctive__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:354:1: ( ( rule__Conjunctive__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:355:1: ( rule__Conjunctive__Group__0 )
            {
             before(grammarAccess.getConjunctiveAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:356:1: ( rule__Conjunctive__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:356:2: rule__Conjunctive__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__0_in_ruleConjunctive693);
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


    // $ANTLR start "entryRuleScalar"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:536:1: entryRuleScalar : ruleScalar EOF ;
    public final void entryRuleScalar() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:537:1: ( ruleScalar EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:538:1: ruleScalar EOF
            {
             before(grammarAccess.getScalarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScalar_in_entryRuleScalar1080);
            ruleScalar();

            state._fsp--;

             after(grammarAccess.getScalarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScalar1087); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:545:1: ruleScalar : ( ( rule__Scalar__Group__0 ) ) ;
    public final void ruleScalar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:549:2: ( ( ( rule__Scalar__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:550:1: ( ( rule__Scalar__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:550:1: ( ( rule__Scalar__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:551:1: ( rule__Scalar__Group__0 )
            {
             before(grammarAccess.getScalarAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:552:1: ( rule__Scalar__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:552:2: rule__Scalar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__0_in_ruleScalar1113);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:566:1: entryRuleInRange : ruleInRange EOF ;
    public final void entryRuleInRange() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:567:1: ( ruleInRange EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:568:1: ruleInRange EOF
            {
             before(grammarAccess.getInRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInRange_in_entryRuleInRange1142);
            ruleInRange();

            state._fsp--;

             after(grammarAccess.getInRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInRange1149); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:575:1: ruleInRange : ( ( rule__InRange__Group__0 ) ) ;
    public final void ruleInRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:579:2: ( ( ( rule__InRange__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:580:1: ( ( rule__InRange__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:580:1: ( ( rule__InRange__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:581:1: ( rule__InRange__Group__0 )
            {
             before(grammarAccess.getInRangeAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:582:1: ( rule__InRange__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:582:2: rule__InRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__0_in_ruleInRange1175);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:594:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:595:1: ( ruleInteger EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:596:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1202);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1209); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:603:1: ruleInteger : ( ( rule__Integer__ValueAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:607:2: ( ( ( rule__Integer__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:608:1: ( ( rule__Integer__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:608:1: ( ( rule__Integer__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:609:1: ( rule__Integer__ValueAssignment )
            {
             before(grammarAccess.getIntegerAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:610:1: ( rule__Integer__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:610:2: rule__Integer__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger1235);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:622:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:623:1: ( ruleDouble EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:624:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_entryRuleDouble1262);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDouble1269); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:631:1: ruleDouble : ( ( rule__Double__ValueAssignment ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:635:2: ( ( ( rule__Double__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:636:1: ( ( rule__Double__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:636:1: ( ( rule__Double__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:637:1: ( rule__Double__ValueAssignment )
            {
             before(grammarAccess.getDoubleAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:638:1: ( rule__Double__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:638:2: rule__Double__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Double__ValueAssignment_in_ruleDouble1295);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:650:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:651:1: ( ruleBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:652:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1322);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1329); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:659:1: ruleBoolean : ( ( rule__Boolean__ValueAssignment ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:663:2: ( ( ( rule__Boolean__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:664:1: ( ( rule__Boolean__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:664:1: ( ( rule__Boolean__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:665:1: ( rule__Boolean__ValueAssignment )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:666:1: ( rule__Boolean__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:666:2: rule__Boolean__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1355);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:678:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:679:1: ( ruleString0 EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:680:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01382);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01389); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:687:1: ruleString0 : ( ( rule__String0__ValueAssignment ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:691:2: ( ( ( rule__String0__ValueAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:692:1: ( ( rule__String0__ValueAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:692:1: ( ( rule__String0__ValueAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:693:1: ( rule__String0__ValueAssignment )
            {
             before(grammarAccess.getString0Access().getValueAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:694:1: ( rule__String0__ValueAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:694:2: rule__String0__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__ValueAssignment_in_ruleString01415);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:706:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:707:1: ( ruleIdentifier EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:708:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier1442);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier1449); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:715:1: ruleIdentifier : ( ( rule__Identifier__IdAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:719:2: ( ( ( rule__Identifier__IdAssignment ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:720:1: ( ( rule__Identifier__IdAssignment ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:720:1: ( ( rule__Identifier__IdAssignment ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:721:1: ( rule__Identifier__IdAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:722:1: ( rule__Identifier__IdAssignment )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:722:2: rule__Identifier__IdAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1475);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:734:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:735:1: ( ruleEInt EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:736:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1502);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1509); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:743:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:747:2: ( ( RULE_INT ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:748:1: ( RULE_INT )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:748:1: ( RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:749:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1535); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:762:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:763:1: ( ruleEDouble EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:764:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1561);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1568); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:771:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:775:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:776:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:776:1: ( ( rule__EDouble__Group__0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:777:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:778:1: ( rule__EDouble__Group__0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:778:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1594);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:790:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:791:1: ( ruleEBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:792:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1621);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1628); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:799:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:803:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:804:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:804:1: ( ( rule__EBoolean__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:805:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:806:1: ( rule__EBoolean__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:806:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1654);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:819:1: ruleDisjunctiveOperator : ( ( 'or' ) ) ;
    public final void ruleDisjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:823:1: ( ( ( 'or' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:824:1: ( ( 'or' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:824:1: ( ( 'or' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:825:1: ( 'or' )
            {
             before(grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:826:1: ( 'or' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:826:3: 'or'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleDisjunctiveOperator1692); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:839:1: ruleConjunctiveOperator : ( ( 'and' ) ) ;
    public final void ruleConjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:843:1: ( ( ( 'and' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:844:1: ( ( 'and' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:844:1: ( ( 'and' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:845:1: ( 'and' )
            {
             before(grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:846:1: ( 'and' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:846:3: 'and'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleConjunctiveOperator1731); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:859:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:863:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:864:1: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:864:1: ( ( rule__EqualityOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:865:1: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:866:1: ( rule__EqualityOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:866:2: rule__EqualityOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1769);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:878:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:882:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:883:1: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:883:1: ( ( rule__ComparativeOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:884:1: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:885:1: ( rule__ComparativeOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:885:2: rule__ComparativeOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1805);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:897:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:901:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:902:1: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:902:1: ( ( rule__AdditiveOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:903:1: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:904:1: ( rule__AdditiveOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:904:2: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditiveOperator__Alternatives_in_ruleAdditiveOperator1841);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:916:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:920:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:921:1: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:921:1: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:922:1: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:923:1: ( rule__MultiplicativeOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:923:2: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicativeOperator__Alternatives_in_ruleMultiplicativeOperator1877);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:935:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:939:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:940:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:940:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:941:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:942:1: ( rule__UnaryOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:942:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1913);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:954:1: ruleScalarOperator : ( ( rule__ScalarOperator__Alternatives ) ) ;
    public final void ruleScalarOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:958:1: ( ( ( rule__ScalarOperator__Alternatives ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:959:1: ( ( rule__ScalarOperator__Alternatives ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:959:1: ( ( rule__ScalarOperator__Alternatives ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:960:1: ( rule__ScalarOperator__Alternatives )
            {
             before(grammarAccess.getScalarOperatorAccess().getAlternatives()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:961:1: ( rule__ScalarOperator__Alternatives )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:961:2: rule__ScalarOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScalarOperator__Alternatives_in_ruleScalarOperator1949);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:972:1: rule__AbstractParameter__Alternatives : ( ( ruleParameterGroup ) | ( ruleParameter ) );
    public final void rule__AbstractParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:976:1: ( ( ruleParameterGroup ) | ( ruleParameter ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:977:1: ( ruleParameterGroup )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:977:1: ( ruleParameterGroup )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:978:1: ruleParameterGroup
                    {
                     before(grammarAccess.getAbstractParameterAccess().getParameterGroupParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameterGroup_in_rule__AbstractParameter__Alternatives1984);
                    ruleParameterGroup();

                    state._fsp--;

                     after(grammarAccess.getAbstractParameterAccess().getParameterGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:983:6: ( ruleParameter )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:983:6: ( ruleParameter )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:984:1: ruleParameter
                    {
                     before(grammarAccess.getAbstractParameterAccess().getParameterParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__AbstractParameter__Alternatives2001);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:994:1: rule__Parameter__Alternatives_3_0 : ( ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) ) | ( 'optional' ) );
    public final void rule__Parameter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:998:1: ( ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) ) | ( 'optional' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:999:1: ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:999:1: ( ( rule__Parameter__MandatoryAssignment_3_0_0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1000:1: ( rule__Parameter__MandatoryAssignment_3_0_0 )
                    {
                     before(grammarAccess.getParameterAccess().getMandatoryAssignment_3_0_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1001:1: ( rule__Parameter__MandatoryAssignment_3_0_0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1001:2: rule__Parameter__MandatoryAssignment_3_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__MandatoryAssignment_3_0_0_in_rule__Parameter__Alternatives_3_02033);
                    rule__Parameter__MandatoryAssignment_3_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getMandatoryAssignment_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1005:6: ( 'optional' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1005:6: ( 'optional' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1006:1: 'optional'
                    {
                     before(grammarAccess.getParameterAccess().getOptionalKeyword_3_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Parameter__Alternatives_3_02052); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1018:1: rule__ValueRange__Alternatives : ( ( ruleEnumerated ) | ( ruleBounded ) );
    public final void rule__ValueRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1022:1: ( ( ruleEnumerated ) | ( ruleBounded ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1023:1: ( ruleEnumerated )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1023:1: ( ruleEnumerated )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1024:1: ruleEnumerated
                    {
                     before(grammarAccess.getValueRangeAccess().getEnumeratedParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerated_in_rule__ValueRange__Alternatives2086);
                    ruleEnumerated();

                    state._fsp--;

                     after(grammarAccess.getValueRangeAccess().getEnumeratedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1029:6: ( ruleBounded )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1029:6: ( ruleBounded )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1030:1: ruleBounded
                    {
                     before(grammarAccess.getValueRangeAccess().getBoundedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBounded_in_rule__ValueRange__Alternatives2103);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1040:1: rule__Primitive__Alternatives : ( ( ruleUnary ) | ( ruleScalar ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_8__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1044:1: ( ( ruleUnary ) | ( ruleScalar ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_8__0 ) ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1045:1: ( ruleUnary )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1045:1: ( ruleUnary )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1046:1: ruleUnary
                    {
                     before(grammarAccess.getPrimitiveAccess().getUnaryParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnary_in_rule__Primitive__Alternatives2135);
                    ruleUnary();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getUnaryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1051:6: ( ruleScalar )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1051:6: ( ruleScalar )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1052:1: ruleScalar
                    {
                     before(grammarAccess.getPrimitiveAccess().getScalarParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleScalar_in_rule__Primitive__Alternatives2152);
                    ruleScalar();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getScalarParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1057:6: ( ruleInRange )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1057:6: ( ruleInRange )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1058:1: ruleInRange
                    {
                     before(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInRange_in_rule__Primitive__Alternatives2169);
                    ruleInRange();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1063:6: ( ruleInteger )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1063:6: ( ruleInteger )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1064:1: ruleInteger
                    {
                     before(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__Primitive__Alternatives2186);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1069:6: ( ruleDouble )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1069:6: ( ruleDouble )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1070:1: ruleDouble
                    {
                     before(grammarAccess.getPrimitiveAccess().getDoubleParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_rule__Primitive__Alternatives2203);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getDoubleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1075:6: ( ruleBoolean )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1075:6: ( ruleBoolean )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1076:1: ruleBoolean
                    {
                     before(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Primitive__Alternatives2220);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1081:6: ( ruleString0 )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1081:6: ( ruleString0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1082:1: ruleString0
                    {
                     before(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Primitive__Alternatives2237);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1087:6: ( ruleIdentifier )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1087:6: ( ruleIdentifier )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1088:1: ruleIdentifier
                    {
                     before(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Primitive__Alternatives2254);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1093:6: ( ( rule__Primitive__Group_8__0 ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1093:6: ( ( rule__Primitive__Group_8__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1094:1: ( rule__Primitive__Group_8__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_8()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1095:1: ( rule__Primitive__Group_8__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1095:2: rule__Primitive__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__0_in_rule__Primitive__Alternatives2271);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1105:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1109:1: ( ( 'E' ) | ( 'e' ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1110:1: ( 'E' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1110:1: ( 'E' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1111:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__EDouble__Alternatives_3_02306); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1118:6: ( 'e' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1118:6: ( 'e' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1119:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__EDouble__Alternatives_3_02326); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1131:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1135:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1136:1: ( 'true' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1136:1: ( 'true' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1137:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__EBoolean__Alternatives2361); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1144:6: ( 'false' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1144:6: ( 'false' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1145:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__EBoolean__Alternatives2381); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1157:1: rule__EqualityOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1161:1: ( ( ( '==' ) ) | ( ( '!=' ) ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1162:1: ( ( '==' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1162:1: ( ( '==' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1163:1: ( '==' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1164:1: ( '==' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1164:3: '=='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__EqualityOperator__Alternatives2416); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1169:6: ( ( '!=' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1169:6: ( ( '!=' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1170:1: ( '!=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNotEqualEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1171:1: ( '!=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1171:3: '!='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__EqualityOperator__Alternatives2437); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1181:1: rule__ComparativeOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1185:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1186:1: ( ( '<' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1186:1: ( ( '<' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1187:1: ( '<' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1188:1: ( '<' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1188:3: '<'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ComparativeOperator__Alternatives2473); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1193:6: ( ( '<=' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1193:6: ( ( '<=' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1194:1: ( '<=' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessThanEqualEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1195:1: ( '<=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1195:3: '<='
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ComparativeOperator__Alternatives2494); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessThanEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1200:6: ( ( '>' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1200:6: ( ( '>' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1201:1: ( '>' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_2()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1202:1: ( '>' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1202:3: '>'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ComparativeOperator__Alternatives2515); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1207:6: ( ( '>=' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1207:6: ( ( '>=' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1208:1: ( '>=' )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterThanEqualEnumLiteralDeclaration_3()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1209:1: ( '>=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1209:3: '>='
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__ComparativeOperator__Alternatives2536); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1219:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1223:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1224:1: ( ( '+' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1224:1: ( ( '+' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1225:1: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1226:1: ( '+' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1226:3: '+'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__AdditiveOperator__Alternatives2572); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1231:6: ( ( '-' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1231:6: ( ( '-' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1232:1: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSubtractionEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1233:1: ( '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1233:3: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__AdditiveOperator__Alternatives2593); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1243:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1247:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1248:1: ( ( '*' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1248:1: ( ( '*' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1249:1: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1250:1: ( '*' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1250:3: '*'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__MultiplicativeOperator__Alternatives2629); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1255:6: ( ( '/' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1255:6: ( ( '/' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1256:1: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1257:1: ( '/' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1257:3: '/'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__MultiplicativeOperator__Alternatives2650); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1267:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1271:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1272:1: ( ( 'not' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1272:1: ( ( 'not' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1273:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1274:1: ( 'not' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1274:3: 'not'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__UnaryOperator__Alternatives2686); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1279:6: ( ( '-' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1279:6: ( ( '-' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1280:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNegationEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1281:1: ( '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1281:3: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__UnaryOperator__Alternatives2707); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1291:1: rule__ScalarOperator__Alternatives : ( ( ( 'sum' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) );
    public final void rule__ScalarOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1295:1: ( ( ( 'sum' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) )
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1296:1: ( ( 'sum' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1296:1: ( ( 'sum' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1297:1: ( 'sum' )
                    {
                     before(grammarAccess.getScalarOperatorAccess().getSumEnumLiteralDeclaration_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1298:1: ( 'sum' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1298:3: 'sum'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__ScalarOperator__Alternatives2743); 

                    }

                     after(grammarAccess.getScalarOperatorAccess().getSumEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1303:6: ( ( 'min' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1303:6: ( ( 'min' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1304:1: ( 'min' )
                    {
                     before(grammarAccess.getScalarOperatorAccess().getMinEnumLiteralDeclaration_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1305:1: ( 'min' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1305:3: 'min'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__ScalarOperator__Alternatives2764); 

                    }

                     after(grammarAccess.getScalarOperatorAccess().getMinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1310:6: ( ( 'max' ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1310:6: ( ( 'max' ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1311:1: ( 'max' )
                    {
                     before(grammarAccess.getScalarOperatorAccess().getMaxEnumLiteralDeclaration_2()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1312:1: ( 'max' )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1312:3: 'max'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__ScalarOperator__Alternatives2785); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1324:1: rule__Configurator__Group__0 : rule__Configurator__Group__0__Impl rule__Configurator__Group__1 ;
    public final void rule__Configurator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1328:1: ( rule__Configurator__Group__0__Impl rule__Configurator__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1329:2: rule__Configurator__Group__0__Impl rule__Configurator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__02818);
            rule__Configurator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__02821);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1336:1: rule__Configurator__Group__0__Impl : ( 'configurator' ) ;
    public final void rule__Configurator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1340:1: ( ( 'configurator' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1341:1: ( 'configurator' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1341:1: ( 'configurator' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1342:1: 'configurator'
            {
             before(grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Configurator__Group__0__Impl2849); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1355:1: rule__Configurator__Group__1 : rule__Configurator__Group__1__Impl rule__Configurator__Group__2 ;
    public final void rule__Configurator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1359:1: ( rule__Configurator__Group__1__Impl rule__Configurator__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1360:2: rule__Configurator__Group__1__Impl rule__Configurator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__12880);
            rule__Configurator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__12883);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1367:1: rule__Configurator__Group__1__Impl : ( ( rule__Configurator__NameAssignment_1 ) ) ;
    public final void rule__Configurator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1371:1: ( ( ( rule__Configurator__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1372:1: ( ( rule__Configurator__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1372:1: ( ( rule__Configurator__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1373:1: ( rule__Configurator__NameAssignment_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1374:1: ( rule__Configurator__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1374:2: rule__Configurator__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__NameAssignment_1_in_rule__Configurator__Group__1__Impl2910);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1384:1: rule__Configurator__Group__2 : rule__Configurator__Group__2__Impl rule__Configurator__Group__3 ;
    public final void rule__Configurator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1388:1: ( rule__Configurator__Group__2__Impl rule__Configurator__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1389:2: rule__Configurator__Group__2__Impl rule__Configurator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__22940);
            rule__Configurator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__22943);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1396:1: rule__Configurator__Group__2__Impl : ( ( rule__Configurator__DescriptionAssignment_2 )? ) ;
    public final void rule__Configurator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1400:1: ( ( ( rule__Configurator__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1401:1: ( ( rule__Configurator__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1401:1: ( ( rule__Configurator__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1402:1: ( rule__Configurator__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getConfiguratorAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1403:1: ( rule__Configurator__DescriptionAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1403:2: rule__Configurator__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configurator__DescriptionAssignment_2_in_rule__Configurator__Group__2__Impl2970);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1413:1: rule__Configurator__Group__3 : rule__Configurator__Group__3__Impl rule__Configurator__Group__4 ;
    public final void rule__Configurator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1417:1: ( rule__Configurator__Group__3__Impl rule__Configurator__Group__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1418:2: rule__Configurator__Group__3__Impl rule__Configurator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__33001);
            rule__Configurator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__33004);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1425:1: rule__Configurator__Group__3__Impl : ( '{' ) ;
    public final void rule__Configurator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1429:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1430:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1430:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1431:1: '{'
            {
             before(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Configurator__Group__3__Impl3032); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1444:1: rule__Configurator__Group__4 : rule__Configurator__Group__4__Impl rule__Configurator__Group__5 ;
    public final void rule__Configurator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1448:1: ( rule__Configurator__Group__4__Impl rule__Configurator__Group__5 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1449:2: rule__Configurator__Group__4__Impl rule__Configurator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__43063);
            rule__Configurator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__43066);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1456:1: rule__Configurator__Group__4__Impl : ( ( rule__Configurator__ParametersAssignment_4 ) ) ;
    public final void rule__Configurator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1460:1: ( ( ( rule__Configurator__ParametersAssignment_4 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1461:1: ( ( rule__Configurator__ParametersAssignment_4 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1461:1: ( ( rule__Configurator__ParametersAssignment_4 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1462:1: ( rule__Configurator__ParametersAssignment_4 )
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAssignment_4()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1463:1: ( rule__Configurator__ParametersAssignment_4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1463:2: rule__Configurator__ParametersAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__ParametersAssignment_4_in_rule__Configurator__Group__4__Impl3093);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1473:1: rule__Configurator__Group__5 : rule__Configurator__Group__5__Impl rule__Configurator__Group__6 ;
    public final void rule__Configurator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1477:1: ( rule__Configurator__Group__5__Impl rule__Configurator__Group__6 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1478:2: rule__Configurator__Group__5__Impl rule__Configurator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__53123);
            rule__Configurator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__53126);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1485:1: rule__Configurator__Group__5__Impl : ( ( rule__Configurator__Group_5__0 )* ) ;
    public final void rule__Configurator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1489:1: ( ( ( rule__Configurator__Group_5__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1490:1: ( ( rule__Configurator__Group_5__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1490:1: ( ( rule__Configurator__Group_5__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1491:1: ( rule__Configurator__Group_5__0 )*
            {
             before(grammarAccess.getConfiguratorAccess().getGroup_5()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1492:1: ( rule__Configurator__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=36)||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1492:2: rule__Configurator__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl3153);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1502:1: rule__Configurator__Group__6 : rule__Configurator__Group__6__Impl ;
    public final void rule__Configurator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1506:1: ( rule__Configurator__Group__6__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1507:2: rule__Configurator__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__63184);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1513:1: rule__Configurator__Group__6__Impl : ( '}' ) ;
    public final void rule__Configurator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1517:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1518:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1518:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1519:1: '}'
            {
             before(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Configurator__Group__6__Impl3212); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1546:1: rule__Configurator__Group_5__0 : rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 ;
    public final void rule__Configurator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1550:1: ( rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1551:2: rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__03257);
            rule__Configurator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__03260);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1558:1: rule__Configurator__Group_5__0__Impl : ( ( ',' )? ) ;
    public final void rule__Configurator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1562:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1563:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1563:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1564:1: ( ',' )?
            {
             before(grammarAccess.getConfiguratorAccess().getCommaKeyword_5_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1565:1: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1566:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Configurator__Group_5__0__Impl3289); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1577:1: rule__Configurator__Group_5__1 : rule__Configurator__Group_5__1__Impl ;
    public final void rule__Configurator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1581:1: ( rule__Configurator__Group_5__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1582:2: rule__Configurator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__13322);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1588:1: rule__Configurator__Group_5__1__Impl : ( ( rule__Configurator__ParametersAssignment_5_1 ) ) ;
    public final void rule__Configurator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1592:1: ( ( ( rule__Configurator__ParametersAssignment_5_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1593:1: ( ( rule__Configurator__ParametersAssignment_5_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1593:1: ( ( rule__Configurator__ParametersAssignment_5_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1594:1: ( rule__Configurator__ParametersAssignment_5_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAssignment_5_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1595:1: ( rule__Configurator__ParametersAssignment_5_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1595:2: rule__Configurator__ParametersAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__ParametersAssignment_5_1_in_rule__Configurator__Group_5__1__Impl3349);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1609:1: rule__ParameterGroup__Group__0 : rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1 ;
    public final void rule__ParameterGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1613:1: ( rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1614:2: rule__ParameterGroup__Group__0__Impl rule__ParameterGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__0__Impl_in_rule__ParameterGroup__Group__03383);
            rule__ParameterGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__1_in_rule__ParameterGroup__Group__03386);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1621:1: rule__ParameterGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__ParameterGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1625:1: ( ( 'group' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1626:1: ( 'group' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1626:1: ( 'group' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1627:1: 'group'
            {
             before(grammarAccess.getParameterGroupAccess().getGroupKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ParameterGroup__Group__0__Impl3414); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1640:1: rule__ParameterGroup__Group__1 : rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2 ;
    public final void rule__ParameterGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1644:1: ( rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1645:2: rule__ParameterGroup__Group__1__Impl rule__ParameterGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__1__Impl_in_rule__ParameterGroup__Group__13445);
            rule__ParameterGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__2_in_rule__ParameterGroup__Group__13448);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1652:1: rule__ParameterGroup__Group__1__Impl : ( ( rule__ParameterGroup__NameAssignment_1 ) ) ;
    public final void rule__ParameterGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1656:1: ( ( ( rule__ParameterGroup__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1657:1: ( ( rule__ParameterGroup__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1657:1: ( ( rule__ParameterGroup__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1658:1: ( rule__ParameterGroup__NameAssignment_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1659:1: ( rule__ParameterGroup__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1659:2: rule__ParameterGroup__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__NameAssignment_1_in_rule__ParameterGroup__Group__1__Impl3475);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1669:1: rule__ParameterGroup__Group__2 : rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3 ;
    public final void rule__ParameterGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1673:1: ( rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1674:2: rule__ParameterGroup__Group__2__Impl rule__ParameterGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__2__Impl_in_rule__ParameterGroup__Group__23505);
            rule__ParameterGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__3_in_rule__ParameterGroup__Group__23508);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1681:1: rule__ParameterGroup__Group__2__Impl : ( ( rule__ParameterGroup__DescriptionAssignment_2 )? ) ;
    public final void rule__ParameterGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1685:1: ( ( ( rule__ParameterGroup__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1686:1: ( ( rule__ParameterGroup__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1686:1: ( ( rule__ParameterGroup__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1687:1: ( rule__ParameterGroup__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getParameterGroupAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1688:1: ( rule__ParameterGroup__DescriptionAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1688:2: rule__ParameterGroup__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__DescriptionAssignment_2_in_rule__ParameterGroup__Group__2__Impl3535);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1698:1: rule__ParameterGroup__Group__3 : rule__ParameterGroup__Group__3__Impl ;
    public final void rule__ParameterGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1702:1: ( rule__ParameterGroup__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1703:2: rule__ParameterGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group__3__Impl_in_rule__ParameterGroup__Group__33566);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1709:1: rule__ParameterGroup__Group__3__Impl : ( ( rule__ParameterGroup__UnorderedGroup_3 ) ) ;
    public final void rule__ParameterGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1713:1: ( ( ( rule__ParameterGroup__UnorderedGroup_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1714:1: ( ( rule__ParameterGroup__UnorderedGroup_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1714:1: ( ( rule__ParameterGroup__UnorderedGroup_3 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1715:1: ( rule__ParameterGroup__UnorderedGroup_3 )
            {
             before(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1716:1: ( rule__ParameterGroup__UnorderedGroup_3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1716:2: rule__ParameterGroup__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3_in_rule__ParameterGroup__Group__3__Impl3593);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1734:1: rule__ParameterGroup__Group_3_0__0 : rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1 ;
    public final void rule__ParameterGroup__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1738:1: ( rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1739:2: rule__ParameterGroup__Group_3_0__0__Impl rule__ParameterGroup__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__0__Impl_in_rule__ParameterGroup__Group_3_0__03631);
            rule__ParameterGroup__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__1_in_rule__ParameterGroup__Group_3_0__03634);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1746:1: rule__ParameterGroup__Group_3_0__0__Impl : ( 'visible-if' ) ;
    public final void rule__ParameterGroup__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1750:1: ( ( 'visible-if' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1751:1: ( 'visible-if' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1751:1: ( 'visible-if' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1752:1: 'visible-if'
            {
             before(grammarAccess.getParameterGroupAccess().getVisibleIfKeyword_3_0_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ParameterGroup__Group_3_0__0__Impl3662); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1765:1: rule__ParameterGroup__Group_3_0__1 : rule__ParameterGroup__Group_3_0__1__Impl ;
    public final void rule__ParameterGroup__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1769:1: ( rule__ParameterGroup__Group_3_0__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1770:2: rule__ParameterGroup__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__1__Impl_in_rule__ParameterGroup__Group_3_0__13693);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1776:1: rule__ParameterGroup__Group_3_0__1__Impl : ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1780:1: ( ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1781:1: ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1781:1: ( ( rule__ParameterGroup__VisibilityAssignment_3_0_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1782:1: ( rule__ParameterGroup__VisibilityAssignment_3_0_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getVisibilityAssignment_3_0_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1783:1: ( rule__ParameterGroup__VisibilityAssignment_3_0_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1783:2: rule__ParameterGroup__VisibilityAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__VisibilityAssignment_3_0_1_in_rule__ParameterGroup__Group_3_0__1__Impl3720);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1797:1: rule__ParameterGroup__Group_3_1__0 : rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1 ;
    public final void rule__ParameterGroup__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1801:1: ( rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1802:2: rule__ParameterGroup__Group_3_1__0__Impl rule__ParameterGroup__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__0__Impl_in_rule__ParameterGroup__Group_3_1__03754);
            rule__ParameterGroup__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__1_in_rule__ParameterGroup__Group_3_1__03757);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1809:1: rule__ParameterGroup__Group_3_1__0__Impl : ( 'constraints' ) ;
    public final void rule__ParameterGroup__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1813:1: ( ( 'constraints' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1814:1: ( 'constraints' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1814:1: ( 'constraints' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1815:1: 'constraints'
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsKeyword_3_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ParameterGroup__Group_3_1__0__Impl3785); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1828:1: rule__ParameterGroup__Group_3_1__1 : rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2 ;
    public final void rule__ParameterGroup__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1832:1: ( rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1833:2: rule__ParameterGroup__Group_3_1__1__Impl rule__ParameterGroup__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__1__Impl_in_rule__ParameterGroup__Group_3_1__13816);
            rule__ParameterGroup__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__2_in_rule__ParameterGroup__Group_3_1__13819);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1840:1: rule__ParameterGroup__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__ParameterGroup__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1844:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1845:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1845:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1846:1: '{'
            {
             before(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ParameterGroup__Group_3_1__1__Impl3847); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1859:1: rule__ParameterGroup__Group_3_1__2 : rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3 ;
    public final void rule__ParameterGroup__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1863:1: ( rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1864:2: rule__ParameterGroup__Group_3_1__2__Impl rule__ParameterGroup__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__2__Impl_in_rule__ParameterGroup__Group_3_1__23878);
            rule__ParameterGroup__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__3_in_rule__ParameterGroup__Group_3_1__23881);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1871:1: rule__ParameterGroup__Group_3_1__2__Impl : ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) ) ;
    public final void rule__ParameterGroup__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1875:1: ( ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1876:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1876:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1877:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 )
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1878:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1878:2: rule__ParameterGroup__ConstraintsAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_2_in_rule__ParameterGroup__Group_3_1__2__Impl3908);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1888:1: rule__ParameterGroup__Group_3_1__3 : rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4 ;
    public final void rule__ParameterGroup__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1892:1: ( rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1893:2: rule__ParameterGroup__Group_3_1__3__Impl rule__ParameterGroup__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__3__Impl_in_rule__ParameterGroup__Group_3_1__33938);
            rule__ParameterGroup__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__4_in_rule__ParameterGroup__Group_3_1__33941);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1900:1: rule__ParameterGroup__Group_3_1__3__Impl : ( ( rule__ParameterGroup__Group_3_1_3__0 )* ) ;
    public final void rule__ParameterGroup__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1904:1: ( ( ( rule__ParameterGroup__Group_3_1_3__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1905:1: ( ( rule__ParameterGroup__Group_3_1_3__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1905:1: ( ( rule__ParameterGroup__Group_3_1_3__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1906:1: ( rule__ParameterGroup__Group_3_1_3__0 )*
            {
             before(grammarAccess.getParameterGroupAccess().getGroup_3_1_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1907:1: ( rule__ParameterGroup__Group_3_1_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    int LA17_1 = input.LA(2);

                    if ( ((LA17_1>=RULE_INT && LA17_1<=RULE_STRING)||(LA17_1>=16 && LA17_1<=17)||LA17_1==25||(LA17_1>=28 && LA17_1<=31)||LA17_1==41||LA17_1==46||LA17_1==48) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1907:2: rule__ParameterGroup__Group_3_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__0_in_rule__ParameterGroup__Group_3_1__3__Impl3968);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1917:1: rule__ParameterGroup__Group_3_1__4 : rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5 ;
    public final void rule__ParameterGroup__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1921:1: ( rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1922:2: rule__ParameterGroup__Group_3_1__4__Impl rule__ParameterGroup__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__4__Impl_in_rule__ParameterGroup__Group_3_1__43999);
            rule__ParameterGroup__Group_3_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__5_in_rule__ParameterGroup__Group_3_1__44002);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1929:1: rule__ParameterGroup__Group_3_1__4__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1933:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1934:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1934:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1935:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_4()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1936:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1937:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_1__4__Impl4031); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1948:1: rule__ParameterGroup__Group_3_1__5 : rule__ParameterGroup__Group_3_1__5__Impl ;
    public final void rule__ParameterGroup__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1952:1: ( rule__ParameterGroup__Group_3_1__5__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1953:2: rule__ParameterGroup__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__5__Impl_in_rule__ParameterGroup__Group_3_1__54064);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1959:1: rule__ParameterGroup__Group_3_1__5__Impl : ( '}' ) ;
    public final void rule__ParameterGroup__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1963:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1964:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1964:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1965:1: '}'
            {
             before(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_1_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ParameterGroup__Group_3_1__5__Impl4092); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1990:1: rule__ParameterGroup__Group_3_1_3__0 : rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1 ;
    public final void rule__ParameterGroup__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1994:1: ( rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:1995:2: rule__ParameterGroup__Group_3_1_3__0__Impl rule__ParameterGroup__Group_3_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__0__Impl_in_rule__ParameterGroup__Group_3_1_3__04135);
            rule__ParameterGroup__Group_3_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__1_in_rule__ParameterGroup__Group_3_1_3__04138);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2002:1: rule__ParameterGroup__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__ParameterGroup__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2006:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2007:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2007:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2008:1: ','
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_1_3__0__Impl4166); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2021:1: rule__ParameterGroup__Group_3_1_3__1 : rule__ParameterGroup__Group_3_1_3__1__Impl ;
    public final void rule__ParameterGroup__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2025:1: ( rule__ParameterGroup__Group_3_1_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2026:2: rule__ParameterGroup__Group_3_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1_3__1__Impl_in_rule__ParameterGroup__Group_3_1_3__14197);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2032:1: rule__ParameterGroup__Group_3_1_3__1__Impl : ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2036:1: ( ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2037:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2037:1: ( ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2038:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2039:1: ( rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2039:2: rule__ParameterGroup__ConstraintsAssignment_3_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_3_1_in_rule__ParameterGroup__Group_3_1_3__1__Impl4224);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2053:1: rule__ParameterGroup__Group_3_2__0 : rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1 ;
    public final void rule__ParameterGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2057:1: ( rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2058:2: rule__ParameterGroup__Group_3_2__0__Impl rule__ParameterGroup__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__0__Impl_in_rule__ParameterGroup__Group_3_2__04258);
            rule__ParameterGroup__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__1_in_rule__ParameterGroup__Group_3_2__04261);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2065:1: rule__ParameterGroup__Group_3_2__0__Impl : ( '{' ) ;
    public final void rule__ParameterGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2069:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2070:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2070:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2071:1: '{'
            {
             before(grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ParameterGroup__Group_3_2__0__Impl4289); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2084:1: rule__ParameterGroup__Group_3_2__1 : rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2 ;
    public final void rule__ParameterGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2088:1: ( rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2089:2: rule__ParameterGroup__Group_3_2__1__Impl rule__ParameterGroup__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__1__Impl_in_rule__ParameterGroup__Group_3_2__14320);
            rule__ParameterGroup__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__2_in_rule__ParameterGroup__Group_3_2__14323);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2096:1: rule__ParameterGroup__Group_3_2__1__Impl : ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2100:1: ( ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2101:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2101:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2102:1: ( rule__ParameterGroup__ParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2103:1: ( rule__ParameterGroup__ParametersAssignment_3_2_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2103:2: rule__ParameterGroup__ParametersAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_1_in_rule__ParameterGroup__Group_3_2__1__Impl4350);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2113:1: rule__ParameterGroup__Group_3_2__2 : rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3 ;
    public final void rule__ParameterGroup__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2117:1: ( rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2118:2: rule__ParameterGroup__Group_3_2__2__Impl rule__ParameterGroup__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__2__Impl_in_rule__ParameterGroup__Group_3_2__24380);
            rule__ParameterGroup__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__3_in_rule__ParameterGroup__Group_3_2__24383);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2125:1: rule__ParameterGroup__Group_3_2__2__Impl : ( ( rule__ParameterGroup__Group_3_2_2__0 )* ) ;
    public final void rule__ParameterGroup__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2129:1: ( ( ( rule__ParameterGroup__Group_3_2_2__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2130:1: ( ( rule__ParameterGroup__Group_3_2_2__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2130:1: ( ( rule__ParameterGroup__Group_3_2_2__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2131:1: ( rule__ParameterGroup__Group_3_2_2__0 )*
            {
             before(grammarAccess.getParameterGroupAccess().getGroup_3_2_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2132:1: ( rule__ParameterGroup__Group_3_2_2__0 )*
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
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2132:2: rule__ParameterGroup__Group_3_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__0_in_rule__ParameterGroup__Group_3_2__2__Impl4410);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2142:1: rule__ParameterGroup__Group_3_2__3 : rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4 ;
    public final void rule__ParameterGroup__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2146:1: ( rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2147:2: rule__ParameterGroup__Group_3_2__3__Impl rule__ParameterGroup__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__3__Impl_in_rule__ParameterGroup__Group_3_2__34441);
            rule__ParameterGroup__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__4_in_rule__ParameterGroup__Group_3_2__34444);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2154:1: rule__ParameterGroup__Group_3_2__3__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2158:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2159:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2159:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2160:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2161:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2162:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_2__3__Impl4473); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2173:1: rule__ParameterGroup__Group_3_2__4 : rule__ParameterGroup__Group_3_2__4__Impl ;
    public final void rule__ParameterGroup__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2177:1: ( rule__ParameterGroup__Group_3_2__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2178:2: rule__ParameterGroup__Group_3_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__4__Impl_in_rule__ParameterGroup__Group_3_2__44506);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2184:1: rule__ParameterGroup__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__ParameterGroup__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2188:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2189:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2189:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2190:1: '}'
            {
             before(grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ParameterGroup__Group_3_2__4__Impl4534); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2213:1: rule__ParameterGroup__Group_3_2_2__0 : rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1 ;
    public final void rule__ParameterGroup__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2217:1: ( rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2218:2: rule__ParameterGroup__Group_3_2_2__0__Impl rule__ParameterGroup__Group_3_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__0__Impl_in_rule__ParameterGroup__Group_3_2_2__04575);
            rule__ParameterGroup__Group_3_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__1_in_rule__ParameterGroup__Group_3_2_2__04578);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2225:1: rule__ParameterGroup__Group_3_2_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterGroup__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2229:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2230:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2230:1: ( ( ',' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2231:1: ( ',' )?
            {
             before(grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_2_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2232:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2233:2: ','
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__ParameterGroup__Group_3_2_2__0__Impl4607); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2244:1: rule__ParameterGroup__Group_3_2_2__1 : rule__ParameterGroup__Group_3_2_2__1__Impl ;
    public final void rule__ParameterGroup__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2248:1: ( rule__ParameterGroup__Group_3_2_2__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2249:2: rule__ParameterGroup__Group_3_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2_2__1__Impl_in_rule__ParameterGroup__Group_3_2_2__14640);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2255:1: rule__ParameterGroup__Group_3_2_2__1__Impl : ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) ) ;
    public final void rule__ParameterGroup__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2259:1: ( ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2260:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2260:1: ( ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2261:1: ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 )
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2262:1: ( rule__ParameterGroup__ParametersAssignment_3_2_2_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2262:2: rule__ParameterGroup__ParametersAssignment_3_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_2_1_in_rule__ParameterGroup__Group_3_2_2__1__Impl4667);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2276:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2280:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2281:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04701);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04704);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2288:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2292:1: ( ( 'parameter' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2293:1: ( 'parameter' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2293:1: ( 'parameter' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2294:1: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Parameter__Group__0__Impl4732); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2307:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2311:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2312:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14763);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14766);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2319:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2323:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2324:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2324:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2325:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2326:1: ( rule__Parameter__NameAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2326:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4793);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2336:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2340:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2341:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24823);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24826);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2348:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__DescriptionAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2352:1: ( ( ( rule__Parameter__DescriptionAssignment_2 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2353:1: ( ( rule__Parameter__DescriptionAssignment_2 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2353:1: ( ( rule__Parameter__DescriptionAssignment_2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2354:1: ( rule__Parameter__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2355:1: ( rule__Parameter__DescriptionAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2355:2: rule__Parameter__DescriptionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__DescriptionAssignment_2_in_rule__Parameter__Group__2__Impl4853);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2365:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2369:1: ( rule__Parameter__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2370:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34884);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2376:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__UnorderedGroup_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2380:1: ( ( ( rule__Parameter__UnorderedGroup_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2381:1: ( ( rule__Parameter__UnorderedGroup_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2381:1: ( ( rule__Parameter__UnorderedGroup_3 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2382:1: ( rule__Parameter__UnorderedGroup_3 )
            {
             before(grammarAccess.getParameterAccess().getUnorderedGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2383:1: ( rule__Parameter__UnorderedGroup_3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2383:2: rule__Parameter__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3_in_rule__Parameter__Group__3__Impl4911);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2401:1: rule__Parameter__Group_3_1__0 : rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1 ;
    public final void rule__Parameter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2405:1: ( rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2406:2: rule__Parameter__Group_3_1__0__Impl rule__Parameter__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__0__Impl_in_rule__Parameter__Group_3_1__04949);
            rule__Parameter__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__1_in_rule__Parameter__Group_3_1__04952);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2413:1: rule__Parameter__Group_3_1__0__Impl : ( 'visible-if' ) ;
    public final void rule__Parameter__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2417:1: ( ( 'visible-if' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2418:1: ( 'visible-if' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2418:1: ( 'visible-if' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2419:1: 'visible-if'
            {
             before(grammarAccess.getParameterAccess().getVisibleIfKeyword_3_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Parameter__Group_3_1__0__Impl4980); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2432:1: rule__Parameter__Group_3_1__1 : rule__Parameter__Group_3_1__1__Impl ;
    public final void rule__Parameter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2436:1: ( rule__Parameter__Group_3_1__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2437:2: rule__Parameter__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__1__Impl_in_rule__Parameter__Group_3_1__15011);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2443:1: rule__Parameter__Group_3_1__1__Impl : ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) ) ;
    public final void rule__Parameter__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2447:1: ( ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2448:1: ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2448:1: ( ( rule__Parameter__VisibilityAssignment_3_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2449:1: ( rule__Parameter__VisibilityAssignment_3_1_1 )
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_3_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2450:1: ( rule__Parameter__VisibilityAssignment_3_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2450:2: rule__Parameter__VisibilityAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__VisibilityAssignment_3_1_1_in_rule__Parameter__Group_3_1__1__Impl5038);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2464:1: rule__Parameter__Group_3_2__0 : rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 ;
    public final void rule__Parameter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2468:1: ( rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2469:2: rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__05072);
            rule__Parameter__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__05075);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2476:1: rule__Parameter__Group_3_2__0__Impl : ( 'constraints' ) ;
    public final void rule__Parameter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2480:1: ( ( 'constraints' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2481:1: ( 'constraints' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2481:1: ( 'constraints' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2482:1: 'constraints'
            {
             before(grammarAccess.getParameterAccess().getConstraintsKeyword_3_2_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Parameter__Group_3_2__0__Impl5103); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2495:1: rule__Parameter__Group_3_2__1 : rule__Parameter__Group_3_2__1__Impl rule__Parameter__Group_3_2__2 ;
    public final void rule__Parameter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2499:1: ( rule__Parameter__Group_3_2__1__Impl rule__Parameter__Group_3_2__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2500:2: rule__Parameter__Group_3_2__1__Impl rule__Parameter__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__15134);
            rule__Parameter__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__2_in_rule__Parameter__Group_3_2__15137);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2507:1: rule__Parameter__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__Parameter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2511:1: ( ( '{' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2512:1: ( '{' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2512:1: ( '{' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2513:1: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter__Group_3_2__1__Impl5165); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2526:1: rule__Parameter__Group_3_2__2 : rule__Parameter__Group_3_2__2__Impl rule__Parameter__Group_3_2__3 ;
    public final void rule__Parameter__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2530:1: ( rule__Parameter__Group_3_2__2__Impl rule__Parameter__Group_3_2__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2531:2: rule__Parameter__Group_3_2__2__Impl rule__Parameter__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__2__Impl_in_rule__Parameter__Group_3_2__25196);
            rule__Parameter__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__3_in_rule__Parameter__Group_3_2__25199);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2538:1: rule__Parameter__Group_3_2__2__Impl : ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) ) ;
    public final void rule__Parameter__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2542:1: ( ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2543:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2543:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2544:1: ( rule__Parameter__ConstraintsAssignment_3_2_2 )
            {
             before(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2545:1: ( rule__Parameter__ConstraintsAssignment_3_2_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2545:2: rule__Parameter__ConstraintsAssignment_3_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_2_in_rule__Parameter__Group_3_2__2__Impl5226);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2555:1: rule__Parameter__Group_3_2__3 : rule__Parameter__Group_3_2__3__Impl rule__Parameter__Group_3_2__4 ;
    public final void rule__Parameter__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2559:1: ( rule__Parameter__Group_3_2__3__Impl rule__Parameter__Group_3_2__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2560:2: rule__Parameter__Group_3_2__3__Impl rule__Parameter__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__3__Impl_in_rule__Parameter__Group_3_2__35256);
            rule__Parameter__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__4_in_rule__Parameter__Group_3_2__35259);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2567:1: rule__Parameter__Group_3_2__3__Impl : ( ( rule__Parameter__Group_3_2_3__0 )* ) ;
    public final void rule__Parameter__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2571:1: ( ( ( rule__Parameter__Group_3_2_3__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2572:1: ( ( rule__Parameter__Group_3_2_3__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2572:1: ( ( rule__Parameter__Group_3_2_3__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2573:1: ( rule__Parameter__Group_3_2_3__0 )*
            {
             before(grammarAccess.getParameterAccess().getGroup_3_2_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2574:1: ( rule__Parameter__Group_3_2_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2574:2: rule__Parameter__Group_3_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__0_in_rule__Parameter__Group_3_2__3__Impl5286);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2584:1: rule__Parameter__Group_3_2__4 : rule__Parameter__Group_3_2__4__Impl ;
    public final void rule__Parameter__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2588:1: ( rule__Parameter__Group_3_2__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2589:2: rule__Parameter__Group_3_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__4__Impl_in_rule__Parameter__Group_3_2__45317);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2595:1: rule__Parameter__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__Parameter__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2599:1: ( ( '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2600:1: ( '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2600:1: ( '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2601:1: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Parameter__Group_3_2__4__Impl5345); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2624:1: rule__Parameter__Group_3_2_3__0 : rule__Parameter__Group_3_2_3__0__Impl rule__Parameter__Group_3_2_3__1 ;
    public final void rule__Parameter__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2628:1: ( rule__Parameter__Group_3_2_3__0__Impl rule__Parameter__Group_3_2_3__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2629:2: rule__Parameter__Group_3_2_3__0__Impl rule__Parameter__Group_3_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__0__Impl_in_rule__Parameter__Group_3_2_3__05386);
            rule__Parameter__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__1_in_rule__Parameter__Group_3_2_3__05389);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2636:1: rule__Parameter__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__Parameter__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2640:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2641:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2641:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2642:1: ','
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_3_2_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Parameter__Group_3_2_3__0__Impl5417); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2655:1: rule__Parameter__Group_3_2_3__1 : rule__Parameter__Group_3_2_3__1__Impl ;
    public final void rule__Parameter__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2659:1: ( rule__Parameter__Group_3_2_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2660:2: rule__Parameter__Group_3_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2_3__1__Impl_in_rule__Parameter__Group_3_2_3__15448);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2666:1: rule__Parameter__Group_3_2_3__1__Impl : ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) ) ;
    public final void rule__Parameter__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2670:1: ( ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2671:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2671:1: ( ( rule__Parameter__ConstraintsAssignment_3_2_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2672:1: ( rule__Parameter__ConstraintsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2673:1: ( rule__Parameter__ConstraintsAssignment_3_2_3_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2673:2: rule__Parameter__ConstraintsAssignment_3_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_3_1_in_rule__Parameter__Group_3_2_3__1__Impl5475);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2687:1: rule__Parameter__Group_3_3__0 : rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1 ;
    public final void rule__Parameter__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2691:1: ( rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2692:2: rule__Parameter__Group_3_3__0__Impl rule__Parameter__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__0__Impl_in_rule__Parameter__Group_3_3__05509);
            rule__Parameter__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__1_in_rule__Parameter__Group_3_3__05512);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2699:1: rule__Parameter__Group_3_3__0__Impl : ( 'values' ) ;
    public final void rule__Parameter__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2703:1: ( ( 'values' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2704:1: ( 'values' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2704:1: ( 'values' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2705:1: 'values'
            {
             before(grammarAccess.getParameterAccess().getValuesKeyword_3_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Parameter__Group_3_3__0__Impl5540); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2718:1: rule__Parameter__Group_3_3__1 : rule__Parameter__Group_3_3__1__Impl ;
    public final void rule__Parameter__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2722:1: ( rule__Parameter__Group_3_3__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2723:2: rule__Parameter__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__1__Impl_in_rule__Parameter__Group_3_3__15571);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2729:1: rule__Parameter__Group_3_3__1__Impl : ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) ) ;
    public final void rule__Parameter__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2733:1: ( ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2734:1: ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2734:1: ( ( rule__Parameter__ValueRangeAssignment_3_3_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2735:1: ( rule__Parameter__ValueRangeAssignment_3_3_1 )
            {
             before(grammarAccess.getParameterAccess().getValueRangeAssignment_3_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2736:1: ( rule__Parameter__ValueRangeAssignment_3_3_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2736:2: rule__Parameter__ValueRangeAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ValueRangeAssignment_3_3_1_in_rule__Parameter__Group_3_3__1__Impl5598);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2750:1: rule__Enumerated__Group__0 : rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1 ;
    public final void rule__Enumerated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2754:1: ( rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2755:2: rule__Enumerated__Group__0__Impl rule__Enumerated__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__0__Impl_in_rule__Enumerated__Group__05632);
            rule__Enumerated__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__1_in_rule__Enumerated__Group__05635);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2762:1: rule__Enumerated__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2766:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2767:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2767:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2768:1: '('
            {
             before(grammarAccess.getEnumeratedAccess().getLeftParenthesisKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Enumerated__Group__0__Impl5663); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2781:1: rule__Enumerated__Group__1 : rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2 ;
    public final void rule__Enumerated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2785:1: ( rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2786:2: rule__Enumerated__Group__1__Impl rule__Enumerated__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__1__Impl_in_rule__Enumerated__Group__15694);
            rule__Enumerated__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__2_in_rule__Enumerated__Group__15697);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2793:1: rule__Enumerated__Group__1__Impl : ( ( rule__Enumerated__ValuesAssignment_1 ) ) ;
    public final void rule__Enumerated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2797:1: ( ( ( rule__Enumerated__ValuesAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2798:1: ( ( rule__Enumerated__ValuesAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2798:1: ( ( rule__Enumerated__ValuesAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2799:1: ( rule__Enumerated__ValuesAssignment_1 )
            {
             before(grammarAccess.getEnumeratedAccess().getValuesAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2800:1: ( rule__Enumerated__ValuesAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2800:2: rule__Enumerated__ValuesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__ValuesAssignment_1_in_rule__Enumerated__Group__1__Impl5724);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2810:1: rule__Enumerated__Group__2 : rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3 ;
    public final void rule__Enumerated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2814:1: ( rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2815:2: rule__Enumerated__Group__2__Impl rule__Enumerated__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__2__Impl_in_rule__Enumerated__Group__25754);
            rule__Enumerated__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__3_in_rule__Enumerated__Group__25757);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2822:1: rule__Enumerated__Group__2__Impl : ( ( rule__Enumerated__Group_2__0 )* ) ;
    public final void rule__Enumerated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2826:1: ( ( ( rule__Enumerated__Group_2__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2827:1: ( ( rule__Enumerated__Group_2__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2827:1: ( ( rule__Enumerated__Group_2__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2828:1: ( rule__Enumerated__Group_2__0 )*
            {
             before(grammarAccess.getEnumeratedAccess().getGroup_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2829:1: ( rule__Enumerated__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2829:2: rule__Enumerated__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__0_in_rule__Enumerated__Group__2__Impl5784);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2839:1: rule__Enumerated__Group__3 : rule__Enumerated__Group__3__Impl ;
    public final void rule__Enumerated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2843:1: ( rule__Enumerated__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2844:2: rule__Enumerated__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group__3__Impl_in_rule__Enumerated__Group__35815);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2850:1: rule__Enumerated__Group__3__Impl : ( ')' ) ;
    public final void rule__Enumerated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2854:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2855:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2855:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2856:1: ')'
            {
             before(grammarAccess.getEnumeratedAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Enumerated__Group__3__Impl5843); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2877:1: rule__Enumerated__Group_2__0 : rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1 ;
    public final void rule__Enumerated__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2881:1: ( rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2882:2: rule__Enumerated__Group_2__0__Impl rule__Enumerated__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__0__Impl_in_rule__Enumerated__Group_2__05882);
            rule__Enumerated__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__1_in_rule__Enumerated__Group_2__05885);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2889:1: rule__Enumerated__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enumerated__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2893:1: ( ( ',' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2894:1: ( ',' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2894:1: ( ',' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2895:1: ','
            {
             before(grammarAccess.getEnumeratedAccess().getCommaKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Enumerated__Group_2__0__Impl5913); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2908:1: rule__Enumerated__Group_2__1 : rule__Enumerated__Group_2__1__Impl ;
    public final void rule__Enumerated__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2912:1: ( rule__Enumerated__Group_2__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2913:2: rule__Enumerated__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__Group_2__1__Impl_in_rule__Enumerated__Group_2__15944);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2919:1: rule__Enumerated__Group_2__1__Impl : ( ( rule__Enumerated__ValuesAssignment_2_1 ) ) ;
    public final void rule__Enumerated__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2923:1: ( ( ( rule__Enumerated__ValuesAssignment_2_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2924:1: ( ( rule__Enumerated__ValuesAssignment_2_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2924:1: ( ( rule__Enumerated__ValuesAssignment_2_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2925:1: ( rule__Enumerated__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getEnumeratedAccess().getValuesAssignment_2_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2926:1: ( rule__Enumerated__ValuesAssignment_2_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2926:2: rule__Enumerated__ValuesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumerated__ValuesAssignment_2_1_in_rule__Enumerated__Group_2__1__Impl5971);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2940:1: rule__Bounded__Group__0 : rule__Bounded__Group__0__Impl rule__Bounded__Group__1 ;
    public final void rule__Bounded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2944:1: ( rule__Bounded__Group__0__Impl rule__Bounded__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2945:2: rule__Bounded__Group__0__Impl rule__Bounded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__0__Impl_in_rule__Bounded__Group__06005);
            rule__Bounded__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__1_in_rule__Bounded__Group__06008);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2952:1: rule__Bounded__Group__0__Impl : ( '[' ) ;
    public final void rule__Bounded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2956:1: ( ( '[' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2957:1: ( '[' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2957:1: ( '[' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2958:1: '['
            {
             before(grammarAccess.getBoundedAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Bounded__Group__0__Impl6036); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2971:1: rule__Bounded__Group__1 : rule__Bounded__Group__1__Impl rule__Bounded__Group__2 ;
    public final void rule__Bounded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2975:1: ( rule__Bounded__Group__1__Impl rule__Bounded__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2976:2: rule__Bounded__Group__1__Impl rule__Bounded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__1__Impl_in_rule__Bounded__Group__16067);
            rule__Bounded__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__2_in_rule__Bounded__Group__16070);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2983:1: rule__Bounded__Group__1__Impl : ( ( rule__Bounded__LowerBoundAssignment_1 ) ) ;
    public final void rule__Bounded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2987:1: ( ( ( rule__Bounded__LowerBoundAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2988:1: ( ( rule__Bounded__LowerBoundAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2988:1: ( ( rule__Bounded__LowerBoundAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2989:1: ( rule__Bounded__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getBoundedAccess().getLowerBoundAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2990:1: ( rule__Bounded__LowerBoundAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:2990:2: rule__Bounded__LowerBoundAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__LowerBoundAssignment_1_in_rule__Bounded__Group__1__Impl6097);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3000:1: rule__Bounded__Group__2 : rule__Bounded__Group__2__Impl rule__Bounded__Group__3 ;
    public final void rule__Bounded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3004:1: ( rule__Bounded__Group__2__Impl rule__Bounded__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3005:2: rule__Bounded__Group__2__Impl rule__Bounded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__2__Impl_in_rule__Bounded__Group__26127);
            rule__Bounded__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__3_in_rule__Bounded__Group__26130);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3012:1: rule__Bounded__Group__2__Impl : ( ';' ) ;
    public final void rule__Bounded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3016:1: ( ( ';' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3017:1: ( ';' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3017:1: ( ';' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3018:1: ';'
            {
             before(grammarAccess.getBoundedAccess().getSemicolonKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Bounded__Group__2__Impl6158); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3031:1: rule__Bounded__Group__3 : rule__Bounded__Group__3__Impl rule__Bounded__Group__4 ;
    public final void rule__Bounded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3035:1: ( rule__Bounded__Group__3__Impl rule__Bounded__Group__4 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3036:2: rule__Bounded__Group__3__Impl rule__Bounded__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__3__Impl_in_rule__Bounded__Group__36189);
            rule__Bounded__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__4_in_rule__Bounded__Group__36192);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3043:1: rule__Bounded__Group__3__Impl : ( ( rule__Bounded__UpperBoundAssignment_3 ) ) ;
    public final void rule__Bounded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3047:1: ( ( ( rule__Bounded__UpperBoundAssignment_3 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3048:1: ( ( rule__Bounded__UpperBoundAssignment_3 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3048:1: ( ( rule__Bounded__UpperBoundAssignment_3 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3049:1: ( rule__Bounded__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getBoundedAccess().getUpperBoundAssignment_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3050:1: ( rule__Bounded__UpperBoundAssignment_3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3050:2: rule__Bounded__UpperBoundAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__UpperBoundAssignment_3_in_rule__Bounded__Group__3__Impl6219);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3060:1: rule__Bounded__Group__4 : rule__Bounded__Group__4__Impl ;
    public final void rule__Bounded__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3064:1: ( rule__Bounded__Group__4__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3065:2: rule__Bounded__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bounded__Group__4__Impl_in_rule__Bounded__Group__46249);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3071:1: rule__Bounded__Group__4__Impl : ( ']' ) ;
    public final void rule__Bounded__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3075:1: ( ( ']' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3076:1: ( ']' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3076:1: ( ']' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3077:1: ']'
            {
             before(grammarAccess.getBoundedAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Bounded__Group__4__Impl6277); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3100:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3104:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3105:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__06318);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__06321);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3112:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__Group_0__0 )? ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3116:1: ( ( ( rule__Constraint__Group_0__0 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3117:1: ( ( rule__Constraint__Group_0__0 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3117:1: ( ( rule__Constraint__Group_0__0 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3118:1: ( rule__Constraint__Group_0__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3119:1: ( rule__Constraint__Group_0__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3119:2: rule__Constraint__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__0_in_rule__Constraint__Group__0__Impl6348);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3129:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3133:1: ( rule__Constraint__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3134:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16379);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3140:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ExprAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3144:1: ( ( ( rule__Constraint__ExprAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3145:1: ( ( rule__Constraint__ExprAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3145:1: ( ( rule__Constraint__ExprAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3146:1: ( rule__Constraint__ExprAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getExprAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3147:1: ( rule__Constraint__ExprAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3147:2: rule__Constraint__ExprAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__ExprAssignment_1_in_rule__Constraint__Group__1__Impl6406);
            rule__Constraint__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExprAssignment_1()); 

            }


            }

        }
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3161:1: rule__Constraint__Group_0__0 : rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 ;
    public final void rule__Constraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3165:1: ( rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3166:2: rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__0__Impl_in_rule__Constraint__Group_0__06440);
            rule__Constraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__1_in_rule__Constraint__Group_0__06443);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3173:1: rule__Constraint__Group_0__0__Impl : ( 'description' ) ;
    public final void rule__Constraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3177:1: ( ( 'description' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3178:1: ( 'description' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3178:1: ( 'description' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3179:1: 'description'
            {
             before(grammarAccess.getConstraintAccess().getDescriptionKeyword_0_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Constraint__Group_0__0__Impl6471); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3192:1: rule__Constraint__Group_0__1 : rule__Constraint__Group_0__1__Impl ;
    public final void rule__Constraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3196:1: ( rule__Constraint__Group_0__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3197:2: rule__Constraint__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_0__1__Impl_in_rule__Constraint__Group_0__16502);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3203:1: rule__Constraint__Group_0__1__Impl : ( ( rule__Constraint__DescriptionAssignment_0_1 ) ) ;
    public final void rule__Constraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3207:1: ( ( ( rule__Constraint__DescriptionAssignment_0_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3208:1: ( ( rule__Constraint__DescriptionAssignment_0_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3208:1: ( ( rule__Constraint__DescriptionAssignment_0_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3209:1: ( rule__Constraint__DescriptionAssignment_0_1 )
            {
             before(grammarAccess.getConstraintAccess().getDescriptionAssignment_0_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3210:1: ( rule__Constraint__DescriptionAssignment_0_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3210:2: rule__Constraint__DescriptionAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__DescriptionAssignment_0_1_in_rule__Constraint__Group_0__1__Impl6529);
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


    // $ANTLR start "rule__Disjunctive__Group__0"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3224:1: rule__Disjunctive__Group__0 : rule__Disjunctive__Group__0__Impl rule__Disjunctive__Group__1 ;
    public final void rule__Disjunctive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3228:1: ( rule__Disjunctive__Group__0__Impl rule__Disjunctive__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3229:2: rule__Disjunctive__Group__0__Impl rule__Disjunctive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__0__Impl_in_rule__Disjunctive__Group__06563);
            rule__Disjunctive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__1_in_rule__Disjunctive__Group__06566);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3236:1: rule__Disjunctive__Group__0__Impl : ( ruleConjunctive ) ;
    public final void rule__Disjunctive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3240:1: ( ( ruleConjunctive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3241:1: ( ruleConjunctive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3241:1: ( ruleConjunctive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3242:1: ruleConjunctive
            {
             before(grammarAccess.getDisjunctiveAccess().getConjunctiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_rule__Disjunctive__Group__0__Impl6593);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3253:1: rule__Disjunctive__Group__1 : rule__Disjunctive__Group__1__Impl ;
    public final void rule__Disjunctive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3257:1: ( rule__Disjunctive__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3258:2: rule__Disjunctive__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group__1__Impl_in_rule__Disjunctive__Group__16622);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3264:1: rule__Disjunctive__Group__1__Impl : ( ( rule__Disjunctive__Group_1__0 )* ) ;
    public final void rule__Disjunctive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3268:1: ( ( ( rule__Disjunctive__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3269:1: ( ( rule__Disjunctive__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3269:1: ( ( rule__Disjunctive__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3270:1: ( rule__Disjunctive__Group_1__0 )*
            {
             before(grammarAccess.getDisjunctiveAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3271:1: ( rule__Disjunctive__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==11) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3271:2: rule__Disjunctive__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__0_in_rule__Disjunctive__Group__1__Impl6649);
            	    rule__Disjunctive__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3285:1: rule__Disjunctive__Group_1__0 : rule__Disjunctive__Group_1__0__Impl rule__Disjunctive__Group_1__1 ;
    public final void rule__Disjunctive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3289:1: ( rule__Disjunctive__Group_1__0__Impl rule__Disjunctive__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3290:2: rule__Disjunctive__Group_1__0__Impl rule__Disjunctive__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__0__Impl_in_rule__Disjunctive__Group_1__06684);
            rule__Disjunctive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__1_in_rule__Disjunctive__Group_1__06687);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3297:1: rule__Disjunctive__Group_1__0__Impl : ( () ) ;
    public final void rule__Disjunctive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3301:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3302:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3302:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3303:1: ()
            {
             before(grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3304:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3306:1: 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3316:1: rule__Disjunctive__Group_1__1 : rule__Disjunctive__Group_1__1__Impl rule__Disjunctive__Group_1__2 ;
    public final void rule__Disjunctive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3320:1: ( rule__Disjunctive__Group_1__1__Impl rule__Disjunctive__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3321:2: rule__Disjunctive__Group_1__1__Impl rule__Disjunctive__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__1__Impl_in_rule__Disjunctive__Group_1__16745);
            rule__Disjunctive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__2_in_rule__Disjunctive__Group_1__16748);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3328:1: rule__Disjunctive__Group_1__1__Impl : ( ( rule__Disjunctive__OperatorAssignment_1_1 ) ) ;
    public final void rule__Disjunctive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3332:1: ( ( ( rule__Disjunctive__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3333:1: ( ( rule__Disjunctive__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3333:1: ( ( rule__Disjunctive__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3334:1: ( rule__Disjunctive__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getDisjunctiveAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3335:1: ( rule__Disjunctive__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3335:2: rule__Disjunctive__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__OperatorAssignment_1_1_in_rule__Disjunctive__Group_1__1__Impl6775);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3345:1: rule__Disjunctive__Group_1__2 : rule__Disjunctive__Group_1__2__Impl ;
    public final void rule__Disjunctive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3349:1: ( rule__Disjunctive__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3350:2: rule__Disjunctive__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__Group_1__2__Impl_in_rule__Disjunctive__Group_1__26805);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3356:1: rule__Disjunctive__Group_1__2__Impl : ( ( rule__Disjunctive__RightAssignment_1_2 ) ) ;
    public final void rule__Disjunctive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3360:1: ( ( ( rule__Disjunctive__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3361:1: ( ( rule__Disjunctive__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3361:1: ( ( rule__Disjunctive__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3362:1: ( rule__Disjunctive__RightAssignment_1_2 )
            {
             before(grammarAccess.getDisjunctiveAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3363:1: ( rule__Disjunctive__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3363:2: rule__Disjunctive__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disjunctive__RightAssignment_1_2_in_rule__Disjunctive__Group_1__2__Impl6832);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3379:1: rule__Conjunctive__Group__0 : rule__Conjunctive__Group__0__Impl rule__Conjunctive__Group__1 ;
    public final void rule__Conjunctive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3383:1: ( rule__Conjunctive__Group__0__Impl rule__Conjunctive__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3384:2: rule__Conjunctive__Group__0__Impl rule__Conjunctive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__0__Impl_in_rule__Conjunctive__Group__06868);
            rule__Conjunctive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__1_in_rule__Conjunctive__Group__06871);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3391:1: rule__Conjunctive__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__Conjunctive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3395:1: ( ( ruleEquality ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3396:1: ( ruleEquality )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3396:1: ( ruleEquality )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3397:1: ruleEquality
            {
             before(grammarAccess.getConjunctiveAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_rule__Conjunctive__Group__0__Impl6898);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3408:1: rule__Conjunctive__Group__1 : rule__Conjunctive__Group__1__Impl ;
    public final void rule__Conjunctive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3412:1: ( rule__Conjunctive__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3413:2: rule__Conjunctive__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group__1__Impl_in_rule__Conjunctive__Group__16927);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3419:1: rule__Conjunctive__Group__1__Impl : ( ( rule__Conjunctive__Group_1__0 )* ) ;
    public final void rule__Conjunctive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3423:1: ( ( ( rule__Conjunctive__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3424:1: ( ( rule__Conjunctive__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3424:1: ( ( rule__Conjunctive__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3425:1: ( rule__Conjunctive__Group_1__0 )*
            {
             before(grammarAccess.getConjunctiveAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3426:1: ( rule__Conjunctive__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==12) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3426:2: rule__Conjunctive__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__0_in_rule__Conjunctive__Group__1__Impl6954);
            	    rule__Conjunctive__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3440:1: rule__Conjunctive__Group_1__0 : rule__Conjunctive__Group_1__0__Impl rule__Conjunctive__Group_1__1 ;
    public final void rule__Conjunctive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3444:1: ( rule__Conjunctive__Group_1__0__Impl rule__Conjunctive__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3445:2: rule__Conjunctive__Group_1__0__Impl rule__Conjunctive__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__0__Impl_in_rule__Conjunctive__Group_1__06989);
            rule__Conjunctive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__1_in_rule__Conjunctive__Group_1__06992);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3452:1: rule__Conjunctive__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunctive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3456:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3457:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3457:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3458:1: ()
            {
             before(grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3459:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3461:1: 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3471:1: rule__Conjunctive__Group_1__1 : rule__Conjunctive__Group_1__1__Impl rule__Conjunctive__Group_1__2 ;
    public final void rule__Conjunctive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3475:1: ( rule__Conjunctive__Group_1__1__Impl rule__Conjunctive__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3476:2: rule__Conjunctive__Group_1__1__Impl rule__Conjunctive__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__1__Impl_in_rule__Conjunctive__Group_1__17050);
            rule__Conjunctive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__2_in_rule__Conjunctive__Group_1__17053);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3483:1: rule__Conjunctive__Group_1__1__Impl : ( ( rule__Conjunctive__OperatorAssignment_1_1 ) ) ;
    public final void rule__Conjunctive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3487:1: ( ( ( rule__Conjunctive__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3488:1: ( ( rule__Conjunctive__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3488:1: ( ( rule__Conjunctive__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3489:1: ( rule__Conjunctive__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConjunctiveAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3490:1: ( rule__Conjunctive__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3490:2: rule__Conjunctive__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__OperatorAssignment_1_1_in_rule__Conjunctive__Group_1__1__Impl7080);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3500:1: rule__Conjunctive__Group_1__2 : rule__Conjunctive__Group_1__2__Impl ;
    public final void rule__Conjunctive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3504:1: ( rule__Conjunctive__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3505:2: rule__Conjunctive__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__Group_1__2__Impl_in_rule__Conjunctive__Group_1__27110);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3511:1: rule__Conjunctive__Group_1__2__Impl : ( ( rule__Conjunctive__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunctive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3515:1: ( ( ( rule__Conjunctive__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3516:1: ( ( rule__Conjunctive__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3516:1: ( ( rule__Conjunctive__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3517:1: ( rule__Conjunctive__RightAssignment_1_2 )
            {
             before(grammarAccess.getConjunctiveAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3518:1: ( rule__Conjunctive__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3518:2: rule__Conjunctive__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conjunctive__RightAssignment_1_2_in_rule__Conjunctive__Group_1__2__Impl7137);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3534:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3538:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3539:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__07173);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__07176);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3546:1: rule__Equality__Group__0__Impl : ( ruleComparative ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3550:1: ( ( ruleComparative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3551:1: ( ruleComparative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3551:1: ( ruleComparative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3552:1: ruleComparative
            {
             before(grammarAccess.getEqualityAccess().getComparativeParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_rule__Equality__Group__0__Impl7203);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3563:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3567:1: ( rule__Equality__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3568:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__17232);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3574:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3578:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3579:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3579:1: ( ( rule__Equality__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3580:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3581:1: ( rule__Equality__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=18 && LA28_0<=19)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3581:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl7259);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3595:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3599:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3600:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__07294);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__07297);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3607:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3611:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3612:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3612:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3613:1: ()
            {
             before(grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3614:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3616:1: 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3626:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3630:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3631:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__17355);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__17358);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3638:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OperatorAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3642:1: ( ( ( rule__Equality__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3643:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3643:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3644:1: ( rule__Equality__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3645:1: ( rule__Equality__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3645:2: rule__Equality__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl7385);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3655:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3659:1: ( rule__Equality__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3660:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__27415);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3666:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3670:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3671:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3671:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3672:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3673:1: ( rule__Equality__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3673:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl7442);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3689:1: rule__Comparative__Group__0 : rule__Comparative__Group__0__Impl rule__Comparative__Group__1 ;
    public final void rule__Comparative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3693:1: ( rule__Comparative__Group__0__Impl rule__Comparative__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3694:2: rule__Comparative__Group__0__Impl rule__Comparative__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__0__Impl_in_rule__Comparative__Group__07478);
            rule__Comparative__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__1_in_rule__Comparative__Group__07481);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3701:1: rule__Comparative__Group__0__Impl : ( ruleAdditive ) ;
    public final void rule__Comparative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3705:1: ( ( ruleAdditive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3706:1: ( ruleAdditive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3706:1: ( ruleAdditive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3707:1: ruleAdditive
            {
             before(grammarAccess.getComparativeAccess().getAdditiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_rule__Comparative__Group__0__Impl7508);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3718:1: rule__Comparative__Group__1 : rule__Comparative__Group__1__Impl ;
    public final void rule__Comparative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3722:1: ( rule__Comparative__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3723:2: rule__Comparative__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group__1__Impl_in_rule__Comparative__Group__17537);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3729:1: rule__Comparative__Group__1__Impl : ( ( rule__Comparative__Group_1__0 )* ) ;
    public final void rule__Comparative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3733:1: ( ( ( rule__Comparative__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3734:1: ( ( rule__Comparative__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3734:1: ( ( rule__Comparative__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3735:1: ( rule__Comparative__Group_1__0 )*
            {
             before(grammarAccess.getComparativeAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3736:1: ( rule__Comparative__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=20 && LA29_0<=23)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3736:2: rule__Comparative__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__0_in_rule__Comparative__Group__1__Impl7564);
            	    rule__Comparative__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3750:1: rule__Comparative__Group_1__0 : rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1 ;
    public final void rule__Comparative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3754:1: ( rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3755:2: rule__Comparative__Group_1__0__Impl rule__Comparative__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__0__Impl_in_rule__Comparative__Group_1__07599);
            rule__Comparative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__1_in_rule__Comparative__Group_1__07602);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3762:1: rule__Comparative__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3766:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3767:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3767:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3768:1: ()
            {
             before(grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3769:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3771:1: 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3781:1: rule__Comparative__Group_1__1 : rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2 ;
    public final void rule__Comparative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3785:1: ( rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3786:2: rule__Comparative__Group_1__1__Impl rule__Comparative__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__1__Impl_in_rule__Comparative__Group_1__17660);
            rule__Comparative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__2_in_rule__Comparative__Group_1__17663);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3793:1: rule__Comparative__Group_1__1__Impl : ( ( rule__Comparative__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3797:1: ( ( ( rule__Comparative__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3798:1: ( ( rule__Comparative__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3798:1: ( ( rule__Comparative__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3799:1: ( rule__Comparative__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparativeAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3800:1: ( rule__Comparative__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3800:2: rule__Comparative__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__OperatorAssignment_1_1_in_rule__Comparative__Group_1__1__Impl7690);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3810:1: rule__Comparative__Group_1__2 : rule__Comparative__Group_1__2__Impl ;
    public final void rule__Comparative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3814:1: ( rule__Comparative__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3815:2: rule__Comparative__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__Group_1__2__Impl_in_rule__Comparative__Group_1__27720);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3821:1: rule__Comparative__Group_1__2__Impl : ( ( rule__Comparative__RightAssignment_1_2 ) ) ;
    public final void rule__Comparative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3825:1: ( ( ( rule__Comparative__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3826:1: ( ( rule__Comparative__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3826:1: ( ( rule__Comparative__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3827:1: ( rule__Comparative__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparativeAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3828:1: ( rule__Comparative__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3828:2: rule__Comparative__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparative__RightAssignment_1_2_in_rule__Comparative__Group_1__2__Impl7747);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3844:1: rule__Additive__Group__0 : rule__Additive__Group__0__Impl rule__Additive__Group__1 ;
    public final void rule__Additive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3848:1: ( rule__Additive__Group__0__Impl rule__Additive__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3849:2: rule__Additive__Group__0__Impl rule__Additive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__0__Impl_in_rule__Additive__Group__07783);
            rule__Additive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__1_in_rule__Additive__Group__07786);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3856:1: rule__Additive__Group__0__Impl : ( ruleMultiplicative ) ;
    public final void rule__Additive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3860:1: ( ( ruleMultiplicative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3861:1: ( ruleMultiplicative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3861:1: ( ruleMultiplicative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3862:1: ruleMultiplicative
            {
             before(grammarAccess.getAdditiveAccess().getMultiplicativeParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_rule__Additive__Group__0__Impl7813);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3873:1: rule__Additive__Group__1 : rule__Additive__Group__1__Impl ;
    public final void rule__Additive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3877:1: ( rule__Additive__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3878:2: rule__Additive__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group__1__Impl_in_rule__Additive__Group__17842);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3884:1: rule__Additive__Group__1__Impl : ( ( rule__Additive__Group_1__0 )* ) ;
    public final void rule__Additive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3888:1: ( ( ( rule__Additive__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3889:1: ( ( rule__Additive__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3889:1: ( ( rule__Additive__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3890:1: ( rule__Additive__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3891:1: ( rule__Additive__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=24 && LA30_0<=25)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3891:2: rule__Additive__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__0_in_rule__Additive__Group__1__Impl7869);
            	    rule__Additive__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3905:1: rule__Additive__Group_1__0 : rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1 ;
    public final void rule__Additive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3909:1: ( rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3910:2: rule__Additive__Group_1__0__Impl rule__Additive__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__0__Impl_in_rule__Additive__Group_1__07904);
            rule__Additive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__1_in_rule__Additive__Group_1__07907);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3917:1: rule__Additive__Group_1__0__Impl : ( () ) ;
    public final void rule__Additive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3921:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3922:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3922:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3923:1: ()
            {
             before(grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3924:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3926:1: 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3936:1: rule__Additive__Group_1__1 : rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2 ;
    public final void rule__Additive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3940:1: ( rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3941:2: rule__Additive__Group_1__1__Impl rule__Additive__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__1__Impl_in_rule__Additive__Group_1__17965);
            rule__Additive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__2_in_rule__Additive__Group_1__17968);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3948:1: rule__Additive__Group_1__1__Impl : ( ( rule__Additive__OperatorAssignment_1_1 ) ) ;
    public final void rule__Additive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3952:1: ( ( ( rule__Additive__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3953:1: ( ( rule__Additive__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3953:1: ( ( rule__Additive__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3954:1: ( rule__Additive__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3955:1: ( rule__Additive__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3955:2: rule__Additive__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__OperatorAssignment_1_1_in_rule__Additive__Group_1__1__Impl7995);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3965:1: rule__Additive__Group_1__2 : rule__Additive__Group_1__2__Impl ;
    public final void rule__Additive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3969:1: ( rule__Additive__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3970:2: rule__Additive__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__Group_1__2__Impl_in_rule__Additive__Group_1__28025);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3976:1: rule__Additive__Group_1__2__Impl : ( ( rule__Additive__RightAssignment_1_2 ) ) ;
    public final void rule__Additive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3980:1: ( ( ( rule__Additive__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3981:1: ( ( rule__Additive__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3981:1: ( ( rule__Additive__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3982:1: ( rule__Additive__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3983:1: ( rule__Additive__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3983:2: rule__Additive__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Additive__RightAssignment_1_2_in_rule__Additive__Group_1__2__Impl8052);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:3999:1: rule__Multiplicative__Group__0 : rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1 ;
    public final void rule__Multiplicative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4003:1: ( rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4004:2: rule__Multiplicative__Group__0__Impl rule__Multiplicative__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__0__Impl_in_rule__Multiplicative__Group__08088);
            rule__Multiplicative__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__1_in_rule__Multiplicative__Group__08091);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4011:1: rule__Multiplicative__Group__0__Impl : ( rulePrimitive ) ;
    public final void rule__Multiplicative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4015:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4016:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4016:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4017:1: rulePrimitive
            {
             before(grammarAccess.getMultiplicativeAccess().getPrimitiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Multiplicative__Group__0__Impl8118);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4028:1: rule__Multiplicative__Group__1 : rule__Multiplicative__Group__1__Impl ;
    public final void rule__Multiplicative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4032:1: ( rule__Multiplicative__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4033:2: rule__Multiplicative__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group__1__Impl_in_rule__Multiplicative__Group__18147);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4039:1: rule__Multiplicative__Group__1__Impl : ( ( rule__Multiplicative__Group_1__0 )* ) ;
    public final void rule__Multiplicative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4043:1: ( ( ( rule__Multiplicative__Group_1__0 )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4044:1: ( ( rule__Multiplicative__Group_1__0 )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4044:1: ( ( rule__Multiplicative__Group_1__0 )* )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4045:1: ( rule__Multiplicative__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeAccess().getGroup_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4046:1: ( rule__Multiplicative__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=26 && LA31_0<=27)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4046:2: rule__Multiplicative__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__0_in_rule__Multiplicative__Group__1__Impl8174);
            	    rule__Multiplicative__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4060:1: rule__Multiplicative__Group_1__0 : rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1 ;
    public final void rule__Multiplicative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4064:1: ( rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4065:2: rule__Multiplicative__Group_1__0__Impl rule__Multiplicative__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__0__Impl_in_rule__Multiplicative__Group_1__08209);
            rule__Multiplicative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__1_in_rule__Multiplicative__Group_1__08212);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4072:1: rule__Multiplicative__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4076:1: ( ( () ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4077:1: ( () )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4077:1: ( () )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4078:1: ()
            {
             before(grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4079:1: ()
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4081:1: 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4091:1: rule__Multiplicative__Group_1__1 : rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2 ;
    public final void rule__Multiplicative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4095:1: ( rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4096:2: rule__Multiplicative__Group_1__1__Impl rule__Multiplicative__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__1__Impl_in_rule__Multiplicative__Group_1__18270);
            rule__Multiplicative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__2_in_rule__Multiplicative__Group_1__18273);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4103:1: rule__Multiplicative__Group_1__1__Impl : ( ( rule__Multiplicative__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4107:1: ( ( ( rule__Multiplicative__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4108:1: ( ( rule__Multiplicative__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4108:1: ( ( rule__Multiplicative__OperatorAssignment_1_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4109:1: ( rule__Multiplicative__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4110:1: ( rule__Multiplicative__OperatorAssignment_1_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4110:2: rule__Multiplicative__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__OperatorAssignment_1_1_in_rule__Multiplicative__Group_1__1__Impl8300);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4120:1: rule__Multiplicative__Group_1__2 : rule__Multiplicative__Group_1__2__Impl ;
    public final void rule__Multiplicative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4124:1: ( rule__Multiplicative__Group_1__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4125:2: rule__Multiplicative__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__Group_1__2__Impl_in_rule__Multiplicative__Group_1__28330);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4131:1: rule__Multiplicative__Group_1__2__Impl : ( ( rule__Multiplicative__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplicative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4135:1: ( ( ( rule__Multiplicative__RightAssignment_1_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4136:1: ( ( rule__Multiplicative__RightAssignment_1_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4136:1: ( ( rule__Multiplicative__RightAssignment_1_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4137:1: ( rule__Multiplicative__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeAccess().getRightAssignment_1_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4138:1: ( rule__Multiplicative__RightAssignment_1_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4138:2: rule__Multiplicative__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Multiplicative__RightAssignment_1_2_in_rule__Multiplicative__Group_1__2__Impl8357);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4154:1: rule__Primitive__Group_8__0 : rule__Primitive__Group_8__0__Impl rule__Primitive__Group_8__1 ;
    public final void rule__Primitive__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4158:1: ( rule__Primitive__Group_8__0__Impl rule__Primitive__Group_8__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4159:2: rule__Primitive__Group_8__0__Impl rule__Primitive__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__0__Impl_in_rule__Primitive__Group_8__08393);
            rule__Primitive__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__1_in_rule__Primitive__Group_8__08396);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4166:1: rule__Primitive__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4170:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4171:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4171:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4172:1: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Primitive__Group_8__0__Impl8424); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4185:1: rule__Primitive__Group_8__1 : rule__Primitive__Group_8__1__Impl rule__Primitive__Group_8__2 ;
    public final void rule__Primitive__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4189:1: ( rule__Primitive__Group_8__1__Impl rule__Primitive__Group_8__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4190:2: rule__Primitive__Group_8__1__Impl rule__Primitive__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__1__Impl_in_rule__Primitive__Group_8__18455);
            rule__Primitive__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__2_in_rule__Primitive__Group_8__18458);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4197:1: rule__Primitive__Group_8__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4201:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4202:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4202:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4203:1: ruleExpression
            {
             before(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_8_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Primitive__Group_8__1__Impl8485);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4214:1: rule__Primitive__Group_8__2 : rule__Primitive__Group_8__2__Impl ;
    public final void rule__Primitive__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4218:1: ( rule__Primitive__Group_8__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4219:2: rule__Primitive__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group_8__2__Impl_in_rule__Primitive__Group_8__28514);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4225:1: rule__Primitive__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4229:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4230:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4230:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4231:1: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_8_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Primitive__Group_8__2__Impl8542); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4250:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4254:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4255:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08579);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08582);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4262:1: rule__Unary__Group__0__Impl : ( ( rule__Unary__OperatorAssignment_0 ) ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4266:1: ( ( ( rule__Unary__OperatorAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4267:1: ( ( rule__Unary__OperatorAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4267:1: ( ( rule__Unary__OperatorAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4268:1: ( rule__Unary__OperatorAssignment_0 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4269:1: ( rule__Unary__OperatorAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4269:2: rule__Unary__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__OperatorAssignment_0_in_rule__Unary__Group__0__Impl8609);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4279:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4283:1: ( rule__Unary__Group__1__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4284:2: rule__Unary__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18639);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4290:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__InnerAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4294:1: ( ( ( rule__Unary__InnerAssignment_1 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4295:1: ( ( rule__Unary__InnerAssignment_1 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4295:1: ( ( rule__Unary__InnerAssignment_1 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4296:1: ( rule__Unary__InnerAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getInnerAssignment_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4297:1: ( rule__Unary__InnerAssignment_1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4297:2: rule__Unary__InnerAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unary__InnerAssignment_1_in_rule__Unary__Group__1__Impl8666);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4311:1: rule__Scalar__Group__0 : rule__Scalar__Group__0__Impl rule__Scalar__Group__1 ;
    public final void rule__Scalar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4315:1: ( rule__Scalar__Group__0__Impl rule__Scalar__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4316:2: rule__Scalar__Group__0__Impl rule__Scalar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__0__Impl_in_rule__Scalar__Group__08700);
            rule__Scalar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__1_in_rule__Scalar__Group__08703);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4323:1: rule__Scalar__Group__0__Impl : ( ( rule__Scalar__OperatorAssignment_0 ) ) ;
    public final void rule__Scalar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4327:1: ( ( ( rule__Scalar__OperatorAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4328:1: ( ( rule__Scalar__OperatorAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4328:1: ( ( rule__Scalar__OperatorAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4329:1: ( rule__Scalar__OperatorAssignment_0 )
            {
             before(grammarAccess.getScalarAccess().getOperatorAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4330:1: ( rule__Scalar__OperatorAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4330:2: rule__Scalar__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__OperatorAssignment_0_in_rule__Scalar__Group__0__Impl8730);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4340:1: rule__Scalar__Group__1 : rule__Scalar__Group__1__Impl rule__Scalar__Group__2 ;
    public final void rule__Scalar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4344:1: ( rule__Scalar__Group__1__Impl rule__Scalar__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4345:2: rule__Scalar__Group__1__Impl rule__Scalar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__1__Impl_in_rule__Scalar__Group__18760);
            rule__Scalar__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__2_in_rule__Scalar__Group__18763);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4352:1: rule__Scalar__Group__1__Impl : ( '(' ) ;
    public final void rule__Scalar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4356:1: ( ( '(' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4357:1: ( '(' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4357:1: ( '(' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4358:1: '('
            {
             before(grammarAccess.getScalarAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Scalar__Group__1__Impl8791); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4371:1: rule__Scalar__Group__2 : rule__Scalar__Group__2__Impl rule__Scalar__Group__3 ;
    public final void rule__Scalar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4375:1: ( rule__Scalar__Group__2__Impl rule__Scalar__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4376:2: rule__Scalar__Group__2__Impl rule__Scalar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__2__Impl_in_rule__Scalar__Group__28822);
            rule__Scalar__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__3_in_rule__Scalar__Group__28825);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4383:1: rule__Scalar__Group__2__Impl : ( ( rule__Scalar__IdAssignment_2 ) ) ;
    public final void rule__Scalar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4387:1: ( ( ( rule__Scalar__IdAssignment_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4388:1: ( ( rule__Scalar__IdAssignment_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4388:1: ( ( rule__Scalar__IdAssignment_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4389:1: ( rule__Scalar__IdAssignment_2 )
            {
             before(grammarAccess.getScalarAccess().getIdAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4390:1: ( rule__Scalar__IdAssignment_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4390:2: rule__Scalar__IdAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__IdAssignment_2_in_rule__Scalar__Group__2__Impl8852);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4400:1: rule__Scalar__Group__3 : rule__Scalar__Group__3__Impl ;
    public final void rule__Scalar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4404:1: ( rule__Scalar__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4405:2: rule__Scalar__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scalar__Group__3__Impl_in_rule__Scalar__Group__38882);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4411:1: rule__Scalar__Group__3__Impl : ( ')' ) ;
    public final void rule__Scalar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4415:1: ( ( ')' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4416:1: ( ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4416:1: ( ')' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4417:1: ')'
            {
             before(grammarAccess.getScalarAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Scalar__Group__3__Impl8910); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4438:1: rule__InRange__Group__0 : rule__InRange__Group__0__Impl rule__InRange__Group__1 ;
    public final void rule__InRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4442:1: ( rule__InRange__Group__0__Impl rule__InRange__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4443:2: rule__InRange__Group__0__Impl rule__InRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__0__Impl_in_rule__InRange__Group__08949);
            rule__InRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__1_in_rule__InRange__Group__08952);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4450:1: rule__InRange__Group__0__Impl : ( ( rule__InRange__ParameterAssignment_0 ) ) ;
    public final void rule__InRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4454:1: ( ( ( rule__InRange__ParameterAssignment_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4455:1: ( ( rule__InRange__ParameterAssignment_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4455:1: ( ( rule__InRange__ParameterAssignment_0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4456:1: ( rule__InRange__ParameterAssignment_0 )
            {
             before(grammarAccess.getInRangeAccess().getParameterAssignment_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4457:1: ( rule__InRange__ParameterAssignment_0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4457:2: rule__InRange__ParameterAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__ParameterAssignment_0_in_rule__InRange__Group__0__Impl8979);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4467:1: rule__InRange__Group__1 : rule__InRange__Group__1__Impl rule__InRange__Group__2 ;
    public final void rule__InRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4471:1: ( rule__InRange__Group__1__Impl rule__InRange__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4472:2: rule__InRange__Group__1__Impl rule__InRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__1__Impl_in_rule__InRange__Group__19009);
            rule__InRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__2_in_rule__InRange__Group__19012);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4479:1: rule__InRange__Group__1__Impl : ( 'in' ) ;
    public final void rule__InRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4483:1: ( ( 'in' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4484:1: ( 'in' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4484:1: ( 'in' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4485:1: 'in'
            {
             before(grammarAccess.getInRangeAccess().getInKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__InRange__Group__1__Impl9040); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4498:1: rule__InRange__Group__2 : rule__InRange__Group__2__Impl ;
    public final void rule__InRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4502:1: ( rule__InRange__Group__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4503:2: rule__InRange__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__Group__2__Impl_in_rule__InRange__Group__29071);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4509:1: rule__InRange__Group__2__Impl : ( ( rule__InRange__RangeAssignment_2 ) ) ;
    public final void rule__InRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4513:1: ( ( ( rule__InRange__RangeAssignment_2 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4514:1: ( ( rule__InRange__RangeAssignment_2 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4514:1: ( ( rule__InRange__RangeAssignment_2 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4515:1: ( rule__InRange__RangeAssignment_2 )
            {
             before(grammarAccess.getInRangeAccess().getRangeAssignment_2()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4516:1: ( rule__InRange__RangeAssignment_2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4516:2: rule__InRange__RangeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InRange__RangeAssignment_2_in_rule__InRange__Group__2__Impl9098);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4532:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4536:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4537:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09134);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09137);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4544:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4548:1: ( ( ( RULE_INT )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4549:1: ( ( RULE_INT )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4549:1: ( ( RULE_INT )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4550:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4551:1: ( RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4551:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl9165); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4561:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4565:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4566:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19196);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19199);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4573:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4577:1: ( ( '.' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4578:1: ( '.' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4578:1: ( '.' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4579:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__EDouble__Group__1__Impl9227); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4592:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4596:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4597:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29258);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__29261);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4604:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4608:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4609:1: ( RULE_INT )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4609:1: ( RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4610:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl9288); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4621:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4625:1: ( rule__EDouble__Group__3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4626:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39317);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4632:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4636:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4637:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4637:1: ( ( rule__EDouble__Group_3__0 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4638:1: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4639:1: ( rule__EDouble__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=14 && LA33_0<=15)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4639:2: rule__EDouble__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__0_in_rule__EDouble__Group__3__Impl9344);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4657:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4661:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4662:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__0__Impl_in_rule__EDouble__Group_3__09383);
            rule__EDouble__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__1_in_rule__EDouble__Group_3__09386);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4669:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4673:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4674:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4674:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4675:1: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4676:1: ( rule__EDouble__Alternatives_3_0 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4676:2: rule__EDouble__Alternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_3_0_in_rule__EDouble__Group_3__0__Impl9413);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4686:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4690:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4691:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__1__Impl_in_rule__EDouble__Group_3__19443);
            rule__EDouble__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__2_in_rule__EDouble__Group_3__19446);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4698:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4702:1: ( ( ( '-' )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4703:1: ( ( '-' )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4703:1: ( ( '-' )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4704:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4705:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4706:2: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__EDouble__Group_3__1__Impl9475); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4717:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4721:1: ( rule__EDouble__Group_3__2__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4722:2: rule__EDouble__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_3__2__Impl_in_rule__EDouble__Group_3__29508);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4728:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4732:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4733:1: ( RULE_INT )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4733:1: ( RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4734:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_3__2__Impl9535); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4752:1: rule__ParameterGroup__UnorderedGroup_3 : rule__ParameterGroup__UnorderedGroup_3__0 {...}?;
    public final void rule__ParameterGroup__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4757:1: ( rule__ParameterGroup__UnorderedGroup_3__0 {...}?)
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4758:2: rule__ParameterGroup__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__0_in_rule__ParameterGroup__UnorderedGroup_39571);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4769:1: rule__ParameterGroup__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__ParameterGroup__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4774:1: ( ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4775:3: ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4775:3: ( ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) ) )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( LA35_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt35=2;
            }
            else if ( LA35_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt35=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4777:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4777:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4778:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4778:111: ( ( ( rule__ParameterGroup__Group_3_0__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4779:6: ( ( rule__ParameterGroup__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4785:6: ( ( rule__ParameterGroup__Group_3_0__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4787:7: ( rule__ParameterGroup__Group_3_0__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4788:7: ( rule__ParameterGroup__Group_3_0__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4788:8: rule__ParameterGroup__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_0__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9660);
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4794:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4794:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4795:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4795:111: ( ( ( rule__ParameterGroup__Group_3_1__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4796:6: ( ( rule__ParameterGroup__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4802:6: ( ( rule__ParameterGroup__Group_3_1__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4804:7: ( rule__ParameterGroup__Group_3_1__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4805:7: ( rule__ParameterGroup__Group_3_1__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4805:8: rule__ParameterGroup__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_1__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9751);
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4811:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4811:4: ({...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4812:5: {...}? => ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ParameterGroup__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4812:111: ( ( ( rule__ParameterGroup__Group_3_2__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4813:6: ( ( rule__ParameterGroup__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4819:6: ( ( rule__ParameterGroup__Group_3_2__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4821:7: ( rule__ParameterGroup__Group_3_2__0 )
                    {
                     before(grammarAccess.getParameterGroupAccess().getGroup_3_2()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4822:7: ( rule__ParameterGroup__Group_3_2__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4822:8: rule__ParameterGroup__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__Group_3_2__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9842);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4837:1: rule__ParameterGroup__UnorderedGroup_3__0 : rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )? ;
    public final void rule__ParameterGroup__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4841:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4842:2: rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__09901);
            rule__ParameterGroup__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4843:2: ( rule__ParameterGroup__UnorderedGroup_3__1 )?
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4843:2: rule__ParameterGroup__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__1_in_rule__ParameterGroup__UnorderedGroup_3__09904);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4850:1: rule__ParameterGroup__UnorderedGroup_3__1 : rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )? ;
    public final void rule__ParameterGroup__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4854:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4855:2: rule__ParameterGroup__UnorderedGroup_3__Impl ( rule__ParameterGroup__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__19929);
            rule__ParameterGroup__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4856:2: ( rule__ParameterGroup__UnorderedGroup_3__2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4856:2: rule__ParameterGroup__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__2_in_rule__ParameterGroup__UnorderedGroup_3__19932);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4863:1: rule__ParameterGroup__UnorderedGroup_3__2 : rule__ParameterGroup__UnorderedGroup_3__Impl ;
    public final void rule__ParameterGroup__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4867:1: ( rule__ParameterGroup__UnorderedGroup_3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4868:2: rule__ParameterGroup__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__29957);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4881:1: rule__Parameter__UnorderedGroup_3 : rule__Parameter__UnorderedGroup_3__0 {...}?;
    public final void rule__Parameter__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4886:1: ( rule__Parameter__UnorderedGroup_3__0 {...}?)
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4887:2: rule__Parameter__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__0_in_rule__Parameter__UnorderedGroup_39987);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4898:1: rule__Parameter__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__Parameter__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4903:1: ( ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4904:3: ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4904:3: ( ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) ) )
            int alt38=4;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13||LA38_0==49) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt38=2;
            }
            else if ( LA38_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt38=3;
            }
            else if ( LA38_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt38=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4906:4: ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4906:4: ({...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4907:5: {...}? => ( ( ( rule__Parameter__Alternatives_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4907:106: ( ( ( rule__Parameter__Alternatives_3_0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4908:6: ( ( rule__Parameter__Alternatives_3_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4914:6: ( ( rule__Parameter__Alternatives_3_0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4916:7: ( rule__Parameter__Alternatives_3_0 )
                    {
                     before(grammarAccess.getParameterAccess().getAlternatives_3_0()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4917:7: ( rule__Parameter__Alternatives_3_0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4917:8: rule__Parameter__Alternatives_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Alternatives_3_0_in_rule__Parameter__UnorderedGroup_3__Impl10076);
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4923:4: ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4923:4: ({...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4924:5: {...}? => ( ( ( rule__Parameter__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4924:106: ( ( ( rule__Parameter__Group_3_1__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4925:6: ( ( rule__Parameter__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4931:6: ( ( rule__Parameter__Group_3_1__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4933:7: ( rule__Parameter__Group_3_1__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_1()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4934:7: ( rule__Parameter__Group_3_1__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4934:8: rule__Parameter__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_1__0_in_rule__Parameter__UnorderedGroup_3__Impl10167);
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4940:4: ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4940:4: ({...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4941:5: {...}? => ( ( ( rule__Parameter__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4941:106: ( ( ( rule__Parameter__Group_3_2__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4942:6: ( ( rule__Parameter__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4948:6: ( ( rule__Parameter__Group_3_2__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4950:7: ( rule__Parameter__Group_3_2__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_2()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4951:7: ( rule__Parameter__Group_3_2__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4951:8: rule__Parameter__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__UnorderedGroup_3__Impl10258);
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4957:4: ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4957:4: ({...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4958:5: {...}? => ( ( ( rule__Parameter__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4958:106: ( ( ( rule__Parameter__Group_3_3__0 ) ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4959:6: ( ( rule__Parameter__Group_3_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4965:6: ( ( rule__Parameter__Group_3_3__0 ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4967:7: ( rule__Parameter__Group_3_3__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3_3()); 
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4968:7: ( rule__Parameter__Group_3_3__0 )
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4968:8: rule__Parameter__Group_3_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3_3__0_in_rule__Parameter__UnorderedGroup_3__Impl10349);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4983:1: rule__Parameter__UnorderedGroup_3__0 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )? ;
    public final void rule__Parameter__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4987:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4988:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__010408);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4989:2: ( rule__Parameter__UnorderedGroup_3__1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13||LA39_0==49) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4989:2: rule__Parameter__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__1_in_rule__Parameter__UnorderedGroup_3__010411);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:4996:1: rule__Parameter__UnorderedGroup_3__1 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )? ;
    public final void rule__Parameter__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5000:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5001:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__110436);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5002:2: ( rule__Parameter__UnorderedGroup_3__2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==13||LA40_0==49) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
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
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5002:2: rule__Parameter__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__2_in_rule__Parameter__UnorderedGroup_3__110439);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5009:1: rule__Parameter__UnorderedGroup_3__2 : rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )? ;
    public final void rule__Parameter__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5013:1: ( rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )? )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5014:2: rule__Parameter__UnorderedGroup_3__Impl ( rule__Parameter__UnorderedGroup_3__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__210464);
            rule__Parameter__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5015:2: ( rule__Parameter__UnorderedGroup_3__3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13||LA41_0==49) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5015:2: rule__Parameter__UnorderedGroup_3__3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__3_in_rule__Parameter__UnorderedGroup_3__210467);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5022:1: rule__Parameter__UnorderedGroup_3__3 : rule__Parameter__UnorderedGroup_3__Impl ;
    public final void rule__Parameter__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5026:1: ( rule__Parameter__UnorderedGroup_3__Impl )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5027:2: rule__Parameter__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__310492);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5042:1: rule__Configurator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Configurator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5046:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5047:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5047:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5048:1: RULE_ID
            {
             before(grammarAccess.getConfiguratorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Configurator__NameAssignment_110528); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5057:1: rule__Configurator__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Configurator__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5061:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5062:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5062:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5063:1: RULE_STRING
            {
             before(grammarAccess.getConfiguratorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Configurator__DescriptionAssignment_210559); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5072:1: rule__Configurator__ParametersAssignment_4 : ( ruleAbstractParameter ) ;
    public final void rule__Configurator__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5076:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5077:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5077:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5078:1: ruleAbstractParameter
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_410590);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5087:1: rule__Configurator__ParametersAssignment_5_1 : ( ruleAbstractParameter ) ;
    public final void rule__Configurator__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5091:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5092:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5092:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5093:1: ruleAbstractParameter
            {
             before(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_5_110621);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5102:1: rule__ParameterGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5106:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5107:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5107:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5108:1: RULE_ID
            {
             before(grammarAccess.getParameterGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ParameterGroup__NameAssignment_110652); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5117:1: rule__ParameterGroup__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ParameterGroup__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5121:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5122:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5122:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5123:1: RULE_STRING
            {
             before(grammarAccess.getParameterGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ParameterGroup__DescriptionAssignment_210683); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5132:1: rule__ParameterGroup__VisibilityAssignment_3_0_1 : ( ruleExpression ) ;
    public final void rule__ParameterGroup__VisibilityAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5136:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5137:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5137:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5138:1: ruleExpression
            {
             before(grammarAccess.getParameterGroupAccess().getVisibilityExpressionParserRuleCall_3_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ParameterGroup__VisibilityAssignment_3_0_110714);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5147:1: rule__ParameterGroup__ConstraintsAssignment_3_1_2 : ( ruleConstraint ) ;
    public final void rule__ParameterGroup__ConstraintsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5151:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5152:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5152:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5153:1: ruleConstraint
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_210745);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5162:1: rule__ParameterGroup__ConstraintsAssignment_3_1_3_1 : ( ruleConstraint ) ;
    public final void rule__ParameterGroup__ConstraintsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5166:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5167:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5167:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5168:1: ruleConstraint
            {
             before(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_3_110776);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5177:1: rule__ParameterGroup__ParametersAssignment_3_2_1 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterGroup__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5181:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5182:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5182:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5183:1: ruleAbstractParameter
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_110807);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5192:1: rule__ParameterGroup__ParametersAssignment_3_2_2_1 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterGroup__ParametersAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5196:1: ( ( ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5197:1: ( ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5197:1: ( ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5198:1: ruleAbstractParameter
            {
             before(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_2_110838);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5207:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5211:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5212:1: ( RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5212:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5213:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_110869); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5222:1: rule__Parameter__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Parameter__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5226:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5227:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5227:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5228:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_210900); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5237:1: rule__Parameter__MandatoryAssignment_3_0_0 : ( ( 'mandatory' ) ) ;
    public final void rule__Parameter__MandatoryAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5241:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5242:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5242:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5243:1: ( 'mandatory' )
            {
             before(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5244:1: ( 'mandatory' )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5245:1: 'mandatory'
            {
             before(grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Parameter__MandatoryAssignment_3_0_010936); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5260:1: rule__Parameter__VisibilityAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__Parameter__VisibilityAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5264:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5265:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5265:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5266:1: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getVisibilityExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__VisibilityAssignment_3_1_110975);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5275:1: rule__Parameter__ConstraintsAssignment_3_2_2 : ( ruleConstraint ) ;
    public final void rule__Parameter__ConstraintsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5279:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5280:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5280:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5281:1: ruleConstraint
            {
             before(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_2_211006);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_2_2_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5290:1: rule__Parameter__ConstraintsAssignment_3_2_3_1 : ( ruleConstraint ) ;
    public final void rule__Parameter__ConstraintsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5294:1: ( ( ruleConstraint ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5295:1: ( ruleConstraint )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5295:1: ( ruleConstraint )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5296:1: ruleConstraint
            {
             before(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_2_3_111037);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_2_3_1_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5305:1: rule__Parameter__ValueRangeAssignment_3_3_1 : ( ruleValueRange ) ;
    public final void rule__Parameter__ValueRangeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5309:1: ( ( ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5310:1: ( ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5310:1: ( ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5311:1: ruleValueRange
            {
             before(grammarAccess.getParameterAccess().getValueRangeValueRangeParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_rule__Parameter__ValueRangeAssignment_3_3_111068);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5320:1: rule__Enumerated__ValuesAssignment_1 : ( ruleExpression ) ;
    public final void rule__Enumerated__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5324:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5325:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5325:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5326:1: ruleExpression
            {
             before(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_111099);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5335:1: rule__Enumerated__ValuesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Enumerated__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5339:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5340:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5340:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5341:1: ruleExpression
            {
             before(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_2_111130);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5350:1: rule__Bounded__LowerBoundAssignment_1 : ( ruleExpression ) ;
    public final void rule__Bounded__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5354:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5355:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5355:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5356:1: ruleExpression
            {
             before(grammarAccess.getBoundedAccess().getLowerBoundExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Bounded__LowerBoundAssignment_111161);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5365:1: rule__Bounded__UpperBoundAssignment_3 : ( ruleExpression ) ;
    public final void rule__Bounded__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5369:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5370:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5370:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5371:1: ruleExpression
            {
             before(grammarAccess.getBoundedAccess().getUpperBoundExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Bounded__UpperBoundAssignment_311192);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5380:1: rule__Constraint__DescriptionAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__DescriptionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5384:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5385:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5385:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5386:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Constraint__DescriptionAssignment_0_111223); 
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


    // $ANTLR start "rule__Constraint__ExprAssignment_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5395:1: rule__Constraint__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__Constraint__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5399:1: ( ( ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5400:1: ( ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5400:1: ( ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5401:1: ruleExpression
            {
             before(grammarAccess.getConstraintAccess().getExprExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Constraint__ExprAssignment_111254);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExprExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExprAssignment_1"


    // $ANTLR start "rule__Disjunctive__OperatorAssignment_1_1"
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5410:1: rule__Disjunctive__OperatorAssignment_1_1 : ( ruleDisjunctiveOperator ) ;
    public final void rule__Disjunctive__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5414:1: ( ( ruleDisjunctiveOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5415:1: ( ruleDisjunctiveOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5415:1: ( ruleDisjunctiveOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5416:1: ruleDisjunctiveOperator
            {
             before(grammarAccess.getDisjunctiveAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctiveOperator_in_rule__Disjunctive__OperatorAssignment_1_111285);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5425:1: rule__Disjunctive__RightAssignment_1_2 : ( ruleConjunctive ) ;
    public final void rule__Disjunctive__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5429:1: ( ( ruleConjunctive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5430:1: ( ruleConjunctive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5430:1: ( ruleConjunctive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5431:1: ruleConjunctive
            {
             before(grammarAccess.getDisjunctiveAccess().getRightConjunctiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_rule__Disjunctive__RightAssignment_1_211316);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5440:1: rule__Conjunctive__OperatorAssignment_1_1 : ( ruleConjunctiveOperator ) ;
    public final void rule__Conjunctive__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5444:1: ( ( ruleConjunctiveOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5445:1: ( ruleConjunctiveOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5445:1: ( ruleConjunctiveOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5446:1: ruleConjunctiveOperator
            {
             before(grammarAccess.getConjunctiveAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctiveOperator_in_rule__Conjunctive__OperatorAssignment_1_111347);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5455:1: rule__Conjunctive__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__Conjunctive__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5459:1: ( ( ruleEquality ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5460:1: ( ruleEquality )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5460:1: ( ruleEquality )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5461:1: ruleEquality
            {
             before(grammarAccess.getConjunctiveAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_rule__Conjunctive__RightAssignment_1_211378);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5470:1: rule__Equality__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__Equality__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5474:1: ( ( ruleEqualityOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5475:1: ( ruleEqualityOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5475:1: ( ruleEqualityOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5476:1: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_111409);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5485:1: rule__Equality__RightAssignment_1_2 : ( ruleComparative ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5489:1: ( ( ruleComparative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5490:1: ( ruleComparative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5490:1: ( ruleComparative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5491:1: ruleComparative
            {
             before(grammarAccess.getEqualityAccess().getRightComparativeParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_rule__Equality__RightAssignment_1_211440);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5500:1: rule__Comparative__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__Comparative__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5504:1: ( ( ruleComparativeOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5505:1: ( ruleComparativeOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5505:1: ( ruleComparativeOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5506:1: ruleComparativeOperator
            {
             before(grammarAccess.getComparativeAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparativeOperator_in_rule__Comparative__OperatorAssignment_1_111471);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5515:1: rule__Comparative__RightAssignment_1_2 : ( ruleAdditive ) ;
    public final void rule__Comparative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5519:1: ( ( ruleAdditive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5520:1: ( ruleAdditive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5520:1: ( ruleAdditive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5521:1: ruleAdditive
            {
             before(grammarAccess.getComparativeAccess().getRightAdditiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_rule__Comparative__RightAssignment_1_211502);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5530:1: rule__Additive__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__Additive__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5534:1: ( ( ruleAdditiveOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5535:1: ( ruleAdditiveOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5535:1: ( ruleAdditiveOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5536:1: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveOperator_in_rule__Additive__OperatorAssignment_1_111533);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5545:1: rule__Additive__RightAssignment_1_2 : ( ruleMultiplicative ) ;
    public final void rule__Additive__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5549:1: ( ( ruleMultiplicative ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5550:1: ( ruleMultiplicative )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5550:1: ( ruleMultiplicative )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5551:1: ruleMultiplicative
            {
             before(grammarAccess.getAdditiveAccess().getRightMultiplicativeParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_rule__Additive__RightAssignment_1_211564);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5560:1: rule__Multiplicative__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__Multiplicative__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5564:1: ( ( ruleMultiplicativeOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5565:1: ( ruleMultiplicativeOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5565:1: ( ruleMultiplicativeOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5566:1: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeOperator_in_rule__Multiplicative__OperatorAssignment_1_111595);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5575:1: rule__Multiplicative__RightAssignment_1_2 : ( rulePrimitive ) ;
    public final void rule__Multiplicative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5579:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5580:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5580:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5581:1: rulePrimitive
            {
             before(grammarAccess.getMultiplicativeAccess().getRightPrimitiveParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Multiplicative__RightAssignment_1_211626);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5590:1: rule__Unary__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__Unary__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5594:1: ( ( ruleUnaryOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5595:1: ( ruleUnaryOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5595:1: ( ruleUnaryOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5596:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__Unary__OperatorAssignment_011657);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5605:1: rule__Unary__InnerAssignment_1 : ( rulePrimitive ) ;
    public final void rule__Unary__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5609:1: ( ( rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5610:1: ( rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5610:1: ( rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5611:1: rulePrimitive
            {
             before(grammarAccess.getUnaryAccess().getInnerPrimitiveParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Unary__InnerAssignment_111688);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5620:1: rule__Scalar__OperatorAssignment_0 : ( ruleScalarOperator ) ;
    public final void rule__Scalar__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5624:1: ( ( ruleScalarOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5625:1: ( ruleScalarOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5625:1: ( ruleScalarOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5626:1: ruleScalarOperator
            {
             before(grammarAccess.getScalarAccess().getOperatorScalarOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScalarOperator_in_rule__Scalar__OperatorAssignment_011719);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5635:1: rule__Scalar__IdAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Scalar__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5639:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5640:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5640:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5641:1: ( RULE_ID )
            {
             before(grammarAccess.getScalarAccess().getIdParameterGroupCrossReference_2_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5642:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5643:1: RULE_ID
            {
             before(grammarAccess.getScalarAccess().getIdParameterGroupIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scalar__IdAssignment_211754); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5654:1: rule__InRange__ParameterAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InRange__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5658:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5659:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5659:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5660:1: ( RULE_ID )
            {
             before(grammarAccess.getInRangeAccess().getParameterParameterCrossReference_0_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5661:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5662:1: RULE_ID
            {
             before(grammarAccess.getInRangeAccess().getParameterParameterIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__InRange__ParameterAssignment_011793); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5673:1: rule__InRange__RangeAssignment_2 : ( ruleValueRange ) ;
    public final void rule__InRange__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5677:1: ( ( ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5678:1: ( ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5678:1: ( ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5679:1: ruleValueRange
            {
             before(grammarAccess.getInRangeAccess().getRangeValueRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_rule__InRange__RangeAssignment_211828);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5688:1: rule__Integer__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Integer__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5692:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5693:1: ( ruleEInt )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5693:1: ( ruleEInt )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5694:1: ruleEInt
            {
             before(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment11859);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5703:1: rule__Double__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__Double__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5707:1: ( ( ruleEDouble ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5708:1: ( ruleEDouble )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5708:1: ( ruleEDouble )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5709:1: ruleEDouble
            {
             before(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Double__ValueAssignment11890);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5718:1: rule__Boolean__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5722:1: ( ( ruleEBoolean ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5723:1: ( ruleEBoolean )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5723:1: ( ruleEBoolean )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5724:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment11921);
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5733:1: rule__String0__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__String0__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5737:1: ( ( RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5738:1: ( RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5738:1: ( RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5739:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__String0__ValueAssignment11952); 
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
    // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5748:1: rule__Identifier__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Identifier__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5752:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5753:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5753:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5754:1: ( RULE_ID )
            {
             before(grammarAccess.getIdentifierAccess().getIdParameterCrossReference_0()); 
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5755:1: ( RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax.ui/src-gen/dk/itu/smdp2015/church/ui/contentassist/antlr/internal/InternalConfigurator.g:5756:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment11987); 
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
        "\3\uffff\1\11\1\13\7\uffff";
    static final String DFA4_minS =
        "\1\4\2\uffff\2\13\7\uffff";
    static final String DFA4_maxS =
        "\1\60\2\uffff\2\61\7\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\11\1\10\1\3\1\4";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\3\1\7\11\uffff\2\6\7\uffff\1\1\2\uffff\1\1\3\2\11\uffff"+
            "\1\10\6\uffff\1\5",
            "",
            "",
            "\3\11\4\uffff\12\11\5\uffff\10\11\1\uffff\1\11\1\uffff\2\11"+
            "\1\uffff\1\12\1\uffff\1\11",
            "\3\13\4\uffff\12\13\5\uffff\10\13\1\uffff\1\13\1\uffff\2\13"+
            "\2\uffff\1\5\1\13",
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
            return "1040:1: rule__Primitive__Alternatives : ( ( ruleUnary ) | ( ruleScalar ) | ( ruleInRange ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleBoolean ) | ( ruleString0 ) | ( ruleIdentifier ) | ( ( rule__Primitive__Group_8__0 ) ) );";
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
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctive_in_ruleExpression574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctive_in_entryRuleDisjunctive600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisjunctive607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__0_in_ruleDisjunctive633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_entryRuleConjunctive660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConjunctive667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__0_in_ruleConjunctive693 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleScalar_in_entryRuleScalar1080 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScalar1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__0_in_ruleScalar1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_entryRuleInRange1142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInRange1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__0_in_ruleInRange1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble1262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDouble1269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Double__ValueAssignment_in_ruleDouble1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__ValueAssignment_in_ruleString01415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1502 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDisjunctiveOperator1692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleConjunctiveOperator1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditiveOperator__Alternatives_in_ruleAdditiveOperator1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicativeOperator__Alternatives_in_ruleMultiplicativeOperator1877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScalarOperator__Alternatives_in_ruleScalarOperator1949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterGroup_in_rule__AbstractParameter__Alternatives1984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__AbstractParameter__Alternatives2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__MandatoryAssignment_3_0_0_in_rule__Parameter__Alternatives_3_02033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Parameter__Alternatives_3_02052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerated_in_rule__ValueRange__Alternatives2086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBounded_in_rule__ValueRange__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_rule__Primitive__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalar_in_rule__Primitive__Alternatives2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_rule__Primitive__Alternatives2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__Primitive__Alternatives2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_rule__Primitive__Alternatives2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Primitive__Alternatives2220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Primitive__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Primitive__Alternatives2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__0_in_rule__Primitive__Alternatives2271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EDouble__Alternatives_3_02306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EDouble__Alternatives_3_02326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EBoolean__Alternatives2361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__EBoolean__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EqualityOperator__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EqualityOperator__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ComparativeOperator__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ComparativeOperator__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ComparativeOperator__Alternatives2515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ComparativeOperator__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AdditiveOperator__Alternatives2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AdditiveOperator__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MultiplicativeOperator__Alternatives2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MultiplicativeOperator__Alternatives2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__UnaryOperator__Alternatives2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__UnaryOperator__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ScalarOperator__Alternatives2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ScalarOperator__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ScalarOperator__Alternatives2785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__02818 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__02821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Configurator__Group__0__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__12880 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__12883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__NameAssignment_1_in_rule__Configurator__Group__1__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__22940 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__22943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__DescriptionAssignment_2_in_rule__Configurator__Group__2__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__33001 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__33004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Configurator__Group__3__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__43063 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__43066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__ParametersAssignment_4_in_rule__Configurator__Group__4__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__53123 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__53126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl3153 = new BitSet(new long[]{0x0000009800000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__63184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Configurator__Group__6__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__03257 = new BitSet(new long[]{0x0000009800000000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__03260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Configurator__Group_5__0__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__13322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__ParametersAssignment_5_1_in_rule__Configurator__Group_5__1__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__0__Impl_in_rule__ParameterGroup__Group__03383 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__1_in_rule__ParameterGroup__Group__03386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ParameterGroup__Group__0__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__1__Impl_in_rule__ParameterGroup__Group__13445 = new BitSet(new long[]{0x0000006200000040L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__2_in_rule__ParameterGroup__Group__13448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__NameAssignment_1_in_rule__ParameterGroup__Group__1__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__2__Impl_in_rule__ParameterGroup__Group__23505 = new BitSet(new long[]{0x0000006200000040L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__3_in_rule__ParameterGroup__Group__23508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__DescriptionAssignment_2_in_rule__ParameterGroup__Group__2__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group__3__Impl_in_rule__ParameterGroup__Group__33566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3_in_rule__ParameterGroup__Group__3__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__0__Impl_in_rule__ParameterGroup__Group_3_0__03631 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__1_in_rule__ParameterGroup__Group_3_0__03634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ParameterGroup__Group_3_0__0__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__1__Impl_in_rule__ParameterGroup__Group_3_0__13693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__VisibilityAssignment_3_0_1_in_rule__ParameterGroup__Group_3_0__1__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__0__Impl_in_rule__ParameterGroup__Group_3_1__03754 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__1_in_rule__ParameterGroup__Group_3_1__03757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ParameterGroup__Group_3_1__0__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__1__Impl_in_rule__ParameterGroup__Group_3_1__13816 = new BitSet(new long[]{0x00014200F2030070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__2_in_rule__ParameterGroup__Group_3_1__13819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ParameterGroup__Group_3_1__1__Impl3847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__2__Impl_in_rule__ParameterGroup__Group_3_1__23878 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__3_in_rule__ParameterGroup__Group_3_1__23881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_2_in_rule__ParameterGroup__Group_3_1__2__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__3__Impl_in_rule__ParameterGroup__Group_3_1__33938 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__4_in_rule__ParameterGroup__Group_3_1__33941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__0_in_rule__ParameterGroup__Group_3_1__3__Impl3968 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__4__Impl_in_rule__ParameterGroup__Group_3_1__43999 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__5_in_rule__ParameterGroup__Group_3_1__44002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_1__4__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__5__Impl_in_rule__ParameterGroup__Group_3_1__54064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ParameterGroup__Group_3_1__5__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__0__Impl_in_rule__ParameterGroup__Group_3_1_3__04135 = new BitSet(new long[]{0x00014200F2030070L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__1_in_rule__ParameterGroup__Group_3_1_3__04138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_1_3__0__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1_3__1__Impl_in_rule__ParameterGroup__Group_3_1_3__14197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ConstraintsAssignment_3_1_3_1_in_rule__ParameterGroup__Group_3_1_3__1__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__0__Impl_in_rule__ParameterGroup__Group_3_2__04258 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__1_in_rule__ParameterGroup__Group_3_2__04261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ParameterGroup__Group_3_2__0__Impl4289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__1__Impl_in_rule__ParameterGroup__Group_3_2__14320 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__2_in_rule__ParameterGroup__Group_3_2__14323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_1_in_rule__ParameterGroup__Group_3_2__1__Impl4350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__2__Impl_in_rule__ParameterGroup__Group_3_2__24380 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__3_in_rule__ParameterGroup__Group_3_2__24383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__0_in_rule__ParameterGroup__Group_3_2__2__Impl4410 = new BitSet(new long[]{0x0000009800000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__3__Impl_in_rule__ParameterGroup__Group_3_2__34441 = new BitSet(new long[]{0x0000009C00000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__4_in_rule__ParameterGroup__Group_3_2__34444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_2__3__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__4__Impl_in_rule__ParameterGroup__Group_3_2__44506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ParameterGroup__Group_3_2__4__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__0__Impl_in_rule__ParameterGroup__Group_3_2_2__04575 = new BitSet(new long[]{0x0000009800000000L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__1_in_rule__ParameterGroup__Group_3_2_2__04578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ParameterGroup__Group_3_2_2__0__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2_2__1__Impl_in_rule__ParameterGroup__Group_3_2_2__14640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__ParametersAssignment_3_2_2_1_in_rule__ParameterGroup__Group_3_2_2__1__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04701 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Parameter__Group__0__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14763 = new BitSet(new long[]{0x0002016000002040L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24823 = new BitSet(new long[]{0x0002016000002040L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_2_in_rule__Parameter__Group__2__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3_in_rule__Parameter__Group__3__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__0__Impl_in_rule__Parameter__Group_3_1__04949 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__1_in_rule__Parameter__Group_3_1__04952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Parameter__Group_3_1__0__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__1__Impl_in_rule__Parameter__Group_3_1__15011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__VisibilityAssignment_3_1_1_in_rule__Parameter__Group_3_1__1__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__05072 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__05075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Parameter__Group_3_2__0__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__15134 = new BitSet(new long[]{0x00014200F2030070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__2_in_rule__Parameter__Group_3_2__15137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter__Group_3_2__1__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__2__Impl_in_rule__Parameter__Group_3_2__25196 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__3_in_rule__Parameter__Group_3_2__25199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_2_in_rule__Parameter__Group_3_2__2__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__3__Impl_in_rule__Parameter__Group_3_2__35256 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__4_in_rule__Parameter__Group_3_2__35259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__0_in_rule__Parameter__Group_3_2__3__Impl5286 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__4__Impl_in_rule__Parameter__Group_3_2__45317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Parameter__Group_3_2__4__Impl5345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__0__Impl_in_rule__Parameter__Group_3_2_3__05386 = new BitSet(new long[]{0x00014200F2030070L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__1_in_rule__Parameter__Group_3_2_3__05389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Parameter__Group_3_2_3__0__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2_3__1__Impl_in_rule__Parameter__Group_3_2_3__15448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ConstraintsAssignment_3_2_3_1_in_rule__Parameter__Group_3_2_3__1__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__0__Impl_in_rule__Parameter__Group_3_3__05509 = new BitSet(new long[]{0x00000A0000000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__1_in_rule__Parameter__Group_3_3__05512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Parameter__Group_3_3__0__Impl5540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__1__Impl_in_rule__Parameter__Group_3_3__15571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ValueRangeAssignment_3_3_1_in_rule__Parameter__Group_3_3__1__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__0__Impl_in_rule__Enumerated__Group__05632 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__1_in_rule__Enumerated__Group__05635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Enumerated__Group__0__Impl5663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__1__Impl_in_rule__Enumerated__Group__15694 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__2_in_rule__Enumerated__Group__15697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__ValuesAssignment_1_in_rule__Enumerated__Group__1__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__2__Impl_in_rule__Enumerated__Group__25754 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__3_in_rule__Enumerated__Group__25757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__0_in_rule__Enumerated__Group__2__Impl5784 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group__3__Impl_in_rule__Enumerated__Group__35815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Enumerated__Group__3__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__0__Impl_in_rule__Enumerated__Group_2__05882 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__1_in_rule__Enumerated__Group_2__05885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Enumerated__Group_2__0__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__Group_2__1__Impl_in_rule__Enumerated__Group_2__15944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumerated__ValuesAssignment_2_1_in_rule__Enumerated__Group_2__1__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__0__Impl_in_rule__Bounded__Group__06005 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Bounded__Group__1_in_rule__Bounded__Group__06008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Bounded__Group__0__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__1__Impl_in_rule__Bounded__Group__16067 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Bounded__Group__2_in_rule__Bounded__Group__16070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__LowerBoundAssignment_1_in_rule__Bounded__Group__1__Impl6097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__2__Impl_in_rule__Bounded__Group__26127 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Bounded__Group__3_in_rule__Bounded__Group__26130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Bounded__Group__2__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__3__Impl_in_rule__Bounded__Group__36189 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Bounded__Group__4_in_rule__Bounded__Group__36192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__UpperBoundAssignment_3_in_rule__Bounded__Group__3__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bounded__Group__4__Impl_in_rule__Bounded__Group__46249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Bounded__Group__4__Impl6277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__06318 = new BitSet(new long[]{0x00014200F2030070L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__06321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__0_in_rule__Constraint__Group__0__Impl6348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__ExprAssignment_1_in_rule__Constraint__Group__1__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__0__Impl_in_rule__Constraint__Group_0__06440 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__1_in_rule__Constraint__Group_0__06443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Constraint__Group_0__0__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_0__1__Impl_in_rule__Constraint__Group_0__16502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__DescriptionAssignment_0_1_in_rule__Constraint__Group_0__1__Impl6529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__0__Impl_in_rule__Disjunctive__Group__06563 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__1_in_rule__Disjunctive__Group__06566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_rule__Disjunctive__Group__0__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group__1__Impl_in_rule__Disjunctive__Group__16622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__0_in_rule__Disjunctive__Group__1__Impl6649 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__0__Impl_in_rule__Disjunctive__Group_1__06684 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__1_in_rule__Disjunctive__Group_1__06687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__1__Impl_in_rule__Disjunctive__Group_1__16745 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__2_in_rule__Disjunctive__Group_1__16748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__OperatorAssignment_1_1_in_rule__Disjunctive__Group_1__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__Group_1__2__Impl_in_rule__Disjunctive__Group_1__26805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disjunctive__RightAssignment_1_2_in_rule__Disjunctive__Group_1__2__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__0__Impl_in_rule__Conjunctive__Group__06868 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__1_in_rule__Conjunctive__Group__06871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunctive__Group__0__Impl6898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group__1__Impl_in_rule__Conjunctive__Group__16927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__0_in_rule__Conjunctive__Group__1__Impl6954 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__0__Impl_in_rule__Conjunctive__Group_1__06989 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__1_in_rule__Conjunctive__Group_1__06992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__1__Impl_in_rule__Conjunctive__Group_1__17050 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__2_in_rule__Conjunctive__Group_1__17053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__OperatorAssignment_1_1_in_rule__Conjunctive__Group_1__1__Impl7080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__Group_1__2__Impl_in_rule__Conjunctive__Group_1__27110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conjunctive__RightAssignment_1_2_in_rule__Conjunctive__Group_1__2__Impl7137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__07173 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__07176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_rule__Equality__Group__0__Impl7203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__17232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl7259 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__07294 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__07297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__17355 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__17358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl7385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__27415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__0__Impl_in_rule__Comparative__Group__07478 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Comparative__Group__1_in_rule__Comparative__Group__07481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_rule__Comparative__Group__0__Impl7508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group__1__Impl_in_rule__Comparative__Group__17537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__0_in_rule__Comparative__Group__1__Impl7564 = new BitSet(new long[]{0x0000000000F00002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__0__Impl_in_rule__Comparative__Group_1__07599 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__1_in_rule__Comparative__Group_1__07602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__1__Impl_in_rule__Comparative__Group_1__17660 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__2_in_rule__Comparative__Group_1__17663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__OperatorAssignment_1_1_in_rule__Comparative__Group_1__1__Impl7690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__Group_1__2__Impl_in_rule__Comparative__Group_1__27720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparative__RightAssignment_1_2_in_rule__Comparative__Group_1__2__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__0__Impl_in_rule__Additive__Group__07783 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Additive__Group__1_in_rule__Additive__Group__07786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_rule__Additive__Group__0__Impl7813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group__1__Impl_in_rule__Additive__Group__17842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__0_in_rule__Additive__Group__1__Impl7869 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__0__Impl_in_rule__Additive__Group_1__07904 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__1_in_rule__Additive__Group_1__07907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__1__Impl_in_rule__Additive__Group_1__17965 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__2_in_rule__Additive__Group_1__17968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__OperatorAssignment_1_1_in_rule__Additive__Group_1__1__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__Group_1__2__Impl_in_rule__Additive__Group_1__28025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Additive__RightAssignment_1_2_in_rule__Additive__Group_1__2__Impl8052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__0__Impl_in_rule__Multiplicative__Group__08088 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__1_in_rule__Multiplicative__Group__08091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Multiplicative__Group__0__Impl8118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group__1__Impl_in_rule__Multiplicative__Group__18147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__0_in_rule__Multiplicative__Group__1__Impl8174 = new BitSet(new long[]{0x000000000C000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__0__Impl_in_rule__Multiplicative__Group_1__08209 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__1_in_rule__Multiplicative__Group_1__08212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__1__Impl_in_rule__Multiplicative__Group_1__18270 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__2_in_rule__Multiplicative__Group_1__18273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__OperatorAssignment_1_1_in_rule__Multiplicative__Group_1__1__Impl8300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__Group_1__2__Impl_in_rule__Multiplicative__Group_1__28330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Multiplicative__RightAssignment_1_2_in_rule__Multiplicative__Group_1__2__Impl8357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__0__Impl_in_rule__Primitive__Group_8__08393 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__1_in_rule__Primitive__Group_8__08396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Primitive__Group_8__0__Impl8424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__1__Impl_in_rule__Primitive__Group_8__18455 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__2_in_rule__Primitive__Group_8__18458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Primitive__Group_8__1__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group_8__2__Impl_in_rule__Primitive__Group_8__28514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Primitive__Group_8__2__Impl8542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08579 = new BitSet(new long[]{0x00010200F2030070L});
        public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__OperatorAssignment_0_in_rule__Unary__Group__0__Impl8609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unary__InnerAssignment_1_in_rule__Unary__Group__1__Impl8666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__0__Impl_in_rule__Scalar__Group__08700 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Scalar__Group__1_in_rule__Scalar__Group__08703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__OperatorAssignment_0_in_rule__Scalar__Group__0__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__1__Impl_in_rule__Scalar__Group__18760 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Scalar__Group__2_in_rule__Scalar__Group__18763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Scalar__Group__1__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__2__Impl_in_rule__Scalar__Group__28822 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Scalar__Group__3_in_rule__Scalar__Group__28825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__IdAssignment_2_in_rule__Scalar__Group__2__Impl8852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scalar__Group__3__Impl_in_rule__Scalar__Group__38882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Scalar__Group__3__Impl8910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__0__Impl_in_rule__InRange__Group__08949 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__InRange__Group__1_in_rule__InRange__Group__08952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__ParameterAssignment_0_in_rule__InRange__Group__0__Impl8979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__1__Impl_in_rule__InRange__Group__19009 = new BitSet(new long[]{0x00000A0000000000L});
        public static final BitSet FOLLOW_rule__InRange__Group__2_in_rule__InRange__Group__19012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__InRange__Group__1__Impl9040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__Group__2__Impl_in_rule__InRange__Group__29071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InRange__RangeAssignment_2_in_rule__InRange__Group__2__Impl9098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09134 = new BitSet(new long[]{0x0001000000000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__0__Impl9165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19196 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__EDouble__Group__1__Impl9227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29258 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__29261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__2__Impl9288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__0_in_rule__EDouble__Group__3__Impl9344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__0__Impl_in_rule__EDouble__Group_3__09383 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__1_in_rule__EDouble__Group_3__09386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_3_0_in_rule__EDouble__Group_3__0__Impl9413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__1__Impl_in_rule__EDouble__Group_3__19443 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__2_in_rule__EDouble__Group_3__19446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__EDouble__Group_3__1__Impl9475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_3__2__Impl_in_rule__EDouble__Group_3__29508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_3__2__Impl9535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__0_in_rule__ParameterGroup__UnorderedGroup_39571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_0__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_1__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__Group_3_2__0_in_rule__ParameterGroup__UnorderedGroup_3__Impl9842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__09901 = new BitSet(new long[]{0x0000006200000042L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__1_in_rule__ParameterGroup__UnorderedGroup_3__09904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__19929 = new BitSet(new long[]{0x0000006200000042L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__2_in_rule__ParameterGroup__UnorderedGroup_3__19932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterGroup__UnorderedGroup_3__Impl_in_rule__ParameterGroup__UnorderedGroup_3__29957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__0_in_rule__Parameter__UnorderedGroup_39987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Alternatives_3_0_in_rule__Parameter__UnorderedGroup_3__Impl10076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_1__0_in_rule__Parameter__UnorderedGroup_3__Impl10167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__UnorderedGroup_3__Impl10258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3_3__0_in_rule__Parameter__UnorderedGroup_3__Impl10349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__010408 = new BitSet(new long[]{0x0002016000002042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__1_in_rule__Parameter__UnorderedGroup_3__010411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__110436 = new BitSet(new long[]{0x0002016000002042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__2_in_rule__Parameter__UnorderedGroup_3__110439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__210464 = new BitSet(new long[]{0x0002016000002042L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__3_in_rule__Parameter__UnorderedGroup_3__210467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__UnorderedGroup_3__Impl_in_rule__Parameter__UnorderedGroup_3__310492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Configurator__NameAssignment_110528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Configurator__DescriptionAssignment_210559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_410590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__Configurator__ParametersAssignment_5_110621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterGroup__NameAssignment_110652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ParameterGroup__DescriptionAssignment_210683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterGroup__VisibilityAssignment_3_0_110714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_210745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ParameterGroup__ConstraintsAssignment_3_1_3_110776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_110807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_rule__ParameterGroup__ParametersAssignment_3_2_2_110838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_110869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_210900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Parameter__MandatoryAssignment_3_0_010936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__VisibilityAssignment_3_1_110975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_2_211006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__Parameter__ConstraintsAssignment_3_2_3_111037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueRange_in_rule__Parameter__ValueRangeAssignment_3_3_111068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_111099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Enumerated__ValuesAssignment_2_111130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Bounded__LowerBoundAssignment_111161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Bounded__UpperBoundAssignment_311192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__DescriptionAssignment_0_111223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Constraint__ExprAssignment_111254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctiveOperator_in_rule__Disjunctive__OperatorAssignment_1_111285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_rule__Disjunctive__RightAssignment_1_211316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctiveOperator_in_rule__Conjunctive__OperatorAssignment_1_111347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunctive__RightAssignment_1_211378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_111409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_rule__Equality__RightAssignment_1_211440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparativeOperator_in_rule__Comparative__OperatorAssignment_1_111471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_rule__Comparative__RightAssignment_1_211502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveOperator_in_rule__Additive__OperatorAssignment_1_111533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_rule__Additive__RightAssignment_1_211564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_rule__Multiplicative__OperatorAssignment_1_111595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Multiplicative__RightAssignment_1_211626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Unary__OperatorAssignment_011657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Unary__InnerAssignment_111688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalarOperator_in_rule__Scalar__OperatorAssignment_011719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scalar__IdAssignment_211754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__InRange__ParameterAssignment_011793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueRange_in_rule__InRange__RangeAssignment_211828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment11859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Double__ValueAssignment11890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment11921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__String0__ValueAssignment11952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment11987 = new BitSet(new long[]{0x0000000000000002L});
    }


}