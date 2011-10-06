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
 * A representation of the model object '<em><b>TCommunication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TCommunication#getSubNetwork <em>Sub Network</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTCommunication()
 * @model extendedMetaData="name='tCommunication' kind='elementOnly'"
 * @generated
 */
public interface TCommunication extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Sub Network</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSubNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Network</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTCommunication_SubNetwork()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubNetwork' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TSubNetwork> getSubNetwork();

} // TCommunication
