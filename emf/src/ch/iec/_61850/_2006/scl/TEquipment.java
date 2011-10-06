/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEquipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TEquipment#isVirtual <em>Virtual</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTEquipment()
 * @model abstract="true"
 *        extendedMetaData="name='tEquipment' kind='elementOnly'"
 * @generated
 */
public interface TEquipment extends TPowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Virtual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual</em>' attribute.
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #setVirtual(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTEquipment_Virtual()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='virtual'"
	 * @generated
	 */
	boolean isVirtual();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TEquipment#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' attribute.
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #isVirtual()
	 * @generated
	 */
	void setVirtual(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TEquipment#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVirtual()
	 * @see #isVirtual()
	 * @see #setVirtual(boolean)
	 * @generated
	 */
	void unsetVirtual();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TEquipment#isVirtual <em>Virtual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Virtual</em>' attribute is set.
	 * @see #unsetVirtual()
	 * @see #isVirtual()
	 * @see #setVirtual(boolean)
	 * @generated
	 */
	boolean isSetVirtual();

} // TEquipment
