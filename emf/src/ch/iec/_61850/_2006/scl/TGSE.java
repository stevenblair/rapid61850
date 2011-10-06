/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TGSE#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TGSE#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTGSE()
 * @model extendedMetaData="name='tGSE' kind='elementOnly'"
 * @generated
 */
public interface TGSE extends TControlBlock {
	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' containment reference.
	 * @see #setMinTime(TDurationInMilliSec)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTGSE_MinTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MinTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TDurationInMilliSec getMinTime();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TGSE#getMinTime <em>Min Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' containment reference.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(TDurationInMilliSec value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' containment reference.
	 * @see #setMaxTime(TDurationInMilliSec)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTGSE_MaxTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MaxTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TDurationInMilliSec getMaxTime();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TGSE#getMaxTime <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' containment reference.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(TDurationInMilliSec value);

} // TGSE
