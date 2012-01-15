package sclToC;

public class Main {
	public static void main(String[] args) {
		SCDCodeGenerator sclCodeGenerator = new SCDCodeGenerator();
		
		sclCodeGenerator.generateCode("scd.xml");
	}
}
