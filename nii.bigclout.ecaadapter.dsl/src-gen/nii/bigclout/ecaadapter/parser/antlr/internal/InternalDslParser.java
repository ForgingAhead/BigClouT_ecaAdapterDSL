package nii.bigclout.ecaadapter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nii.bigclout.ecaadapter.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'resource'", "'can'", "'be'", "','", "'app'", "'priority'", "'on'", "'if'", "'do'", "'and'", "'else'", "'environment'", "'service'", "':='", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'.state'", "'('", "')'", "'not'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RunTimeModel";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRunTimeModel"
    // InternalDsl.g:64:1: entryRuleRunTimeModel returns [EObject current=null] : iv_ruleRunTimeModel= ruleRunTimeModel EOF ;
    public final EObject entryRuleRunTimeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunTimeModel = null;


        try {
            // InternalDsl.g:64:53: (iv_ruleRunTimeModel= ruleRunTimeModel EOF )
            // InternalDsl.g:65:2: iv_ruleRunTimeModel= ruleRunTimeModel EOF
            {
             newCompositeNode(grammarAccess.getRunTimeModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunTimeModel=ruleRunTimeModel();

            state._fsp--;

             current =iv_ruleRunTimeModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRunTimeModel"


    // $ANTLR start "ruleRunTimeModel"
    // InternalDsl.g:71:1: ruleRunTimeModel returns [EObject current=null] : ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) ) ( (lv_appData_2_0= ruleAppMetaData ) ) ( (lv_servicesData_3_0= ruleServiceMetaData ) )* ) ;
    public final EObject ruleRunTimeModel() throws RecognitionException {
        EObject current = null;

        EObject lv_envData_1_0 = null;

        EObject lv_appData_2_0 = null;

        EObject lv_servicesData_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) ) ( (lv_appData_2_0= ruleAppMetaData ) ) ( (lv_servicesData_3_0= ruleServiceMetaData ) )* ) )
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) ) ( (lv_appData_2_0= ruleAppMetaData ) ) ( (lv_servicesData_3_0= ruleServiceMetaData ) )* )
            {
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) ) ( (lv_appData_2_0= ruleAppMetaData ) ) ( (lv_servicesData_3_0= ruleServiceMetaData ) )* )
            // InternalDsl.g:79:3: () ( (lv_envData_1_0= ruleEnvironmentMetaData ) ) ( (lv_appData_2_0= ruleAppMetaData ) ) ( (lv_servicesData_3_0= ruleServiceMetaData ) )*
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0(),
            					current);
            			

            }

            // InternalDsl.g:86:3: ( (lv_envData_1_0= ruleEnvironmentMetaData ) )
            // InternalDsl.g:87:4: (lv_envData_1_0= ruleEnvironmentMetaData )
            {
            // InternalDsl.g:87:4: (lv_envData_1_0= ruleEnvironmentMetaData )
            // InternalDsl.g:88:5: lv_envData_1_0= ruleEnvironmentMetaData
            {

            					newCompositeNode(grammarAccess.getRunTimeModelAccess().getEnvDataEnvironmentMetaDataParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_envData_1_0=ruleEnvironmentMetaData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunTimeModelRule());
            					}
            					add(
            						current,
            						"envData",
            						lv_envData_1_0,
            						"nii.bigclout.ecaadapter.Dsl.EnvironmentMetaData");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:105:3: ( (lv_appData_2_0= ruleAppMetaData ) )
            // InternalDsl.g:106:4: (lv_appData_2_0= ruleAppMetaData )
            {
            // InternalDsl.g:106:4: (lv_appData_2_0= ruleAppMetaData )
            // InternalDsl.g:107:5: lv_appData_2_0= ruleAppMetaData
            {

            					newCompositeNode(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_appData_2_0=ruleAppMetaData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunTimeModelRule());
            					}
            					add(
            						current,
            						"appData",
            						lv_appData_2_0,
            						"nii.bigclout.ecaadapter.Dsl.AppMetaData");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:124:3: ( (lv_servicesData_3_0= ruleServiceMetaData ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:125:4: (lv_servicesData_3_0= ruleServiceMetaData )
            	    {
            	    // InternalDsl.g:125:4: (lv_servicesData_3_0= ruleServiceMetaData )
            	    // InternalDsl.g:126:5: lv_servicesData_3_0= ruleServiceMetaData
            	    {

            	    					newCompositeNode(grammarAccess.getRunTimeModelAccess().getServicesDataServiceMetaDataParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_servicesData_3_0=ruleServiceMetaData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunTimeModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"servicesData",
            	    						lv_servicesData_3_0,
            	    						"nii.bigclout.ecaadapter.Dsl.ServiceMetaData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleRunTimeModel"


    // $ANTLR start "entryRuleState"
    // InternalDsl.g:147:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalDsl.g:147:46: (iv_ruleState= ruleState EOF )
            // InternalDsl.g:148:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDsl.g:154:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:160:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:161:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:161:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:162:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:162:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:163:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nii.bigclout.ecaadapter.Dsl.ID");
            			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleResource"
    // InternalDsl.g:182:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalDsl.g:182:49: (iv_ruleResource= ruleResource EOF )
            // InternalDsl.g:183:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalDsl.g:189:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_states_4_0 = null;

        EObject lv_states_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:195:2: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* ) )
            // InternalDsl.g:196:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* )
            {
            // InternalDsl.g:196:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* )
            // InternalDsl.g:197:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalDsl.g:201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:202:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"nii.bigclout.ecaadapter.Dsl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getCanKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getBeKeyword_3());
            		
            // InternalDsl.g:227:3: ( (lv_states_4_0= ruleState ) )
            // InternalDsl.g:228:4: (lv_states_4_0= ruleState )
            {
            // InternalDsl.g:228:4: (lv_states_4_0= ruleState )
            // InternalDsl.g:229:5: lv_states_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_states_4_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_4_0,
            						"nii.bigclout.ecaadapter.Dsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:246:3: (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:247:4: otherlv_5= ',' ( (lv_states_6_0= ruleState ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:251:4: ( (lv_states_6_0= ruleState ) )
            	    // InternalDsl.g:252:5: (lv_states_6_0= ruleState )
            	    {
            	    // InternalDsl.g:252:5: (lv_states_6_0= ruleState )
            	    // InternalDsl.g:253:6: lv_states_6_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_states_6_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_6_0,
            	    							"nii.bigclout.ecaadapter.Dsl.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleAppMetaData"
    // InternalDsl.g:275:1: entryRuleAppMetaData returns [EObject current=null] : iv_ruleAppMetaData= ruleAppMetaData EOF ;
    public final EObject entryRuleAppMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppMetaData = null;


        try {
            // InternalDsl.g:275:52: (iv_ruleAppMetaData= ruleAppMetaData EOF )
            // InternalDsl.g:276:2: iv_ruleAppMetaData= ruleAppMetaData EOF
            {
             newCompositeNode(grammarAccess.getAppMetaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppMetaData=ruleAppMetaData();

            state._fsp--;

             current =iv_ruleAppMetaData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppMetaData"


    // $ANTLR start "ruleAppMetaData"
    // InternalDsl.g:282:1: ruleAppMetaData returns [EObject current=null] : (otherlv_0= 'app' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE ) ;
    public final EObject ruleAppMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appID_1_0=null;
        EObject lv_specifications_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:288:2: ( (otherlv_0= 'app' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE ) )
            // InternalDsl.g:289:2: (otherlv_0= 'app' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE )
            {
            // InternalDsl.g:289:2: (otherlv_0= 'app' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE )
            // InternalDsl.g:290:3: otherlv_0= 'app' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAppMetaDataAccess().getAppKeyword_0());
            		
            // InternalDsl.g:294:3: ( (lv_appID_1_0= RULE_ID ) )
            // InternalDsl.g:295:4: (lv_appID_1_0= RULE_ID )
            {
            // InternalDsl.g:295:4: (lv_appID_1_0= RULE_ID )
            // InternalDsl.g:296:5: lv_appID_1_0= RULE_ID
            {
            lv_appID_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_appID_1_0, grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppMetaDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appID",
            						lv_appID_1_0,
            						"nii.bigclout.ecaadapter.Dsl.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getAppMetaDataAccess().getLBRACEParserRuleCall_2());
            		
            pushFollow(FOLLOW_10);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:319:3: ( (lv_specifications_3_0= ruleSpecification ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:320:4: (lv_specifications_3_0= ruleSpecification )
            	    {
            	    // InternalDsl.g:320:4: (lv_specifications_3_0= ruleSpecification )
            	    // InternalDsl.g:321:5: lv_specifications_3_0= ruleSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getAppMetaDataAccess().getSpecificationsSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_specifications_3_0=ruleSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppMetaDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specifications",
            	    						lv_specifications_3_0,
            	    						"nii.bigclout.ecaadapter.Dsl.Specification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getAppMetaDataAccess().getRBRACEParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleAppMetaData"


    // $ANTLR start "entryRuleSpecification"
    // InternalDsl.g:349:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalDsl.g:349:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalDsl.g:350:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalDsl.g:356:1: ruleSpecification returns [EObject current=null] : ( ( (lv_specID_0_0= RULE_ID ) )? (otherlv_1= 'priority' ( (lv_priority_2_0= RULE_INT ) ) )? otherlv_3= 'on' ( (lv_trigger_4_0= ruleOrElement ) )* ( (lv_ifdo_5_0= ruleIfDoSpec ) ) ( (lv_elseIfDo_6_0= ruleElseIfDoSpec ) )* ( (lv_elseDo_7_0= ruleElseDoSpec ) )? ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_specID_0_0=null;
        Token otherlv_1=null;
        Token lv_priority_2_0=null;
        Token otherlv_3=null;
        EObject lv_trigger_4_0 = null;

        EObject lv_ifdo_5_0 = null;

        EObject lv_elseIfDo_6_0 = null;

        EObject lv_elseDo_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:362:2: ( ( ( (lv_specID_0_0= RULE_ID ) )? (otherlv_1= 'priority' ( (lv_priority_2_0= RULE_INT ) ) )? otherlv_3= 'on' ( (lv_trigger_4_0= ruleOrElement ) )* ( (lv_ifdo_5_0= ruleIfDoSpec ) ) ( (lv_elseIfDo_6_0= ruleElseIfDoSpec ) )* ( (lv_elseDo_7_0= ruleElseDoSpec ) )? ) )
            // InternalDsl.g:363:2: ( ( (lv_specID_0_0= RULE_ID ) )? (otherlv_1= 'priority' ( (lv_priority_2_0= RULE_INT ) ) )? otherlv_3= 'on' ( (lv_trigger_4_0= ruleOrElement ) )* ( (lv_ifdo_5_0= ruleIfDoSpec ) ) ( (lv_elseIfDo_6_0= ruleElseIfDoSpec ) )* ( (lv_elseDo_7_0= ruleElseDoSpec ) )? )
            {
            // InternalDsl.g:363:2: ( ( (lv_specID_0_0= RULE_ID ) )? (otherlv_1= 'priority' ( (lv_priority_2_0= RULE_INT ) ) )? otherlv_3= 'on' ( (lv_trigger_4_0= ruleOrElement ) )* ( (lv_ifdo_5_0= ruleIfDoSpec ) ) ( (lv_elseIfDo_6_0= ruleElseIfDoSpec ) )* ( (lv_elseDo_7_0= ruleElseDoSpec ) )? )
            // InternalDsl.g:364:3: ( (lv_specID_0_0= RULE_ID ) )? (otherlv_1= 'priority' ( (lv_priority_2_0= RULE_INT ) ) )? otherlv_3= 'on' ( (lv_trigger_4_0= ruleOrElement ) )* ( (lv_ifdo_5_0= ruleIfDoSpec ) ) ( (lv_elseIfDo_6_0= ruleElseIfDoSpec ) )* ( (lv_elseDo_7_0= ruleElseDoSpec ) )?
            {
            // InternalDsl.g:364:3: ( (lv_specID_0_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:365:4: (lv_specID_0_0= RULE_ID )
                    {
                    // InternalDsl.g:365:4: (lv_specID_0_0= RULE_ID )
                    // InternalDsl.g:366:5: lv_specID_0_0= RULE_ID
                    {
                    lv_specID_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_specID_0_0, grammarAccess.getSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpecificationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"specID",
                    						lv_specID_0_0,
                    						"nii.bigclout.ecaadapter.Dsl.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:382:3: (otherlv_1= 'priority' ( (lv_priority_2_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:383:4: otherlv_1= 'priority' ( (lv_priority_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getSpecificationAccess().getPriorityKeyword_1_0());
                    			
                    // InternalDsl.g:387:4: ( (lv_priority_2_0= RULE_INT ) )
                    // InternalDsl.g:388:5: (lv_priority_2_0= RULE_INT )
                    {
                    // InternalDsl.g:388:5: (lv_priority_2_0= RULE_INT )
                    // InternalDsl.g:389:6: lv_priority_2_0= RULE_INT
                    {
                    lv_priority_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_priority_2_0, grammarAccess.getSpecificationAccess().getPriorityINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_2_0,
                    							"nii.bigclout.ecaadapter.Dsl.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getOnKeyword_2());
            		
            // InternalDsl.g:410:3: ( (lv_trigger_4_0= ruleOrElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_BOOLEAN)||LA6_0==39||LA6_0==41) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:411:4: (lv_trigger_4_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:411:4: (lv_trigger_4_0= ruleOrElement )
            	    // InternalDsl.g:412:5: lv_trigger_4_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getTriggerOrElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_trigger_4_0=ruleOrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trigger",
            	    						lv_trigger_4_0,
            	    						"nii.bigclout.ecaadapter.Dsl.OrElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalDsl.g:429:3: ( (lv_ifdo_5_0= ruleIfDoSpec ) )
            // InternalDsl.g:430:4: (lv_ifdo_5_0= ruleIfDoSpec )
            {
            // InternalDsl.g:430:4: (lv_ifdo_5_0= ruleIfDoSpec )
            // InternalDsl.g:431:5: lv_ifdo_5_0= ruleIfDoSpec
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getIfdoIfDoSpecParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_ifdo_5_0=ruleIfDoSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"ifdo",
            						lv_ifdo_5_0,
            						"nii.bigclout.ecaadapter.Dsl.IfDoSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:448:3: ( (lv_elseIfDo_6_0= ruleElseIfDoSpec ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==19) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:449:4: (lv_elseIfDo_6_0= ruleElseIfDoSpec )
            	    {
            	    // InternalDsl.g:449:4: (lv_elseIfDo_6_0= ruleElseIfDoSpec )
            	    // InternalDsl.g:450:5: lv_elseIfDo_6_0= ruleElseIfDoSpec
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getElseIfDoElseIfDoSpecParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_elseIfDo_6_0=ruleElseIfDoSpec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elseIfDo",
            	    						lv_elseIfDo_6_0,
            	    						"nii.bigclout.ecaadapter.Dsl.ElseIfDoSpec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDsl.g:467:3: ( (lv_elseDo_7_0= ruleElseDoSpec ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:468:4: (lv_elseDo_7_0= ruleElseDoSpec )
                    {
                    // InternalDsl.g:468:4: (lv_elseDo_7_0= ruleElseDoSpec )
                    // InternalDsl.g:469:5: lv_elseDo_7_0= ruleElseDoSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getElseDoElseDoSpecParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elseDo_7_0=ruleElseDoSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"elseDo",
                    						lv_elseDo_7_0,
                    						"nii.bigclout.ecaadapter.Dsl.ElseDoSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleIfDoSpec"
    // InternalDsl.g:490:1: entryRuleIfDoSpec returns [EObject current=null] : iv_ruleIfDoSpec= ruleIfDoSpec EOF ;
    public final EObject entryRuleIfDoSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfDoSpec = null;


        try {
            // InternalDsl.g:490:49: (iv_ruleIfDoSpec= ruleIfDoSpec EOF )
            // InternalDsl.g:491:2: iv_ruleIfDoSpec= ruleIfDoSpec EOF
            {
             newCompositeNode(grammarAccess.getIfDoSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfDoSpec=ruleIfDoSpec();

            state._fsp--;

             current =iv_ruleIfDoSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfDoSpec"


    // $ANTLR start "ruleIfDoSpec"
    // InternalDsl.g:497:1: ruleIfDoSpec returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOrElement ) ) otherlv_2= 'do' ( (lv_action_3_0= ruleAction ) ) (otherlv_4= 'and' ( (lv_action_5_0= ruleAction ) ) )* ) ;
    public final EObject ruleIfDoSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_3_0 = null;

        EObject lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:503:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOrElement ) ) otherlv_2= 'do' ( (lv_action_3_0= ruleAction ) ) (otherlv_4= 'and' ( (lv_action_5_0= ruleAction ) ) )* ) )
            // InternalDsl.g:504:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOrElement ) ) otherlv_2= 'do' ( (lv_action_3_0= ruleAction ) ) (otherlv_4= 'and' ( (lv_action_5_0= ruleAction ) ) )* )
            {
            // InternalDsl.g:504:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOrElement ) ) otherlv_2= 'do' ( (lv_action_3_0= ruleAction ) ) (otherlv_4= 'and' ( (lv_action_5_0= ruleAction ) ) )* )
            // InternalDsl.g:505:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOrElement ) ) otherlv_2= 'do' ( (lv_action_3_0= ruleAction ) ) (otherlv_4= 'and' ( (lv_action_5_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIfDoSpecAccess().getIfKeyword_0());
            		
            // InternalDsl.g:509:3: ( (lv_condition_1_0= ruleOrElement ) )
            // InternalDsl.g:510:4: (lv_condition_1_0= ruleOrElement )
            {
            // InternalDsl.g:510:4: (lv_condition_1_0= ruleOrElement )
            // InternalDsl.g:511:5: lv_condition_1_0= ruleOrElement
            {

            					newCompositeNode(grammarAccess.getIfDoSpecAccess().getConditionOrElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_condition_1_0=ruleOrElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfDoSpecRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"nii.bigclout.ecaadapter.Dsl.OrElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIfDoSpecAccess().getDoKeyword_2());
            		
            // InternalDsl.g:532:3: ( (lv_action_3_0= ruleAction ) )
            // InternalDsl.g:533:4: (lv_action_3_0= ruleAction )
            {
            // InternalDsl.g:533:4: (lv_action_3_0= ruleAction )
            // InternalDsl.g:534:5: lv_action_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getIfDoSpecAccess().getActionActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_action_3_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfDoSpecRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_3_0,
            						"nii.bigclout.ecaadapter.Dsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:551:3: (otherlv_4= 'and' ( (lv_action_5_0= ruleAction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:552:4: otherlv_4= 'and' ( (lv_action_5_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfDoSpecAccess().getAndKeyword_4_0());
            	    			
            	    // InternalDsl.g:556:4: ( (lv_action_5_0= ruleAction ) )
            	    // InternalDsl.g:557:5: (lv_action_5_0= ruleAction )
            	    {
            	    // InternalDsl.g:557:5: (lv_action_5_0= ruleAction )
            	    // InternalDsl.g:558:6: lv_action_5_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getIfDoSpecAccess().getActionActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_action_5_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfDoSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_5_0,
            	    							"nii.bigclout.ecaadapter.Dsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleIfDoSpec"


    // $ANTLR start "entryRuleElseIfDoSpec"
    // InternalDsl.g:580:1: entryRuleElseIfDoSpec returns [EObject current=null] : iv_ruleElseIfDoSpec= ruleElseIfDoSpec EOF ;
    public final EObject entryRuleElseIfDoSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfDoSpec = null;


        try {
            // InternalDsl.g:580:53: (iv_ruleElseIfDoSpec= ruleElseIfDoSpec EOF )
            // InternalDsl.g:581:2: iv_ruleElseIfDoSpec= ruleElseIfDoSpec EOF
            {
             newCompositeNode(grammarAccess.getElseIfDoSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseIfDoSpec=ruleElseIfDoSpec();

            state._fsp--;

             current =iv_ruleElseIfDoSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElseIfDoSpec"


    // $ANTLR start "ruleElseIfDoSpec"
    // InternalDsl.g:587:1: ruleElseIfDoSpec returns [EObject current=null] : (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleOrElement ) ) otherlv_3= 'do' ( (lv_action_4_0= ruleAction ) ) (otherlv_5= 'and' ( (lv_action_6_0= ruleAction ) ) )* ) ;
    public final EObject ruleElseIfDoSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_action_4_0 = null;

        EObject lv_action_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:593:2: ( (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleOrElement ) ) otherlv_3= 'do' ( (lv_action_4_0= ruleAction ) ) (otherlv_5= 'and' ( (lv_action_6_0= ruleAction ) ) )* ) )
            // InternalDsl.g:594:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleOrElement ) ) otherlv_3= 'do' ( (lv_action_4_0= ruleAction ) ) (otherlv_5= 'and' ( (lv_action_6_0= ruleAction ) ) )* )
            {
            // InternalDsl.g:594:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleOrElement ) ) otherlv_3= 'do' ( (lv_action_4_0= ruleAction ) ) (otherlv_5= 'and' ( (lv_action_6_0= ruleAction ) ) )* )
            // InternalDsl.g:595:3: otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleOrElement ) ) otherlv_3= 'do' ( (lv_action_4_0= ruleAction ) ) (otherlv_5= 'and' ( (lv_action_6_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getElseIfDoSpecAccess().getElseKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getElseIfDoSpecAccess().getIfKeyword_1());
            		
            // InternalDsl.g:603:3: ( (lv_condition_2_0= ruleOrElement ) )
            // InternalDsl.g:604:4: (lv_condition_2_0= ruleOrElement )
            {
            // InternalDsl.g:604:4: (lv_condition_2_0= ruleOrElement )
            // InternalDsl.g:605:5: lv_condition_2_0= ruleOrElement
            {

            					newCompositeNode(grammarAccess.getElseIfDoSpecAccess().getConditionOrElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_condition_2_0=ruleOrElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseIfDoSpecRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"nii.bigclout.ecaadapter.Dsl.OrElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getElseIfDoSpecAccess().getDoKeyword_3());
            		
            // InternalDsl.g:626:3: ( (lv_action_4_0= ruleAction ) )
            // InternalDsl.g:627:4: (lv_action_4_0= ruleAction )
            {
            // InternalDsl.g:627:4: (lv_action_4_0= ruleAction )
            // InternalDsl.g:628:5: lv_action_4_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getElseIfDoSpecAccess().getActionActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_action_4_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseIfDoSpecRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_4_0,
            						"nii.bigclout.ecaadapter.Dsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:645:3: (otherlv_5= 'and' ( (lv_action_6_0= ruleAction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:646:4: otherlv_5= 'and' ( (lv_action_6_0= ruleAction ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getElseIfDoSpecAccess().getAndKeyword_5_0());
            	    			
            	    // InternalDsl.g:650:4: ( (lv_action_6_0= ruleAction ) )
            	    // InternalDsl.g:651:5: (lv_action_6_0= ruleAction )
            	    {
            	    // InternalDsl.g:651:5: (lv_action_6_0= ruleAction )
            	    // InternalDsl.g:652:6: lv_action_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getElseIfDoSpecAccess().getActionActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_action_6_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElseIfDoSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_6_0,
            	    							"nii.bigclout.ecaadapter.Dsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleElseIfDoSpec"


    // $ANTLR start "entryRuleElseDoSpec"
    // InternalDsl.g:674:1: entryRuleElseDoSpec returns [EObject current=null] : iv_ruleElseDoSpec= ruleElseDoSpec EOF ;
    public final EObject entryRuleElseDoSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseDoSpec = null;


        try {
            // InternalDsl.g:674:51: (iv_ruleElseDoSpec= ruleElseDoSpec EOF )
            // InternalDsl.g:675:2: iv_ruleElseDoSpec= ruleElseDoSpec EOF
            {
             newCompositeNode(grammarAccess.getElseDoSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseDoSpec=ruleElseDoSpec();

            state._fsp--;

             current =iv_ruleElseDoSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElseDoSpec"


    // $ANTLR start "ruleElseDoSpec"
    // InternalDsl.g:681:1: ruleElseDoSpec returns [EObject current=null] : (otherlv_0= 'else' otherlv_1= 'do' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= 'and' ( (lv_action_4_0= ruleAction ) ) )* ) ;
    public final EObject ruleElseDoSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_action_2_0 = null;

        EObject lv_action_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:687:2: ( (otherlv_0= 'else' otherlv_1= 'do' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= 'and' ( (lv_action_4_0= ruleAction ) ) )* ) )
            // InternalDsl.g:688:2: (otherlv_0= 'else' otherlv_1= 'do' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= 'and' ( (lv_action_4_0= ruleAction ) ) )* )
            {
            // InternalDsl.g:688:2: (otherlv_0= 'else' otherlv_1= 'do' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= 'and' ( (lv_action_4_0= ruleAction ) ) )* )
            // InternalDsl.g:689:3: otherlv_0= 'else' otherlv_1= 'do' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= 'and' ( (lv_action_4_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getElseDoSpecAccess().getElseKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getElseDoSpecAccess().getDoKeyword_1());
            		
            // InternalDsl.g:697:3: ( (lv_action_2_0= ruleAction ) )
            // InternalDsl.g:698:4: (lv_action_2_0= ruleAction )
            {
            // InternalDsl.g:698:4: (lv_action_2_0= ruleAction )
            // InternalDsl.g:699:5: lv_action_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getElseDoSpecAccess().getActionActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_action_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseDoSpecRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_2_0,
            						"nii.bigclout.ecaadapter.Dsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:716:3: (otherlv_3= 'and' ( (lv_action_4_0= ruleAction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:717:4: otherlv_3= 'and' ( (lv_action_4_0= ruleAction ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getElseDoSpecAccess().getAndKeyword_3_0());
            	    			
            	    // InternalDsl.g:721:4: ( (lv_action_4_0= ruleAction ) )
            	    // InternalDsl.g:722:5: (lv_action_4_0= ruleAction )
            	    {
            	    // InternalDsl.g:722:5: (lv_action_4_0= ruleAction )
            	    // InternalDsl.g:723:6: lv_action_4_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getElseDoSpecAccess().getActionActionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_action_4_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElseDoSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_4_0,
            	    							"nii.bigclout.ecaadapter.Dsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleElseDoSpec"


    // $ANTLR start "entryRuleEnvironmentMetaData"
    // InternalDsl.g:745:1: entryRuleEnvironmentMetaData returns [EObject current=null] : iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF ;
    public final EObject entryRuleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentMetaData = null;


        try {
            // InternalDsl.g:745:60: (iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF )
            // InternalDsl.g:746:2: iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentMetaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentMetaData=ruleEnvironmentMetaData();

            state._fsp--;

             current =iv_ruleEnvironmentMetaData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnvironmentMetaData"


    // $ANTLR start "ruleEnvironmentMetaData"
    // InternalDsl.g:752:1: ruleEnvironmentMetaData returns [EObject current=null] : ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )+ ruleRBRACE ) ;
    public final EObject ruleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resources_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:758:2: ( ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )+ ruleRBRACE ) )
            // InternalDsl.g:759:2: ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )+ ruleRBRACE )
            {
            // InternalDsl.g:759:2: ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )+ ruleRBRACE )
            // InternalDsl.g:760:3: () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )+ ruleRBRACE
            {
            // InternalDsl.g:760:3: ()
            // InternalDsl.g:761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentKeyword_1());
            		

            			newCompositeNode(grammarAccess.getEnvironmentMetaDataAccess().getLBRACEParserRuleCall_2());
            		
            pushFollow(FOLLOW_20);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:778:3: ( (lv_resources_3_0= ruleResource ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:779:4: (lv_resources_3_0= ruleResource )
            	    {
            	    // InternalDsl.g:779:4: (lv_resources_3_0= ruleResource )
            	    // InternalDsl.g:780:5: lv_resources_3_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_resources_3_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnvironmentMetaDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_3_0,
            	    						"nii.bigclout.ecaadapter.Dsl.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            			newCompositeNode(grammarAccess.getEnvironmentMetaDataAccess().getRBRACEParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleEnvironmentMetaData"


    // $ANTLR start "entryRuleServiceMetaData"
    // InternalDsl.g:808:1: entryRuleServiceMetaData returns [EObject current=null] : iv_ruleServiceMetaData= ruleServiceMetaData EOF ;
    public final EObject entryRuleServiceMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMetaData = null;


        try {
            // InternalDsl.g:808:56: (iv_ruleServiceMetaData= ruleServiceMetaData EOF )
            // InternalDsl.g:809:2: iv_ruleServiceMetaData= ruleServiceMetaData EOF
            {
             newCompositeNode(grammarAccess.getServiceMetaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceMetaData=ruleServiceMetaData();

            state._fsp--;

             current =iv_ruleServiceMetaData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServiceMetaData"


    // $ANTLR start "ruleServiceMetaData"
    // InternalDsl.g:815:1: ruleServiceMetaData returns [EObject current=null] : (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) ) ;
    public final EObject ruleServiceMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_serviceID_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:821:2: ( (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:822:2: (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:822:2: (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) )
            // InternalDsl.g:823:3: otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceMetaDataAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:827:3: ( (lv_serviceID_1_0= RULE_ID ) )
            // InternalDsl.g:828:4: (lv_serviceID_1_0= RULE_ID )
            {
            // InternalDsl.g:828:4: (lv_serviceID_1_0= RULE_ID )
            // InternalDsl.g:829:5: lv_serviceID_1_0= RULE_ID
            {
            lv_serviceID_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_serviceID_1_0, grammarAccess.getServiceMetaDataAccess().getServiceIDIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceMetaDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"serviceID",
            						lv_serviceID_1_0,
            						"nii.bigclout.ecaadapter.Dsl.ID");
            				

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
    // $ANTLR end "ruleServiceMetaData"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:849:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:849:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:850:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:856:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:862:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) )
            // InternalDsl.g:863:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            {
            // InternalDsl.g:863:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            // InternalDsl.g:864:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) )
            {
            // InternalDsl.g:864:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:865:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:865:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:866:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalDsl.g:881:3: ( (lv_state_2_0= ruleState ) )
            // InternalDsl.g:882:4: (lv_state_2_0= ruleState )
            {
            // InternalDsl.g:882:4: (lv_state_2_0= ruleState )
            // InternalDsl.g:883:5: lv_state_2_0= ruleState
            {

            					newCompositeNode(grammarAccess.getActionAccess().getStateStateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_2_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_2_0,
            						"nii.bigclout.ecaadapter.Dsl.State");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:904:1: entryRuleOrElement returns [EObject current=null] : iv_ruleOrElement= ruleOrElement EOF ;
    public final EObject entryRuleOrElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrElement = null;


        try {
            // InternalDsl.g:904:50: (iv_ruleOrElement= ruleOrElement EOF )
            // InternalDsl.g:905:2: iv_ruleOrElement= ruleOrElement EOF
            {
             newCompositeNode(grammarAccess.getOrElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrElement=ruleOrElement();

            state._fsp--;

             current =iv_ruleOrElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrElement"


    // $ANTLR start "ruleOrElement"
    // InternalDsl.g:911:1: ruleOrElement returns [EObject current=null] : (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) ;
    public final EObject ruleOrElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:917:2: ( (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) )
            // InternalDsl.g:918:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            {
            // InternalDsl.g:918:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            // InternalDsl.g:919:3: this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_AndElement_0=ruleAndElement();

            state._fsp--;


            			current = this_AndElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:927:3: (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:928:4: otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrElementAccess().getOrKeyword_1_0());
            	    			
            	    // InternalDsl.g:932:4: ()
            	    // InternalDsl.g:933:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:939:4: ( (lv_right_3_0= ruleAndElement ) )
            	    // InternalDsl.g:940:5: (lv_right_3_0= ruleAndElement )
            	    {
            	    // InternalDsl.g:940:5: (lv_right_3_0= ruleAndElement )
            	    // InternalDsl.g:941:6: lv_right_3_0= ruleAndElement
            	    {

            	    						newCompositeNode(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleAndElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrElementRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nii.bigclout.ecaadapter.Dsl.AndElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleOrElement"


    // $ANTLR start "entryRuleAndElement"
    // InternalDsl.g:963:1: entryRuleAndElement returns [EObject current=null] : iv_ruleAndElement= ruleAndElement EOF ;
    public final EObject entryRuleAndElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndElement = null;


        try {
            // InternalDsl.g:963:51: (iv_ruleAndElement= ruleAndElement EOF )
            // InternalDsl.g:964:2: iv_ruleAndElement= ruleAndElement EOF
            {
             newCompositeNode(grammarAccess.getAndElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndElement=ruleAndElement();

            state._fsp--;

             current =iv_ruleAndElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndElement"


    // $ANTLR start "ruleAndElement"
    // InternalDsl.g:970:1: ruleAndElement returns [EObject current=null] : (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) ;
    public final EObject ruleAndElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DiffEqualElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:976:2: ( (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) )
            // InternalDsl.g:977:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            {
            // InternalDsl.g:977:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            // InternalDsl.g:978:3: this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_DiffEqualElement_0=ruleDiffEqualElement();

            state._fsp--;


            			current = this_DiffEqualElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:986:3: (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:987:4: otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndElementAccess().getAndKeyword_1_0());
            	    			
            	    // InternalDsl.g:991:4: ()
            	    // InternalDsl.g:992:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:998:4: ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    // InternalDsl.g:999:5: (lv_right_3_0= ruleDiffEqualElement )
            	    {
            	    // InternalDsl.g:999:5: (lv_right_3_0= ruleDiffEqualElement )
            	    // InternalDsl.g:1000:6: lv_right_3_0= ruleDiffEqualElement
            	    {

            	    						newCompositeNode(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleDiffEqualElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndElementRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nii.bigclout.ecaadapter.Dsl.DiffEqualElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleAndElement"


    // $ANTLR start "entryRuleDiffEqualElement"
    // InternalDsl.g:1022:1: entryRuleDiffEqualElement returns [EObject current=null] : iv_ruleDiffEqualElement= ruleDiffEqualElement EOF ;
    public final EObject entryRuleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiffEqualElement = null;


        try {
            // InternalDsl.g:1022:57: (iv_ruleDiffEqualElement= ruleDiffEqualElement EOF )
            // InternalDsl.g:1023:2: iv_ruleDiffEqualElement= ruleDiffEqualElement EOF
            {
             newCompositeNode(grammarAccess.getDiffEqualElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiffEqualElement=ruleDiffEqualElement();

            state._fsp--;

             current =iv_ruleDiffEqualElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiffEqualElement"


    // $ANTLR start "ruleDiffEqualElement"
    // InternalDsl.g:1029:1: ruleDiffEqualElement returns [EObject current=null] : (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) ;
    public final EObject ruleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_CompareElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1035:2: ( (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) )
            // InternalDsl.g:1036:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            {
            // InternalDsl.g:1036:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            // InternalDsl.g:1037:3: this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_CompareElement_0=ruleCompareElement();

            state._fsp--;


            			current = this_CompareElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1045:3: ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }
                else if ( (LA15_0==28) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1046:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:1046:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:1047:5: otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_16); 

            	    					newLeafNode(otherlv_1, grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1051:5: ()
            	    // InternalDsl.g:1052:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1058:5: ( (lv_right_3_0= ruleCompareElement ) )
            	    // InternalDsl.g:1059:6: (lv_right_3_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:1059:6: (lv_right_3_0= ruleCompareElement )
            	    // InternalDsl.g:1060:7: lv_right_3_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleCompareElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDiffEqualElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nii.bigclout.ecaadapter.Dsl.CompareElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1079:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:1079:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:1080:5: otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_16); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1084:5: ()
            	    // InternalDsl.g:1085:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1091:5: ( (lv_right_6_0= ruleCompareElement ) )
            	    // InternalDsl.g:1092:6: (lv_right_6_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:1092:6: (lv_right_6_0= ruleCompareElement )
            	    // InternalDsl.g:1093:7: lv_right_6_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_right_6_0=ruleCompareElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDiffEqualElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nii.bigclout.ecaadapter.Dsl.CompareElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleDiffEqualElement"


    // $ANTLR start "entryRuleCompareElement"
    // InternalDsl.g:1116:1: entryRuleCompareElement returns [EObject current=null] : iv_ruleCompareElement= ruleCompareElement EOF ;
    public final EObject entryRuleCompareElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareElement = null;


        try {
            // InternalDsl.g:1116:55: (iv_ruleCompareElement= ruleCompareElement EOF )
            // InternalDsl.g:1117:2: iv_ruleCompareElement= ruleCompareElement EOF
            {
             newCompositeNode(grammarAccess.getCompareElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareElement=ruleCompareElement();

            state._fsp--;

             current =iv_ruleCompareElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompareElement"


    // $ANTLR start "ruleCompareElement"
    // InternalDsl.g:1123:1: ruleCompareElement returns [EObject current=null] : (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) ;
    public final EObject ruleCompareElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_PlusMinusElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1129:2: ( (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) )
            // InternalDsl.g:1130:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            {
            // InternalDsl.g:1130:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            // InternalDsl.g:1131:3: this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_PlusMinusElement_0=rulePlusMinusElement();

            state._fsp--;


            			current = this_PlusMinusElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1139:3: ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            loop16:
            do {
                int alt16=5;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt16=1;
                    }
                    break;
                case 30:
                    {
                    alt16=2;
                    }
                    break;
                case 31:
                    {
                    alt16=3;
                    }
                    break;
                case 32:
                    {
                    alt16=4;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1140:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1140:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1141:5: otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_16); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1145:5: ()
            	    // InternalDsl.g:1146:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1152:5: ( (lv_right_3_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1153:6: (lv_right_3_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1153:6: (lv_right_3_0= rulePlusMinusElement )
            	    // InternalDsl.g:1154:7: lv_right_3_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=rulePlusMinusElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCompareElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nii.bigclout.ecaadapter.Dsl.PlusMinusElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1173:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1173:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1174:5: otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_16); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1178:5: ()
            	    // InternalDsl.g:1179:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1185:5: ( (lv_right_6_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1186:6: (lv_right_6_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1186:6: (lv_right_6_0= rulePlusMinusElement )
            	    // InternalDsl.g:1187:7: lv_right_6_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_right_6_0=rulePlusMinusElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCompareElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nii.bigclout.ecaadapter.Dsl.PlusMinusElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:1206:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1206:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1207:5: otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_16); 

            	    					newLeafNode(otherlv_7, grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:1211:5: ()
            	    // InternalDsl.g:1212:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1218:5: ( (lv_right_9_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1219:6: (lv_right_9_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1219:6: (lv_right_9_0= rulePlusMinusElement )
            	    // InternalDsl.g:1220:7: lv_right_9_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_right_9_0=rulePlusMinusElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCompareElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"nii.bigclout.ecaadapter.Dsl.PlusMinusElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:1239:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1239:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1240:5: otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_16); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0());
            	    				
            	    // InternalDsl.g:1244:5: ()
            	    // InternalDsl.g:1245:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1251:5: ( (lv_right_12_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1252:6: (lv_right_12_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1252:6: (lv_right_12_0= rulePlusMinusElement )
            	    // InternalDsl.g:1253:7: lv_right_12_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_right_12_0=rulePlusMinusElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCompareElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"nii.bigclout.ecaadapter.Dsl.PlusMinusElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleCompareElement"


    // $ANTLR start "entryRulePlusMinusElement"
    // InternalDsl.g:1276:1: entryRulePlusMinusElement returns [EObject current=null] : iv_rulePlusMinusElement= rulePlusMinusElement EOF ;
    public final EObject entryRulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusElement = null;


        try {
            // InternalDsl.g:1276:57: (iv_rulePlusMinusElement= rulePlusMinusElement EOF )
            // InternalDsl.g:1277:2: iv_rulePlusMinusElement= rulePlusMinusElement EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinusElement=rulePlusMinusElement();

            state._fsp--;

             current =iv_rulePlusMinusElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusMinusElement"


    // $ANTLR start "rulePlusMinusElement"
    // InternalDsl.g:1283:1: rulePlusMinusElement returns [EObject current=null] : (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) ;
    public final EObject rulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_MultiplicationDivisionElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1289:2: ( (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) )
            // InternalDsl.g:1290:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            {
            // InternalDsl.g:1290:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            // InternalDsl.g:1291:3: this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_MultiplicationDivisionElement_0=ruleMultiplicationDivisionElement();

            state._fsp--;


            			current = this_MultiplicationDivisionElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1299:3: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }
                else if ( (LA17_0==34) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1300:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1300:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1301:5: otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_16); 

            	    					newLeafNode(otherlv_1, grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1305:5: ()
            	    // InternalDsl.g:1306:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1312:5: ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1313:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1313:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1314:7: lv_right_3_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleMultiplicationDivisionElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusMinusElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nii.bigclout.ecaadapter.Dsl.MultiplicationDivisionElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1333:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1333:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1334:5: otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_16); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1338:5: ()
            	    // InternalDsl.g:1339:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1345:5: ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1346:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1346:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1347:7: lv_right_6_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_right_6_0=ruleMultiplicationDivisionElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusMinusElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nii.bigclout.ecaadapter.Dsl.MultiplicationDivisionElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "rulePlusMinusElement"


    // $ANTLR start "entryRuleMultiplicationDivisionElement"
    // InternalDsl.g:1370:1: entryRuleMultiplicationDivisionElement returns [EObject current=null] : iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF ;
    public final EObject entryRuleMultiplicationDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivisionElement = null;


        try {
            // InternalDsl.g:1370:70: (iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:1371:2: iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationDivisionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationDivisionElement=ruleMultiplicationDivisionElement();

            state._fsp--;

             current =iv_ruleMultiplicationDivisionElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicationDivisionElement"


    // $ANTLR start "ruleMultiplicationDivisionElement"
    // InternalDsl.g:1377:1: ruleMultiplicationDivisionElement returns [EObject current=null] : (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) ;
    public final EObject ruleMultiplicationDivisionElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_UnaryElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1383:2: ( (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) )
            // InternalDsl.g:1384:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            {
            // InternalDsl.g:1384:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            // InternalDsl.g:1385:3: this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_UnaryElement_0=ruleUnaryElement();

            state._fsp--;


            			current = this_UnaryElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1393:3: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            loop18:
            do {
                int alt18=4;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt18=1;
                    }
                    break;
                case 36:
                    {
                    alt18=2;
                    }
                    break;
                case 37:
                    {
                    alt18=3;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1394:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1394:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1395:5: otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_16); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1399:5: ()
            	    // InternalDsl.g:1400:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1406:5: ( (lv_right_3_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1407:6: (lv_right_3_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1407:6: (lv_right_3_0= ruleUnaryElement )
            	    // InternalDsl.g:1408:7: lv_right_3_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleUnaryElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplicationDivisionElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nii.bigclout.ecaadapter.Dsl.UnaryElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1427:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1427:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1428:5: otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) )
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_16); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1432:5: ()
            	    // InternalDsl.g:1433:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1439:5: ( (lv_right_6_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1440:6: (lv_right_6_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1440:6: (lv_right_6_0= ruleUnaryElement )
            	    // InternalDsl.g:1441:7: lv_right_6_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_right_6_0=ruleUnaryElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplicationDivisionElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nii.bigclout.ecaadapter.Dsl.UnaryElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:1460:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1460:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1461:5: otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) )
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_16); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:1465:5: ()
            	    // InternalDsl.g:1466:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1472:5: ( (lv_right_9_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1473:6: (lv_right_9_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1473:6: (lv_right_9_0= ruleUnaryElement )
            	    // InternalDsl.g:1474:7: lv_right_9_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_right_9_0=ruleUnaryElement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplicationDivisionElementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"nii.bigclout.ecaadapter.Dsl.UnaryElement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleMultiplicationDivisionElement"


    // $ANTLR start "entryRuleUnaryElement"
    // InternalDsl.g:1497:1: entryRuleUnaryElement returns [EObject current=null] : iv_ruleUnaryElement= ruleUnaryElement EOF ;
    public final EObject entryRuleUnaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryElement = null;


        try {
            // InternalDsl.g:1497:53: (iv_ruleUnaryElement= ruleUnaryElement EOF )
            // InternalDsl.g:1498:2: iv_ruleUnaryElement= ruleUnaryElement EOF
            {
             newCompositeNode(grammarAccess.getUnaryElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryElement=ruleUnaryElement();

            state._fsp--;

             current =iv_ruleUnaryElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnaryElement"


    // $ANTLR start "ruleUnaryElement"
    // InternalDsl.g:1504:1: ruleUnaryElement returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) ) ;
    public final EObject ruleUnaryElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_value_8_0 = null;

        EObject this_OrElement_10 = null;

        EObject lv_exp_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1510:2: ( ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) ) )
            // InternalDsl.g:1511:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) )
            {
            // InternalDsl.g:1511:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt19=2;
                }
                break;
            case RULE_ID:
                {
                int LA19_3 = input.LA(2);

                if ( (LA19_3==38) ) {
                    alt19=3;
                }
                else if ( (LA19_3==EOF||(LA19_3>=RULE_ID && LA19_3<=RULE_BOOLEAN)||(LA19_3>=19 && LA19_3<=21)||(LA19_3>=26 && LA19_3<=37)||(LA19_3>=39 && LA19_3<=41)) ) {
                    alt19=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt19=5;
                }
                break;
            case 41:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1512:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    {
                    // InternalDsl.g:1512:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    // InternalDsl.g:1513:4: () ( (lv_value_1_0= ruleNUMBER ) )
                    {
                    // InternalDsl.g:1513:4: ()
                    // InternalDsl.g:1514:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1520:4: ( (lv_value_1_0= ruleNUMBER ) )
                    // InternalDsl.g:1521:5: (lv_value_1_0= ruleNUMBER )
                    {
                    // InternalDsl.g:1521:5: (lv_value_1_0= ruleNUMBER )
                    // InternalDsl.g:1522:6: lv_value_1_0= ruleNUMBER
                    {

                    						newCompositeNode(grammarAccess.getUnaryElementAccess().getValueNUMBERParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleNUMBER();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"nii.bigclout.ecaadapter.Dsl.NUMBER");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1541:3: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDsl.g:1541:3: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    // InternalDsl.g:1542:4: () ( (lv_value_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalDsl.g:1542:4: ()
                    // InternalDsl.g:1543:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1549:4: ( (lv_value_3_0= RULE_BOOLEAN ) )
                    // InternalDsl.g:1550:5: (lv_value_3_0= RULE_BOOLEAN )
                    {
                    // InternalDsl.g:1550:5: (lv_value_3_0= RULE_BOOLEAN )
                    // InternalDsl.g:1551:6: lv_value_3_0= RULE_BOOLEAN
                    {
                    lv_value_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getUnaryElementAccess().getValueBOOLEANTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"nii.bigclout.ecaadapter.Dsl.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1569:3: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' )
                    {
                    // InternalDsl.g:1569:3: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' )
                    // InternalDsl.g:1570:4: () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state'
                    {
                    // InternalDsl.g:1570:4: ()
                    // InternalDsl.g:1571:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getResource_ObjectAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1577:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDsl.g:1578:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDsl.g:1578:5: (otherlv_5= RULE_ID )
                    // InternalDsl.g:1579:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryElementRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getUnaryElementAccess().getValueResourceCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnaryElementAccess().getStateKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1596:3: ( () ( (lv_value_8_0= ruleState ) ) )
                    {
                    // InternalDsl.g:1596:3: ( () ( (lv_value_8_0= ruleState ) ) )
                    // InternalDsl.g:1597:4: () ( (lv_value_8_0= ruleState ) )
                    {
                    // InternalDsl.g:1597:4: ()
                    // InternalDsl.g:1598:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getState_ObjectAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1604:4: ( (lv_value_8_0= ruleState ) )
                    // InternalDsl.g:1605:5: (lv_value_8_0= ruleState )
                    {
                    // InternalDsl.g:1605:5: (lv_value_8_0= ruleState )
                    // InternalDsl.g:1606:6: lv_value_8_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getUnaryElementAccess().getValueStateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"nii.bigclout.ecaadapter.Dsl.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1625:3: (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' )
                    {
                    // InternalDsl.g:1625:3: (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' )
                    // InternalDsl.g:1626:4: otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_OrElement_10=ruleOrElement();

                    state._fsp--;


                    				current = this_OrElement_10;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_11=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1644:3: (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) )
                    {
                    // InternalDsl.g:1644:3: (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) )
                    // InternalDsl.g:1645:4: otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) )
                    {
                    otherlv_12=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getUnaryElementAccess().getNotKeyword_5_0());
                    			
                    // InternalDsl.g:1649:4: ()
                    // InternalDsl.g:1650:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNegateElementAction_5_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1656:4: ( (lv_exp_14_0= ruleUnaryElement ) )
                    // InternalDsl.g:1657:5: (lv_exp_14_0= ruleUnaryElement )
                    {
                    // InternalDsl.g:1657:5: (lv_exp_14_0= ruleUnaryElement )
                    // InternalDsl.g:1658:6: lv_exp_14_0= ruleUnaryElement
                    {

                    						newCompositeNode(grammarAccess.getUnaryElementAccess().getExpUnaryElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_14_0=ruleUnaryElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryElementRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_14_0,
                    							"nii.bigclout.ecaadapter.Dsl.UnaryElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleUnaryElement"


    // $ANTLR start "entryRuleLBRACE"
    // InternalDsl.g:1680:1: entryRuleLBRACE returns [String current=null] : iv_ruleLBRACE= ruleLBRACE EOF ;
    public final String entryRuleLBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLBRACE = null;


        try {
            // InternalDsl.g:1680:46: (iv_ruleLBRACE= ruleLBRACE EOF )
            // InternalDsl.g:1681:2: iv_ruleLBRACE= ruleLBRACE EOF
            {
             newCompositeNode(grammarAccess.getLBRACERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLBRACE=ruleLBRACE();

            state._fsp--;

             current =iv_ruleLBRACE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLBRACE"


    // $ANTLR start "ruleLBRACE"
    // InternalDsl.g:1687:1: ruleLBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1693:2: (kw= '{' )
            // InternalDsl.g:1694:2: kw= '{'
            {
            kw=(Token)match(input,42,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword());
            	

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
    // $ANTLR end "ruleLBRACE"


    // $ANTLR start "entryRuleRBRACE"
    // InternalDsl.g:1702:1: entryRuleRBRACE returns [String current=null] : iv_ruleRBRACE= ruleRBRACE EOF ;
    public final String entryRuleRBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBRACE = null;


        try {
            // InternalDsl.g:1702:46: (iv_ruleRBRACE= ruleRBRACE EOF )
            // InternalDsl.g:1703:2: iv_ruleRBRACE= ruleRBRACE EOF
            {
             newCompositeNode(grammarAccess.getRBRACERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRBRACE=ruleRBRACE();

            state._fsp--;

             current =iv_ruleRBRACE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRBRACE"


    // $ANTLR start "ruleRBRACE"
    // InternalDsl.g:1709:1: ruleRBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1715:2: (kw= '}' )
            // InternalDsl.g:1716:2: kw= '}'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword());
            	

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
    // $ANTLR end "ruleRBRACE"


    // $ANTLR start "entryRuleNUMBER"
    // InternalDsl.g:1724:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalDsl.g:1724:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalDsl.g:1725:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalDsl.g:1731:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1737:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // InternalDsl.g:1738:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // InternalDsl.g:1738:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||(LA20_1>=RULE_ID && LA20_1<=RULE_BOOLEAN)||(LA20_1>=19 && LA20_1<=21)||(LA20_1>=26 && LA20_1<=37)||(LA20_1>=39 && LA20_1<=41)) ) {
                    alt20=1;
                }
                else if ( (LA20_1==44) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1739:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1747:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalDsl.g:1747:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalDsl.g:1748:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_30); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,44,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2());
                    			

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
    // $ANTLR end "ruleNUMBER"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000060010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000028000080070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000028000000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000061010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});

}