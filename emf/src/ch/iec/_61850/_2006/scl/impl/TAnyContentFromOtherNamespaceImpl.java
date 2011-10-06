/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAny Content From Other Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyContentFromOtherNamespaceImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyContentFromOtherNamespaceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyContentFromOtherNamespaceImpl#getAny <em>Any</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyContentFromOtherNamespaceImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TAnyContentFromOtherNamespaceImpl extends EObjectImpl implements TAnyContentFromOtherNamespace {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAnyContentFromOtherNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTAnyContentFromOtherNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SclPackage.eINSTANCE.getTAnyContentFromOtherNamespace_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SclPackage.eINSTANCE.getTAnyContentFromOtherNamespace_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED:
				getMixed().clear();
				return;
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP:
				getGroup().clear();
				return;
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY:
				getAny().clear();
				return;
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP:
				return !getGroup().isEmpty();
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY:
				return !getAny().isEmpty();
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TAnyContentFromOtherNamespaceImpl
