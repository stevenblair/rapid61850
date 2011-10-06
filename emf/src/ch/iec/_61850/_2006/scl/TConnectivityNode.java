/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TConnectivity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TConnectivityNode#getPathName <em>Path Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectivityNode()
 * @model extendedMetaData="name='tConnectivityNode' kind='elementOnly'"
 * @generated
 */
public interface TConnectivityNode extends TLNodeContainer {
	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConnectivityNode_PathName()
	 * @model dataType="ch.iec._61850._2006.scl.TRef" required="true"
	 *        extendedMetaData="kind='attribute' name='pathName'"
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TConnectivityNode#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

} // TConnectivityNode
