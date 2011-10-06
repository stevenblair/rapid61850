/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TData Type Templates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getDOType <em>DO Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getDAType <em>DA Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getEnumType <em>Enum Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTDataTypeTemplates()
 * @model extendedMetaData="name='tDataTypeTemplates' kind='elementOnly'"
 * @generated
 */
public interface TDataTypeTemplates extends EObject {
	/**
	 * Returns the value of the '<em><b>LNode Type</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TLNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LNode Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LNode Type</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataTypeTemplates_LNodeType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LNodeType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TLNodeType> getLNodeType();

	/**
	 * Returns the value of the '<em><b>DO Type</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDOType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DO Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DO Type</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataTypeTemplates_DOType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DOType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDOType> getDOType();

	/**
	 * Returns the value of the '<em><b>DA Type</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDAType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DA Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DA Type</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataTypeTemplates_DAType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DAType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDAType> getDAType();

	/**
	 * Returns the value of the '<em><b>Enum Type</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TEnumType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataTypeTemplates_EnumType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TEnumType> getEnumType();

} // TDataTypeTemplates
