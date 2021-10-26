package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
  Ex01: Lấy thông tin thời gian với timezone
  	+ Ngày, tháng, năm
  	+ Giờ 12-24, Phút, Giấy
  	+ Thứ ngày Monday, Tuseday, ..., Sunday.
  	+ Tuần trong tháng, tuần năm
  	+ Thứ của ngày đầu tiên trong tuần với locale
  	  . VietNam, US >> FirstDayOfWeek = Sunday >> 1
  	  . France		>> FirstDayOfWeek = Monday >> 2
  	+ Ngày đầu tiên của tuần hiện tại
  	  . Today: 23.10
  	  . US >> fdow = Sunday = 1 >> FirstDay = 17.10
  	  . FR >> 		 Monday	  2 >> FirstDay = 18.10
  	  
  	+ Kiểm tra năm hiện tại có phải năm nhuận không
  	+ Các ngày trong tuần, tháng, năm, hiện tại
  	=>>> Epoch time
 */

public class Ex01 {
	public static void main(String[] args) {
		// time in milliseconds
		// root o: epoch time: Midnight 01.01.1970 time=0
		
		// GregorianCalendar: today: 23.10
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		//System.out.println(c);
		
		// setTime
		//c.set(Calendar.DAY_OF_MONTH, 20);
		//c.set(Calendar.YEAR, 2022);
		
		
		// syntax: >> c.get(giá trị cần lấy)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);	
		System.out.println("DMY: " + (day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR); // Clock 12
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY); // Clock 24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H12MS: "+ (hour + "/" + minute + "/" + second + " " + ap));
		System.out.println("H12MS: "+ (hourOfDay + "/" + minute + "/" + second));
		
		//20.10.2021 - Wednesday - dow = 4
		//23.10.2021 - Saturday - dow = 7	
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("DayOfWeek: "+ dow);
		
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
		// index: 0-6
		// dow:   1-7	
		System.out.println("Day of week as string: " + dayOfWeeks[dow-1]);
		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("Day of week as enum: " + dowEnum[dow-1]);
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
		
		// first week day depends on locale
		System.out.println("Default: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		// Task: input = today from c
		//	   : output = first current weekday
		// first day of week = today + (first weekday 1|2) - current weekday
		// c: today >> 18.08.2022 >> 14.08.2022
		
		// firstDayOfWeek: today : 23.10.2021
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		
		// Update date = 14 >> firstDayOfWeek = 19.10.2021 
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek);
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2020));
	}
}
