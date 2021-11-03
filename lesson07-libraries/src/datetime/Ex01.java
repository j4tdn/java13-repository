package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
  Ex01: Lấy thông tin thời gian với timezone
	+ Ngày, Tháng, Năm
	+ Giờ 12-24, Phút, Giây
	+ Thứ ngày Monday, Tuesday, ..., Sunday
	+ Tuần trong tháng, tuần năm
	+ Thứ của ngày đầu tiên trong tuần với locale
	  . Viet Nam, US >> FirstDayOfWeek = Sunday >> 1
	  . France       >> FirstDayOfWeek = Monday >> 2
	+ Ngày đầu tiên của tuần hiện tại 
	  . Today: 23.10
	  . US >> fdow = Sunday = 1 >> FristDay = 17.10
	  . FR >>        Monday   2 >> FristDay = 18.10
	+ Kiểm tra năm hiện tại có phải năm nhuận không
    
    + Đếm số ngày trong tháng hiện tại
	=>>> Epoch time
 */
public class Ex01 {
	public static void main(String[] args) {
		// time in milliseconds: time=1634977859934(ms)
		// root O: epoch time: Midnight 01.01.1970 time=0
		
		// GregorianCalendar: today: 23.10
		Calendar c = Calendar.getInstance();
		
		// setTime
		// c.set(Calendar.DAY_OF_MONTH, 20);
		// c.set(Calendar.YEAR, 2022);
		
		System.out.println(c);
		
		// syntax: >> c.get(giá trị cần lấy)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY: " + (day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR); // Clock 12 - AM_PM
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY); // Clock 24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H12MS: " + (hour + "/" + minute + "/" + second + " " + ap));
		System.out.println("H24MS: " + (hourOfDay + "/" + minute + "/" + second));
		
		// 20.10.2021 - Wednesday - dow = 4
		// 23.10.2021 - Saturday  - dow = 7
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		// index: 0-6
		// dow  : 1-7
		System.out.println("dayOfWeekAsString: " + dayOfWeeks[dow-1]);
		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("dayOfWeekAsEnum: " + dowEnum[dow-1]);
		
		// 1-Sunday
		// 2-Monday
		// 3-Tuesday
		// 4-Wednesday
		// 5-Thursday
		// 6-Friday
		// 7-Saturday
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("weekOfMonth: " + weekOfMonth);
		System.out.println("weekOfYear: " + weekOfYear);
		
		// first weekday depends on locale
		System.out.println("default: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		// Task: input  = today from c
		//     : output = first current weekday
		// first day of week = today + (first weekday 1|2) - (current weekday)
		// c: today >> 18.08.2022 >> 14.08.2022
		
		// firstDayOfWeek: today: 23.10.2021
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		
		// Update date = 14 >> firstDayOfWeek = 19.10.2021
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek);
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2024));
		
		System.out.println("=======================");
		Date date = new Date(); // = Calendar.getInstance();
		System.out.println("date: " + date);
		
		System.out.println("hours: " + date.getHours());
	}
}
