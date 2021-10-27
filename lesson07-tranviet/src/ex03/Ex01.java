package ex03;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class Ex01 {
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.US);
		System.out.println( df.format(now) ); 
	}
}
