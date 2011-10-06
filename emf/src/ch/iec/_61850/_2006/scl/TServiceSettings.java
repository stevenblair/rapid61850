/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TService Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TServiceSettings#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServiceSettings#getDatSet <em>Dat Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceSettings()
 * @model abstract="true"
 *        extendedMetaData="name='tServiceSettings' kind='empty'"
 * @generated
 */
public interface TServiceSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Cb Name</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cb Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cb Name</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetCbName()
	 * @see #unsetCbName()
	 * @see #setCbName(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceSettings_CbName()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='cbName'"
	 * @generated
	 */
	TServiceSettingsEnum getCbName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServiceSettings#getCbName <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cb Name</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetCbName()
	 * @see #unsetCbName()
	 * @see #getCbName()
	 * @generated
	 */
	void setCbName(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TServiceSettings#getCbName <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCbName()
	 * @see #getCbName()
	 * @see #setCbName(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetCbName();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TServiceSettings#getCbName <em>Cb Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cb Name</em>' attribute is set.
	 * @see #unsetCbName()
	 * @see #getCbName()
	 * @see #setCbName(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetCbName();

	/**
	 * Returns the value of the '<em><b>Dat Set</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dat Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat Set</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetDatSet()
	 * @see #unsetDatSet()
	 * @see #setDatSet(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceSettings_DatSet()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='datSet'"
	 * @generated
	 */
	TServiceSettingsEnum getDatSet();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServiceSettings#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dat Set</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetDatSet()
	 * @see #unsetDatSet()
	 * @see #getDatSet()
	 * @generated
	 */
	void setDatSet(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TServiceSettings#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatSet()
	 * @see #getDatSet()
	 * @see #setDatSet(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetDatSet();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TServiceSettings#getDatSet <em>Dat Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dat Set</em>' attribute is set.
	 * @see #unsetDatSet()
	 * @see #getDatSet()
	 * @see #setDatSet(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetDatSet();

} // TServiceSettings
