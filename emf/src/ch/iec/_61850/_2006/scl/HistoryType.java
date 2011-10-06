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
 * A representation of the model object '<em><b>History Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.HistoryType#getHitem <em>Hitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getHistoryType()
 * @model extendedMetaData="name='History_._type' kind='elementOnly'"
 * @generated
 */
public interface HistoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hitem</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.THitem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hitem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hitem</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getHistoryType_Hitem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hitem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<THitem> getHitem();

} // HistoryType
