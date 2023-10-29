/**
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation.browserAutomationDSL.impl;

import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.BrowserAutomationDSLPackage;
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.Click;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Click</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.yperiquoi.browserautomation.browserAutomationDSL.impl.ClickImpl#getLinkText <em>Link Text</em>}</li>
 *   <li>{@link fr.imta.yperiquoi.browserautomation.browserAutomationDSL.impl.ClickImpl#getButtonText <em>Button Text</em>}</li>
 *   <li>{@link fr.imta.yperiquoi.browserautomation.browserAutomationDSL.impl.ClickImpl#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClickImpl extends CommandImpl implements Click
{
  /**
   * The default value of the '{@link #getLinkText() <em>Link Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkText()
   * @generated
   * @ordered
   */
  protected static final String LINK_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinkText() <em>Link Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkText()
   * @generated
   * @ordered
   */
  protected String linkText = LINK_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getButtonText() <em>Button Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtonText()
   * @generated
   * @ordered
   */
  protected static final String BUTTON_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getButtonText() <em>Button Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtonText()
   * @generated
   * @ordered
   */
  protected String buttonText = BUTTON_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt()
   * @generated
   * @ordered
   */
  protected static final String ALT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt()
   * @generated
   * @ordered
   */
  protected String alt = ALT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClickImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BrowserAutomationDSLPackage.Literals.CLICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLinkText()
  {
    return linkText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinkText(String newLinkText)
  {
    String oldLinkText = linkText;
    linkText = newLinkText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationDSLPackage.CLICK__LINK_TEXT, oldLinkText, linkText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getButtonText()
  {
    return buttonText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setButtonText(String newButtonText)
  {
    String oldButtonText = buttonText;
    buttonText = newButtonText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationDSLPackage.CLICK__BUTTON_TEXT, oldButtonText, buttonText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAlt()
  {
    return alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlt(String newAlt)
  {
    String oldAlt = alt;
    alt = newAlt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationDSLPackage.CLICK__ALT, oldAlt, alt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BrowserAutomationDSLPackage.CLICK__LINK_TEXT:
        return getLinkText();
      case BrowserAutomationDSLPackage.CLICK__BUTTON_TEXT:
        return getButtonText();
      case BrowserAutomationDSLPackage.CLICK__ALT:
        return getAlt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BrowserAutomationDSLPackage.CLICK__LINK_TEXT:
        setLinkText((String)newValue);
        return;
      case BrowserAutomationDSLPackage.CLICK__BUTTON_TEXT:
        setButtonText((String)newValue);
        return;
      case BrowserAutomationDSLPackage.CLICK__ALT:
        setAlt((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BrowserAutomationDSLPackage.CLICK__LINK_TEXT:
        setLinkText(LINK_TEXT_EDEFAULT);
        return;
      case BrowserAutomationDSLPackage.CLICK__BUTTON_TEXT:
        setButtonText(BUTTON_TEXT_EDEFAULT);
        return;
      case BrowserAutomationDSLPackage.CLICK__ALT:
        setAlt(ALT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BrowserAutomationDSLPackage.CLICK__LINK_TEXT:
        return LINK_TEXT_EDEFAULT == null ? linkText != null : !LINK_TEXT_EDEFAULT.equals(linkText);
      case BrowserAutomationDSLPackage.CLICK__BUTTON_TEXT:
        return BUTTON_TEXT_EDEFAULT == null ? buttonText != null : !BUTTON_TEXT_EDEFAULT.equals(buttonText);
      case BrowserAutomationDSLPackage.CLICK__ALT:
        return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (linkText: ");
    result.append(linkText);
    result.append(", buttonText: ");
    result.append(buttonText);
    result.append(", alt: ");
    result.append(alt);
    result.append(')');
    return result.toString();
  }

} //ClickImpl
