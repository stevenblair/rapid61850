/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TDA#isDchg <em>Dchg</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDA#isDupd <em>Dupd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDA#getFc <em>Fc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDA#isQchg <em>Qchg</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTDA()
 * @model extendedMetaData="name='tDA' kind='elementOnly'"
 * @generated
 */
public interface TDA extends TAbstractDataAttribute {
	/**
	 * Returns the value of the '<em><b>Dchg</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dchg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dchg</em>' attribute.
	 * @see #isSetDchg()
	 * @see #unsetDchg()
	 * @see #setDchg(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDA_Dchg()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dchg'"
	 * @generated
	 */
	boolean isDchg();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDA#isDchg <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dchg</em>' attribute.
	 * @see #isSetDchg()
	 * @see #unsetDchg()
	 * @see #isDchg()
	 * @generated
	 */
	void setDchg(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDA#isDchg <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDchg()
	 * @see #isDchg()
	 * @see #setDchg(boolean)
	 * @generated
	 */
	void unsetDchg();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDA#isDchg <em>Dchg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dchg</em>' attribute is set.
	 * @see #unsetDchg()
	 * @see #isDchg()
	 * @see #setDchg(boolean)
	 * @generated
	 */
	boolean isSetDchg();

	/**
	 * Returns the value of the '<em><b>Dupd</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dupd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dupd</em>' attribute.
	 * @see #isSetDupd()
	 * @see #unsetDupd()
	 * @see #setDupd(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDA_Dupd()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dupd'"
	 * @generated
	 */
	boolean isDupd();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDA#isDupd <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dupd</em>' attribute.
	 * @see #isSetDupd()
	 * @see #unsetDupd()
	 * @see #isDupd()
	 * @generated
	 */
	void setDupd(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDA#isDupd <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDupd()
	 * @see #isDupd()
	 * @see #setDupd(boolean)
	 * @generated
	 */
	void unsetDupd();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDA#isDupd <em>Dupd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dupd</em>' attribute is set.
	 * @see #unsetDupd()
	 * @see #isDupd()
	 * @see #setDupd(boolean)
	 * @generated
	 */
	boolean isSetDupd();

	/**
	 * Returns the value of the '<em><b>Fc</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TFCEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fc</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @see #isSetFc()
	 * @see #unsetFc()
	 * @see #setFc(TFCEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDA_Fc()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='fc'"
	 * @generated
	 */
	TFCEnum getFc();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDA#getFc <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fc</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @see #isSetFc()
	 * @see #unsetFc()
	 * @see #getFc()
	 * @generated
	 */
	void setFc(TFCEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDA#getFc <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFc()
	 * @see #getFc()
	 * @see #setFc(TFCEnum)
	 * @generated
	 */
	void unsetFc();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDA#getFc <em>Fc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fc</em>' attribute is set.
	 * @see #unsetFc()
	 * @see #getFc()
	 * @see #setFc(TFCEnum)
	 * @generated
	 */
	boolean isSetFc();

	/**
	 * Returns the value of the '<em><b>Qchg</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qchg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qchg</em>' attribute.
	 * @see #isSetQchg()
	 * @see #unsetQchg()
	 * @see #setQchg(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDA_Qchg()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='qchg'"
	 * @generated
	 */
	boolean isQchg();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDA#isQchg <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qchg</em>' attribute.
	 * @see #isSetQchg()
	 * @see #unsetQchg()
	 * @see #isQchg()
	 * @generated
	 */
	void setQchg(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDA#isQchg <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQchg()
	 * @see #isQchg()
	 * @see #setQchg(boolean)
	 * @generated
	 */
	void unsetQchg();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDA#isQchg <em>Qchg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qchg</em>' attribute is set.
	 * @see #unsetQchg()
	 * @see #isQchg()
	 * @see #setQchg(boolean)
	 * @generated
	 */
	boolean isSetQchg();

} // TDA
