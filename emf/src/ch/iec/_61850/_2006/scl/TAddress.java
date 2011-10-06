/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAddress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TAddress#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTAddress()
 * @model extendedMetaData="name='tAddress' kind='elementOnly'"
 * @generated
 */
public interface TAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAddress_P()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='P' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TP> getP();

} // TAddress
