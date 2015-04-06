/*
* generated by Xtext
*/
package dk.itu.smdp2015.church.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.itu.smdp2015.church.services.ConfiguratorGrammarAccess;

public class ConfiguratorParser extends AbstractContentAssistParser {
	
	@Inject
	private ConfiguratorGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.itu.smdp2015.church.ui.contentassist.antlr.internal.InternalConfiguratorParser createParser() {
		dk.itu.smdp2015.church.ui.contentassist.antlr.internal.InternalConfiguratorParser result = new dk.itu.smdp2015.church.ui.contentassist.antlr.internal.InternalConfiguratorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractParameterAccess().getAlternatives(), "rule__AbstractParameter__Alternatives");
					put(grammarAccess.getParameterAccess().getAlternatives_3_0(), "rule__Parameter__Alternatives_3_0");
					put(grammarAccess.getValueRangeAccess().getAlternatives(), "rule__ValueRange__Alternatives");
					put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
					put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_3_0(), "rule__EDouble__Alternatives_3_0");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
					put(grammarAccess.getComparativeOperatorAccess().getAlternatives(), "rule__ComparativeOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getScalarOperatorAccess().getAlternatives(), "rule__ScalarOperator__Alternatives");
					put(grammarAccess.getConfiguratorAccess().getGroup(), "rule__Configurator__Group__0");
					put(grammarAccess.getConfiguratorAccess().getGroup_5(), "rule__Configurator__Group_5__0");
					put(grammarAccess.getParameterGroupAccess().getGroup(), "rule__ParameterGroup__Group__0");
					put(grammarAccess.getParameterGroupAccess().getGroup_3_0(), "rule__ParameterGroup__Group_3_0__0");
					put(grammarAccess.getParameterGroupAccess().getGroup_3_1(), "rule__ParameterGroup__Group_3_1__0");
					put(grammarAccess.getParameterGroupAccess().getGroup_3_1_3(), "rule__ParameterGroup__Group_3_1_3__0");
					put(grammarAccess.getParameterGroupAccess().getGroup_3_2(), "rule__ParameterGroup__Group_3_2__0");
					put(grammarAccess.getParameterGroupAccess().getGroup_3_2_2(), "rule__ParameterGroup__Group_3_2_2__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_3_1(), "rule__Parameter__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup_3_2(), "rule__Parameter__Group_3_2__0");
					put(grammarAccess.getParameterAccess().getGroup_3_2_3(), "rule__Parameter__Group_3_2_3__0");
					put(grammarAccess.getParameterAccess().getGroup_3_3(), "rule__Parameter__Group_3_3__0");
					put(grammarAccess.getEnumeratedAccess().getGroup(), "rule__Enumerated__Group__0");
					put(grammarAccess.getEnumeratedAccess().getGroup_2(), "rule__Enumerated__Group_2__0");
					put(grammarAccess.getBoundedAccess().getGroup(), "rule__Bounded__Group__0");
					put(grammarAccess.getDisjunctiveAccess().getGroup(), "rule__Disjunctive__Group__0");
					put(grammarAccess.getDisjunctiveAccess().getGroup_1(), "rule__Disjunctive__Group_1__0");
					put(grammarAccess.getConjunctiveAccess().getGroup(), "rule__Conjunctive__Group__0");
					put(grammarAccess.getConjunctiveAccess().getGroup_1(), "rule__Conjunctive__Group_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
					put(grammarAccess.getComparativeAccess().getGroup(), "rule__Comparative__Group__0");
					put(grammarAccess.getComparativeAccess().getGroup_1(), "rule__Comparative__Group_1__0");
					put(grammarAccess.getAdditiveAccess().getGroup(), "rule__Additive__Group__0");
					put(grammarAccess.getAdditiveAccess().getGroup_1(), "rule__Additive__Group_1__0");
					put(grammarAccess.getMultiplicativeAccess().getGroup(), "rule__Multiplicative__Group__0");
					put(grammarAccess.getMultiplicativeAccess().getGroup_1(), "rule__Multiplicative__Group_1__0");
					put(grammarAccess.getPrimitiveAccess().getGroup_8(), "rule__Primitive__Group_8__0");
					put(grammarAccess.getUnaryAccess().getGroup(), "rule__Unary__Group__0");
					put(grammarAccess.getScalarAccess().getGroup(), "rule__Scalar__Group__0");
					put(grammarAccess.getInRangeAccess().getGroup(), "rule__InRange__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_3(), "rule__EDouble__Group_3__0");
					put(grammarAccess.getConfiguratorAccess().getNameAssignment_1(), "rule__Configurator__NameAssignment_1");
					put(grammarAccess.getConfiguratorAccess().getDescriptionAssignment_2(), "rule__Configurator__DescriptionAssignment_2");
					put(grammarAccess.getConfiguratorAccess().getParametersAssignment_4(), "rule__Configurator__ParametersAssignment_4");
					put(grammarAccess.getConfiguratorAccess().getParametersAssignment_5_1(), "rule__Configurator__ParametersAssignment_5_1");
					put(grammarAccess.getParameterGroupAccess().getNameAssignment_1(), "rule__ParameterGroup__NameAssignment_1");
					put(grammarAccess.getParameterGroupAccess().getDescriptionAssignment_2(), "rule__ParameterGroup__DescriptionAssignment_2");
					put(grammarAccess.getParameterGroupAccess().getVisibilityAssignment_3_0_1(), "rule__ParameterGroup__VisibilityAssignment_3_0_1");
					put(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_2(), "rule__ParameterGroup__ConstraintsAssignment_3_1_2");
					put(grammarAccess.getParameterGroupAccess().getConstraintsAssignment_3_1_3_1(), "rule__ParameterGroup__ConstraintsAssignment_3_1_3_1");
					put(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_1(), "rule__ParameterGroup__ParametersAssignment_3_2_1");
					put(grammarAccess.getParameterGroupAccess().getParametersAssignment_3_2_2_1(), "rule__ParameterGroup__ParametersAssignment_3_2_2_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getDescriptionAssignment_2(), "rule__Parameter__DescriptionAssignment_2");
					put(grammarAccess.getParameterAccess().getMandatoryAssignment_3_0_0(), "rule__Parameter__MandatoryAssignment_3_0_0");
					put(grammarAccess.getParameterAccess().getVisibilityAssignment_3_1_1(), "rule__Parameter__VisibilityAssignment_3_1_1");
					put(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_2(), "rule__Parameter__ConstraintsAssignment_3_2_2");
					put(grammarAccess.getParameterAccess().getConstraintsAssignment_3_2_3_1(), "rule__Parameter__ConstraintsAssignment_3_2_3_1");
					put(grammarAccess.getParameterAccess().getValueRangeAssignment_3_3_1(), "rule__Parameter__ValueRangeAssignment_3_3_1");
					put(grammarAccess.getEnumeratedAccess().getValuesAssignment_1(), "rule__Enumerated__ValuesAssignment_1");
					put(grammarAccess.getEnumeratedAccess().getValuesAssignment_2_1(), "rule__Enumerated__ValuesAssignment_2_1");
					put(grammarAccess.getBoundedAccess().getLowerBoundAssignment_1(), "rule__Bounded__LowerBoundAssignment_1");
					put(grammarAccess.getBoundedAccess().getUpperBoundAssignment_3(), "rule__Bounded__UpperBoundAssignment_3");
					put(grammarAccess.getDisjunctiveAccess().getOperatorAssignment_1_1(), "rule__Disjunctive__OperatorAssignment_1_1");
					put(grammarAccess.getDisjunctiveAccess().getRightAssignment_1_2(), "rule__Disjunctive__RightAssignment_1_2");
					put(grammarAccess.getConjunctiveAccess().getOperatorAssignment_1_1(), "rule__Conjunctive__OperatorAssignment_1_1");
					put(grammarAccess.getConjunctiveAccess().getRightAssignment_1_2(), "rule__Conjunctive__RightAssignment_1_2");
					put(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1(), "rule__Equality__OperatorAssignment_1_1");
					put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
					put(grammarAccess.getComparativeAccess().getOperatorAssignment_1_1(), "rule__Comparative__OperatorAssignment_1_1");
					put(grammarAccess.getComparativeAccess().getRightAssignment_1_2(), "rule__Comparative__RightAssignment_1_2");
					put(grammarAccess.getAdditiveAccess().getOperatorAssignment_1_1(), "rule__Additive__OperatorAssignment_1_1");
					put(grammarAccess.getAdditiveAccess().getRightAssignment_1_2(), "rule__Additive__RightAssignment_1_2");
					put(grammarAccess.getMultiplicativeAccess().getOperatorAssignment_1_1(), "rule__Multiplicative__OperatorAssignment_1_1");
					put(grammarAccess.getMultiplicativeAccess().getRightAssignment_1_2(), "rule__Multiplicative__RightAssignment_1_2");
					put(grammarAccess.getUnaryAccess().getOperatorAssignment_0(), "rule__Unary__OperatorAssignment_0");
					put(grammarAccess.getUnaryAccess().getInnerAssignment_1(), "rule__Unary__InnerAssignment_1");
					put(grammarAccess.getScalarAccess().getOperatorAssignment_0(), "rule__Scalar__OperatorAssignment_0");
					put(grammarAccess.getScalarAccess().getIdAssignment_2(), "rule__Scalar__IdAssignment_2");
					put(grammarAccess.getInRangeAccess().getParameterAssignment_0(), "rule__InRange__ParameterAssignment_0");
					put(grammarAccess.getInRangeAccess().getRangeAssignment_2(), "rule__InRange__RangeAssignment_2");
					put(grammarAccess.getIntegerAccess().getValueAssignment(), "rule__Integer__ValueAssignment");
					put(grammarAccess.getDoubleAccess().getValueAssignment(), "rule__Double__ValueAssignment");
					put(grammarAccess.getBooleanAccess().getValueAssignment(), "rule__Boolean__ValueAssignment");
					put(grammarAccess.getString0Access().getValueAssignment(), "rule__String0__ValueAssignment");
					put(grammarAccess.getIdentifierAccess().getIdAssignment(), "rule__Identifier__IdAssignment");
					put(grammarAccess.getParameterGroupAccess().getUnorderedGroup_3(), "rule__ParameterGroup__UnorderedGroup_3");
					put(grammarAccess.getParameterAccess().getUnorderedGroup_3(), "rule__Parameter__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.itu.smdp2015.church.ui.contentassist.antlr.internal.InternalConfiguratorParser typedParser = (dk.itu.smdp2015.church.ui.contentassist.antlr.internal.InternalConfiguratorParser) parser;
			typedParser.entryRuleConfigurator();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ConfiguratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConfiguratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
