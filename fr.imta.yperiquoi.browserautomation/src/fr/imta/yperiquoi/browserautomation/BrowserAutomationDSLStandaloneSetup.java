/*
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BrowserAutomationDSLStandaloneSetup extends BrowserAutomationDSLStandaloneSetupGenerated {

	public static void doSetup() {
		new BrowserAutomationDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
