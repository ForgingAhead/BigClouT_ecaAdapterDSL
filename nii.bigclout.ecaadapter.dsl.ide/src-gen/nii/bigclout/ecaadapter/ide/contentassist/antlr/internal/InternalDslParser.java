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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'ConceptToCodeMappings'", "'AppMeta'", "'on'", "'if'", "'do'", "'and'", "'EnvironmentMetaData'", "'resource'", "'can'", "'be'", "','", "':='", "'('", "')'", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'.'"
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


    // $ANTLR start "entryRuleResource"
    // InternalDsl.g:153:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleResource EOF )
            // InternalDsl.g:155:1: ruleResource EOF
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
    // InternalDsl.g:162:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Resource__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Resource__Group__0 )
            // InternalDsl.g:169:4: rule__Resource__Group__0
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
    // InternalDsl.g:178:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleState EOF )
            // InternalDsl.g:180:1: ruleState EOF
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
    // InternalDsl.g:187:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalDsl.g:192:2: ( ( rule__State__Alternatives ) )
            {
            // InternalDsl.g:192:2: ( ( rule__State__Alternatives ) )
            // InternalDsl.g:193:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalDsl.g:194:3: ( rule__State__Alternatives )
            // InternalDsl.g:194:4: rule__State__Alternatives
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
    // InternalDsl.g:203:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleAction EOF )
            // InternalDsl.g:205:1: ruleAction EOF
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
    // InternalDsl.g:212:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Action__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Action__Group__0 )
            // InternalDsl.g:219:4: rule__Action__Group__0
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
    // InternalDsl.g:228:1: entryRuleMappingPair : ruleMappingPair EOF ;
    public final void entryRuleMappingPair() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleMappingPair EOF )
            // InternalDsl.g:230:1: ruleMappingPair EOF
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
    // InternalDsl.g:237:1: ruleMappingPair : ( ( rule__MappingPair__Group__0 ) ) ;
    public final void ruleMappingPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__MappingPair__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__MappingPair__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__MappingPair__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__MappingPair__Group__0 )
            {
             before(grammarAccess.getMappingPairAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__MappingPair__Group__0 )
            // InternalDsl.g:244:4: rule__MappingPair__Group__0
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


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:253:1: entryRuleOrElement : ruleOrElement EOF ;
    public final void entryRuleOrElement() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleOrElement EOF )
            // InternalDsl.g:255:1: ruleOrElement EOF
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
    // InternalDsl.g:262:1: ruleOrElement : ( ( rule__OrElement__Group__0 ) ) ;
    public final void ruleOrElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__OrElement__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__OrElement__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__OrElement__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__OrElement__Group__0 )
            {
             before(grammarAccess.getOrElementAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__OrElement__Group__0 )
            // InternalDsl.g:269:4: rule__OrElement__Group__0
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
    // InternalDsl.g:278:1: entryRuleAndElement : ruleAndElement EOF ;
    public final void entryRuleAndElement() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleAndElement EOF )
            // InternalDsl.g:280:1: ruleAndElement EOF
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
    // InternalDsl.g:287:1: ruleAndElement : ( ( rule__AndElement__Group__0 ) ) ;
    public final void ruleAndElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__AndElement__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__AndElement__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__AndElement__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__AndElement__Group__0 )
            {
             before(grammarAccess.getAndElementAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__AndElement__Group__0 )
            // InternalDsl.g:294:4: rule__AndElement__Group__0
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
    // InternalDsl.g:303:1: entryRuleDiffEqualElement : ruleDiffEqualElement EOF ;
    public final void entryRuleDiffEqualElement() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleDiffEqualElement EOF )
            // InternalDsl.g:305:1: ruleDiffEqualElement EOF
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
    // InternalDsl.g:312:1: ruleDiffEqualElement : ( ( rule__DiffEqualElement__Group__0 ) ) ;
    public final void ruleDiffEqualElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__DiffEqualElement__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__DiffEqualElement__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__DiffEqualElement__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__DiffEqualElement__Group__0 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__DiffEqualElement__Group__0 )
            // InternalDsl.g:319:4: rule__DiffEqualElement__Group__0
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
    // InternalDsl.g:328:1: entryRuleCompareElement : ruleCompareElement EOF ;
    public final void entryRuleCompareElement() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleCompareElement EOF )
            // InternalDsl.g:330:1: ruleCompareElement EOF
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
    // InternalDsl.g:337:1: ruleCompareElement : ( ( rule__CompareElement__Group__0 ) ) ;
    public final void ruleCompareElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__CompareElement__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__CompareElement__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__CompareElement__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__CompareElement__Group__0 )
            {
             before(grammarAccess.getCompareElementAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__CompareElement__Group__0 )
            // InternalDsl.g:344:4: rule__CompareElement__Group__0
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
    // InternalDsl.g:353:1: entryRulePlusMinusElement : rulePlusMinusElement EOF ;
    public final void entryRulePlusMinusElement() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( rulePlusMinusElement EOF )
            // InternalDsl.g:355:1: rulePlusMinusElement EOF
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
    // InternalDsl.g:362:1: rulePlusMinusElement : ( ( rule__PlusMinusElement__Group__0 ) ) ;
    public final void rulePlusMinusElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__PlusMinusElement__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__PlusMinusElement__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__PlusMinusElement__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__PlusMinusElement__Group__0 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__PlusMinusElement__Group__0 )
            // InternalDsl.g:369:4: rule__PlusMinusElement__Group__0
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
    // InternalDsl.g:378:1: entryRuleMultiplicationDivisionElement : ruleMultiplicationDivisionElement EOF ;
    public final void entryRuleMultiplicationDivisionElement() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:380:1: ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:387:1: ruleMultiplicationDivisionElement : ( ( rule__MultiplicationDivisionElement__Group__0 ) ) ;
    public final void ruleMultiplicationDivisionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__MultiplicationDivisionElement__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__MultiplicationDivisionElement__Group__0 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__MultiplicationDivisionElement__Group__0 )
            // InternalDsl.g:394:4: rule__MultiplicationDivisionElement__Group__0
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
    // InternalDsl.g:403:1: entryRuleUnaryElement : ruleUnaryElement EOF ;
    public final void entryRuleUnaryElement() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleUnaryElement EOF )
            // InternalDsl.g:405:1: ruleUnaryElement EOF
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
    // InternalDsl.g:412:1: ruleUnaryElement : ( ( rule__UnaryElement__Alternatives ) ) ;
    public final void ruleUnaryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__UnaryElement__Alternatives ) ) )
            // InternalDsl.g:417:2: ( ( rule__UnaryElement__Alternatives ) )
            {
            // InternalDsl.g:417:2: ( ( rule__UnaryElement__Alternatives ) )
            // InternalDsl.g:418:3: ( rule__UnaryElement__Alternatives )
            {
             before(grammarAccess.getUnaryElementAccess().getAlternatives()); 
            // InternalDsl.g:419:3: ( rule__UnaryElement__Alternatives )
            // InternalDsl.g:419:4: rule__UnaryElement__Alternatives
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
    // InternalDsl.g:428:1: entryRuleLBRACE : ruleLBRACE EOF ;
    public final void entryRuleLBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleLBRACE EOF )
            // InternalDsl.g:430:1: ruleLBRACE EOF
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
    // InternalDsl.g:437:1: ruleLBRACE : ( '{' ) ;
    public final void ruleLBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( '{' ) )
            // InternalDsl.g:442:2: ( '{' )
            {
            // InternalDsl.g:442:2: ( '{' )
            // InternalDsl.g:443:3: '{'
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
    // InternalDsl.g:453:1: entryRuleRBRACE : ruleRBRACE EOF ;
    public final void entryRuleRBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleRBRACE EOF )
            // InternalDsl.g:455:1: ruleRBRACE EOF
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
    // InternalDsl.g:462:1: ruleRBRACE : ( '}' ) ;
    public final void ruleRBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( '}' ) )
            // InternalDsl.g:467:2: ( '}' )
            {
            // InternalDsl.g:467:2: ( '}' )
            // InternalDsl.g:468:3: '}'
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
    // InternalDsl.g:478:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleNUMBER EOF )
            // InternalDsl.g:480:1: ruleNUMBER EOF
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
    // InternalDsl.g:487:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalDsl.g:492:2: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalDsl.g:492:2: ( ( rule__NUMBER__Alternatives ) )
            // InternalDsl.g:493:3: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // InternalDsl.g:494:3: ( rule__NUMBER__Alternatives )
            // InternalDsl.g:494:4: rule__NUMBER__Alternatives
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
    // InternalDsl.g:503:1: entryRuleEXTENDED_STRING : ruleEXTENDED_STRING EOF ;
    public final void entryRuleEXTENDED_STRING() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleEXTENDED_STRING EOF )
            // InternalDsl.g:505:1: ruleEXTENDED_STRING EOF
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
    // InternalDsl.g:512:1: ruleEXTENDED_STRING : ( ( rule__EXTENDED_STRING__Group__0 ) ) ;
    public final void ruleEXTENDED_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__EXTENDED_STRING__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__EXTENDED_STRING__Group__0 )
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__EXTENDED_STRING__Group__0 )
            // InternalDsl.g:519:4: rule__EXTENDED_STRING__Group__0
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
    // InternalDsl.g:527:1: rule__State__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:531:1: ( ( RULE_ID ) | ( RULE_INT ) )
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
                    // InternalDsl.g:532:2: ( RULE_ID )
                    {
                    // InternalDsl.g:532:2: ( RULE_ID )
                    // InternalDsl.g:533:3: RULE_ID
                    {
                     before(grammarAccess.getStateAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:538:2: ( RULE_INT )
                    {
                    // InternalDsl.g:538:2: ( RULE_INT )
                    // InternalDsl.g:539:3: RULE_INT
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
    // InternalDsl.g:548:1: rule__DiffEqualElement__Alternatives_1 : ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) );
    public final void rule__DiffEqualElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:552:1: ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:553:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:553:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    // InternalDsl.g:554:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:555:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    // InternalDsl.g:555:4: rule__DiffEqualElement__Group_1_0__0
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
                    // InternalDsl.g:559:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:559:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    // InternalDsl.g:560:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:561:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    // InternalDsl.g:561:4: rule__DiffEqualElement__Group_1_1__0
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
    // InternalDsl.g:569:1: rule__CompareElement__Alternatives_1 : ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) );
    public final void rule__CompareElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:573:1: ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
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
                    // InternalDsl.g:574:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:574:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    // InternalDsl.g:575:3: ( rule__CompareElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:576:3: ( rule__CompareElement__Group_1_0__0 )
                    // InternalDsl.g:576:4: rule__CompareElement__Group_1_0__0
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
                    // InternalDsl.g:580:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:580:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    // InternalDsl.g:581:3: ( rule__CompareElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:582:3: ( rule__CompareElement__Group_1_1__0 )
                    // InternalDsl.g:582:4: rule__CompareElement__Group_1_1__0
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
                    // InternalDsl.g:586:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:586:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    // InternalDsl.g:587:3: ( rule__CompareElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:588:3: ( rule__CompareElement__Group_1_2__0 )
                    // InternalDsl.g:588:4: rule__CompareElement__Group_1_2__0
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
                    // InternalDsl.g:592:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    {
                    // InternalDsl.g:592:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    // InternalDsl.g:593:3: ( rule__CompareElement__Group_1_3__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_3()); 
                    // InternalDsl.g:594:3: ( rule__CompareElement__Group_1_3__0 )
                    // InternalDsl.g:594:4: rule__CompareElement__Group_1_3__0
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
    // InternalDsl.g:602:1: rule__PlusMinusElement__Alternatives_1 : ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) );
    public final void rule__PlusMinusElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:606:1: ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:607:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:607:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    // InternalDsl.g:608:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:609:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    // InternalDsl.g:609:4: rule__PlusMinusElement__Group_1_0__0
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
                    // InternalDsl.g:613:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:613:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    // InternalDsl.g:614:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:615:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    // InternalDsl.g:615:4: rule__PlusMinusElement__Group_1_1__0
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
    // InternalDsl.g:623:1: rule__MultiplicationDivisionElement__Alternatives_1 : ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) );
    public final void rule__MultiplicationDivisionElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:627:1: ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
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
                    // InternalDsl.g:628:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:628:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    // InternalDsl.g:629:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:630:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    // InternalDsl.g:630:4: rule__MultiplicationDivisionElement__Group_1_0__0
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
                    // InternalDsl.g:634:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:634:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    // InternalDsl.g:635:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:636:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    // InternalDsl.g:636:4: rule__MultiplicationDivisionElement__Group_1_1__0
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
                    // InternalDsl.g:640:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:640:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    // InternalDsl.g:641:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:642:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    // InternalDsl.g:642:4: rule__MultiplicationDivisionElement__Group_1_2__0
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
    // InternalDsl.g:650:1: rule__UnaryElement__Alternatives : ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) );
    public final void rule__UnaryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:654:1: ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) )
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
            case 26:
                {
                alt6=4;
                }
                break;
            case 40:
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
                    // InternalDsl.g:655:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    {
                    // InternalDsl.g:655:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    // InternalDsl.g:656:3: ( rule__UnaryElement__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_0()); 
                    // InternalDsl.g:657:3: ( rule__UnaryElement__Group_0__0 )
                    // InternalDsl.g:657:4: rule__UnaryElement__Group_0__0
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
                    // InternalDsl.g:661:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    {
                    // InternalDsl.g:661:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    // InternalDsl.g:662:3: ( rule__UnaryElement__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_1()); 
                    // InternalDsl.g:663:3: ( rule__UnaryElement__Group_1__0 )
                    // InternalDsl.g:663:4: rule__UnaryElement__Group_1__0
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
                    // InternalDsl.g:667:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    {
                    // InternalDsl.g:667:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    // InternalDsl.g:668:3: ( rule__UnaryElement__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_2()); 
                    // InternalDsl.g:669:3: ( rule__UnaryElement__Group_2__0 )
                    // InternalDsl.g:669:4: rule__UnaryElement__Group_2__0
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
                    // InternalDsl.g:673:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    {
                    // InternalDsl.g:673:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    // InternalDsl.g:674:3: ( rule__UnaryElement__Group_3__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_3()); 
                    // InternalDsl.g:675:3: ( rule__UnaryElement__Group_3__0 )
                    // InternalDsl.g:675:4: rule__UnaryElement__Group_3__0
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
                    // InternalDsl.g:679:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    {
                    // InternalDsl.g:679:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    // InternalDsl.g:680:3: ( rule__UnaryElement__Group_4__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_4()); 
                    // InternalDsl.g:681:3: ( rule__UnaryElement__Group_4__0 )
                    // InternalDsl.g:681:4: rule__UnaryElement__Group_4__0
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
    // InternalDsl.g:689:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:693:1: ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=RULE_ID && LA7_1<=RULE_BOOLEAN)||(LA7_1>=17 && LA7_1<=19)||LA7_1==24||(LA7_1>=26 && LA7_1<=40)) ) {
                    alt7=1;
                }
                else if ( (LA7_1==41) ) {
                    alt7=2;
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
                    // InternalDsl.g:694:2: ( RULE_INT )
                    {
                    // InternalDsl.g:694:2: ( RULE_INT )
                    // InternalDsl.g:695:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:700:2: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // InternalDsl.g:700:2: ( ( rule__NUMBER__Group_1__0 ) )
                    // InternalDsl.g:701:3: ( rule__NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    // InternalDsl.g:702:3: ( rule__NUMBER__Group_1__0 )
                    // InternalDsl.g:702:4: rule__NUMBER__Group_1__0
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
    // InternalDsl.g:710:1: rule__RunTimeModel__Group__0 : rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 ;
    public final void rule__RunTimeModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:714:1: ( rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 )
            // InternalDsl.g:715:2: rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1
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
    // InternalDsl.g:722:1: rule__RunTimeModel__Group__0__Impl : ( () ) ;
    public final void rule__RunTimeModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:726:1: ( ( () ) )
            // InternalDsl.g:727:1: ( () )
            {
            // InternalDsl.g:727:1: ( () )
            // InternalDsl.g:728:2: ()
            {
             before(grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0()); 
            // InternalDsl.g:729:2: ()
            // InternalDsl.g:729:3: 
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
    // InternalDsl.g:737:1: rule__RunTimeModel__Group__1 : rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 ;
    public final void rule__RunTimeModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:1: ( rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 )
            // InternalDsl.g:742:2: rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2
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
    // InternalDsl.g:749:1: rule__RunTimeModel__Group__1__Impl : ( ( rule__RunTimeModel__EnvDataAssignment_1 )* ) ;
    public final void rule__RunTimeModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:753:1: ( ( ( rule__RunTimeModel__EnvDataAssignment_1 )* ) )
            // InternalDsl.g:754:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 )* )
            {
            // InternalDsl.g:754:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 )* )
            // InternalDsl.g:755:2: ( rule__RunTimeModel__EnvDataAssignment_1 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getEnvDataAssignment_1()); 
            // InternalDsl.g:756:2: ( rule__RunTimeModel__EnvDataAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:756:3: rule__RunTimeModel__EnvDataAssignment_1
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
    // InternalDsl.g:764:1: rule__RunTimeModel__Group__2 : rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3 ;
    public final void rule__RunTimeModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:768:1: ( rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3 )
            // InternalDsl.g:769:2: rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3
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
    // InternalDsl.g:776:1: rule__RunTimeModel__Group__2__Impl : ( ( rule__RunTimeModel__AppDataAssignment_2 )* ) ;
    public final void rule__RunTimeModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:780:1: ( ( ( rule__RunTimeModel__AppDataAssignment_2 )* ) )
            // InternalDsl.g:781:1: ( ( rule__RunTimeModel__AppDataAssignment_2 )* )
            {
            // InternalDsl.g:781:1: ( ( rule__RunTimeModel__AppDataAssignment_2 )* )
            // InternalDsl.g:782:2: ( rule__RunTimeModel__AppDataAssignment_2 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAssignment_2()); 
            // InternalDsl.g:783:2: ( rule__RunTimeModel__AppDataAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:783:3: rule__RunTimeModel__AppDataAssignment_2
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
    // InternalDsl.g:791:1: rule__RunTimeModel__Group__3 : rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4 ;
    public final void rule__RunTimeModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:795:1: ( rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4 )
            // InternalDsl.g:796:2: rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:803:1: rule__RunTimeModel__Group__3__Impl : ( 'ConceptToCodeMappings' ) ;
    public final void rule__RunTimeModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:807:1: ( ( 'ConceptToCodeMappings' ) )
            // InternalDsl.g:808:1: ( 'ConceptToCodeMappings' )
            {
            // InternalDsl.g:808:1: ( 'ConceptToCodeMappings' )
            // InternalDsl.g:809:2: 'ConceptToCodeMappings'
            {
             before(grammarAccess.getRunTimeModelAccess().getConceptToCodeMappingsKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRunTimeModelAccess().getConceptToCodeMappingsKeyword_3()); 

            }


            }

        }
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
    // InternalDsl.g:818:1: rule__RunTimeModel__Group__4 : rule__RunTimeModel__Group__4__Impl rule__RunTimeModel__Group__5 ;
    public final void rule__RunTimeModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:822:1: ( rule__RunTimeModel__Group__4__Impl rule__RunTimeModel__Group__5 )
            // InternalDsl.g:823:2: rule__RunTimeModel__Group__4__Impl rule__RunTimeModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__RunTimeModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__5();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:830:1: rule__RunTimeModel__Group__4__Impl : ( ruleLBRACE ) ;
    public final void rule__RunTimeModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:834:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:835:1: ( ruleLBRACE )
            {
            // InternalDsl.g:835:1: ( ruleLBRACE )
            // InternalDsl.g:836:2: ruleLBRACE
            {
             before(grammarAccess.getRunTimeModelAccess().getLBRACEParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getLBRACEParserRuleCall_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RunTimeModel__Group__5"
    // InternalDsl.g:845:1: rule__RunTimeModel__Group__5 : rule__RunTimeModel__Group__5__Impl rule__RunTimeModel__Group__6 ;
    public final void rule__RunTimeModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:849:1: ( rule__RunTimeModel__Group__5__Impl rule__RunTimeModel__Group__6 )
            // InternalDsl.g:850:2: rule__RunTimeModel__Group__5__Impl rule__RunTimeModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__RunTimeModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__5"


    // $ANTLR start "rule__RunTimeModel__Group__5__Impl"
    // InternalDsl.g:857:1: rule__RunTimeModel__Group__5__Impl : ( ( rule__RunTimeModel__MappingPairsAssignment_5 )* ) ;
    public final void rule__RunTimeModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:861:1: ( ( ( rule__RunTimeModel__MappingPairsAssignment_5 )* ) )
            // InternalDsl.g:862:1: ( ( rule__RunTimeModel__MappingPairsAssignment_5 )* )
            {
            // InternalDsl.g:862:1: ( ( rule__RunTimeModel__MappingPairsAssignment_5 )* )
            // InternalDsl.g:863:2: ( rule__RunTimeModel__MappingPairsAssignment_5 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getMappingPairsAssignment_5()); 
            // InternalDsl.g:864:2: ( rule__RunTimeModel__MappingPairsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:864:3: rule__RunTimeModel__MappingPairsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RunTimeModel__MappingPairsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRunTimeModelAccess().getMappingPairsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__5__Impl"


    // $ANTLR start "rule__RunTimeModel__Group__6"
    // InternalDsl.g:872:1: rule__RunTimeModel__Group__6 : rule__RunTimeModel__Group__6__Impl ;
    public final void rule__RunTimeModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:876:1: ( rule__RunTimeModel__Group__6__Impl )
            // InternalDsl.g:877:2: rule__RunTimeModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__6"


    // $ANTLR start "rule__RunTimeModel__Group__6__Impl"
    // InternalDsl.g:883:1: rule__RunTimeModel__Group__6__Impl : ( ruleRBRACE ) ;
    public final void rule__RunTimeModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:887:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:888:1: ( ruleRBRACE )
            {
            // InternalDsl.g:888:1: ( ruleRBRACE )
            // InternalDsl.g:889:2: ruleRBRACE
            {
             before(grammarAccess.getRunTimeModelAccess().getRBRACEParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getRBRACEParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__6__Impl"


    // $ANTLR start "rule__AppMetaData__Group__0"
    // InternalDsl.g:899:1: rule__AppMetaData__Group__0 : rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 ;
    public final void rule__AppMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:903:1: ( rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 )
            // InternalDsl.g:904:2: rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:911:1: rule__AppMetaData__Group__0__Impl : ( 'AppMeta' ) ;
    public final void rule__AppMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:915:1: ( ( 'AppMeta' ) )
            // InternalDsl.g:916:1: ( 'AppMeta' )
            {
            // InternalDsl.g:916:1: ( 'AppMeta' )
            // InternalDsl.g:917:2: 'AppMeta'
            {
             before(grammarAccess.getAppMetaDataAccess().getAppMetaKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDsl.g:926:1: rule__AppMetaData__Group__1 : rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 ;
    public final void rule__AppMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:930:1: ( rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 )
            // InternalDsl.g:931:2: rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:938:1: rule__AppMetaData__Group__1__Impl : ( ( rule__AppMetaData__AppIDAssignment_1 ) ) ;
    public final void rule__AppMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:942:1: ( ( ( rule__AppMetaData__AppIDAssignment_1 ) ) )
            // InternalDsl.g:943:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            {
            // InternalDsl.g:943:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            // InternalDsl.g:944:2: ( rule__AppMetaData__AppIDAssignment_1 )
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 
            // InternalDsl.g:945:2: ( rule__AppMetaData__AppIDAssignment_1 )
            // InternalDsl.g:945:3: rule__AppMetaData__AppIDAssignment_1
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
    // InternalDsl.g:953:1: rule__AppMetaData__Group__2 : rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 ;
    public final void rule__AppMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:957:1: ( rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 )
            // InternalDsl.g:958:2: rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3
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
    // InternalDsl.g:965:1: rule__AppMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__AppMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:969:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:970:1: ( ruleLBRACE )
            {
            // InternalDsl.g:970:1: ( ruleLBRACE )
            // InternalDsl.g:971:2: ruleLBRACE
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
    // InternalDsl.g:980:1: rule__AppMetaData__Group__3 : rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 ;
    public final void rule__AppMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:984:1: ( rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 )
            // InternalDsl.g:985:2: rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4
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
    // InternalDsl.g:992:1: rule__AppMetaData__Group__3__Impl : ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) ;
    public final void rule__AppMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:996:1: ( ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) )
            // InternalDsl.g:997:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            {
            // InternalDsl.g:997:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            // InternalDsl.g:998:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_3()); 
            // InternalDsl.g:999:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:999:3: rule__AppMetaData__SpecificationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AppMetaData__SpecificationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDsl.g:1007:1: rule__AppMetaData__Group__4 : rule__AppMetaData__Group__4__Impl ;
    public final void rule__AppMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1011:1: ( rule__AppMetaData__Group__4__Impl )
            // InternalDsl.g:1012:2: rule__AppMetaData__Group__4__Impl
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
    // InternalDsl.g:1018:1: rule__AppMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__AppMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1022:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:1023:1: ( ruleRBRACE )
            {
            // InternalDsl.g:1023:1: ( ruleRBRACE )
            // InternalDsl.g:1024:2: ruleRBRACE
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
    // InternalDsl.g:1034:1: rule__AppSpecification__Group__0 : rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 ;
    public final void rule__AppSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1038:1: ( rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1 )
            // InternalDsl.g:1039:2: rule__AppSpecification__Group__0__Impl rule__AppSpecification__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1046:1: rule__AppSpecification__Group__0__Impl : ( ( rule__AppSpecification__SpecIDAssignment_0 ) ) ;
    public final void rule__AppSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1050:1: ( ( ( rule__AppSpecification__SpecIDAssignment_0 ) ) )
            // InternalDsl.g:1051:1: ( ( rule__AppSpecification__SpecIDAssignment_0 ) )
            {
            // InternalDsl.g:1051:1: ( ( rule__AppSpecification__SpecIDAssignment_0 ) )
            // InternalDsl.g:1052:2: ( rule__AppSpecification__SpecIDAssignment_0 )
            {
             before(grammarAccess.getAppSpecificationAccess().getSpecIDAssignment_0()); 
            // InternalDsl.g:1053:2: ( rule__AppSpecification__SpecIDAssignment_0 )
            // InternalDsl.g:1053:3: rule__AppSpecification__SpecIDAssignment_0
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
    // InternalDsl.g:1061:1: rule__AppSpecification__Group__1 : rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 ;
    public final void rule__AppSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1065:1: ( rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2 )
            // InternalDsl.g:1066:2: rule__AppSpecification__Group__1__Impl rule__AppSpecification__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1073:1: rule__AppSpecification__Group__1__Impl : ( 'on' ) ;
    public final void rule__AppSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1077:1: ( ( 'on' ) )
            // InternalDsl.g:1078:1: ( 'on' )
            {
            // InternalDsl.g:1078:1: ( 'on' )
            // InternalDsl.g:1079:2: 'on'
            {
             before(grammarAccess.getAppSpecificationAccess().getOnKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1088:1: rule__AppSpecification__Group__2 : rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 ;
    public final void rule__AppSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1092:1: ( rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3 )
            // InternalDsl.g:1093:2: rule__AppSpecification__Group__2__Impl rule__AppSpecification__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1100:1: rule__AppSpecification__Group__2__Impl : ( ( rule__AppSpecification__TriggerAssignment_2 )* ) ;
    public final void rule__AppSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1104:1: ( ( ( rule__AppSpecification__TriggerAssignment_2 )* ) )
            // InternalDsl.g:1105:1: ( ( rule__AppSpecification__TriggerAssignment_2 )* )
            {
            // InternalDsl.g:1105:1: ( ( rule__AppSpecification__TriggerAssignment_2 )* )
            // InternalDsl.g:1106:2: ( rule__AppSpecification__TriggerAssignment_2 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getTriggerAssignment_2()); 
            // InternalDsl.g:1107:2: ( rule__AppSpecification__TriggerAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_BOOLEAN)||LA12_0==26||LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1107:3: rule__AppSpecification__TriggerAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AppSpecification__TriggerAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:1115:1: rule__AppSpecification__Group__3 : rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 ;
    public final void rule__AppSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1119:1: ( rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4 )
            // InternalDsl.g:1120:2: rule__AppSpecification__Group__3__Impl rule__AppSpecification__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1127:1: rule__AppSpecification__Group__3__Impl : ( 'if' ) ;
    public final void rule__AppSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1131:1: ( ( 'if' ) )
            // InternalDsl.g:1132:1: ( 'if' )
            {
            // InternalDsl.g:1132:1: ( 'if' )
            // InternalDsl.g:1133:2: 'if'
            {
             before(grammarAccess.getAppSpecificationAccess().getIfKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1142:1: rule__AppSpecification__Group__4 : rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 ;
    public final void rule__AppSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1146:1: ( rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5 )
            // InternalDsl.g:1147:2: rule__AppSpecification__Group__4__Impl rule__AppSpecification__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1154:1: rule__AppSpecification__Group__4__Impl : ( ( rule__AppSpecification__ConditionAssignment_4 )* ) ;
    public final void rule__AppSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1158:1: ( ( ( rule__AppSpecification__ConditionAssignment_4 )* ) )
            // InternalDsl.g:1159:1: ( ( rule__AppSpecification__ConditionAssignment_4 )* )
            {
            // InternalDsl.g:1159:1: ( ( rule__AppSpecification__ConditionAssignment_4 )* )
            // InternalDsl.g:1160:2: ( rule__AppSpecification__ConditionAssignment_4 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getConditionAssignment_4()); 
            // InternalDsl.g:1161:2: ( rule__AppSpecification__ConditionAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_BOOLEAN)||LA13_0==26||LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1161:3: rule__AppSpecification__ConditionAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AppSpecification__ConditionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDsl.g:1169:1: rule__AppSpecification__Group__5 : rule__AppSpecification__Group__5__Impl rule__AppSpecification__Group__6 ;
    public final void rule__AppSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1173:1: ( rule__AppSpecification__Group__5__Impl rule__AppSpecification__Group__6 )
            // InternalDsl.g:1174:2: rule__AppSpecification__Group__5__Impl rule__AppSpecification__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1181:1: rule__AppSpecification__Group__5__Impl : ( 'do' ) ;
    public final void rule__AppSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( ( 'do' ) )
            // InternalDsl.g:1186:1: ( 'do' )
            {
            // InternalDsl.g:1186:1: ( 'do' )
            // InternalDsl.g:1187:2: 'do'
            {
             before(grammarAccess.getAppSpecificationAccess().getDoKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:1196:1: rule__AppSpecification__Group__6 : rule__AppSpecification__Group__6__Impl rule__AppSpecification__Group__7 ;
    public final void rule__AppSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1200:1: ( rule__AppSpecification__Group__6__Impl rule__AppSpecification__Group__7 )
            // InternalDsl.g:1201:2: rule__AppSpecification__Group__6__Impl rule__AppSpecification__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__AppSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__7();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:1208:1: rule__AppSpecification__Group__6__Impl : ( ( rule__AppSpecification__ActionAssignment_6 ) ) ;
    public final void rule__AppSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1212:1: ( ( ( rule__AppSpecification__ActionAssignment_6 ) ) )
            // InternalDsl.g:1213:1: ( ( rule__AppSpecification__ActionAssignment_6 ) )
            {
            // InternalDsl.g:1213:1: ( ( rule__AppSpecification__ActionAssignment_6 ) )
            // InternalDsl.g:1214:2: ( rule__AppSpecification__ActionAssignment_6 )
            {
             before(grammarAccess.getAppSpecificationAccess().getActionAssignment_6()); 
            // InternalDsl.g:1215:2: ( rule__AppSpecification__ActionAssignment_6 )
            // InternalDsl.g:1215:3: rule__AppSpecification__ActionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__ActionAssignment_6();

            state._fsp--;


            }

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


    // $ANTLR start "rule__AppSpecification__Group__7"
    // InternalDsl.g:1223:1: rule__AppSpecification__Group__7 : rule__AppSpecification__Group__7__Impl ;
    public final void rule__AppSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1227:1: ( rule__AppSpecification__Group__7__Impl )
            // InternalDsl.g:1228:2: rule__AppSpecification__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppSpecification__Group__7"


    // $ANTLR start "rule__AppSpecification__Group__7__Impl"
    // InternalDsl.g:1234:1: rule__AppSpecification__Group__7__Impl : ( ( rule__AppSpecification__Group_7__0 )* ) ;
    public final void rule__AppSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1238:1: ( ( ( rule__AppSpecification__Group_7__0 )* ) )
            // InternalDsl.g:1239:1: ( ( rule__AppSpecification__Group_7__0 )* )
            {
            // InternalDsl.g:1239:1: ( ( rule__AppSpecification__Group_7__0 )* )
            // InternalDsl.g:1240:2: ( rule__AppSpecification__Group_7__0 )*
            {
             before(grammarAccess.getAppSpecificationAccess().getGroup_7()); 
            // InternalDsl.g:1241:2: ( rule__AppSpecification__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1241:3: rule__AppSpecification__Group_7__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AppSpecification__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAppSpecificationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppSpecification__Group__7__Impl"


    // $ANTLR start "rule__AppSpecification__Group_7__0"
    // InternalDsl.g:1250:1: rule__AppSpecification__Group_7__0 : rule__AppSpecification__Group_7__0__Impl rule__AppSpecification__Group_7__1 ;
    public final void rule__AppSpecification__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1254:1: ( rule__AppSpecification__Group_7__0__Impl rule__AppSpecification__Group_7__1 )
            // InternalDsl.g:1255:2: rule__AppSpecification__Group_7__0__Impl rule__AppSpecification__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__AppSpecification__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppSpecification__Group_7__0"


    // $ANTLR start "rule__AppSpecification__Group_7__0__Impl"
    // InternalDsl.g:1262:1: rule__AppSpecification__Group_7__0__Impl : ( 'and' ) ;
    public final void rule__AppSpecification__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1266:1: ( ( 'and' ) )
            // InternalDsl.g:1267:1: ( 'and' )
            {
            // InternalDsl.g:1267:1: ( 'and' )
            // InternalDsl.g:1268:2: 'and'
            {
             before(grammarAccess.getAppSpecificationAccess().getAndKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAppSpecificationAccess().getAndKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppSpecification__Group_7__0__Impl"


    // $ANTLR start "rule__AppSpecification__Group_7__1"
    // InternalDsl.g:1277:1: rule__AppSpecification__Group_7__1 : rule__AppSpecification__Group_7__1__Impl ;
    public final void rule__AppSpecification__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1281:1: ( rule__AppSpecification__Group_7__1__Impl )
            // InternalDsl.g:1282:2: rule__AppSpecification__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppSpecification__Group_7__1"


    // $ANTLR start "rule__AppSpecification__Group_7__1__Impl"
    // InternalDsl.g:1288:1: rule__AppSpecification__Group_7__1__Impl : ( ( rule__AppSpecification__ActionAssignment_7_1 ) ) ;
    public final void rule__AppSpecification__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1292:1: ( ( ( rule__AppSpecification__ActionAssignment_7_1 ) ) )
            // InternalDsl.g:1293:1: ( ( rule__AppSpecification__ActionAssignment_7_1 ) )
            {
            // InternalDsl.g:1293:1: ( ( rule__AppSpecification__ActionAssignment_7_1 ) )
            // InternalDsl.g:1294:2: ( rule__AppSpecification__ActionAssignment_7_1 )
            {
             before(grammarAccess.getAppSpecificationAccess().getActionAssignment_7_1()); 
            // InternalDsl.g:1295:2: ( rule__AppSpecification__ActionAssignment_7_1 )
            // InternalDsl.g:1295:3: rule__AppSpecification__ActionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AppSpecification__ActionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAppSpecificationAccess().getActionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppSpecification__Group_7__1__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__0"
    // InternalDsl.g:1304:1: rule__EnvironmentMetaData__Group__0 : rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 ;
    public final void rule__EnvironmentMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1308:1: ( rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 )
            // InternalDsl.g:1309:2: rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1
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
    // InternalDsl.g:1316:1: rule__EnvironmentMetaData__Group__0__Impl : ( () ) ;
    public final void rule__EnvironmentMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1320:1: ( ( () ) )
            // InternalDsl.g:1321:1: ( () )
            {
            // InternalDsl.g:1321:1: ( () )
            // InternalDsl.g:1322:2: ()
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0()); 
            // InternalDsl.g:1323:2: ()
            // InternalDsl.g:1323:3: 
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
    // InternalDsl.g:1331:1: rule__EnvironmentMetaData__Group__1 : rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 ;
    public final void rule__EnvironmentMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1335:1: ( rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 )
            // InternalDsl.g:1336:2: rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1343:1: rule__EnvironmentMetaData__Group__1__Impl : ( 'EnvironmentMetaData' ) ;
    public final void rule__EnvironmentMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1347:1: ( ( 'EnvironmentMetaData' ) )
            // InternalDsl.g:1348:1: ( 'EnvironmentMetaData' )
            {
            // InternalDsl.g:1348:1: ( 'EnvironmentMetaData' )
            // InternalDsl.g:1349:2: 'EnvironmentMetaData'
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataKeyword_1()); 

            }


            }

        }
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
    // InternalDsl.g:1358:1: rule__EnvironmentMetaData__Group__2 : rule__EnvironmentMetaData__Group__2__Impl ;
    public final void rule__EnvironmentMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1362:1: ( rule__EnvironmentMetaData__Group__2__Impl )
            // InternalDsl.g:1363:2: rule__EnvironmentMetaData__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:1369:1: rule__EnvironmentMetaData__Group__2__Impl : ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* ) ;
    public final void rule__EnvironmentMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1373:1: ( ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* ) )
            // InternalDsl.g:1374:1: ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* )
            {
            // InternalDsl.g:1374:1: ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* )
            // InternalDsl.g:1375:2: ( rule__EnvironmentMetaData__ResourcesAssignment_2 )*
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_2()); 
            // InternalDsl.g:1376:2: ( rule__EnvironmentMetaData__ResourcesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1376:3: rule__EnvironmentMetaData__ResourcesAssignment_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EnvironmentMetaData__ResourcesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Resource__Group__0"
    // InternalDsl.g:1385:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1389:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalDsl.g:1390:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1397:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1401:1: ( ( 'resource' ) )
            // InternalDsl.g:1402:1: ( 'resource' )
            {
            // InternalDsl.g:1402:1: ( 'resource' )
            // InternalDsl.g:1403:2: 'resource'
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
    // InternalDsl.g:1412:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1416:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalDsl.g:1417:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
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
    // InternalDsl.g:1424:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1428:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalDsl.g:1429:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalDsl.g:1429:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalDsl.g:1430:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalDsl.g:1431:2: ( rule__Resource__NameAssignment_1 )
            // InternalDsl.g:1431:3: rule__Resource__NameAssignment_1
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
    // InternalDsl.g:1439:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1443:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalDsl.g:1444:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
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
    // InternalDsl.g:1451:1: rule__Resource__Group__2__Impl : ( 'can' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1455:1: ( ( 'can' ) )
            // InternalDsl.g:1456:1: ( 'can' )
            {
            // InternalDsl.g:1456:1: ( 'can' )
            // InternalDsl.g:1457:2: 'can'
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
    // InternalDsl.g:1466:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1470:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalDsl.g:1471:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
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
    // InternalDsl.g:1478:1: rule__Resource__Group__3__Impl : ( 'be' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1482:1: ( ( 'be' ) )
            // InternalDsl.g:1483:1: ( 'be' )
            {
            // InternalDsl.g:1483:1: ( 'be' )
            // InternalDsl.g:1484:2: 'be'
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
    // InternalDsl.g:1493:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1497:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalDsl.g:1498:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
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
    // InternalDsl.g:1505:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__StatesAssignment_4 ) ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1509:1: ( ( ( rule__Resource__StatesAssignment_4 ) ) )
            // InternalDsl.g:1510:1: ( ( rule__Resource__StatesAssignment_4 ) )
            {
            // InternalDsl.g:1510:1: ( ( rule__Resource__StatesAssignment_4 ) )
            // InternalDsl.g:1511:2: ( rule__Resource__StatesAssignment_4 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_4()); 
            // InternalDsl.g:1512:2: ( rule__Resource__StatesAssignment_4 )
            // InternalDsl.g:1512:3: rule__Resource__StatesAssignment_4
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
    // InternalDsl.g:1520:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1524:1: ( rule__Resource__Group__5__Impl )
            // InternalDsl.g:1525:2: rule__Resource__Group__5__Impl
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
    // InternalDsl.g:1531:1: rule__Resource__Group__5__Impl : ( ( rule__Resource__Group_5__0 )* ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1535:1: ( ( ( rule__Resource__Group_5__0 )* ) )
            // InternalDsl.g:1536:1: ( ( rule__Resource__Group_5__0 )* )
            {
            // InternalDsl.g:1536:1: ( ( rule__Resource__Group_5__0 )* )
            // InternalDsl.g:1537:2: ( rule__Resource__Group_5__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_5()); 
            // InternalDsl.g:1538:2: ( rule__Resource__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1538:3: rule__Resource__Group_5__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Resource__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDsl.g:1547:1: rule__Resource__Group_5__0 : rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 ;
    public final void rule__Resource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1551:1: ( rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 )
            // InternalDsl.g:1552:2: rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1
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
    // InternalDsl.g:1559:1: rule__Resource__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1563:1: ( ( ',' ) )
            // InternalDsl.g:1564:1: ( ',' )
            {
            // InternalDsl.g:1564:1: ( ',' )
            // InternalDsl.g:1565:2: ','
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
    // InternalDsl.g:1574:1: rule__Resource__Group_5__1 : rule__Resource__Group_5__1__Impl ;
    public final void rule__Resource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1578:1: ( rule__Resource__Group_5__1__Impl )
            // InternalDsl.g:1579:2: rule__Resource__Group_5__1__Impl
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
    // InternalDsl.g:1585:1: rule__Resource__Group_5__1__Impl : ( ( rule__Resource__StatesAssignment_5_1 ) ) ;
    public final void rule__Resource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1589:1: ( ( ( rule__Resource__StatesAssignment_5_1 ) ) )
            // InternalDsl.g:1590:1: ( ( rule__Resource__StatesAssignment_5_1 ) )
            {
            // InternalDsl.g:1590:1: ( ( rule__Resource__StatesAssignment_5_1 ) )
            // InternalDsl.g:1591:2: ( rule__Resource__StatesAssignment_5_1 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_5_1()); 
            // InternalDsl.g:1592:2: ( rule__Resource__StatesAssignment_5_1 )
            // InternalDsl.g:1592:3: rule__Resource__StatesAssignment_5_1
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
    // InternalDsl.g:1601:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1605:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalDsl.g:1606:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalDsl.g:1613:1: rule__Action__Group__0__Impl : ( ( rule__Action__ResourceAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1617:1: ( ( ( rule__Action__ResourceAssignment_0 ) ) )
            // InternalDsl.g:1618:1: ( ( rule__Action__ResourceAssignment_0 ) )
            {
            // InternalDsl.g:1618:1: ( ( rule__Action__ResourceAssignment_0 ) )
            // InternalDsl.g:1619:2: ( rule__Action__ResourceAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getResourceAssignment_0()); 
            // InternalDsl.g:1620:2: ( rule__Action__ResourceAssignment_0 )
            // InternalDsl.g:1620:3: rule__Action__ResourceAssignment_0
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
    // InternalDsl.g:1628:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1632:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalDsl.g:1633:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // InternalDsl.g:1640:1: rule__Action__Group__1__Impl : ( ':=' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1644:1: ( ( ':=' ) )
            // InternalDsl.g:1645:1: ( ':=' )
            {
            // InternalDsl.g:1645:1: ( ':=' )
            // InternalDsl.g:1646:2: ':='
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
    // InternalDsl.g:1655:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1659:1: ( rule__Action__Group__2__Impl )
            // InternalDsl.g:1660:2: rule__Action__Group__2__Impl
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
    // InternalDsl.g:1666:1: rule__Action__Group__2__Impl : ( ( rule__Action__StateAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1670:1: ( ( ( rule__Action__StateAssignment_2 ) ) )
            // InternalDsl.g:1671:1: ( ( rule__Action__StateAssignment_2 ) )
            {
            // InternalDsl.g:1671:1: ( ( rule__Action__StateAssignment_2 ) )
            // InternalDsl.g:1672:2: ( rule__Action__StateAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getStateAssignment_2()); 
            // InternalDsl.g:1673:2: ( rule__Action__StateAssignment_2 )
            // InternalDsl.g:1673:3: rule__Action__StateAssignment_2
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
    // InternalDsl.g:1682:1: rule__MappingPair__Group__0 : rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 ;
    public final void rule__MappingPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1686:1: ( rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 )
            // InternalDsl.g:1687:2: rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1694:1: rule__MappingPair__Group__0__Impl : ( '(' ) ;
    public final void rule__MappingPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1698:1: ( ( '(' ) )
            // InternalDsl.g:1699:1: ( '(' )
            {
            // InternalDsl.g:1699:1: ( '(' )
            // InternalDsl.g:1700:2: '('
            {
             before(grammarAccess.getMappingPairAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMappingPairAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__Group__0__Impl"


    // $ANTLR start "rule__MappingPair__Group__1"
    // InternalDsl.g:1709:1: rule__MappingPair__Group__1 : rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 ;
    public final void rule__MappingPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1713:1: ( rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 )
            // InternalDsl.g:1714:2: rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:1721:1: rule__MappingPair__Group__1__Impl : ( ( rule__MappingPair__ResourceAssignment_1 ) ) ;
    public final void rule__MappingPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1725:1: ( ( ( rule__MappingPair__ResourceAssignment_1 ) ) )
            // InternalDsl.g:1726:1: ( ( rule__MappingPair__ResourceAssignment_1 ) )
            {
            // InternalDsl.g:1726:1: ( ( rule__MappingPair__ResourceAssignment_1 ) )
            // InternalDsl.g:1727:2: ( rule__MappingPair__ResourceAssignment_1 )
            {
             before(grammarAccess.getMappingPairAccess().getResourceAssignment_1()); 
            // InternalDsl.g:1728:2: ( rule__MappingPair__ResourceAssignment_1 )
            // InternalDsl.g:1728:3: rule__MappingPair__ResourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingPair__ResourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingPairAccess().getResourceAssignment_1()); 

            }


            }

        }
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
    // InternalDsl.g:1736:1: rule__MappingPair__Group__2 : rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 ;
    public final void rule__MappingPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1740:1: ( rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 )
            // InternalDsl.g:1741:2: rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:1748:1: rule__MappingPair__Group__2__Impl : ( ',' ) ;
    public final void rule__MappingPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1752:1: ( ( ',' ) )
            // InternalDsl.g:1753:1: ( ',' )
            {
            // InternalDsl.g:1753:1: ( ',' )
            // InternalDsl.g:1754:2: ','
            {
             before(grammarAccess.getMappingPairAccess().getCommaKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMappingPairAccess().getCommaKeyword_2()); 

            }


            }

        }
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
    // InternalDsl.g:1763:1: rule__MappingPair__Group__3 : rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 ;
    public final void rule__MappingPair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1767:1: ( rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 )
            // InternalDsl.g:1768:2: rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:1775:1: rule__MappingPair__Group__3__Impl : ( ( rule__MappingPair__StateAssignment_3 ) ) ;
    public final void rule__MappingPair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1779:1: ( ( ( rule__MappingPair__StateAssignment_3 ) ) )
            // InternalDsl.g:1780:1: ( ( rule__MappingPair__StateAssignment_3 ) )
            {
            // InternalDsl.g:1780:1: ( ( rule__MappingPair__StateAssignment_3 ) )
            // InternalDsl.g:1781:2: ( rule__MappingPair__StateAssignment_3 )
            {
             before(grammarAccess.getMappingPairAccess().getStateAssignment_3()); 
            // InternalDsl.g:1782:2: ( rule__MappingPair__StateAssignment_3 )
            // InternalDsl.g:1782:3: rule__MappingPair__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MappingPair__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingPairAccess().getStateAssignment_3()); 

            }


            }

        }
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
    // InternalDsl.g:1790:1: rule__MappingPair__Group__4 : rule__MappingPair__Group__4__Impl rule__MappingPair__Group__5 ;
    public final void rule__MappingPair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1794:1: ( rule__MappingPair__Group__4__Impl rule__MappingPair__Group__5 )
            // InternalDsl.g:1795:2: rule__MappingPair__Group__4__Impl rule__MappingPair__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MappingPair__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__5();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:1802:1: rule__MappingPair__Group__4__Impl : ( ',' ) ;
    public final void rule__MappingPair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1806:1: ( ( ',' ) )
            // InternalDsl.g:1807:1: ( ',' )
            {
            // InternalDsl.g:1807:1: ( ',' )
            // InternalDsl.g:1808:2: ','
            {
             before(grammarAccess.getMappingPairAccess().getCommaKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMappingPairAccess().getCommaKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__MappingPair__Group__5"
    // InternalDsl.g:1817:1: rule__MappingPair__Group__5 : rule__MappingPair__Group__5__Impl rule__MappingPair__Group__6 ;
    public final void rule__MappingPair__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1821:1: ( rule__MappingPair__Group__5__Impl rule__MappingPair__Group__6 )
            // InternalDsl.g:1822:2: rule__MappingPair__Group__5__Impl rule__MappingPair__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__MappingPair__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__Group__5"


    // $ANTLR start "rule__MappingPair__Group__5__Impl"
    // InternalDsl.g:1829:1: rule__MappingPair__Group__5__Impl : ( ( rule__MappingPair__ActionCodeAssignment_5 ) ) ;
    public final void rule__MappingPair__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1833:1: ( ( ( rule__MappingPair__ActionCodeAssignment_5 ) ) )
            // InternalDsl.g:1834:1: ( ( rule__MappingPair__ActionCodeAssignment_5 ) )
            {
            // InternalDsl.g:1834:1: ( ( rule__MappingPair__ActionCodeAssignment_5 ) )
            // InternalDsl.g:1835:2: ( rule__MappingPair__ActionCodeAssignment_5 )
            {
             before(grammarAccess.getMappingPairAccess().getActionCodeAssignment_5()); 
            // InternalDsl.g:1836:2: ( rule__MappingPair__ActionCodeAssignment_5 )
            // InternalDsl.g:1836:3: rule__MappingPair__ActionCodeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MappingPair__ActionCodeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMappingPairAccess().getActionCodeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__Group__5__Impl"


    // $ANTLR start "rule__MappingPair__Group__6"
    // InternalDsl.g:1844:1: rule__MappingPair__Group__6 : rule__MappingPair__Group__6__Impl ;
    public final void rule__MappingPair__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1848:1: ( rule__MappingPair__Group__6__Impl )
            // InternalDsl.g:1849:2: rule__MappingPair__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingPair__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__Group__6"


    // $ANTLR start "rule__MappingPair__Group__6__Impl"
    // InternalDsl.g:1855:1: rule__MappingPair__Group__6__Impl : ( ')' ) ;
    public final void rule__MappingPair__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1859:1: ( ( ')' ) )
            // InternalDsl.g:1860:1: ( ')' )
            {
            // InternalDsl.g:1860:1: ( ')' )
            // InternalDsl.g:1861:2: ')'
            {
             before(grammarAccess.getMappingPairAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMappingPairAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__Group__6__Impl"


    // $ANTLR start "rule__OrElement__Group__0"
    // InternalDsl.g:1871:1: rule__OrElement__Group__0 : rule__OrElement__Group__0__Impl rule__OrElement__Group__1 ;
    public final void rule__OrElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1875:1: ( rule__OrElement__Group__0__Impl rule__OrElement__Group__1 )
            // InternalDsl.g:1876:2: rule__OrElement__Group__0__Impl rule__OrElement__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:1883:1: rule__OrElement__Group__0__Impl : ( ruleAndElement ) ;
    public final void rule__OrElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1887:1: ( ( ruleAndElement ) )
            // InternalDsl.g:1888:1: ( ruleAndElement )
            {
            // InternalDsl.g:1888:1: ( ruleAndElement )
            // InternalDsl.g:1889:2: ruleAndElement
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
    // InternalDsl.g:1898:1: rule__OrElement__Group__1 : rule__OrElement__Group__1__Impl ;
    public final void rule__OrElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1902:1: ( rule__OrElement__Group__1__Impl )
            // InternalDsl.g:1903:2: rule__OrElement__Group__1__Impl
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
    // InternalDsl.g:1909:1: rule__OrElement__Group__1__Impl : ( ( rule__OrElement__Group_1__0 )* ) ;
    public final void rule__OrElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1913:1: ( ( ( rule__OrElement__Group_1__0 )* ) )
            // InternalDsl.g:1914:1: ( ( rule__OrElement__Group_1__0 )* )
            {
            // InternalDsl.g:1914:1: ( ( rule__OrElement__Group_1__0 )* )
            // InternalDsl.g:1915:2: ( rule__OrElement__Group_1__0 )*
            {
             before(grammarAccess.getOrElementAccess().getGroup_1()); 
            // InternalDsl.g:1916:2: ( rule__OrElement__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1916:3: rule__OrElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__OrElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDsl.g:1925:1: rule__OrElement__Group_1__0 : rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 ;
    public final void rule__OrElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1929:1: ( rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 )
            // InternalDsl.g:1930:2: rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:1937:1: rule__OrElement__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__OrElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1941:1: ( ( 'or' ) )
            // InternalDsl.g:1942:1: ( 'or' )
            {
            // InternalDsl.g:1942:1: ( 'or' )
            // InternalDsl.g:1943:2: 'or'
            {
             before(grammarAccess.getOrElementAccess().getOrKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1952:1: rule__OrElement__Group_1__1 : rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 ;
    public final void rule__OrElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1956:1: ( rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 )
            // InternalDsl.g:1957:2: rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:1964:1: rule__OrElement__Group_1__1__Impl : ( () ) ;
    public final void rule__OrElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1968:1: ( ( () ) )
            // InternalDsl.g:1969:1: ( () )
            {
            // InternalDsl.g:1969:1: ( () )
            // InternalDsl.g:1970:2: ()
            {
             before(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 
            // InternalDsl.g:1971:2: ()
            // InternalDsl.g:1971:3: 
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
    // InternalDsl.g:1979:1: rule__OrElement__Group_1__2 : rule__OrElement__Group_1__2__Impl ;
    public final void rule__OrElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1983:1: ( rule__OrElement__Group_1__2__Impl )
            // InternalDsl.g:1984:2: rule__OrElement__Group_1__2__Impl
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
    // InternalDsl.g:1990:1: rule__OrElement__Group_1__2__Impl : ( ( rule__OrElement__RightAssignment_1_2 ) ) ;
    public final void rule__OrElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1994:1: ( ( ( rule__OrElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1995:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1995:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            // InternalDsl.g:1996:2: ( rule__OrElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1997:2: ( rule__OrElement__RightAssignment_1_2 )
            // InternalDsl.g:1997:3: rule__OrElement__RightAssignment_1_2
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
    // InternalDsl.g:2006:1: rule__AndElement__Group__0 : rule__AndElement__Group__0__Impl rule__AndElement__Group__1 ;
    public final void rule__AndElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2010:1: ( rule__AndElement__Group__0__Impl rule__AndElement__Group__1 )
            // InternalDsl.g:2011:2: rule__AndElement__Group__0__Impl rule__AndElement__Group__1
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
    // InternalDsl.g:2018:1: rule__AndElement__Group__0__Impl : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2022:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:2023:1: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:2023:1: ( ruleDiffEqualElement )
            // InternalDsl.g:2024:2: ruleDiffEqualElement
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
    // InternalDsl.g:2033:1: rule__AndElement__Group__1 : rule__AndElement__Group__1__Impl ;
    public final void rule__AndElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2037:1: ( rule__AndElement__Group__1__Impl )
            // InternalDsl.g:2038:2: rule__AndElement__Group__1__Impl
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
    // InternalDsl.g:2044:1: rule__AndElement__Group__1__Impl : ( ( rule__AndElement__Group_1__0 )* ) ;
    public final void rule__AndElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2048:1: ( ( ( rule__AndElement__Group_1__0 )* ) )
            // InternalDsl.g:2049:1: ( ( rule__AndElement__Group_1__0 )* )
            {
            // InternalDsl.g:2049:1: ( ( rule__AndElement__Group_1__0 )* )
            // InternalDsl.g:2050:2: ( rule__AndElement__Group_1__0 )*
            {
             before(grammarAccess.getAndElementAccess().getGroup_1()); 
            // InternalDsl.g:2051:2: ( rule__AndElement__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:2051:3: rule__AndElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AndElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDsl.g:2060:1: rule__AndElement__Group_1__0 : rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 ;
    public final void rule__AndElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2064:1: ( rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 )
            // InternalDsl.g:2065:2: rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2072:1: rule__AndElement__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__AndElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2076:1: ( ( 'and' ) )
            // InternalDsl.g:2077:1: ( 'and' )
            {
            // InternalDsl.g:2077:1: ( 'and' )
            // InternalDsl.g:2078:2: 'and'
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
    // InternalDsl.g:2087:1: rule__AndElement__Group_1__1 : rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 ;
    public final void rule__AndElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2091:1: ( rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 )
            // InternalDsl.g:2092:2: rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2099:1: rule__AndElement__Group_1__1__Impl : ( () ) ;
    public final void rule__AndElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2103:1: ( ( () ) )
            // InternalDsl.g:2104:1: ( () )
            {
            // InternalDsl.g:2104:1: ( () )
            // InternalDsl.g:2105:2: ()
            {
             before(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 
            // InternalDsl.g:2106:2: ()
            // InternalDsl.g:2106:3: 
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
    // InternalDsl.g:2114:1: rule__AndElement__Group_1__2 : rule__AndElement__Group_1__2__Impl ;
    public final void rule__AndElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2118:1: ( rule__AndElement__Group_1__2__Impl )
            // InternalDsl.g:2119:2: rule__AndElement__Group_1__2__Impl
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
    // InternalDsl.g:2125:1: rule__AndElement__Group_1__2__Impl : ( ( rule__AndElement__RightAssignment_1_2 ) ) ;
    public final void rule__AndElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2129:1: ( ( ( rule__AndElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2130:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2130:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            // InternalDsl.g:2131:2: ( rule__AndElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2132:2: ( rule__AndElement__RightAssignment_1_2 )
            // InternalDsl.g:2132:3: rule__AndElement__RightAssignment_1_2
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
    // InternalDsl.g:2141:1: rule__DiffEqualElement__Group__0 : rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 ;
    public final void rule__DiffEqualElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2145:1: ( rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 )
            // InternalDsl.g:2146:2: rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDsl.g:2153:1: rule__DiffEqualElement__Group__0__Impl : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2157:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:2158:1: ( ruleCompareElement )
            {
            // InternalDsl.g:2158:1: ( ruleCompareElement )
            // InternalDsl.g:2159:2: ruleCompareElement
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
    // InternalDsl.g:2168:1: rule__DiffEqualElement__Group__1 : rule__DiffEqualElement__Group__1__Impl ;
    public final void rule__DiffEqualElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2172:1: ( rule__DiffEqualElement__Group__1__Impl )
            // InternalDsl.g:2173:2: rule__DiffEqualElement__Group__1__Impl
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
    // InternalDsl.g:2179:1: rule__DiffEqualElement__Group__1__Impl : ( ( rule__DiffEqualElement__Alternatives_1 )* ) ;
    public final void rule__DiffEqualElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2183:1: ( ( ( rule__DiffEqualElement__Alternatives_1 )* ) )
            // InternalDsl.g:2184:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2184:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            // InternalDsl.g:2185:2: ( rule__DiffEqualElement__Alternatives_1 )*
            {
             before(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2186:2: ( rule__DiffEqualElement__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=29 && LA19_0<=30)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2186:3: rule__DiffEqualElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__DiffEqualElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDsl.g:2195:1: rule__DiffEqualElement__Group_1_0__0 : rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 ;
    public final void rule__DiffEqualElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2199:1: ( rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 )
            // InternalDsl.g:2200:2: rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2207:1: rule__DiffEqualElement__Group_1_0__0__Impl : ( '!=' ) ;
    public final void rule__DiffEqualElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2211:1: ( ( '!=' ) )
            // InternalDsl.g:2212:1: ( '!=' )
            {
            // InternalDsl.g:2212:1: ( '!=' )
            // InternalDsl.g:2213:2: '!='
            {
             before(grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDsl.g:2222:1: rule__DiffEqualElement__Group_1_0__1 : rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 ;
    public final void rule__DiffEqualElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2226:1: ( rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 )
            // InternalDsl.g:2227:2: rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2234:1: rule__DiffEqualElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2238:1: ( ( () ) )
            // InternalDsl.g:2239:1: ( () )
            {
            // InternalDsl.g:2239:1: ( () )
            // InternalDsl.g:2240:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 
            // InternalDsl.g:2241:2: ()
            // InternalDsl.g:2241:3: 
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
    // InternalDsl.g:2249:1: rule__DiffEqualElement__Group_1_0__2 : rule__DiffEqualElement__Group_1_0__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2253:1: ( rule__DiffEqualElement__Group_1_0__2__Impl )
            // InternalDsl.g:2254:2: rule__DiffEqualElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2260:1: rule__DiffEqualElement__Group_1_0__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2264:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2265:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2265:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2266:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2267:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2267:3: rule__DiffEqualElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2276:1: rule__DiffEqualElement__Group_1_1__0 : rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 ;
    public final void rule__DiffEqualElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2280:1: ( rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 )
            // InternalDsl.g:2281:2: rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2288:1: rule__DiffEqualElement__Group_1_1__0__Impl : ( '==' ) ;
    public final void rule__DiffEqualElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2292:1: ( ( '==' ) )
            // InternalDsl.g:2293:1: ( '==' )
            {
            // InternalDsl.g:2293:1: ( '==' )
            // InternalDsl.g:2294:2: '=='
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDsl.g:2303:1: rule__DiffEqualElement__Group_1_1__1 : rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 ;
    public final void rule__DiffEqualElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2307:1: ( rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 )
            // InternalDsl.g:2308:2: rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2315:1: rule__DiffEqualElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2319:1: ( ( () ) )
            // InternalDsl.g:2320:1: ( () )
            {
            // InternalDsl.g:2320:1: ( () )
            // InternalDsl.g:2321:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:2322:2: ()
            // InternalDsl.g:2322:3: 
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
    // InternalDsl.g:2330:1: rule__DiffEqualElement__Group_1_1__2 : rule__DiffEqualElement__Group_1_1__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2334:1: ( rule__DiffEqualElement__Group_1_1__2__Impl )
            // InternalDsl.g:2335:2: rule__DiffEqualElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2341:1: rule__DiffEqualElement__Group_1_1__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2345:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2346:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2346:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2347:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2348:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2348:3: rule__DiffEqualElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2357:1: rule__CompareElement__Group__0 : rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 ;
    public final void rule__CompareElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2361:1: ( rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 )
            // InternalDsl.g:2362:2: rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDsl.g:2369:1: rule__CompareElement__Group__0__Impl : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2373:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2374:1: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2374:1: ( rulePlusMinusElement )
            // InternalDsl.g:2375:2: rulePlusMinusElement
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
    // InternalDsl.g:2384:1: rule__CompareElement__Group__1 : rule__CompareElement__Group__1__Impl ;
    public final void rule__CompareElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2388:1: ( rule__CompareElement__Group__1__Impl )
            // InternalDsl.g:2389:2: rule__CompareElement__Group__1__Impl
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
    // InternalDsl.g:2395:1: rule__CompareElement__Group__1__Impl : ( ( rule__CompareElement__Alternatives_1 )* ) ;
    public final void rule__CompareElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2399:1: ( ( ( rule__CompareElement__Alternatives_1 )* ) )
            // InternalDsl.g:2400:1: ( ( rule__CompareElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2400:1: ( ( rule__CompareElement__Alternatives_1 )* )
            // InternalDsl.g:2401:2: ( rule__CompareElement__Alternatives_1 )*
            {
             before(grammarAccess.getCompareElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2402:2: ( rule__CompareElement__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=31 && LA20_0<=34)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2402:3: rule__CompareElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompareElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDsl.g:2411:1: rule__CompareElement__Group_1_0__0 : rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 ;
    public final void rule__CompareElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2415:1: ( rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 )
            // InternalDsl.g:2416:2: rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2423:1: rule__CompareElement__Group_1_0__0__Impl : ( '>' ) ;
    public final void rule__CompareElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2427:1: ( ( '>' ) )
            // InternalDsl.g:2428:1: ( '>' )
            {
            // InternalDsl.g:2428:1: ( '>' )
            // InternalDsl.g:2429:2: '>'
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDsl.g:2438:1: rule__CompareElement__Group_1_0__1 : rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 ;
    public final void rule__CompareElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2442:1: ( rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 )
            // InternalDsl.g:2443:2: rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2450:1: rule__CompareElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2454:1: ( ( () ) )
            // InternalDsl.g:2455:1: ( () )
            {
            // InternalDsl.g:2455:1: ( () )
            // InternalDsl.g:2456:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 
            // InternalDsl.g:2457:2: ()
            // InternalDsl.g:2457:3: 
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
    // InternalDsl.g:2465:1: rule__CompareElement__Group_1_0__2 : rule__CompareElement__Group_1_0__2__Impl ;
    public final void rule__CompareElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2469:1: ( rule__CompareElement__Group_1_0__2__Impl )
            // InternalDsl.g:2470:2: rule__CompareElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2476:1: rule__CompareElement__Group_1_0__2__Impl : ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__CompareElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2480:1: ( ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2481:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2481:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2482:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2483:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2483:3: rule__CompareElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2492:1: rule__CompareElement__Group_1_1__0 : rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 ;
    public final void rule__CompareElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2496:1: ( rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 )
            // InternalDsl.g:2497:2: rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2504:1: rule__CompareElement__Group_1_1__0__Impl : ( '>=' ) ;
    public final void rule__CompareElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2508:1: ( ( '>=' ) )
            // InternalDsl.g:2509:1: ( '>=' )
            {
            // InternalDsl.g:2509:1: ( '>=' )
            // InternalDsl.g:2510:2: '>='
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDsl.g:2519:1: rule__CompareElement__Group_1_1__1 : rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 ;
    public final void rule__CompareElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2523:1: ( rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 )
            // InternalDsl.g:2524:2: rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2531:1: rule__CompareElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2535:1: ( ( () ) )
            // InternalDsl.g:2536:1: ( () )
            {
            // InternalDsl.g:2536:1: ( () )
            // InternalDsl.g:2537:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:2538:2: ()
            // InternalDsl.g:2538:3: 
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
    // InternalDsl.g:2546:1: rule__CompareElement__Group_1_1__2 : rule__CompareElement__Group_1_1__2__Impl ;
    public final void rule__CompareElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2550:1: ( rule__CompareElement__Group_1_1__2__Impl )
            // InternalDsl.g:2551:2: rule__CompareElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2557:1: rule__CompareElement__Group_1_1__2__Impl : ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__CompareElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2561:1: ( ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2562:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2562:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2563:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2564:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2564:3: rule__CompareElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2573:1: rule__CompareElement__Group_1_2__0 : rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 ;
    public final void rule__CompareElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2577:1: ( rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 )
            // InternalDsl.g:2578:2: rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2585:1: rule__CompareElement__Group_1_2__0__Impl : ( '<' ) ;
    public final void rule__CompareElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2589:1: ( ( '<' ) )
            // InternalDsl.g:2590:1: ( '<' )
            {
            // InternalDsl.g:2590:1: ( '<' )
            // InternalDsl.g:2591:2: '<'
            {
             before(grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDsl.g:2600:1: rule__CompareElement__Group_1_2__1 : rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 ;
    public final void rule__CompareElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2604:1: ( rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 )
            // InternalDsl.g:2605:2: rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2612:1: rule__CompareElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2616:1: ( ( () ) )
            // InternalDsl.g:2617:1: ( () )
            {
            // InternalDsl.g:2617:1: ( () )
            // InternalDsl.g:2618:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 
            // InternalDsl.g:2619:2: ()
            // InternalDsl.g:2619:3: 
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
    // InternalDsl.g:2627:1: rule__CompareElement__Group_1_2__2 : rule__CompareElement__Group_1_2__2__Impl ;
    public final void rule__CompareElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2631:1: ( rule__CompareElement__Group_1_2__2__Impl )
            // InternalDsl.g:2632:2: rule__CompareElement__Group_1_2__2__Impl
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
    // InternalDsl.g:2638:1: rule__CompareElement__Group_1_2__2__Impl : ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__CompareElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2642:1: ( ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:2643:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:2643:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:2644:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:2645:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            // InternalDsl.g:2645:3: rule__CompareElement__RightAssignment_1_2_2
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
    // InternalDsl.g:2654:1: rule__CompareElement__Group_1_3__0 : rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 ;
    public final void rule__CompareElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2658:1: ( rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 )
            // InternalDsl.g:2659:2: rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2666:1: rule__CompareElement__Group_1_3__0__Impl : ( '=<' ) ;
    public final void rule__CompareElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2670:1: ( ( '=<' ) )
            // InternalDsl.g:2671:1: ( '=<' )
            {
            // InternalDsl.g:2671:1: ( '=<' )
            // InternalDsl.g:2672:2: '=<'
            {
             before(grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDsl.g:2681:1: rule__CompareElement__Group_1_3__1 : rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 ;
    public final void rule__CompareElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2685:1: ( rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 )
            // InternalDsl.g:2686:2: rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2693:1: rule__CompareElement__Group_1_3__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2697:1: ( ( () ) )
            // InternalDsl.g:2698:1: ( () )
            {
            // InternalDsl.g:2698:1: ( () )
            // InternalDsl.g:2699:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 
            // InternalDsl.g:2700:2: ()
            // InternalDsl.g:2700:3: 
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
    // InternalDsl.g:2708:1: rule__CompareElement__Group_1_3__2 : rule__CompareElement__Group_1_3__2__Impl ;
    public final void rule__CompareElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2712:1: ( rule__CompareElement__Group_1_3__2__Impl )
            // InternalDsl.g:2713:2: rule__CompareElement__Group_1_3__2__Impl
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
    // InternalDsl.g:2719:1: rule__CompareElement__Group_1_3__2__Impl : ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) ;
    public final void rule__CompareElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2723:1: ( ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) )
            // InternalDsl.g:2724:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            {
            // InternalDsl.g:2724:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            // InternalDsl.g:2725:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 
            // InternalDsl.g:2726:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            // InternalDsl.g:2726:3: rule__CompareElement__RightAssignment_1_3_2
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
    // InternalDsl.g:2735:1: rule__PlusMinusElement__Group__0 : rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 ;
    public final void rule__PlusMinusElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2739:1: ( rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 )
            // InternalDsl.g:2740:2: rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalDsl.g:2747:1: rule__PlusMinusElement__Group__0__Impl : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2751:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:2752:1: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:2752:1: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:2753:2: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:2762:1: rule__PlusMinusElement__Group__1 : rule__PlusMinusElement__Group__1__Impl ;
    public final void rule__PlusMinusElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2766:1: ( rule__PlusMinusElement__Group__1__Impl )
            // InternalDsl.g:2767:2: rule__PlusMinusElement__Group__1__Impl
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
    // InternalDsl.g:2773:1: rule__PlusMinusElement__Group__1__Impl : ( ( rule__PlusMinusElement__Alternatives_1 )* ) ;
    public final void rule__PlusMinusElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2777:1: ( ( ( rule__PlusMinusElement__Alternatives_1 )* ) )
            // InternalDsl.g:2778:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2778:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            // InternalDsl.g:2779:2: ( rule__PlusMinusElement__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2780:2: ( rule__PlusMinusElement__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:2780:3: rule__PlusMinusElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__PlusMinusElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDsl.g:2789:1: rule__PlusMinusElement__Group_1_0__0 : rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 ;
    public final void rule__PlusMinusElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2793:1: ( rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 )
            // InternalDsl.g:2794:2: rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2801:1: rule__PlusMinusElement__Group_1_0__0__Impl : ( '+' ) ;
    public final void rule__PlusMinusElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2805:1: ( ( '+' ) )
            // InternalDsl.g:2806:1: ( '+' )
            {
            // InternalDsl.g:2806:1: ( '+' )
            // InternalDsl.g:2807:2: '+'
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDsl.g:2816:1: rule__PlusMinusElement__Group_1_0__1 : rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 ;
    public final void rule__PlusMinusElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2820:1: ( rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 )
            // InternalDsl.g:2821:2: rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2828:1: rule__PlusMinusElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2832:1: ( ( () ) )
            // InternalDsl.g:2833:1: ( () )
            {
            // InternalDsl.g:2833:1: ( () )
            // InternalDsl.g:2834:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 
            // InternalDsl.g:2835:2: ()
            // InternalDsl.g:2835:3: 
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
    // InternalDsl.g:2843:1: rule__PlusMinusElement__Group_1_0__2 : rule__PlusMinusElement__Group_1_0__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2847:1: ( rule__PlusMinusElement__Group_1_0__2__Impl )
            // InternalDsl.g:2848:2: rule__PlusMinusElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2854:1: rule__PlusMinusElement__Group_1_0__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2858:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2859:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2859:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2860:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2861:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2861:3: rule__PlusMinusElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2870:1: rule__PlusMinusElement__Group_1_1__0 : rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 ;
    public final void rule__PlusMinusElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2874:1: ( rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 )
            // InternalDsl.g:2875:2: rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2882:1: rule__PlusMinusElement__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__PlusMinusElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2886:1: ( ( '-' ) )
            // InternalDsl.g:2887:1: ( '-' )
            {
            // InternalDsl.g:2887:1: ( '-' )
            // InternalDsl.g:2888:2: '-'
            {
             before(grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDsl.g:2897:1: rule__PlusMinusElement__Group_1_1__1 : rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 ;
    public final void rule__PlusMinusElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2901:1: ( rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 )
            // InternalDsl.g:2902:2: rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2909:1: rule__PlusMinusElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2913:1: ( ( () ) )
            // InternalDsl.g:2914:1: ( () )
            {
            // InternalDsl.g:2914:1: ( () )
            // InternalDsl.g:2915:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 
            // InternalDsl.g:2916:2: ()
            // InternalDsl.g:2916:3: 
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
    // InternalDsl.g:2924:1: rule__PlusMinusElement__Group_1_1__2 : rule__PlusMinusElement__Group_1_1__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2928:1: ( rule__PlusMinusElement__Group_1_1__2__Impl )
            // InternalDsl.g:2929:2: rule__PlusMinusElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2935:1: rule__PlusMinusElement__Group_1_1__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2939:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2940:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2940:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2941:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2942:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2942:3: rule__PlusMinusElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2951:1: rule__MultiplicationDivisionElement__Group__0 : rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 ;
    public final void rule__MultiplicationDivisionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2955:1: ( rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 )
            // InternalDsl.g:2956:2: rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDsl.g:2963:1: rule__MultiplicationDivisionElement__Group__0__Impl : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2967:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:2968:1: ( ruleUnaryElement )
            {
            // InternalDsl.g:2968:1: ( ruleUnaryElement )
            // InternalDsl.g:2969:2: ruleUnaryElement
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
    // InternalDsl.g:2978:1: rule__MultiplicationDivisionElement__Group__1 : rule__MultiplicationDivisionElement__Group__1__Impl ;
    public final void rule__MultiplicationDivisionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2982:1: ( rule__MultiplicationDivisionElement__Group__1__Impl )
            // InternalDsl.g:2983:2: rule__MultiplicationDivisionElement__Group__1__Impl
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
    // InternalDsl.g:2989:1: rule__MultiplicationDivisionElement__Group__1__Impl : ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) ;
    public final void rule__MultiplicationDivisionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2993:1: ( ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) )
            // InternalDsl.g:2994:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2994:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            // InternalDsl.g:2995:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2996:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=37 && LA22_0<=39)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:2996:3: rule__MultiplicationDivisionElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__MultiplicationDivisionElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalDsl.g:3005:1: rule__MultiplicationDivisionElement__Group_1_0__0 : rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3009:1: ( rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 )
            // InternalDsl.g:3010:2: rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3017:1: rule__MultiplicationDivisionElement__Group_1_0__0__Impl : ( '*' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3021:1: ( ( '*' ) )
            // InternalDsl.g:3022:1: ( '*' )
            {
            // InternalDsl.g:3022:1: ( '*' )
            // InternalDsl.g:3023:2: '*'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDsl.g:3032:1: rule__MultiplicationDivisionElement__Group_1_0__1 : rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3036:1: ( rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 )
            // InternalDsl.g:3037:2: rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3044:1: rule__MultiplicationDivisionElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3048:1: ( ( () ) )
            // InternalDsl.g:3049:1: ( () )
            {
            // InternalDsl.g:3049:1: ( () )
            // InternalDsl.g:3050:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 
            // InternalDsl.g:3051:2: ()
            // InternalDsl.g:3051:3: 
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
    // InternalDsl.g:3059:1: rule__MultiplicationDivisionElement__Group_1_0__2 : rule__MultiplicationDivisionElement__Group_1_0__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3063:1: ( rule__MultiplicationDivisionElement__Group_1_0__2__Impl )
            // InternalDsl.g:3064:2: rule__MultiplicationDivisionElement__Group_1_0__2__Impl
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
    // InternalDsl.g:3070:1: rule__MultiplicationDivisionElement__Group_1_0__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3074:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:3075:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:3075:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:3076:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:3077:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            // InternalDsl.g:3077:3: rule__MultiplicationDivisionElement__RightAssignment_1_0_2
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
    // InternalDsl.g:3086:1: rule__MultiplicationDivisionElement__Group_1_1__0 : rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3090:1: ( rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 )
            // InternalDsl.g:3091:2: rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3098:1: rule__MultiplicationDivisionElement__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3102:1: ( ( '/' ) )
            // InternalDsl.g:3103:1: ( '/' )
            {
            // InternalDsl.g:3103:1: ( '/' )
            // InternalDsl.g:3104:2: '/'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDsl.g:3113:1: rule__MultiplicationDivisionElement__Group_1_1__1 : rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3117:1: ( rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 )
            // InternalDsl.g:3118:2: rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3125:1: rule__MultiplicationDivisionElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3129:1: ( ( () ) )
            // InternalDsl.g:3130:1: ( () )
            {
            // InternalDsl.g:3130:1: ( () )
            // InternalDsl.g:3131:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 
            // InternalDsl.g:3132:2: ()
            // InternalDsl.g:3132:3: 
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
    // InternalDsl.g:3140:1: rule__MultiplicationDivisionElement__Group_1_1__2 : rule__MultiplicationDivisionElement__Group_1_1__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3144:1: ( rule__MultiplicationDivisionElement__Group_1_1__2__Impl )
            // InternalDsl.g:3145:2: rule__MultiplicationDivisionElement__Group_1_1__2__Impl
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
    // InternalDsl.g:3151:1: rule__MultiplicationDivisionElement__Group_1_1__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3155:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3156:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3156:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3157:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3158:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3158:3: rule__MultiplicationDivisionElement__RightAssignment_1_1_2
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
    // InternalDsl.g:3167:1: rule__MultiplicationDivisionElement__Group_1_2__0 : rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3171:1: ( rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 )
            // InternalDsl.g:3172:2: rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3179:1: rule__MultiplicationDivisionElement__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3183:1: ( ( '%' ) )
            // InternalDsl.g:3184:1: ( '%' )
            {
            // InternalDsl.g:3184:1: ( '%' )
            // InternalDsl.g:3185:2: '%'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDsl.g:3194:1: rule__MultiplicationDivisionElement__Group_1_2__1 : rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3198:1: ( rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 )
            // InternalDsl.g:3199:2: rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3206:1: rule__MultiplicationDivisionElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3210:1: ( ( () ) )
            // InternalDsl.g:3211:1: ( () )
            {
            // InternalDsl.g:3211:1: ( () )
            // InternalDsl.g:3212:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 
            // InternalDsl.g:3213:2: ()
            // InternalDsl.g:3213:3: 
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
    // InternalDsl.g:3221:1: rule__MultiplicationDivisionElement__Group_1_2__2 : rule__MultiplicationDivisionElement__Group_1_2__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3225:1: ( rule__MultiplicationDivisionElement__Group_1_2__2__Impl )
            // InternalDsl.g:3226:2: rule__MultiplicationDivisionElement__Group_1_2__2__Impl
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
    // InternalDsl.g:3232:1: rule__MultiplicationDivisionElement__Group_1_2__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3236:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:3237:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:3237:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:3238:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:3239:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            // InternalDsl.g:3239:3: rule__MultiplicationDivisionElement__RightAssignment_1_2_2
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
    // InternalDsl.g:3248:1: rule__UnaryElement__Group_0__0 : rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 ;
    public final void rule__UnaryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3252:1: ( rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 )
            // InternalDsl.g:3253:2: rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDsl.g:3260:1: rule__UnaryElement__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3264:1: ( ( () ) )
            // InternalDsl.g:3265:1: ( () )
            {
            // InternalDsl.g:3265:1: ( () )
            // InternalDsl.g:3266:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 
            // InternalDsl.g:3267:2: ()
            // InternalDsl.g:3267:3: 
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
    // InternalDsl.g:3275:1: rule__UnaryElement__Group_0__1 : rule__UnaryElement__Group_0__1__Impl ;
    public final void rule__UnaryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3279:1: ( rule__UnaryElement__Group_0__1__Impl )
            // InternalDsl.g:3280:2: rule__UnaryElement__Group_0__1__Impl
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
    // InternalDsl.g:3286:1: rule__UnaryElement__Group_0__1__Impl : ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) ;
    public final void rule__UnaryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3290:1: ( ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) )
            // InternalDsl.g:3291:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            {
            // InternalDsl.g:3291:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            // InternalDsl.g:3292:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 
            // InternalDsl.g:3293:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            // InternalDsl.g:3293:3: rule__UnaryElement__ValueAssignment_0_1
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
    // InternalDsl.g:3302:1: rule__UnaryElement__Group_1__0 : rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 ;
    public final void rule__UnaryElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3306:1: ( rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 )
            // InternalDsl.g:3307:2: rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:3314:1: rule__UnaryElement__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3318:1: ( ( () ) )
            // InternalDsl.g:3319:1: ( () )
            {
            // InternalDsl.g:3319:1: ( () )
            // InternalDsl.g:3320:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0()); 
            // InternalDsl.g:3321:2: ()
            // InternalDsl.g:3321:3: 
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
    // InternalDsl.g:3329:1: rule__UnaryElement__Group_1__1 : rule__UnaryElement__Group_1__1__Impl ;
    public final void rule__UnaryElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3333:1: ( rule__UnaryElement__Group_1__1__Impl )
            // InternalDsl.g:3334:2: rule__UnaryElement__Group_1__1__Impl
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
    // InternalDsl.g:3340:1: rule__UnaryElement__Group_1__1__Impl : ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) ;
    public final void rule__UnaryElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3344:1: ( ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:3345:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:3345:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            // InternalDsl.g:3346:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:3347:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            // InternalDsl.g:3347:3: rule__UnaryElement__ValueAssignment_1_1
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
    // InternalDsl.g:3356:1: rule__UnaryElement__Group_2__0 : rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 ;
    public final void rule__UnaryElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3360:1: ( rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 )
            // InternalDsl.g:3361:2: rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3368:1: rule__UnaryElement__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3372:1: ( ( () ) )
            // InternalDsl.g:3373:1: ( () )
            {
            // InternalDsl.g:3373:1: ( () )
            // InternalDsl.g:3374:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0()); 
            // InternalDsl.g:3375:2: ()
            // InternalDsl.g:3375:3: 
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
    // InternalDsl.g:3383:1: rule__UnaryElement__Group_2__1 : rule__UnaryElement__Group_2__1__Impl ;
    public final void rule__UnaryElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3387:1: ( rule__UnaryElement__Group_2__1__Impl )
            // InternalDsl.g:3388:2: rule__UnaryElement__Group_2__1__Impl
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
    // InternalDsl.g:3394:1: rule__UnaryElement__Group_2__1__Impl : ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) ;
    public final void rule__UnaryElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3398:1: ( ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:3399:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:3399:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            // InternalDsl.g:3400:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:3401:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            // InternalDsl.g:3401:3: rule__UnaryElement__ValueAssignment_2_1
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
    // InternalDsl.g:3410:1: rule__UnaryElement__Group_3__0 : rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 ;
    public final void rule__UnaryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3414:1: ( rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 )
            // InternalDsl.g:3415:2: rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3422:1: rule__UnaryElement__Group_3__0__Impl : ( '(' ) ;
    public final void rule__UnaryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3426:1: ( ( '(' ) )
            // InternalDsl.g:3427:1: ( '(' )
            {
            // InternalDsl.g:3427:1: ( '(' )
            // InternalDsl.g:3428:2: '('
            {
             before(grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:3437:1: rule__UnaryElement__Group_3__1 : rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 ;
    public final void rule__UnaryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3441:1: ( rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 )
            // InternalDsl.g:3442:2: rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2
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
    // InternalDsl.g:3449:1: rule__UnaryElement__Group_3__1__Impl : ( ruleOrElement ) ;
    public final void rule__UnaryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3453:1: ( ( ruleOrElement ) )
            // InternalDsl.g:3454:1: ( ruleOrElement )
            {
            // InternalDsl.g:3454:1: ( ruleOrElement )
            // InternalDsl.g:3455:2: ruleOrElement
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
    // InternalDsl.g:3464:1: rule__UnaryElement__Group_3__2 : rule__UnaryElement__Group_3__2__Impl ;
    public final void rule__UnaryElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3468:1: ( rule__UnaryElement__Group_3__2__Impl )
            // InternalDsl.g:3469:2: rule__UnaryElement__Group_3__2__Impl
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
    // InternalDsl.g:3475:1: rule__UnaryElement__Group_3__2__Impl : ( ')' ) ;
    public final void rule__UnaryElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3479:1: ( ( ')' ) )
            // InternalDsl.g:3480:1: ( ')' )
            {
            // InternalDsl.g:3480:1: ( ')' )
            // InternalDsl.g:3481:2: ')'
            {
             before(grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_3_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:3491:1: rule__UnaryElement__Group_4__0 : rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 ;
    public final void rule__UnaryElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3495:1: ( rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 )
            // InternalDsl.g:3496:2: rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3503:1: rule__UnaryElement__Group_4__0__Impl : ( 'not' ) ;
    public final void rule__UnaryElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3507:1: ( ( 'not' ) )
            // InternalDsl.g:3508:1: ( 'not' )
            {
            // InternalDsl.g:3508:1: ( 'not' )
            // InternalDsl.g:3509:2: 'not'
            {
             before(grammarAccess.getUnaryElementAccess().getNotKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDsl.g:3518:1: rule__UnaryElement__Group_4__1 : rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 ;
    public final void rule__UnaryElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3522:1: ( rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 )
            // InternalDsl.g:3523:2: rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3530:1: rule__UnaryElement__Group_4__1__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3534:1: ( ( () ) )
            // InternalDsl.g:3535:1: ( () )
            {
            // InternalDsl.g:3535:1: ( () )
            // InternalDsl.g:3536:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1()); 
            // InternalDsl.g:3537:2: ()
            // InternalDsl.g:3537:3: 
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
    // InternalDsl.g:3545:1: rule__UnaryElement__Group_4__2 : rule__UnaryElement__Group_4__2__Impl ;
    public final void rule__UnaryElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3549:1: ( rule__UnaryElement__Group_4__2__Impl )
            // InternalDsl.g:3550:2: rule__UnaryElement__Group_4__2__Impl
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
    // InternalDsl.g:3556:1: rule__UnaryElement__Group_4__2__Impl : ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) ;
    public final void rule__UnaryElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3560:1: ( ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) )
            // InternalDsl.g:3561:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            {
            // InternalDsl.g:3561:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            // InternalDsl.g:3562:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            {
             before(grammarAccess.getUnaryElementAccess().getExpAssignment_4_2()); 
            // InternalDsl.g:3563:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            // InternalDsl.g:3563:3: rule__UnaryElement__ExpAssignment_4_2
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
    // InternalDsl.g:3572:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3576:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalDsl.g:3577:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDsl.g:3584:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3588:1: ( ( RULE_INT ) )
            // InternalDsl.g:3589:1: ( RULE_INT )
            {
            // InternalDsl.g:3589:1: ( RULE_INT )
            // InternalDsl.g:3590:2: RULE_INT
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
    // InternalDsl.g:3599:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3603:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // InternalDsl.g:3604:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalDsl.g:3611:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3615:1: ( ( '.' ) )
            // InternalDsl.g:3616:1: ( '.' )
            {
            // InternalDsl.g:3616:1: ( '.' )
            // InternalDsl.g:3617:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDsl.g:3626:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3630:1: ( rule__NUMBER__Group_1__2__Impl )
            // InternalDsl.g:3631:2: rule__NUMBER__Group_1__2__Impl
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
    // InternalDsl.g:3637:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3641:1: ( ( RULE_INT ) )
            // InternalDsl.g:3642:1: ( RULE_INT )
            {
            // InternalDsl.g:3642:1: ( RULE_INT )
            // InternalDsl.g:3643:2: RULE_INT
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
    // InternalDsl.g:3653:1: rule__EXTENDED_STRING__Group__0 : rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 ;
    public final void rule__EXTENDED_STRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3657:1: ( rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 )
            // InternalDsl.g:3658:2: rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalDsl.g:3665:1: rule__EXTENDED_STRING__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3669:1: ( ( RULE_ID ) )
            // InternalDsl.g:3670:1: ( RULE_ID )
            {
            // InternalDsl.g:3670:1: ( RULE_ID )
            // InternalDsl.g:3671:2: RULE_ID
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
    // InternalDsl.g:3680:1: rule__EXTENDED_STRING__Group__1 : rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 ;
    public final void rule__EXTENDED_STRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3684:1: ( rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 )
            // InternalDsl.g:3685:2: rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalDsl.g:3692:1: rule__EXTENDED_STRING__Group__1__Impl : ( ( rule__EXTENDED_STRING__Group_1__0 )* ) ;
    public final void rule__EXTENDED_STRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3696:1: ( ( ( rule__EXTENDED_STRING__Group_1__0 )* ) )
            // InternalDsl.g:3697:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            {
            // InternalDsl.g:3697:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            // InternalDsl.g:3698:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_1()); 
            // InternalDsl.g:3699:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:3699:3: rule__EXTENDED_STRING__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__EXTENDED_STRING__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalDsl.g:3707:1: rule__EXTENDED_STRING__Group__2 : rule__EXTENDED_STRING__Group__2__Impl ;
    public final void rule__EXTENDED_STRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3711:1: ( rule__EXTENDED_STRING__Group__2__Impl )
            // InternalDsl.g:3712:2: rule__EXTENDED_STRING__Group__2__Impl
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
    // InternalDsl.g:3718:1: rule__EXTENDED_STRING__Group__2__Impl : ( ( rule__EXTENDED_STRING__Group_2__0 )? ) ;
    public final void rule__EXTENDED_STRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3722:1: ( ( ( rule__EXTENDED_STRING__Group_2__0 )? ) )
            // InternalDsl.g:3723:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            {
            // InternalDsl.g:3723:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            // InternalDsl.g:3724:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_2()); 
            // InternalDsl.g:3725:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==27) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:3725:3: rule__EXTENDED_STRING__Group_2__0
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
    // InternalDsl.g:3734:1: rule__EXTENDED_STRING__Group_1__0 : rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 ;
    public final void rule__EXTENDED_STRING__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3738:1: ( rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 )
            // InternalDsl.g:3739:2: rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:3746:1: rule__EXTENDED_STRING__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EXTENDED_STRING__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3750:1: ( ( '.' ) )
            // InternalDsl.g:3751:1: ( '.' )
            {
            // InternalDsl.g:3751:1: ( '.' )
            // InternalDsl.g:3752:2: '.'
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getFullStopKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDsl.g:3761:1: rule__EXTENDED_STRING__Group_1__1 : rule__EXTENDED_STRING__Group_1__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3765:1: ( rule__EXTENDED_STRING__Group_1__1__Impl )
            // InternalDsl.g:3766:2: rule__EXTENDED_STRING__Group_1__1__Impl
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
    // InternalDsl.g:3772:1: rule__EXTENDED_STRING__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3776:1: ( ( RULE_ID ) )
            // InternalDsl.g:3777:1: ( RULE_ID )
            {
            // InternalDsl.g:3777:1: ( RULE_ID )
            // InternalDsl.g:3778:2: RULE_ID
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
    // InternalDsl.g:3788:1: rule__EXTENDED_STRING__Group_2__0 : rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 ;
    public final void rule__EXTENDED_STRING__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3792:1: ( rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 )
            // InternalDsl.g:3793:2: rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3800:1: rule__EXTENDED_STRING__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EXTENDED_STRING__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3804:1: ( ( '(' ) )
            // InternalDsl.g:3805:1: ( '(' )
            {
            // InternalDsl.g:3805:1: ( '(' )
            // InternalDsl.g:3806:2: '('
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:3815:1: rule__EXTENDED_STRING__Group_2__1 : rule__EXTENDED_STRING__Group_2__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3819:1: ( rule__EXTENDED_STRING__Group_2__1__Impl )
            // InternalDsl.g:3820:2: rule__EXTENDED_STRING__Group_2__1__Impl
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
    // InternalDsl.g:3826:1: rule__EXTENDED_STRING__Group_2__1__Impl : ( ')' ) ;
    public final void rule__EXTENDED_STRING__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3830:1: ( ( ')' ) )
            // InternalDsl.g:3831:1: ( ')' )
            {
            // InternalDsl.g:3831:1: ( ')' )
            // InternalDsl.g:3832:2: ')'
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getRightParenthesisKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:3842:1: rule__RunTimeModel__EnvDataAssignment_1 : ( ruleEnvironmentMetaData ) ;
    public final void rule__RunTimeModel__EnvDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3846:1: ( ( ruleEnvironmentMetaData ) )
            // InternalDsl.g:3847:2: ( ruleEnvironmentMetaData )
            {
            // InternalDsl.g:3847:2: ( ruleEnvironmentMetaData )
            // InternalDsl.g:3848:3: ruleEnvironmentMetaData
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
    // InternalDsl.g:3857:1: rule__RunTimeModel__AppDataAssignment_2 : ( ruleAppMetaData ) ;
    public final void rule__RunTimeModel__AppDataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3861:1: ( ( ruleAppMetaData ) )
            // InternalDsl.g:3862:2: ( ruleAppMetaData )
            {
            // InternalDsl.g:3862:2: ( ruleAppMetaData )
            // InternalDsl.g:3863:3: ruleAppMetaData
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


    // $ANTLR start "rule__RunTimeModel__MappingPairsAssignment_5"
    // InternalDsl.g:3872:1: rule__RunTimeModel__MappingPairsAssignment_5 : ( ruleMappingPair ) ;
    public final void rule__RunTimeModel__MappingPairsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3876:1: ( ( ruleMappingPair ) )
            // InternalDsl.g:3877:2: ( ruleMappingPair )
            {
            // InternalDsl.g:3877:2: ( ruleMappingPair )
            // InternalDsl.g:3878:3: ruleMappingPair
            {
             before(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingPair();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__MappingPairsAssignment_5"


    // $ANTLR start "rule__AppMetaData__AppIDAssignment_1"
    // InternalDsl.g:3887:1: rule__AppMetaData__AppIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppMetaData__AppIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3891:1: ( ( RULE_ID ) )
            // InternalDsl.g:3892:2: ( RULE_ID )
            {
            // InternalDsl.g:3892:2: ( RULE_ID )
            // InternalDsl.g:3893:3: RULE_ID
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
    // InternalDsl.g:3902:1: rule__AppMetaData__SpecificationsAssignment_3 : ( ruleAppSpecification ) ;
    public final void rule__AppMetaData__SpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3906:1: ( ( ruleAppSpecification ) )
            // InternalDsl.g:3907:2: ( ruleAppSpecification )
            {
            // InternalDsl.g:3907:2: ( ruleAppSpecification )
            // InternalDsl.g:3908:3: ruleAppSpecification
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
    // InternalDsl.g:3917:1: rule__AppSpecification__SpecIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__AppSpecification__SpecIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3921:1: ( ( RULE_ID ) )
            // InternalDsl.g:3922:2: ( RULE_ID )
            {
            // InternalDsl.g:3922:2: ( RULE_ID )
            // InternalDsl.g:3923:3: RULE_ID
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
    // InternalDsl.g:3932:1: rule__AppSpecification__TriggerAssignment_2 : ( ruleOrElement ) ;
    public final void rule__AppSpecification__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3936:1: ( ( ruleOrElement ) )
            // InternalDsl.g:3937:2: ( ruleOrElement )
            {
            // InternalDsl.g:3937:2: ( ruleOrElement )
            // InternalDsl.g:3938:3: ruleOrElement
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
    // InternalDsl.g:3947:1: rule__AppSpecification__ConditionAssignment_4 : ( ruleOrElement ) ;
    public final void rule__AppSpecification__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3951:1: ( ( ruleOrElement ) )
            // InternalDsl.g:3952:2: ( ruleOrElement )
            {
            // InternalDsl.g:3952:2: ( ruleOrElement )
            // InternalDsl.g:3953:3: ruleOrElement
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
    // InternalDsl.g:3962:1: rule__AppSpecification__ActionAssignment_6 : ( ruleAction ) ;
    public final void rule__AppSpecification__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3966:1: ( ( ruleAction ) )
            // InternalDsl.g:3967:2: ( ruleAction )
            {
            // InternalDsl.g:3967:2: ( ruleAction )
            // InternalDsl.g:3968:3: ruleAction
            {
             before(grammarAccess.getAppSpecificationAccess().getActionActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getActionActionParserRuleCall_6_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AppSpecification__ActionAssignment_7_1"
    // InternalDsl.g:3977:1: rule__AppSpecification__ActionAssignment_7_1 : ( ruleAction ) ;
    public final void rule__AppSpecification__ActionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3981:1: ( ( ruleAction ) )
            // InternalDsl.g:3982:2: ( ruleAction )
            {
            // InternalDsl.g:3982:2: ( ruleAction )
            // InternalDsl.g:3983:3: ruleAction
            {
             before(grammarAccess.getAppSpecificationAccess().getActionActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getAppSpecificationAccess().getActionActionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppSpecification__ActionAssignment_7_1"


    // $ANTLR start "rule__EnvironmentMetaData__ResourcesAssignment_2"
    // InternalDsl.g:3992:1: rule__EnvironmentMetaData__ResourcesAssignment_2 : ( ruleResource ) ;
    public final void rule__EnvironmentMetaData__ResourcesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3996:1: ( ( ruleResource ) )
            // InternalDsl.g:3997:2: ( ruleResource )
            {
            // InternalDsl.g:3997:2: ( ruleResource )
            // InternalDsl.g:3998:3: ruleResource
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__ResourcesAssignment_2"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // InternalDsl.g:4007:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4011:1: ( ( RULE_ID ) )
            // InternalDsl.g:4012:2: ( RULE_ID )
            {
            // InternalDsl.g:4012:2: ( RULE_ID )
            // InternalDsl.g:4013:3: RULE_ID
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
    // InternalDsl.g:4022:1: rule__Resource__StatesAssignment_4 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4026:1: ( ( ruleState ) )
            // InternalDsl.g:4027:2: ( ruleState )
            {
            // InternalDsl.g:4027:2: ( ruleState )
            // InternalDsl.g:4028:3: ruleState
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
    // InternalDsl.g:4037:1: rule__Resource__StatesAssignment_5_1 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4041:1: ( ( ruleState ) )
            // InternalDsl.g:4042:2: ( ruleState )
            {
            // InternalDsl.g:4042:2: ( ruleState )
            // InternalDsl.g:4043:3: ruleState
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
    // InternalDsl.g:4052:1: rule__Action__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4056:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4057:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4057:2: ( ( RULE_ID ) )
            // InternalDsl.g:4058:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0()); 
            // InternalDsl.g:4059:3: ( RULE_ID )
            // InternalDsl.g:4060:4: RULE_ID
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
    // InternalDsl.g:4071:1: rule__Action__StateAssignment_2 : ( ruleState ) ;
    public final void rule__Action__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4075:1: ( ( ruleState ) )
            // InternalDsl.g:4076:2: ( ruleState )
            {
            // InternalDsl.g:4076:2: ( ruleState )
            // InternalDsl.g:4077:3: ruleState
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


    // $ANTLR start "rule__MappingPair__ResourceAssignment_1"
    // InternalDsl.g:4086:1: rule__MappingPair__ResourceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MappingPair__ResourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4090:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4091:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4091:2: ( ( RULE_ID ) )
            // InternalDsl.g:4092:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingPairAccess().getResourceResourceCrossReference_1_0()); 
            // InternalDsl.g:4093:3: ( RULE_ID )
            // InternalDsl.g:4094:4: RULE_ID
            {
             before(grammarAccess.getMappingPairAccess().getResourceResourceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingPairAccess().getResourceResourceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMappingPairAccess().getResourceResourceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__ResourceAssignment_1"


    // $ANTLR start "rule__MappingPair__StateAssignment_3"
    // InternalDsl.g:4105:1: rule__MappingPair__StateAssignment_3 : ( ruleUnaryElement ) ;
    public final void rule__MappingPair__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4109:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4110:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4110:2: ( ruleUnaryElement )
            // InternalDsl.g:4111:3: ruleUnaryElement
            {
             before(grammarAccess.getMappingPairAccess().getStateUnaryElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMappingPairAccess().getStateUnaryElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__StateAssignment_3"


    // $ANTLR start "rule__MappingPair__ActionCodeAssignment_5"
    // InternalDsl.g:4120:1: rule__MappingPair__ActionCodeAssignment_5 : ( ruleEXTENDED_STRING ) ;
    public final void rule__MappingPair__ActionCodeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4124:1: ( ( ruleEXTENDED_STRING ) )
            // InternalDsl.g:4125:2: ( ruleEXTENDED_STRING )
            {
            // InternalDsl.g:4125:2: ( ruleEXTENDED_STRING )
            // InternalDsl.g:4126:3: ruleEXTENDED_STRING
            {
             before(grammarAccess.getMappingPairAccess().getActionCodeEXTENDED_STRINGParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEXTENDED_STRING();

            state._fsp--;

             after(grammarAccess.getMappingPairAccess().getActionCodeEXTENDED_STRINGParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingPair__ActionCodeAssignment_5"


    // $ANTLR start "rule__OrElement__RightAssignment_1_2"
    // InternalDsl.g:4135:1: rule__OrElement__RightAssignment_1_2 : ( ruleAndElement ) ;
    public final void rule__OrElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4139:1: ( ( ruleAndElement ) )
            // InternalDsl.g:4140:2: ( ruleAndElement )
            {
            // InternalDsl.g:4140:2: ( ruleAndElement )
            // InternalDsl.g:4141:3: ruleAndElement
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
    // InternalDsl.g:4150:1: rule__AndElement__RightAssignment_1_2 : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4154:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:4155:2: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:4155:2: ( ruleDiffEqualElement )
            // InternalDsl.g:4156:3: ruleDiffEqualElement
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
    // InternalDsl.g:4165:1: rule__DiffEqualElement__RightAssignment_1_0_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4169:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4170:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4170:2: ( ruleCompareElement )
            // InternalDsl.g:4171:3: ruleCompareElement
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
    // InternalDsl.g:4180:1: rule__DiffEqualElement__RightAssignment_1_1_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4184:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4185:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4185:2: ( ruleCompareElement )
            // InternalDsl.g:4186:3: ruleCompareElement
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
    // InternalDsl.g:4195:1: rule__CompareElement__RightAssignment_1_0_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4199:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4200:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4200:2: ( rulePlusMinusElement )
            // InternalDsl.g:4201:3: rulePlusMinusElement
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
    // InternalDsl.g:4210:1: rule__CompareElement__RightAssignment_1_1_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4214:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4215:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4215:2: ( rulePlusMinusElement )
            // InternalDsl.g:4216:3: rulePlusMinusElement
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
    // InternalDsl.g:4225:1: rule__CompareElement__RightAssignment_1_2_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4229:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4230:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4230:2: ( rulePlusMinusElement )
            // InternalDsl.g:4231:3: rulePlusMinusElement
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
    // InternalDsl.g:4240:1: rule__CompareElement__RightAssignment_1_3_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4244:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4245:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4245:2: ( rulePlusMinusElement )
            // InternalDsl.g:4246:3: rulePlusMinusElement
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
    // InternalDsl.g:4255:1: rule__PlusMinusElement__RightAssignment_1_0_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4259:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4260:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4260:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4261:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:4270:1: rule__PlusMinusElement__RightAssignment_1_1_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4274:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4275:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4275:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4276:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:4285:1: rule__MultiplicationDivisionElement__RightAssignment_1_0_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4289:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4290:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4290:2: ( ruleUnaryElement )
            // InternalDsl.g:4291:3: ruleUnaryElement
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
    // InternalDsl.g:4300:1: rule__MultiplicationDivisionElement__RightAssignment_1_1_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4304:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4305:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4305:2: ( ruleUnaryElement )
            // InternalDsl.g:4306:3: ruleUnaryElement
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
    // InternalDsl.g:4315:1: rule__MultiplicationDivisionElement__RightAssignment_1_2_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4319:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4320:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4320:2: ( ruleUnaryElement )
            // InternalDsl.g:4321:3: ruleUnaryElement
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
    // InternalDsl.g:4330:1: rule__UnaryElement__ValueAssignment_0_1 : ( ruleNUMBER ) ;
    public final void rule__UnaryElement__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4334:1: ( ( ruleNUMBER ) )
            // InternalDsl.g:4335:2: ( ruleNUMBER )
            {
            // InternalDsl.g:4335:2: ( ruleNUMBER )
            // InternalDsl.g:4336:3: ruleNUMBER
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
    // InternalDsl.g:4345:1: rule__UnaryElement__ValueAssignment_1_1 : ( ruleEXTENDED_STRING ) ;
    public final void rule__UnaryElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4349:1: ( ( ruleEXTENDED_STRING ) )
            // InternalDsl.g:4350:2: ( ruleEXTENDED_STRING )
            {
            // InternalDsl.g:4350:2: ( ruleEXTENDED_STRING )
            // InternalDsl.g:4351:3: ruleEXTENDED_STRING
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
    // InternalDsl.g:4360:1: rule__UnaryElement__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__UnaryElement__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4364:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:4365:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:4365:2: ( RULE_BOOLEAN )
            // InternalDsl.g:4366:3: RULE_BOOLEAN
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
    // InternalDsl.g:4375:1: rule__UnaryElement__ExpAssignment_4_2 : ( ruleUnaryElement ) ;
    public final void rule__UnaryElement__ExpAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4379:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4380:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4380:2: ( ruleUnaryElement )
            // InternalDsl.g:4381:3: ruleUnaryElement
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000010C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010004020070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010004000072L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010004040070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010004000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000002L});

}