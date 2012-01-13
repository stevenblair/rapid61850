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
 * A representation of the model object '<em><b>TAbstract Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getVal <em>Val</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getBType <em>BType</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getCount <em>Count</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getType <em>Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getPrintedType <em>Printed Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute()
 * @model abstract="true"
 *        extendedMetaData="name='tAbstractDataAttribute' kind='elementOnly'"
 * @generated
 */
public interface TAbstractDataAttribute extends TUnNaming {
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_Val()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Val' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TVal> getVal();

	/**
	 * Returns the value of the '<em><b>BType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BType</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BType</em>' attribute.
	 * @see #setBType(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_BType()
	 * @model dataType="ch.iec._61850._2006.scl.TBasicTypeEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='bType'"
	 * @generated
	 */
	Object getBType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getBType <em>BType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BType</em>' attribute.
	 * @see #getBType()
	 * @generated
	 */
	void setBType(Object value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #setCount(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_Count()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	long getCount();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #getCount()
	 * @generated
	 */
	void setCount(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(long)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getCount <em>Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count</em>' attribute is set.
	 * @see #unsetCount()
	 * @see #getCount()
	 * @see #setCount(long)
	 * @generated
	 */
	boolean isSetCount();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_Name()
	 * @model dataType="ch.iec._61850._2006.scl.TAttributeNameEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getName <em>Name</em>}' attribute.
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_SAddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='sAddr'"
	 * @generated
	 */
	String getSAddr();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getSAddr <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SAddr</em>' attribute.
	 * @see #getSAddr()
	 * @generated
	 */
	void setSAddr(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_Type()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_ValKind()
	 * @model default="Set" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valKind'"
	 * @generated
	 */
	TValKindEnum getValKind();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getValKind <em>Val Kind</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getValKind <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValKind()
	 * @see #getValKind()
	 * @see #setValKind(TValKindEnum)
	 * @generated
	 */
	void unsetValKind();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getValKind <em>Val Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Val Kind</em>' attribute is set.
	 * @see #unsetValKind()
	 * @see #getValKind()
	 * @see #setValKind(TValKindEnum)
	 * @generated
	 */
	boolean isSetValKind();

	/**
	 * Returns the value of the '<em><b>Printed Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printed Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printed Type</em>' attribute.
	 * @see #setPrintedType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAbstractDataAttribute_PrintedType()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPrintedType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getPrintedType <em>Printed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printed Type</em>' attribute.
	 * @see #getPrintedType()
	 * @generated
	 */
	void setPrintedType(String value);

} // TAbstractDataAttribute
