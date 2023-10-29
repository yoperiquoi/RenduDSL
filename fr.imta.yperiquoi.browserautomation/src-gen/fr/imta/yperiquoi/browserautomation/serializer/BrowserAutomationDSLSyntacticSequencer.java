/*
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation.serializer;

import com.google.inject.Inject;
import fr.imta.yperiquoi.browserautomation.services.BrowserAutomationDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BrowserAutomationDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BrowserAutomationDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Paste___SearchKeyword_5_1_0_FieldKeyword_5_1_1___or___TheKeyword_5_0_0_SearchKeyword_5_0_1_FieldKeyword_5_0_2__;
	protected AbstractElementAlias match_Verify___AKeyword_6_0_0_TitleKeyword_6_0_1_OfKeyword_6_0_2_TheKeyword_6_0_3_PreviouslyKeyword_6_0_4_ClickedKeyword_6_0_5_NewsKeyword_6_0_6___or___AKeyword_6_3_0_LinkKeyword_6_3_1_ToKeyword_6_3_2_TheKeyword_6_3_3_PreviousKeyword_6_3_4_UrlKeyword_6_3_5__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BrowserAutomationDSLGrammarAccess) access;
		match_Paste___SearchKeyword_5_1_0_FieldKeyword_5_1_1___or___TheKeyword_5_0_0_SearchKeyword_5_0_1_FieldKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPasteAccess().getSearchKeyword_5_1_0()), new TokenAlias(false, false, grammarAccess.getPasteAccess().getFieldKeyword_5_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPasteAccess().getTheKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getPasteAccess().getSearchKeyword_5_0_1()), new TokenAlias(false, false, grammarAccess.getPasteAccess().getFieldKeyword_5_0_2())));
		match_Verify___AKeyword_6_0_0_TitleKeyword_6_0_1_OfKeyword_6_0_2_TheKeyword_6_0_3_PreviouslyKeyword_6_0_4_ClickedKeyword_6_0_5_NewsKeyword_6_0_6___or___AKeyword_6_3_0_LinkKeyword_6_3_1_ToKeyword_6_3_2_TheKeyword_6_3_3_PreviousKeyword_6_3_4_UrlKeyword_6_3_5__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getVerifyAccess().getAKeyword_6_0_0()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getTitleKeyword_6_0_1()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getOfKeyword_6_0_2()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getTheKeyword_6_0_3()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getPreviouslyKeyword_6_0_4()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getClickedKeyword_6_0_5()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getNewsKeyword_6_0_6())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getVerifyAccess().getAKeyword_6_3_0()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getLinkKeyword_6_3_1()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getToKeyword_6_3_2()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getTheKeyword_6_3_3()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getPreviousKeyword_6_3_4()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getUrlKeyword_6_3_5())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Paste___SearchKeyword_5_1_0_FieldKeyword_5_1_1___or___TheKeyword_5_0_0_SearchKeyword_5_0_1_FieldKeyword_5_0_2__.equals(syntax))
				emit_Paste___SearchKeyword_5_1_0_FieldKeyword_5_1_1___or___TheKeyword_5_0_0_SearchKeyword_5_0_1_FieldKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Verify___AKeyword_6_0_0_TitleKeyword_6_0_1_OfKeyword_6_0_2_TheKeyword_6_0_3_PreviouslyKeyword_6_0_4_ClickedKeyword_6_0_5_NewsKeyword_6_0_6___or___AKeyword_6_3_0_LinkKeyword_6_3_1_ToKeyword_6_3_2_TheKeyword_6_3_3_PreviousKeyword_6_3_4_UrlKeyword_6_3_5__.equals(syntax))
				emit_Verify___AKeyword_6_0_0_TitleKeyword_6_0_1_OfKeyword_6_0_2_TheKeyword_6_0_3_PreviouslyKeyword_6_0_4_ClickedKeyword_6_0_5_NewsKeyword_6_0_6___or___AKeyword_6_3_0_LinkKeyword_6_3_1_ToKeyword_6_3_2_TheKeyword_6_3_3_PreviousKeyword_6_3_4_UrlKeyword_6_3_5__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('the' 'search' 'field') | ('search' 'field')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'paste' 'the' 'title' 'in' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Paste___SearchKeyword_5_1_0_FieldKeyword_5_1_1___or___TheKeyword_5_0_0_SearchKeyword_5_0_1_FieldKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'a' 
	  *             'title' 
	  *             'of' 
	  *             'the' 
	  *             'previously' 
	  *             'clicked' 
	  *             'news'
	  *         ) | 
	  *         (
	  *             'a' 
	  *             'link' 
	  *             'to' 
	  *             'the' 
	  *             'previous' 
	  *             'url'
	  *         )
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'verify' 'that' 'the' 'page' 'contains' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Verify___AKeyword_6_0_0_TitleKeyword_6_0_1_OfKeyword_6_0_2_TheKeyword_6_0_3_PreviouslyKeyword_6_0_4_ClickedKeyword_6_0_5_NewsKeyword_6_0_6___or___AKeyword_6_3_0_LinkKeyword_6_3_1_ToKeyword_6_3_2_TheKeyword_6_3_3_PreviousKeyword_6_3_4_UrlKeyword_6_3_5__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}