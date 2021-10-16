package format;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		
		//default locale >> [country, language]
		System.out.println("default loacle: " + Locale.getDefault());
		
		//could be number, money
		double value = 1231245767342.267d;

		//code
		System.out.println(value);

		//actual: currency
		//factory, [singleton] 
		NumberFormat nf = NumberFormat.getInstance();
		String fmt = nf.format(value);
		System.out.println("number format: " + fmt);
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("cf format: " + cf.format(value));
	}
}
