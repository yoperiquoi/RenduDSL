/*
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.BrowserAutomationDSLPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class BrowserAutomationDSLStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new BrowserAutomationDSLRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.imta.fr/yperiquoi/browserautomation/BrowserAutomationDSL")) {
			EPackage.Registry.INSTANCE.put("http://www.imta.fr/yperiquoi/browserautomation/BrowserAutomationDSL", BrowserAutomationDSLPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("badsl", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("badsl", serviceProvider);
	}
}