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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'AppMeta'", "'on'", "'if'", "'do'", "'or'", "'and'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'not'", "'.'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "rule__DiffEqualElement__Alternatives_1"
    // InternalDsl.g:377:1: rule__DiffEqualElement__Alternatives_1 : ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) );
    public final void rule__DiffEqualElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:381:1: ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) )
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
                    // InternalDsl.g:382:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:382:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    // InternalDsl.g:383:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:384:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    // InternalDsl.g:384:4: rule__DiffEqualElement__Group_1_0__0
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
                    // InternalDsl.g:388:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:388:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    // InternalDsl.g:389:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:390:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    // InternalDsl.g:390:4: rule__DiffEqualElement__Group_1_1__0
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
    // InternalDsl.g:398:1: rule__CompareElement__Alternatives_1 : ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) );
    public final void rule__CompareElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:402:1: ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) )
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
                    // InternalDsl.g:403:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:403:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    // InternalDsl.g:404:3: ( rule__CompareElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:405:3: ( rule__CompareElement__Group_1_0__0 )
                    // InternalDsl.g:405:4: rule__CompareElement__Group_1_0__0
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
                    // InternalDsl.g:409:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:409:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    // InternalDsl.g:410:3: ( rule__CompareElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:411:3: ( rule__CompareElement__Group_1_1__0 )
                    // InternalDsl.g:411:4: rule__CompareElement__Group_1_1__0
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
                    // InternalDsl.g:415:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:415:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    // InternalDsl.g:416:3: ( rule__CompareElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:417:3: ( rule__CompareElement__Group_1_2__0 )
                    // InternalDsl.g:417:4: rule__CompareElement__Group_1_2__0
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
                    // InternalDsl.g:421:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    {
                    // InternalDsl.g:421:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    // InternalDsl.g:422:3: ( rule__CompareElement__Group_1_3__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_3()); 
                    // InternalDsl.g:423:3: ( rule__CompareElement__Group_1_3__0 )
                    // InternalDsl.g:423:4: rule__CompareElement__Group_1_3__0
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
    // InternalDsl.g:431:1: rule__PlusMinusElement__Alternatives_1 : ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) );
    public final void rule__PlusMinusElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:435:1: ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) )
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
                    // InternalDsl.g:436:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:436:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    // InternalDsl.g:437:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:438:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    // InternalDsl.g:438:4: rule__PlusMinusElement__Group_1_0__0
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
                    // InternalDsl.g:442:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:442:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    // InternalDsl.g:443:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:444:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    // InternalDsl.g:444:4: rule__PlusMinusElement__Group_1_1__0
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
    // InternalDsl.g:452:1: rule__MultiplicationDivisionElement__Alternatives_1 : ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) );
    public final void rule__MultiplicationDivisionElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:456:1: ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) )
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
                    // InternalDsl.g:457:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:457:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    // InternalDsl.g:458:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:459:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    // InternalDsl.g:459:4: rule__MultiplicationDivisionElement__Group_1_0__0
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
                    // InternalDsl.g:463:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:463:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    // InternalDsl.g:464:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:465:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    // InternalDsl.g:465:4: rule__MultiplicationDivisionElement__Group_1_1__0
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
                    // InternalDsl.g:469:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:469:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    // InternalDsl.g:470:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:471:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    // InternalDsl.g:471:4: rule__MultiplicationDivisionElement__Group_1_2__0
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
    // InternalDsl.g:479:1: rule__UnaryElement__Alternatives : ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) );
    public final void rule__UnaryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:483:1: ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
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
                    // InternalDsl.g:484:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    {
                    // InternalDsl.g:484:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    // InternalDsl.g:485:3: ( rule__UnaryElement__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_0()); 
                    // InternalDsl.g:486:3: ( rule__UnaryElement__Group_0__0 )
                    // InternalDsl.g:486:4: rule__UnaryElement__Group_0__0
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
                    // InternalDsl.g:490:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    {
                    // InternalDsl.g:490:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    // InternalDsl.g:491:3: ( rule__UnaryElement__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_1()); 
                    // InternalDsl.g:492:3: ( rule__UnaryElement__Group_1__0 )
                    // InternalDsl.g:492:4: rule__UnaryElement__Group_1__0
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
                    // InternalDsl.g:496:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    {
                    // InternalDsl.g:496:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    // InternalDsl.g:497:3: ( rule__UnaryElement__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_2()); 
                    // InternalDsl.g:498:3: ( rule__UnaryElement__Group_2__0 )
                    // InternalDsl.g:498:4: rule__UnaryElement__Group_2__0
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
                    // InternalDsl.g:502:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    {
                    // InternalDsl.g:502:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    // InternalDsl.g:503:3: ( rule__UnaryElement__Group_3__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_3()); 
                    // InternalDsl.g:504:3: ( rule__UnaryElement__Group_3__0 )
                    // InternalDsl.g:504:4: rule__UnaryElement__Group_3__0
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
                    // InternalDsl.g:508:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    {
                    // InternalDsl.g:508:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    // InternalDsl.g:509:3: ( rule__UnaryElement__Group_4__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_4()); 
                    // InternalDsl.g:510:3: ( rule__UnaryElement__Group_4__0 )
                    // InternalDsl.g:510:4: rule__UnaryElement__Group_4__0
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
    // InternalDsl.g:518:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:522:1: ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==34) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_INT||(LA7_1>=RULE_STRING && LA7_1<=RULE_BOOLEAN)||(LA7_1>=16 && LA7_1<=33)) ) {
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
                    // InternalDsl.g:523:2: ( RULE_INT )
                    {
                    // InternalDsl.g:523:2: ( RULE_INT )
                    // InternalDsl.g:524:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:529:2: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // InternalDsl.g:529:2: ( ( rule__NUMBER__Group_1__0 ) )
                    // InternalDsl.g:530:3: ( rule__NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    // InternalDsl.g:531:3: ( rule__NUMBER__Group_1__0 )
                    // InternalDsl.g:531:4: rule__NUMBER__Group_1__0
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
    // InternalDsl.g:539:1: rule__AppMetaData__Group__0 : rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 ;
    public final void rule__AppMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:543:1: ( rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 )
            // InternalDsl.g:544:2: rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1
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
    // InternalDsl.g:551:1: rule__AppMetaData__Group__0__Impl : ( 'AppMeta' ) ;
    public final void rule__AppMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:555:1: ( ( 'AppMeta' ) )
            // InternalDsl.g:556:1: ( 'AppMeta' )
            {
            // InternalDsl.g:556:1: ( 'AppMeta' )
            // InternalDsl.g:557:2: 'AppMeta'
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
    // InternalDsl.g:566:1: rule__AppMetaData__Group__1 : rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 ;
    public final void rule__AppMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:570:1: ( rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 )
            // InternalDsl.g:571:2: rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2
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
    // InternalDsl.g:578:1: rule__AppMetaData__Group__1__Impl : ( ( rule__AppMetaData__AppIDAssignment_1 ) ) ;
    public final void rule__AppMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:582:1: ( ( ( rule__AppMetaData__AppIDAssignment_1 ) ) )
            // InternalDsl.g:583:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            {
            // InternalDsl.g:583:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            // InternalDsl.g:584:2: ( rule__AppMetaData__AppIDAssignment_1 )
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 
            // InternalDsl.g:585:2: ( rule__AppMetaData__AppIDAssignment_1 )
            // InternalDsl.g:585:3: rule__AppMetaData__AppIDAssignment_1
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
    // InternalDsl.g:593:1: rule__AppMetaData__Group__2 : rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 ;
    public final void rule__AppMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:597:1: ( rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 )
            // InternalDsl.g:598:2: rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3
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
    // InternalDsl.g:605:1: rule__AppMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__AppMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:609:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:610:1: ( ruleLBRACE )
            {
            // InternalDsl.g:610:1: ( ruleLBRACE )
            // InternalDsl.g:611:2: ruleLBRACE
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
    // InternalDsl.g:620:1: rule__AppMetaData__Group__3 : rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 ;
    public final void rule__AppMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:624:1: ( rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 )
            // InternalDsl.g:625:2: rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4
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
    // InternalDsl.g:632:1: rule__AppMetaData__Group__3__Impl : ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) ;
    public final void rule__AppMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:636:1: ( ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) )
            // InternalDsl.g:637:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            {
            // InternalDsl.g:637:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            // InternalDsl.g:638:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_3()); 
            // InternalDsl.g:639:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:639:3: rule__AppMetaData__SpecificationsAssignment_3
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
    // InternalDsl.g:647:1: rule__AppMetaData__Group__4 : rule__AppMetaData__Group__4__Impl ;
    public final void rule__AppMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:651:1: ( rule__AppMetaData__Group__4__Impl )
            // InternalDsl.g:652:2: rule__AppMetaData__Group__4__Impl
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
    // InternalDsl.g:658:1: rule__AppMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__AppMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:662:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:663:1: ( ruleRBRACE )
            {
            // InternalDsl.g:663:1: ( ruleRBRACE )
            // InternalDsl.g:664:2: ruleRBRACE
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
    // InternalDsl.g:674:1: rule__AppSpecification__Group__0 : rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 ;
    public final void rule__AppSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:678:1: ( rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 )
            // InternalDsl.g:679:2: rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1
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
    // InternalDsl.g:686:1: rule__AppSpecification__Group__0__Impl : ( 'on' ) ;
    public final void rule__AppSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:690:1: ( ( 'on' ) )
            // InternalDsl.g:691:1: ( 'on' )
            {
            // InternalDsl.g:691:1: ( 'on' )
            // InternalDsl.g:692:2: 'on'
            {
             before(grammarAccess.getAppSpecificationAccess().getOnKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getOnKeyword_0()); 

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
    // InternalDsl.g:701:1: rule__AppSpecification__Group__1 : rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 ;
    public final void rule__AppSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:705:1: ( rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 )
            // InternalDsl.g:706:2: rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:713:1: rule__AppSpecification__Group__1__Impl : ( ( rule__AppSpecification__TriggerAssignment_1 )* ) ;
    public final void rule__AppSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:717:1: ( ( ( rule__AppSpecification__TriggerAssignment_1 )* ) )
            // InternalDsl.g:718:1: ( ( rule__AppSpecification__TriggerAssignment_1 )* )
            {
            // InternalDsl.g:718:1: ( ( rule__AppSpecification__TriggerAssignment_1 )* )
            // InternalDsl.g:719:2: ( rule__AppSpecification__TriggerAssignment_1 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getTriggerAssignment_1()); 
            // InternalDsl.g:720:2: ( rule__AppSpecification__TriggerAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||(LA9_0>=RULE_STRING && LA9_0<=RULE_BOOLEAN)||LA9_0==31||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:720:3: rule__AppSpecification__TriggerAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AppSpecification__TriggerAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDsl.g:728:1: rule__AppSpecification__Group__2 : rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 ;
    public final void rule__AppSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 )
            // InternalDsl.g:733:2: rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:740:1: rule__AppSpecification__Group__2__Impl : ( 'if' ) ;
    public final void rule__AppSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:744:1: ( ( 'if' ) )
            // InternalDsl.g:745:1: ( 'if' )
            {
            // InternalDsl.g:745:1: ( 'if' )
            // InternalDsl.g:746:2: 'if'
            {
             before(grammarAccess.getAppSpecificationAccess().getIfKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getIfKeyword_2()); 

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
    // InternalDsl.g:755:1: rule__AppSpecification__Group__3 : rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 ;
    public final void rule__AppSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 )
            // InternalDsl.g:760:2: rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:767:1: rule__AppSpecification__Group__3__Impl : ( ( rule__AppSpecification__ConditionAssignment_3 )* ) ;
    public final void rule__AppSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:771:1: ( ( ( rule__AppSpecification__ConditionAssignment_3 )* ) )
            // InternalDsl.g:772:1: ( ( rule__AppSpecification__ConditionAssignment_3 )* )
            {
            // InternalDsl.g:772:1: ( ( rule__AppSpecification__ConditionAssignment_3 )* )
            // InternalDsl.g:773:2: ( rule__AppSpecification__ConditionAssignment_3 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getConditionAssignment_3()); 
            // InternalDsl.g:774:2: ( rule__AppSpecification__ConditionAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT||(LA10_0>=RULE_STRING && LA10_0<=RULE_BOOLEAN)||LA10_0==31||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:774:3: rule__AppSpecification__ConditionAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AppSpecification__ConditionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDsl.g:782:1: rule__AppSpecification__Group__4 : rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 ;
    public final void rule__AppSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 )
            // InternalDsl.g:787:2: rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:794:1: rule__AppSpecification__Group__4__Impl : ( 'do' ) ;
    public final void rule__AppSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( ( 'do' ) )
            // InternalDsl.g:799:1: ( 'do' )
            {
            // InternalDsl.g:799:1: ( 'do' )
            // InternalDsl.g:800:2: 'do'
            {
             before(grammarAccess.getAppSpecificationAccess().getDoKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getDoKeyword_4()); 

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
    // InternalDsl.g:809:1: rule__AppSpecification__Group__5 : rule__AppSpecification__Group__5__Impl ;
    public final void rule__AppSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:813:1: ( rule__AppSpecification__Group__5__Impl )
            // InternalDsl.g:814:2: rule__AppSpecification__Group__5__Impl
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
    // InternalDsl.g:820:1: rule__AppSpecification__Group__5__Impl : ( ( ( rule__AppSpecification__ActionAssignment_5 ) ) ( ( rule__AppSpecification__ActionAssignment_5 )* ) ) ;
    public final void rule__AppSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:824:1: ( ( ( ( rule__AppSpecification__ActionAssignment_5 ) ) ( ( rule__AppSpecification__ActionAssignment_5 )* ) ) )
            // InternalDsl.g:825:1: ( ( ( rule__AppSpecification__ActionAssignment_5 ) ) ( ( rule__AppSpecification__ActionAssignment_5 )* ) )
            {
            // InternalDsl.g:825:1: ( ( ( rule__AppSpecification__ActionAssignment_5 ) ) ( ( rule__AppSpecification__ActionAssignment_5 )* ) )
            // InternalDsl.g:826:2: ( ( rule__AppSpecification__ActionAssignment_5 ) ) ( ( rule__AppSpecification__ActionAssignment_5 )* )
            {
            // InternalDsl.g:826:2: ( ( rule__AppSpecification__ActionAssignment_5 ) )
            // InternalDsl.g:827:3: ( rule__AppSpecification__ActionAssignment_5 )
            {
             before(grammarAccess.getAppSpecificationAccess().getActionAssignment_5()); 
            // InternalDsl.g:828:3: ( rule__AppSpecification__ActionAssignment_5 )
            // InternalDsl.g:828:4: rule__AppSpecification__ActionAssignment_5
            {
            pushFollow(FOLLOW_11);
            rule__AppSpecification__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAppSpecificationAccess().getActionAssignment_5()); 

            }

            // InternalDsl.g:831:2: ( ( rule__AppSpecification__ActionAssignment_5 )* )
            // InternalDsl.g:832:3: ( rule__AppSpecification__ActionAssignment_5 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getActionAssignment_5()); 
            // InternalDsl.g:833:3: ( rule__AppSpecification__ActionAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:833:4: rule__AppSpecification__ActionAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AppSpecification__ActionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAppSpecificationAccess().getActionAssignment_5()); 

            }


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


    // $ANTLR start "rule__OrElement__Group__0"
    // InternalDsl.g:843:1: rule__OrElement__Group__0 : rule__OrElement__Group__0__Impl rule__OrElement__Group__1 ;
    public final void rule__OrElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:847:1: ( rule__OrElement__Group__0__Impl rule__OrElement__Group__1 )
            // InternalDsl.g:848:2: rule__OrElement__Group__0__Impl rule__OrElement__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:855:1: rule__OrElement__Group__0__Impl : ( ruleAndElement ) ;
    public final void rule__OrElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:859:1: ( ( ruleAndElement ) )
            // InternalDsl.g:860:1: ( ruleAndElement )
            {
            // InternalDsl.g:860:1: ( ruleAndElement )
            // InternalDsl.g:861:2: ruleAndElement
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
    // InternalDsl.g:870:1: rule__OrElement__Group__1 : rule__OrElement__Group__1__Impl ;
    public final void rule__OrElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( rule__OrElement__Group__1__Impl )
            // InternalDsl.g:875:2: rule__OrElement__Group__1__Impl
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
    // InternalDsl.g:881:1: rule__OrElement__Group__1__Impl : ( ( rule__OrElement__Group_1__0 )* ) ;
    public final void rule__OrElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:885:1: ( ( ( rule__OrElement__Group_1__0 )* ) )
            // InternalDsl.g:886:1: ( ( rule__OrElement__Group_1__0 )* )
            {
            // InternalDsl.g:886:1: ( ( rule__OrElement__Group_1__0 )* )
            // InternalDsl.g:887:2: ( rule__OrElement__Group_1__0 )*
            {
             before(grammarAccess.getOrElementAccess().getGroup_1()); 
            // InternalDsl.g:888:2: ( rule__OrElement__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:888:3: rule__OrElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalDsl.g:897:1: rule__OrElement__Group_1__0 : rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 ;
    public final void rule__OrElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:901:1: ( rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 )
            // InternalDsl.g:902:2: rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:909:1: rule__OrElement__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__OrElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( ( 'or' ) )
            // InternalDsl.g:914:1: ( 'or' )
            {
            // InternalDsl.g:914:1: ( 'or' )
            // InternalDsl.g:915:2: 'or'
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
    // InternalDsl.g:924:1: rule__OrElement__Group_1__1 : rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 ;
    public final void rule__OrElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 )
            // InternalDsl.g:929:2: rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:936:1: rule__OrElement__Group_1__1__Impl : ( () ) ;
    public final void rule__OrElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:940:1: ( ( () ) )
            // InternalDsl.g:941:1: ( () )
            {
            // InternalDsl.g:941:1: ( () )
            // InternalDsl.g:942:2: ()
            {
             before(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 
            // InternalDsl.g:943:2: ()
            // InternalDsl.g:943:3: 
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
    // InternalDsl.g:951:1: rule__OrElement__Group_1__2 : rule__OrElement__Group_1__2__Impl ;
    public final void rule__OrElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:955:1: ( rule__OrElement__Group_1__2__Impl )
            // InternalDsl.g:956:2: rule__OrElement__Group_1__2__Impl
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
    // InternalDsl.g:962:1: rule__OrElement__Group_1__2__Impl : ( ( rule__OrElement__RightAssignment_1_2 ) ) ;
    public final void rule__OrElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:966:1: ( ( ( rule__OrElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:967:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:967:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            // InternalDsl.g:968:2: ( rule__OrElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:969:2: ( rule__OrElement__RightAssignment_1_2 )
            // InternalDsl.g:969:3: rule__OrElement__RightAssignment_1_2
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
    // InternalDsl.g:978:1: rule__AndElement__Group__0 : rule__AndElement__Group__0__Impl rule__AndElement__Group__1 ;
    public final void rule__AndElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:982:1: ( rule__AndElement__Group__0__Impl rule__AndElement__Group__1 )
            // InternalDsl.g:983:2: rule__AndElement__Group__0__Impl rule__AndElement__Group__1
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
    // InternalDsl.g:990:1: rule__AndElement__Group__0__Impl : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:994:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:995:1: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:995:1: ( ruleDiffEqualElement )
            // InternalDsl.g:996:2: ruleDiffEqualElement
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
    // InternalDsl.g:1005:1: rule__AndElement__Group__1 : rule__AndElement__Group__1__Impl ;
    public final void rule__AndElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1009:1: ( rule__AndElement__Group__1__Impl )
            // InternalDsl.g:1010:2: rule__AndElement__Group__1__Impl
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
    // InternalDsl.g:1016:1: rule__AndElement__Group__1__Impl : ( ( rule__AndElement__Group_1__0 )* ) ;
    public final void rule__AndElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1020:1: ( ( ( rule__AndElement__Group_1__0 )* ) )
            // InternalDsl.g:1021:1: ( ( rule__AndElement__Group_1__0 )* )
            {
            // InternalDsl.g:1021:1: ( ( rule__AndElement__Group_1__0 )* )
            // InternalDsl.g:1022:2: ( rule__AndElement__Group_1__0 )*
            {
             before(grammarAccess.getAndElementAccess().getGroup_1()); 
            // InternalDsl.g:1023:2: ( rule__AndElement__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1023:3: rule__AndElement__Group_1__0
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
    // InternalDsl.g:1032:1: rule__AndElement__Group_1__0 : rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 ;
    public final void rule__AndElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1036:1: ( rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 )
            // InternalDsl.g:1037:2: rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1044:1: rule__AndElement__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__AndElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( ( 'and' ) )
            // InternalDsl.g:1049:1: ( 'and' )
            {
            // InternalDsl.g:1049:1: ( 'and' )
            // InternalDsl.g:1050:2: 'and'
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
    // InternalDsl.g:1059:1: rule__AndElement__Group_1__1 : rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 ;
    public final void rule__AndElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1063:1: ( rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 )
            // InternalDsl.g:1064:2: rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1071:1: rule__AndElement__Group_1__1__Impl : ( () ) ;
    public final void rule__AndElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( ( () ) )
            // InternalDsl.g:1076:1: ( () )
            {
            // InternalDsl.g:1076:1: ( () )
            // InternalDsl.g:1077:2: ()
            {
             before(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 
            // InternalDsl.g:1078:2: ()
            // InternalDsl.g:1078:3: 
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
    // InternalDsl.g:1086:1: rule__AndElement__Group_1__2 : rule__AndElement__Group_1__2__Impl ;
    public final void rule__AndElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1090:1: ( rule__AndElement__Group_1__2__Impl )
            // InternalDsl.g:1091:2: rule__AndElement__Group_1__2__Impl
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
    // InternalDsl.g:1097:1: rule__AndElement__Group_1__2__Impl : ( ( rule__AndElement__RightAssignment_1_2 ) ) ;
    public final void rule__AndElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1101:1: ( ( ( rule__AndElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1102:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1102:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            // InternalDsl.g:1103:2: ( rule__AndElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1104:2: ( rule__AndElement__RightAssignment_1_2 )
            // InternalDsl.g:1104:3: rule__AndElement__RightAssignment_1_2
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
    // InternalDsl.g:1113:1: rule__DiffEqualElement__Group__0 : rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 ;
    public final void rule__DiffEqualElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1117:1: ( rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 )
            // InternalDsl.g:1118:2: rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1
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
    // InternalDsl.g:1125:1: rule__DiffEqualElement__Group__0__Impl : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:1130:1: ( ruleCompareElement )
            {
            // InternalDsl.g:1130:1: ( ruleCompareElement )
            // InternalDsl.g:1131:2: ruleCompareElement
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
    // InternalDsl.g:1140:1: rule__DiffEqualElement__Group__1 : rule__DiffEqualElement__Group__1__Impl ;
    public final void rule__DiffEqualElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1144:1: ( rule__DiffEqualElement__Group__1__Impl )
            // InternalDsl.g:1145:2: rule__DiffEqualElement__Group__1__Impl
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
    // InternalDsl.g:1151:1: rule__DiffEqualElement__Group__1__Impl : ( ( rule__DiffEqualElement__Alternatives_1 )* ) ;
    public final void rule__DiffEqualElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1155:1: ( ( ( rule__DiffEqualElement__Alternatives_1 )* ) )
            // InternalDsl.g:1156:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            {
            // InternalDsl.g:1156:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            // InternalDsl.g:1157:2: ( rule__DiffEqualElement__Alternatives_1 )*
            {
             before(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 
            // InternalDsl.g:1158:2: ( rule__DiffEqualElement__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=20 && LA14_0<=21)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1158:3: rule__DiffEqualElement__Alternatives_1
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
    // InternalDsl.g:1167:1: rule__DiffEqualElement__Group_1_0__0 : rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 ;
    public final void rule__DiffEqualElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1171:1: ( rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 )
            // InternalDsl.g:1172:2: rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1179:1: rule__DiffEqualElement__Group_1_0__0__Impl : ( '!=' ) ;
    public final void rule__DiffEqualElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( ( '!=' ) )
            // InternalDsl.g:1184:1: ( '!=' )
            {
            // InternalDsl.g:1184:1: ( '!=' )
            // InternalDsl.g:1185:2: '!='
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
    // InternalDsl.g:1194:1: rule__DiffEqualElement__Group_1_0__1 : rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 ;
    public final void rule__DiffEqualElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1198:1: ( rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 )
            // InternalDsl.g:1199:2: rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1206:1: rule__DiffEqualElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( ( () ) )
            // InternalDsl.g:1211:1: ( () )
            {
            // InternalDsl.g:1211:1: ( () )
            // InternalDsl.g:1212:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 
            // InternalDsl.g:1213:2: ()
            // InternalDsl.g:1213:3: 
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
    // InternalDsl.g:1221:1: rule__DiffEqualElement__Group_1_0__2 : rule__DiffEqualElement__Group_1_0__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1225:1: ( rule__DiffEqualElement__Group_1_0__2__Impl )
            // InternalDsl.g:1226:2: rule__DiffEqualElement__Group_1_0__2__Impl
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
    // InternalDsl.g:1232:1: rule__DiffEqualElement__Group_1_0__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1236:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1237:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1237:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1238:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:1239:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            // InternalDsl.g:1239:3: rule__DiffEqualElement__RightAssignment_1_0_2
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
    // InternalDsl.g:1248:1: rule__DiffEqualElement__Group_1_1__0 : rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 ;
    public final void rule__DiffEqualElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1252:1: ( rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 )
            // InternalDsl.g:1253:2: rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1260:1: rule__DiffEqualElement__Group_1_1__0__Impl : ( '==' ) ;
    public final void rule__DiffEqualElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( ( '==' ) )
            // InternalDsl.g:1265:1: ( '==' )
            {
            // InternalDsl.g:1265:1: ( '==' )
            // InternalDsl.g:1266:2: '=='
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
    // InternalDsl.g:1275:1: rule__DiffEqualElement__Group_1_1__1 : rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 ;
    public final void rule__DiffEqualElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 )
            // InternalDsl.g:1280:2: rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1287:1: rule__DiffEqualElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1291:1: ( ( () ) )
            // InternalDsl.g:1292:1: ( () )
            {
            // InternalDsl.g:1292:1: ( () )
            // InternalDsl.g:1293:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:1294:2: ()
            // InternalDsl.g:1294:3: 
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
    // InternalDsl.g:1302:1: rule__DiffEqualElement__Group_1_1__2 : rule__DiffEqualElement__Group_1_1__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1306:1: ( rule__DiffEqualElement__Group_1_1__2__Impl )
            // InternalDsl.g:1307:2: rule__DiffEqualElement__Group_1_1__2__Impl
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
    // InternalDsl.g:1313:1: rule__DiffEqualElement__Group_1_1__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1317:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1318:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1318:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1319:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:1320:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            // InternalDsl.g:1320:3: rule__DiffEqualElement__RightAssignment_1_1_2
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
    // InternalDsl.g:1329:1: rule__CompareElement__Group__0 : rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 ;
    public final void rule__CompareElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1333:1: ( rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 )
            // InternalDsl.g:1334:2: rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1
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
    // InternalDsl.g:1341:1: rule__CompareElement__Group__0__Impl : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1345:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:1346:1: ( rulePlusMinusElement )
            {
            // InternalDsl.g:1346:1: ( rulePlusMinusElement )
            // InternalDsl.g:1347:2: rulePlusMinusElement
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
    // InternalDsl.g:1356:1: rule__CompareElement__Group__1 : rule__CompareElement__Group__1__Impl ;
    public final void rule__CompareElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1360:1: ( rule__CompareElement__Group__1__Impl )
            // InternalDsl.g:1361:2: rule__CompareElement__Group__1__Impl
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
    // InternalDsl.g:1367:1: rule__CompareElement__Group__1__Impl : ( ( rule__CompareElement__Alternatives_1 )* ) ;
    public final void rule__CompareElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1371:1: ( ( ( rule__CompareElement__Alternatives_1 )* ) )
            // InternalDsl.g:1372:1: ( ( rule__CompareElement__Alternatives_1 )* )
            {
            // InternalDsl.g:1372:1: ( ( rule__CompareElement__Alternatives_1 )* )
            // InternalDsl.g:1373:2: ( rule__CompareElement__Alternatives_1 )*
            {
             before(grammarAccess.getCompareElementAccess().getAlternatives_1()); 
            // InternalDsl.g:1374:2: ( rule__CompareElement__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=22 && LA15_0<=25)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1374:3: rule__CompareElement__Alternatives_1
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
    // InternalDsl.g:1383:1: rule__CompareElement__Group_1_0__0 : rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 ;
    public final void rule__CompareElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 )
            // InternalDsl.g:1388:2: rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1395:1: rule__CompareElement__Group_1_0__0__Impl : ( '>' ) ;
    public final void rule__CompareElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( ( '>' ) )
            // InternalDsl.g:1400:1: ( '>' )
            {
            // InternalDsl.g:1400:1: ( '>' )
            // InternalDsl.g:1401:2: '>'
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
    // InternalDsl.g:1410:1: rule__CompareElement__Group_1_0__1 : rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 ;
    public final void rule__CompareElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 )
            // InternalDsl.g:1415:2: rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1422:1: rule__CompareElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1426:1: ( ( () ) )
            // InternalDsl.g:1427:1: ( () )
            {
            // InternalDsl.g:1427:1: ( () )
            // InternalDsl.g:1428:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 
            // InternalDsl.g:1429:2: ()
            // InternalDsl.g:1429:3: 
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
    // InternalDsl.g:1437:1: rule__CompareElement__Group_1_0__2 : rule__CompareElement__Group_1_0__2__Impl ;
    public final void rule__CompareElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1441:1: ( rule__CompareElement__Group_1_0__2__Impl )
            // InternalDsl.g:1442:2: rule__CompareElement__Group_1_0__2__Impl
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
    // InternalDsl.g:1448:1: rule__CompareElement__Group_1_0__2__Impl : ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__CompareElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1452:1: ( ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1453:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1453:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1454:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:1455:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            // InternalDsl.g:1455:3: rule__CompareElement__RightAssignment_1_0_2
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
    // InternalDsl.g:1464:1: rule__CompareElement__Group_1_1__0 : rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 ;
    public final void rule__CompareElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1468:1: ( rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 )
            // InternalDsl.g:1469:2: rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1476:1: rule__CompareElement__Group_1_1__0__Impl : ( '>=' ) ;
    public final void rule__CompareElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1480:1: ( ( '>=' ) )
            // InternalDsl.g:1481:1: ( '>=' )
            {
            // InternalDsl.g:1481:1: ( '>=' )
            // InternalDsl.g:1482:2: '>='
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
    // InternalDsl.g:1491:1: rule__CompareElement__Group_1_1__1 : rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 ;
    public final void rule__CompareElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1495:1: ( rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 )
            // InternalDsl.g:1496:2: rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1503:1: rule__CompareElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( ( () ) )
            // InternalDsl.g:1508:1: ( () )
            {
            // InternalDsl.g:1508:1: ( () )
            // InternalDsl.g:1509:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:1510:2: ()
            // InternalDsl.g:1510:3: 
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
    // InternalDsl.g:1518:1: rule__CompareElement__Group_1_1__2 : rule__CompareElement__Group_1_1__2__Impl ;
    public final void rule__CompareElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( rule__CompareElement__Group_1_1__2__Impl )
            // InternalDsl.g:1523:2: rule__CompareElement__Group_1_1__2__Impl
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
    // InternalDsl.g:1529:1: rule__CompareElement__Group_1_1__2__Impl : ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__CompareElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1533:1: ( ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1534:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1534:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1535:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:1536:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            // InternalDsl.g:1536:3: rule__CompareElement__RightAssignment_1_1_2
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
    // InternalDsl.g:1545:1: rule__CompareElement__Group_1_2__0 : rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 ;
    public final void rule__CompareElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1549:1: ( rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 )
            // InternalDsl.g:1550:2: rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1557:1: rule__CompareElement__Group_1_2__0__Impl : ( '<' ) ;
    public final void rule__CompareElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1561:1: ( ( '<' ) )
            // InternalDsl.g:1562:1: ( '<' )
            {
            // InternalDsl.g:1562:1: ( '<' )
            // InternalDsl.g:1563:2: '<'
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
    // InternalDsl.g:1572:1: rule__CompareElement__Group_1_2__1 : rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 ;
    public final void rule__CompareElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 )
            // InternalDsl.g:1577:2: rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1584:1: rule__CompareElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( ( () ) )
            // InternalDsl.g:1589:1: ( () )
            {
            // InternalDsl.g:1589:1: ( () )
            // InternalDsl.g:1590:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 
            // InternalDsl.g:1591:2: ()
            // InternalDsl.g:1591:3: 
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
    // InternalDsl.g:1599:1: rule__CompareElement__Group_1_2__2 : rule__CompareElement__Group_1_2__2__Impl ;
    public final void rule__CompareElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1603:1: ( rule__CompareElement__Group_1_2__2__Impl )
            // InternalDsl.g:1604:2: rule__CompareElement__Group_1_2__2__Impl
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
    // InternalDsl.g:1610:1: rule__CompareElement__Group_1_2__2__Impl : ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__CompareElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1614:1: ( ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:1615:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:1615:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:1616:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:1617:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            // InternalDsl.g:1617:3: rule__CompareElement__RightAssignment_1_2_2
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
    // InternalDsl.g:1626:1: rule__CompareElement__Group_1_3__0 : rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 ;
    public final void rule__CompareElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1630:1: ( rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 )
            // InternalDsl.g:1631:2: rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1638:1: rule__CompareElement__Group_1_3__0__Impl : ( '=<' ) ;
    public final void rule__CompareElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1642:1: ( ( '=<' ) )
            // InternalDsl.g:1643:1: ( '=<' )
            {
            // InternalDsl.g:1643:1: ( '=<' )
            // InternalDsl.g:1644:2: '=<'
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
    // InternalDsl.g:1653:1: rule__CompareElement__Group_1_3__1 : rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 ;
    public final void rule__CompareElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1657:1: ( rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 )
            // InternalDsl.g:1658:2: rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1665:1: rule__CompareElement__Group_1_3__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( ( () ) )
            // InternalDsl.g:1670:1: ( () )
            {
            // InternalDsl.g:1670:1: ( () )
            // InternalDsl.g:1671:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 
            // InternalDsl.g:1672:2: ()
            // InternalDsl.g:1672:3: 
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
    // InternalDsl.g:1680:1: rule__CompareElement__Group_1_3__2 : rule__CompareElement__Group_1_3__2__Impl ;
    public final void rule__CompareElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1684:1: ( rule__CompareElement__Group_1_3__2__Impl )
            // InternalDsl.g:1685:2: rule__CompareElement__Group_1_3__2__Impl
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
    // InternalDsl.g:1691:1: rule__CompareElement__Group_1_3__2__Impl : ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) ;
    public final void rule__CompareElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1695:1: ( ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) )
            // InternalDsl.g:1696:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            {
            // InternalDsl.g:1696:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            // InternalDsl.g:1697:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 
            // InternalDsl.g:1698:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            // InternalDsl.g:1698:3: rule__CompareElement__RightAssignment_1_3_2
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
    // InternalDsl.g:1707:1: rule__PlusMinusElement__Group__0 : rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 ;
    public final void rule__PlusMinusElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1711:1: ( rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 )
            // InternalDsl.g:1712:2: rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1
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
    // InternalDsl.g:1719:1: rule__PlusMinusElement__Group__0__Impl : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:1724:1: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:1724:1: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:1725:2: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:1734:1: rule__PlusMinusElement__Group__1 : rule__PlusMinusElement__Group__1__Impl ;
    public final void rule__PlusMinusElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1738:1: ( rule__PlusMinusElement__Group__1__Impl )
            // InternalDsl.g:1739:2: rule__PlusMinusElement__Group__1__Impl
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
    // InternalDsl.g:1745:1: rule__PlusMinusElement__Group__1__Impl : ( ( rule__PlusMinusElement__Alternatives_1 )* ) ;
    public final void rule__PlusMinusElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1749:1: ( ( ( rule__PlusMinusElement__Alternatives_1 )* ) )
            // InternalDsl.g:1750:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            {
            // InternalDsl.g:1750:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            // InternalDsl.g:1751:2: ( rule__PlusMinusElement__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 
            // InternalDsl.g:1752:2: ( rule__PlusMinusElement__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=26 && LA16_0<=27)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1752:3: rule__PlusMinusElement__Alternatives_1
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
    // InternalDsl.g:1761:1: rule__PlusMinusElement__Group_1_0__0 : rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 ;
    public final void rule__PlusMinusElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1765:1: ( rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 )
            // InternalDsl.g:1766:2: rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1773:1: rule__PlusMinusElement__Group_1_0__0__Impl : ( '+' ) ;
    public final void rule__PlusMinusElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1777:1: ( ( '+' ) )
            // InternalDsl.g:1778:1: ( '+' )
            {
            // InternalDsl.g:1778:1: ( '+' )
            // InternalDsl.g:1779:2: '+'
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
    // InternalDsl.g:1788:1: rule__PlusMinusElement__Group_1_0__1 : rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 ;
    public final void rule__PlusMinusElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1792:1: ( rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 )
            // InternalDsl.g:1793:2: rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1800:1: rule__PlusMinusElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( ( () ) )
            // InternalDsl.g:1805:1: ( () )
            {
            // InternalDsl.g:1805:1: ( () )
            // InternalDsl.g:1806:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 
            // InternalDsl.g:1807:2: ()
            // InternalDsl.g:1807:3: 
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
    // InternalDsl.g:1815:1: rule__PlusMinusElement__Group_1_0__2 : rule__PlusMinusElement__Group_1_0__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1819:1: ( rule__PlusMinusElement__Group_1_0__2__Impl )
            // InternalDsl.g:1820:2: rule__PlusMinusElement__Group_1_0__2__Impl
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
    // InternalDsl.g:1826:1: rule__PlusMinusElement__Group_1_0__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1830:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1831:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1831:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1832:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:1833:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            // InternalDsl.g:1833:3: rule__PlusMinusElement__RightAssignment_1_0_2
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
    // InternalDsl.g:1842:1: rule__PlusMinusElement__Group_1_1__0 : rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 ;
    public final void rule__PlusMinusElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1846:1: ( rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 )
            // InternalDsl.g:1847:2: rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1854:1: rule__PlusMinusElement__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__PlusMinusElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( ( '-' ) )
            // InternalDsl.g:1859:1: ( '-' )
            {
            // InternalDsl.g:1859:1: ( '-' )
            // InternalDsl.g:1860:2: '-'
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
    // InternalDsl.g:1869:1: rule__PlusMinusElement__Group_1_1__1 : rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 ;
    public final void rule__PlusMinusElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1873:1: ( rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 )
            // InternalDsl.g:1874:2: rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1881:1: rule__PlusMinusElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1885:1: ( ( () ) )
            // InternalDsl.g:1886:1: ( () )
            {
            // InternalDsl.g:1886:1: ( () )
            // InternalDsl.g:1887:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 
            // InternalDsl.g:1888:2: ()
            // InternalDsl.g:1888:3: 
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
    // InternalDsl.g:1896:1: rule__PlusMinusElement__Group_1_1__2 : rule__PlusMinusElement__Group_1_1__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1900:1: ( rule__PlusMinusElement__Group_1_1__2__Impl )
            // InternalDsl.g:1901:2: rule__PlusMinusElement__Group_1_1__2__Impl
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
    // InternalDsl.g:1907:1: rule__PlusMinusElement__Group_1_1__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1911:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1912:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1912:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1913:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:1914:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            // InternalDsl.g:1914:3: rule__PlusMinusElement__RightAssignment_1_1_2
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
    // InternalDsl.g:1923:1: rule__MultiplicationDivisionElement__Group__0 : rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 ;
    public final void rule__MultiplicationDivisionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1927:1: ( rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 )
            // InternalDsl.g:1928:2: rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1
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
    // InternalDsl.g:1935:1: rule__MultiplicationDivisionElement__Group__0__Impl : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1939:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:1940:1: ( ruleUnaryElement )
            {
            // InternalDsl.g:1940:1: ( ruleUnaryElement )
            // InternalDsl.g:1941:2: ruleUnaryElement
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
    // InternalDsl.g:1950:1: rule__MultiplicationDivisionElement__Group__1 : rule__MultiplicationDivisionElement__Group__1__Impl ;
    public final void rule__MultiplicationDivisionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1954:1: ( rule__MultiplicationDivisionElement__Group__1__Impl )
            // InternalDsl.g:1955:2: rule__MultiplicationDivisionElement__Group__1__Impl
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
    // InternalDsl.g:1961:1: rule__MultiplicationDivisionElement__Group__1__Impl : ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) ;
    public final void rule__MultiplicationDivisionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1965:1: ( ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) )
            // InternalDsl.g:1966:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            {
            // InternalDsl.g:1966:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            // InternalDsl.g:1967:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 
            // InternalDsl.g:1968:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=28 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1968:3: rule__MultiplicationDivisionElement__Alternatives_1
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
    // InternalDsl.g:1977:1: rule__MultiplicationDivisionElement__Group_1_0__0 : rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1981:1: ( rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 )
            // InternalDsl.g:1982:2: rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1989:1: rule__MultiplicationDivisionElement__Group_1_0__0__Impl : ( '*' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1993:1: ( ( '*' ) )
            // InternalDsl.g:1994:1: ( '*' )
            {
            // InternalDsl.g:1994:1: ( '*' )
            // InternalDsl.g:1995:2: '*'
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
    // InternalDsl.g:2004:1: rule__MultiplicationDivisionElement__Group_1_0__1 : rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 )
            // InternalDsl.g:2009:2: rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2016:1: rule__MultiplicationDivisionElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2020:1: ( ( () ) )
            // InternalDsl.g:2021:1: ( () )
            {
            // InternalDsl.g:2021:1: ( () )
            // InternalDsl.g:2022:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 
            // InternalDsl.g:2023:2: ()
            // InternalDsl.g:2023:3: 
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
    // InternalDsl.g:2031:1: rule__MultiplicationDivisionElement__Group_1_0__2 : rule__MultiplicationDivisionElement__Group_1_0__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2035:1: ( rule__MultiplicationDivisionElement__Group_1_0__2__Impl )
            // InternalDsl.g:2036:2: rule__MultiplicationDivisionElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2042:1: rule__MultiplicationDivisionElement__Group_1_0__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2046:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2047:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2047:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2048:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2049:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2049:3: rule__MultiplicationDivisionElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2058:1: rule__MultiplicationDivisionElement__Group_1_1__0 : rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 )
            // InternalDsl.g:2063:2: rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2070:1: rule__MultiplicationDivisionElement__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2074:1: ( ( '/' ) )
            // InternalDsl.g:2075:1: ( '/' )
            {
            // InternalDsl.g:2075:1: ( '/' )
            // InternalDsl.g:2076:2: '/'
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
    // InternalDsl.g:2085:1: rule__MultiplicationDivisionElement__Group_1_1__1 : rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2089:1: ( rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 )
            // InternalDsl.g:2090:2: rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2097:1: rule__MultiplicationDivisionElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2101:1: ( ( () ) )
            // InternalDsl.g:2102:1: ( () )
            {
            // InternalDsl.g:2102:1: ( () )
            // InternalDsl.g:2103:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 
            // InternalDsl.g:2104:2: ()
            // InternalDsl.g:2104:3: 
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
    // InternalDsl.g:2112:1: rule__MultiplicationDivisionElement__Group_1_1__2 : rule__MultiplicationDivisionElement__Group_1_1__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2116:1: ( rule__MultiplicationDivisionElement__Group_1_1__2__Impl )
            // InternalDsl.g:2117:2: rule__MultiplicationDivisionElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2123:1: rule__MultiplicationDivisionElement__Group_1_1__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2127:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2128:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2128:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2129:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2130:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2130:3: rule__MultiplicationDivisionElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2139:1: rule__MultiplicationDivisionElement__Group_1_2__0 : rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2143:1: ( rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 )
            // InternalDsl.g:2144:2: rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2151:1: rule__MultiplicationDivisionElement__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2155:1: ( ( '%' ) )
            // InternalDsl.g:2156:1: ( '%' )
            {
            // InternalDsl.g:2156:1: ( '%' )
            // InternalDsl.g:2157:2: '%'
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
    // InternalDsl.g:2166:1: rule__MultiplicationDivisionElement__Group_1_2__1 : rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2170:1: ( rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 )
            // InternalDsl.g:2171:2: rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2178:1: rule__MultiplicationDivisionElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2182:1: ( ( () ) )
            // InternalDsl.g:2183:1: ( () )
            {
            // InternalDsl.g:2183:1: ( () )
            // InternalDsl.g:2184:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 
            // InternalDsl.g:2185:2: ()
            // InternalDsl.g:2185:3: 
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
    // InternalDsl.g:2193:1: rule__MultiplicationDivisionElement__Group_1_2__2 : rule__MultiplicationDivisionElement__Group_1_2__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2197:1: ( rule__MultiplicationDivisionElement__Group_1_2__2__Impl )
            // InternalDsl.g:2198:2: rule__MultiplicationDivisionElement__Group_1_2__2__Impl
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
    // InternalDsl.g:2204:1: rule__MultiplicationDivisionElement__Group_1_2__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2208:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:2209:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:2209:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:2210:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:2211:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            // InternalDsl.g:2211:3: rule__MultiplicationDivisionElement__RightAssignment_1_2_2
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
    // InternalDsl.g:2220:1: rule__UnaryElement__Group_0__0 : rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 ;
    public final void rule__UnaryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2224:1: ( rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 )
            // InternalDsl.g:2225:2: rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1
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
    // InternalDsl.g:2232:1: rule__UnaryElement__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2236:1: ( ( () ) )
            // InternalDsl.g:2237:1: ( () )
            {
            // InternalDsl.g:2237:1: ( () )
            // InternalDsl.g:2238:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 
            // InternalDsl.g:2239:2: ()
            // InternalDsl.g:2239:3: 
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
    // InternalDsl.g:2247:1: rule__UnaryElement__Group_0__1 : rule__UnaryElement__Group_0__1__Impl ;
    public final void rule__UnaryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2251:1: ( rule__UnaryElement__Group_0__1__Impl )
            // InternalDsl.g:2252:2: rule__UnaryElement__Group_0__1__Impl
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
    // InternalDsl.g:2258:1: rule__UnaryElement__Group_0__1__Impl : ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) ;
    public final void rule__UnaryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2262:1: ( ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) )
            // InternalDsl.g:2263:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            {
            // InternalDsl.g:2263:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            // InternalDsl.g:2264:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 
            // InternalDsl.g:2265:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            // InternalDsl.g:2265:3: rule__UnaryElement__ValueAssignment_0_1
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
    // InternalDsl.g:2274:1: rule__UnaryElement__Group_1__0 : rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 ;
    public final void rule__UnaryElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2278:1: ( rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 )
            // InternalDsl.g:2279:2: rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDsl.g:2286:1: rule__UnaryElement__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2290:1: ( ( () ) )
            // InternalDsl.g:2291:1: ( () )
            {
            // InternalDsl.g:2291:1: ( () )
            // InternalDsl.g:2292:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0()); 
            // InternalDsl.g:2293:2: ()
            // InternalDsl.g:2293:3: 
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
    // InternalDsl.g:2301:1: rule__UnaryElement__Group_1__1 : rule__UnaryElement__Group_1__1__Impl ;
    public final void rule__UnaryElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2305:1: ( rule__UnaryElement__Group_1__1__Impl )
            // InternalDsl.g:2306:2: rule__UnaryElement__Group_1__1__Impl
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
    // InternalDsl.g:2312:1: rule__UnaryElement__Group_1__1__Impl : ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) ;
    public final void rule__UnaryElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2316:1: ( ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:2317:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:2317:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            // InternalDsl.g:2318:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:2319:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            // InternalDsl.g:2319:3: rule__UnaryElement__ValueAssignment_1_1
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
    // InternalDsl.g:2328:1: rule__UnaryElement__Group_2__0 : rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 ;
    public final void rule__UnaryElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2332:1: ( rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 )
            // InternalDsl.g:2333:2: rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2340:1: rule__UnaryElement__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( ( () ) )
            // InternalDsl.g:2345:1: ( () )
            {
            // InternalDsl.g:2345:1: ( () )
            // InternalDsl.g:2346:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0()); 
            // InternalDsl.g:2347:2: ()
            // InternalDsl.g:2347:3: 
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
    // InternalDsl.g:2355:1: rule__UnaryElement__Group_2__1 : rule__UnaryElement__Group_2__1__Impl ;
    public final void rule__UnaryElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2359:1: ( rule__UnaryElement__Group_2__1__Impl )
            // InternalDsl.g:2360:2: rule__UnaryElement__Group_2__1__Impl
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
    // InternalDsl.g:2366:1: rule__UnaryElement__Group_2__1__Impl : ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) ;
    public final void rule__UnaryElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2370:1: ( ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:2371:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:2371:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            // InternalDsl.g:2372:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:2373:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            // InternalDsl.g:2373:3: rule__UnaryElement__ValueAssignment_2_1
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
    // InternalDsl.g:2382:1: rule__UnaryElement__Group_3__0 : rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 ;
    public final void rule__UnaryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2386:1: ( rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 )
            // InternalDsl.g:2387:2: rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2394:1: rule__UnaryElement__Group_3__0__Impl : ( '(' ) ;
    public final void rule__UnaryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( ( '(' ) )
            // InternalDsl.g:2399:1: ( '(' )
            {
            // InternalDsl.g:2399:1: ( '(' )
            // InternalDsl.g:2400:2: '('
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
    // InternalDsl.g:2409:1: rule__UnaryElement__Group_3__1 : rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 ;
    public final void rule__UnaryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2413:1: ( rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 )
            // InternalDsl.g:2414:2: rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2421:1: rule__UnaryElement__Group_3__1__Impl : ( ruleOrElement ) ;
    public final void rule__UnaryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( ( ruleOrElement ) )
            // InternalDsl.g:2426:1: ( ruleOrElement )
            {
            // InternalDsl.g:2426:1: ( ruleOrElement )
            // InternalDsl.g:2427:2: ruleOrElement
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
    // InternalDsl.g:2436:1: rule__UnaryElement__Group_3__2 : rule__UnaryElement__Group_3__2__Impl ;
    public final void rule__UnaryElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2440:1: ( rule__UnaryElement__Group_3__2__Impl )
            // InternalDsl.g:2441:2: rule__UnaryElement__Group_3__2__Impl
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
    // InternalDsl.g:2447:1: rule__UnaryElement__Group_3__2__Impl : ( ')' ) ;
    public final void rule__UnaryElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2451:1: ( ( ')' ) )
            // InternalDsl.g:2452:1: ( ')' )
            {
            // InternalDsl.g:2452:1: ( ')' )
            // InternalDsl.g:2453:2: ')'
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
    // InternalDsl.g:2463:1: rule__UnaryElement__Group_4__0 : rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 ;
    public final void rule__UnaryElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2467:1: ( rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 )
            // InternalDsl.g:2468:2: rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2475:1: rule__UnaryElement__Group_4__0__Impl : ( 'not' ) ;
    public final void rule__UnaryElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( ( 'not' ) )
            // InternalDsl.g:2480:1: ( 'not' )
            {
            // InternalDsl.g:2480:1: ( 'not' )
            // InternalDsl.g:2481:2: 'not'
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
    // InternalDsl.g:2490:1: rule__UnaryElement__Group_4__1 : rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 ;
    public final void rule__UnaryElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2494:1: ( rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 )
            // InternalDsl.g:2495:2: rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:2502:1: rule__UnaryElement__Group_4__1__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2506:1: ( ( () ) )
            // InternalDsl.g:2507:1: ( () )
            {
            // InternalDsl.g:2507:1: ( () )
            // InternalDsl.g:2508:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1()); 
            // InternalDsl.g:2509:2: ()
            // InternalDsl.g:2509:3: 
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
    // InternalDsl.g:2517:1: rule__UnaryElement__Group_4__2 : rule__UnaryElement__Group_4__2__Impl ;
    public final void rule__UnaryElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2521:1: ( rule__UnaryElement__Group_4__2__Impl )
            // InternalDsl.g:2522:2: rule__UnaryElement__Group_4__2__Impl
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
    // InternalDsl.g:2528:1: rule__UnaryElement__Group_4__2__Impl : ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) ;
    public final void rule__UnaryElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2532:1: ( ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) )
            // InternalDsl.g:2533:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            {
            // InternalDsl.g:2533:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            // InternalDsl.g:2534:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            {
             before(grammarAccess.getUnaryElementAccess().getExpAssignment_4_2()); 
            // InternalDsl.g:2535:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            // InternalDsl.g:2535:3: rule__UnaryElement__ExpAssignment_4_2
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
    // InternalDsl.g:2544:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2548:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalDsl.g:2549:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:2556:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2560:1: ( ( RULE_INT ) )
            // InternalDsl.g:2561:1: ( RULE_INT )
            {
            // InternalDsl.g:2561:1: ( RULE_INT )
            // InternalDsl.g:2562:2: RULE_INT
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
    // InternalDsl.g:2571:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2575:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // InternalDsl.g:2576:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
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
    // InternalDsl.g:2583:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2587:1: ( ( '.' ) )
            // InternalDsl.g:2588:1: ( '.' )
            {
            // InternalDsl.g:2588:1: ( '.' )
            // InternalDsl.g:2589:2: '.'
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
    // InternalDsl.g:2598:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2602:1: ( rule__NUMBER__Group_1__2__Impl )
            // InternalDsl.g:2603:2: rule__NUMBER__Group_1__2__Impl
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
    // InternalDsl.g:2609:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2613:1: ( ( RULE_INT ) )
            // InternalDsl.g:2614:1: ( RULE_INT )
            {
            // InternalDsl.g:2614:1: ( RULE_INT )
            // InternalDsl.g:2615:2: RULE_INT
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


    // $ANTLR start "rule__RunTimeModel__AppDataAssignment"
    // InternalDsl.g:2625:1: rule__RunTimeModel__AppDataAssignment : ( ruleAppMetaData ) ;
    public final void rule__RunTimeModel__AppDataAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2629:1: ( ( ruleAppMetaData ) )
            // InternalDsl.g:2630:2: ( ruleAppMetaData )
            {
            // InternalDsl.g:2630:2: ( ruleAppMetaData )
            // InternalDsl.g:2631:3: ruleAppMetaData
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
    // InternalDsl.g:2640:1: rule__AppMetaData__AppIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppMetaData__AppIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2644:1: ( ( RULE_ID ) )
            // InternalDsl.g:2645:2: ( RULE_ID )
            {
            // InternalDsl.g:2645:2: ( RULE_ID )
            // InternalDsl.g:2646:3: RULE_ID
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
    // InternalDsl.g:2655:1: rule__AppMetaData__SpecificationsAssignment_3 : ( ruleAppSpecification ) ;
    public final void rule__AppMetaData__SpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2659:1: ( ( ruleAppSpecification ) )
            // InternalDsl.g:2660:2: ( ruleAppSpecification )
            {
            // InternalDsl.g:2660:2: ( ruleAppSpecification )
            // InternalDsl.g:2661:3: ruleAppSpecification
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


    // $ANTLR start "rule__AppSpecification__TriggerAssignment_1"
    // InternalDsl.g:2670:1: rule__AppSpecification__TriggerAssignment_1 : ( ruleOrElement ) ;
    public final void rule__AppSpecification__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2674:1: ( ( ruleOrElement ) )
            // InternalDsl.g:2675:2: ( ruleOrElement )
            {
            // InternalDsl.g:2675:2: ( ruleOrElement )
            // InternalDsl.g:2676:3: ruleOrElement
            {
             before(grammarAccess.getAppSpecificationAccess().getTriggerOrElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getTriggerOrElementParserRuleCall_1_0()); 

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
    // InternalDsl.g:2685:1: rule__AppSpecification__ConditionAssignment_3 : ( ruleOrElement ) ;
    public final void rule__AppSpecification__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2689:1: ( ( ruleOrElement ) )
            // InternalDsl.g:2690:2: ( ruleOrElement )
            {
            // InternalDsl.g:2690:2: ( ruleOrElement )
            // InternalDsl.g:2691:3: ruleOrElement
            {
             before(grammarAccess.getAppSpecificationAccess().getConditionOrElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getConditionOrElementParserRuleCall_3_0()); 

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
    // InternalDsl.g:2700:1: rule__AppSpecification__ActionAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AppSpecification__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2704:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2705:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2705:2: ( ( RULE_ID ) )
            // InternalDsl.g:2706:3: ( RULE_ID )
            {
             before(grammarAccess.getAppSpecificationAccess().getActionElementCrossReference_5_0()); 
            // InternalDsl.g:2707:3: ( RULE_ID )
            // InternalDsl.g:2708:4: RULE_ID
            {
             before(grammarAccess.getAppSpecificationAccess().getActionElementIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getActionElementIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAppSpecificationAccess().getActionElementCrossReference_5_0()); 

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


    // $ANTLR start "rule__OrElement__RightAssignment_1_2"
    // InternalDsl.g:2719:1: rule__OrElement__RightAssignment_1_2 : ( ruleAndElement ) ;
    public final void rule__OrElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2723:1: ( ( ruleAndElement ) )
            // InternalDsl.g:2724:2: ( ruleAndElement )
            {
            // InternalDsl.g:2724:2: ( ruleAndElement )
            // InternalDsl.g:2725:3: ruleAndElement
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
    // InternalDsl.g:2734:1: rule__AndElement__RightAssignment_1_2 : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2738:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:2739:2: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:2739:2: ( ruleDiffEqualElement )
            // InternalDsl.g:2740:3: ruleDiffEqualElement
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
    // InternalDsl.g:2749:1: rule__DiffEqualElement__RightAssignment_1_0_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2753:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:2754:2: ( ruleCompareElement )
            {
            // InternalDsl.g:2754:2: ( ruleCompareElement )
            // InternalDsl.g:2755:3: ruleCompareElement
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
    // InternalDsl.g:2764:1: rule__DiffEqualElement__RightAssignment_1_1_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2768:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:2769:2: ( ruleCompareElement )
            {
            // InternalDsl.g:2769:2: ( ruleCompareElement )
            // InternalDsl.g:2770:3: ruleCompareElement
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
    // InternalDsl.g:2779:1: rule__CompareElement__RightAssignment_1_0_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2783:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2784:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2784:2: ( rulePlusMinusElement )
            // InternalDsl.g:2785:3: rulePlusMinusElement
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
    // InternalDsl.g:2794:1: rule__CompareElement__RightAssignment_1_1_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2798:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2799:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2799:2: ( rulePlusMinusElement )
            // InternalDsl.g:2800:3: rulePlusMinusElement
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
    // InternalDsl.g:2809:1: rule__CompareElement__RightAssignment_1_2_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2813:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2814:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2814:2: ( rulePlusMinusElement )
            // InternalDsl.g:2815:3: rulePlusMinusElement
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
    // InternalDsl.g:2824:1: rule__CompareElement__RightAssignment_1_3_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2828:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2829:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2829:2: ( rulePlusMinusElement )
            // InternalDsl.g:2830:3: rulePlusMinusElement
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
    // InternalDsl.g:2839:1: rule__PlusMinusElement__RightAssignment_1_0_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2843:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:2844:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:2844:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:2845:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:2854:1: rule__PlusMinusElement__RightAssignment_1_1_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2858:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:2859:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:2859:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:2860:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:2869:1: rule__MultiplicationDivisionElement__RightAssignment_1_0_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2873:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:2874:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:2874:2: ( ruleUnaryElement )
            // InternalDsl.g:2875:3: ruleUnaryElement
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
    // InternalDsl.g:2884:1: rule__MultiplicationDivisionElement__RightAssignment_1_1_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2888:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:2889:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:2889:2: ( ruleUnaryElement )
            // InternalDsl.g:2890:3: ruleUnaryElement
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
    // InternalDsl.g:2899:1: rule__MultiplicationDivisionElement__RightAssignment_1_2_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2903:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:2904:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:2904:2: ( ruleUnaryElement )
            // InternalDsl.g:2905:3: ruleUnaryElement
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
    // InternalDsl.g:2914:1: rule__UnaryElement__ValueAssignment_0_1 : ( ruleNUMBER ) ;
    public final void rule__UnaryElement__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2918:1: ( ( ruleNUMBER ) )
            // InternalDsl.g:2919:2: ( ruleNUMBER )
            {
            // InternalDsl.g:2919:2: ( ruleNUMBER )
            // InternalDsl.g:2920:3: ruleNUMBER
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
    // InternalDsl.g:2929:1: rule__UnaryElement__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__UnaryElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2933:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2934:2: ( RULE_STRING )
            {
            // InternalDsl.g:2934:2: ( RULE_STRING )
            // InternalDsl.g:2935:3: RULE_STRING
            {
             before(grammarAccess.getUnaryElementAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // InternalDsl.g:2944:1: rule__UnaryElement__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__UnaryElement__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2948:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:2949:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:2949:2: ( RULE_BOOLEAN )
            // InternalDsl.g:2950:3: RULE_BOOLEAN
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
    // InternalDsl.g:2959:1: rule__UnaryElement__ExpAssignment_4_2 : ( ruleUnaryElement ) ;
    public final void rule__UnaryElement__ExpAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2963:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:2964:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:2964:2: ( ruleUnaryElement )
            // InternalDsl.g:2965:3: ruleUnaryElement
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000002800100D0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000002800000D2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000002800200D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000002800000D0L});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});

}