package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// default locale >> [language, country] >> en_US
		System.out.println("default locale: "+Locale.getDefault());
		// Locale.setDefault(new Locale("da", "DK"));
		
		// could be number, money
		double value = 12345123125123.234d;
		
		// code
		System.out.println(value);
		
		Locale locale = new Locale("da", "DK");
		// actual: currency
		// factory, [singleton]
		NumberFormat nf = NumberFormat.getInstance(locale);
		System.out.println("number format:  " + nf.format(value));
		
		NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("cf format: " + cf.format(value));
		
		System.out.println("===========================");
		
		
		//JAVA available locale da_DK, es_PR, vi_VN, en_US
		Locale[] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
		
	}
}
