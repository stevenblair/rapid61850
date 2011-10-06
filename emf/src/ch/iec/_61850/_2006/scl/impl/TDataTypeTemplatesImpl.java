/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TDataTypeTemplates;
import ch.iec._61850._2006.scl.TEnumType;
import ch.iec._61850._2006.scl.TLNodeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TData Type Templates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataTypeTemplatesImpl#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataTypeTemplatesImpl#getDOType <em>DO Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataTypeTemplatesImpl#getDAType <em>DA Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataTypeTemplatesImpl#getEnumType <em>Enum Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDataTypeTemplatesImpl extends EObjectImpl implements TDataTypeTemplates {
	/**
	 * The cached value of the '{@link #getLNodeType() <em>LNode Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLNodeType()
	 * @generated
	 * @ordered
	 */
	protected EList<TLNodeType> lNodeType;

	/**
	 * The cached value of the '{@link #getDOType() <em>DO Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDOType()
	 * @generated
	 * @ordered
	 */
	protected EList<TDOType> dOType;

	/**
	 * The cached value of the '{@link #getDAType() <em>DA Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAType()
	 * @generated
	 * @ordered
	 */
	protected EList<TDAType> dAType;

	/**
	 * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumType()
	 * @generated
	 * @ordered
	 */
	protected EList<TEnumType> enumType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDataTypeTemplatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTDataTypeTemplates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TLNodeType> getLNodeType() {
		if (lNodeType == null) {
			lNodeType = new EObjectContainmentEList<TLNodeType>(TLNodeType.class, this, SclPackage.TDATA_TYPE_TEMPLATES__LNODE_TYPE);
		}
		return lNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDOType> getDOType() {
		if (dOType == null) {
			dOType = new EObjectContainmentEList<TDOType>(TDOType.class, this, SclPackage.TDATA_TYPE_TEMPLATES__DO_TYPE);
		}
		return dOType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDAType> getDAType() {
		if (dAType == null) {
			dAType = new EObjectContainmentEList<TDAType>(TDAType.class, this, SclPackage.TDATA_TYPE_TEMPLATES__DA_TYPE);
		}
		return dAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TEnumType> getEnumType() {
		if (enumType == null) {
			enumType = new EObjectContainmentEList<TEnumType>(TEnumType.class, this, SclPackage.TDATA_TYPE_TEMPLATES__ENUM_TYPE);
		}
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDATA_TYPE_TEMPLATES__LNODE_TYPE:
				return ((InternalEList<?>)getLNodeType()).basicRemove(otherEnd, msgs);
			case SclPackage.TDATA_TYPE_TEMPLATES__DO_TYPE:
				return ((InternalEList<?>)getDOType()).basicRemove(otherEnd, msgs);
			case SclPackage.TDATA_TYPE_TEMPLATES__DA_TYPE:
				return ((InternalEList<?>)getDAType()).basicRemove(otherEnd, msgs);
			case SclPackage.TDATA_TYPE_TEMPLATES__ENUM_TYPE:
				return ((InternalEList<?>)getEnumType()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TDATA_TYPE_TEMPLATES__LNODE_TYPE:
				return getLNodeType();
			case SclPackage.TDATA_TYPE_TEMPLATES__DO_TYPE:
				return getDOType();
			case SclPackage.TDATA_TYPE_TEMPLATES__DA_TYPE:
				return getDAType();
			case SclPackage.TDATA_TYPE_TEMPLATES__ENUM_TYPE:
				return getEnumType();
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
			case SclPackage.TDATA_TYPE_TEMPLATES__LNODE_TYPE:
				getLNodeType().clear();
				getLNodeType().addAll((Collection<? extends TLNodeType>)newValue);
				return;
			case SclPackage.TDATA_TYPE_TEMPLATES__DO_TYPE:
				getDOType().clear();
				getDOType().addAll((Collection<? extends TDOType>)newValue);
				return;
			case SclPackage.TDATA_TYPE_TEMPLATES__DA_TYPE:
				getDAType().clear();
				getDAType().addAll((Collection<? extends TDAType>)newValue);
				return;
			case SclPackage.TDATA_TYPE_TEMPLATES__ENUM_TYPE:
				getEnumType().clear();
				getEnumType().addAll((Collection<? extends TEnumType>)newValue);
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
			case SclPackage.TDATA_TYPE_TEMPLATES__LNODE_TYPE:
				getLNodeType().clear();
				return;
			case SclPackage.TDATA_TYPE_TEMPLATES__DO_TYPE:
				getDOType().clear();
				return;
			case SclPackage.TDATA_TYPE_TEMPLATES__DA_TYPE:
				getDAType().clear();
				return;
			case SclPackage.TDATA_TYPE_TEMPLATES__ENUM_TYPE:
				getEnumType().clear();
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
			case SclPackage.TDATA_TYPE_TEMPLATES__LNODE_TYPE:
				return lNodeType != null && !lNodeType.isEmpty();
			case SclPackage.TDATA_TYPE_TEMPLATES__DO_TYPE:
				return dOType != null && !dOType.isEmpty();
			case SclPackage.TDATA_TYPE_TEMPLATES__DA_TYPE:
				return dAType != null && !dAType.isEmpty();
			case SclPackage.TDATA_TYPE_TEMPLATES__ENUM_TYPE:
				return enumType != null && !enumType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TDataTypeTemplatesImpl
