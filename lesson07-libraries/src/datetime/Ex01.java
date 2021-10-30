package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Ex01 {
	public static void main(String[] args) {
		//time in milliseconds: time= 163423423742424(ms)
		//epoch time: Mid night 01.01.1970 time=0(ms)
		
		//GregorianCalendar >> today: 23/10
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		//setTime
		//c.set(Calendar.DAY_OF_MONTH, 20);
		//c.set(Calendar.YEAR, 2022);
		
		//syntax: >> c.get(giá trị cần lấy)
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = 1 + c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		int hour = c.get(Calendar.HOUR_OF_DAY);//clock 24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println("dmy: " + (day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second));
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		
		String[] dayOfWeeks= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		//index:0-6
		//dow: 1-7
		String dayOfWeekAsString = dayOfWeeks[dow - 1];
		System.out.println(dayOfWeekAsString);
		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("dayOfWeekAsEnum: " + dowEnum[dow-1]);
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("weekOfMonth: " + weekOfMonth);
		System.out.println("weekOfYear: " + weekOfYear);
		
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		//input = today from c
		//output = first week day
		//first day of week = today + first weekday - current weekday
		
		Calendar firstDayOfWeek = Calendar.getInstance(); 
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek.get(Calendar.DAY_OF_MONTH));
		
		
		// Kiểm tra năm nhuận 
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2025));
		
		System.out.println("================");
		Date date = new Date();
		
		
		
		
		
		
		
		
		
		
		
	}
}
