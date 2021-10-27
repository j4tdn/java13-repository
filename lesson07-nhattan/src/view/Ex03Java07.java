package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03Java07 {
	public static void main(String[] args) {

		TimeZone timeZone = TimeZone.getTimeZone("Europe/Madrid");
		System.out.println("Thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực " + timeZone.getDisplayName() + ".");
		getTime(timeZone);

		System.out.println("==================================================");
		System.out.println("Ngày cuối cùng của tháng hiện tại.");
		System.out.println(lastDayOfMonth());

		System.out.println("==================================================");
		System.out.println("Ngày đầu tiên và cuối cùng của tuần hiện tại.");
		firstAndLastDayOfWeek();

		System.out.println("=====================================================");
		System.out.println("Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println(weekOfYear());

		System.out.println("=====================================================");
		System.out.println("Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		afterTwentyDays();

		System.out.println("=====================================================");
		System.out.println("Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.");
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday = df.parse(new Scanner(System.in).nextLine());
			System.out.println(daysLived(birthday));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void getTime(TimeZone timeZone) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		df.setTimeZone(timeZone);
		System.out.println(df.format(date));
	}

	private static int lastDayOfMonth() {
		Calendar c = Calendar.getInstance();
		return c.getActualMaximum(Calendar.DATE);
	}

	private static void firstAndLastDayOfWeek() {
		Calendar firstDayOfWeek = Calendar.getInstance();
		Calendar lastDayOfWeek = Calendar.getInstance();

		firstDayOfWeek.add(Calendar.DAY_OF_MONTH,
				firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		lastDayOfWeek.add(Calendar.DAY_OF_MONTH, 7 - lastDayOfWeek.get(Calendar.DAY_OF_WEEK));

		System.out.println(firstDayOfWeek.get(Calendar.DAY_OF_MONTH));
		System.out.println(lastDayOfWeek.get(Calendar.DAY_OF_MONTH));
	}

	private static int weekOfYear() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	private static void afterTwentyDays() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();

		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(df.format(c.getTime()));

		String[] dayOfWeeks = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		int dow = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(dayOfWeeks[dow - 1]);
	}

	private static long daysLived(Date birthday) {
		Date current = new Date();
		long startValue = birthday.getTime();
		long endValue = current.getTime();
		return (endValue - startValue) / (24 * 60 * 60 * 1000);
	}

}
