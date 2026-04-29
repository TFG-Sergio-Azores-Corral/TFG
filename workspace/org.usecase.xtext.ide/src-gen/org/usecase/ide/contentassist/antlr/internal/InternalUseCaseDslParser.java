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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'usecase'", "'actorPrimario:'", "'descripcion:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

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



    // $ANTLR start "entryRuleModel"
    // InternalUseCaseDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUseCaseDsl.g:54:1: ( ruleModel EOF )
            // InternalUseCaseDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUseCaseDsl.g:62:1: ruleModel : ( ( rule__Model__UsecasesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:66:2: ( ( ( rule__Model__UsecasesAssignment )* ) )
            // InternalUseCaseDsl.g:67:2: ( ( rule__Model__UsecasesAssignment )* )
            {
            // InternalUseCaseDsl.g:67:2: ( ( rule__Model__UsecasesAssignment )* )
            // InternalUseCaseDsl.g:68:3: ( rule__Model__UsecasesAssignment )*
            {
             before(grammarAccess.getModelAccess().getUsecasesAssignment()); 
            // InternalUseCaseDsl.g:69:3: ( rule__Model__UsecasesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDsl.g:69:4: rule__Model__UsecasesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__UsecasesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUsecasesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUseCaseDesc"
    // InternalUseCaseDsl.g:78:1: entryRuleUseCaseDesc : ruleUseCaseDesc EOF ;
    public final void entryRuleUseCaseDesc() throws RecognitionException {
        try {
            // InternalUseCaseDsl.g:79:1: ( ruleUseCaseDesc EOF )
            // InternalUseCaseDsl.g:80:1: ruleUseCaseDesc EOF
            {
             before(grammarAccess.getUseCaseDescRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCaseDesc();

            state._fsp--;

             after(grammarAccess.getUseCaseDescRule()); 
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
    // $ANTLR end "entryRuleUseCaseDesc"


    // $ANTLR start "ruleUseCaseDesc"
    // InternalUseCaseDsl.g:87:1: ruleUseCaseDesc : ( ( rule__UseCaseDesc__Group__0 ) ) ;
    public final void ruleUseCaseDesc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:91:2: ( ( ( rule__UseCaseDesc__Group__0 ) ) )
            // InternalUseCaseDsl.g:92:2: ( ( rule__UseCaseDesc__Group__0 ) )
            {
            // InternalUseCaseDsl.g:92:2: ( ( rule__UseCaseDesc__Group__0 ) )
            // InternalUseCaseDsl.g:93:3: ( rule__UseCaseDesc__Group__0 )
            {
             before(grammarAccess.getUseCaseDescAccess().getGroup()); 
            // InternalUseCaseDsl.g:94:3: ( rule__UseCaseDesc__Group__0 )
            // InternalUseCaseDsl.g:94:4: rule__UseCaseDesc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCaseDesc"


    // $ANTLR start "rule__UseCaseDesc__Group__0"
    // InternalUseCaseDsl.g:102:1: rule__UseCaseDesc__Group__0 : rule__UseCaseDesc__Group__0__Impl rule__UseCaseDesc__Group__1 ;
    public final void rule__UseCaseDesc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:106:1: ( rule__UseCaseDesc__Group__0__Impl rule__UseCaseDesc__Group__1 )
            // InternalUseCaseDsl.g:107:2: rule__UseCaseDesc__Group__0__Impl rule__UseCaseDesc__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCaseDesc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__0"


    // $ANTLR start "rule__UseCaseDesc__Group__0__Impl"
    // InternalUseCaseDsl.g:114:1: rule__UseCaseDesc__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCaseDesc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:118:1: ( ( 'usecase' ) )
            // InternalUseCaseDsl.g:119:1: ( 'usecase' )
            {
            // InternalUseCaseDsl.g:119:1: ( 'usecase' )
            // InternalUseCaseDsl.g:120:2: 'usecase'
            {
             before(grammarAccess.getUseCaseDescAccess().getUsecaseKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescAccess().getUsecaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__0__Impl"


    // $ANTLR start "rule__UseCaseDesc__Group__1"
    // InternalUseCaseDsl.g:129:1: rule__UseCaseDesc__Group__1 : rule__UseCaseDesc__Group__1__Impl rule__UseCaseDesc__Group__2 ;
    public final void rule__UseCaseDesc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:133:1: ( rule__UseCaseDesc__Group__1__Impl rule__UseCaseDesc__Group__2 )
            // InternalUseCaseDsl.g:134:2: rule__UseCaseDesc__Group__1__Impl rule__UseCaseDesc__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UseCaseDesc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__1"


    // $ANTLR start "rule__UseCaseDesc__Group__1__Impl"
    // InternalUseCaseDsl.g:141:1: rule__UseCaseDesc__Group__1__Impl : ( ( rule__UseCaseDesc__NameAssignment_1 ) ) ;
    public final void rule__UseCaseDesc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:145:1: ( ( ( rule__UseCaseDesc__NameAssignment_1 ) ) )
            // InternalUseCaseDsl.g:146:1: ( ( rule__UseCaseDesc__NameAssignment_1 ) )
            {
            // InternalUseCaseDsl.g:146:1: ( ( rule__UseCaseDesc__NameAssignment_1 ) )
            // InternalUseCaseDsl.g:147:2: ( rule__UseCaseDesc__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseDescAccess().getNameAssignment_1()); 
            // InternalUseCaseDsl.g:148:2: ( rule__UseCaseDesc__NameAssignment_1 )
            // InternalUseCaseDsl.g:148:3: rule__UseCaseDesc__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__1__Impl"


    // $ANTLR start "rule__UseCaseDesc__Group__2"
    // InternalUseCaseDsl.g:156:1: rule__UseCaseDesc__Group__2 : rule__UseCaseDesc__Group__2__Impl rule__UseCaseDesc__Group__3 ;
    public final void rule__UseCaseDesc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:160:1: ( rule__UseCaseDesc__Group__2__Impl rule__UseCaseDesc__Group__3 )
            // InternalUseCaseDsl.g:161:2: rule__UseCaseDesc__Group__2__Impl rule__UseCaseDesc__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UseCaseDesc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__2"


    // $ANTLR start "rule__UseCaseDesc__Group__2__Impl"
    // InternalUseCaseDsl.g:168:1: rule__UseCaseDesc__Group__2__Impl : ( 'actorPrimario:' ) ;
    public final void rule__UseCaseDesc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:172:1: ( ( 'actorPrimario:' ) )
            // InternalUseCaseDsl.g:173:1: ( 'actorPrimario:' )
            {
            // InternalUseCaseDsl.g:173:1: ( 'actorPrimario:' )
            // InternalUseCaseDsl.g:174:2: 'actorPrimario:'
            {
             before(grammarAccess.getUseCaseDescAccess().getActorPrimarioKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescAccess().getActorPrimarioKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__2__Impl"


    // $ANTLR start "rule__UseCaseDesc__Group__3"
    // InternalUseCaseDsl.g:183:1: rule__UseCaseDesc__Group__3 : rule__UseCaseDesc__Group__3__Impl rule__UseCaseDesc__Group__4 ;
    public final void rule__UseCaseDesc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:187:1: ( rule__UseCaseDesc__Group__3__Impl rule__UseCaseDesc__Group__4 )
            // InternalUseCaseDsl.g:188:2: rule__UseCaseDesc__Group__3__Impl rule__UseCaseDesc__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__UseCaseDesc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__3"


    // $ANTLR start "rule__UseCaseDesc__Group__3__Impl"
    // InternalUseCaseDsl.g:195:1: rule__UseCaseDesc__Group__3__Impl : ( ( rule__UseCaseDesc__ActorAssignment_3 ) ) ;
    public final void rule__UseCaseDesc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:199:1: ( ( ( rule__UseCaseDesc__ActorAssignment_3 ) ) )
            // InternalUseCaseDsl.g:200:1: ( ( rule__UseCaseDesc__ActorAssignment_3 ) )
            {
            // InternalUseCaseDsl.g:200:1: ( ( rule__UseCaseDesc__ActorAssignment_3 ) )
            // InternalUseCaseDsl.g:201:2: ( rule__UseCaseDesc__ActorAssignment_3 )
            {
             before(grammarAccess.getUseCaseDescAccess().getActorAssignment_3()); 
            // InternalUseCaseDsl.g:202:2: ( rule__UseCaseDesc__ActorAssignment_3 )
            // InternalUseCaseDsl.g:202:3: rule__UseCaseDesc__ActorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__ActorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescAccess().getActorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__3__Impl"


    // $ANTLR start "rule__UseCaseDesc__Group__4"
    // InternalUseCaseDsl.g:210:1: rule__UseCaseDesc__Group__4 : rule__UseCaseDesc__Group__4__Impl rule__UseCaseDesc__Group__5 ;
    public final void rule__UseCaseDesc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:214:1: ( rule__UseCaseDesc__Group__4__Impl rule__UseCaseDesc__Group__5 )
            // InternalUseCaseDsl.g:215:2: rule__UseCaseDesc__Group__4__Impl rule__UseCaseDesc__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__UseCaseDesc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__4"


    // $ANTLR start "rule__UseCaseDesc__Group__4__Impl"
    // InternalUseCaseDsl.g:222:1: rule__UseCaseDesc__Group__4__Impl : ( 'descripcion:' ) ;
    public final void rule__UseCaseDesc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:226:1: ( ( 'descripcion:' ) )
            // InternalUseCaseDsl.g:227:1: ( 'descripcion:' )
            {
            // InternalUseCaseDsl.g:227:1: ( 'descripcion:' )
            // InternalUseCaseDsl.g:228:2: 'descripcion:'
            {
             before(grammarAccess.getUseCaseDescAccess().getDescripcionKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescAccess().getDescripcionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__4__Impl"


    // $ANTLR start "rule__UseCaseDesc__Group__5"
    // InternalUseCaseDsl.g:237:1: rule__UseCaseDesc__Group__5 : rule__UseCaseDesc__Group__5__Impl ;
    public final void rule__UseCaseDesc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:241:1: ( rule__UseCaseDesc__Group__5__Impl )
            // InternalUseCaseDsl.g:242:2: rule__UseCaseDesc__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__5"


    // $ANTLR start "rule__UseCaseDesc__Group__5__Impl"
    // InternalUseCaseDsl.g:248:1: rule__UseCaseDesc__Group__5__Impl : ( ( rule__UseCaseDesc__DescripcionAssignment_5 ) ) ;
    public final void rule__UseCaseDesc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:252:1: ( ( ( rule__UseCaseDesc__DescripcionAssignment_5 ) ) )
            // InternalUseCaseDsl.g:253:1: ( ( rule__UseCaseDesc__DescripcionAssignment_5 ) )
            {
            // InternalUseCaseDsl.g:253:1: ( ( rule__UseCaseDesc__DescripcionAssignment_5 ) )
            // InternalUseCaseDsl.g:254:2: ( rule__UseCaseDesc__DescripcionAssignment_5 )
            {
             before(grammarAccess.getUseCaseDescAccess().getDescripcionAssignment_5()); 
            // InternalUseCaseDsl.g:255:2: ( rule__UseCaseDesc__DescripcionAssignment_5 )
            // InternalUseCaseDsl.g:255:3: rule__UseCaseDesc__DescripcionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDesc__DescripcionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDescAccess().getDescripcionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__Group__5__Impl"


    // $ANTLR start "rule__Model__UsecasesAssignment"
    // InternalUseCaseDsl.g:264:1: rule__Model__UsecasesAssignment : ( ruleUseCaseDesc ) ;
    public final void rule__Model__UsecasesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:268:1: ( ( ruleUseCaseDesc ) )
            // InternalUseCaseDsl.g:269:2: ( ruleUseCaseDesc )
            {
            // InternalUseCaseDsl.g:269:2: ( ruleUseCaseDesc )
            // InternalUseCaseDsl.g:270:3: ruleUseCaseDesc
            {
             before(grammarAccess.getModelAccess().getUsecasesUseCaseDescParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseDesc();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUsecasesUseCaseDescParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UsecasesAssignment"


    // $ANTLR start "rule__UseCaseDesc__NameAssignment_1"
    // InternalUseCaseDsl.g:279:1: rule__UseCaseDesc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UseCaseDesc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:283:1: ( ( RULE_ID ) )
            // InternalUseCaseDsl.g:284:2: ( RULE_ID )
            {
            // InternalUseCaseDsl.g:284:2: ( RULE_ID )
            // InternalUseCaseDsl.g:285:3: RULE_ID
            {
             before(grammarAccess.getUseCaseDescAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__NameAssignment_1"


    // $ANTLR start "rule__UseCaseDesc__ActorAssignment_3"
    // InternalUseCaseDsl.g:294:1: rule__UseCaseDesc__ActorAssignment_3 : ( RULE_ID ) ;
    public final void rule__UseCaseDesc__ActorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:298:1: ( ( RULE_ID ) )
            // InternalUseCaseDsl.g:299:2: ( RULE_ID )
            {
            // InternalUseCaseDsl.g:299:2: ( RULE_ID )
            // InternalUseCaseDsl.g:300:3: RULE_ID
            {
             before(grammarAccess.getUseCaseDescAccess().getActorIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescAccess().getActorIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__ActorAssignment_3"


    // $ANTLR start "rule__UseCaseDesc__DescripcionAssignment_5"
    // InternalUseCaseDsl.g:309:1: rule__UseCaseDesc__DescripcionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__UseCaseDesc__DescripcionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDsl.g:313:1: ( ( RULE_STRING ) )
            // InternalUseCaseDsl.g:314:2: ( RULE_STRING )
            {
            // InternalUseCaseDsl.g:314:2: ( RULE_STRING )
            // InternalUseCaseDsl.g:315:3: RULE_STRING
            {
             before(grammarAccess.getUseCaseDescAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUseCaseDescAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDesc__DescripcionAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}