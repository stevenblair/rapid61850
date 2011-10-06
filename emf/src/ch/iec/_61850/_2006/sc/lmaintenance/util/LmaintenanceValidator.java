/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lmaintenance.util;

import ch.iec._61850._2006.sc.lmaintenance.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage
 * @generated
 */
public class LmaintenanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LmaintenanceValidator INSTANCE = new LmaintenanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ch.iec._61850._2006.sc.lmaintenance";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LmaintenanceValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LmaintenancePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LmaintenancePackage.COND_DESC_TYPE:
				return validateCondDescType((CondDescType)value, diagnostics, context);
			case LmaintenancePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case LmaintenancePackage.TMOP_ENUM:
				return validateTMopEnum((TMopEnum)value, diagnostics, context);
			case LmaintenancePackage.TEXTENSION_MOP_ENUM:
				return validateTExtensionMopEnum((String)value, diagnostics, context);
			case LmaintenancePackage.TMOP:
				return validateTMOP(value, diagnostics, context);
			case LmaintenancePackage.TMOP_ENUM_OBJECT:
				return validateTMopEnumObject((TMopEnum)value, diagnostics, context);
			case LmaintenancePackage.TRESTR_NAME1ST_L:
				return validateTRestrName1stL((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondDescType(CondDescType condDescType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condDescType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMopEnum(TMopEnum tMopEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionMopEnum(String tExtensionMopEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRestrName1stL_Pattern(tExtensionMopEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMOP(Object tmop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTMOP_MemberTypes(tmop, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TMOP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMOP_MemberTypes(Object tmop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (LmaintenancePackage.Literals.TMOP_ENUM.isInstance(tmop)) {
				if (validateTMopEnum((TMopEnum)tmop, tempDiagnostics, context)) return true;
			}
			if (LmaintenancePackage.Literals.TEXTENSION_MOP_ENUM.isInstance(tmop)) {
				if (validateTExtensionMopEnum((String)tmop, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (LmaintenancePackage.Literals.TMOP_ENUM.isInstance(tmop)) {
				if (validateTMopEnum((TMopEnum)tmop, null, context)) return true;
			}
			if (LmaintenancePackage.Literals.TEXTENSION_MOP_ENUM.isInstance(tmop)) {
				if (validateTExtensionMopEnum((String)tmop, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMopEnumObject(TMopEnum tMopEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName1stL(String tRestrName1stL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRestrName1stL_Pattern(tRestrName1stL, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTRestrName1stL_Pattern
	 */
	public static final  PatternMatcher [][] TRESTR_NAME1ST_L__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{Ll}[\\d,\\p{L},_]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TRestr Name1st L</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName1stL_Pattern(String tRestrName1stL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(LmaintenancePackage.Literals.TRESTR_NAME1ST_L, tRestrName1stL, TRESTR_NAME1ST_L__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LmaintenanceValidator
