/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.HistoryType;
import ch.iec._61850._2006.scl.NameStructureType;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.THeader;
import ch.iec._61850._2006.scl.TText;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>THeader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THeaderImpl#getText <em>Text</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THeaderImpl#getHistory <em>History</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THeaderImpl#getId <em>Id</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THeaderImpl#getNameStructure <em>Name Structure</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THeaderImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THeaderImpl#getToolID <em>Tool ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THeaderImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class THeaderImpl extends EObjectImpl implements THeader {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected TText text;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected HistoryType history;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameStructure() <em>Name Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStructure()
	 * @generated
	 * @ordered
	 */
	protected static final NameStructureType NAME_STRUCTURE_EDEFAULT = NameStructureType.IED_NAME;

	/**
	 * The cached value of the '{@link #getNameStructure() <em>Name Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStructure()
	 * @generated
	 * @ordered
	 */
	protected NameStructureType nameStructure = NAME_STRUCTURE_EDEFAULT;

	/**
	 * This is true if the Name Structure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameStructureESet;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * This is true if the Revision attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisionESet;

	/**
	 * The default value of the '{@link #getToolID() <em>Tool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolID()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolID() <em>Tool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolID()
	 * @generated
	 * @ordered
	 */
	protected String toolID = TOOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected THeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TText getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(TText newText, NotificationChain msgs) {
		TText oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(TText newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.THEADER__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.THEADER__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryType getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(HistoryType newHistory, NotificationChain msgs) {
		HistoryType oldHistory = history;
		history = newHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__HISTORY, oldHistory, newHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(HistoryType newHistory) {
		if (newHistory != history) {
			NotificationChain msgs = null;
			if (history != null)
				msgs = ((InternalEObject)history).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.THEADER__HISTORY, null, msgs);
			if (newHistory != null)
				msgs = ((InternalEObject)newHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.THEADER__HISTORY, null, msgs);
			msgs = basicSetHistory(newHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__HISTORY, newHistory, newHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStructureType getNameStructure() {
		return nameStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameStructure(NameStructureType newNameStructure) {
		NameStructureType oldNameStructure = nameStructure;
		nameStructure = newNameStructure == null ? NAME_STRUCTURE_EDEFAULT : newNameStructure;
		boolean oldNameStructureESet = nameStructureESet;
		nameStructureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__NAME_STRUCTURE, oldNameStructure, nameStructure, !oldNameStructureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNameStructure() {
		NameStructureType oldNameStructure = nameStructure;
		boolean oldNameStructureESet = nameStructureESet;
		nameStructure = NAME_STRUCTURE_EDEFAULT;
		nameStructureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.THEADER__NAME_STRUCTURE, oldNameStructure, NAME_STRUCTURE_EDEFAULT, oldNameStructureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNameStructure() {
		return nameStructureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		boolean oldRevisionESet = revisionESet;
		revisionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__REVISION, oldRevision, revision, !oldRevisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevision() {
		String oldRevision = revision;
		boolean oldRevisionESet = revisionESet;
		revision = REVISION_EDEFAULT;
		revisionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.THEADER__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevision() {
		return revisionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToolID() {
		return toolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolID(String newToolID) {
		String oldToolID = toolID;
		toolID = newToolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__TOOL_ID, oldToolID, toolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THEADER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.THEADER__TEXT:
				return basicSetText(null, msgs);
			case SclPackage.THEADER__HISTORY:
				return basicSetHistory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.THEADER__TEXT:
				return getText();
			case SclPackage.THEADER__HISTORY:
				return getHistory();
			case SclPackage.THEADER__ID:
				return getId();
			case SclPackage.THEADER__NAME_STRUCTURE:
				return getNameStructure();
			case SclPackage.THEADER__REVISION:
				return getRevision();
			case SclPackage.THEADER__TOOL_ID:
				return getToolID();
			case SclPackage.THEADER__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SclPackage.THEADER__TEXT:
				setText((TText)newValue);
				return;
			case SclPackage.THEADER__HISTORY:
				setHistory((HistoryType)newValue);
				return;
			case SclPackage.THEADER__ID:
				setId((String)newValue);
				return;
			case SclPackage.THEADER__NAME_STRUCTURE:
				setNameStructure((NameStructureType)newValue);
				return;
			case SclPackage.THEADER__REVISION:
				setRevision((String)newValue);
				return;
			case SclPackage.THEADER__TOOL_ID:
				setToolID((String)newValue);
				return;
			case SclPackage.THEADER__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SclPackage.THEADER__TEXT:
				setText((TText)null);
				return;
			case SclPackage.THEADER__HISTORY:
				setHistory((HistoryType)null);
				return;
			case SclPackage.THEADER__ID:
				setId(ID_EDEFAULT);
				return;
			case SclPackage.THEADER__NAME_STRUCTURE:
				unsetNameStructure();
				return;
			case SclPackage.THEADER__REVISION:
				unsetRevision();
				return;
			case SclPackage.THEADER__TOOL_ID:
				setToolID(TOOL_ID_EDEFAULT);
				return;
			case SclPackage.THEADER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SclPackage.THEADER__TEXT:
				return text != null;
			case SclPackage.THEADER__HISTORY:
				return history != null;
			case SclPackage.THEADER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SclPackage.THEADER__NAME_STRUCTURE:
				return isSetNameStructure();
			case SclPackage.THEADER__REVISION:
				return isSetRevision();
			case SclPackage.THEADER__TOOL_ID:
				return TOOL_ID_EDEFAULT == null ? toolID != null : !TOOL_ID_EDEFAULT.equals(toolID);
			case SclPackage.THEADER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", nameStructure: ");
		if (nameStructureESet) result.append(nameStructure); else result.append("<unset>");
		result.append(", revision: ");
		if (revisionESet) result.append(revision); else result.append("<unset>");
		result.append(", toolID: ");
		result.append(toolID);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //THeaderImpl
