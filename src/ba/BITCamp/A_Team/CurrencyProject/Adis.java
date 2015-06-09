package ba.BITCamp.A_Team.CurrencyProject;
import java.io.FileNotFoundException;

public class Adis {

	/**
	 * Printing exchange rate of wanted currency
	 * 
	 * @param currency - Wanted currency
	 * @return String value of exchange rate
	 */
	public static String getExchangeRates(String currency, String excangeCurrencyRatesFileName) {

		// Reading file that contains information about exchange currency rates
		TextIO.readFile(excangeCurrencyRatesFileName);

		String exchangeRate = "";

		// Going trough file and searching wanted currency rate
		while (!TextIO.eof()) {
			String str = TextIO.getln();
			if (currency.equals(str.substring(0, 3))){
				String[] string = str.split(" ");
				exchangeRate = string[1];
			}
		}
		
		TextIO.readStandardInput();

		return exchangeRate;
	}
	
	
	
	
}
