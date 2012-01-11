/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TControl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TControl#getDatSet <em>Dat Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TControl#getControlBlock <em>Control Block</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TControl#getDataSetRef <em>Data Set Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTControl()
 * @model abstract="true"
 *        extendedMetaData="name='tControl' kind='elementOnly'"
 * @generated
 */
public interface TControl extends TNaming {
	/**
	 * Returns the value of the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dat Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat Set</em>' attribute.
	 * @see #setDatSet(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControl_DatSet()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='datSet'"
	 * @generated
	 */
	String getDatSet();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TControl#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dat Set</em>' attribute.
	 * @see #getDatSet()
	 * @generated
	 */
	void setDatSet(String value);

	/**
	 * Returns the value of the '<em><b>Control Block</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ch.iec._61850._2006.scl.TControlBlock#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Block</em>' reference.
	 * @see #setControlBlock(TControlBlock)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControl_ControlBlock()
	 * @see ch.iec._61850._2006.scl.TControlBlock#getControl
	 * @model opposite="control"
	 * @generated
	 */
	TControlBlock getControlBlock();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TControl#getControlBlock <em>Control Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Block</em>' reference.
	 * @see #getControlBlock()
	 * @generated
	 */
	void setControlBlock(TControlBlock value);

	/**
	 * Returns the value of the '<em><b>Data Set Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ch.iec._61850._2006.scl.TDataSet#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Ref</em>' reference.
	 * @see #setDataSetRef(TDataSet)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControl_DataSetRef()
	 * @see ch.iec._61850._2006.scl.TDataSet#getControl
	 * @model opposite="control"
	 * @generated
	 */
	TDataSet getDataSetRef();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TControl#getDataSetRef <em>Data Set Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Ref</em>' reference.
	 * @see #getDataSetRef()
	 * @generated
	 */
	void setDataSetRef(TDataSet value);

} // TControl
