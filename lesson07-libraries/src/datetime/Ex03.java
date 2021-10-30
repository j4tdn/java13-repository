package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	
	public static void main(String[] args) {
		// Date - String
		// Date - Calendar
		
		DateFormat df = new SimpleDateFormat(PATTERN);
		// date - String >> df.format
		
		
		// String - Date >> df.parse
		Date date = null;
		try {
			// block scope
			date = df.parse("25/10/2018 16:20:30");
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		System.out.println("Date : " + date);
				
		// Date - Calendar
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println("c : " + c);
	}
}
