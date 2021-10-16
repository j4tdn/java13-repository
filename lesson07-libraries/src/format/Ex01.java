package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// default locale >> [country, language] >> en_US
		Locale.setDefault(new Locale("da","DK"));
		System.out.println("default locale : " + Locale.getDefault());
		
		// could be number, money
		double value = 32124623468238d;
		
		// code
		System.out.println("value " + value);
		
		Locale locale = new Locale("da","DK");
		
		// actual : currency
		// factory,singleton: 1 class tao ra 1 đói tượng 
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("nb format : " + nf.format(value));
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("cf format :" + cf.format(value));
		
		System.out.println("==================");
		// Java available locale da_DK,es_PR,vi_VN,en_US
		Locale[] locales =  Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
		
	}

}
