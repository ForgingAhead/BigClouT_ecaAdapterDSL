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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'resource'", "'can'", "'be'", "','", "'app'", "'on'", "'if'", "'do'", "'and'", "'environment'", "'service'", "':='", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'.state'", "'('", "')'", "'not'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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
    // InternalDsl.g:71:1: ruleRunTimeModel returns [EObject current=null] : ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* ) ;
    public final EObject ruleRunTimeModel() throws RecognitionException {
        EObject current = null;

        EObject lv_envData_1_0 = null;

        EObject lv_appData_2_0 = null;

        EObject lv_servicesData_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* ) )
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* )
            {
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* )
            // InternalDsl.g:79:3: () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )*
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0(),
            					current);
            			

            }

            // InternalDsl.g:86:3: ( (lv_envData_1_0= ruleEnvironmentMetaData ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:105:3: ( (lv_appData_2_0= ruleAppMetaData ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDsl.g:124:3: ( (lv_servicesData_3_0= ruleServiceMetaData ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:125:4: (lv_servicesData_3_0= ruleServiceMetaData )
            	    {
            	    // InternalDsl.g:125:4: (lv_servicesData_3_0= ruleServiceMetaData )
            	    // InternalDsl.g:126:5: lv_servicesData_3_0= ruleServiceMetaData
            	    {

            	    					newCompositeNode(grammarAccess.getRunTimeModelAccess().getServicesDataServiceMetaDataParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break loop3;
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
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalDsl.g:201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:202:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getCanKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getBeKeyword_3());
            		
            // InternalDsl.g:227:3: ( (lv_states_4_0= ruleState ) )
            // InternalDsl.g:228:4: (lv_states_4_0= ruleState )
            {
            // InternalDsl.g:228:4: (lv_states_4_0= ruleState )
            // InternalDsl.g:229:5: lv_states_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:247:4: otherlv_5= ',' ( (lv_states_6_0= ruleState ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:251:4: ( (lv_states_6_0= ruleState ) )
            	    // InternalDsl.g:252:5: (lv_states_6_0= ruleState )
            	    {
            	    // InternalDsl.g:252:5: (lv_states_6_0= ruleState )
            	    // InternalDsl.g:253:6: lv_states_6_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    break loop4;
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
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAppMetaDataAccess().getAppKeyword_0());
            		
            // InternalDsl.g:294:3: ( (lv_appID_1_0= RULE_ID ) )
            // InternalDsl.g:295:4: (lv_appID_1_0= RULE_ID )
            {
            // InternalDsl.g:295:4: (lv_appID_1_0= RULE_ID )
            // InternalDsl.g:296:5: lv_appID_1_0= RULE_ID
            {
            lv_appID_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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
            		
            pushFollow(FOLLOW_11);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:319:3: ( (lv_specifications_3_0= ruleSpecification ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:320:4: (lv_specifications_3_0= ruleSpecification )
            	    {
            	    // InternalDsl.g:320:4: (lv_specifications_3_0= ruleSpecification )
            	    // InternalDsl.g:321:5: lv_specifications_3_0= ruleSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getAppMetaDataAccess().getSpecificationsSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop5;
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
    // InternalDsl.g:356:1: ruleSpecification returns [EObject current=null] : ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_specID_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_action_6_0 = null;

        EObject lv_action_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:362:2: ( ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* ) )
            // InternalDsl.g:363:2: ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* )
            {
            // InternalDsl.g:363:2: ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* )
            // InternalDsl.g:364:3: ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )*
            {
            // InternalDsl.g:364:3: ( (lv_specID_0_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:365:4: (lv_specID_0_0= RULE_ID )
                    {
                    // InternalDsl.g:365:4: (lv_specID_0_0= RULE_ID )
                    // InternalDsl.g:366:5: lv_specID_0_0= RULE_ID
                    {
                    lv_specID_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecificationAccess().getOnKeyword_1());
            		
            // InternalDsl.g:386:3: ( (lv_trigger_2_0= ruleOrElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==37||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:387:4: (lv_trigger_2_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:387:4: (lv_trigger_2_0= ruleOrElement )
            	    // InternalDsl.g:388:5: lv_trigger_2_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getTriggerOrElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_trigger_2_0=ruleOrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trigger",
            	    						lv_trigger_2_0,
            	    						"nii.bigclout.ecaadapter.Dsl.OrElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getIfKeyword_3());
            		
            // InternalDsl.g:409:3: ( (lv_condition_4_0= ruleOrElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||LA8_0==37||LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:410:4: (lv_condition_4_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:410:4: (lv_condition_4_0= ruleOrElement )
            	    // InternalDsl.g:411:5: lv_condition_4_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getConditionOrElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_condition_4_0=ruleOrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_4_0,
            	    						"nii.bigclout.ecaadapter.Dsl.OrElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getDoKeyword_5());
            		
            // InternalDsl.g:432:3: ( (lv_action_6_0= ruleAction ) )
            // InternalDsl.g:433:4: (lv_action_6_0= ruleAction )
            {
            // InternalDsl.g:433:4: (lv_action_6_0= ruleAction )
            // InternalDsl.g:434:5: lv_action_6_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_action_6_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_6_0,
            						"nii.bigclout.ecaadapter.Dsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:451:3: (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:452:4: otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSpecificationAccess().getAndKeyword_7_0());
            	    			
            	    // InternalDsl.g:456:4: ( (lv_action_8_0= ruleAction ) )
            	    // InternalDsl.g:457:5: (lv_action_8_0= ruleAction )
            	    {
            	    // InternalDsl.g:457:5: (lv_action_8_0= ruleAction )
            	    // InternalDsl.g:458:6: lv_action_8_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_action_8_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_8_0,
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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleEnvironmentMetaData"
    // InternalDsl.g:480:1: entryRuleEnvironmentMetaData returns [EObject current=null] : iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF ;
    public final EObject entryRuleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentMetaData = null;


        try {
            // InternalDsl.g:480:60: (iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF )
            // InternalDsl.g:481:2: iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF
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
    // InternalDsl.g:487:1: ruleEnvironmentMetaData returns [EObject current=null] : ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )* ruleRBRACE ) ;
    public final EObject ruleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resources_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:493:2: ( ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )* ruleRBRACE ) )
            // InternalDsl.g:494:2: ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )* ruleRBRACE )
            {
            // InternalDsl.g:494:2: ( () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )* ruleRBRACE )
            // InternalDsl.g:495:3: () otherlv_1= 'environment' ruleLBRACE ( (lv_resources_3_0= ruleResource ) )* ruleRBRACE
            {
            // InternalDsl.g:495:3: ()
            // InternalDsl.g:496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentKeyword_1());
            		

            			newCompositeNode(grammarAccess.getEnvironmentMetaDataAccess().getLBRACEParserRuleCall_2());
            		
            pushFollow(FOLLOW_16);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:513:3: ( (lv_resources_3_0= ruleResource ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:514:4: (lv_resources_3_0= ruleResource )
            	    {
            	    // InternalDsl.g:514:4: (lv_resources_3_0= ruleResource )
            	    // InternalDsl.g:515:5: lv_resources_3_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop10;
                }
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
    // InternalDsl.g:543:1: entryRuleServiceMetaData returns [EObject current=null] : iv_ruleServiceMetaData= ruleServiceMetaData EOF ;
    public final EObject entryRuleServiceMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMetaData = null;


        try {
            // InternalDsl.g:543:56: (iv_ruleServiceMetaData= ruleServiceMetaData EOF )
            // InternalDsl.g:544:2: iv_ruleServiceMetaData= ruleServiceMetaData EOF
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
    // InternalDsl.g:550:1: ruleServiceMetaData returns [EObject current=null] : (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) ) ;
    public final EObject ruleServiceMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_serviceID_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:556:2: ( (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:557:2: (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:557:2: (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) )
            // InternalDsl.g:558:3: otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceMetaDataAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:562:3: ( (lv_serviceID_1_0= RULE_ID ) )
            // InternalDsl.g:563:4: (lv_serviceID_1_0= RULE_ID )
            {
            // InternalDsl.g:563:4: (lv_serviceID_1_0= RULE_ID )
            // InternalDsl.g:564:5: lv_serviceID_1_0= RULE_ID
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
    // InternalDsl.g:584:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:584:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:585:2: iv_ruleAction= ruleAction EOF
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
    // InternalDsl.g:591:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:597:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) )
            // InternalDsl.g:598:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            {
            // InternalDsl.g:598:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            // InternalDsl.g:599:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) )
            {
            // InternalDsl.g:599:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:600:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:600:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:601:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalDsl.g:616:3: ( (lv_state_2_0= ruleState ) )
            // InternalDsl.g:617:4: (lv_state_2_0= ruleState )
            {
            // InternalDsl.g:617:4: (lv_state_2_0= ruleState )
            // InternalDsl.g:618:5: lv_state_2_0= ruleState
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
    // InternalDsl.g:639:1: entryRuleOrElement returns [EObject current=null] : iv_ruleOrElement= ruleOrElement EOF ;
    public final EObject entryRuleOrElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrElement = null;


        try {
            // InternalDsl.g:639:50: (iv_ruleOrElement= ruleOrElement EOF )
            // InternalDsl.g:640:2: iv_ruleOrElement= ruleOrElement EOF
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
    // InternalDsl.g:646:1: ruleOrElement returns [EObject current=null] : (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) ;
    public final EObject ruleOrElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:652:2: ( (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) )
            // InternalDsl.g:653:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            {
            // InternalDsl.g:653:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            // InternalDsl.g:654:3: this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_AndElement_0=ruleAndElement();

            state._fsp--;


            			current = this_AndElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:662:3: (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:663:4: otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrElementAccess().getOrKeyword_1_0());
            	    			
            	    // InternalDsl.g:667:4: ()
            	    // InternalDsl.g:668:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:674:4: ( (lv_right_3_0= ruleAndElement ) )
            	    // InternalDsl.g:675:5: (lv_right_3_0= ruleAndElement )
            	    {
            	    // InternalDsl.g:675:5: (lv_right_3_0= ruleAndElement )
            	    // InternalDsl.g:676:6: lv_right_3_0= ruleAndElement
            	    {

            	    						newCompositeNode(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // $ANTLR end "ruleOrElement"


    // $ANTLR start "entryRuleAndElement"
    // InternalDsl.g:698:1: entryRuleAndElement returns [EObject current=null] : iv_ruleAndElement= ruleAndElement EOF ;
    public final EObject entryRuleAndElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndElement = null;


        try {
            // InternalDsl.g:698:51: (iv_ruleAndElement= ruleAndElement EOF )
            // InternalDsl.g:699:2: iv_ruleAndElement= ruleAndElement EOF
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
    // InternalDsl.g:705:1: ruleAndElement returns [EObject current=null] : (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) ;
    public final EObject ruleAndElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DiffEqualElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:711:2: ( (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) )
            // InternalDsl.g:712:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            {
            // InternalDsl.g:712:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            // InternalDsl.g:713:3: this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_DiffEqualElement_0=ruleDiffEqualElement();

            state._fsp--;


            			current = this_DiffEqualElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:721:3: (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:722:4: otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndElementAccess().getAndKeyword_1_0());
            	    			
            	    // InternalDsl.g:726:4: ()
            	    // InternalDsl.g:727:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:733:4: ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    // InternalDsl.g:734:5: (lv_right_3_0= ruleDiffEqualElement )
            	    {
            	    // InternalDsl.g:734:5: (lv_right_3_0= ruleDiffEqualElement )
            	    // InternalDsl.g:735:6: lv_right_3_0= ruleDiffEqualElement
            	    {

            	    						newCompositeNode(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop12;
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
    // InternalDsl.g:757:1: entryRuleDiffEqualElement returns [EObject current=null] : iv_ruleDiffEqualElement= ruleDiffEqualElement EOF ;
    public final EObject entryRuleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiffEqualElement = null;


        try {
            // InternalDsl.g:757:57: (iv_ruleDiffEqualElement= ruleDiffEqualElement EOF )
            // InternalDsl.g:758:2: iv_ruleDiffEqualElement= ruleDiffEqualElement EOF
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
    // InternalDsl.g:764:1: ruleDiffEqualElement returns [EObject current=null] : (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) ;
    public final EObject ruleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_CompareElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:770:2: ( (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) )
            // InternalDsl.g:771:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            {
            // InternalDsl.g:771:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            // InternalDsl.g:772:3: this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_CompareElement_0=ruleCompareElement();

            state._fsp--;


            			current = this_CompareElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:780:3: ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }
                else if ( (LA13_0==26) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:781:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:781:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:782:5: otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_19); 

            	    					newLeafNode(otherlv_1, grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:786:5: ()
            	    // InternalDsl.g:787:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:793:5: ( (lv_right_3_0= ruleCompareElement ) )
            	    // InternalDsl.g:794:6: (lv_right_3_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:794:6: (lv_right_3_0= ruleCompareElement )
            	    // InternalDsl.g:795:7: lv_right_3_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_20);
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
            	    // InternalDsl.g:814:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:814:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:815:5: otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:819:5: ()
            	    // InternalDsl.g:820:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:826:5: ( (lv_right_6_0= ruleCompareElement ) )
            	    // InternalDsl.g:827:6: (lv_right_6_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:827:6: (lv_right_6_0= ruleCompareElement )
            	    // InternalDsl.g:828:7: lv_right_6_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_20);
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
    // $ANTLR end "ruleDiffEqualElement"


    // $ANTLR start "entryRuleCompareElement"
    // InternalDsl.g:851:1: entryRuleCompareElement returns [EObject current=null] : iv_ruleCompareElement= ruleCompareElement EOF ;
    public final EObject entryRuleCompareElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareElement = null;


        try {
            // InternalDsl.g:851:55: (iv_ruleCompareElement= ruleCompareElement EOF )
            // InternalDsl.g:852:2: iv_ruleCompareElement= ruleCompareElement EOF
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
    // InternalDsl.g:858:1: ruleCompareElement returns [EObject current=null] : (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) ;
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
            // InternalDsl.g:864:2: ( (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) )
            // InternalDsl.g:865:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            {
            // InternalDsl.g:865:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            // InternalDsl.g:866:3: this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_PlusMinusElement_0=rulePlusMinusElement();

            state._fsp--;


            			current = this_PlusMinusElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:874:3: ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            loop14:
            do {
                int alt14=5;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt14=1;
                    }
                    break;
                case 28:
                    {
                    alt14=2;
                    }
                    break;
                case 29:
                    {
                    alt14=3;
                    }
                    break;
                case 30:
                    {
                    alt14=4;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:875:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:875:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:876:5: otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_19); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:880:5: ()
            	    // InternalDsl.g:881:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:887:5: ( (lv_right_3_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:888:6: (lv_right_3_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:888:6: (lv_right_3_0= rulePlusMinusElement )
            	    // InternalDsl.g:889:7: lv_right_3_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    // InternalDsl.g:908:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:908:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:909:5: otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:913:5: ()
            	    // InternalDsl.g:914:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:920:5: ( (lv_right_6_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:921:6: (lv_right_6_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:921:6: (lv_right_6_0= rulePlusMinusElement )
            	    // InternalDsl.g:922:7: lv_right_6_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    // InternalDsl.g:941:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:941:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:942:5: otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_19); 

            	    					newLeafNode(otherlv_7, grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:946:5: ()
            	    // InternalDsl.g:947:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:953:5: ( (lv_right_9_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:954:6: (lv_right_9_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:954:6: (lv_right_9_0= rulePlusMinusElement )
            	    // InternalDsl.g:955:7: lv_right_9_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    // InternalDsl.g:974:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:974:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:975:5: otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_19); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0());
            	    				
            	    // InternalDsl.g:979:5: ()
            	    // InternalDsl.g:980:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:986:5: ( (lv_right_12_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:987:6: (lv_right_12_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:987:6: (lv_right_12_0= rulePlusMinusElement )
            	    // InternalDsl.g:988:7: lv_right_12_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
    // $ANTLR end "ruleCompareElement"


    // $ANTLR start "entryRulePlusMinusElement"
    // InternalDsl.g:1011:1: entryRulePlusMinusElement returns [EObject current=null] : iv_rulePlusMinusElement= rulePlusMinusElement EOF ;
    public final EObject entryRulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusElement = null;


        try {
            // InternalDsl.g:1011:57: (iv_rulePlusMinusElement= rulePlusMinusElement EOF )
            // InternalDsl.g:1012:2: iv_rulePlusMinusElement= rulePlusMinusElement EOF
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
    // InternalDsl.g:1018:1: rulePlusMinusElement returns [EObject current=null] : (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) ;
    public final EObject rulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_MultiplicationDivisionElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1024:2: ( (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) )
            // InternalDsl.g:1025:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            {
            // InternalDsl.g:1025:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            // InternalDsl.g:1026:3: this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_MultiplicationDivisionElement_0=ruleMultiplicationDivisionElement();

            state._fsp--;


            			current = this_MultiplicationDivisionElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1034:3: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }
                else if ( (LA15_0==32) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1035:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1035:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1036:5: otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_19); 

            	    					newLeafNode(otherlv_1, grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1040:5: ()
            	    // InternalDsl.g:1041:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1047:5: ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1048:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1048:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1049:7: lv_right_3_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_22);
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
            	    // InternalDsl.g:1068:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1068:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1069:5: otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1073:5: ()
            	    // InternalDsl.g:1074:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1080:5: ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1081:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1081:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1082:7: lv_right_6_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "rulePlusMinusElement"


    // $ANTLR start "entryRuleMultiplicationDivisionElement"
    // InternalDsl.g:1105:1: entryRuleMultiplicationDivisionElement returns [EObject current=null] : iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF ;
    public final EObject entryRuleMultiplicationDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivisionElement = null;


        try {
            // InternalDsl.g:1105:70: (iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:1106:2: iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:1112:1: ruleMultiplicationDivisionElement returns [EObject current=null] : (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) ;
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
            // InternalDsl.g:1118:2: ( (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) )
            // InternalDsl.g:1119:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            {
            // InternalDsl.g:1119:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            // InternalDsl.g:1120:3: this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_UnaryElement_0=ruleUnaryElement();

            state._fsp--;


            			current = this_UnaryElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1128:3: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt16=1;
                    }
                    break;
                case 34:
                    {
                    alt16=2;
                    }
                    break;
                case 35:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1129:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1129:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1130:5: otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_19); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1134:5: ()
            	    // InternalDsl.g:1135:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1141:5: ( (lv_right_3_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1142:6: (lv_right_3_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1142:6: (lv_right_3_0= ruleUnaryElement )
            	    // InternalDsl.g:1143:7: lv_right_3_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
            	    // InternalDsl.g:1162:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1162:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1163:5: otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1167:5: ()
            	    // InternalDsl.g:1168:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1174:5: ( (lv_right_6_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1175:6: (lv_right_6_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1175:6: (lv_right_6_0= ruleUnaryElement )
            	    // InternalDsl.g:1176:7: lv_right_6_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
            	    // InternalDsl.g:1195:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1195:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1196:5: otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_19); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:1200:5: ()
            	    // InternalDsl.g:1201:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1207:5: ( (lv_right_9_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1208:6: (lv_right_9_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1208:6: (lv_right_9_0= ruleUnaryElement )
            	    // InternalDsl.g:1209:7: lv_right_9_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleMultiplicationDivisionElement"


    // $ANTLR start "entryRuleUnaryElement"
    // InternalDsl.g:1232:1: entryRuleUnaryElement returns [EObject current=null] : iv_ruleUnaryElement= ruleUnaryElement EOF ;
    public final EObject entryRuleUnaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryElement = null;


        try {
            // InternalDsl.g:1232:53: (iv_ruleUnaryElement= ruleUnaryElement EOF )
            // InternalDsl.g:1233:2: iv_ruleUnaryElement= ruleUnaryElement EOF
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
    // InternalDsl.g:1239:1: ruleUnaryElement returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) ) ;
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
            // InternalDsl.g:1245:2: ( ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) ) )
            // InternalDsl.g:1246:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) )
            {
            // InternalDsl.g:1246:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' ) | ( () ( (lv_value_8_0= ruleState ) ) ) | (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                int LA17_3 = input.LA(2);

                if ( (LA17_3==36) ) {
                    alt17=3;
                }
                else if ( (LA17_3==EOF||(LA17_3>=RULE_ID && LA17_3<=RULE_INT)||(LA17_3>=18 && LA17_3<=20)||(LA17_3>=24 && LA17_3<=35)||(LA17_3>=37 && LA17_3<=39)) ) {
                    alt17=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt17=5;
                }
                break;
            case 39:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1247:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    {
                    // InternalDsl.g:1247:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    // InternalDsl.g:1248:4: () ( (lv_value_1_0= ruleNUMBER ) )
                    {
                    // InternalDsl.g:1248:4: ()
                    // InternalDsl.g:1249:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1255:4: ( (lv_value_1_0= ruleNUMBER ) )
                    // InternalDsl.g:1256:5: (lv_value_1_0= ruleNUMBER )
                    {
                    // InternalDsl.g:1256:5: (lv_value_1_0= ruleNUMBER )
                    // InternalDsl.g:1257:6: lv_value_1_0= ruleNUMBER
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
                    // InternalDsl.g:1276:3: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDsl.g:1276:3: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    // InternalDsl.g:1277:4: () ( (lv_value_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalDsl.g:1277:4: ()
                    // InternalDsl.g:1278:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1284:4: ( (lv_value_3_0= RULE_BOOLEAN ) )
                    // InternalDsl.g:1285:5: (lv_value_3_0= RULE_BOOLEAN )
                    {
                    // InternalDsl.g:1285:5: (lv_value_3_0= RULE_BOOLEAN )
                    // InternalDsl.g:1286:6: lv_value_3_0= RULE_BOOLEAN
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
                    // InternalDsl.g:1304:3: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' )
                    {
                    // InternalDsl.g:1304:3: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state' )
                    // InternalDsl.g:1305:4: () ( (otherlv_5= RULE_ID ) ) otherlv_6= '.state'
                    {
                    // InternalDsl.g:1305:4: ()
                    // InternalDsl.g:1306:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getResource_ObjectAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1312:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDsl.g:1313:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDsl.g:1313:5: (otherlv_5= RULE_ID )
                    // InternalDsl.g:1314:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryElementRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_5, grammarAccess.getUnaryElementAccess().getValueResourceCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnaryElementAccess().getStateKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1331:3: ( () ( (lv_value_8_0= ruleState ) ) )
                    {
                    // InternalDsl.g:1331:3: ( () ( (lv_value_8_0= ruleState ) ) )
                    // InternalDsl.g:1332:4: () ( (lv_value_8_0= ruleState ) )
                    {
                    // InternalDsl.g:1332:4: ()
                    // InternalDsl.g:1333:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getState_ObjectAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1339:4: ( (lv_value_8_0= ruleState ) )
                    // InternalDsl.g:1340:5: (lv_value_8_0= ruleState )
                    {
                    // InternalDsl.g:1340:5: (lv_value_8_0= ruleState )
                    // InternalDsl.g:1341:6: lv_value_8_0= ruleState
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
                    // InternalDsl.g:1360:3: (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' )
                    {
                    // InternalDsl.g:1360:3: (otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')' )
                    // InternalDsl.g:1361:4: otherlv_9= '(' this_OrElement_10= ruleOrElement otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_OrElement_10=ruleOrElement();

                    state._fsp--;


                    				current = this_OrElement_10;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_11=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1379:3: (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) )
                    {
                    // InternalDsl.g:1379:3: (otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) ) )
                    // InternalDsl.g:1380:4: otherlv_12= 'not' () ( (lv_exp_14_0= ruleUnaryElement ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getUnaryElementAccess().getNotKeyword_5_0());
                    			
                    // InternalDsl.g:1384:4: ()
                    // InternalDsl.g:1385:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNegateElementAction_5_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1391:4: ( (lv_exp_14_0= ruleUnaryElement ) )
                    // InternalDsl.g:1392:5: (lv_exp_14_0= ruleUnaryElement )
                    {
                    // InternalDsl.g:1392:5: (lv_exp_14_0= ruleUnaryElement )
                    // InternalDsl.g:1393:6: lv_exp_14_0= ruleUnaryElement
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
    // InternalDsl.g:1415:1: entryRuleLBRACE returns [String current=null] : iv_ruleLBRACE= ruleLBRACE EOF ;
    public final String entryRuleLBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLBRACE = null;


        try {
            // InternalDsl.g:1415:46: (iv_ruleLBRACE= ruleLBRACE EOF )
            // InternalDsl.g:1416:2: iv_ruleLBRACE= ruleLBRACE EOF
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
    // InternalDsl.g:1422:1: ruleLBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1428:2: (kw= '{' )
            // InternalDsl.g:1429:2: kw= '{'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalDsl.g:1437:1: entryRuleRBRACE returns [String current=null] : iv_ruleRBRACE= ruleRBRACE EOF ;
    public final String entryRuleRBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBRACE = null;


        try {
            // InternalDsl.g:1437:46: (iv_ruleRBRACE= ruleRBRACE EOF )
            // InternalDsl.g:1438:2: iv_ruleRBRACE= ruleRBRACE EOF
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
    // InternalDsl.g:1444:1: ruleRBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1450:2: (kw= '}' )
            // InternalDsl.g:1451:2: kw= '}'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalDsl.g:1459:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalDsl.g:1459:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalDsl.g:1460:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalDsl.g:1466:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1472:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // InternalDsl.g:1473:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // InternalDsl.g:1473:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||(LA18_1>=RULE_ID && LA18_1<=RULE_INT)||(LA18_1>=18 && LA18_1<=20)||(LA18_1>=24 && LA18_1<=35)||(LA18_1>=37 && LA18_1<=39)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==42) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1474:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1482:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalDsl.g:1482:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalDsl.g:1483:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_26); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,42,FOLLOW_27); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000610002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000A000040070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000A000080070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000021010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000A000000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});

}