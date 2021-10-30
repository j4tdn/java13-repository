package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {
	
	private static final String PATTERN = "dd/MM/yyyy";
	
	private DateUtils() {
		
	}
	
	public static Calendar toCalendar(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(year, month, day);
		return calendar;
	}
	
	public static String toString(Calendar c) {
		DateFormat df = new SimpleDateFormat(PATTERN);
		return df.format(c.getTime());
	}
}
