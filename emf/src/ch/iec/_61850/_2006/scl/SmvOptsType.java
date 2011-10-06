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
 * A representation of the model object '<em><b>Smv Opts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.SmvOptsType#isDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SmvOptsType#isRefreshTime <em>Refresh Time</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleSynchronized <em>Sample Synchronized</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.SmvOptsType#isSecurity <em>Security</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getSmvOptsType()
 * @model extendedMetaData="name='SmvOpts_._type' kind='empty'"
 * @generated
 */
public interface SmvOptsType extends EObject {
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getSmvOptsType_DataSet()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dataSet'"
	 * @generated
	 */
	boolean isDataSet();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isDataSet <em>Data Set</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isDataSet <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSet()
	 * @see #isDataSet()
	 * @see #setDataSet(boolean)
	 * @generated
	 */
	void unsetDataSet();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isDataSet <em>Data Set</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Refresh Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Time</em>' attribute.
	 * @see #isSetRefreshTime()
	 * @see #unsetRefreshTime()
	 * @see #setRefreshTime(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSmvOptsType_RefreshTime()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='refreshTime'"
	 * @generated
	 */
	boolean isRefreshTime();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isRefreshTime <em>Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Time</em>' attribute.
	 * @see #isSetRefreshTime()
	 * @see #unsetRefreshTime()
	 * @see #isRefreshTime()
	 * @generated
	 */
	void setRefreshTime(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isRefreshTime <em>Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshTime()
	 * @see #isRefreshTime()
	 * @see #setRefreshTime(boolean)
	 * @generated
	 */
	void unsetRefreshTime();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isRefreshTime <em>Refresh Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Time</em>' attribute is set.
	 * @see #unsetRefreshTime()
	 * @see #isRefreshTime()
	 * @see #setRefreshTime(boolean)
	 * @generated
	 */
	boolean isSetRefreshTime();

	/**
	 * Returns the value of the '<em><b>Sample Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Rate</em>' attribute.
	 * @see #isSetSampleRate()
	 * @see #unsetSampleRate()
	 * @see #setSampleRate(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSmvOptsType_SampleRate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='sampleRate'"
	 * @generated
	 */
	boolean isSampleRate();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleRate <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Rate</em>' attribute.
	 * @see #isSetSampleRate()
	 * @see #unsetSampleRate()
	 * @see #isSampleRate()
	 * @generated
	 */
	void setSampleRate(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleRate <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSampleRate()
	 * @see #isSampleRate()
	 * @see #setSampleRate(boolean)
	 * @generated
	 */
	void unsetSampleRate();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleRate <em>Sample Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sample Rate</em>' attribute is set.
	 * @see #unsetSampleRate()
	 * @see #isSampleRate()
	 * @see #setSampleRate(boolean)
	 * @generated
	 */
	boolean isSetSampleRate();

	/**
	 * Returns the value of the '<em><b>Sample Synchronized</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Synchronized</em>' attribute.
	 * @see #isSetSampleSynchronized()
	 * @see #unsetSampleSynchronized()
	 * @see #setSampleSynchronized(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSmvOptsType_SampleSynchronized()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='sampleSynchronized'"
	 * @generated
	 */
	boolean isSampleSynchronized();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleSynchronized <em>Sample Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Synchronized</em>' attribute.
	 * @see #isSetSampleSynchronized()
	 * @see #unsetSampleSynchronized()
	 * @see #isSampleSynchronized()
	 * @generated
	 */
	void setSampleSynchronized(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleSynchronized <em>Sample Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSampleSynchronized()
	 * @see #isSampleSynchronized()
	 * @see #setSampleSynchronized(boolean)
	 * @generated
	 */
	void unsetSampleSynchronized();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleSynchronized <em>Sample Synchronized</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sample Synchronized</em>' attribute is set.
	 * @see #unsetSampleSynchronized()
	 * @see #isSampleSynchronized()
	 * @see #setSampleSynchronized(boolean)
	 * @generated
	 */
	boolean isSetSampleSynchronized();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #isSetSecurity()
	 * @see #unsetSecurity()
	 * @see #setSecurity(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getSmvOptsType_Security()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	boolean isSecurity();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #isSetSecurity()
	 * @see #unsetSecurity()
	 * @see #isSecurity()
	 * @generated
	 */
	void setSecurity(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurity()
	 * @see #isSecurity()
	 * @see #setSecurity(boolean)
	 * @generated
	 */
	void unsetSecurity();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.SmvOptsType#isSecurity <em>Security</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security</em>' attribute is set.
	 * @see #unsetSecurity()
	 * @see #isSecurity()
	 * @see #setSecurity(boolean)
	 * @generated
	 */
	boolean isSetSecurity();

} // SmvOptsType
