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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'app'", "'on'", "'if'", "'do'", "'and'", "'environment'", "'service'", "'resource'", "'can'", "'be'", "','", "':='", "'mapping'", "'('", "')'", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'.'"
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
    // InternalDsl.g:62:1: ruleRunTimeModel : ( ( rule__RunTimeModel__Group__0 ) ) ;
    public final void ruleRunTimeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__RunTimeModel__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__RunTimeModel__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__RunTimeModel__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__RunTimeModel__Group__0 )
            {
             before(grammarAccess.getRunTimeModelAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__RunTimeModel__Group__0 )
            // InternalDsl.g:69:4: rule__RunTimeModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunTimeModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleSpecification"
    // InternalDsl.g:103:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleSpecification EOF )
            // InternalDsl.g:105:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalDsl.g:112:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Specification__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Specification__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Specification__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Specification__Group__0 )
            // InternalDsl.g:119:4: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleEnvironmentMetaData"
    // InternalDsl.g:128:1: entryRuleEnvironmentMetaData : ruleEnvironmentMetaData EOF ;
    public final void entryRuleEnvironmentMetaData() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleEnvironmentMetaData EOF )
            // InternalDsl.g:130:1: ruleEnvironmentMetaData EOF
            {
             before(grammarAccess.getEnvironmentMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentMetaData();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataRule()); 
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
    // $ANTLR end "entryRuleEnvironmentMetaData"


    // $ANTLR start "ruleEnvironmentMetaData"
    // InternalDsl.g:137:1: ruleEnvironmentMetaData : ( ( rule__EnvironmentMetaData__Group__0 ) ) ;
    public final void ruleEnvironmentMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__EnvironmentMetaData__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__EnvironmentMetaData__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__EnvironmentMetaData__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__EnvironmentMetaData__Group__0 )
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__EnvironmentMetaData__Group__0 )
            // InternalDsl.g:144:4: rule__EnvironmentMetaData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentMetaDataAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironmentMetaData"


    // $ANTLR start "entryRuleServiceMetaData"
    // InternalDsl.g:153:1: entryRuleServiceMetaData : ruleServiceMetaData EOF ;
    public final void entryRuleServiceMetaData() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleServiceMetaData EOF )
            // InternalDsl.g:155:1: ruleServiceMetaData EOF
            {
             before(grammarAccess.getServiceMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceMetaData();

            state._fsp--;

             after(grammarAccess.getServiceMetaDataRule()); 
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
    // $ANTLR end "entryRuleServiceMetaData"


    // $ANTLR start "ruleServiceMetaData"
    // InternalDsl.g:162:1: ruleServiceMetaData : ( ( rule__ServiceMetaData__Group__0 ) ) ;
    public final void ruleServiceMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__ServiceMetaData__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__ServiceMetaData__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__ServiceMetaData__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__ServiceMetaData__Group__0 )
            {
             before(grammarAccess.getServiceMetaDataAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__ServiceMetaData__Group__0 )
            // InternalDsl.g:169:4: rule__ServiceMetaData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceMetaData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceMetaDataAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceMetaData"


    // $ANTLR start "entryRuleResource"
    // InternalDsl.g:178:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleResource EOF )
            // InternalDsl.g:180:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalDsl.g:187:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Resource__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Resource__Group__0 )
            // InternalDsl.g:194:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleState"
    // InternalDsl.g:203:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleState EOF )
            // InternalDsl.g:205:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDsl.g:212:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalDsl.g:217:2: ( ( rule__State__Alternatives ) )
            {
            // InternalDsl.g:217:2: ( ( rule__State__Alternatives ) )
            // InternalDsl.g:218:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalDsl.g:219:3: ( rule__State__Alternatives )
            // InternalDsl.g:219:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleAction EOF )
            // InternalDsl.g:230:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:237:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Action__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Action__Group__0 )
            // InternalDsl.g:244:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMappingPair"
    // InternalDsl.g:253:1: entryRuleMappingPair : ruleMappingPair EOF ;
    public final void entryRuleMappingPair() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleMappingPair EOF )
            // InternalDsl.g:255:1: ruleMappingPair EOF
            {
             before(grammarAccess.getMappingPairRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingPair();

            state._fsp--;

             after(grammarAccess.getMappingPairRule()); 
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
    // $ANTLR end "entryRuleMappingPair"


    // $ANTLR start "ruleMappingPair"
    // InternalDsl.g:262:1: ruleMappingPair : ( ( rule__MappingPair__Group__0 ) ) ;
    public final void ruleMappingPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__MappingPair__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__MappingPair__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__MappingPair__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__MappingPair__Group__0 )
            {
             before(grammarAccess.getMappingPairAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__MappingPair__Group__0 )
            // InternalDsl.g:269:4: rule__MappingPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingPairAccess().getGroup()); 

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
    // $ANTLR end "ruleMappingPair"


    // $ANTLR start "entryRulePair"
    // InternalDsl.g:278:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( rulePair EOF )
            // InternalDsl.g:280:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalDsl.g:287:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Pair__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Pair__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Pair__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Pair__Group__0 )
            // InternalDsl.g:294:4: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getGroup()); 

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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:303:1: entryRuleOrElement : ruleOrElement EOF ;
    public final void entryRuleOrElement() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleOrElement EOF )
            // InternalDsl.g:305:1: ruleOrElement EOF
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
    // InternalDsl.g:312:1: ruleOrElement : ( ( rule__OrElement__Group__0 ) ) ;
    public final void ruleOrElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__OrElement__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__OrElement__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__OrElement__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__OrElement__Group__0 )
            {
             before(grammarAccess.getOrElementAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__OrElement__Group__0 )
            // InternalDsl.g:319:4: rule__OrElement__Group__0
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
    // InternalDsl.g:328:1: entryRuleAndElement : ruleAndElement EOF ;
    public final void entryRuleAndElement() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleAndElement EOF )
            // InternalDsl.g:330:1: ruleAndElement EOF
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
    // InternalDsl.g:337:1: ruleAndElement : ( ( rule__AndElement__Group__0 ) ) ;
    public final void ruleAndElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__AndElement__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__AndElement__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__AndElement__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__AndElement__Group__0 )
            {
             before(grammarAccess.getAndElementAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__AndElement__Group__0 )
            // InternalDsl.g:344:4: rule__AndElement__Group__0
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
    // InternalDsl.g:353:1: entryRuleDiffEqualElement : ruleDiffEqualElement EOF ;
    public final void entryRuleDiffEqualElement() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleDiffEqualElement EOF )
            // InternalDsl.g:355:1: ruleDiffEqualElement EOF
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
    // InternalDsl.g:362:1: ruleDiffEqualElement : ( ( rule__DiffEqualElement__Group__0 ) ) ;
    public final void ruleDiffEqualElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__DiffEqualElement__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__DiffEqualElement__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__DiffEqualElement__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__DiffEqualElement__Group__0 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__DiffEqualElement__Group__0 )
            // InternalDsl.g:369:4: rule__DiffEqualElement__Group__0
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
    // InternalDsl.g:378:1: entryRuleCompareElement : ruleCompareElement EOF ;
    public final void entryRuleCompareElement() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleCompareElement EOF )
            // InternalDsl.g:380:1: ruleCompareElement EOF
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
    // InternalDsl.g:387:1: ruleCompareElement : ( ( rule__CompareElement__Group__0 ) ) ;
    public final void ruleCompareElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__CompareElement__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__CompareElement__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__CompareElement__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__CompareElement__Group__0 )
            {
             before(grammarAccess.getCompareElementAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__CompareElement__Group__0 )
            // InternalDsl.g:394:4: rule__CompareElement__Group__0
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
    // InternalDsl.g:403:1: entryRulePlusMinusElement : rulePlusMinusElement EOF ;
    public final void entryRulePlusMinusElement() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( rulePlusMinusElement EOF )
            // InternalDsl.g:405:1: rulePlusMinusElement EOF
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
    // InternalDsl.g:412:1: rulePlusMinusElement : ( ( rule__PlusMinusElement__Group__0 ) ) ;
    public final void rulePlusMinusElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__PlusMinusElement__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__PlusMinusElement__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__PlusMinusElement__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__PlusMinusElement__Group__0 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__PlusMinusElement__Group__0 )
            // InternalDsl.g:419:4: rule__PlusMinusElement__Group__0
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
    // InternalDsl.g:428:1: entryRuleMultiplicationDivisionElement : ruleMultiplicationDivisionElement EOF ;
    public final void entryRuleMultiplicationDivisionElement() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:430:1: ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:437:1: ruleMultiplicationDivisionElement : ( ( rule__MultiplicationDivisionElement__Group__0 ) ) ;
    public final void ruleMultiplicationDivisionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__MultiplicationDivisionElement__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__MultiplicationDivisionElement__Group__0 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__MultiplicationDivisionElement__Group__0 )
            // InternalDsl.g:444:4: rule__MultiplicationDivisionElement__Group__0
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
    // InternalDsl.g:453:1: entryRuleUnaryElement : ruleUnaryElement EOF ;
    public final void entryRuleUnaryElement() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleUnaryElement EOF )
            // InternalDsl.g:455:1: ruleUnaryElement EOF
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
    // InternalDsl.g:462:1: ruleUnaryElement : ( ( rule__UnaryElement__Alternatives ) ) ;
    public final void ruleUnaryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__UnaryElement__Alternatives ) ) )
            // InternalDsl.g:467:2: ( ( rule__UnaryElement__Alternatives ) )
            {
            // InternalDsl.g:467:2: ( ( rule__UnaryElement__Alternatives ) )
            // InternalDsl.g:468:3: ( rule__UnaryElement__Alternatives )
            {
             before(grammarAccess.getUnaryElementAccess().getAlternatives()); 
            // InternalDsl.g:469:3: ( rule__UnaryElement__Alternatives )
            // InternalDsl.g:469:4: rule__UnaryElement__Alternatives
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
    // InternalDsl.g:478:1: entryRuleLBRACE : ruleLBRACE EOF ;
    public final void entryRuleLBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleLBRACE EOF )
            // InternalDsl.g:480:1: ruleLBRACE EOF
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
    // InternalDsl.g:487:1: ruleLBRACE : ( '{' ) ;
    public final void ruleLBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( '{' ) )
            // InternalDsl.g:492:2: ( '{' )
            {
            // InternalDsl.g:492:2: ( '{' )
            // InternalDsl.g:493:3: '{'
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
    // InternalDsl.g:503:1: entryRuleRBRACE : ruleRBRACE EOF ;
    public final void entryRuleRBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleRBRACE EOF )
            // InternalDsl.g:505:1: ruleRBRACE EOF
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
    // InternalDsl.g:512:1: ruleRBRACE : ( '}' ) ;
    public final void ruleRBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( '}' ) )
            // InternalDsl.g:517:2: ( '}' )
            {
            // InternalDsl.g:517:2: ( '}' )
            // InternalDsl.g:518:3: '}'
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
    // InternalDsl.g:528:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleNUMBER EOF )
            // InternalDsl.g:530:1: ruleNUMBER EOF
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
    // InternalDsl.g:537:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalDsl.g:542:2: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalDsl.g:542:2: ( ( rule__NUMBER__Alternatives ) )
            // InternalDsl.g:543:3: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // InternalDsl.g:544:3: ( rule__NUMBER__Alternatives )
            // InternalDsl.g:544:4: rule__NUMBER__Alternatives
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
    // InternalDsl.g:553:1: entryRuleEXTENDED_STRING : ruleEXTENDED_STRING EOF ;
    public final void entryRuleEXTENDED_STRING() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleEXTENDED_STRING EOF )
            // InternalDsl.g:555:1: ruleEXTENDED_STRING EOF
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
    // InternalDsl.g:562:1: ruleEXTENDED_STRING : ( ( rule__EXTENDED_STRING__Group__0 ) ) ;
    public final void ruleEXTENDED_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__EXTENDED_STRING__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__EXTENDED_STRING__Group__0 )
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__EXTENDED_STRING__Group__0 )
            // InternalDsl.g:569:4: rule__EXTENDED_STRING__Group__0
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


    // $ANTLR start "rule__State__Alternatives"
    // InternalDsl.g:577:1: rule__State__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:581:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:582:2: ( RULE_ID )
                    {
                    // InternalDsl.g:582:2: ( RULE_ID )
                    // InternalDsl.g:583:3: RULE_ID
                    {
                     before(grammarAccess.getStateAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:588:2: ( RULE_INT )
                    {
                    // InternalDsl.g:588:2: ( RULE_INT )
                    // InternalDsl.g:589:3: RULE_INT
                    {
                     before(grammarAccess.getStateAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__DiffEqualElement__Alternatives_1"
    // InternalDsl.g:598:1: rule__DiffEqualElement__Alternatives_1 : ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) );
    public final void rule__DiffEqualElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:602:1: ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:603:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:603:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    // InternalDsl.g:604:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:605:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    // InternalDsl.g:605:4: rule__DiffEqualElement__Group_1_0__0
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
                    // InternalDsl.g:609:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:609:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    // InternalDsl.g:610:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:611:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    // InternalDsl.g:611:4: rule__DiffEqualElement__Group_1_1__0
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
    // InternalDsl.g:619:1: rule__CompareElement__Alternatives_1 : ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) );
    public final void rule__CompareElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:623:1: ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 35:
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
                    // InternalDsl.g:624:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:624:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    // InternalDsl.g:625:3: ( rule__CompareElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:626:3: ( rule__CompareElement__Group_1_0__0 )
                    // InternalDsl.g:626:4: rule__CompareElement__Group_1_0__0
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
                    // InternalDsl.g:630:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:630:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    // InternalDsl.g:631:3: ( rule__CompareElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:632:3: ( rule__CompareElement__Group_1_1__0 )
                    // InternalDsl.g:632:4: rule__CompareElement__Group_1_1__0
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
                    // InternalDsl.g:636:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:636:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    // InternalDsl.g:637:3: ( rule__CompareElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:638:3: ( rule__CompareElement__Group_1_2__0 )
                    // InternalDsl.g:638:4: rule__CompareElement__Group_1_2__0
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
                    // InternalDsl.g:642:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    {
                    // InternalDsl.g:642:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    // InternalDsl.g:643:3: ( rule__CompareElement__Group_1_3__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_3()); 
                    // InternalDsl.g:644:3: ( rule__CompareElement__Group_1_3__0 )
                    // InternalDsl.g:644:4: rule__CompareElement__Group_1_3__0
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
    // InternalDsl.g:652:1: rule__PlusMinusElement__Alternatives_1 : ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) );
    public final void rule__PlusMinusElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:656:1: ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:657:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:657:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    // InternalDsl.g:658:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:659:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    // InternalDsl.g:659:4: rule__PlusMinusElement__Group_1_0__0
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
                    // InternalDsl.g:663:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:663:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    // InternalDsl.g:664:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:665:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    // InternalDsl.g:665:4: rule__PlusMinusElement__Group_1_1__0
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
    // InternalDsl.g:673:1: rule__MultiplicationDivisionElement__Alternatives_1 : ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) );
    public final void rule__MultiplicationDivisionElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 40:
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
                    // InternalDsl.g:678:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:678:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    // InternalDsl.g:679:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:680:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    // InternalDsl.g:680:4: rule__MultiplicationDivisionElement__Group_1_0__0
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
                    // InternalDsl.g:684:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:684:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    // InternalDsl.g:685:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:686:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    // InternalDsl.g:686:4: rule__MultiplicationDivisionElement__Group_1_1__0
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
                    // InternalDsl.g:690:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:690:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    // InternalDsl.g:691:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:692:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    // InternalDsl.g:692:4: rule__MultiplicationDivisionElement__Group_1_2__0
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
    // InternalDsl.g:700:1: rule__UnaryElement__Alternatives : ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) );
    public final void rule__UnaryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) )
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
            case 27:
                {
                alt6=4;
                }
                break;
            case 41:
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
                    // InternalDsl.g:705:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    {
                    // InternalDsl.g:705:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    // InternalDsl.g:706:3: ( rule__UnaryElement__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_0()); 
                    // InternalDsl.g:707:3: ( rule__UnaryElement__Group_0__0 )
                    // InternalDsl.g:707:4: rule__UnaryElement__Group_0__0
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
                    // InternalDsl.g:711:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    {
                    // InternalDsl.g:711:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    // InternalDsl.g:712:3: ( rule__UnaryElement__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_1()); 
                    // InternalDsl.g:713:3: ( rule__UnaryElement__Group_1__0 )
                    // InternalDsl.g:713:4: rule__UnaryElement__Group_1__0
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
                    // InternalDsl.g:717:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    {
                    // InternalDsl.g:717:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    // InternalDsl.g:718:3: ( rule__UnaryElement__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_2()); 
                    // InternalDsl.g:719:3: ( rule__UnaryElement__Group_2__0 )
                    // InternalDsl.g:719:4: rule__UnaryElement__Group_2__0
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
                    // InternalDsl.g:723:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    {
                    // InternalDsl.g:723:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    // InternalDsl.g:724:3: ( rule__UnaryElement__Group_3__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_3()); 
                    // InternalDsl.g:725:3: ( rule__UnaryElement__Group_3__0 )
                    // InternalDsl.g:725:4: rule__UnaryElement__Group_3__0
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
                    // InternalDsl.g:729:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    {
                    // InternalDsl.g:729:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    // InternalDsl.g:730:3: ( rule__UnaryElement__Group_4__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_4()); 
                    // InternalDsl.g:731:3: ( rule__UnaryElement__Group_4__0 )
                    // InternalDsl.g:731:4: rule__UnaryElement__Group_4__0
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
    // InternalDsl.g:739:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:743:1: ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==42) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||(LA7_1>=RULE_ID && LA7_1<=RULE_BOOLEAN)||(LA7_1>=16 && LA7_1<=18)||LA7_1==24||(LA7_1>=27 && LA7_1<=41)) ) {
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
                    // InternalDsl.g:744:2: ( RULE_INT )
                    {
                    // InternalDsl.g:744:2: ( RULE_INT )
                    // InternalDsl.g:745:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:750:2: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // InternalDsl.g:750:2: ( ( rule__NUMBER__Group_1__0 ) )
                    // InternalDsl.g:751:3: ( rule__NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    // InternalDsl.g:752:3: ( rule__NUMBER__Group_1__0 )
                    // InternalDsl.g:752:4: rule__NUMBER__Group_1__0
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


    // $ANTLR start "rule__RunTimeModel__Group__0"
    // InternalDsl.g:760:1: rule__RunTimeModel__Group__0 : rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 ;
    public final void rule__RunTimeModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:764:1: ( rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 )
            // InternalDsl.g:765:2: rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RunTimeModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__1();

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
    // $ANTLR end "rule__RunTimeModel__Group__0"


    // $ANTLR start "rule__RunTimeModel__Group__0__Impl"
    // InternalDsl.g:772:1: rule__RunTimeModel__Group__0__Impl : ( () ) ;
    public final void rule__RunTimeModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:776:1: ( ( () ) )
            // InternalDsl.g:777:1: ( () )
            {
            // InternalDsl.g:777:1: ( () )
            // InternalDsl.g:778:2: ()
            {
             before(grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0()); 
            // InternalDsl.g:779:2: ()
            // InternalDsl.g:779:3: 
            {
            }

             after(grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__0__Impl"


    // $ANTLR start "rule__RunTimeModel__Group__1"
    // InternalDsl.g:787:1: rule__RunTimeModel__Group__1 : rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 ;
    public final void rule__RunTimeModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:791:1: ( rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 )
            // InternalDsl.g:792:2: rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RunTimeModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__2();

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
    // $ANTLR end "rule__RunTimeModel__Group__1"


    // $ANTLR start "rule__RunTimeModel__Group__1__Impl"
    // InternalDsl.g:799:1: rule__RunTimeModel__Group__1__Impl : ( ( rule__RunTimeModel__EnvDataAssignment_1 )* ) ;
    public final void rule__RunTimeModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:803:1: ( ( ( rule__RunTimeModel__EnvDataAssignment_1 )* ) )
            // InternalDsl.g:804:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 )* )
            {
            // InternalDsl.g:804:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 )* )
            // InternalDsl.g:805:2: ( rule__RunTimeModel__EnvDataAssignment_1 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getEnvDataAssignment_1()); 
            // InternalDsl.g:806:2: ( rule__RunTimeModel__EnvDataAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:806:3: rule__RunTimeModel__EnvDataAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RunTimeModel__EnvDataAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRunTimeModelAccess().getEnvDataAssignment_1()); 

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
    // $ANTLR end "rule__RunTimeModel__Group__1__Impl"


    // $ANTLR start "rule__RunTimeModel__Group__2"
    // InternalDsl.g:814:1: rule__RunTimeModel__Group__2 : rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3 ;
    public final void rule__RunTimeModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:818:1: ( rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3 )
            // InternalDsl.g:819:2: rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__RunTimeModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__3();

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
    // $ANTLR end "rule__RunTimeModel__Group__2"


    // $ANTLR start "rule__RunTimeModel__Group__2__Impl"
    // InternalDsl.g:826:1: rule__RunTimeModel__Group__2__Impl : ( ( rule__RunTimeModel__AppDataAssignment_2 )* ) ;
    public final void rule__RunTimeModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:830:1: ( ( ( rule__RunTimeModel__AppDataAssignment_2 )* ) )
            // InternalDsl.g:831:1: ( ( rule__RunTimeModel__AppDataAssignment_2 )* )
            {
            // InternalDsl.g:831:1: ( ( rule__RunTimeModel__AppDataAssignment_2 )* )
            // InternalDsl.g:832:2: ( rule__RunTimeModel__AppDataAssignment_2 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAssignment_2()); 
            // InternalDsl.g:833:2: ( rule__RunTimeModel__AppDataAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:833:3: rule__RunTimeModel__AppDataAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RunTimeModel__AppDataAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRunTimeModelAccess().getAppDataAssignment_2()); 

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
    // $ANTLR end "rule__RunTimeModel__Group__2__Impl"


    // $ANTLR start "rule__RunTimeModel__Group__3"
    // InternalDsl.g:841:1: rule__RunTimeModel__Group__3 : rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4 ;
    public final void rule__RunTimeModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:845:1: ( rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4 )
            // InternalDsl.g:846:2: rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RunTimeModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__4();

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
    // $ANTLR end "rule__RunTimeModel__Group__3"


    // $ANTLR start "rule__RunTimeModel__Group__3__Impl"
    // InternalDsl.g:853:1: rule__RunTimeModel__Group__3__Impl : ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* ) ;
    public final void rule__RunTimeModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:857:1: ( ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* ) )
            // InternalDsl.g:858:1: ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* )
            {
            // InternalDsl.g:858:1: ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* )
            // InternalDsl.g:859:2: ( rule__RunTimeModel__ServicesDataAssignment_3 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getServicesDataAssignment_3()); 
            // InternalDsl.g:860:2: ( rule__RunTimeModel__ServicesDataAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:860:3: rule__RunTimeModel__ServicesDataAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RunTimeModel__ServicesDataAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRunTimeModelAccess().getServicesDataAssignment_3()); 

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
    // $ANTLR end "rule__RunTimeModel__Group__3__Impl"


    // $ANTLR start "rule__RunTimeModel__Group__4"
    // InternalDsl.g:868:1: rule__RunTimeModel__Group__4 : rule__RunTimeModel__Group__4__Impl ;
    public final void rule__RunTimeModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:872:1: ( rule__RunTimeModel__Group__4__Impl )
            // InternalDsl.g:873:2: rule__RunTimeModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__4__Impl();

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
    // $ANTLR end "rule__RunTimeModel__Group__4"


    // $ANTLR start "rule__RunTimeModel__Group__4__Impl"
    // InternalDsl.g:879:1: rule__RunTimeModel__Group__4__Impl : ( ( rule__RunTimeModel__MappingPairsAssignment_4 )* ) ;
    public final void rule__RunTimeModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:883:1: ( ( ( rule__RunTimeModel__MappingPairsAssignment_4 )* ) )
            // InternalDsl.g:884:1: ( ( rule__RunTimeModel__MappingPairsAssignment_4 )* )
            {
            // InternalDsl.g:884:1: ( ( rule__RunTimeModel__MappingPairsAssignment_4 )* )
            // InternalDsl.g:885:2: ( rule__RunTimeModel__MappingPairsAssignment_4 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getMappingPairsAssignment_4()); 
            // InternalDsl.g:886:2: ( rule__RunTimeModel__MappingPairsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:886:3: rule__RunTimeModel__MappingPairsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RunTimeModel__MappingPairsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRunTimeModelAccess().getMappingPairsAssignment_4()); 

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
    // $ANTLR end "rule__RunTimeModel__Group__4__Impl"


    // $ANTLR start "rule__AppMetaData__Group__0"
    // InternalDsl.g:895:1: rule__AppMetaData__Group__0 : rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 ;
    public final void rule__AppMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:899:1: ( rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 )
            // InternalDsl.g:900:2: rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:907:1: rule__AppMetaData__Group__0__Impl : ( 'app' ) ;
    public final void rule__AppMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:911:1: ( ( 'app' ) )
            // InternalDsl.g:912:1: ( 'app' )
            {
            // InternalDsl.g:912:1: ( 'app' )
            // InternalDsl.g:913:2: 'app'
            {
             before(grammarAccess.getAppMetaDataAccess().getAppKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAppMetaDataAccess().getAppKeyword_0()); 

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
    // InternalDsl.g:922:1: rule__AppMetaData__Group__1 : rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 ;
    public final void rule__AppMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:926:1: ( rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 )
            // InternalDsl.g:927:2: rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:934:1: rule__AppMetaData__Group__1__Impl : ( ( rule__AppMetaData__AppIDAssignment_1 ) ) ;
    public final void rule__AppMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:938:1: ( ( ( rule__AppMetaData__AppIDAssignment_1 ) ) )
            // InternalDsl.g:939:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            {
            // InternalDsl.g:939:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            // InternalDsl.g:940:2: ( rule__AppMetaData__AppIDAssignment_1 )
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 
            // InternalDsl.g:941:2: ( rule__AppMetaData__AppIDAssignment_1 )
            // InternalDsl.g:941:3: rule__AppMetaData__AppIDAssignment_1
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
    // InternalDsl.g:949:1: rule__AppMetaData__Group__2 : rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 ;
    public final void rule__AppMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:953:1: ( rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 )
            // InternalDsl.g:954:2: rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:961:1: rule__AppMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__AppMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:965:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:966:1: ( ruleLBRACE )
            {
            // InternalDsl.g:966:1: ( ruleLBRACE )
            // InternalDsl.g:967:2: ruleLBRACE
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
    // InternalDsl.g:976:1: rule__AppMetaData__Group__3 : rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 ;
    public final void rule__AppMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:980:1: ( rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 )
            // InternalDsl.g:981:2: rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:988:1: rule__AppMetaData__Group__3__Impl : ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) ;
    public final void rule__AppMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:992:1: ( ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) )
            // InternalDsl.g:993:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            {
            // InternalDsl.g:993:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            // InternalDsl.g:994:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_3()); 
            // InternalDsl.g:995:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:995:3: rule__AppMetaData__SpecificationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AppMetaData__SpecificationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:1003:1: rule__AppMetaData__Group__4 : rule__AppMetaData__Group__4__Impl ;
    public final void rule__AppMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1007:1: ( rule__AppMetaData__Group__4__Impl )
            // InternalDsl.g:1008:2: rule__AppMetaData__Group__4__Impl
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
    // InternalDsl.g:1014:1: rule__AppMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__AppMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1018:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:1019:1: ( ruleRBRACE )
            {
            // InternalDsl.g:1019:1: ( ruleRBRACE )
            // InternalDsl.g:1020:2: ruleRBRACE
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


    // $ANTLR start "rule__Specification__Group__0"
    // InternalDsl.g:1030:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1034:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalDsl.g:1035:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__1();

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
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // InternalDsl.g:1042:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__SpecIDAssignment_0 )? ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1046:1: ( ( ( rule__Specification__SpecIDAssignment_0 )? ) )
            // InternalDsl.g:1047:1: ( ( rule__Specification__SpecIDAssignment_0 )? )
            {
            // InternalDsl.g:1047:1: ( ( rule__Specification__SpecIDAssignment_0 )? )
            // InternalDsl.g:1048:2: ( rule__Specification__SpecIDAssignment_0 )?
            {
             before(grammarAccess.getSpecificationAccess().getSpecIDAssignment_0()); 
            // InternalDsl.g:1049:2: ( rule__Specification__SpecIDAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1049:3: rule__Specification__SpecIDAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Specification__SpecIDAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getSpecIDAssignment_0()); 

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
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // InternalDsl.g:1057:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1061:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalDsl.g:1062:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__2();

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
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // InternalDsl.g:1069:1: rule__Specification__Group__1__Impl : ( 'on' ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1073:1: ( ( 'on' ) )
            // InternalDsl.g:1074:1: ( 'on' )
            {
            // InternalDsl.g:1074:1: ( 'on' )
            // InternalDsl.g:1075:2: 'on'
            {
             before(grammarAccess.getSpecificationAccess().getOnKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Specification__Group__2"
    // InternalDsl.g:1084:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1088:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalDsl.g:1089:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Specification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__3();

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
    // $ANTLR end "rule__Specification__Group__2"


    // $ANTLR start "rule__Specification__Group__2__Impl"
    // InternalDsl.g:1096:1: rule__Specification__Group__2__Impl : ( ( rule__Specification__TriggerAssignment_2 )* ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1100:1: ( ( ( rule__Specification__TriggerAssignment_2 )* ) )
            // InternalDsl.g:1101:1: ( ( rule__Specification__TriggerAssignment_2 )* )
            {
            // InternalDsl.g:1101:1: ( ( rule__Specification__TriggerAssignment_2 )* )
            // InternalDsl.g:1102:2: ( rule__Specification__TriggerAssignment_2 )*
            {
             before(grammarAccess.getSpecificationAccess().getTriggerAssignment_2()); 
            // InternalDsl.g:1103:2: ( rule__Specification__TriggerAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_BOOLEAN)||LA14_0==27||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1103:3: rule__Specification__TriggerAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Specification__TriggerAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getTriggerAssignment_2()); 

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
    // $ANTLR end "rule__Specification__Group__2__Impl"


    // $ANTLR start "rule__Specification__Group__3"
    // InternalDsl.g:1111:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl rule__Specification__Group__4 ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1115:1: ( rule__Specification__Group__3__Impl rule__Specification__Group__4 )
            // InternalDsl.g:1116:2: rule__Specification__Group__3__Impl rule__Specification__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Specification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__4();

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
    // $ANTLR end "rule__Specification__Group__3"


    // $ANTLR start "rule__Specification__Group__3__Impl"
    // InternalDsl.g:1123:1: rule__Specification__Group__3__Impl : ( 'if' ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1127:1: ( ( 'if' ) )
            // InternalDsl.g:1128:1: ( 'if' )
            {
            // InternalDsl.g:1128:1: ( 'if' )
            // InternalDsl.g:1129:2: 'if'
            {
             before(grammarAccess.getSpecificationAccess().getIfKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getIfKeyword_3()); 

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
    // $ANTLR end "rule__Specification__Group__3__Impl"


    // $ANTLR start "rule__Specification__Group__4"
    // InternalDsl.g:1138:1: rule__Specification__Group__4 : rule__Specification__Group__4__Impl rule__Specification__Group__5 ;
    public final void rule__Specification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1142:1: ( rule__Specification__Group__4__Impl rule__Specification__Group__5 )
            // InternalDsl.g:1143:2: rule__Specification__Group__4__Impl rule__Specification__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Specification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__5();

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
    // $ANTLR end "rule__Specification__Group__4"


    // $ANTLR start "rule__Specification__Group__4__Impl"
    // InternalDsl.g:1150:1: rule__Specification__Group__4__Impl : ( ( rule__Specification__ConditionAssignment_4 )* ) ;
    public final void rule__Specification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1154:1: ( ( ( rule__Specification__ConditionAssignment_4 )* ) )
            // InternalDsl.g:1155:1: ( ( rule__Specification__ConditionAssignment_4 )* )
            {
            // InternalDsl.g:1155:1: ( ( rule__Specification__ConditionAssignment_4 )* )
            // InternalDsl.g:1156:2: ( rule__Specification__ConditionAssignment_4 )*
            {
             before(grammarAccess.getSpecificationAccess().getConditionAssignment_4()); 
            // InternalDsl.g:1157:2: ( rule__Specification__ConditionAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_BOOLEAN)||LA15_0==27||LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1157:3: rule__Specification__ConditionAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Specification__ConditionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getConditionAssignment_4()); 

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
    // $ANTLR end "rule__Specification__Group__4__Impl"


    // $ANTLR start "rule__Specification__Group__5"
    // InternalDsl.g:1165:1: rule__Specification__Group__5 : rule__Specification__Group__5__Impl rule__Specification__Group__6 ;
    public final void rule__Specification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1169:1: ( rule__Specification__Group__5__Impl rule__Specification__Group__6 )
            // InternalDsl.g:1170:2: rule__Specification__Group__5__Impl rule__Specification__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Specification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__6();

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
    // $ANTLR end "rule__Specification__Group__5"


    // $ANTLR start "rule__Specification__Group__5__Impl"
    // InternalDsl.g:1177:1: rule__Specification__Group__5__Impl : ( 'do' ) ;
    public final void rule__Specification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1181:1: ( ( 'do' ) )
            // InternalDsl.g:1182:1: ( 'do' )
            {
            // InternalDsl.g:1182:1: ( 'do' )
            // InternalDsl.g:1183:2: 'do'
            {
             before(grammarAccess.getSpecificationAccess().getDoKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getDoKeyword_5()); 

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
    // $ANTLR end "rule__Specification__Group__5__Impl"


    // $ANTLR start "rule__Specification__Group__6"
    // InternalDsl.g:1192:1: rule__Specification__Group__6 : rule__Specification__Group__6__Impl rule__Specification__Group__7 ;
    public final void rule__Specification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1196:1: ( rule__Specification__Group__6__Impl rule__Specification__Group__7 )
            // InternalDsl.g:1197:2: rule__Specification__Group__6__Impl rule__Specification__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Specification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__7();

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
    // $ANTLR end "rule__Specification__Group__6"


    // $ANTLR start "rule__Specification__Group__6__Impl"
    // InternalDsl.g:1204:1: rule__Specification__Group__6__Impl : ( ( rule__Specification__ActionAssignment_6 ) ) ;
    public final void rule__Specification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1208:1: ( ( ( rule__Specification__ActionAssignment_6 ) ) )
            // InternalDsl.g:1209:1: ( ( rule__Specification__ActionAssignment_6 ) )
            {
            // InternalDsl.g:1209:1: ( ( rule__Specification__ActionAssignment_6 ) )
            // InternalDsl.g:1210:2: ( rule__Specification__ActionAssignment_6 )
            {
             before(grammarAccess.getSpecificationAccess().getActionAssignment_6()); 
            // InternalDsl.g:1211:2: ( rule__Specification__ActionAssignment_6 )
            // InternalDsl.g:1211:3: rule__Specification__ActionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Specification__ActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getActionAssignment_6()); 

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
    // $ANTLR end "rule__Specification__Group__6__Impl"


    // $ANTLR start "rule__Specification__Group__7"
    // InternalDsl.g:1219:1: rule__Specification__Group__7 : rule__Specification__Group__7__Impl ;
    public final void rule__Specification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1223:1: ( rule__Specification__Group__7__Impl )
            // InternalDsl.g:1224:2: rule__Specification__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__7__Impl();

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
    // $ANTLR end "rule__Specification__Group__7"


    // $ANTLR start "rule__Specification__Group__7__Impl"
    // InternalDsl.g:1230:1: rule__Specification__Group__7__Impl : ( ( rule__Specification__Group_7__0 )* ) ;
    public final void rule__Specification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1234:1: ( ( ( rule__Specification__Group_7__0 )* ) )
            // InternalDsl.g:1235:1: ( ( rule__Specification__Group_7__0 )* )
            {
            // InternalDsl.g:1235:1: ( ( rule__Specification__Group_7__0 )* )
            // InternalDsl.g:1236:2: ( rule__Specification__Group_7__0 )*
            {
             before(grammarAccess.getSpecificationAccess().getGroup_7()); 
            // InternalDsl.g:1237:2: ( rule__Specification__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1237:3: rule__Specification__Group_7__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Specification__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Specification__Group__7__Impl"


    // $ANTLR start "rule__Specification__Group_7__0"
    // InternalDsl.g:1246:1: rule__Specification__Group_7__0 : rule__Specification__Group_7__0__Impl rule__Specification__Group_7__1 ;
    public final void rule__Specification__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1250:1: ( rule__Specification__Group_7__0__Impl rule__Specification__Group_7__1 )
            // InternalDsl.g:1251:2: rule__Specification__Group_7__0__Impl rule__Specification__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Specification__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group_7__1();

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
    // $ANTLR end "rule__Specification__Group_7__0"


    // $ANTLR start "rule__Specification__Group_7__0__Impl"
    // InternalDsl.g:1258:1: rule__Specification__Group_7__0__Impl : ( 'and' ) ;
    public final void rule__Specification__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1262:1: ( ( 'and' ) )
            // InternalDsl.g:1263:1: ( 'and' )
            {
            // InternalDsl.g:1263:1: ( 'and' )
            // InternalDsl.g:1264:2: 'and'
            {
             before(grammarAccess.getSpecificationAccess().getAndKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getAndKeyword_7_0()); 

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
    // $ANTLR end "rule__Specification__Group_7__0__Impl"


    // $ANTLR start "rule__Specification__Group_7__1"
    // InternalDsl.g:1273:1: rule__Specification__Group_7__1 : rule__Specification__Group_7__1__Impl ;
    public final void rule__Specification__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1277:1: ( rule__Specification__Group_7__1__Impl )
            // InternalDsl.g:1278:2: rule__Specification__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group_7__1__Impl();

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
    // $ANTLR end "rule__Specification__Group_7__1"


    // $ANTLR start "rule__Specification__Group_7__1__Impl"
    // InternalDsl.g:1284:1: rule__Specification__Group_7__1__Impl : ( ( rule__Specification__ActionAssignment_7_1 ) ) ;
    public final void rule__Specification__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1288:1: ( ( ( rule__Specification__ActionAssignment_7_1 ) ) )
            // InternalDsl.g:1289:1: ( ( rule__Specification__ActionAssignment_7_1 ) )
            {
            // InternalDsl.g:1289:1: ( ( rule__Specification__ActionAssignment_7_1 ) )
            // InternalDsl.g:1290:2: ( rule__Specification__ActionAssignment_7_1 )
            {
             before(grammarAccess.getSpecificationAccess().getActionAssignment_7_1()); 
            // InternalDsl.g:1291:2: ( rule__Specification__ActionAssignment_7_1 )
            // InternalDsl.g:1291:3: rule__Specification__ActionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Specification__ActionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getActionAssignment_7_1()); 

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
    // $ANTLR end "rule__Specification__Group_7__1__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__0"
    // InternalDsl.g:1300:1: rule__EnvironmentMetaData__Group__0 : rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 ;
    public final void rule__EnvironmentMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1304:1: ( rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 )
            // InternalDsl.g:1305:2: rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EnvironmentMetaData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__1();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__0"


    // $ANTLR start "rule__EnvironmentMetaData__Group__0__Impl"
    // InternalDsl.g:1312:1: rule__EnvironmentMetaData__Group__0__Impl : ( () ) ;
    public final void rule__EnvironmentMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1316:1: ( ( () ) )
            // InternalDsl.g:1317:1: ( () )
            {
            // InternalDsl.g:1317:1: ( () )
            // InternalDsl.g:1318:2: ()
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0()); 
            // InternalDsl.g:1319:2: ()
            // InternalDsl.g:1319:3: 
            {
            }

             after(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__1"
    // InternalDsl.g:1327:1: rule__EnvironmentMetaData__Group__1 : rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 ;
    public final void rule__EnvironmentMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1331:1: ( rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 )
            // InternalDsl.g:1332:2: rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EnvironmentMetaData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__2();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__1"


    // $ANTLR start "rule__EnvironmentMetaData__Group__1__Impl"
    // InternalDsl.g:1339:1: rule__EnvironmentMetaData__Group__1__Impl : ( 'environment' ) ;
    public final void rule__EnvironmentMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1343:1: ( ( 'environment' ) )
            // InternalDsl.g:1344:1: ( 'environment' )
            {
            // InternalDsl.g:1344:1: ( 'environment' )
            // InternalDsl.g:1345:2: 'environment'
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentKeyword_1()); 

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__2"
    // InternalDsl.g:1354:1: rule__EnvironmentMetaData__Group__2 : rule__EnvironmentMetaData__Group__2__Impl rule__EnvironmentMetaData__Group__3 ;
    public final void rule__EnvironmentMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1358:1: ( rule__EnvironmentMetaData__Group__2__Impl rule__EnvironmentMetaData__Group__3 )
            // InternalDsl.g:1359:2: rule__EnvironmentMetaData__Group__2__Impl rule__EnvironmentMetaData__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__EnvironmentMetaData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__3();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__2"


    // $ANTLR start "rule__EnvironmentMetaData__Group__2__Impl"
    // InternalDsl.g:1366:1: rule__EnvironmentMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__EnvironmentMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1370:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:1371:1: ( ruleLBRACE )
            {
            // InternalDsl.g:1371:1: ( ruleLBRACE )
            // InternalDsl.g:1372:2: ruleLBRACE
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getLBRACEParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataAccess().getLBRACEParserRuleCall_2()); 

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__3"
    // InternalDsl.g:1381:1: rule__EnvironmentMetaData__Group__3 : rule__EnvironmentMetaData__Group__3__Impl rule__EnvironmentMetaData__Group__4 ;
    public final void rule__EnvironmentMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1385:1: ( rule__EnvironmentMetaData__Group__3__Impl rule__EnvironmentMetaData__Group__4 )
            // InternalDsl.g:1386:2: rule__EnvironmentMetaData__Group__3__Impl rule__EnvironmentMetaData__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__EnvironmentMetaData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__4();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__3"


    // $ANTLR start "rule__EnvironmentMetaData__Group__3__Impl"
    // InternalDsl.g:1393:1: rule__EnvironmentMetaData__Group__3__Impl : ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* ) ;
    public final void rule__EnvironmentMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1397:1: ( ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* ) )
            // InternalDsl.g:1398:1: ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* )
            {
            // InternalDsl.g:1398:1: ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* )
            // InternalDsl.g:1399:2: ( rule__EnvironmentMetaData__ResourcesAssignment_3 )*
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_3()); 
            // InternalDsl.g:1400:2: ( rule__EnvironmentMetaData__ResourcesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1400:3: rule__EnvironmentMetaData__ResourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EnvironmentMetaData__ResourcesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_3()); 

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__4"
    // InternalDsl.g:1408:1: rule__EnvironmentMetaData__Group__4 : rule__EnvironmentMetaData__Group__4__Impl ;
    public final void rule__EnvironmentMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1412:1: ( rule__EnvironmentMetaData__Group__4__Impl )
            // InternalDsl.g:1413:2: rule__EnvironmentMetaData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__4__Impl();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__4"


    // $ANTLR start "rule__EnvironmentMetaData__Group__4__Impl"
    // InternalDsl.g:1419:1: rule__EnvironmentMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__EnvironmentMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1423:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:1424:1: ( ruleRBRACE )
            {
            // InternalDsl.g:1424:1: ( ruleRBRACE )
            // InternalDsl.g:1425:2: ruleRBRACE
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getRBRACEParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataAccess().getRBRACEParserRuleCall_4()); 

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__4__Impl"


    // $ANTLR start "rule__ServiceMetaData__Group__0"
    // InternalDsl.g:1435:1: rule__ServiceMetaData__Group__0 : rule__ServiceMetaData__Group__0__Impl rule__ServiceMetaData__Group__1 ;
    public final void rule__ServiceMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1439:1: ( rule__ServiceMetaData__Group__0__Impl rule__ServiceMetaData__Group__1 )
            // InternalDsl.g:1440:2: rule__ServiceMetaData__Group__0__Impl rule__ServiceMetaData__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ServiceMetaData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceMetaData__Group__1();

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
    // $ANTLR end "rule__ServiceMetaData__Group__0"


    // $ANTLR start "rule__ServiceMetaData__Group__0__Impl"
    // InternalDsl.g:1447:1: rule__ServiceMetaData__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1451:1: ( ( 'service' ) )
            // InternalDsl.g:1452:1: ( 'service' )
            {
            // InternalDsl.g:1452:1: ( 'service' )
            // InternalDsl.g:1453:2: 'service'
            {
             before(grammarAccess.getServiceMetaDataAccess().getServiceKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceMetaDataAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__ServiceMetaData__Group__0__Impl"


    // $ANTLR start "rule__ServiceMetaData__Group__1"
    // InternalDsl.g:1462:1: rule__ServiceMetaData__Group__1 : rule__ServiceMetaData__Group__1__Impl ;
    public final void rule__ServiceMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1466:1: ( rule__ServiceMetaData__Group__1__Impl )
            // InternalDsl.g:1467:2: rule__ServiceMetaData__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceMetaData__Group__1__Impl();

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
    // $ANTLR end "rule__ServiceMetaData__Group__1"


    // $ANTLR start "rule__ServiceMetaData__Group__1__Impl"
    // InternalDsl.g:1473:1: rule__ServiceMetaData__Group__1__Impl : ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) ) ;
    public final void rule__ServiceMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1477:1: ( ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) ) )
            // InternalDsl.g:1478:1: ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) )
            {
            // InternalDsl.g:1478:1: ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) )
            // InternalDsl.g:1479:2: ( rule__ServiceMetaData__ServiceIDAssignment_1 )
            {
             before(grammarAccess.getServiceMetaDataAccess().getServiceIDAssignment_1()); 
            // InternalDsl.g:1480:2: ( rule__ServiceMetaData__ServiceIDAssignment_1 )
            // InternalDsl.g:1480:3: rule__ServiceMetaData__ServiceIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceMetaData__ServiceIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceMetaDataAccess().getServiceIDAssignment_1()); 

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
    // $ANTLR end "rule__ServiceMetaData__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalDsl.g:1489:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1493:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalDsl.g:1494:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalDsl.g:1501:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1505:1: ( ( 'resource' ) )
            // InternalDsl.g:1506:1: ( 'resource' )
            {
            // InternalDsl.g:1506:1: ( 'resource' )
            // InternalDsl.g:1507:2: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalDsl.g:1516:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1520:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalDsl.g:1521:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalDsl.g:1528:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1532:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalDsl.g:1533:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalDsl.g:1533:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalDsl.g:1534:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalDsl.g:1535:2: ( rule__Resource__NameAssignment_1 )
            // InternalDsl.g:1535:3: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalDsl.g:1543:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1547:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalDsl.g:1548:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalDsl.g:1555:1: rule__Resource__Group__2__Impl : ( 'can' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1559:1: ( ( 'can' ) )
            // InternalDsl.g:1560:1: ( 'can' )
            {
            // InternalDsl.g:1560:1: ( 'can' )
            // InternalDsl.g:1561:2: 'can'
            {
             before(grammarAccess.getResourceAccess().getCanKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCanKeyword_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalDsl.g:1570:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1574:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalDsl.g:1575:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalDsl.g:1582:1: rule__Resource__Group__3__Impl : ( 'be' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1586:1: ( ( 'be' ) )
            // InternalDsl.g:1587:1: ( 'be' )
            {
            // InternalDsl.g:1587:1: ( 'be' )
            // InternalDsl.g:1588:2: 'be'
            {
             before(grammarAccess.getResourceAccess().getBeKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getBeKeyword_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalDsl.g:1597:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1601:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalDsl.g:1602:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__5();

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
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalDsl.g:1609:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__StatesAssignment_4 ) ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1613:1: ( ( ( rule__Resource__StatesAssignment_4 ) ) )
            // InternalDsl.g:1614:1: ( ( rule__Resource__StatesAssignment_4 ) )
            {
            // InternalDsl.g:1614:1: ( ( rule__Resource__StatesAssignment_4 ) )
            // InternalDsl.g:1615:2: ( rule__Resource__StatesAssignment_4 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_4()); 
            // InternalDsl.g:1616:2: ( rule__Resource__StatesAssignment_4 )
            // InternalDsl.g:1616:3: rule__Resource__StatesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Resource__StatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getStatesAssignment_4()); 

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
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // InternalDsl.g:1624:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1628:1: ( rule__Resource__Group__5__Impl )
            // InternalDsl.g:1629:2: rule__Resource__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__5__Impl();

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
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // InternalDsl.g:1635:1: rule__Resource__Group__5__Impl : ( ( rule__Resource__Group_5__0 )* ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1639:1: ( ( ( rule__Resource__Group_5__0 )* ) )
            // InternalDsl.g:1640:1: ( ( rule__Resource__Group_5__0 )* )
            {
            // InternalDsl.g:1640:1: ( ( rule__Resource__Group_5__0 )* )
            // InternalDsl.g:1641:2: ( rule__Resource__Group_5__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_5()); 
            // InternalDsl.g:1642:2: ( rule__Resource__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1642:3: rule__Resource__Group_5__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Resource__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group_5__0"
    // InternalDsl.g:1651:1: rule__Resource__Group_5__0 : rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 ;
    public final void rule__Resource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1655:1: ( rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 )
            // InternalDsl.g:1656:2: rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1
            {
            pushFollow(FOLLOW_23);
            rule__Resource__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_5__1();

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
    // $ANTLR end "rule__Resource__Group_5__0"


    // $ANTLR start "rule__Resource__Group_5__0__Impl"
    // InternalDsl.g:1663:1: rule__Resource__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1667:1: ( ( ',' ) )
            // InternalDsl.g:1668:1: ( ',' )
            {
            // InternalDsl.g:1668:1: ( ',' )
            // InternalDsl.g:1669:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Resource__Group_5__0__Impl"


    // $ANTLR start "rule__Resource__Group_5__1"
    // InternalDsl.g:1678:1: rule__Resource__Group_5__1 : rule__Resource__Group_5__1__Impl ;
    public final void rule__Resource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1682:1: ( rule__Resource__Group_5__1__Impl )
            // InternalDsl.g:1683:2: rule__Resource__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_5__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_5__1"


    // $ANTLR start "rule__Resource__Group_5__1__Impl"
    // InternalDsl.g:1689:1: rule__Resource__Group_5__1__Impl : ( ( rule__Resource__StatesAssignment_5_1 ) ) ;
    public final void rule__Resource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1693:1: ( ( ( rule__Resource__StatesAssignment_5_1 ) ) )
            // InternalDsl.g:1694:1: ( ( rule__Resource__StatesAssignment_5_1 ) )
            {
            // InternalDsl.g:1694:1: ( ( rule__Resource__StatesAssignment_5_1 ) )
            // InternalDsl.g:1695:2: ( rule__Resource__StatesAssignment_5_1 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_5_1()); 
            // InternalDsl.g:1696:2: ( rule__Resource__StatesAssignment_5_1 )
            // InternalDsl.g:1696:3: rule__Resource__StatesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__StatesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getStatesAssignment_5_1()); 

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
    // $ANTLR end "rule__Resource__Group_5__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalDsl.g:1705:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1709:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalDsl.g:1710:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalDsl.g:1717:1: rule__Action__Group__0__Impl : ( ( rule__Action__ResourceAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1721:1: ( ( ( rule__Action__ResourceAssignment_0 ) ) )
            // InternalDsl.g:1722:1: ( ( rule__Action__ResourceAssignment_0 ) )
            {
            // InternalDsl.g:1722:1: ( ( rule__Action__ResourceAssignment_0 ) )
            // InternalDsl.g:1723:2: ( rule__Action__ResourceAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getResourceAssignment_0()); 
            // InternalDsl.g:1724:2: ( rule__Action__ResourceAssignment_0 )
            // InternalDsl.g:1724:3: rule__Action__ResourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getResourceAssignment_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalDsl.g:1732:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1736:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalDsl.g:1737:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalDsl.g:1744:1: rule__Action__Group__1__Impl : ( ':=' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1748:1: ( ( ':=' ) )
            // InternalDsl.g:1749:1: ( ':=' )
            {
            // InternalDsl.g:1749:1: ( ':=' )
            // InternalDsl.g:1750:2: ':='
            {
             before(grammarAccess.getActionAccess().getColonEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalDsl.g:1759:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1763:1: ( rule__Action__Group__2__Impl )
            // InternalDsl.g:1764:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalDsl.g:1770:1: rule__Action__Group__2__Impl : ( ( rule__Action__StateAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1774:1: ( ( ( rule__Action__StateAssignment_2 ) ) )
            // InternalDsl.g:1775:1: ( ( rule__Action__StateAssignment_2 ) )
            {
            // InternalDsl.g:1775:1: ( ( rule__Action__StateAssignment_2 ) )
            // InternalDsl.g:1776:2: ( rule__Action__StateAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getStateAssignment_2()); 
            // InternalDsl.g:1777:2: ( rule__Action__StateAssignment_2 )
            // InternalDsl.g:1777:3: rule__Action__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getStateAssignment_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__MappingPair__Group__0"
    // InternalDsl.g:1786:1: rule__MappingPair__Group__0 : rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 ;
    public final void rule__MappingPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1790:1: ( rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 )
            // InternalDsl.g:1791:2: rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MappingPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__1();

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
    // $ANTLR end "rule__MappingPair__Group__0"


    // $ANTLR start "rule__MappingPair__Group__0__Impl"
    // InternalDsl.g:1798:1: rule__MappingPair__Group__0__Impl : ( () ) ;
    public final void rule__MappingPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1802:1: ( ( () ) )
            // InternalDsl.g:1803:1: ( () )
            {
            // InternalDsl.g:1803:1: ( () )
            // InternalDsl.g:1804:2: ()
            {
             before(grammarAccess.getMappingPairAccess().getMappingPairAction_0()); 
            // InternalDsl.g:1805:2: ()
            // InternalDsl.g:1805:3: 
            {
            }

             after(grammarAccess.getMappingPairAccess().getMappingPairAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__Group__0__Impl"


    // $ANTLR start "rule__MappingPair__Group__1"
    // InternalDsl.g:1813:1: rule__MappingPair__Group__1 : rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 ;
    public final void rule__MappingPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1817:1: ( rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 )
            // InternalDsl.g:1818:2: rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MappingPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__2();

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
    // $ANTLR end "rule__MappingPair__Group__1"


    // $ANTLR start "rule__MappingPair__Group__1__Impl"
    // InternalDsl.g:1825:1: rule__MappingPair__Group__1__Impl : ( 'mapping' ) ;
    public final void rule__MappingPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1829:1: ( ( 'mapping' ) )
            // InternalDsl.g:1830:1: ( 'mapping' )
            {
            // InternalDsl.g:1830:1: ( 'mapping' )
            // InternalDsl.g:1831:2: 'mapping'
            {
             before(grammarAccess.getMappingPairAccess().getMappingKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMappingPairAccess().getMappingKeyword_1()); 

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
    // $ANTLR end "rule__MappingPair__Group__1__Impl"


    // $ANTLR start "rule__MappingPair__Group__2"
    // InternalDsl.g:1840:1: rule__MappingPair__Group__2 : rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 ;
    public final void rule__MappingPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1844:1: ( rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 )
            // InternalDsl.g:1845:2: rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__MappingPair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__3();

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
    // $ANTLR end "rule__MappingPair__Group__2"


    // $ANTLR start "rule__MappingPair__Group__2__Impl"
    // InternalDsl.g:1852:1: rule__MappingPair__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__MappingPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1856:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:1857:1: ( ruleLBRACE )
            {
            // InternalDsl.g:1857:1: ( ruleLBRACE )
            // InternalDsl.g:1858:2: ruleLBRACE
            {
             before(grammarAccess.getMappingPairAccess().getLBRACEParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getMappingPairAccess().getLBRACEParserRuleCall_2()); 

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
    // $ANTLR end "rule__MappingPair__Group__2__Impl"


    // $ANTLR start "rule__MappingPair__Group__3"
    // InternalDsl.g:1867:1: rule__MappingPair__Group__3 : rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 ;
    public final void rule__MappingPair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1871:1: ( rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 )
            // InternalDsl.g:1872:2: rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MappingPair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__4();

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
    // $ANTLR end "rule__MappingPair__Group__3"


    // $ANTLR start "rule__MappingPair__Group__3__Impl"
    // InternalDsl.g:1879:1: rule__MappingPair__Group__3__Impl : ( ( rule__MappingPair__MappingsAssignment_3 )* ) ;
    public final void rule__MappingPair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1883:1: ( ( ( rule__MappingPair__MappingsAssignment_3 )* ) )
            // InternalDsl.g:1884:1: ( ( rule__MappingPair__MappingsAssignment_3 )* )
            {
            // InternalDsl.g:1884:1: ( ( rule__MappingPair__MappingsAssignment_3 )* )
            // InternalDsl.g:1885:2: ( rule__MappingPair__MappingsAssignment_3 )*
            {
             before(grammarAccess.getMappingPairAccess().getMappingsAssignment_3()); 
            // InternalDsl.g:1886:2: ( rule__MappingPair__MappingsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:1886:3: rule__MappingPair__MappingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__MappingPair__MappingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMappingPairAccess().getMappingsAssignment_3()); 

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
    // $ANTLR end "rule__MappingPair__Group__3__Impl"


    // $ANTLR start "rule__MappingPair__Group__4"
    // InternalDsl.g:1894:1: rule__MappingPair__Group__4 : rule__MappingPair__Group__4__Impl ;
    public final void rule__MappingPair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1898:1: ( rule__MappingPair__Group__4__Impl )
            // InternalDsl.g:1899:2: rule__MappingPair__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__4__Impl();

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
    // $ANTLR end "rule__MappingPair__Group__4"


    // $ANTLR start "rule__MappingPair__Group__4__Impl"
    // InternalDsl.g:1905:1: rule__MappingPair__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__MappingPair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1909:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:1910:1: ( ruleRBRACE )
            {
            // InternalDsl.g:1910:1: ( ruleRBRACE )
            // InternalDsl.g:1911:2: ruleRBRACE
            {
             before(grammarAccess.getMappingPairAccess().getRBRACEParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getMappingPairAccess().getRBRACEParserRuleCall_4()); 

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
    // $ANTLR end "rule__MappingPair__Group__4__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // InternalDsl.g:1921:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1925:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalDsl.g:1926:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__1();

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
    // $ANTLR end "rule__Pair__Group__0"


    // $ANTLR start "rule__Pair__Group__0__Impl"
    // InternalDsl.g:1933:1: rule__Pair__Group__0__Impl : ( '(' ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1937:1: ( ( '(' ) )
            // InternalDsl.g:1938:1: ( '(' )
            {
            // InternalDsl.g:1938:1: ( '(' )
            // InternalDsl.g:1939:2: '('
            {
             before(grammarAccess.getPairAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Pair__Group__0__Impl"


    // $ANTLR start "rule__Pair__Group__1"
    // InternalDsl.g:1948:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1952:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalDsl.g:1953:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__2();

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
    // $ANTLR end "rule__Pair__Group__1"


    // $ANTLR start "rule__Pair__Group__1__Impl"
    // InternalDsl.g:1960:1: rule__Pair__Group__1__Impl : ( ( rule__Pair__ResourceAssignment_1 ) ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1964:1: ( ( ( rule__Pair__ResourceAssignment_1 ) ) )
            // InternalDsl.g:1965:1: ( ( rule__Pair__ResourceAssignment_1 ) )
            {
            // InternalDsl.g:1965:1: ( ( rule__Pair__ResourceAssignment_1 ) )
            // InternalDsl.g:1966:2: ( rule__Pair__ResourceAssignment_1 )
            {
             before(grammarAccess.getPairAccess().getResourceAssignment_1()); 
            // InternalDsl.g:1967:2: ( rule__Pair__ResourceAssignment_1 )
            // InternalDsl.g:1967:3: rule__Pair__ResourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pair__ResourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getResourceAssignment_1()); 

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
    // $ANTLR end "rule__Pair__Group__1__Impl"


    // $ANTLR start "rule__Pair__Group__2"
    // InternalDsl.g:1975:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl rule__Pair__Group__3 ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1979:1: ( rule__Pair__Group__2__Impl rule__Pair__Group__3 )
            // InternalDsl.g:1980:2: rule__Pair__Group__2__Impl rule__Pair__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Pair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__3();

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
    // $ANTLR end "rule__Pair__Group__2"


    // $ANTLR start "rule__Pair__Group__2__Impl"
    // InternalDsl.g:1987:1: rule__Pair__Group__2__Impl : ( ',' ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1991:1: ( ( ',' ) )
            // InternalDsl.g:1992:1: ( ',' )
            {
            // InternalDsl.g:1992:1: ( ',' )
            // InternalDsl.g:1993:2: ','
            {
             before(grammarAccess.getPairAccess().getCommaKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Pair__Group__2__Impl"


    // $ANTLR start "rule__Pair__Group__3"
    // InternalDsl.g:2002:1: rule__Pair__Group__3 : rule__Pair__Group__3__Impl rule__Pair__Group__4 ;
    public final void rule__Pair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2006:1: ( rule__Pair__Group__3__Impl rule__Pair__Group__4 )
            // InternalDsl.g:2007:2: rule__Pair__Group__3__Impl rule__Pair__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Pair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__4();

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
    // $ANTLR end "rule__Pair__Group__3"


    // $ANTLR start "rule__Pair__Group__3__Impl"
    // InternalDsl.g:2014:1: rule__Pair__Group__3__Impl : ( ( rule__Pair__StateAssignment_3 ) ) ;
    public final void rule__Pair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2018:1: ( ( ( rule__Pair__StateAssignment_3 ) ) )
            // InternalDsl.g:2019:1: ( ( rule__Pair__StateAssignment_3 ) )
            {
            // InternalDsl.g:2019:1: ( ( rule__Pair__StateAssignment_3 ) )
            // InternalDsl.g:2020:2: ( rule__Pair__StateAssignment_3 )
            {
             before(grammarAccess.getPairAccess().getStateAssignment_3()); 
            // InternalDsl.g:2021:2: ( rule__Pair__StateAssignment_3 )
            // InternalDsl.g:2021:3: rule__Pair__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Pair__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getStateAssignment_3()); 

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
    // $ANTLR end "rule__Pair__Group__3__Impl"


    // $ANTLR start "rule__Pair__Group__4"
    // InternalDsl.g:2029:1: rule__Pair__Group__4 : rule__Pair__Group__4__Impl rule__Pair__Group__5 ;
    public final void rule__Pair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2033:1: ( rule__Pair__Group__4__Impl rule__Pair__Group__5 )
            // InternalDsl.g:2034:2: rule__Pair__Group__4__Impl rule__Pair__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Pair__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__5();

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
    // $ANTLR end "rule__Pair__Group__4"


    // $ANTLR start "rule__Pair__Group__4__Impl"
    // InternalDsl.g:2041:1: rule__Pair__Group__4__Impl : ( ',' ) ;
    public final void rule__Pair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2045:1: ( ( ',' ) )
            // InternalDsl.g:2046:1: ( ',' )
            {
            // InternalDsl.g:2046:1: ( ',' )
            // InternalDsl.g:2047:2: ','
            {
             before(grammarAccess.getPairAccess().getCommaKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Pair__Group__4__Impl"


    // $ANTLR start "rule__Pair__Group__5"
    // InternalDsl.g:2056:1: rule__Pair__Group__5 : rule__Pair__Group__5__Impl rule__Pair__Group__6 ;
    public final void rule__Pair__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2060:1: ( rule__Pair__Group__5__Impl rule__Pair__Group__6 )
            // InternalDsl.g:2061:2: rule__Pair__Group__5__Impl rule__Pair__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Pair__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__6();

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
    // $ANTLR end "rule__Pair__Group__5"


    // $ANTLR start "rule__Pair__Group__5__Impl"
    // InternalDsl.g:2068:1: rule__Pair__Group__5__Impl : ( ( rule__Pair__CodeAssignment_5 ) ) ;
    public final void rule__Pair__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2072:1: ( ( ( rule__Pair__CodeAssignment_5 ) ) )
            // InternalDsl.g:2073:1: ( ( rule__Pair__CodeAssignment_5 ) )
            {
            // InternalDsl.g:2073:1: ( ( rule__Pair__CodeAssignment_5 ) )
            // InternalDsl.g:2074:2: ( rule__Pair__CodeAssignment_5 )
            {
             before(grammarAccess.getPairAccess().getCodeAssignment_5()); 
            // InternalDsl.g:2075:2: ( rule__Pair__CodeAssignment_5 )
            // InternalDsl.g:2075:3: rule__Pair__CodeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Pair__CodeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getCodeAssignment_5()); 

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
    // $ANTLR end "rule__Pair__Group__5__Impl"


    // $ANTLR start "rule__Pair__Group__6"
    // InternalDsl.g:2083:1: rule__Pair__Group__6 : rule__Pair__Group__6__Impl ;
    public final void rule__Pair__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2087:1: ( rule__Pair__Group__6__Impl )
            // InternalDsl.g:2088:2: rule__Pair__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__6__Impl();

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
    // $ANTLR end "rule__Pair__Group__6"


    // $ANTLR start "rule__Pair__Group__6__Impl"
    // InternalDsl.g:2094:1: rule__Pair__Group__6__Impl : ( ')' ) ;
    public final void rule__Pair__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2098:1: ( ( ')' ) )
            // InternalDsl.g:2099:1: ( ')' )
            {
            // InternalDsl.g:2099:1: ( ')' )
            // InternalDsl.g:2100:2: ')'
            {
             before(grammarAccess.getPairAccess().getRightParenthesisKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Pair__Group__6__Impl"


    // $ANTLR start "rule__OrElement__Group__0"
    // InternalDsl.g:2110:1: rule__OrElement__Group__0 : rule__OrElement__Group__0__Impl rule__OrElement__Group__1 ;
    public final void rule__OrElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2114:1: ( rule__OrElement__Group__0__Impl rule__OrElement__Group__1 )
            // InternalDsl.g:2115:2: rule__OrElement__Group__0__Impl rule__OrElement__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDsl.g:2122:1: rule__OrElement__Group__0__Impl : ( ruleAndElement ) ;
    public final void rule__OrElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2126:1: ( ( ruleAndElement ) )
            // InternalDsl.g:2127:1: ( ruleAndElement )
            {
            // InternalDsl.g:2127:1: ( ruleAndElement )
            // InternalDsl.g:2128:2: ruleAndElement
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
    // InternalDsl.g:2137:1: rule__OrElement__Group__1 : rule__OrElement__Group__1__Impl ;
    public final void rule__OrElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2141:1: ( rule__OrElement__Group__1__Impl )
            // InternalDsl.g:2142:2: rule__OrElement__Group__1__Impl
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
    // InternalDsl.g:2148:1: rule__OrElement__Group__1__Impl : ( ( rule__OrElement__Group_1__0 )* ) ;
    public final void rule__OrElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2152:1: ( ( ( rule__OrElement__Group_1__0 )* ) )
            // InternalDsl.g:2153:1: ( ( rule__OrElement__Group_1__0 )* )
            {
            // InternalDsl.g:2153:1: ( ( rule__OrElement__Group_1__0 )* )
            // InternalDsl.g:2154:2: ( rule__OrElement__Group_1__0 )*
            {
             before(grammarAccess.getOrElementAccess().getGroup_1()); 
            // InternalDsl.g:2155:2: ( rule__OrElement__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2155:3: rule__OrElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__OrElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDsl.g:2164:1: rule__OrElement__Group_1__0 : rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 ;
    public final void rule__OrElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2168:1: ( rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 )
            // InternalDsl.g:2169:2: rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2176:1: rule__OrElement__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__OrElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2180:1: ( ( 'or' ) )
            // InternalDsl.g:2181:1: ( 'or' )
            {
            // InternalDsl.g:2181:1: ( 'or' )
            // InternalDsl.g:2182:2: 'or'
            {
             before(grammarAccess.getOrElementAccess().getOrKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDsl.g:2191:1: rule__OrElement__Group_1__1 : rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 ;
    public final void rule__OrElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2195:1: ( rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 )
            // InternalDsl.g:2196:2: rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2203:1: rule__OrElement__Group_1__1__Impl : ( () ) ;
    public final void rule__OrElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2207:1: ( ( () ) )
            // InternalDsl.g:2208:1: ( () )
            {
            // InternalDsl.g:2208:1: ( () )
            // InternalDsl.g:2209:2: ()
            {
             before(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 
            // InternalDsl.g:2210:2: ()
            // InternalDsl.g:2210:3: 
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
    // InternalDsl.g:2218:1: rule__OrElement__Group_1__2 : rule__OrElement__Group_1__2__Impl ;
    public final void rule__OrElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2222:1: ( rule__OrElement__Group_1__2__Impl )
            // InternalDsl.g:2223:2: rule__OrElement__Group_1__2__Impl
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
    // InternalDsl.g:2229:1: rule__OrElement__Group_1__2__Impl : ( ( rule__OrElement__RightAssignment_1_2 ) ) ;
    public final void rule__OrElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2233:1: ( ( ( rule__OrElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2234:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2234:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            // InternalDsl.g:2235:2: ( rule__OrElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2236:2: ( rule__OrElement__RightAssignment_1_2 )
            // InternalDsl.g:2236:3: rule__OrElement__RightAssignment_1_2
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
    // InternalDsl.g:2245:1: rule__AndElement__Group__0 : rule__AndElement__Group__0__Impl rule__AndElement__Group__1 ;
    public final void rule__AndElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2249:1: ( rule__AndElement__Group__0__Impl rule__AndElement__Group__1 )
            // InternalDsl.g:2250:2: rule__AndElement__Group__0__Impl rule__AndElement__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:2257:1: rule__AndElement__Group__0__Impl : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2261:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:2262:1: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:2262:1: ( ruleDiffEqualElement )
            // InternalDsl.g:2263:2: ruleDiffEqualElement
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
    // InternalDsl.g:2272:1: rule__AndElement__Group__1 : rule__AndElement__Group__1__Impl ;
    public final void rule__AndElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2276:1: ( rule__AndElement__Group__1__Impl )
            // InternalDsl.g:2277:2: rule__AndElement__Group__1__Impl
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
    // InternalDsl.g:2283:1: rule__AndElement__Group__1__Impl : ( ( rule__AndElement__Group_1__0 )* ) ;
    public final void rule__AndElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2287:1: ( ( ( rule__AndElement__Group_1__0 )* ) )
            // InternalDsl.g:2288:1: ( ( rule__AndElement__Group_1__0 )* )
            {
            // InternalDsl.g:2288:1: ( ( rule__AndElement__Group_1__0 )* )
            // InternalDsl.g:2289:2: ( rule__AndElement__Group_1__0 )*
            {
             before(grammarAccess.getAndElementAccess().getGroup_1()); 
            // InternalDsl.g:2290:2: ( rule__AndElement__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:2290:3: rule__AndElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AndElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDsl.g:2299:1: rule__AndElement__Group_1__0 : rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 ;
    public final void rule__AndElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2303:1: ( rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 )
            // InternalDsl.g:2304:2: rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2311:1: rule__AndElement__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__AndElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2315:1: ( ( 'and' ) )
            // InternalDsl.g:2316:1: ( 'and' )
            {
            // InternalDsl.g:2316:1: ( 'and' )
            // InternalDsl.g:2317:2: 'and'
            {
             before(grammarAccess.getAndElementAccess().getAndKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:2326:1: rule__AndElement__Group_1__1 : rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 ;
    public final void rule__AndElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2330:1: ( rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 )
            // InternalDsl.g:2331:2: rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2338:1: rule__AndElement__Group_1__1__Impl : ( () ) ;
    public final void rule__AndElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2342:1: ( ( () ) )
            // InternalDsl.g:2343:1: ( () )
            {
            // InternalDsl.g:2343:1: ( () )
            // InternalDsl.g:2344:2: ()
            {
             before(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 
            // InternalDsl.g:2345:2: ()
            // InternalDsl.g:2345:3: 
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
    // InternalDsl.g:2353:1: rule__AndElement__Group_1__2 : rule__AndElement__Group_1__2__Impl ;
    public final void rule__AndElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2357:1: ( rule__AndElement__Group_1__2__Impl )
            // InternalDsl.g:2358:2: rule__AndElement__Group_1__2__Impl
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
    // InternalDsl.g:2364:1: rule__AndElement__Group_1__2__Impl : ( ( rule__AndElement__RightAssignment_1_2 ) ) ;
    public final void rule__AndElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2368:1: ( ( ( rule__AndElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2369:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2369:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            // InternalDsl.g:2370:2: ( rule__AndElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2371:2: ( rule__AndElement__RightAssignment_1_2 )
            // InternalDsl.g:2371:3: rule__AndElement__RightAssignment_1_2
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
    // InternalDsl.g:2380:1: rule__DiffEqualElement__Group__0 : rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 ;
    public final void rule__DiffEqualElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2384:1: ( rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 )
            // InternalDsl.g:2385:2: rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDsl.g:2392:1: rule__DiffEqualElement__Group__0__Impl : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2396:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:2397:1: ( ruleCompareElement )
            {
            // InternalDsl.g:2397:1: ( ruleCompareElement )
            // InternalDsl.g:2398:2: ruleCompareElement
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
    // InternalDsl.g:2407:1: rule__DiffEqualElement__Group__1 : rule__DiffEqualElement__Group__1__Impl ;
    public final void rule__DiffEqualElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2411:1: ( rule__DiffEqualElement__Group__1__Impl )
            // InternalDsl.g:2412:2: rule__DiffEqualElement__Group__1__Impl
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
    // InternalDsl.g:2418:1: rule__DiffEqualElement__Group__1__Impl : ( ( rule__DiffEqualElement__Alternatives_1 )* ) ;
    public final void rule__DiffEqualElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2422:1: ( ( ( rule__DiffEqualElement__Alternatives_1 )* ) )
            // InternalDsl.g:2423:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2423:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            // InternalDsl.g:2424:2: ( rule__DiffEqualElement__Alternatives_1 )*
            {
             before(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2425:2: ( rule__DiffEqualElement__Alternatives_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=30 && LA22_0<=31)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:2425:3: rule__DiffEqualElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__DiffEqualElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalDsl.g:2434:1: rule__DiffEqualElement__Group_1_0__0 : rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 ;
    public final void rule__DiffEqualElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2438:1: ( rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 )
            // InternalDsl.g:2439:2: rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2446:1: rule__DiffEqualElement__Group_1_0__0__Impl : ( '!=' ) ;
    public final void rule__DiffEqualElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2450:1: ( ( '!=' ) )
            // InternalDsl.g:2451:1: ( '!=' )
            {
            // InternalDsl.g:2451:1: ( '!=' )
            // InternalDsl.g:2452:2: '!='
            {
             before(grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDsl.g:2461:1: rule__DiffEqualElement__Group_1_0__1 : rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 ;
    public final void rule__DiffEqualElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2465:1: ( rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 )
            // InternalDsl.g:2466:2: rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2473:1: rule__DiffEqualElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2477:1: ( ( () ) )
            // InternalDsl.g:2478:1: ( () )
            {
            // InternalDsl.g:2478:1: ( () )
            // InternalDsl.g:2479:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 
            // InternalDsl.g:2480:2: ()
            // InternalDsl.g:2480:3: 
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
    // InternalDsl.g:2488:1: rule__DiffEqualElement__Group_1_0__2 : rule__DiffEqualElement__Group_1_0__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2492:1: ( rule__DiffEqualElement__Group_1_0__2__Impl )
            // InternalDsl.g:2493:2: rule__DiffEqualElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2499:1: rule__DiffEqualElement__Group_1_0__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2503:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2504:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2504:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2505:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2506:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2506:3: rule__DiffEqualElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2515:1: rule__DiffEqualElement__Group_1_1__0 : rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 ;
    public final void rule__DiffEqualElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2519:1: ( rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 )
            // InternalDsl.g:2520:2: rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2527:1: rule__DiffEqualElement__Group_1_1__0__Impl : ( '==' ) ;
    public final void rule__DiffEqualElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2531:1: ( ( '==' ) )
            // InternalDsl.g:2532:1: ( '==' )
            {
            // InternalDsl.g:2532:1: ( '==' )
            // InternalDsl.g:2533:2: '=='
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDsl.g:2542:1: rule__DiffEqualElement__Group_1_1__1 : rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 ;
    public final void rule__DiffEqualElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2546:1: ( rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 )
            // InternalDsl.g:2547:2: rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2554:1: rule__DiffEqualElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2558:1: ( ( () ) )
            // InternalDsl.g:2559:1: ( () )
            {
            // InternalDsl.g:2559:1: ( () )
            // InternalDsl.g:2560:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:2561:2: ()
            // InternalDsl.g:2561:3: 
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
    // InternalDsl.g:2569:1: rule__DiffEqualElement__Group_1_1__2 : rule__DiffEqualElement__Group_1_1__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2573:1: ( rule__DiffEqualElement__Group_1_1__2__Impl )
            // InternalDsl.g:2574:2: rule__DiffEqualElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2580:1: rule__DiffEqualElement__Group_1_1__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2584:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2585:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2585:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2586:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2587:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2587:3: rule__DiffEqualElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2596:1: rule__CompareElement__Group__0 : rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 ;
    public final void rule__CompareElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2600:1: ( rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 )
            // InternalDsl.g:2601:2: rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:2608:1: rule__CompareElement__Group__0__Impl : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2612:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2613:1: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2613:1: ( rulePlusMinusElement )
            // InternalDsl.g:2614:2: rulePlusMinusElement
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
    // InternalDsl.g:2623:1: rule__CompareElement__Group__1 : rule__CompareElement__Group__1__Impl ;
    public final void rule__CompareElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2627:1: ( rule__CompareElement__Group__1__Impl )
            // InternalDsl.g:2628:2: rule__CompareElement__Group__1__Impl
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
    // InternalDsl.g:2634:1: rule__CompareElement__Group__1__Impl : ( ( rule__CompareElement__Alternatives_1 )* ) ;
    public final void rule__CompareElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2638:1: ( ( ( rule__CompareElement__Alternatives_1 )* ) )
            // InternalDsl.g:2639:1: ( ( rule__CompareElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2639:1: ( ( rule__CompareElement__Alternatives_1 )* )
            // InternalDsl.g:2640:2: ( rule__CompareElement__Alternatives_1 )*
            {
             before(grammarAccess.getCompareElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2641:2: ( rule__CompareElement__Alternatives_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=32 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:2641:3: rule__CompareElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__CompareElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalDsl.g:2650:1: rule__CompareElement__Group_1_0__0 : rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 ;
    public final void rule__CompareElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2654:1: ( rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 )
            // InternalDsl.g:2655:2: rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2662:1: rule__CompareElement__Group_1_0__0__Impl : ( '>' ) ;
    public final void rule__CompareElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2666:1: ( ( '>' ) )
            // InternalDsl.g:2667:1: ( '>' )
            {
            // InternalDsl.g:2667:1: ( '>' )
            // InternalDsl.g:2668:2: '>'
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDsl.g:2677:1: rule__CompareElement__Group_1_0__1 : rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 ;
    public final void rule__CompareElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2681:1: ( rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 )
            // InternalDsl.g:2682:2: rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2689:1: rule__CompareElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2693:1: ( ( () ) )
            // InternalDsl.g:2694:1: ( () )
            {
            // InternalDsl.g:2694:1: ( () )
            // InternalDsl.g:2695:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 
            // InternalDsl.g:2696:2: ()
            // InternalDsl.g:2696:3: 
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
    // InternalDsl.g:2704:1: rule__CompareElement__Group_1_0__2 : rule__CompareElement__Group_1_0__2__Impl ;
    public final void rule__CompareElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2708:1: ( rule__CompareElement__Group_1_0__2__Impl )
            // InternalDsl.g:2709:2: rule__CompareElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2715:1: rule__CompareElement__Group_1_0__2__Impl : ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__CompareElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2719:1: ( ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2720:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2720:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2721:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2722:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2722:3: rule__CompareElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2731:1: rule__CompareElement__Group_1_1__0 : rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 ;
    public final void rule__CompareElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2735:1: ( rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 )
            // InternalDsl.g:2736:2: rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2743:1: rule__CompareElement__Group_1_1__0__Impl : ( '>=' ) ;
    public final void rule__CompareElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2747:1: ( ( '>=' ) )
            // InternalDsl.g:2748:1: ( '>=' )
            {
            // InternalDsl.g:2748:1: ( '>=' )
            // InternalDsl.g:2749:2: '>='
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDsl.g:2758:1: rule__CompareElement__Group_1_1__1 : rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 ;
    public final void rule__CompareElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2762:1: ( rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 )
            // InternalDsl.g:2763:2: rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2770:1: rule__CompareElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2774:1: ( ( () ) )
            // InternalDsl.g:2775:1: ( () )
            {
            // InternalDsl.g:2775:1: ( () )
            // InternalDsl.g:2776:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:2777:2: ()
            // InternalDsl.g:2777:3: 
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
    // InternalDsl.g:2785:1: rule__CompareElement__Group_1_1__2 : rule__CompareElement__Group_1_1__2__Impl ;
    public final void rule__CompareElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2789:1: ( rule__CompareElement__Group_1_1__2__Impl )
            // InternalDsl.g:2790:2: rule__CompareElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2796:1: rule__CompareElement__Group_1_1__2__Impl : ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__CompareElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2800:1: ( ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2801:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2801:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2802:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2803:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2803:3: rule__CompareElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2812:1: rule__CompareElement__Group_1_2__0 : rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 ;
    public final void rule__CompareElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2816:1: ( rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 )
            // InternalDsl.g:2817:2: rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2824:1: rule__CompareElement__Group_1_2__0__Impl : ( '<' ) ;
    public final void rule__CompareElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2828:1: ( ( '<' ) )
            // InternalDsl.g:2829:1: ( '<' )
            {
            // InternalDsl.g:2829:1: ( '<' )
            // InternalDsl.g:2830:2: '<'
            {
             before(grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDsl.g:2839:1: rule__CompareElement__Group_1_2__1 : rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 ;
    public final void rule__CompareElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2843:1: ( rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 )
            // InternalDsl.g:2844:2: rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2851:1: rule__CompareElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2855:1: ( ( () ) )
            // InternalDsl.g:2856:1: ( () )
            {
            // InternalDsl.g:2856:1: ( () )
            // InternalDsl.g:2857:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 
            // InternalDsl.g:2858:2: ()
            // InternalDsl.g:2858:3: 
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
    // InternalDsl.g:2866:1: rule__CompareElement__Group_1_2__2 : rule__CompareElement__Group_1_2__2__Impl ;
    public final void rule__CompareElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2870:1: ( rule__CompareElement__Group_1_2__2__Impl )
            // InternalDsl.g:2871:2: rule__CompareElement__Group_1_2__2__Impl
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
    // InternalDsl.g:2877:1: rule__CompareElement__Group_1_2__2__Impl : ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__CompareElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2881:1: ( ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:2882:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:2882:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:2883:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:2884:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            // InternalDsl.g:2884:3: rule__CompareElement__RightAssignment_1_2_2
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
    // InternalDsl.g:2893:1: rule__CompareElement__Group_1_3__0 : rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 ;
    public final void rule__CompareElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2897:1: ( rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 )
            // InternalDsl.g:2898:2: rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2905:1: rule__CompareElement__Group_1_3__0__Impl : ( '=<' ) ;
    public final void rule__CompareElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2909:1: ( ( '=<' ) )
            // InternalDsl.g:2910:1: ( '=<' )
            {
            // InternalDsl.g:2910:1: ( '=<' )
            // InternalDsl.g:2911:2: '=<'
            {
             before(grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDsl.g:2920:1: rule__CompareElement__Group_1_3__1 : rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 ;
    public final void rule__CompareElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2924:1: ( rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 )
            // InternalDsl.g:2925:2: rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2932:1: rule__CompareElement__Group_1_3__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2936:1: ( ( () ) )
            // InternalDsl.g:2937:1: ( () )
            {
            // InternalDsl.g:2937:1: ( () )
            // InternalDsl.g:2938:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 
            // InternalDsl.g:2939:2: ()
            // InternalDsl.g:2939:3: 
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
    // InternalDsl.g:2947:1: rule__CompareElement__Group_1_3__2 : rule__CompareElement__Group_1_3__2__Impl ;
    public final void rule__CompareElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2951:1: ( rule__CompareElement__Group_1_3__2__Impl )
            // InternalDsl.g:2952:2: rule__CompareElement__Group_1_3__2__Impl
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
    // InternalDsl.g:2958:1: rule__CompareElement__Group_1_3__2__Impl : ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) ;
    public final void rule__CompareElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2962:1: ( ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) )
            // InternalDsl.g:2963:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            {
            // InternalDsl.g:2963:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            // InternalDsl.g:2964:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 
            // InternalDsl.g:2965:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            // InternalDsl.g:2965:3: rule__CompareElement__RightAssignment_1_3_2
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
    // InternalDsl.g:2974:1: rule__PlusMinusElement__Group__0 : rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 ;
    public final void rule__PlusMinusElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2978:1: ( rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 )
            // InternalDsl.g:2979:2: rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDsl.g:2986:1: rule__PlusMinusElement__Group__0__Impl : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2990:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:2991:1: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:2991:1: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:2992:2: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:3001:1: rule__PlusMinusElement__Group__1 : rule__PlusMinusElement__Group__1__Impl ;
    public final void rule__PlusMinusElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3005:1: ( rule__PlusMinusElement__Group__1__Impl )
            // InternalDsl.g:3006:2: rule__PlusMinusElement__Group__1__Impl
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
    // InternalDsl.g:3012:1: rule__PlusMinusElement__Group__1__Impl : ( ( rule__PlusMinusElement__Alternatives_1 )* ) ;
    public final void rule__PlusMinusElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3016:1: ( ( ( rule__PlusMinusElement__Alternatives_1 )* ) )
            // InternalDsl.g:3017:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            {
            // InternalDsl.g:3017:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            // InternalDsl.g:3018:2: ( rule__PlusMinusElement__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 
            // InternalDsl.g:3019:2: ( rule__PlusMinusElement__Alternatives_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=36 && LA24_0<=37)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:3019:3: rule__PlusMinusElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__PlusMinusElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalDsl.g:3028:1: rule__PlusMinusElement__Group_1_0__0 : rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 ;
    public final void rule__PlusMinusElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3032:1: ( rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 )
            // InternalDsl.g:3033:2: rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3040:1: rule__PlusMinusElement__Group_1_0__0__Impl : ( '+' ) ;
    public final void rule__PlusMinusElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3044:1: ( ( '+' ) )
            // InternalDsl.g:3045:1: ( '+' )
            {
            // InternalDsl.g:3045:1: ( '+' )
            // InternalDsl.g:3046:2: '+'
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDsl.g:3055:1: rule__PlusMinusElement__Group_1_0__1 : rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 ;
    public final void rule__PlusMinusElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3059:1: ( rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 )
            // InternalDsl.g:3060:2: rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3067:1: rule__PlusMinusElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3071:1: ( ( () ) )
            // InternalDsl.g:3072:1: ( () )
            {
            // InternalDsl.g:3072:1: ( () )
            // InternalDsl.g:3073:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 
            // InternalDsl.g:3074:2: ()
            // InternalDsl.g:3074:3: 
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
    // InternalDsl.g:3082:1: rule__PlusMinusElement__Group_1_0__2 : rule__PlusMinusElement__Group_1_0__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3086:1: ( rule__PlusMinusElement__Group_1_0__2__Impl )
            // InternalDsl.g:3087:2: rule__PlusMinusElement__Group_1_0__2__Impl
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
    // InternalDsl.g:3093:1: rule__PlusMinusElement__Group_1_0__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3097:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:3098:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:3098:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:3099:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:3100:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            // InternalDsl.g:3100:3: rule__PlusMinusElement__RightAssignment_1_0_2
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
    // InternalDsl.g:3109:1: rule__PlusMinusElement__Group_1_1__0 : rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 ;
    public final void rule__PlusMinusElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3113:1: ( rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 )
            // InternalDsl.g:3114:2: rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3121:1: rule__PlusMinusElement__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__PlusMinusElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3125:1: ( ( '-' ) )
            // InternalDsl.g:3126:1: ( '-' )
            {
            // InternalDsl.g:3126:1: ( '-' )
            // InternalDsl.g:3127:2: '-'
            {
             before(grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDsl.g:3136:1: rule__PlusMinusElement__Group_1_1__1 : rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 ;
    public final void rule__PlusMinusElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3140:1: ( rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 )
            // InternalDsl.g:3141:2: rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3148:1: rule__PlusMinusElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3152:1: ( ( () ) )
            // InternalDsl.g:3153:1: ( () )
            {
            // InternalDsl.g:3153:1: ( () )
            // InternalDsl.g:3154:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 
            // InternalDsl.g:3155:2: ()
            // InternalDsl.g:3155:3: 
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
    // InternalDsl.g:3163:1: rule__PlusMinusElement__Group_1_1__2 : rule__PlusMinusElement__Group_1_1__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3167:1: ( rule__PlusMinusElement__Group_1_1__2__Impl )
            // InternalDsl.g:3168:2: rule__PlusMinusElement__Group_1_1__2__Impl
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
    // InternalDsl.g:3174:1: rule__PlusMinusElement__Group_1_1__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3178:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3179:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3179:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3180:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3181:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3181:3: rule__PlusMinusElement__RightAssignment_1_1_2
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
    // InternalDsl.g:3190:1: rule__MultiplicationDivisionElement__Group__0 : rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 ;
    public final void rule__MultiplicationDivisionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3194:1: ( rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 )
            // InternalDsl.g:3195:2: rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3202:1: rule__MultiplicationDivisionElement__Group__0__Impl : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3206:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:3207:1: ( ruleUnaryElement )
            {
            // InternalDsl.g:3207:1: ( ruleUnaryElement )
            // InternalDsl.g:3208:2: ruleUnaryElement
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
    // InternalDsl.g:3217:1: rule__MultiplicationDivisionElement__Group__1 : rule__MultiplicationDivisionElement__Group__1__Impl ;
    public final void rule__MultiplicationDivisionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3221:1: ( rule__MultiplicationDivisionElement__Group__1__Impl )
            // InternalDsl.g:3222:2: rule__MultiplicationDivisionElement__Group__1__Impl
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
    // InternalDsl.g:3228:1: rule__MultiplicationDivisionElement__Group__1__Impl : ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) ;
    public final void rule__MultiplicationDivisionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3232:1: ( ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) )
            // InternalDsl.g:3233:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            {
            // InternalDsl.g:3233:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            // InternalDsl.g:3234:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 
            // InternalDsl.g:3235:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=38 && LA25_0<=40)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:3235:3: rule__MultiplicationDivisionElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__MultiplicationDivisionElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalDsl.g:3244:1: rule__MultiplicationDivisionElement__Group_1_0__0 : rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3248:1: ( rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 )
            // InternalDsl.g:3249:2: rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3256:1: rule__MultiplicationDivisionElement__Group_1_0__0__Impl : ( '*' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3260:1: ( ( '*' ) )
            // InternalDsl.g:3261:1: ( '*' )
            {
            // InternalDsl.g:3261:1: ( '*' )
            // InternalDsl.g:3262:2: '*'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDsl.g:3271:1: rule__MultiplicationDivisionElement__Group_1_0__1 : rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3275:1: ( rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 )
            // InternalDsl.g:3276:2: rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3283:1: rule__MultiplicationDivisionElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3287:1: ( ( () ) )
            // InternalDsl.g:3288:1: ( () )
            {
            // InternalDsl.g:3288:1: ( () )
            // InternalDsl.g:3289:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 
            // InternalDsl.g:3290:2: ()
            // InternalDsl.g:3290:3: 
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
    // InternalDsl.g:3298:1: rule__MultiplicationDivisionElement__Group_1_0__2 : rule__MultiplicationDivisionElement__Group_1_0__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3302:1: ( rule__MultiplicationDivisionElement__Group_1_0__2__Impl )
            // InternalDsl.g:3303:2: rule__MultiplicationDivisionElement__Group_1_0__2__Impl
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
    // InternalDsl.g:3309:1: rule__MultiplicationDivisionElement__Group_1_0__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3313:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:3314:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:3314:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:3315:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:3316:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            // InternalDsl.g:3316:3: rule__MultiplicationDivisionElement__RightAssignment_1_0_2
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
    // InternalDsl.g:3325:1: rule__MultiplicationDivisionElement__Group_1_1__0 : rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3329:1: ( rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 )
            // InternalDsl.g:3330:2: rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3337:1: rule__MultiplicationDivisionElement__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3341:1: ( ( '/' ) )
            // InternalDsl.g:3342:1: ( '/' )
            {
            // InternalDsl.g:3342:1: ( '/' )
            // InternalDsl.g:3343:2: '/'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDsl.g:3352:1: rule__MultiplicationDivisionElement__Group_1_1__1 : rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3356:1: ( rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 )
            // InternalDsl.g:3357:2: rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3364:1: rule__MultiplicationDivisionElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3368:1: ( ( () ) )
            // InternalDsl.g:3369:1: ( () )
            {
            // InternalDsl.g:3369:1: ( () )
            // InternalDsl.g:3370:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 
            // InternalDsl.g:3371:2: ()
            // InternalDsl.g:3371:3: 
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
    // InternalDsl.g:3379:1: rule__MultiplicationDivisionElement__Group_1_1__2 : rule__MultiplicationDivisionElement__Group_1_1__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3383:1: ( rule__MultiplicationDivisionElement__Group_1_1__2__Impl )
            // InternalDsl.g:3384:2: rule__MultiplicationDivisionElement__Group_1_1__2__Impl
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
    // InternalDsl.g:3390:1: rule__MultiplicationDivisionElement__Group_1_1__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3394:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3395:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3395:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3396:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3397:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3397:3: rule__MultiplicationDivisionElement__RightAssignment_1_1_2
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
    // InternalDsl.g:3406:1: rule__MultiplicationDivisionElement__Group_1_2__0 : rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3410:1: ( rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 )
            // InternalDsl.g:3411:2: rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3418:1: rule__MultiplicationDivisionElement__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3422:1: ( ( '%' ) )
            // InternalDsl.g:3423:1: ( '%' )
            {
            // InternalDsl.g:3423:1: ( '%' )
            // InternalDsl.g:3424:2: '%'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDsl.g:3433:1: rule__MultiplicationDivisionElement__Group_1_2__1 : rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3437:1: ( rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 )
            // InternalDsl.g:3438:2: rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3445:1: rule__MultiplicationDivisionElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3449:1: ( ( () ) )
            // InternalDsl.g:3450:1: ( () )
            {
            // InternalDsl.g:3450:1: ( () )
            // InternalDsl.g:3451:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 
            // InternalDsl.g:3452:2: ()
            // InternalDsl.g:3452:3: 
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
    // InternalDsl.g:3460:1: rule__MultiplicationDivisionElement__Group_1_2__2 : rule__MultiplicationDivisionElement__Group_1_2__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3464:1: ( rule__MultiplicationDivisionElement__Group_1_2__2__Impl )
            // InternalDsl.g:3465:2: rule__MultiplicationDivisionElement__Group_1_2__2__Impl
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
    // InternalDsl.g:3471:1: rule__MultiplicationDivisionElement__Group_1_2__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3475:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:3476:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:3476:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:3477:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:3478:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            // InternalDsl.g:3478:3: rule__MultiplicationDivisionElement__RightAssignment_1_2_2
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
    // InternalDsl.g:3487:1: rule__UnaryElement__Group_0__0 : rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 ;
    public final void rule__UnaryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3491:1: ( rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 )
            // InternalDsl.g:3492:2: rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalDsl.g:3499:1: rule__UnaryElement__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3503:1: ( ( () ) )
            // InternalDsl.g:3504:1: ( () )
            {
            // InternalDsl.g:3504:1: ( () )
            // InternalDsl.g:3505:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 
            // InternalDsl.g:3506:2: ()
            // InternalDsl.g:3506:3: 
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
    // InternalDsl.g:3514:1: rule__UnaryElement__Group_0__1 : rule__UnaryElement__Group_0__1__Impl ;
    public final void rule__UnaryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3518:1: ( rule__UnaryElement__Group_0__1__Impl )
            // InternalDsl.g:3519:2: rule__UnaryElement__Group_0__1__Impl
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
    // InternalDsl.g:3525:1: rule__UnaryElement__Group_0__1__Impl : ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) ;
    public final void rule__UnaryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3529:1: ( ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) )
            // InternalDsl.g:3530:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            {
            // InternalDsl.g:3530:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            // InternalDsl.g:3531:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 
            // InternalDsl.g:3532:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            // InternalDsl.g:3532:3: rule__UnaryElement__ValueAssignment_0_1
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
    // InternalDsl.g:3541:1: rule__UnaryElement__Group_1__0 : rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 ;
    public final void rule__UnaryElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3545:1: ( rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 )
            // InternalDsl.g:3546:2: rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:3553:1: rule__UnaryElement__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3557:1: ( ( () ) )
            // InternalDsl.g:3558:1: ( () )
            {
            // InternalDsl.g:3558:1: ( () )
            // InternalDsl.g:3559:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0()); 
            // InternalDsl.g:3560:2: ()
            // InternalDsl.g:3560:3: 
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
    // InternalDsl.g:3568:1: rule__UnaryElement__Group_1__1 : rule__UnaryElement__Group_1__1__Impl ;
    public final void rule__UnaryElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3572:1: ( rule__UnaryElement__Group_1__1__Impl )
            // InternalDsl.g:3573:2: rule__UnaryElement__Group_1__1__Impl
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
    // InternalDsl.g:3579:1: rule__UnaryElement__Group_1__1__Impl : ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) ;
    public final void rule__UnaryElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3583:1: ( ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:3584:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:3584:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            // InternalDsl.g:3585:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:3586:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            // InternalDsl.g:3586:3: rule__UnaryElement__ValueAssignment_1_1
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
    // InternalDsl.g:3595:1: rule__UnaryElement__Group_2__0 : rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 ;
    public final void rule__UnaryElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3599:1: ( rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 )
            // InternalDsl.g:3600:2: rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDsl.g:3607:1: rule__UnaryElement__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3611:1: ( ( () ) )
            // InternalDsl.g:3612:1: ( () )
            {
            // InternalDsl.g:3612:1: ( () )
            // InternalDsl.g:3613:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0()); 
            // InternalDsl.g:3614:2: ()
            // InternalDsl.g:3614:3: 
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
    // InternalDsl.g:3622:1: rule__UnaryElement__Group_2__1 : rule__UnaryElement__Group_2__1__Impl ;
    public final void rule__UnaryElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3626:1: ( rule__UnaryElement__Group_2__1__Impl )
            // InternalDsl.g:3627:2: rule__UnaryElement__Group_2__1__Impl
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
    // InternalDsl.g:3633:1: rule__UnaryElement__Group_2__1__Impl : ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) ;
    public final void rule__UnaryElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3637:1: ( ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:3638:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:3638:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            // InternalDsl.g:3639:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:3640:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            // InternalDsl.g:3640:3: rule__UnaryElement__ValueAssignment_2_1
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
    // InternalDsl.g:3649:1: rule__UnaryElement__Group_3__0 : rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 ;
    public final void rule__UnaryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3653:1: ( rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 )
            // InternalDsl.g:3654:2: rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3661:1: rule__UnaryElement__Group_3__0__Impl : ( '(' ) ;
    public final void rule__UnaryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3665:1: ( ( '(' ) )
            // InternalDsl.g:3666:1: ( '(' )
            {
            // InternalDsl.g:3666:1: ( '(' )
            // InternalDsl.g:3667:2: '('
            {
             before(grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:3676:1: rule__UnaryElement__Group_3__1 : rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 ;
    public final void rule__UnaryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3680:1: ( rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 )
            // InternalDsl.g:3681:2: rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalDsl.g:3688:1: rule__UnaryElement__Group_3__1__Impl : ( ruleOrElement ) ;
    public final void rule__UnaryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3692:1: ( ( ruleOrElement ) )
            // InternalDsl.g:3693:1: ( ruleOrElement )
            {
            // InternalDsl.g:3693:1: ( ruleOrElement )
            // InternalDsl.g:3694:2: ruleOrElement
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
    // InternalDsl.g:3703:1: rule__UnaryElement__Group_3__2 : rule__UnaryElement__Group_3__2__Impl ;
    public final void rule__UnaryElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3707:1: ( rule__UnaryElement__Group_3__2__Impl )
            // InternalDsl.g:3708:2: rule__UnaryElement__Group_3__2__Impl
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
    // InternalDsl.g:3714:1: rule__UnaryElement__Group_3__2__Impl : ( ')' ) ;
    public final void rule__UnaryElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3718:1: ( ( ')' ) )
            // InternalDsl.g:3719:1: ( ')' )
            {
            // InternalDsl.g:3719:1: ( ')' )
            // InternalDsl.g:3720:2: ')'
            {
             before(grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_3_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:3730:1: rule__UnaryElement__Group_4__0 : rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 ;
    public final void rule__UnaryElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3734:1: ( rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 )
            // InternalDsl.g:3735:2: rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3742:1: rule__UnaryElement__Group_4__0__Impl : ( 'not' ) ;
    public final void rule__UnaryElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3746:1: ( ( 'not' ) )
            // InternalDsl.g:3747:1: ( 'not' )
            {
            // InternalDsl.g:3747:1: ( 'not' )
            // InternalDsl.g:3748:2: 'not'
            {
             before(grammarAccess.getUnaryElementAccess().getNotKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDsl.g:3757:1: rule__UnaryElement__Group_4__1 : rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 ;
    public final void rule__UnaryElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3761:1: ( rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 )
            // InternalDsl.g:3762:2: rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3769:1: rule__UnaryElement__Group_4__1__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3773:1: ( ( () ) )
            // InternalDsl.g:3774:1: ( () )
            {
            // InternalDsl.g:3774:1: ( () )
            // InternalDsl.g:3775:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1()); 
            // InternalDsl.g:3776:2: ()
            // InternalDsl.g:3776:3: 
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
    // InternalDsl.g:3784:1: rule__UnaryElement__Group_4__2 : rule__UnaryElement__Group_4__2__Impl ;
    public final void rule__UnaryElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3788:1: ( rule__UnaryElement__Group_4__2__Impl )
            // InternalDsl.g:3789:2: rule__UnaryElement__Group_4__2__Impl
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
    // InternalDsl.g:3795:1: rule__UnaryElement__Group_4__2__Impl : ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) ;
    public final void rule__UnaryElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3799:1: ( ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) )
            // InternalDsl.g:3800:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            {
            // InternalDsl.g:3800:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            // InternalDsl.g:3801:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            {
             before(grammarAccess.getUnaryElementAccess().getExpAssignment_4_2()); 
            // InternalDsl.g:3802:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            // InternalDsl.g:3802:3: rule__UnaryElement__ExpAssignment_4_2
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
    // InternalDsl.g:3811:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3815:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalDsl.g:3816:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalDsl.g:3823:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3827:1: ( ( RULE_INT ) )
            // InternalDsl.g:3828:1: ( RULE_INT )
            {
            // InternalDsl.g:3828:1: ( RULE_INT )
            // InternalDsl.g:3829:2: RULE_INT
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
    // InternalDsl.g:3838:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3842:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // InternalDsl.g:3843:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalDsl.g:3850:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3854:1: ( ( '.' ) )
            // InternalDsl.g:3855:1: ( '.' )
            {
            // InternalDsl.g:3855:1: ( '.' )
            // InternalDsl.g:3856:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDsl.g:3865:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3869:1: ( rule__NUMBER__Group_1__2__Impl )
            // InternalDsl.g:3870:2: rule__NUMBER__Group_1__2__Impl
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
    // InternalDsl.g:3876:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3880:1: ( ( RULE_INT ) )
            // InternalDsl.g:3881:1: ( RULE_INT )
            {
            // InternalDsl.g:3881:1: ( RULE_INT )
            // InternalDsl.g:3882:2: RULE_INT
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
    // InternalDsl.g:3892:1: rule__EXTENDED_STRING__Group__0 : rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 ;
    public final void rule__EXTENDED_STRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3896:1: ( rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 )
            // InternalDsl.g:3897:2: rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalDsl.g:3904:1: rule__EXTENDED_STRING__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3908:1: ( ( RULE_ID ) )
            // InternalDsl.g:3909:1: ( RULE_ID )
            {
            // InternalDsl.g:3909:1: ( RULE_ID )
            // InternalDsl.g:3910:2: RULE_ID
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
    // InternalDsl.g:3919:1: rule__EXTENDED_STRING__Group__1 : rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 ;
    public final void rule__EXTENDED_STRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3923:1: ( rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 )
            // InternalDsl.g:3924:2: rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalDsl.g:3931:1: rule__EXTENDED_STRING__Group__1__Impl : ( ( rule__EXTENDED_STRING__Group_1__0 )* ) ;
    public final void rule__EXTENDED_STRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3935:1: ( ( ( rule__EXTENDED_STRING__Group_1__0 )* ) )
            // InternalDsl.g:3936:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            {
            // InternalDsl.g:3936:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            // InternalDsl.g:3937:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_1()); 
            // InternalDsl.g:3938:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:3938:3: rule__EXTENDED_STRING__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__EXTENDED_STRING__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalDsl.g:3946:1: rule__EXTENDED_STRING__Group__2 : rule__EXTENDED_STRING__Group__2__Impl ;
    public final void rule__EXTENDED_STRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3950:1: ( rule__EXTENDED_STRING__Group__2__Impl )
            // InternalDsl.g:3951:2: rule__EXTENDED_STRING__Group__2__Impl
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
    // InternalDsl.g:3957:1: rule__EXTENDED_STRING__Group__2__Impl : ( ( rule__EXTENDED_STRING__Group_2__0 )? ) ;
    public final void rule__EXTENDED_STRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3961:1: ( ( ( rule__EXTENDED_STRING__Group_2__0 )? ) )
            // InternalDsl.g:3962:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            {
            // InternalDsl.g:3962:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            // InternalDsl.g:3963:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_2()); 
            // InternalDsl.g:3964:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==28) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:3964:3: rule__EXTENDED_STRING__Group_2__0
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
    // InternalDsl.g:3973:1: rule__EXTENDED_STRING__Group_1__0 : rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 ;
    public final void rule__EXTENDED_STRING__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3977:1: ( rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 )
            // InternalDsl.g:3978:2: rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:3985:1: rule__EXTENDED_STRING__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EXTENDED_STRING__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3989:1: ( ( '.' ) )
            // InternalDsl.g:3990:1: ( '.' )
            {
            // InternalDsl.g:3990:1: ( '.' )
            // InternalDsl.g:3991:2: '.'
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getFullStopKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDsl.g:4000:1: rule__EXTENDED_STRING__Group_1__1 : rule__EXTENDED_STRING__Group_1__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4004:1: ( rule__EXTENDED_STRING__Group_1__1__Impl )
            // InternalDsl.g:4005:2: rule__EXTENDED_STRING__Group_1__1__Impl
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
    // InternalDsl.g:4011:1: rule__EXTENDED_STRING__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4015:1: ( ( RULE_ID ) )
            // InternalDsl.g:4016:1: ( RULE_ID )
            {
            // InternalDsl.g:4016:1: ( RULE_ID )
            // InternalDsl.g:4017:2: RULE_ID
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
    // InternalDsl.g:4027:1: rule__EXTENDED_STRING__Group_2__0 : rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 ;
    public final void rule__EXTENDED_STRING__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4031:1: ( rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 )
            // InternalDsl.g:4032:2: rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDsl.g:4039:1: rule__EXTENDED_STRING__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EXTENDED_STRING__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4043:1: ( ( '(' ) )
            // InternalDsl.g:4044:1: ( '(' )
            {
            // InternalDsl.g:4044:1: ( '(' )
            // InternalDsl.g:4045:2: '('
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:4054:1: rule__EXTENDED_STRING__Group_2__1 : rule__EXTENDED_STRING__Group_2__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4058:1: ( rule__EXTENDED_STRING__Group_2__1__Impl )
            // InternalDsl.g:4059:2: rule__EXTENDED_STRING__Group_2__1__Impl
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
    // InternalDsl.g:4065:1: rule__EXTENDED_STRING__Group_2__1__Impl : ( ')' ) ;
    public final void rule__EXTENDED_STRING__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4069:1: ( ( ')' ) )
            // InternalDsl.g:4070:1: ( ')' )
            {
            // InternalDsl.g:4070:1: ( ')' )
            // InternalDsl.g:4071:2: ')'
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getRightParenthesisKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__RunTimeModel__EnvDataAssignment_1"
    // InternalDsl.g:4081:1: rule__RunTimeModel__EnvDataAssignment_1 : ( ruleEnvironmentMetaData ) ;
    public final void rule__RunTimeModel__EnvDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4085:1: ( ( ruleEnvironmentMetaData ) )
            // InternalDsl.g:4086:2: ( ruleEnvironmentMetaData )
            {
            // InternalDsl.g:4086:2: ( ruleEnvironmentMetaData )
            // InternalDsl.g:4087:3: ruleEnvironmentMetaData
            {
             before(grammarAccess.getRunTimeModelAccess().getEnvDataEnvironmentMetaDataParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentMetaData();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getEnvDataEnvironmentMetaDataParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RunTimeModel__EnvDataAssignment_1"


    // $ANTLR start "rule__RunTimeModel__AppDataAssignment_2"
    // InternalDsl.g:4096:1: rule__RunTimeModel__AppDataAssignment_2 : ( ruleAppMetaData ) ;
    public final void rule__RunTimeModel__AppDataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4100:1: ( ( ruleAppMetaData ) )
            // InternalDsl.g:4101:2: ( ruleAppMetaData )
            {
            // InternalDsl.g:4101:2: ( ruleAppMetaData )
            // InternalDsl.g:4102:3: ruleAppMetaData
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAppMetaData();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RunTimeModel__AppDataAssignment_2"


    // $ANTLR start "rule__RunTimeModel__ServicesDataAssignment_3"
    // InternalDsl.g:4111:1: rule__RunTimeModel__ServicesDataAssignment_3 : ( ruleServiceMetaData ) ;
    public final void rule__RunTimeModel__ServicesDataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4115:1: ( ( ruleServiceMetaData ) )
            // InternalDsl.g:4116:2: ( ruleServiceMetaData )
            {
            // InternalDsl.g:4116:2: ( ruleServiceMetaData )
            // InternalDsl.g:4117:3: ruleServiceMetaData
            {
             before(grammarAccess.getRunTimeModelAccess().getServicesDataServiceMetaDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceMetaData();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getServicesDataServiceMetaDataParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RunTimeModel__ServicesDataAssignment_3"


    // $ANTLR start "rule__RunTimeModel__MappingPairsAssignment_4"
    // InternalDsl.g:4126:1: rule__RunTimeModel__MappingPairsAssignment_4 : ( ruleMappingPair ) ;
    public final void rule__RunTimeModel__MappingPairsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4130:1: ( ( ruleMappingPair ) )
            // InternalDsl.g:4131:2: ( ruleMappingPair )
            {
            // InternalDsl.g:4131:2: ( ruleMappingPair )
            // InternalDsl.g:4132:3: ruleMappingPair
            {
             before(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingPair();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RunTimeModel__MappingPairsAssignment_4"


    // $ANTLR start "rule__AppMetaData__AppIDAssignment_1"
    // InternalDsl.g:4141:1: rule__AppMetaData__AppIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppMetaData__AppIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4145:1: ( ( RULE_ID ) )
            // InternalDsl.g:4146:2: ( RULE_ID )
            {
            // InternalDsl.g:4146:2: ( RULE_ID )
            // InternalDsl.g:4147:3: RULE_ID
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
    // InternalDsl.g:4156:1: rule__AppMetaData__SpecificationsAssignment_3 : ( ruleSpecification ) ;
    public final void rule__AppMetaData__SpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4160:1: ( ( ruleSpecification ) )
            // InternalDsl.g:4161:2: ( ruleSpecification )
            {
            // InternalDsl.g:4161:2: ( ruleSpecification )
            // InternalDsl.g:4162:3: ruleSpecification
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getSpecificationsSpecificationParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Specification__SpecIDAssignment_0"
    // InternalDsl.g:4171:1: rule__Specification__SpecIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__Specification__SpecIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4175:1: ( ( RULE_ID ) )
            // InternalDsl.g:4176:2: ( RULE_ID )
            {
            // InternalDsl.g:4176:2: ( RULE_ID )
            // InternalDsl.g:4177:3: RULE_ID
            {
             before(grammarAccess.getSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Specification__SpecIDAssignment_0"


    // $ANTLR start "rule__Specification__TriggerAssignment_2"
    // InternalDsl.g:4186:1: rule__Specification__TriggerAssignment_2 : ( ruleOrElement ) ;
    public final void rule__Specification__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4190:1: ( ( ruleOrElement ) )
            // InternalDsl.g:4191:2: ( ruleOrElement )
            {
            // InternalDsl.g:4191:2: ( ruleOrElement )
            // InternalDsl.g:4192:3: ruleOrElement
            {
             before(grammarAccess.getSpecificationAccess().getTriggerOrElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getTriggerOrElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Specification__TriggerAssignment_2"


    // $ANTLR start "rule__Specification__ConditionAssignment_4"
    // InternalDsl.g:4201:1: rule__Specification__ConditionAssignment_4 : ( ruleOrElement ) ;
    public final void rule__Specification__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4205:1: ( ( ruleOrElement ) )
            // InternalDsl.g:4206:2: ( ruleOrElement )
            {
            // InternalDsl.g:4206:2: ( ruleOrElement )
            // InternalDsl.g:4207:3: ruleOrElement
            {
             before(grammarAccess.getSpecificationAccess().getConditionOrElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getConditionOrElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Specification__ConditionAssignment_4"


    // $ANTLR start "rule__Specification__ActionAssignment_6"
    // InternalDsl.g:4216:1: rule__Specification__ActionAssignment_6 : ( ruleAction ) ;
    public final void rule__Specification__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4220:1: ( ( ruleAction ) )
            // InternalDsl.g:4221:2: ( ruleAction )
            {
            // InternalDsl.g:4221:2: ( ruleAction )
            // InternalDsl.g:4222:3: ruleAction
            {
             before(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Specification__ActionAssignment_6"


    // $ANTLR start "rule__Specification__ActionAssignment_7_1"
    // InternalDsl.g:4231:1: rule__Specification__ActionAssignment_7_1 : ( ruleAction ) ;
    public final void rule__Specification__ActionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4235:1: ( ( ruleAction ) )
            // InternalDsl.g:4236:2: ( ruleAction )
            {
            // InternalDsl.g:4236:2: ( ruleAction )
            // InternalDsl.g:4237:3: ruleAction
            {
             before(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getActionActionParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Specification__ActionAssignment_7_1"


    // $ANTLR start "rule__EnvironmentMetaData__ResourcesAssignment_3"
    // InternalDsl.g:4246:1: rule__EnvironmentMetaData__ResourcesAssignment_3 : ( ruleResource ) ;
    public final void rule__EnvironmentMetaData__ResourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4250:1: ( ( ruleResource ) )
            // InternalDsl.g:4251:2: ( ruleResource )
            {
            // InternalDsl.g:4251:2: ( ruleResource )
            // InternalDsl.g:4252:3: ruleResource
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnvironmentMetaData__ResourcesAssignment_3"


    // $ANTLR start "rule__ServiceMetaData__ServiceIDAssignment_1"
    // InternalDsl.g:4261:1: rule__ServiceMetaData__ServiceIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceMetaData__ServiceIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4265:1: ( ( RULE_ID ) )
            // InternalDsl.g:4266:2: ( RULE_ID )
            {
            // InternalDsl.g:4266:2: ( RULE_ID )
            // InternalDsl.g:4267:3: RULE_ID
            {
             before(grammarAccess.getServiceMetaDataAccess().getServiceIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceMetaDataAccess().getServiceIDIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServiceMetaData__ServiceIDAssignment_1"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // InternalDsl.g:4276:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4280:1: ( ( RULE_ID ) )
            // InternalDsl.g:4281:2: ( RULE_ID )
            {
            // InternalDsl.g:4281:2: ( RULE_ID )
            // InternalDsl.g:4282:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__StatesAssignment_4"
    // InternalDsl.g:4291:1: rule__Resource__StatesAssignment_4 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4295:1: ( ( ruleState ) )
            // InternalDsl.g:4296:2: ( ruleState )
            {
            // InternalDsl.g:4296:2: ( ruleState )
            // InternalDsl.g:4297:3: ruleState
            {
             before(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Resource__StatesAssignment_4"


    // $ANTLR start "rule__Resource__StatesAssignment_5_1"
    // InternalDsl.g:4306:1: rule__Resource__StatesAssignment_5_1 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4310:1: ( ( ruleState ) )
            // InternalDsl.g:4311:2: ( ruleState )
            {
            // InternalDsl.g:4311:2: ( ruleState )
            // InternalDsl.g:4312:3: ruleState
            {
             before(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Resource__StatesAssignment_5_1"


    // $ANTLR start "rule__Action__ResourceAssignment_0"
    // InternalDsl.g:4321:1: rule__Action__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4325:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4326:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4326:2: ( ( RULE_ID ) )
            // InternalDsl.g:4327:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0()); 
            // InternalDsl.g:4328:3: ( RULE_ID )
            // InternalDsl.g:4329:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0()); 

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
    // $ANTLR end "rule__Action__ResourceAssignment_0"


    // $ANTLR start "rule__Action__StateAssignment_2"
    // InternalDsl.g:4340:1: rule__Action__StateAssignment_2 : ( ruleState ) ;
    public final void rule__Action__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4344:1: ( ( ruleState ) )
            // InternalDsl.g:4345:2: ( ruleState )
            {
            // InternalDsl.g:4345:2: ( ruleState )
            // InternalDsl.g:4346:3: ruleState
            {
             before(grammarAccess.getActionAccess().getStateStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getActionAccess().getStateStateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Action__StateAssignment_2"


    // $ANTLR start "rule__MappingPair__MappingsAssignment_3"
    // InternalDsl.g:4355:1: rule__MappingPair__MappingsAssignment_3 : ( rulePair ) ;
    public final void rule__MappingPair__MappingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4359:1: ( ( rulePair ) )
            // InternalDsl.g:4360:2: ( rulePair )
            {
            // InternalDsl.g:4360:2: ( rulePair )
            // InternalDsl.g:4361:3: rulePair
            {
             before(grammarAccess.getMappingPairAccess().getMappingsPairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getMappingPairAccess().getMappingsPairParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MappingPair__MappingsAssignment_3"


    // $ANTLR start "rule__Pair__ResourceAssignment_1"
    // InternalDsl.g:4370:1: rule__Pair__ResourceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Pair__ResourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4374:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4375:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4375:2: ( ( RULE_ID ) )
            // InternalDsl.g:4376:3: ( RULE_ID )
            {
             before(grammarAccess.getPairAccess().getResourceResourceCrossReference_1_0()); 
            // InternalDsl.g:4377:3: ( RULE_ID )
            // InternalDsl.g:4378:4: RULE_ID
            {
             before(grammarAccess.getPairAccess().getResourceResourceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getResourceResourceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPairAccess().getResourceResourceCrossReference_1_0()); 

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
    // $ANTLR end "rule__Pair__ResourceAssignment_1"


    // $ANTLR start "rule__Pair__StateAssignment_3"
    // InternalDsl.g:4389:1: rule__Pair__StateAssignment_3 : ( ruleUnaryElement ) ;
    public final void rule__Pair__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4393:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4394:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4394:2: ( ruleUnaryElement )
            // InternalDsl.g:4395:3: ruleUnaryElement
            {
             before(grammarAccess.getPairAccess().getStateUnaryElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getPairAccess().getStateUnaryElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Pair__StateAssignment_3"


    // $ANTLR start "rule__Pair__CodeAssignment_5"
    // InternalDsl.g:4404:1: rule__Pair__CodeAssignment_5 : ( ruleEXTENDED_STRING ) ;
    public final void rule__Pair__CodeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4408:1: ( ( ruleEXTENDED_STRING ) )
            // InternalDsl.g:4409:2: ( ruleEXTENDED_STRING )
            {
            // InternalDsl.g:4409:2: ( ruleEXTENDED_STRING )
            // InternalDsl.g:4410:3: ruleEXTENDED_STRING
            {
             before(grammarAccess.getPairAccess().getCodeEXTENDED_STRINGParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEXTENDED_STRING();

            state._fsp--;

             after(grammarAccess.getPairAccess().getCodeEXTENDED_STRINGParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Pair__CodeAssignment_5"


    // $ANTLR start "rule__OrElement__RightAssignment_1_2"
    // InternalDsl.g:4419:1: rule__OrElement__RightAssignment_1_2 : ( ruleAndElement ) ;
    public final void rule__OrElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4423:1: ( ( ruleAndElement ) )
            // InternalDsl.g:4424:2: ( ruleAndElement )
            {
            // InternalDsl.g:4424:2: ( ruleAndElement )
            // InternalDsl.g:4425:3: ruleAndElement
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
    // InternalDsl.g:4434:1: rule__AndElement__RightAssignment_1_2 : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4438:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:4439:2: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:4439:2: ( ruleDiffEqualElement )
            // InternalDsl.g:4440:3: ruleDiffEqualElement
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
    // InternalDsl.g:4449:1: rule__DiffEqualElement__RightAssignment_1_0_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4453:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4454:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4454:2: ( ruleCompareElement )
            // InternalDsl.g:4455:3: ruleCompareElement
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
    // InternalDsl.g:4464:1: rule__DiffEqualElement__RightAssignment_1_1_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4468:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4469:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4469:2: ( ruleCompareElement )
            // InternalDsl.g:4470:3: ruleCompareElement
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
    // InternalDsl.g:4479:1: rule__CompareElement__RightAssignment_1_0_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4483:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4484:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4484:2: ( rulePlusMinusElement )
            // InternalDsl.g:4485:3: rulePlusMinusElement
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
    // InternalDsl.g:4494:1: rule__CompareElement__RightAssignment_1_1_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4498:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4499:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4499:2: ( rulePlusMinusElement )
            // InternalDsl.g:4500:3: rulePlusMinusElement
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
    // InternalDsl.g:4509:1: rule__CompareElement__RightAssignment_1_2_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4513:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4514:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4514:2: ( rulePlusMinusElement )
            // InternalDsl.g:4515:3: rulePlusMinusElement
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
    // InternalDsl.g:4524:1: rule__CompareElement__RightAssignment_1_3_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4528:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4529:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4529:2: ( rulePlusMinusElement )
            // InternalDsl.g:4530:3: rulePlusMinusElement
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
    // InternalDsl.g:4539:1: rule__PlusMinusElement__RightAssignment_1_0_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4543:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4544:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4544:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4545:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:4554:1: rule__PlusMinusElement__RightAssignment_1_1_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4558:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4559:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4559:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4560:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:4569:1: rule__MultiplicationDivisionElement__RightAssignment_1_0_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4573:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4574:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4574:2: ( ruleUnaryElement )
            // InternalDsl.g:4575:3: ruleUnaryElement
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
    // InternalDsl.g:4584:1: rule__MultiplicationDivisionElement__RightAssignment_1_1_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4588:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4589:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4589:2: ( ruleUnaryElement )
            // InternalDsl.g:4590:3: ruleUnaryElement
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
    // InternalDsl.g:4599:1: rule__MultiplicationDivisionElement__RightAssignment_1_2_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4603:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4604:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4604:2: ( ruleUnaryElement )
            // InternalDsl.g:4605:3: ruleUnaryElement
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
    // InternalDsl.g:4614:1: rule__UnaryElement__ValueAssignment_0_1 : ( ruleNUMBER ) ;
    public final void rule__UnaryElement__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4618:1: ( ( ruleNUMBER ) )
            // InternalDsl.g:4619:2: ( ruleNUMBER )
            {
            // InternalDsl.g:4619:2: ( ruleNUMBER )
            // InternalDsl.g:4620:3: ruleNUMBER
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
    // InternalDsl.g:4629:1: rule__UnaryElement__ValueAssignment_1_1 : ( ruleEXTENDED_STRING ) ;
    public final void rule__UnaryElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4633:1: ( ( ruleEXTENDED_STRING ) )
            // InternalDsl.g:4634:2: ( ruleEXTENDED_STRING )
            {
            // InternalDsl.g:4634:2: ( ruleEXTENDED_STRING )
            // InternalDsl.g:4635:3: ruleEXTENDED_STRING
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
    // InternalDsl.g:4644:1: rule__UnaryElement__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__UnaryElement__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4648:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:4649:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:4649:2: ( RULE_BOOLEAN )
            // InternalDsl.g:4650:3: RULE_BOOLEAN
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
    // InternalDsl.g:4659:1: rule__UnaryElement__ExpAssignment_4_2 : ( ruleUnaryElement ) ;
    public final void rule__UnaryElement__ExpAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4663:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4664:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4664:2: ( ruleUnaryElement )
            // InternalDsl.g:4665:3: ruleUnaryElement
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004184000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020008010070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020008000072L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020008020070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000020A010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000800A010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020008000070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000002L});

}