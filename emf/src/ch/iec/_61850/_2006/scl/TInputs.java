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
 * A representation of the model object '<em><b>TInputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TInputs#getExtRef <em>Ext Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTInputs()
 * @model extendedMetaData="name='tInputs' kind='elementOnly'"
 * @generated
 */
public interface TInputs extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Ext Ref</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TExtRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Ref</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTInputs_ExtRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExtRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TExtRef> getExtRef();

} // TInputs
