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
 * A representation of the model object '<em><b>Setting Groups Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.SettingGroupsType#getSGEdit <em>SG Edit</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SettingGroupsType#getConfSG <em>Conf SG</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getSettingGroupsType()
 * @model extendedMetaData="name='SettingGroups_._type' kind='elementOnly'"
 * @generated
 */
public interface SettingGroupsType extends EObject {
	/**
	 * Returns the value of the '<em><b>SG Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SG Edit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SG Edit</em>' containment reference.
	 * @see #setSGEdit(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSettingGroupsType_SGEdit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SGEdit' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getSGEdit();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SettingGroupsType#getSGEdit <em>SG Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SG Edit</em>' containment reference.
	 * @see #getSGEdit()
	 * @generated
	 */
	void setSGEdit(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Conf SG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf SG</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf SG</em>' containment reference.
	 * @see #setConfSG(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSettingGroupsType_ConfSG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfSG' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getConfSG();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SettingGroupsType#getConfSG <em>Conf SG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf SG</em>' containment reference.
	 * @see #getConfSG()
	 * @generated
	 */
	void setConfSG(TServiceYesNo value);

} // SettingGroupsType
