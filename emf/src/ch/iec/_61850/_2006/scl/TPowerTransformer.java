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
 * A representation of the model object '<em><b>TPower Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TPowerTransformer#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TPowerTransformer#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTPowerTransformer()
 * @model extendedMetaData="name='tPowerTransformer' kind='elementOnly'"
 * @generated
 */
public interface TPowerTransformer extends TEquipment {
	/**
	 * Returns the value of the '<em><b>Transformer Winding</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TTransformerWinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Winding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Winding</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTPowerTransformer_TransformerWinding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TransformerWinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TTransformerWinding> getTransformerWinding();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PTR"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TPowerTransformerEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TPowerTransformerEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TPowerTransformerEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTPowerTransformer_Type()
	 * @model default="PTR" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TPowerTransformerEnum getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TPowerTransformer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TPowerTransformerEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TPowerTransformerEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TPowerTransformer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TPowerTransformerEnum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TPowerTransformer#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TPowerTransformerEnum)
	 * @generated
	 */
	boolean isSetType();

} // TPowerTransformer
