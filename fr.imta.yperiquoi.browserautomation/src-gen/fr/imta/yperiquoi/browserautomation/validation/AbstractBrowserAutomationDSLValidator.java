/*
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBrowserAutomationDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.imta.yperiquoi.browserautomation.browserAutomationDSL.BrowserAutomationDSLPackage.eINSTANCE);
		return result;
	}
}