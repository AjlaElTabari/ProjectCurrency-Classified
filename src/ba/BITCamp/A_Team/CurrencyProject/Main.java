package ba.BITCamp.A_Team.CurrencyProject;

public class Main {

	public static void main(String[] args) {

		try {
			// checking if user entered less then mandatory three arguments
			if(args.length < 3) {
				throw new ArrayIndexOutOfBoundsException("This program demands at least three arguments.");
			}
			// setting path to todays currency exchange rate list 
			String excangeCurrencyRatesDestination = "src/ba/BITCamp/A_Team/CurrencyProject/Currency.txt";	
			// calling method that will generate welcome message and print todays currency exchange rate list
			Ajla.generateWellcomeMsg(excangeCurrencyRatesDestination);
			
			// printing out arguments that user entered
			String currentCurrency = args[0];
			System.out.println("Current currency: " + currentCurrency);
			Double amount = Double.parseDouble(args[1]);
			System.out.println("Amount: " + amount);
			String desiredCurrency = args[2];
			System.out.println("Desired currency: " + desiredCurrency);	
				
			// calculations for conversion
				double currCurency = Double.parseDouble(Adis.getExchangeRates(
						currentCurrency, excangeCurrencyRatesDestination));
				double desCurency = Double.parseDouble(Adis.getExchangeRates(
						desiredCurrency, excangeCurrencyRatesDestination));
			// printing out the result of calculation	
				System.out.printf("%.5f %s = %.5f %s\n", amount, currentCurrency,
						Dinko.calculateConversion(currCurency, amount, desCurency),
						desiredCurrency);
				
		} catch (IllegalArgumentException e) {
			System.out.println("Unknown currency format.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This program demands at least three arguments.");
		} 

	}

}
