package dk.itu.smdp2015.church.serializer;

import com.google.inject.Inject;
import dk.itu.smdp2015.church.services.ConfiguratorGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractConfiguratorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ConfiguratorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Configurator_CommaKeyword_5_0_q;
	protected AbstractElementAlias match_ParameterGroup_CommaKeyword_3_1_4_q;
	protected AbstractElementAlias match_ParameterGroup_CommaKeyword_3_2_2_0_q;
	protected AbstractElementAlias match_ParameterGroup_CommaKeyword_3_2_3_q;
	protected AbstractElementAlias match_Parameter_OptionalKeyword_3_0_1_a;
	protected AbstractElementAlias match_Primitive_LeftParenthesisKeyword_6_0_a;
	protected AbstractElementAlias match_Primitive_LeftParenthesisKeyword_6_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ConfiguratorGrammarAccess) access;
		match_Configurator_CommaKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getConfiguratorAccess().getCommaKeyword_5_0());
		match_ParameterGroup_CommaKeyword_3_1_4_q = new TokenAlias(false, true, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_1_4());
		match_ParameterGroup_CommaKeyword_3_2_2_0_q = new TokenAlias(false, true, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_2_0());
		match_ParameterGroup_CommaKeyword_3_2_3_q = new TokenAlias(false, true, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_2_3());
		match_Parameter_OptionalKeyword_3_0_1_a = new TokenAlias(true, true, grammarAccess.getParameterAccess().getOptionalKeyword_3_0_1());
		match_Primitive_LeftParenthesisKeyword_6_0_a = new TokenAlias(true, true, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_0());
		match_Primitive_LeftParenthesisKeyword_6_0_p = new TokenAlias(true, false, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_0());
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
			if(match_Configurator_CommaKeyword_5_0_q.equals(syntax))
				emit_Configurator_CommaKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterGroup_CommaKeyword_3_1_4_q.equals(syntax))
				emit_ParameterGroup_CommaKeyword_3_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterGroup_CommaKeyword_3_2_2_0_q.equals(syntax))
				emit_ParameterGroup_CommaKeyword_3_2_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterGroup_CommaKeyword_3_2_3_q.equals(syntax))
				emit_ParameterGroup_CommaKeyword_3_2_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_OptionalKeyword_3_0_1_a.equals(syntax))
				emit_Parameter_OptionalKeyword_3_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primitive_LeftParenthesisKeyword_6_0_a.equals(syntax))
				emit_Primitive_LeftParenthesisKeyword_6_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primitive_LeftParenthesisKeyword_6_0_p.equals(syntax))
				emit_Primitive_LeftParenthesisKeyword_6_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Configurator_CommaKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ParameterGroup_CommaKeyword_3_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ParameterGroup_CommaKeyword_3_2_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ParameterGroup_CommaKeyword_3_2_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'optional'*
	 */
	protected void emit_Parameter_OptionalKeyword_3_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Primitive_LeftParenthesisKeyword_6_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Primitive_LeftParenthesisKeyword_6_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
