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
 * A representation of the model object '<em><b>TEnum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TEnumType#getEnumVal <em>Enum Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTEnumType()
 * @model extendedMetaData="name='tEnumType' kind='elementOnly'"
 * @generated
 */
public interface TEnumType extends TIDNaming {
	/**
	 * Returns the value of the '<em><b>Enum Val</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TEnumVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Val</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Val</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTEnumType_EnumVal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EnumVal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TEnumVal> getEnumVal();

} // TEnumType
