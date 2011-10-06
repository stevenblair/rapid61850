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
 * A representation of the model object '<em><b>TRpt Enabled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TRptEnabled#getClientLN <em>Client LN</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TRptEnabled#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTRptEnabled()
 * @model extendedMetaData="name='tRptEnabled' kind='elementOnly'"
 * @generated
 */
public interface TRptEnabled extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Client LN</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TClientLN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client LN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client LN</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTRptEnabled_ClientLN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClientLN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TClientLN> getClientLN();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTRptEnabled_Max()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='max'"
	 * @generated
	 */
	long getMax();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TRptEnabled#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TRptEnabled#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(long)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TRptEnabled#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(long)
	 * @generated
	 */
	boolean isSetMax();

} // TRptEnabled
