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
 * A representation of the model object '<em><b>SCL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.SCLType#getHeader <em>Header</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SCLType#getSubstation <em>Substation</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SCLType#getCommunication <em>Communication</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SCLType#getIED <em>IED</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SCLType#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getSCLType()
 * @model extendedMetaData="name='SCL_._type' kind='elementOnly'"
 * @generated
 */
public interface SCLType extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(THeader)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSCLType_Header()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	THeader getHeader();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SCLType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(THeader value);

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSubstation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getSCLType_Substation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Substation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TSubstation> getSubstation();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(TCommunication)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSCLType_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Communication' namespace='##targetNamespace'"
	 * @generated
	 */
	TCommunication getCommunication();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SCLType#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(TCommunication value);

	/**
	 * Returns the value of the '<em><b>IED</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TIED}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IED</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IED</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getSCLType_IED()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IED' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TIED> getIED();

	/**
	 * Returns the value of the '<em><b>Data Type Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Templates</em>' containment reference.
	 * @see #setDataTypeTemplates(TDataTypeTemplates)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSCLType_DataTypeTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataTypeTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	TDataTypeTemplates getDataTypeTemplates();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SCLType#getDataTypeTemplates <em>Data Type Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Templates</em>' containment reference.
	 * @see #getDataTypeTemplates()
	 * @generated
	 */
	void setDataTypeTemplates(TDataTypeTemplates value);

} // SCLType
