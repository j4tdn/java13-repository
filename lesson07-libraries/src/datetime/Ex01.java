package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// time : in milliseconds: time=1634978084081 (ms)
		// epoch time: Midnight 01.01.1970: time = 0
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// Day, Month. Year
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY: " + day + "/" + month + "/" + year);
		// Hour, Minute, Second
		int hour1 = c.get(Calendar.HOUR_OF_DAY); // Clock : 24h
		int hour2 = c.get(Calendar.HOUR); // Clock : 12h
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H24MS: " + hour1 + ":" + minute + ":" + second);
		System.out.println("H12MS: " + hour2 + ":" + minute + ":" + second + " " + ap);
//		// Another Day
//		c.set(Calendar.DAY_OF_MONTH, 20);
//		c.set(Calendar.YEAR, 2022);
//		int dayOfWeek2 = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println("Thứ " + dayOfWeek2);
		
		// Thứ Ngày, Tuần Trong Tháng
		   // NOW: TODAY
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
		
		String dayOfWeekAsString  = dayOfWeeks[dow-1];
		
		System.out.println(dayOfWeekAsString);
		   // Enum
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("DayOfWeekEnum: " + dowEnum[dow-1]);
		   //Tuần trong tháng/ năm
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("WeekOfMonth: " + weekOfMonth);
		System.out.println("WeekOfYear: " + weekOfYear);
		// Ngày đầu tiên trong tuần với locale
		
		System.out.println("default: " + Locale.getDefault());
		System.out.println("FirstWeekDay: " + c.getFirstDayOfWeek());
		
		// Task: input = today
		//     : output = first current weekday
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of weeak: " + firstDayOfWeek.get(Calendar.DAY_OF_MONTH));
		
		// Năm nhuận
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2000));
		
		System.out.println("==========================");
		Date date = new Date(); // = Calender.getInstance();
		System.out.println("Date: " + date);
		
		System.out.println("hours: " + date.getHours());
	}
}
