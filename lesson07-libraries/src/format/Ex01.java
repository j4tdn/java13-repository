package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// default locale >> [language, country] > Ex: da_DK
		// Locale.setDefault(new Locale("da", "DK")); // set Locale 
		System.out.println("default locale: " + Locale.getDefault());
		
		// couble be number, money
		double value = 12312435764.267d;
		
		// code
		System.out.println(value);
		
		Locale locale = new Locale("da", "DK");
		
		// actual: currency
		// gọi hàm, trả về đối tượng >> factory, [singleton]
		NumberFormat nf = NumberFormat.getInstance(locale);
		System.out.println("nb format: " + nf.format(value));
		
		NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("cf format: " + cf.format(value));
		
		System.out.println("=================");
		
		// JAVA available locale (Ex: da_DK)
		Locale[] locales = Locale.getAvailableLocales(); // print all locales
		System.out.println(Arrays.toString(locales)); // to String array
		
		
	}

}
