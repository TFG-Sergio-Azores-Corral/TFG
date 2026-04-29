package org.usecase.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.usecase.services.UseCaseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDslParser extends AbstractInternalAntlrParser {
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

        public InternalUseCaseDslParser(TokenStream input, UseCaseDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UseCaseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUseCaseDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUseCaseDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUseCaseDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUseCaseDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_usecases_0_0= ruleUseCaseDesc ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_usecases_0_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDsl.g:77:2: ( ( (lv_usecases_0_0= ruleUseCaseDesc ) )* )
            // InternalUseCaseDsl.g:78:2: ( (lv_usecases_0_0= ruleUseCaseDesc ) )*
            {
            // InternalUseCaseDsl.g:78:2: ( (lv_usecases_0_0= ruleUseCaseDesc ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDsl.g:79:3: (lv_usecases_0_0= ruleUseCaseDesc )
            	    {
            	    // InternalUseCaseDsl.g:79:3: (lv_usecases_0_0= ruleUseCaseDesc )
            	    // InternalUseCaseDsl.g:80:4: lv_usecases_0_0= ruleUseCaseDesc
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getUsecasesUseCaseDescParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_usecases_0_0=ruleUseCaseDesc();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"usecases",
            	    					lv_usecases_0_0,
            	    					"org.usecase.UseCaseDsl.UseCaseDesc");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUseCaseDesc"
    // InternalUseCaseDsl.g:100:1: entryRuleUseCaseDesc returns [EObject current=null] : iv_ruleUseCaseDesc= ruleUseCaseDesc EOF ;
    public final EObject entryRuleUseCaseDesc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDesc = null;


        try {
            // InternalUseCaseDsl.g:100:52: (iv_ruleUseCaseDesc= ruleUseCaseDesc EOF )
            // InternalUseCaseDsl.g:101:2: iv_ruleUseCaseDesc= ruleUseCaseDesc EOF
            {
             newCompositeNode(grammarAccess.getUseCaseDescRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseDesc=ruleUseCaseDesc();

            state._fsp--;

             current =iv_ruleUseCaseDesc; 
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
    // $ANTLR end "entryRuleUseCaseDesc"


    // $ANTLR start "ruleUseCaseDesc"
    // InternalUseCaseDsl.g:107:1: ruleUseCaseDesc returns [EObject current=null] : (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'actorPrimario:' ( (lv_actor_3_0= RULE_ID ) ) otherlv_4= 'descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleUseCaseDesc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_actor_3_0=null;
        Token otherlv_4=null;
        Token lv_descripcion_5_0=null;


        	enterRule();

        try {
            // InternalUseCaseDsl.g:113:2: ( (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'actorPrimario:' ( (lv_actor_3_0= RULE_ID ) ) otherlv_4= 'descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) ) )
            // InternalUseCaseDsl.g:114:2: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'actorPrimario:' ( (lv_actor_3_0= RULE_ID ) ) otherlv_4= 'descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) )
            {
            // InternalUseCaseDsl.g:114:2: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'actorPrimario:' ( (lv_actor_3_0= RULE_ID ) ) otherlv_4= 'descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) )
            // InternalUseCaseDsl.g:115:3: otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'actorPrimario:' ( (lv_actor_3_0= RULE_ID ) ) otherlv_4= 'descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseDescAccess().getUsecaseKeyword_0());
            		
            // InternalUseCaseDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCaseDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCaseDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalUseCaseDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUseCaseDescAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDescRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUseCaseDescAccess().getActorPrimarioKeyword_2());
            		
            // InternalUseCaseDsl.g:141:3: ( (lv_actor_3_0= RULE_ID ) )
            // InternalUseCaseDsl.g:142:4: (lv_actor_3_0= RULE_ID )
            {
            // InternalUseCaseDsl.g:142:4: (lv_actor_3_0= RULE_ID )
            // InternalUseCaseDsl.g:143:5: lv_actor_3_0= RULE_ID
            {
            lv_actor_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_actor_3_0, grammarAccess.getUseCaseDescAccess().getActorIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDescRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actor",
            						lv_actor_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getUseCaseDescAccess().getDescripcionKeyword_4());
            		
            // InternalUseCaseDsl.g:163:3: ( (lv_descripcion_5_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:164:4: (lv_descripcion_5_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:164:4: (lv_descripcion_5_0= RULE_STRING )
            // InternalUseCaseDsl.g:165:5: lv_descripcion_5_0= RULE_STRING
            {
            lv_descripcion_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_descripcion_5_0, grammarAccess.getUseCaseDescAccess().getDescripcionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDescRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUseCaseDesc"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}