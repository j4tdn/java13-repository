package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01 {
	
	public static void main(String[] args) {
		// Time in milliseconds: time=1635076339762 (ms)
		// epoch time: Midnight 01.01.1970 time=0
		
		// GregorianCalendar: today: 23.10
		Calendar c = Calendar.getInstance();
		
		// setTime
//		c.set(Calendar.DAY_OF_MONTH, 20);
//		c.set(Calendar.YEAR, 2022);
		
		System.out.println(c);
		
		// syntax: c.get(giá trị cần lấy)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY: " + (day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR);// Clock 12 - AM_PM
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY); // Clock 24
		int minute = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H12MS: " + (hour + ":" + minute + ":" + seconds + " " + ap));
		System.out.println("H24MS: " + (hourOfDay + ":" + minute + ":" + seconds));
		
		// 20.10.2021 - Wednesday - dow = 4
		// 23.10 - Saturday - dow = 7
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek: " + dow);
		
		// index 0 - 6
		// dow : 1 - 7
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturdaay"};
		System.out.println("dayOfWeekAsString: " + dayOfWeeks[dow - 1]);
		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("dayOfWeekAsEnum: " + dowEnum[dow - 1]);
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("weekOfMonth: " + weekOfMonth);
		System.out.println("weekOfYear: " + weekOfYear);
		
		// first weekday depends on locale
		System.out.println("Default: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		// Task: input = today
		//     : output = first week day
		// first day of week = today + (first weekday 1|2) - (current weekday)
		// c: today
		
		// firstDayOfWeek: today
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		
		// Update date
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek);
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2000));
		
		System.out.println("===========================================");
		Date date = new Date(); // == Calendar.getInstance()
		System.out.println("Date: " + date);
		
	}
}
