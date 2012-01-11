/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDA Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDATypeImpl#getBDA <em>BDA</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDATypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDATypeImpl#getExtRef <em>Ext Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDATypeImpl#getFcda <em>Fcda</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDATypeImpl extends TIDNamingImpl implements TDAType {
	/**
	 * The cached value of the '{@link #getBDA() <em>BDA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBDA()
	 * @generated
	 * @ordered
	 */
	protected EList<TBDA> bDA;

	/**
	 * The default value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
	protected static final String IED_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
	protected String iedType = IED_TYPE_EDEFAULT;

	/**
	 * This is true if the Ied Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iedTypeESet;

	/**
	 * The cached value of the '{@link #getExtRef() <em>Ext Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtRef()
	 * @generated
	 * @ordered
	 */
	protected EList<TExtRef> extRef;

	/**
	 * The cached value of the '{@link #getFcda() <em>Fcda</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFcda()
	 * @generated
	 * @ordered
	 */
	protected EList<TFCDA> fcda;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDATypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTDAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TBDA> getBDA() {
		if (bDA == null) {
			bDA = new EObjectContainmentEList<TBDA>(TBDA.class, this, SclPackage.TDA_TYPE__BDA);
		}
		return bDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIedType() {
		return iedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIedType(String newIedType) {
		String oldIedType = iedType;
		iedType = newIedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDA_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIedType() {
		String oldIedType = iedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedType = IED_TYPE_EDEFAULT;
		iedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDA_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIedType() {
		return iedTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TExtRef> getExtRef() {
		if (extRef == null) {
			extRef = new EObjectWithInverseResolvingEList<TExtRef>(TExtRef.class, this, SclPackage.TDA_TYPE__EXT_REF, SclPackage.TEXT_REF__DA_TYPE);
		}
		return extRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFCDA> getFcda() {
		if (fcda == null) {
			fcda = new EObjectWithInverseResolvingEList<TFCDA>(TFCDA.class, this, SclPackage.TDA_TYPE__FCDA, SclPackage.TFCDA__DA_TYPE);
		}
		return fcda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDA_TYPE__EXT_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtRef()).basicAdd(otherEnd, msgs);
			case SclPackage.TDA_TYPE__FCDA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFcda()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDA_TYPE__BDA:
				return ((InternalEList<?>)getBDA()).basicRemove(otherEnd, msgs);
			case SclPackage.TDA_TYPE__EXT_REF:
				return ((InternalEList<?>)getExtRef()).basicRemove(otherEnd, msgs);
			case SclPackage.TDA_TYPE__FCDA:
				return ((InternalEList<?>)getFcda()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TDA_TYPE__BDA:
				return getBDA();
			case SclPackage.TDA_TYPE__IED_TYPE:
				return getIedType();
			case SclPackage.TDA_TYPE__EXT_REF:
				return getExtRef();
			case SclPackage.TDA_TYPE__FCDA:
				return getFcda();
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
			case SclPackage.TDA_TYPE__BDA:
				getBDA().clear();
				getBDA().addAll((Collection<? extends TBDA>)newValue);
				return;
			case SclPackage.TDA_TYPE__IED_TYPE:
				setIedType((String)newValue);
				return;
			case SclPackage.TDA_TYPE__EXT_REF:
				getExtRef().clear();
				getExtRef().addAll((Collection<? extends TExtRef>)newValue);
				return;
			case SclPackage.TDA_TYPE__FCDA:
				getFcda().clear();
				getFcda().addAll((Collection<? extends TFCDA>)newValue);
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
			case SclPackage.TDA_TYPE__BDA:
				getBDA().clear();
				return;
			case SclPackage.TDA_TYPE__IED_TYPE:
				unsetIedType();
				return;
			case SclPackage.TDA_TYPE__EXT_REF:
				getExtRef().clear();
				return;
			case SclPackage.TDA_TYPE__FCDA:
				getFcda().clear();
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
			case SclPackage.TDA_TYPE__BDA:
				return bDA != null && !bDA.isEmpty();
			case SclPackage.TDA_TYPE__IED_TYPE:
				return isSetIedType();
			case SclPackage.TDA_TYPE__EXT_REF:
				return extRef != null && !extRef.isEmpty();
			case SclPackage.TDA_TYPE__FCDA:
				return fcda != null && !fcda.isEmpty();
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
		result.append(" (iedType: ");
		if (iedTypeESet) result.append(iedType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDATypeImpl
