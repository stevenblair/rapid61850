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
 * A representation of the model object '<em><b>TDA Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TDAType#getBDA <em>BDA</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDAType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDAType#getExtRef <em>Ext Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDAType#getFcda <em>Fcda</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTDAType()
 * @model extendedMetaData="name='tDAType' kind='elementOnly'"
 * @generated
 */
public interface TDAType extends TIDNaming {
	/**
	 * Returns the value of the '<em><b>BDA</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TBDA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BDA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BDA</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAType_BDA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BDA' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TBDA> getBDA();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAType_IedType()
	 * @model default="" unsettable="true" dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='iedType'"
	 * @generated
	 */
	String getIedType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDAType#getIedType <em>Ied Type</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDAType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
	void unsetIedType();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDAType#getIedType <em>Ied Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ext Ref</b></em>' reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TExtRef}.
	 * It is bidirectional and its opposite is '{@link ch.iec._61850._2006.scl.TExtRef#getDaType <em>Da Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Ref</em>' reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAType_ExtRef()
	 * @see ch.iec._61850._2006.scl.TExtRef#getDaType
	 * @model opposite="daType"
	 * @generated
	 */
	EList<TExtRef> getExtRef();

	/**
	 * Returns the value of the '<em><b>Fcda</b></em>' reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TFCDA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fcda</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fcda</em>' reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAType_Fcda()
	 * @model
	 * @generated
	 */
	EList<TFCDA> getFcda();

} // TDAType
