package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		double value = 1234323453414344.2344d;
		// get available locales
		Locale[] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
		// default locale >> [language, country] >> en_US
		System.out.println("Default locale: " + Locale.getDefault());
		Locale.setDefault(new Locale("vi", "VN"));
		// code
		System.out.println(value);

		// actual: currency
		// factory, singleton

		// Formatting according to the default locale we set above or we can:
		// NumberFormat nf = NumberFormat.getInstance(new Locale("da", "DK"));
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Number format: " + nf.format(value));

		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Cf format: " + cf.format(value));

	}
}
