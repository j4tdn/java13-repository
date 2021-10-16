package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		
		//default locale >> [country, language]
		System.out.println("default locale: " + Locale.getDefault());
		Locale.setDefault(new Locale("da", "DK"));

		// could be number, money
		double value = 163636545654651645d;
		
		// code
		System.out.println(value);
		
		// actual : currency
		// factory, [singleton]
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("number format: " + nf.format(value));
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("cf format: " + cf.format(value));
		Locale[] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
	}
}
