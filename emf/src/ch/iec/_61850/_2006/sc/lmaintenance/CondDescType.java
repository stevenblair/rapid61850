/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lmaintenance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cond Desc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.sc.lmaintenance.CondDescType#getDesc <em>Desc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lmaintenance.CondDescType#getMop <em>Mop</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage#getCondDescType()
 * @model extendedMetaData="name='CondDesc_._type' kind='empty'"
 * @generated
 */
public interface CondDescType extends EObject {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage#getCondDescType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.sc.lmaintenance.CondDescType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Mop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mop</em>' attribute.
	 * @see #setMop(Object)
	 * @see ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage#getCondDescType_Mop()
	 * @model dataType="ch.iec._61850._2006.sc.lmaintenance.TMOP" required="true"
	 *        extendedMetaData="kind='attribute' name='mop'"
	 * @generated
	 */
	Object getMop();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.sc.lmaintenance.CondDescType#getMop <em>Mop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mop</em>' attribute.
	 * @see #getMop()
	 * @generated
	 */
	void setMop(Object value);

} // CondDescType
