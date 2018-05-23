/*
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import nii.bigclout.ecaadapter.ide.contentassist.antlr.internal.InternalDslParser;
import nii.bigclout.ecaadapter.services.DslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDiffEqualElementAccess().getAlternatives_1(), "rule__DiffEqualElement__Alternatives_1");
					put(grammarAccess.getCompareElementAccess().getAlternatives_1(), "rule__CompareElement__Alternatives_1");
					put(grammarAccess.getPlusMinusElementAccess().getAlternatives_1(), "rule__PlusMinusElement__Alternatives_1");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1(), "rule__MultiplicationDivisionElement__Alternatives_1");
					put(grammarAccess.getUnaryElementAccess().getAlternatives(), "rule__UnaryElement__Alternatives");
					put(grammarAccess.getNUMBERAccess().getAlternatives(), "rule__NUMBER__Alternatives");
					put(grammarAccess.getAppMetaDataAccess().getGroup(), "rule__AppMetaData__Group__0");
					put(grammarAccess.getAppSpecificationAccess().getGroup(), "rule__AppSpecification__Group__0");
					put(grammarAccess.getElementAccess().getGroup(), "rule__Element__Group__0");
					put(grammarAccess.getOrElementAccess().getGroup(), "rule__OrElement__Group__0");
					put(grammarAccess.getOrElementAccess().getGroup_1(), "rule__OrElement__Group_1__0");
					put(grammarAccess.getAndElementAccess().getGroup(), "rule__AndElement__Group__0");
					put(grammarAccess.getAndElementAccess().getGroup_1(), "rule__AndElement__Group_1__0");
					put(grammarAccess.getDiffEqualElementAccess().getGroup(), "rule__DiffEqualElement__Group__0");
					put(grammarAccess.getDiffEqualElementAccess().getGroup_1_0(), "rule__DiffEqualElement__Group_1_0__0");
					put(grammarAccess.getDiffEqualElementAccess().getGroup_1_1(), "rule__DiffEqualElement__Group_1_1__0");
					put(grammarAccess.getCompareElementAccess().getGroup(), "rule__CompareElement__Group__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_0(), "rule__CompareElement__Group_1_0__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_1(), "rule__CompareElement__Group_1_1__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_2(), "rule__CompareElement__Group_1_2__0");
					put(grammarAccess.getCompareElementAccess().getGroup_1_3(), "rule__CompareElement__Group_1_3__0");
					put(grammarAccess.getPlusMinusElementAccess().getGroup(), "rule__PlusMinusElement__Group__0");
					put(grammarAccess.getPlusMinusElementAccess().getGroup_1_0(), "rule__PlusMinusElement__Group_1_0__0");
					put(grammarAccess.getPlusMinusElementAccess().getGroup_1_1(), "rule__PlusMinusElement__Group_1_1__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup(), "rule__MultiplicationDivisionElement__Group__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0(), "rule__MultiplicationDivisionElement__Group_1_0__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1(), "rule__MultiplicationDivisionElement__Group_1_1__0");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2(), "rule__MultiplicationDivisionElement__Group_1_2__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_0(), "rule__UnaryElement__Group_0__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_1(), "rule__UnaryElement__Group_1__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_2(), "rule__UnaryElement__Group_2__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_3(), "rule__UnaryElement__Group_3__0");
					put(grammarAccess.getUnaryElementAccess().getGroup_4(), "rule__UnaryElement__Group_4__0");
					put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
					put(grammarAccess.getNUMBERAccess().getGroup_1(), "rule__NUMBER__Group_1__0");
					put(grammarAccess.getEXTENDED_IDAccess().getGroup(), "rule__EXTENDED_ID__Group__0");
					put(grammarAccess.getEXTENDED_IDAccess().getGroup_1(), "rule__EXTENDED_ID__Group_1__0");
					put(grammarAccess.getRunTimeModelAccess().getAppDataAssignment(), "rule__RunTimeModel__AppDataAssignment");
					put(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1(), "rule__AppMetaData__AppIDAssignment_1");
					put(grammarAccess.getAppMetaDataAccess().getSpecificationsAssignment_3(), "rule__AppMetaData__SpecificationsAssignment_3");
					put(grammarAccess.getAppSpecificationAccess().getTriggerAssignment_1(), "rule__AppSpecification__TriggerAssignment_1");
					put(grammarAccess.getAppSpecificationAccess().getConditionAssignment_3(), "rule__AppSpecification__ConditionAssignment_3");
					put(grammarAccess.getAppSpecificationAccess().getActionAssignment_5(), "rule__AppSpecification__ActionAssignment_5");
					put(grammarAccess.getElementAccess().getConceptAssignment_0(), "rule__Element__ConceptAssignment_0");
					put(grammarAccess.getElementAccess().getCodeAssignment_1(), "rule__Element__CodeAssignment_1");
					put(grammarAccess.getOrElementAccess().getRightAssignment_1_2(), "rule__OrElement__RightAssignment_1_2");
					put(grammarAccess.getAndElementAccess().getRightAssignment_1_2(), "rule__AndElement__RightAssignment_1_2");
					put(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2(), "rule__DiffEqualElement__RightAssignment_1_0_2");
					put(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2(), "rule__DiffEqualElement__RightAssignment_1_1_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2(), "rule__CompareElement__RightAssignment_1_0_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2(), "rule__CompareElement__RightAssignment_1_1_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2(), "rule__CompareElement__RightAssignment_1_2_2");
					put(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2(), "rule__CompareElement__RightAssignment_1_3_2");
					put(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2(), "rule__PlusMinusElement__RightAssignment_1_0_2");
					put(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2(), "rule__PlusMinusElement__RightAssignment_1_1_2");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2(), "rule__MultiplicationDivisionElement__RightAssignment_1_0_2");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2(), "rule__MultiplicationDivisionElement__RightAssignment_1_1_2");
					put(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2(), "rule__MultiplicationDivisionElement__RightAssignment_1_2_2");
					put(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1(), "rule__UnaryElement__ValueAssignment_0_1");
					put(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1(), "rule__UnaryElement__ValueAssignment_1_1");
					put(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1(), "rule__UnaryElement__ValueAssignment_2_1");
					put(grammarAccess.getUnaryElementAccess().getExpAssignment_4_2(), "rule__UnaryElement__ExpAssignment_4_2");
					put(grammarAccess.getTriggerAccess().getEventNameAssignment_0(), "rule__Trigger__EventNameAssignment_0");
					put(grammarAccess.getTriggerAccess().getCodeAssignment_1(), "rule__Trigger__CodeAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
