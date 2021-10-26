package ex03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
/**
1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
*/
public class Ex03 {
	private static SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
	private static String[] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư","Thứ Năm","Thứ Sáu","Thứ Bảy"};
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		c.set(2021, 9, 1);
		System.out.println("Time Now : " + showTime(c));
		System.out.println("Last Day In Current Month: " + lastDayMonth(c));
		System.out.println("In current Week: " + lastAndFirstWeek(c));
		System.out.println(weekOfYear(c));
		System.out.println("After 20 days: " + afterSomeDays(c, 20));
		Calendar myBirth = Calendar.getInstance();
		myBirth.set(2001, 0, 19);
		System.out.println("I have lived for " + myTimePass(c, myBirth) + " days");
	}
	
	private static String showTime(Calendar c) {
		SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss ");
		return fm.format(c.getTime());
	}
	private static String lastDayMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c1.set(Calendar.MONTH, c.get(Calendar.MONTH));
		c1.set(Calendar.YEAR, c.get(Calendar.YEAR));
		return fm.format(c1.getTime());
	}
	
	private static String lastAndFirstWeek(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_YEAR, (c.get(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_WEEK) + 1 ));
		c2.set(Calendar.DAY_OF_YEAR, (c.get(Calendar.DAY_OF_YEAR) + (c.getMaximum(Calendar.DAY_OF_WEEK) - c.get(Calendar.DAY_OF_WEEK))));
		return "First day: " + fm.format(c1.getTime()) +", Last Day: "+ fm.format(c2.getTime());
	}
	
	private static String weekOfYear(Calendar c) {
		return "It is week number " + c.get(Calendar.WEEK_OF_YEAR) + " in the year";
	}
	
	private static String afterSomeDays(Calendar c, int numberDay) {
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + numberDay);
		return fm.format(c1.getTime()) + " " + dayOfWeeks[c1.get(Calendar.DAY_OF_WEEK) - 1];
	}
	
	private static int myTimePass(Calendar c, Calendar myBirth) {
		GregorianCalendar leapYear = new GregorianCalendar();
		int yearNow = c.get(Calendar.YEAR);
		int yearPast = myBirth.get(Calendar.YEAR) + 1;
		
		int sumDays = myBirth.getActualMaximum(Calendar.DAY_OF_YEAR) - myBirth.get(Calendar.DAY_OF_YEAR);
		while(yearPast!=yearNow) {
			sumDays = sumDays + (leapYear.isLeapYear(yearPast) ? 366 : 365 );
			yearPast++;
			if(yearPast == yearNow) {
				sumDays += c.get(Calendar.DAY_OF_YEAR);
			}
		}
		return sumDays;
	}
}
