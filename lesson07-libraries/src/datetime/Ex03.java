package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Ex03 {
	
	private static final String PATTERN = "dd/MM/yy HH:mm:ss";
	
	public static void main(String[] args) {
		// date - string
		// date - calendar
		
		DateFormat df = new SimpleDateFormat(PATTERN);
		// date - string >> df.format
		
		// string - date >> df.parse
		Date date = null;
		try {
			// block scope
			date = df.parse("25/10/2018 16:20:30");
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("date: " + date);
		
		// date - calendar
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println("c: " + c);
		
		
	}
}
