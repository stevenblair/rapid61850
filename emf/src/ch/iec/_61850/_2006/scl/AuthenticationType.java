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
 * A representation of the model object '<em><b>Authentication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.AuthenticationType#isCertificate <em>Certificate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.AuthenticationType#isNone <em>None</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.AuthenticationType#isPassword <em>Password</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.AuthenticationType#isStrong <em>Strong</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.AuthenticationType#isWeak <em>Weak</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getAuthenticationType()
 * @model extendedMetaData="name='Authentication_._type' kind='empty'"
 * @generated
 */
public interface AuthenticationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' attribute.
	 * @see #isSetCertificate()
	 * @see #unsetCertificate()
	 * @see #setCertificate(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getAuthenticationType_Certificate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='certificate'"
	 * @generated
	 */
	boolean isCertificate();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isCertificate <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' attribute.
	 * @see #isSetCertificate()
	 * @see #unsetCertificate()
	 * @see #isCertificate()
	 * @generated
	 */
	void setCertificate(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isCertificate <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCertificate()
	 * @see #isCertificate()
	 * @see #setCertificate(boolean)
	 * @generated
	 */
	void unsetCertificate();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isCertificate <em>Certificate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Certificate</em>' attribute is set.
	 * @see #unsetCertificate()
	 * @see #isCertificate()
	 * @see #setCertificate(boolean)
	 * @generated
	 */
	boolean isSetCertificate();

	/**
	 * Returns the value of the '<em><b>None</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>None</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None</em>' attribute.
	 * @see #isSetNone()
	 * @see #unsetNone()
	 * @see #setNone(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getAuthenticationType_None()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='none'"
	 * @generated
	 */
	boolean isNone();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isNone <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>None</em>' attribute.
	 * @see #isSetNone()
	 * @see #unsetNone()
	 * @see #isNone()
	 * @generated
	 */
	void setNone(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isNone <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNone()
	 * @see #isNone()
	 * @see #setNone(boolean)
	 * @generated
	 */
	void unsetNone();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isNone <em>None</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>None</em>' attribute is set.
	 * @see #unsetNone()
	 * @see #isNone()
	 * @see #setNone(boolean)
	 * @generated
	 */
	boolean isSetNone();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #setPassword(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getAuthenticationType_Password()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='password'"
	 * @generated
	 */
	boolean isPassword();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #isPassword()
	 * @generated
	 */
	void setPassword(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassword()
	 * @see #isPassword()
	 * @see #setPassword(boolean)
	 * @generated
	 */
	void unsetPassword();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isPassword <em>Password</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Password</em>' attribute is set.
	 * @see #unsetPassword()
	 * @see #isPassword()
	 * @see #setPassword(boolean)
	 * @generated
	 */
	boolean isSetPassword();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' attribute.
	 * @see #isSetStrong()
	 * @see #unsetStrong()
	 * @see #setStrong(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getAuthenticationType_Strong()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='strong'"
	 * @generated
	 */
	boolean isStrong();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isStrong <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong</em>' attribute.
	 * @see #isSetStrong()
	 * @see #unsetStrong()
	 * @see #isStrong()
	 * @generated
	 */
	void setStrong(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isStrong <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrong()
	 * @see #isStrong()
	 * @see #setStrong(boolean)
	 * @generated
	 */
	void unsetStrong();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isStrong <em>Strong</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strong</em>' attribute is set.
	 * @see #unsetStrong()
	 * @see #isStrong()
	 * @see #setStrong(boolean)
	 * @generated
	 */
	boolean isSetStrong();

	/**
	 * Returns the value of the '<em><b>Weak</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weak</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weak</em>' attribute.
	 * @see #isSetWeak()
	 * @see #unsetWeak()
	 * @see #setWeak(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getAuthenticationType_Weak()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='weak'"
	 * @generated
	 */
	boolean isWeak();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isWeak <em>Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weak</em>' attribute.
	 * @see #isSetWeak()
	 * @see #unsetWeak()
	 * @see #isWeak()
	 * @generated
	 */
	void setWeak(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isWeak <em>Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeak()
	 * @see #isWeak()
	 * @see #setWeak(boolean)
	 * @generated
	 */
	void unsetWeak();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.AuthenticationType#isWeak <em>Weak</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weak</em>' attribute is set.
	 * @see #unsetWeak()
	 * @see #isWeak()
	 * @see #setWeak(boolean)
	 * @generated
	 */
	boolean isSetWeak();

} // AuthenticationType
