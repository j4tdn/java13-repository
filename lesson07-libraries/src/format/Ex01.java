package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//default locate >>[language,country]>>en_us
		System.out.println("default lovate: "+Locale.getDefault());
		
//		Locale.setDefault(new Locale("da","DK"));
		
		//could benumber ,money
		double value = 122232435456d;
		
		//code
		System.out.println(value);
		
		Locale locale = new Locale("da","DK");
		
		//actial: currency
		//factory,[signleton]
		NumberFormat nf = NumberFormat.getInstance(locale);
		System.out.println("number format: "+nf.format(value));

		NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("cf format: "+cf.format(value));
		
		System.out.println("=================");
		
		Locale[] locales= Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
		
	}
}
