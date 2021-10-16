package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//defaul locale >> [country, language]
		System.out.println("defaul locale: " + Locale.getDefault());
		//Locale.setDefault(new Locale("da", "DK"));
		
		// could be number, money
		double value = 123456789d;
		
		
		//code
		System.out.println(value);
		
		Locale locale = new Locale("da", "DK");
		
		// actual: currency
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("number format: " + nf.format(value));
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("cf format: " + cf.format(value));
		
		System.out.println("===================");
		
		Locale[] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
	}

}
