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
 * A representation of the model object '<em><b>TBay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TBay#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TBay#getConnectivityNode <em>Connectivity Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTBay()
 * @model extendedMetaData="name='tBay' kind='elementOnly'"
 * @generated
 */
public interface TBay extends TEquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TConductingEquipment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTBay_ConductingEquipment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConductingEquipment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TConductingEquipment> getConductingEquipment();

	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TConnectivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTBay_ConnectivityNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConnectivityNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TConnectivityNode> getConnectivityNode();

} // TBay
