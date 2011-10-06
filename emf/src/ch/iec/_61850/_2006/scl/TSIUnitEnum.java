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
 * A representation of the literals of the enumeration '<em><b>TSI Unit Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTSIUnitEnum()
 * @model extendedMetaData="name='tSIUnitEnum'"
 * @generated
 */
public enum TSIUnitEnum implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(1, "m", "m"),

	/**
	 * The '<em><b>Kg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KG_VALUE
	 * @generated
	 * @ordered
	 */
	KG(2, "kg", "kg"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(3, "s", "s"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(4, "A", "A"),

	/**
	 * The '<em><b>K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #K_VALUE
	 * @generated
	 * @ordered
	 */
	K(5, "K", "K"),

	/**
	 * The '<em><b>Mol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOL_VALUE
	 * @generated
	 * @ordered
	 */
	MOL(6, "mol", "mol"),

	/**
	 * The '<em><b>Cd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(7, "cd", "cd"),

	/**
	 * The '<em><b>Deg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEG_VALUE
	 * @generated
	 * @ordered
	 */
	DEG(8, "deg", "deg"),

	/**
	 * The '<em><b>Rad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAD_VALUE
	 * @generated
	 * @ordered
	 */
	RAD(9, "rad", "rad"),

	/**
	 * The '<em><b>Sr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SR_VALUE
	 * @generated
	 * @ordered
	 */
	SR(10, "sr", "sr"),

	/**
	 * The '<em><b>Gy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GY_VALUE
	 * @generated
	 * @ordered
	 */
	GY(11, "Gy", "Gy"),

	/**
	 * The '<em><b>Q</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Q_VALUE
	 * @generated
	 * @ordered
	 */
	Q(12, "q", "q"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(13, "C", "\u00b0C"),

	/**
	 * The '<em><b>Sv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SV_VALUE
	 * @generated
	 * @ordered
	 */
	SV(14, "Sv", "Sv"),

	/**
	 * The '<em><b>F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F_VALUE
	 * @generated
	 * @ordered
	 */
	F(15, "F", "F"),

	/**
	 * The '<em><b>C1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C1_VALUE
	 * @generated
	 * @ordered
	 */
	C1(16, "C1", "C"),

	/**
	 * The '<em><b>S1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S1_VALUE
	 * @generated
	 * @ordered
	 */
	S1(17, "S1", "S"),

	/**
	 * The '<em><b>H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H_VALUE
	 * @generated
	 * @ordered
	 */
	H(18, "H", "H"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(19, "V", "V"),

	/**
	 * The '<em><b>Ohm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OHM_VALUE
	 * @generated
	 * @ordered
	 */
	OHM(20, "ohm", "ohm"),

	/**
	 * The '<em><b>J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #J_VALUE
	 * @generated
	 * @ordered
	 */
	J(21, "J", "J"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(22, "N", "N"),

	/**
	 * The '<em><b>Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HZ_VALUE
	 * @generated
	 * @ordered
	 */
	HZ(23, "Hz", "Hz"),

	/**
	 * The '<em><b>Lx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LX_VALUE
	 * @generated
	 * @ordered
	 */
	LX(24, "lx", "lx"),

	/**
	 * The '<em><b>Lm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LM_VALUE
	 * @generated
	 * @ordered
	 */
	LM(25, "Lm", "Lm"),

	/**
	 * The '<em><b>Wb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WB_VALUE
	 * @generated
	 * @ordered
	 */
	WB(26, "Wb", "Wb"),

	/**
	 * The '<em><b>T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T_VALUE
	 * @generated
	 * @ordered
	 */
	T(27, "T", "T"),

	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(28, "W", "W"),

	/**
	 * The '<em><b>Pa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PA_VALUE
	 * @generated
	 * @ordered
	 */
	PA(29, "Pa", "Pa"),

	/**
	 * The '<em><b>M2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M2_VALUE
	 * @generated
	 * @ordered
	 */
	M2(30, "m2", "m^2"),

	/**
	 * The '<em><b>M3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M3_VALUE
	 * @generated
	 * @ordered
	 */
	M3(31, "m3", "m^3"),

	/**
	 * The '<em><b>MS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_VALUE
	 * @generated
	 * @ordered
	 */
	MS(32, "mS", "m/s"),

	/**
	 * The '<em><b>MS2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS2_VALUE
	 * @generated
	 * @ordered
	 */
	MS2(33, "mS2", "m/s^2"),

	/**
	 * The '<em><b>M3S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M3_S_VALUE
	 * @generated
	 * @ordered
	 */
	M3_S(34, "m3S", "m^3/s"),

	/**
	 * The '<em><b>MM3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MM3_VALUE
	 * @generated
	 * @ordered
	 */
	MM3(35, "mM3", "m/m^3"),

	/**
	 * The '<em><b>M1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M1_VALUE
	 * @generated
	 * @ordered
	 */
	M1(36, "M1", "M"),

	/**
	 * The '<em><b>Kg M3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KG_M3_VALUE
	 * @generated
	 * @ordered
	 */
	KG_M3(37, "kgM3", "kg/m^3"),

	/**
	 * The '<em><b>M2S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M2_S_VALUE
	 * @generated
	 * @ordered
	 */
	M2_S(38, "m2S", "m^2/s"),

	/**
	 * The '<em><b>WMK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WMK_VALUE
	 * @generated
	 * @ordered
	 */
	WMK(39, "WMK", "W/m K"),

	/**
	 * The '<em><b>JK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JK_VALUE
	 * @generated
	 * @ordered
	 */
	JK(40, "JK", "J/K"),

	/**
	 * The '<em><b>Ppm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPM_VALUE
	 * @generated
	 * @ordered
	 */
	PPM(41, "ppm", "ppm"),

	/**
	 * The '<em><b>S11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S11_VALUE
	 * @generated
	 * @ordered
	 */
	S11(42, "s11", "s^-1"),

	/**
	 * The '<em><b>Rad S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAD_S_VALUE
	 * @generated
	 * @ordered
	 */
	RAD_S(43, "radS", "rad/s"),

	/**
	 * The '<em><b>VA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA_VALUE
	 * @generated
	 * @ordered
	 */
	VA(44, "VA", "VA"),

	/**
	 * The '<em><b>Watts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATTS_VALUE
	 * @generated
	 * @ordered
	 */
	WATTS(45, "Watts", "Watts"),

	/**
	 * The '<em><b>VAr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_VALUE
	 * @generated
	 * @ordered
	 */
	VAR(46, "VAr", "VAr"),

	/**
	 * The '<em><b>Phi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHI_VALUE
	 * @generated
	 * @ordered
	 */
	PHI(47, "phi", "phi"),

	/**
	 * The '<em><b>Cos Phi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS_PHI_VALUE
	 * @generated
	 * @ordered
	 */
	COS_PHI(48, "cosPhi", "cos_phi"),

	/**
	 * The '<em><b>Vs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VS_VALUE
	 * @generated
	 * @ordered
	 */
	VS(49, "Vs", "Vs"),

	/**
	 * The '<em><b>V2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V2_VALUE
	 * @generated
	 * @ordered
	 */
	V2(50, "V2", "V^2"),

	/**
	 * The '<em><b>As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_VALUE
	 * @generated
	 * @ordered
	 */
	AS(51, "As", "As"),

	/**
	 * The '<em><b>A2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A2_VALUE
	 * @generated
	 * @ordered
	 */
	A2(52, "A2", "A^2"),

	/**
	 * The '<em><b>A2S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A2S_VALUE
	 * @generated
	 * @ordered
	 */
	A2S(53, "A2S", "A^2 s"),

	/**
	 * The '<em><b>VAh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAH_VALUE
	 * @generated
	 * @ordered
	 */
	VAH(54, "VAh", "VAh"),

	/**
	 * The '<em><b>Wh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WH_VALUE
	 * @generated
	 * @ordered
	 */
	WH(55, "Wh", "Wh"),

	/**
	 * The '<em><b>VArh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARH_VALUE
	 * @generated
	 * @ordered
	 */
	VARH(56, "VArh", "VArh"),

	/**
	 * The '<em><b>VHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VHZ_VALUE
	 * @generated
	 * @ordered
	 */
	VHZ(57, "VHz", "V/Hz"),

	/**
	 * The '<em><b>BS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BS_VALUE
	 * @generated
	 * @ordered
	 */
	BS(58, "bS", "b/s");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M
	 * @model name="m"
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 1;

	/**
	 * The '<em><b>Kg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KG
	 * @model name="kg"
	 * @generated
	 * @ordered
	 */
	public static final int KG_VALUE = 2;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model name="s"
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 3;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 4;

	/**
	 * The '<em><b>K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>K</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #K
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int K_VALUE = 5;

	/**
	 * The '<em><b>Mol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOL
	 * @model name="mol"
	 * @generated
	 * @ordered
	 */
	public static final int MOL_VALUE = 6;

	/**
	 * The '<em><b>Cd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CD
	 * @model name="cd"
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 7;

	/**
	 * The '<em><b>Deg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEG
	 * @model name="deg"
	 * @generated
	 * @ordered
	 */
	public static final int DEG_VALUE = 8;

	/**
	 * The '<em><b>Rad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAD
	 * @model name="rad"
	 * @generated
	 * @ordered
	 */
	public static final int RAD_VALUE = 9;

	/**
	 * The '<em><b>Sr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SR
	 * @model name="sr"
	 * @generated
	 * @ordered
	 */
	public static final int SR_VALUE = 10;

	/**
	 * The '<em><b>Gy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GY
	 * @model name="Gy"
	 * @generated
	 * @ordered
	 */
	public static final int GY_VALUE = 11;

	/**
	 * The '<em><b>Q</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Q</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #Q
	 * @model name="q"
	 * @generated
	 * @ordered
	 */
	public static final int Q_VALUE = 12;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model literal="\260C"
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 13;

	/**
	 * The '<em><b>Sv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SV
	 * @model name="Sv"
	 * @generated
	 * @ordered
	 */
	public static final int SV_VALUE = 14;

	/**
	 * The '<em><b>F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F_VALUE = 15;

	/**
	 * The '<em><b>C1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C1
	 * @model literal="C"
	 * @generated
	 * @ordered
	 */
	public static final int C1_VALUE = 16;

	/**
	 * The '<em><b>S1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S1
	 * @model literal="S"
	 * @generated
	 * @ordered
	 */
	public static final int S1_VALUE = 17;

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #H
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H_VALUE = 18;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 19;

	/**
	 * The '<em><b>Ohm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ohm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OHM
	 * @model name="ohm"
	 * @generated
	 * @ordered
	 */
	public static final int OHM_VALUE = 20;

	/**
	 * The '<em><b>J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>J</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #J
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int J_VALUE = 21;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 22;

	/**
	 * The '<em><b>Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HZ
	 * @model name="Hz"
	 * @generated
	 * @ordered
	 */
	public static final int HZ_VALUE = 23;

	/**
	 * The '<em><b>Lx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LX
	 * @model name="lx"
	 * @generated
	 * @ordered
	 */
	public static final int LX_VALUE = 24;

	/**
	 * The '<em><b>Lm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LM
	 * @model name="Lm"
	 * @generated
	 * @ordered
	 */
	public static final int LM_VALUE = 25;

	/**
	 * The '<em><b>Wb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WB
	 * @model name="Wb"
	 * @generated
	 * @ordered
	 */
	public static final int WB_VALUE = 26;

	/**
	 * The '<em><b>T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T_VALUE = 27;

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>W</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 28;

	/**
	 * The '<em><b>Pa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PA
	 * @model name="Pa"
	 * @generated
	 * @ordered
	 */
	public static final int PA_VALUE = 29;

	/**
	 * The '<em><b>M2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M2
	 * @model name="m2" literal="m^2"
	 * @generated
	 * @ordered
	 */
	public static final int M2_VALUE = 30;

	/**
	 * The '<em><b>M3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M3
	 * @model name="m3" literal="m^3"
	 * @generated
	 * @ordered
	 */
	public static final int M3_VALUE = 31;

	/**
	 * The '<em><b>MS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MS
	 * @model name="mS" literal="m/s"
	 * @generated
	 * @ordered
	 */
	public static final int MS_VALUE = 32;

	/**
	 * The '<em><b>MS2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MS2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MS2
	 * @model name="mS2" literal="m/s^2"
	 * @generated
	 * @ordered
	 */
	public static final int MS2_VALUE = 33;

	/**
	 * The '<em><b>M3S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M3S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M3_S
	 * @model name="m3S" literal="m^3/s"
	 * @generated
	 * @ordered
	 */
	public static final int M3_S_VALUE = 34;

	/**
	 * The '<em><b>MM3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MM3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MM3
	 * @model name="mM3" literal="m/m^3"
	 * @generated
	 * @ordered
	 */
	public static final int MM3_VALUE = 35;

	/**
	 * The '<em><b>M1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M1
	 * @model literal="M"
	 * @generated
	 * @ordered
	 */
	public static final int M1_VALUE = 36;

	/**
	 * The '<em><b>Kg M3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kg M3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KG_M3
	 * @model name="kgM3" literal="kg/m^3"
	 * @generated
	 * @ordered
	 */
	public static final int KG_M3_VALUE = 37;

	/**
	 * The '<em><b>M2S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M2S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M2_S
	 * @model name="m2S" literal="m^2/s"
	 * @generated
	 * @ordered
	 */
	public static final int M2_S_VALUE = 38;

	/**
	 * The '<em><b>WMK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WMK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WMK
	 * @model literal="W/m K"
	 * @generated
	 * @ordered
	 */
	public static final int WMK_VALUE = 39;

	/**
	 * The '<em><b>JK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JK
	 * @model literal="J/K"
	 * @generated
	 * @ordered
	 */
	public static final int JK_VALUE = 40;

	/**
	 * The '<em><b>Ppm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ppm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPM
	 * @model name="ppm"
	 * @generated
	 * @ordered
	 */
	public static final int PPM_VALUE = 41;

	/**
	 * The '<em><b>S11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S11
	 * @model name="s11" literal="s^-1"
	 * @generated
	 * @ordered
	 */
	public static final int S11_VALUE = 42;

	/**
	 * The '<em><b>Rad S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rad S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAD_S
	 * @model name="radS" literal="rad/s"
	 * @generated
	 * @ordered
	 */
	public static final int RAD_S_VALUE = 43;

	/**
	 * The '<em><b>VA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VA_VALUE = 44;

	/**
	 * The '<em><b>Watts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Watts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATTS
	 * @model name="Watts"
	 * @generated
	 * @ordered
	 */
	public static final int WATTS_VALUE = 45;

	/**
	 * The '<em><b>VAr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAR
	 * @model name="VAr"
	 * @generated
	 * @ordered
	 */
	public static final int VAR_VALUE = 46;

	/**
	 * The '<em><b>Phi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHI
	 * @model name="phi"
	 * @generated
	 * @ordered
	 */
	public static final int PHI_VALUE = 47;

	/**
	 * The '<em><b>Cos Phi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cos Phi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COS_PHI
	 * @model name="cosPhi" literal="cos_phi"
	 * @generated
	 * @ordered
	 */
	public static final int COS_PHI_VALUE = 48;

	/**
	 * The '<em><b>Vs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VS
	 * @model name="Vs"
	 * @generated
	 * @ordered
	 */
	public static final int VS_VALUE = 49;

	/**
	 * The '<em><b>V2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>V2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #V2
	 * @model literal="V^2"
	 * @generated
	 * @ordered
	 */
	public static final int V2_VALUE = 50;

	/**
	 * The '<em><b>As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>As</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AS
	 * @model name="As"
	 * @generated
	 * @ordered
	 */
	public static final int AS_VALUE = 51;

	/**
	 * The '<em><b>A2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A2
	 * @model literal="A^2"
	 * @generated
	 * @ordered
	 */
	public static final int A2_VALUE = 52;

	/**
	 * The '<em><b>A2S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A2S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A2S
	 * @model literal="A^2 s"
	 * @generated
	 * @ordered
	 */
	public static final int A2S_VALUE = 53;

	/**
	 * The '<em><b>VAh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAH
	 * @model name="VAh"
	 * @generated
	 * @ordered
	 */
	public static final int VAH_VALUE = 54;

	/**
	 * The '<em><b>Wh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WH
	 * @model name="Wh"
	 * @generated
	 * @ordered
	 */
	public static final int WH_VALUE = 55;

	/**
	 * The '<em><b>VArh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VArh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARH
	 * @model name="VArh"
	 * @generated
	 * @ordered
	 */
	public static final int VARH_VALUE = 56;

	/**
	 * The '<em><b>VHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VHz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VHZ
	 * @model name="VHz" literal="V/Hz"
	 * @generated
	 * @ordered
	 */
	public static final int VHZ_VALUE = 57;

	/**
	 * The '<em><b>BS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BS
	 * @model name="bS" literal="b/s"
	 * @generated
	 * @ordered
	 */
	public static final int BS_VALUE = 58;

	/**
	 * An array of all the '<em><b>TSI Unit Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TSIUnitEnum[] VALUES_ARRAY =
		new TSIUnitEnum[] {
			NONE,
			M,
			KG,
			S,
			A,
			K,
			MOL,
			CD,
			DEG,
			RAD,
			SR,
			GY,
			Q,
			C,
			SV,
			F,
			C1,
			S1,
			H,
			V,
			OHM,
			J,
			N,
			HZ,
			LX,
			LM,
			WB,
			T,
			W,
			PA,
			M2,
			M3,
			MS,
			MS2,
			M3_S,
			MM3,
			M1,
			KG_M3,
			M2_S,
			WMK,
			JK,
			PPM,
			S11,
			RAD_S,
			VA,
			WATTS,
			VAR,
			PHI,
			COS_PHI,
			VS,
			V2,
			AS,
			A2,
			A2S,
			VAH,
			WH,
			VARH,
			VHZ,
			BS,
		};

	/**
	 * A public read-only list of all the '<em><b>TSI Unit Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TSIUnitEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TSI Unit Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TSIUnitEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TSIUnitEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TSI Unit Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TSIUnitEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TSIUnitEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TSI Unit Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TSIUnitEnum get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case M_VALUE: return M;
			case KG_VALUE: return KG;
			case S_VALUE: return S;
			case A_VALUE: return A;
			case K_VALUE: return K;
			case MOL_VALUE: return MOL;
			case CD_VALUE: return CD;
			case DEG_VALUE: return DEG;
			case RAD_VALUE: return RAD;
			case SR_VALUE: return SR;
			case GY_VALUE: return GY;
			case Q_VALUE: return Q;
			case C_VALUE: return C;
			case SV_VALUE: return SV;
			case F_VALUE: return F;
			case C1_VALUE: return C1;
			case S1_VALUE: return S1;
			case H_VALUE: return H;
			case V_VALUE: return V;
			case OHM_VALUE: return OHM;
			case J_VALUE: return J;
			case N_VALUE: return N;
			case HZ_VALUE: return HZ;
			case LX_VALUE: return LX;
			case LM_VALUE: return LM;
			case WB_VALUE: return WB;
			case T_VALUE: return T;
			case W_VALUE: return W;
			case PA_VALUE: return PA;
			case M2_VALUE: return M2;
			case M3_VALUE: return M3;
			case MS_VALUE: return MS;
			case MS2_VALUE: return MS2;
			case M3_S_VALUE: return M3_S;
			case MM3_VALUE: return MM3;
			case M1_VALUE: return M1;
			case KG_M3_VALUE: return KG_M3;
			case M2_S_VALUE: return M2_S;
			case WMK_VALUE: return WMK;
			case JK_VALUE: return JK;
			case PPM_VALUE: return PPM;
			case S11_VALUE: return S11;
			case RAD_S_VALUE: return RAD_S;
			case VA_VALUE: return VA;
			case WATTS_VALUE: return WATTS;
			case VAR_VALUE: return VAR;
			case PHI_VALUE: return PHI;
			case COS_PHI_VALUE: return COS_PHI;
			case VS_VALUE: return VS;
			case V2_VALUE: return V2;
			case AS_VALUE: return AS;
			case A2_VALUE: return A2;
			case A2S_VALUE: return A2S;
			case VAH_VALUE: return VAH;
			case WH_VALUE: return WH;
			case VARH_VALUE: return VARH;
			case VHZ_VALUE: return VHZ;
			case BS_VALUE: return BS;
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
	private TSIUnitEnum(int value, String name, String literal) {
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
	
} //TSIUnitEnum
