package ex03;

import java.util.Calendar;
import java.util.Locale;

/**
	Viết chương trình, mỗi chức năng một phương thức
	1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
 */

public class App {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//1. Format : Locale || dd/MM/yyyy HH:mm:ss
		System.out.println("Curent time >>>>" + getCurrenTime(Locale.FRENCH));

		System.out.println("========================================");
		
		//2.
		System.out.println("Last day of current month: " + getLastDateOfCurrentMonth(c));
		
		System.out.println("========================================");
		
		//3.
		System.out.println("First day of week: " + getFirstDateOfWeek(c));
		System.out.println("Last day of week: " + getLastDateOfWeek(c));
		
		System.out.println("========================================");
		
		//4. 
		System.out.println("Curent week Of Year: " + getCurrentWeekOfYear(c));
		
		System.out.println("========================================");
		
		//5
		System.out.println(getDateAndDayAfter20DayFromCurrentDay(c));
		
		System.out.println("========================================");
		
		//6
		c.set(2001, 9, 13);
		System.out.println("Number of day you live: " + numberOfDaysYouLive(c));
	}
	
	private static String getCurrenTime(Locale locale) {
		Calendar c = Calendar.getInstance(locale);
		return locale + "||" + calendarToString(c);
	}
	
	private static String calendarToString(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		return day + "/" + (month + 1) + "/" + year + " " +
				hour + ":" + minute + ":" + second;
	}
	
	private static String getLastDateOfCurrentMonth(Calendar c) {
		int day = c.getActualMaximum(Calendar.DATE);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		return day + "/" + (month + 1) + "/" + year;
	}
	
	private static int getFirstDateOfWeek(Calendar c) {
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		return firstDayOfWeek.get(Calendar.DAY_OF_MONTH);
	}
	
	private static int getLastDateOfWeek(Calendar c) {
		Calendar lastDayOfWeek = Calendar.getInstance();
		lastDayOfWeek.setTimeInMillis(c.getTimeInMillis());
		lastDayOfWeek.add(Calendar.DAY_OF_MONTH, 6 + lastDayOfWeek.getFirstDayOfWeek() - lastDayOfWeek.get(Calendar.DAY_OF_WEEK));
		return lastDayOfWeek.get(Calendar.DAY_OF_MONTH);
	}
	
	private static int getCurrentWeekOfYear(Calendar c) {
		int currentWeekOfYear = c.get(Calendar.DAY_OF_YEAR)/7 + 1;
		return currentWeekOfYear;
	}
	
	private static String getDateAndDayAfter20DayFromCurrentDay(Calendar c) {
		DayOfWeek[] dowEnum = DayOfWeek.values();
		Calendar thatDay = Calendar.getInstance();
		thatDay.setTimeInMillis(c.getTimeInMillis());
		thatDay.add(Calendar.DAY_OF_MONTH, 20);
		int dow = thatDay.get(Calendar.DAY_OF_WEEK);
		return "Date after 20 day from currentDay: " + thatDay.get(Calendar.DAY_OF_MONTH)
		+ "\nDay after 20 day from currentDay: " + dowEnum[dow - 1];
	}
	
	private static int numberOfDaysYouLive(Calendar c) {
		Calendar current = Calendar.getInstance();
		long duration  = current.getTimeInMillis() - c.getTimeInMillis();
		int nodyl = (int) (duration / (1000*60*60*24));
		return nodyl;
	}
	
}	
