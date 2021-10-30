package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {
	private DateUtils() {
		
	}
	public static Calendar toCalendar(int year, int month,int day) {
		Calendar calendar = Calendar.getInstance();//30.10.2021
		calendar.set(year, month, day);//01.10.2010
		return calendar;
	}
	
	public static String toString(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(c.getTime());
	}

}
