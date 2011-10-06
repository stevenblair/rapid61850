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
 * A representation of the model object '<em><b>TVoltage Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TVoltageLevel#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TVoltageLevel#getBay <em>Bay</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTVoltageLevel()
 * @model extendedMetaData="name='tVoltageLevel' kind='elementOnly'"
 * @generated
 */
public interface TVoltageLevel extends TEquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' containment reference.
	 * @see #setVoltage(TVoltage)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTVoltageLevel_Voltage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Voltage' namespace='##targetNamespace'"
	 * @generated
	 */
	TVoltage getVoltage();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TVoltageLevel#getVoltage <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' containment reference.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(TVoltage value);

	/**
	 * Returns the value of the '<em><b>Bay</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TBay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTVoltageLevel_Bay()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TBay> getBay();

} // TVoltageLevel
