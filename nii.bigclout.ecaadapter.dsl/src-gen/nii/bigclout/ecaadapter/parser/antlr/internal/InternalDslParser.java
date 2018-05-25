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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConceptToCodeMappings'", "'AppMeta'", "'on'", "'if'", "'do'", "'and'", "'EnvironmentMetaData'", "'resource'", "'can'", "'be'", "','", "':='", "'('", "')'", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
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
    // InternalDsl.g:71:1: ruleRunTimeModel returns [EObject current=null] : ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* otherlv_3= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_5_0= ruleMappingPair ) )* ruleRBRACE ) ;
    public final EObject ruleRunTimeModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_envData_1_0 = null;

        EObject lv_appData_2_0 = null;

        EObject lv_mappingPairs_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* otherlv_3= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_5_0= ruleMappingPair ) )* ruleRBRACE ) )
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* otherlv_3= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_5_0= ruleMappingPair ) )* ruleRBRACE )
            {
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* otherlv_3= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_5_0= ruleMappingPair ) )* ruleRBRACE )
            // InternalDsl.g:79:3: () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* otherlv_3= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_5_0= ruleMappingPair ) )* ruleRBRACE
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

                if ( (LA1_0==18) ) {
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

                if ( (LA2_0==13) ) {
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRunTimeModelAccess().getConceptToCodeMappingsKeyword_3());
            		

            			newCompositeNode(grammarAccess.getRunTimeModelAccess().getLBRACEParserRuleCall_4());
            		
            pushFollow(FOLLOW_6);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:135:3: ( (lv_mappingPairs_5_0= ruleMappingPair ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:136:4: (lv_mappingPairs_5_0= ruleMappingPair )
            	    {
            	    // InternalDsl.g:136:4: (lv_mappingPairs_5_0= ruleMappingPair )
            	    // InternalDsl.g:137:5: lv_mappingPairs_5_0= ruleMappingPair
            	    {

            	    					newCompositeNode(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_mappingPairs_5_0=ruleMappingPair();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunTimeModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappingPairs",
            	    						lv_mappingPairs_5_0,
            	    						"nii.bigclout.ecaadapter.Dsl.MappingPair");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getRunTimeModelAccess().getRBRACEParserRuleCall_6());
            		
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
    // $ANTLR end "ruleRunTimeModel"


    // $ANTLR start "entryRuleAppMetaData"
    // InternalDsl.g:165:1: entryRuleAppMetaData returns [EObject current=null] : iv_ruleAppMetaData= ruleAppMetaData EOF ;
    public final EObject entryRuleAppMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppMetaData = null;


        try {
            // InternalDsl.g:165:52: (iv_ruleAppMetaData= ruleAppMetaData EOF )
            // InternalDsl.g:166:2: iv_ruleAppMetaData= ruleAppMetaData EOF
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
    // InternalDsl.g:172:1: ruleAppMetaData returns [EObject current=null] : (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE ) ;
    public final EObject ruleAppMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appID_1_0=null;
        EObject lv_specifications_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:178:2: ( (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE ) )
            // InternalDsl.g:179:2: (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE )
            {
            // InternalDsl.g:179:2: (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE )
            // InternalDsl.g:180:3: otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAppMetaDataAccess().getAppMetaKeyword_0());
            		
            // InternalDsl.g:184:3: ( (lv_appID_1_0= RULE_ID ) )
            // InternalDsl.g:185:4: (lv_appID_1_0= RULE_ID )
            {
            // InternalDsl.g:185:4: (lv_appID_1_0= RULE_ID )
            // InternalDsl.g:186:5: lv_appID_1_0= RULE_ID
            {
            lv_appID_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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
            		
            pushFollow(FOLLOW_8);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:209:3: ( (lv_specifications_3_0= ruleAppSpecification ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:210:4: (lv_specifications_3_0= ruleAppSpecification )
            	    {
            	    // InternalDsl.g:210:4: (lv_specifications_3_0= ruleAppSpecification )
            	    // InternalDsl.g:211:5: lv_specifications_3_0= ruleAppSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getAppMetaDataAccess().getSpecificationsAppSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_specifications_3_0=ruleAppSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppMetaDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specifications",
            	    						lv_specifications_3_0,
            	    						"nii.bigclout.ecaadapter.Dsl.AppSpecification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleAppSpecification"
    // InternalDsl.g:239:1: entryRuleAppSpecification returns [EObject current=null] : iv_ruleAppSpecification= ruleAppSpecification EOF ;
    public final EObject entryRuleAppSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppSpecification = null;


        try {
            // InternalDsl.g:239:57: (iv_ruleAppSpecification= ruleAppSpecification EOF )
            // InternalDsl.g:240:2: iv_ruleAppSpecification= ruleAppSpecification EOF
            {
             newCompositeNode(grammarAccess.getAppSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppSpecification=ruleAppSpecification();

            state._fsp--;

             current =iv_ruleAppSpecification; 
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
    // $ANTLR end "entryRuleAppSpecification"


    // $ANTLR start "ruleAppSpecification"
    // InternalDsl.g:246:1: ruleAppSpecification returns [EObject current=null] : ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* ) ;
    public final EObject ruleAppSpecification() throws RecognitionException {
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
            // InternalDsl.g:252:2: ( ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* ) )
            // InternalDsl.g:253:2: ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* )
            {
            // InternalDsl.g:253:2: ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* )
            // InternalDsl.g:254:3: ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )*
            {
            // InternalDsl.g:254:3: ( (lv_specID_0_0= RULE_ID ) )
            // InternalDsl.g:255:4: (lv_specID_0_0= RULE_ID )
            {
            // InternalDsl.g:255:4: (lv_specID_0_0= RULE_ID )
            // InternalDsl.g:256:5: lv_specID_0_0= RULE_ID
            {
            lv_specID_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_specID_0_0, grammarAccess.getAppSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specID",
            						lv_specID_0_0,
            						"nii.bigclout.ecaadapter.Dsl.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAppSpecificationAccess().getOnKeyword_1());
            		
            // InternalDsl.g:276:3: ( (lv_trigger_2_0= ruleOrElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_BOOLEAN)||LA5_0==24||LA5_0==38) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:277:4: (lv_trigger_2_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:277:4: (lv_trigger_2_0= ruleOrElement )
            	    // InternalDsl.g:278:5: lv_trigger_2_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getTriggerOrElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_trigger_2_0=ruleOrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
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
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAppSpecificationAccess().getIfKeyword_3());
            		
            // InternalDsl.g:299:3: ( (lv_condition_4_0= ruleOrElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_BOOLEAN)||LA6_0==24||LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:300:4: (lv_condition_4_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:300:4: (lv_condition_4_0= ruleOrElement )
            	    // InternalDsl.g:301:5: lv_condition_4_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getConditionOrElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_condition_4_0=ruleOrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
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
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAppSpecificationAccess().getDoKeyword_5());
            		
            // InternalDsl.g:322:3: ( (lv_action_6_0= ruleAction ) )
            // InternalDsl.g:323:4: (lv_action_6_0= ruleAction )
            {
            // InternalDsl.g:323:4: (lv_action_6_0= ruleAction )
            // InternalDsl.g:324:5: lv_action_6_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getAppSpecificationAccess().getActionActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_action_6_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_6_0,
            						"nii.bigclout.ecaadapter.Dsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:341:3: (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:342:4: otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getAppSpecificationAccess().getAndKeyword_7_0());
            	    			
            	    // InternalDsl.g:346:4: ( (lv_action_8_0= ruleAction ) )
            	    // InternalDsl.g:347:5: (lv_action_8_0= ruleAction )
            	    {
            	    // InternalDsl.g:347:5: (lv_action_8_0= ruleAction )
            	    // InternalDsl.g:348:6: lv_action_8_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getAppSpecificationAccess().getActionActionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_action_8_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
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
            	    break loop7;
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
    // $ANTLR end "ruleAppSpecification"


    // $ANTLR start "entryRuleEnvironmentMetaData"
    // InternalDsl.g:370:1: entryRuleEnvironmentMetaData returns [EObject current=null] : iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF ;
    public final EObject entryRuleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentMetaData = null;


        try {
            // InternalDsl.g:370:60: (iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF )
            // InternalDsl.g:371:2: iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF
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
    // InternalDsl.g:377:1: ruleEnvironmentMetaData returns [EObject current=null] : ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* ) ;
    public final EObject ruleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resources_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:383:2: ( ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* ) )
            // InternalDsl.g:384:2: ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* )
            {
            // InternalDsl.g:384:2: ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* )
            // InternalDsl.g:385:3: () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )*
            {
            // InternalDsl.g:385:3: ()
            // InternalDsl.g:386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataKeyword_1());
            		
            // InternalDsl.g:396:3: ( (lv_resources_2_0= ruleResource ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:397:4: (lv_resources_2_0= ruleResource )
            	    {
            	    // InternalDsl.g:397:4: (lv_resources_2_0= ruleResource )
            	    // InternalDsl.g:398:5: lv_resources_2_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_resources_2_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnvironmentMetaDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_2_0,
            	    						"nii.bigclout.ecaadapter.Dsl.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleEnvironmentMetaData"


    // $ANTLR start "entryRuleResource"
    // InternalDsl.g:419:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalDsl.g:419:49: (iv_ruleResource= ruleResource EOF )
            // InternalDsl.g:420:2: iv_ruleResource= ruleResource EOF
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
    // InternalDsl.g:426:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_states_4_0 = null;

        AntlrDatatypeRuleToken lv_states_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:432:2: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* ) )
            // InternalDsl.g:433:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* )
            {
            // InternalDsl.g:433:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* )
            // InternalDsl.g:434:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalDsl.g:438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:439:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getCanKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getBeKeyword_3());
            		
            // InternalDsl.g:464:3: ( (lv_states_4_0= ruleState ) )
            // InternalDsl.g:465:4: (lv_states_4_0= ruleState )
            {
            // InternalDsl.g:465:4: (lv_states_4_0= ruleState )
            // InternalDsl.g:466:5: lv_states_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalDsl.g:483:3: (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:484:4: otherlv_5= ',' ( (lv_states_6_0= ruleState ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:488:4: ( (lv_states_6_0= ruleState ) )
            	    // InternalDsl.g:489:5: (lv_states_6_0= ruleState )
            	    {
            	    // InternalDsl.g:489:5: (lv_states_6_0= ruleState )
            	    // InternalDsl.g:490:6: lv_states_6_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleState"
    // InternalDsl.g:512:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalDsl.g:512:45: (iv_ruleState= ruleState EOF )
            // InternalDsl.g:513:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState.getText(); 
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
    // InternalDsl.g:519:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:525:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalDsl.g:526:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalDsl.g:526:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:527:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getStateAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:535:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getStateAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:546:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:546:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:547:2: iv_ruleAction= ruleAction EOF
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
    // InternalDsl.g:553:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:559:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) )
            // InternalDsl.g:560:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            {
            // InternalDsl.g:560:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            // InternalDsl.g:561:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) )
            {
            // InternalDsl.g:561:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:562:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:562:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:563:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalDsl.g:578:3: ( (lv_state_2_0= ruleState ) )
            // InternalDsl.g:579:4: (lv_state_2_0= ruleState )
            {
            // InternalDsl.g:579:4: (lv_state_2_0= ruleState )
            // InternalDsl.g:580:5: lv_state_2_0= ruleState
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


    // $ANTLR start "entryRuleMappingPair"
    // InternalDsl.g:601:1: entryRuleMappingPair returns [EObject current=null] : iv_ruleMappingPair= ruleMappingPair EOF ;
    public final EObject entryRuleMappingPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingPair = null;


        try {
            // InternalDsl.g:601:52: (iv_ruleMappingPair= ruleMappingPair EOF )
            // InternalDsl.g:602:2: iv_ruleMappingPair= ruleMappingPair EOF
            {
             newCompositeNode(grammarAccess.getMappingPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingPair=ruleMappingPair();

            state._fsp--;

             current =iv_ruleMappingPair; 
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
    // $ANTLR end "entryRuleMappingPair"


    // $ANTLR start "ruleMappingPair"
    // InternalDsl.g:608:1: ruleMappingPair returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' ) ;
    public final EObject ruleMappingPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_state_3_0 = null;

        AntlrDatatypeRuleToken lv_actionCode_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:614:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' ) )
            // InternalDsl.g:615:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' )
            {
            // InternalDsl.g:615:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' )
            // InternalDsl.g:616:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingPairAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDsl.g:620:3: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:621:4: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:621:4: (otherlv_1= RULE_ID )
            // InternalDsl.g:622:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingPairRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getMappingPairAccess().getResourceResourceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingPairAccess().getCommaKeyword_2());
            		
            // InternalDsl.g:637:3: ( (lv_state_3_0= ruleUnaryElement ) )
            // InternalDsl.g:638:4: (lv_state_3_0= ruleUnaryElement )
            {
            // InternalDsl.g:638:4: (lv_state_3_0= ruleUnaryElement )
            // InternalDsl.g:639:5: lv_state_3_0= ruleUnaryElement
            {

            					newCompositeNode(grammarAccess.getMappingPairAccess().getStateUnaryElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_state_3_0=ruleUnaryElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingPairRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_3_0,
            						"nii.bigclout.ecaadapter.Dsl.UnaryElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingPairAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:660:3: ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) )
            // InternalDsl.g:661:4: (lv_actionCode_5_0= ruleEXTENDED_STRING )
            {
            // InternalDsl.g:661:4: (lv_actionCode_5_0= ruleEXTENDED_STRING )
            // InternalDsl.g:662:5: lv_actionCode_5_0= ruleEXTENDED_STRING
            {

            					newCompositeNode(grammarAccess.getMappingPairAccess().getActionCodeEXTENDED_STRINGParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_actionCode_5_0=ruleEXTENDED_STRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingPairRule());
            					}
            					set(
            						current,
            						"actionCode",
            						lv_actionCode_5_0,
            						"nii.bigclout.ecaadapter.Dsl.EXTENDED_STRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMappingPairAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleMappingPair"


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:687:1: entryRuleOrElement returns [EObject current=null] : iv_ruleOrElement= ruleOrElement EOF ;
    public final EObject entryRuleOrElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrElement = null;


        try {
            // InternalDsl.g:687:50: (iv_ruleOrElement= ruleOrElement EOF )
            // InternalDsl.g:688:2: iv_ruleOrElement= ruleOrElement EOF
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
    // InternalDsl.g:694:1: ruleOrElement returns [EObject current=null] : (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) ;
    public final EObject ruleOrElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:700:2: ( (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) )
            // InternalDsl.g:701:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            {
            // InternalDsl.g:701:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            // InternalDsl.g:702:3: this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_AndElement_0=ruleAndElement();

            state._fsp--;


            			current = this_AndElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:710:3: (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:711:4: otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrElementAccess().getOrKeyword_1_0());
            	    			
            	    // InternalDsl.g:715:4: ()
            	    // InternalDsl.g:716:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:722:4: ( (lv_right_3_0= ruleAndElement ) )
            	    // InternalDsl.g:723:5: (lv_right_3_0= ruleAndElement )
            	    {
            	    // InternalDsl.g:723:5: (lv_right_3_0= ruleAndElement )
            	    // InternalDsl.g:724:6: lv_right_3_0= ruleAndElement
            	    {

            	    						newCompositeNode(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // InternalDsl.g:746:1: entryRuleAndElement returns [EObject current=null] : iv_ruleAndElement= ruleAndElement EOF ;
    public final EObject entryRuleAndElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndElement = null;


        try {
            // InternalDsl.g:746:51: (iv_ruleAndElement= ruleAndElement EOF )
            // InternalDsl.g:747:2: iv_ruleAndElement= ruleAndElement EOF
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
    // InternalDsl.g:753:1: ruleAndElement returns [EObject current=null] : (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) ;
    public final EObject ruleAndElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DiffEqualElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:759:2: ( (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) )
            // InternalDsl.g:760:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            {
            // InternalDsl.g:760:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            // InternalDsl.g:761:3: this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_DiffEqualElement_0=ruleDiffEqualElement();

            state._fsp--;


            			current = this_DiffEqualElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:769:3: (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:770:4: otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndElementAccess().getAndKeyword_1_0());
            	    			
            	    // InternalDsl.g:774:4: ()
            	    // InternalDsl.g:775:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:781:4: ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    // InternalDsl.g:782:5: (lv_right_3_0= ruleDiffEqualElement )
            	    {
            	    // InternalDsl.g:782:5: (lv_right_3_0= ruleDiffEqualElement )
            	    // InternalDsl.g:783:6: lv_right_3_0= ruleDiffEqualElement
            	    {

            	    						newCompositeNode(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
    // InternalDsl.g:805:1: entryRuleDiffEqualElement returns [EObject current=null] : iv_ruleDiffEqualElement= ruleDiffEqualElement EOF ;
    public final EObject entryRuleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiffEqualElement = null;


        try {
            // InternalDsl.g:805:57: (iv_ruleDiffEqualElement= ruleDiffEqualElement EOF )
            // InternalDsl.g:806:2: iv_ruleDiffEqualElement= ruleDiffEqualElement EOF
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
    // InternalDsl.g:812:1: ruleDiffEqualElement returns [EObject current=null] : (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) ;
    public final EObject ruleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_CompareElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:818:2: ( (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) )
            // InternalDsl.g:819:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            {
            // InternalDsl.g:819:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            // InternalDsl.g:820:3: this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_CompareElement_0=ruleCompareElement();

            state._fsp--;


            			current = this_CompareElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:828:3: ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }
                else if ( (LA13_0==28) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:829:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:829:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:830:5: otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_20); 

            	    					newLeafNode(otherlv_1, grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:834:5: ()
            	    // InternalDsl.g:835:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:841:5: ( (lv_right_3_0= ruleCompareElement ) )
            	    // InternalDsl.g:842:6: (lv_right_3_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:842:6: (lv_right_3_0= ruleCompareElement )
            	    // InternalDsl.g:843:7: lv_right_3_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
            	    // InternalDsl.g:862:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:862:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:863:5: otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_20); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:867:5: ()
            	    // InternalDsl.g:868:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:874:5: ( (lv_right_6_0= ruleCompareElement ) )
            	    // InternalDsl.g:875:6: (lv_right_6_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:875:6: (lv_right_6_0= ruleCompareElement )
            	    // InternalDsl.g:876:7: lv_right_6_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
    // InternalDsl.g:899:1: entryRuleCompareElement returns [EObject current=null] : iv_ruleCompareElement= ruleCompareElement EOF ;
    public final EObject entryRuleCompareElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareElement = null;


        try {
            // InternalDsl.g:899:55: (iv_ruleCompareElement= ruleCompareElement EOF )
            // InternalDsl.g:900:2: iv_ruleCompareElement= ruleCompareElement EOF
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
    // InternalDsl.g:906:1: ruleCompareElement returns [EObject current=null] : (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) ;
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
            // InternalDsl.g:912:2: ( (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) )
            // InternalDsl.g:913:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            {
            // InternalDsl.g:913:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            // InternalDsl.g:914:3: this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PlusMinusElement_0=rulePlusMinusElement();

            state._fsp--;


            			current = this_PlusMinusElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:922:3: ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            loop14:
            do {
                int alt14=5;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt14=1;
                    }
                    break;
                case 30:
                    {
                    alt14=2;
                    }
                    break;
                case 31:
                    {
                    alt14=3;
                    }
                    break;
                case 32:
                    {
                    alt14=4;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:923:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:923:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:924:5: otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_20); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:928:5: ()
            	    // InternalDsl.g:929:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:935:5: ( (lv_right_3_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:936:6: (lv_right_3_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:936:6: (lv_right_3_0= rulePlusMinusElement )
            	    // InternalDsl.g:937:7: lv_right_3_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
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
            	    // InternalDsl.g:956:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:956:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:957:5: otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_20); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:961:5: ()
            	    // InternalDsl.g:962:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:968:5: ( (lv_right_6_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:969:6: (lv_right_6_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:969:6: (lv_right_6_0= rulePlusMinusElement )
            	    // InternalDsl.g:970:7: lv_right_6_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
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
            	    // InternalDsl.g:989:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:989:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:990:5: otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_20); 

            	    					newLeafNode(otherlv_7, grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:994:5: ()
            	    // InternalDsl.g:995:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1001:5: ( (lv_right_9_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1002:6: (lv_right_9_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1002:6: (lv_right_9_0= rulePlusMinusElement )
            	    // InternalDsl.g:1003:7: lv_right_9_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
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
            	    // InternalDsl.g:1022:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1022:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1023:5: otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_20); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0());
            	    				
            	    // InternalDsl.g:1027:5: ()
            	    // InternalDsl.g:1028:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1034:5: ( (lv_right_12_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1035:6: (lv_right_12_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1035:6: (lv_right_12_0= rulePlusMinusElement )
            	    // InternalDsl.g:1036:7: lv_right_12_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
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
    // InternalDsl.g:1059:1: entryRulePlusMinusElement returns [EObject current=null] : iv_rulePlusMinusElement= rulePlusMinusElement EOF ;
    public final EObject entryRulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusElement = null;


        try {
            // InternalDsl.g:1059:57: (iv_rulePlusMinusElement= rulePlusMinusElement EOF )
            // InternalDsl.g:1060:2: iv_rulePlusMinusElement= rulePlusMinusElement EOF
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
    // InternalDsl.g:1066:1: rulePlusMinusElement returns [EObject current=null] : (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) ;
    public final EObject rulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_MultiplicationDivisionElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1072:2: ( (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) )
            // InternalDsl.g:1073:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            {
            // InternalDsl.g:1073:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            // InternalDsl.g:1074:3: this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_MultiplicationDivisionElement_0=ruleMultiplicationDivisionElement();

            state._fsp--;


            			current = this_MultiplicationDivisionElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1082:3: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }
                else if ( (LA15_0==34) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1083:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1083:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1084:5: otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_20); 

            	    					newLeafNode(otherlv_1, grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1088:5: ()
            	    // InternalDsl.g:1089:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1095:5: ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1096:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1096:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1097:7: lv_right_3_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
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
            	    // InternalDsl.g:1116:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1116:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1117:5: otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_20); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1121:5: ()
            	    // InternalDsl.g:1122:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1128:5: ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1129:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1129:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1130:7: lv_right_6_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
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
    // InternalDsl.g:1153:1: entryRuleMultiplicationDivisionElement returns [EObject current=null] : iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF ;
    public final EObject entryRuleMultiplicationDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivisionElement = null;


        try {
            // InternalDsl.g:1153:70: (iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:1154:2: iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:1160:1: ruleMultiplicationDivisionElement returns [EObject current=null] : (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) ;
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
            // InternalDsl.g:1166:2: ( (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) )
            // InternalDsl.g:1167:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            {
            // InternalDsl.g:1167:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            // InternalDsl.g:1168:3: this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_UnaryElement_0=ruleUnaryElement();

            state._fsp--;


            			current = this_UnaryElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1176:3: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt16=1;
                    }
                    break;
                case 36:
                    {
                    alt16=2;
                    }
                    break;
                case 37:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1177:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1177:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1178:5: otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_20); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1182:5: ()
            	    // InternalDsl.g:1183:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1189:5: ( (lv_right_3_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1190:6: (lv_right_3_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1190:6: (lv_right_3_0= ruleUnaryElement )
            	    // InternalDsl.g:1191:7: lv_right_3_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
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
            	    // InternalDsl.g:1210:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1210:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1211:5: otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) )
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_20); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1215:5: ()
            	    // InternalDsl.g:1216:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1222:5: ( (lv_right_6_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1223:6: (lv_right_6_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1223:6: (lv_right_6_0= ruleUnaryElement )
            	    // InternalDsl.g:1224:7: lv_right_6_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
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
            	    // InternalDsl.g:1243:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1243:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1244:5: otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) )
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_20); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:1248:5: ()
            	    // InternalDsl.g:1249:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1255:5: ( (lv_right_9_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1256:6: (lv_right_9_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1256:6: (lv_right_9_0= ruleUnaryElement )
            	    // InternalDsl.g:1257:7: lv_right_9_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
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
    // InternalDsl.g:1280:1: entryRuleUnaryElement returns [EObject current=null] : iv_ruleUnaryElement= ruleUnaryElement EOF ;
    public final EObject entryRuleUnaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryElement = null;


        try {
            // InternalDsl.g:1280:53: (iv_ruleUnaryElement= ruleUnaryElement EOF )
            // InternalDsl.g:1281:2: iv_ruleUnaryElement= ruleUnaryElement EOF
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
    // InternalDsl.g:1287:1: ruleUnaryElement returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) ;
    public final EObject ruleUnaryElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        EObject this_OrElement_7 = null;

        EObject lv_exp_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1293:2: ( ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) )
            // InternalDsl.g:1294:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            {
            // InternalDsl.g:1294:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt17=3;
                }
                break;
            case 24:
                {
                alt17=4;
                }
                break;
            case 38:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1295:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    {
                    // InternalDsl.g:1295:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    // InternalDsl.g:1296:4: () ( (lv_value_1_0= ruleNUMBER ) )
                    {
                    // InternalDsl.g:1296:4: ()
                    // InternalDsl.g:1297:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1303:4: ( (lv_value_1_0= ruleNUMBER ) )
                    // InternalDsl.g:1304:5: (lv_value_1_0= ruleNUMBER )
                    {
                    // InternalDsl.g:1304:5: (lv_value_1_0= ruleNUMBER )
                    // InternalDsl.g:1305:6: lv_value_1_0= ruleNUMBER
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
                    // InternalDsl.g:1324:3: ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) )
                    {
                    // InternalDsl.g:1324:3: ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) )
                    // InternalDsl.g:1325:4: () ( (lv_value_3_0= ruleEXTENDED_STRING ) )
                    {
                    // InternalDsl.g:1325:4: ()
                    // InternalDsl.g:1326:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1332:4: ( (lv_value_3_0= ruleEXTENDED_STRING ) )
                    // InternalDsl.g:1333:5: (lv_value_3_0= ruleEXTENDED_STRING )
                    {
                    // InternalDsl.g:1333:5: (lv_value_3_0= ruleEXTENDED_STRING )
                    // InternalDsl.g:1334:6: lv_value_3_0= ruleEXTENDED_STRING
                    {

                    						newCompositeNode(grammarAccess.getUnaryElementAccess().getValueEXTENDED_STRINGParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEXTENDED_STRING();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"nii.bigclout.ecaadapter.Dsl.EXTENDED_STRING");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1353:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDsl.g:1353:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalDsl.g:1354:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalDsl.g:1354:4: ()
                    // InternalDsl.g:1355:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1361:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalDsl.g:1362:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalDsl.g:1362:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalDsl.g:1363:6: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getUnaryElementAccess().getValueBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"nii.bigclout.ecaadapter.Dsl.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1381:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    {
                    // InternalDsl.g:1381:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    // InternalDsl.g:1382:4: otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_OrElement_7=ruleOrElement();

                    state._fsp--;


                    				current = this_OrElement_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1400:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    {
                    // InternalDsl.g:1400:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    // InternalDsl.g:1401:4: otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnaryElementAccess().getNotKeyword_4_0());
                    			
                    // InternalDsl.g:1405:4: ()
                    // InternalDsl.g:1406:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1412:4: ( (lv_exp_11_0= ruleUnaryElement ) )
                    // InternalDsl.g:1413:5: (lv_exp_11_0= ruleUnaryElement )
                    {
                    // InternalDsl.g:1413:5: (lv_exp_11_0= ruleUnaryElement )
                    // InternalDsl.g:1414:6: lv_exp_11_0= ruleUnaryElement
                    {

                    						newCompositeNode(grammarAccess.getUnaryElementAccess().getExpUnaryElementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_11_0=ruleUnaryElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryElementRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_11_0,
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
    // InternalDsl.g:1436:1: entryRuleLBRACE returns [String current=null] : iv_ruleLBRACE= ruleLBRACE EOF ;
    public final String entryRuleLBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLBRACE = null;


        try {
            // InternalDsl.g:1436:46: (iv_ruleLBRACE= ruleLBRACE EOF )
            // InternalDsl.g:1437:2: iv_ruleLBRACE= ruleLBRACE EOF
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
    // InternalDsl.g:1443:1: ruleLBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1449:2: (kw= '{' )
            // InternalDsl.g:1450:2: kw= '{'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalDsl.g:1458:1: entryRuleRBRACE returns [String current=null] : iv_ruleRBRACE= ruleRBRACE EOF ;
    public final String entryRuleRBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBRACE = null;


        try {
            // InternalDsl.g:1458:46: (iv_ruleRBRACE= ruleRBRACE EOF )
            // InternalDsl.g:1459:2: iv_ruleRBRACE= ruleRBRACE EOF
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
    // InternalDsl.g:1465:1: ruleRBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1471:2: (kw= '}' )
            // InternalDsl.g:1472:2: kw= '}'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalDsl.g:1480:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalDsl.g:1480:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalDsl.g:1481:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalDsl.g:1487:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1493:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // InternalDsl.g:1494:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // InternalDsl.g:1494:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==41) ) {
                    alt18=2;
                }
                else if ( (LA18_1==EOF||(LA18_1>=RULE_ID && LA18_1<=RULE_BOOLEAN)||(LA18_1>=15 && LA18_1<=17)||LA18_1==22||(LA18_1>=24 && LA18_1<=38)) ) {
                    alt18=1;
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
                    // InternalDsl.g:1495:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1503:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalDsl.g:1503:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalDsl.g:1504:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,41,FOLLOW_28); 

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


    // $ANTLR start "entryRuleEXTENDED_STRING"
    // InternalDsl.g:1528:1: entryRuleEXTENDED_STRING returns [String current=null] : iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF ;
    public final String entryRuleEXTENDED_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXTENDED_STRING = null;


        try {
            // InternalDsl.g:1528:55: (iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF )
            // InternalDsl.g:1529:2: iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF
            {
             newCompositeNode(grammarAccess.getEXTENDED_STRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEXTENDED_STRING=ruleEXTENDED_STRING();

            state._fsp--;

             current =iv_ruleEXTENDED_STRING.getText(); 
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
    // $ANTLR end "entryRuleEXTENDED_STRING"


    // $ANTLR start "ruleEXTENDED_STRING"
    // InternalDsl.g:1535:1: ruleEXTENDED_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleEXTENDED_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1541:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? ) )
            // InternalDsl.g:1542:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? )
            {
            // InternalDsl.g:1542:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? )
            // InternalDsl.g:1543:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_0());
            		
            // InternalDsl.g:1550:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:1551:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getEXTENDED_STRINGAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalDsl.g:1564:3: (kw= '(' kw= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==25) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1565:4: kw= '(' kw= ')'
                    {
                    kw=(Token)match(input,24,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEXTENDED_STRINGAccess().getLeftParenthesisKeyword_2_0());
                    			
                    kw=(Token)match(input,25,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEXTENDED_STRINGAccess().getRightParenthesisKeyword_2_1());
                    			

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
    // $ANTLR end "ruleEXTENDED_STRING"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000043000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010001000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004001008070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004001010070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004001000070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020001000002L});

}