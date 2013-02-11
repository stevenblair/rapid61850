
public class Main {
	static {
		System.loadLibrary("rapid61850");
	}

	public static void main(String[] args) {
		rapid61850.start();
		
		System.out.println(rapid61850.interface_gse_send_E1Q1SB1_C1_Performance(1, 512));						// send GOOSE packet
		
		rapid61850.getE1Q1SB1().getS1().getC1().getMMXUa_1().getMod().setStVal(Mod.MOD_ON);				// interact with IED data model
		System.out.println(rapid61850.getE1Q1SB1().getS1().getC1().getMMXUa_1().getMod().getStVal());
	}
}
