/**
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation.browserAutomationDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Model#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see fr.imta.yperiquoi.browserautomation.browserAutomationDSL.BrowserAutomationDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Command}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see fr.imta.yperiquoi.browserautomation.browserAutomationDSL.BrowserAutomationDSLPackage#getModel_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Model
