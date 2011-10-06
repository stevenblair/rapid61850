/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSMV Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSMVSettings#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSMVSettings#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSMVSettings#getSmpRate1 <em>Smp Rate1</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSMVSettings#getSvID <em>Sv ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSMVSettings()
 * @model extendedMetaData="name='tSMVSettings' kind='elementOnly'"
 * @generated
 */
public interface TSMVSettings extends TServiceSettings {
	/**
	 * Returns the value of the '<em><b>Smp Rate</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smp Rate</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smp Rate</em>' attribute list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSMVSettings_SmpRate()
	 * @model unique="false" dataType="ch.iec._61850._2006.scl.SmpRateType" required="true"
	 *        extendedMetaData="kind='element' name='SmpRate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigDecimal> getSmpRate();

	/**
	 * Returns the value of the '<em><b>Opt Fields</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Fields</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetOptFields()
	 * @see #unsetOptFields()
	 * @see #setOptFields(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSMVSettings_OptFields()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='optFields'"
	 * @generated
	 */
	TServiceSettingsEnum getOptFields();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getOptFields <em>Opt Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Fields</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetOptFields()
	 * @see #unsetOptFields()
	 * @see #getOptFields()
	 * @generated
	 */
	void setOptFields(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getOptFields <em>Opt Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptFields()
	 * @see #getOptFields()
	 * @see #setOptFields(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetOptFields();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getOptFields <em>Opt Fields</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Opt Fields</em>' attribute is set.
	 * @see #unsetOptFields()
	 * @see #getOptFields()
	 * @see #setOptFields(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetOptFields();

	/**
	 * Returns the value of the '<em><b>Smp Rate1</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smp Rate1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smp Rate1</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetSmpRate1()
	 * @see #unsetSmpRate1()
	 * @see #setSmpRate1(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSMVSettings_SmpRate1()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='smpRate'"
	 * @generated
	 */
	TServiceSettingsEnum getSmpRate1();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getSmpRate1 <em>Smp Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smp Rate1</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetSmpRate1()
	 * @see #unsetSmpRate1()
	 * @see #getSmpRate1()
	 * @generated
	 */
	void setSmpRate1(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getSmpRate1 <em>Smp Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSmpRate1()
	 * @see #getSmpRate1()
	 * @see #setSmpRate1(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetSmpRate1();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getSmpRate1 <em>Smp Rate1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Smp Rate1</em>' attribute is set.
	 * @see #unsetSmpRate1()
	 * @see #getSmpRate1()
	 * @see #setSmpRate1(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetSmpRate1();

	/**
	 * Returns the value of the '<em><b>Sv ID</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv ID</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetSvID()
	 * @see #unsetSvID()
	 * @see #setSvID(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSMVSettings_SvID()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='svID'"
	 * @generated
	 */
	TServiceSettingsEnum getSvID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getSvID <em>Sv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv ID</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetSvID()
	 * @see #unsetSvID()
	 * @see #getSvID()
	 * @generated
	 */
	void setSvID(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getSvID <em>Sv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSvID()
	 * @see #getSvID()
	 * @see #setSvID(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetSvID();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSMVSettings#getSvID <em>Sv ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sv ID</em>' attribute is set.
	 * @see #unsetSvID()
	 * @see #getSvID()
	 * @see #setSvID(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetSvID();

} // TSMVSettings
