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
 * A representation of the model object '<em><b>TSub Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSubFunction#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSubFunction()
 * @model extendedMetaData="name='tSubFunction' kind='elementOnly'"
 * @generated
 */
public interface TSubFunction extends TPowerSystemResource {
	/**
	 * Returns the value of the '<em><b>General Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TGeneralEquipment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Equipment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Equipment</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSubFunction_GeneralEquipment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeneralEquipment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TGeneralEquipment> getGeneralEquipment();

} // TSubFunction
