package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	
	public static void main(String[] args) {
		// date - string
		// date - calendar
		
		DateFormat df = new SimpleDateFormat(PATTERN);
		// date - string >> df.format
		
		// string - date >> df.parse
		Date date = null;
		try {
			date = df.parse("25/10/2018 16:20:30");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("date: " + date);
		
		Calendar c = Calendar.getInstance();
		System.out.println("c" + c);
		c.setTime(date);
		System.out.println("c: " + c);
		
	}
}
