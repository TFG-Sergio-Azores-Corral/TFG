package org.usecase.ide.contentassist.antlr.internal;

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
import org.usecase.services.UseCaseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'useCase'", "'primaryActor:'", "'stakeholdersAndGoals:'", "'preconditions:'", "'postconditions:'", "'mainFlow:'", "'extensions:'", "'specialRequirements:'", "'technologyAndDataVariations:'", "'frequencyOfOccurrence:'", "'openIssues:'", "'-'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUseCaseDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUseCaseDsl.g"; }


    	private UseCaseDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(UseCaseDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUseCaseDescription"
    // InternalUseCaseDsl.g:53:1: entryRuleUseCaseDescription : ruleUseCaseDescription EOF ;
    public final void entryRuleUseCaseDescription() throws RecognitionException {
        try {
            // InternalUseCaseDsl.g:54:1: ( ruleUseCaseDescription EOF )
            // InternalUseCaseDsl.g:55:1: ruleUseCaseDescription EOF
            {
             before(grammarAccess.getUseCaseDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCaseDescription();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionRule()); 
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
    // $ANTLR end "entryRuleUseCaseDescription"


    // $ANTLR start "ruleUseCaseDescription"
    // InternalUseCaseDsl.g:62:1: ruleUseCaseDescription : ( ( rule__UseCaseDescription__Group__0 ) ) ;
    public final void ruleUseCaseDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:66:2: ( ( ( rule__UseCaseDescription__Group__0 ) ) )
            // InternalUseCaseDsl.g:67:2: ( ( rule__UseCaseDescription__Group__0 ) )
            {
            // InternalUseCaseDsl.g:67:2: ( ( rule__UseCaseDescription__Group__0 ) )
            // InternalUseCaseDsl.g:68:3: ( rule__UseCaseDescription__Group__0 )
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getGroup()); 
            // InternalUseCaseDsl.g:69:3: ( rule__UseCaseDescription__Group__0 )
            // InternalUseCaseDsl.g:69:4: rule__UseCaseDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCaseDescription"


    // $ANTLR start "entryRuleBulletItem"
    // InternalUseCaseDsl.g:78:1: entryRuleBulletItem : ruleBulletItem EOF ;
    public final void entryRuleBulletItem() throws RecognitionException {
        try {
            // InternalUseCaseDsl.g:79:1: ( ruleBulletItem EOF )
            // InternalUseCaseDsl.g:80:1: ruleBulletItem EOF
            {
             before(grammarAccess.getBulletItemRule()); 
            pushFollow(FOLLOW_1);
            ruleBulletItem();

            state._fsp--;

             after(grammarAccess.getBulletItemRule()); 
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
    // $ANTLR end "entryRuleBulletItem"


    // $ANTLR start "ruleBulletItem"
    // InternalUseCaseDsl.g:87:1: ruleBulletItem : ( ( rule__BulletItem__Group__0 ) ) ;
    public final void ruleBulletItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:91:2: ( ( ( rule__BulletItem__Group__0 ) ) )
            // InternalUseCaseDsl.g:92:2: ( ( rule__BulletItem__Group__0 ) )
            {
            // InternalUseCaseDsl.g:92:2: ( ( rule__BulletItem__Group__0 ) )
            // InternalUseCaseDsl.g:93:3: ( rule__BulletItem__Group__0 )
            {
             before(grammarAccess.getBulletItemAccess().getGroup()); 
            // InternalUseCaseDsl.g:94:3: ( rule__BulletItem__Group__0 )
            // InternalUseCaseDsl.g:94:4: rule__BulletItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BulletItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBulletItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBulletItem"


    // $ANTLR start "entryRuleNumberedStep"
    // InternalUseCaseDsl.g:103:1: entryRuleNumberedStep : ruleNumberedStep EOF ;
    public final void entryRuleNumberedStep() throws RecognitionException {
        try {
            // InternalUseCaseDsl.g:104:1: ( ruleNumberedStep EOF )
            // InternalUseCaseDsl.g:105:1: ruleNumberedStep EOF
            {
             before(grammarAccess.getNumberedStepRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberedStep();

            state._fsp--;

             after(grammarAccess.getNumberedStepRule()); 
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
    // $ANTLR end "entryRuleNumberedStep"


    // $ANTLR start "ruleNumberedStep"
    // InternalUseCaseDsl.g:112:1: ruleNumberedStep : ( ( rule__NumberedStep__Group__0 ) ) ;
    public final void ruleNumberedStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:116:2: ( ( ( rule__NumberedStep__Group__0 ) ) )
            // InternalUseCaseDsl.g:117:2: ( ( rule__NumberedStep__Group__0 ) )
            {
            // InternalUseCaseDsl.g:117:2: ( ( rule__NumberedStep__Group__0 ) )
            // InternalUseCaseDsl.g:118:3: ( rule__NumberedStep__Group__0 )
            {
             before(grammarAccess.getNumberedStepAccess().getGroup()); 
            // InternalUseCaseDsl.g:119:3: ( rule__NumberedStep__Group__0 )
            // InternalUseCaseDsl.g:119:4: rule__NumberedStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberedStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberedStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberedStep"


    // $ANTLR start "entryRuleExtensionStep"
    // InternalUseCaseDsl.g:128:1: entryRuleExtensionStep : ruleExtensionStep EOF ;
    public final void entryRuleExtensionStep() throws RecognitionException {
        try {
            // InternalUseCaseDsl.g:129:1: ( ruleExtensionStep EOF )
            // InternalUseCaseDsl.g:130:1: ruleExtensionStep EOF
            {
             before(grammarAccess.getExtensionStepRule()); 
            pushFollow(FOLLOW_1);
            ruleExtensionStep();

            state._fsp--;

             after(grammarAccess.getExtensionStepRule()); 
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
    // $ANTLR end "entryRuleExtensionStep"


    // $ANTLR start "ruleExtensionStep"
    // InternalUseCaseDsl.g:137:1: ruleExtensionStep : ( ( rule__ExtensionStep__Group__0 ) ) ;
    public final void ruleExtensionStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:141:2: ( ( ( rule__ExtensionStep__Group__0 ) ) )
            // InternalUseCaseDsl.g:142:2: ( ( rule__ExtensionStep__Group__0 ) )
            {
            // InternalUseCaseDsl.g:142:2: ( ( rule__ExtensionStep__Group__0 ) )
            // InternalUseCaseDsl.g:143:3: ( rule__ExtensionStep__Group__0 )
            {
             before(grammarAccess.getExtensionStepAccess().getGroup()); 
            // InternalUseCaseDsl.g:144:3: ( rule__ExtensionStep__Group__0 )
            // InternalUseCaseDsl.g:144:4: rule__ExtensionStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionStep"


    // $ANTLR start "entryRuleExtensionSubStep"
    // InternalUseCaseDsl.g:153:1: entryRuleExtensionSubStep : ruleExtensionSubStep EOF ;
    public final void entryRuleExtensionSubStep() throws RecognitionException {
        try {
            // InternalUseCaseDsl.g:154:1: ( ruleExtensionSubStep EOF )
            // InternalUseCaseDsl.g:155:1: ruleExtensionSubStep EOF
            {
             before(grammarAccess.getExtensionSubStepRule()); 
            pushFollow(FOLLOW_1);
            ruleExtensionSubStep();

            state._fsp--;

             after(grammarAccess.getExtensionSubStepRule()); 
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
    // $ANTLR end "entryRuleExtensionSubStep"


    // $ANTLR start "ruleExtensionSubStep"
    // InternalUseCaseDsl.g:162:1: ruleExtensionSubStep : ( ( rule__ExtensionSubStep__Group__0 ) ) ;
    public final void ruleExtensionSubStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:166:2: ( ( ( rule__ExtensionSubStep__Group__0 ) ) )
            // InternalUseCaseDsl.g:167:2: ( ( rule__ExtensionSubStep__Group__0 ) )
            {
            // InternalUseCaseDsl.g:167:2: ( ( rule__ExtensionSubStep__Group__0 ) )
            // InternalUseCaseDsl.g:168:3: ( rule__ExtensionSubStep__Group__0 )
            {
             before(grammarAccess.getExtensionSubStepAccess().getGroup()); 
            // InternalUseCaseDsl.g:169:3: ( rule__ExtensionSubStep__Group__0 )
            // InternalUseCaseDsl.g:169:4: rule__ExtensionSubStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionSubStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionSubStep"


    // $ANTLR start "rule__UseCaseDescription__Group__0"
    // InternalUseCaseDsl.g:177:1: rule__UseCaseDescription__Group__0 : rule__UseCaseDescription__Group__0__Impl rule__UseCaseDescription__Group__1 ;
    public final void rule__UseCaseDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:181:1: ( rule__UseCaseDescription__Group__0__Impl rule__UseCaseDescription__Group__1 )
            // InternalUseCaseDsl.g:182:2: rule__UseCaseDescription__Group__0__Impl rule__UseCaseDescription__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UseCaseDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__0"


    // $ANTLR start "rule__UseCaseDescription__Group__0__Impl"
    // InternalUseCaseDsl.g:189:1: rule__UseCaseDescription__Group__0__Impl : ( 'useCase' ) ;
    public final void rule__UseCaseDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:193:1: ( ( 'useCase' ) )
            // InternalUseCaseDsl.g:194:1: ( 'useCase' )
            {
            // InternalUseCaseDsl.g:194:1: ( 'useCase' )
            // InternalUseCaseDsl.g:195:2: 'useCase'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getUseCaseKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getUseCaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__0__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__1"
    // InternalUseCaseDsl.g:204:1: rule__UseCaseDescription__Group__1 : rule__UseCaseDescription__Group__1__Impl rule__UseCaseDescription__Group__2 ;
    public final void rule__UseCaseDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:208:1: ( rule__UseCaseDescription__Group__1__Impl rule__UseCaseDescription__Group__2 )
            // InternalUseCaseDsl.g:209:2: rule__UseCaseDescription__Group__1__Impl rule__UseCaseDescription__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UseCaseDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__1"


    // $ANTLR start "rule__UseCaseDescription__Group__1__Impl"
    // InternalUseCaseDsl.g:216:1: rule__UseCaseDescription__Group__1__Impl : ( ( rule__UseCaseDescription__NameAssignment_1 ) ) ;
    public final void rule__UseCaseDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:220:1: ( ( ( rule__UseCaseDescription__NameAssignment_1 ) ) )
            // InternalUseCaseDsl.g:221:1: ( ( rule__UseCaseDescription__NameAssignment_1 ) )
            {
            // InternalUseCaseDsl.g:221:1: ( ( rule__UseCaseDescription__NameAssignment_1 ) )
            // InternalUseCaseDsl.g:222:2: ( rule__UseCaseDescription__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCaseDsl.g:223:2: ( rule__UseCaseDescription__NameAssignment_1 )
            // InternalUseCaseDsl.g:223:3: rule__UseCaseDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescriptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__1__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__2"
    // InternalUseCaseDsl.g:231:1: rule__UseCaseDescription__Group__2 : rule__UseCaseDescription__Group__2__Impl rule__UseCaseDescription__Group__3 ;
    public final void rule__UseCaseDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:235:1: ( rule__UseCaseDescription__Group__2__Impl rule__UseCaseDescription__Group__3 )
            // InternalUseCaseDsl.g:236:2: rule__UseCaseDescription__Group__2__Impl rule__UseCaseDescription__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__UseCaseDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__2"


    // $ANTLR start "rule__UseCaseDescription__Group__2__Impl"
    // InternalUseCaseDsl.g:243:1: rule__UseCaseDescription__Group__2__Impl : ( 'primaryActor:' ) ;
    public final void rule__UseCaseDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:247:1: ( ( 'primaryActor:' ) )
            // InternalUseCaseDsl.g:248:1: ( 'primaryActor:' )
            {
            // InternalUseCaseDsl.g:248:1: ( 'primaryActor:' )
            // InternalUseCaseDsl.g:249:2: 'primaryActor:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__2__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__3"
    // InternalUseCaseDsl.g:258:1: rule__UseCaseDescription__Group__3 : rule__UseCaseDescription__Group__3__Impl rule__UseCaseDescription__Group__4 ;
    public final void rule__UseCaseDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:262:1: ( rule__UseCaseDescription__Group__3__Impl rule__UseCaseDescription__Group__4 )
            // InternalUseCaseDsl.g:263:2: rule__UseCaseDescription__Group__3__Impl rule__UseCaseDescription__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__UseCaseDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__3"


    // $ANTLR start "rule__UseCaseDescription__Group__3__Impl"
    // InternalUseCaseDsl.g:270:1: rule__UseCaseDescription__Group__3__Impl : ( ( rule__UseCaseDescription__PrimaryActorAssignment_3 ) ) ;
    public final void rule__UseCaseDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:274:1: ( ( ( rule__UseCaseDescription__PrimaryActorAssignment_3 ) ) )
            // InternalUseCaseDsl.g:275:1: ( ( rule__UseCaseDescription__PrimaryActorAssignment_3 ) )
            {
            // InternalUseCaseDsl.g:275:1: ( ( rule__UseCaseDescription__PrimaryActorAssignment_3 ) )
            // InternalUseCaseDsl.g:276:2: ( rule__UseCaseDescription__PrimaryActorAssignment_3 )
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorAssignment_3()); 
            // InternalUseCaseDsl.g:277:2: ( rule__UseCaseDescription__PrimaryActorAssignment_3 )
            // InternalUseCaseDsl.g:277:3: rule__UseCaseDescription__PrimaryActorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__PrimaryActorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__3__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__4"
    // InternalUseCaseDsl.g:285:1: rule__UseCaseDescription__Group__4 : rule__UseCaseDescription__Group__4__Impl rule__UseCaseDescription__Group__5 ;
    public final void rule__UseCaseDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:289:1: ( rule__UseCaseDescription__Group__4__Impl rule__UseCaseDescription__Group__5 )
            // InternalUseCaseDsl.g:290:2: rule__UseCaseDescription__Group__4__Impl rule__UseCaseDescription__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__UseCaseDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__4"


    // $ANTLR start "rule__UseCaseDescription__Group__4__Impl"
    // InternalUseCaseDsl.g:297:1: rule__UseCaseDescription__Group__4__Impl : ( 'stakeholdersAndGoals:' ) ;
    public final void rule__UseCaseDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:301:1: ( ( 'stakeholdersAndGoals:' ) )
            // InternalUseCaseDsl.g:302:1: ( 'stakeholdersAndGoals:' )
            {
            // InternalUseCaseDsl.g:302:1: ( 'stakeholdersAndGoals:' )
            // InternalUseCaseDsl.g:303:2: 'stakeholdersAndGoals:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getStakeholdersAndGoalsKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getStakeholdersAndGoalsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__4__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__5"
    // InternalUseCaseDsl.g:312:1: rule__UseCaseDescription__Group__5 : rule__UseCaseDescription__Group__5__Impl rule__UseCaseDescription__Group__6 ;
    public final void rule__UseCaseDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:316:1: ( rule__UseCaseDescription__Group__5__Impl rule__UseCaseDescription__Group__6 )
            // InternalUseCaseDsl.g:317:2: rule__UseCaseDescription__Group__5__Impl rule__UseCaseDescription__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__UseCaseDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__5"


    // $ANTLR start "rule__UseCaseDescription__Group__5__Impl"
    // InternalUseCaseDsl.g:324:1: rule__UseCaseDescription__Group__5__Impl : ( ( rule__UseCaseDescription__StakeholdersAssignment_5 )* ) ;
    public final void rule__UseCaseDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:328:1: ( ( ( rule__UseCaseDescription__StakeholdersAssignment_5 )* ) )
            // InternalUseCaseDsl.g:329:1: ( ( rule__UseCaseDescription__StakeholdersAssignment_5 )* )
            {
            // InternalUseCaseDsl.g:329:1: ( ( rule__UseCaseDescription__StakeholdersAssignment_5 )* )
            // InternalUseCaseDsl.g:330:2: ( rule__UseCaseDescription__StakeholdersAssignment_5 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getStakeholdersAssignment_5()); 
            // InternalUseCaseDsl.g:331:2: ( rule__UseCaseDescription__StakeholdersAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDsl.g:331:3: rule__UseCaseDescription__StakeholdersAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseCaseDescription__StakeholdersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getStakeholdersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__5__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__6"
    // InternalUseCaseDsl.g:339:1: rule__UseCaseDescription__Group__6 : rule__UseCaseDescription__Group__6__Impl rule__UseCaseDescription__Group__7 ;
    public final void rule__UseCaseDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:343:1: ( rule__UseCaseDescription__Group__6__Impl rule__UseCaseDescription__Group__7 )
            // InternalUseCaseDsl.g:344:2: rule__UseCaseDescription__Group__6__Impl rule__UseCaseDescription__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__UseCaseDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__6"


    // $ANTLR start "rule__UseCaseDescription__Group__6__Impl"
    // InternalUseCaseDsl.g:351:1: rule__UseCaseDescription__Group__6__Impl : ( 'preconditions:' ) ;
    public final void rule__UseCaseDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:355:1: ( ( 'preconditions:' ) )
            // InternalUseCaseDsl.g:356:1: ( 'preconditions:' )
            {
            // InternalUseCaseDsl.g:356:1: ( 'preconditions:' )
            // InternalUseCaseDsl.g:357:2: 'preconditions:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPreconditionsKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getPreconditionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__6__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__7"
    // InternalUseCaseDsl.g:366:1: rule__UseCaseDescription__Group__7 : rule__UseCaseDescription__Group__7__Impl rule__UseCaseDescription__Group__8 ;
    public final void rule__UseCaseDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:370:1: ( rule__UseCaseDescription__Group__7__Impl rule__UseCaseDescription__Group__8 )
            // InternalUseCaseDsl.g:371:2: rule__UseCaseDescription__Group__7__Impl rule__UseCaseDescription__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__UseCaseDescription__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__7"


    // $ANTLR start "rule__UseCaseDescription__Group__7__Impl"
    // InternalUseCaseDsl.g:378:1: rule__UseCaseDescription__Group__7__Impl : ( ( rule__UseCaseDescription__PreconditionsAssignment_7 )* ) ;
    public final void rule__UseCaseDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:382:1: ( ( ( rule__UseCaseDescription__PreconditionsAssignment_7 )* ) )
            // InternalUseCaseDsl.g:383:1: ( ( rule__UseCaseDescription__PreconditionsAssignment_7 )* )
            {
            // InternalUseCaseDsl.g:383:1: ( ( rule__UseCaseDescription__PreconditionsAssignment_7 )* )
            // InternalUseCaseDsl.g:384:2: ( rule__UseCaseDescription__PreconditionsAssignment_7 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPreconditionsAssignment_7()); 
            // InternalUseCaseDsl.g:385:2: ( rule__UseCaseDescription__PreconditionsAssignment_7 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCaseDsl.g:385:3: rule__UseCaseDescription__PreconditionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseCaseDescription__PreconditionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getPreconditionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__7__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__8"
    // InternalUseCaseDsl.g:393:1: rule__UseCaseDescription__Group__8 : rule__UseCaseDescription__Group__8__Impl rule__UseCaseDescription__Group__9 ;
    public final void rule__UseCaseDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:397:1: ( rule__UseCaseDescription__Group__8__Impl rule__UseCaseDescription__Group__9 )
            // InternalUseCaseDsl.g:398:2: rule__UseCaseDescription__Group__8__Impl rule__UseCaseDescription__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__UseCaseDescription__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__8"


    // $ANTLR start "rule__UseCaseDescription__Group__8__Impl"
    // InternalUseCaseDsl.g:405:1: rule__UseCaseDescription__Group__8__Impl : ( 'postconditions:' ) ;
    public final void rule__UseCaseDescription__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:409:1: ( ( 'postconditions:' ) )
            // InternalUseCaseDsl.g:410:1: ( 'postconditions:' )
            {
            // InternalUseCaseDsl.g:410:1: ( 'postconditions:' )
            // InternalUseCaseDsl.g:411:2: 'postconditions:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPostconditionsKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getPostconditionsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__8__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__9"
    // InternalUseCaseDsl.g:420:1: rule__UseCaseDescription__Group__9 : rule__UseCaseDescription__Group__9__Impl rule__UseCaseDescription__Group__10 ;
    public final void rule__UseCaseDescription__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:424:1: ( rule__UseCaseDescription__Group__9__Impl rule__UseCaseDescription__Group__10 )
            // InternalUseCaseDsl.g:425:2: rule__UseCaseDescription__Group__9__Impl rule__UseCaseDescription__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__UseCaseDescription__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__9"


    // $ANTLR start "rule__UseCaseDescription__Group__9__Impl"
    // InternalUseCaseDsl.g:432:1: rule__UseCaseDescription__Group__9__Impl : ( ( rule__UseCaseDescription__PostconditionsAssignment_9 )* ) ;
    public final void rule__UseCaseDescription__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:436:1: ( ( ( rule__UseCaseDescription__PostconditionsAssignment_9 )* ) )
            // InternalUseCaseDsl.g:437:1: ( ( rule__UseCaseDescription__PostconditionsAssignment_9 )* )
            {
            // InternalUseCaseDsl.g:437:1: ( ( rule__UseCaseDescription__PostconditionsAssignment_9 )* )
            // InternalUseCaseDsl.g:438:2: ( rule__UseCaseDescription__PostconditionsAssignment_9 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPostconditionsAssignment_9()); 
            // InternalUseCaseDsl.g:439:2: ( rule__UseCaseDescription__PostconditionsAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDsl.g:439:3: rule__UseCaseDescription__PostconditionsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseCaseDescription__PostconditionsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getPostconditionsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__9__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__10"
    // InternalUseCaseDsl.g:447:1: rule__UseCaseDescription__Group__10 : rule__UseCaseDescription__Group__10__Impl rule__UseCaseDescription__Group__11 ;
    public final void rule__UseCaseDescription__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:451:1: ( rule__UseCaseDescription__Group__10__Impl rule__UseCaseDescription__Group__11 )
            // InternalUseCaseDsl.g:452:2: rule__UseCaseDescription__Group__10__Impl rule__UseCaseDescription__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__UseCaseDescription__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__10"


    // $ANTLR start "rule__UseCaseDescription__Group__10__Impl"
    // InternalUseCaseDsl.g:459:1: rule__UseCaseDescription__Group__10__Impl : ( 'mainFlow:' ) ;
    public final void rule__UseCaseDescription__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:463:1: ( ( 'mainFlow:' ) )
            // InternalUseCaseDsl.g:464:1: ( 'mainFlow:' )
            {
            // InternalUseCaseDsl.g:464:1: ( 'mainFlow:' )
            // InternalUseCaseDsl.g:465:2: 'mainFlow:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getMainFlowKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getMainFlowKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__10__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__11"
    // InternalUseCaseDsl.g:474:1: rule__UseCaseDescription__Group__11 : rule__UseCaseDescription__Group__11__Impl rule__UseCaseDescription__Group__12 ;
    public final void rule__UseCaseDescription__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:478:1: ( rule__UseCaseDescription__Group__11__Impl rule__UseCaseDescription__Group__12 )
            // InternalUseCaseDsl.g:479:2: rule__UseCaseDescription__Group__11__Impl rule__UseCaseDescription__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__UseCaseDescription__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__11"


    // $ANTLR start "rule__UseCaseDescription__Group__11__Impl"
    // InternalUseCaseDsl.g:486:1: rule__UseCaseDescription__Group__11__Impl : ( ( rule__UseCaseDescription__MainStepsAssignment_11 )* ) ;
    public final void rule__UseCaseDescription__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:490:1: ( ( ( rule__UseCaseDescription__MainStepsAssignment_11 )* ) )
            // InternalUseCaseDsl.g:491:1: ( ( rule__UseCaseDescription__MainStepsAssignment_11 )* )
            {
            // InternalUseCaseDsl.g:491:1: ( ( rule__UseCaseDescription__MainStepsAssignment_11 )* )
            // InternalUseCaseDsl.g:492:2: ( rule__UseCaseDescription__MainStepsAssignment_11 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getMainStepsAssignment_11()); 
            // InternalUseCaseDsl.g:493:2: ( rule__UseCaseDescription__MainStepsAssignment_11 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDsl.g:493:3: rule__UseCaseDescription__MainStepsAssignment_11
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCaseDescription__MainStepsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getMainStepsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__11__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__12"
    // InternalUseCaseDsl.g:501:1: rule__UseCaseDescription__Group__12 : rule__UseCaseDescription__Group__12__Impl rule__UseCaseDescription__Group__13 ;
    public final void rule__UseCaseDescription__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:505:1: ( rule__UseCaseDescription__Group__12__Impl rule__UseCaseDescription__Group__13 )
            // InternalUseCaseDsl.g:506:2: rule__UseCaseDescription__Group__12__Impl rule__UseCaseDescription__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__UseCaseDescription__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__12"


    // $ANTLR start "rule__UseCaseDescription__Group__12__Impl"
    // InternalUseCaseDsl.g:513:1: rule__UseCaseDescription__Group__12__Impl : ( 'extensions:' ) ;
    public final void rule__UseCaseDescription__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:517:1: ( ( 'extensions:' ) )
            // InternalUseCaseDsl.g:518:1: ( 'extensions:' )
            {
            // InternalUseCaseDsl.g:518:1: ( 'extensions:' )
            // InternalUseCaseDsl.g:519:2: 'extensions:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getExtensionsKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getExtensionsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__12__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__13"
    // InternalUseCaseDsl.g:528:1: rule__UseCaseDescription__Group__13 : rule__UseCaseDescription__Group__13__Impl rule__UseCaseDescription__Group__14 ;
    public final void rule__UseCaseDescription__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:532:1: ( rule__UseCaseDescription__Group__13__Impl rule__UseCaseDescription__Group__14 )
            // InternalUseCaseDsl.g:533:2: rule__UseCaseDescription__Group__13__Impl rule__UseCaseDescription__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__UseCaseDescription__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__13"


    // $ANTLR start "rule__UseCaseDescription__Group__13__Impl"
    // InternalUseCaseDsl.g:540:1: rule__UseCaseDescription__Group__13__Impl : ( ( rule__UseCaseDescription__ExtensionsAssignment_13 )* ) ;
    public final void rule__UseCaseDescription__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:544:1: ( ( ( rule__UseCaseDescription__ExtensionsAssignment_13 )* ) )
            // InternalUseCaseDsl.g:545:1: ( ( rule__UseCaseDescription__ExtensionsAssignment_13 )* )
            {
            // InternalUseCaseDsl.g:545:1: ( ( rule__UseCaseDescription__ExtensionsAssignment_13 )* )
            // InternalUseCaseDsl.g:546:2: ( rule__UseCaseDescription__ExtensionsAssignment_13 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getExtensionsAssignment_13()); 
            // InternalUseCaseDsl.g:547:2: ( rule__UseCaseDescription__ExtensionsAssignment_13 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCaseDsl.g:547:3: rule__UseCaseDescription__ExtensionsAssignment_13
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCaseDescription__ExtensionsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getExtensionsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__13__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__14"
    // InternalUseCaseDsl.g:555:1: rule__UseCaseDescription__Group__14 : rule__UseCaseDescription__Group__14__Impl rule__UseCaseDescription__Group__15 ;
    public final void rule__UseCaseDescription__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:559:1: ( rule__UseCaseDescription__Group__14__Impl rule__UseCaseDescription__Group__15 )
            // InternalUseCaseDsl.g:560:2: rule__UseCaseDescription__Group__14__Impl rule__UseCaseDescription__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseDescription__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__14"


    // $ANTLR start "rule__UseCaseDescription__Group__14__Impl"
    // InternalUseCaseDsl.g:567:1: rule__UseCaseDescription__Group__14__Impl : ( 'specialRequirements:' ) ;
    public final void rule__UseCaseDescription__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:571:1: ( ( 'specialRequirements:' ) )
            // InternalUseCaseDsl.g:572:1: ( 'specialRequirements:' )
            {
            // InternalUseCaseDsl.g:572:1: ( 'specialRequirements:' )
            // InternalUseCaseDsl.g:573:2: 'specialRequirements:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__14__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__15"
    // InternalUseCaseDsl.g:582:1: rule__UseCaseDescription__Group__15 : rule__UseCaseDescription__Group__15__Impl rule__UseCaseDescription__Group__16 ;
    public final void rule__UseCaseDescription__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:586:1: ( rule__UseCaseDescription__Group__15__Impl rule__UseCaseDescription__Group__16 )
            // InternalUseCaseDsl.g:587:2: rule__UseCaseDescription__Group__15__Impl rule__UseCaseDescription__Group__16
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseDescription__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__15"


    // $ANTLR start "rule__UseCaseDescription__Group__15__Impl"
    // InternalUseCaseDsl.g:594:1: rule__UseCaseDescription__Group__15__Impl : ( ( rule__UseCaseDescription__SpecialRequirementsAssignment_15 )* ) ;
    public final void rule__UseCaseDescription__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:598:1: ( ( ( rule__UseCaseDescription__SpecialRequirementsAssignment_15 )* ) )
            // InternalUseCaseDsl.g:599:1: ( ( rule__UseCaseDescription__SpecialRequirementsAssignment_15 )* )
            {
            // InternalUseCaseDsl.g:599:1: ( ( rule__UseCaseDescription__SpecialRequirementsAssignment_15 )* )
            // InternalUseCaseDsl.g:600:2: ( rule__UseCaseDescription__SpecialRequirementsAssignment_15 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsAssignment_15()); 
            // InternalUseCaseDsl.g:601:2: ( rule__UseCaseDescription__SpecialRequirementsAssignment_15 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCaseDsl.g:601:3: rule__UseCaseDescription__SpecialRequirementsAssignment_15
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseCaseDescription__SpecialRequirementsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__15__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__16"
    // InternalUseCaseDsl.g:609:1: rule__UseCaseDescription__Group__16 : rule__UseCaseDescription__Group__16__Impl rule__UseCaseDescription__Group__17 ;
    public final void rule__UseCaseDescription__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:613:1: ( rule__UseCaseDescription__Group__16__Impl rule__UseCaseDescription__Group__17 )
            // InternalUseCaseDsl.g:614:2: rule__UseCaseDescription__Group__16__Impl rule__UseCaseDescription__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__UseCaseDescription__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__16"


    // $ANTLR start "rule__UseCaseDescription__Group__16__Impl"
    // InternalUseCaseDsl.g:621:1: rule__UseCaseDescription__Group__16__Impl : ( 'technologyAndDataVariations:' ) ;
    public final void rule__UseCaseDescription__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:625:1: ( ( 'technologyAndDataVariations:' ) )
            // InternalUseCaseDsl.g:626:1: ( 'technologyAndDataVariations:' )
            {
            // InternalUseCaseDsl.g:626:1: ( 'technologyAndDataVariations:' )
            // InternalUseCaseDsl.g:627:2: 'technologyAndDataVariations:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getTechnologyAndDataVariationsKeyword_16()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getTechnologyAndDataVariationsKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__16__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__17"
    // InternalUseCaseDsl.g:636:1: rule__UseCaseDescription__Group__17 : rule__UseCaseDescription__Group__17__Impl rule__UseCaseDescription__Group__18 ;
    public final void rule__UseCaseDescription__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:640:1: ( rule__UseCaseDescription__Group__17__Impl rule__UseCaseDescription__Group__18 )
            // InternalUseCaseDsl.g:641:2: rule__UseCaseDescription__Group__17__Impl rule__UseCaseDescription__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__UseCaseDescription__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__17"


    // $ANTLR start "rule__UseCaseDescription__Group__17__Impl"
    // InternalUseCaseDsl.g:648:1: rule__UseCaseDescription__Group__17__Impl : ( ( rule__UseCaseDescription__TechnologyVariationsAssignment_17 )* ) ;
    public final void rule__UseCaseDescription__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:652:1: ( ( ( rule__UseCaseDescription__TechnologyVariationsAssignment_17 )* ) )
            // InternalUseCaseDsl.g:653:1: ( ( rule__UseCaseDescription__TechnologyVariationsAssignment_17 )* )
            {
            // InternalUseCaseDsl.g:653:1: ( ( rule__UseCaseDescription__TechnologyVariationsAssignment_17 )* )
            // InternalUseCaseDsl.g:654:2: ( rule__UseCaseDescription__TechnologyVariationsAssignment_17 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getTechnologyVariationsAssignment_17()); 
            // InternalUseCaseDsl.g:655:2: ( rule__UseCaseDescription__TechnologyVariationsAssignment_17 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCaseDsl.g:655:3: rule__UseCaseDescription__TechnologyVariationsAssignment_17
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseCaseDescription__TechnologyVariationsAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getTechnologyVariationsAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__17__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__18"
    // InternalUseCaseDsl.g:663:1: rule__UseCaseDescription__Group__18 : rule__UseCaseDescription__Group__18__Impl rule__UseCaseDescription__Group__19 ;
    public final void rule__UseCaseDescription__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:667:1: ( rule__UseCaseDescription__Group__18__Impl rule__UseCaseDescription__Group__19 )
            // InternalUseCaseDsl.g:668:2: rule__UseCaseDescription__Group__18__Impl rule__UseCaseDescription__Group__19
            {
            pushFollow(FOLLOW_3);
            rule__UseCaseDescription__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__18"


    // $ANTLR start "rule__UseCaseDescription__Group__18__Impl"
    // InternalUseCaseDsl.g:675:1: rule__UseCaseDescription__Group__18__Impl : ( 'frequencyOfOccurrence:' ) ;
    public final void rule__UseCaseDescription__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:679:1: ( ( 'frequencyOfOccurrence:' ) )
            // InternalUseCaseDsl.g:680:1: ( 'frequencyOfOccurrence:' )
            {
            // InternalUseCaseDsl.g:680:1: ( 'frequencyOfOccurrence:' )
            // InternalUseCaseDsl.g:681:2: 'frequencyOfOccurrence:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getFrequencyOfOccurrenceKeyword_18()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getFrequencyOfOccurrenceKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__18__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__19"
    // InternalUseCaseDsl.g:690:1: rule__UseCaseDescription__Group__19 : rule__UseCaseDescription__Group__19__Impl rule__UseCaseDescription__Group__20 ;
    public final void rule__UseCaseDescription__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:694:1: ( rule__UseCaseDescription__Group__19__Impl rule__UseCaseDescription__Group__20 )
            // InternalUseCaseDsl.g:695:2: rule__UseCaseDescription__Group__19__Impl rule__UseCaseDescription__Group__20
            {
            pushFollow(FOLLOW_15);
            rule__UseCaseDescription__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__19"


    // $ANTLR start "rule__UseCaseDescription__Group__19__Impl"
    // InternalUseCaseDsl.g:702:1: rule__UseCaseDescription__Group__19__Impl : ( ( rule__UseCaseDescription__FrequencyAssignment_19 ) ) ;
    public final void rule__UseCaseDescription__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:706:1: ( ( ( rule__UseCaseDescription__FrequencyAssignment_19 ) ) )
            // InternalUseCaseDsl.g:707:1: ( ( rule__UseCaseDescription__FrequencyAssignment_19 ) )
            {
            // InternalUseCaseDsl.g:707:1: ( ( rule__UseCaseDescription__FrequencyAssignment_19 ) )
            // InternalUseCaseDsl.g:708:2: ( rule__UseCaseDescription__FrequencyAssignment_19 )
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getFrequencyAssignment_19()); 
            // InternalUseCaseDsl.g:709:2: ( rule__UseCaseDescription__FrequencyAssignment_19 )
            // InternalUseCaseDsl.g:709:3: rule__UseCaseDescription__FrequencyAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__FrequencyAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescriptionAccess().getFrequencyAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__19__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__20"
    // InternalUseCaseDsl.g:717:1: rule__UseCaseDescription__Group__20 : rule__UseCaseDescription__Group__20__Impl rule__UseCaseDescription__Group__21 ;
    public final void rule__UseCaseDescription__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:721:1: ( rule__UseCaseDescription__Group__20__Impl rule__UseCaseDescription__Group__21 )
            // InternalUseCaseDsl.g:722:2: rule__UseCaseDescription__Group__20__Impl rule__UseCaseDescription__Group__21
            {
            pushFollow(FOLLOW_16);
            rule__UseCaseDescription__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__20"


    // $ANTLR start "rule__UseCaseDescription__Group__20__Impl"
    // InternalUseCaseDsl.g:729:1: rule__UseCaseDescription__Group__20__Impl : ( 'openIssues:' ) ;
    public final void rule__UseCaseDescription__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:733:1: ( ( 'openIssues:' ) )
            // InternalUseCaseDsl.g:734:1: ( 'openIssues:' )
            {
            // InternalUseCaseDsl.g:734:1: ( 'openIssues:' )
            // InternalUseCaseDsl.g:735:2: 'openIssues:'
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesKeyword_20()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__20__Impl"


    // $ANTLR start "rule__UseCaseDescription__Group__21"
    // InternalUseCaseDsl.g:744:1: rule__UseCaseDescription__Group__21 : rule__UseCaseDescription__Group__21__Impl ;
    public final void rule__UseCaseDescription__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:748:1: ( rule__UseCaseDescription__Group__21__Impl )
            // InternalUseCaseDsl.g:749:2: rule__UseCaseDescription__Group__21__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDescription__Group__21__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__21"


    // $ANTLR start "rule__UseCaseDescription__Group__21__Impl"
    // InternalUseCaseDsl.g:755:1: rule__UseCaseDescription__Group__21__Impl : ( ( rule__UseCaseDescription__OpenIssuesAssignment_21 )* ) ;
    public final void rule__UseCaseDescription__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:759:1: ( ( ( rule__UseCaseDescription__OpenIssuesAssignment_21 )* ) )
            // InternalUseCaseDsl.g:760:1: ( ( rule__UseCaseDescription__OpenIssuesAssignment_21 )* )
            {
            // InternalUseCaseDsl.g:760:1: ( ( rule__UseCaseDescription__OpenIssuesAssignment_21 )* )
            // InternalUseCaseDsl.g:761:2: ( rule__UseCaseDescription__OpenIssuesAssignment_21 )*
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesAssignment_21()); 
            // InternalUseCaseDsl.g:762:2: ( rule__UseCaseDescription__OpenIssuesAssignment_21 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDsl.g:762:3: rule__UseCaseDescription__OpenIssuesAssignment_21
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseCaseDescription__OpenIssuesAssignment_21();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__Group__21__Impl"


    // $ANTLR start "rule__BulletItem__Group__0"
    // InternalUseCaseDsl.g:771:1: rule__BulletItem__Group__0 : rule__BulletItem__Group__0__Impl rule__BulletItem__Group__1 ;
    public final void rule__BulletItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:775:1: ( rule__BulletItem__Group__0__Impl rule__BulletItem__Group__1 )
            // InternalUseCaseDsl.g:776:2: rule__BulletItem__Group__0__Impl rule__BulletItem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BulletItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BulletItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BulletItem__Group__0"


    // $ANTLR start "rule__BulletItem__Group__0__Impl"
    // InternalUseCaseDsl.g:783:1: rule__BulletItem__Group__0__Impl : ( '-' ) ;
    public final void rule__BulletItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:787:1: ( ( '-' ) )
            // InternalUseCaseDsl.g:788:1: ( '-' )
            {
            // InternalUseCaseDsl.g:788:1: ( '-' )
            // InternalUseCaseDsl.g:789:2: '-'
            {
             before(grammarAccess.getBulletItemAccess().getHyphenMinusKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBulletItemAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BulletItem__Group__0__Impl"


    // $ANTLR start "rule__BulletItem__Group__1"
    // InternalUseCaseDsl.g:798:1: rule__BulletItem__Group__1 : rule__BulletItem__Group__1__Impl ;
    public final void rule__BulletItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:802:1: ( rule__BulletItem__Group__1__Impl )
            // InternalUseCaseDsl.g:803:2: rule__BulletItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BulletItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BulletItem__Group__1"


    // $ANTLR start "rule__BulletItem__Group__1__Impl"
    // InternalUseCaseDsl.g:809:1: rule__BulletItem__Group__1__Impl : ( ( rule__BulletItem__TextAssignment_1 ) ) ;
    public final void rule__BulletItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:813:1: ( ( ( rule__BulletItem__TextAssignment_1 ) ) )
            // InternalUseCaseDsl.g:814:1: ( ( rule__BulletItem__TextAssignment_1 ) )
            {
            // InternalUseCaseDsl.g:814:1: ( ( rule__BulletItem__TextAssignment_1 ) )
            // InternalUseCaseDsl.g:815:2: ( rule__BulletItem__TextAssignment_1 )
            {
             before(grammarAccess.getBulletItemAccess().getTextAssignment_1()); 
            // InternalUseCaseDsl.g:816:2: ( rule__BulletItem__TextAssignment_1 )
            // InternalUseCaseDsl.g:816:3: rule__BulletItem__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BulletItem__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBulletItemAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BulletItem__Group__1__Impl"


    // $ANTLR start "rule__NumberedStep__Group__0"
    // InternalUseCaseDsl.g:825:1: rule__NumberedStep__Group__0 : rule__NumberedStep__Group__0__Impl rule__NumberedStep__Group__1 ;
    public final void rule__NumberedStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:829:1: ( rule__NumberedStep__Group__0__Impl rule__NumberedStep__Group__1 )
            // InternalUseCaseDsl.g:830:2: rule__NumberedStep__Group__0__Impl rule__NumberedStep__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NumberedStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberedStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__Group__0"


    // $ANTLR start "rule__NumberedStep__Group__0__Impl"
    // InternalUseCaseDsl.g:837:1: rule__NumberedStep__Group__0__Impl : ( ( rule__NumberedStep__NumberAssignment_0 ) ) ;
    public final void rule__NumberedStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:841:1: ( ( ( rule__NumberedStep__NumberAssignment_0 ) ) )
            // InternalUseCaseDsl.g:842:1: ( ( rule__NumberedStep__NumberAssignment_0 ) )
            {
            // InternalUseCaseDsl.g:842:1: ( ( rule__NumberedStep__NumberAssignment_0 ) )
            // InternalUseCaseDsl.g:843:2: ( rule__NumberedStep__NumberAssignment_0 )
            {
             before(grammarAccess.getNumberedStepAccess().getNumberAssignment_0()); 
            // InternalUseCaseDsl.g:844:2: ( rule__NumberedStep__NumberAssignment_0 )
            // InternalUseCaseDsl.g:844:3: rule__NumberedStep__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberedStep__NumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberedStepAccess().getNumberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__Group__0__Impl"


    // $ANTLR start "rule__NumberedStep__Group__1"
    // InternalUseCaseDsl.g:852:1: rule__NumberedStep__Group__1 : rule__NumberedStep__Group__1__Impl rule__NumberedStep__Group__2 ;
    public final void rule__NumberedStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:856:1: ( rule__NumberedStep__Group__1__Impl rule__NumberedStep__Group__2 )
            // InternalUseCaseDsl.g:857:2: rule__NumberedStep__Group__1__Impl rule__NumberedStep__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__NumberedStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberedStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__Group__1"


    // $ANTLR start "rule__NumberedStep__Group__1__Impl"
    // InternalUseCaseDsl.g:864:1: rule__NumberedStep__Group__1__Impl : ( '.' ) ;
    public final void rule__NumberedStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:868:1: ( ( '.' ) )
            // InternalUseCaseDsl.g:869:1: ( '.' )
            {
            // InternalUseCaseDsl.g:869:1: ( '.' )
            // InternalUseCaseDsl.g:870:2: '.'
            {
             before(grammarAccess.getNumberedStepAccess().getFullStopKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNumberedStepAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__Group__1__Impl"


    // $ANTLR start "rule__NumberedStep__Group__2"
    // InternalUseCaseDsl.g:879:1: rule__NumberedStep__Group__2 : rule__NumberedStep__Group__2__Impl ;
    public final void rule__NumberedStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:883:1: ( rule__NumberedStep__Group__2__Impl )
            // InternalUseCaseDsl.g:884:2: rule__NumberedStep__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberedStep__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__Group__2"


    // $ANTLR start "rule__NumberedStep__Group__2__Impl"
    // InternalUseCaseDsl.g:890:1: rule__NumberedStep__Group__2__Impl : ( ( rule__NumberedStep__TextAssignment_2 ) ) ;
    public final void rule__NumberedStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:894:1: ( ( ( rule__NumberedStep__TextAssignment_2 ) ) )
            // InternalUseCaseDsl.g:895:1: ( ( rule__NumberedStep__TextAssignment_2 ) )
            {
            // InternalUseCaseDsl.g:895:1: ( ( rule__NumberedStep__TextAssignment_2 ) )
            // InternalUseCaseDsl.g:896:2: ( rule__NumberedStep__TextAssignment_2 )
            {
             before(grammarAccess.getNumberedStepAccess().getTextAssignment_2()); 
            // InternalUseCaseDsl.g:897:2: ( rule__NumberedStep__TextAssignment_2 )
            // InternalUseCaseDsl.g:897:3: rule__NumberedStep__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumberedStep__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberedStepAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__Group__2__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__0"
    // InternalUseCaseDsl.g:906:1: rule__ExtensionStep__Group__0 : rule__ExtensionStep__Group__0__Impl rule__ExtensionStep__Group__1 ;
    public final void rule__ExtensionStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:910:1: ( rule__ExtensionStep__Group__0__Impl rule__ExtensionStep__Group__1 )
            // InternalUseCaseDsl.g:911:2: rule__ExtensionStep__Group__0__Impl rule__ExtensionStep__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExtensionStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__0"


    // $ANTLR start "rule__ExtensionStep__Group__0__Impl"
    // InternalUseCaseDsl.g:918:1: rule__ExtensionStep__Group__0__Impl : ( ( rule__ExtensionStep__NumberAssignment_0 ) ) ;
    public final void rule__ExtensionStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:922:1: ( ( ( rule__ExtensionStep__NumberAssignment_0 ) ) )
            // InternalUseCaseDsl.g:923:1: ( ( rule__ExtensionStep__NumberAssignment_0 ) )
            {
            // InternalUseCaseDsl.g:923:1: ( ( rule__ExtensionStep__NumberAssignment_0 ) )
            // InternalUseCaseDsl.g:924:2: ( rule__ExtensionStep__NumberAssignment_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNumberAssignment_0()); 
            // InternalUseCaseDsl.g:925:2: ( rule__ExtensionStep__NumberAssignment_0 )
            // InternalUseCaseDsl.g:925:3: rule__ExtensionStep__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__NumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getNumberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__0__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__1"
    // InternalUseCaseDsl.g:933:1: rule__ExtensionStep__Group__1 : rule__ExtensionStep__Group__1__Impl rule__ExtensionStep__Group__2 ;
    public final void rule__ExtensionStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:937:1: ( rule__ExtensionStep__Group__1__Impl rule__ExtensionStep__Group__2 )
            // InternalUseCaseDsl.g:938:2: rule__ExtensionStep__Group__1__Impl rule__ExtensionStep__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ExtensionStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__1"


    // $ANTLR start "rule__ExtensionStep__Group__1__Impl"
    // InternalUseCaseDsl.g:945:1: rule__ExtensionStep__Group__1__Impl : ( ( rule__ExtensionStep__LetterAssignment_1 ) ) ;
    public final void rule__ExtensionStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:949:1: ( ( ( rule__ExtensionStep__LetterAssignment_1 ) ) )
            // InternalUseCaseDsl.g:950:1: ( ( rule__ExtensionStep__LetterAssignment_1 ) )
            {
            // InternalUseCaseDsl.g:950:1: ( ( rule__ExtensionStep__LetterAssignment_1 ) )
            // InternalUseCaseDsl.g:951:2: ( rule__ExtensionStep__LetterAssignment_1 )
            {
             before(grammarAccess.getExtensionStepAccess().getLetterAssignment_1()); 
            // InternalUseCaseDsl.g:952:2: ( rule__ExtensionStep__LetterAssignment_1 )
            // InternalUseCaseDsl.g:952:3: rule__ExtensionStep__LetterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__LetterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getLetterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__1__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__2"
    // InternalUseCaseDsl.g:960:1: rule__ExtensionStep__Group__2 : rule__ExtensionStep__Group__2__Impl rule__ExtensionStep__Group__3 ;
    public final void rule__ExtensionStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:964:1: ( rule__ExtensionStep__Group__2__Impl rule__ExtensionStep__Group__3 )
            // InternalUseCaseDsl.g:965:2: rule__ExtensionStep__Group__2__Impl rule__ExtensionStep__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ExtensionStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__2"


    // $ANTLR start "rule__ExtensionStep__Group__2__Impl"
    // InternalUseCaseDsl.g:972:1: rule__ExtensionStep__Group__2__Impl : ( '.' ) ;
    public final void rule__ExtensionStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:976:1: ( ( '.' ) )
            // InternalUseCaseDsl.g:977:1: ( '.' )
            {
            // InternalUseCaseDsl.g:977:1: ( '.' )
            // InternalUseCaseDsl.g:978:2: '.'
            {
             before(grammarAccess.getExtensionStepAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__2__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__3"
    // InternalUseCaseDsl.g:987:1: rule__ExtensionStep__Group__3 : rule__ExtensionStep__Group__3__Impl rule__ExtensionStep__Group__4 ;
    public final void rule__ExtensionStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:991:1: ( rule__ExtensionStep__Group__3__Impl rule__ExtensionStep__Group__4 )
            // InternalUseCaseDsl.g:992:2: rule__ExtensionStep__Group__3__Impl rule__ExtensionStep__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ExtensionStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__3"


    // $ANTLR start "rule__ExtensionStep__Group__3__Impl"
    // InternalUseCaseDsl.g:999:1: rule__ExtensionStep__Group__3__Impl : ( ( rule__ExtensionStep__TextAssignment_3 ) ) ;
    public final void rule__ExtensionStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1003:1: ( ( ( rule__ExtensionStep__TextAssignment_3 ) ) )
            // InternalUseCaseDsl.g:1004:1: ( ( rule__ExtensionStep__TextAssignment_3 ) )
            {
            // InternalUseCaseDsl.g:1004:1: ( ( rule__ExtensionStep__TextAssignment_3 ) )
            // InternalUseCaseDsl.g:1005:2: ( rule__ExtensionStep__TextAssignment_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getTextAssignment_3()); 
            // InternalUseCaseDsl.g:1006:2: ( rule__ExtensionStep__TextAssignment_3 )
            // InternalUseCaseDsl.g:1006:3: rule__ExtensionStep__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__3__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__4"
    // InternalUseCaseDsl.g:1014:1: rule__ExtensionStep__Group__4 : rule__ExtensionStep__Group__4__Impl ;
    public final void rule__ExtensionStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1018:1: ( rule__ExtensionStep__Group__4__Impl )
            // InternalUseCaseDsl.g:1019:2: rule__ExtensionStep__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__4"


    // $ANTLR start "rule__ExtensionStep__Group__4__Impl"
    // InternalUseCaseDsl.g:1025:1: rule__ExtensionStep__Group__4__Impl : ( ( rule__ExtensionStep__SubstepsAssignment_4 )* ) ;
    public final void rule__ExtensionStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1029:1: ( ( ( rule__ExtensionStep__SubstepsAssignment_4 )* ) )
            // InternalUseCaseDsl.g:1030:1: ( ( rule__ExtensionStep__SubstepsAssignment_4 )* )
            {
            // InternalUseCaseDsl.g:1030:1: ( ( rule__ExtensionStep__SubstepsAssignment_4 )* )
            // InternalUseCaseDsl.g:1031:2: ( rule__ExtensionStep__SubstepsAssignment_4 )*
            {
             before(grammarAccess.getExtensionStepAccess().getSubstepsAssignment_4()); 
            // InternalUseCaseDsl.g:1032:2: ( rule__ExtensionStep__SubstepsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_ID) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==23) ) {
                            int LA9_4 = input.LA(4);

                            if ( (LA9_4==RULE_INT) ) {
                                alt9=1;
                            }


                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCaseDsl.g:1032:3: rule__ExtensionStep__SubstepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ExtensionStep__SubstepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExtensionStepAccess().getSubstepsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group__4__Impl"


    // $ANTLR start "rule__ExtensionSubStep__Group__0"
    // InternalUseCaseDsl.g:1041:1: rule__ExtensionSubStep__Group__0 : rule__ExtensionSubStep__Group__0__Impl rule__ExtensionSubStep__Group__1 ;
    public final void rule__ExtensionSubStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1045:1: ( rule__ExtensionSubStep__Group__0__Impl rule__ExtensionSubStep__Group__1 )
            // InternalUseCaseDsl.g:1046:2: rule__ExtensionSubStep__Group__0__Impl rule__ExtensionSubStep__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExtensionSubStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__0"


    // $ANTLR start "rule__ExtensionSubStep__Group__0__Impl"
    // InternalUseCaseDsl.g:1053:1: rule__ExtensionSubStep__Group__0__Impl : ( ( rule__ExtensionSubStep__NumberAssignment_0 ) ) ;
    public final void rule__ExtensionSubStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1057:1: ( ( ( rule__ExtensionSubStep__NumberAssignment_0 ) ) )
            // InternalUseCaseDsl.g:1058:1: ( ( rule__ExtensionSubStep__NumberAssignment_0 ) )
            {
            // InternalUseCaseDsl.g:1058:1: ( ( rule__ExtensionSubStep__NumberAssignment_0 ) )
            // InternalUseCaseDsl.g:1059:2: ( rule__ExtensionSubStep__NumberAssignment_0 )
            {
             before(grammarAccess.getExtensionSubStepAccess().getNumberAssignment_0()); 
            // InternalUseCaseDsl.g:1060:2: ( rule__ExtensionSubStep__NumberAssignment_0 )
            // InternalUseCaseDsl.g:1060:3: rule__ExtensionSubStep__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__NumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionSubStepAccess().getNumberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__0__Impl"


    // $ANTLR start "rule__ExtensionSubStep__Group__1"
    // InternalUseCaseDsl.g:1068:1: rule__ExtensionSubStep__Group__1 : rule__ExtensionSubStep__Group__1__Impl rule__ExtensionSubStep__Group__2 ;
    public final void rule__ExtensionSubStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1072:1: ( rule__ExtensionSubStep__Group__1__Impl rule__ExtensionSubStep__Group__2 )
            // InternalUseCaseDsl.g:1073:2: rule__ExtensionSubStep__Group__1__Impl rule__ExtensionSubStep__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ExtensionSubStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__1"


    // $ANTLR start "rule__ExtensionSubStep__Group__1__Impl"
    // InternalUseCaseDsl.g:1080:1: rule__ExtensionSubStep__Group__1__Impl : ( ( rule__ExtensionSubStep__LetterAssignment_1 ) ) ;
    public final void rule__ExtensionSubStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1084:1: ( ( ( rule__ExtensionSubStep__LetterAssignment_1 ) ) )
            // InternalUseCaseDsl.g:1085:1: ( ( rule__ExtensionSubStep__LetterAssignment_1 ) )
            {
            // InternalUseCaseDsl.g:1085:1: ( ( rule__ExtensionSubStep__LetterAssignment_1 ) )
            // InternalUseCaseDsl.g:1086:2: ( rule__ExtensionSubStep__LetterAssignment_1 )
            {
             before(grammarAccess.getExtensionSubStepAccess().getLetterAssignment_1()); 
            // InternalUseCaseDsl.g:1087:2: ( rule__ExtensionSubStep__LetterAssignment_1 )
            // InternalUseCaseDsl.g:1087:3: rule__ExtensionSubStep__LetterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__LetterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionSubStepAccess().getLetterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__1__Impl"


    // $ANTLR start "rule__ExtensionSubStep__Group__2"
    // InternalUseCaseDsl.g:1095:1: rule__ExtensionSubStep__Group__2 : rule__ExtensionSubStep__Group__2__Impl rule__ExtensionSubStep__Group__3 ;
    public final void rule__ExtensionSubStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1099:1: ( rule__ExtensionSubStep__Group__2__Impl rule__ExtensionSubStep__Group__3 )
            // InternalUseCaseDsl.g:1100:2: rule__ExtensionSubStep__Group__2__Impl rule__ExtensionSubStep__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ExtensionSubStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__2"


    // $ANTLR start "rule__ExtensionSubStep__Group__2__Impl"
    // InternalUseCaseDsl.g:1107:1: rule__ExtensionSubStep__Group__2__Impl : ( '.' ) ;
    public final void rule__ExtensionSubStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1111:1: ( ( '.' ) )
            // InternalUseCaseDsl.g:1112:1: ( '.' )
            {
            // InternalUseCaseDsl.g:1112:1: ( '.' )
            // InternalUseCaseDsl.g:1113:2: '.'
            {
             before(grammarAccess.getExtensionSubStepAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExtensionSubStepAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__2__Impl"


    // $ANTLR start "rule__ExtensionSubStep__Group__3"
    // InternalUseCaseDsl.g:1122:1: rule__ExtensionSubStep__Group__3 : rule__ExtensionSubStep__Group__3__Impl rule__ExtensionSubStep__Group__4 ;
    public final void rule__ExtensionSubStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1126:1: ( rule__ExtensionSubStep__Group__3__Impl rule__ExtensionSubStep__Group__4 )
            // InternalUseCaseDsl.g:1127:2: rule__ExtensionSubStep__Group__3__Impl rule__ExtensionSubStep__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ExtensionSubStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__3"


    // $ANTLR start "rule__ExtensionSubStep__Group__3__Impl"
    // InternalUseCaseDsl.g:1134:1: rule__ExtensionSubStep__Group__3__Impl : ( ( rule__ExtensionSubStep__SubnumberAssignment_3 ) ) ;
    public final void rule__ExtensionSubStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1138:1: ( ( ( rule__ExtensionSubStep__SubnumberAssignment_3 ) ) )
            // InternalUseCaseDsl.g:1139:1: ( ( rule__ExtensionSubStep__SubnumberAssignment_3 ) )
            {
            // InternalUseCaseDsl.g:1139:1: ( ( rule__ExtensionSubStep__SubnumberAssignment_3 ) )
            // InternalUseCaseDsl.g:1140:2: ( rule__ExtensionSubStep__SubnumberAssignment_3 )
            {
             before(grammarAccess.getExtensionSubStepAccess().getSubnumberAssignment_3()); 
            // InternalUseCaseDsl.g:1141:2: ( rule__ExtensionSubStep__SubnumberAssignment_3 )
            // InternalUseCaseDsl.g:1141:3: rule__ExtensionSubStep__SubnumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__SubnumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionSubStepAccess().getSubnumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__3__Impl"


    // $ANTLR start "rule__ExtensionSubStep__Group__4"
    // InternalUseCaseDsl.g:1149:1: rule__ExtensionSubStep__Group__4 : rule__ExtensionSubStep__Group__4__Impl rule__ExtensionSubStep__Group__5 ;
    public final void rule__ExtensionSubStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1153:1: ( rule__ExtensionSubStep__Group__4__Impl rule__ExtensionSubStep__Group__5 )
            // InternalUseCaseDsl.g:1154:2: rule__ExtensionSubStep__Group__4__Impl rule__ExtensionSubStep__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ExtensionSubStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__4"


    // $ANTLR start "rule__ExtensionSubStep__Group__4__Impl"
    // InternalUseCaseDsl.g:1161:1: rule__ExtensionSubStep__Group__4__Impl : ( '.' ) ;
    public final void rule__ExtensionSubStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1165:1: ( ( '.' ) )
            // InternalUseCaseDsl.g:1166:1: ( '.' )
            {
            // InternalUseCaseDsl.g:1166:1: ( '.' )
            // InternalUseCaseDsl.g:1167:2: '.'
            {
             before(grammarAccess.getExtensionSubStepAccess().getFullStopKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExtensionSubStepAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__4__Impl"


    // $ANTLR start "rule__ExtensionSubStep__Group__5"
    // InternalUseCaseDsl.g:1176:1: rule__ExtensionSubStep__Group__5 : rule__ExtensionSubStep__Group__5__Impl ;
    public final void rule__ExtensionSubStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1180:1: ( rule__ExtensionSubStep__Group__5__Impl )
            // InternalUseCaseDsl.g:1181:2: rule__ExtensionSubStep__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__5"


    // $ANTLR start "rule__ExtensionSubStep__Group__5__Impl"
    // InternalUseCaseDsl.g:1187:1: rule__ExtensionSubStep__Group__5__Impl : ( ( rule__ExtensionSubStep__TextAssignment_5 ) ) ;
    public final void rule__ExtensionSubStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1191:1: ( ( ( rule__ExtensionSubStep__TextAssignment_5 ) ) )
            // InternalUseCaseDsl.g:1192:1: ( ( rule__ExtensionSubStep__TextAssignment_5 ) )
            {
            // InternalUseCaseDsl.g:1192:1: ( ( rule__ExtensionSubStep__TextAssignment_5 ) )
            // InternalUseCaseDsl.g:1193:2: ( rule__ExtensionSubStep__TextAssignment_5 )
            {
             before(grammarAccess.getExtensionSubStepAccess().getTextAssignment_5()); 
            // InternalUseCaseDsl.g:1194:2: ( rule__ExtensionSubStep__TextAssignment_5 )
            // InternalUseCaseDsl.g:1194:3: rule__ExtensionSubStep__TextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionSubStep__TextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExtensionSubStepAccess().getTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__Group__5__Impl"


    // $ANTLR start "rule__UseCaseDescription__NameAssignment_1"
    // InternalUseCaseDsl.g:1203:1: rule__UseCaseDescription__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCaseDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1207:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:1208:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:1208:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:1209:3: RULE_STRING
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__NameAssignment_1"


    // $ANTLR start "rule__UseCaseDescription__PrimaryActorAssignment_3"
    // InternalUseCaseDsl.g:1218:1: rule__UseCaseDescription__PrimaryActorAssignment_3 : ( RULE_STRING ) ;
    public final void rule__UseCaseDescription__PrimaryActorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1222:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:1223:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:1223:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:1224:3: RULE_STRING
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__PrimaryActorAssignment_3"


    // $ANTLR start "rule__UseCaseDescription__StakeholdersAssignment_5"
    // InternalUseCaseDsl.g:1233:1: rule__UseCaseDescription__StakeholdersAssignment_5 : ( ruleBulletItem ) ;
    public final void rule__UseCaseDescription__StakeholdersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1237:1: ( ( ruleBulletItem ) )
            // InternalUseCaseDsl.g:1238:2: ( ruleBulletItem )
            {
            // InternalUseCaseDsl.g:1238:2: ( ruleBulletItem )
            // InternalUseCaseDsl.g:1239:3: ruleBulletItem
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getStakeholdersBulletItemParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBulletItem();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getStakeholdersBulletItemParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__StakeholdersAssignment_5"


    // $ANTLR start "rule__UseCaseDescription__PreconditionsAssignment_7"
    // InternalUseCaseDsl.g:1248:1: rule__UseCaseDescription__PreconditionsAssignment_7 : ( ruleBulletItem ) ;
    public final void rule__UseCaseDescription__PreconditionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1252:1: ( ( ruleBulletItem ) )
            // InternalUseCaseDsl.g:1253:2: ( ruleBulletItem )
            {
            // InternalUseCaseDsl.g:1253:2: ( ruleBulletItem )
            // InternalUseCaseDsl.g:1254:3: ruleBulletItem
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPreconditionsBulletItemParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBulletItem();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getPreconditionsBulletItemParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__PreconditionsAssignment_7"


    // $ANTLR start "rule__UseCaseDescription__PostconditionsAssignment_9"
    // InternalUseCaseDsl.g:1263:1: rule__UseCaseDescription__PostconditionsAssignment_9 : ( ruleBulletItem ) ;
    public final void rule__UseCaseDescription__PostconditionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1267:1: ( ( ruleBulletItem ) )
            // InternalUseCaseDsl.g:1268:2: ( ruleBulletItem )
            {
            // InternalUseCaseDsl.g:1268:2: ( ruleBulletItem )
            // InternalUseCaseDsl.g:1269:3: ruleBulletItem
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getPostconditionsBulletItemParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBulletItem();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getPostconditionsBulletItemParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__PostconditionsAssignment_9"


    // $ANTLR start "rule__UseCaseDescription__MainStepsAssignment_11"
    // InternalUseCaseDsl.g:1278:1: rule__UseCaseDescription__MainStepsAssignment_11 : ( ruleNumberedStep ) ;
    public final void rule__UseCaseDescription__MainStepsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1282:1: ( ( ruleNumberedStep ) )
            // InternalUseCaseDsl.g:1283:2: ( ruleNumberedStep )
            {
            // InternalUseCaseDsl.g:1283:2: ( ruleNumberedStep )
            // InternalUseCaseDsl.g:1284:3: ruleNumberedStep
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getMainStepsNumberedStepParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberedStep();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getMainStepsNumberedStepParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__MainStepsAssignment_11"


    // $ANTLR start "rule__UseCaseDescription__ExtensionsAssignment_13"
    // InternalUseCaseDsl.g:1293:1: rule__UseCaseDescription__ExtensionsAssignment_13 : ( ruleExtensionStep ) ;
    public final void rule__UseCaseDescription__ExtensionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1297:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDsl.g:1298:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDsl.g:1298:2: ( ruleExtensionStep )
            // InternalUseCaseDsl.g:1299:3: ruleExtensionStep
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getExtensionsExtensionStepParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleExtensionStep();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getExtensionsExtensionStepParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__ExtensionsAssignment_13"


    // $ANTLR start "rule__UseCaseDescription__SpecialRequirementsAssignment_15"
    // InternalUseCaseDsl.g:1308:1: rule__UseCaseDescription__SpecialRequirementsAssignment_15 : ( ruleBulletItem ) ;
    public final void rule__UseCaseDescription__SpecialRequirementsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1312:1: ( ( ruleBulletItem ) )
            // InternalUseCaseDsl.g:1313:2: ( ruleBulletItem )
            {
            // InternalUseCaseDsl.g:1313:2: ( ruleBulletItem )
            // InternalUseCaseDsl.g:1314:3: ruleBulletItem
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsBulletItemParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleBulletItem();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsBulletItemParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__SpecialRequirementsAssignment_15"


    // $ANTLR start "rule__UseCaseDescription__TechnologyVariationsAssignment_17"
    // InternalUseCaseDsl.g:1323:1: rule__UseCaseDescription__TechnologyVariationsAssignment_17 : ( ruleBulletItem ) ;
    public final void rule__UseCaseDescription__TechnologyVariationsAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1327:1: ( ( ruleBulletItem ) )
            // InternalUseCaseDsl.g:1328:2: ( ruleBulletItem )
            {
            // InternalUseCaseDsl.g:1328:2: ( ruleBulletItem )
            // InternalUseCaseDsl.g:1329:3: ruleBulletItem
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getTechnologyVariationsBulletItemParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleBulletItem();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getTechnologyVariationsBulletItemParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__TechnologyVariationsAssignment_17"


    // $ANTLR start "rule__UseCaseDescription__FrequencyAssignment_19"
    // InternalUseCaseDsl.g:1338:1: rule__UseCaseDescription__FrequencyAssignment_19 : ( RULE_STRING ) ;
    public final void rule__UseCaseDescription__FrequencyAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1342:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:1343:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:1343:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:1344:3: RULE_STRING
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getFrequencySTRINGTerminalRuleCall_19_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescriptionAccess().getFrequencySTRINGTerminalRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__FrequencyAssignment_19"


    // $ANTLR start "rule__UseCaseDescription__OpenIssuesAssignment_21"
    // InternalUseCaseDsl.g:1353:1: rule__UseCaseDescription__OpenIssuesAssignment_21 : ( ruleBulletItem ) ;
    public final void rule__UseCaseDescription__OpenIssuesAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1357:1: ( ( ruleBulletItem ) )
            // InternalUseCaseDsl.g:1358:2: ( ruleBulletItem )
            {
            // InternalUseCaseDsl.g:1358:2: ( ruleBulletItem )
            // InternalUseCaseDsl.g:1359:3: ruleBulletItem
            {
             before(grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesBulletItemParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleBulletItem();

            state._fsp--;

             after(grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesBulletItemParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDescription__OpenIssuesAssignment_21"


    // $ANTLR start "rule__BulletItem__TextAssignment_1"
    // InternalUseCaseDsl.g:1368:1: rule__BulletItem__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BulletItem__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1372:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:1373:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:1373:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:1374:3: RULE_STRING
            {
             before(grammarAccess.getBulletItemAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBulletItemAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BulletItem__TextAssignment_1"


    // $ANTLR start "rule__NumberedStep__NumberAssignment_0"
    // InternalUseCaseDsl.g:1383:1: rule__NumberedStep__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumberedStep__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1387:1: ( ( RULE_INT ) )
            // InternalUseCaseDsl.g:1388:2: ( RULE_INT )
            {
            // InternalUseCaseDsl.g:1388:2: ( RULE_INT )
            // InternalUseCaseDsl.g:1389:3: RULE_INT
            {
             before(grammarAccess.getNumberedStepAccess().getNumberINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberedStepAccess().getNumberINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__NumberAssignment_0"


    // $ANTLR start "rule__NumberedStep__TextAssignment_2"
    // InternalUseCaseDsl.g:1398:1: rule__NumberedStep__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__NumberedStep__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1402:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:1403:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:1403:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:1404:3: RULE_STRING
            {
             before(grammarAccess.getNumberedStepAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumberedStepAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedStep__TextAssignment_2"


    // $ANTLR start "rule__ExtensionStep__NumberAssignment_0"
    // InternalUseCaseDsl.g:1413:1: rule__ExtensionStep__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__ExtensionStep__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1417:1: ( ( RULE_INT ) )
            // InternalUseCaseDsl.g:1418:2: ( RULE_INT )
            {
            // InternalUseCaseDsl.g:1418:2: ( RULE_INT )
            // InternalUseCaseDsl.g:1419:3: RULE_INT
            {
             before(grammarAccess.getExtensionStepAccess().getNumberINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getNumberINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__NumberAssignment_0"


    // $ANTLR start "rule__ExtensionStep__LetterAssignment_1"
    // InternalUseCaseDsl.g:1428:1: rule__ExtensionStep__LetterAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExtensionStep__LetterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1432:1: ( ( RULE_ID ) )
            // InternalUseCaseDsl.g:1433:2: ( RULE_ID )
            {
            // InternalUseCaseDsl.g:1433:2: ( RULE_ID )
            // InternalUseCaseDsl.g:1434:3: RULE_ID
            {
             before(grammarAccess.getExtensionStepAccess().getLetterIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getLetterIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__LetterAssignment_1"


    // $ANTLR start "rule__ExtensionStep__TextAssignment_3"
    // InternalUseCaseDsl.g:1443:1: rule__ExtensionStep__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExtensionStep__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1447:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:1448:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:1448:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:1449:3: RULE_STRING
            {
             before(grammarAccess.getExtensionStepAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__TextAssignment_3"


    // $ANTLR start "rule__ExtensionStep__SubstepsAssignment_4"
    // InternalUseCaseDsl.g:1458:1: rule__ExtensionStep__SubstepsAssignment_4 : ( ruleExtensionSubStep ) ;
    public final void rule__ExtensionStep__SubstepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1462:1: ( ( ruleExtensionSubStep ) )
            // InternalUseCaseDsl.g:1463:2: ( ruleExtensionSubStep )
            {
            // InternalUseCaseDsl.g:1463:2: ( ruleExtensionSubStep )
            // InternalUseCaseDsl.g:1464:3: ruleExtensionSubStep
            {
             before(grammarAccess.getExtensionStepAccess().getSubstepsExtensionSubStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExtensionSubStep();

            state._fsp--;

             after(grammarAccess.getExtensionStepAccess().getSubstepsExtensionSubStepParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__SubstepsAssignment_4"


    // $ANTLR start "rule__ExtensionSubStep__NumberAssignment_0"
    // InternalUseCaseDsl.g:1473:1: rule__ExtensionSubStep__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__ExtensionSubStep__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1477:1: ( ( RULE_INT ) )
            // InternalUseCaseDsl.g:1478:2: ( RULE_INT )
            {
            // InternalUseCaseDsl.g:1478:2: ( RULE_INT )
            // InternalUseCaseDsl.g:1479:3: RULE_INT
            {
             before(grammarAccess.getExtensionSubStepAccess().getNumberINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionSubStepAccess().getNumberINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__NumberAssignment_0"


    // $ANTLR start "rule__ExtensionSubStep__LetterAssignment_1"
    // InternalUseCaseDsl.g:1488:1: rule__ExtensionSubStep__LetterAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExtensionSubStep__LetterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1492:1: ( ( RULE_ID ) )
            // InternalUseCaseDsl.g:1493:2: ( RULE_ID )
            {
            // InternalUseCaseDsl.g:1493:2: ( RULE_ID )
            // InternalUseCaseDsl.g:1494:3: RULE_ID
            {
             before(grammarAccess.getExtensionSubStepAccess().getLetterIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtensionSubStepAccess().getLetterIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__LetterAssignment_1"


    // $ANTLR start "rule__ExtensionSubStep__SubnumberAssignment_3"
    // InternalUseCaseDsl.g:1503:1: rule__ExtensionSubStep__SubnumberAssignment_3 : ( RULE_INT ) ;
    public final void rule__ExtensionSubStep__SubnumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1507:1: ( ( RULE_INT ) )
            // InternalUseCaseDsl.g:1508:2: ( RULE_INT )
            {
            // InternalUseCaseDsl.g:1508:2: ( RULE_INT )
            // InternalUseCaseDsl.g:1509:3: RULE_INT
            {
             before(grammarAccess.getExtensionSubStepAccess().getSubnumberINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionSubStepAccess().getSubnumberINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__SubnumberAssignment_3"


    // $ANTLR start "rule__ExtensionSubStep__TextAssignment_5"
    // InternalUseCaseDsl.g:1518:1: rule__ExtensionSubStep__TextAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ExtensionSubStep__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:1522:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:1523:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:1523:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:1524:3: RULE_STRING
            {
             before(grammarAccess.getExtensionSubStepAccess().getTextSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtensionSubStepAccess().getTextSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionSubStep__TextAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});

}