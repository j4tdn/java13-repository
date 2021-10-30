package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// time in milliseconds: time = 1634977950459
		// gregorianCalendar : today : 23.10
		Calendar c = Calendar.getInstance();
		
		// Set time
		//c.set(Calendar.DAY_OF_MONTH, 20);
		
		System.out.println(c);
		
		//syntax: >> c.get(giá trị cần lấy)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("DMY: " + (day + "/" + month));
		
		int hour = c.get(Calendar.HOUR);
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H12MS: " + (hour + "/" + minute + "/" + second) + " "+ ap);
		System.out.println("H24MS: " + (hourOfDay + "/" + minute + "/" + second));
		
		// 23.10 - Saturday - dow = 7
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek: " + dayOfWeek);
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		// index: 0 - 6
		// dow: 1 - 7
		String dayOfWeekAsString = dayOfWeeks[dow - 1];
		System.out.println("dayOfWeekAsString: " + dayOfWeekAsString);
		
		System.out.println("===================================");
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("dayOfWeekAsEnum: " + dowEnum[dow - 1]);
		
		// 1 - Sunday
		// 2 - Monday
		// 3 - Tuesday 
		// 4 - Wednesday
		// 5 - Thursday
		// 6 - Friday
		// 7 - Saturday
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("weekOfMonth: " + weekOfMonth);
		System.out.println("weekOfYear: " + weekOfYear);
		
		//first weekday 
		System.out.println("default: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		// Task: input = today
		//	   : output = first current weekday
		// first day of week = today + (first weekday 1|2) - (current weekday)
		
		// firstDayOfWeek: today: 23.10.2021
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		
		// Update date = 17 >> firstDayOfWeek = 17.10.2021
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek.get(Calendar.DAY_OF_MONTH));
		
		// Năm nhuận
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2018));
		
		System.out.println("================");
		Date date = new Date(); // = Calendar.getInstance();
		System.out.println("date: " + date);
		
		}
}

