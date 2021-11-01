package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat(PATTERN);
		// date - string >> df.format
		// string - date >> df.parse
		Date date = null;
		try {
			date = df.parse("07/10/2001 12:28:30");

		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("date: " + date);
		
		//date - calendar
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		// c.setTimeInMillis(date.getTime());
		System.out.println("c: " + c);
		
		
		
		
	}
}
