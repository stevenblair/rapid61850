/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TData Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TDataSet#getGroup <em>Group</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDataSet#getFCDA <em>FCDA</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDataSet#getFCCB <em>FCCB</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDataSet#getExtRef <em>Ext Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTDataSet()
 * @model extendedMetaData="name='tDataSet' kind='elementOnly'"
 * @generated
 */
public interface TDataSet extends TNaming {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataSet_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>FCDA</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TFCDA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FCDA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCDA</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataSet_FCDA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FCDA' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TFCDA> getFCDA();

	/**
	 * Returns the value of the '<em><b>FCCB</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TFCCB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FCCB</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCCB</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataSet_FCCB()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FCCB' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TFCCB> getFCCB();

	/**
	 * Returns the value of the '<em><b>Ext Ref</b></em>' reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TExtRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Ref</em>' reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDataSet_ExtRef()
	 * @model
	 * @generated
	 */
	EList<TExtRef> getExtRef();

} // TDataSet
