/*
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.serializer;

import com.google.inject.Inject;
import java.util.Set;
import nii.bigclout.ecaadapter.dsl.AppMetaData;
import nii.bigclout.ecaadapter.dsl.AppSpecification;
import nii.bigclout.ecaadapter.dsl.Concept;
import nii.bigclout.ecaadapter.dsl.DslPackage;
import nii.bigclout.ecaadapter.dsl.Element;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.ecaadapter.services.DslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DslPackage.APP_META_DATA:
				sequence_AppMetaData(context, (AppMetaData) semanticObject); 
				return; 
			case DslPackage.APP_SPECIFICATION:
				sequence_AppSpecification(context, (AppSpecification) semanticObject); 
				return; 
			case DslPackage.CONCEPT:
				sequence_Concept(context, (Concept) semanticObject); 
				return; 
			case DslPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case DslPackage.RUN_TIME_MODEL:
				sequence_RunTimeModel(context, (RunTimeModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AppMetaData returns AppMetaData
	 *
	 * Constraint:
	 *     (appID=ID specifications+=AppSpecification*)
	 */
	protected void sequence_AppMetaData(ISerializationContext context, AppMetaData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AppSpecification returns AppSpecification
	 *
	 * Constraint:
	 *     (trigger+=Element* condition+=Element* action+=Element)
	 */
	protected void sequence_AppSpecification(ISerializationContext context, AppSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Concept returns Concept
	 *
	 * Constraint:
	 *     referenceName=ID
	 */
	protected void sequence_Concept(ISerializationContext context, Concept semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.CONCEPT__REFERENCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.CONCEPT__REFERENCE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConceptAccess().getReferenceNameIDTerminalRuleCall_0(), semanticObject.getReferenceName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Element
	 *
	 * Constraint:
	 *     (meaning=ID concept=Concept)
	 */
	protected void sequence_Element(ISerializationContext context, Element semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ELEMENT__MEANING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ELEMENT__MEANING));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ELEMENT__CONCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ELEMENT__CONCEPT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementAccess().getMeaningIDTerminalRuleCall_0_0(), semanticObject.getMeaning());
		feeder.accept(grammarAccess.getElementAccess().getConceptConceptParserRuleCall_1_0(), semanticObject.getConcept());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RunTimeModel returns RunTimeModel
	 *
	 * Constraint:
	 *     appData+=AppMetaData+
	 */
	protected void sequence_RunTimeModel(ISerializationContext context, RunTimeModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
