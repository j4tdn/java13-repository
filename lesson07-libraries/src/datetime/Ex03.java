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
		//date - string >> df.format
		
		//string - date >> df.parse
		Date date = null;
		try {
			date = df.parse("25/10/1999 15:23:11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("date: " + date);
		
		//string - date - calendar
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println("c: " + c);
	}
}
