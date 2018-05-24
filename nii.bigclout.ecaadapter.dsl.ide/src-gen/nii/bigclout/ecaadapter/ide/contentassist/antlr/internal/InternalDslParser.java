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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'AppMeta'", "'on'", "'if'", "'do'", "'or'", "'and'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'not'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

                if ( (LA1_0==14) ) {
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


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:128:1: entryRuleOrElement : ruleOrElement EOF ;
    public final void entryRuleOrElement() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleOrElement EOF )
            // InternalDsl.g:130:1: ruleOrElement EOF
            {
             before(grammarAccess.getOrElementRule()); 
            pushFollow(FOLLOW_1);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getOrElementRule()); 
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
    // $ANTLR end "entryRuleOrElement"


    // $ANTLR start "ruleOrElement"
    // InternalDsl.g:137:1: ruleOrElement : ( ( rule__OrElement__Group__0 ) ) ;
    public final void ruleOrElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__OrElement__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__OrElement__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__OrElement__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__OrElement__Group__0 )
            {
             before(grammarAccess.getOrElementAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__OrElement__Group__0 )
            // InternalDsl.g:144:4: rule__OrElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrElementAccess().getGroup()); 

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
    // $ANTLR end "ruleOrElement"


    // $ANTLR start "entryRuleAndElement"
    // InternalDsl.g:153:1: entryRuleAndElement : ruleAndElement EOF ;
    public final void entryRuleAndElement() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleAndElement EOF )
            // InternalDsl.g:155:1: ruleAndElement EOF
            {
             before(grammarAccess.getAndElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAndElement();

            state._fsp--;

             after(grammarAccess.getAndElementRule()); 
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
    // $ANTLR end "entryRuleAndElement"


    // $ANTLR start "ruleAndElement"
    // InternalDsl.g:162:1: ruleAndElement : ( ( rule__AndElement__Group__0 ) ) ;
    public final void ruleAndElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__AndElement__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__AndElement__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__AndElement__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__AndElement__Group__0 )
            {
             before(grammarAccess.getAndElementAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__AndElement__Group__0 )
            // InternalDsl.g:169:4: rule__AndElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndElementAccess().getGroup()); 

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
    // $ANTLR end "ruleAndElement"


    // $ANTLR start "entryRuleDiffEqualElement"
    // InternalDsl.g:178:1: entryRuleDiffEqualElement : ruleDiffEqualElement EOF ;
    public final void entryRuleDiffEqualElement() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleDiffEqualElement EOF )
            // InternalDsl.g:180:1: ruleDiffEqualElement EOF
            {
             before(grammarAccess.getDiffEqualElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDiffEqualElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementRule()); 
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
    // $ANTLR end "entryRuleDiffEqualElement"


    // $ANTLR start "ruleDiffEqualElement"
    // InternalDsl.g:187:1: ruleDiffEqualElement : ( ( rule__DiffEqualElement__Group__0 ) ) ;
    public final void ruleDiffEqualElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__DiffEqualElement__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__DiffEqualElement__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__DiffEqualElement__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__DiffEqualElement__Group__0 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__DiffEqualElement__Group__0 )
            // InternalDsl.g:194:4: rule__DiffEqualElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiffEqualElementAccess().getGroup()); 

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
    // $ANTLR end "ruleDiffEqualElement"


    // $ANTLR start "entryRuleCompareElement"
    // InternalDsl.g:203:1: entryRuleCompareElement : ruleCompareElement EOF ;
    public final void entryRuleCompareElement() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleCompareElement EOF )
            // InternalDsl.g:205:1: ruleCompareElement EOF
            {
             before(grammarAccess.getCompareElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getCompareElementRule()); 
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
    // $ANTLR end "entryRuleCompareElement"


    // $ANTLR start "ruleCompareElement"
    // InternalDsl.g:212:1: ruleCompareElement : ( ( rule__CompareElement__Group__0 ) ) ;
    public final void ruleCompareElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__CompareElement__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__CompareElement__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__CompareElement__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__CompareElement__Group__0 )
            {
             before(grammarAccess.getCompareElementAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__CompareElement__Group__0 )
            // InternalDsl.g:219:4: rule__CompareElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getGroup()); 

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
    // $ANTLR end "ruleCompareElement"


    // $ANTLR start "entryRulePlusMinusElement"
    // InternalDsl.g:228:1: entryRulePlusMinusElement : rulePlusMinusElement EOF ;
    public final void entryRulePlusMinusElement() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( rulePlusMinusElement EOF )
            // InternalDsl.g:230:1: rulePlusMinusElement EOF
            {
             before(grammarAccess.getPlusMinusElementRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementRule()); 
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
    // $ANTLR end "entryRulePlusMinusElement"


    // $ANTLR start "rulePlusMinusElement"
    // InternalDsl.g:237:1: rulePlusMinusElement : ( ( rule__PlusMinusElement__Group__0 ) ) ;
    public final void rulePlusMinusElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__PlusMinusElement__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__PlusMinusElement__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__PlusMinusElement__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__PlusMinusElement__Group__0 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__PlusMinusElement__Group__0 )
            // InternalDsl.g:244:4: rule__PlusMinusElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusElementAccess().getGroup()); 

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
    // $ANTLR end "rulePlusMinusElement"


    // $ANTLR start "entryRuleMultiplicationDivisionElement"
    // InternalDsl.g:253:1: entryRuleMultiplicationDivisionElement : ruleMultiplicationDivisionElement EOF ;
    public final void entryRuleMultiplicationDivisionElement() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:255:1: ruleMultiplicationDivisionElement EOF
            {
             before(grammarAccess.getMultiplicationDivisionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementRule()); 
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
    // $ANTLR end "entryRuleMultiplicationDivisionElement"


    // $ANTLR start "ruleMultiplicationDivisionElement"
    // InternalDsl.g:262:1: ruleMultiplicationDivisionElement : ( ( rule__MultiplicationDivisionElement__Group__0 ) ) ;
    public final void ruleMultiplicationDivisionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__MultiplicationDivisionElement__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__MultiplicationDivisionElement__Group__0 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__MultiplicationDivisionElement__Group__0 )
            // InternalDsl.g:269:4: rule__MultiplicationDivisionElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicationDivisionElement"


    // $ANTLR start "entryRuleUnaryElement"
    // InternalDsl.g:278:1: entryRuleUnaryElement : ruleUnaryElement EOF ;
    public final void entryRuleUnaryElement() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleUnaryElement EOF )
            // InternalDsl.g:280:1: ruleUnaryElement EOF
            {
             before(grammarAccess.getUnaryElementRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getUnaryElementRule()); 
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
    // $ANTLR end "entryRuleUnaryElement"


    // $ANTLR start "ruleUnaryElement"
    // InternalDsl.g:287:1: ruleUnaryElement : ( ( rule__UnaryElement__Alternatives ) ) ;
    public final void ruleUnaryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__UnaryElement__Alternatives ) ) )
            // InternalDsl.g:292:2: ( ( rule__UnaryElement__Alternatives ) )
            {
            // InternalDsl.g:292:2: ( ( rule__UnaryElement__Alternatives ) )
            // InternalDsl.g:293:3: ( rule__UnaryElement__Alternatives )
            {
             before(grammarAccess.getUnaryElementAccess().getAlternatives()); 
            // InternalDsl.g:294:3: ( rule__UnaryElement__Alternatives )
            // InternalDsl.g:294:4: rule__UnaryElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnaryElement"


    // $ANTLR start "entryRuleLBRACE"
    // InternalDsl.g:303:1: entryRuleLBRACE : ruleLBRACE EOF ;
    public final void entryRuleLBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleLBRACE EOF )
            // InternalDsl.g:305:1: ruleLBRACE EOF
            {
             before(grammarAccess.getLBRACERule()); 
            pushFollow(FOLLOW_1);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getLBRACERule()); 
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
    // $ANTLR end "entryRuleLBRACE"


    // $ANTLR start "ruleLBRACE"
    // InternalDsl.g:312:1: ruleLBRACE : ( '{' ) ;
    public final void ruleLBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( '{' ) )
            // InternalDsl.g:317:2: ( '{' )
            {
            // InternalDsl.g:317:2: ( '{' )
            // InternalDsl.g:318:3: '{'
            {
             before(grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword()); 

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
    // $ANTLR end "ruleLBRACE"


    // $ANTLR start "entryRuleRBRACE"
    // InternalDsl.g:328:1: entryRuleRBRACE : ruleRBRACE EOF ;
    public final void entryRuleRBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleRBRACE EOF )
            // InternalDsl.g:330:1: ruleRBRACE EOF
            {
             before(grammarAccess.getRBRACERule()); 
            pushFollow(FOLLOW_1);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getRBRACERule()); 
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
    // $ANTLR end "entryRuleRBRACE"


    // $ANTLR start "ruleRBRACE"
    // InternalDsl.g:337:1: ruleRBRACE : ( '}' ) ;
    public final void ruleRBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( '}' ) )
            // InternalDsl.g:342:2: ( '}' )
            {
            // InternalDsl.g:342:2: ( '}' )
            // InternalDsl.g:343:3: '}'
            {
             before(grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword()); 

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
    // $ANTLR end "ruleRBRACE"


    // $ANTLR start "entryRuleNUMBER"
    // InternalDsl.g:353:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleNUMBER EOF )
            // InternalDsl.g:355:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalDsl.g:362:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalDsl.g:367:2: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalDsl.g:367:2: ( ( rule__NUMBER__Alternatives ) )
            // InternalDsl.g:368:3: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // InternalDsl.g:369:3: ( rule__NUMBER__Alternatives )
            // InternalDsl.g:369:4: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleEXTENDED_STRING"
    // InternalDsl.g:378:1: entryRuleEXTENDED_STRING : ruleEXTENDED_STRING EOF ;
    public final void entryRuleEXTENDED_STRING() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleEXTENDED_STRING EOF )
            // InternalDsl.g:380:1: ruleEXTENDED_STRING EOF
            {
             before(grammarAccess.getEXTENDED_STRINGRule()); 
            pushFollow(FOLLOW_1);
            ruleEXTENDED_STRING();

            state._fsp--;

             after(grammarAccess.getEXTENDED_STRINGRule()); 
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
    // $ANTLR end "entryRuleEXTENDED_STRING"


    // $ANTLR start "ruleEXTENDED_STRING"
    // InternalDsl.g:387:1: ruleEXTENDED_STRING : ( ( rule__EXTENDED_STRING__Group__0 ) ) ;
    public final void ruleEXTENDED_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__EXTENDED_STRING__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__EXTENDED_STRING__Group__0 )
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__EXTENDED_STRING__Group__0 )
            // InternalDsl.g:394:4: rule__EXTENDED_STRING__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEXTENDED_STRINGAccess().getGroup()); 

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
    // $ANTLR end "ruleEXTENDED_STRING"


    // $ANTLR start "rule__DiffEqualElement__Alternatives_1"
    // InternalDsl.g:402:1: rule__DiffEqualElement__Alternatives_1 : ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) );
    public final void rule__DiffEqualElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:406:1: ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:407:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:407:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    // InternalDsl.g:408:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:409:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    // InternalDsl.g:409:4: rule__DiffEqualElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiffEqualElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:413:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:413:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    // InternalDsl.g:414:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:415:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    // InternalDsl.g:415:4: rule__DiffEqualElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiffEqualElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__DiffEqualElement__Alternatives_1"


    // $ANTLR start "rule__CompareElement__Alternatives_1"
    // InternalDsl.g:423:1: rule__CompareElement__Alternatives_1 : ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) );
    public final void rule__CompareElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:427:1: ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:428:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:428:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    // InternalDsl.g:429:3: ( rule__CompareElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:430:3: ( rule__CompareElement__Group_1_0__0 )
                    // InternalDsl.g:430:4: rule__CompareElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:434:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:434:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    // InternalDsl.g:435:3: ( rule__CompareElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:436:3: ( rule__CompareElement__Group_1_1__0 )
                    // InternalDsl.g:436:4: rule__CompareElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:440:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:440:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    // InternalDsl.g:441:3: ( rule__CompareElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:442:3: ( rule__CompareElement__Group_1_2__0 )
                    // InternalDsl.g:442:4: rule__CompareElement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:446:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    {
                    // InternalDsl.g:446:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    // InternalDsl.g:447:3: ( rule__CompareElement__Group_1_3__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_3()); 
                    // InternalDsl.g:448:3: ( rule__CompareElement__Group_1_3__0 )
                    // InternalDsl.g:448:4: rule__CompareElement__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__CompareElement__Alternatives_1"


    // $ANTLR start "rule__PlusMinusElement__Alternatives_1"
    // InternalDsl.g:456:1: rule__PlusMinusElement__Alternatives_1 : ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) );
    public final void rule__PlusMinusElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:460:1: ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:461:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:461:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    // InternalDsl.g:462:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:463:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    // InternalDsl.g:463:4: rule__PlusMinusElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinusElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:467:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:467:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    // InternalDsl.g:468:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:469:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    // InternalDsl.g:469:4: rule__PlusMinusElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinusElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PlusMinusElement__Alternatives_1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Alternatives_1"
    // InternalDsl.g:477:1: rule__MultiplicationDivisionElement__Alternatives_1 : ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) );
    public final void rule__MultiplicationDivisionElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:481:1: ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:482:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:482:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    // InternalDsl.g:483:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:484:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    // InternalDsl.g:484:4: rule__MultiplicationDivisionElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationDivisionElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:488:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:488:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    // InternalDsl.g:489:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:490:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    // InternalDsl.g:490:4: rule__MultiplicationDivisionElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationDivisionElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:494:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:494:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    // InternalDsl.g:495:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:496:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    // InternalDsl.g:496:4: rule__MultiplicationDivisionElement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationDivisionElement__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Alternatives_1"


    // $ANTLR start "rule__UnaryElement__Alternatives"
    // InternalDsl.g:504:1: rule__UnaryElement__Alternatives : ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) );
    public final void rule__UnaryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:508:1: ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            case 33:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:509:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    {
                    // InternalDsl.g:509:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    // InternalDsl.g:510:3: ( rule__UnaryElement__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_0()); 
                    // InternalDsl.g:511:3: ( rule__UnaryElement__Group_0__0 )
                    // InternalDsl.g:511:4: rule__UnaryElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:515:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    {
                    // InternalDsl.g:515:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    // InternalDsl.g:516:3: ( rule__UnaryElement__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_1()); 
                    // InternalDsl.g:517:3: ( rule__UnaryElement__Group_1__0 )
                    // InternalDsl.g:517:4: rule__UnaryElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:521:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    {
                    // InternalDsl.g:521:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    // InternalDsl.g:522:3: ( rule__UnaryElement__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_2()); 
                    // InternalDsl.g:523:3: ( rule__UnaryElement__Group_2__0 )
                    // InternalDsl.g:523:4: rule__UnaryElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:527:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    {
                    // InternalDsl.g:527:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    // InternalDsl.g:528:3: ( rule__UnaryElement__Group_3__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_3()); 
                    // InternalDsl.g:529:3: ( rule__UnaryElement__Group_3__0 )
                    // InternalDsl.g:529:4: rule__UnaryElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:533:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    {
                    // InternalDsl.g:533:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    // InternalDsl.g:534:3: ( rule__UnaryElement__Group_4__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_4()); 
                    // InternalDsl.g:535:3: ( rule__UnaryElement__Group_4__0 )
                    // InternalDsl.g:535:4: rule__UnaryElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__UnaryElement__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives"
    // InternalDsl.g:543:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:547:1: ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==34) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||(LA7_1>=RULE_INT && LA7_1<=RULE_BOOLEAN)||LA7_1==13||(LA7_1>=16 && LA7_1<=33)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:548:2: ( RULE_INT )
                    {
                    // InternalDsl.g:548:2: ( RULE_INT )
                    // InternalDsl.g:549:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:554:2: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // InternalDsl.g:554:2: ( ( rule__NUMBER__Group_1__0 ) )
                    // InternalDsl.g:555:3: ( rule__NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    // InternalDsl.g:556:3: ( rule__NUMBER__Group_1__0 )
                    // InternalDsl.g:556:4: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNUMBERAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__AppMetaData__Group__0"
    // InternalDsl.g:564:1: rule__AppMetaData__Group__0 : rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 ;
    public final void rule__AppMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:568:1: ( rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 )
            // InternalDsl.g:569:2: rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1
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
    // InternalDsl.g:576:1: rule__AppMetaData__Group__0__Impl : ( 'AppMeta' ) ;
    public final void rule__AppMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:580:1: ( ( 'AppMeta' ) )
            // InternalDsl.g:581:1: ( 'AppMeta' )
            {
            // InternalDsl.g:581:1: ( 'AppMeta' )
            // InternalDsl.g:582:2: 'AppMeta'
            {
             before(grammarAccess.getAppMetaDataAccess().getAppMetaKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAppMetaDataAccess().getAppMetaKeyword_0()); 

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
    // InternalDsl.g:591:1: rule__AppMetaData__Group__1 : rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 ;
    public final void rule__AppMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:595:1: ( rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 )
            // InternalDsl.g:596:2: rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AppMetaData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__2();

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
    // InternalDsl.g:603:1: rule__AppMetaData__Group__1__Impl : ( ( rule__AppMetaData__AppIDAssignment_1 ) ) ;
    public final void rule__AppMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:607:1: ( ( ( rule__AppMetaData__AppIDAssignment_1 ) ) )
            // InternalDsl.g:608:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            {
            // InternalDsl.g:608:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            // InternalDsl.g:609:2: ( rule__AppMetaData__AppIDAssignment_1 )
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 
            // InternalDsl.g:610:2: ( rule__AppMetaData__AppIDAssignment_1 )
            // InternalDsl.g:610:3: rule__AppMetaData__AppIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__AppIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 

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


    // $ANTLR start "rule__AppMetaData__Group__2"
    // InternalDsl.g:618:1: rule__AppMetaData__Group__2 : rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 ;
    public final void rule__AppMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 )
            // InternalDsl.g:623:2: rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AppMetaData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__3();

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
    // $ANTLR end "rule__AppMetaData__Group__2"


    // $ANTLR start "rule__AppMetaData__Group__2__Impl"
    // InternalDsl.g:630:1: rule__AppMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__AppMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:634:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:635:1: ( ruleLBRACE )
            {
            // InternalDsl.g:635:1: ( ruleLBRACE )
            // InternalDsl.g:636:2: ruleLBRACE
            {
             before(grammarAccess.getAppMetaDataAccess().getLBRACEParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getLBRACEParserRuleCall_2()); 

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
    // $ANTLR end "rule__AppMetaData__Group__2__Impl"


    // $ANTLR start "rule__AppMetaData__Group__3"
    // InternalDsl.g:645:1: rule__AppMetaData__Group__3 : rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 ;
    public final void rule__AppMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:649:1: ( rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 )
            // InternalDsl.g:650:2: rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AppMetaData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__4();

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
    // $ANTLR end "rule__AppMetaData__Group__3"


    // $ANTLR start "rule__AppMetaData__Group__3__Impl"
    // InternalDsl.g:657:1: rule__AppMetaData__Group__3__Impl : ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) ;
    public final void rule__AppMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:661:1: ( ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) )
            // InternalDsl.g:662:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            {
            // InternalDsl.g:662:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            // InternalDsl.g:663:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_3()); 
            // InternalDsl.g:664:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:664:3: rule__AppMetaData__SpecificationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AppMetaData__SpecificationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_3()); 

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
    // $ANTLR end "rule__AppMetaData__Group__3__Impl"


    // $ANTLR start "rule__AppMetaData__Group__4"
    // InternalDsl.g:672:1: rule__AppMetaData__Group__4 : rule__AppMetaData__Group__4__Impl ;
    public final void rule__AppMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:676:1: ( rule__AppMetaData__Group__4__Impl )
            // InternalDsl.g:677:2: rule__AppMetaData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__4__Impl();

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
    // $ANTLR end "rule__AppMetaData__Group__4"


    // $ANTLR start "rule__AppMetaData__Group__4__Impl"
    // InternalDsl.g:683:1: rule__AppMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__AppMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:687:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:688:1: ( ruleRBRACE )
            {
            // InternalDsl.g:688:1: ( ruleRBRACE )
            // InternalDsl.g:689:2: ruleRBRACE
            {
             before(grammarAccess.getAppMetaDataAccess().getRBRACEParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getRBRACEParserRuleCall_4()); 

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
    // $ANTLR end "rule__AppMetaData__Group__4__Impl"


    // $ANTLR start "rule__AppSpecification__Group__0"
    // InternalDsl.g:699:1: rule__AppSpecification__Group__0 : rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 ;
    public final void rule__AppSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:703:1: ( rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 )
            // InternalDsl.g:704:2: rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:711:1: rule__AppSpecification__Group__0__Impl : ( ( rule__AppSpecification__SpecIDAssignment_0 ) ) ;
    public final void rule__AppSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:715:1: ( ( ( rule__AppSpecification__SpecIDAssignment_0 ) ) )
            // InternalDsl.g:716:1: ( ( rule__AppSpecification__SpecIDAssignment_0 ) )
            {
            // InternalDsl.g:716:1: ( ( rule__AppSpecification__SpecIDAssignment_0 ) )
            // InternalDsl.g:717:2: ( rule__AppSpecification__SpecIDAssignment_0 )
            {
             before(grammarAccess.getAppSpecificationAccess().getSpecIDAssignment_0()); 
            // InternalDsl.g:718:2: ( rule__AppSpecification__SpecIDAssignment_0 )
            // InternalDsl.g:718:3: rule__AppSpecification__SpecIDAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__SpecIDAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAppSpecificationAccess().getSpecIDAssignment_0()); 

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
    // InternalDsl.g:726:1: rule__AppSpecification__Group__1 : rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 ;
    public final void rule__AppSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 )
            // InternalDsl.g:731:2: rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:738:1: rule__AppSpecification__Group__1__Impl : ( 'on' ) ;
    public final void rule__AppSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:742:1: ( ( 'on' ) )
            // InternalDsl.g:743:1: ( 'on' )
            {
            // InternalDsl.g:743:1: ( 'on' )
            // InternalDsl.g:744:2: 'on'
            {
             before(grammarAccess.getAppSpecificationAccess().getOnKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getOnKeyword_1()); 

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
    // InternalDsl.g:753:1: rule__AppSpecification__Group__2 : rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 ;
    public final void rule__AppSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:757:1: ( rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 )
            // InternalDsl.g:758:2: rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:765:1: rule__AppSpecification__Group__2__Impl : ( ( rule__AppSpecification__TriggerAssignment_2 )* ) ;
    public final void rule__AppSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:769:1: ( ( ( rule__AppSpecification__TriggerAssignment_2 )* ) )
            // InternalDsl.g:770:1: ( ( rule__AppSpecification__TriggerAssignment_2 )* )
            {
            // InternalDsl.g:770:1: ( ( rule__AppSpecification__TriggerAssignment_2 )* )
            // InternalDsl.g:771:2: ( rule__AppSpecification__TriggerAssignment_2 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getTriggerAssignment_2()); 
            // InternalDsl.g:772:2: ( rule__AppSpecification__TriggerAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_BOOLEAN)||LA9_0==31||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:772:3: rule__AppSpecification__TriggerAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AppSpecification__TriggerAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAppSpecificationAccess().getTriggerAssignment_2()); 

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
    // InternalDsl.g:780:1: rule__AppSpecification__Group__3 : rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 ;
    public final void rule__AppSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 )
            // InternalDsl.g:785:2: rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:792:1: rule__AppSpecification__Group__3__Impl : ( 'if' ) ;
    public final void rule__AppSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:796:1: ( ( 'if' ) )
            // InternalDsl.g:797:1: ( 'if' )
            {
            // InternalDsl.g:797:1: ( 'if' )
            // InternalDsl.g:798:2: 'if'
            {
             before(grammarAccess.getAppSpecificationAccess().getIfKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getIfKeyword_3()); 

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
    // InternalDsl.g:807:1: rule__AppSpecification__Group__4 : rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 ;
    public final void rule__AppSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:811:1: ( rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 )
            // InternalDsl.g:812:2: rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:819:1: rule__AppSpecification__Group__4__Impl : ( ( rule__AppSpecification__ConditionAssignment_4 )* ) ;
    public final void rule__AppSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:823:1: ( ( ( rule__AppSpecification__ConditionAssignment_4 )* ) )
            // InternalDsl.g:824:1: ( ( rule__AppSpecification__ConditionAssignment_4 )* )
            {
            // InternalDsl.g:824:1: ( ( rule__AppSpecification__ConditionAssignment_4 )* )
            // InternalDsl.g:825:2: ( rule__AppSpecification__ConditionAssignment_4 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getConditionAssignment_4()); 
            // InternalDsl.g:826:2: ( rule__AppSpecification__ConditionAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOLEAN)||LA10_0==31||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:826:3: rule__AppSpecification__ConditionAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AppSpecification__ConditionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAppSpecificationAccess().getConditionAssignment_4()); 

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
    // InternalDsl.g:834:1: rule__AppSpecification__Group__5 : rule__AppSpecification__Group__5__Impl rule__AppSpecification__Group__6 ;
    public final void rule__AppSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( rule__AppSpecification__Group__5__Impl rule__AppSpecification__Group__6 )
            // InternalDsl.g:839:2: rule__AppSpecification__Group__5__Impl rule__AppSpecification__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__AppSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__6();

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
    // InternalDsl.g:846:1: rule__AppSpecification__Group__5__Impl : ( 'do' ) ;
    public final void rule__AppSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:850:1: ( ( 'do' ) )
            // InternalDsl.g:851:1: ( 'do' )
            {
            // InternalDsl.g:851:1: ( 'do' )
            // InternalDsl.g:852:2: 'do'
            {
             before(grammarAccess.getAppSpecificationAccess().getDoKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getDoKeyword_5()); 

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


    // $ANTLR start "rule__AppSpecification__Group__6"
    // InternalDsl.g:861:1: rule__AppSpecification__Group__6 : rule__AppSpecification__Group__6__Impl ;
    public final void rule__AppSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:865:1: ( rule__AppSpecification__Group__6__Impl )
            // InternalDsl.g:866:2: rule__AppSpecification__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__6__Impl();

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
    // $ANTLR end "rule__AppSpecification__Group__6"


    // $ANTLR start "rule__AppSpecification__Group__6__Impl"
    // InternalDsl.g:872:1: rule__AppSpecification__Group__6__Impl : ( ( rule__AppSpecification__ActionAssignment_6 )* ) ;
    public final void rule__AppSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:876:1: ( ( ( rule__AppSpecification__ActionAssignment_6 )* ) )
            // InternalDsl.g:877:1: ( ( rule__AppSpecification__ActionAssignment_6 )* )
            {
            // InternalDsl.g:877:1: ( ( rule__AppSpecification__ActionAssignment_6 )* )
            // InternalDsl.g:878:2: ( rule__AppSpecification__ActionAssignment_6 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getActionAssignment_6()); 
            // InternalDsl.g:879:2: ( rule__AppSpecification__ActionAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==EOF||(LA11_2>=RULE_INT && LA11_2<=RULE_BOOLEAN)||LA11_2==13||(LA11_2>=19 && LA11_2<=31)||(LA11_2>=33 && LA11_2<=34)) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_INT||LA11_0==RULE_BOOLEAN||LA11_0==31||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:879:3: rule__AppSpecification__ActionAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AppSpecification__ActionAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAppSpecificationAccess().getActionAssignment_6()); 

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
    // $ANTLR end "rule__AppSpecification__Group__6__Impl"


    // $ANTLR start "rule__OrElement__Group__0"
    // InternalDsl.g:888:1: rule__OrElement__Group__0 : rule__OrElement__Group__0__Impl rule__OrElement__Group__1 ;
    public final void rule__OrElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( rule__OrElement__Group__0__Impl rule__OrElement__Group__1 )
            // InternalDsl.g:893:2: rule__OrElement__Group__0__Impl rule__OrElement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OrElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrElement__Group__1();

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
    // $ANTLR end "rule__OrElement__Group__0"


    // $ANTLR start "rule__OrElement__Group__0__Impl"
    // InternalDsl.g:900:1: rule__OrElement__Group__0__Impl : ( ruleAndElement ) ;
    public final void rule__OrElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:904:1: ( ( ruleAndElement ) )
            // InternalDsl.g:905:1: ( ruleAndElement )
            {
            // InternalDsl.g:905:1: ( ruleAndElement )
            // InternalDsl.g:906:2: ruleAndElement
            {
             before(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndElement();

            state._fsp--;

             after(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrElement__Group__0__Impl"


    // $ANTLR start "rule__OrElement__Group__1"
    // InternalDsl.g:915:1: rule__OrElement__Group__1 : rule__OrElement__Group__1__Impl ;
    public final void rule__OrElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:919:1: ( rule__OrElement__Group__1__Impl )
            // InternalDsl.g:920:2: rule__OrElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__Group__1__Impl();

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
    // $ANTLR end "rule__OrElement__Group__1"


    // $ANTLR start "rule__OrElement__Group__1__Impl"
    // InternalDsl.g:926:1: rule__OrElement__Group__1__Impl : ( ( rule__OrElement__Group_1__0 )* ) ;
    public final void rule__OrElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:930:1: ( ( ( rule__OrElement__Group_1__0 )* ) )
            // InternalDsl.g:931:1: ( ( rule__OrElement__Group_1__0 )* )
            {
            // InternalDsl.g:931:1: ( ( rule__OrElement__Group_1__0 )* )
            // InternalDsl.g:932:2: ( rule__OrElement__Group_1__0 )*
            {
             before(grammarAccess.getOrElementAccess().getGroup_1()); 
            // InternalDsl.g:933:2: ( rule__OrElement__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:933:3: rule__OrElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OrElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOrElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrElement__Group__1__Impl"


    // $ANTLR start "rule__OrElement__Group_1__0"
    // InternalDsl.g:942:1: rule__OrElement__Group_1__0 : rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 ;
    public final void rule__OrElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 )
            // InternalDsl.g:947:2: rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__OrElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrElement__Group_1__1();

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
    // $ANTLR end "rule__OrElement__Group_1__0"


    // $ANTLR start "rule__OrElement__Group_1__0__Impl"
    // InternalDsl.g:954:1: rule__OrElement__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__OrElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:958:1: ( ( 'or' ) )
            // InternalDsl.g:959:1: ( 'or' )
            {
            // InternalDsl.g:959:1: ( 'or' )
            // InternalDsl.g:960:2: 'or'
            {
             before(grammarAccess.getOrElementAccess().getOrKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOrElementAccess().getOrKeyword_1_0()); 

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
    // $ANTLR end "rule__OrElement__Group_1__0__Impl"


    // $ANTLR start "rule__OrElement__Group_1__1"
    // InternalDsl.g:969:1: rule__OrElement__Group_1__1 : rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 ;
    public final void rule__OrElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:973:1: ( rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 )
            // InternalDsl.g:974:2: rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__OrElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrElement__Group_1__2();

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
    // $ANTLR end "rule__OrElement__Group_1__1"


    // $ANTLR start "rule__OrElement__Group_1__1__Impl"
    // InternalDsl.g:981:1: rule__OrElement__Group_1__1__Impl : ( () ) ;
    public final void rule__OrElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:985:1: ( ( () ) )
            // InternalDsl.g:986:1: ( () )
            {
            // InternalDsl.g:986:1: ( () )
            // InternalDsl.g:987:2: ()
            {
             before(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 
            // InternalDsl.g:988:2: ()
            // InternalDsl.g:988:3: 
            {
            }

             after(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrElement__Group_1__1__Impl"


    // $ANTLR start "rule__OrElement__Group_1__2"
    // InternalDsl.g:996:1: rule__OrElement__Group_1__2 : rule__OrElement__Group_1__2__Impl ;
    public final void rule__OrElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1000:1: ( rule__OrElement__Group_1__2__Impl )
            // InternalDsl.g:1001:2: rule__OrElement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrElement__Group_1__2"


    // $ANTLR start "rule__OrElement__Group_1__2__Impl"
    // InternalDsl.g:1007:1: rule__OrElement__Group_1__2__Impl : ( ( rule__OrElement__RightAssignment_1_2 ) ) ;
    public final void rule__OrElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1011:1: ( ( ( rule__OrElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1012:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1012:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            // InternalDsl.g:1013:2: ( rule__OrElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1014:2: ( rule__OrElement__RightAssignment_1_2 )
            // InternalDsl.g:1014:3: rule__OrElement__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrElement__Group_1__2__Impl"


    // $ANTLR start "rule__AndElement__Group__0"
    // InternalDsl.g:1023:1: rule__AndElement__Group__0 : rule__AndElement__Group__0__Impl rule__AndElement__Group__1 ;
    public final void rule__AndElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( rule__AndElement__Group__0__Impl rule__AndElement__Group__1 )
            // InternalDsl.g:1028:2: rule__AndElement__Group__0__Impl rule__AndElement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AndElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndElement__Group__1();

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
    // $ANTLR end "rule__AndElement__Group__0"


    // $ANTLR start "rule__AndElement__Group__0__Impl"
    // InternalDsl.g:1035:1: rule__AndElement__Group__0__Impl : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1039:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:1040:1: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:1040:1: ( ruleDiffEqualElement )
            // InternalDsl.g:1041:2: ruleDiffEqualElement
            {
             before(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDiffEqualElement();

            state._fsp--;

             after(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndElement__Group__0__Impl"


    // $ANTLR start "rule__AndElement__Group__1"
    // InternalDsl.g:1050:1: rule__AndElement__Group__1 : rule__AndElement__Group__1__Impl ;
    public final void rule__AndElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1054:1: ( rule__AndElement__Group__1__Impl )
            // InternalDsl.g:1055:2: rule__AndElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__Group__1__Impl();

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
    // $ANTLR end "rule__AndElement__Group__1"


    // $ANTLR start "rule__AndElement__Group__1__Impl"
    // InternalDsl.g:1061:1: rule__AndElement__Group__1__Impl : ( ( rule__AndElement__Group_1__0 )* ) ;
    public final void rule__AndElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1065:1: ( ( ( rule__AndElement__Group_1__0 )* ) )
            // InternalDsl.g:1066:1: ( ( rule__AndElement__Group_1__0 )* )
            {
            // InternalDsl.g:1066:1: ( ( rule__AndElement__Group_1__0 )* )
            // InternalDsl.g:1067:2: ( rule__AndElement__Group_1__0 )*
            {
             before(grammarAccess.getAndElementAccess().getGroup_1()); 
            // InternalDsl.g:1068:2: ( rule__AndElement__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1068:3: rule__AndElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AndElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAndElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndElement__Group__1__Impl"


    // $ANTLR start "rule__AndElement__Group_1__0"
    // InternalDsl.g:1077:1: rule__AndElement__Group_1__0 : rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 ;
    public final void rule__AndElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1081:1: ( rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 )
            // InternalDsl.g:1082:2: rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__AndElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndElement__Group_1__1();

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
    // $ANTLR end "rule__AndElement__Group_1__0"


    // $ANTLR start "rule__AndElement__Group_1__0__Impl"
    // InternalDsl.g:1089:1: rule__AndElement__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__AndElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1093:1: ( ( 'and' ) )
            // InternalDsl.g:1094:1: ( 'and' )
            {
            // InternalDsl.g:1094:1: ( 'and' )
            // InternalDsl.g:1095:2: 'and'
            {
             before(grammarAccess.getAndElementAccess().getAndKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAndElementAccess().getAndKeyword_1_0()); 

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
    // $ANTLR end "rule__AndElement__Group_1__0__Impl"


    // $ANTLR start "rule__AndElement__Group_1__1"
    // InternalDsl.g:1104:1: rule__AndElement__Group_1__1 : rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 ;
    public final void rule__AndElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1108:1: ( rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 )
            // InternalDsl.g:1109:2: rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__AndElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndElement__Group_1__2();

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
    // $ANTLR end "rule__AndElement__Group_1__1"


    // $ANTLR start "rule__AndElement__Group_1__1__Impl"
    // InternalDsl.g:1116:1: rule__AndElement__Group_1__1__Impl : ( () ) ;
    public final void rule__AndElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1120:1: ( ( () ) )
            // InternalDsl.g:1121:1: ( () )
            {
            // InternalDsl.g:1121:1: ( () )
            // InternalDsl.g:1122:2: ()
            {
             before(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 
            // InternalDsl.g:1123:2: ()
            // InternalDsl.g:1123:3: 
            {
            }

             after(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndElement__Group_1__1__Impl"


    // $ANTLR start "rule__AndElement__Group_1__2"
    // InternalDsl.g:1131:1: rule__AndElement__Group_1__2 : rule__AndElement__Group_1__2__Impl ;
    public final void rule__AndElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1135:1: ( rule__AndElement__Group_1__2__Impl )
            // InternalDsl.g:1136:2: rule__AndElement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndElement__Group_1__2"


    // $ANTLR start "rule__AndElement__Group_1__2__Impl"
    // InternalDsl.g:1142:1: rule__AndElement__Group_1__2__Impl : ( ( rule__AndElement__RightAssignment_1_2 ) ) ;
    public final void rule__AndElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1146:1: ( ( ( rule__AndElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1147:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1147:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            // InternalDsl.g:1148:2: ( rule__AndElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1149:2: ( rule__AndElement__RightAssignment_1_2 )
            // InternalDsl.g:1149:3: rule__AndElement__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndElement__Group_1__2__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group__0"
    // InternalDsl.g:1158:1: rule__DiffEqualElement__Group__0 : rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 ;
    public final void rule__DiffEqualElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1162:1: ( rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 )
            // InternalDsl.g:1163:2: rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DiffEqualElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group__1();

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
    // $ANTLR end "rule__DiffEqualElement__Group__0"


    // $ANTLR start "rule__DiffEqualElement__Group__0__Impl"
    // InternalDsl.g:1170:1: rule__DiffEqualElement__Group__0__Impl : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1174:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:1175:1: ( ruleCompareElement )
            {
            // InternalDsl.g:1175:1: ( ruleCompareElement )
            // InternalDsl.g:1176:2: ruleCompareElement
            {
             before(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__DiffEqualElement__Group__0__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group__1"
    // InternalDsl.g:1185:1: rule__DiffEqualElement__Group__1 : rule__DiffEqualElement__Group__1__Impl ;
    public final void rule__DiffEqualElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1189:1: ( rule__DiffEqualElement__Group__1__Impl )
            // InternalDsl.g:1190:2: rule__DiffEqualElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group__1__Impl();

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
    // $ANTLR end "rule__DiffEqualElement__Group__1"


    // $ANTLR start "rule__DiffEqualElement__Group__1__Impl"
    // InternalDsl.g:1196:1: rule__DiffEqualElement__Group__1__Impl : ( ( rule__DiffEqualElement__Alternatives_1 )* ) ;
    public final void rule__DiffEqualElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1200:1: ( ( ( rule__DiffEqualElement__Alternatives_1 )* ) )
            // InternalDsl.g:1201:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            {
            // InternalDsl.g:1201:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            // InternalDsl.g:1202:2: ( rule__DiffEqualElement__Alternatives_1 )*
            {
             before(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 
            // InternalDsl.g:1203:2: ( rule__DiffEqualElement__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=20 && LA14_0<=21)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1203:3: rule__DiffEqualElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__DiffEqualElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__DiffEqualElement__Group__1__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__0"
    // InternalDsl.g:1212:1: rule__DiffEqualElement__Group_1_0__0 : rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 ;
    public final void rule__DiffEqualElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1216:1: ( rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 )
            // InternalDsl.g:1217:2: rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__DiffEqualElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_0__1();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__0"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__0__Impl"
    // InternalDsl.g:1224:1: rule__DiffEqualElement__Group_1_0__0__Impl : ( '!=' ) ;
    public final void rule__DiffEqualElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1228:1: ( ( '!=' ) )
            // InternalDsl.g:1229:1: ( '!=' )
            {
            // InternalDsl.g:1229:1: ( '!=' )
            // InternalDsl.g:1230:2: '!='
            {
             before(grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0()); 

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__1"
    // InternalDsl.g:1239:1: rule__DiffEqualElement__Group_1_0__1 : rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 ;
    public final void rule__DiffEqualElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1243:1: ( rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 )
            // InternalDsl.g:1244:2: rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__DiffEqualElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_0__2();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__1"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__1__Impl"
    // InternalDsl.g:1251:1: rule__DiffEqualElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1255:1: ( ( () ) )
            // InternalDsl.g:1256:1: ( () )
            {
            // InternalDsl.g:1256:1: ( () )
            // InternalDsl.g:1257:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 
            // InternalDsl.g:1258:2: ()
            // InternalDsl.g:1258:3: 
            {
            }

             after(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__2"
    // InternalDsl.g:1266:1: rule__DiffEqualElement__Group_1_0__2 : rule__DiffEqualElement__Group_1_0__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1270:1: ( rule__DiffEqualElement__Group_1_0__2__Impl )
            // InternalDsl.g:1271:2: rule__DiffEqualElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__2"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__2__Impl"
    // InternalDsl.g:1277:1: rule__DiffEqualElement__Group_1_0__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1281:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1282:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1282:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1283:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:1284:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            // InternalDsl.g:1284:3: rule__DiffEqualElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__0"
    // InternalDsl.g:1293:1: rule__DiffEqualElement__Group_1_1__0 : rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 ;
    public final void rule__DiffEqualElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1297:1: ( rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 )
            // InternalDsl.g:1298:2: rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__DiffEqualElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_1__1();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__0"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__0__Impl"
    // InternalDsl.g:1305:1: rule__DiffEqualElement__Group_1_1__0__Impl : ( '==' ) ;
    public final void rule__DiffEqualElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1309:1: ( ( '==' ) )
            // InternalDsl.g:1310:1: ( '==' )
            {
            // InternalDsl.g:1310:1: ( '==' )
            // InternalDsl.g:1311:2: '=='
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0()); 

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__1"
    // InternalDsl.g:1320:1: rule__DiffEqualElement__Group_1_1__1 : rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 ;
    public final void rule__DiffEqualElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1324:1: ( rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 )
            // InternalDsl.g:1325:2: rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__DiffEqualElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_1__2();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__1"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__1__Impl"
    // InternalDsl.g:1332:1: rule__DiffEqualElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1336:1: ( ( () ) )
            // InternalDsl.g:1337:1: ( () )
            {
            // InternalDsl.g:1337:1: ( () )
            // InternalDsl.g:1338:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:1339:2: ()
            // InternalDsl.g:1339:3: 
            {
            }

             after(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__2"
    // InternalDsl.g:1347:1: rule__DiffEqualElement__Group_1_1__2 : rule__DiffEqualElement__Group_1_1__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1351:1: ( rule__DiffEqualElement__Group_1_1__2__Impl )
            // InternalDsl.g:1352:2: rule__DiffEqualElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__2"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__2__Impl"
    // InternalDsl.g:1358:1: rule__DiffEqualElement__Group_1_1__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1362:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1363:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1363:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1364:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:1365:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            // InternalDsl.g:1365:3: rule__DiffEqualElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__CompareElement__Group__0"
    // InternalDsl.g:1374:1: rule__CompareElement__Group__0 : rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 ;
    public final void rule__CompareElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1378:1: ( rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 )
            // InternalDsl.g:1379:2: rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__CompareElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group__1();

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
    // $ANTLR end "rule__CompareElement__Group__0"


    // $ANTLR start "rule__CompareElement__Group__0__Impl"
    // InternalDsl.g:1386:1: rule__CompareElement__Group__0__Impl : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1390:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:1391:1: ( rulePlusMinusElement )
            {
            // InternalDsl.g:1391:1: ( rulePlusMinusElement )
            // InternalDsl.g:1392:2: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__CompareElement__Group__0__Impl"


    // $ANTLR start "rule__CompareElement__Group__1"
    // InternalDsl.g:1401:1: rule__CompareElement__Group__1 : rule__CompareElement__Group__1__Impl ;
    public final void rule__CompareElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1405:1: ( rule__CompareElement__Group__1__Impl )
            // InternalDsl.g:1406:2: rule__CompareElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group__1__Impl();

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
    // $ANTLR end "rule__CompareElement__Group__1"


    // $ANTLR start "rule__CompareElement__Group__1__Impl"
    // InternalDsl.g:1412:1: rule__CompareElement__Group__1__Impl : ( ( rule__CompareElement__Alternatives_1 )* ) ;
    public final void rule__CompareElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1416:1: ( ( ( rule__CompareElement__Alternatives_1 )* ) )
            // InternalDsl.g:1417:1: ( ( rule__CompareElement__Alternatives_1 )* )
            {
            // InternalDsl.g:1417:1: ( ( rule__CompareElement__Alternatives_1 )* )
            // InternalDsl.g:1418:2: ( rule__CompareElement__Alternatives_1 )*
            {
             before(grammarAccess.getCompareElementAccess().getAlternatives_1()); 
            // InternalDsl.g:1419:2: ( rule__CompareElement__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=22 && LA15_0<=25)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1419:3: rule__CompareElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__CompareElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCompareElementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__CompareElement__Group__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_0__0"
    // InternalDsl.g:1428:1: rule__CompareElement__Group_1_0__0 : rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 ;
    public final void rule__CompareElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1432:1: ( rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 )
            // InternalDsl.g:1433:2: rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_0__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_0__0"


    // $ANTLR start "rule__CompareElement__Group_1_0__0__Impl"
    // InternalDsl.g:1440:1: rule__CompareElement__Group_1_0__0__Impl : ( '>' ) ;
    public final void rule__CompareElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1444:1: ( ( '>' ) )
            // InternalDsl.g:1445:1: ( '>' )
            {
            // InternalDsl.g:1445:1: ( '>' )
            // InternalDsl.g:1446:2: '>'
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_0__1"
    // InternalDsl.g:1455:1: rule__CompareElement__Group_1_0__1 : rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 ;
    public final void rule__CompareElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1459:1: ( rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 )
            // InternalDsl.g:1460:2: rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_0__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_0__1"


    // $ANTLR start "rule__CompareElement__Group_1_0__1__Impl"
    // InternalDsl.g:1467:1: rule__CompareElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1471:1: ( ( () ) )
            // InternalDsl.g:1472:1: ( () )
            {
            // InternalDsl.g:1472:1: ( () )
            // InternalDsl.g:1473:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 
            // InternalDsl.g:1474:2: ()
            // InternalDsl.g:1474:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_0__2"
    // InternalDsl.g:1482:1: rule__CompareElement__Group_1_0__2 : rule__CompareElement__Group_1_0__2__Impl ;
    public final void rule__CompareElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1486:1: ( rule__CompareElement__Group_1_0__2__Impl )
            // InternalDsl.g:1487:2: rule__CompareElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_0__2"


    // $ANTLR start "rule__CompareElement__Group_1_0__2__Impl"
    // InternalDsl.g:1493:1: rule__CompareElement__Group_1_0__2__Impl : ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__CompareElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1497:1: ( ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1498:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1498:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1499:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:1500:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            // InternalDsl.g:1500:3: rule__CompareElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_1__0"
    // InternalDsl.g:1509:1: rule__CompareElement__Group_1_1__0 : rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 ;
    public final void rule__CompareElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1513:1: ( rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 )
            // InternalDsl.g:1514:2: rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_1__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_1__0"


    // $ANTLR start "rule__CompareElement__Group_1_1__0__Impl"
    // InternalDsl.g:1521:1: rule__CompareElement__Group_1_1__0__Impl : ( '>=' ) ;
    public final void rule__CompareElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1525:1: ( ( '>=' ) )
            // InternalDsl.g:1526:1: ( '>=' )
            {
            // InternalDsl.g:1526:1: ( '>=' )
            // InternalDsl.g:1527:2: '>='
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_1__1"
    // InternalDsl.g:1536:1: rule__CompareElement__Group_1_1__1 : rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 ;
    public final void rule__CompareElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1540:1: ( rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 )
            // InternalDsl.g:1541:2: rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_1__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_1__1"


    // $ANTLR start "rule__CompareElement__Group_1_1__1__Impl"
    // InternalDsl.g:1548:1: rule__CompareElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1552:1: ( ( () ) )
            // InternalDsl.g:1553:1: ( () )
            {
            // InternalDsl.g:1553:1: ( () )
            // InternalDsl.g:1554:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:1555:2: ()
            // InternalDsl.g:1555:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_1__2"
    // InternalDsl.g:1563:1: rule__CompareElement__Group_1_1__2 : rule__CompareElement__Group_1_1__2__Impl ;
    public final void rule__CompareElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1567:1: ( rule__CompareElement__Group_1_1__2__Impl )
            // InternalDsl.g:1568:2: rule__CompareElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_1__2"


    // $ANTLR start "rule__CompareElement__Group_1_1__2__Impl"
    // InternalDsl.g:1574:1: rule__CompareElement__Group_1_1__2__Impl : ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__CompareElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1578:1: ( ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1579:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1579:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1580:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:1581:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            // InternalDsl.g:1581:3: rule__CompareElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_2__0"
    // InternalDsl.g:1590:1: rule__CompareElement__Group_1_2__0 : rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 ;
    public final void rule__CompareElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1594:1: ( rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 )
            // InternalDsl.g:1595:2: rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_2__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_2__0"


    // $ANTLR start "rule__CompareElement__Group_1_2__0__Impl"
    // InternalDsl.g:1602:1: rule__CompareElement__Group_1_2__0__Impl : ( '<' ) ;
    public final void rule__CompareElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1606:1: ( ( '<' ) )
            // InternalDsl.g:1607:1: ( '<' )
            {
            // InternalDsl.g:1607:1: ( '<' )
            // InternalDsl.g:1608:2: '<'
            {
             before(grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_2__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_2__1"
    // InternalDsl.g:1617:1: rule__CompareElement__Group_1_2__1 : rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 ;
    public final void rule__CompareElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1621:1: ( rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 )
            // InternalDsl.g:1622:2: rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_2__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_2__1"


    // $ANTLR start "rule__CompareElement__Group_1_2__1__Impl"
    // InternalDsl.g:1629:1: rule__CompareElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1633:1: ( ( () ) )
            // InternalDsl.g:1634:1: ( () )
            {
            // InternalDsl.g:1634:1: ( () )
            // InternalDsl.g:1635:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 
            // InternalDsl.g:1636:2: ()
            // InternalDsl.g:1636:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_2__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_2__2"
    // InternalDsl.g:1644:1: rule__CompareElement__Group_1_2__2 : rule__CompareElement__Group_1_2__2__Impl ;
    public final void rule__CompareElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1648:1: ( rule__CompareElement__Group_1_2__2__Impl )
            // InternalDsl.g:1649:2: rule__CompareElement__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_2__2"


    // $ANTLR start "rule__CompareElement__Group_1_2__2__Impl"
    // InternalDsl.g:1655:1: rule__CompareElement__Group_1_2__2__Impl : ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__CompareElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1659:1: ( ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:1660:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:1660:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:1661:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:1662:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            // InternalDsl.g:1662:3: rule__CompareElement__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_2__2__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_3__0"
    // InternalDsl.g:1671:1: rule__CompareElement__Group_1_3__0 : rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 ;
    public final void rule__CompareElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1675:1: ( rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 )
            // InternalDsl.g:1676:2: rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_3__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_3__0"


    // $ANTLR start "rule__CompareElement__Group_1_3__0__Impl"
    // InternalDsl.g:1683:1: rule__CompareElement__Group_1_3__0__Impl : ( '=<' ) ;
    public final void rule__CompareElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1687:1: ( ( '=<' ) )
            // InternalDsl.g:1688:1: ( '=<' )
            {
            // InternalDsl.g:1688:1: ( '=<' )
            // InternalDsl.g:1689:2: '=<'
            {
             before(grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_3__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_3__1"
    // InternalDsl.g:1698:1: rule__CompareElement__Group_1_3__1 : rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 ;
    public final void rule__CompareElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1702:1: ( rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 )
            // InternalDsl.g:1703:2: rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2
            {
            pushFollow(FOLLOW_12);
            rule__CompareElement__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_3__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_3__1"


    // $ANTLR start "rule__CompareElement__Group_1_3__1__Impl"
    // InternalDsl.g:1710:1: rule__CompareElement__Group_1_3__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1714:1: ( ( () ) )
            // InternalDsl.g:1715:1: ( () )
            {
            // InternalDsl.g:1715:1: ( () )
            // InternalDsl.g:1716:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 
            // InternalDsl.g:1717:2: ()
            // InternalDsl.g:1717:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_3__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_3__2"
    // InternalDsl.g:1725:1: rule__CompareElement__Group_1_3__2 : rule__CompareElement__Group_1_3__2__Impl ;
    public final void rule__CompareElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1729:1: ( rule__CompareElement__Group_1_3__2__Impl )
            // InternalDsl.g:1730:2: rule__CompareElement__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_3__2"


    // $ANTLR start "rule__CompareElement__Group_1_3__2__Impl"
    // InternalDsl.g:1736:1: rule__CompareElement__Group_1_3__2__Impl : ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) ;
    public final void rule__CompareElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1740:1: ( ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) )
            // InternalDsl.g:1741:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            {
            // InternalDsl.g:1741:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            // InternalDsl.g:1742:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 
            // InternalDsl.g:1743:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            // InternalDsl.g:1743:3: rule__CompareElement__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 

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
    // $ANTLR end "rule__CompareElement__Group_1_3__2__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group__0"
    // InternalDsl.g:1752:1: rule__PlusMinusElement__Group__0 : rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 ;
    public final void rule__PlusMinusElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1756:1: ( rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 )
            // InternalDsl.g:1757:2: rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PlusMinusElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group__1();

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
    // $ANTLR end "rule__PlusMinusElement__Group__0"


    // $ANTLR start "rule__PlusMinusElement__Group__0__Impl"
    // InternalDsl.g:1764:1: rule__PlusMinusElement__Group__0__Impl : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1768:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:1769:1: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:1769:1: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:1770:2: ruleMultiplicationDivisionElement
            {
             before(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusMinusElement__Group__0__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group__1"
    // InternalDsl.g:1779:1: rule__PlusMinusElement__Group__1 : rule__PlusMinusElement__Group__1__Impl ;
    public final void rule__PlusMinusElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1783:1: ( rule__PlusMinusElement__Group__1__Impl )
            // InternalDsl.g:1784:2: rule__PlusMinusElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group__1__Impl();

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
    // $ANTLR end "rule__PlusMinusElement__Group__1"


    // $ANTLR start "rule__PlusMinusElement__Group__1__Impl"
    // InternalDsl.g:1790:1: rule__PlusMinusElement__Group__1__Impl : ( ( rule__PlusMinusElement__Alternatives_1 )* ) ;
    public final void rule__PlusMinusElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1794:1: ( ( ( rule__PlusMinusElement__Alternatives_1 )* ) )
            // InternalDsl.g:1795:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            {
            // InternalDsl.g:1795:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            // InternalDsl.g:1796:2: ( rule__PlusMinusElement__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 
            // InternalDsl.g:1797:2: ( rule__PlusMinusElement__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=26 && LA16_0<=27)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1797:3: rule__PlusMinusElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PlusMinusElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PlusMinusElement__Group__1__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__0"
    // InternalDsl.g:1806:1: rule__PlusMinusElement__Group_1_0__0 : rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 ;
    public final void rule__PlusMinusElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1810:1: ( rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 )
            // InternalDsl.g:1811:2: rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__PlusMinusElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_0__1();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__0"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__0__Impl"
    // InternalDsl.g:1818:1: rule__PlusMinusElement__Group_1_0__0__Impl : ( '+' ) ;
    public final void rule__PlusMinusElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1822:1: ( ( '+' ) )
            // InternalDsl.g:1823:1: ( '+' )
            {
            // InternalDsl.g:1823:1: ( '+' )
            // InternalDsl.g:1824:2: '+'
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0()); 

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__1"
    // InternalDsl.g:1833:1: rule__PlusMinusElement__Group_1_0__1 : rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 ;
    public final void rule__PlusMinusElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1837:1: ( rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 )
            // InternalDsl.g:1838:2: rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__PlusMinusElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_0__2();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__1"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__1__Impl"
    // InternalDsl.g:1845:1: rule__PlusMinusElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1849:1: ( ( () ) )
            // InternalDsl.g:1850:1: ( () )
            {
            // InternalDsl.g:1850:1: ( () )
            // InternalDsl.g:1851:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 
            // InternalDsl.g:1852:2: ()
            // InternalDsl.g:1852:3: 
            {
            }

             after(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__2"
    // InternalDsl.g:1860:1: rule__PlusMinusElement__Group_1_0__2 : rule__PlusMinusElement__Group_1_0__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1864:1: ( rule__PlusMinusElement__Group_1_0__2__Impl )
            // InternalDsl.g:1865:2: rule__PlusMinusElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__2"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__2__Impl"
    // InternalDsl.g:1871:1: rule__PlusMinusElement__Group_1_0__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1875:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1876:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1876:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1877:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:1878:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            // InternalDsl.g:1878:3: rule__PlusMinusElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__0"
    // InternalDsl.g:1887:1: rule__PlusMinusElement__Group_1_1__0 : rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 ;
    public final void rule__PlusMinusElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1891:1: ( rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 )
            // InternalDsl.g:1892:2: rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PlusMinusElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_1__1();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__0"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__0__Impl"
    // InternalDsl.g:1899:1: rule__PlusMinusElement__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__PlusMinusElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1903:1: ( ( '-' ) )
            // InternalDsl.g:1904:1: ( '-' )
            {
            // InternalDsl.g:1904:1: ( '-' )
            // InternalDsl.g:1905:2: '-'
            {
             before(grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0()); 

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__1"
    // InternalDsl.g:1914:1: rule__PlusMinusElement__Group_1_1__1 : rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 ;
    public final void rule__PlusMinusElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1918:1: ( rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 )
            // InternalDsl.g:1919:2: rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__PlusMinusElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_1__2();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__1"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__1__Impl"
    // InternalDsl.g:1926:1: rule__PlusMinusElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1930:1: ( ( () ) )
            // InternalDsl.g:1931:1: ( () )
            {
            // InternalDsl.g:1931:1: ( () )
            // InternalDsl.g:1932:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 
            // InternalDsl.g:1933:2: ()
            // InternalDsl.g:1933:3: 
            {
            }

             after(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__2"
    // InternalDsl.g:1941:1: rule__PlusMinusElement__Group_1_1__2 : rule__PlusMinusElement__Group_1_1__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1945:1: ( rule__PlusMinusElement__Group_1_1__2__Impl )
            // InternalDsl.g:1946:2: rule__PlusMinusElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__2"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__2__Impl"
    // InternalDsl.g:1952:1: rule__PlusMinusElement__Group_1_1__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1956:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1957:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1957:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1958:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:1959:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            // InternalDsl.g:1959:3: rule__PlusMinusElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__0"
    // InternalDsl.g:1968:1: rule__MultiplicationDivisionElement__Group__0 : rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 ;
    public final void rule__MultiplicationDivisionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1972:1: ( rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 )
            // InternalDsl.g:1973:2: rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiplicationDivisionElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__0__Impl"
    // InternalDsl.g:1980:1: rule__MultiplicationDivisionElement__Group__0__Impl : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1984:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:1985:1: ( ruleUnaryElement )
            {
            // InternalDsl.g:1985:1: ( ruleUnaryElement )
            // InternalDsl.g:1986:2: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__1"
    // InternalDsl.g:1995:1: rule__MultiplicationDivisionElement__Group__1 : rule__MultiplicationDivisionElement__Group__1__Impl ;
    public final void rule__MultiplicationDivisionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1999:1: ( rule__MultiplicationDivisionElement__Group__1__Impl )
            // InternalDsl.g:2000:2: rule__MultiplicationDivisionElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group__1__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__1__Impl"
    // InternalDsl.g:2006:1: rule__MultiplicationDivisionElement__Group__1__Impl : ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) ;
    public final void rule__MultiplicationDivisionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2010:1: ( ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) )
            // InternalDsl.g:2011:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2011:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            // InternalDsl.g:2012:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2013:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=28 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:2013:3: rule__MultiplicationDivisionElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__MultiplicationDivisionElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__0"
    // InternalDsl.g:2022:1: rule__MultiplicationDivisionElement__Group_1_0__0 : rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2026:1: ( rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 )
            // InternalDsl.g:2027:2: rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicationDivisionElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_0__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__0__Impl"
    // InternalDsl.g:2034:1: rule__MultiplicationDivisionElement__Group_1_0__0__Impl : ( '*' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2038:1: ( ( '*' ) )
            // InternalDsl.g:2039:1: ( '*' )
            {
            // InternalDsl.g:2039:1: ( '*' )
            // InternalDsl.g:2040:2: '*'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__1"
    // InternalDsl.g:2049:1: rule__MultiplicationDivisionElement__Group_1_0__1 : rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2053:1: ( rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 )
            // InternalDsl.g:2054:2: rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicationDivisionElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_0__2();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__1__Impl"
    // InternalDsl.g:2061:1: rule__MultiplicationDivisionElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2065:1: ( ( () ) )
            // InternalDsl.g:2066:1: ( () )
            {
            // InternalDsl.g:2066:1: ( () )
            // InternalDsl.g:2067:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 
            // InternalDsl.g:2068:2: ()
            // InternalDsl.g:2068:3: 
            {
            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__2"
    // InternalDsl.g:2076:1: rule__MultiplicationDivisionElement__Group_1_0__2 : rule__MultiplicationDivisionElement__Group_1_0__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2080:1: ( rule__MultiplicationDivisionElement__Group_1_0__2__Impl )
            // InternalDsl.g:2081:2: rule__MultiplicationDivisionElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__2"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__2__Impl"
    // InternalDsl.g:2087:1: rule__MultiplicationDivisionElement__Group_1_0__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2091:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2092:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2092:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2093:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2094:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2094:3: rule__MultiplicationDivisionElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__0"
    // InternalDsl.g:2103:1: rule__MultiplicationDivisionElement__Group_1_1__0 : rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2107:1: ( rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 )
            // InternalDsl.g:2108:2: rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicationDivisionElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_1__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__0__Impl"
    // InternalDsl.g:2115:1: rule__MultiplicationDivisionElement__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2119:1: ( ( '/' ) )
            // InternalDsl.g:2120:1: ( '/' )
            {
            // InternalDsl.g:2120:1: ( '/' )
            // InternalDsl.g:2121:2: '/'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__1"
    // InternalDsl.g:2130:1: rule__MultiplicationDivisionElement__Group_1_1__1 : rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2134:1: ( rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 )
            // InternalDsl.g:2135:2: rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicationDivisionElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_1__2();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__1__Impl"
    // InternalDsl.g:2142:1: rule__MultiplicationDivisionElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2146:1: ( ( () ) )
            // InternalDsl.g:2147:1: ( () )
            {
            // InternalDsl.g:2147:1: ( () )
            // InternalDsl.g:2148:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 
            // InternalDsl.g:2149:2: ()
            // InternalDsl.g:2149:3: 
            {
            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__2"
    // InternalDsl.g:2157:1: rule__MultiplicationDivisionElement__Group_1_1__2 : rule__MultiplicationDivisionElement__Group_1_1__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2161:1: ( rule__MultiplicationDivisionElement__Group_1_1__2__Impl )
            // InternalDsl.g:2162:2: rule__MultiplicationDivisionElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__2"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__2__Impl"
    // InternalDsl.g:2168:1: rule__MultiplicationDivisionElement__Group_1_1__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2172:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2173:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2173:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2174:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2175:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2175:3: rule__MultiplicationDivisionElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__0"
    // InternalDsl.g:2184:1: rule__MultiplicationDivisionElement__Group_1_2__0 : rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2188:1: ( rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 )
            // InternalDsl.g:2189:2: rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicationDivisionElement__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_2__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__0__Impl"
    // InternalDsl.g:2196:1: rule__MultiplicationDivisionElement__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2200:1: ( ( '%' ) )
            // InternalDsl.g:2201:1: ( '%' )
            {
            // InternalDsl.g:2201:1: ( '%' )
            // InternalDsl.g:2202:2: '%'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__1"
    // InternalDsl.g:2211:1: rule__MultiplicationDivisionElement__Group_1_2__1 : rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2215:1: ( rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 )
            // InternalDsl.g:2216:2: rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicationDivisionElement__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_2__2();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__1__Impl"
    // InternalDsl.g:2223:1: rule__MultiplicationDivisionElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2227:1: ( ( () ) )
            // InternalDsl.g:2228:1: ( () )
            {
            // InternalDsl.g:2228:1: ( () )
            // InternalDsl.g:2229:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 
            // InternalDsl.g:2230:2: ()
            // InternalDsl.g:2230:3: 
            {
            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__2"
    // InternalDsl.g:2238:1: rule__MultiplicationDivisionElement__Group_1_2__2 : rule__MultiplicationDivisionElement__Group_1_2__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2242:1: ( rule__MultiplicationDivisionElement__Group_1_2__2__Impl )
            // InternalDsl.g:2243:2: rule__MultiplicationDivisionElement__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__2"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__2__Impl"
    // InternalDsl.g:2249:1: rule__MultiplicationDivisionElement__Group_1_2__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2253:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:2254:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:2254:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:2255:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:2256:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            // InternalDsl.g:2256:3: rule__MultiplicationDivisionElement__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__2__Impl"


    // $ANTLR start "rule__UnaryElement__Group_0__0"
    // InternalDsl.g:2265:1: rule__UnaryElement__Group_0__0 : rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 ;
    public final void rule__UnaryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2269:1: ( rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 )
            // InternalDsl.g:2270:2: rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__UnaryElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_0__1();

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
    // $ANTLR end "rule__UnaryElement__Group_0__0"


    // $ANTLR start "rule__UnaryElement__Group_0__0__Impl"
    // InternalDsl.g:2277:1: rule__UnaryElement__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2281:1: ( ( () ) )
            // InternalDsl.g:2282:1: ( () )
            {
            // InternalDsl.g:2282:1: ( () )
            // InternalDsl.g:2283:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 
            // InternalDsl.g:2284:2: ()
            // InternalDsl.g:2284:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_0__1"
    // InternalDsl.g:2292:1: rule__UnaryElement__Group_0__1 : rule__UnaryElement__Group_0__1__Impl ;
    public final void rule__UnaryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2296:1: ( rule__UnaryElement__Group_0__1__Impl )
            // InternalDsl.g:2297:2: rule__UnaryElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_0__1__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_0__1"


    // $ANTLR start "rule__UnaryElement__Group_0__1__Impl"
    // InternalDsl.g:2303:1: rule__UnaryElement__Group_0__1__Impl : ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) ;
    public final void rule__UnaryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2307:1: ( ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) )
            // InternalDsl.g:2308:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            {
            // InternalDsl.g:2308:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            // InternalDsl.g:2309:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 
            // InternalDsl.g:2310:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            // InternalDsl.g:2310:3: rule__UnaryElement__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__UnaryElement__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_1__0"
    // InternalDsl.g:2319:1: rule__UnaryElement__Group_1__0 : rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 ;
    public final void rule__UnaryElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2323:1: ( rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 )
            // InternalDsl.g:2324:2: rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__UnaryElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_1__1();

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
    // $ANTLR end "rule__UnaryElement__Group_1__0"


    // $ANTLR start "rule__UnaryElement__Group_1__0__Impl"
    // InternalDsl.g:2331:1: rule__UnaryElement__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2335:1: ( ( () ) )
            // InternalDsl.g:2336:1: ( () )
            {
            // InternalDsl.g:2336:1: ( () )
            // InternalDsl.g:2337:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0()); 
            // InternalDsl.g:2338:2: ()
            // InternalDsl.g:2338:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_1__1"
    // InternalDsl.g:2346:1: rule__UnaryElement__Group_1__1 : rule__UnaryElement__Group_1__1__Impl ;
    public final void rule__UnaryElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2350:1: ( rule__UnaryElement__Group_1__1__Impl )
            // InternalDsl.g:2351:2: rule__UnaryElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_1__1__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_1__1"


    // $ANTLR start "rule__UnaryElement__Group_1__1__Impl"
    // InternalDsl.g:2357:1: rule__UnaryElement__Group_1__1__Impl : ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) ;
    public final void rule__UnaryElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2361:1: ( ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:2362:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:2362:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            // InternalDsl.g:2363:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:2364:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            // InternalDsl.g:2364:3: rule__UnaryElement__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__UnaryElement__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_2__0"
    // InternalDsl.g:2373:1: rule__UnaryElement__Group_2__0 : rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 ;
    public final void rule__UnaryElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2377:1: ( rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 )
            // InternalDsl.g:2378:2: rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__UnaryElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_2__1();

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
    // $ANTLR end "rule__UnaryElement__Group_2__0"


    // $ANTLR start "rule__UnaryElement__Group_2__0__Impl"
    // InternalDsl.g:2385:1: rule__UnaryElement__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2389:1: ( ( () ) )
            // InternalDsl.g:2390:1: ( () )
            {
            // InternalDsl.g:2390:1: ( () )
            // InternalDsl.g:2391:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0()); 
            // InternalDsl.g:2392:2: ()
            // InternalDsl.g:2392:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_2__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_2__1"
    // InternalDsl.g:2400:1: rule__UnaryElement__Group_2__1 : rule__UnaryElement__Group_2__1__Impl ;
    public final void rule__UnaryElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2404:1: ( rule__UnaryElement__Group_2__1__Impl )
            // InternalDsl.g:2405:2: rule__UnaryElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_2__1__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_2__1"


    // $ANTLR start "rule__UnaryElement__Group_2__1__Impl"
    // InternalDsl.g:2411:1: rule__UnaryElement__Group_2__1__Impl : ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) ;
    public final void rule__UnaryElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2415:1: ( ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:2416:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:2416:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            // InternalDsl.g:2417:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:2418:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            // InternalDsl.g:2418:3: rule__UnaryElement__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__UnaryElement__Group_2__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_3__0"
    // InternalDsl.g:2427:1: rule__UnaryElement__Group_3__0 : rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 ;
    public final void rule__UnaryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2431:1: ( rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 )
            // InternalDsl.g:2432:2: rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__UnaryElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_3__1();

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
    // $ANTLR end "rule__UnaryElement__Group_3__0"


    // $ANTLR start "rule__UnaryElement__Group_3__0__Impl"
    // InternalDsl.g:2439:1: rule__UnaryElement__Group_3__0__Impl : ( '(' ) ;
    public final void rule__UnaryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2443:1: ( ( '(' ) )
            // InternalDsl.g:2444:1: ( '(' )
            {
            // InternalDsl.g:2444:1: ( '(' )
            // InternalDsl.g:2445:2: '('
            {
             before(grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__UnaryElement__Group_3__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_3__1"
    // InternalDsl.g:2454:1: rule__UnaryElement__Group_3__1 : rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 ;
    public final void rule__UnaryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2458:1: ( rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 )
            // InternalDsl.g:2459:2: rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__UnaryElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_3__2();

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
    // $ANTLR end "rule__UnaryElement__Group_3__1"


    // $ANTLR start "rule__UnaryElement__Group_3__1__Impl"
    // InternalDsl.g:2466:1: rule__UnaryElement__Group_3__1__Impl : ( ruleOrElement ) ;
    public final void rule__UnaryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2470:1: ( ( ruleOrElement ) )
            // InternalDsl.g:2471:1: ( ruleOrElement )
            {
            // InternalDsl.g:2471:1: ( ruleOrElement )
            // InternalDsl.g:2472:2: ruleOrElement
            {
             before(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__UnaryElement__Group_3__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_3__2"
    // InternalDsl.g:2481:1: rule__UnaryElement__Group_3__2 : rule__UnaryElement__Group_3__2__Impl ;
    public final void rule__UnaryElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2485:1: ( rule__UnaryElement__Group_3__2__Impl )
            // InternalDsl.g:2486:2: rule__UnaryElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_3__2__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_3__2"


    // $ANTLR start "rule__UnaryElement__Group_3__2__Impl"
    // InternalDsl.g:2492:1: rule__UnaryElement__Group_3__2__Impl : ( ')' ) ;
    public final void rule__UnaryElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2496:1: ( ( ')' ) )
            // InternalDsl.g:2497:1: ( ')' )
            {
            // InternalDsl.g:2497:1: ( ')' )
            // InternalDsl.g:2498:2: ')'
            {
             before(grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_3_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__UnaryElement__Group_3__2__Impl"


    // $ANTLR start "rule__UnaryElement__Group_4__0"
    // InternalDsl.g:2508:1: rule__UnaryElement__Group_4__0 : rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 ;
    public final void rule__UnaryElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2512:1: ( rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 )
            // InternalDsl.g:2513:2: rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__UnaryElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_4__1();

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
    // $ANTLR end "rule__UnaryElement__Group_4__0"


    // $ANTLR start "rule__UnaryElement__Group_4__0__Impl"
    // InternalDsl.g:2520:1: rule__UnaryElement__Group_4__0__Impl : ( 'not' ) ;
    public final void rule__UnaryElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2524:1: ( ( 'not' ) )
            // InternalDsl.g:2525:1: ( 'not' )
            {
            // InternalDsl.g:2525:1: ( 'not' )
            // InternalDsl.g:2526:2: 'not'
            {
             before(grammarAccess.getUnaryElementAccess().getNotKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getNotKeyword_4_0()); 

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
    // $ANTLR end "rule__UnaryElement__Group_4__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_4__1"
    // InternalDsl.g:2535:1: rule__UnaryElement__Group_4__1 : rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 ;
    public final void rule__UnaryElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2539:1: ( rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 )
            // InternalDsl.g:2540:2: rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__UnaryElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_4__2();

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
    // $ANTLR end "rule__UnaryElement__Group_4__1"


    // $ANTLR start "rule__UnaryElement__Group_4__1__Impl"
    // InternalDsl.g:2547:1: rule__UnaryElement__Group_4__1__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2551:1: ( ( () ) )
            // InternalDsl.g:2552:1: ( () )
            {
            // InternalDsl.g:2552:1: ( () )
            // InternalDsl.g:2553:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1()); 
            // InternalDsl.g:2554:2: ()
            // InternalDsl.g:2554:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_4__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_4__2"
    // InternalDsl.g:2562:1: rule__UnaryElement__Group_4__2 : rule__UnaryElement__Group_4__2__Impl ;
    public final void rule__UnaryElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2566:1: ( rule__UnaryElement__Group_4__2__Impl )
            // InternalDsl.g:2567:2: rule__UnaryElement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_4__2__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_4__2"


    // $ANTLR start "rule__UnaryElement__Group_4__2__Impl"
    // InternalDsl.g:2573:1: rule__UnaryElement__Group_4__2__Impl : ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) ;
    public final void rule__UnaryElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2577:1: ( ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) )
            // InternalDsl.g:2578:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            {
            // InternalDsl.g:2578:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            // InternalDsl.g:2579:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            {
             before(grammarAccess.getUnaryElementAccess().getExpAssignment_4_2()); 
            // InternalDsl.g:2580:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            // InternalDsl.g:2580:3: rule__UnaryElement__ExpAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ExpAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getExpAssignment_4_2()); 

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
    // $ANTLR end "rule__UnaryElement__Group_4__2__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // InternalDsl.g:2589:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2593:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalDsl.g:2594:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1();

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
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // InternalDsl.g:2601:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2605:1: ( ( RULE_INT ) )
            // InternalDsl.g:2606:1: ( RULE_INT )
            {
            // InternalDsl.g:2606:1: ( RULE_INT )
            // InternalDsl.g:2607:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // InternalDsl.g:2616:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2620:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // InternalDsl.g:2621:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__2();

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
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // InternalDsl.g:2628:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2632:1: ( ( '.' ) )
            // InternalDsl.g:2633:1: ( '.' )
            {
            // InternalDsl.g:2633:1: ( '.' )
            // InternalDsl.g:2634:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__2"
    // InternalDsl.g:2643:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2647:1: ( rule__NUMBER__Group_1__2__Impl )
            // InternalDsl.g:2648:2: rule__NUMBER__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__2__Impl();

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
    // $ANTLR end "rule__NUMBER__Group_1__2"


    // $ANTLR start "rule__NUMBER__Group_1__2__Impl"
    // InternalDsl.g:2654:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2658:1: ( ( RULE_INT ) )
            // InternalDsl.g:2659:1: ( RULE_INT )
            {
            // InternalDsl.g:2659:1: ( RULE_INT )
            // InternalDsl.g:2660:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__NUMBER__Group_1__2__Impl"


    // $ANTLR start "rule__EXTENDED_STRING__Group__0"
    // InternalDsl.g:2670:1: rule__EXTENDED_STRING__Group__0 : rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 ;
    public final void rule__EXTENDED_STRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2674:1: ( rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 )
            // InternalDsl.g:2675:2: rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EXTENDED_STRING__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group__1();

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
    // $ANTLR end "rule__EXTENDED_STRING__Group__0"


    // $ANTLR start "rule__EXTENDED_STRING__Group__0__Impl"
    // InternalDsl.g:2682:1: rule__EXTENDED_STRING__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2686:1: ( ( RULE_ID ) )
            // InternalDsl.g:2687:1: ( RULE_ID )
            {
            // InternalDsl.g:2687:1: ( RULE_ID )
            // InternalDsl.g:2688:2: RULE_ID
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EXTENDED_STRING__Group__0__Impl"


    // $ANTLR start "rule__EXTENDED_STRING__Group__1"
    // InternalDsl.g:2697:1: rule__EXTENDED_STRING__Group__1 : rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 ;
    public final void rule__EXTENDED_STRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2701:1: ( rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 )
            // InternalDsl.g:2702:2: rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__EXTENDED_STRING__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group__2();

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
    // $ANTLR end "rule__EXTENDED_STRING__Group__1"


    // $ANTLR start "rule__EXTENDED_STRING__Group__1__Impl"
    // InternalDsl.g:2709:1: rule__EXTENDED_STRING__Group__1__Impl : ( ( rule__EXTENDED_STRING__Group_1__0 )* ) ;
    public final void rule__EXTENDED_STRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2713:1: ( ( ( rule__EXTENDED_STRING__Group_1__0 )* ) )
            // InternalDsl.g:2714:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            {
            // InternalDsl.g:2714:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            // InternalDsl.g:2715:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_1()); 
            // InternalDsl.g:2716:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:2716:3: rule__EXTENDED_STRING__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__EXTENDED_STRING__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEXTENDED_STRINGAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EXTENDED_STRING__Group__1__Impl"


    // $ANTLR start "rule__EXTENDED_STRING__Group__2"
    // InternalDsl.g:2724:1: rule__EXTENDED_STRING__Group__2 : rule__EXTENDED_STRING__Group__2__Impl ;
    public final void rule__EXTENDED_STRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2728:1: ( rule__EXTENDED_STRING__Group__2__Impl )
            // InternalDsl.g:2729:2: rule__EXTENDED_STRING__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group__2__Impl();

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
    // $ANTLR end "rule__EXTENDED_STRING__Group__2"


    // $ANTLR start "rule__EXTENDED_STRING__Group__2__Impl"
    // InternalDsl.g:2735:1: rule__EXTENDED_STRING__Group__2__Impl : ( ( rule__EXTENDED_STRING__Group_2__0 )? ) ;
    public final void rule__EXTENDED_STRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2739:1: ( ( ( rule__EXTENDED_STRING__Group_2__0 )? ) )
            // InternalDsl.g:2740:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            {
            // InternalDsl.g:2740:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            // InternalDsl.g:2741:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_2()); 
            // InternalDsl.g:2742:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==32) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:2742:3: rule__EXTENDED_STRING__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXTENDED_STRING__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEXTENDED_STRINGAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EXTENDED_STRING__Group__2__Impl"


    // $ANTLR start "rule__EXTENDED_STRING__Group_1__0"
    // InternalDsl.g:2751:1: rule__EXTENDED_STRING__Group_1__0 : rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 ;
    public final void rule__EXTENDED_STRING__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2755:1: ( rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 )
            // InternalDsl.g:2756:2: rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__EXTENDED_STRING__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group_1__1();

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_1__0"


    // $ANTLR start "rule__EXTENDED_STRING__Group_1__0__Impl"
    // InternalDsl.g:2763:1: rule__EXTENDED_STRING__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EXTENDED_STRING__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2767:1: ( ( '.' ) )
            // InternalDsl.g:2768:1: ( '.' )
            {
            // InternalDsl.g:2768:1: ( '.' )
            // InternalDsl.g:2769:2: '.'
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEXTENDED_STRINGAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_1__0__Impl"


    // $ANTLR start "rule__EXTENDED_STRING__Group_1__1"
    // InternalDsl.g:2778:1: rule__EXTENDED_STRING__Group_1__1 : rule__EXTENDED_STRING__Group_1__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2782:1: ( rule__EXTENDED_STRING__Group_1__1__Impl )
            // InternalDsl.g:2783:2: rule__EXTENDED_STRING__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group_1__1__Impl();

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_1__1"


    // $ANTLR start "rule__EXTENDED_STRING__Group_1__1__Impl"
    // InternalDsl.g:2789:1: rule__EXTENDED_STRING__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2793:1: ( ( RULE_ID ) )
            // InternalDsl.g:2794:1: ( RULE_ID )
            {
            // InternalDsl.g:2794:1: ( RULE_ID )
            // InternalDsl.g:2795:2: RULE_ID
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEXTENDED_STRINGAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_1__1__Impl"


    // $ANTLR start "rule__EXTENDED_STRING__Group_2__0"
    // InternalDsl.g:2805:1: rule__EXTENDED_STRING__Group_2__0 : rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 ;
    public final void rule__EXTENDED_STRING__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2809:1: ( rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 )
            // InternalDsl.g:2810:2: rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__EXTENDED_STRING__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group_2__1();

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_2__0"


    // $ANTLR start "rule__EXTENDED_STRING__Group_2__0__Impl"
    // InternalDsl.g:2817:1: rule__EXTENDED_STRING__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EXTENDED_STRING__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2821:1: ( ( '(' ) )
            // InternalDsl.g:2822:1: ( '(' )
            {
            // InternalDsl.g:2822:1: ( '(' )
            // InternalDsl.g:2823:2: '('
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEXTENDED_STRINGAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_2__0__Impl"


    // $ANTLR start "rule__EXTENDED_STRING__Group_2__1"
    // InternalDsl.g:2832:1: rule__EXTENDED_STRING__Group_2__1 : rule__EXTENDED_STRING__Group_2__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2836:1: ( rule__EXTENDED_STRING__Group_2__1__Impl )
            // InternalDsl.g:2837:2: rule__EXTENDED_STRING__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EXTENDED_STRING__Group_2__1__Impl();

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_2__1"


    // $ANTLR start "rule__EXTENDED_STRING__Group_2__1__Impl"
    // InternalDsl.g:2843:1: rule__EXTENDED_STRING__Group_2__1__Impl : ( ')' ) ;
    public final void rule__EXTENDED_STRING__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2847:1: ( ( ')' ) )
            // InternalDsl.g:2848:1: ( ')' )
            {
            // InternalDsl.g:2848:1: ( ')' )
            // InternalDsl.g:2849:2: ')'
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getRightParenthesisKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEXTENDED_STRINGAccess().getRightParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__EXTENDED_STRING__Group_2__1__Impl"


    // $ANTLR start "rule__RunTimeModel__AppDataAssignment"
    // InternalDsl.g:2859:1: rule__RunTimeModel__AppDataAssignment : ( ruleAppMetaData ) ;
    public final void rule__RunTimeModel__AppDataAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2863:1: ( ( ruleAppMetaData ) )
            // InternalDsl.g:2864:2: ( ruleAppMetaData )
            {
            // InternalDsl.g:2864:2: ( ruleAppMetaData )
            // InternalDsl.g:2865:3: ruleAppMetaData
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


    // $ANTLR start "rule__AppMetaData__AppIDAssignment_1"
    // InternalDsl.g:2874:1: rule__AppMetaData__AppIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppMetaData__AppIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2878:1: ( ( RULE_ID ) )
            // InternalDsl.g:2879:2: ( RULE_ID )
            {
            // InternalDsl.g:2879:2: ( RULE_ID )
            // InternalDsl.g:2880:3: RULE_ID
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AppMetaData__AppIDAssignment_1"


    // $ANTLR start "rule__AppMetaData__SpecificationsAssignment_3"
    // InternalDsl.g:2889:1: rule__AppMetaData__SpecificationsAssignment_3 : ( ruleAppSpecification ) ;
    public final void rule__AppMetaData__SpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2893:1: ( ( ruleAppSpecification ) )
            // InternalDsl.g:2894:2: ( ruleAppSpecification )
            {
            // InternalDsl.g:2894:2: ( ruleAppSpecification )
            // InternalDsl.g:2895:3: ruleAppSpecification
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAppSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAppSpecification();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getSpecificationsAppSpecificationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AppMetaData__SpecificationsAssignment_3"


    // $ANTLR start "rule__AppSpecification__SpecIDAssignment_0"
    // InternalDsl.g:2904:1: rule__AppSpecification__SpecIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__AppSpecification__SpecIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2908:1: ( ( RULE_ID ) )
            // InternalDsl.g:2909:2: ( RULE_ID )
            {
            // InternalDsl.g:2909:2: ( RULE_ID )
            // InternalDsl.g:2910:3: RULE_ID
            {
             before(grammarAccess.getAppSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AppSpecification__SpecIDAssignment_0"


    // $ANTLR start "rule__AppSpecification__TriggerAssignment_2"
    // InternalDsl.g:2919:1: rule__AppSpecification__TriggerAssignment_2 : ( ruleOrElement ) ;
    public final void rule__AppSpecification__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2923:1: ( ( ruleOrElement ) )
            // InternalDsl.g:2924:2: ( ruleOrElement )
            {
            // InternalDsl.g:2924:2: ( ruleOrElement )
            // InternalDsl.g:2925:3: ruleOrElement
            {
             before(grammarAccess.getAppSpecificationAccess().getTriggerOrElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getTriggerOrElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AppSpecification__TriggerAssignment_2"


    // $ANTLR start "rule__AppSpecification__ConditionAssignment_4"
    // InternalDsl.g:2934:1: rule__AppSpecification__ConditionAssignment_4 : ( ruleOrElement ) ;
    public final void rule__AppSpecification__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2938:1: ( ( ruleOrElement ) )
            // InternalDsl.g:2939:2: ( ruleOrElement )
            {
            // InternalDsl.g:2939:2: ( ruleOrElement )
            // InternalDsl.g:2940:3: ruleOrElement
            {
             before(grammarAccess.getAppSpecificationAccess().getConditionOrElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getConditionOrElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AppSpecification__ConditionAssignment_4"


    // $ANTLR start "rule__AppSpecification__ActionAssignment_6"
    // InternalDsl.g:2949:1: rule__AppSpecification__ActionAssignment_6 : ( ruleAndElement ) ;
    public final void rule__AppSpecification__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2953:1: ( ( ruleAndElement ) )
            // InternalDsl.g:2954:2: ( ruleAndElement )
            {
            // InternalDsl.g:2954:2: ( ruleAndElement )
            // InternalDsl.g:2955:3: ruleAndElement
            {
             before(grammarAccess.getAppSpecificationAccess().getActionAndElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAndElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getActionAndElementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AppSpecification__ActionAssignment_6"


    // $ANTLR start "rule__OrElement__RightAssignment_1_2"
    // InternalDsl.g:2964:1: rule__OrElement__RightAssignment_1_2 : ( ruleAndElement ) ;
    public final void rule__OrElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2968:1: ( ( ruleAndElement ) )
            // InternalDsl.g:2969:2: ( ruleAndElement )
            {
            // InternalDsl.g:2969:2: ( ruleAndElement )
            // InternalDsl.g:2970:3: ruleAndElement
            {
             before(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndElement();

            state._fsp--;

             after(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrElement__RightAssignment_1_2"


    // $ANTLR start "rule__AndElement__RightAssignment_1_2"
    // InternalDsl.g:2979:1: rule__AndElement__RightAssignment_1_2 : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2983:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:2984:2: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:2984:2: ( ruleDiffEqualElement )
            // InternalDsl.g:2985:3: ruleDiffEqualElement
            {
             before(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDiffEqualElement();

            state._fsp--;

             after(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndElement__RightAssignment_1_2"


    // $ANTLR start "rule__DiffEqualElement__RightAssignment_1_0_2"
    // InternalDsl.g:2994:1: rule__DiffEqualElement__RightAssignment_1_0_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2998:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:2999:2: ( ruleCompareElement )
            {
            // InternalDsl.g:2999:2: ( ruleCompareElement )
            // InternalDsl.g:3000:3: ruleCompareElement
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__DiffEqualElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__DiffEqualElement__RightAssignment_1_1_2"
    // InternalDsl.g:3009:1: rule__DiffEqualElement__RightAssignment_1_1_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3013:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:3014:2: ( ruleCompareElement )
            {
            // InternalDsl.g:3014:2: ( ruleCompareElement )
            // InternalDsl.g:3015:3: ruleCompareElement
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__DiffEqualElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_0_2"
    // InternalDsl.g:3024:1: rule__CompareElement__RightAssignment_1_0_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3028:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:3029:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:3029:2: ( rulePlusMinusElement )
            // InternalDsl.g:3030:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__CompareElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_1_2"
    // InternalDsl.g:3039:1: rule__CompareElement__RightAssignment_1_1_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3043:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:3044:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:3044:2: ( rulePlusMinusElement )
            // InternalDsl.g:3045:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__CompareElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_2_2"
    // InternalDsl.g:3054:1: rule__CompareElement__RightAssignment_1_2_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3058:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:3059:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:3059:2: ( rulePlusMinusElement )
            // InternalDsl.g:3060:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__CompareElement__RightAssignment_1_2_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_3_2"
    // InternalDsl.g:3069:1: rule__CompareElement__RightAssignment_1_3_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3073:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:3074:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:3074:2: ( rulePlusMinusElement )
            // InternalDsl.g:3075:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0()); 

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
    // $ANTLR end "rule__CompareElement__RightAssignment_1_3_2"


    // $ANTLR start "rule__PlusMinusElement__RightAssignment_1_0_2"
    // InternalDsl.g:3084:1: rule__PlusMinusElement__RightAssignment_1_0_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3088:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:3089:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:3089:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:3090:3: ruleMultiplicationDivisionElement
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__PlusMinusElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__PlusMinusElement__RightAssignment_1_1_2"
    // InternalDsl.g:3099:1: rule__PlusMinusElement__RightAssignment_1_1_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3103:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:3104:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:3104:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:3105:3: ruleMultiplicationDivisionElement
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__PlusMinusElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__MultiplicationDivisionElement__RightAssignment_1_0_2"
    // InternalDsl.g:3114:1: rule__MultiplicationDivisionElement__RightAssignment_1_0_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3118:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:3119:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:3119:2: ( ruleUnaryElement )
            // InternalDsl.g:3120:3: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__MultiplicationDivisionElement__RightAssignment_1_1_2"
    // InternalDsl.g:3129:1: rule__MultiplicationDivisionElement__RightAssignment_1_1_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3133:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:3134:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:3134:2: ( ruleUnaryElement )
            // InternalDsl.g:3135:3: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__MultiplicationDivisionElement__RightAssignment_1_2_2"
    // InternalDsl.g:3144:1: rule__MultiplicationDivisionElement__RightAssignment_1_2_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3148:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:3149:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:3149:2: ( ruleUnaryElement )
            // InternalDsl.g:3150:3: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__RightAssignment_1_2_2"


    // $ANTLR start "rule__UnaryElement__ValueAssignment_0_1"
    // InternalDsl.g:3159:1: rule__UnaryElement__ValueAssignment_0_1 : ( ruleNUMBER ) ;
    public final void rule__UnaryElement__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3163:1: ( ( ruleNUMBER ) )
            // InternalDsl.g:3164:2: ( ruleNUMBER )
            {
            // InternalDsl.g:3164:2: ( ruleNUMBER )
            // InternalDsl.g:3165:3: ruleNUMBER
            {
             before(grammarAccess.getUnaryElementAccess().getValueNUMBERParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getValueNUMBERParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__UnaryElement__ValueAssignment_0_1"


    // $ANTLR start "rule__UnaryElement__ValueAssignment_1_1"
    // InternalDsl.g:3174:1: rule__UnaryElement__ValueAssignment_1_1 : ( ruleEXTENDED_STRING ) ;
    public final void rule__UnaryElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3178:1: ( ( ruleEXTENDED_STRING ) )
            // InternalDsl.g:3179:2: ( ruleEXTENDED_STRING )
            {
            // InternalDsl.g:3179:2: ( ruleEXTENDED_STRING )
            // InternalDsl.g:3180:3: ruleEXTENDED_STRING
            {
             before(grammarAccess.getUnaryElementAccess().getValueEXTENDED_STRINGParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEXTENDED_STRING();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getValueEXTENDED_STRINGParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__UnaryElement__ValueAssignment_1_1"


    // $ANTLR start "rule__UnaryElement__ValueAssignment_2_1"
    // InternalDsl.g:3189:1: rule__UnaryElement__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__UnaryElement__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3193:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:3194:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:3194:2: ( RULE_BOOLEAN )
            // InternalDsl.g:3195:3: RULE_BOOLEAN
            {
             before(grammarAccess.getUnaryElementAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__UnaryElement__ValueAssignment_2_1"


    // $ANTLR start "rule__UnaryElement__ExpAssignment_4_2"
    // InternalDsl.g:3204:1: rule__UnaryElement__ExpAssignment_4_2 : ( ruleUnaryElement ) ;
    public final void rule__UnaryElement__ExpAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3208:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:3209:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:3209:2: ( ruleUnaryElement )
            // InternalDsl.g:3210:3: ruleUnaryElement
            {
             before(grammarAccess.getUnaryElementAccess().getExpUnaryElementParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getExpUnaryElementParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__UnaryElement__ExpAssignment_4_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000280010070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000280000072L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000280000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});

}