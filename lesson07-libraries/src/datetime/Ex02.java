package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	
	// 10302021T1541
	private static final String DATE_PATTERN = "dd/MM/yyyy'T'hh:mm:ss a";
	
	public static void main(String[] args) {
		// current time
		long current = System.currentTimeMillis();
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		
		System.out.println("date: " + date);
		System.out.println("c: " + c);
		System.out.println("current: " + current);
		
		// date - string
		DateFormat df = new SimpleDateFormat(DATE_PATTERN);
		String value = df.format(date);
		System.out.println("value: " + value);
		
		// calendar - date - string
		value = df.format(c.getTime());
		System.out.println("value: " + value);
		c.getTime();
	}
	
	
}
