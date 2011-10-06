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
 * A representation of the model object '<em><b>TL Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLNodeContainer#getLNode <em>LNode</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLNodeContainer()
 * @model abstract="true"
 *        extendedMetaData="name='tLNodeContainer' kind='elementOnly'"
 * @generated
 */
public interface TLNodeContainer extends TNaming {
	/**
	 * Returns the value of the '<em><b>LNode</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TLNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LNode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LNode</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNodeContainer_LNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TLNode> getLNode();

} // TLNodeContainer
