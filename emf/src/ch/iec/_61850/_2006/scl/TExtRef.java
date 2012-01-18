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
 * A representation of the model object '<em><b>TExt Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getDaName <em>Da Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getDoName <em>Do Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getIntAddr <em>Int Addr</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getDoType <em>Do Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TExtRef#getDaType <em>Da Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef()
 * @model extendedMetaData="name='tExtRef' kind='empty'"
 * @generated
 */
public interface TExtRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Da Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Da Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Da Name</em>' attribute.
	 * @see #setDaName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_DaName()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='daName'"
	 * @generated
	 */
	String getDaName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getDaName <em>Da Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Da Name</em>' attribute.
	 * @see #getDaName()
	 * @generated
	 */
	void setDaName(String value);

	/**
	 * Returns the value of the '<em><b>Do Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Name</em>' attribute.
	 * @see #setDoName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_DoName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='doName'"
	 * @generated
	 */
	String getDoName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getDoName <em>Do Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Name</em>' attribute.
	 * @see #getDoName()
	 * @generated
	 */
	void setDoName(String value);

	/**
	 * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ied Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Name</em>' attribute.
	 * @see #setIedName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_IedName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='iedName'"
	 * @generated
	 */
	String getIedName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getIedName <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Name</em>' attribute.
	 * @see #getIedName()
	 * @generated
	 */
	void setIedName(String value);

	/**
	 * Returns the value of the '<em><b>Int Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Addr</em>' attribute.
	 * @see #setIntAddr(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_IntAddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='intAddr'"
	 * @generated
	 */
	String getIntAddr();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getIntAddr <em>Int Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Addr</em>' attribute.
	 * @see #getIntAddr()
	 * @generated
	 */
	void setIntAddr(String value);

	/**
	 * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ld Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ld Inst</em>' attribute.
	 * @see #setLdInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_LdInst()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='ldInst'"
	 * @generated
	 */
	String getLdInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getLdInst <em>Ld Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ld Inst</em>' attribute.
	 * @see #getLdInst()
	 * @generated
	 */
	void setLdInst(String value);

	/**
	 * Returns the value of the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Class</em>' attribute.
	 * @see #setLnClass(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_LnClass()
	 * @model dataType="ch.iec._61850._2006.scl.TLNClassEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getLnClass <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Class</em>' attribute.
	 * @see #getLnClass()
	 * @generated
	 */
	void setLnClass(Object value);

	/**
	 * Returns the value of the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Inst</em>' attribute.
	 * @see #setLnInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_LnInst()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName" required="true"
	 *        extendedMetaData="kind='attribute' name='lnInst'"
	 * @generated
	 */
	String getLnInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getLnInst <em>Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Inst</em>' attribute.
	 * @see #getLnInst()
	 * @generated
	 */
	void setLnInst(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_Prefix()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='prefix'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDataSet}.
	 * It is bidirectional and its opposite is '{@link ch.iec._61850._2006.scl.TDataSet#getExtRef <em>Ext Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_DataSet()
	 * @see ch.iec._61850._2006.scl.TDataSet#getExtRef
	 * @model opposite="extRef"
	 * @generated
	 */
	EList<TDataSet> getDataSet();

	/**
	 * Returns the value of the '<em><b>Do Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ch.iec._61850._2006.scl.TDOType#getExtRef <em>Ext Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Type</em>' reference.
	 * @see #setDoType(TDOType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_DoType()
	 * @see ch.iec._61850._2006.scl.TDOType#getExtRef
	 * @model opposite="extRef"
	 * @generated
	 */
	TDOType getDoType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getDoType <em>Do Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Type</em>' reference.
	 * @see #getDoType()
	 * @generated
	 */
	void setDoType(TDOType value);

	/**
	 * Returns the value of the '<em><b>Da Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ch.iec._61850._2006.scl.TDAType#getExtRef <em>Ext Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Da Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Da Type</em>' reference.
	 * @see #setDaType(TDAType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTExtRef_DaType()
	 * @see ch.iec._61850._2006.scl.TDAType#getExtRef
	 * @model opposite="extRef"
	 * @generated
	 */
	TDAType getDaType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TExtRef#getDaType <em>Da Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Da Type</em>' reference.
	 * @see #getDaType()
	 * @generated
	 */
	void setDaType(TDAType value);

} // TExtRef
