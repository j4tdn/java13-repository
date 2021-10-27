package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02Java07 {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		Calendar c = Calendar.getInstance();

		do {
			try {
				System.out.println("Enter the date(dd/MM/yyyy): ");
				date = df.parse(new Scanner(System.in).nextLine());
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} while (true);

		c.setTime(date);

		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int dayLeftOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		int weekYear = c.getWeeksInWeekYear();
		int weekOfMonth = Math.round(c.get(Calendar.DAY_OF_MONTH) * 1.0f / 7);
		int weekMonth = 4;
		int dayYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int dayMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);

		DayOfWeek[] dowEnum = DayOfWeek.values();
		Month[] monthEnum = Month.values();

		System.out.println("It is day number " + dayOfYear + " of the year, " + dayLeftOfYear + " days left");
		System.out.println(
				"It is " + dowEnum[dayOfWeek - 1] + " number " + weekOfYear + " out of " + weekYear + " in " + year);
		System.out.println("It is " + dowEnum[dayOfWeek - 1] + " number " + weekOfMonth + " out of " + weekMonth
				+ " in " + monthEnum[month] + " " + year);
		System.out.println("Year " + year + " has " + dayYear + " days");
		System.out.println(monthEnum[month] + " " + year + " has " + dayMonth + " days");
	}

}
