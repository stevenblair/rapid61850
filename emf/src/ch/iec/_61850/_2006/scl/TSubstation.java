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
 * A representation of the model object '<em><b>TSubstation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSubstation#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSubstation#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSubstation()
 * @model extendedMetaData="name='tSubstation' kind='elementOnly'"
 * @generated
 */
public interface TSubstation extends TEquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Voltage Level</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TVoltageLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Level</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubstation_VoltageLevel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VoltageLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TVoltageLevel> getVoltageLevel();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubstation_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TFunction> getFunction();

} // TSubstation
