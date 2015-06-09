package ba.BITCamp.A_Team.CurrencyProject;

import java.util.Arrays;

public class Ajla {
	
	/**
	 * Generates welcome message for user who wants to use currency converter
	 * <p>
	 * Reads all currencies from the file: todays currency exchange rate list
	 * and generates new String array with currency values
	 * printst that values on the screen, so user can see it
	 * 
	 * @param excangeCurrencyRatesFileName name of the file that contains todays currency exchange rate list
	 */
	public static void generateWellcomeMsg(String excangeCurrencyRatesFileName) {
		int count = 0;
		// passing through the file to see how long the array should be
		TextIO.readFile(excangeCurrencyRatesFileName);
		while (!TextIO.eof()) {
			String str = TextIO.getln();
			count++;
			}
		// creating new array using counted array size
		String[] currencyArr = new String[count];
		
		// passing through the file again, collecting currencies data and putting them into the array
		int counter = 0;
		TextIO.readFile(excangeCurrencyRatesFileName);
		while (!TextIO.eof()) {
			currencyArr[counter] = TextIO.getln();
			counter++;
		}
		
		// printing the array as welcome message
		System.out.println("This is todays currency exchange rate list: \n" + Arrays.toString(currencyArr));
	}
}
