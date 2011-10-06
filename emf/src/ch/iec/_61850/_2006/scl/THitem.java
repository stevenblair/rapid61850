/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>THitem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.THitem#getRevision <em>Revision</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THitem#getVersion <em>Version</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THitem#getWhat <em>What</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THitem#getWhen <em>When</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THitem#getWho <em>Who</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THitem#getWhy <em>Why</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTHitem()
 * @model extendedMetaData="name='tHitem' kind='mixed'"
 * @generated
 */
public interface THitem extends TAnyContentFromOtherNamespace {
	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHitem_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THitem#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHitem_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THitem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>What</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' attribute.
	 * @see #setWhat(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHitem_What()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='what'"
	 * @generated
	 */
	String getWhat();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THitem#getWhat <em>What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' attribute.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(String value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHitem_When()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='when'"
	 * @generated
	 */
	String getWhen();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THitem#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(String value);

	/**
	 * Returns the value of the '<em><b>Who</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' attribute.
	 * @see #setWho(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHitem_Who()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='who'"
	 * @generated
	 */
	String getWho();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THitem#getWho <em>Who</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' attribute.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(String value);

	/**
	 * Returns the value of the '<em><b>Why</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Why</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Why</em>' attribute.
	 * @see #setWhy(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHitem_Why()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='why'"
	 * @generated
	 */
	String getWhy();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THitem#getWhy <em>Why</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Why</em>' attribute.
	 * @see #getWhy()
	 * @generated
	 */
	void setWhy(String value);

} // THitem
