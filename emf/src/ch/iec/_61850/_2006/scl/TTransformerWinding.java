/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTransformer Winding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TTransformerWinding#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTransformerWinding#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTTransformerWinding()
 * @model extendedMetaData="name='tTransformerWinding' kind='elementOnly'"
 * @generated
 */
public interface TTransformerWinding extends TAbstractConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' containment reference.
	 * @see #setTapChanger(TTapChanger)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTransformerWinding_TapChanger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TapChanger' namespace='##targetNamespace'"
	 * @generated
	 */
	TTapChanger getTapChanger();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTransformerWinding#getTapChanger <em>Tap Changer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer</em>' containment reference.
	 * @see #getTapChanger()
	 * @generated
	 */
	void setTapChanger(TTapChanger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PTW"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TTransformerWindingEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TTransformerWindingEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TTransformerWindingEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTransformerWinding_Type()
	 * @model default="PTW" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TTransformerWindingEnum getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTransformerWinding#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TTransformerWindingEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TTransformerWindingEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTransformerWinding#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TTransformerWindingEnum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTransformerWinding#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TTransformerWindingEnum)
	 * @generated
	 */
	boolean isSetType();

} // TTransformerWinding
