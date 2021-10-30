package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		
		//factory pattern
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
	
		//syntax: >> c.get(giatricanlay);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		
		System.out.println("DMY: " +(day + "/" + month +"/" + year));
		
		int hour = c.get(Calendar.HOUR);
		int hourofday = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H12MS: " + (hour + ":" + minute + ":" + second + " " + ap));
		System.out.println("H24MS: " + (hourofday + ":" + minute + ":" + second));
	
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		
		String[] dayofweeks = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		String dayofweeksAsString = dayofweeks[weekday -1];
		System.out.println(dayofweeksAsString);
		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("dayofweekAsEnum: " + dowEnum[weekday -1]);
		
		
		int  weekofmonth = c.get(Calendar.WEEK_OF_MONTH);
		int  weekofyear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println(weekofmonth);
		System.out.println(weekofyear);
		
		//first weekday depends on locale
		System.out.println("default: " + Locale.getDefault());
		System.out.println("firstWeekday: " + c.getFirstDayOfWeek());
		
		c.add(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + c.get(Calendar.DAY_OF_MONTH));
		
		
	}
}
