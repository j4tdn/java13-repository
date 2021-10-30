package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	
	private static final String PATTERN = "dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat(PATTERN);
		
		//date - String >> df.format
		
		//String - date >> df.parse
		Date date = null;
		try {
			//block scope
			date = df.parse("25/10/1999");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("date: " + date);
		
		//String - date - calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		System.out.println("c: " + cal);
		
	}
}
