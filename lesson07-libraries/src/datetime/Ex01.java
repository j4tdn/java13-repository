package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Ex01: Lấy thông tin thời gian với timezone
 + Ngày, Tháng, Năm
 + Giờ 12-24, Phút, Giây
 + Thứ ngày
 + Tuần trong tháng, tuần năm
 + Thứ của ngày đầu tiên trong tuần với locale
   .Vietnam, US >> FirstDayOfWeek = Sunday >> 1
   .France      >> FirstDayOfWeek = Monday >> 2
 + Ngày đầu tiên của tuần hiện tại  
   .Today: 23.10
   . US:
 + Kiểm tra năm hiện tại có phải năm nhuân không 
 + Ngày đầu tiên của tuần hiện tại 
 + Các ngày trong tuần, tháng, năm hiện tại
 =>>> Epoch time
 */

public class Ex01 {
	public static void main(String[] args) {
		// time=1634977954854 (ms) => time in milliseconds
		// root 0 (tọa độ): epoch time: Midnight 01.01.1970 time=0
		
		// GregorianCalendar: today: 23.10
		Calendar c = Calendar.getInstance(); // get ra calendar và lưu trữ thông tin
		
		// setTime > 20/10/2022
		// c.set(Calendar.DAY_OF_MONTH, 20);
		// c.set(Calendar.YEAR, 2022);
		
		System.out.println(c);
		
		// syntax: >> c.get(giá trị cần lấy)
		int day = c.get(Calendar.DAY_OF_MONTH); // to get day
		int month = c.get(Calendar.MONTH) + 1; // get MONTH from c > trả về giá trị của month
		                                       // giá trị của month từ 0-11 (tương ứng từ tháng 1 - 12)
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY: " + day + "/" + month + "/" + year);
		
		int hour = c.get(Calendar.HOUR); // Clock 12
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY); // Clock 24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H12MS: " + (hour + "/" + minute + "/" + second + ap));
		System.out.println("H24MS: " + (hour + "/" + minute + "/" + second));
		
		// 20.10.2021 - Wednesday - dow = 4
		// 23.10.2021 - Saturday - dow = 7
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		// index: 0-6
		// dow: 1-7
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
		
		// firstWeekDay depends on locale
		System.out.println("default: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		// Task: input = today
		//     : output = first weekday
		// first day of week = today + (first weekday 1|2) - (current weekday)
		// c: today >> 18.08.2022 >> 14.08.2022
		
		// firstDayOfWeek: today: 23.10.2021
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		
		// Update date = 14 >> firstDayOfWeek 
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek);
		
		// năm nhuận
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2024));
		
		int first = c.getFirstDayOfWeek();
		System.out.println("First Day Of Week is: " + first);
		
		Date date = new Date();
		System.out.println("date: " + date);
		
		System.out.println("hour: " + date.getHours()); // should use "Calendar"
		
		
	}

}
