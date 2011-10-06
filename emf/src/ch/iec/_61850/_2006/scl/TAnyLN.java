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
 * A representation of the model object '<em><b>TAny LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TAnyLN#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAnyLN#getReportControl <em>Report Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAnyLN#getLogControl <em>Log Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAnyLN#getDOI <em>DOI</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAnyLN#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAnyLN#getLnType <em>Ln Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTAnyLN()
 * @model abstract="true"
 *        extendedMetaData="name='tAnyLN' kind='elementOnly'"
 * @generated
 */
public interface TAnyLN extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDataSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAnyLN_DataSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDataSet> getDataSet();

	/**
	 * Returns the value of the '<em><b>Report Control</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TReportControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Control</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAnyLN_ReportControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportControl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TReportControl> getReportControl();

	/**
	 * Returns the value of the '<em><b>Log Control</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TLogControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Control</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAnyLN_LogControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LogControl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TLogControl> getLogControl();

	/**
	 * Returns the value of the '<em><b>DOI</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDOI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DOI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DOI</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAnyLN_DOI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DOI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDOI> getDOI();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(TInputs)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAnyLN_Inputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	TInputs getInputs();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAnyLN#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(TInputs value);

	/**
	 * Returns the value of the '<em><b>Ln Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Type</em>' attribute.
	 * @see #setLnType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAnyLN_LnType()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='lnType'"
	 * @generated
	 */
	String getLnType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAnyLN#getLnType <em>Ln Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Type</em>' attribute.
	 * @see #getLnType()
	 * @generated
	 */
	void setLnType(String value);

} // TAnyLN
