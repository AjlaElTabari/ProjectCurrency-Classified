package ba.BITCamp.A_Team.CurrencyProject;

public class Ajla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void inputValues(String[] args) {
		String currentCurrency = args[0];
		Double amount = Double.parseDouble(args[1]);
		String desiredCurrency = args[2];

		try {
			if (amount < 0) {
			throw new IllegalArgumentException();
		}
			currencyExists(currentCurrency, "");
			currencyExists(desiredCurrency, "");
		} catch (IllegalArgumentException e) {
			System.out.println("Currency unknown.");
		}

	}

	public static boolean currencyExists(String currencyCode, String excangeCurrencyRatesFileName) {
		TextIO.readFile(excangeCurrencyRatesFileName);
		while (!TextIO.eof()) {
			String str = TextIO.getln();
			if (str.indexOf(currencyCode) < 0) {
				throw new IllegalArgumentException();
			}
		}
		return true;
	}
	
	/*public static void generateWellcomeMsg(String excangeCurrencyRatesFileName) {
		String[] currencyArr;
		int counter = 0;
		TextIO.readFile(excangeCurrencyRatesFileName);
		while (!TextIO.eof()) {
			currencyArr[counter] = TextIO.getln();
			counter++;
		}
	}*/
}
