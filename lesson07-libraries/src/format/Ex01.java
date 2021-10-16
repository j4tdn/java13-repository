package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;


public class Ex01 {
	public static void main(String[] args) {
		// default locale >> [country, language] >> en_US
		
		//Locale[] locale = Locale.getAvailableLocales();
		//System.out.println(Arrays.toString(locale));
		
		//Locale.setDefault(new Locale("da", "DK"));
		System.out.println("default locale: " + Locale.getDefault());
		// could be number, money
		double value = 12343412312341.4567d;
		
		// code
		System.out.println(value);
		
		Locale locale = new Locale("da", "DK");
		
		// actual: currency
		// factory, [singleton] 
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("number format: " + nf.format(value));
		
		NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("cf fomat: " + cf.format(value));
	}
}
