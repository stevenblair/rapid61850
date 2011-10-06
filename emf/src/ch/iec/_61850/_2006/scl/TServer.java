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
 * A representation of the model object '<em><b>TServer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TServer#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServer#getLDevice <em>LDevice</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServer#getAssociation <em>Association</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServer#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTServer()
 * @model extendedMetaData="name='tServer' kind='elementOnly'"
 * @generated
 */
public interface TServer extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(AuthenticationType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServer_Authentication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Authentication' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthenticationType getAuthentication();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServer#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(AuthenticationType value);

	/**
	 * Returns the value of the '<em><b>LDevice</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TLDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDevice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDevice</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServer_LDevice()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TLDevice> getLDevice();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServer_Association()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Association' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TAssociation> getAssociation();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #setTimeout(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServer_Timeout()
	 * @model default="30" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	long getTimeout();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServer#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TServer#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(long)
	 * @generated
	 */
	void unsetTimeout();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TServer#getTimeout <em>Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout</em>' attribute is set.
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(long)
	 * @generated
	 */
	boolean isSetTimeout();

} // TServer
