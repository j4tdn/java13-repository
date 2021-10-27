package ex03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Bài 3: Viết chương trình, mỗi chức năng một phương thức 1. Xem thời gian hiện
 * tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ. 2. In ngày cuối cùng của tháng hiện
 * tại (dd/MM/yyyy). 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại. 4. Xem
 * ngày hiện tại đang ở tuần thứ mấy trong năm. 5. Kiểm tra sau 20 ngày nữa là
 * ngày nào, thứ mấy. 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống
 * được bao nhiêu ngày.
 * 
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		c.setMinimalDaysInFirstWeek(7);
		// Khu vực bất kì
		System.out.println("Thời gian hiện tại: " + getTimeOfCountry(Locale.CANADA));

		// Tháng 10 có 31 ngày
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + getLastDateOfMonth(c));

		// Ngày đầu tiên và ngày cuối cùng của tuần hiện tại
		System.out.println(getFirstandLastDateOfWeek(c));

		// Ngày hiện tại đang ở tuần thứ mấy trong năm
		System.out.println("Ngày hiện tại đang ở tuần thứ " + getWeekOfYear(c) + " trong năm");

		// Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
		System.out.println(checkAfterNDays(20, c));

		// Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		Calendar c1 = Calendar.getInstance();
		c1.set(2001, Calendar.OCTOBER, 07);
		System.out.println("Bạn đã sống được " + daysYouLived(c1) + " ngày");
	}

	public static String getTimeOfCountry(Locale locale) {
		Calendar c1 = Calendar.getInstance(locale);
		return dayAndTime(c1);
	}

	public static long daysYouLived(Calendar c) {
		LocalDate birthDay = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
				c.get(Calendar.DAY_OF_MONTH));
		LocalDate now = LocalDate.now();
		long days = ChronoUnit.DAYS.between(birthDay, now);
		return days;
	}

	public static int getWeekOfYear(Calendar c) {
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	public static String getLastDateOfMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return day(c1);
	}

	public static String getFirstandLastDateOfWeek(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.setFirstDayOfWeek(2);
		c1.add(Calendar.DAY_OF_MONTH, c1.getFirstDayOfWeek() - c1.get(Calendar.DAY_OF_WEEK));

		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(c1.getTimeInMillis());
		c2.add(Calendar.DAY_OF_MONTH, 6);
		return "Ngày đầu tiên của tuần hiện tại là: " + day(c1) + "\nNgày cuối cùng của tuần hiện tại là: " + day(c2);
	}

	public static String dayAndTime(Calendar c) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dat = sdf.format(c.getTime());
		return dat;
	}

	public static String day(Calendar c) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d = sdf.format(c.getTime());
		return d;
	}

	public static String checkAfterNDays(int n, Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.add(Calendar.DAY_OF_MONTH, 20);
		c1.setFirstDayOfWeek(2);
		DayAsString[] dayAsString = DayAsString.values();
		DayAsString date = dayAsString[c1.get(Calendar.DAY_OF_WEEK) - 1];
		return "Sau " + n + " ngày nữa là ngày " + day(c1) + " thứ " + date;
	}
}
