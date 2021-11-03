package ex03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import utils.DayAsString;

public class Ex03 {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.setMinimalDaysInFirstWeek(7);
		
		System.out.println("thoi gian hien tai: " + 
				getTime(TimeZone.getTimeZone("Europe/Madrid"), Locale.FRANCE));

		System.out.println("ngay cuoi cung cua thang nay: " + lastDayOfMonth(c));

		System.out.println(firstAndLastDateOfWeek(c));

		System.out.println("ngay hien tai dang o tuan thu " + weekOfYear(c) + " trong nam");

		System.out.println(checkAfterNDays(20, c));

		Calendar c1 = Calendar.getInstance();
		c1.set(1999, Calendar.JANUARY, 9);
		System.out.println("ban da song " + lived(c1) + " ngay");
	}

	public static String getTime(TimeZone t, Locale local) {
		Calendar c = Calendar.getInstance(t, local);
		return dayAndTime(c);
	}

	public static String lastDayOfMonth(Calendar c) {
		Calendar a = Calendar.getInstance();
		a.setTimeInMillis(c.getTimeInMillis());
		a.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return day(a);
	}

	public static String firstAndLastDateOfWeek(Calendar c) {
		Calendar a = Calendar.getInstance();
		a.setTimeInMillis(c.getTimeInMillis());
		a.setFirstDayOfWeek(2);
		a.add(Calendar.DAY_OF_MONTH, a.getFirstDayOfWeek() - a.get(Calendar.DAY_OF_WEEK));

		Calendar b = Calendar.getInstance();
		b.setTimeInMillis(a.getTimeInMillis());
		b.add(Calendar.DAY_OF_MONTH, 6);
		return "ngay dau tien cua tuan hien tai: " + day(a) + "\nngay cuoi cung cua tuan hien tai: " + day(b);
	}
	
	public static int weekOfYear(Calendar c) {
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	public static String checkAfterNDays(int n, Calendar c) {
		Calendar a = Calendar.getInstance();
		a.setTimeInMillis(c.getTimeInMillis());
		a.add(Calendar.DAY_OF_MONTH, n);
		a.setFirstDayOfWeek(2);
		DayAsString[] dayAsString = DayAsString.values();
		DayAsString date = dayAsString[a.get(Calendar.DAY_OF_WEEK) - 1];
		return "Sau " + n + " ngay nua se la ngay " + day(a) + " thu " + date;
	}
	
	public static long lived(Calendar c) {
		LocalDate birthDay = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
				c.get(Calendar.DAY_OF_MONTH));
		LocalDate now = LocalDate.now();
		long days = ChronoUnit.DAYS.between(birthDay, now);
		return days;
	}
	
	public static String dayAndTime(Calendar c) {
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String a = d.format(c.getTime());
		return a;
	}

	public static String day(Calendar c) {
		SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
		String d = a.format(c.getTime());
		return d;
	}

}
