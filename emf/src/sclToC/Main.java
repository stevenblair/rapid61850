package sclToC;

public class Main {
	public static void main(String[] args) {
		SCLCodeGenerator sclCodeGenerator = new SCLCodeGenerator();
		
		sclCodeGenerator.generateCode("scd.xml");
	}
}
