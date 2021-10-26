package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//time in milliseconds : time=1634978190655
		//epoch time : Midnight 01.01.1970 time=0
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 20);
		c.set(Calendar.YEAR, 2022);
		System.out.println(c);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH )+ 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY : " +( day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR);//clock : 12
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("H12MS: " + (hour + ":" + minute + ":" + second  ));
		
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String [] dayOfWeek = {"Sunday","Monday,","Tuesday","Wendsday"
								,"Thursday","Friday","Saturday"};	
		String dayOfWeedAssString = dayOfWeek[dow-1];
		System.out.println(dayOfWeedAssString);
		
		DayOfWeek [] dowEnum = DayOfWeek.values();
		System.out.println("DayOfWeekEnum: " + dowEnum[dow -1]);
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("weekOfMonth: " + weekOfMonth);
		System.out.println("weekOfYear: " + weekOfYear);
		
		//first weekday depends on lacale
		System.out.println("default: " + Locale.getDefault());
		int firstWeedDay = c.getFirstDayOfWeek();
		
		System.out.println("FirstWeedDay: " + dowEnum[firstWeedDay-1]);
		//task : input = today
		//	   : output =first current weekday
		//first day of week = today + (first weekday 1|2) - (current weekday)
		
		
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + c.get(Calendar.DAY_OF_MONTH));
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2010));
		
	}
}
