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
 * A representation of the model object '<em><b>TConnected AP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TConnectedAP#getAddress <em>Address</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TConnectedAP#getGSE <em>GSE</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TConnectedAP#getSMV <em>SMV</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TConnectedAP#getPhysConn <em>Phys Conn</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TConnectedAP#getApName <em>Ap Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TConnectedAP#getIedName <em>Ied Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectedAP()
 * @model extendedMetaData="name='tConnectedAP' kind='elementOnly'"
 * @generated
 */
public interface TConnectedAP extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(TAddress)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectedAP_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	TAddress getAddress();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TConnectedAP#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(TAddress value);

	/**
	 * Returns the value of the '<em><b>GSE</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TGSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GSE</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectedAP_GSE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GSE' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TGSE> getGSE();

	/**
	 * Returns the value of the '<em><b>SMV</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSMV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMV</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SMV</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectedAP_SMV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SMV' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TSMV> getSMV();

	/**
	 * Returns the value of the '<em><b>Phys Conn</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TPhysConn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phys Conn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phys Conn</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectedAP_PhysConn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhysConn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TPhysConn> getPhysConn();

	/**
	 * Returns the value of the '<em><b>Ap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ap Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ap Name</em>' attribute.
	 * @see #setApName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectedAP_ApName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='apName'"
	 * @generated
	 */
	String getApName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TConnectedAP#getApName <em>Ap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ap Name</em>' attribute.
	 * @see #getApName()
	 * @generated
	 */
	void setApName(String value);

	/**
	 * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ied Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Name</em>' attribute.
	 * @see #setIedName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectedAP_IedName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='iedName'"
	 * @generated
	 */
	String getIedName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TConnectedAP#getIedName <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Name</em>' attribute.
	 * @see #getIedName()
	 * @generated
	 */
	void setIedName(String value);

} // TConnectedAP
