/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lmaintenance.impl;

import ch.iec._61850._2006.sc.lmaintenance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LmaintenanceFactoryImpl extends EFactoryImpl implements LmaintenanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LmaintenanceFactory init() {
		try {
			LmaintenanceFactory theLmaintenanceFactory = (LmaintenanceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.iec.ch/61850/2006/SCLmaintenance"); 
			if (theLmaintenanceFactory != null) {
				return theLmaintenanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LmaintenanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LmaintenanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LmaintenancePackage.COND_DESC_TYPE: return createCondDescType();
			case LmaintenancePackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LmaintenancePackage.TMOP_ENUM:
				return createTMopEnumFromString(eDataType, initialValue);
			case LmaintenancePackage.TEXTENSION_MOP_ENUM:
				return createTExtensionMopEnumFromString(eDataType, initialValue);
			case LmaintenancePackage.TMOP:
				return createTMOPFromString(eDataType, initialValue);
			case LmaintenancePackage.TMOP_ENUM_OBJECT:
				return createTMopEnumObjectFromString(eDataType, initialValue);
			case LmaintenancePackage.TRESTR_NAME1ST_L:
				return createTRestrName1stLFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LmaintenancePackage.TMOP_ENUM:
				return convertTMopEnumToString(eDataType, instanceValue);
			case LmaintenancePackage.TEXTENSION_MOP_ENUM:
				return convertTExtensionMopEnumToString(eDataType, instanceValue);
			case LmaintenancePackage.TMOP:
				return convertTMOPToString(eDataType, instanceValue);
			case LmaintenancePackage.TMOP_ENUM_OBJECT:
				return convertTMopEnumObjectToString(eDataType, instanceValue);
			case LmaintenancePackage.TRESTR_NAME1ST_L:
				return convertTRestrName1stLToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CondDescType createCondDescType() {
		CondDescTypeImpl condDescType = new CondDescTypeImpl();
		return condDescType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMopEnum createTMopEnumFromString(EDataType eDataType, String initialValue) {
		TMopEnum result = TMopEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMopEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionMopEnumFromString(EDataType eDataType, String initialValue) {
		return createTRestrName1stLFromString(LmaintenancePackage.Literals.TRESTR_NAME1ST_L, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionMopEnumToString(EDataType eDataType, Object instanceValue) {
		return convertTRestrName1stLToString(LmaintenancePackage.Literals.TRESTR_NAME1ST_L, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTMOPFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTMopEnumFromString(LmaintenancePackage.Literals.TMOP_ENUM, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionMopEnumFromString(LmaintenancePackage.Literals.TEXTENSION_MOP_ENUM, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMOPToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (LmaintenancePackage.Literals.TMOP_ENUM.isInstance(instanceValue)) {
			try {
				String value = convertTMopEnumToString(LmaintenancePackage.Literals.TMOP_ENUM, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (LmaintenancePackage.Literals.TEXTENSION_MOP_ENUM.isInstance(instanceValue)) {
			try {
				String value = convertTExtensionMopEnumToString(LmaintenancePackage.Literals.TEXTENSION_MOP_ENUM, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMopEnum createTMopEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTMopEnumFromString(LmaintenancePackage.Literals.TMOP_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMopEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTMopEnumToString(LmaintenancePackage.Literals.TMOP_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTRestrName1stLFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRestrName1stLToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LmaintenancePackage getLmaintenancePackage() {
		return (LmaintenancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LmaintenancePackage getPackage() {
		return LmaintenancePackage.eINSTANCE;
	}

} //LmaintenanceFactoryImpl
