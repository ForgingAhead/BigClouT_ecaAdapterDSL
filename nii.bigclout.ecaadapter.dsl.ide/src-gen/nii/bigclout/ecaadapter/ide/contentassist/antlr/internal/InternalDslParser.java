package nii.bigclout.ecaadapter.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nii.bigclout.ecaadapter.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRunTimeModel"
    // InternalDsl.g:53:1: entryRuleRunTimeModel : ruleRunTimeModel EOF ;
    public final void entryRuleRunTimeModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleRunTimeModel EOF )
            // InternalDsl.g:55:1: ruleRunTimeModel EOF
            {
             before(grammarAccess.getRunTimeModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRunTimeModel();

            state._fsp--;

             after(grammarAccess.getRunTimeModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRunTimeModel"


    // $ANTLR start "ruleRunTimeModel"
    // InternalDsl.g:62:1: ruleRunTimeModel : ( ( rule__RunTimeModel__AppDataAssignment )* ) ;
    public final void ruleRunTimeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__RunTimeModel__AppDataAssignment )* ) )
            // InternalDsl.g:67:2: ( ( rule__RunTimeModel__AppDataAssignment )* )
            {
            // InternalDsl.g:67:2: ( ( rule__RunTimeModel__AppDataAssignment )* )
            // InternalDsl.g:68:3: ( rule__RunTimeModel__AppDataAssignment )*
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAssignment()); 
            // InternalDsl.g:69:3: ( rule__RunTimeModel__AppDataAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:69:4: rule__RunTimeModel__AppDataAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__RunTimeModel__AppDataAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRunTimeModelAccess().getAppDataAssignment()); 

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
    // $ANTLR end "ruleRunTimeModel"


    // $ANTLR start "entryRuleAppMetaData"
    // InternalDsl.g:78:1: entryRuleAppMetaData : ruleAppMetaData EOF ;
    public final void entryRuleAppMetaData() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleAppMetaData EOF )
            // InternalDsl.g:80:1: ruleAppMetaData EOF
            {
             before(grammarAccess.getAppMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleAppMetaData();

            state._fsp--;

             after(grammarAccess.getAppMetaDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppMetaData"


    // $ANTLR start "ruleAppMetaData"
    // InternalDsl.g:87:1: ruleAppMetaData : ( ( rule__AppMetaData__Group__0 ) ) ;
    public final void ruleAppMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__AppMetaData__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__AppMetaData__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__AppMetaData__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__AppMetaData__Group__0 )
            {
             before(grammarAccess.getAppMetaDataAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__AppMetaData__Group__0 )
            // InternalDsl.g:94:4: rule__AppMetaData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppMetaDataAccess().getGroup()); 

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
    // $ANTLR end "ruleAppMetaData"


    // $ANTLR start "entryRuleAppSpecification"
    // InternalDsl.g:103:1: entryRuleAppSpecification : ruleAppSpecification EOF ;
    public final void entryRuleAppSpecification() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleAppSpecification EOF )
            // InternalDsl.g:105:1: ruleAppSpecification EOF
            {
             before(grammarAccess.getAppSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleAppSpecification();

            state._fsp--;

             after(grammarAccess.getAppSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppSpecification"


    // $ANTLR start "ruleAppSpecification"
    // InternalDsl.g:112:1: ruleAppSpecification : ( ( rule__AppSpecification__Group__0 ) ) ;
    public final void ruleAppSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__AppSpecification__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__AppSpecification__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__AppSpecification__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__AppSpecification__Group__0 )
            {
             before(grammarAccess.getAppSpecificationAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__AppSpecification__Group__0 )
            // InternalDsl.g:119:4: rule__AppSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleAppSpecification"


    // $ANTLR start "entryRuleElement"
    // InternalDsl.g:128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleElement EOF )
            // InternalDsl.g:130:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDsl.g:137:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Element__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Element__Group__0 )
            // InternalDsl.g:144:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleConcept"
    // InternalDsl.g:153:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleConcept EOF )
            // InternalDsl.g:155:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalDsl.g:162:1: ruleConcept : ( ( rule__Concept__ReferenceNameAssignment ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Concept__ReferenceNameAssignment ) ) )
            // InternalDsl.g:167:2: ( ( rule__Concept__ReferenceNameAssignment ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Concept__ReferenceNameAssignment ) )
            // InternalDsl.g:168:3: ( rule__Concept__ReferenceNameAssignment )
            {
             before(grammarAccess.getConceptAccess().getReferenceNameAssignment()); 
            // InternalDsl.g:169:3: ( rule__Concept__ReferenceNameAssignment )
            // InternalDsl.g:169:4: rule__Concept__ReferenceNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Concept__ReferenceNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getReferenceNameAssignment()); 

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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "rule__AppMetaData__Group__0"
    // InternalDsl.g:177:1: rule__AppMetaData__Group__0 : rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 ;
    public final void rule__AppMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:181:1: ( rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 )
            // InternalDsl.g:182:2: rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AppMetaData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__1();

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
    // $ANTLR end "rule__AppMetaData__Group__0"


    // $ANTLR start "rule__AppMetaData__Group__0__Impl"
    // InternalDsl.g:189:1: rule__AppMetaData__Group__0__Impl : ( ( rule__AppMetaData__AppIDAssignment_0 ) ) ;
    public final void rule__AppMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:193:1: ( ( ( rule__AppMetaData__AppIDAssignment_0 ) ) )
            // InternalDsl.g:194:1: ( ( rule__AppMetaData__AppIDAssignment_0 ) )
            {
            // InternalDsl.g:194:1: ( ( rule__AppMetaData__AppIDAssignment_0 ) )
            // InternalDsl.g:195:2: ( rule__AppMetaData__AppIDAssignment_0 )
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_0()); 
            // InternalDsl.g:196:2: ( rule__AppMetaData__AppIDAssignment_0 )
            // InternalDsl.g:196:3: rule__AppMetaData__AppIDAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__AppIDAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_0()); 

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
    // $ANTLR end "rule__AppMetaData__Group__0__Impl"


    // $ANTLR start "rule__AppMetaData__Group__1"
    // InternalDsl.g:204:1: rule__AppMetaData__Group__1 : rule__AppMetaData__Group__1__Impl ;
    public final void rule__AppMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:208:1: ( rule__AppMetaData__Group__1__Impl )
            // InternalDsl.g:209:2: rule__AppMetaData__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__1__Impl();

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
    // $ANTLR end "rule__AppMetaData__Group__1"


    // $ANTLR start "rule__AppMetaData__Group__1__Impl"
    // InternalDsl.g:215:1: rule__AppMetaData__Group__1__Impl : ( ( rule__AppMetaData__SpecificationsAssignment_1 )* ) ;
    public final void rule__AppMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:219:1: ( ( ( rule__AppMetaData__SpecificationsAssignment_1 )* ) )
            // InternalDsl.g:220:1: ( ( rule__AppMetaData__SpecificationsAssignment_1 )* )
            {
            // InternalDsl.g:220:1: ( ( rule__AppMetaData__SpecificationsAssignment_1 )* )
            // InternalDsl.g:221:2: ( rule__AppMetaData__SpecificationsAssignment_1 )*
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_1()); 
            // InternalDsl.g:222:2: ( rule__AppMetaData__SpecificationsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:222:3: rule__AppMetaData__SpecificationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AppMetaData__SpecificationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_1()); 

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
    // $ANTLR end "rule__AppMetaData__Group__1__Impl"


    // $ANTLR start "rule__AppSpecification__Group__0"
    // InternalDsl.g:231:1: rule__AppSpecification__Group__0 : rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 ;
    public final void rule__AppSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:235:1: ( rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 )
            // InternalDsl.g:236:2: rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AppSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__1();

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
    // $ANTLR end "rule__AppSpecification__Group__0"


    // $ANTLR start "rule__AppSpecification__Group__0__Impl"
    // InternalDsl.g:243:1: rule__AppSpecification__Group__0__Impl : ( 'ON' ) ;
    public final void rule__AppSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:247:1: ( ( 'ON' ) )
            // InternalDsl.g:248:1: ( 'ON' )
            {
            // InternalDsl.g:248:1: ( 'ON' )
            // InternalDsl.g:249:2: 'ON'
            {
             before(grammarAccess.getAppSpecificationAccess().getONKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getONKeyword_0()); 

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
    // $ANTLR end "rule__AppSpecification__Group__0__Impl"


    // $ANTLR start "rule__AppSpecification__Group__1"
    // InternalDsl.g:258:1: rule__AppSpecification__Group__1 : rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 ;
    public final void rule__AppSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:262:1: ( rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 )
            // InternalDsl.g:263:2: rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AppSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__2();

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
    // $ANTLR end "rule__AppSpecification__Group__1"


    // $ANTLR start "rule__AppSpecification__Group__1__Impl"
    // InternalDsl.g:270:1: rule__AppSpecification__Group__1__Impl : ( ( rule__AppSpecification__TriggerAssignment_1 )* ) ;
    public final void rule__AppSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:274:1: ( ( ( rule__AppSpecification__TriggerAssignment_1 )* ) )
            // InternalDsl.g:275:1: ( ( rule__AppSpecification__TriggerAssignment_1 )* )
            {
            // InternalDsl.g:275:1: ( ( rule__AppSpecification__TriggerAssignment_1 )* )
            // InternalDsl.g:276:2: ( rule__AppSpecification__TriggerAssignment_1 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getTriggerAssignment_1()); 
            // InternalDsl.g:277:2: ( rule__AppSpecification__TriggerAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:277:3: rule__AppSpecification__TriggerAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AppSpecification__TriggerAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAppSpecificationAccess().getTriggerAssignment_1()); 

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
    // $ANTLR end "rule__AppSpecification__Group__1__Impl"


    // $ANTLR start "rule__AppSpecification__Group__2"
    // InternalDsl.g:285:1: rule__AppSpecification__Group__2 : rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 ;
    public final void rule__AppSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:289:1: ( rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 )
            // InternalDsl.g:290:2: rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__AppSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__3();

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
    // $ANTLR end "rule__AppSpecification__Group__2"


    // $ANTLR start "rule__AppSpecification__Group__2__Impl"
    // InternalDsl.g:297:1: rule__AppSpecification__Group__2__Impl : ( 'IF' ) ;
    public final void rule__AppSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:301:1: ( ( 'IF' ) )
            // InternalDsl.g:302:1: ( 'IF' )
            {
            // InternalDsl.g:302:1: ( 'IF' )
            // InternalDsl.g:303:2: 'IF'
            {
             before(grammarAccess.getAppSpecificationAccess().getIFKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getIFKeyword_2()); 

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
    // $ANTLR end "rule__AppSpecification__Group__2__Impl"


    // $ANTLR start "rule__AppSpecification__Group__3"
    // InternalDsl.g:312:1: rule__AppSpecification__Group__3 : rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 ;
    public final void rule__AppSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:1: ( rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 )
            // InternalDsl.g:317:2: rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__AppSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__4();

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
    // $ANTLR end "rule__AppSpecification__Group__3"


    // $ANTLR start "rule__AppSpecification__Group__3__Impl"
    // InternalDsl.g:324:1: rule__AppSpecification__Group__3__Impl : ( ( rule__AppSpecification__ConditionAssignment_3 )* ) ;
    public final void rule__AppSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:328:1: ( ( ( rule__AppSpecification__ConditionAssignment_3 )* ) )
            // InternalDsl.g:329:1: ( ( rule__AppSpecification__ConditionAssignment_3 )* )
            {
            // InternalDsl.g:329:1: ( ( rule__AppSpecification__ConditionAssignment_3 )* )
            // InternalDsl.g:330:2: ( rule__AppSpecification__ConditionAssignment_3 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getConditionAssignment_3()); 
            // InternalDsl.g:331:2: ( rule__AppSpecification__ConditionAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:331:3: rule__AppSpecification__ConditionAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AppSpecification__ConditionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAppSpecificationAccess().getConditionAssignment_3()); 

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
    // $ANTLR end "rule__AppSpecification__Group__3__Impl"


    // $ANTLR start "rule__AppSpecification__Group__4"
    // InternalDsl.g:339:1: rule__AppSpecification__Group__4 : rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 ;
    public final void rule__AppSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:343:1: ( rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 )
            // InternalDsl.g:344:2: rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AppSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__5();

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
    // $ANTLR end "rule__AppSpecification__Group__4"


    // $ANTLR start "rule__AppSpecification__Group__4__Impl"
    // InternalDsl.g:351:1: rule__AppSpecification__Group__4__Impl : ( 'DO' ) ;
    public final void rule__AppSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:355:1: ( ( 'DO' ) )
            // InternalDsl.g:356:1: ( 'DO' )
            {
            // InternalDsl.g:356:1: ( 'DO' )
            // InternalDsl.g:357:2: 'DO'
            {
             before(grammarAccess.getAppSpecificationAccess().getDOKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getDOKeyword_4()); 

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
    // $ANTLR end "rule__AppSpecification__Group__4__Impl"


    // $ANTLR start "rule__AppSpecification__Group__5"
    // InternalDsl.g:366:1: rule__AppSpecification__Group__5 : rule__AppSpecification__Group__5__Impl ;
    public final void rule__AppSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:370:1: ( rule__AppSpecification__Group__5__Impl )
            // InternalDsl.g:371:2: rule__AppSpecification__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__5__Impl();

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
    // $ANTLR end "rule__AppSpecification__Group__5"


    // $ANTLR start "rule__AppSpecification__Group__5__Impl"
    // InternalDsl.g:377:1: rule__AppSpecification__Group__5__Impl : ( ( rule__AppSpecification__ActionAssignment_5 ) ) ;
    public final void rule__AppSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:381:1: ( ( ( rule__AppSpecification__ActionAssignment_5 ) ) )
            // InternalDsl.g:382:1: ( ( rule__AppSpecification__ActionAssignment_5 ) )
            {
            // InternalDsl.g:382:1: ( ( rule__AppSpecification__ActionAssignment_5 ) )
            // InternalDsl.g:383:2: ( rule__AppSpecification__ActionAssignment_5 )
            {
             before(grammarAccess.getAppSpecificationAccess().getActionAssignment_5()); 
            // InternalDsl.g:384:2: ( rule__AppSpecification__ActionAssignment_5 )
            // InternalDsl.g:384:3: rule__AppSpecification__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAppSpecificationAccess().getActionAssignment_5()); 

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
    // $ANTLR end "rule__AppSpecification__Group__5__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalDsl.g:393:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:397:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalDsl.g:398:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalDsl.g:405:1: rule__Element__Group__0__Impl : ( ( rule__Element__MeaningAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:409:1: ( ( ( rule__Element__MeaningAssignment_0 ) ) )
            // InternalDsl.g:410:1: ( ( rule__Element__MeaningAssignment_0 ) )
            {
            // InternalDsl.g:410:1: ( ( rule__Element__MeaningAssignment_0 ) )
            // InternalDsl.g:411:2: ( rule__Element__MeaningAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getMeaningAssignment_0()); 
            // InternalDsl.g:412:2: ( rule__Element__MeaningAssignment_0 )
            // InternalDsl.g:412:3: rule__Element__MeaningAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__MeaningAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getMeaningAssignment_0()); 

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
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalDsl.g:420:1: rule__Element__Group__1 : rule__Element__Group__1__Impl ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:424:1: ( rule__Element__Group__1__Impl )
            // InternalDsl.g:425:2: rule__Element__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__1__Impl();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalDsl.g:431:1: rule__Element__Group__1__Impl : ( ( rule__Element__ConceptAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:435:1: ( ( ( rule__Element__ConceptAssignment_1 ) ) )
            // InternalDsl.g:436:1: ( ( rule__Element__ConceptAssignment_1 ) )
            {
            // InternalDsl.g:436:1: ( ( rule__Element__ConceptAssignment_1 ) )
            // InternalDsl.g:437:2: ( rule__Element__ConceptAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getConceptAssignment_1()); 
            // InternalDsl.g:438:2: ( rule__Element__ConceptAssignment_1 )
            // InternalDsl.g:438:3: rule__Element__ConceptAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__ConceptAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getConceptAssignment_1()); 

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
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__RunTimeModel__AppDataAssignment"
    // InternalDsl.g:447:1: rule__RunTimeModel__AppDataAssignment : ( ruleAppMetaData ) ;
    public final void rule__RunTimeModel__AppDataAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:451:1: ( ( ruleAppMetaData ) )
            // InternalDsl.g:452:2: ( ruleAppMetaData )
            {
            // InternalDsl.g:452:2: ( ruleAppMetaData )
            // InternalDsl.g:453:3: ruleAppMetaData
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAppMetaData();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_0()); 

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
    // $ANTLR end "rule__RunTimeModel__AppDataAssignment"


    // $ANTLR start "rule__AppMetaData__AppIDAssignment_0"
    // InternalDsl.g:462:1: rule__AppMetaData__AppIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__AppMetaData__AppIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:1: ( ( RULE_ID ) )
            // InternalDsl.g:467:2: ( RULE_ID )
            {
            // InternalDsl.g:467:2: ( RULE_ID )
            // InternalDsl.g:468:3: RULE_ID
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AppMetaData__AppIDAssignment_0"


    // $ANTLR start "rule__AppMetaData__SpecificationsAssignment_1"
    // InternalDsl.g:477:1: rule__AppMetaData__SpecificationsAssignment_1 : ( ruleAppSpecification ) ;
    public final void rule__AppMetaData__SpecificationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:481:1: ( ( ruleAppSpecification ) )
            // InternalDsl.g:482:2: ( ruleAppSpecification )
            {
            // InternalDsl.g:482:2: ( ruleAppSpecification )
            // InternalDsl.g:483:3: ruleAppSpecification
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAppSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAppSpecification();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getSpecificationsAppSpecificationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AppMetaData__SpecificationsAssignment_1"


    // $ANTLR start "rule__AppSpecification__TriggerAssignment_1"
    // InternalDsl.g:492:1: rule__AppSpecification__TriggerAssignment_1 : ( ruleElement ) ;
    public final void rule__AppSpecification__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:496:1: ( ( ruleElement ) )
            // InternalDsl.g:497:2: ( ruleElement )
            {
            // InternalDsl.g:497:2: ( ruleElement )
            // InternalDsl.g:498:3: ruleElement
            {
             before(grammarAccess.getAppSpecificationAccess().getTriggerElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getTriggerElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AppSpecification__TriggerAssignment_1"


    // $ANTLR start "rule__AppSpecification__ConditionAssignment_3"
    // InternalDsl.g:507:1: rule__AppSpecification__ConditionAssignment_3 : ( ruleElement ) ;
    public final void rule__AppSpecification__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:511:1: ( ( ruleElement ) )
            // InternalDsl.g:512:2: ( ruleElement )
            {
            // InternalDsl.g:512:2: ( ruleElement )
            // InternalDsl.g:513:3: ruleElement
            {
             before(grammarAccess.getAppSpecificationAccess().getConditionElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getConditionElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AppSpecification__ConditionAssignment_3"


    // $ANTLR start "rule__AppSpecification__ActionAssignment_5"
    // InternalDsl.g:522:1: rule__AppSpecification__ActionAssignment_5 : ( ruleElement ) ;
    public final void rule__AppSpecification__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:526:1: ( ( ruleElement ) )
            // InternalDsl.g:527:2: ( ruleElement )
            {
            // InternalDsl.g:527:2: ( ruleElement )
            // InternalDsl.g:528:3: ruleElement
            {
             before(grammarAccess.getAppSpecificationAccess().getActionElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getActionElementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__AppSpecification__ActionAssignment_5"


    // $ANTLR start "rule__Element__MeaningAssignment_0"
    // InternalDsl.g:537:1: rule__Element__MeaningAssignment_0 : ( RULE_ID ) ;
    public final void rule__Element__MeaningAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:1: ( ( RULE_ID ) )
            // InternalDsl.g:542:2: ( RULE_ID )
            {
            // InternalDsl.g:542:2: ( RULE_ID )
            // InternalDsl.g:543:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getMeaningIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getMeaningIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Element__MeaningAssignment_0"


    // $ANTLR start "rule__Element__ConceptAssignment_1"
    // InternalDsl.g:552:1: rule__Element__ConceptAssignment_1 : ( ruleConcept ) ;
    public final void rule__Element__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( ( ruleConcept ) )
            // InternalDsl.g:557:2: ( ruleConcept )
            {
            // InternalDsl.g:557:2: ( ruleConcept )
            // InternalDsl.g:558:3: ruleConcept
            {
             before(grammarAccess.getElementAccess().getConceptConceptParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getElementAccess().getConceptConceptParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Element__ConceptAssignment_1"


    // $ANTLR start "rule__Concept__ReferenceNameAssignment"
    // InternalDsl.g:567:1: rule__Concept__ReferenceNameAssignment : ( RULE_ID ) ;
    public final void rule__Concept__ReferenceNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:571:1: ( ( RULE_ID ) )
            // InternalDsl.g:572:2: ( RULE_ID )
            {
            // InternalDsl.g:572:2: ( RULE_ID )
            // InternalDsl.g:573:3: RULE_ID
            {
             before(grammarAccess.getConceptAccess().getReferenceNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getReferenceNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Concept__ReferenceNameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}