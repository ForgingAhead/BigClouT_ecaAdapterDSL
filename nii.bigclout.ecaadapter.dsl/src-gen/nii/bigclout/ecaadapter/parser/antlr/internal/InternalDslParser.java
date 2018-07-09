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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConceptToCodeMappings'", "'AppMeta'", "'on'", "'if'", "'do'", "'and'", "'EnvironmentMetaData'", "'service'", "'resource'", "'can'", "'be'", "','", "':='", "'('", "')'", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'{'", "'}'", "'.'"
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
    // InternalDsl.g:71:1: ruleRunTimeModel returns [EObject current=null] : ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* otherlv_4= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_6_0= ruleMappingPair ) )* ruleRBRACE ) ;
    public final EObject ruleRunTimeModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_envData_1_0 = null;

        EObject lv_appData_2_0 = null;

        EObject lv_servicesData_3_0 = null;

        EObject lv_mappingPairs_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* otherlv_4= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_6_0= ruleMappingPair ) )* ruleRBRACE ) )
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* otherlv_4= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_6_0= ruleMappingPair ) )* ruleRBRACE )
            {
            // InternalDsl.g:78:2: ( () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* otherlv_4= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_6_0= ruleMappingPair ) )* ruleRBRACE )
            // InternalDsl.g:79:3: () ( (lv_envData_1_0= ruleEnvironmentMetaData ) )* ( (lv_appData_2_0= ruleAppMetaData ) )* ( (lv_servicesData_3_0= ruleServiceMetaData ) )* otherlv_4= 'ConceptToCodeMappings' ruleLBRACE ( (lv_mappingPairs_6_0= ruleMappingPair ) )* ruleRBRACE
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

            // InternalDsl.g:124:3: ( (lv_servicesData_3_0= ruleServiceMetaData ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
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

            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRunTimeModelAccess().getConceptToCodeMappingsKeyword_4());
            		

            			newCompositeNode(grammarAccess.getRunTimeModelAccess().getLBRACEParserRuleCall_5());
            		
            pushFollow(FOLLOW_7);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:154:3: ( (lv_mappingPairs_6_0= ruleMappingPair ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:155:4: (lv_mappingPairs_6_0= ruleMappingPair )
            	    {
            	    // InternalDsl.g:155:4: (lv_mappingPairs_6_0= ruleMappingPair )
            	    // InternalDsl.g:156:5: lv_mappingPairs_6_0= ruleMappingPair
            	    {

            	    					newCompositeNode(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_mappingPairs_6_0=ruleMappingPair();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunTimeModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappingPairs",
            	    						lv_mappingPairs_6_0,
            	    						"nii.bigclout.ecaadapter.Dsl.MappingPair");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getRunTimeModelAccess().getRBRACEParserRuleCall_7());
            		
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
    // InternalDsl.g:184:1: entryRuleAppMetaData returns [EObject current=null] : iv_ruleAppMetaData= ruleAppMetaData EOF ;
    public final EObject entryRuleAppMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppMetaData = null;


        try {
            // InternalDsl.g:184:52: (iv_ruleAppMetaData= ruleAppMetaData EOF )
            // InternalDsl.g:185:2: iv_ruleAppMetaData= ruleAppMetaData EOF
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
    // InternalDsl.g:191:1: ruleAppMetaData returns [EObject current=null] : (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE ) ;
    public final EObject ruleAppMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appID_1_0=null;
        EObject lv_specifications_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:197:2: ( (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE ) )
            // InternalDsl.g:198:2: (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE )
            {
            // InternalDsl.g:198:2: (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE )
            // InternalDsl.g:199:3: otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleSpecification ) )* ruleRBRACE
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAppMetaDataAccess().getAppMetaKeyword_0());
            		
            // InternalDsl.g:203:3: ( (lv_appID_1_0= RULE_ID ) )
            // InternalDsl.g:204:4: (lv_appID_1_0= RULE_ID )
            {
            // InternalDsl.g:204:4: (lv_appID_1_0= RULE_ID )
            // InternalDsl.g:205:5: lv_appID_1_0= RULE_ID
            {
            lv_appID_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            pushFollow(FOLLOW_9);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:228:3: ( (lv_specifications_3_0= ruleSpecification ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:229:4: (lv_specifications_3_0= ruleSpecification )
            	    {
            	    // InternalDsl.g:229:4: (lv_specifications_3_0= ruleSpecification )
            	    // InternalDsl.g:230:5: lv_specifications_3_0= ruleSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getAppMetaDataAccess().getSpecificationsSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
    // InternalDsl.g:258:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalDsl.g:258:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalDsl.g:259:2: iv_ruleSpecification= ruleSpecification EOF
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
    // InternalDsl.g:265:1: ruleSpecification returns [EObject current=null] : ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* ) ;
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
            // InternalDsl.g:271:2: ( ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* ) )
            // InternalDsl.g:272:2: ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* )
            {
            // InternalDsl.g:272:2: ( ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )* )
            // InternalDsl.g:273:3: ( (lv_specID_0_0= RULE_ID ) )? otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )*
            {
            // InternalDsl.g:273:3: ( (lv_specID_0_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:274:4: (lv_specID_0_0= RULE_ID )
                    {
                    // InternalDsl.g:274:4: (lv_specID_0_0= RULE_ID )
                    // InternalDsl.g:275:5: lv_specID_0_0= RULE_ID
                    {
                    lv_specID_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecificationAccess().getOnKeyword_1());
            		
            // InternalDsl.g:295:3: ( (lv_trigger_2_0= ruleOrElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_BOOLEAN)||LA7_0==25||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:296:4: (lv_trigger_2_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:296:4: (lv_trigger_2_0= ruleOrElement )
            	    // InternalDsl.g:297:5: lv_trigger_2_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getTriggerOrElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getIfKeyword_3());
            		
            // InternalDsl.g:318:3: ( (lv_condition_4_0= ruleOrElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_BOOLEAN)||LA8_0==25||LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:319:4: (lv_condition_4_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:319:4: (lv_condition_4_0= ruleOrElement )
            	    // InternalDsl.g:320:5: lv_condition_4_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getConditionOrElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getDoKeyword_5());
            		
            // InternalDsl.g:341:3: ( (lv_action_6_0= ruleAction ) )
            // InternalDsl.g:342:4: (lv_action_6_0= ruleAction )
            {
            // InternalDsl.g:342:4: (lv_action_6_0= ruleAction )
            // InternalDsl.g:343:5: lv_action_6_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalDsl.g:360:3: (otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:361:4: otherlv_7= 'and' ( (lv_action_8_0= ruleAction ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSpecificationAccess().getAndKeyword_7_0());
            	    			
            	    // InternalDsl.g:365:4: ( (lv_action_8_0= ruleAction ) )
            	    // InternalDsl.g:366:5: (lv_action_8_0= ruleAction )
            	    {
            	    // InternalDsl.g:366:5: (lv_action_8_0= ruleAction )
            	    // InternalDsl.g:367:6: lv_action_8_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // InternalDsl.g:389:1: entryRuleEnvironmentMetaData returns [EObject current=null] : iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF ;
    public final EObject entryRuleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentMetaData = null;


        try {
            // InternalDsl.g:389:60: (iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF )
            // InternalDsl.g:390:2: iv_ruleEnvironmentMetaData= ruleEnvironmentMetaData EOF
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
    // InternalDsl.g:396:1: ruleEnvironmentMetaData returns [EObject current=null] : ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* ) ;
    public final EObject ruleEnvironmentMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resources_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:402:2: ( ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* ) )
            // InternalDsl.g:403:2: ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* )
            {
            // InternalDsl.g:403:2: ( () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )* )
            // InternalDsl.g:404:3: () otherlv_1= 'EnvironmentMetaData' ( (lv_resources_2_0= ruleResource ) )*
            {
            // InternalDsl.g:404:3: ()
            // InternalDsl.g:405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataKeyword_1());
            		
            // InternalDsl.g:415:3: ( (lv_resources_2_0= ruleResource ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:416:4: (lv_resources_2_0= ruleResource )
            	    {
            	    // InternalDsl.g:416:4: (lv_resources_2_0= ruleResource )
            	    // InternalDsl.g:417:5: lv_resources_2_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleEnvironmentMetaData"


    // $ANTLR start "entryRuleServiceMetaData"
    // InternalDsl.g:438:1: entryRuleServiceMetaData returns [EObject current=null] : iv_ruleServiceMetaData= ruleServiceMetaData EOF ;
    public final EObject entryRuleServiceMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMetaData = null;


        try {
            // InternalDsl.g:438:56: (iv_ruleServiceMetaData= ruleServiceMetaData EOF )
            // InternalDsl.g:439:2: iv_ruleServiceMetaData= ruleServiceMetaData EOF
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
    // InternalDsl.g:445:1: ruleServiceMetaData returns [EObject current=null] : (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) ) ;
    public final EObject ruleServiceMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_serviceID_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:451:2: ( (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:452:2: (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:452:2: (otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) ) )
            // InternalDsl.g:453:3: otherlv_0= 'service' ( (lv_serviceID_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceMetaDataAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:457:3: ( (lv_serviceID_1_0= RULE_ID ) )
            // InternalDsl.g:458:4: (lv_serviceID_1_0= RULE_ID )
            {
            // InternalDsl.g:458:4: (lv_serviceID_1_0= RULE_ID )
            // InternalDsl.g:459:5: lv_serviceID_1_0= RULE_ID
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


    // $ANTLR start "entryRuleResource"
    // InternalDsl.g:479:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalDsl.g:479:49: (iv_ruleResource= ruleResource EOF )
            // InternalDsl.g:480:2: iv_ruleResource= ruleResource EOF
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
    // InternalDsl.g:486:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* ) ;
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
            // InternalDsl.g:492:2: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* ) )
            // InternalDsl.g:493:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* )
            {
            // InternalDsl.g:493:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )* )
            // InternalDsl.g:494:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'can' otherlv_3= 'be' ( (lv_states_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalDsl.g:498:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:499:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:499:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:500:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getCanKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getBeKeyword_3());
            		
            // InternalDsl.g:524:3: ( (lv_states_4_0= ruleState ) )
            // InternalDsl.g:525:4: (lv_states_4_0= ruleState )
            {
            // InternalDsl.g:525:4: (lv_states_4_0= ruleState )
            // InternalDsl.g:526:5: lv_states_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalDsl.g:543:3: (otherlv_5= ',' ( (lv_states_6_0= ruleState ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:544:4: otherlv_5= ',' ( (lv_states_6_0= ruleState ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_17); 

            	    				newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:548:4: ( (lv_states_6_0= ruleState ) )
            	    // InternalDsl.g:549:5: (lv_states_6_0= ruleState )
            	    {
            	    // InternalDsl.g:549:5: (lv_states_6_0= ruleState )
            	    // InternalDsl.g:550:6: lv_states_6_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleState"
    // InternalDsl.g:572:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalDsl.g:572:45: (iv_ruleState= ruleState EOF )
            // InternalDsl.g:573:2: iv_ruleState= ruleState EOF
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
    // InternalDsl.g:579:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:585:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalDsl.g:586:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalDsl.g:586:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:587:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getStateAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:595:3: this_INT_1= RULE_INT
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
    // InternalDsl.g:606:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:606:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:607:2: iv_ruleAction= ruleAction EOF
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
    // InternalDsl.g:613:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:619:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) ) )
            // InternalDsl.g:620:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            {
            // InternalDsl.g:620:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) ) )
            // InternalDsl.g:621:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_state_2_0= ruleState ) )
            {
            // InternalDsl.g:621:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:622:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:622:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:623:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalDsl.g:638:3: ( (lv_state_2_0= ruleState ) )
            // InternalDsl.g:639:4: (lv_state_2_0= ruleState )
            {
            // InternalDsl.g:639:4: (lv_state_2_0= ruleState )
            // InternalDsl.g:640:5: lv_state_2_0= ruleState
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
    // InternalDsl.g:661:1: entryRuleMappingPair returns [EObject current=null] : iv_ruleMappingPair= ruleMappingPair EOF ;
    public final EObject entryRuleMappingPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingPair = null;


        try {
            // InternalDsl.g:661:52: (iv_ruleMappingPair= ruleMappingPair EOF )
            // InternalDsl.g:662:2: iv_ruleMappingPair= ruleMappingPair EOF
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
    // InternalDsl.g:668:1: ruleMappingPair returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' ) ;
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
            // InternalDsl.g:674:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' ) )
            // InternalDsl.g:675:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' )
            {
            // InternalDsl.g:675:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')' )
            // InternalDsl.g:676:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_state_3_0= ruleUnaryElement ) ) otherlv_4= ',' ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingPairAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDsl.g:680:3: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:681:4: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:681:4: (otherlv_1= RULE_ID )
            // InternalDsl.g:682:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingPairRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getMappingPairAccess().getResourceResourceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingPairAccess().getCommaKeyword_2());
            		
            // InternalDsl.g:697:3: ( (lv_state_3_0= ruleUnaryElement ) )
            // InternalDsl.g:698:4: (lv_state_3_0= ruleUnaryElement )
            {
            // InternalDsl.g:698:4: (lv_state_3_0= ruleUnaryElement )
            // InternalDsl.g:699:5: lv_state_3_0= ruleUnaryElement
            {

            					newCompositeNode(grammarAccess.getMappingPairAccess().getStateUnaryElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_4=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingPairAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:720:3: ( (lv_actionCode_5_0= ruleEXTENDED_STRING ) )
            // InternalDsl.g:721:4: (lv_actionCode_5_0= ruleEXTENDED_STRING )
            {
            // InternalDsl.g:721:4: (lv_actionCode_5_0= ruleEXTENDED_STRING )
            // InternalDsl.g:722:5: lv_actionCode_5_0= ruleEXTENDED_STRING
            {

            					newCompositeNode(grammarAccess.getMappingPairAccess().getActionCodeEXTENDED_STRINGParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

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
    // InternalDsl.g:747:1: entryRuleOrElement returns [EObject current=null] : iv_ruleOrElement= ruleOrElement EOF ;
    public final EObject entryRuleOrElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrElement = null;


        try {
            // InternalDsl.g:747:50: (iv_ruleOrElement= ruleOrElement EOF )
            // InternalDsl.g:748:2: iv_ruleOrElement= ruleOrElement EOF
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
    // InternalDsl.g:754:1: ruleOrElement returns [EObject current=null] : (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) ;
    public final EObject ruleOrElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:760:2: ( (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) )
            // InternalDsl.g:761:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            {
            // InternalDsl.g:761:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            // InternalDsl.g:762:3: this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_AndElement_0=ruleAndElement();

            state._fsp--;


            			current = this_AndElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:770:3: (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:771:4: otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrElementAccess().getOrKeyword_1_0());
            	    			
            	    // InternalDsl.g:775:4: ()
            	    // InternalDsl.g:776:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:782:4: ( (lv_right_3_0= ruleAndElement ) )
            	    // InternalDsl.g:783:5: (lv_right_3_0= ruleAndElement )
            	    {
            	    // InternalDsl.g:783:5: (lv_right_3_0= ruleAndElement )
            	    // InternalDsl.g:784:6: lv_right_3_0= ruleAndElement
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
    // InternalDsl.g:806:1: entryRuleAndElement returns [EObject current=null] : iv_ruleAndElement= ruleAndElement EOF ;
    public final EObject entryRuleAndElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndElement = null;


        try {
            // InternalDsl.g:806:51: (iv_ruleAndElement= ruleAndElement EOF )
            // InternalDsl.g:807:2: iv_ruleAndElement= ruleAndElement EOF
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
    // InternalDsl.g:813:1: ruleAndElement returns [EObject current=null] : (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) ;
    public final EObject ruleAndElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DiffEqualElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:819:2: ( (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) )
            // InternalDsl.g:820:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            {
            // InternalDsl.g:820:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            // InternalDsl.g:821:3: this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_DiffEqualElement_0=ruleDiffEqualElement();

            state._fsp--;


            			current = this_DiffEqualElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:829:3: (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:830:4: otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndElementAccess().getAndKeyword_1_0());
            	    			
            	    // InternalDsl.g:834:4: ()
            	    // InternalDsl.g:835:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:841:4: ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    // InternalDsl.g:842:5: (lv_right_3_0= ruleDiffEqualElement )
            	    {
            	    // InternalDsl.g:842:5: (lv_right_3_0= ruleDiffEqualElement )
            	    // InternalDsl.g:843:6: lv_right_3_0= ruleDiffEqualElement
            	    {

            	    						newCompositeNode(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // InternalDsl.g:865:1: entryRuleDiffEqualElement returns [EObject current=null] : iv_ruleDiffEqualElement= ruleDiffEqualElement EOF ;
    public final EObject entryRuleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiffEqualElement = null;


        try {
            // InternalDsl.g:865:57: (iv_ruleDiffEqualElement= ruleDiffEqualElement EOF )
            // InternalDsl.g:866:2: iv_ruleDiffEqualElement= ruleDiffEqualElement EOF
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
    // InternalDsl.g:872:1: ruleDiffEqualElement returns [EObject current=null] : (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) ;
    public final EObject ruleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_CompareElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:878:2: ( (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) )
            // InternalDsl.g:879:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            {
            // InternalDsl.g:879:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            // InternalDsl.g:880:3: this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_CompareElement_0=ruleCompareElement();

            state._fsp--;


            			current = this_CompareElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:888:3: ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }
                else if ( (LA15_0==29) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:889:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:889:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:890:5: otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_21); 

            	    					newLeafNode(otherlv_1, grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:894:5: ()
            	    // InternalDsl.g:895:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:901:5: ( (lv_right_3_0= ruleCompareElement ) )
            	    // InternalDsl.g:902:6: (lv_right_3_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:902:6: (lv_right_3_0= ruleCompareElement )
            	    // InternalDsl.g:903:7: lv_right_3_0= ruleCompareElement
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
            	    // InternalDsl.g:922:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:922:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:923:5: otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_21); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:927:5: ()
            	    // InternalDsl.g:928:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:934:5: ( (lv_right_6_0= ruleCompareElement ) )
            	    // InternalDsl.g:935:6: (lv_right_6_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:935:6: (lv_right_6_0= ruleCompareElement )
            	    // InternalDsl.g:936:7: lv_right_6_0= ruleCompareElement
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
    // InternalDsl.g:959:1: entryRuleCompareElement returns [EObject current=null] : iv_ruleCompareElement= ruleCompareElement EOF ;
    public final EObject entryRuleCompareElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareElement = null;


        try {
            // InternalDsl.g:959:55: (iv_ruleCompareElement= ruleCompareElement EOF )
            // InternalDsl.g:960:2: iv_ruleCompareElement= ruleCompareElement EOF
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
    // InternalDsl.g:966:1: ruleCompareElement returns [EObject current=null] : (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) ;
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
            // InternalDsl.g:972:2: ( (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) )
            // InternalDsl.g:973:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            {
            // InternalDsl.g:973:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            // InternalDsl.g:974:3: this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_PlusMinusElement_0=rulePlusMinusElement();

            state._fsp--;


            			current = this_PlusMinusElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:982:3: ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            loop16:
            do {
                int alt16=5;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt16=1;
                    }
                    break;
                case 31:
                    {
                    alt16=2;
                    }
                    break;
                case 32:
                    {
                    alt16=3;
                    }
                    break;
                case 33:
                    {
                    alt16=4;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:983:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:983:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:984:5: otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_21); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:988:5: ()
            	    // InternalDsl.g:989:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:995:5: ( (lv_right_3_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:996:6: (lv_right_3_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:996:6: (lv_right_3_0= rulePlusMinusElement )
            	    // InternalDsl.g:997:7: lv_right_3_0= rulePlusMinusElement
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
            	    // InternalDsl.g:1016:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1016:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1017:5: otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_21); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1021:5: ()
            	    // InternalDsl.g:1022:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1028:5: ( (lv_right_6_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1029:6: (lv_right_6_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1029:6: (lv_right_6_0= rulePlusMinusElement )
            	    // InternalDsl.g:1030:7: lv_right_6_0= rulePlusMinusElement
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
            	    // InternalDsl.g:1049:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1049:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1050:5: otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_21); 

            	    					newLeafNode(otherlv_7, grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:1054:5: ()
            	    // InternalDsl.g:1055:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1061:5: ( (lv_right_9_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1062:6: (lv_right_9_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1062:6: (lv_right_9_0= rulePlusMinusElement )
            	    // InternalDsl.g:1063:7: lv_right_9_0= rulePlusMinusElement
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
            	    // InternalDsl.g:1082:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:1082:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:1083:5: otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_21); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0());
            	    				
            	    // InternalDsl.g:1087:5: ()
            	    // InternalDsl.g:1088:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1094:5: ( (lv_right_12_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:1095:6: (lv_right_12_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:1095:6: (lv_right_12_0= rulePlusMinusElement )
            	    // InternalDsl.g:1096:7: lv_right_12_0= rulePlusMinusElement
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
    // InternalDsl.g:1119:1: entryRulePlusMinusElement returns [EObject current=null] : iv_rulePlusMinusElement= rulePlusMinusElement EOF ;
    public final EObject entryRulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusElement = null;


        try {
            // InternalDsl.g:1119:57: (iv_rulePlusMinusElement= rulePlusMinusElement EOF )
            // InternalDsl.g:1120:2: iv_rulePlusMinusElement= rulePlusMinusElement EOF
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
    // InternalDsl.g:1126:1: rulePlusMinusElement returns [EObject current=null] : (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) ;
    public final EObject rulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_MultiplicationDivisionElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1132:2: ( (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) )
            // InternalDsl.g:1133:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            {
            // InternalDsl.g:1133:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            // InternalDsl.g:1134:3: this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_MultiplicationDivisionElement_0=ruleMultiplicationDivisionElement();

            state._fsp--;


            			current = this_MultiplicationDivisionElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1142:3: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }
                else if ( (LA17_0==35) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1143:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1143:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1144:5: otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_21); 

            	    					newLeafNode(otherlv_1, grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1148:5: ()
            	    // InternalDsl.g:1149:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1155:5: ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1156:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1156:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1157:7: lv_right_3_0= ruleMultiplicationDivisionElement
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
            	    // InternalDsl.g:1176:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:1176:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:1177:5: otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_21); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1181:5: ()
            	    // InternalDsl.g:1182:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1188:5: ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:1189:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:1189:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:1190:7: lv_right_6_0= ruleMultiplicationDivisionElement
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
    // InternalDsl.g:1213:1: entryRuleMultiplicationDivisionElement returns [EObject current=null] : iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF ;
    public final EObject entryRuleMultiplicationDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivisionElement = null;


        try {
            // InternalDsl.g:1213:70: (iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:1214:2: iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:1220:1: ruleMultiplicationDivisionElement returns [EObject current=null] : (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) ;
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
            // InternalDsl.g:1226:2: ( (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) )
            // InternalDsl.g:1227:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            {
            // InternalDsl.g:1227:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            // InternalDsl.g:1228:3: this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_UnaryElement_0=ruleUnaryElement();

            state._fsp--;


            			current = this_UnaryElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1236:3: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            loop18:
            do {
                int alt18=4;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    alt18=1;
                    }
                    break;
                case 37:
                    {
                    alt18=2;
                    }
                    break;
                case 38:
                    {
                    alt18=3;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1237:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1237:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1238:5: otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_21); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:1242:5: ()
            	    // InternalDsl.g:1243:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1249:5: ( (lv_right_3_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1250:6: (lv_right_3_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1250:6: (lv_right_3_0= ruleUnaryElement )
            	    // InternalDsl.g:1251:7: lv_right_3_0= ruleUnaryElement
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
            	    // InternalDsl.g:1270:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1270:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1271:5: otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) )
            	    {
            	    otherlv_4=(Token)match(input,37,FOLLOW_21); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:1275:5: ()
            	    // InternalDsl.g:1276:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1282:5: ( (lv_right_6_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1283:6: (lv_right_6_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1283:6: (lv_right_6_0= ruleUnaryElement )
            	    // InternalDsl.g:1284:7: lv_right_6_0= ruleUnaryElement
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
            	    // InternalDsl.g:1303:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:1303:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:1304:5: otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_21); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:1308:5: ()
            	    // InternalDsl.g:1309:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:1315:5: ( (lv_right_9_0= ruleUnaryElement ) )
            	    // InternalDsl.g:1316:6: (lv_right_9_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:1316:6: (lv_right_9_0= ruleUnaryElement )
            	    // InternalDsl.g:1317:7: lv_right_9_0= ruleUnaryElement
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
    // InternalDsl.g:1340:1: entryRuleUnaryElement returns [EObject current=null] : iv_ruleUnaryElement= ruleUnaryElement EOF ;
    public final EObject entryRuleUnaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryElement = null;


        try {
            // InternalDsl.g:1340:53: (iv_ruleUnaryElement= ruleUnaryElement EOF )
            // InternalDsl.g:1341:2: iv_ruleUnaryElement= ruleUnaryElement EOF
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
    // InternalDsl.g:1347:1: ruleUnaryElement returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) ;
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
            // InternalDsl.g:1353:2: ( ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) )
            // InternalDsl.g:1354:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            {
            // InternalDsl.g:1354:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt19=3;
                }
                break;
            case 25:
                {
                alt19=4;
                }
                break;
            case 39:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1355:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    {
                    // InternalDsl.g:1355:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    // InternalDsl.g:1356:4: () ( (lv_value_1_0= ruleNUMBER ) )
                    {
                    // InternalDsl.g:1356:4: ()
                    // InternalDsl.g:1357:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1363:4: ( (lv_value_1_0= ruleNUMBER ) )
                    // InternalDsl.g:1364:5: (lv_value_1_0= ruleNUMBER )
                    {
                    // InternalDsl.g:1364:5: (lv_value_1_0= ruleNUMBER )
                    // InternalDsl.g:1365:6: lv_value_1_0= ruleNUMBER
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
                    // InternalDsl.g:1384:3: ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) )
                    {
                    // InternalDsl.g:1384:3: ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) )
                    // InternalDsl.g:1385:4: () ( (lv_value_3_0= ruleEXTENDED_STRING ) )
                    {
                    // InternalDsl.g:1385:4: ()
                    // InternalDsl.g:1386:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1392:4: ( (lv_value_3_0= ruleEXTENDED_STRING ) )
                    // InternalDsl.g:1393:5: (lv_value_3_0= ruleEXTENDED_STRING )
                    {
                    // InternalDsl.g:1393:5: (lv_value_3_0= ruleEXTENDED_STRING )
                    // InternalDsl.g:1394:6: lv_value_3_0= ruleEXTENDED_STRING
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
                    // InternalDsl.g:1413:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDsl.g:1413:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalDsl.g:1414:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalDsl.g:1414:4: ()
                    // InternalDsl.g:1415:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1421:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalDsl.g:1422:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalDsl.g:1422:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalDsl.g:1423:6: lv_value_5_0= RULE_BOOLEAN
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
                    // InternalDsl.g:1441:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    {
                    // InternalDsl.g:1441:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    // InternalDsl.g:1442:4: otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_OrElement_7=ruleOrElement();

                    state._fsp--;


                    				current = this_OrElement_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1460:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    {
                    // InternalDsl.g:1460:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    // InternalDsl.g:1461:4: otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnaryElementAccess().getNotKeyword_4_0());
                    			
                    // InternalDsl.g:1465:4: ()
                    // InternalDsl.g:1466:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1472:4: ( (lv_exp_11_0= ruleUnaryElement ) )
                    // InternalDsl.g:1473:5: (lv_exp_11_0= ruleUnaryElement )
                    {
                    // InternalDsl.g:1473:5: (lv_exp_11_0= ruleUnaryElement )
                    // InternalDsl.g:1474:6: lv_exp_11_0= ruleUnaryElement
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
    // InternalDsl.g:1496:1: entryRuleLBRACE returns [String current=null] : iv_ruleLBRACE= ruleLBRACE EOF ;
    public final String entryRuleLBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLBRACE = null;


        try {
            // InternalDsl.g:1496:46: (iv_ruleLBRACE= ruleLBRACE EOF )
            // InternalDsl.g:1497:2: iv_ruleLBRACE= ruleLBRACE EOF
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
    // InternalDsl.g:1503:1: ruleLBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1509:2: (kw= '{' )
            // InternalDsl.g:1510:2: kw= '{'
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
    // InternalDsl.g:1518:1: entryRuleRBRACE returns [String current=null] : iv_ruleRBRACE= ruleRBRACE EOF ;
    public final String entryRuleRBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBRACE = null;


        try {
            // InternalDsl.g:1518:46: (iv_ruleRBRACE= ruleRBRACE EOF )
            // InternalDsl.g:1519:2: iv_ruleRBRACE= ruleRBRACE EOF
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
    // InternalDsl.g:1525:1: ruleRBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1531:2: (kw= '}' )
            // InternalDsl.g:1532:2: kw= '}'
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
    // InternalDsl.g:1540:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalDsl.g:1540:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalDsl.g:1541:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalDsl.g:1547:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1553:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // InternalDsl.g:1554:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // InternalDsl.g:1554:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||(LA20_1>=RULE_ID && LA20_1<=RULE_BOOLEAN)||(LA20_1>=15 && LA20_1<=17)||LA20_1==23||(LA20_1>=25 && LA20_1<=39)) ) {
                    alt20=1;
                }
                else if ( (LA20_1==42) ) {
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
                    // InternalDsl.g:1555:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1563:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalDsl.g:1563:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalDsl.g:1564:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_28); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,42,FOLLOW_29); 

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
    // InternalDsl.g:1588:1: entryRuleEXTENDED_STRING returns [String current=null] : iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF ;
    public final String entryRuleEXTENDED_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXTENDED_STRING = null;


        try {
            // InternalDsl.g:1588:55: (iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF )
            // InternalDsl.g:1589:2: iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF
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
    // InternalDsl.g:1595:1: ruleEXTENDED_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleEXTENDED_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1601:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? ) )
            // InternalDsl.g:1602:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? )
            {
            // InternalDsl.g:1602:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? )
            // InternalDsl.g:1603:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_0());
            		
            // InternalDsl.g:1610:3: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1611:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getEXTENDED_STRINGAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalDsl.g:1624:3: (kw= '(' kw= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==26) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1625:4: kw= '(' kw= ')'
                    {
                    kw=(Token)match(input,25,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEXTENDED_STRINGAccess().getLeftParenthesisKeyword_2_0());
                    			
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C3000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000083000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020002004010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008002008070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008002010070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008002000070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040002000002L});

}