/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.DocumentRoot;
import ch.iec._61850._2006.scl.LN0Type;
import ch.iec._61850._2006.scl.SCLType;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TCommunication;
import ch.iec._61850._2006.scl.TDataTypeTemplates;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TSubstation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getIED <em>IED</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getLN <em>LN</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getLN0 <em>LN0</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getSCL <em>SCL</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl#getSubstation <em>Substation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SclPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SclPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SclPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCommunication getCommunication() {
		return (TCommunication)getMixed().get(SclPackage.eINSTANCE.getDocumentRoot_Communication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunication(TCommunication newCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SclPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication(TCommunication newCommunication) {
		((FeatureMap.Internal)getMixed()).set(SclPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataTypeTemplates getDataTypeTemplates() {
		return (TDataTypeTemplates)getMixed().get(SclPackage.eINSTANCE.getDocumentRoot_DataTypeTemplates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeTemplates(TDataTypeTemplates newDataTypeTemplates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SclPackage.eINSTANCE.getDocumentRoot_DataTypeTemplates(), newDataTypeTemplates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeTemplates(TDataTypeTemplates newDataTypeTemplates) {
		((FeatureMap.Internal)getMixed()).set(SclPackage.eINSTANCE.getDocumentRoot_DataTypeTemplates(), newDataTypeTemplates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIED getIED() {
		return (TIED)getMixed().get(SclPackage.eINSTANCE.getDocumentRoot_IED(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIED(TIED newIED, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SclPackage.eINSTANCE.getDocumentRoot_IED(), newIED, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIED(TIED newIED) {
		((FeatureMap.Internal)getMixed()).set(SclPackage.eINSTANCE.getDocumentRoot_IED(), newIED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLN getLN() {
		return (TLN)getMixed().get(SclPackage.eINSTANCE.getDocumentRoot_LN(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLN(TLN newLN, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SclPackage.eINSTANCE.getDocumentRoot_LN(), newLN, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLN(TLN newLN) {
		((FeatureMap.Internal)getMixed()).set(SclPackage.eINSTANCE.getDocumentRoot_LN(), newLN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LN0Type getLN0() {
		return (LN0Type)getMixed().get(SclPackage.eINSTANCE.getDocumentRoot_LN0(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLN0(LN0Type newLN0, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SclPackage.eINSTANCE.getDocumentRoot_LN0(), newLN0, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLN0(LN0Type newLN0) {
		((FeatureMap.Internal)getMixed()).set(SclPackage.eINSTANCE.getDocumentRoot_LN0(), newLN0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCLType getSCL() {
		return (SCLType)getMixed().get(SclPackage.eINSTANCE.getDocumentRoot_SCL(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCL(SCLType newSCL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SclPackage.eINSTANCE.getDocumentRoot_SCL(), newSCL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCL(SCLType newSCL) {
		((FeatureMap.Internal)getMixed()).set(SclPackage.eINSTANCE.getDocumentRoot_SCL(), newSCL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSubstation getSubstation() {
		return (TSubstation)getMixed().get(SclPackage.eINSTANCE.getDocumentRoot_Substation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstation(TSubstation newSubstation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SclPackage.eINSTANCE.getDocumentRoot_Substation(), newSubstation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstation(TSubstation newSubstation) {
		((FeatureMap.Internal)getMixed()).set(SclPackage.eINSTANCE.getDocumentRoot_Substation(), newSubstation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SclPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SclPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SclPackage.DOCUMENT_ROOT__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case SclPackage.DOCUMENT_ROOT__DATA_TYPE_TEMPLATES:
				return basicSetDataTypeTemplates(null, msgs);
			case SclPackage.DOCUMENT_ROOT__IED:
				return basicSetIED(null, msgs);
			case SclPackage.DOCUMENT_ROOT__LN:
				return basicSetLN(null, msgs);
			case SclPackage.DOCUMENT_ROOT__LN0:
				return basicSetLN0(null, msgs);
			case SclPackage.DOCUMENT_ROOT__SCL:
				return basicSetSCL(null, msgs);
			case SclPackage.DOCUMENT_ROOT__SUBSTATION:
				return basicSetSubstation(null, msgs);
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
			case SclPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SclPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SclPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SclPackage.DOCUMENT_ROOT__COMMUNICATION:
				return getCommunication();
			case SclPackage.DOCUMENT_ROOT__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates();
			case SclPackage.DOCUMENT_ROOT__IED:
				return getIED();
			case SclPackage.DOCUMENT_ROOT__LN:
				return getLN();
			case SclPackage.DOCUMENT_ROOT__LN0:
				return getLN0();
			case SclPackage.DOCUMENT_ROOT__SCL:
				return getSCL();
			case SclPackage.DOCUMENT_ROOT__SUBSTATION:
				return getSubstation();
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
			case SclPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__COMMUNICATION:
				setCommunication((TCommunication)newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((TDataTypeTemplates)newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__IED:
				setIED((TIED)newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__LN:
				setLN((TLN)newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__LN0:
				setLN0((LN0Type)newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__SCL:
				setSCL((SCLType)newValue);
				return;
			case SclPackage.DOCUMENT_ROOT__SUBSTATION:
				setSubstation((TSubstation)newValue);
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
			case SclPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SclPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SclPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SclPackage.DOCUMENT_ROOT__COMMUNICATION:
				setCommunication((TCommunication)null);
				return;
			case SclPackage.DOCUMENT_ROOT__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((TDataTypeTemplates)null);
				return;
			case SclPackage.DOCUMENT_ROOT__IED:
				setIED((TIED)null);
				return;
			case SclPackage.DOCUMENT_ROOT__LN:
				setLN((TLN)null);
				return;
			case SclPackage.DOCUMENT_ROOT__LN0:
				setLN0((LN0Type)null);
				return;
			case SclPackage.DOCUMENT_ROOT__SCL:
				setSCL((SCLType)null);
				return;
			case SclPackage.DOCUMENT_ROOT__SUBSTATION:
				setSubstation((TSubstation)null);
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
			case SclPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SclPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SclPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SclPackage.DOCUMENT_ROOT__COMMUNICATION:
				return getCommunication() != null;
			case SclPackage.DOCUMENT_ROOT__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates() != null;
			case SclPackage.DOCUMENT_ROOT__IED:
				return getIED() != null;
			case SclPackage.DOCUMENT_ROOT__LN:
				return getLN() != null;
			case SclPackage.DOCUMENT_ROOT__LN0:
				return getLN0() != null;
			case SclPackage.DOCUMENT_ROOT__SCL:
				return getSCL() != null;
			case SclPackage.DOCUMENT_ROOT__SUBSTATION:
				return getSubstation() != null;
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
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
