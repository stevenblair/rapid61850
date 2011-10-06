/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TControl With Trigger Opt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTControlWithTriggerOpt()
 * @model abstract="true"
 *        extendedMetaData="name='tControlWithTriggerOpt' kind='elementOnly'"
 * @generated
 */
public interface TControlWithTriggerOpt extends TControl {
	/**
	 * Returns the value of the '<em><b>Trg Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trg Ops</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Ops</em>' containment reference.
	 * @see #setTrgOps(TTrgOps)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControlWithTriggerOpt_TrgOps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TrgOps' namespace='##targetNamespace'"
	 * @generated
	 */
	TTrgOps getTrgOps();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Ops</em>' containment reference.
	 * @see #getTrgOps()
	 * @generated
	 */
	void setTrgOps(TTrgOps value);

	/**
	 * Returns the value of the '<em><b>Intg Pd</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intg Pd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intg Pd</em>' attribute.
	 * @see #isSetIntgPd()
	 * @see #unsetIntgPd()
	 * @see #setIntgPd(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControlWithTriggerOpt_IntgPd()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='intgPd'"
	 * @generated
	 */
	long getIntgPd();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intg Pd</em>' attribute.
	 * @see #isSetIntgPd()
	 * @see #unsetIntgPd()
	 * @see #getIntgPd()
	 * @generated
	 */
	void setIntgPd(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntgPd()
	 * @see #getIntgPd()
	 * @see #setIntgPd(long)
	 * @generated
	 */
	void unsetIntgPd();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intg Pd</em>' attribute is set.
	 * @see #unsetIntgPd()
	 * @see #getIntgPd()
	 * @see #setIntgPd(long)
	 * @generated
	 */
	boolean isSetIntgPd();

} // TControlWithTriggerOpt
