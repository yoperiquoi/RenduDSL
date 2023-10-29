package fr.imta.yperiquoi.browserautomation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.yperiquoi.browserautomation.services.BrowserAutomationDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'url'", "'click'", "'on'", "'the'", "'link'", "'button'", "'with'", "'text'", "'image'", "'alt'", "'property'", "'fill'", "'field'", "'search'", "'select'", "'checkbox'", "'named'", "'values'", "','", "'verify'", "'that'", "'page'", "'contains'", "'title'", "'of'", "'previously'", "'clicked'", "'news'", "'string'", "'previous'", "'read'", "'and'", "'number'", "'in'", "'paste'", "'uncheck'", "'all'", "'checkboxes'", "'choose'", "'option'", "'combobox'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBrowserAutomationDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserAutomationDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserAutomationDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrowserAutomationDSL.g"; }



     	private BrowserAutomationDSLGrammarAccess grammarAccess;

        public InternalBrowserAutomationDSLParser(TokenStream input, BrowserAutomationDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BrowserAutomationDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBrowserAutomationDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBrowserAutomationDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBrowserAutomationDSL.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalBrowserAutomationDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalBrowserAutomationDSL.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalBrowserAutomationDSL.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==18||LA1_0==28||LA1_0==31||LA1_0==36||LA1_0==47||(LA1_0>=51 && LA1_0<=52)||LA1_0==55) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomationDSL.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalBrowserAutomationDSL.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalBrowserAutomationDSL.g:80:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"fr.imta.yperiquoi.browserautomation.BrowserAutomationDSL.Command");
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


    // $ANTLR start "entryRuleCommand"
    // InternalBrowserAutomationDSL.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalBrowserAutomationDSL.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalBrowserAutomationDSL.g:101:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalBrowserAutomationDSL.g:107:1: ruleCommand returns [EObject current=null] : (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Paste_7= rulePaste | this_Uncheck_8= ruleUncheck | this_Combobox_9= ruleCombobox ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_OpenBrowser_0 = null;

        EObject this_GoTo_1 = null;

        EObject this_Click_2 = null;

        EObject this_Fill_3 = null;

        EObject this_Select_4 = null;

        EObject this_Verify_5 = null;

        EObject this_Read_6 = null;

        EObject this_Paste_7 = null;

        EObject this_Uncheck_8 = null;

        EObject this_Combobox_9 = null;



        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:113:2: ( (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Paste_7= rulePaste | this_Uncheck_8= ruleUncheck | this_Combobox_9= ruleCombobox ) )
            // InternalBrowserAutomationDSL.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Paste_7= rulePaste | this_Uncheck_8= ruleUncheck | this_Combobox_9= ruleCombobox )
            {
            // InternalBrowserAutomationDSL.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Paste_7= rulePaste | this_Uncheck_8= ruleUncheck | this_Combobox_9= ruleCombobox )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 47:
                {
                alt2=7;
                }
                break;
            case 51:
                {
                alt2=8;
                }
                break;
            case 52:
                {
                alt2=9;
                }
                break;
            case 55:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:115:3: this_OpenBrowser_0= ruleOpenBrowser
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getOpenBrowserParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenBrowser_0=ruleOpenBrowser();

                    state._fsp--;


                    			current = this_OpenBrowser_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:124:3: this_GoTo_1= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGoToParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_1=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomationDSL.g:133:3: this_Click_2= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getClickParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_2=ruleClick();

                    state._fsp--;


                    			current = this_Click_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomationDSL.g:142:3: this_Fill_3= ruleFill
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getFillParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fill_3=ruleFill();

                    state._fsp--;


                    			current = this_Fill_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomationDSL.g:151:3: this_Select_4= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSelectParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_4=ruleSelect();

                    state._fsp--;


                    			current = this_Select_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomationDSL.g:160:3: this_Verify_5= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getVerifyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_5=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomationDSL.g:169:3: this_Read_6= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getReadParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_6=ruleRead();

                    state._fsp--;


                    			current = this_Read_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBrowserAutomationDSL.g:178:3: this_Paste_7= rulePaste
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPasteParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paste_7=rulePaste();

                    state._fsp--;


                    			current = this_Paste_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBrowserAutomationDSL.g:187:3: this_Uncheck_8= ruleUncheck
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUncheckParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Uncheck_8=ruleUncheck();

                    state._fsp--;


                    			current = this_Uncheck_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalBrowserAutomationDSL.g:196:3: this_Combobox_9= ruleCombobox
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getComboboxParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Combobox_9=ruleCombobox();

                    state._fsp--;


                    			current = this_Combobox_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOpenBrowser"
    // InternalBrowserAutomationDSL.g:208:1: entryRuleOpenBrowser returns [EObject current=null] : iv_ruleOpenBrowser= ruleOpenBrowser EOF ;
    public final EObject entryRuleOpenBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenBrowser = null;


        try {
            // InternalBrowserAutomationDSL.g:208:52: (iv_ruleOpenBrowser= ruleOpenBrowser EOF )
            // InternalBrowserAutomationDSL.g:209:2: iv_ruleOpenBrowser= ruleOpenBrowser EOF
            {
             newCompositeNode(grammarAccess.getOpenBrowserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenBrowser=ruleOpenBrowser();

            state._fsp--;

             current =iv_ruleOpenBrowser; 
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
    // $ANTLR end "entryRuleOpenBrowser"


    // $ANTLR start "ruleOpenBrowser"
    // InternalBrowserAutomationDSL.g:215:1: ruleOpenBrowser returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) ;
    public final EObject ruleOpenBrowser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:221:2: ( ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) )
            // InternalBrowserAutomationDSL.g:222:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            {
            // InternalBrowserAutomationDSL.g:222:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            // InternalBrowserAutomationDSL.g:223:3: () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window'
            {
            // InternalBrowserAutomationDSL.g:223:3: ()
            // InternalBrowserAutomationDSL.g:224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenBrowserAccess().getOpenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenBrowserAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpenBrowserAccess().getWindowKeyword_4());
            		

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
    // $ANTLR end "ruleOpenBrowser"


    // $ANTLR start "entryRuleGoTo"
    // InternalBrowserAutomationDSL.g:250:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalBrowserAutomationDSL.g:250:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalBrowserAutomationDSL.g:251:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalBrowserAutomationDSL.g:257:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_urlName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_urlName_3_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:263:2: ( (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_urlName_3_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomationDSL.g:264:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_urlName_3_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomationDSL.g:264:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_urlName_3_0= RULE_STRING ) ) )
            // InternalBrowserAutomationDSL.g:265:3: otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_urlName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getUrlKeyword_2());
            		
            // InternalBrowserAutomationDSL.g:277:3: ( (lv_urlName_3_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:278:4: (lv_urlName_3_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:278:4: (lv_urlName_3_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:279:5: lv_urlName_3_0= RULE_STRING
            {
            lv_urlName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_urlName_3_0, grammarAccess.getGoToAccess().getUrlNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"urlName",
            						lv_urlName_3_0,
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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleClick"
    // InternalBrowserAutomationDSL.g:299:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomationDSL.g:299:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomationDSL.g:300:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalBrowserAutomationDSL.g:306:1: ruleClick returns [EObject current=null] : ( () otherlv_1= 'click' otherlv_2= 'on' ( (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) ) | (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) ) | (otherlv_17= 'the' otherlv_18= 'url' ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_linkText_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_buttonText_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_alt_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:312:2: ( ( () otherlv_1= 'click' otherlv_2= 'on' ( (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) ) | (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) ) | (otherlv_17= 'the' otherlv_18= 'url' ) ) ) )
            // InternalBrowserAutomationDSL.g:313:2: ( () otherlv_1= 'click' otherlv_2= 'on' ( (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) ) | (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) ) | (otherlv_17= 'the' otherlv_18= 'url' ) ) )
            {
            // InternalBrowserAutomationDSL.g:313:2: ( () otherlv_1= 'click' otherlv_2= 'on' ( (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) ) | (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) ) | (otherlv_17= 'the' otherlv_18= 'url' ) ) )
            // InternalBrowserAutomationDSL.g:314:3: () otherlv_1= 'click' otherlv_2= 'on' ( (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) ) | (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) ) | (otherlv_17= 'the' otherlv_18= 'url' ) )
            {
            // InternalBrowserAutomationDSL.g:314:3: ()
            // InternalBrowserAutomationDSL.g:315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClickAccess().getClickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getClickAccess().getOnKeyword_2());
            		
            // InternalBrowserAutomationDSL.g:329:3: ( (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) ) | (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) ) | (otherlv_17= 'the' otherlv_18= 'url' ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt3=4;
                    }
                    break;
                case 25:
                    {
                    alt3=3;
                    }
                    break;
                case 21:
                    {
                    alt3=1;
                    }
                    break;
                case 22:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:330:4: (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:330:4: (otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:331:5: otherlv_3= 'the' otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_12); 

                    					newLeafNode(otherlv_3, grammarAccess.getClickAccess().getTheKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,21,FOLLOW_9); 

                    					newLeafNode(otherlv_4, grammarAccess.getClickAccess().getLinkKeyword_3_0_1());
                    				
                    // InternalBrowserAutomationDSL.g:339:5: ( (lv_linkText_5_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:340:6: (lv_linkText_5_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:340:6: (lv_linkText_5_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:341:7: lv_linkText_5_0= RULE_STRING
                    {
                    lv_linkText_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_linkText_5_0, grammarAccess.getClickAccess().getLinkTextSTRINGTerminalRuleCall_3_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"linkText",
                    								lv_linkText_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:359:4: (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:359:4: (otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:360:5: otherlv_6= 'the' otherlv_7= 'button' otherlv_8= 'with' otherlv_9= 'text' ( (lv_buttonText_10_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getClickAccess().getTheKeyword_3_1_0());
                    				
                    otherlv_7=(Token)match(input,22,FOLLOW_14); 

                    					newLeafNode(otherlv_7, grammarAccess.getClickAccess().getButtonKeyword_3_1_1());
                    				
                    otherlv_8=(Token)match(input,23,FOLLOW_15); 

                    					newLeafNode(otherlv_8, grammarAccess.getClickAccess().getWithKeyword_3_1_2());
                    				
                    otherlv_9=(Token)match(input,24,FOLLOW_9); 

                    					newLeafNode(otherlv_9, grammarAccess.getClickAccess().getTextKeyword_3_1_3());
                    				
                    // InternalBrowserAutomationDSL.g:376:5: ( (lv_buttonText_10_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:377:6: (lv_buttonText_10_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:377:6: (lv_buttonText_10_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:378:7: lv_buttonText_10_0= RULE_STRING
                    {
                    lv_buttonText_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_buttonText_10_0, grammarAccess.getClickAccess().getButtonTextSTRINGTerminalRuleCall_3_1_4_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"buttonText",
                    								lv_buttonText_10_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomationDSL.g:396:4: (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:396:4: (otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:397:5: otherlv_11= 'the' otherlv_12= 'image' otherlv_13= 'with' otherlv_14= 'alt' otherlv_15= 'property' ( (lv_alt_16_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_16); 

                    					newLeafNode(otherlv_11, grammarAccess.getClickAccess().getTheKeyword_3_2_0());
                    				
                    otherlv_12=(Token)match(input,25,FOLLOW_14); 

                    					newLeafNode(otherlv_12, grammarAccess.getClickAccess().getImageKeyword_3_2_1());
                    				
                    otherlv_13=(Token)match(input,23,FOLLOW_17); 

                    					newLeafNode(otherlv_13, grammarAccess.getClickAccess().getWithKeyword_3_2_2());
                    				
                    otherlv_14=(Token)match(input,26,FOLLOW_18); 

                    					newLeafNode(otherlv_14, grammarAccess.getClickAccess().getAltKeyword_3_2_3());
                    				
                    otherlv_15=(Token)match(input,27,FOLLOW_9); 

                    					newLeafNode(otherlv_15, grammarAccess.getClickAccess().getPropertyKeyword_3_2_4());
                    				
                    // InternalBrowserAutomationDSL.g:417:5: ( (lv_alt_16_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:418:6: (lv_alt_16_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:418:6: (lv_alt_16_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:419:7: lv_alt_16_0= RULE_STRING
                    {
                    lv_alt_16_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_alt_16_0, grammarAccess.getClickAccess().getAltSTRINGTerminalRuleCall_3_2_5_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alt",
                    								lv_alt_16_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomationDSL.g:437:4: (otherlv_17= 'the' otherlv_18= 'url' )
                    {
                    // InternalBrowserAutomationDSL.g:437:4: (otherlv_17= 'the' otherlv_18= 'url' )
                    // InternalBrowserAutomationDSL.g:438:5: otherlv_17= 'the' otherlv_18= 'url'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_8); 

                    					newLeafNode(otherlv_17, grammarAccess.getClickAccess().getTheKeyword_3_3_0());
                    				
                    otherlv_18=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_18, grammarAccess.getClickAccess().getUrlKeyword_3_3_1());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalBrowserAutomationDSL.g:452:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalBrowserAutomationDSL.g:452:45: (iv_ruleFill= ruleFill EOF )
            // InternalBrowserAutomationDSL.g:453:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
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
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalBrowserAutomationDSL.g:459:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' otherlv_1= 'the' ( (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'search' otherlv_6= 'field' ) ) otherlv_7= 'with' ( (lv_textToFill_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fieldName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_textToFill_8_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:465:2: ( (otherlv_0= 'fill' otherlv_1= 'the' ( (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'search' otherlv_6= 'field' ) ) otherlv_7= 'with' ( (lv_textToFill_8_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomationDSL.g:466:2: (otherlv_0= 'fill' otherlv_1= 'the' ( (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'search' otherlv_6= 'field' ) ) otherlv_7= 'with' ( (lv_textToFill_8_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomationDSL.g:466:2: (otherlv_0= 'fill' otherlv_1= 'the' ( (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'search' otherlv_6= 'field' ) ) otherlv_7= 'with' ( (lv_textToFill_8_0= RULE_STRING ) ) )
            // InternalBrowserAutomationDSL.g:467:3: otherlv_0= 'fill' otherlv_1= 'the' ( (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'search' otherlv_6= 'field' ) ) otherlv_7= 'with' ( (lv_textToFill_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFillAccess().getTheKeyword_1());
            		
            // InternalBrowserAutomationDSL.g:475:3: ( (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'search' otherlv_6= 'field' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:476:4: (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:476:4: (otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:477:5: otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_20); 

                    					newLeafNode(otherlv_2, grammarAccess.getFillAccess().getTextKeyword_2_0_0());
                    				
                    otherlv_3=(Token)match(input,29,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getFillAccess().getFieldKeyword_2_0_1());
                    				
                    // InternalBrowserAutomationDSL.g:485:5: ( (lv_fieldName_4_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:486:6: (lv_fieldName_4_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:486:6: (lv_fieldName_4_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:487:7: lv_fieldName_4_0= RULE_STRING
                    {
                    lv_fieldName_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_fieldName_4_0, grammarAccess.getFillAccess().getFieldNameSTRINGTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFillRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"fieldName",
                    								lv_fieldName_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:505:4: (otherlv_5= 'search' otherlv_6= 'field' )
                    {
                    // InternalBrowserAutomationDSL.g:505:4: (otherlv_5= 'search' otherlv_6= 'field' )
                    // InternalBrowserAutomationDSL.g:506:5: otherlv_5= 'search' otherlv_6= 'field'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_20); 

                    					newLeafNode(otherlv_5, grammarAccess.getFillAccess().getSearchKeyword_2_1_0());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_14); 

                    					newLeafNode(otherlv_6, grammarAccess.getFillAccess().getFieldKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFillAccess().getWithKeyword_3());
            		
            // InternalBrowserAutomationDSL.g:520:3: ( (lv_textToFill_8_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:521:4: (lv_textToFill_8_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:521:4: (lv_textToFill_8_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:522:5: lv_textToFill_8_0= RULE_STRING
            {
            lv_textToFill_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_textToFill_8_0, grammarAccess.getFillAccess().getTextToFillSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"textToFill",
            						lv_textToFill_8_0,
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
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelect"
    // InternalBrowserAutomationDSL.g:542:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalBrowserAutomationDSL.g:542:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalBrowserAutomationDSL.g:543:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalBrowserAutomationDSL.g:549:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' ( (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_checkboxName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;
        Token otherlv_8=null;
        Token lv_values_9_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:555:2: ( (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' ( (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* ) ) ) )
            // InternalBrowserAutomationDSL.g:556:2: (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' ( (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* ) ) )
            {
            // InternalBrowserAutomationDSL.g:556:2: (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' ( (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* ) ) )
            // InternalBrowserAutomationDSL.g:557:3: otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' ( (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCheckboxKeyword_2());
            		
            // InternalBrowserAutomationDSL.g:569:3: ( (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) | (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:570:4: (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:570:4: (otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:571:5: otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getNamedKeyword_3_0_0());
                    				
                    // InternalBrowserAutomationDSL.g:575:5: ( (lv_checkboxName_4_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:576:6: (lv_checkboxName_4_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:576:6: (lv_checkboxName_4_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:577:7: lv_checkboxName_4_0= RULE_STRING
                    {
                    lv_checkboxName_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_checkboxName_4_0, grammarAccess.getSelectAccess().getCheckboxNameSTRINGTerminalRuleCall_3_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSelectRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"checkboxName",
                    								lv_checkboxName_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:595:4: (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* )
                    {
                    // InternalBrowserAutomationDSL.g:595:4: (otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )* )
                    // InternalBrowserAutomationDSL.g:596:5: otherlv_5= 'with' otherlv_6= 'values' ( (lv_values_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(otherlv_5, grammarAccess.getSelectAccess().getWithKeyword_3_1_0());
                    				
                    otherlv_6=(Token)match(input,34,FOLLOW_9); 

                    					newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getValuesKeyword_3_1_1());
                    				
                    // InternalBrowserAutomationDSL.g:604:5: ( (lv_values_7_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:605:6: (lv_values_7_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:605:6: (lv_values_7_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:606:7: lv_values_7_0= RULE_STRING
                    {
                    lv_values_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    							newLeafNode(lv_values_7_0, grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSelectRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"values",
                    								lv_values_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    // InternalBrowserAutomationDSL.g:622:5: (otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==35) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBrowserAutomationDSL.g:623:6: otherlv_8= ',' ( (lv_values_9_0= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,35,FOLLOW_9); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getSelectAccess().getCommaKeyword_3_1_3_0());
                    	    					
                    	    // InternalBrowserAutomationDSL.g:627:6: ( (lv_values_9_0= RULE_STRING ) )
                    	    // InternalBrowserAutomationDSL.g:628:7: (lv_values_9_0= RULE_STRING )
                    	    {
                    	    // InternalBrowserAutomationDSL.g:628:7: (lv_values_9_0= RULE_STRING )
                    	    // InternalBrowserAutomationDSL.g:629:8: lv_values_9_0= RULE_STRING
                    	    {
                    	    lv_values_9_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    	    								newLeafNode(lv_values_9_0, grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_3_1_3_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getSelectRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"values",
                    	    									lv_values_9_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVerify"
    // InternalBrowserAutomationDSL.g:652:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalBrowserAutomationDSL.g:652:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalBrowserAutomationDSL.g:653:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalBrowserAutomationDSL.g:659:1: ruleVerify returns [EObject current=null] : ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' ( (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' ) | (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) ) | (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) ) | (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_textToVerify_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_linkToVerify_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:665:2: ( ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' ( (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' ) | (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) ) | (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) ) | (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' ) ) ) )
            // InternalBrowserAutomationDSL.g:666:2: ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' ( (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' ) | (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) ) | (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) ) | (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' ) ) )
            {
            // InternalBrowserAutomationDSL.g:666:2: ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' ( (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' ) | (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) ) | (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) ) | (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' ) ) )
            // InternalBrowserAutomationDSL.g:667:3: () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' ( (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' ) | (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) ) | (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) ) | (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' ) )
            {
            // InternalBrowserAutomationDSL.g:667:3: ()
            // InternalBrowserAutomationDSL.g:668:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerifyAccess().getVerifyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getVerifyKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getThatKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getTheKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getVerifyAccess().getPageKeyword_4());
            		
            otherlv_5=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getContainsKeyword_5());
            		
            // InternalBrowserAutomationDSL.g:694:3: ( (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' ) | (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) ) | (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) ) | (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==40) ) {
                    alt7=1;
                }
                else if ( (LA7_1==21) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==16) ) {
                        alt7=4;
                    }
                    else if ( (LA7_4==RULE_STRING) ) {
                        alt7=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:695:4: (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' )
                    {
                    // InternalBrowserAutomationDSL.g:695:4: (otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news' )
                    // InternalBrowserAutomationDSL.g:696:5: otherlv_6= 'a' otherlv_7= 'title' otherlv_8= 'of' otherlv_9= 'the' otherlv_10= 'previously' otherlv_11= 'clicked' otherlv_12= 'news'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_29); 

                    					newLeafNode(otherlv_6, grammarAccess.getVerifyAccess().getAKeyword_6_0_0());
                    				
                    otherlv_7=(Token)match(input,40,FOLLOW_30); 

                    					newLeafNode(otherlv_7, grammarAccess.getVerifyAccess().getTitleKeyword_6_0_1());
                    				
                    otherlv_8=(Token)match(input,41,FOLLOW_11); 

                    					newLeafNode(otherlv_8, grammarAccess.getVerifyAccess().getOfKeyword_6_0_2());
                    				
                    otherlv_9=(Token)match(input,20,FOLLOW_31); 

                    					newLeafNode(otherlv_9, grammarAccess.getVerifyAccess().getTheKeyword_6_0_3());
                    				
                    otherlv_10=(Token)match(input,42,FOLLOW_32); 

                    					newLeafNode(otherlv_10, grammarAccess.getVerifyAccess().getPreviouslyKeyword_6_0_4());
                    				
                    otherlv_11=(Token)match(input,43,FOLLOW_33); 

                    					newLeafNode(otherlv_11, grammarAccess.getVerifyAccess().getClickedKeyword_6_0_5());
                    				
                    otherlv_12=(Token)match(input,44,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getVerifyAccess().getNewsKeyword_6_0_6());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:726:4: (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:726:4: (otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:727:5: otherlv_13= 'the' otherlv_14= 'string' ( (lv_textToVerify_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_34); 

                    					newLeafNode(otherlv_13, grammarAccess.getVerifyAccess().getTheKeyword_6_1_0());
                    				
                    otherlv_14=(Token)match(input,45,FOLLOW_9); 

                    					newLeafNode(otherlv_14, grammarAccess.getVerifyAccess().getStringKeyword_6_1_1());
                    				
                    // InternalBrowserAutomationDSL.g:735:5: ( (lv_textToVerify_15_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:736:6: (lv_textToVerify_15_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:736:6: (lv_textToVerify_15_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:737:7: lv_textToVerify_15_0= RULE_STRING
                    {
                    lv_textToVerify_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_textToVerify_15_0, grammarAccess.getVerifyAccess().getTextToVerifySTRINGTerminalRuleCall_6_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVerifyRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"textToVerify",
                    								lv_textToVerify_15_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomationDSL.g:755:4: (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:755:4: (otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:756:5: otherlv_16= 'a' otherlv_17= 'link' ( (lv_linkToVerify_18_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_16, grammarAccess.getVerifyAccess().getAKeyword_6_2_0());
                    				
                    otherlv_17=(Token)match(input,21,FOLLOW_9); 

                    					newLeafNode(otherlv_17, grammarAccess.getVerifyAccess().getLinkKeyword_6_2_1());
                    				
                    // InternalBrowserAutomationDSL.g:764:5: ( (lv_linkToVerify_18_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:765:6: (lv_linkToVerify_18_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:765:6: (lv_linkToVerify_18_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:766:7: lv_linkToVerify_18_0= RULE_STRING
                    {
                    lv_linkToVerify_18_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_linkToVerify_18_0, grammarAccess.getVerifyAccess().getLinkToVerifySTRINGTerminalRuleCall_6_2_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVerifyRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"linkToVerify",
                    								lv_linkToVerify_18_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomationDSL.g:784:4: (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' )
                    {
                    // InternalBrowserAutomationDSL.g:784:4: (otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url' )
                    // InternalBrowserAutomationDSL.g:785:5: otherlv_19= 'a' otherlv_20= 'link' otherlv_21= 'to' otherlv_22= 'the' otherlv_23= 'previous' otherlv_24= 'url'
                    {
                    otherlv_19=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_19, grammarAccess.getVerifyAccess().getAKeyword_6_3_0());
                    				
                    otherlv_20=(Token)match(input,21,FOLLOW_7); 

                    					newLeafNode(otherlv_20, grammarAccess.getVerifyAccess().getLinkKeyword_6_3_1());
                    				
                    otherlv_21=(Token)match(input,16,FOLLOW_11); 

                    					newLeafNode(otherlv_21, grammarAccess.getVerifyAccess().getToKeyword_6_3_2());
                    				
                    otherlv_22=(Token)match(input,20,FOLLOW_35); 

                    					newLeafNode(otherlv_22, grammarAccess.getVerifyAccess().getTheKeyword_6_3_3());
                    				
                    otherlv_23=(Token)match(input,46,FOLLOW_8); 

                    					newLeafNode(otherlv_23, grammarAccess.getVerifyAccess().getPreviousKeyword_6_3_4());
                    				
                    otherlv_24=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_24, grammarAccess.getVerifyAccess().getUrlKeyword_6_3_5());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleRead"
    // InternalBrowserAutomationDSL.g:815:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalBrowserAutomationDSL.g:815:45: (iv_ruleRead= ruleRead EOF )
            // InternalBrowserAutomationDSL.g:816:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalBrowserAutomationDSL.g:822:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'title' otherlv_3= 'and' otherlv_4= 'url' otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'news' otherlv_8= 'number' ( (lv_number_9_0= RULE_INT ) ) otherlv_10= 'in' otherlv_11= 'the' otherlv_12= 'page' ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_number_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:828:2: ( (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'title' otherlv_3= 'and' otherlv_4= 'url' otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'news' otherlv_8= 'number' ( (lv_number_9_0= RULE_INT ) ) otherlv_10= 'in' otherlv_11= 'the' otherlv_12= 'page' ) )
            // InternalBrowserAutomationDSL.g:829:2: (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'title' otherlv_3= 'and' otherlv_4= 'url' otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'news' otherlv_8= 'number' ( (lv_number_9_0= RULE_INT ) ) otherlv_10= 'in' otherlv_11= 'the' otherlv_12= 'page' )
            {
            // InternalBrowserAutomationDSL.g:829:2: (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'title' otherlv_3= 'and' otherlv_4= 'url' otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'news' otherlv_8= 'number' ( (lv_number_9_0= RULE_INT ) ) otherlv_10= 'in' otherlv_11= 'the' otherlv_12= 'page' )
            // InternalBrowserAutomationDSL.g:830:3: otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'title' otherlv_3= 'and' otherlv_4= 'url' otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'news' otherlv_8= 'number' ( (lv_number_9_0= RULE_INT ) ) otherlv_10= 'in' otherlv_11= 'the' otherlv_12= 'page'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getReadAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getReadAccess().getTitleKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getReadAccess().getAndKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getReadAccess().getUrlKeyword_4());
            		
            otherlv_5=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getReadAccess().getOfKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getReadAccess().getTheKeyword_6());
            		
            otherlv_7=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getReadAccess().getNewsKeyword_7());
            		
            otherlv_8=(Token)match(input,49,FOLLOW_38); 

            			newLeafNode(otherlv_8, grammarAccess.getReadAccess().getNumberKeyword_8());
            		
            // InternalBrowserAutomationDSL.g:866:3: ( (lv_number_9_0= RULE_INT ) )
            // InternalBrowserAutomationDSL.g:867:4: (lv_number_9_0= RULE_INT )
            {
            // InternalBrowserAutomationDSL.g:867:4: (lv_number_9_0= RULE_INT )
            // InternalBrowserAutomationDSL.g:868:5: lv_number_9_0= RULE_INT
            {
            lv_number_9_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_number_9_0, grammarAccess.getReadAccess().getNumberINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,50,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getReadAccess().getInKeyword_10());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getReadAccess().getTheKeyword_11());
            		
            otherlv_12=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getReadAccess().getPageKeyword_12());
            		

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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRulePaste"
    // InternalBrowserAutomationDSL.g:900:1: entryRulePaste returns [EObject current=null] : iv_rulePaste= rulePaste EOF ;
    public final EObject entryRulePaste() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaste = null;


        try {
            // InternalBrowserAutomationDSL.g:900:46: (iv_rulePaste= rulePaste EOF )
            // InternalBrowserAutomationDSL.g:901:2: iv_rulePaste= rulePaste EOF
            {
             newCompositeNode(grammarAccess.getPasteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaste=rulePaste();

            state._fsp--;

             current =iv_rulePaste; 
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
    // $ANTLR end "entryRulePaste"


    // $ANTLR start "rulePaste"
    // InternalBrowserAutomationDSL.g:907:1: rulePaste returns [EObject current=null] : ( () otherlv_1= 'paste' otherlv_2= 'the' otherlv_3= 'title' otherlv_4= 'in' ( (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' ) | (otherlv_8= 'search' otherlv_9= 'field' ) ) ) ;
    public final EObject rulePaste() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:913:2: ( ( () otherlv_1= 'paste' otherlv_2= 'the' otherlv_3= 'title' otherlv_4= 'in' ( (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' ) | (otherlv_8= 'search' otherlv_9= 'field' ) ) ) )
            // InternalBrowserAutomationDSL.g:914:2: ( () otherlv_1= 'paste' otherlv_2= 'the' otherlv_3= 'title' otherlv_4= 'in' ( (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' ) | (otherlv_8= 'search' otherlv_9= 'field' ) ) )
            {
            // InternalBrowserAutomationDSL.g:914:2: ( () otherlv_1= 'paste' otherlv_2= 'the' otherlv_3= 'title' otherlv_4= 'in' ( (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' ) | (otherlv_8= 'search' otherlv_9= 'field' ) ) )
            // InternalBrowserAutomationDSL.g:915:3: () otherlv_1= 'paste' otherlv_2= 'the' otherlv_3= 'title' otherlv_4= 'in' ( (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' ) | (otherlv_8= 'search' otherlv_9= 'field' ) )
            {
            // InternalBrowserAutomationDSL.g:915:3: ()
            // InternalBrowserAutomationDSL.g:916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPasteAccess().getPasteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPasteAccess().getPasteKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getPasteAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getPasteAccess().getTitleKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getPasteAccess().getInKeyword_4());
            		
            // InternalBrowserAutomationDSL.g:938:3: ( (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' ) | (otherlv_8= 'search' otherlv_9= 'field' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:939:4: (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' )
                    {
                    // InternalBrowserAutomationDSL.g:939:4: (otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field' )
                    // InternalBrowserAutomationDSL.g:940:5: otherlv_5= 'the' otherlv_6= 'search' otherlv_7= 'field'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_41); 

                    					newLeafNode(otherlv_5, grammarAccess.getPasteAccess().getTheKeyword_5_0_0());
                    				
                    otherlv_6=(Token)match(input,30,FOLLOW_20); 

                    					newLeafNode(otherlv_6, grammarAccess.getPasteAccess().getSearchKeyword_5_0_1());
                    				
                    otherlv_7=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getPasteAccess().getFieldKeyword_5_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:954:4: (otherlv_8= 'search' otherlv_9= 'field' )
                    {
                    // InternalBrowserAutomationDSL.g:954:4: (otherlv_8= 'search' otherlv_9= 'field' )
                    // InternalBrowserAutomationDSL.g:955:5: otherlv_8= 'search' otherlv_9= 'field'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_20); 

                    					newLeafNode(otherlv_8, grammarAccess.getPasteAccess().getSearchKeyword_5_1_0());
                    				
                    otherlv_9=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getPasteAccess().getFieldKeyword_5_1_1());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePaste"


    // $ANTLR start "entryRuleUncheck"
    // InternalBrowserAutomationDSL.g:969:1: entryRuleUncheck returns [EObject current=null] : iv_ruleUncheck= ruleUncheck EOF ;
    public final EObject entryRuleUncheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncheck = null;


        try {
            // InternalBrowserAutomationDSL.g:969:48: (iv_ruleUncheck= ruleUncheck EOF )
            // InternalBrowserAutomationDSL.g:970:2: iv_ruleUncheck= ruleUncheck EOF
            {
             newCompositeNode(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncheck=ruleUncheck();

            state._fsp--;

             current =iv_ruleUncheck; 
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
    // $ANTLR end "entryRuleUncheck"


    // $ANTLR start "ruleUncheck"
    // InternalBrowserAutomationDSL.g:976:1: ruleUncheck returns [EObject current=null] : ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' ) ;
    public final EObject ruleUncheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:982:2: ( ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' ) )
            // InternalBrowserAutomationDSL.g:983:2: ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' )
            {
            // InternalBrowserAutomationDSL.g:983:2: ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' )
            // InternalBrowserAutomationDSL.g:984:3: () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes'
            {
            // InternalBrowserAutomationDSL.g:984:3: ()
            // InternalBrowserAutomationDSL.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUncheckAccess().getUncheckAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getUncheckAccess().getUncheckKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getUncheckAccess().getAllKeyword_2());
            		
            otherlv_3=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUncheckAccess().getCheckboxesKeyword_3());
            		

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
    // $ANTLR end "ruleUncheck"


    // $ANTLR start "entryRuleCombobox"
    // InternalBrowserAutomationDSL.g:1007:1: entryRuleCombobox returns [EObject current=null] : iv_ruleCombobox= ruleCombobox EOF ;
    public final EObject entryRuleCombobox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombobox = null;


        try {
            // InternalBrowserAutomationDSL.g:1007:49: (iv_ruleCombobox= ruleCombobox EOF )
            // InternalBrowserAutomationDSL.g:1008:2: iv_ruleCombobox= ruleCombobox EOF
            {
             newCompositeNode(grammarAccess.getComboboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCombobox=ruleCombobox();

            state._fsp--;

             current =iv_ruleCombobox; 
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
    // $ANTLR end "entryRuleCombobox"


    // $ANTLR start "ruleCombobox"
    // InternalBrowserAutomationDSL.g:1014:1: ruleCombobox returns [EObject current=null] : (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleCombobox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_option_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:1020:2: ( (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomationDSL.g:1021:2: (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomationDSL.g:1021:2: (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) )
            // InternalBrowserAutomationDSL.g:1022:3: otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComboboxAccess().getChooseKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getComboboxAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getComboboxAccess().getOptionKeyword_2());
            		
            // InternalBrowserAutomationDSL.g:1034:3: ( (lv_option_3_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:1035:4: (lv_option_3_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:1035:4: (lv_option_3_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:1036:5: lv_option_3_0= RULE_STRING
            {
            lv_option_3_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_option_3_0, grammarAccess.getComboboxAccess().getOptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"option",
            						lv_option_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComboboxAccess().getInKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getComboboxAccess().getTheKeyword_5());
            		
            otherlv_6=(Token)match(input,57,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getComboboxAccess().getComboboxKeyword_6());
            		
            // InternalBrowserAutomationDSL.g:1064:3: ( (lv_label_7_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:1065:4: (lv_label_7_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:1065:4: (lv_label_7_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:1066:5: lv_label_7_0= RULE_STRING
            {
            lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_label_7_0, grammarAccess.getComboboxAccess().getLabelSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_7_0,
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
    // $ANTLR end "ruleCombobox"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0098801090048802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});

}