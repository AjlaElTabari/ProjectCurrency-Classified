package ba.BITCamp.A_Team.CurrencyProject;

import ba.BITCamp.ajla.s04d02.predavanja.TextIO;

public class Ajla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void inputValues(String[] args) {
		String currentCurrency = args[0];
		Double amount = Double.parseDouble(args[1]);
		String desiredCurrency = args[1];
		
		TextIO.readFile("src/ba/BITCamp/ajla/s04d02/predavanja/Currency.txt");
		String a = TextIO.getlnString();
	}
}
