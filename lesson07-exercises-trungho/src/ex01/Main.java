package ex01;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calendar datingStart = Calendar.getInstance();
		datingStart.set(Calendar.YEAR, 2009);
		datingStart.set(Calendar.MONTH, 5);
		datingStart.set(Calendar.DAY_OF_MONTH, 26);

		System.out.println("Relationship starting from: " + datingStart.get(Calendar.DAY_OF_MONTH) + "/"
				+ (datingStart.get(Calendar.MONTH) + 1) + "/" + datingStart.get(Calendar.YEAR));

		System.out.println("Are you still in relationship? (y/n)");
		Scanner ip = new Scanner(System.in);
		String rs = ip.nextLine();
		switch (rs) {
		case "y":
			Calendar now = Calendar.getInstance();
			System.out.println("Current time: " + now.get(Calendar.DAY_OF_MONTH) + "/" + (now.get(Calendar.MONTH) + 1)
					+ "/" + now.get(Calendar.YEAR));
			relationshipCalc(datingStart, now);
			break;
		case "n":
			Calendar datingEnd = Calendar.getInstance();
			datingEnd.set(Calendar.YEAR, 2011);
			datingEnd.set(Calendar.MONTH, 8);
			datingEnd.set(Calendar.DAY_OF_MONTH, 11);
			System.out.println("Relationship breakup from: " + datingEnd.get(Calendar.DAY_OF_MONTH) + "/"
					+ (datingEnd.get(Calendar.MONTH) + 1) + "/" + datingEnd.get(Calendar.YEAR));
			relationshipCalc(datingStart, datingEnd);
			break;
		default:
			System.out.println("Invalid input! Stop program!");
		}
	}

	public static void relationshipCalc(Calendar start, Calendar end) {
		int dayOfWeek = start.get(Calendar.DAY_OF_WEEK);
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("The relationship starts on: " + dowEnum[dayOfWeek - 1]);

		Calendar duration = Calendar.getInstance();
		duration.setTimeInMillis(end.getTimeInMillis() - start.getTimeInMillis());
		int year = duration.get(Calendar.YEAR) - 1970;
		int month = duration.get(Calendar.MONTH);
		int day = duration.get(Calendar.DAY_OF_MONTH);
		int hour = duration.get(Calendar.HOUR);
		int minute = duration.get(Calendar.MINUTE);
		int second = duration.get(Calendar.SECOND);

		System.out.println("The relationship last: " + year + " year, " + month + " month, " + day + " day, " + hour
				+ " hour, " + minute + " minute, " + second + " second");
	}
}
