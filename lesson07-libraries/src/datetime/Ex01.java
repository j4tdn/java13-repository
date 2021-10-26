package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// time in milliseconds: time=1634978093413(ms)
		// root O: epoch time: midnight 1/1/1970 time=0
		
		// GregorianCalendar : today 23/10
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		// setTime
		c.set(Calendar.DAY_OF_MONTH, 20);
		
		// syntax: >> c.get(giá trị cần lấy)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		
		System.out.println("DMY: " + (day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR); // Clock 12
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "AM" : "PM";
		System.out.println("H12MS: " + (hour + "/" + minute + "/" + second + " " + ap));
		
		// 20.10 - Wednesday - dow = 4
		// 23.10 - Saturday - dow = 7
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		// index: 0-6
		// dow: 1-7
		String dayOfWeeksAsString = dayOfWeeks[dow - 1];
		System.out.println("dayOfWeek: " + dayOfWeeksAsString);
		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("dayOfWeekAsEnum: " + dowEnum[dow - 1]);
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("weekOfMonth: " + weekOfMonth);
		System.out.println("weekOfYear: " + weekOfYear);
		
		// first weekday depends on locale
		System.out.println("default: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		// Task: input = today
		// 	   : output = first weekday
		// first day of week = today + (first weekday 1|2) - (current weekday)
		// c: today
		
		// firstDayOfWeek: today
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		
		// Update date = 14 >> firstDayOfWeek = 19.10.2021
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek.get(Calendar.DAY_OF_MONTH));
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2000));
	}
}
