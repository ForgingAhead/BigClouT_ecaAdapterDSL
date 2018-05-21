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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ON'", "'IF'", "'DO'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

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

                if ( (LA1_0==RULE_ID) ) {
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
    // InternalDsl.g:107:1: ruleAppMetaData returns [EObject current=null] : ( ( (lv_appID_0_0= RULE_ID ) ) ( (lv_specifications_1_0= ruleAppSpecification ) )* ) ;
    public final EObject ruleAppMetaData() throws RecognitionException {
        EObject current = null;

        Token lv_appID_0_0=null;
        EObject lv_specifications_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( ( ( (lv_appID_0_0= RULE_ID ) ) ( (lv_specifications_1_0= ruleAppSpecification ) )* ) )
            // InternalDsl.g:114:2: ( ( (lv_appID_0_0= RULE_ID ) ) ( (lv_specifications_1_0= ruleAppSpecification ) )* )
            {
            // InternalDsl.g:114:2: ( ( (lv_appID_0_0= RULE_ID ) ) ( (lv_specifications_1_0= ruleAppSpecification ) )* )
            // InternalDsl.g:115:3: ( (lv_appID_0_0= RULE_ID ) ) ( (lv_specifications_1_0= ruleAppSpecification ) )*
            {
            // InternalDsl.g:115:3: ( (lv_appID_0_0= RULE_ID ) )
            // InternalDsl.g:116:4: (lv_appID_0_0= RULE_ID )
            {
            // InternalDsl.g:116:4: (lv_appID_0_0= RULE_ID )
            // InternalDsl.g:117:5: lv_appID_0_0= RULE_ID
            {
            lv_appID_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_appID_0_0, grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppMetaDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appID",
            						lv_appID_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:133:3: ( (lv_specifications_1_0= ruleAppSpecification ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:134:4: (lv_specifications_1_0= ruleAppSpecification )
            	    {
            	    // InternalDsl.g:134:4: (lv_specifications_1_0= ruleAppSpecification )
            	    // InternalDsl.g:135:5: lv_specifications_1_0= ruleAppSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getAppMetaDataAccess().getSpecificationsAppSpecificationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_specifications_1_0=ruleAppSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppMetaDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specifications",
            	    						lv_specifications_1_0,
            	    						"nii.bigclout.ecaadapter.Dsl.AppSpecification");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleAppMetaData"


    // $ANTLR start "entryRuleAppSpecification"
    // InternalDsl.g:156:1: entryRuleAppSpecification returns [EObject current=null] : iv_ruleAppSpecification= ruleAppSpecification EOF ;
    public final EObject entryRuleAppSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppSpecification = null;


        try {
            // InternalDsl.g:156:57: (iv_ruleAppSpecification= ruleAppSpecification EOF )
            // InternalDsl.g:157:2: iv_ruleAppSpecification= ruleAppSpecification EOF
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
    // InternalDsl.g:163:1: ruleAppSpecification returns [EObject current=null] : (otherlv_0= 'ON' ( (lv_trigger_1_0= ruleElement ) )* otherlv_2= 'IF' ( (lv_condition_3_0= ruleElement ) )* otherlv_4= 'DO' ( (lv_action_5_0= ruleElement ) ) ) ;
    public final EObject ruleAppSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:169:2: ( (otherlv_0= 'ON' ( (lv_trigger_1_0= ruleElement ) )* otherlv_2= 'IF' ( (lv_condition_3_0= ruleElement ) )* otherlv_4= 'DO' ( (lv_action_5_0= ruleElement ) ) ) )
            // InternalDsl.g:170:2: (otherlv_0= 'ON' ( (lv_trigger_1_0= ruleElement ) )* otherlv_2= 'IF' ( (lv_condition_3_0= ruleElement ) )* otherlv_4= 'DO' ( (lv_action_5_0= ruleElement ) ) )
            {
            // InternalDsl.g:170:2: (otherlv_0= 'ON' ( (lv_trigger_1_0= ruleElement ) )* otherlv_2= 'IF' ( (lv_condition_3_0= ruleElement ) )* otherlv_4= 'DO' ( (lv_action_5_0= ruleElement ) ) )
            // InternalDsl.g:171:3: otherlv_0= 'ON' ( (lv_trigger_1_0= ruleElement ) )* otherlv_2= 'IF' ( (lv_condition_3_0= ruleElement ) )* otherlv_4= 'DO' ( (lv_action_5_0= ruleElement ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAppSpecificationAccess().getONKeyword_0());
            		
            // InternalDsl.g:175:3: ( (lv_trigger_1_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:176:4: (lv_trigger_1_0= ruleElement )
            	    {
            	    // InternalDsl.g:176:4: (lv_trigger_1_0= ruleElement )
            	    // InternalDsl.g:177:5: lv_trigger_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getTriggerElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_trigger_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trigger",
            	    						lv_trigger_1_0,
            	    						"nii.bigclout.ecaadapter.Dsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAppSpecificationAccess().getIFKeyword_2());
            		
            // InternalDsl.g:198:3: ( (lv_condition_3_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:199:4: (lv_condition_3_0= ruleElement )
            	    {
            	    // InternalDsl.g:199:4: (lv_condition_3_0= ruleElement )
            	    // InternalDsl.g:200:5: lv_condition_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getAppSpecificationAccess().getConditionElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_condition_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_3_0,
            	    						"nii.bigclout.ecaadapter.Dsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAppSpecificationAccess().getDOKeyword_4());
            		
            // InternalDsl.g:221:3: ( (lv_action_5_0= ruleElement ) )
            // InternalDsl.g:222:4: (lv_action_5_0= ruleElement )
            {
            // InternalDsl.g:222:4: (lv_action_5_0= ruleElement )
            // InternalDsl.g:223:5: lv_action_5_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getAppSpecificationAccess().getActionElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_5_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppSpecificationRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_5_0,
            						"nii.bigclout.ecaadapter.Dsl.Element");
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
    // $ANTLR end "ruleAppSpecification"


    // $ANTLR start "entryRuleElement"
    // InternalDsl.g:244:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDsl.g:244:48: (iv_ruleElement= ruleElement EOF )
            // InternalDsl.g:245:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDsl.g:251:1: ruleElement returns [EObject current=null] : ( ( (lv_meaning_0_0= RULE_ID ) ) ( (lv_concept_1_0= ruleConcept ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_meaning_0_0=null;
        EObject lv_concept_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:257:2: ( ( ( (lv_meaning_0_0= RULE_ID ) ) ( (lv_concept_1_0= ruleConcept ) ) ) )
            // InternalDsl.g:258:2: ( ( (lv_meaning_0_0= RULE_ID ) ) ( (lv_concept_1_0= ruleConcept ) ) )
            {
            // InternalDsl.g:258:2: ( ( (lv_meaning_0_0= RULE_ID ) ) ( (lv_concept_1_0= ruleConcept ) ) )
            // InternalDsl.g:259:3: ( (lv_meaning_0_0= RULE_ID ) ) ( (lv_concept_1_0= ruleConcept ) )
            {
            // InternalDsl.g:259:3: ( (lv_meaning_0_0= RULE_ID ) )
            // InternalDsl.g:260:4: (lv_meaning_0_0= RULE_ID )
            {
            // InternalDsl.g:260:4: (lv_meaning_0_0= RULE_ID )
            // InternalDsl.g:261:5: lv_meaning_0_0= RULE_ID
            {
            lv_meaning_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_meaning_0_0, grammarAccess.getElementAccess().getMeaningIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"meaning",
            						lv_meaning_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:277:3: ( (lv_concept_1_0= ruleConcept ) )
            // InternalDsl.g:278:4: (lv_concept_1_0= ruleConcept )
            {
            // InternalDsl.g:278:4: (lv_concept_1_0= ruleConcept )
            // InternalDsl.g:279:5: lv_concept_1_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getElementAccess().getConceptConceptParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_concept_1_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"concept",
            						lv_concept_1_0,
            						"nii.bigclout.ecaadapter.Dsl.Concept");
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleConcept"
    // InternalDsl.g:300:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalDsl.g:300:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalDsl.g:301:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalDsl.g:307:1: ruleConcept returns [EObject current=null] : ( (lv_referenceName_0_0= RULE_ID ) ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token lv_referenceName_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:313:2: ( ( (lv_referenceName_0_0= RULE_ID ) ) )
            // InternalDsl.g:314:2: ( (lv_referenceName_0_0= RULE_ID ) )
            {
            // InternalDsl.g:314:2: ( (lv_referenceName_0_0= RULE_ID ) )
            // InternalDsl.g:315:3: (lv_referenceName_0_0= RULE_ID )
            {
            // InternalDsl.g:315:3: (lv_referenceName_0_0= RULE_ID )
            // InternalDsl.g:316:4: lv_referenceName_0_0= RULE_ID
            {
            lv_referenceName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_referenceName_0_0, grammarAccess.getConceptAccess().getReferenceNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConceptRule());
            				}
            				setWithLastConsumed(
            					current,
            					"referenceName",
            					lv_referenceName_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleConcept"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});

}