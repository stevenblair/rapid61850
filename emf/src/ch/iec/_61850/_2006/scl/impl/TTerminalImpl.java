/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TTerminal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTerminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTerminalImpl#getBayName <em>Bay Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTerminalImpl#getCNodeName <em>CNode Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTerminalImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTerminalImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTerminalImpl#getSubstationName <em>Substation Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTerminalImpl#getVoltageLevelName <em>Voltage Level Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TTerminalImpl extends TUnNamingImpl implements TTerminal {
	/**
	 * The default value of the '{@link #getBayName() <em>Bay Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBayName()
	 * @generated
	 * @ordered
	 */
	protected static final String BAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBayName() <em>Bay Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBayName()
	 * @generated
	 * @ordered
	 */
	protected String bayName = BAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCNodeName() <em>CNode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CNODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCNodeName() <em>CNode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNodeName()
	 * @generated
	 * @ordered
	 */
	protected String cNodeName = CNODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIVITY_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected String connectivityNode = CONNECTIVITY_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getSubstationName() <em>Substation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstationName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubstationName() <em>Substation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstationName()
	 * @generated
	 * @ordered
	 */
	protected String substationName = SUBSTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageLevelName() <em>Voltage Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevelName()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_LEVEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltageLevelName() <em>Voltage Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevelName()
	 * @generated
	 * @ordered
	 */
	protected String voltageLevelName = VOLTAGE_LEVEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTTerminal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBayName() {
		return bayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBayName(String newBayName) {
		String oldBayName = bayName;
		bayName = newBayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTERMINAL__BAY_NAME, oldBayName, bayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCNodeName() {
		return cNodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNodeName(String newCNodeName) {
		String oldCNodeName = cNodeName;
		cNodeName = newCNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTERMINAL__CNODE_NAME, oldCNodeName, cNodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectivityNode() {
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityNode(String newConnectivityNode) {
		String oldConnectivityNode = connectivityNode;
		connectivityNode = newConnectivityNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, connectivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTERMINAL__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TTERMINAL__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubstationName() {
		return substationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstationName(String newSubstationName) {
		String oldSubstationName = substationName;
		substationName = newSubstationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTERMINAL__SUBSTATION_NAME, oldSubstationName, substationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltageLevelName() {
		return voltageLevelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageLevelName(String newVoltageLevelName) {
		String oldVoltageLevelName = voltageLevelName;
		voltageLevelName = newVoltageLevelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTERMINAL__VOLTAGE_LEVEL_NAME, oldVoltageLevelName, voltageLevelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TTERMINAL__BAY_NAME:
				return getBayName();
			case SclPackage.TTERMINAL__CNODE_NAME:
				return getCNodeName();
			case SclPackage.TTERMINAL__CONNECTIVITY_NODE:
				return getConnectivityNode();
			case SclPackage.TTERMINAL__NAME:
				return getName();
			case SclPackage.TTERMINAL__SUBSTATION_NAME:
				return getSubstationName();
			case SclPackage.TTERMINAL__VOLTAGE_LEVEL_NAME:
				return getVoltageLevelName();
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
			case SclPackage.TTERMINAL__BAY_NAME:
				setBayName((String)newValue);
				return;
			case SclPackage.TTERMINAL__CNODE_NAME:
				setCNodeName((String)newValue);
				return;
			case SclPackage.TTERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode((String)newValue);
				return;
			case SclPackage.TTERMINAL__NAME:
				setName((String)newValue);
				return;
			case SclPackage.TTERMINAL__SUBSTATION_NAME:
				setSubstationName((String)newValue);
				return;
			case SclPackage.TTERMINAL__VOLTAGE_LEVEL_NAME:
				setVoltageLevelName((String)newValue);
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
			case SclPackage.TTERMINAL__BAY_NAME:
				setBayName(BAY_NAME_EDEFAULT);
				return;
			case SclPackage.TTERMINAL__CNODE_NAME:
				setCNodeName(CNODE_NAME_EDEFAULT);
				return;
			case SclPackage.TTERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode(CONNECTIVITY_NODE_EDEFAULT);
				return;
			case SclPackage.TTERMINAL__NAME:
				unsetName();
				return;
			case SclPackage.TTERMINAL__SUBSTATION_NAME:
				setSubstationName(SUBSTATION_NAME_EDEFAULT);
				return;
			case SclPackage.TTERMINAL__VOLTAGE_LEVEL_NAME:
				setVoltageLevelName(VOLTAGE_LEVEL_NAME_EDEFAULT);
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
			case SclPackage.TTERMINAL__BAY_NAME:
				return BAY_NAME_EDEFAULT == null ? bayName != null : !BAY_NAME_EDEFAULT.equals(bayName);
			case SclPackage.TTERMINAL__CNODE_NAME:
				return CNODE_NAME_EDEFAULT == null ? cNodeName != null : !CNODE_NAME_EDEFAULT.equals(cNodeName);
			case SclPackage.TTERMINAL__CONNECTIVITY_NODE:
				return CONNECTIVITY_NODE_EDEFAULT == null ? connectivityNode != null : !CONNECTIVITY_NODE_EDEFAULT.equals(connectivityNode);
			case SclPackage.TTERMINAL__NAME:
				return isSetName();
			case SclPackage.TTERMINAL__SUBSTATION_NAME:
				return SUBSTATION_NAME_EDEFAULT == null ? substationName != null : !SUBSTATION_NAME_EDEFAULT.equals(substationName);
			case SclPackage.TTERMINAL__VOLTAGE_LEVEL_NAME:
				return VOLTAGE_LEVEL_NAME_EDEFAULT == null ? voltageLevelName != null : !VOLTAGE_LEVEL_NAME_EDEFAULT.equals(voltageLevelName);
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
		result.append(" (bayName: ");
		result.append(bayName);
		result.append(", cNodeName: ");
		result.append(cNodeName);
		result.append(", connectivityNode: ");
		result.append(connectivityNode);
		result.append(", name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", substationName: ");
		result.append(substationName);
		result.append(", voltageLevelName: ");
		result.append(voltageLevelName);
		result.append(')');
		return result.toString();
	}

} //TTerminalImpl
