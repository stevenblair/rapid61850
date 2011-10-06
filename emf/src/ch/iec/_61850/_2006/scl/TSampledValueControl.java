/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSampled Value Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmvOpts <em>Smv Opts</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSampledValueControl#isMulticast <em>Multicast</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSampledValueControl#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmvID <em>Smv ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSampledValueControl()
 * @model extendedMetaData="name='tSampledValueControl' kind='elementOnly'"
 * @generated
 */
public interface TSampledValueControl extends TControlWithIEDName {
	/**
	 * Returns the value of the '<em><b>Smv Opts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smv Opts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smv Opts</em>' containment reference.
	 * @see #setSmvOpts(SmvOptsType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSampledValueControl_SmvOpts()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SmvOpts' namespace='##targetNamespace'"
	 * @generated
	 */
	SmvOptsType getSmvOpts();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmvOpts <em>Smv Opts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smv Opts</em>' containment reference.
	 * @see #getSmvOpts()
	 * @generated
	 */
	void setSmvOpts(SmvOptsType value);

	/**
	 * Returns the value of the '<em><b>Multicast</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast</em>' attribute.
	 * @see #isSetMulticast()
	 * @see #unsetMulticast()
	 * @see #setMulticast(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSampledValueControl_Multicast()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='multicast'"
	 * @generated
	 */
	boolean isMulticast();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#isMulticast <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast</em>' attribute.
	 * @see #isSetMulticast()
	 * @see #unsetMulticast()
	 * @see #isMulticast()
	 * @generated
	 */
	void setMulticast(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#isMulticast <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMulticast()
	 * @see #isMulticast()
	 * @see #setMulticast(boolean)
	 * @generated
	 */
	void unsetMulticast();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#isMulticast <em>Multicast</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multicast</em>' attribute is set.
	 * @see #unsetMulticast()
	 * @see #isMulticast()
	 * @see #setMulticast(boolean)
	 * @generated
	 */
	boolean isSetMulticast();

	/**
	 * Returns the value of the '<em><b>Nof ASDU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nof ASDU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nof ASDU</em>' attribute.
	 * @see #isSetNofASDU()
	 * @see #unsetNofASDU()
	 * @see #setNofASDU(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSampledValueControl_NofASDU()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='nofASDU'"
	 * @generated
	 */
	long getNofASDU();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getNofASDU <em>Nof ASDU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nof ASDU</em>' attribute.
	 * @see #isSetNofASDU()
	 * @see #unsetNofASDU()
	 * @see #getNofASDU()
	 * @generated
	 */
	void setNofASDU(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getNofASDU <em>Nof ASDU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNofASDU()
	 * @see #getNofASDU()
	 * @see #setNofASDU(long)
	 * @generated
	 */
	void unsetNofASDU();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getNofASDU <em>Nof ASDU</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nof ASDU</em>' attribute is set.
	 * @see #unsetNofASDU()
	 * @see #getNofASDU()
	 * @see #setNofASDU(long)
	 * @generated
	 */
	boolean isSetNofASDU();

	/**
	 * Returns the value of the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smp Rate</em>' attribute.
	 * @see #isSetSmpRate()
	 * @see #unsetSmpRate()
	 * @see #setSmpRate(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSampledValueControl_SmpRate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='smpRate'"
	 * @generated
	 */
	long getSmpRate();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmpRate <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smp Rate</em>' attribute.
	 * @see #isSetSmpRate()
	 * @see #unsetSmpRate()
	 * @see #getSmpRate()
	 * @generated
	 */
	void setSmpRate(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmpRate <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSmpRate()
	 * @see #getSmpRate()
	 * @see #setSmpRate(long)
	 * @generated
	 */
	void unsetSmpRate();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmpRate <em>Smp Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Smp Rate</em>' attribute is set.
	 * @see #unsetSmpRate()
	 * @see #getSmpRate()
	 * @see #setSmpRate(long)
	 * @generated
	 */
	boolean isSetSmpRate();

	/**
	 * Returns the value of the '<em><b>Smv ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smv ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smv ID</em>' attribute.
	 * @see #setSmvID(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSampledValueControl_SmvID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='smvID'"
	 * @generated
	 */
	String getSmvID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmvID <em>Smv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smv ID</em>' attribute.
	 * @see #getSmvID()
	 * @generated
	 */
	void setSmvID(String value);

} // TSampledValueControl
