package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {
	private DateUtils() {
		
	}
	
	public static Calendar toCalendar(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c; 
	}
	
	public static String toString(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(c.getTime());
	}
}
