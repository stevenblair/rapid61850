/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt Fields Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isBufOvfl <em>Buf Ovfl</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isConfigRef <em>Config Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isDataRef <em>Data Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isEntryID <em>Entry ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isSeqNum <em>Seq Num</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.OptFieldsType#isTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType()
 * @model extendedMetaData="name='OptFields_._type' kind='empty'"
 * @generated
 */
public interface OptFieldsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Buf Ovfl</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buf Ovfl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf Ovfl</em>' attribute.
	 * @see #isSetBufOvfl()
	 * @see #unsetBufOvfl()
	 * @see #setBufOvfl(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_BufOvfl()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='bufOvfl'"
	 * @generated
	 */
	boolean isBufOvfl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isBufOvfl <em>Buf Ovfl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf Ovfl</em>' attribute.
	 * @see #isSetBufOvfl()
	 * @see #unsetBufOvfl()
	 * @see #isBufOvfl()
	 * @generated
	 */
	void setBufOvfl(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isBufOvfl <em>Buf Ovfl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBufOvfl()
	 * @see #isBufOvfl()
	 * @see #setBufOvfl(boolean)
	 * @generated
	 */
	void unsetBufOvfl();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isBufOvfl <em>Buf Ovfl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buf Ovfl</em>' attribute is set.
	 * @see #unsetBufOvfl()
	 * @see #isBufOvfl()
	 * @see #setBufOvfl(boolean)
	 * @generated
	 */
	boolean isSetBufOvfl();

	/**
	 * Returns the value of the '<em><b>Config Ref</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Ref</em>' attribute.
	 * @see #isSetConfigRef()
	 * @see #unsetConfigRef()
	 * @see #setConfigRef(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_ConfigRef()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='configRef'"
	 * @generated
	 */
	boolean isConfigRef();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isConfigRef <em>Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Ref</em>' attribute.
	 * @see #isSetConfigRef()
	 * @see #unsetConfigRef()
	 * @see #isConfigRef()
	 * @generated
	 */
	void setConfigRef(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isConfigRef <em>Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigRef()
	 * @see #isConfigRef()
	 * @see #setConfigRef(boolean)
	 * @generated
	 */
	void unsetConfigRef();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isConfigRef <em>Config Ref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Config Ref</em>' attribute is set.
	 * @see #unsetConfigRef()
	 * @see #isConfigRef()
	 * @see #setConfigRef(boolean)
	 * @generated
	 */
	boolean isSetConfigRef();

	/**
	 * Returns the value of the '<em><b>Data Ref</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Ref</em>' attribute.
	 * @see #isSetDataRef()
	 * @see #unsetDataRef()
	 * @see #setDataRef(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_DataRef()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dataRef'"
	 * @generated
	 */
	boolean isDataRef();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataRef <em>Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Ref</em>' attribute.
	 * @see #isSetDataRef()
	 * @see #unsetDataRef()
	 * @see #isDataRef()
	 * @generated
	 */
	void setDataRef(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataRef <em>Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataRef()
	 * @see #isDataRef()
	 * @see #setDataRef(boolean)
	 * @generated
	 */
	void unsetDataRef();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataRef <em>Data Ref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Ref</em>' attribute is set.
	 * @see #unsetDataRef()
	 * @see #isDataRef()
	 * @see #setDataRef(boolean)
	 * @generated
	 */
	boolean isSetDataRef();

	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' attribute.
	 * @see #isSetDataSet()
	 * @see #unsetDataSet()
	 * @see #setDataSet(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_DataSet()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dataSet'"
	 * @generated
	 */
	boolean isDataSet();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataSet <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' attribute.
	 * @see #isSetDataSet()
	 * @see #unsetDataSet()
	 * @see #isDataSet()
	 * @generated
	 */
	void setDataSet(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataSet <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSet()
	 * @see #isDataSet()
	 * @see #setDataSet(boolean)
	 * @generated
	 */
	void unsetDataSet();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataSet <em>Data Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set</em>' attribute is set.
	 * @see #unsetDataSet()
	 * @see #isDataSet()
	 * @see #setDataSet(boolean)
	 * @generated
	 */
	boolean isSetDataSet();

	/**
	 * Returns the value of the '<em><b>Entry ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry ID</em>' attribute.
	 * @see #isSetEntryID()
	 * @see #unsetEntryID()
	 * @see #setEntryID(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_EntryID()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='entryID'"
	 * @generated
	 */
	boolean isEntryID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isEntryID <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry ID</em>' attribute.
	 * @see #isSetEntryID()
	 * @see #unsetEntryID()
	 * @see #isEntryID()
	 * @generated
	 */
	void setEntryID(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isEntryID <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntryID()
	 * @see #isEntryID()
	 * @see #setEntryID(boolean)
	 * @generated
	 */
	void unsetEntryID();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isEntryID <em>Entry ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entry ID</em>' attribute is set.
	 * @see #unsetEntryID()
	 * @see #isEntryID()
	 * @see #setEntryID(boolean)
	 * @generated
	 */
	boolean isSetEntryID();

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' attribute.
	 * @see #isSetReasonCode()
	 * @see #unsetReasonCode()
	 * @see #setReasonCode(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_ReasonCode()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='reasonCode'"
	 * @generated
	 */
	boolean isReasonCode();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isReasonCode <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Code</em>' attribute.
	 * @see #isSetReasonCode()
	 * @see #unsetReasonCode()
	 * @see #isReasonCode()
	 * @generated
	 */
	void setReasonCode(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isReasonCode <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReasonCode()
	 * @see #isReasonCode()
	 * @see #setReasonCode(boolean)
	 * @generated
	 */
	void unsetReasonCode();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isReasonCode <em>Reason Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason Code</em>' attribute is set.
	 * @see #unsetReasonCode()
	 * @see #isReasonCode()
	 * @see #setReasonCode(boolean)
	 * @generated
	 */
	boolean isSetReasonCode();

	/**
	 * Returns the value of the '<em><b>Seq Num</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Num</em>' attribute.
	 * @see #isSetSeqNum()
	 * @see #unsetSeqNum()
	 * @see #setSeqNum(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_SeqNum()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='seqNum'"
	 * @generated
	 */
	boolean isSeqNum();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isSeqNum <em>Seq Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Num</em>' attribute.
	 * @see #isSetSeqNum()
	 * @see #unsetSeqNum()
	 * @see #isSeqNum()
	 * @generated
	 */
	void setSeqNum(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isSeqNum <em>Seq Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeqNum()
	 * @see #isSeqNum()
	 * @see #setSeqNum(boolean)
	 * @generated
	 */
	void unsetSeqNum();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isSeqNum <em>Seq Num</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seq Num</em>' attribute is set.
	 * @see #unsetSeqNum()
	 * @see #isSeqNum()
	 * @see #setSeqNum(boolean)
	 * @generated
	 */
	boolean isSetSeqNum();

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #setTimeStamp(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getOptFieldsType_TimeStamp()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='timeStamp'"
	 * @generated
	 */
	boolean isTimeStamp();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #isTimeStamp()
	 * @generated
	 */
	void setTimeStamp(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeStamp()
	 * @see #isTimeStamp()
	 * @see #setTimeStamp(boolean)
	 * @generated
	 */
	void unsetTimeStamp();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.OptFieldsType#isTimeStamp <em>Time Stamp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
	 * @see #unsetTimeStamp()
	 * @see #isTimeStamp()
	 * @see #setTimeStamp(boolean)
	 * @generated
	 */
	boolean isSetTimeStamp();

} // OptFieldsType
