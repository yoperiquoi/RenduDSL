/*
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation.serializer;

import com.google.inject.Inject;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.BrowserAutomationDSLPackage;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Click;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Combobox;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Fill;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.GoTo;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Model;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.OpenBrowser;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Paste;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Read;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Select;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Uncheck;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Verify;
import fr.imta.yperiquoi.browserautomation.services.BrowserAutomationDSLGrammarAccess;
import java.util.Set;
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
public class BrowserAutomationDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserAutomationDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BrowserAutomationDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BrowserAutomationDSLPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.COMBOBOX:
				sequence_Combobox(context, (Combobox) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.GO_TO:
				sequence_GoTo(context, (GoTo) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.OPEN_BROWSER:
				sequence_OpenBrowser(context, (OpenBrowser) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.PASTE:
				sequence_Paste(context, (Paste) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.READ:
				sequence_Read(context, (Read) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.UNCHECK:
				sequence_Uncheck(context, (Uncheck) semanticObject); 
				return; 
			case BrowserAutomationDSLPackage.VERIFY:
				sequence_Verify(context, (Verify) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     (linkText=STRING | buttonText=STRING | alt=STRING)?
	 * </pre>
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Combobox
	 *     Combobox returns Combobox
	 *
	 * Constraint:
	 *     (option=STRING label=STRING)
	 * </pre>
	 */
	protected void sequence_Combobox(ISerializationContext context, Combobox semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationDSLPackage.Literals.COMBOBOX__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationDSLPackage.Literals.COMBOBOX__OPTION));
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationDSLPackage.Literals.COMBOBOX__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationDSLPackage.Literals.COMBOBOX__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComboboxAccess().getOptionSTRINGTerminalRuleCall_3_0(), semanticObject.getOption());
		feeder.accept(grammarAccess.getComboboxAccess().getLabelSTRINGTerminalRuleCall_7_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Fill
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (fieldName=STRING? textToFill=STRING)
	 * </pre>
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns GoTo
	 *     GoTo returns GoTo
	 *
	 * Constraint:
	 *     urlName=STRING
	 * </pre>
	 */
	protected void sequence_GoTo(ISerializationContext context, GoTo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationDSLPackage.Literals.GO_TO__URL_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationDSLPackage.Literals.GO_TO__URL_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoToAccess().getUrlNameSTRINGTerminalRuleCall_3_0(), semanticObject.getUrlName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     commands+=Command+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns OpenBrowser
	 *     OpenBrowser returns OpenBrowser
	 *
	 * Constraint:
	 *     {OpenBrowser}
	 * </pre>
	 */
	protected void sequence_OpenBrowser(ISerializationContext context, OpenBrowser semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Paste
	 *     Paste returns Paste
	 *
	 * Constraint:
	 *     {Paste}
	 * </pre>
	 */
	protected void sequence_Paste(ISerializationContext context, Paste semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Read
	 *     Read returns Read
	 *
	 * Constraint:
	 *     number=INT
	 * </pre>
	 */
	protected void sequence_Read(ISerializationContext context, Read semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationDSLPackage.Literals.READ__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationDSLPackage.Literals.READ__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReadAccess().getNumberINTTerminalRuleCall_9_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (checkboxName=STRING | (values+=STRING values+=STRING*))
	 * </pre>
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Uncheck
	 *     Uncheck returns Uncheck
	 *
	 * Constraint:
	 *     {Uncheck}
	 * </pre>
	 */
	protected void sequence_Uncheck(ISerializationContext context, Uncheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Verify
	 *     Verify returns Verify
	 *
	 * Constraint:
	 *     (textToVerify=STRING | linkToVerify=STRING)?
	 * </pre>
	 */
	protected void sequence_Verify(ISerializationContext context, Verify semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}