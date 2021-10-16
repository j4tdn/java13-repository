package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//default locale >> [ language , country ]
		Locale.setDefault(new Locale("vi", "VN"));
		System.out.println("default locale: " + Locale.getDefault());
		
		
		//could be number, money
		double value = 12342425621464d;
		
		//code
		System.out.println(value);
		
		//actual : currency
		
		NumberFormat nf = NumberFormat.getInstance();
		String fmt = nf.format(value);
		System.out.println("number format: " + fmt);
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("cf format: " + cf.format(value));
		
		System.out.println("==============================");
		
		Locale [] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
		
	}
}
