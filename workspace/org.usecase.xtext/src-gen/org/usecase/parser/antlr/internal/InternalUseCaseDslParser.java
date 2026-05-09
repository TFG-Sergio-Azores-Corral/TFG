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

        public InternalUseCaseDslParser(TokenStream input, UseCaseDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UseCaseDescription";
       	}

       	@Override
       	protected UseCaseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUseCaseDescription"
    // InternalUseCaseDsl.g:64:1: entryRuleUseCaseDescription returns [EObject current=null] : iv_ruleUseCaseDescription= ruleUseCaseDescription EOF ;
    public final EObject entryRuleUseCaseDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDescription = null;


        try {
            // InternalUseCaseDsl.g:64:59: (iv_ruleUseCaseDescription= ruleUseCaseDescription EOF )
            // InternalUseCaseDsl.g:65:2: iv_ruleUseCaseDescription= ruleUseCaseDescription EOF
            {
             newCompositeNode(grammarAccess.getUseCaseDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseDescription=ruleUseCaseDescription();

            state._fsp--;

             current =iv_ruleUseCaseDescription; 
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
    // $ANTLR end "entryRuleUseCaseDescription"


    // $ANTLR start "ruleUseCaseDescription"
    // InternalUseCaseDsl.g:71:1: ruleUseCaseDescription returns [EObject current=null] : (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'primaryActor:' ( (lv_primaryActor_3_0= RULE_STRING ) ) otherlv_4= 'stakeholdersAndGoals:' ( (lv_stakeholders_5_0= ruleBulletItem ) )* otherlv_6= 'preconditions:' ( (lv_preconditions_7_0= ruleBulletItem ) )* otherlv_8= 'postconditions:' ( (lv_postconditions_9_0= ruleBulletItem ) )* otherlv_10= 'mainFlow:' ( (lv_mainSteps_11_0= ruleNumberedStep ) )* otherlv_12= 'extensions:' ( (lv_extensions_13_0= ruleExtensionStep ) )* otherlv_14= 'specialRequirements:' ( (lv_specialRequirements_15_0= ruleBulletItem ) )* otherlv_16= 'technologyAndDataVariations:' ( (lv_technologyVariations_17_0= ruleBulletItem ) )* otherlv_18= 'frequencyOfOccurrence:' ( (lv_frequency_19_0= RULE_STRING ) ) otherlv_20= 'openIssues:' ( (lv_openIssues_21_0= ruleBulletItem ) )* ) ;
    public final EObject ruleUseCaseDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_primaryActor_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_frequency_19_0=null;
        Token otherlv_20=null;
        EObject lv_stakeholders_5_0 = null;

        EObject lv_preconditions_7_0 = null;

        EObject lv_postconditions_9_0 = null;

        EObject lv_mainSteps_11_0 = null;

        EObject lv_extensions_13_0 = null;

        EObject lv_specialRequirements_15_0 = null;

        EObject lv_technologyVariations_17_0 = null;

        EObject lv_openIssues_21_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDsl.g:77:2: ( (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'primaryActor:' ( (lv_primaryActor_3_0= RULE_STRING ) ) otherlv_4= 'stakeholdersAndGoals:' ( (lv_stakeholders_5_0= ruleBulletItem ) )* otherlv_6= 'preconditions:' ( (lv_preconditions_7_0= ruleBulletItem ) )* otherlv_8= 'postconditions:' ( (lv_postconditions_9_0= ruleBulletItem ) )* otherlv_10= 'mainFlow:' ( (lv_mainSteps_11_0= ruleNumberedStep ) )* otherlv_12= 'extensions:' ( (lv_extensions_13_0= ruleExtensionStep ) )* otherlv_14= 'specialRequirements:' ( (lv_specialRequirements_15_0= ruleBulletItem ) )* otherlv_16= 'technologyAndDataVariations:' ( (lv_technologyVariations_17_0= ruleBulletItem ) )* otherlv_18= 'frequencyOfOccurrence:' ( (lv_frequency_19_0= RULE_STRING ) ) otherlv_20= 'openIssues:' ( (lv_openIssues_21_0= ruleBulletItem ) )* ) )
            // InternalUseCaseDsl.g:78:2: (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'primaryActor:' ( (lv_primaryActor_3_0= RULE_STRING ) ) otherlv_4= 'stakeholdersAndGoals:' ( (lv_stakeholders_5_0= ruleBulletItem ) )* otherlv_6= 'preconditions:' ( (lv_preconditions_7_0= ruleBulletItem ) )* otherlv_8= 'postconditions:' ( (lv_postconditions_9_0= ruleBulletItem ) )* otherlv_10= 'mainFlow:' ( (lv_mainSteps_11_0= ruleNumberedStep ) )* otherlv_12= 'extensions:' ( (lv_extensions_13_0= ruleExtensionStep ) )* otherlv_14= 'specialRequirements:' ( (lv_specialRequirements_15_0= ruleBulletItem ) )* otherlv_16= 'technologyAndDataVariations:' ( (lv_technologyVariations_17_0= ruleBulletItem ) )* otherlv_18= 'frequencyOfOccurrence:' ( (lv_frequency_19_0= RULE_STRING ) ) otherlv_20= 'openIssues:' ( (lv_openIssues_21_0= ruleBulletItem ) )* )
            {
            // InternalUseCaseDsl.g:78:2: (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'primaryActor:' ( (lv_primaryActor_3_0= RULE_STRING ) ) otherlv_4= 'stakeholdersAndGoals:' ( (lv_stakeholders_5_0= ruleBulletItem ) )* otherlv_6= 'preconditions:' ( (lv_preconditions_7_0= ruleBulletItem ) )* otherlv_8= 'postconditions:' ( (lv_postconditions_9_0= ruleBulletItem ) )* otherlv_10= 'mainFlow:' ( (lv_mainSteps_11_0= ruleNumberedStep ) )* otherlv_12= 'extensions:' ( (lv_extensions_13_0= ruleExtensionStep ) )* otherlv_14= 'specialRequirements:' ( (lv_specialRequirements_15_0= ruleBulletItem ) )* otherlv_16= 'technologyAndDataVariations:' ( (lv_technologyVariations_17_0= ruleBulletItem ) )* otherlv_18= 'frequencyOfOccurrence:' ( (lv_frequency_19_0= RULE_STRING ) ) otherlv_20= 'openIssues:' ( (lv_openIssues_21_0= ruleBulletItem ) )* )
            // InternalUseCaseDsl.g:79:3: otherlv_0= 'useCase' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'primaryActor:' ( (lv_primaryActor_3_0= RULE_STRING ) ) otherlv_4= 'stakeholdersAndGoals:' ( (lv_stakeholders_5_0= ruleBulletItem ) )* otherlv_6= 'preconditions:' ( (lv_preconditions_7_0= ruleBulletItem ) )* otherlv_8= 'postconditions:' ( (lv_postconditions_9_0= ruleBulletItem ) )* otherlv_10= 'mainFlow:' ( (lv_mainSteps_11_0= ruleNumberedStep ) )* otherlv_12= 'extensions:' ( (lv_extensions_13_0= ruleExtensionStep ) )* otherlv_14= 'specialRequirements:' ( (lv_specialRequirements_15_0= ruleBulletItem ) )* otherlv_16= 'technologyAndDataVariations:' ( (lv_technologyVariations_17_0= ruleBulletItem ) )* otherlv_18= 'frequencyOfOccurrence:' ( (lv_frequency_19_0= RULE_STRING ) ) otherlv_20= 'openIssues:' ( (lv_openIssues_21_0= ruleBulletItem ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseDescriptionAccess().getUseCaseKeyword_0());
            		
            // InternalUseCaseDsl.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCaseDsl.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUseCaseDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorKeyword_2());
            		
            // InternalUseCaseDsl.g:105:3: ( (lv_primaryActor_3_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:106:4: (lv_primaryActor_3_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:106:4: (lv_primaryActor_3_0= RULE_STRING )
            // InternalUseCaseDsl.g:107:5: lv_primaryActor_3_0= RULE_STRING
            {
            lv_primaryActor_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_primaryActor_3_0, grammarAccess.getUseCaseDescriptionAccess().getPrimaryActorSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"primaryActor",
            						lv_primaryActor_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getUseCaseDescriptionAccess().getStakeholdersAndGoalsKeyword_4());
            		
            // InternalUseCaseDsl.g:127:3: ( (lv_stakeholders_5_0= ruleBulletItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDsl.g:128:4: (lv_stakeholders_5_0= ruleBulletItem )
            	    {
            	    // InternalUseCaseDsl.g:128:4: (lv_stakeholders_5_0= ruleBulletItem )
            	    // InternalUseCaseDsl.g:129:5: lv_stakeholders_5_0= ruleBulletItem
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getStakeholdersBulletItemParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_stakeholders_5_0=ruleBulletItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stakeholders",
            	    						lv_stakeholders_5_0,
            	    						"org.usecase.UseCaseDsl.BulletItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getUseCaseDescriptionAccess().getPreconditionsKeyword_6());
            		
            // InternalUseCaseDsl.g:150:3: ( (lv_preconditions_7_0= ruleBulletItem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCaseDsl.g:151:4: (lv_preconditions_7_0= ruleBulletItem )
            	    {
            	    // InternalUseCaseDsl.g:151:4: (lv_preconditions_7_0= ruleBulletItem )
            	    // InternalUseCaseDsl.g:152:5: lv_preconditions_7_0= ruleBulletItem
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getPreconditionsBulletItemParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_preconditions_7_0=ruleBulletItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"preconditions",
            	    						lv_preconditions_7_0,
            	    						"org.usecase.UseCaseDsl.BulletItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getUseCaseDescriptionAccess().getPostconditionsKeyword_8());
            		
            // InternalUseCaseDsl.g:173:3: ( (lv_postconditions_9_0= ruleBulletItem ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDsl.g:174:4: (lv_postconditions_9_0= ruleBulletItem )
            	    {
            	    // InternalUseCaseDsl.g:174:4: (lv_postconditions_9_0= ruleBulletItem )
            	    // InternalUseCaseDsl.g:175:5: lv_postconditions_9_0= ruleBulletItem
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getPostconditionsBulletItemParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_postconditions_9_0=ruleBulletItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"postconditions",
            	    						lv_postconditions_9_0,
            	    						"org.usecase.UseCaseDsl.BulletItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getUseCaseDescriptionAccess().getMainFlowKeyword_10());
            		
            // InternalUseCaseDsl.g:196:3: ( (lv_mainSteps_11_0= ruleNumberedStep ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDsl.g:197:4: (lv_mainSteps_11_0= ruleNumberedStep )
            	    {
            	    // InternalUseCaseDsl.g:197:4: (lv_mainSteps_11_0= ruleNumberedStep )
            	    // InternalUseCaseDsl.g:198:5: lv_mainSteps_11_0= ruleNumberedStep
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getMainStepsNumberedStepParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_mainSteps_11_0=ruleNumberedStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mainSteps",
            	    						lv_mainSteps_11_0,
            	    						"org.usecase.UseCaseDsl.NumberedStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getUseCaseDescriptionAccess().getExtensionsKeyword_12());
            		
            // InternalUseCaseDsl.g:219:3: ( (lv_extensions_13_0= ruleExtensionStep ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCaseDsl.g:220:4: (lv_extensions_13_0= ruleExtensionStep )
            	    {
            	    // InternalUseCaseDsl.g:220:4: (lv_extensions_13_0= ruleExtensionStep )
            	    // InternalUseCaseDsl.g:221:5: lv_extensions_13_0= ruleExtensionStep
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getExtensionsExtensionStepParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_extensions_13_0=ruleExtensionStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_13_0,
            	    						"org.usecase.UseCaseDsl.ExtensionStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsKeyword_14());
            		
            // InternalUseCaseDsl.g:242:3: ( (lv_specialRequirements_15_0= ruleBulletItem ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCaseDsl.g:243:4: (lv_specialRequirements_15_0= ruleBulletItem )
            	    {
            	    // InternalUseCaseDsl.g:243:4: (lv_specialRequirements_15_0= ruleBulletItem )
            	    // InternalUseCaseDsl.g:244:5: lv_specialRequirements_15_0= ruleBulletItem
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getSpecialRequirementsBulletItemParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_specialRequirements_15_0=ruleBulletItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specialRequirements",
            	    						lv_specialRequirements_15_0,
            	    						"org.usecase.UseCaseDsl.BulletItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_16=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getUseCaseDescriptionAccess().getTechnologyAndDataVariationsKeyword_16());
            		
            // InternalUseCaseDsl.g:265:3: ( (lv_technologyVariations_17_0= ruleBulletItem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCaseDsl.g:266:4: (lv_technologyVariations_17_0= ruleBulletItem )
            	    {
            	    // InternalUseCaseDsl.g:266:4: (lv_technologyVariations_17_0= ruleBulletItem )
            	    // InternalUseCaseDsl.g:267:5: lv_technologyVariations_17_0= ruleBulletItem
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getTechnologyVariationsBulletItemParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_technologyVariations_17_0=ruleBulletItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"technologyVariations",
            	    						lv_technologyVariations_17_0,
            	    						"org.usecase.UseCaseDsl.BulletItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_18=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getUseCaseDescriptionAccess().getFrequencyOfOccurrenceKeyword_18());
            		
            // InternalUseCaseDsl.g:288:3: ( (lv_frequency_19_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:289:4: (lv_frequency_19_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:289:4: (lv_frequency_19_0= RULE_STRING )
            // InternalUseCaseDsl.g:290:5: lv_frequency_19_0= RULE_STRING
            {
            lv_frequency_19_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_frequency_19_0, grammarAccess.getUseCaseDescriptionAccess().getFrequencySTRINGTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_20=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_20, grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesKeyword_20());
            		
            // InternalUseCaseDsl.g:310:3: ( (lv_openIssues_21_0= ruleBulletItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDsl.g:311:4: (lv_openIssues_21_0= ruleBulletItem )
            	    {
            	    // InternalUseCaseDsl.g:311:4: (lv_openIssues_21_0= ruleBulletItem )
            	    // InternalUseCaseDsl.g:312:5: lv_openIssues_21_0= ruleBulletItem
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDescriptionAccess().getOpenIssuesBulletItemParserRuleCall_21_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_openIssues_21_0=ruleBulletItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"openIssues",
            	    						lv_openIssues_21_0,
            	    						"org.usecase.UseCaseDsl.BulletItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleUseCaseDescription"


    // $ANTLR start "entryRuleBulletItem"
    // InternalUseCaseDsl.g:333:1: entryRuleBulletItem returns [EObject current=null] : iv_ruleBulletItem= ruleBulletItem EOF ;
    public final EObject entryRuleBulletItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBulletItem = null;


        try {
            // InternalUseCaseDsl.g:333:51: (iv_ruleBulletItem= ruleBulletItem EOF )
            // InternalUseCaseDsl.g:334:2: iv_ruleBulletItem= ruleBulletItem EOF
            {
             newCompositeNode(grammarAccess.getBulletItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBulletItem=ruleBulletItem();

            state._fsp--;

             current =iv_ruleBulletItem; 
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
    // $ANTLR end "entryRuleBulletItem"


    // $ANTLR start "ruleBulletItem"
    // InternalUseCaseDsl.g:340:1: ruleBulletItem returns [EObject current=null] : (otherlv_0= '-' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBulletItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalUseCaseDsl.g:346:2: ( (otherlv_0= '-' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalUseCaseDsl.g:347:2: (otherlv_0= '-' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalUseCaseDsl.g:347:2: (otherlv_0= '-' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalUseCaseDsl.g:348:3: otherlv_0= '-' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBulletItemAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCaseDsl.g:352:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:353:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:353:4: (lv_text_1_0= RULE_STRING )
            // InternalUseCaseDsl.g:354:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getBulletItemAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBulletItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
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
    // $ANTLR end "ruleBulletItem"


    // $ANTLR start "entryRuleNumberedStep"
    // InternalUseCaseDsl.g:374:1: entryRuleNumberedStep returns [EObject current=null] : iv_ruleNumberedStep= ruleNumberedStep EOF ;
    public final EObject entryRuleNumberedStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberedStep = null;


        try {
            // InternalUseCaseDsl.g:374:53: (iv_ruleNumberedStep= ruleNumberedStep EOF )
            // InternalUseCaseDsl.g:375:2: iv_ruleNumberedStep= ruleNumberedStep EOF
            {
             newCompositeNode(grammarAccess.getNumberedStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberedStep=ruleNumberedStep();

            state._fsp--;

             current =iv_ruleNumberedStep; 
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
    // $ANTLR end "entryRuleNumberedStep"


    // $ANTLR start "ruleNumberedStep"
    // InternalUseCaseDsl.g:381:1: ruleNumberedStep returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNumberedStep() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;


        	enterRule();

        try {
            // InternalUseCaseDsl.g:387:2: ( ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_text_2_0= RULE_STRING ) ) ) )
            // InternalUseCaseDsl.g:388:2: ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // InternalUseCaseDsl.g:388:2: ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_text_2_0= RULE_STRING ) ) )
            // InternalUseCaseDsl.g:389:3: ( (lv_number_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_text_2_0= RULE_STRING ) )
            {
            // InternalUseCaseDsl.g:389:3: ( (lv_number_0_0= RULE_INT ) )
            // InternalUseCaseDsl.g:390:4: (lv_number_0_0= RULE_INT )
            {
            // InternalUseCaseDsl.g:390:4: (lv_number_0_0= RULE_INT )
            // InternalUseCaseDsl.g:391:5: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_number_0_0, grammarAccess.getNumberedStepAccess().getNumberINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberedStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberedStepAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDsl.g:411:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:412:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:412:4: (lv_text_2_0= RULE_STRING )
            // InternalUseCaseDsl.g:413:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_2_0, grammarAccess.getNumberedStepAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberedStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
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
    // $ANTLR end "ruleNumberedStep"


    // $ANTLR start "entryRuleExtensionStep"
    // InternalUseCaseDsl.g:433:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUseCaseDsl.g:433:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUseCaseDsl.g:434:2: iv_ruleExtensionStep= ruleExtensionStep EOF
            {
             newCompositeNode(grammarAccess.getExtensionStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionStep=ruleExtensionStep();

            state._fsp--;

             current =iv_ruleExtensionStep; 
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
    // $ANTLR end "entryRuleExtensionStep"


    // $ANTLR start "ruleExtensionStep"
    // InternalUseCaseDsl.g:440:1: ruleExtensionStep returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_substeps_4_0= ruleExtensionSubStep ) )* ) ;
    public final EObject ruleExtensionStep() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_letter_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        EObject lv_substeps_4_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDsl.g:446:2: ( ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_substeps_4_0= ruleExtensionSubStep ) )* ) )
            // InternalUseCaseDsl.g:447:2: ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_substeps_4_0= ruleExtensionSubStep ) )* )
            {
            // InternalUseCaseDsl.g:447:2: ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_substeps_4_0= ruleExtensionSubStep ) )* )
            // InternalUseCaseDsl.g:448:3: ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_substeps_4_0= ruleExtensionSubStep ) )*
            {
            // InternalUseCaseDsl.g:448:3: ( (lv_number_0_0= RULE_INT ) )
            // InternalUseCaseDsl.g:449:4: (lv_number_0_0= RULE_INT )
            {
            // InternalUseCaseDsl.g:449:4: (lv_number_0_0= RULE_INT )
            // InternalUseCaseDsl.g:450:5: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_number_0_0, grammarAccess.getExtensionStepAccess().getNumberINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUseCaseDsl.g:466:3: ( (lv_letter_1_0= RULE_ID ) )
            // InternalUseCaseDsl.g:467:4: (lv_letter_1_0= RULE_ID )
            {
            // InternalUseCaseDsl.g:467:4: (lv_letter_1_0= RULE_ID )
            // InternalUseCaseDsl.g:468:5: lv_letter_1_0= RULE_ID
            {
            lv_letter_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_letter_1_0, grammarAccess.getExtensionStepAccess().getLetterIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"letter",
            						lv_letter_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getFullStopKeyword_2());
            		
            // InternalUseCaseDsl.g:488:3: ( (lv_text_3_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:489:4: (lv_text_3_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:489:4: (lv_text_3_0= RULE_STRING )
            // InternalUseCaseDsl.g:490:5: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_text_3_0, grammarAccess.getExtensionStepAccess().getTextSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCaseDsl.g:506:3: ( (lv_substeps_4_0= ruleExtensionSubStep ) )*
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
            	    // InternalUseCaseDsl.g:507:4: (lv_substeps_4_0= ruleExtensionSubStep )
            	    {
            	    // InternalUseCaseDsl.g:507:4: (lv_substeps_4_0= ruleExtensionSubStep )
            	    // InternalUseCaseDsl.g:508:5: lv_substeps_4_0= ruleExtensionSubStep
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionStepAccess().getSubstepsExtensionSubStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_substeps_4_0=ruleExtensionSubStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"substeps",
            	    						lv_substeps_4_0,
            	    						"org.usecase.UseCaseDsl.ExtensionSubStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleExtensionStep"


    // $ANTLR start "entryRuleExtensionSubStep"
    // InternalUseCaseDsl.g:529:1: entryRuleExtensionSubStep returns [EObject current=null] : iv_ruleExtensionSubStep= ruleExtensionSubStep EOF ;
    public final EObject entryRuleExtensionSubStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionSubStep = null;


        try {
            // InternalUseCaseDsl.g:529:57: (iv_ruleExtensionSubStep= ruleExtensionSubStep EOF )
            // InternalUseCaseDsl.g:530:2: iv_ruleExtensionSubStep= ruleExtensionSubStep EOF
            {
             newCompositeNode(grammarAccess.getExtensionSubStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionSubStep=ruleExtensionSubStep();

            state._fsp--;

             current =iv_ruleExtensionSubStep; 
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
    // $ANTLR end "entryRuleExtensionSubStep"


    // $ANTLR start "ruleExtensionSubStep"
    // InternalUseCaseDsl.g:536:1: ruleExtensionSubStep returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_subnumber_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_text_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleExtensionSubStep() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_letter_1_0=null;
        Token otherlv_2=null;
        Token lv_subnumber_3_0=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;


        	enterRule();

        try {
            // InternalUseCaseDsl.g:542:2: ( ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_subnumber_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_text_5_0= RULE_STRING ) ) ) )
            // InternalUseCaseDsl.g:543:2: ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_subnumber_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_text_5_0= RULE_STRING ) ) )
            {
            // InternalUseCaseDsl.g:543:2: ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_subnumber_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_text_5_0= RULE_STRING ) ) )
            // InternalUseCaseDsl.g:544:3: ( (lv_number_0_0= RULE_INT ) ) ( (lv_letter_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_subnumber_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_text_5_0= RULE_STRING ) )
            {
            // InternalUseCaseDsl.g:544:3: ( (lv_number_0_0= RULE_INT ) )
            // InternalUseCaseDsl.g:545:4: (lv_number_0_0= RULE_INT )
            {
            // InternalUseCaseDsl.g:545:4: (lv_number_0_0= RULE_INT )
            // InternalUseCaseDsl.g:546:5: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_number_0_0, grammarAccess.getExtensionSubStepAccess().getNumberINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionSubStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUseCaseDsl.g:562:3: ( (lv_letter_1_0= RULE_ID ) )
            // InternalUseCaseDsl.g:563:4: (lv_letter_1_0= RULE_ID )
            {
            // InternalUseCaseDsl.g:563:4: (lv_letter_1_0= RULE_ID )
            // InternalUseCaseDsl.g:564:5: lv_letter_1_0= RULE_ID
            {
            lv_letter_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_letter_1_0, grammarAccess.getExtensionSubStepAccess().getLetterIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionSubStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"letter",
            						lv_letter_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionSubStepAccess().getFullStopKeyword_2());
            		
            // InternalUseCaseDsl.g:584:3: ( (lv_subnumber_3_0= RULE_INT ) )
            // InternalUseCaseDsl.g:585:4: (lv_subnumber_3_0= RULE_INT )
            {
            // InternalUseCaseDsl.g:585:4: (lv_subnumber_3_0= RULE_INT )
            // InternalUseCaseDsl.g:586:5: lv_subnumber_3_0= RULE_INT
            {
            lv_subnumber_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_subnumber_3_0, grammarAccess.getExtensionSubStepAccess().getSubnumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionSubStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subnumber",
            						lv_subnumber_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionSubStepAccess().getFullStopKeyword_4());
            		
            // InternalUseCaseDsl.g:606:3: ( (lv_text_5_0= RULE_STRING ) )
            // InternalUseCaseDsl.g:607:4: (lv_text_5_0= RULE_STRING )
            {
            // InternalUseCaseDsl.g:607:4: (lv_text_5_0= RULE_STRING )
            // InternalUseCaseDsl.g:608:5: lv_text_5_0= RULE_STRING
            {
            lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_5_0, grammarAccess.getExtensionSubStepAccess().getTextSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionSubStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_5_0,
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
    // $ANTLR end "ruleExtensionSubStep"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});

}