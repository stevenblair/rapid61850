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
 * A representation of the model object '<em><b>TL Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLNodeType#getDO <em>DO</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLNodeType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLNodeType#getLnClass <em>Ln Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLNodeType()
 * @model extendedMetaData="name='tLNodeType' kind='elementOnly'"
 * @generated
 */
public interface TLNodeType extends TIDNaming {
	/**
	 * Returns the value of the '<em><b>DO</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DO</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNodeType_DO()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DO' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDO> getDO();

	/**
	 * Returns the value of the '<em><b>Ied Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ied Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #setIedType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNodeType_IedType()
	 * @model default="" unsettable="true" dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='iedType'"
	 * @generated
	 */
	String getIedType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNodeType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @generated
	 */
	void setIedType(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLNodeType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
	void unsetIedType();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLNodeType#getIedType <em>Ied Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ied Type</em>' attribute is set.
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
	boolean isSetIedType();

	/**
	 * Returns the value of the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Class</em>' attribute.
	 * @see #setLnClass(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNodeType_LnClass()
	 * @model dataType="ch.iec._61850._2006.scl.TLNClassEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNodeType#getLnClass <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Class</em>' attribute.
	 * @see #getLnClass()
	 * @generated
	 */
	void setLnClass(Object value);

} // TLNodeType
