/*
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(nii.bigclout.ecaadapter.dsl.DslPackage.eINSTANCE);
		return result;
	}
	
}
