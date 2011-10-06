/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TReport Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TReportControl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportControl#getRptEnabled <em>Rpt Enabled</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportControl#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportControl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportControl#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportControl#getRptID <em>Rpt ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTReportControl()
 * @model extendedMetaData="name='tReportControl' kind='elementOnly'"
 * @generated
 */
public interface TReportControl extends TControlWithTriggerOpt {
	/**
	 * Returns the value of the '<em><b>Opt Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Fields</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Fields</em>' containment reference.
	 * @see #setOptFields(OptFieldsType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportControl_OptFields()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OptFields' namespace='##targetNamespace'"
	 * @generated
	 */
	OptFieldsType getOptFields();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getOptFields <em>Opt Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Fields</em>' containment reference.
	 * @see #getOptFields()
	 * @generated
	 */
	void setOptFields(OptFieldsType value);

	/**
	 * Returns the value of the '<em><b>Rpt Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpt Enabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpt Enabled</em>' containment reference.
	 * @see #setRptEnabled(TRptEnabled)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportControl_RptEnabled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RptEnabled' namespace='##targetNamespace'"
	 * @generated
	 */
	TRptEnabled getRptEnabled();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getRptEnabled <em>Rpt Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpt Enabled</em>' containment reference.
	 * @see #getRptEnabled()
	 * @generated
	 */
	void setRptEnabled(TRptEnabled value);

	/**
	 * Returns the value of the '<em><b>Buffered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffered</em>' attribute.
	 * @see #isSetBuffered()
	 * @see #unsetBuffered()
	 * @see #setBuffered(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportControl_Buffered()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='buffered'"
	 * @generated
	 */
	boolean isBuffered();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#isBuffered <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffered</em>' attribute.
	 * @see #isSetBuffered()
	 * @see #unsetBuffered()
	 * @see #isBuffered()
	 * @generated
	 */
	void setBuffered(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#isBuffered <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuffered()
	 * @see #isBuffered()
	 * @see #setBuffered(boolean)
	 * @generated
	 */
	void unsetBuffered();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportControl#isBuffered <em>Buffered</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buffered</em>' attribute is set.
	 * @see #unsetBuffered()
	 * @see #isBuffered()
	 * @see #setBuffered(boolean)
	 * @generated
	 */
	boolean isSetBuffered();

	/**
	 * Returns the value of the '<em><b>Buf Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buf Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf Time</em>' attribute.
	 * @see #isSetBufTime()
	 * @see #unsetBufTime()
	 * @see #setBufTime(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportControl_BufTime()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='bufTime'"
	 * @generated
	 */
	long getBufTime();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getBufTime <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf Time</em>' attribute.
	 * @see #isSetBufTime()
	 * @see #unsetBufTime()
	 * @see #getBufTime()
	 * @generated
	 */
	void setBufTime(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getBufTime <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBufTime()
	 * @see #getBufTime()
	 * @see #setBufTime(long)
	 * @generated
	 */
	void unsetBufTime();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getBufTime <em>Buf Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buf Time</em>' attribute is set.
	 * @see #unsetBufTime()
	 * @see #getBufTime()
	 * @see #setBufTime(long)
	 * @generated
	 */
	boolean isSetBufTime();

	/**
	 * Returns the value of the '<em><b>Conf Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Rev</em>' attribute.
	 * @see #isSetConfRev()
	 * @see #unsetConfRev()
	 * @see #setConfRev(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportControl_ConfRev()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='confRev'"
	 * @generated
	 */
	long getConfRev();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getConfRev <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Rev</em>' attribute.
	 * @see #isSetConfRev()
	 * @see #unsetConfRev()
	 * @see #getConfRev()
	 * @generated
	 */
	void setConfRev(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getConfRev <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfRev()
	 * @see #getConfRev()
	 * @see #setConfRev(long)
	 * @generated
	 */
	void unsetConfRev();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getConfRev <em>Conf Rev</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Rev</em>' attribute is set.
	 * @see #unsetConfRev()
	 * @see #getConfRev()
	 * @see #setConfRev(long)
	 * @generated
	 */
	boolean isSetConfRev();

	/**
	 * Returns the value of the '<em><b>Rpt ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpt ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpt ID</em>' attribute.
	 * @see #setRptID(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportControl_RptID()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='rptID'"
	 * @generated
	 */
	String getRptID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportControl#getRptID <em>Rpt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpt ID</em>' attribute.
	 * @see #getRptID()
	 * @generated
	 */
	void setRptID(String value);

} // TReportControl
