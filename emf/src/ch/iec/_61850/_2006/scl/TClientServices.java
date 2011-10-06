/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClient Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TClientServices#isBufReport <em>Buf Report</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientServices#isGoose <em>Goose</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientServices#isGsse <em>Gsse</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientServices#isReadLog <em>Read Log</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientServices#isUnbufReport <em>Unbuf Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTClientServices()
 * @model extendedMetaData="name='tClientServices' kind='empty'"
 * @generated
 */
public interface TClientServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Buf Report</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buf Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf Report</em>' attribute.
	 * @see #isSetBufReport()
	 * @see #unsetBufReport()
	 * @see #setBufReport(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientServices_BufReport()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='bufReport'"
	 * @generated
	 */
	boolean isBufReport();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isBufReport <em>Buf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf Report</em>' attribute.
	 * @see #isSetBufReport()
	 * @see #unsetBufReport()
	 * @see #isBufReport()
	 * @generated
	 */
	void setBufReport(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isBufReport <em>Buf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBufReport()
	 * @see #isBufReport()
	 * @see #setBufReport(boolean)
	 * @generated
	 */
	void unsetBufReport();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isBufReport <em>Buf Report</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buf Report</em>' attribute is set.
	 * @see #unsetBufReport()
	 * @see #isBufReport()
	 * @see #setBufReport(boolean)
	 * @generated
	 */
	boolean isSetBufReport();

	/**
	 * Returns the value of the '<em><b>Goose</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goose</em>' attribute.
	 * @see #isSetGoose()
	 * @see #unsetGoose()
	 * @see #setGoose(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientServices_Goose()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='goose'"
	 * @generated
	 */
	boolean isGoose();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isGoose <em>Goose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goose</em>' attribute.
	 * @see #isSetGoose()
	 * @see #unsetGoose()
	 * @see #isGoose()
	 * @generated
	 */
	void setGoose(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isGoose <em>Goose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGoose()
	 * @see #isGoose()
	 * @see #setGoose(boolean)
	 * @generated
	 */
	void unsetGoose();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isGoose <em>Goose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Goose</em>' attribute is set.
	 * @see #unsetGoose()
	 * @see #isGoose()
	 * @see #setGoose(boolean)
	 * @generated
	 */
	boolean isSetGoose();

	/**
	 * Returns the value of the '<em><b>Gsse</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gsse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gsse</em>' attribute.
	 * @see #isSetGsse()
	 * @see #unsetGsse()
	 * @see #setGsse(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientServices_Gsse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='gsse'"
	 * @generated
	 */
	boolean isGsse();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isGsse <em>Gsse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gsse</em>' attribute.
	 * @see #isSetGsse()
	 * @see #unsetGsse()
	 * @see #isGsse()
	 * @generated
	 */
	void setGsse(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isGsse <em>Gsse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGsse()
	 * @see #isGsse()
	 * @see #setGsse(boolean)
	 * @generated
	 */
	void unsetGsse();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isGsse <em>Gsse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gsse</em>' attribute is set.
	 * @see #unsetGsse()
	 * @see #isGsse()
	 * @see #setGsse(boolean)
	 * @generated
	 */
	boolean isSetGsse();

	/**
	 * Returns the value of the '<em><b>Read Log</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Log</em>' attribute.
	 * @see #isSetReadLog()
	 * @see #unsetReadLog()
	 * @see #setReadLog(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientServices_ReadLog()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='readLog'"
	 * @generated
	 */
	boolean isReadLog();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isReadLog <em>Read Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Log</em>' attribute.
	 * @see #isSetReadLog()
	 * @see #unsetReadLog()
	 * @see #isReadLog()
	 * @generated
	 */
	void setReadLog(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isReadLog <em>Read Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadLog()
	 * @see #isReadLog()
	 * @see #setReadLog(boolean)
	 * @generated
	 */
	void unsetReadLog();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isReadLog <em>Read Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Log</em>' attribute is set.
	 * @see #unsetReadLog()
	 * @see #isReadLog()
	 * @see #setReadLog(boolean)
	 * @generated
	 */
	boolean isSetReadLog();

	/**
	 * Returns the value of the '<em><b>Unbuf Report</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbuf Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbuf Report</em>' attribute.
	 * @see #isSetUnbufReport()
	 * @see #unsetUnbufReport()
	 * @see #setUnbufReport(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientServices_UnbufReport()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unbufReport'"
	 * @generated
	 */
	boolean isUnbufReport();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isUnbufReport <em>Unbuf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbuf Report</em>' attribute.
	 * @see #isSetUnbufReport()
	 * @see #unsetUnbufReport()
	 * @see #isUnbufReport()
	 * @generated
	 */
	void setUnbufReport(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isUnbufReport <em>Unbuf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnbufReport()
	 * @see #isUnbufReport()
	 * @see #setUnbufReport(boolean)
	 * @generated
	 */
	void unsetUnbufReport();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TClientServices#isUnbufReport <em>Unbuf Report</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unbuf Report</em>' attribute is set.
	 * @see #unsetUnbufReport()
	 * @see #isUnbufReport()
	 * @see #setUnbufReport(boolean)
	 * @generated
	 */
	boolean isSetUnbufReport();

} // TClientServices
