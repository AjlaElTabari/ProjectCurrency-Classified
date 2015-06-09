package ba.BITCamp.A_Team.CurrencyProject;

public class Adis {

	/**
	 * Printing exchange rate of wanted currency
	 * 
	 * @param currency - Wanted currency
	 * @return String value of exchange rate
	 */
	public static String getExchangeRates(String currency) {

		// Reading file that contains information about exchange currency rates
		TextIO.readFile("src/lectures/Currency.txt");

		String exchangeRate = "";

		// Going trough file and searching wanted currency rate
		while (!TextIO.eof()) {
			String str = TextIO.getln();
			if (str.indexOf(currency) >= 0) {
				String[] string = str.split(" ");
				exchangeRate = string[1];

			}
		}
		
		TextIO.readStandardInput();

		return exchangeRate;
	}
	
}
