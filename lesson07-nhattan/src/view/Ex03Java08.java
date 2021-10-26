package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03Java08 {
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
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		Scanner ip = new Scanner(System.in);
		LocalDate birthday = LocalDate.parse(ip.nextLine(), df);
		System.out.println(daysLived(birthday));
	}

	private static void getTime(TimeZone timeZone) {
		LocalDateTime date = LocalDateTime.now((timeZone.toZoneId()));
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");

		System.out.println(date.format(df));
	}

	private static int lastDayOfMonth() {
		YearMonth yearMonth = YearMonth.now();
		LocalDate date = yearMonth.atEndOfMonth();

		return date.getDayOfMonth();
	}

	private static void firstAndLastDayOfWeek() {
		TemporalField weekFiled = WeekFields.of(Locale.getDefault()).dayOfWeek();
		LocalDate date = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy");

		System.out.println(date.with(weekFiled, 1).format(df));
		System.out.println(date.with(weekFiled, 7).format(df));

	}

	private static int weekOfYear() {
		LocalDate date = LocalDate.now();
		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();

		return date.get(woy);
	}

	private static void afterTwentyDays() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate current = LocalDate.now();
		LocalDate after = current.plusDays(20);

		System.out.println(after.format(df));
		System.out.println(after.getDayOfWeek());
	}

	private static long daysLived(LocalDate birthday) {
		LocalDate current = LocalDate.now();
		long startValue = birthday.toEpochDay();
		long endValue = current.toEpochDay();
		return endValue - startValue;
	}
}
