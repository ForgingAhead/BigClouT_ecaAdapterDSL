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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'ConceptToCodeMappings'", "'AppMeta'", "'on'", "'if'", "'do'", "'and'", "'EnvironmentMetaData'", "'service'", "'resource'", "'can'", "'be'", "','", "':='", "'('", "')'", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'.'"
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


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:278:1: entryRuleOrElement : ruleOrElement EOF ;
    public final void entryRuleOrElement() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleOrElement EOF )
            // InternalDsl.g:280:1: ruleOrElement EOF
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
    // InternalDsl.g:287:1: ruleOrElement : ( ( rule__OrElement__Group__0 ) ) ;
    public final void ruleOrElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__OrElement__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__OrElement__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__OrElement__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__OrElement__Group__0 )
            {
             before(grammarAccess.getOrElementAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__OrElement__Group__0 )
            // InternalDsl.g:294:4: rule__OrElement__Group__0
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
    // InternalDsl.g:303:1: entryRuleAndElement : ruleAndElement EOF ;
    public final void entryRuleAndElement() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleAndElement EOF )
            // InternalDsl.g:305:1: ruleAndElement EOF
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
    // InternalDsl.g:312:1: ruleAndElement : ( ( rule__AndElement__Group__0 ) ) ;
    public final void ruleAndElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__AndElement__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__AndElement__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__AndElement__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__AndElement__Group__0 )
            {
             before(grammarAccess.getAndElementAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__AndElement__Group__0 )
            // InternalDsl.g:319:4: rule__AndElement__Group__0
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
    // InternalDsl.g:328:1: entryRuleDiffEqualElement : ruleDiffEqualElement EOF ;
    public final void entryRuleDiffEqualElement() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleDiffEqualElement EOF )
            // InternalDsl.g:330:1: ruleDiffEqualElement EOF
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
    // InternalDsl.g:337:1: ruleDiffEqualElement : ( ( rule__DiffEqualElement__Group__0 ) ) ;
    public final void ruleDiffEqualElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__DiffEqualElement__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__DiffEqualElement__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__DiffEqualElement__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__DiffEqualElement__Group__0 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__DiffEqualElement__Group__0 )
            // InternalDsl.g:344:4: rule__DiffEqualElement__Group__0
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
    // InternalDsl.g:353:1: entryRuleCompareElement : ruleCompareElement EOF ;
    public final void entryRuleCompareElement() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleCompareElement EOF )
            // InternalDsl.g:355:1: ruleCompareElement EOF
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
    // InternalDsl.g:362:1: ruleCompareElement : ( ( rule__CompareElement__Group__0 ) ) ;
    public final void ruleCompareElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__CompareElement__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__CompareElement__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__CompareElement__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__CompareElement__Group__0 )
            {
             before(grammarAccess.getCompareElementAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__CompareElement__Group__0 )
            // InternalDsl.g:369:4: rule__CompareElement__Group__0
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
    // InternalDsl.g:378:1: entryRulePlusMinusElement : rulePlusMinusElement EOF ;
    public final void entryRulePlusMinusElement() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( rulePlusMinusElement EOF )
            // InternalDsl.g:380:1: rulePlusMinusElement EOF
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
    // InternalDsl.g:387:1: rulePlusMinusElement : ( ( rule__PlusMinusElement__Group__0 ) ) ;
    public final void rulePlusMinusElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__PlusMinusElement__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__PlusMinusElement__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__PlusMinusElement__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__PlusMinusElement__Group__0 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__PlusMinusElement__Group__0 )
            // InternalDsl.g:394:4: rule__PlusMinusElement__Group__0
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
    // InternalDsl.g:403:1: entryRuleMultiplicationDivisionElement : ruleMultiplicationDivisionElement EOF ;
    public final void entryRuleMultiplicationDivisionElement() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:405:1: ruleMultiplicationDivisionElement EOF
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
    // InternalDsl.g:412:1: ruleMultiplicationDivisionElement : ( ( rule__MultiplicationDivisionElement__Group__0 ) ) ;
    public final void ruleMultiplicationDivisionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__MultiplicationDivisionElement__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__MultiplicationDivisionElement__Group__0 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__MultiplicationDivisionElement__Group__0 )
            // InternalDsl.g:419:4: rule__MultiplicationDivisionElement__Group__0
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
    // InternalDsl.g:428:1: entryRuleUnaryElement : ruleUnaryElement EOF ;
    public final void entryRuleUnaryElement() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleUnaryElement EOF )
            // InternalDsl.g:430:1: ruleUnaryElement EOF
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
    // InternalDsl.g:437:1: ruleUnaryElement : ( ( rule__UnaryElement__Alternatives ) ) ;
    public final void ruleUnaryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__UnaryElement__Alternatives ) ) )
            // InternalDsl.g:442:2: ( ( rule__UnaryElement__Alternatives ) )
            {
            // InternalDsl.g:442:2: ( ( rule__UnaryElement__Alternatives ) )
            // InternalDsl.g:443:3: ( rule__UnaryElement__Alternatives )
            {
             before(grammarAccess.getUnaryElementAccess().getAlternatives()); 
            // InternalDsl.g:444:3: ( rule__UnaryElement__Alternatives )
            // InternalDsl.g:444:4: rule__UnaryElement__Alternatives
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
    // InternalDsl.g:453:1: entryRuleLBRACE : ruleLBRACE EOF ;
    public final void entryRuleLBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleLBRACE EOF )
            // InternalDsl.g:455:1: ruleLBRACE EOF
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
    // InternalDsl.g:462:1: ruleLBRACE : ( '{' ) ;
    public final void ruleLBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( '{' ) )
            // InternalDsl.g:467:2: ( '{' )
            {
            // InternalDsl.g:467:2: ( '{' )
            // InternalDsl.g:468:3: '{'
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
    // InternalDsl.g:478:1: entryRuleRBRACE : ruleRBRACE EOF ;
    public final void entryRuleRBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleRBRACE EOF )
            // InternalDsl.g:480:1: ruleRBRACE EOF
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
    // InternalDsl.g:487:1: ruleRBRACE : ( '}' ) ;
    public final void ruleRBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( '}' ) )
            // InternalDsl.g:492:2: ( '}' )
            {
            // InternalDsl.g:492:2: ( '}' )
            // InternalDsl.g:493:3: '}'
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
    // InternalDsl.g:503:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleNUMBER EOF )
            // InternalDsl.g:505:1: ruleNUMBER EOF
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
    // InternalDsl.g:512:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalDsl.g:517:2: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalDsl.g:517:2: ( ( rule__NUMBER__Alternatives ) )
            // InternalDsl.g:518:3: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // InternalDsl.g:519:3: ( rule__NUMBER__Alternatives )
            // InternalDsl.g:519:4: rule__NUMBER__Alternatives
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
    // InternalDsl.g:528:1: entryRuleEXTENDED_STRING : ruleEXTENDED_STRING EOF ;
    public final void entryRuleEXTENDED_STRING() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleEXTENDED_STRING EOF )
            // InternalDsl.g:530:1: ruleEXTENDED_STRING EOF
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
    // InternalDsl.g:537:1: ruleEXTENDED_STRING : ( ( rule__EXTENDED_STRING__Group__0 ) ) ;
    public final void ruleEXTENDED_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__EXTENDED_STRING__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__EXTENDED_STRING__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__EXTENDED_STRING__Group__0 )
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__EXTENDED_STRING__Group__0 )
            // InternalDsl.g:544:4: rule__EXTENDED_STRING__Group__0
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
    // InternalDsl.g:552:1: rule__State__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( ( RULE_ID ) | ( RULE_INT ) )
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
                    // InternalDsl.g:557:2: ( RULE_ID )
                    {
                    // InternalDsl.g:557:2: ( RULE_ID )
                    // InternalDsl.g:558:3: RULE_ID
                    {
                     before(grammarAccess.getStateAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:563:2: ( RULE_INT )
                    {
                    // InternalDsl.g:563:2: ( RULE_INT )
                    // InternalDsl.g:564:3: RULE_INT
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
    // InternalDsl.g:573:1: rule__DiffEqualElement__Alternatives_1 : ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) );
    public final void rule__DiffEqualElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:577:1: ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) )
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
                    // InternalDsl.g:578:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:578:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    // InternalDsl.g:579:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:580:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    // InternalDsl.g:580:4: rule__DiffEqualElement__Group_1_0__0
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
                    // InternalDsl.g:584:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:584:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    // InternalDsl.g:585:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:586:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    // InternalDsl.g:586:4: rule__DiffEqualElement__Group_1_1__0
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
    // InternalDsl.g:594:1: rule__CompareElement__Alternatives_1 : ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) );
    public final void rule__CompareElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:598:1: ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) )
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
                    // InternalDsl.g:599:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:599:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    // InternalDsl.g:600:3: ( rule__CompareElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:601:3: ( rule__CompareElement__Group_1_0__0 )
                    // InternalDsl.g:601:4: rule__CompareElement__Group_1_0__0
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
                    // InternalDsl.g:605:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:605:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    // InternalDsl.g:606:3: ( rule__CompareElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:607:3: ( rule__CompareElement__Group_1_1__0 )
                    // InternalDsl.g:607:4: rule__CompareElement__Group_1_1__0
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
                    // InternalDsl.g:611:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:611:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    // InternalDsl.g:612:3: ( rule__CompareElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:613:3: ( rule__CompareElement__Group_1_2__0 )
                    // InternalDsl.g:613:4: rule__CompareElement__Group_1_2__0
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
                    // InternalDsl.g:617:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    {
                    // InternalDsl.g:617:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    // InternalDsl.g:618:3: ( rule__CompareElement__Group_1_3__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_3()); 
                    // InternalDsl.g:619:3: ( rule__CompareElement__Group_1_3__0 )
                    // InternalDsl.g:619:4: rule__CompareElement__Group_1_3__0
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
    // InternalDsl.g:627:1: rule__PlusMinusElement__Alternatives_1 : ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) );
    public final void rule__PlusMinusElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:631:1: ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) )
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
                    // InternalDsl.g:632:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:632:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    // InternalDsl.g:633:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:634:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    // InternalDsl.g:634:4: rule__PlusMinusElement__Group_1_0__0
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
                    // InternalDsl.g:638:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:638:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    // InternalDsl.g:639:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:640:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    // InternalDsl.g:640:4: rule__PlusMinusElement__Group_1_1__0
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
    // InternalDsl.g:648:1: rule__MultiplicationDivisionElement__Alternatives_1 : ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) );
    public final void rule__MultiplicationDivisionElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:652:1: ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) )
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
                    // InternalDsl.g:653:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:653:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    // InternalDsl.g:654:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:655:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    // InternalDsl.g:655:4: rule__MultiplicationDivisionElement__Group_1_0__0
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
                    // InternalDsl.g:659:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:659:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    // InternalDsl.g:660:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:661:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    // InternalDsl.g:661:4: rule__MultiplicationDivisionElement__Group_1_1__0
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
                    // InternalDsl.g:665:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:665:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    // InternalDsl.g:666:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:667:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    // InternalDsl.g:667:4: rule__MultiplicationDivisionElement__Group_1_2__0
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
    // InternalDsl.g:675:1: rule__UnaryElement__Alternatives : ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) );
    public final void rule__UnaryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:679:1: ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) )
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
                    // InternalDsl.g:680:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    {
                    // InternalDsl.g:680:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    // InternalDsl.g:681:3: ( rule__UnaryElement__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_0()); 
                    // InternalDsl.g:682:3: ( rule__UnaryElement__Group_0__0 )
                    // InternalDsl.g:682:4: rule__UnaryElement__Group_0__0
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
                    // InternalDsl.g:686:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    {
                    // InternalDsl.g:686:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    // InternalDsl.g:687:3: ( rule__UnaryElement__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_1()); 
                    // InternalDsl.g:688:3: ( rule__UnaryElement__Group_1__0 )
                    // InternalDsl.g:688:4: rule__UnaryElement__Group_1__0
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
                    // InternalDsl.g:692:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    {
                    // InternalDsl.g:692:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    // InternalDsl.g:693:3: ( rule__UnaryElement__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_2()); 
                    // InternalDsl.g:694:3: ( rule__UnaryElement__Group_2__0 )
                    // InternalDsl.g:694:4: rule__UnaryElement__Group_2__0
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
                    // InternalDsl.g:698:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    {
                    // InternalDsl.g:698:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    // InternalDsl.g:699:3: ( rule__UnaryElement__Group_3__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_3()); 
                    // InternalDsl.g:700:3: ( rule__UnaryElement__Group_3__0 )
                    // InternalDsl.g:700:4: rule__UnaryElement__Group_3__0
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
                    // InternalDsl.g:704:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    {
                    // InternalDsl.g:704:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    // InternalDsl.g:705:3: ( rule__UnaryElement__Group_4__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_4()); 
                    // InternalDsl.g:706:3: ( rule__UnaryElement__Group_4__0 )
                    // InternalDsl.g:706:4: rule__UnaryElement__Group_4__0
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
    // InternalDsl.g:714:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:718:1: ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==42) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||(LA7_1>=RULE_ID && LA7_1<=RULE_BOOLEAN)||(LA7_1>=17 && LA7_1<=19)||LA7_1==25||(LA7_1>=27 && LA7_1<=41)) ) {
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
                    // InternalDsl.g:719:2: ( RULE_INT )
                    {
                    // InternalDsl.g:719:2: ( RULE_INT )
                    // InternalDsl.g:720:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:725:2: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // InternalDsl.g:725:2: ( ( rule__NUMBER__Group_1__0 ) )
                    // InternalDsl.g:726:3: ( rule__NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    // InternalDsl.g:727:3: ( rule__NUMBER__Group_1__0 )
                    // InternalDsl.g:727:4: rule__NUMBER__Group_1__0
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
    // InternalDsl.g:735:1: rule__RunTimeModel__Group__0 : rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 ;
    public final void rule__RunTimeModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:739:1: ( rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 )
            // InternalDsl.g:740:2: rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1
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
    // InternalDsl.g:747:1: rule__RunTimeModel__Group__0__Impl : ( () ) ;
    public final void rule__RunTimeModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:751:1: ( ( () ) )
            // InternalDsl.g:752:1: ( () )
            {
            // InternalDsl.g:752:1: ( () )
            // InternalDsl.g:753:2: ()
            {
             before(grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0()); 
            // InternalDsl.g:754:2: ()
            // InternalDsl.g:754:3: 
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
    // InternalDsl.g:762:1: rule__RunTimeModel__Group__1 : rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 ;
    public final void rule__RunTimeModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:1: ( rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 )
            // InternalDsl.g:767:2: rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2
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
    // InternalDsl.g:774:1: rule__RunTimeModel__Group__1__Impl : ( ( rule__RunTimeModel__EnvDataAssignment_1 )* ) ;
    public final void rule__RunTimeModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:778:1: ( ( ( rule__RunTimeModel__EnvDataAssignment_1 )* ) )
            // InternalDsl.g:779:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 )* )
            {
            // InternalDsl.g:779:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 )* )
            // InternalDsl.g:780:2: ( rule__RunTimeModel__EnvDataAssignment_1 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getEnvDataAssignment_1()); 
            // InternalDsl.g:781:2: ( rule__RunTimeModel__EnvDataAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:781:3: rule__RunTimeModel__EnvDataAssignment_1
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
    // InternalDsl.g:789:1: rule__RunTimeModel__Group__2 : rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3 ;
    public final void rule__RunTimeModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:793:1: ( rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3 )
            // InternalDsl.g:794:2: rule__RunTimeModel__Group__2__Impl rule__RunTimeModel__Group__3
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
    // InternalDsl.g:801:1: rule__RunTimeModel__Group__2__Impl : ( ( rule__RunTimeModel__AppDataAssignment_2 )* ) ;
    public final void rule__RunTimeModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:805:1: ( ( ( rule__RunTimeModel__AppDataAssignment_2 )* ) )
            // InternalDsl.g:806:1: ( ( rule__RunTimeModel__AppDataAssignment_2 )* )
            {
            // InternalDsl.g:806:1: ( ( rule__RunTimeModel__AppDataAssignment_2 )* )
            // InternalDsl.g:807:2: ( rule__RunTimeModel__AppDataAssignment_2 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAssignment_2()); 
            // InternalDsl.g:808:2: ( rule__RunTimeModel__AppDataAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:808:3: rule__RunTimeModel__AppDataAssignment_2
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
    // InternalDsl.g:816:1: rule__RunTimeModel__Group__3 : rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4 ;
    public final void rule__RunTimeModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:820:1: ( rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4 )
            // InternalDsl.g:821:2: rule__RunTimeModel__Group__3__Impl rule__RunTimeModel__Group__4
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
    // InternalDsl.g:828:1: rule__RunTimeModel__Group__3__Impl : ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* ) ;
    public final void rule__RunTimeModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:832:1: ( ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* ) )
            // InternalDsl.g:833:1: ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* )
            {
            // InternalDsl.g:833:1: ( ( rule__RunTimeModel__ServicesDataAssignment_3 )* )
            // InternalDsl.g:834:2: ( rule__RunTimeModel__ServicesDataAssignment_3 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getServicesDataAssignment_3()); 
            // InternalDsl.g:835:2: ( rule__RunTimeModel__ServicesDataAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:835:3: rule__RunTimeModel__ServicesDataAssignment_3
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
    // InternalDsl.g:843:1: rule__RunTimeModel__Group__4 : rule__RunTimeModel__Group__4__Impl rule__RunTimeModel__Group__5 ;
    public final void rule__RunTimeModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:847:1: ( rule__RunTimeModel__Group__4__Impl rule__RunTimeModel__Group__5 )
            // InternalDsl.g:848:2: rule__RunTimeModel__Group__4__Impl rule__RunTimeModel__Group__5
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
    // InternalDsl.g:855:1: rule__RunTimeModel__Group__4__Impl : ( 'ConceptToCodeMappings' ) ;
    public final void rule__RunTimeModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:859:1: ( ( 'ConceptToCodeMappings' ) )
            // InternalDsl.g:860:1: ( 'ConceptToCodeMappings' )
            {
            // InternalDsl.g:860:1: ( 'ConceptToCodeMappings' )
            // InternalDsl.g:861:2: 'ConceptToCodeMappings'
            {
             before(grammarAccess.getRunTimeModelAccess().getConceptToCodeMappingsKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRunTimeModelAccess().getConceptToCodeMappingsKeyword_4()); 

            }


            }

        }
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
    // InternalDsl.g:870:1: rule__RunTimeModel__Group__5 : rule__RunTimeModel__Group__5__Impl rule__RunTimeModel__Group__6 ;
    public final void rule__RunTimeModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( rule__RunTimeModel__Group__5__Impl rule__RunTimeModel__Group__6 )
            // InternalDsl.g:875:2: rule__RunTimeModel__Group__5__Impl rule__RunTimeModel__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:882:1: rule__RunTimeModel__Group__5__Impl : ( ruleLBRACE ) ;
    public final void rule__RunTimeModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:886:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:887:1: ( ruleLBRACE )
            {
            // InternalDsl.g:887:1: ( ruleLBRACE )
            // InternalDsl.g:888:2: ruleLBRACE
            {
             before(grammarAccess.getRunTimeModelAccess().getLBRACEParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getLBRACEParserRuleCall_5()); 

            }


            }

        }
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
    // InternalDsl.g:897:1: rule__RunTimeModel__Group__6 : rule__RunTimeModel__Group__6__Impl rule__RunTimeModel__Group__7 ;
    public final void rule__RunTimeModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:901:1: ( rule__RunTimeModel__Group__6__Impl rule__RunTimeModel__Group__7 )
            // InternalDsl.g:902:2: rule__RunTimeModel__Group__6__Impl rule__RunTimeModel__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__RunTimeModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__7();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:909:1: rule__RunTimeModel__Group__6__Impl : ( ( rule__RunTimeModel__MappingPairsAssignment_6 )* ) ;
    public final void rule__RunTimeModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( ( ( rule__RunTimeModel__MappingPairsAssignment_6 )* ) )
            // InternalDsl.g:914:1: ( ( rule__RunTimeModel__MappingPairsAssignment_6 )* )
            {
            // InternalDsl.g:914:1: ( ( rule__RunTimeModel__MappingPairsAssignment_6 )* )
            // InternalDsl.g:915:2: ( rule__RunTimeModel__MappingPairsAssignment_6 )*
            {
             before(grammarAccess.getRunTimeModelAccess().getMappingPairsAssignment_6()); 
            // InternalDsl.g:916:2: ( rule__RunTimeModel__MappingPairsAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:916:3: rule__RunTimeModel__MappingPairsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RunTimeModel__MappingPairsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRunTimeModelAccess().getMappingPairsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RunTimeModel__Group__7"
    // InternalDsl.g:924:1: rule__RunTimeModel__Group__7 : rule__RunTimeModel__Group__7__Impl ;
    public final void rule__RunTimeModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( rule__RunTimeModel__Group__7__Impl )
            // InternalDsl.g:929:2: rule__RunTimeModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__7"


    // $ANTLR start "rule__RunTimeModel__Group__7__Impl"
    // InternalDsl.g:935:1: rule__RunTimeModel__Group__7__Impl : ( ruleRBRACE ) ;
    public final void rule__RunTimeModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:939:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:940:1: ( ruleRBRACE )
            {
            // InternalDsl.g:940:1: ( ruleRBRACE )
            // InternalDsl.g:941:2: ruleRBRACE
            {
             before(grammarAccess.getRunTimeModelAccess().getRBRACEParserRuleCall_7()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getRBRACEParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__7__Impl"


    // $ANTLR start "rule__AppMetaData__Group__0"
    // InternalDsl.g:951:1: rule__AppMetaData__Group__0 : rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 ;
    public final void rule__AppMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:955:1: ( rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 )
            // InternalDsl.g:956:2: rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:963:1: rule__AppMetaData__Group__0__Impl : ( 'AppMeta' ) ;
    public final void rule__AppMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( ( 'AppMeta' ) )
            // InternalDsl.g:968:1: ( 'AppMeta' )
            {
            // InternalDsl.g:968:1: ( 'AppMeta' )
            // InternalDsl.g:969:2: 'AppMeta'
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
    // InternalDsl.g:978:1: rule__AppMetaData__Group__1 : rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 ;
    public final void rule__AppMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:982:1: ( rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 )
            // InternalDsl.g:983:2: rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:990:1: rule__AppMetaData__Group__1__Impl : ( ( rule__AppMetaData__AppIDAssignment_1 ) ) ;
    public final void rule__AppMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:994:1: ( ( ( rule__AppMetaData__AppIDAssignment_1 ) ) )
            // InternalDsl.g:995:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            {
            // InternalDsl.g:995:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            // InternalDsl.g:996:2: ( rule__AppMetaData__AppIDAssignment_1 )
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 
            // InternalDsl.g:997:2: ( rule__AppMetaData__AppIDAssignment_1 )
            // InternalDsl.g:997:3: rule__AppMetaData__AppIDAssignment_1
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
    // InternalDsl.g:1005:1: rule__AppMetaData__Group__2 : rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 ;
    public final void rule__AppMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1009:1: ( rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 )
            // InternalDsl.g:1010:2: rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1017:1: rule__AppMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__AppMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1021:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:1022:1: ( ruleLBRACE )
            {
            // InternalDsl.g:1022:1: ( ruleLBRACE )
            // InternalDsl.g:1023:2: ruleLBRACE
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
    // InternalDsl.g:1032:1: rule__AppMetaData__Group__3 : rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 ;
    public final void rule__AppMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1036:1: ( rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 )
            // InternalDsl.g:1037:2: rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1044:1: rule__AppMetaData__Group__3__Impl : ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) ;
    public final void rule__AppMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( ( ( rule__AppMetaData__SpecificationsAssignment_3 )* ) )
            // InternalDsl.g:1049:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            {
            // InternalDsl.g:1049:1: ( ( rule__AppMetaData__SpecificationsAssignment_3 )* )
            // InternalDsl.g:1050:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_3()); 
            // InternalDsl.g:1051:2: ( rule__AppMetaData__SpecificationsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1051:3: rule__AppMetaData__SpecificationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1059:1: rule__AppMetaData__Group__4 : rule__AppMetaData__Group__4__Impl ;
    public final void rule__AppMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1063:1: ( rule__AppMetaData__Group__4__Impl )
            // InternalDsl.g:1064:2: rule__AppMetaData__Group__4__Impl
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
    // InternalDsl.g:1070:1: rule__AppMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__AppMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1074:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:1075:1: ( ruleRBRACE )
            {
            // InternalDsl.g:1075:1: ( ruleRBRACE )
            // InternalDsl.g:1076:2: ruleRBRACE
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
    // InternalDsl.g:1086:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1090:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalDsl.g:1091:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1098:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__SpecIDAssignment_0 )? ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1102:1: ( ( ( rule__Specification__SpecIDAssignment_0 )? ) )
            // InternalDsl.g:1103:1: ( ( rule__Specification__SpecIDAssignment_0 )? )
            {
            // InternalDsl.g:1103:1: ( ( rule__Specification__SpecIDAssignment_0 )? )
            // InternalDsl.g:1104:2: ( rule__Specification__SpecIDAssignment_0 )?
            {
             before(grammarAccess.getSpecificationAccess().getSpecIDAssignment_0()); 
            // InternalDsl.g:1105:2: ( rule__Specification__SpecIDAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1105:3: rule__Specification__SpecIDAssignment_0
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
    // InternalDsl.g:1113:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1117:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalDsl.g:1118:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1125:1: rule__Specification__Group__1__Impl : ( 'on' ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( ( 'on' ) )
            // InternalDsl.g:1130:1: ( 'on' )
            {
            // InternalDsl.g:1130:1: ( 'on' )
            // InternalDsl.g:1131:2: 'on'
            {
             before(grammarAccess.getSpecificationAccess().getOnKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1140:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1144:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalDsl.g:1145:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1152:1: rule__Specification__Group__2__Impl : ( ( rule__Specification__TriggerAssignment_2 )* ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1156:1: ( ( ( rule__Specification__TriggerAssignment_2 )* ) )
            // InternalDsl.g:1157:1: ( ( rule__Specification__TriggerAssignment_2 )* )
            {
            // InternalDsl.g:1157:1: ( ( rule__Specification__TriggerAssignment_2 )* )
            // InternalDsl.g:1158:2: ( rule__Specification__TriggerAssignment_2 )*
            {
             before(grammarAccess.getSpecificationAccess().getTriggerAssignment_2()); 
            // InternalDsl.g:1159:2: ( rule__Specification__TriggerAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_BOOLEAN)||LA14_0==27||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1159:3: rule__Specification__TriggerAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1167:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl rule__Specification__Group__4 ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1171:1: ( rule__Specification__Group__3__Impl rule__Specification__Group__4 )
            // InternalDsl.g:1172:2: rule__Specification__Group__3__Impl rule__Specification__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1179:1: rule__Specification__Group__3__Impl : ( 'if' ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( ( 'if' ) )
            // InternalDsl.g:1184:1: ( 'if' )
            {
            // InternalDsl.g:1184:1: ( 'if' )
            // InternalDsl.g:1185:2: 'if'
            {
             before(grammarAccess.getSpecificationAccess().getIfKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1194:1: rule__Specification__Group__4 : rule__Specification__Group__4__Impl rule__Specification__Group__5 ;
    public final void rule__Specification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1198:1: ( rule__Specification__Group__4__Impl rule__Specification__Group__5 )
            // InternalDsl.g:1199:2: rule__Specification__Group__4__Impl rule__Specification__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1206:1: rule__Specification__Group__4__Impl : ( ( rule__Specification__ConditionAssignment_4 )* ) ;
    public final void rule__Specification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( ( ( rule__Specification__ConditionAssignment_4 )* ) )
            // InternalDsl.g:1211:1: ( ( rule__Specification__ConditionAssignment_4 )* )
            {
            // InternalDsl.g:1211:1: ( ( rule__Specification__ConditionAssignment_4 )* )
            // InternalDsl.g:1212:2: ( rule__Specification__ConditionAssignment_4 )*
            {
             before(grammarAccess.getSpecificationAccess().getConditionAssignment_4()); 
            // InternalDsl.g:1213:2: ( rule__Specification__ConditionAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_BOOLEAN)||LA15_0==27||LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1213:3: rule__Specification__ConditionAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1221:1: rule__Specification__Group__5 : rule__Specification__Group__5__Impl rule__Specification__Group__6 ;
    public final void rule__Specification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1225:1: ( rule__Specification__Group__5__Impl rule__Specification__Group__6 )
            // InternalDsl.g:1226:2: rule__Specification__Group__5__Impl rule__Specification__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1233:1: rule__Specification__Group__5__Impl : ( 'do' ) ;
    public final void rule__Specification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1237:1: ( ( 'do' ) )
            // InternalDsl.g:1238:1: ( 'do' )
            {
            // InternalDsl.g:1238:1: ( 'do' )
            // InternalDsl.g:1239:2: 'do'
            {
             before(grammarAccess.getSpecificationAccess().getDoKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:1248:1: rule__Specification__Group__6 : rule__Specification__Group__6__Impl rule__Specification__Group__7 ;
    public final void rule__Specification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1252:1: ( rule__Specification__Group__6__Impl rule__Specification__Group__7 )
            // InternalDsl.g:1253:2: rule__Specification__Group__6__Impl rule__Specification__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1260:1: rule__Specification__Group__6__Impl : ( ( rule__Specification__ActionAssignment_6 ) ) ;
    public final void rule__Specification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( ( ( rule__Specification__ActionAssignment_6 ) ) )
            // InternalDsl.g:1265:1: ( ( rule__Specification__ActionAssignment_6 ) )
            {
            // InternalDsl.g:1265:1: ( ( rule__Specification__ActionAssignment_6 ) )
            // InternalDsl.g:1266:2: ( rule__Specification__ActionAssignment_6 )
            {
             before(grammarAccess.getSpecificationAccess().getActionAssignment_6()); 
            // InternalDsl.g:1267:2: ( rule__Specification__ActionAssignment_6 )
            // InternalDsl.g:1267:3: rule__Specification__ActionAssignment_6
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
    // InternalDsl.g:1275:1: rule__Specification__Group__7 : rule__Specification__Group__7__Impl ;
    public final void rule__Specification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( rule__Specification__Group__7__Impl )
            // InternalDsl.g:1280:2: rule__Specification__Group__7__Impl
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
    // InternalDsl.g:1286:1: rule__Specification__Group__7__Impl : ( ( rule__Specification__Group_7__0 )* ) ;
    public final void rule__Specification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1290:1: ( ( ( rule__Specification__Group_7__0 )* ) )
            // InternalDsl.g:1291:1: ( ( rule__Specification__Group_7__0 )* )
            {
            // InternalDsl.g:1291:1: ( ( rule__Specification__Group_7__0 )* )
            // InternalDsl.g:1292:2: ( rule__Specification__Group_7__0 )*
            {
             before(grammarAccess.getSpecificationAccess().getGroup_7()); 
            // InternalDsl.g:1293:2: ( rule__Specification__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1293:3: rule__Specification__Group_7__0
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1302:1: rule__Specification__Group_7__0 : rule__Specification__Group_7__0__Impl rule__Specification__Group_7__1 ;
    public final void rule__Specification__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1306:1: ( rule__Specification__Group_7__0__Impl rule__Specification__Group_7__1 )
            // InternalDsl.g:1307:2: rule__Specification__Group_7__0__Impl rule__Specification__Group_7__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1314:1: rule__Specification__Group_7__0__Impl : ( 'and' ) ;
    public final void rule__Specification__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( ( 'and' ) )
            // InternalDsl.g:1319:1: ( 'and' )
            {
            // InternalDsl.g:1319:1: ( 'and' )
            // InternalDsl.g:1320:2: 'and'
            {
             before(grammarAccess.getSpecificationAccess().getAndKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDsl.g:1329:1: rule__Specification__Group_7__1 : rule__Specification__Group_7__1__Impl ;
    public final void rule__Specification__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1333:1: ( rule__Specification__Group_7__1__Impl )
            // InternalDsl.g:1334:2: rule__Specification__Group_7__1__Impl
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
    // InternalDsl.g:1340:1: rule__Specification__Group_7__1__Impl : ( ( rule__Specification__ActionAssignment_7_1 ) ) ;
    public final void rule__Specification__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1344:1: ( ( ( rule__Specification__ActionAssignment_7_1 ) ) )
            // InternalDsl.g:1345:1: ( ( rule__Specification__ActionAssignment_7_1 ) )
            {
            // InternalDsl.g:1345:1: ( ( rule__Specification__ActionAssignment_7_1 ) )
            // InternalDsl.g:1346:2: ( rule__Specification__ActionAssignment_7_1 )
            {
             before(grammarAccess.getSpecificationAccess().getActionAssignment_7_1()); 
            // InternalDsl.g:1347:2: ( rule__Specification__ActionAssignment_7_1 )
            // InternalDsl.g:1347:3: rule__Specification__ActionAssignment_7_1
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
    // InternalDsl.g:1356:1: rule__EnvironmentMetaData__Group__0 : rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 ;
    public final void rule__EnvironmentMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1360:1: ( rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 )
            // InternalDsl.g:1361:2: rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1368:1: rule__EnvironmentMetaData__Group__0__Impl : ( () ) ;
    public final void rule__EnvironmentMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( ( () ) )
            // InternalDsl.g:1373:1: ( () )
            {
            // InternalDsl.g:1373:1: ( () )
            // InternalDsl.g:1374:2: ()
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0()); 
            // InternalDsl.g:1375:2: ()
            // InternalDsl.g:1375:3: 
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
    // InternalDsl.g:1383:1: rule__EnvironmentMetaData__Group__1 : rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 ;
    public final void rule__EnvironmentMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 )
            // InternalDsl.g:1388:2: rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:1395:1: rule__EnvironmentMetaData__Group__1__Impl : ( 'EnvironmentMetaData' ) ;
    public final void rule__EnvironmentMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( ( 'EnvironmentMetaData' ) )
            // InternalDsl.g:1400:1: ( 'EnvironmentMetaData' )
            {
            // InternalDsl.g:1400:1: ( 'EnvironmentMetaData' )
            // InternalDsl.g:1401:2: 'EnvironmentMetaData'
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
    // InternalDsl.g:1410:1: rule__EnvironmentMetaData__Group__2 : rule__EnvironmentMetaData__Group__2__Impl ;
    public final void rule__EnvironmentMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( rule__EnvironmentMetaData__Group__2__Impl )
            // InternalDsl.g:1415:2: rule__EnvironmentMetaData__Group__2__Impl
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
    // InternalDsl.g:1421:1: rule__EnvironmentMetaData__Group__2__Impl : ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* ) ;
    public final void rule__EnvironmentMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1425:1: ( ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* ) )
            // InternalDsl.g:1426:1: ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* )
            {
            // InternalDsl.g:1426:1: ( ( rule__EnvironmentMetaData__ResourcesAssignment_2 )* )
            // InternalDsl.g:1427:2: ( rule__EnvironmentMetaData__ResourcesAssignment_2 )*
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_2()); 
            // InternalDsl.g:1428:2: ( rule__EnvironmentMetaData__ResourcesAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1428:3: rule__EnvironmentMetaData__ResourcesAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EnvironmentMetaData__ResourcesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "rule__ServiceMetaData__Group__0"
    // InternalDsl.g:1437:1: rule__ServiceMetaData__Group__0 : rule__ServiceMetaData__Group__0__Impl rule__ServiceMetaData__Group__1 ;
    public final void rule__ServiceMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1441:1: ( rule__ServiceMetaData__Group__0__Impl rule__ServiceMetaData__Group__1 )
            // InternalDsl.g:1442:2: rule__ServiceMetaData__Group__0__Impl rule__ServiceMetaData__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1449:1: rule__ServiceMetaData__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1453:1: ( ( 'service' ) )
            // InternalDsl.g:1454:1: ( 'service' )
            {
            // InternalDsl.g:1454:1: ( 'service' )
            // InternalDsl.g:1455:2: 'service'
            {
             before(grammarAccess.getServiceMetaDataAccess().getServiceKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1464:1: rule__ServiceMetaData__Group__1 : rule__ServiceMetaData__Group__1__Impl ;
    public final void rule__ServiceMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1468:1: ( rule__ServiceMetaData__Group__1__Impl )
            // InternalDsl.g:1469:2: rule__ServiceMetaData__Group__1__Impl
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
    // InternalDsl.g:1475:1: rule__ServiceMetaData__Group__1__Impl : ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) ) ;
    public final void rule__ServiceMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1479:1: ( ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) ) )
            // InternalDsl.g:1480:1: ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) )
            {
            // InternalDsl.g:1480:1: ( ( rule__ServiceMetaData__ServiceIDAssignment_1 ) )
            // InternalDsl.g:1481:2: ( rule__ServiceMetaData__ServiceIDAssignment_1 )
            {
             before(grammarAccess.getServiceMetaDataAccess().getServiceIDAssignment_1()); 
            // InternalDsl.g:1482:2: ( rule__ServiceMetaData__ServiceIDAssignment_1 )
            // InternalDsl.g:1482:3: rule__ServiceMetaData__ServiceIDAssignment_1
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
    // InternalDsl.g:1491:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1495:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalDsl.g:1496:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1503:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( ( 'resource' ) )
            // InternalDsl.g:1508:1: ( 'resource' )
            {
            // InternalDsl.g:1508:1: ( 'resource' )
            // InternalDsl.g:1509:2: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1518:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalDsl.g:1523:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDsl.g:1530:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1534:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalDsl.g:1535:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalDsl.g:1535:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalDsl.g:1536:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalDsl.g:1537:2: ( rule__Resource__NameAssignment_1 )
            // InternalDsl.g:1537:3: rule__Resource__NameAssignment_1
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
    // InternalDsl.g:1545:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1549:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalDsl.g:1550:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:1557:1: rule__Resource__Group__2__Impl : ( 'can' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1561:1: ( ( 'can' ) )
            // InternalDsl.g:1562:1: ( 'can' )
            {
            // InternalDsl.g:1562:1: ( 'can' )
            // InternalDsl.g:1563:2: 'can'
            {
             before(grammarAccess.getResourceAccess().getCanKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1572:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalDsl.g:1577:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:1584:1: rule__Resource__Group__3__Impl : ( 'be' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( ( 'be' ) )
            // InternalDsl.g:1589:1: ( 'be' )
            {
            // InternalDsl.g:1589:1: ( 'be' )
            // InternalDsl.g:1590:2: 'be'
            {
             before(grammarAccess.getResourceAccess().getBeKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDsl.g:1599:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1603:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalDsl.g:1604:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:1611:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__StatesAssignment_4 ) ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( ( ( rule__Resource__StatesAssignment_4 ) ) )
            // InternalDsl.g:1616:1: ( ( rule__Resource__StatesAssignment_4 ) )
            {
            // InternalDsl.g:1616:1: ( ( rule__Resource__StatesAssignment_4 ) )
            // InternalDsl.g:1617:2: ( rule__Resource__StatesAssignment_4 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_4()); 
            // InternalDsl.g:1618:2: ( rule__Resource__StatesAssignment_4 )
            // InternalDsl.g:1618:3: rule__Resource__StatesAssignment_4
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
    // InternalDsl.g:1626:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1630:1: ( rule__Resource__Group__5__Impl )
            // InternalDsl.g:1631:2: rule__Resource__Group__5__Impl
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
    // InternalDsl.g:1637:1: rule__Resource__Group__5__Impl : ( ( rule__Resource__Group_5__0 )* ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1641:1: ( ( ( rule__Resource__Group_5__0 )* ) )
            // InternalDsl.g:1642:1: ( ( rule__Resource__Group_5__0 )* )
            {
            // InternalDsl.g:1642:1: ( ( rule__Resource__Group_5__0 )* )
            // InternalDsl.g:1643:2: ( rule__Resource__Group_5__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_5()); 
            // InternalDsl.g:1644:2: ( rule__Resource__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1644:3: rule__Resource__Group_5__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalDsl.g:1653:1: rule__Resource__Group_5__0 : rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 ;
    public final void rule__Resource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1657:1: ( rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 )
            // InternalDsl.g:1658:2: rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:1665:1: rule__Resource__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( ( ',' ) )
            // InternalDsl.g:1670:1: ( ',' )
            {
            // InternalDsl.g:1670:1: ( ',' )
            // InternalDsl.g:1671:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1680:1: rule__Resource__Group_5__1 : rule__Resource__Group_5__1__Impl ;
    public final void rule__Resource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1684:1: ( rule__Resource__Group_5__1__Impl )
            // InternalDsl.g:1685:2: rule__Resource__Group_5__1__Impl
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
    // InternalDsl.g:1691:1: rule__Resource__Group_5__1__Impl : ( ( rule__Resource__StatesAssignment_5_1 ) ) ;
    public final void rule__Resource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1695:1: ( ( ( rule__Resource__StatesAssignment_5_1 ) ) )
            // InternalDsl.g:1696:1: ( ( rule__Resource__StatesAssignment_5_1 ) )
            {
            // InternalDsl.g:1696:1: ( ( rule__Resource__StatesAssignment_5_1 ) )
            // InternalDsl.g:1697:2: ( rule__Resource__StatesAssignment_5_1 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_5_1()); 
            // InternalDsl.g:1698:2: ( rule__Resource__StatesAssignment_5_1 )
            // InternalDsl.g:1698:3: rule__Resource__StatesAssignment_5_1
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
    // InternalDsl.g:1707:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1711:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalDsl.g:1712:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:1719:1: rule__Action__Group__0__Impl : ( ( rule__Action__ResourceAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( ( ( rule__Action__ResourceAssignment_0 ) ) )
            // InternalDsl.g:1724:1: ( ( rule__Action__ResourceAssignment_0 ) )
            {
            // InternalDsl.g:1724:1: ( ( rule__Action__ResourceAssignment_0 ) )
            // InternalDsl.g:1725:2: ( rule__Action__ResourceAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getResourceAssignment_0()); 
            // InternalDsl.g:1726:2: ( rule__Action__ResourceAssignment_0 )
            // InternalDsl.g:1726:3: rule__Action__ResourceAssignment_0
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
    // InternalDsl.g:1734:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1738:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalDsl.g:1739:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:1746:1: rule__Action__Group__1__Impl : ( ':=' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1750:1: ( ( ':=' ) )
            // InternalDsl.g:1751:1: ( ':=' )
            {
            // InternalDsl.g:1751:1: ( ':=' )
            // InternalDsl.g:1752:2: ':='
            {
             before(grammarAccess.getActionAccess().getColonEqualsSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:1761:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1765:1: ( rule__Action__Group__2__Impl )
            // InternalDsl.g:1766:2: rule__Action__Group__2__Impl
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
    // InternalDsl.g:1772:1: rule__Action__Group__2__Impl : ( ( rule__Action__StateAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1776:1: ( ( ( rule__Action__StateAssignment_2 ) ) )
            // InternalDsl.g:1777:1: ( ( rule__Action__StateAssignment_2 ) )
            {
            // InternalDsl.g:1777:1: ( ( rule__Action__StateAssignment_2 ) )
            // InternalDsl.g:1778:2: ( rule__Action__StateAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getStateAssignment_2()); 
            // InternalDsl.g:1779:2: ( rule__Action__StateAssignment_2 )
            // InternalDsl.g:1779:3: rule__Action__StateAssignment_2
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
    // InternalDsl.g:1788:1: rule__MappingPair__Group__0 : rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 ;
    public final void rule__MappingPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1792:1: ( rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 )
            // InternalDsl.g:1793:2: rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1800:1: rule__MappingPair__Group__0__Impl : ( '(' ) ;
    public final void rule__MappingPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( ( '(' ) )
            // InternalDsl.g:1805:1: ( '(' )
            {
            // InternalDsl.g:1805:1: ( '(' )
            // InternalDsl.g:1806:2: '('
            {
             before(grammarAccess.getMappingPairAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1815:1: rule__MappingPair__Group__1 : rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 ;
    public final void rule__MappingPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1819:1: ( rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 )
            // InternalDsl.g:1820:2: rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:1827:1: rule__MappingPair__Group__1__Impl : ( ( rule__MappingPair__ResourceAssignment_1 ) ) ;
    public final void rule__MappingPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1831:1: ( ( ( rule__MappingPair__ResourceAssignment_1 ) ) )
            // InternalDsl.g:1832:1: ( ( rule__MappingPair__ResourceAssignment_1 ) )
            {
            // InternalDsl.g:1832:1: ( ( rule__MappingPair__ResourceAssignment_1 ) )
            // InternalDsl.g:1833:2: ( rule__MappingPair__ResourceAssignment_1 )
            {
             before(grammarAccess.getMappingPairAccess().getResourceAssignment_1()); 
            // InternalDsl.g:1834:2: ( rule__MappingPair__ResourceAssignment_1 )
            // InternalDsl.g:1834:3: rule__MappingPair__ResourceAssignment_1
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
    // InternalDsl.g:1842:1: rule__MappingPair__Group__2 : rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 ;
    public final void rule__MappingPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1846:1: ( rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 )
            // InternalDsl.g:1847:2: rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3
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
    // InternalDsl.g:1854:1: rule__MappingPair__Group__2__Impl : ( ',' ) ;
    public final void rule__MappingPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( ( ',' ) )
            // InternalDsl.g:1859:1: ( ',' )
            {
            // InternalDsl.g:1859:1: ( ',' )
            // InternalDsl.g:1860:2: ','
            {
             before(grammarAccess.getMappingPairAccess().getCommaKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1869:1: rule__MappingPair__Group__3 : rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 ;
    public final void rule__MappingPair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1873:1: ( rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 )
            // InternalDsl.g:1874:2: rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:1881:1: rule__MappingPair__Group__3__Impl : ( ( rule__MappingPair__StateAssignment_3 ) ) ;
    public final void rule__MappingPair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1885:1: ( ( ( rule__MappingPair__StateAssignment_3 ) ) )
            // InternalDsl.g:1886:1: ( ( rule__MappingPair__StateAssignment_3 ) )
            {
            // InternalDsl.g:1886:1: ( ( rule__MappingPair__StateAssignment_3 ) )
            // InternalDsl.g:1887:2: ( rule__MappingPair__StateAssignment_3 )
            {
             before(grammarAccess.getMappingPairAccess().getStateAssignment_3()); 
            // InternalDsl.g:1888:2: ( rule__MappingPair__StateAssignment_3 )
            // InternalDsl.g:1888:3: rule__MappingPair__StateAssignment_3
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
    // InternalDsl.g:1896:1: rule__MappingPair__Group__4 : rule__MappingPair__Group__4__Impl rule__MappingPair__Group__5 ;
    public final void rule__MappingPair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1900:1: ( rule__MappingPair__Group__4__Impl rule__MappingPair__Group__5 )
            // InternalDsl.g:1901:2: rule__MappingPair__Group__4__Impl rule__MappingPair__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1908:1: rule__MappingPair__Group__4__Impl : ( ',' ) ;
    public final void rule__MappingPair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1912:1: ( ( ',' ) )
            // InternalDsl.g:1913:1: ( ',' )
            {
            // InternalDsl.g:1913:1: ( ',' )
            // InternalDsl.g:1914:2: ','
            {
             before(grammarAccess.getMappingPairAccess().getCommaKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1923:1: rule__MappingPair__Group__5 : rule__MappingPair__Group__5__Impl rule__MappingPair__Group__6 ;
    public final void rule__MappingPair__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1927:1: ( rule__MappingPair__Group__5__Impl rule__MappingPair__Group__6 )
            // InternalDsl.g:1928:2: rule__MappingPair__Group__5__Impl rule__MappingPair__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:1935:1: rule__MappingPair__Group__5__Impl : ( ( rule__MappingPair__ActionCodeAssignment_5 ) ) ;
    public final void rule__MappingPair__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1939:1: ( ( ( rule__MappingPair__ActionCodeAssignment_5 ) ) )
            // InternalDsl.g:1940:1: ( ( rule__MappingPair__ActionCodeAssignment_5 ) )
            {
            // InternalDsl.g:1940:1: ( ( rule__MappingPair__ActionCodeAssignment_5 ) )
            // InternalDsl.g:1941:2: ( rule__MappingPair__ActionCodeAssignment_5 )
            {
             before(grammarAccess.getMappingPairAccess().getActionCodeAssignment_5()); 
            // InternalDsl.g:1942:2: ( rule__MappingPair__ActionCodeAssignment_5 )
            // InternalDsl.g:1942:3: rule__MappingPair__ActionCodeAssignment_5
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
    // InternalDsl.g:1950:1: rule__MappingPair__Group__6 : rule__MappingPair__Group__6__Impl ;
    public final void rule__MappingPair__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1954:1: ( rule__MappingPair__Group__6__Impl )
            // InternalDsl.g:1955:2: rule__MappingPair__Group__6__Impl
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
    // InternalDsl.g:1961:1: rule__MappingPair__Group__6__Impl : ( ')' ) ;
    public final void rule__MappingPair__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1965:1: ( ( ')' ) )
            // InternalDsl.g:1966:1: ( ')' )
            {
            // InternalDsl.g:1966:1: ( ')' )
            // InternalDsl.g:1967:2: ')'
            {
             before(grammarAccess.getMappingPairAccess().getRightParenthesisKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1977:1: rule__OrElement__Group__0 : rule__OrElement__Group__0__Impl rule__OrElement__Group__1 ;
    public final void rule__OrElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1981:1: ( rule__OrElement__Group__0__Impl rule__OrElement__Group__1 )
            // InternalDsl.g:1982:2: rule__OrElement__Group__0__Impl rule__OrElement__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:1989:1: rule__OrElement__Group__0__Impl : ( ruleAndElement ) ;
    public final void rule__OrElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1993:1: ( ( ruleAndElement ) )
            // InternalDsl.g:1994:1: ( ruleAndElement )
            {
            // InternalDsl.g:1994:1: ( ruleAndElement )
            // InternalDsl.g:1995:2: ruleAndElement
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
    // InternalDsl.g:2004:1: rule__OrElement__Group__1 : rule__OrElement__Group__1__Impl ;
    public final void rule__OrElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( rule__OrElement__Group__1__Impl )
            // InternalDsl.g:2009:2: rule__OrElement__Group__1__Impl
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
    // InternalDsl.g:2015:1: rule__OrElement__Group__1__Impl : ( ( rule__OrElement__Group_1__0 )* ) ;
    public final void rule__OrElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2019:1: ( ( ( rule__OrElement__Group_1__0 )* ) )
            // InternalDsl.g:2020:1: ( ( rule__OrElement__Group_1__0 )* )
            {
            // InternalDsl.g:2020:1: ( ( rule__OrElement__Group_1__0 )* )
            // InternalDsl.g:2021:2: ( rule__OrElement__Group_1__0 )*
            {
             before(grammarAccess.getOrElementAccess().getGroup_1()); 
            // InternalDsl.g:2022:2: ( rule__OrElement__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2022:3: rule__OrElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__OrElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDsl.g:2031:1: rule__OrElement__Group_1__0 : rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 ;
    public final void rule__OrElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2035:1: ( rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 )
            // InternalDsl.g:2036:2: rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2043:1: rule__OrElement__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__OrElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2047:1: ( ( 'or' ) )
            // InternalDsl.g:2048:1: ( 'or' )
            {
            // InternalDsl.g:2048:1: ( 'or' )
            // InternalDsl.g:2049:2: 'or'
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
    // InternalDsl.g:2058:1: rule__OrElement__Group_1__1 : rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 ;
    public final void rule__OrElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 )
            // InternalDsl.g:2063:2: rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2070:1: rule__OrElement__Group_1__1__Impl : ( () ) ;
    public final void rule__OrElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2074:1: ( ( () ) )
            // InternalDsl.g:2075:1: ( () )
            {
            // InternalDsl.g:2075:1: ( () )
            // InternalDsl.g:2076:2: ()
            {
             before(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 
            // InternalDsl.g:2077:2: ()
            // InternalDsl.g:2077:3: 
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
    // InternalDsl.g:2085:1: rule__OrElement__Group_1__2 : rule__OrElement__Group_1__2__Impl ;
    public final void rule__OrElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2089:1: ( rule__OrElement__Group_1__2__Impl )
            // InternalDsl.g:2090:2: rule__OrElement__Group_1__2__Impl
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
    // InternalDsl.g:2096:1: rule__OrElement__Group_1__2__Impl : ( ( rule__OrElement__RightAssignment_1_2 ) ) ;
    public final void rule__OrElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2100:1: ( ( ( rule__OrElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2101:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2101:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            // InternalDsl.g:2102:2: ( rule__OrElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2103:2: ( rule__OrElement__RightAssignment_1_2 )
            // InternalDsl.g:2103:3: rule__OrElement__RightAssignment_1_2
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
    // InternalDsl.g:2112:1: rule__AndElement__Group__0 : rule__AndElement__Group__0__Impl rule__AndElement__Group__1 ;
    public final void rule__AndElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2116:1: ( rule__AndElement__Group__0__Impl rule__AndElement__Group__1 )
            // InternalDsl.g:2117:2: rule__AndElement__Group__0__Impl rule__AndElement__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:2124:1: rule__AndElement__Group__0__Impl : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2128:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:2129:1: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:2129:1: ( ruleDiffEqualElement )
            // InternalDsl.g:2130:2: ruleDiffEqualElement
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
    // InternalDsl.g:2139:1: rule__AndElement__Group__1 : rule__AndElement__Group__1__Impl ;
    public final void rule__AndElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2143:1: ( rule__AndElement__Group__1__Impl )
            // InternalDsl.g:2144:2: rule__AndElement__Group__1__Impl
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
    // InternalDsl.g:2150:1: rule__AndElement__Group__1__Impl : ( ( rule__AndElement__Group_1__0 )* ) ;
    public final void rule__AndElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2154:1: ( ( ( rule__AndElement__Group_1__0 )* ) )
            // InternalDsl.g:2155:1: ( ( rule__AndElement__Group_1__0 )* )
            {
            // InternalDsl.g:2155:1: ( ( rule__AndElement__Group_1__0 )* )
            // InternalDsl.g:2156:2: ( rule__AndElement__Group_1__0 )*
            {
             before(grammarAccess.getAndElementAccess().getGroup_1()); 
            // InternalDsl.g:2157:2: ( rule__AndElement__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2157:3: rule__AndElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AndElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDsl.g:2166:1: rule__AndElement__Group_1__0 : rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 ;
    public final void rule__AndElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2170:1: ( rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 )
            // InternalDsl.g:2171:2: rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2178:1: rule__AndElement__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__AndElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2182:1: ( ( 'and' ) )
            // InternalDsl.g:2183:1: ( 'and' )
            {
            // InternalDsl.g:2183:1: ( 'and' )
            // InternalDsl.g:2184:2: 'and'
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
    // InternalDsl.g:2193:1: rule__AndElement__Group_1__1 : rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 ;
    public final void rule__AndElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2197:1: ( rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 )
            // InternalDsl.g:2198:2: rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2205:1: rule__AndElement__Group_1__1__Impl : ( () ) ;
    public final void rule__AndElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2209:1: ( ( () ) )
            // InternalDsl.g:2210:1: ( () )
            {
            // InternalDsl.g:2210:1: ( () )
            // InternalDsl.g:2211:2: ()
            {
             before(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 
            // InternalDsl.g:2212:2: ()
            // InternalDsl.g:2212:3: 
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
    // InternalDsl.g:2220:1: rule__AndElement__Group_1__2 : rule__AndElement__Group_1__2__Impl ;
    public final void rule__AndElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2224:1: ( rule__AndElement__Group_1__2__Impl )
            // InternalDsl.g:2225:2: rule__AndElement__Group_1__2__Impl
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
    // InternalDsl.g:2231:1: rule__AndElement__Group_1__2__Impl : ( ( rule__AndElement__RightAssignment_1_2 ) ) ;
    public final void rule__AndElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2235:1: ( ( ( rule__AndElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2236:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2236:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            // InternalDsl.g:2237:2: ( rule__AndElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2238:2: ( rule__AndElement__RightAssignment_1_2 )
            // InternalDsl.g:2238:3: rule__AndElement__RightAssignment_1_2
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
    // InternalDsl.g:2247:1: rule__DiffEqualElement__Group__0 : rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 ;
    public final void rule__DiffEqualElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2251:1: ( rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 )
            // InternalDsl.g:2252:2: rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDsl.g:2259:1: rule__DiffEqualElement__Group__0__Impl : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2263:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:2264:1: ( ruleCompareElement )
            {
            // InternalDsl.g:2264:1: ( ruleCompareElement )
            // InternalDsl.g:2265:2: ruleCompareElement
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
    // InternalDsl.g:2274:1: rule__DiffEqualElement__Group__1 : rule__DiffEqualElement__Group__1__Impl ;
    public final void rule__DiffEqualElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2278:1: ( rule__DiffEqualElement__Group__1__Impl )
            // InternalDsl.g:2279:2: rule__DiffEqualElement__Group__1__Impl
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
    // InternalDsl.g:2285:1: rule__DiffEqualElement__Group__1__Impl : ( ( rule__DiffEqualElement__Alternatives_1 )* ) ;
    public final void rule__DiffEqualElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2289:1: ( ( ( rule__DiffEqualElement__Alternatives_1 )* ) )
            // InternalDsl.g:2290:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2290:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            // InternalDsl.g:2291:2: ( rule__DiffEqualElement__Alternatives_1 )*
            {
             before(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2292:2: ( rule__DiffEqualElement__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=31)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:2292:3: rule__DiffEqualElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__DiffEqualElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDsl.g:2301:1: rule__DiffEqualElement__Group_1_0__0 : rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 ;
    public final void rule__DiffEqualElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2305:1: ( rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 )
            // InternalDsl.g:2306:2: rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2313:1: rule__DiffEqualElement__Group_1_0__0__Impl : ( '!=' ) ;
    public final void rule__DiffEqualElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2317:1: ( ( '!=' ) )
            // InternalDsl.g:2318:1: ( '!=' )
            {
            // InternalDsl.g:2318:1: ( '!=' )
            // InternalDsl.g:2319:2: '!='
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
    // InternalDsl.g:2328:1: rule__DiffEqualElement__Group_1_0__1 : rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 ;
    public final void rule__DiffEqualElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2332:1: ( rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 )
            // InternalDsl.g:2333:2: rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2340:1: rule__DiffEqualElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( ( () ) )
            // InternalDsl.g:2345:1: ( () )
            {
            // InternalDsl.g:2345:1: ( () )
            // InternalDsl.g:2346:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 
            // InternalDsl.g:2347:2: ()
            // InternalDsl.g:2347:3: 
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
    // InternalDsl.g:2355:1: rule__DiffEqualElement__Group_1_0__2 : rule__DiffEqualElement__Group_1_0__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2359:1: ( rule__DiffEqualElement__Group_1_0__2__Impl )
            // InternalDsl.g:2360:2: rule__DiffEqualElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2366:1: rule__DiffEqualElement__Group_1_0__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2370:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2371:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2371:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2372:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2373:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2373:3: rule__DiffEqualElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2382:1: rule__DiffEqualElement__Group_1_1__0 : rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 ;
    public final void rule__DiffEqualElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2386:1: ( rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 )
            // InternalDsl.g:2387:2: rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2394:1: rule__DiffEqualElement__Group_1_1__0__Impl : ( '==' ) ;
    public final void rule__DiffEqualElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( ( '==' ) )
            // InternalDsl.g:2399:1: ( '==' )
            {
            // InternalDsl.g:2399:1: ( '==' )
            // InternalDsl.g:2400:2: '=='
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
    // InternalDsl.g:2409:1: rule__DiffEqualElement__Group_1_1__1 : rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 ;
    public final void rule__DiffEqualElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2413:1: ( rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 )
            // InternalDsl.g:2414:2: rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2421:1: rule__DiffEqualElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( ( () ) )
            // InternalDsl.g:2426:1: ( () )
            {
            // InternalDsl.g:2426:1: ( () )
            // InternalDsl.g:2427:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:2428:2: ()
            // InternalDsl.g:2428:3: 
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
    // InternalDsl.g:2436:1: rule__DiffEqualElement__Group_1_1__2 : rule__DiffEqualElement__Group_1_1__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2440:1: ( rule__DiffEqualElement__Group_1_1__2__Impl )
            // InternalDsl.g:2441:2: rule__DiffEqualElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2447:1: rule__DiffEqualElement__Group_1_1__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2451:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2452:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2452:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2453:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2454:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2454:3: rule__DiffEqualElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2463:1: rule__CompareElement__Group__0 : rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 ;
    public final void rule__CompareElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2467:1: ( rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 )
            // InternalDsl.g:2468:2: rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDsl.g:2475:1: rule__CompareElement__Group__0__Impl : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2480:1: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2480:1: ( rulePlusMinusElement )
            // InternalDsl.g:2481:2: rulePlusMinusElement
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
    // InternalDsl.g:2490:1: rule__CompareElement__Group__1 : rule__CompareElement__Group__1__Impl ;
    public final void rule__CompareElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2494:1: ( rule__CompareElement__Group__1__Impl )
            // InternalDsl.g:2495:2: rule__CompareElement__Group__1__Impl
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
    // InternalDsl.g:2501:1: rule__CompareElement__Group__1__Impl : ( ( rule__CompareElement__Alternatives_1 )* ) ;
    public final void rule__CompareElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2505:1: ( ( ( rule__CompareElement__Alternatives_1 )* ) )
            // InternalDsl.g:2506:1: ( ( rule__CompareElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2506:1: ( ( rule__CompareElement__Alternatives_1 )* )
            // InternalDsl.g:2507:2: ( rule__CompareElement__Alternatives_1 )*
            {
             before(grammarAccess.getCompareElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2508:2: ( rule__CompareElement__Alternatives_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=32 && LA22_0<=35)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:2508:3: rule__CompareElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__CompareElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalDsl.g:2517:1: rule__CompareElement__Group_1_0__0 : rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 ;
    public final void rule__CompareElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2521:1: ( rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 )
            // InternalDsl.g:2522:2: rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2529:1: rule__CompareElement__Group_1_0__0__Impl : ( '>' ) ;
    public final void rule__CompareElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2533:1: ( ( '>' ) )
            // InternalDsl.g:2534:1: ( '>' )
            {
            // InternalDsl.g:2534:1: ( '>' )
            // InternalDsl.g:2535:2: '>'
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
    // InternalDsl.g:2544:1: rule__CompareElement__Group_1_0__1 : rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 ;
    public final void rule__CompareElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2548:1: ( rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 )
            // InternalDsl.g:2549:2: rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2556:1: rule__CompareElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2560:1: ( ( () ) )
            // InternalDsl.g:2561:1: ( () )
            {
            // InternalDsl.g:2561:1: ( () )
            // InternalDsl.g:2562:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 
            // InternalDsl.g:2563:2: ()
            // InternalDsl.g:2563:3: 
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
    // InternalDsl.g:2571:1: rule__CompareElement__Group_1_0__2 : rule__CompareElement__Group_1_0__2__Impl ;
    public final void rule__CompareElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2575:1: ( rule__CompareElement__Group_1_0__2__Impl )
            // InternalDsl.g:2576:2: rule__CompareElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2582:1: rule__CompareElement__Group_1_0__2__Impl : ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__CompareElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2586:1: ( ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2587:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2587:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2588:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2589:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2589:3: rule__CompareElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2598:1: rule__CompareElement__Group_1_1__0 : rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 ;
    public final void rule__CompareElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2602:1: ( rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 )
            // InternalDsl.g:2603:2: rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2610:1: rule__CompareElement__Group_1_1__0__Impl : ( '>=' ) ;
    public final void rule__CompareElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2614:1: ( ( '>=' ) )
            // InternalDsl.g:2615:1: ( '>=' )
            {
            // InternalDsl.g:2615:1: ( '>=' )
            // InternalDsl.g:2616:2: '>='
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
    // InternalDsl.g:2625:1: rule__CompareElement__Group_1_1__1 : rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 ;
    public final void rule__CompareElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2629:1: ( rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 )
            // InternalDsl.g:2630:2: rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2637:1: rule__CompareElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2641:1: ( ( () ) )
            // InternalDsl.g:2642:1: ( () )
            {
            // InternalDsl.g:2642:1: ( () )
            // InternalDsl.g:2643:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:2644:2: ()
            // InternalDsl.g:2644:3: 
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
    // InternalDsl.g:2652:1: rule__CompareElement__Group_1_1__2 : rule__CompareElement__Group_1_1__2__Impl ;
    public final void rule__CompareElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2656:1: ( rule__CompareElement__Group_1_1__2__Impl )
            // InternalDsl.g:2657:2: rule__CompareElement__Group_1_1__2__Impl
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
    // InternalDsl.g:2663:1: rule__CompareElement__Group_1_1__2__Impl : ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__CompareElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2667:1: ( ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2668:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2668:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2669:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2670:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2670:3: rule__CompareElement__RightAssignment_1_1_2
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
    // InternalDsl.g:2679:1: rule__CompareElement__Group_1_2__0 : rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 ;
    public final void rule__CompareElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2683:1: ( rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 )
            // InternalDsl.g:2684:2: rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2691:1: rule__CompareElement__Group_1_2__0__Impl : ( '<' ) ;
    public final void rule__CompareElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2695:1: ( ( '<' ) )
            // InternalDsl.g:2696:1: ( '<' )
            {
            // InternalDsl.g:2696:1: ( '<' )
            // InternalDsl.g:2697:2: '<'
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
    // InternalDsl.g:2706:1: rule__CompareElement__Group_1_2__1 : rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 ;
    public final void rule__CompareElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2710:1: ( rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 )
            // InternalDsl.g:2711:2: rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2718:1: rule__CompareElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2722:1: ( ( () ) )
            // InternalDsl.g:2723:1: ( () )
            {
            // InternalDsl.g:2723:1: ( () )
            // InternalDsl.g:2724:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 
            // InternalDsl.g:2725:2: ()
            // InternalDsl.g:2725:3: 
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
    // InternalDsl.g:2733:1: rule__CompareElement__Group_1_2__2 : rule__CompareElement__Group_1_2__2__Impl ;
    public final void rule__CompareElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2737:1: ( rule__CompareElement__Group_1_2__2__Impl )
            // InternalDsl.g:2738:2: rule__CompareElement__Group_1_2__2__Impl
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
    // InternalDsl.g:2744:1: rule__CompareElement__Group_1_2__2__Impl : ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__CompareElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2748:1: ( ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:2749:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:2749:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:2750:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:2751:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            // InternalDsl.g:2751:3: rule__CompareElement__RightAssignment_1_2_2
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
    // InternalDsl.g:2760:1: rule__CompareElement__Group_1_3__0 : rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 ;
    public final void rule__CompareElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2764:1: ( rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 )
            // InternalDsl.g:2765:2: rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2772:1: rule__CompareElement__Group_1_3__0__Impl : ( '=<' ) ;
    public final void rule__CompareElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2776:1: ( ( '=<' ) )
            // InternalDsl.g:2777:1: ( '=<' )
            {
            // InternalDsl.g:2777:1: ( '=<' )
            // InternalDsl.g:2778:2: '=<'
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
    // InternalDsl.g:2787:1: rule__CompareElement__Group_1_3__1 : rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 ;
    public final void rule__CompareElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2791:1: ( rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 )
            // InternalDsl.g:2792:2: rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2799:1: rule__CompareElement__Group_1_3__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2803:1: ( ( () ) )
            // InternalDsl.g:2804:1: ( () )
            {
            // InternalDsl.g:2804:1: ( () )
            // InternalDsl.g:2805:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 
            // InternalDsl.g:2806:2: ()
            // InternalDsl.g:2806:3: 
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
    // InternalDsl.g:2814:1: rule__CompareElement__Group_1_3__2 : rule__CompareElement__Group_1_3__2__Impl ;
    public final void rule__CompareElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2818:1: ( rule__CompareElement__Group_1_3__2__Impl )
            // InternalDsl.g:2819:2: rule__CompareElement__Group_1_3__2__Impl
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
    // InternalDsl.g:2825:1: rule__CompareElement__Group_1_3__2__Impl : ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) ;
    public final void rule__CompareElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2829:1: ( ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) )
            // InternalDsl.g:2830:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            {
            // InternalDsl.g:2830:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            // InternalDsl.g:2831:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 
            // InternalDsl.g:2832:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            // InternalDsl.g:2832:3: rule__CompareElement__RightAssignment_1_3_2
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
    // InternalDsl.g:2841:1: rule__PlusMinusElement__Group__0 : rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 ;
    public final void rule__PlusMinusElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2845:1: ( rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 )
            // InternalDsl.g:2846:2: rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:2853:1: rule__PlusMinusElement__Group__0__Impl : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2857:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:2858:1: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:2858:1: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:2859:2: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:2868:1: rule__PlusMinusElement__Group__1 : rule__PlusMinusElement__Group__1__Impl ;
    public final void rule__PlusMinusElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2872:1: ( rule__PlusMinusElement__Group__1__Impl )
            // InternalDsl.g:2873:2: rule__PlusMinusElement__Group__1__Impl
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
    // InternalDsl.g:2879:1: rule__PlusMinusElement__Group__1__Impl : ( ( rule__PlusMinusElement__Alternatives_1 )* ) ;
    public final void rule__PlusMinusElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2883:1: ( ( ( rule__PlusMinusElement__Alternatives_1 )* ) )
            // InternalDsl.g:2884:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2884:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            // InternalDsl.g:2885:2: ( rule__PlusMinusElement__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2886:2: ( rule__PlusMinusElement__Alternatives_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=36 && LA23_0<=37)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:2886:3: rule__PlusMinusElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__PlusMinusElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalDsl.g:2895:1: rule__PlusMinusElement__Group_1_0__0 : rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 ;
    public final void rule__PlusMinusElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2899:1: ( rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 )
            // InternalDsl.g:2900:2: rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2907:1: rule__PlusMinusElement__Group_1_0__0__Impl : ( '+' ) ;
    public final void rule__PlusMinusElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2911:1: ( ( '+' ) )
            // InternalDsl.g:2912:1: ( '+' )
            {
            // InternalDsl.g:2912:1: ( '+' )
            // InternalDsl.g:2913:2: '+'
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
    // InternalDsl.g:2922:1: rule__PlusMinusElement__Group_1_0__1 : rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 ;
    public final void rule__PlusMinusElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2926:1: ( rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 )
            // InternalDsl.g:2927:2: rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2934:1: rule__PlusMinusElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2938:1: ( ( () ) )
            // InternalDsl.g:2939:1: ( () )
            {
            // InternalDsl.g:2939:1: ( () )
            // InternalDsl.g:2940:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 
            // InternalDsl.g:2941:2: ()
            // InternalDsl.g:2941:3: 
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
    // InternalDsl.g:2949:1: rule__PlusMinusElement__Group_1_0__2 : rule__PlusMinusElement__Group_1_0__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2953:1: ( rule__PlusMinusElement__Group_1_0__2__Impl )
            // InternalDsl.g:2954:2: rule__PlusMinusElement__Group_1_0__2__Impl
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
    // InternalDsl.g:2960:1: rule__PlusMinusElement__Group_1_0__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2964:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2965:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2965:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2966:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2967:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2967:3: rule__PlusMinusElement__RightAssignment_1_0_2
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
    // InternalDsl.g:2976:1: rule__PlusMinusElement__Group_1_1__0 : rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 ;
    public final void rule__PlusMinusElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2980:1: ( rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 )
            // InternalDsl.g:2981:2: rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2988:1: rule__PlusMinusElement__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__PlusMinusElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2992:1: ( ( '-' ) )
            // InternalDsl.g:2993:1: ( '-' )
            {
            // InternalDsl.g:2993:1: ( '-' )
            // InternalDsl.g:2994:2: '-'
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
    // InternalDsl.g:3003:1: rule__PlusMinusElement__Group_1_1__1 : rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 ;
    public final void rule__PlusMinusElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3007:1: ( rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 )
            // InternalDsl.g:3008:2: rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3015:1: rule__PlusMinusElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3019:1: ( ( () ) )
            // InternalDsl.g:3020:1: ( () )
            {
            // InternalDsl.g:3020:1: ( () )
            // InternalDsl.g:3021:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 
            // InternalDsl.g:3022:2: ()
            // InternalDsl.g:3022:3: 
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
    // InternalDsl.g:3030:1: rule__PlusMinusElement__Group_1_1__2 : rule__PlusMinusElement__Group_1_1__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3034:1: ( rule__PlusMinusElement__Group_1_1__2__Impl )
            // InternalDsl.g:3035:2: rule__PlusMinusElement__Group_1_1__2__Impl
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
    // InternalDsl.g:3041:1: rule__PlusMinusElement__Group_1_1__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3045:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3046:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3046:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3047:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3048:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3048:3: rule__PlusMinusElement__RightAssignment_1_1_2
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
    // InternalDsl.g:3057:1: rule__MultiplicationDivisionElement__Group__0 : rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 ;
    public final void rule__MultiplicationDivisionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3061:1: ( rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 )
            // InternalDsl.g:3062:2: rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDsl.g:3069:1: rule__MultiplicationDivisionElement__Group__0__Impl : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3073:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:3074:1: ( ruleUnaryElement )
            {
            // InternalDsl.g:3074:1: ( ruleUnaryElement )
            // InternalDsl.g:3075:2: ruleUnaryElement
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
    // InternalDsl.g:3084:1: rule__MultiplicationDivisionElement__Group__1 : rule__MultiplicationDivisionElement__Group__1__Impl ;
    public final void rule__MultiplicationDivisionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3088:1: ( rule__MultiplicationDivisionElement__Group__1__Impl )
            // InternalDsl.g:3089:2: rule__MultiplicationDivisionElement__Group__1__Impl
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
    // InternalDsl.g:3095:1: rule__MultiplicationDivisionElement__Group__1__Impl : ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) ;
    public final void rule__MultiplicationDivisionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3099:1: ( ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) )
            // InternalDsl.g:3100:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            {
            // InternalDsl.g:3100:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            // InternalDsl.g:3101:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 
            // InternalDsl.g:3102:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:3102:3: rule__MultiplicationDivisionElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__MultiplicationDivisionElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalDsl.g:3111:1: rule__MultiplicationDivisionElement__Group_1_0__0 : rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3115:1: ( rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 )
            // InternalDsl.g:3116:2: rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3123:1: rule__MultiplicationDivisionElement__Group_1_0__0__Impl : ( '*' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3127:1: ( ( '*' ) )
            // InternalDsl.g:3128:1: ( '*' )
            {
            // InternalDsl.g:3128:1: ( '*' )
            // InternalDsl.g:3129:2: '*'
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
    // InternalDsl.g:3138:1: rule__MultiplicationDivisionElement__Group_1_0__1 : rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3142:1: ( rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 )
            // InternalDsl.g:3143:2: rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3150:1: rule__MultiplicationDivisionElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3154:1: ( ( () ) )
            // InternalDsl.g:3155:1: ( () )
            {
            // InternalDsl.g:3155:1: ( () )
            // InternalDsl.g:3156:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 
            // InternalDsl.g:3157:2: ()
            // InternalDsl.g:3157:3: 
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
    // InternalDsl.g:3165:1: rule__MultiplicationDivisionElement__Group_1_0__2 : rule__MultiplicationDivisionElement__Group_1_0__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3169:1: ( rule__MultiplicationDivisionElement__Group_1_0__2__Impl )
            // InternalDsl.g:3170:2: rule__MultiplicationDivisionElement__Group_1_0__2__Impl
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
    // InternalDsl.g:3176:1: rule__MultiplicationDivisionElement__Group_1_0__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3180:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:3181:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:3181:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:3182:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:3183:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            // InternalDsl.g:3183:3: rule__MultiplicationDivisionElement__RightAssignment_1_0_2
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
    // InternalDsl.g:3192:1: rule__MultiplicationDivisionElement__Group_1_1__0 : rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3196:1: ( rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 )
            // InternalDsl.g:3197:2: rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3204:1: rule__MultiplicationDivisionElement__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3208:1: ( ( '/' ) )
            // InternalDsl.g:3209:1: ( '/' )
            {
            // InternalDsl.g:3209:1: ( '/' )
            // InternalDsl.g:3210:2: '/'
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
    // InternalDsl.g:3219:1: rule__MultiplicationDivisionElement__Group_1_1__1 : rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3223:1: ( rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 )
            // InternalDsl.g:3224:2: rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3231:1: rule__MultiplicationDivisionElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3235:1: ( ( () ) )
            // InternalDsl.g:3236:1: ( () )
            {
            // InternalDsl.g:3236:1: ( () )
            // InternalDsl.g:3237:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 
            // InternalDsl.g:3238:2: ()
            // InternalDsl.g:3238:3: 
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
    // InternalDsl.g:3246:1: rule__MultiplicationDivisionElement__Group_1_1__2 : rule__MultiplicationDivisionElement__Group_1_1__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3250:1: ( rule__MultiplicationDivisionElement__Group_1_1__2__Impl )
            // InternalDsl.g:3251:2: rule__MultiplicationDivisionElement__Group_1_1__2__Impl
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
    // InternalDsl.g:3257:1: rule__MultiplicationDivisionElement__Group_1_1__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3261:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3262:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3262:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3263:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3264:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3264:3: rule__MultiplicationDivisionElement__RightAssignment_1_1_2
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
    // InternalDsl.g:3273:1: rule__MultiplicationDivisionElement__Group_1_2__0 : rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3277:1: ( rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 )
            // InternalDsl.g:3278:2: rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3285:1: rule__MultiplicationDivisionElement__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3289:1: ( ( '%' ) )
            // InternalDsl.g:3290:1: ( '%' )
            {
            // InternalDsl.g:3290:1: ( '%' )
            // InternalDsl.g:3291:2: '%'
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
    // InternalDsl.g:3300:1: rule__MultiplicationDivisionElement__Group_1_2__1 : rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3304:1: ( rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 )
            // InternalDsl.g:3305:2: rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3312:1: rule__MultiplicationDivisionElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3316:1: ( ( () ) )
            // InternalDsl.g:3317:1: ( () )
            {
            // InternalDsl.g:3317:1: ( () )
            // InternalDsl.g:3318:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 
            // InternalDsl.g:3319:2: ()
            // InternalDsl.g:3319:3: 
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
    // InternalDsl.g:3327:1: rule__MultiplicationDivisionElement__Group_1_2__2 : rule__MultiplicationDivisionElement__Group_1_2__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3331:1: ( rule__MultiplicationDivisionElement__Group_1_2__2__Impl )
            // InternalDsl.g:3332:2: rule__MultiplicationDivisionElement__Group_1_2__2__Impl
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
    // InternalDsl.g:3338:1: rule__MultiplicationDivisionElement__Group_1_2__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3342:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:3343:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:3343:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:3344:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:3345:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            // InternalDsl.g:3345:3: rule__MultiplicationDivisionElement__RightAssignment_1_2_2
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
    // InternalDsl.g:3354:1: rule__UnaryElement__Group_0__0 : rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 ;
    public final void rule__UnaryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3358:1: ( rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 )
            // InternalDsl.g:3359:2: rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3366:1: rule__UnaryElement__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3370:1: ( ( () ) )
            // InternalDsl.g:3371:1: ( () )
            {
            // InternalDsl.g:3371:1: ( () )
            // InternalDsl.g:3372:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 
            // InternalDsl.g:3373:2: ()
            // InternalDsl.g:3373:3: 
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
    // InternalDsl.g:3381:1: rule__UnaryElement__Group_0__1 : rule__UnaryElement__Group_0__1__Impl ;
    public final void rule__UnaryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3385:1: ( rule__UnaryElement__Group_0__1__Impl )
            // InternalDsl.g:3386:2: rule__UnaryElement__Group_0__1__Impl
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
    // InternalDsl.g:3392:1: rule__UnaryElement__Group_0__1__Impl : ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) ;
    public final void rule__UnaryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3396:1: ( ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) )
            // InternalDsl.g:3397:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            {
            // InternalDsl.g:3397:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            // InternalDsl.g:3398:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 
            // InternalDsl.g:3399:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            // InternalDsl.g:3399:3: rule__UnaryElement__ValueAssignment_0_1
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
    // InternalDsl.g:3408:1: rule__UnaryElement__Group_1__0 : rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 ;
    public final void rule__UnaryElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3412:1: ( rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 )
            // InternalDsl.g:3413:2: rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:3420:1: rule__UnaryElement__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3424:1: ( ( () ) )
            // InternalDsl.g:3425:1: ( () )
            {
            // InternalDsl.g:3425:1: ( () )
            // InternalDsl.g:3426:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getString_ObjectAction_1_0()); 
            // InternalDsl.g:3427:2: ()
            // InternalDsl.g:3427:3: 
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
    // InternalDsl.g:3435:1: rule__UnaryElement__Group_1__1 : rule__UnaryElement__Group_1__1__Impl ;
    public final void rule__UnaryElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3439:1: ( rule__UnaryElement__Group_1__1__Impl )
            // InternalDsl.g:3440:2: rule__UnaryElement__Group_1__1__Impl
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
    // InternalDsl.g:3446:1: rule__UnaryElement__Group_1__1__Impl : ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) ;
    public final void rule__UnaryElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3450:1: ( ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:3451:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:3451:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            // InternalDsl.g:3452:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:3453:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            // InternalDsl.g:3453:3: rule__UnaryElement__ValueAssignment_1_1
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
    // InternalDsl.g:3462:1: rule__UnaryElement__Group_2__0 : rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 ;
    public final void rule__UnaryElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3466:1: ( rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 )
            // InternalDsl.g:3467:2: rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDsl.g:3474:1: rule__UnaryElement__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3478:1: ( ( () ) )
            // InternalDsl.g:3479:1: ( () )
            {
            // InternalDsl.g:3479:1: ( () )
            // InternalDsl.g:3480:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_2_0()); 
            // InternalDsl.g:3481:2: ()
            // InternalDsl.g:3481:3: 
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
    // InternalDsl.g:3489:1: rule__UnaryElement__Group_2__1 : rule__UnaryElement__Group_2__1__Impl ;
    public final void rule__UnaryElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3493:1: ( rule__UnaryElement__Group_2__1__Impl )
            // InternalDsl.g:3494:2: rule__UnaryElement__Group_2__1__Impl
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
    // InternalDsl.g:3500:1: rule__UnaryElement__Group_2__1__Impl : ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) ;
    public final void rule__UnaryElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3504:1: ( ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:3505:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:3505:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            // InternalDsl.g:3506:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:3507:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            // InternalDsl.g:3507:3: rule__UnaryElement__ValueAssignment_2_1
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
    // InternalDsl.g:3516:1: rule__UnaryElement__Group_3__0 : rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 ;
    public final void rule__UnaryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3520:1: ( rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 )
            // InternalDsl.g:3521:2: rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3528:1: rule__UnaryElement__Group_3__0__Impl : ( '(' ) ;
    public final void rule__UnaryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3532:1: ( ( '(' ) )
            // InternalDsl.g:3533:1: ( '(' )
            {
            // InternalDsl.g:3533:1: ( '(' )
            // InternalDsl.g:3534:2: '('
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
    // InternalDsl.g:3543:1: rule__UnaryElement__Group_3__1 : rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 ;
    public final void rule__UnaryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3547:1: ( rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2 )
            // InternalDsl.g:3548:2: rule__UnaryElement__Group_3__1__Impl rule__UnaryElement__Group_3__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:3555:1: rule__UnaryElement__Group_3__1__Impl : ( ruleOrElement ) ;
    public final void rule__UnaryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3559:1: ( ( ruleOrElement ) )
            // InternalDsl.g:3560:1: ( ruleOrElement )
            {
            // InternalDsl.g:3560:1: ( ruleOrElement )
            // InternalDsl.g:3561:2: ruleOrElement
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
    // InternalDsl.g:3570:1: rule__UnaryElement__Group_3__2 : rule__UnaryElement__Group_3__2__Impl ;
    public final void rule__UnaryElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3574:1: ( rule__UnaryElement__Group_3__2__Impl )
            // InternalDsl.g:3575:2: rule__UnaryElement__Group_3__2__Impl
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
    // InternalDsl.g:3581:1: rule__UnaryElement__Group_3__2__Impl : ( ')' ) ;
    public final void rule__UnaryElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3585:1: ( ( ')' ) )
            // InternalDsl.g:3586:1: ( ')' )
            {
            // InternalDsl.g:3586:1: ( ')' )
            // InternalDsl.g:3587:2: ')'
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
    // InternalDsl.g:3597:1: rule__UnaryElement__Group_4__0 : rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 ;
    public final void rule__UnaryElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3601:1: ( rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 )
            // InternalDsl.g:3602:2: rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3609:1: rule__UnaryElement__Group_4__0__Impl : ( 'not' ) ;
    public final void rule__UnaryElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3613:1: ( ( 'not' ) )
            // InternalDsl.g:3614:1: ( 'not' )
            {
            // InternalDsl.g:3614:1: ( 'not' )
            // InternalDsl.g:3615:2: 'not'
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
    // InternalDsl.g:3624:1: rule__UnaryElement__Group_4__1 : rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 ;
    public final void rule__UnaryElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3628:1: ( rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 )
            // InternalDsl.g:3629:2: rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3636:1: rule__UnaryElement__Group_4__1__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3640:1: ( ( () ) )
            // InternalDsl.g:3641:1: ( () )
            {
            // InternalDsl.g:3641:1: ( () )
            // InternalDsl.g:3642:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNegateElementAction_4_1()); 
            // InternalDsl.g:3643:2: ()
            // InternalDsl.g:3643:3: 
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
    // InternalDsl.g:3651:1: rule__UnaryElement__Group_4__2 : rule__UnaryElement__Group_4__2__Impl ;
    public final void rule__UnaryElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3655:1: ( rule__UnaryElement__Group_4__2__Impl )
            // InternalDsl.g:3656:2: rule__UnaryElement__Group_4__2__Impl
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
    // InternalDsl.g:3662:1: rule__UnaryElement__Group_4__2__Impl : ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) ;
    public final void rule__UnaryElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3666:1: ( ( ( rule__UnaryElement__ExpAssignment_4_2 ) ) )
            // InternalDsl.g:3667:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            {
            // InternalDsl.g:3667:1: ( ( rule__UnaryElement__ExpAssignment_4_2 ) )
            // InternalDsl.g:3668:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            {
             before(grammarAccess.getUnaryElementAccess().getExpAssignment_4_2()); 
            // InternalDsl.g:3669:2: ( rule__UnaryElement__ExpAssignment_4_2 )
            // InternalDsl.g:3669:3: rule__UnaryElement__ExpAssignment_4_2
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
    // InternalDsl.g:3678:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3682:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalDsl.g:3683:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalDsl.g:3690:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3694:1: ( ( RULE_INT ) )
            // InternalDsl.g:3695:1: ( RULE_INT )
            {
            // InternalDsl.g:3695:1: ( RULE_INT )
            // InternalDsl.g:3696:2: RULE_INT
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
    // InternalDsl.g:3705:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3709:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // InternalDsl.g:3710:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3717:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3721:1: ( ( '.' ) )
            // InternalDsl.g:3722:1: ( '.' )
            {
            // InternalDsl.g:3722:1: ( '.' )
            // InternalDsl.g:3723:2: '.'
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
    // InternalDsl.g:3732:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3736:1: ( rule__NUMBER__Group_1__2__Impl )
            // InternalDsl.g:3737:2: rule__NUMBER__Group_1__2__Impl
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
    // InternalDsl.g:3743:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3747:1: ( ( RULE_INT ) )
            // InternalDsl.g:3748:1: ( RULE_INT )
            {
            // InternalDsl.g:3748:1: ( RULE_INT )
            // InternalDsl.g:3749:2: RULE_INT
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
    // InternalDsl.g:3759:1: rule__EXTENDED_STRING__Group__0 : rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 ;
    public final void rule__EXTENDED_STRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3763:1: ( rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1 )
            // InternalDsl.g:3764:2: rule__EXTENDED_STRING__Group__0__Impl rule__EXTENDED_STRING__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDsl.g:3771:1: rule__EXTENDED_STRING__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3775:1: ( ( RULE_ID ) )
            // InternalDsl.g:3776:1: ( RULE_ID )
            {
            // InternalDsl.g:3776:1: ( RULE_ID )
            // InternalDsl.g:3777:2: RULE_ID
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
    // InternalDsl.g:3786:1: rule__EXTENDED_STRING__Group__1 : rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 ;
    public final void rule__EXTENDED_STRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3790:1: ( rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2 )
            // InternalDsl.g:3791:2: rule__EXTENDED_STRING__Group__1__Impl rule__EXTENDED_STRING__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalDsl.g:3798:1: rule__EXTENDED_STRING__Group__1__Impl : ( ( rule__EXTENDED_STRING__Group_1__0 )* ) ;
    public final void rule__EXTENDED_STRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3802:1: ( ( ( rule__EXTENDED_STRING__Group_1__0 )* ) )
            // InternalDsl.g:3803:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            {
            // InternalDsl.g:3803:1: ( ( rule__EXTENDED_STRING__Group_1__0 )* )
            // InternalDsl.g:3804:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_1()); 
            // InternalDsl.g:3805:2: ( rule__EXTENDED_STRING__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:3805:3: rule__EXTENDED_STRING__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__EXTENDED_STRING__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalDsl.g:3813:1: rule__EXTENDED_STRING__Group__2 : rule__EXTENDED_STRING__Group__2__Impl ;
    public final void rule__EXTENDED_STRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3817:1: ( rule__EXTENDED_STRING__Group__2__Impl )
            // InternalDsl.g:3818:2: rule__EXTENDED_STRING__Group__2__Impl
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
    // InternalDsl.g:3824:1: rule__EXTENDED_STRING__Group__2__Impl : ( ( rule__EXTENDED_STRING__Group_2__0 )? ) ;
    public final void rule__EXTENDED_STRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3828:1: ( ( ( rule__EXTENDED_STRING__Group_2__0 )? ) )
            // InternalDsl.g:3829:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            {
            // InternalDsl.g:3829:1: ( ( rule__EXTENDED_STRING__Group_2__0 )? )
            // InternalDsl.g:3830:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            {
             before(grammarAccess.getEXTENDED_STRINGAccess().getGroup_2()); 
            // InternalDsl.g:3831:2: ( rule__EXTENDED_STRING__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==28) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:3831:3: rule__EXTENDED_STRING__Group_2__0
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
    // InternalDsl.g:3840:1: rule__EXTENDED_STRING__Group_1__0 : rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 ;
    public final void rule__EXTENDED_STRING__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3844:1: ( rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1 )
            // InternalDsl.g:3845:2: rule__EXTENDED_STRING__Group_1__0__Impl rule__EXTENDED_STRING__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:3852:1: rule__EXTENDED_STRING__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EXTENDED_STRING__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3856:1: ( ( '.' ) )
            // InternalDsl.g:3857:1: ( '.' )
            {
            // InternalDsl.g:3857:1: ( '.' )
            // InternalDsl.g:3858:2: '.'
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
    // InternalDsl.g:3867:1: rule__EXTENDED_STRING__Group_1__1 : rule__EXTENDED_STRING__Group_1__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3871:1: ( rule__EXTENDED_STRING__Group_1__1__Impl )
            // InternalDsl.g:3872:2: rule__EXTENDED_STRING__Group_1__1__Impl
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
    // InternalDsl.g:3878:1: rule__EXTENDED_STRING__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EXTENDED_STRING__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3882:1: ( ( RULE_ID ) )
            // InternalDsl.g:3883:1: ( RULE_ID )
            {
            // InternalDsl.g:3883:1: ( RULE_ID )
            // InternalDsl.g:3884:2: RULE_ID
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
    // InternalDsl.g:3894:1: rule__EXTENDED_STRING__Group_2__0 : rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 ;
    public final void rule__EXTENDED_STRING__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3898:1: ( rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1 )
            // InternalDsl.g:3899:2: rule__EXTENDED_STRING__Group_2__0__Impl rule__EXTENDED_STRING__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:3906:1: rule__EXTENDED_STRING__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EXTENDED_STRING__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3910:1: ( ( '(' ) )
            // InternalDsl.g:3911:1: ( '(' )
            {
            // InternalDsl.g:3911:1: ( '(' )
            // InternalDsl.g:3912:2: '('
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
    // InternalDsl.g:3921:1: rule__EXTENDED_STRING__Group_2__1 : rule__EXTENDED_STRING__Group_2__1__Impl ;
    public final void rule__EXTENDED_STRING__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3925:1: ( rule__EXTENDED_STRING__Group_2__1__Impl )
            // InternalDsl.g:3926:2: rule__EXTENDED_STRING__Group_2__1__Impl
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
    // InternalDsl.g:3932:1: rule__EXTENDED_STRING__Group_2__1__Impl : ( ')' ) ;
    public final void rule__EXTENDED_STRING__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3936:1: ( ( ')' ) )
            // InternalDsl.g:3937:1: ( ')' )
            {
            // InternalDsl.g:3937:1: ( ')' )
            // InternalDsl.g:3938:2: ')'
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
    // InternalDsl.g:3948:1: rule__RunTimeModel__EnvDataAssignment_1 : ( ruleEnvironmentMetaData ) ;
    public final void rule__RunTimeModel__EnvDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3952:1: ( ( ruleEnvironmentMetaData ) )
            // InternalDsl.g:3953:2: ( ruleEnvironmentMetaData )
            {
            // InternalDsl.g:3953:2: ( ruleEnvironmentMetaData )
            // InternalDsl.g:3954:3: ruleEnvironmentMetaData
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
    // InternalDsl.g:3963:1: rule__RunTimeModel__AppDataAssignment_2 : ( ruleAppMetaData ) ;
    public final void rule__RunTimeModel__AppDataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3967:1: ( ( ruleAppMetaData ) )
            // InternalDsl.g:3968:2: ( ruleAppMetaData )
            {
            // InternalDsl.g:3968:2: ( ruleAppMetaData )
            // InternalDsl.g:3969:3: ruleAppMetaData
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
    // InternalDsl.g:3978:1: rule__RunTimeModel__ServicesDataAssignment_3 : ( ruleServiceMetaData ) ;
    public final void rule__RunTimeModel__ServicesDataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3982:1: ( ( ruleServiceMetaData ) )
            // InternalDsl.g:3983:2: ( ruleServiceMetaData )
            {
            // InternalDsl.g:3983:2: ( ruleServiceMetaData )
            // InternalDsl.g:3984:3: ruleServiceMetaData
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


    // $ANTLR start "rule__RunTimeModel__MappingPairsAssignment_6"
    // InternalDsl.g:3993:1: rule__RunTimeModel__MappingPairsAssignment_6 : ( ruleMappingPair ) ;
    public final void rule__RunTimeModel__MappingPairsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3997:1: ( ( ruleMappingPair ) )
            // InternalDsl.g:3998:2: ( ruleMappingPair )
            {
            // InternalDsl.g:3998:2: ( ruleMappingPair )
            // InternalDsl.g:3999:3: ruleMappingPair
            {
             before(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingPair();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getMappingPairsMappingPairParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__MappingPairsAssignment_6"


    // $ANTLR start "rule__AppMetaData__AppIDAssignment_1"
    // InternalDsl.g:4008:1: rule__AppMetaData__AppIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppMetaData__AppIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4012:1: ( ( RULE_ID ) )
            // InternalDsl.g:4013:2: ( RULE_ID )
            {
            // InternalDsl.g:4013:2: ( RULE_ID )
            // InternalDsl.g:4014:3: RULE_ID
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
    // InternalDsl.g:4023:1: rule__AppMetaData__SpecificationsAssignment_3 : ( ruleSpecification ) ;
    public final void rule__AppMetaData__SpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4027:1: ( ( ruleSpecification ) )
            // InternalDsl.g:4028:2: ( ruleSpecification )
            {
            // InternalDsl.g:4028:2: ( ruleSpecification )
            // InternalDsl.g:4029:3: ruleSpecification
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
    // InternalDsl.g:4038:1: rule__Specification__SpecIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__Specification__SpecIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4042:1: ( ( RULE_ID ) )
            // InternalDsl.g:4043:2: ( RULE_ID )
            {
            // InternalDsl.g:4043:2: ( RULE_ID )
            // InternalDsl.g:4044:3: RULE_ID
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
    // InternalDsl.g:4053:1: rule__Specification__TriggerAssignment_2 : ( ruleOrElement ) ;
    public final void rule__Specification__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4057:1: ( ( ruleOrElement ) )
            // InternalDsl.g:4058:2: ( ruleOrElement )
            {
            // InternalDsl.g:4058:2: ( ruleOrElement )
            // InternalDsl.g:4059:3: ruleOrElement
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
    // InternalDsl.g:4068:1: rule__Specification__ConditionAssignment_4 : ( ruleOrElement ) ;
    public final void rule__Specification__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4072:1: ( ( ruleOrElement ) )
            // InternalDsl.g:4073:2: ( ruleOrElement )
            {
            // InternalDsl.g:4073:2: ( ruleOrElement )
            // InternalDsl.g:4074:3: ruleOrElement
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
    // InternalDsl.g:4083:1: rule__Specification__ActionAssignment_6 : ( ruleAction ) ;
    public final void rule__Specification__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4087:1: ( ( ruleAction ) )
            // InternalDsl.g:4088:2: ( ruleAction )
            {
            // InternalDsl.g:4088:2: ( ruleAction )
            // InternalDsl.g:4089:3: ruleAction
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
    // InternalDsl.g:4098:1: rule__Specification__ActionAssignment_7_1 : ( ruleAction ) ;
    public final void rule__Specification__ActionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4102:1: ( ( ruleAction ) )
            // InternalDsl.g:4103:2: ( ruleAction )
            {
            // InternalDsl.g:4103:2: ( ruleAction )
            // InternalDsl.g:4104:3: ruleAction
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


    // $ANTLR start "rule__EnvironmentMetaData__ResourcesAssignment_2"
    // InternalDsl.g:4113:1: rule__EnvironmentMetaData__ResourcesAssignment_2 : ( ruleResource ) ;
    public final void rule__EnvironmentMetaData__ResourcesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4117:1: ( ( ruleResource ) )
            // InternalDsl.g:4118:2: ( ruleResource )
            {
            // InternalDsl.g:4118:2: ( ruleResource )
            // InternalDsl.g:4119:3: ruleResource
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


    // $ANTLR start "rule__ServiceMetaData__ServiceIDAssignment_1"
    // InternalDsl.g:4128:1: rule__ServiceMetaData__ServiceIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceMetaData__ServiceIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4132:1: ( ( RULE_ID ) )
            // InternalDsl.g:4133:2: ( RULE_ID )
            {
            // InternalDsl.g:4133:2: ( RULE_ID )
            // InternalDsl.g:4134:3: RULE_ID
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
    // InternalDsl.g:4143:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4147:1: ( ( RULE_ID ) )
            // InternalDsl.g:4148:2: ( RULE_ID )
            {
            // InternalDsl.g:4148:2: ( RULE_ID )
            // InternalDsl.g:4149:3: RULE_ID
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
    // InternalDsl.g:4158:1: rule__Resource__StatesAssignment_4 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4162:1: ( ( ruleState ) )
            // InternalDsl.g:4163:2: ( ruleState )
            {
            // InternalDsl.g:4163:2: ( ruleState )
            // InternalDsl.g:4164:3: ruleState
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
    // InternalDsl.g:4173:1: rule__Resource__StatesAssignment_5_1 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4177:1: ( ( ruleState ) )
            // InternalDsl.g:4178:2: ( ruleState )
            {
            // InternalDsl.g:4178:2: ( ruleState )
            // InternalDsl.g:4179:3: ruleState
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
    // InternalDsl.g:4188:1: rule__Action__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4192:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4193:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4193:2: ( ( RULE_ID ) )
            // InternalDsl.g:4194:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0()); 
            // InternalDsl.g:4195:3: ( RULE_ID )
            // InternalDsl.g:4196:4: RULE_ID
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
    // InternalDsl.g:4207:1: rule__Action__StateAssignment_2 : ( ruleState ) ;
    public final void rule__Action__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4211:1: ( ( ruleState ) )
            // InternalDsl.g:4212:2: ( ruleState )
            {
            // InternalDsl.g:4212:2: ( ruleState )
            // InternalDsl.g:4213:3: ruleState
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
    // InternalDsl.g:4222:1: rule__MappingPair__ResourceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MappingPair__ResourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4226:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4227:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4227:2: ( ( RULE_ID ) )
            // InternalDsl.g:4228:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingPairAccess().getResourceResourceCrossReference_1_0()); 
            // InternalDsl.g:4229:3: ( RULE_ID )
            // InternalDsl.g:4230:4: RULE_ID
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
    // InternalDsl.g:4241:1: rule__MappingPair__StateAssignment_3 : ( ruleUnaryElement ) ;
    public final void rule__MappingPair__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4245:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4246:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4246:2: ( ruleUnaryElement )
            // InternalDsl.g:4247:3: ruleUnaryElement
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
    // InternalDsl.g:4256:1: rule__MappingPair__ActionCodeAssignment_5 : ( ruleEXTENDED_STRING ) ;
    public final void rule__MappingPair__ActionCodeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4260:1: ( ( ruleEXTENDED_STRING ) )
            // InternalDsl.g:4261:2: ( ruleEXTENDED_STRING )
            {
            // InternalDsl.g:4261:2: ( ruleEXTENDED_STRING )
            // InternalDsl.g:4262:3: ruleEXTENDED_STRING
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
    // InternalDsl.g:4271:1: rule__OrElement__RightAssignment_1_2 : ( ruleAndElement ) ;
    public final void rule__OrElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4275:1: ( ( ruleAndElement ) )
            // InternalDsl.g:4276:2: ( ruleAndElement )
            {
            // InternalDsl.g:4276:2: ( ruleAndElement )
            // InternalDsl.g:4277:3: ruleAndElement
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
    // InternalDsl.g:4286:1: rule__AndElement__RightAssignment_1_2 : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4290:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:4291:2: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:4291:2: ( ruleDiffEqualElement )
            // InternalDsl.g:4292:3: ruleDiffEqualElement
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
    // InternalDsl.g:4301:1: rule__DiffEqualElement__RightAssignment_1_0_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4305:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4306:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4306:2: ( ruleCompareElement )
            // InternalDsl.g:4307:3: ruleCompareElement
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
    // InternalDsl.g:4316:1: rule__DiffEqualElement__RightAssignment_1_1_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4320:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4321:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4321:2: ( ruleCompareElement )
            // InternalDsl.g:4322:3: ruleCompareElement
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
    // InternalDsl.g:4331:1: rule__CompareElement__RightAssignment_1_0_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4335:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4336:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4336:2: ( rulePlusMinusElement )
            // InternalDsl.g:4337:3: rulePlusMinusElement
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
    // InternalDsl.g:4346:1: rule__CompareElement__RightAssignment_1_1_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4350:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4351:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4351:2: ( rulePlusMinusElement )
            // InternalDsl.g:4352:3: rulePlusMinusElement
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
    // InternalDsl.g:4361:1: rule__CompareElement__RightAssignment_1_2_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4365:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4366:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4366:2: ( rulePlusMinusElement )
            // InternalDsl.g:4367:3: rulePlusMinusElement
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
    // InternalDsl.g:4376:1: rule__CompareElement__RightAssignment_1_3_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4380:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4381:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4381:2: ( rulePlusMinusElement )
            // InternalDsl.g:4382:3: rulePlusMinusElement
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
    // InternalDsl.g:4391:1: rule__PlusMinusElement__RightAssignment_1_0_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4395:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4396:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4396:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4397:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:4406:1: rule__PlusMinusElement__RightAssignment_1_1_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4410:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4411:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4411:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4412:3: ruleMultiplicationDivisionElement
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
    // InternalDsl.g:4421:1: rule__MultiplicationDivisionElement__RightAssignment_1_0_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4425:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4426:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4426:2: ( ruleUnaryElement )
            // InternalDsl.g:4427:3: ruleUnaryElement
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
    // InternalDsl.g:4436:1: rule__MultiplicationDivisionElement__RightAssignment_1_1_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4440:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4441:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4441:2: ( ruleUnaryElement )
            // InternalDsl.g:4442:3: ruleUnaryElement
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
    // InternalDsl.g:4451:1: rule__MultiplicationDivisionElement__RightAssignment_1_2_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4455:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4456:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4456:2: ( ruleUnaryElement )
            // InternalDsl.g:4457:3: ruleUnaryElement
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
    // InternalDsl.g:4466:1: rule__UnaryElement__ValueAssignment_0_1 : ( ruleNUMBER ) ;
    public final void rule__UnaryElement__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4470:1: ( ( ruleNUMBER ) )
            // InternalDsl.g:4471:2: ( ruleNUMBER )
            {
            // InternalDsl.g:4471:2: ( ruleNUMBER )
            // InternalDsl.g:4472:3: ruleNUMBER
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
    // InternalDsl.g:4481:1: rule__UnaryElement__ValueAssignment_1_1 : ( ruleEXTENDED_STRING ) ;
    public final void rule__UnaryElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4485:1: ( ( ruleEXTENDED_STRING ) )
            // InternalDsl.g:4486:2: ( ruleEXTENDED_STRING )
            {
            // InternalDsl.g:4486:2: ( ruleEXTENDED_STRING )
            // InternalDsl.g:4487:3: ruleEXTENDED_STRING
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
    // InternalDsl.g:4496:1: rule__UnaryElement__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__UnaryElement__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4500:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:4501:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:4501:2: ( RULE_BOOLEAN )
            // InternalDsl.g:4502:3: RULE_BOOLEAN
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
    // InternalDsl.g:4511:1: rule__UnaryElement__ExpAssignment_4_2 : ( ruleUnaryElement ) ;
    public final void rule__UnaryElement__ExpAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4515:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4516:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4516:2: ( ruleUnaryElement )
            // InternalDsl.g:4517:3: ruleUnaryElement
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000030C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008012010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020008020070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020008000072L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020008040070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020008000070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000002L});

}