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
 * A representation of the model object '<em><b>THeader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.THeader#getText <em>Text</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THeader#getHistory <em>History</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THeader#getId <em>Id</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THeader#getNameStructure <em>Name Structure</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THeader#getRevision <em>Revision</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THeader#getToolID <em>Tool ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.THeader#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader()
 * @model extendedMetaData="name='tHeader' kind='elementOnly'"
 * @generated
 */
public interface THeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TText)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Text' namespace='##targetNamespace'"
	 * @generated
	 */
	TText getText();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THeader#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TText value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(HistoryType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader_History()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='History' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryType getHistory();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THeader#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(HistoryType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THeader#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name Structure</b></em>' attribute.
	 * The default value is <code>"IEDName"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.NameStructureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Structure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Structure</em>' attribute.
	 * @see ch.iec._61850._2006.scl.NameStructureType
	 * @see #isSetNameStructure()
	 * @see #unsetNameStructure()
	 * @see #setNameStructure(NameStructureType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader_NameStructure()
	 * @model default="IEDName" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='nameStructure'"
	 * @generated
	 */
	NameStructureType getNameStructure();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THeader#getNameStructure <em>Name Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Structure</em>' attribute.
	 * @see ch.iec._61850._2006.scl.NameStructureType
	 * @see #isSetNameStructure()
	 * @see #unsetNameStructure()
	 * @see #getNameStructure()
	 * @generated
	 */
	void setNameStructure(NameStructureType value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.THeader#getNameStructure <em>Name Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameStructure()
	 * @see #getNameStructure()
	 * @see #setNameStructure(NameStructureType)
	 * @generated
	 */
	void unsetNameStructure();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.THeader#getNameStructure <em>Name Structure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Structure</em>' attribute is set.
	 * @see #unsetNameStructure()
	 * @see #getNameStructure()
	 * @see #setNameStructure(NameStructureType)
	 * @generated
	 */
	boolean isSetNameStructure();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #isSetRevision()
	 * @see #unsetRevision()
	 * @see #setRevision(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader_Revision()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THeader#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #isSetRevision()
	 * @see #unsetRevision()
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.THeader#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevision()
	 * @see #getRevision()
	 * @see #setRevision(String)
	 * @generated
	 */
	void unsetRevision();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.THeader#getRevision <em>Revision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revision</em>' attribute is set.
	 * @see #unsetRevision()
	 * @see #getRevision()
	 * @see #setRevision(String)
	 * @generated
	 */
	boolean isSetRevision();

	/**
	 * Returns the value of the '<em><b>Tool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool ID</em>' attribute.
	 * @see #setToolID(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader_ToolID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='toolID'"
	 * @generated
	 */
	String getToolID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THeader#getToolID <em>Tool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool ID</em>' attribute.
	 * @see #getToolID()
	 * @generated
	 */
	void setToolID(String value);

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTHeader_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.THeader#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // THeader
