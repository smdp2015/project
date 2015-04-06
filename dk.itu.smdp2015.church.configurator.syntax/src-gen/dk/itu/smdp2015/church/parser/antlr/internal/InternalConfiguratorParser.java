package dk.itu.smdp2015.church.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.smdp2015.church.services.ConfiguratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfiguratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configurator'", "'{'", "','", "'}'", "'group'", "'visible-if'", "'constraints'", "'parameter'", "'mandatory'", "'optional'", "'values'", "'('", "')'", "'['", "';'", "']'", "'description'", "'in'", "'.'", "'E'", "'e'", "'-'", "'true'", "'false'", "'or'", "'and'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", "'/'", "'not'", "'sum'", "'min'", "'max'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g"; }



     	private ConfiguratorGrammarAccess grammarAccess;
     	
        public InternalConfiguratorParser(TokenStream input, ConfiguratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Configurator";	
       	}
       	
       	@Override
       	protected ConfiguratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfigurator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:68:1: entryRuleConfigurator returns [EObject current=null] : iv_ruleConfigurator= ruleConfigurator EOF ;
    public final EObject entryRuleConfigurator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurator = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:69:2: (iv_ruleConfigurator= ruleConfigurator EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:70:2: iv_ruleConfigurator= ruleConfigurator EOF
            {
             newCompositeNode(grammarAccess.getConfiguratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurator_in_entryRuleConfigurator75);
            iv_ruleConfigurator=ruleConfigurator();

            state._fsp--;

             current =iv_ruleConfigurator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurator85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurator"


    // $ANTLR start "ruleConfigurator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:77:1: ruleConfigurator returns [EObject current=null] : (otherlv_0= 'configurator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_parameters_4_0= ruleAbstractParameter ) ) ( (otherlv_5= ',' )? ( (lv_parameters_6_0= ruleAbstractParameter ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleConfigurator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:80:28: ( (otherlv_0= 'configurator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_parameters_4_0= ruleAbstractParameter ) ) ( (otherlv_5= ',' )? ( (lv_parameters_6_0= ruleAbstractParameter ) ) )* otherlv_7= '}' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:81:1: (otherlv_0= 'configurator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_parameters_4_0= ruleAbstractParameter ) ) ( (otherlv_5= ',' )? ( (lv_parameters_6_0= ruleAbstractParameter ) ) )* otherlv_7= '}' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:81:1: (otherlv_0= 'configurator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_parameters_4_0= ruleAbstractParameter ) ) ( (otherlv_5= ',' )? ( (lv_parameters_6_0= ruleAbstractParameter ) ) )* otherlv_7= '}' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:81:3: otherlv_0= 'configurator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_parameters_4_0= ruleAbstractParameter ) ) ( (otherlv_5= ',' )? ( (lv_parameters_6_0= ruleAbstractParameter ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConfigurator122); 

                	newLeafNode(otherlv_0, grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_0());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:86:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConfigurator139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConfiguratorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfiguratorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:103:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:104:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:104:1: (lv_description_2_0= RULE_STRING )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:105:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConfigurator161); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getConfiguratorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfiguratorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfigurator179); 

                	newLeafNode(otherlv_3, grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:125:1: ( (lv_parameters_4_0= ruleAbstractParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:126:1: (lv_parameters_4_0= ruleAbstractParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:126:1: (lv_parameters_4_0= ruleAbstractParameter )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:127:3: lv_parameters_4_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_ruleConfigurator200);
            lv_parameters_4_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfiguratorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_4_0, 
                    		"AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:143:2: ( (otherlv_5= ',' )? ( (lv_parameters_6_0= ruleAbstractParameter ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==15||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:143:3: (otherlv_5= ',' )? ( (lv_parameters_6_0= ruleAbstractParameter ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:143:3: (otherlv_5= ',' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:143:5: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfigurator214); 

            	                	newLeafNode(otherlv_5, grammarAccess.getConfiguratorAccess().getCommaKeyword_5_0());
            	                

            	            }
            	            break;

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:147:3: ( (lv_parameters_6_0= ruleAbstractParameter ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:148:1: (lv_parameters_6_0= ruleAbstractParameter )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:148:1: (lv_parameters_6_0= ruleAbstractParameter )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:149:3: lv_parameters_6_0= ruleAbstractParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfiguratorAccess().getParametersAbstractParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_ruleConfigurator237);
            	    lv_parameters_6_0=ruleAbstractParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfiguratorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_6_0, 
            	            		"AbstractParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfigurator251); 

                	newLeafNode(otherlv_7, grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurator"


    // $ANTLR start "entryRuleAbstractParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:177:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:178:2: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:179:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_entryRuleAbstractParameter287);
            iv_ruleAbstractParameter=ruleAbstractParameter();

            state._fsp--;

             current =iv_ruleAbstractParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractParameter297); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:186:1: ruleAbstractParameter returns [EObject current=null] : (this_ParameterGroup_0= ruleParameterGroup | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterGroup_0 = null;

        EObject this_Parameter_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:189:28: ( (this_ParameterGroup_0= ruleParameterGroup | this_Parameter_1= ruleParameter ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:190:1: (this_ParameterGroup_0= ruleParameterGroup | this_Parameter_1= ruleParameter )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:190:1: (this_ParameterGroup_0= ruleParameterGroup | this_Parameter_1= ruleParameter )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:191:5: this_ParameterGroup_0= ruleParameterGroup
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractParameterAccess().getParameterGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterGroup_in_ruleAbstractParameter344);
                    this_ParameterGroup_0=ruleParameterGroup();

                    state._fsp--;

                     
                            current = this_ParameterGroup_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:201:5: this_Parameter_1= ruleParameter
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractParameterAccess().getParameterParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleAbstractParameter371);
                    this_Parameter_1=ruleParameter();

                    state._fsp--;

                     
                            current = this_Parameter_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleParameterGroup"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:217:1: entryRuleParameterGroup returns [EObject current=null] : iv_ruleParameterGroup= ruleParameterGroup EOF ;
    public final EObject entryRuleParameterGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterGroup = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:218:2: (iv_ruleParameterGroup= ruleParameterGroup EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:219:2: iv_ruleParameterGroup= ruleParameterGroup EOF
            {
             newCompositeNode(grammarAccess.getParameterGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterGroup_in_entryRuleParameterGroup406);
            iv_ruleParameterGroup=ruleParameterGroup();

            state._fsp--;

             current =iv_ruleParameterGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterGroup416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterGroup"


    // $ANTLR start "ruleParameterGroup"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:226:1: ruleParameterGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleParameterGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_visibility_5_0 = null;

        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_parameters_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:229:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:230:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:230:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:230:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParameterGroup453); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:234:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:235:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:235:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:236:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameterGroup470); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:252:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:253:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:253:1: (lv_description_2_0= RULE_STRING )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:254:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleParameterGroup492); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getParameterGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:270:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:272:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:272:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:273:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:276:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:277:3: ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:277:3: ( ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:279:4: ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:279:4: ({...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:280:5: {...}? => ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameterGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:280:111: ( ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:281:6: ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:284:6: ({...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:284:7: {...}? => (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameterGroup", "true");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:284:16: (otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:284:18: otherlv_4= 'visible-if' ( (lv_visibility_5_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameterGroup556); 

            	        	newLeafNode(otherlv_4, grammarAccess.getParameterGroupAccess().getVisibleIfKeyword_3_0_0());
            	        
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:288:1: ( (lv_visibility_5_0= ruleExpression ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:289:1: (lv_visibility_5_0= ruleExpression )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:289:1: (lv_visibility_5_0= ruleExpression )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:290:3: lv_visibility_5_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterGroupAccess().getVisibilityExpressionParserRuleCall_3_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameterGroup577);
            	    lv_visibility_5_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"visibility",
            	            		lv_visibility_5_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:313:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:313:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:314:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameterGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:314:111: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:315:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:318:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:318:7: {...}? => (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameterGroup", "true");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:318:16: (otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}' )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:318:18: otherlv_6= 'constraints' otherlv_7= '{' ( (lv_constraints_8_0= ruleConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )* (otherlv_11= ',' )? otherlv_12= '}'
            	    {
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParameterGroup645); 

            	        	newLeafNode(otherlv_6, grammarAccess.getParameterGroupAccess().getConstraintsKeyword_3_1_0());
            	        
            	    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterGroup657); 

            	        	newLeafNode(otherlv_7, grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_1_1());
            	        
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:326:1: ( (lv_constraints_8_0= ruleConstraint ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:327:1: (lv_constraints_8_0= ruleConstraint )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:327:1: (lv_constraints_8_0= ruleConstraint )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:328:3: lv_constraints_8_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleParameterGroup678);
            	    lv_constraints_8_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_8_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:344:2: (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==13) ) {
            	            int LA6_1 = input.LA(2);

            	            if ( ((LA6_1>=RULE_ID && LA6_1<=RULE_INT)||LA6_1==22||LA6_1==27||LA6_1==29||(LA6_1>=32 && LA6_1<=34)||(LA6_1>=46 && LA6_1<=49)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:344:4: otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameterGroup691); 

            	    	        	newLeafNode(otherlv_9, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_3_0());
            	    	        
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:348:1: ( (lv_constraints_10_0= ruleConstraint ) )
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:349:1: (lv_constraints_10_0= ruleConstraint )
            	    	    {
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:349:1: (lv_constraints_10_0= ruleConstraint )
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:350:3: lv_constraints_10_0= ruleConstraint
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getParameterGroupAccess().getConstraintsConstraintParserRuleCall_3_1_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleParameterGroup712);
            	    	    lv_constraints_10_0=ruleConstraint();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"constraints",
            	    	            		lv_constraints_10_0, 
            	    	            		"Constraint");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:366:4: (otherlv_11= ',' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==13) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:366:6: otherlv_11= ','
            	            {
            	            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameterGroup727); 

            	                	newLeafNode(otherlv_11, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_4());
            	                

            	            }
            	            break;

            	    }

            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameterGroup741); 

            	        	newLeafNode(otherlv_12, grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_1_5());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:381:4: ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:381:4: ({...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:382:5: {...}? => ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameterGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:382:111: ( ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:383:6: ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:386:6: ({...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:386:7: {...}? => (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameterGroup", "true");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:386:16: (otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}' )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:386:18: otherlv_13= '{' ( (lv_parameters_14_0= ruleAbstractParameter ) ) ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )* (otherlv_17= ',' )? otherlv_18= '}'
            	    {
            	    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterGroup809); 

            	        	newLeafNode(otherlv_13, grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_3_2_0());
            	        
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:390:1: ( (lv_parameters_14_0= ruleAbstractParameter ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:391:1: (lv_parameters_14_0= ruleAbstractParameter )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:391:1: (lv_parameters_14_0= ruleAbstractParameter )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:392:3: lv_parameters_14_0= ruleAbstractParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_ruleParameterGroup830);
            	    lv_parameters_14_0=ruleAbstractParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_14_0, 
            	            		"AbstractParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:408:2: ( (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==13) ) {
            	            int LA9_1 = input.LA(2);

            	            if ( (LA9_1==15||LA9_1==18) ) {
            	                alt9=1;
            	            }


            	        }
            	        else if ( (LA9_0==15||LA9_0==18) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:408:3: (otherlv_15= ',' )? ( (lv_parameters_16_0= ruleAbstractParameter ) )
            	    	    {
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:408:3: (otherlv_15= ',' )?
            	    	    int alt8=2;
            	    	    int LA8_0 = input.LA(1);

            	    	    if ( (LA8_0==13) ) {
            	    	        alt8=1;
            	    	    }
            	    	    switch (alt8) {
            	    	        case 1 :
            	    	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:408:5: otherlv_15= ','
            	    	            {
            	    	            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameterGroup844); 

            	    	                	newLeafNode(otherlv_15, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_2_0());
            	    	                

            	    	            }
            	    	            break;

            	    	    }

            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:412:3: ( (lv_parameters_16_0= ruleAbstractParameter ) )
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:413:1: (lv_parameters_16_0= ruleAbstractParameter )
            	    	    {
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:413:1: (lv_parameters_16_0= ruleAbstractParameter )
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:414:3: lv_parameters_16_0= ruleAbstractParameter
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getParameterGroupAccess().getParametersAbstractParameterParserRuleCall_3_2_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractParameter_in_ruleParameterGroup867);
            	    	    lv_parameters_16_0=ruleAbstractParameter();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"parameters",
            	    	            		lv_parameters_16_0, 
            	    	            		"AbstractParameter");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:430:4: (otherlv_17= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==13) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:430:6: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameterGroup882); 

            	                	newLeafNode(otherlv_17, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_3());
            	                

            	            }
            	            break;

            	    }

            	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameterGroup896); 

            	        	newLeafNode(otherlv_18, grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_3_2_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleParameterGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterGroup"


    // $ANTLR start "entryRuleParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:461:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:462:2: (iv_ruleParameter= ruleParameter EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:463:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter979);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:470:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token lv_mandatory_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_visibility_7_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_constraints_12_0 = null;

        EObject lv_valueRange_15_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:473:28: ( (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:474:1: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:474:1: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:474:3: otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParameter1026); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:478:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:479:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:479:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:480:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameter1043); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:496:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:497:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:497:1: (lv_description_2_0= RULE_STRING )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:498:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleParameter1065); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:514:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:516:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:516:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:517:2: ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:520:2: ( ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:521:3: ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:521:3: ( ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=5;
                int LA15_0 = input.LA(1);

                if ( LA15_0 >=19 && LA15_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                    alt15=4;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:523:4: ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:523:4: ({...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:524:5: {...}? => ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:524:106: ( ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:525:6: ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:528:6: ({...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:528:7: {...}? => ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:528:16: ( ( (lv_mandatory_4_0= 'mandatory' ) ) | otherlv_5= 'optional' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==19) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==20) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:528:17: ( (lv_mandatory_4_0= 'mandatory' ) )
            	            {
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:528:17: ( (lv_mandatory_4_0= 'mandatory' ) )
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:529:1: (lv_mandatory_4_0= 'mandatory' )
            	            {
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:529:1: (lv_mandatory_4_0= 'mandatory' )
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:530:3: lv_mandatory_4_0= 'mandatory'
            	            {
            	            lv_mandatory_4_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleParameter1135); 

            	                    newLeafNode(lv_mandatory_4_0, grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_3_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getParameterRule());
            	            	        }
            	                   		setWithLastConsumed(current, "mandatory", true, "mandatory");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:544:7: otherlv_5= 'optional'
            	            {
            	            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleParameter1166); 

            	                	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getOptionalKeyword_3_0_1());
            	                

            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:555:4: ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:555:4: ({...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:556:5: {...}? => ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:556:106: ( ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:557:6: ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:560:6: ({...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:560:7: {...}? => (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:560:16: (otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:560:18: otherlv_6= 'visible-if' ( (lv_visibility_7_0= ruleExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameter1234); 

            	        	newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getVisibleIfKeyword_3_1_0());
            	        
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:564:1: ( (lv_visibility_7_0= ruleExpression ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:565:1: (lv_visibility_7_0= ruleExpression )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:565:1: (lv_visibility_7_0= ruleExpression )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:566:3: lv_visibility_7_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterAccess().getVisibilityExpressionParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameter1255);
            	    lv_visibility_7_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"visibility",
            	            		lv_visibility_7_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:589:4: ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:589:4: ({...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:590:5: {...}? => ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:590:106: ( ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:591:6: ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:594:6: ({...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:594:7: {...}? => (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:594:16: (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:594:18: otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}'
            	    {
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParameter1323); 

            	        	newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getConstraintsKeyword_3_2_0());
            	        
            	    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter1335); 

            	        	newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3_2_1());
            	        
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:602:1: ( (lv_constraints_10_0= ruleConstraint ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:603:1: (lv_constraints_10_0= ruleConstraint )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:603:1: (lv_constraints_10_0= ruleConstraint )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:604:3: lv_constraints_10_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleParameter1356);
            	    lv_constraints_10_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_10_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:620:2: (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==13) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:620:4: otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter1369); 

            	    	        	newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getCommaKeyword_3_2_3_0());
            	    	        
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:624:1: ( (lv_constraints_12_0= ruleConstraint ) )
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:625:1: (lv_constraints_12_0= ruleConstraint )
            	    	    {
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:625:1: (lv_constraints_12_0= ruleConstraint )
            	    	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:626:3: lv_constraints_12_0= ruleConstraint
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_3_2_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleParameter1390);
            	    	    lv_constraints_12_0=ruleConstraint();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"constraints",
            	    	            		lv_constraints_12_0, 
            	    	            		"Constraint");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameter1404); 

            	        	newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3_2_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:653:4: ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:653:4: ({...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:654:5: {...}? => ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:654:106: ( ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:655:6: ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:658:6: ({...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:658:7: {...}? => (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:658:16: (otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:658:18: otherlv_14= 'values' ( (lv_valueRange_15_0= ruleValueRange ) )
            	    {
            	    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter1472); 

            	        	newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getValuesKeyword_3_3_0());
            	        
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:662:1: ( (lv_valueRange_15_0= ruleValueRange ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:663:1: (lv_valueRange_15_0= ruleValueRange )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:663:1: (lv_valueRange_15_0= ruleValueRange )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:664:3: lv_valueRange_15_0= ruleValueRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterAccess().getValueRangeValueRangeParserRuleCall_3_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_ruleParameter1493);
            	    lv_valueRange_15_0=ruleValueRange();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"valueRange",
            	            		lv_valueRange_15_0, 
            	            		"ValueRange");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleValueRange"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:703:1: entryRuleValueRange returns [EObject current=null] : iv_ruleValueRange= ruleValueRange EOF ;
    public final EObject entryRuleValueRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueRange = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:704:2: (iv_ruleValueRange= ruleValueRange EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:705:2: iv_ruleValueRange= ruleValueRange EOF
            {
             newCompositeNode(grammarAccess.getValueRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_entryRuleValueRange1576);
            iv_ruleValueRange=ruleValueRange();

            state._fsp--;

             current =iv_ruleValueRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueRange1586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueRange"


    // $ANTLR start "ruleValueRange"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:712:1: ruleValueRange returns [EObject current=null] : (this_Enumerated_0= ruleEnumerated | this_Bounded_1= ruleBounded ) ;
    public final EObject ruleValueRange() throws RecognitionException {
        EObject current = null;

        EObject this_Enumerated_0 = null;

        EObject this_Bounded_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:715:28: ( (this_Enumerated_0= ruleEnumerated | this_Bounded_1= ruleBounded ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:716:1: (this_Enumerated_0= ruleEnumerated | this_Bounded_1= ruleBounded )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:716:1: (this_Enumerated_0= ruleEnumerated | this_Bounded_1= ruleBounded )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:717:5: this_Enumerated_0= ruleEnumerated
                    {
                     
                            newCompositeNode(grammarAccess.getValueRangeAccess().getEnumeratedParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerated_in_ruleValueRange1633);
                    this_Enumerated_0=ruleEnumerated();

                    state._fsp--;

                     
                            current = this_Enumerated_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:727:5: this_Bounded_1= ruleBounded
                    {
                     
                            newCompositeNode(grammarAccess.getValueRangeAccess().getBoundedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBounded_in_ruleValueRange1660);
                    this_Bounded_1=ruleBounded();

                    state._fsp--;

                     
                            current = this_Bounded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueRange"


    // $ANTLR start "entryRuleEnumerated"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:743:1: entryRuleEnumerated returns [EObject current=null] : iv_ruleEnumerated= ruleEnumerated EOF ;
    public final EObject entryRuleEnumerated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerated = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:744:2: (iv_ruleEnumerated= ruleEnumerated EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:745:2: iv_ruleEnumerated= ruleEnumerated EOF
            {
             newCompositeNode(grammarAccess.getEnumeratedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerated_in_entryRuleEnumerated1695);
            iv_ruleEnumerated=ruleEnumerated();

            state._fsp--;

             current =iv_ruleEnumerated; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerated1705); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerated"


    // $ANTLR start "ruleEnumerated"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:752:1: ruleEnumerated returns [EObject current=null] : (otherlv_0= '(' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleEnumerated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:755:28: ( (otherlv_0= '(' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= ')' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:756:1: (otherlv_0= '(' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:756:1: (otherlv_0= '(' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= ')' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:756:3: otherlv_0= '(' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEnumerated1742); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumeratedAccess().getLeftParenthesisKeyword_0());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:760:1: ( (lv_values_1_0= ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:761:1: (lv_values_1_0= ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:761:1: (lv_values_1_0= ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:762:3: lv_values_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEnumerated1763);
            lv_values_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeratedRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:778:2: (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:778:4: otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnumerated1776); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumeratedAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:782:1: ( (lv_values_3_0= ruleExpression ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:783:1: (lv_values_3_0= ruleExpression )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:783:1: (lv_values_3_0= ruleExpression )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:784:3: lv_values_3_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeratedAccess().getValuesExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEnumerated1797);
            	    lv_values_3_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumeratedRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumerated1811); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumeratedAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerated"


    // $ANTLR start "entryRuleBounded"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:812:1: entryRuleBounded returns [EObject current=null] : iv_ruleBounded= ruleBounded EOF ;
    public final EObject entryRuleBounded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBounded = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:813:2: (iv_ruleBounded= ruleBounded EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:814:2: iv_ruleBounded= ruleBounded EOF
            {
             newCompositeNode(grammarAccess.getBoundedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBounded_in_entryRuleBounded1847);
            iv_ruleBounded=ruleBounded();

            state._fsp--;

             current =iv_ruleBounded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBounded1857); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBounded"


    // $ANTLR start "ruleBounded"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:821:1: ruleBounded returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleBounded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:824:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:825:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:825:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:825:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBounded1894); 

                	newLeafNode(otherlv_0, grammarAccess.getBoundedAccess().getLeftSquareBracketKeyword_0());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:829:1: ( (lv_lowerBound_1_0= ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:830:1: (lv_lowerBound_1_0= ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:830:1: (lv_lowerBound_1_0= ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:831:3: lv_lowerBound_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBoundedAccess().getLowerBoundExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBounded1915);
            lv_lowerBound_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoundedRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBounded1927); 

                	newLeafNode(otherlv_2, grammarAccess.getBoundedAccess().getSemicolonKeyword_2());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:851:1: ( (lv_upperBound_3_0= ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:852:1: (lv_upperBound_3_0= ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:852:1: (lv_upperBound_3_0= ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:853:3: lv_upperBound_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBoundedAccess().getUpperBoundExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBounded1948);
            lv_upperBound_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoundedRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBounded1960); 

                	newLeafNode(otherlv_4, grammarAccess.getBoundedAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBounded"


    // $ANTLR start "entryRuleConstraint"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:881:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:882:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:883:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint1996);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint2006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:890:1: ruleConstraint returns [EObject current=null] : ( (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) )? ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:893:28: ( ( (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) )? ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:894:1: ( (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) )? ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:894:1: ( (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) )? ( (lv_expr_2_0= ruleExpression ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:894:2: (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) )? ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:894:2: (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:894:4: otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleConstraint2044); 

                        	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getDescriptionKeyword_0_0());
                        
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:898:1: ( (lv_description_1_0= RULE_STRING ) )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:899:1: (lv_description_1_0= RULE_STRING )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:899:1: (lv_description_1_0= RULE_STRING )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:900:3: lv_description_1_0= RULE_STRING
                    {
                    lv_description_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConstraint2061); 

                    			newLeafNode(lv_description_1_0, grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:916:4: ( (lv_expr_2_0= ruleExpression ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:917:1: (lv_expr_2_0= ruleExpression )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:917:1: (lv_expr_2_0= ruleExpression )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:918:3: lv_expr_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getExprExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleConstraint2089);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleExpression"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:942:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:943:2: (iv_ruleExpression= ruleExpression EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:944:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression2125);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression2135); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:951:1: ruleExpression returns [EObject current=null] : this_Disjunctive_0= ruleDisjunctive ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunctive_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:954:28: (this_Disjunctive_0= ruleDisjunctive )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:956:5: this_Disjunctive_0= ruleDisjunctive
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getDisjunctiveParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctive_in_ruleExpression2181);
            this_Disjunctive_0=ruleDisjunctive();

            state._fsp--;

             
                    current = this_Disjunctive_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleDisjunctive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:972:1: entryRuleDisjunctive returns [EObject current=null] : iv_ruleDisjunctive= ruleDisjunctive EOF ;
    public final EObject entryRuleDisjunctive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctive = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:973:2: (iv_ruleDisjunctive= ruleDisjunctive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:974:2: iv_ruleDisjunctive= ruleDisjunctive EOF
            {
             newCompositeNode(grammarAccess.getDisjunctiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisjunctive_in_entryRuleDisjunctive2215);
            iv_ruleDisjunctive=ruleDisjunctive();

            state._fsp--;

             current =iv_ruleDisjunctive; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisjunctive2225); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjunctive"


    // $ANTLR start "ruleDisjunctive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:981:1: ruleDisjunctive returns [EObject current=null] : (this_Conjunctive_0= ruleConjunctive ( () ( (lv_operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_right_3_0= ruleConjunctive ) ) )* ) ;
    public final EObject ruleDisjunctive() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunctive_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:984:28: ( (this_Conjunctive_0= ruleConjunctive ( () ( (lv_operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_right_3_0= ruleConjunctive ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:985:1: (this_Conjunctive_0= ruleConjunctive ( () ( (lv_operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_right_3_0= ruleConjunctive ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:985:1: (this_Conjunctive_0= ruleConjunctive ( () ( (lv_operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_right_3_0= ruleConjunctive ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:986:5: this_Conjunctive_0= ruleConjunctive ( () ( (lv_operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_right_3_0= ruleConjunctive ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDisjunctiveAccess().getConjunctiveParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_ruleDisjunctive2272);
            this_Conjunctive_0=ruleConjunctive();

            state._fsp--;

             
                    current = this_Conjunctive_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:994:1: ( () ( (lv_operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_right_3_0= ruleConjunctive ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:994:2: () ( (lv_operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_right_3_0= ruleConjunctive ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:994:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:995:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1000:2: ( (lv_operator_2_0= ruleDisjunctiveOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1001:1: (lv_operator_2_0= ruleDisjunctiveOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1001:1: (lv_operator_2_0= ruleDisjunctiveOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1002:3: lv_operator_2_0= ruleDisjunctiveOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctiveAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDisjunctiveOperator_in_ruleDisjunctive2302);
            	    lv_operator_2_0=ruleDisjunctiveOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisjunctiveRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"DisjunctiveOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1018:2: ( (lv_right_3_0= ruleConjunctive ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1019:1: (lv_right_3_0= ruleConjunctive )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1019:1: (lv_right_3_0= ruleConjunctive )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1020:3: lv_right_3_0= ruleConjunctive
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctiveAccess().getRightConjunctiveParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_ruleDisjunctive2323);
            	    lv_right_3_0=ruleConjunctive();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisjunctiveRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Conjunctive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjunctive"


    // $ANTLR start "entryRuleConjunctive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1044:1: entryRuleConjunctive returns [EObject current=null] : iv_ruleConjunctive= ruleConjunctive EOF ;
    public final EObject entryRuleConjunctive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctive = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1045:2: (iv_ruleConjunctive= ruleConjunctive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1046:2: iv_ruleConjunctive= ruleConjunctive EOF
            {
             newCompositeNode(grammarAccess.getConjunctiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConjunctive_in_entryRuleConjunctive2361);
            iv_ruleConjunctive=ruleConjunctive();

            state._fsp--;

             current =iv_ruleConjunctive; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConjunctive2371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunctive"


    // $ANTLR start "ruleConjunctive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1053:1: ruleConjunctive returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleConjunctiveOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleConjunctive() throws RecognitionException {
        EObject current = null;

        EObject this_Equality_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1056:28: ( (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleConjunctiveOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1057:1: (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleConjunctiveOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1057:1: (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleConjunctiveOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1058:5: this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleConjunctiveOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConjunctiveAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_ruleConjunctive2418);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1066:1: ( () ( (lv_operator_2_0= ruleConjunctiveOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1066:2: () ( (lv_operator_2_0= ruleConjunctiveOperator ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1066:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1067:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1072:2: ( (lv_operator_2_0= ruleConjunctiveOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1073:1: (lv_operator_2_0= ruleConjunctiveOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1073:1: (lv_operator_2_0= ruleConjunctiveOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1074:3: lv_operator_2_0= ruleConjunctiveOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctiveAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConjunctiveOperator_in_ruleConjunctive2448);
            	    lv_operator_2_0=ruleConjunctiveOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjunctiveRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"ConjunctiveOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1090:2: ( (lv_right_3_0= ruleEquality ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1091:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1091:1: (lv_right_3_0= ruleEquality )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1092:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctiveAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEquality_in_ruleConjunctive2469);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjunctiveRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Equality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctive"


    // $ANTLR start "entryRuleEquality"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1116:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1117:2: (iv_ruleEquality= ruleEquality EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1118:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_entryRuleEquality2507);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquality2517); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1125:1: ruleEquality returns [EObject current=null] : (this_Comparative_0= ruleComparative ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparative ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparative_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1128:28: ( (this_Comparative_0= ruleComparative ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparative ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1129:1: (this_Comparative_0= ruleComparative ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparative ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1129:1: (this_Comparative_0= ruleComparative ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparative ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1130:5: this_Comparative_0= ruleComparative ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparative ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparativeParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_ruleEquality2564);
            this_Comparative_0=ruleComparative();

            state._fsp--;

             
                    current = this_Comparative_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1138:1: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparative ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=37 && LA21_0<=38)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1138:2: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparative ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1138:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1139:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1144:2: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1145:1: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1145:1: (lv_operator_2_0= ruleEqualityOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1146:3: lv_operator_2_0= ruleEqualityOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEqualityOperator_in_ruleEquality2594);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"EqualityOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1162:2: ( (lv_right_3_0= ruleComparative ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1163:1: (lv_right_3_0= ruleComparative )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1163:1: (lv_right_3_0= ruleComparative )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1164:3: lv_right_3_0= ruleComparative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparativeParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparative_in_ruleEquality2615);
            	    lv_right_3_0=ruleComparative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparative"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1188:1: entryRuleComparative returns [EObject current=null] : iv_ruleComparative= ruleComparative EOF ;
    public final EObject entryRuleComparative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparative = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1189:2: (iv_ruleComparative= ruleComparative EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1190:2: iv_ruleComparative= ruleComparative EOF
            {
             newCompositeNode(grammarAccess.getComparativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparative_in_entryRuleComparative2653);
            iv_ruleComparative=ruleComparative();

            state._fsp--;

             current =iv_ruleComparative; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparative2663); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparative"


    // $ANTLR start "ruleComparative"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1197:1: ruleComparative returns [EObject current=null] : (this_Additive_0= ruleAdditive ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_right_3_0= ruleAdditive ) ) )* ) ;
    public final EObject ruleComparative() throws RecognitionException {
        EObject current = null;

        EObject this_Additive_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1200:28: ( (this_Additive_0= ruleAdditive ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_right_3_0= ruleAdditive ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1201:1: (this_Additive_0= ruleAdditive ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_right_3_0= ruleAdditive ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1201:1: (this_Additive_0= ruleAdditive ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_right_3_0= ruleAdditive ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1202:5: this_Additive_0= ruleAdditive ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_right_3_0= ruleAdditive ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparativeAccess().getAdditiveParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_ruleComparative2710);
            this_Additive_0=ruleAdditive();

            state._fsp--;

             
                    current = this_Additive_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1210:1: ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_right_3_0= ruleAdditive ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=39 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1210:2: () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_right_3_0= ruleAdditive ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1210:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1211:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1216:2: ( (lv_operator_2_0= ruleComparativeOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1217:1: (lv_operator_2_0= ruleComparativeOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1217:1: (lv_operator_2_0= ruleComparativeOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1218:3: lv_operator_2_0= ruleComparativeOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparativeAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparativeOperator_in_ruleComparative2740);
            	    lv_operator_2_0=ruleComparativeOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparativeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"ComparativeOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1234:2: ( (lv_right_3_0= ruleAdditive ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1235:1: (lv_right_3_0= ruleAdditive )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1235:1: (lv_right_3_0= ruleAdditive )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1236:3: lv_right_3_0= ruleAdditive
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparativeAccess().getRightAdditiveParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_ruleComparative2761);
            	    lv_right_3_0=ruleAdditive();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparativeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Additive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparative"


    // $ANTLR start "entryRuleAdditive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1260:1: entryRuleAdditive returns [EObject current=null] : iv_ruleAdditive= ruleAdditive EOF ;
    public final EObject entryRuleAdditive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditive = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1261:2: (iv_ruleAdditive= ruleAdditive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1262:2: iv_ruleAdditive= ruleAdditive EOF
            {
             newCompositeNode(grammarAccess.getAdditiveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditive_in_entryRuleAdditive2799);
            iv_ruleAdditive=ruleAdditive();

            state._fsp--;

             current =iv_ruleAdditive; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditive2809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditive"


    // $ANTLR start "ruleAdditive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1269:1: ruleAdditive returns [EObject current=null] : (this_Multiplicative_0= ruleMultiplicative ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicative ) ) )* ) ;
    public final EObject ruleAdditive() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplicative_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1272:28: ( (this_Multiplicative_0= ruleMultiplicative ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicative ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1273:1: (this_Multiplicative_0= ruleMultiplicative ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicative ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1273:1: (this_Multiplicative_0= ruleMultiplicative ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicative ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1274:5: this_Multiplicative_0= ruleMultiplicative ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicative ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditiveAccess().getMultiplicativeParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_ruleAdditive2856);
            this_Multiplicative_0=ruleMultiplicative();

            state._fsp--;

             
                    current = this_Multiplicative_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1282:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicative ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32||LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1282:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicative ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1282:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1283:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1288:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1289:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1289:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1290:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAdditiveOperator_in_ruleAdditive2886);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"AdditiveOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1306:2: ( (lv_right_3_0= ruleMultiplicative ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1307:1: (lv_right_3_0= ruleMultiplicative )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1307:1: (lv_right_3_0= ruleMultiplicative )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1308:3: lv_right_3_0= ruleMultiplicative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveAccess().getRightMultiplicativeParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_ruleAdditive2907);
            	    lv_right_3_0=ruleMultiplicative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Multiplicative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditive"


    // $ANTLR start "entryRuleMultiplicative"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1332:1: entryRuleMultiplicative returns [EObject current=null] : iv_ruleMultiplicative= ruleMultiplicative EOF ;
    public final EObject entryRuleMultiplicative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicative = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1333:2: (iv_ruleMultiplicative= ruleMultiplicative EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1334:2: iv_ruleMultiplicative= ruleMultiplicative EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicative_in_entryRuleMultiplicative2945);
            iv_ruleMultiplicative=ruleMultiplicative();

            state._fsp--;

             current =iv_ruleMultiplicative; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicative2955); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicative"


    // $ANTLR start "ruleMultiplicative"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1341:1: ruleMultiplicative returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleMultiplicative() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1344:28: ( (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1345:1: (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1345:1: (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1346:5: this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicativeAccess().getPrimitiveParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_ruleMultiplicative3002);
            this_Primitive_0=rulePrimitive();

            state._fsp--;

             
                    current = this_Primitive_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1354:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=44 && LA24_0<=45)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1354:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= rulePrimitive ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1354:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1355:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1360:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1361:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1361:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1362:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicative3032);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"MultiplicativeOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1378:2: ( (lv_right_3_0= rulePrimitive ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1379:1: (lv_right_3_0= rulePrimitive )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1379:1: (lv_right_3_0= rulePrimitive )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1380:3: lv_right_3_0= rulePrimitive
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeAccess().getRightPrimitiveParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_ruleMultiplicative3053);
            	    lv_right_3_0=rulePrimitive();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primitive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicative"


    // $ANTLR start "entryRulePrimitive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1404:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1405:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1406:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_entryRulePrimitive3091);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitive3101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1413:1: rulePrimitive returns [EObject current=null] : (this_Unary_0= ruleUnary | this_Scalar_1= ruleScalar | this_InRange_2= ruleInRange | this_Integer_3= ruleInteger | this_Double_4= ruleDouble | this_Boolean_5= ruleBoolean | this_String0_6= ruleString0 | this_Identifier_7= ruleIdentifier | (otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_Unary_0 = null;

        EObject this_Scalar_1 = null;

        EObject this_InRange_2 = null;

        EObject this_Integer_3 = null;

        EObject this_Double_4 = null;

        EObject this_Boolean_5 = null;

        EObject this_String0_6 = null;

        EObject this_Identifier_7 = null;

        EObject this_Expression_9 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1416:28: ( (this_Unary_0= ruleUnary | this_Scalar_1= ruleScalar | this_InRange_2= ruleInRange | this_Integer_3= ruleInteger | this_Double_4= ruleDouble | this_Boolean_5= ruleBoolean | this_String0_6= ruleString0 | this_Identifier_7= ruleIdentifier | (otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1417:1: (this_Unary_0= ruleUnary | this_Scalar_1= ruleScalar | this_InRange_2= ruleInRange | this_Integer_3= ruleInteger | this_Double_4= ruleDouble | this_Boolean_5= ruleBoolean | this_String0_6= ruleString0 | this_Identifier_7= ruleIdentifier | (otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1417:1: (this_Unary_0= ruleUnary | this_Scalar_1= ruleScalar | this_InRange_2= ruleInRange | this_Integer_3= ruleInteger | this_Double_4= ruleDouble | this_Boolean_5= ruleBoolean | this_String0_6= ruleString0 | this_Identifier_7= ruleIdentifier | (otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')' ) )
            int alt25=9;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1418:5: this_Unary_0= ruleUnary
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getUnaryParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnary_in_rulePrimitive3148);
                    this_Unary_0=ruleUnary();

                    state._fsp--;

                     
                            current = this_Unary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1428:5: this_Scalar_1= ruleScalar
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getScalarParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScalar_in_rulePrimitive3175);
                    this_Scalar_1=ruleScalar();

                    state._fsp--;

                     
                            current = this_Scalar_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1438:5: this_InRange_2= ruleInRange
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInRange_in_rulePrimitive3202);
                    this_InRange_2=ruleInRange();

                    state._fsp--;

                     
                            current = this_InRange_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1448:5: this_Integer_3= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rulePrimitive3229);
                    this_Integer_3=ruleInteger();

                    state._fsp--;

                     
                            current = this_Integer_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1458:5: this_Double_4= ruleDouble
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getDoubleParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_rulePrimitive3256);
                    this_Double_4=ruleDouble();

                    state._fsp--;

                     
                            current = this_Double_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1468:5: this_Boolean_5= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rulePrimitive3283);
                    this_Boolean_5=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1478:5: this_String0_6= ruleString0
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rulePrimitive3310);
                    this_String0_6=ruleString0();

                    state._fsp--;

                     
                            current = this_String0_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1488:5: this_Identifier_7= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rulePrimitive3337);
                    this_Identifier_7=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1497:6: (otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1497:6: (otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1497:8: otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitive3355); 

                        	newLeafNode(otherlv_8, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_8_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_8_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePrimitive3377);
                    this_Expression_9=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_9; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimitive3388); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_8_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleUnary"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1522:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1523:2: (iv_ruleUnary= ruleUnary EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1524:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnary_in_entryRuleUnary3425);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnary3435); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1531:1: ruleUnary returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_inner_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1534:28: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1535:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1535:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1535:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1535:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1536:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1536:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1537:3: lv_operator_0_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnary3481);
            lv_operator_0_0=ruleUnaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"UnaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1553:2: ( (lv_inner_1_0= rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1554:1: (lv_inner_1_0= rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1554:1: (lv_inner_1_0= rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1555:3: lv_inner_1_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getInnerPrimitiveParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_ruleUnary3502);
            lv_inner_1_0=rulePrimitive();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"inner",
                    		lv_inner_1_0, 
                    		"Primitive");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleScalar"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1579:1: entryRuleScalar returns [EObject current=null] : iv_ruleScalar= ruleScalar EOF ;
    public final EObject entryRuleScalar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalar = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1580:2: (iv_ruleScalar= ruleScalar EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1581:2: iv_ruleScalar= ruleScalar EOF
            {
             newCompositeNode(grammarAccess.getScalarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScalar_in_entryRuleScalar3538);
            iv_ruleScalar=ruleScalar();

            state._fsp--;

             current =iv_ruleScalar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScalar3548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1588:1: ruleScalar returns [EObject current=null] : ( ( (lv_operator_0_0= ruleScalarOperator ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleScalar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1591:28: ( ( ( (lv_operator_0_0= ruleScalarOperator ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1592:1: ( ( (lv_operator_0_0= ruleScalarOperator ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1592:1: ( ( (lv_operator_0_0= ruleScalarOperator ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1592:2: ( (lv_operator_0_0= ruleScalarOperator ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1592:2: ( (lv_operator_0_0= ruleScalarOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1593:1: (lv_operator_0_0= ruleScalarOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1593:1: (lv_operator_0_0= ruleScalarOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1594:3: lv_operator_0_0= ruleScalarOperator
            {
             
            	        newCompositeNode(grammarAccess.getScalarAccess().getOperatorScalarOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleScalarOperator_in_ruleScalar3594);
            lv_operator_0_0=ruleScalarOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScalarRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"ScalarOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleScalar3606); 

                	newLeafNode(otherlv_1, grammarAccess.getScalarAccess().getLeftParenthesisKeyword_1());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1614:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1615:1: (otherlv_2= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1615:1: (otherlv_2= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1616:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getScalarRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScalar3626); 

            		newLeafNode(otherlv_2, grammarAccess.getScalarAccess().getIdParameterGroupCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleScalar3638); 

                	newLeafNode(otherlv_3, grammarAccess.getScalarAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalar"


    // $ANTLR start "entryRuleInRange"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1641:1: entryRuleInRange returns [EObject current=null] : iv_ruleInRange= ruleInRange EOF ;
    public final EObject entryRuleInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInRange = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1642:2: (iv_ruleInRange= ruleInRange EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1643:2: iv_ruleInRange= ruleInRange EOF
            {
             newCompositeNode(grammarAccess.getInRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInRange_in_entryRuleInRange3676);
            iv_ruleInRange=ruleInRange();

            state._fsp--;

             current =iv_ruleInRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInRange3686); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInRange"


    // $ANTLR start "ruleInRange"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1650:1: ruleInRange returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) ) ;
    public final EObject ruleInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1653:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1654:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1654:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1654:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1654:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1655:1: (otherlv_0= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1655:1: (otherlv_0= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1656:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInRangeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInRange3731); 

            		newLeafNode(otherlv_0, grammarAccess.getInRangeAccess().getParameterParameterCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInRange3743); 

                	newLeafNode(otherlv_1, grammarAccess.getInRangeAccess().getInKeyword_1());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1671:1: ( (lv_range_2_0= ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1672:1: (lv_range_2_0= ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1672:1: (lv_range_2_0= ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1673:3: lv_range_2_0= ruleValueRange
            {
             
            	        newCompositeNode(grammarAccess.getInRangeAccess().getRangeValueRangeParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_ruleInRange3764);
            lv_range_2_0=ruleValueRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_2_0, 
                    		"ValueRange");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInRange"


    // $ANTLR start "entryRuleInteger"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1697:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1698:2: (iv_ruleInteger= ruleInteger EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1699:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger3800);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger3810); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1706:1: ruleInteger returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1709:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1710:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1710:1: ( (lv_value_0_0= ruleEInt ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1711:1: (lv_value_0_0= ruleEInt )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1711:1: (lv_value_0_0= ruleEInt )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1712:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInteger3855);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1736:1: entryRuleDouble returns [EObject current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final EObject entryRuleDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDouble = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1737:2: (iv_ruleDouble= ruleDouble EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1738:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_entryRuleDouble3890);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDouble3900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1745:1: ruleDouble returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1748:28: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1749:1: ( (lv_value_0_0= ruleEDouble ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1749:1: ( (lv_value_0_0= ruleEDouble ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1750:1: (lv_value_0_0= ruleEDouble )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1750:1: (lv_value_0_0= ruleEDouble )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1751:3: lv_value_0_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDouble3945);
            lv_value_0_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoubleRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1775:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1776:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1777:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean3980);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean3990); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1784:1: ruleBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1787:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1788:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1788:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1789:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1789:1: (lv_value_0_0= ruleEBoolean )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1790:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBoolean4035);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleString0"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1814:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1815:2: (iv_ruleString0= ruleString0 EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1816:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString04070);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString04080); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1823:1: ruleString0 returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1826:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1827:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1827:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1828:1: (lv_value_0_0= RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1828:1: (lv_value_0_0= RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1829:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString04121); 

            			newLeafNode(lv_value_0_0, grammarAccess.getString0Access().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getString0Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleIdentifier"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1853:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1854:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1855:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier4161);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier4171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1862:1: ruleIdentifier returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1865:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1866:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1866:1: ( (otherlv_0= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1867:1: (otherlv_0= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1867:1: (otherlv_0= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1868:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier4215); 

            		newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdParameterCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1887:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1888:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1889:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4251);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1896:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1899:28: (this_INT_0= RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1900:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4301); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1915:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1916:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1917:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble4346);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble4357); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1924:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1927:28: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1928:1: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1928:1: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1928:2: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1928:2: (this_INT_0= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1928:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble4398); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDouble4418); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble4433); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1948:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=30 && LA29_0<=31)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1948:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1948:2: (kw= 'E' | kw= 'e' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==30) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==31) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1949:2: kw= 'E'
                            {
                            kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEDouble4453); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1956:2: kw= 'e'
                            {
                            kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEDouble4472); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1961:2: (kw= '-' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==32) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1962:2: kw= '-'
                            {
                            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble4487); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
                                

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble4504); 

                    		current.merge(this_INT_6);
                        
                     
                        newLeafNode(this_INT_6, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1982:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1983:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1984:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean4552);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean4563); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1991:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1994:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1995:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1995:1: (kw= 'true' | kw= 'false' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            else if ( (LA30_0==34) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1996:2: kw= 'true'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEBoolean4601); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2003:2: kw= 'false'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEBoolean4620); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleDisjunctiveOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2016:1: ruleDisjunctiveOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleDisjunctiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2018:28: ( (enumLiteral_0= 'or' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2019:1: (enumLiteral_0= 'or' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2019:1: (enumLiteral_0= 'or' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2019:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDisjunctiveOperator4673); 

                    current = grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjunctiveOperator"


    // $ANTLR start "ruleConjunctiveOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2029:1: ruleConjunctiveOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleConjunctiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2031:28: ( (enumLiteral_0= 'and' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2032:1: (enumLiteral_0= 'and' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2032:1: (enumLiteral_0= 'and' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2032:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConjunctiveOperator4716); 

                    current = grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctiveOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2042:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2044:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2045:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2045:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            else if ( (LA31_0==38) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2045:2: (enumLiteral_0= '==' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2045:2: (enumLiteral_0= '==' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2045:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEqualityOperator4760); 

                            current = grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2051:6: (enumLiteral_1= '!=' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2051:6: (enumLiteral_1= '!=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2051:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEqualityOperator4777); 

                            current = grammarAccess.getEqualityOperatorAccess().getNotEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNotEqualEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleComparativeOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2061:1: ruleComparativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleComparativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2063:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2064:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2064:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt32=1;
                }
                break;
            case 40:
                {
                alt32=2;
                }
                break;
            case 41:
                {
                alt32=3;
                }
                break;
            case 42:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2064:2: (enumLiteral_0= '<' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2064:2: (enumLiteral_0= '<' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2064:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleComparativeOperator4822); 

                            current = grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2070:6: (enumLiteral_1= '<=' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2070:6: (enumLiteral_1= '<=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2070:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleComparativeOperator4839); 

                            current = grammarAccess.getComparativeOperatorAccess().getLessThanEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparativeOperatorAccess().getLessThanEqualEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2076:6: (enumLiteral_2= '>' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2076:6: (enumLiteral_2= '>' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2076:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleComparativeOperator4856); 

                            current = grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2082:6: (enumLiteral_3= '>=' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2082:6: (enumLiteral_3= '>=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2082:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleComparativeOperator4873); 

                            current = grammarAccess.getComparativeOperatorAccess().getGreaterThanEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparativeOperatorAccess().getGreaterThanEqualEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparativeOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2092:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2094:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2095:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2095:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            else if ( (LA33_0==32) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2095:2: (enumLiteral_0= '+' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2095:2: (enumLiteral_0= '+' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2095:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAdditiveOperator4918); 

                            current = grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2101:6: (enumLiteral_1= '-' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2101:6: (enumLiteral_1= '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2101:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAdditiveOperator4935); 

                            current = grammarAccess.getAdditiveOperatorAccess().getSubtractionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSubtractionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2111:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2113:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2114:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2114:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            else if ( (LA34_0==45) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2114:2: (enumLiteral_0= '*' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2114:2: (enumLiteral_0= '*' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2114:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultiplicativeOperator4980); 

                            current = grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2120:6: (enumLiteral_1= '/' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2120:6: (enumLiteral_1= '/' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2120:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMultiplicativeOperator4997); 

                            current = grammarAccess.getMultiplicativeOperatorAccess().getDivisionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2130:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2132:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2133:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2133:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            else if ( (LA35_0==32) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2133:2: (enumLiteral_0= 'not' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2133:2: (enumLiteral_0= 'not' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2133:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleUnaryOperator5042); 

                            current = grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2139:6: (enumLiteral_1= '-' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2139:6: (enumLiteral_1= '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2139:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleUnaryOperator5059); 

                            current = grammarAccess.getUnaryOperatorAccess().getNegationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegationEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleScalarOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2149:1: ruleScalarOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'sum' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'max' ) ) ;
    public final Enumerator ruleScalarOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2151:28: ( ( (enumLiteral_0= 'sum' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'max' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2152:1: ( (enumLiteral_0= 'sum' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'max' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2152:1: ( (enumLiteral_0= 'sum' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'max' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt36=1;
                }
                break;
            case 48:
                {
                alt36=2;
                }
                break;
            case 49:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2152:2: (enumLiteral_0= 'sum' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2152:2: (enumLiteral_0= 'sum' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2152:4: enumLiteral_0= 'sum'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleScalarOperator5104); 

                            current = grammarAccess.getScalarOperatorAccess().getSumEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getScalarOperatorAccess().getSumEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2158:6: (enumLiteral_1= 'min' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2158:6: (enumLiteral_1= 'min' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2158:8: enumLiteral_1= 'min'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleScalarOperator5121); 

                            current = grammarAccess.getScalarOperatorAccess().getMinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getScalarOperatorAccess().getMinEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2164:6: (enumLiteral_2= 'max' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2164:6: (enumLiteral_2= 'max' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:2164:8: enumLiteral_2= 'max'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleScalarOperator5138); 

                            current = grammarAccess.getScalarOperatorAccess().getMaxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getScalarOperatorAccess().getMaxEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarOperator"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\14\uffff";
    static final String DFA25_eofS =
        "\3\uffff\1\12\1\13\7\uffff";
    static final String DFA25_minS =
        "\1\4\2\uffff\2\14\7\uffff";
    static final String DFA25_maxS =
        "\1\61\2\uffff\2\55\7\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\11\1\3\1\10\1\4";
    static final String DFA25_specialS =
        "\14\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\1\7\1\4\17\uffff\1\10\6\uffff\1\5\2\uffff\1\1\2\6\13\uffff"+
            "\1\1\3\2",
            "",
            "",
            "\12\12\1\uffff\1\12\1\uffff\2\12\1\uffff\1\11\3\uffff\1\12"+
            "\2\uffff\13\12",
            "\12\13\1\uffff\1\13\1\uffff\2\13\2\uffff\1\5\2\uffff\1\13"+
            "\2\uffff\13\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1417:1: (this_Unary_0= ruleUnary | this_Scalar_1= ruleScalar | this_InRange_2= ruleInRange | this_Integer_3= ruleInteger | this_Double_4= ruleDouble | this_Boolean_5= ruleBoolean | this_String0_6= ruleString0 | this_Identifier_7= ruleIdentifier | (otherlv_8= '(' this_Expression_9= ruleExpression otherlv_10= ')' ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfigurator_in_entryRuleConfigurator75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurator85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConfigurator122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurator139 = new BitSet(new long[]{0x0000000000001020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurator161 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfigurator179 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleConfigurator200 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_13_in_ruleConfigurator214 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleConfigurator237 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_14_in_ruleConfigurator251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_entryRuleAbstractParameter287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractParameter297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterGroup_in_ruleAbstractParameter344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleAbstractParameter371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterGroup_in_entryRuleParameterGroup406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterGroup416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParameterGroup453 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameterGroup470 = new BitSet(new long[]{0x0000000000031020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleParameterGroup492 = new BitSet(new long[]{0x0000000000031000L});
        public static final BitSet FOLLOW_16_in_ruleParameterGroup556 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameterGroup577 = new BitSet(new long[]{0x0000000000031002L});
        public static final BitSet FOLLOW_17_in_ruleParameterGroup645 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterGroup657 = new BitSet(new long[]{0x0003C00728400070L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleParameterGroup678 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleParameterGroup691 = new BitSet(new long[]{0x0003C00728400070L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleParameterGroup712 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleParameterGroup727 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParameterGroup741 = new BitSet(new long[]{0x0000000000031002L});
        public static final BitSet FOLLOW_12_in_ruleParameterGroup809 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleParameterGroup830 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_13_in_ruleParameterGroup844 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleParameterGroup867 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_13_in_ruleParameterGroup882 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParameterGroup896 = new BitSet(new long[]{0x0000000000031002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter979 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleParameter1026 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1043 = new BitSet(new long[]{0x00000000003B0020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter1065 = new BitSet(new long[]{0x00000000003B0000L});
        public static final BitSet FOLLOW_19_in_ruleParameter1135 = new BitSet(new long[]{0x00000000003B0002L});
        public static final BitSet FOLLOW_20_in_ruleParameter1166 = new BitSet(new long[]{0x00000000003B0002L});
        public static final BitSet FOLLOW_16_in_ruleParameter1234 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameter1255 = new BitSet(new long[]{0x00000000003B0002L});
        public static final BitSet FOLLOW_17_in_ruleParameter1323 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameter1335 = new BitSet(new long[]{0x0003C00728400070L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleParameter1356 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleParameter1369 = new BitSet(new long[]{0x0003C00728400070L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleParameter1390 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleParameter1404 = new BitSet(new long[]{0x00000000003B0002L});
        public static final BitSet FOLLOW_21_in_ruleParameter1472 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_ruleValueRange_in_ruleParameter1493 = new BitSet(new long[]{0x00000000003B0002L});
        public static final BitSet FOLLOW_ruleValueRange_in_entryRuleValueRange1576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueRange1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerated_in_ruleValueRange1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBounded_in_ruleValueRange1660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerated_in_entryRuleEnumerated1695 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerated1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEnumerated1742 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEnumerated1763 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_ruleEnumerated1776 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEnumerated1797 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_ruleEnumerated1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBounded_in_entryRuleBounded1847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBounded1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleBounded1894 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBounded1915 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleBounded1927 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBounded1948 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleBounded1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleConstraint2044 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint2061 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConstraint2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctive_in_ruleExpression2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisjunctive_in_entryRuleDisjunctive2215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisjunctive2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_ruleDisjunctive2272 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleDisjunctiveOperator_in_ruleDisjunctive2302 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleConjunctive_in_ruleDisjunctive2323 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleConjunctive_in_entryRuleConjunctive2361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConjunctive2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_ruleConjunctive2418 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleConjunctiveOperator_in_ruleConjunctive2448 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleEquality_in_ruleConjunctive2469 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality2507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquality2517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_ruleEquality2564 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleEquality2594 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleComparative_in_ruleEquality2615 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_entryRuleComparative2653 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparative2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_ruleComparative2710 = new BitSet(new long[]{0x0000078000000002L});
        public static final BitSet FOLLOW_ruleComparativeOperator_in_ruleComparative2740 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleAdditive_in_ruleComparative2761 = new BitSet(new long[]{0x0000078000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_entryRuleAdditive2799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditive2809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_ruleAdditive2856 = new BitSet(new long[]{0x0000080100000002L});
        public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleAdditive2886 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_ruleAdditive2907 = new BitSet(new long[]{0x0000080100000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_entryRuleMultiplicative2945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicative2955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleMultiplicative3002 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicative3032 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleMultiplicative3053 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive3091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitive3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_rulePrimitive3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalar_in_rulePrimitive3175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_rulePrimitive3202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rulePrimitive3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_rulePrimitive3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rulePrimitive3283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rulePrimitive3310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rulePrimitive3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePrimitive3355 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePrimitive3377 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePrimitive3388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary3425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnary3435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnary3481 = new BitSet(new long[]{0x0003C00720400070L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleUnary3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalar_in_entryRuleScalar3538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScalar3548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScalarOperator_in_ruleScalar3594 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleScalar3606 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScalar3626 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleScalar3638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_entryRuleInRange3676 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInRange3686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInRange3731 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInRange3743 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_ruleValueRange_in_ruleInRange3764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger3800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger3810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInteger3855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble3890 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDouble3900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDouble3945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean3980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBoolean4035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString04070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString04080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString04121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier4161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier4171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble4346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble4357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble4398 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDouble4418 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble4433 = new BitSet(new long[]{0x00000000C0000002L});
        public static final BitSet FOLLOW_30_in_ruleEDouble4453 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_31_in_ruleEDouble4472 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_32_in_ruleEDouble4487 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean4552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean4563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEBoolean4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEBoolean4620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleDisjunctiveOperator4673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleConjunctiveOperator4716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEqualityOperator4760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEqualityOperator4777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleComparativeOperator4822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleComparativeOperator4839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleComparativeOperator4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleComparativeOperator4873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAdditiveOperator4918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAdditiveOperator4935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleMultiplicativeOperator4980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleMultiplicativeOperator4997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleUnaryOperator5042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleUnaryOperator5059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleScalarOperator5104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleScalarOperator5121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleScalarOperator5138 = new BitSet(new long[]{0x0000000000000002L});
    }


}