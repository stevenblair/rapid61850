/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAbstract Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractConductingEquipment#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractConductingEquipment#getSubEquipment <em>Sub Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractConductingEquipment()
 * @model abstract="true"
 *        extendedMetaData="name='tAbstractConductingEquipment' kind='elementOnly'"
 * @generated
 */
public interface TAbstractConductingEquipment extends TEquipment {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TTerminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractConductingEquipment_Terminal()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='Terminal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TTerminal> getTerminal();

	/**
	 * Returns the value of the '<em><b>Sub Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSubEquipment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Equipment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Equipment</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractConductingEquipment_SubEquipment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubEquipment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TSubEquipment> getSubEquipment();

} // TAbstractConductingEquipment
