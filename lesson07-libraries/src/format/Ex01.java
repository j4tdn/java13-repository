package format;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//default locale >> country , language
		System.out.println("default locale: " + Locale.getDefault());
//		Locale.setDefault(new Locale("da","DK"));
		//could be number, money
		double value = 1546532654125615152d;
		System.out.println(value);
		// actual: currency
		// factory, singleton
		Locale locale = new Locale("da", "DK");
		NumberFormat nf = NumberFormat.getInstance(locale);
		System.out.println("number format: "+  nf.format(value));
		
		NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("cf format: " + cf.format(value));
		
	}

}
