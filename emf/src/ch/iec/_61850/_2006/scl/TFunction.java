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
 * A representation of the model object '<em><b>TFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TFunction#getSubFunction <em>Sub Function</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFunction#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTFunction()
 * @model extendedMetaData="name='tFunction' kind='elementOnly'"
 * @generated
 */
public interface TFunction extends TPowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Sub Function</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSubFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Function</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFunction_SubFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TSubFunction> getSubFunction();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFunction_GeneralEquipment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeneralEquipment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TGeneralEquipment> getGeneralEquipment();

} // TFunction
