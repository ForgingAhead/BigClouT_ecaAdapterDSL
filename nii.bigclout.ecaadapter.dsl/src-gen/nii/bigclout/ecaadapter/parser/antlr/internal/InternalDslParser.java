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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AppMeta'", "'on'", "'if'", "'do'", "'or'", "'and'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'not'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=7;
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

                if ( (LA2_0==13) ) {
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
    // InternalDsl.g:181:1: ruleAppSpecification returns [EObject current=null] : (otherlv_0= 'on' ( (lv_trigger_1_0= ruleOrElement ) )* otherlv_2= 'if' ( (lv_condition_3_0= ruleOrElement ) )* otherlv_4= 'do' ( (otherlv_5= RULE_ID ) )+ ) ;
    public final EObject ruleAppSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:187:2: ( (otherlv_0= 'on' ( (lv_trigger_1_0= ruleOrElement ) )* otherlv_2= 'if' ( (lv_condition_3_0= ruleOrElement ) )* otherlv_4= 'do' ( (otherlv_5= RULE_ID ) )+ ) )
            // InternalDsl.g:188:2: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleOrElement ) )* otherlv_2= 'if' ( (lv_condition_3_0= ruleOrElement ) )* otherlv_4= 'do' ( (otherlv_5= RULE_ID ) )+ )
            {
            // InternalDsl.g:188:2: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleOrElement ) )* otherlv_2= 'if' ( (lv_condition_3_0= ruleOrElement ) )* otherlv_4= 'do' ( (otherlv_5= RULE_ID ) )+ )
            // InternalDsl.g:189:3: otherlv_0= 'on' ( (lv_trigger_1_0= ruleOrElement ) )* otherlv_2= 'if' ( (lv_condition_3_0= ruleOrElement ) )* otherlv_4= 'do' ( (otherlv_5= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAppSpecificationAccess().getOnKeyword_0());
            		
            // InternalDsl.g:193:3: ( (lv_trigger_1_0= ruleOrElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_INT)||LA3_0==29||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:194:4: (lv_trigger_1_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:194:4: (lv_trigger_1_0= ruleOrElement )
            	    // InternalDsl.g:195:5: lv_trigger_1_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getTriggerOrElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_trigger_1_0=ruleOrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trigger",
            	    						lv_trigger_1_0,
            	    						"nii.bigclout.ecaadapter.Dsl.OrElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAppSpecificationAccess().getIfKeyword_2());
            		
            // InternalDsl.g:216:3: ( (lv_condition_3_0= ruleOrElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_INT)||LA4_0==29||LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:217:4: (lv_condition_3_0= ruleOrElement )
            	    {
            	    // InternalDsl.g:217:4: (lv_condition_3_0= ruleOrElement )
            	    // InternalDsl.g:218:5: lv_condition_3_0= ruleOrElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getConditionOrElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_condition_3_0=ruleOrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_3_0,
            	    						"nii.bigclout.ecaadapter.Dsl.OrElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAppSpecificationAccess().getDoKeyword_4());
            		
            // InternalDsl.g:239:3: ( (otherlv_5= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:240:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalDsl.g:240:4: (otherlv_5= RULE_ID )
            	    // InternalDsl.g:241:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAppSpecificationRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_5, grammarAccess.getAppSpecificationAccess().getActionElementCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalDsl.g:256:1: entryRuleOrElement returns [EObject current=null] : iv_ruleOrElement= ruleOrElement EOF ;
    public final EObject entryRuleOrElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrElement = null;


        try {
            // InternalDsl.g:256:50: (iv_ruleOrElement= ruleOrElement EOF )
            // InternalDsl.g:257:2: iv_ruleOrElement= ruleOrElement EOF
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
    // InternalDsl.g:263:1: ruleOrElement returns [EObject current=null] : (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) ;
    public final EObject ruleOrElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:269:2: ( (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* ) )
            // InternalDsl.g:270:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            {
            // InternalDsl.g:270:2: (this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )* )
            // InternalDsl.g:271:3: this_AndElement_0= ruleAndElement (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_AndElement_0=ruleAndElement();

            state._fsp--;


            			current = this_AndElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:279:3: (otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:280:4: otherlv_1= 'or' () ( (lv_right_3_0= ruleAndElement ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrElementAccess().getOrKeyword_1_0());
            	    			
            	    // InternalDsl.g:284:4: ()
            	    // InternalDsl.g:285:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:291:4: ( (lv_right_3_0= ruleAndElement ) )
            	    // InternalDsl.g:292:5: (lv_right_3_0= ruleAndElement )
            	    {
            	    // InternalDsl.g:292:5: (lv_right_3_0= ruleAndElement )
            	    // InternalDsl.g:293:6: lv_right_3_0= ruleAndElement
            	    {

            	    						newCompositeNode(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // InternalDsl.g:315:1: entryRuleAndElement returns [EObject current=null] : iv_ruleAndElement= ruleAndElement EOF ;
    public final EObject entryRuleAndElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndElement = null;


        try {
            // InternalDsl.g:315:51: (iv_ruleAndElement= ruleAndElement EOF )
            // InternalDsl.g:316:2: iv_ruleAndElement= ruleAndElement EOF
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
    // InternalDsl.g:322:1: ruleAndElement returns [EObject current=null] : (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) ;
    public final EObject ruleAndElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DiffEqualElement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:328:2: ( (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* ) )
            // InternalDsl.g:329:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            {
            // InternalDsl.g:329:2: (this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )* )
            // InternalDsl.g:330:3: this_DiffEqualElement_0= ruleDiffEqualElement (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_DiffEqualElement_0=ruleDiffEqualElement();

            state._fsp--;


            			current = this_DiffEqualElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:338:3: (otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:339:4: otherlv_1= 'and' () ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndElementAccess().getAndKeyword_1_0());
            	    			
            	    // InternalDsl.g:343:4: ()
            	    // InternalDsl.g:344:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:350:4: ( (lv_right_3_0= ruleDiffEqualElement ) )
            	    // InternalDsl.g:351:5: (lv_right_3_0= ruleDiffEqualElement )
            	    {
            	    // InternalDsl.g:351:5: (lv_right_3_0= ruleDiffEqualElement )
            	    // InternalDsl.g:352:6: lv_right_3_0= ruleDiffEqualElement
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
    // InternalDsl.g:374:1: entryRuleDiffEqualElement returns [EObject current=null] : iv_ruleDiffEqualElement= ruleDiffEqualElement EOF ;
    public final EObject entryRuleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiffEqualElement = null;


        try {
            // InternalDsl.g:374:57: (iv_ruleDiffEqualElement= ruleDiffEqualElement EOF )
            // InternalDsl.g:375:2: iv_ruleDiffEqualElement= ruleDiffEqualElement EOF
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
    // InternalDsl.g:381:1: ruleDiffEqualElement returns [EObject current=null] : (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) ;
    public final EObject ruleDiffEqualElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_CompareElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:387:2: ( (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* ) )
            // InternalDsl.g:388:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            {
            // InternalDsl.g:388:2: (this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )* )
            // InternalDsl.g:389:3: this_CompareElement_0= ruleCompareElement ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_CompareElement_0=ruleCompareElement();

            state._fsp--;


            			current = this_CompareElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:397:3: ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) ) )*
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
            	    // InternalDsl.g:398:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:398:4: (otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:399:5: otherlv_1= '!=' () ( (lv_right_3_0= ruleCompareElement ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_11); 

            	    					newLeafNode(otherlv_1, grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:403:5: ()
            	    // InternalDsl.g:404:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:410:5: ( (lv_right_3_0= ruleCompareElement ) )
            	    // InternalDsl.g:411:6: (lv_right_3_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:411:6: (lv_right_3_0= ruleCompareElement )
            	    // InternalDsl.g:412:7: lv_right_3_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
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
            	    // InternalDsl.g:431:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    {
            	    // InternalDsl.g:431:4: (otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) ) )
            	    // InternalDsl.g:432:5: otherlv_4= '==' () ( (lv_right_6_0= ruleCompareElement ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_11); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:436:5: ()
            	    // InternalDsl.g:437:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:443:5: ( (lv_right_6_0= ruleCompareElement ) )
            	    // InternalDsl.g:444:6: (lv_right_6_0= ruleCompareElement )
            	    {
            	    // InternalDsl.g:444:6: (lv_right_6_0= ruleCompareElement )
            	    // InternalDsl.g:445:7: lv_right_6_0= ruleCompareElement
            	    {

            	    							newCompositeNode(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
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
    // InternalDsl.g:468:1: entryRuleCompareElement returns [EObject current=null] : iv_ruleCompareElement= ruleCompareElement EOF ;
    public final EObject entryRuleCompareElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareElement = null;


        try {
            // InternalDsl.g:468:55: (iv_ruleCompareElement= ruleCompareElement EOF )
            // InternalDsl.g:469:2: iv_ruleCompareElement= ruleCompareElement EOF
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
    // InternalDsl.g:475:1: ruleCompareElement returns [EObject current=null] : (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) ;
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
            // InternalDsl.g:481:2: ( (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* ) )
            // InternalDsl.g:482:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            {
            // InternalDsl.g:482:2: (this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )* )
            // InternalDsl.g:483:3: this_PlusMinusElement_0= rulePlusMinusElement ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_PlusMinusElement_0=rulePlusMinusElement();

            state._fsp--;


            			current = this_PlusMinusElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:491:3: ( (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) ) | (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) ) )*
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
            	    // InternalDsl.g:492:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:492:4: (otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:493:5: otherlv_1= '>' () ( (lv_right_3_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_11); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:497:5: ()
            	    // InternalDsl.g:498:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:504:5: ( (lv_right_3_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:505:6: (lv_right_3_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:505:6: (lv_right_3_0= rulePlusMinusElement )
            	    // InternalDsl.g:506:7: lv_right_3_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
            	    // InternalDsl.g:525:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:525:4: (otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:526:5: otherlv_4= '>=' () ( (lv_right_6_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_11); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:530:5: ()
            	    // InternalDsl.g:531:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:537:5: ( (lv_right_6_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:538:6: (lv_right_6_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:538:6: (lv_right_6_0= rulePlusMinusElement )
            	    // InternalDsl.g:539:7: lv_right_6_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
            	    // InternalDsl.g:558:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:558:4: (otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:559:5: otherlv_7= '<' () ( (lv_right_9_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_11); 

            	    					newLeafNode(otherlv_7, grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:563:5: ()
            	    // InternalDsl.g:564:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:570:5: ( (lv_right_9_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:571:6: (lv_right_9_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:571:6: (lv_right_9_0= rulePlusMinusElement )
            	    // InternalDsl.g:572:7: lv_right_9_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
            	    // InternalDsl.g:591:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    {
            	    // InternalDsl.g:591:4: (otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) ) )
            	    // InternalDsl.g:592:5: otherlv_10= '=<' () ( (lv_right_12_0= rulePlusMinusElement ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FOLLOW_11); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0());
            	    				
            	    // InternalDsl.g:596:5: ()
            	    // InternalDsl.g:597:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:603:5: ( (lv_right_12_0= rulePlusMinusElement ) )
            	    // InternalDsl.g:604:6: (lv_right_12_0= rulePlusMinusElement )
            	    {
            	    // InternalDsl.g:604:6: (lv_right_12_0= rulePlusMinusElement )
            	    // InternalDsl.g:605:7: lv_right_12_0= rulePlusMinusElement
            	    {

            	    							newCompositeNode(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
    // InternalDsl.g:628:1: entryRulePlusMinusElement returns [EObject current=null] : iv_rulePlusMinusElement= rulePlusMinusElement EOF ;
    public final EObject entryRulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusElement = null;


        try {
            // InternalDsl.g:628:57: (iv_rulePlusMinusElement= rulePlusMinusElement EOF )
            // InternalDsl.g:629:2: iv_rulePlusMinusElement= rulePlusMinusElement EOF
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
    // InternalDsl.g:635:1: rulePlusMinusElement returns [EObject current=null] : (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) ;
    public final EObject rulePlusMinusElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_MultiplicationDivisionElement_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:641:2: ( (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* ) )
            // InternalDsl.g:642:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            {
            // InternalDsl.g:642:2: (this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )* )
            // InternalDsl.g:643:3: this_MultiplicationDivisionElement_0= ruleMultiplicationDivisionElement ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_MultiplicationDivisionElement_0=ruleMultiplicationDivisionElement();

            state._fsp--;


            			current = this_MultiplicationDivisionElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:651:3: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) ) )*
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
            	    // InternalDsl.g:652:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:652:4: (otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:653:5: otherlv_1= '+' () ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_11); 

            	    					newLeafNode(otherlv_1, grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:657:5: ()
            	    // InternalDsl.g:658:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:664:5: ( (lv_right_3_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:665:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:665:6: (lv_right_3_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:666:7: lv_right_3_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    // InternalDsl.g:685:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    {
            	    // InternalDsl.g:685:4: (otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) ) )
            	    // InternalDsl.g:686:5: otherlv_4= '-' () ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:690:5: ()
            	    // InternalDsl.g:691:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:697:5: ( (lv_right_6_0= ruleMultiplicationDivisionElement ) )
            	    // InternalDsl.g:698:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    {
            	    // InternalDsl.g:698:6: (lv_right_6_0= ruleMultiplicationDivisionElement )
            	    // InternalDsl.g:699:7: lv_right_6_0= ruleMultiplicationDivisionElement
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
    // InternalDsl.g:722:1: entryRuleMultiplicationDivisionElement returns [EObject current=null] : iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF ;
    public final EObject entryRuleMultiplicationDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivisionElement = null;


        try {
            // InternalDsl.g:722:70: (iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:723:2: iv_ruleMultiplicationDivisionElement= ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:729:1: ruleMultiplicationDivisionElement returns [EObject current=null] : (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) ;
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
            // InternalDsl.g:735:2: ( (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* ) )
            // InternalDsl.g:736:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            {
            // InternalDsl.g:736:2: (this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )* )
            // InternalDsl.g:737:3: this_UnaryElement_0= ruleUnaryElement ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_UnaryElement_0=ruleUnaryElement();

            state._fsp--;


            			current = this_UnaryElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:745:3: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) ) )*
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
            	    // InternalDsl.g:746:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:746:4: (otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:747:5: otherlv_1= '*' () ( (lv_right_3_0= ruleUnaryElement ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_11); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0());
            	    				
            	    // InternalDsl.g:751:5: ()
            	    // InternalDsl.g:752:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:758:5: ( (lv_right_3_0= ruleUnaryElement ) )
            	    // InternalDsl.g:759:6: (lv_right_3_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:759:6: (lv_right_3_0= ruleUnaryElement )
            	    // InternalDsl.g:760:7: lv_right_3_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDsl.g:779:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:779:4: (otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:780:5: otherlv_4= '/' () ( (lv_right_6_0= ruleUnaryElement ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_11); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0());
            	    				
            	    // InternalDsl.g:784:5: ()
            	    // InternalDsl.g:785:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:791:5: ( (lv_right_6_0= ruleUnaryElement ) )
            	    // InternalDsl.g:792:6: (lv_right_6_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:792:6: (lv_right_6_0= ruleUnaryElement )
            	    // InternalDsl.g:793:7: lv_right_6_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDsl.g:812:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    {
            	    // InternalDsl.g:812:4: (otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) ) )
            	    // InternalDsl.g:813:5: otherlv_7= '%' () ( (lv_right_9_0= ruleUnaryElement ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_11); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0());
            	    				
            	    // InternalDsl.g:817:5: ()
            	    // InternalDsl.g:818:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1(),
            	    							current);
            	    					

            	    }

            	    // InternalDsl.g:824:5: ( (lv_right_9_0= ruleUnaryElement ) )
            	    // InternalDsl.g:825:6: (lv_right_9_0= ruleUnaryElement )
            	    {
            	    // InternalDsl.g:825:6: (lv_right_9_0= ruleUnaryElement )
            	    // InternalDsl.g:826:7: lv_right_9_0= ruleUnaryElement
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
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
    // InternalDsl.g:849:1: entryRuleUnaryElement returns [EObject current=null] : iv_ruleUnaryElement= ruleUnaryElement EOF ;
    public final EObject entryRuleUnaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryElement = null;


        try {
            // InternalDsl.g:849:53: (iv_ruleUnaryElement= ruleUnaryElement EOF )
            // InternalDsl.g:850:2: iv_ruleUnaryElement= ruleUnaryElement EOF
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
    // InternalDsl.g:856:1: ruleUnaryElement returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) ;
    public final EObject ruleUnaryElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject this_OrElement_7 = null;

        EObject lv_exp_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:862:2: ( ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) ) )
            // InternalDsl.g:863:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            {
            // InternalDsl.g:863:2: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' ) | (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
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
                    // InternalDsl.g:864:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    {
                    // InternalDsl.g:864:3: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    // InternalDsl.g:865:4: () ( (lv_value_1_0= ruleNUMBER ) )
                    {
                    // InternalDsl.g:865:4: ()
                    // InternalDsl.g:866:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:872:4: ( (lv_value_1_0= ruleNUMBER ) )
                    // InternalDsl.g:873:5: (lv_value_1_0= ruleNUMBER )
                    {
                    // InternalDsl.g:873:5: (lv_value_1_0= ruleNUMBER )
                    // InternalDsl.g:874:6: lv_value_1_0= ruleNUMBER
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
                    // InternalDsl.g:893:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalDsl.g:893:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalDsl.g:894:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalDsl.g:894:4: ()
                    // InternalDsl.g:895:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:901:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalDsl.g:902:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:902:5: (lv_value_3_0= RULE_STRING )
                    // InternalDsl.g:903:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getUnaryElementAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:921:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDsl.g:921:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalDsl.g:922:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalDsl.g:922:4: ()
                    // InternalDsl.g:923:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:929:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalDsl.g:930:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalDsl.g:930:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalDsl.g:931:6: lv_value_5_0= RULE_BOOLEAN
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
                    // InternalDsl.g:949:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    {
                    // InternalDsl.g:949:3: (otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')' )
                    // InternalDsl.g:950:4: otherlv_6= '(' this_OrElement_7= ruleOrElement otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_17);
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
                    // InternalDsl.g:968:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    {
                    // InternalDsl.g:968:3: (otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) ) )
                    // InternalDsl.g:969:4: otherlv_9= 'not' () ( (lv_exp_11_0= ruleUnaryElement ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnaryElementAccess().getNotKeyword_4_0());
                    			
                    // InternalDsl.g:973:4: ()
                    // InternalDsl.g:974:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:980:4: ( (lv_exp_11_0= ruleUnaryElement ) )
                    // InternalDsl.g:981:5: (lv_exp_11_0= ruleUnaryElement )
                    {
                    // InternalDsl.g:981:5: (lv_exp_11_0= ruleUnaryElement )
                    // InternalDsl.g:982:6: lv_exp_11_0= ruleUnaryElement
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
    // InternalDsl.g:1004:1: entryRuleLBRACE returns [String current=null] : iv_ruleLBRACE= ruleLBRACE EOF ;
    public final String entryRuleLBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLBRACE = null;


        try {
            // InternalDsl.g:1004:46: (iv_ruleLBRACE= ruleLBRACE EOF )
            // InternalDsl.g:1005:2: iv_ruleLBRACE= ruleLBRACE EOF
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
    // InternalDsl.g:1011:1: ruleLBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1017:2: (kw= '{' )
            // InternalDsl.g:1018:2: kw= '{'
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
    // InternalDsl.g:1026:1: entryRuleRBRACE returns [String current=null] : iv_ruleRBRACE= ruleRBRACE EOF ;
    public final String entryRuleRBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBRACE = null;


        try {
            // InternalDsl.g:1026:46: (iv_ruleRBRACE= ruleRBRACE EOF )
            // InternalDsl.g:1027:2: iv_ruleRBRACE= ruleRBRACE EOF
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
    // InternalDsl.g:1033:1: ruleRBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1039:2: (kw= '}' )
            // InternalDsl.g:1040:2: kw= '}'
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
    // InternalDsl.g:1048:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalDsl.g:1048:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalDsl.g:1049:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalDsl.g:1055:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1061:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // InternalDsl.g:1062:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // InternalDsl.g:1062:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==34) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||(LA13_1>=RULE_STRING && LA13_1<=RULE_INT)||(LA13_1>=14 && LA13_1<=31)) ) {
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
                    // InternalDsl.g:1063:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1071:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalDsl.g:1071:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalDsl.g:1072:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,34,FOLLOW_19); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000A00040E0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000A00080E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000A00000E0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});

}