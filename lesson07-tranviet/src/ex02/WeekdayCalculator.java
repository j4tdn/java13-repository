package ex02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class WeekdayCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		String date = "";
		while (true) {
			try {
				System.out.print("Input date (dd/MM/yyyy): ");
				date = validate(sc.nextLine());
				break;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		String[] values = date.split("/");
		// Stream.of(values).forEach(x->System.out.println(x));
		int year = Integer.parseInt(values[2]);
		int month = Integer.parseInt(values[1]);
		int day = Integer.parseInt(values[0]);
		c.set(year, month - 1, day);
		c.setFirstDayOfWeek(2);
		c.setMinimalDaysInFirstWeek(7);
		System.out.println(dateFormat(c));
		System.out.println("Additional facts!!!");
		fact1(c);
		fact2(c);
		fact3(c);
		fact4(c);
		fact5(c);
		sc.close();
	}

	private static String dateFormat(Calendar c) {
		DayAsString[] days = DayAsString.values();
		MonthAsString[] months = MonthAsString.values();
		return c.get(Calendar.DAY_OF_MONTH) + " " + months[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR)
				+ " is a " + days[c.get(Calendar.DAY_OF_WEEK) - 1];
	}

	private static void fact5(Calendar c) {
		MonthAsString[] months = MonthAsString.values();
		System.out.println("• " + months[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR) + " has "
				+ c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
	}

	private static void fact4(Calendar c) {
		GregorianCalendar gc = new GregorianCalendar();
		int numberOfDays = gc.isLeapYear(c.get(Calendar.YEAR)) ? 366 : 365;
		System.out.println("• Year " + c.get(Calendar.YEAR) + " has " + numberOfDays + " days.");
	}

	private static void fact3(Calendar c) {
		MonthAsString[] months = MonthAsString.values();
		DayAsString[] days = DayAsString.values();
		System.out.println("• It is " + days[c.get(Calendar.DAY_OF_WEEK) - 1] + " number "
				+ c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " out of " + c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH)
				+ " in " + months[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR) + ".");
	}

	private static void fact2(Calendar c) {
		DayAsString[] days = DayAsString.values();
		System.out
				.println("• It is " + days[c.get(Calendar.DAY_OF_WEEK) - 1] + " number " + c.get(Calendar.WEEK_OF_YEAR)
						+ " out of " + c.getWeeksInWeekYear() + " in " + c.get(Calendar.YEAR) + ".");
	}

	private static void fact1(Calendar c) {
		GregorianCalendar gc = new GregorianCalendar();
		int remainDay = gc.isLeapYear(c.get(Calendar.YEAR)) ? 366 - c.get(Calendar.DAY_OF_YEAR)
				: 365 - c.get(Calendar.DAY_OF_YEAR);
		System.out.println(
				"• It is day number " + c.get(Calendar.DAY_OF_YEAR) + " of the year, " + remainDay + " days left.");

	}

	private static String validate(String date) throws Exception {
		if (!DateUtils.isValidDate(date)) {
			throw new Exception("Format Error!!!");
		} else
			return date;
	}
}
