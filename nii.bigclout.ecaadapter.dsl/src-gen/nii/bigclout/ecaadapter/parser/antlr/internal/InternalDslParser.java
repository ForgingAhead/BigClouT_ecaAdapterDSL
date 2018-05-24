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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AppMeta'", "'on'", "'if'", "'do'", "'or'", "'and'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'not'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalDsl.g:71:1: ruleRunTimeModel returns [EObject current=null] : ( (lv_appData_0_0= ruleAppMetaData ) )* ;
    public final EObject ruleRunTimeModel() throws RecognitionException {
        EObject current = null;

        EObject lv_appData_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_appData_0_0= ruleAppMetaData ) )* )
            // InternalDsl.g:78:2: ( (lv_appData_0_0= ruleAppMetaData ) )*
            {
            // InternalDsl.g:78:2: ( (lv_appData_0_0= ruleAppMetaData ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_appData_0_0= ruleAppMetaData )
            	    {
            	    // InternalDsl.g:79:3: (lv_appData_0_0= ruleAppMetaData )
            	    // InternalDsl.g:80:4: lv_appData_0_0= ruleAppMetaData
            	    {

            	    				newCompositeNode(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_appData_0_0=ruleAppMetaData();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRunTimeModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"appData",
            	    					lv_appData_0_0,
            	    					"nii.bigclout.ecaadapter.Dsl.AppMetaData");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalDsl.g:100:1: entryRuleAppMetaData returns [EObject current=null] : iv_ruleAppMetaData= ruleAppMetaData EOF ;
    public final EObject entryRuleAppMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppMetaData = null;


        try {
            // InternalDsl.g:100:52: (iv_ruleAppMetaData= ruleAppMetaData EOF )
            // InternalDsl.g:101:2: iv_ruleAppMetaData= ruleAppMetaData EOF
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
    // InternalDsl.g:107:1: ruleAppMetaData returns [EObject current=null] : (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE ) ;
    public final EObject ruleAppMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appID_1_0=null;
        EObject lv_specifications_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE ) )
            // InternalDsl.g:114:2: (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE )
            {
            // InternalDsl.g:114:2: (otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE )
            // InternalDsl.g:115:3: otherlv_0= 'AppMeta' ( (lv_appID_1_0= RULE_ID ) ) ruleLBRACE ( (lv_specifications_3_0= ruleAppSpecification ) )* ruleRBRACE
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAppMetaDataAccess().getAppMetaKeyword_0());
            		
            // InternalDsl.g:119:3: ( (lv_appID_1_0= RULE_ID ) )
            // InternalDsl.g:120:4: (lv_appID_1_0= RULE_ID )
            {
            // InternalDsl.g:120:4: (lv_appID_1_0= RULE_ID )
            // InternalDsl.g:121:5: lv_appID_1_0= RULE_ID
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
            		
            pushFollow(FOLLOW_6);
            ruleLBRACE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:144:3: ( (lv_specifications_3_0= ruleAppSpecification ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:145:4: (lv_specifications_3_0= ruleAppSpecification )
            	    {
            	    // InternalDsl.g:145:4: (lv_specifications_3_0= ruleAppSpecification )
            	    // InternalDsl.g:146:5: lv_specifications_3_0= ruleAppSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getAppMetaDataAccess().getSpecificationsAppSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop2;
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
    // InternalDsl.g:174:1: entryRuleAppSpecification returns [EObject current=null] : iv_ruleAppSpecification= ruleAppSpecification EOF ;
    public final EObject entryRuleAppSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppSpecification = null;


        try {
            // InternalDsl.g:174:57: (iv_ruleAppSpecification= ruleAppSpecification EOF )
            // InternalDsl.g:175:2: iv_ruleAppSpecification= ruleAppSpecification EOF
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
    // InternalDsl.g:181:1: ruleAppSpecification returns [EObject current=null] : ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAndElement ) )* ) ;
    public final EObject ruleAppSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_specID_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_action_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:187:2: ( ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAndElement ) )* ) )
            // InternalDsl.g:188:2: ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAndElement ) )* )
            {
            // InternalDsl.g:188:2: ( ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAndElement ) )* )
            // InternalDsl.g:189:3: ( (lv_specID_0_0= RULE_ID ) ) otherlv_1= 'on' ( (lv_trigger_2_0= ruleOrElement ) )* otherlv_3= 'if' ( (lv_condition_4_0= ruleOrElement ) )* otherlv_5= 'do' ( (lv_action_6_0= ruleAndElement ) )*
            {
            // InternalDsl.g:189:3: ( (lv_specID_0_0= RULE_ID ) )
            // InternalDsl.g:190:4: (lv_specID_0_0= RULE_ID )
            {
            // InternalDsl.g:190:4: (lv_specID_0_0= RULE_ID )
            // InternalDsl.g:191:5: lv_specID_0_0= RULE_ID
            {
            lv_specID_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAppSpecificationAccess().getOnKeyword_1());
            		
            // InternalDsl.g:211:3: ( (lv_trigger_2_0= ruleOrElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==29||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:212:4: (lv_trigger_2_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:212:4: (lv_trigger_2_0= ruleOrElement )
            	    // InternalDsl.g:213:5: lv_trigger_2_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getTriggerOrElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAppSpecificationAccess().getIfKeyword_3());
            		
            // InternalDsl.g:234:3: ( (lv_condition_4_0= ruleOrElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||LA4_0==29||LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:235:4: (lv_condition_4_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:235:4: (lv_condition_4_0= ruleOrElement )
            	    // InternalDsl.g:236:5: lv_condition_4_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getConditionOrElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAppSpecificationAccess().getDoKeyword_5());
            		
            // InternalDsl.g:257:3: ( (lv_action_6_0= ruleAndElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==EOF||(LA5_2>=RULE_ID && LA5_2<=RULE_INT)||(LA5_2>=17 && LA5_2<=29)||LA5_2==31||(LA5_2>=33 && LA5_2<=34)) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>=RULE_BOOLEAN && LA5_0<=RULE_INT)||LA5_0==29||LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:258:4: (lv_action_6_0= ruleAndElement )
            	    {
            	    // InternalDsl.g:258:4: (lv_action_6_0= ruleAndElement )
            	    // InternalDsl.g:259:5: lv_action_6_0= ruleAndElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getActionAndElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_action_6_0=ruleAndElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"action",
            	    						lv_action_6_0,
            	    						"nii.bigclout.ecaadapter.Dsl.AndElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:280:1: entryRuleOrElement returns [EObject current=null] : iv_ruleOrElement= ruleOrElement EOF ;
    public final EObject entryRuleOrElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrElement = null;


        try {
            // InternalDsl.g:280:50: (iv_ruleOrElement= ruleOrElement EOF )
            // InternalDsl.g:281:2: iv_ruleOrElement= ruleOrElement EOF
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
    // InternalDsl.g:287:1: ruleOrElement returns [EObject current=null] : (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) ;
    public final EObject ruleOrElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:293:2: ( (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) )
            // InternalDsl.g:294:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            {
            // InternalDsl.g:294:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            // InternalDsl.g:295:3: this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_AndElement_0=ruleAndElement();

            state._fsp--;


            			current = this_AndElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:303:3: (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:304:4: otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrElementAccess().getOrKeyword_1_0());
            	    			
            	    // InternalDsl.g:308:4: ()
            	    // InternalDsl.g:309:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:315:4: ( (lv_right_3_0= ruleAndElement ) )
            	    // InternalDsl.g:316:5: (lv_right_3_0= ruleAndElement )
            	    {
            	    // InternalDsl.g:316:5: (lv_right_3_0= ruleAndElement )
            	    // InternalDsl.g:317:6: lv_right_3_0= ruleAndElement
            	    {

            	    						newCompositeNode(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop6;
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
    // InternalDsl.g:339:1: entryRuleAndElement returns [EObject current=null] : iv_ruleAndElement= ruleAndElement EOF ;
    public final EObject entryRuleAndElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndElement = null;


        try {
            // InternalDsl.g:339:51: (iv_ruleAndElement= ruleAndElement EOF )
            // InternalDsl.g:340:2: iv_ruleAndElement= ruleAndElement EOF
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
    // InternalDsl.g:346:1: ruleAndElement returns [EObject current=null] : (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) ;
    public final EObject ruleAndElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DiffEqualElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:352:2: ( (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) )
            // InternalDsl.g:353:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            {
            // InternalDsl.g:353:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            // InternalDsl.g:354:3: this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_DiffEqualElement_0=ruleDiffEqualElement();

            state._fsp--;


            			current = this_DiffEqualElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:362:3: (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:363:4: otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndElementAccess().getAndKeyword_1_0());
            	    			
            	    // InternalDsl.g:367:4: ()
            	    // InternalDsl.g:368:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:374:4: ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    // InternalDsl.g:375:5: (lv_right_3_0= ruleDiffEqualElement )
            	    {
            	    // InternalDsl.g:375:5: (lv_right_3_0= ruleDiffEqualElement )
            	    // InternalDsl.g:376:6: lv_right_3_0= ruleDiffEqualElement
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
    // $ANTLR end "ruleAndElement"


    // $ANTLR start "entryRuleDiffEqualElement"
    // InternalDsl.g:398:1: entryRuleDiffEqualElement returns [EObject current=null] : iv_ruleDiffEqualElement= ruleDiffEqualElement EOF ;
    public final EObject entryRuleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiffEqualElement = null;


        try {
            // InternalDsl.g:398:57: (iv_ruleDiffEqualElement= ruleDiffEqualElement EOF )
            // InternalDsl.g:399:2: iv_ruleDiffEqualElement= ruleDiffEqualElement EOF
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
    // InternalDsl.g:405:1: ruleDiffEqualElement returns [EObject current=null] : (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) ;
    public final EObject ruleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_CompareElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:411:2: ( (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) )
            // InternalDsl.g:412:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            {
            // InternalDsl.g:412:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            // InternalDsl.g:413:3: this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_CompareElement_0=ruleCompareElement();

            state._fsp--;


            			current = this_CompareElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:421:3: ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }
                else if ( (LA8_0==19) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:422:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:422:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:423:5: otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_12); 

            	    					newLeafNode(otherlv_1, grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:427:5: ()
            	    // InternalDsl.g:428:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:434:5: ( (lv_right_3_0= ruleCompareElement ) )
            	    // InternalDsl.g:435:6: (lv_right_3_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:435:6: (lv_right_3_0= ruleCompareElement )
            	    // InternalDsl.g:436:7: lv_right_3_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
            	    // InternalDsl.g:455:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:455:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:456:5: otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:460:5: ()
            	    // InternalDsl.g:461:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:467:5: ( (lv_right_6_0= ruleCompareElement ) )
            	    // InternalDsl.g:468:6: (lv_right_6_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:468:6: (lv_right_6_0= ruleCompareElement )
            	    // InternalDsl.g:469:7: lv_right_6_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleDiffEqualElement"


    // $ANTLR start "entryRuleCompareElement"
    // InternalDsl.g:492:1: entryRuleCompareElement returns [EObject current=null] : iv_ruleCompareElement= ruleCompareElement EOF ;
    public final EObject entryRuleCompareElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareElement = null;


        try {
            // InternalDsl.g:492:55: (iv_ruleCompareElement= ruleCompareElement EOF )
            // InternalDsl.g:493:2: iv_ruleCompareElement= ruleCompareElement EOF
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
    // InternalDsl.g:499:1: ruleCompareElement returns [EObject current=null] : (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) ;
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
            // InternalDsl.g:505:2: ( (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) )
            // InternalDsl.g:506:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            {
            // InternalDsl.g:506:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            // InternalDsl.g:507:3: this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_PlusMinusElement_0=rulePlusMinusElement();

            state._fsp--;


            			current = this_PlusMinusElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:515:3: ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            loop9:
            do {
                int alt9=5;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt9=1;
                    }
                    break;
                case 21:
                    {
                    alt9=2;
                    }
                    break;
                case 22:
                    {
                    alt9=3;
                    }
                    break;
                case 23:
                    {
                    alt9=4;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:516:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:516:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:517:5: otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_12); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:521:5: ()
            	    // InternalDsl.g:522:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:528:5: ( (lv_right_3_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:529:6: (lv_right_3_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:529:6: (lv_right_3_0= rulePlusMinusElement )
            	    // InternalDsl.g:530:7: lv_right_3_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    // InternalDsl.g:549:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:549:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:550:5: otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:554:5: ()
            	    // InternalDsl.g:555:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:561:5: ( (lv_right_6_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:562:6: (lv_right_6_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:562:6: (lv_right_6_0= rulePlusMinusElement )
            	    // InternalDsl.g:563:7: lv_right_6_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    // InternalDsl.g:582:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:582:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:583:5: otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_12); 

            	    					newLeafNode(otherlv_7, grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:587:5: ()
            	    // InternalDsl.g:588:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:594:5: ( (lv_right_9_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:595:6: (lv_right_9_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:595:6: (lv_right_9_0= rulePlusMinusElement )
            	    // InternalDsl.g:596:7: lv_right_9_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    // InternalDsl.g:615:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:615:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:616:5: otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FOLLOW_12); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0());
            	    				
            	    // InternalDsl.g:620:5: ()
            	    // InternalDsl.g:621:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:627:5: ( (lv_right_12_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:628:6: (lv_right_12_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:628:6: (lv_right_12_0= rulePlusMinusElement )
            	    // InternalDsl.g:629:7: lv_right_12_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleCompareElement"


    // $ANTLR start "entryRulePlusMinusElement"
    // InternalDsl.g:652:1: entryRulePlusMinusElement returns [EObject current=null] : iv_rulePlusMinusElement= rulePlusMinusElement EOF ;
    public final EObject entryRulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusElement = null;


        try {
            // InternalDsl.g:652:57: (iv_rulePlusMinusElement= rulePlusMinusElement EOF )
            // InternalDsl.g:653:2: iv_rulePlusMinusElement= rulePlusMinusElement EOF
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
    // InternalDsl.g:659:1: rulePlusMinusElement returns [EObject current=null] : (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) ;
    public final EObject rulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_MultiplicationDivisionElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:665:2: ( (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) )
            // InternalDsl.g:666:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            {
            // InternalDsl.g:666:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            // InternalDsl.g:667:3: this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_MultiplicationDivisionElement_0=ruleMultiplicationDivisionElement();

            state._fsp--;


            			current = this_MultiplicationDivisionElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:675:3: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }
                else if ( (LA10_0==25) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:676:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:676:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:677:5: otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_12); 

            	    					newLeafNode(otherlv_1, grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:681:5: ()
            	    // InternalDsl.g:682:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:688:5: ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:689:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:689:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:690:7: lv_right_3_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDsl.g:709:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:709:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:710:5: otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:714:5: ()
            	    // InternalDsl.g:715:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:721:5: ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:722:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:722:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:723:7: lv_right_6_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
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
    // $ANTLR end "rulePlusMinusElement"


    // $ANTLR start "entryRuleMultiplicationDivisionElement"
    // InternalDsl.g:746:1: entryRuleMultiplicationDivisionElement returns [EObject current=null] : iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF ;
    public final EObject entryRuleMultiplicationDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivisionElement = null;


        try {
            // InternalDsl.g:746:70: (iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:747:2: iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:753:1: ruleMultiplicationDivisionElement returns [EObject current=null] : (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) ;
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
            // InternalDsl.g:759:2: ( (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) )
            // InternalDsl.g:760:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            {
            // InternalDsl.g:760:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            // InternalDsl.g:761:3: this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_UnaryElement_0=ruleUnaryElement();

            state._fsp--;


            			current = this_UnaryElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:769:3: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt11=1;
                    }
                    break;
                case 27:
                    {
                    alt11=2;
                    }
                    break;
                case 28:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:770:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:770:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:771:5: otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_12); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:775:5: ()
            	    // InternalDsl.g:776:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:782:5: ( (lv_right_3_0= ruleUnaryElement ) )
            	    // InternalDsl.g:783:6: (lv_right_3_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:783:6: (lv_right_3_0= ruleUnaryElement )
            	    // InternalDsl.g:784:7: lv_right_3_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
            	    // InternalDsl.g:803:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:803:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:804:5: otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:808:5: ()
            	    // InternalDsl.g:809:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:815:5: ( (lv_right_6_0= ruleUnaryElement ) )
            	    // InternalDsl.g:816:6: (lv_right_6_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:816:6: (lv_right_6_0= ruleUnaryElement )
            	    // InternalDsl.g:817:7: lv_right_6_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
            	    // InternalDsl.g:836:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:836:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:837:5: otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_12); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:841:5: ()
            	    // InternalDsl.g:842:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:848:5: ( (lv_right_9_0= ruleUnaryElement ) )
            	    // InternalDsl.g:849:6: (lv_right_9_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:849:6: (lv_right_9_0= ruleUnaryElement )
            	    // InternalDsl.g:850:7: lv_right_9_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleMultiplicationDivisionElement"


    // $ANTLR start "entryRuleUnaryElement"
    // InternalDsl.g:873:1: entryRuleUnaryElement returns [EObject current=null] : iv_ruleUnaryElement= ruleUnaryElement EOF ;
    public final EObject entryRuleUnaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryElement = null;


        try {
            // InternalDsl.g:873:53: (iv_ruleUnaryElement= ruleUnaryElement EOF )
            // InternalDsl.g:874:2: iv_ruleUnaryElement= ruleUnaryElement EOF
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
    // InternalDsl.g:880:1: ruleUnaryElement returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) ;
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
            // InternalDsl.g:886:2: ( ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) )
            // InternalDsl.g:887:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            {
            // InternalDsl.g:887:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 31:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDsl.g:888:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    {
                    // InternalDsl.g:888:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    // InternalDsl.g:889:4: () ( (lv_value_1_0= ruleNUMBER ) )
                    {
                    // InternalDsl.g:889:4: ()
                    // InternalDsl.g:890:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:896:4: ( (lv_value_1_0= ruleNUMBER ) )
                    // InternalDsl.g:897:5: (lv_value_1_0= ruleNUMBER )
                    {
                    // InternalDsl.g:897:5: (lv_value_1_0= ruleNUMBER )
                    // InternalDsl.g:898:6: lv_value_1_0= ruleNUMBER
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
                    // InternalDsl.g:917:3: ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) )
                    {
                    // InternalDsl.g:917:3: ( () ( (lv_value_3_0= ruleEXTENDED_STRING ) ) )
                    // InternalDsl.g:918:4: () ( (lv_value_3_0= ruleEXTENDED_STRING ) )
                    {
                    // InternalDsl.g:918:4: ()
                    // InternalDsl.g:919:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:925:4: ( (lv_value_3_0= ruleEXTENDED_STRING ) )
                    // InternalDsl.g:926:5: (lv_value_3_0= ruleEXTENDED_STRING )
                    {
                    // InternalDsl.g:926:5: (lv_value_3_0= ruleEXTENDED_STRING )
                    // InternalDsl.g:927:6: lv_value_3_0= ruleEXTENDED_STRING
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
                    // InternalDsl.g:946:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDsl.g:946:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalDsl.g:947:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalDsl.g:947:4: ()
                    // InternalDsl.g:948:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:954:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalDsl.g:955:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalDsl.g:955:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalDsl.g:956:6: lv_value_5_0= RULE_BOOLEAN
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
                    // InternalDsl.g:974:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    {
                    // InternalDsl.g:974:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    // InternalDsl.g:975:4: otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_OrElement_7=ruleOrElement();

                    state._fsp--;


                    				current = this_OrElement_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:993:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    {
                    // InternalDsl.g:993:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    // InternalDsl.g:994:4: otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnaryElementAccess().getNotKeyword_4_0());
                    			
                    // InternalDsl.g:998:4: ()
                    // InternalDsl.g:999:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1005:4: ( (lv_exp_11_0= ruleUnaryElement ) )
                    // InternalDsl.g:1006:5: (lv_exp_11_0= ruleUnaryElement )
                    {
                    // InternalDsl.g:1006:5: (lv_exp_11_0= ruleUnaryElement )
                    // InternalDsl.g:1007:6: lv_exp_11_0= ruleUnaryElement
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
    // InternalDsl.g:1029:1: entryRuleLBRACE returns [String current=null] : iv_ruleLBRACE= ruleLBRACE EOF ;
    public final String entryRuleLBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLBRACE = null;


        try {
            // InternalDsl.g:1029:46: (iv_ruleLBRACE= ruleLBRACE EOF )
            // InternalDsl.g:1030:2: iv_ruleLBRACE= ruleLBRACE EOF
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
    // InternalDsl.g:1036:1: ruleLBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1042:2: (kw= '{' )
            // InternalDsl.g:1043:2: kw= '{'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalDsl.g:1051:1: entryRuleRBRACE returns [String current=null] : iv_ruleRBRACE= ruleRBRACE EOF ;
    public final String entryRuleRBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBRACE = null;


        try {
            // InternalDsl.g:1051:46: (iv_ruleRBRACE= ruleRBRACE EOF )
            // InternalDsl.g:1052:2: iv_ruleRBRACE= ruleRBRACE EOF
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
    // InternalDsl.g:1058:1: ruleRBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1064:2: (kw= '}' )
            // InternalDsl.g:1065:2: kw= '}'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalDsl.g:1073:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalDsl.g:1073:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalDsl.g:1074:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalDsl.g:1080:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1086:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // InternalDsl.g:1087:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // InternalDsl.g:1087:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==34) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_INT)||(LA13_1>=14 && LA13_1<=31)||LA13_1==33) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1088:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1096:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalDsl.g:1096:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalDsl.g:1097:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_19); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,34,FOLLOW_20); 

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
    // InternalDsl.g:1121:1: entryRuleEXTENDED_STRING returns [String current=null] : iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF ;
    public final String entryRuleEXTENDED_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXTENDED_STRING = null;


        try {
            // InternalDsl.g:1121:55: (iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF )
            // InternalDsl.g:1122:2: iv_ruleEXTENDED_STRING= ruleEXTENDED_STRING EOF
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
    // InternalDsl.g:1128:1: ruleEXTENDED_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleEXTENDED_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1134:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? ) )
            // InternalDsl.g:1135:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? )
            {
            // InternalDsl.g:1135:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )? )
            // InternalDsl.g:1136:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '(' kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_0());
            		
            // InternalDsl.g:1143:3: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1144:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getEXTENDED_STRINGAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalDsl.g:1157:3: (kw= '(' kw= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==30) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1158:4: kw= '(' kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEXTENDED_STRINGAccess().getLeftParenthesisKeyword_2_0());
                    			
                    kw=(Token)match(input,30,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000A0004070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000A0008070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000A0000072L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A0000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000420000002L});

}