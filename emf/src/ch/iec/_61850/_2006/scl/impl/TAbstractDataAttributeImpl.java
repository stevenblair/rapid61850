/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAbstractDataAttribute;
import ch.iec._61850._2006.scl.TVal;
import ch.iec._61850._2006.scl.TValKindEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAbstract Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getVal <em>Val</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getBType <em>BType</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getPrintedType <em>Printed Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl#getCoderType <em>Coder Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TAbstractDataAttributeImpl extends TUnNamingImpl implements TAbstractDataAttribute {
	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected EList<TVal> val;

	/**
	 * The default value of the '{@link #getBType() <em>BType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBType()
	 * @generated
	 * @ordered
	 */
	protected static final Object BTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBType() <em>BType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBType()
	 * @generated
	 * @ordered
	 */
	protected Object bType = BTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected long count = COUNT_EDEFAULT;

	/**
	 * This is true if the Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String SADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAddr()
	 * @generated
	 * @ordered
	 */
	protected String sAddr = SADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValKind()
	 * @generated
	 * @ordered
	 */
	protected static final TValKindEnum VAL_KIND_EDEFAULT = TValKindEnum.SET;

	/**
	 * The cached value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValKind()
	 * @generated
	 * @ordered
	 */
	protected TValKindEnum valKind = VAL_KIND_EDEFAULT;

	/**
	 * This is true if the Val Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valKindESet;

	/**
	 * The default value of the '{@link #getPrintedType() <em>Printed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintedType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINTED_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPrintedType() <em>Printed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintedType()
	 * @generated
	 * @ordered
	 */
	protected String printedType = PRINTED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoderType() <em>Coder Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoderType()
	 * @generated
	 * @ordered
	 */
	protected static final String CODER_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCoderType() <em>Coder Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoderType()
	 * @generated
	 * @ordered
	 */
	protected String coderType = CODER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAbstractDataAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTAbstractDataAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TVal> getVal() {
		if (val == null) {
			val = new EObjectContainmentEList<TVal>(TVal.class, this, SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL);
		}
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBType() {
		return bType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBType(Object newBType) {
		Object oldBType = bType;
		bType = newBType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__BTYPE, oldBType, bType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(long newCount) {
		long oldCount = count;
		count = newCount;
		boolean oldCountESet = countESet;
		countESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__COUNT, oldCount, count, !oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCount() {
		long oldCount = count;
		boolean oldCountESet = countESet;
		count = COUNT_EDEFAULT;
		countESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCount() {
		return countESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSAddr() {
		return sAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAddr(String newSAddr) {
		String oldSAddr = sAddr;
		sAddr = newSAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__SADDR, oldSAddr, sAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValKindEnum getValKind() {
		return valKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValKind(TValKindEnum newValKind) {
		TValKindEnum oldValKind = valKind;
		valKind = newValKind == null ? VAL_KIND_EDEFAULT : newValKind;
		boolean oldValKindESet = valKindESet;
		valKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL_KIND, oldValKind, valKind, !oldValKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValKind() {
		TValKindEnum oldValKind = valKind;
		boolean oldValKindESet = valKindESet;
		valKind = VAL_KIND_EDEFAULT;
		valKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL_KIND, oldValKind, VAL_KIND_EDEFAULT, oldValKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValKind() {
		return valKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrintedType() {
		return printedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintedType(String newPrintedType) {
		String oldPrintedType = printedType;
		printedType = newPrintedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE, oldPrintedType, printedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoderType() {
		return coderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoderType(String newCoderType) {
		String oldCoderType = coderType;
		coderType = newCoderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE, oldCoderType, coderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL:
				return ((InternalEList<?>)getVal()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL:
				return getVal();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__BTYPE:
				return getBType();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__COUNT:
				return getCount();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__NAME:
				return getName();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__SADDR:
				return getSAddr();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__TYPE:
				return getType();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				return getValKind();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE:
				return getPrintedType();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE:
				return getCoderType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL:
				getVal().clear();
				getVal().addAll((Collection<? extends TVal>)newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__BTYPE:
				setBType(newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__COUNT:
				setCount((Long)newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__NAME:
				setName(newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__SADDR:
				setSAddr((String)newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				setValKind((TValKindEnum)newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE:
				setPrintedType((String)newValue);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE:
				setCoderType((String)newValue);
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
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL:
				getVal().clear();
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__BTYPE:
				setBType(BTYPE_EDEFAULT);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__COUNT:
				unsetCount();
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__SADDR:
				setSAddr(SADDR_EDEFAULT);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				unsetValKind();
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE:
				setPrintedType(PRINTED_TYPE_EDEFAULT);
				return;
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE:
				setCoderType(CODER_TYPE_EDEFAULT);
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
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL:
				return val != null && !val.isEmpty();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__BTYPE:
				return BTYPE_EDEFAULT == null ? bType != null : !BTYPE_EDEFAULT.equals(bType);
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__COUNT:
				return isSetCount();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__SADDR:
				return SADDR_EDEFAULT == null ? sAddr != null : !SADDR_EDEFAULT.equals(sAddr);
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				return isSetValKind();
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE:
				return PRINTED_TYPE_EDEFAULT == null ? printedType != null : !PRINTED_TYPE_EDEFAULT.equals(printedType);
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE:
				return CODER_TYPE_EDEFAULT == null ? coderType != null : !CODER_TYPE_EDEFAULT.equals(coderType);
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
		result.append(" (bType: ");
		result.append(bType);
		result.append(", count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", sAddr: ");
		result.append(sAddr);
		result.append(", type: ");
		result.append(type);
		result.append(", valKind: ");
		if (valKindESet) result.append(valKind); else result.append("<unset>");
		result.append(", printedType: ");
		result.append(printedType);
		result.append(", coderType: ");
		result.append(coderType);
		result.append(')');
		return result.toString();
	}

} //TAbstractDataAttributeImpl
