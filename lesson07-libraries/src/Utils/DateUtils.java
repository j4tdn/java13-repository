package Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	private static String [] dayString = {"SUN","MON","TUE","WED","THUR","FRI","SAT"};
	private static final String DATE_PATTERN = "dd/MM/yyyy";
	private static final String DATE_TIME_PATTERN = "dd/MM/yyyy HH:mm:ss EEEE";
	private static DateFormat df = new SimpleDateFormat(DATE_PATTERN);
	private static DateFormat dtf = new SimpleDateFormat(DATE_TIME_PATTERN);
	public static String getWeekDayAsString(int weekdaynumber) {
		return dayString[weekdaynumber-1];
	}
	
	/**
	 * Convert to Date from given text with format dd/MM/yyyy
	 * 
	 * @param text input
	 * @return converted Date
	 */
	
	public static Date toDate(String text) {
		if (text == null || text.isEmpty()) {
			throw new IllegalArgumentException();
		}
		Date date = null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * Convert to Date from given Calendar
	 * 
	 * @param c input
	 * @return converted Date
	 */
	
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c);
		return c.getTime();
	}
	

	/**
	 * Convert to Calendar from given D
	 * 
	 * @param date input
	 * @return converted Calendar
	 */
	public static Calendar toCalendar(Date date) {
		Objects.requireNonNull(date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	/**
	 * Convert to String from given date with format dd/MM/yyyy EEEE
	 * 
	 * @param date input
	 * @return converted String
	 */
	public static String toString(Date date) {
		Objects.requireNonNull(date);
		return dtf.format(date);
	}
	public static Calendar toCalendar(int month, int year,int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(month, year , day);
		return calendar;
		}
	
}
