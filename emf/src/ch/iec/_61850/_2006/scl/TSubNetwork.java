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
 * A representation of the model object '<em><b>TSub Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSubNetwork#getBitRate <em>Bit Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSubNetwork#getConnectedAP <em>Connected AP</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSubNetwork#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSubNetwork()
 * @model extendedMetaData="name='tSubNetwork' kind='elementOnly'"
 * @generated
 */
public interface TSubNetwork extends TNaming {
	/**
	 * Returns the value of the '<em><b>Bit Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Rate</em>' containment reference.
	 * @see #setBitRate(TBitRateInMbPerSec)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubNetwork_BitRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BitRate' namespace='##targetNamespace'"
	 * @generated
	 */
	TBitRateInMbPerSec getBitRate();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSubNetwork#getBitRate <em>Bit Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Rate</em>' containment reference.
	 * @see #getBitRate()
	 * @generated
	 */
	void setBitRate(TBitRateInMbPerSec value);

	/**
	 * Returns the value of the '<em><b>Connected AP</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TConnectedAP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected AP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected AP</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubNetwork_ConnectedAP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConnectedAP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TConnectedAP> getConnectedAP();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubNetwork_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSubNetwork#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TSubNetwork
