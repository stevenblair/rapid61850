/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSub Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSubEquipment#getPhase <em>Phase</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSubEquipment#isVirtual <em>Virtual</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSubEquipment()
 * @model extendedMetaData="name='tSubEquipment' kind='elementOnly'"
 * @generated
 */
public interface TSubEquipment extends TPowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TPhaseEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TPhaseEnum
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(TPhaseEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubEquipment_Phase()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='phase'"
	 * @generated
	 */
	TPhaseEnum getPhase();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSubEquipment#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TPhaseEnum
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(TPhaseEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSubEquipment#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(TPhaseEnum)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSubEquipment#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(TPhaseEnum)
	 * @generated
	 */
	boolean isSetPhase();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubEquipment_Virtual()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='virtual'"
	 * @generated
	 */
	boolean isVirtual();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSubEquipment#isVirtual <em>Virtual</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSubEquipment#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVirtual()
	 * @see #isVirtual()
	 * @see #setVirtual(boolean)
	 * @generated
	 */
	void unsetVirtual();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSubEquipment#isVirtual <em>Virtual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Virtual</em>' attribute is set.
	 * @see #unsetVirtual()
	 * @see #isVirtual()
	 * @see #setVirtual(boolean)
	 * @generated
	 */
	boolean isSetVirtual();

} // TSubEquipment
