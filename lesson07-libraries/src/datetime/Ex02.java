package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	
	private static final String DATE_PATTERN = "dd/MM/yyyy hh:mm:ss a";
	
	public static void main(String[] args) {
		// Current time
		long current = System.currentTimeMillis();
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		
		System.out.println("Date: " + date);
		System.out.println("Calendar: " + c);
		System.out.println("Current: " + current);
		
		// Date => String
		DateFormat df = new SimpleDateFormat(DATE_PATTERN);
		String value = df.format(date);
		System.out.println(value);
		
		value = df.format(c.getTime());
		System.out.println(value);
	}
}
