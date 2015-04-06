package dk.itu.smdp2015.church.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp2015.church.model.configurator.Binary;
import dk.itu.smdp2015.church.model.configurator.Bounded;
import dk.itu.smdp2015.church.model.configurator.Configurator;
import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.Enumerated;
import dk.itu.smdp2015.church.model.configurator.Identifier;
import dk.itu.smdp2015.church.model.configurator.InRange;
import dk.itu.smdp2015.church.model.configurator.Parameter;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.Scalar;
import dk.itu.smdp2015.church.model.configurator.Unary;
import dk.itu.smdp2015.church.services.ConfiguratorGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractConfiguratorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConfiguratorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConfiguratorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfiguratorPackage.BINARY:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_Additive_Comparative_Conjunctive_Disjunctive_Equality_Multiplicative(context, (Binary) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.BOOLEAN:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getBooleanRule() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_Boolean(context, (dk.itu.smdp2015.church.model.configurator.Boolean) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.BOUNDED:
				if(context == grammarAccess.getBoundedRule() ||
				   context == grammarAccess.getValueRangeRule()) {
					sequence_Bounded(context, (Bounded) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.CONFIGURATOR:
				if(context == grammarAccess.getConfiguratorRule()) {
					sequence_Configurator(context, (Configurator) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.DOUBLE:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDoubleRule() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_Double(context, (dk.itu.smdp2015.church.model.configurator.Double) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.ENUMERATED:
				if(context == grammarAccess.getEnumeratedRule() ||
				   context == grammarAccess.getValueRangeRule()) {
					sequence_Enumerated(context, (Enumerated) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.IDENTIFIER:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIdentifierRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_Identifier(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.IN_RANGE:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getInRangeRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_InRange(context, (InRange) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.INTEGER:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntegerRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_Integer(context, (dk.itu.smdp2015.church.model.configurator.Integer) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.PARAMETER:
				if(context == grammarAccess.getAbstractParameterRule() ||
				   context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.PARAMETER_GROUP:
				if(context == grammarAccess.getAbstractParameterRule() ||
				   context == grammarAccess.getParameterGroupRule()) {
					sequence_ParameterGroup(context, (ParameterGroup) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.SCALAR:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule() ||
				   context == grammarAccess.getScalarRule()) {
					sequence_Scalar(context, (Scalar) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.STRING:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule() ||
				   context == grammarAccess.getString0Rule()) {
					sequence_String0(context, (dk.itu.smdp2015.church.model.configurator.String) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.UNARY:
				if(context == grammarAccess.getAdditiveRule() ||
				   context == grammarAccess.getAdditiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getComparativeRule() ||
				   context == grammarAccess.getComparativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getConjunctiveRule() ||
				   context == grammarAccess.getConjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctiveRule() ||
				   context == grammarAccess.getDisjunctiveAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeRule() ||
				   context == grammarAccess.getMultiplicativeAccess().getBinaryLeftAction_1_0() ||
				   context == grammarAccess.getPrimitiveRule() ||
				   context == grammarAccess.getUnaryRule()) {
					sequence_Unary(context, (Unary) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (left=Additive_Binary_1_0 operator=AdditiveOperator right=Multiplicative) | 
	 *         (left=Multiplicative_Binary_1_0 operator=MultiplicativeOperator right=Primitive) | 
	 *         (left=Comparative_Binary_1_0 operator=ComparativeOperator right=Additive) | 
	 *         (left=Equality_Binary_1_0 operator=EqualityOperator right=Comparative) | 
	 *         (left=Conjunctive_Binary_1_0 operator=ConjunctiveOperator right=Equality) | 
	 *         (left=Disjunctive_Binary_1_0 operator=DisjunctiveOperator right=Conjunctive)
	 *     )
	 */
	protected void sequence_Additive_Comparative_Conjunctive_Disjunctive_Equality_Multiplicative(EObject context, Binary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EBoolean
	 */
	protected void sequence_Boolean(EObject context, dk.itu.smdp2015.church.model.configurator.Boolean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BOOLEAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=Expression upperBound=Expression)
	 */
	protected void sequence_Bounded(EObject context, Bounded semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BOUNDED__UPPER_BOUND));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BOUNDED__LOWER_BOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoundedAccess().getLowerBoundExpressionParserRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getBoundedAccess().getUpperBoundExpressionParserRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? parameters+=AbstractParameter parameters+=AbstractParameter*)
	 */
	protected void sequence_Configurator(EObject context, Configurator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EDouble
	 */
	protected void sequence_Double(EObject context, dk.itu.smdp2015.church.model.configurator.Double semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.DOUBLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.DOUBLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=Expression values+=Expression*)
	 */
	protected void sequence_Enumerated(EObject context, Enumerated semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=[Parameter|ID]
	 */
	protected void sequence_Identifier(EObject context, Identifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.IDENTIFIER__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.IDENTIFIER__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierAccess().getIdParameterIDTerminalRuleCall_0_1(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=[Parameter|ID] range=ValueRange)
	 */
	protected void sequence_InRange(EObject context, InRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.IN_RANGE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.IN_RANGE__RANGE));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.IN_RANGE__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.IN_RANGE__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInRangeAccess().getParameterParameterIDTerminalRuleCall_0_0_1(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getInRangeAccess().getRangeValueRangeParserRuleCall_2_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_Integer(EObject context, dk.itu.smdp2015.church.model.configurator.Integer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.INTEGER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         visibility=Expression? 
	 *         (constraints+=Expression constraints+=Expression*)? 
	 *         parameters+=AbstractParameter 
	 *         parameters+=AbstractParameter*
	 *     )
	 */
	protected void sequence_ParameterGroup(EObject context, ParameterGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         mandatory?='mandatory'? 
	 *         visibility=Expression? 
	 *         (constraints+=Expression constraints+=Expression*)? 
	 *         valueRange=ValueRange
	 *     )
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=ScalarOperator id=[ParameterGroup|ID])
	 */
	protected void sequence_Scalar(EObject context, Scalar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.SCALAR__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.SCALAR__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.SCALAR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.SCALAR__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarAccess().getOperatorScalarOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getScalarAccess().getIdParameterGroupIDTerminalRuleCall_2_0_1(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_String0(EObject context, dk.itu.smdp2015.church.model.configurator.String semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getString0Access().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=UnaryOperator inner=Primitive)
	 */
	protected void sequence_Unary(EObject context, Unary semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.UNARY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.UNARY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.UNARY__INNER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.UNARY__INNER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryAccess().getOperatorUnaryOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnaryAccess().getInnerPrimitiveParserRuleCall_1_0(), semanticObject.getInner());
		feeder.finish();
	}
}
