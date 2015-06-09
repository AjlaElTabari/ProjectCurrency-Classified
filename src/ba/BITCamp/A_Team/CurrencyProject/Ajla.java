package ba.BITCamp.A_Team.CurrencyProject;

import java.util.Arrays;

public class Ajla {
	
	public static void generateWellcomeMsg(String excangeCurrencyRatesFileName) {
		int count = 0;
		TextIO.readFile(excangeCurrencyRatesFileName);
		while (!TextIO.eof()) {
			String str = TextIO.getln();
			count++;
			}
		String[] currencyArr = new String[count];
		
		
		int counter = 0;
		TextIO.readFile(excangeCurrencyRatesFileName);
		while (!TextIO.eof()) {
			currencyArr[counter] = TextIO.getln();
			counter++;
		}
		System.out.println("This is todays currency exchange rate list: \n" + Arrays.toString(currencyArr));
	}
}
