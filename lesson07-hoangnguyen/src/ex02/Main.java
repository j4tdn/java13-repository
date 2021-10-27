package ex02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Date date = null;
		do {
			try {
				date = inputDay();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		String dowString = dayOfWeek(date);
		String monthAsString = getMonthString(date);
		System.out.println(date.getDate() + " " + monthAsString + " " + (date.getYear() + 1900) + " is a " + dowString);
		dayOfYear(date);
		dayOfWeekInYear(date);
		dayOfWeekInMonth(date);
		numberDayOfYear(date);
		numberDayOfMonth(date);
	}
	
	private static void numberDayOfMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		String monthAsString = getMonthString(date);
		int year = c.get(Calendar.YEAR);
		int day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(monthAsString + " " + year + " has " + day + " days");
	}
	
	private static void numberDayOfYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int year = c.get(Calendar.YEAR);
		
		GregorianCalendar g = new GregorianCalendar();
		int days = g.isLeapYear(year) ? 366 : 365;
		
		System.out.println("Year " + year + " has " + days + " days");
	}

	private static void dayOfWeekInMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		String dow = dayOfWeek(date);
		String monthAsString = getMonthString(date);
		int year = c.get(Calendar.YEAR);

		int number = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int outOf = number + (lastDayOfMonth - c.get(Calendar.DAY_OF_MONTH)) / 7;
		
		System.out.println("it is " + dow + " number " + number + " out of " + outOf + " in " + monthAsString + " " + year);
	}

	private static void dayOfWeekInYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String dow = dayOfWeek(date);
		int year = c.get(Calendar.YEAR);

		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int number = dayOfYear / 7 + (dayOfYear % 7 != 0 ? 1 : 0);

		int lastDateOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int outOf = number + (lastDateOfYear - dayOfYear) / 7;

		System.out.println("It is " + dow + " number " + number + " out of " + outOf + " in " + year);
	}

	private static void dayOfYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);

		GregorianCalendar gregorian = new GregorianCalendar();
		int remainingDate = gregorian.isLeapYear(c.get(Calendar.YEAR)) ? (366 - dayOfYear) : (365 - dayOfYear);
		System.out.println("It is number " + dayOfYear + " of the year, " + remainingDate + " left day");
	}

	private static String getMonthString(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String[] monthAsString = { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		return monthAsString[c.get(Calendar.MONTH)];
	}

	private static String dayOfWeek(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		String[] dayOfWeeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int dow = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeeks[dow - 1];
	}

	private static Date inputDay() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		int day = Integer.parseInt(sc.nextLine());
		if (day < 1 || day > 31) {
			throw new Exception("Day is not valid");
		}

		System.out.println("Enter the month: ");
		int month = Integer.parseInt(sc.nextLine());
		GregorianCalendar gregorian = new GregorianCalendar();
		if (month < 1 || month > 12) {
			throw new Exception("Month is not valid");
		}
		if ((month == 4 || month == 6 || month == 9 || month == 1) && day == 31) {
			throw new Exception(month + " doesn't have 31 days");
		}
		if (month == 2 && day > 29) {
			throw new Exception("February doesn't have more than 29 days");
		}

		System.out.println("Enter year: ");
		int year = Integer.parseInt(sc.nextLine());

		if (month == 2 && !gregorian.isLeapYear(year) && day > 28) {
			throw new Exception("February doesn't have > 28 days");
		}

		String timeString = "" + day + "/" + month + "/" + year;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(format.parse(timeString));
		return c.getTime();

	}
}
