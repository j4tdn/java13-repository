package ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 Viết chương trình, mỗi chức năng một phương thức 
 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ. 
 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy). 
 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại. 
 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm. 
 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy. 
 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
 */

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		currentTime(c);
		lastDayOfMonth(c);
		firstAndLastDayOfWeek(c);
		weekNumOfYear(c);
		afterTwentyDays();

	}

	// 1. Current time
	private static void currentTime(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out
				.println("Current time: " + day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second);

	}

	// 2. The last day of current month
	private static void lastDayOfMonth(Calendar c) {
		System.out.println("Last day of current month: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + "/"
				+ (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
	}

	// 3. The first day and the last day of current week
	private static void firstAndLastDayOfWeek(Calendar c) {
		Calendar firstDayOFWeek = Calendar.getInstance();
		firstDayOFWeek.setTimeInMillis(c.getTimeInMillis());
		firstDayOFWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("First day of current week is: " + firstDayOFWeek.get(Calendar.DATE) + "/"
				+ (firstDayOFWeek.get(Calendar.MONTH) + 1) + "/" + firstDayOFWeek.get(Calendar.YEAR));

		Calendar lastDayOFWeek = Calendar.getInstance();
		lastDayOFWeek.setTimeInMillis(c.getTimeInMillis());
		lastDayOFWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK) + 6);
		System.out.println("Last day of current week is: " + lastDayOFWeek.get(Calendar.DATE) + "/"
				+ (lastDayOFWeek.get(Calendar.MONTH) + 1) + "/" + lastDayOFWeek.get(Calendar.YEAR));
	}

	// 4. Day > Week number of year
	private static void weekNumOfYear(Calendar c) {
		int weekNum = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Week of year is: " + weekNum);
	}

	// 5. After 20 days
	private static void afterTwentyDays() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();

		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(df.format(c.getTime()));

		String[] dayOfWeeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int dow = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(dayOfWeeks[dow - 1]);
	}

	// 6. Your date of birth > how long have you lived?
	public static int getAge(Date birthday) {
		GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar bday = new GregorianCalendar();
		GregorianCalendar bdayThisYear = new GregorianCalendar();

		bday.setTime(birthday);
		bdayThisYear.setTime(birthday);
		bdayThisYear.set(Calendar.YEAR, today.get(Calendar.YEAR));

		int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);

		if (today.getTimeInMillis() < bdayThisYear.getTimeInMillis())
			age--;

		return age;
	}

}

