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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_INT", "RULE_DOMAIN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'url'", "'click'", "'on'", "'the'", "'link'", "'button'", "'image'", "'variable'", "'fill'", "'text'", "'field'", "'with'", "'select'", "'checkbox'", "'values'", "','", "'verify'", "'that'", "'page'", "'contains'", "'string'", "'read'", "'of'", "'number'", "'uncheck'", "'all'", "'checkboxes'", "'choose'", "'option'", "'in'", "'combobox'", "'title'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_URL=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_DOMAIN=7;
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

                if ( (LA1_0==13||LA1_0==17||LA1_0==20||LA1_0==27||LA1_0==31||LA1_0==35||LA1_0==40||LA1_0==43||LA1_0==46) ) {
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
    // InternalBrowserAutomationDSL.g:107:1: ruleCommand returns [EObject current=null] : (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_OpenBrowser_0 = null;

        EObject this_GoTo_1 = null;

        EObject this_Click_2 = null;

        EObject this_Fill_3 = null;

        EObject this_Select_4 = null;

        EObject this_Verify_5 = null;

        EObject this_Read_6 = null;

        EObject this_Uncheck_7 = null;

        EObject this_Combobox_8 = null;



        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:113:2: ( (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox ) )
            // InternalBrowserAutomationDSL.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox )
            {
            // InternalBrowserAutomationDSL.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            case 35:
                {
                alt2=6;
                }
                break;
            case 40:
                {
                alt2=7;
                }
                break;
            case 43:
                {
                alt2=8;
                }
                break;
            case 46:
                {
                alt2=9;
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
                    // InternalBrowserAutomationDSL.g:178:3: this_Uncheck_7= ruleUncheck
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUncheckParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Uncheck_7=ruleUncheck();

                    state._fsp--;


                    			current = this_Uncheck_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBrowserAutomationDSL.g:187:3: this_Combobox_8= ruleCombobox
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getComboboxParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Combobox_8=ruleCombobox();

                    state._fsp--;


                    			current = this_Combobox_8;
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
    // InternalBrowserAutomationDSL.g:199:1: entryRuleOpenBrowser returns [EObject current=null] : iv_ruleOpenBrowser= ruleOpenBrowser EOF ;
    public final EObject entryRuleOpenBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenBrowser = null;


        try {
            // InternalBrowserAutomationDSL.g:199:52: (iv_ruleOpenBrowser= ruleOpenBrowser EOF )
            // InternalBrowserAutomationDSL.g:200:2: iv_ruleOpenBrowser= ruleOpenBrowser EOF
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
    // InternalBrowserAutomationDSL.g:206:1: ruleOpenBrowser returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) ;
    public final EObject ruleOpenBrowser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:212:2: ( ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) )
            // InternalBrowserAutomationDSL.g:213:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            {
            // InternalBrowserAutomationDSL.g:213:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            // InternalBrowserAutomationDSL.g:214:3: () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window'
            {
            // InternalBrowserAutomationDSL.g:214:3: ()
            // InternalBrowserAutomationDSL.g:215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenBrowserAccess().getOpenKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenBrowserAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBrowserAutomationDSL.g:241:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalBrowserAutomationDSL.g:241:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalBrowserAutomationDSL.g:242:2: iv_ruleGoTo= ruleGoTo EOF
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
    // InternalBrowserAutomationDSL.g:248:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= RULE_URL ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_url_3_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:254:2: ( (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= RULE_URL ) ) ) )
            // InternalBrowserAutomationDSL.g:255:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= RULE_URL ) ) )
            {
            // InternalBrowserAutomationDSL.g:255:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= RULE_URL ) ) )
            // InternalBrowserAutomationDSL.g:256:3: otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= RULE_URL ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getUrlKeyword_2());
            		
            // InternalBrowserAutomationDSL.g:268:3: ( (lv_url_3_0= RULE_URL ) )
            // InternalBrowserAutomationDSL.g:269:4: (lv_url_3_0= RULE_URL )
            {
            // InternalBrowserAutomationDSL.g:269:4: (lv_url_3_0= RULE_URL )
            // InternalBrowserAutomationDSL.g:270:5: lv_url_3_0= RULE_URL
            {
            lv_url_3_0=(Token)match(input,RULE_URL,FOLLOW_2); 

            					newLeafNode(lv_url_3_0, grammarAccess.getGoToAccess().getUrlURLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_3_0,
            						"fr.imta.yperiquoi.browserautomation.BrowserAutomationDSL.URL");
            				

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
    // InternalBrowserAutomationDSL.g:290:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomationDSL.g:290:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomationDSL.g:291:2: iv_ruleClick= ruleClick EOF
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
    // InternalBrowserAutomationDSL.g:297:1: ruleClick returns [EObject current=null] : ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_linkText_5_0=null;
        Token otherlv_6=null;
        Token lv_buttonText_7_0=null;
        Token otherlv_8=null;
        Token lv_alt_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_variable_11_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:303:2: ( ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) ) ) ) )
            // InternalBrowserAutomationDSL.g:304:2: ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) ) ) )
            {
            // InternalBrowserAutomationDSL.g:304:2: ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) ) ) )
            // InternalBrowserAutomationDSL.g:305:3: () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) ) )
            {
            // InternalBrowserAutomationDSL.g:305:3: ()
            // InternalBrowserAutomationDSL.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClickAccess().getClickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getClickAccess().getOnKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getClickAccess().getTheKeyword_3());
            		
            // InternalBrowserAutomationDSL.g:324:3: ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
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
                    // InternalBrowserAutomationDSL.g:325:4: (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:325:4: (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:326:5: otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_13); 

                    					newLeafNode(otherlv_4, grammarAccess.getClickAccess().getLinkKeyword_4_0_0());
                    				
                    // InternalBrowserAutomationDSL.g:330:5: ( (lv_linkText_5_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:331:6: (lv_linkText_5_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:331:6: (lv_linkText_5_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:332:7: lv_linkText_5_0= RULE_STRING
                    {
                    lv_linkText_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_linkText_5_0, grammarAccess.getClickAccess().getLinkTextSTRINGTerminalRuleCall_4_0_1_0());
                    						

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
                    // InternalBrowserAutomationDSL.g:350:4: (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:350:4: (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:351:5: otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getClickAccess().getButtonKeyword_4_1_0());
                    				
                    // InternalBrowserAutomationDSL.g:355:5: ( (lv_buttonText_7_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:356:6: (lv_buttonText_7_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:356:6: (lv_buttonText_7_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:357:7: lv_buttonText_7_0= RULE_STRING
                    {
                    lv_buttonText_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_buttonText_7_0, grammarAccess.getClickAccess().getButtonTextSTRINGTerminalRuleCall_4_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"buttonText",
                    								lv_buttonText_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomationDSL.g:375:4: (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:375:4: (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:376:5: otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getClickAccess().getImageKeyword_4_2_0());
                    				
                    // InternalBrowserAutomationDSL.g:380:5: ( (lv_alt_9_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:381:6: (lv_alt_9_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:381:6: (lv_alt_9_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:382:7: lv_alt_9_0= RULE_STRING
                    {
                    lv_alt_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_alt_9_0, grammarAccess.getClickAccess().getAltSTRINGTerminalRuleCall_4_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alt",
                    								lv_alt_9_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomationDSL.g:400:4: (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:400:4: (otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) ) )
                    // InternalBrowserAutomationDSL.g:401:5: otherlv_10= 'variable' ( (lv_variable_11_0= ruleDOMELEMENT ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(otherlv_10, grammarAccess.getClickAccess().getVariableKeyword_4_3_0());
                    				
                    // InternalBrowserAutomationDSL.g:405:5: ( (lv_variable_11_0= ruleDOMELEMENT ) )
                    // InternalBrowserAutomationDSL.g:406:6: (lv_variable_11_0= ruleDOMELEMENT )
                    {
                    // InternalBrowserAutomationDSL.g:406:6: (lv_variable_11_0= ruleDOMELEMENT )
                    // InternalBrowserAutomationDSL.g:407:7: lv_variable_11_0= ruleDOMELEMENT
                    {

                    							newCompositeNode(grammarAccess.getClickAccess().getVariableDOMELEMENTParserRuleCall_4_3_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_variable_11_0=ruleDOMELEMENT();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClickRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_11_0,
                    								"fr.imta.yperiquoi.browserautomation.BrowserAutomationDSL.DOMELEMENT");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


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
    // InternalBrowserAutomationDSL.g:430:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalBrowserAutomationDSL.g:430:45: (iv_ruleFill= ruleFill EOF )
            // InternalBrowserAutomationDSL.g:431:2: iv_ruleFill= ruleFill EOF
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
    // InternalBrowserAutomationDSL.g:437:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) otherlv_5= 'with' otherlv_6= 'the' ( (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) ) | (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) ) ) ) ;
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
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_variable_10_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:443:2: ( (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) otherlv_5= 'with' otherlv_6= 'the' ( (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) ) | (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) ) ) ) )
            // InternalBrowserAutomationDSL.g:444:2: (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) otherlv_5= 'with' otherlv_6= 'the' ( (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) ) | (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) ) ) )
            {
            // InternalBrowserAutomationDSL.g:444:2: (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) otherlv_5= 'with' otherlv_6= 'the' ( (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) ) | (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) ) ) )
            // InternalBrowserAutomationDSL.g:445:3: otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'text' otherlv_3= 'field' ( (lv_fieldName_4_0= RULE_STRING ) ) otherlv_5= 'with' otherlv_6= 'the' ( (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) ) | (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFillAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getFillAccess().getTextKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFillAccess().getFieldKeyword_3());
            		
            // InternalBrowserAutomationDSL.g:461:3: ( (lv_fieldName_4_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:462:4: (lv_fieldName_4_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:462:4: (lv_fieldName_4_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:463:5: lv_fieldName_4_0= RULE_STRING
            {
            lv_fieldName_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_fieldName_4_0, grammarAccess.getFillAccess().getFieldNameSTRINGTerminalRuleCall_4_0());
            				

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

            otherlv_5=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getFillAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getFillAccess().getTheKeyword_6());
            		
            // InternalBrowserAutomationDSL.g:487:3: ( (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) ) | (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:488:4: (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:488:4: (otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:489:5: otherlv_7= 'text' ( (lv_textToFill_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    					newLeafNode(otherlv_7, grammarAccess.getFillAccess().getTextKeyword_7_0_0());
                    				
                    // InternalBrowserAutomationDSL.g:493:5: ( (lv_textToFill_8_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:494:6: (lv_textToFill_8_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:494:6: (lv_textToFill_8_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:495:7: lv_textToFill_8_0= RULE_STRING
                    {
                    lv_textToFill_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_textToFill_8_0, grammarAccess.getFillAccess().getTextToFillSTRINGTerminalRuleCall_7_0_1_0());
                    						

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
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:513:4: (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:513:4: (otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) ) )
                    // InternalBrowserAutomationDSL.g:514:5: otherlv_9= 'variable' ( (lv_variable_10_0= ruleDOMELEMENT ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(otherlv_9, grammarAccess.getFillAccess().getVariableKeyword_7_1_0());
                    				
                    // InternalBrowserAutomationDSL.g:518:5: ( (lv_variable_10_0= ruleDOMELEMENT ) )
                    // InternalBrowserAutomationDSL.g:519:6: (lv_variable_10_0= ruleDOMELEMENT )
                    {
                    // InternalBrowserAutomationDSL.g:519:6: (lv_variable_10_0= ruleDOMELEMENT )
                    // InternalBrowserAutomationDSL.g:520:7: lv_variable_10_0= ruleDOMELEMENT
                    {

                    							newCompositeNode(grammarAccess.getFillAccess().getVariableDOMELEMENTParserRuleCall_7_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_variable_10_0=ruleDOMELEMENT();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFillRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_10_0,
                    								"fr.imta.yperiquoi.browserautomation.BrowserAutomationDSL.DOMELEMENT");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


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
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelect"
    // InternalBrowserAutomationDSL.g:543:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalBrowserAutomationDSL.g:543:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalBrowserAutomationDSL.g:544:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalBrowserAutomationDSL.g:550:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'with' otherlv_4= 'values' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:556:2: ( (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'with' otherlv_4= 'values' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalBrowserAutomationDSL.g:557:2: (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'with' otherlv_4= 'values' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalBrowserAutomationDSL.g:557:2: (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'with' otherlv_4= 'values' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalBrowserAutomationDSL.g:558:3: otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'with' otherlv_4= 'values' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCheckboxKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getValuesKeyword_4());
            		
            // InternalBrowserAutomationDSL.g:578:3: ( (lv_values_5_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:579:4: (lv_values_5_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:579:4: (lv_values_5_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:580:5: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_values_5_0, grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowserAutomationDSL.g:596:3: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBrowserAutomationDSL.g:597:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,34,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBrowserAutomationDSL.g:601:4: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalBrowserAutomationDSL.g:602:5: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalBrowserAutomationDSL.g:602:5: (lv_values_7_0= RULE_STRING )
            	    // InternalBrowserAutomationDSL.g:603:6: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    						newLeafNode(lv_values_7_0, grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_6_1_0());
            	    					

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


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVerify"
    // InternalBrowserAutomationDSL.g:624:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalBrowserAutomationDSL.g:624:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalBrowserAutomationDSL.g:625:2: iv_ruleVerify= ruleVerify EOF
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
    // InternalBrowserAutomationDSL.g:631:1: ruleVerify returns [EObject current=null] : ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' otherlv_6= 'the' ( (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) ) | (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) ) | (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_textToVerify_8_0=null;
        Token otherlv_9=null;
        Token lv_linkToVerify_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_variable_12_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:637:2: ( ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' otherlv_6= 'the' ( (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) ) | (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) ) | (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) ) ) ) )
            // InternalBrowserAutomationDSL.g:638:2: ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' otherlv_6= 'the' ( (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) ) | (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) ) | (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) ) ) )
            {
            // InternalBrowserAutomationDSL.g:638:2: ( () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' otherlv_6= 'the' ( (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) ) | (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) ) | (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) ) ) )
            // InternalBrowserAutomationDSL.g:639:3: () otherlv_1= 'verify' otherlv_2= 'that' otherlv_3= 'the' otherlv_4= 'page' otherlv_5= 'contains' otherlv_6= 'the' ( (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) ) | (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) ) | (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) ) )
            {
            // InternalBrowserAutomationDSL.g:639:3: ()
            // InternalBrowserAutomationDSL.g:640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerifyAccess().getVerifyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getVerifyKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getThatKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getTheKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getVerifyAccess().getPageKeyword_4());
            		
            otherlv_5=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getContainsKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getVerifyAccess().getTheKeyword_6());
            		
            // InternalBrowserAutomationDSL.g:670:3: ( (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) ) | (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) ) | (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:671:4: (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:671:4: (otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:672:5: otherlv_7= 'string' ( (lv_textToVerify_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_13); 

                    					newLeafNode(otherlv_7, grammarAccess.getVerifyAccess().getStringKeyword_7_0_0());
                    				
                    // InternalBrowserAutomationDSL.g:676:5: ( (lv_textToVerify_8_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:677:6: (lv_textToVerify_8_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:677:6: (lv_textToVerify_8_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:678:7: lv_textToVerify_8_0= RULE_STRING
                    {
                    lv_textToVerify_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_textToVerify_8_0, grammarAccess.getVerifyAccess().getTextToVerifySTRINGTerminalRuleCall_7_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVerifyRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"textToVerify",
                    								lv_textToVerify_8_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:696:4: (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:696:4: (otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) ) )
                    // InternalBrowserAutomationDSL.g:697:5: otherlv_9= 'link' ( (lv_linkToVerify_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_13); 

                    					newLeafNode(otherlv_9, grammarAccess.getVerifyAccess().getLinkKeyword_7_1_0());
                    				
                    // InternalBrowserAutomationDSL.g:701:5: ( (lv_linkToVerify_10_0= RULE_STRING ) )
                    // InternalBrowserAutomationDSL.g:702:6: (lv_linkToVerify_10_0= RULE_STRING )
                    {
                    // InternalBrowserAutomationDSL.g:702:6: (lv_linkToVerify_10_0= RULE_STRING )
                    // InternalBrowserAutomationDSL.g:703:7: lv_linkToVerify_10_0= RULE_STRING
                    {
                    lv_linkToVerify_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_linkToVerify_10_0, grammarAccess.getVerifyAccess().getLinkToVerifySTRINGTerminalRuleCall_7_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVerifyRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"linkToVerify",
                    								lv_linkToVerify_10_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomationDSL.g:721:4: (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) )
                    {
                    // InternalBrowserAutomationDSL.g:721:4: (otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) ) )
                    // InternalBrowserAutomationDSL.g:722:5: otherlv_11= 'variable' ( (lv_variable_12_0= ruleDOMELEMENT ) )
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(otherlv_11, grammarAccess.getVerifyAccess().getVariableKeyword_7_2_0());
                    				
                    // InternalBrowserAutomationDSL.g:726:5: ( (lv_variable_12_0= ruleDOMELEMENT ) )
                    // InternalBrowserAutomationDSL.g:727:6: (lv_variable_12_0= ruleDOMELEMENT )
                    {
                    // InternalBrowserAutomationDSL.g:727:6: (lv_variable_12_0= ruleDOMELEMENT )
                    // InternalBrowserAutomationDSL.g:728:7: lv_variable_12_0= ruleDOMELEMENT
                    {

                    							newCompositeNode(grammarAccess.getVerifyAccess().getVariableDOMELEMENTParserRuleCall_7_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_variable_12_0=ruleDOMELEMENT();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVerifyRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_12_0,
                    								"fr.imta.yperiquoi.browserautomation.BrowserAutomationDSL.DOMELEMENT");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


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
    // InternalBrowserAutomationDSL.g:751:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalBrowserAutomationDSL.g:751:45: (iv_ruleRead= ruleRead EOF )
            // InternalBrowserAutomationDSL.g:752:2: iv_ruleRead= ruleRead EOF
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
    // InternalBrowserAutomationDSL.g:758:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleDOMELEMENT ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDOMELEMENT ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_linkText_8_0=null;
        Token otherlv_9=null;
        Token lv_number_10_0=null;
        AntlrDatatypeRuleToken lv_elements_2_0 = null;

        AntlrDatatypeRuleToken lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:764:2: ( (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleDOMELEMENT ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDOMELEMENT ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) ) )
            // InternalBrowserAutomationDSL.g:765:2: (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleDOMELEMENT ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDOMELEMENT ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) )
            {
            // InternalBrowserAutomationDSL.g:765:2: (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleDOMELEMENT ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDOMELEMENT ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) )
            // InternalBrowserAutomationDSL.g:766:3: otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleDOMELEMENT ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDOMELEMENT ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getReadAccess().getTheKeyword_1());
            		
            // InternalBrowserAutomationDSL.g:774:3: ( (lv_elements_2_0= ruleDOMELEMENT ) )
            // InternalBrowserAutomationDSL.g:775:4: (lv_elements_2_0= ruleDOMELEMENT )
            {
            // InternalBrowserAutomationDSL.g:775:4: (lv_elements_2_0= ruleDOMELEMENT )
            // InternalBrowserAutomationDSL.g:776:5: lv_elements_2_0= ruleDOMELEMENT
            {

            					newCompositeNode(grammarAccess.getReadAccess().getElementsDOMELEMENTParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_elements_2_0=ruleDOMELEMENT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"fr.imta.yperiquoi.browserautomation.BrowserAutomationDSL.DOMELEMENT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomationDSL.g:793:3: (otherlv_3= ',' ( (lv_elements_4_0= ruleDOMELEMENT ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBrowserAutomationDSL.g:794:4: otherlv_3= ',' ( (lv_elements_4_0= ruleDOMELEMENT ) )
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReadAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBrowserAutomationDSL.g:798:4: ( (lv_elements_4_0= ruleDOMELEMENT ) )
            	    // InternalBrowserAutomationDSL.g:799:5: (lv_elements_4_0= ruleDOMELEMENT )
            	    {
            	    // InternalBrowserAutomationDSL.g:799:5: (lv_elements_4_0= ruleDOMELEMENT )
            	    // InternalBrowserAutomationDSL.g:800:6: lv_elements_4_0= ruleDOMELEMENT
            	    {

            	    						newCompositeNode(grammarAccess.getReadAccess().getElementsDOMELEMENTParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_elements_4_0=ruleDOMELEMENT();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReadRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_4_0,
            	    							"fr.imta.yperiquoi.browserautomation.BrowserAutomationDSL.DOMELEMENT");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getReadAccess().getOfKeyword_4());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getReadAccess().getTheKeyword_5());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getReadAccess().getLinkKeyword_6());
            		
            // InternalBrowserAutomationDSL.g:830:3: ( (lv_linkText_8_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:831:4: (lv_linkText_8_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:831:4: (lv_linkText_8_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:832:5: lv_linkText_8_0= RULE_STRING
            {
            lv_linkText_8_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_linkText_8_0, grammarAccess.getReadAccess().getLinkTextSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"linkText",
            						lv_linkText_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_29); 

            			newLeafNode(otherlv_9, grammarAccess.getReadAccess().getNumberKeyword_8());
            		
            // InternalBrowserAutomationDSL.g:852:3: ( (lv_number_10_0= RULE_INT ) )
            // InternalBrowserAutomationDSL.g:853:4: (lv_number_10_0= RULE_INT )
            {
            // InternalBrowserAutomationDSL.g:853:4: (lv_number_10_0= RULE_INT )
            // InternalBrowserAutomationDSL.g:854:5: lv_number_10_0= RULE_INT
            {
            lv_number_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_number_10_0, grammarAccess.getReadAccess().getNumberINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleUncheck"
    // InternalBrowserAutomationDSL.g:874:1: entryRuleUncheck returns [EObject current=null] : iv_ruleUncheck= ruleUncheck EOF ;
    public final EObject entryRuleUncheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncheck = null;


        try {
            // InternalBrowserAutomationDSL.g:874:48: (iv_ruleUncheck= ruleUncheck EOF )
            // InternalBrowserAutomationDSL.g:875:2: iv_ruleUncheck= ruleUncheck EOF
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
    // InternalBrowserAutomationDSL.g:881:1: ruleUncheck returns [EObject current=null] : ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' ) ;
    public final EObject ruleUncheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:887:2: ( ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' ) )
            // InternalBrowserAutomationDSL.g:888:2: ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' )
            {
            // InternalBrowserAutomationDSL.g:888:2: ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' )
            // InternalBrowserAutomationDSL.g:889:3: () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes'
            {
            // InternalBrowserAutomationDSL.g:889:3: ()
            // InternalBrowserAutomationDSL.g:890:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUncheckAccess().getUncheckAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getUncheckAccess().getUncheckKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getUncheckAccess().getAllKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalBrowserAutomationDSL.g:912:1: entryRuleCombobox returns [EObject current=null] : iv_ruleCombobox= ruleCombobox EOF ;
    public final EObject entryRuleCombobox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombobox = null;


        try {
            // InternalBrowserAutomationDSL.g:912:49: (iv_ruleCombobox= ruleCombobox EOF )
            // InternalBrowserAutomationDSL.g:913:2: iv_ruleCombobox= ruleCombobox EOF
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
    // InternalBrowserAutomationDSL.g:919:1: ruleCombobox returns [EObject current=null] : (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) ) ;
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
            // InternalBrowserAutomationDSL.g:925:2: ( (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomationDSL.g:926:2: (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomationDSL.g:926:2: (otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) ) )
            // InternalBrowserAutomationDSL.g:927:3: otherlv_0= 'choose' otherlv_1= 'the' otherlv_2= 'option' ( (lv_option_3_0= RULE_STRING ) ) otherlv_4= 'in' otherlv_5= 'the' otherlv_6= 'combobox' ( (lv_label_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComboboxAccess().getChooseKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getComboboxAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getComboboxAccess().getOptionKeyword_2());
            		
            // InternalBrowserAutomationDSL.g:939:3: ( (lv_option_3_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:940:4: (lv_option_3_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:940:4: (lv_option_3_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:941:5: lv_option_3_0= RULE_STRING
            {
            lv_option_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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

            otherlv_4=(Token)match(input,48,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComboboxAccess().getInKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getComboboxAccess().getTheKeyword_5());
            		
            otherlv_6=(Token)match(input,49,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getComboboxAccess().getComboboxKeyword_6());
            		
            // InternalBrowserAutomationDSL.g:969:3: ( (lv_label_7_0= RULE_STRING ) )
            // InternalBrowserAutomationDSL.g:970:4: (lv_label_7_0= RULE_STRING )
            {
            // InternalBrowserAutomationDSL.g:970:4: (lv_label_7_0= RULE_STRING )
            // InternalBrowserAutomationDSL.g:971:5: lv_label_7_0= RULE_STRING
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


    // $ANTLR start "entryRuleDOMELEMENT"
    // InternalBrowserAutomationDSL.g:991:1: entryRuleDOMELEMENT returns [String current=null] : iv_ruleDOMELEMENT= ruleDOMELEMENT EOF ;
    public final String entryRuleDOMELEMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMELEMENT = null;


        try {
            // InternalBrowserAutomationDSL.g:991:50: (iv_ruleDOMELEMENT= ruleDOMELEMENT EOF )
            // InternalBrowserAutomationDSL.g:992:2: iv_ruleDOMELEMENT= ruleDOMELEMENT EOF
            {
             newCompositeNode(grammarAccess.getDOMELEMENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMELEMENT=ruleDOMELEMENT();

            state._fsp--;

             current =iv_ruleDOMELEMENT.getText(); 
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
    // $ANTLR end "entryRuleDOMELEMENT"


    // $ANTLR start "ruleDOMELEMENT"
    // InternalBrowserAutomationDSL.g:998:1: ruleDOMELEMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' ) ;
    public final AntlrDatatypeRuleToken ruleDOMELEMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomationDSL.g:1004:2: ( (kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' ) )
            // InternalBrowserAutomationDSL.g:1005:2: (kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' )
            {
            // InternalBrowserAutomationDSL.g:1005:2: (kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 50:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomationDSL.g:1006:3: kw= 'link'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMELEMENTAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomationDSL.g:1012:3: kw= 'button'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMELEMENTAccess().getButtonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomationDSL.g:1018:3: kw= 'image'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMELEMENTAccess().getImageKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomationDSL.g:1024:3: kw= 'url'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMELEMENTAccess().getUrlKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomationDSL.g:1030:3: (kw= 'text' kw= 'link' )
                    {
                    // InternalBrowserAutomationDSL.g:1030:3: (kw= 'text' kw= 'link' )
                    // InternalBrowserAutomationDSL.g:1031:4: kw= 'text' kw= 'link'
                    {
                    kw=(Token)match(input,28,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOMELEMENTAccess().getTextKeyword_4_0());
                    			
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOMELEMENTAccess().getLinkKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomationDSL.g:1043:3: kw= 'title'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMELEMENTAccess().getTitleKeyword_5());
                    		

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
    // $ANTLR end "ruleDOMELEMENT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000490888122002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000013880000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008004800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});

}