/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TPredefined CDC Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTPredefinedCDCEnum()
 * @model extendedMetaData="name='tPredefinedCDCEnum'"
 * @generated
 */
public enum TPredefinedCDCEnum implements Enumerator {
	/**
	 * The '<em><b>SPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPS_VALUE
	 * @generated
	 * @ordered
	 */
	SPS(0, "SPS", "SPS"),

	/**
	 * The '<em><b>DPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPS_VALUE
	 * @generated
	 * @ordered
	 */
	DPS(1, "DPS", "DPS"),

	/**
	 * The '<em><b>INS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INS_VALUE
	 * @generated
	 * @ordered
	 */
	INS(2, "INS", "INS"),

	/**
	 * The '<em><b>ACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACT_VALUE
	 * @generated
	 * @ordered
	 */
	ACT(3, "ACT", "ACT"),

	/**
	 * The '<em><b>ACD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACD_VALUE
	 * @generated
	 * @ordered
	 */
	ACD(4, "ACD", "ACD"),

	/**
	 * The '<em><b>SEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC_VALUE
	 * @generated
	 * @ordered
	 */
	SEC(5, "SEC", "SEC"),

	/**
	 * The '<em><b>BCR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCR_VALUE
	 * @generated
	 * @ordered
	 */
	BCR(6, "BCR", "BCR"),

	/**
	 * The '<em><b>MV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MV_VALUE
	 * @generated
	 * @ordered
	 */
	MV(7, "MV", "MV"),

	/**
	 * The '<em><b>CMV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMV_VALUE
	 * @generated
	 * @ordered
	 */
	CMV(8, "CMV", "CMV"),

	/**
	 * The '<em><b>SAV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAV_VALUE
	 * @generated
	 * @ordered
	 */
	SAV(9, "SAV", "SAV"),

	/**
	 * The '<em><b>WYE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WYE_VALUE
	 * @generated
	 * @ordered
	 */
	WYE(10, "WYE", "WYE"),

	/**
	 * The '<em><b>DEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEL_VALUE
	 * @generated
	 * @ordered
	 */
	DEL(11, "DEL", "DEL"),

	/**
	 * The '<em><b>SEQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQ_VALUE
	 * @generated
	 * @ordered
	 */
	SEQ(12, "SEQ", "SEQ"),

	/**
	 * The '<em><b>HMV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HMV_VALUE
	 * @generated
	 * @ordered
	 */
	HMV(13, "HMV", "HMV"),

	/**
	 * The '<em><b>HWYE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HWYE_VALUE
	 * @generated
	 * @ordered
	 */
	HWYE(14, "HWYE", "HWYE"),

	/**
	 * The '<em><b>HDEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDEL_VALUE
	 * @generated
	 * @ordered
	 */
	HDEL(15, "HDEL", "HDEL"),

	/**
	 * The '<em><b>SPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPC_VALUE
	 * @generated
	 * @ordered
	 */
	SPC(16, "SPC", "SPC"),

	/**
	 * The '<em><b>DPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPC_VALUE
	 * @generated
	 * @ordered
	 */
	DPC(17, "DPC", "DPC"),

	/**
	 * The '<em><b>INC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INC_VALUE
	 * @generated
	 * @ordered
	 */
	INC(18, "INC", "INC"),

	/**
	 * The '<em><b>BSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BSC_VALUE
	 * @generated
	 * @ordered
	 */
	BSC(19, "BSC", "BSC"),

	/**
	 * The '<em><b>ISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISC_VALUE
	 * @generated
	 * @ordered
	 */
	ISC(20, "ISC", "ISC"),

	/**
	 * The '<em><b>APC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APC_VALUE
	 * @generated
	 * @ordered
	 */
	APC(21, "APC", "APC"),

	/**
	 * The '<em><b>SPG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPG_VALUE
	 * @generated
	 * @ordered
	 */
	SPG(22, "SPG", "SPG"),

	/**
	 * The '<em><b>ING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ING_VALUE
	 * @generated
	 * @ordered
	 */
	ING(23, "ING", "ING"),

	/**
	 * The '<em><b>ASG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASG_VALUE
	 * @generated
	 * @ordered
	 */
	ASG(24, "ASG", "ASG"),

	/**
	 * The '<em><b>CURVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE_VALUE
	 * @generated
	 * @ordered
	 */
	CURVE(25, "CURVE", "CURVE"),

	/**
	 * The '<em><b>DPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPL_VALUE
	 * @generated
	 * @ordered
	 */
	DPL(26, "DPL", "DPL"),

	/**
	 * The '<em><b>LPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LPL_VALUE
	 * @generated
	 * @ordered
	 */
	LPL(27, "LPL", "LPL"),

	/**
	 * The '<em><b>CSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSD_VALUE
	 * @generated
	 * @ordered
	 */
	CSD(28, "CSD", "CSD");

	/**
	 * The '<em><b>SPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPS_VALUE = 0;

	/**
	 * The '<em><b>DPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DPS_VALUE = 1;

	/**
	 * The '<em><b>INS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INS_VALUE = 2;

	/**
	 * The '<em><b>ACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACT_VALUE = 3;

	/**
	 * The '<em><b>ACD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACD_VALUE = 4;

	/**
	 * The '<em><b>SEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_VALUE = 5;

	/**
	 * The '<em><b>BCR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BCR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BCR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BCR_VALUE = 6;

	/**
	 * The '<em><b>MV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MV_VALUE = 7;

	/**
	 * The '<em><b>CMV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CMV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMV_VALUE = 8;

	/**
	 * The '<em><b>SAV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAV_VALUE = 9;

	/**
	 * The '<em><b>WYE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WYE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WYE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WYE_VALUE = 10;

	/**
	 * The '<em><b>DEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEL_VALUE = 11;

	/**
	 * The '<em><b>SEQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQ_VALUE = 12;

	/**
	 * The '<em><b>HMV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HMV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HMV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HMV_VALUE = 13;

	/**
	 * The '<em><b>HWYE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HWYE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HWYE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HWYE_VALUE = 14;

	/**
	 * The '<em><b>HDEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HDEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HDEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HDEL_VALUE = 15;

	/**
	 * The '<em><b>SPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPC_VALUE = 16;

	/**
	 * The '<em><b>DPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DPC_VALUE = 17;

	/**
	 * The '<em><b>INC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INC_VALUE = 18;

	/**
	 * The '<em><b>BSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BSC_VALUE = 19;

	/**
	 * The '<em><b>ISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISC_VALUE = 20;

	/**
	 * The '<em><b>APC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APC_VALUE = 21;

	/**
	 * The '<em><b>SPG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPG_VALUE = 22;

	/**
	 * The '<em><b>ING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ING_VALUE = 23;

	/**
	 * The '<em><b>ASG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASG_VALUE = 24;

	/**
	 * The '<em><b>CURVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_VALUE = 25;

	/**
	 * The '<em><b>DPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DPL_VALUE = 26;

	/**
	 * The '<em><b>LPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LPL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LPL_VALUE = 27;

	/**
	 * The '<em><b>CSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSD_VALUE = 28;

	/**
	 * An array of all the '<em><b>TPredefined CDC Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TPredefinedCDCEnum[] VALUES_ARRAY =
		new TPredefinedCDCEnum[] {
			SPS,
			DPS,
			INS,
			ACT,
			ACD,
			SEC,
			BCR,
			MV,
			CMV,
			SAV,
			WYE,
			DEL,
			SEQ,
			HMV,
			HWYE,
			HDEL,
			SPC,
			DPC,
			INC,
			BSC,
			ISC,
			APC,
			SPG,
			ING,
			ASG,
			CURVE,
			DPL,
			LPL,
			CSD,
		};

	/**
	 * A public read-only list of all the '<em><b>TPredefined CDC Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TPredefinedCDCEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TPredefined CDC Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedCDCEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedCDCEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined CDC Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedCDCEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedCDCEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined CDC Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedCDCEnum get(int value) {
		switch (value) {
			case SPS_VALUE: return SPS;
			case DPS_VALUE: return DPS;
			case INS_VALUE: return INS;
			case ACT_VALUE: return ACT;
			case ACD_VALUE: return ACD;
			case SEC_VALUE: return SEC;
			case BCR_VALUE: return BCR;
			case MV_VALUE: return MV;
			case CMV_VALUE: return CMV;
			case SAV_VALUE: return SAV;
			case WYE_VALUE: return WYE;
			case DEL_VALUE: return DEL;
			case SEQ_VALUE: return SEQ;
			case HMV_VALUE: return HMV;
			case HWYE_VALUE: return HWYE;
			case HDEL_VALUE: return HDEL;
			case SPC_VALUE: return SPC;
			case DPC_VALUE: return DPC;
			case INC_VALUE: return INC;
			case BSC_VALUE: return BSC;
			case ISC_VALUE: return ISC;
			case APC_VALUE: return APC;
			case SPG_VALUE: return SPG;
			case ING_VALUE: return ING;
			case ASG_VALUE: return ASG;
			case CURVE_VALUE: return CURVE;
			case DPL_VALUE: return DPL;
			case LPL_VALUE: return LPL;
			case CSD_VALUE: return CSD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TPredefinedCDCEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TPredefinedCDCEnum
