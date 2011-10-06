/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TConducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TConductingEquipment#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTConductingEquipment()
 * @model extendedMetaData="name='tConductingEquipment' kind='elementOnly'"
 * @generated
 */
public interface TConductingEquipment extends TAbstractConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConductingEquipment_Type()
	 * @model dataType="ch.iec._61850._2006.scl.TCommonConductingEquipmentEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TConductingEquipment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

} // TConductingEquipment
