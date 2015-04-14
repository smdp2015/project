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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configurator'", "'{'", "','", "'}'", "'group'", "'visible-if'", "'constraints'", "'parameter'", "'mandatory'", "'optional'", "'values'", "'('", "')'", "'['", "';'", "']'", "'description'", "'in'", "'true'", "'false'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'+'", "'-'", "'*'", "'not'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
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

            	            if ( ((LA6_1>=RULE_ID && LA6_1<=RULE_INT)||LA6_1==22||LA6_1==27||(LA6_1>=29 && LA6_1<=30)||LA6_1==38||LA6_1==40) ) {
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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:951:1: ruleExpression returns [EObject current=null] : this_LogicalOr_0= ruleLogicalOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOr_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:954:28: (this_LogicalOr_0= ruleLogicalOr )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:956:5: this_LogicalOr_0= ruleLogicalOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOr_in_ruleExpression2181);
            this_LogicalOr_0=ruleLogicalOr();

            state._fsp--;

             
                    current = this_LogicalOr_0; 
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


    // $ANTLR start "entryRuleLogicalOr"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:972:1: entryRuleLogicalOr returns [EObject current=null] : iv_ruleLogicalOr= ruleLogicalOr EOF ;
    public final EObject entryRuleLogicalOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOr = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:973:2: (iv_ruleLogicalOr= ruleLogicalOr EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:974:2: iv_ruleLogicalOr= ruleLogicalOr EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr2215);
            iv_ruleLogicalOr=ruleLogicalOr();

            state._fsp--;

             current =iv_ruleLogicalOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOr2225); 

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
    // $ANTLR end "entryRuleLogicalOr"


    // $ANTLR start "ruleLogicalOr"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:981:1: ruleLogicalOr returns [EObject current=null] : (this_LogicalAnd_0= ruleLogicalAnd ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )* ) ;
    public final EObject ruleLogicalOr() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAnd_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:984:28: ( (this_LogicalAnd_0= ruleLogicalAnd ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:985:1: (this_LogicalAnd_0= ruleLogicalAnd ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:985:1: (this_LogicalAnd_0= ruleLogicalAnd ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:986:5: this_LogicalAnd_0= ruleLogicalAnd ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAnd_in_ruleLogicalOr2272);
            this_LogicalAnd_0=ruleLogicalAnd();

            state._fsp--;

             
                    current = this_LogicalAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:994:1: ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:994:2: () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_right_3_0= ruleLogicalAnd ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:994:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:995:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalOrAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1000:2: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1001:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1001:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1002:3: lv_operator_2_0= ruleLogicalOrOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOr2302);
            	    lv_operator_2_0=ruleLogicalOrOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"LogicalOrOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1018:2: ( (lv_right_3_0= ruleLogicalAnd ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1019:1: (lv_right_3_0= ruleLogicalAnd )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1019:1: (lv_right_3_0= ruleLogicalAnd )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1020:3: lv_right_3_0= ruleLogicalAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAnd_in_ruleLogicalOr2323);
            	    lv_right_3_0=ruleLogicalAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"LogicalAnd");
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
    // $ANTLR end "ruleLogicalOr"


    // $ANTLR start "entryRuleLogicalAnd"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1044:1: entryRuleLogicalAnd returns [EObject current=null] : iv_ruleLogicalAnd= ruleLogicalAnd EOF ;
    public final EObject entryRuleLogicalAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAnd = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1045:2: (iv_ruleLogicalAnd= ruleLogicalAnd EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1046:2: iv_ruleLogicalAnd= ruleLogicalAnd EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd2361);
            iv_ruleLogicalAnd=ruleLogicalAnd();

            state._fsp--;

             current =iv_ruleLogicalAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAnd2371); 

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
    // $ANTLR end "entryRuleLogicalAnd"


    // $ANTLR start "ruleLogicalAnd"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1053:1: ruleLogicalAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleLogicalAnd() throws RecognitionException {
        EObject current = null;

        EObject this_Equality_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1056:28: ( (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1057:1: (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1057:1: (this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1058:5: this_Equality_0= ruleEquality ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEquality_in_ruleLogicalAnd2418);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1066:1: ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1066:2: () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1066:2: ()
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1067:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalAndAccess().getBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1072:2: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1073:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1073:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1074:3: lv_operator_2_0= ruleLogicalAndOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAnd2448);
            	    lv_operator_2_0=ruleLogicalAndOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"LogicalAndOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1090:2: ( (lv_right_3_0= ruleEquality ) )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1091:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1091:1: (lv_right_3_0= ruleEquality )
            	    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1092:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEquality_in_ruleLogicalAnd2469);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalAndRule());
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
    // $ANTLR end "ruleLogicalAnd"


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

                if ( ((LA21_0>=33 && LA21_0<=34)) ) {
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

                if ( ((LA22_0>=35 && LA22_0<=36)) ) {
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

                if ( ((LA23_0>=37 && LA23_0<=38)) ) {
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

                if ( (LA24_0==39) ) {
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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1413:1: rulePrimitive returns [EObject current=null] : (this_Unary_0= ruleUnary | this_InRange_1= ruleInRange | this_Integer_2= ruleInteger | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 | this_Identifier_5= ruleIdentifier | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Unary_0 = null;

        EObject this_InRange_1 = null;

        EObject this_Integer_2 = null;

        EObject this_Boolean_3 = null;

        EObject this_String0_4 = null;

        EObject this_Identifier_5 = null;

        EObject this_Expression_7 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1416:28: ( (this_Unary_0= ruleUnary | this_InRange_1= ruleInRange | this_Integer_2= ruleInteger | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 | this_Identifier_5= ruleIdentifier | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1417:1: (this_Unary_0= ruleUnary | this_InRange_1= ruleInRange | this_Integer_2= ruleInteger | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 | this_Identifier_5= ruleIdentifier | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1417:1: (this_Unary_0= ruleUnary | this_InRange_1= ruleInRange | this_Integer_2= ruleInteger | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 | this_Identifier_5= ruleIdentifier | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 38:
            case 40:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==28) ) {
                    alt25=2;
                }
                else if ( (LA25_2==EOF||(LA25_2>=12 && LA25_2<=21)||LA25_2==23||(LA25_2>=25 && LA25_2<=26)||(LA25_2>=31 && LA25_2<=39)) ) {
                    alt25=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt25=3;
                }
                break;
            case 29:
            case 30:
                {
                alt25=4;
                }
                break;
            case RULE_STRING:
                {
                alt25=5;
                }
                break;
            case 22:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

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
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1428:5: this_InRange_1= ruleInRange
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getInRangeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInRange_in_rulePrimitive3175);
                    this_InRange_1=ruleInRange();

                    state._fsp--;

                     
                            current = this_InRange_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1438:5: this_Integer_2= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getIntegerParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rulePrimitive3202);
                    this_Integer_2=ruleInteger();

                    state._fsp--;

                     
                            current = this_Integer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1448:5: this_Boolean_3= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getBooleanParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rulePrimitive3229);
                    this_Boolean_3=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1458:5: this_String0_4= ruleString0
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getString0ParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rulePrimitive3256);
                    this_String0_4=ruleString0();

                    state._fsp--;

                     
                            current = this_String0_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1468:5: this_Identifier_5= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getIdentifierParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rulePrimitive3283);
                    this_Identifier_5=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1477:6: (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1477:6: (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1477:8: otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitive3301); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_6_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePrimitive3323);
                    this_Expression_7=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_7; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimitive3334); 

                        	newLeafNode(otherlv_8, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_6_2());
                        

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1502:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1503:2: (iv_ruleUnary= ruleUnary EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1504:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnary_in_entryRuleUnary3371);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnary3381); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1511:1: ruleUnary returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_inner_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1514:28: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1515:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1515:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1515:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_inner_1_0= rulePrimitive ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1515:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1516:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1516:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1517:3: lv_operator_0_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnary3427);
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

            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1533:2: ( (lv_inner_1_0= rulePrimitive ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1534:1: (lv_inner_1_0= rulePrimitive )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1534:1: (lv_inner_1_0= rulePrimitive )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1535:3: lv_inner_1_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getInnerPrimitiveParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_ruleUnary3448);
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


    // $ANTLR start "entryRuleInRange"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1561:1: entryRuleInRange returns [EObject current=null] : iv_ruleInRange= ruleInRange EOF ;
    public final EObject entryRuleInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInRange = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1562:2: (iv_ruleInRange= ruleInRange EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1563:2: iv_ruleInRange= ruleInRange EOF
            {
             newCompositeNode(grammarAccess.getInRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInRange_in_entryRuleInRange3486);
            iv_ruleInRange=ruleInRange();

            state._fsp--;

             current =iv_ruleInRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInRange3496); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1570:1: ruleInRange returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) ) ;
    public final EObject ruleInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1573:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1574:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1574:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1574:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleValueRange ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1574:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1575:1: (otherlv_0= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1575:1: (otherlv_0= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1576:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInRangeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInRange3541); 

            		newLeafNode(otherlv_0, grammarAccess.getInRangeAccess().getParameterParameterCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInRange3553); 

                	newLeafNode(otherlv_1, grammarAccess.getInRangeAccess().getInKeyword_1());
                
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1591:1: ( (lv_range_2_0= ruleValueRange ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1592:1: (lv_range_2_0= ruleValueRange )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1592:1: (lv_range_2_0= ruleValueRange )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1593:3: lv_range_2_0= ruleValueRange
            {
             
            	        newCompositeNode(grammarAccess.getInRangeAccess().getRangeValueRangeParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueRange_in_ruleInRange3574);
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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1617:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1618:2: (iv_ruleInteger= ruleInteger EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1619:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger3610);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger3620); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1626:1: ruleInteger returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1629:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1630:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1630:1: ( (lv_value_0_0= ruleEInt ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1631:1: (lv_value_0_0= ruleEInt )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1631:1: (lv_value_0_0= ruleEInt )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1632:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInteger3665);
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


    // $ANTLR start "entryRuleBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1656:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1657:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1658:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean3700);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean3710); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1665:1: ruleBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1668:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1669:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1669:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1670:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1670:1: (lv_value_0_0= ruleEBoolean )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1671:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBoolean3755);
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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1695:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1696:2: (iv_ruleString0= ruleString0 EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1697:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString03790);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString03800); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1704:1: ruleString0 returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1707:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1708:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1708:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1709:1: (lv_value_0_0= RULE_STRING )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1709:1: (lv_value_0_0= RULE_STRING )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1710:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString03841); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1734:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1735:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1736:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier3881);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier3891); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1743:1: ruleIdentifier returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1746:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1747:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1747:1: ( (otherlv_0= RULE_ID ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1748:1: (otherlv_0= RULE_ID )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1748:1: (otherlv_0= RULE_ID )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1749:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier3935); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1768:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1769:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1770:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3971);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3982); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1777:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1780:28: (this_INT_0= RULE_INT )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1781:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4021); 

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


    // $ANTLR start "entryRuleEBoolean"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1798:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1799:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1800:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean4068);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean4079); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1807:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1810:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1811:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1811:1: (kw= 'true' | kw= 'false' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            else if ( (LA26_0==30) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1812:2: kw= 'true'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEBoolean4117); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1819:2: kw= 'false'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEBoolean4136); 

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


    // $ANTLR start "ruleLogicalOrOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1832:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1834:28: ( (enumLiteral_0= 'or' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1835:1: (enumLiteral_0= 'or' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1835:1: (enumLiteral_0= 'or' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1835:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLogicalOrOperator4189); 

                    current = grammarAccess.getLogicalOrOperatorAccess().getLogicalOrEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getLogicalOrEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1845:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1847:28: ( (enumLiteral_0= 'and' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1848:1: (enumLiteral_0= 'and' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1848:1: (enumLiteral_0= 'and' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1848:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLogicalAndOperator4232); 

                    current = grammarAccess.getLogicalAndOperatorAccess().getLogicalAndEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getLogicalAndEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1858:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1860:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1861:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1861:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            else if ( (LA27_0==34) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1861:2: (enumLiteral_0= '==' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1861:2: (enumLiteral_0= '==' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1861:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEqualityOperator4276); 

                            current = grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1867:6: (enumLiteral_1= '!=' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1867:6: (enumLiteral_1= '!=' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1867:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEqualityOperator4293); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1877:1: ruleComparativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) ;
    public final Enumerator ruleComparativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1879:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1880:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1880:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            else if ( (LA28_0==36) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1880:2: (enumLiteral_0= '<' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1880:2: (enumLiteral_0= '<' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1880:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleComparativeOperator4338); 

                            current = grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1886:6: (enumLiteral_1= '>' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1886:6: (enumLiteral_1= '>' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1886:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleComparativeOperator4355); 

                            current = grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_1()); 
                        

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1896:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1898:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1899:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1899:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            else if ( (LA29_0==38) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1899:2: (enumLiteral_0= '+' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1899:2: (enumLiteral_0= '+' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1899:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAdditiveOperator4400); 

                            current = grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getAdditionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1905:6: (enumLiteral_1= '-' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1905:6: (enumLiteral_1= '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1905:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAdditiveOperator4417); 

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1915:1: ruleMultiplicativeOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1917:28: ( (enumLiteral_0= '*' ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1918:1: (enumLiteral_0= '*' )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1918:1: (enumLiteral_0= '*' )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1918:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMultiplicativeOperator4461); 

                    current = grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMultiplicationEnumLiteralDeclaration()); 
                

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
    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1928:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1930:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) )
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1931:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            {
            // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1931:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            else if ( (LA30_0==40) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1931:2: (enumLiteral_0= '-' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1931:2: (enumLiteral_0= '-' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1931:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleUnaryOperator4505); 

                            current = grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getInversionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1937:6: (enumLiteral_1= 'not' )
                    {
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1937:6: (enumLiteral_1= 'not' )
                    // ../dk.itu.smdp2015.church.configurator.syntax/src-gen/dk/itu/smdp2015/church/parser/antlr/internal/InternalConfigurator.g:1937:8: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleUnaryOperator4522); 

                            current = grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_1()); 
                        

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

    // Delegated rules


 

    
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
        public static final BitSet FOLLOW_16_in_ruleParameterGroup556 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameterGroup577 = new BitSet(new long[]{0x0000000000031002L});
        public static final BitSet FOLLOW_17_in_ruleParameterGroup645 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterGroup657 = new BitSet(new long[]{0x0000014068400070L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleParameterGroup678 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleParameterGroup691 = new BitSet(new long[]{0x0000014068400070L});
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
        public static final BitSet FOLLOW_16_in_ruleParameter1234 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameter1255 = new BitSet(new long[]{0x00000000003B0002L});
        public static final BitSet FOLLOW_17_in_ruleParameter1323 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameter1335 = new BitSet(new long[]{0x0000014068400070L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleParameter1356 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleParameter1369 = new BitSet(new long[]{0x0000014068400070L});
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
        public static final BitSet FOLLOW_22_in_ruleEnumerated1742 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEnumerated1763 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_ruleEnumerated1776 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEnumerated1797 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_ruleEnumerated1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBounded_in_entryRuleBounded1847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBounded1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleBounded1894 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBounded1915 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleBounded1927 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBounded1948 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleBounded1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleConstraint2044 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint2061 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConstraint2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOr_in_ruleExpression2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr2215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOr2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAnd_in_ruleLogicalOr2272 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOr2302 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleLogicalAnd_in_ruleLogicalOr2323 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd2361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAnd2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquality_in_ruleLogicalAnd2418 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAnd2448 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleEquality_in_ruleLogicalAnd2469 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality2507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquality2517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparative_in_ruleEquality2564 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleEquality2594 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleComparative_in_ruleEquality2615 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_ruleComparative_in_entryRuleComparative2653 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparative2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_ruleComparative2710 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_ruleComparativeOperator_in_ruleComparative2740 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleAdditive_in_ruleComparative2761 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_ruleAdditive_in_entryRuleAdditive2799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditive2809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_ruleAdditive2856 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleAdditive2886 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_ruleAdditive2907 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_ruleMultiplicative_in_entryRuleMultiplicative2945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicative2955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleMultiplicative3002 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicative3032 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleMultiplicative3053 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive3091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitive3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_rulePrimitive3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_rulePrimitive3175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rulePrimitive3202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rulePrimitive3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rulePrimitive3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rulePrimitive3283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePrimitive3301 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePrimitive3323 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePrimitive3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary3371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnary3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnary3427 = new BitSet(new long[]{0x0000014060400070L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleUnary3448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInRange_in_entryRuleInRange3486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInRange3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInRange3541 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInRange3553 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_ruleValueRange_in_ruleInRange3574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger3610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInteger3665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean3700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean3710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBoolean3755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString03790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString03800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString03841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier3881 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier3891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier3935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean4068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean4079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEBoolean4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEBoolean4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleLogicalOrOperator4189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLogicalAndOperator4232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEqualityOperator4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEqualityOperator4293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleComparativeOperator4338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleComparativeOperator4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAdditiveOperator4400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleAdditiveOperator4417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMultiplicativeOperator4461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleUnaryOperator4505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleUnaryOperator4522 = new BitSet(new long[]{0x0000000000000002L});
    }


}