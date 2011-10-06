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
 * A representation of the model object '<em><b>TDAI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TDAI#getVal <em>Val</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDAI#getIx <em>Ix</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDAI#getName <em>Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDAI#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDAI#getValKind <em>Val Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTDAI()
 * @model extendedMetaData="name='tDAI' kind='elementOnly'"
 * @generated
 */
public interface TDAI extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAI_Val()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Val' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TVal> getVal();

	/**
	 * Returns the value of the '<em><b>Ix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ix</em>' attribute.
	 * @see #isSetIx()
	 * @see #unsetIx()
	 * @see #setIx(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAI_Ix()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='ix'"
	 * @generated
	 */
	long getIx();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDAI#getIx <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ix</em>' attribute.
	 * @see #isSetIx()
	 * @see #unsetIx()
	 * @see #getIx()
	 * @generated
	 */
	void setIx(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDAI#getIx <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIx()
	 * @see #getIx()
	 * @see #setIx(long)
	 * @generated
	 */
	void unsetIx();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDAI#getIx <em>Ix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ix</em>' attribute is set.
	 * @see #unsetIx()
	 * @see #getIx()
	 * @see #setIx(long)
	 * @generated
	 */
	boolean isSetIx();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAI_Name()
	 * @model dataType="ch.iec._61850._2006.scl.TAttributeNameEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDAI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>SAddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SAddr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SAddr</em>' attribute.
	 * @see #setSAddr(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAI_SAddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='sAddr'"
	 * @generated
	 */
	String getSAddr();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDAI#getSAddr <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SAddr</em>' attribute.
	 * @see #getSAddr()
	 * @generated
	 */
	void setSAddr(String value);

	/**
	 * Returns the value of the '<em><b>Val Kind</b></em>' attribute.
	 * The default value is <code>"Set"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TValKindEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Kind</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TValKindEnum
	 * @see #isSetValKind()
	 * @see #unsetValKind()
	 * @see #setValKind(TValKindEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDAI_ValKind()
	 * @model default="Set" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valKind'"
	 * @generated
	 */
	TValKindEnum getValKind();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDAI#getValKind <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Kind</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TValKindEnum
	 * @see #isSetValKind()
	 * @see #unsetValKind()
	 * @see #getValKind()
	 * @generated
	 */
	void setValKind(TValKindEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDAI#getValKind <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValKind()
	 * @see #getValKind()
	 * @see #setValKind(TValKindEnum)
	 * @generated
	 */
	void unsetValKind();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDAI#getValKind <em>Val Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Val Kind</em>' attribute is set.
	 * @see #unsetValKind()
	 * @see #getValKind()
	 * @see #setValKind(TValKindEnum)
	 * @generated
	 */
	boolean isSetValKind();

} // TDAI
