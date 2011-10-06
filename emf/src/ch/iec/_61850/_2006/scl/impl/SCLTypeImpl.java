/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SCLType;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TCommunication;
import ch.iec._61850._2006.scl.TDataTypeTemplates;
import ch.iec._61850._2006.scl.THeader;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TSubstation;

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
 * An implementation of the model object '<em><b>SCL Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SCLTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SCLTypeImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SCLTypeImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SCLTypeImpl#getIED <em>IED</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SCLTypeImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCLTypeImpl extends TBaseElementImpl implements SCLType {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected THeader header;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected EList<TSubstation> substation;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected TCommunication communication;

	/**
	 * The cached value of the '{@link #getIED() <em>IED</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIED()
	 * @generated
	 * @ordered
	 */
	protected EList<TIED> iED;

	/**
	 * The cached value of the '{@link #getDataTypeTemplates() <em>Data Type Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeTemplates()
	 * @generated
	 * @ordered
	 */
	protected TDataTypeTemplates dataTypeTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSCLType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THeader getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(THeader newHeader, NotificationChain msgs) {
		THeader oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SCL_TYPE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(THeader newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL_TYPE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSubstation> getSubstation() {
		if (substation == null) {
			substation = new EObjectContainmentEList<TSubstation>(TSubstation.class, this, SclPackage.SCL_TYPE__SUBSTATION);
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCommunication getCommunication() {
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunication(TCommunication newCommunication, NotificationChain msgs) {
		TCommunication oldCommunication = communication;
		communication = newCommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SCL_TYPE__COMMUNICATION, oldCommunication, newCommunication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication(TCommunication newCommunication) {
		if (newCommunication != communication) {
			NotificationChain msgs = null;
			if (communication != null)
				msgs = ((InternalEObject)communication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_TYPE__COMMUNICATION, null, msgs);
			if (newCommunication != null)
				msgs = ((InternalEObject)newCommunication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_TYPE__COMMUNICATION, null, msgs);
			msgs = basicSetCommunication(newCommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL_TYPE__COMMUNICATION, newCommunication, newCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TIED> getIED() {
		if (iED == null) {
			iED = new EObjectContainmentEList<TIED>(TIED.class, this, SclPackage.SCL_TYPE__IED);
		}
		return iED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataTypeTemplates getDataTypeTemplates() {
		return dataTypeTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeTemplates(TDataTypeTemplates newDataTypeTemplates, NotificationChain msgs) {
		TDataTypeTemplates oldDataTypeTemplates = dataTypeTemplates;
		dataTypeTemplates = newDataTypeTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES, oldDataTypeTemplates, newDataTypeTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeTemplates(TDataTypeTemplates newDataTypeTemplates) {
		if (newDataTypeTemplates != dataTypeTemplates) {
			NotificationChain msgs = null;
			if (dataTypeTemplates != null)
				msgs = ((InternalEObject)dataTypeTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES, null, msgs);
			if (newDataTypeTemplates != null)
				msgs = ((InternalEObject)newDataTypeTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES, null, msgs);
			msgs = basicSetDataTypeTemplates(newDataTypeTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES, newDataTypeTemplates, newDataTypeTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.SCL_TYPE__HEADER:
				return basicSetHeader(null, msgs);
			case SclPackage.SCL_TYPE__SUBSTATION:
				return ((InternalEList<?>)getSubstation()).basicRemove(otherEnd, msgs);
			case SclPackage.SCL_TYPE__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case SclPackage.SCL_TYPE__IED:
				return ((InternalEList<?>)getIED()).basicRemove(otherEnd, msgs);
			case SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES:
				return basicSetDataTypeTemplates(null, msgs);
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
			case SclPackage.SCL_TYPE__HEADER:
				return getHeader();
			case SclPackage.SCL_TYPE__SUBSTATION:
				return getSubstation();
			case SclPackage.SCL_TYPE__COMMUNICATION:
				return getCommunication();
			case SclPackage.SCL_TYPE__IED:
				return getIED();
			case SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates();
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
			case SclPackage.SCL_TYPE__HEADER:
				setHeader((THeader)newValue);
				return;
			case SclPackage.SCL_TYPE__SUBSTATION:
				getSubstation().clear();
				getSubstation().addAll((Collection<? extends TSubstation>)newValue);
				return;
			case SclPackage.SCL_TYPE__COMMUNICATION:
				setCommunication((TCommunication)newValue);
				return;
			case SclPackage.SCL_TYPE__IED:
				getIED().clear();
				getIED().addAll((Collection<? extends TIED>)newValue);
				return;
			case SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((TDataTypeTemplates)newValue);
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
			case SclPackage.SCL_TYPE__HEADER:
				setHeader((THeader)null);
				return;
			case SclPackage.SCL_TYPE__SUBSTATION:
				getSubstation().clear();
				return;
			case SclPackage.SCL_TYPE__COMMUNICATION:
				setCommunication((TCommunication)null);
				return;
			case SclPackage.SCL_TYPE__IED:
				getIED().clear();
				return;
			case SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((TDataTypeTemplates)null);
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
			case SclPackage.SCL_TYPE__HEADER:
				return header != null;
			case SclPackage.SCL_TYPE__SUBSTATION:
				return substation != null && !substation.isEmpty();
			case SclPackage.SCL_TYPE__COMMUNICATION:
				return communication != null;
			case SclPackage.SCL_TYPE__IED:
				return iED != null && !iED.isEmpty();
			case SclPackage.SCL_TYPE__DATA_TYPE_TEMPLATES:
				return dataTypeTemplates != null;
		}
		return super.eIsSet(featureID);
	}

} //SCLTypeImpl
