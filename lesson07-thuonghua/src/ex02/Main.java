package ex02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("Input time love(YYYY/MM/DD): ");
		int ipyear = ip.nextInt();
		int ipmonth = ip.nextInt() - 1;
		int ipday = ip.nextInt();
		cal.set(ipyear, ipmonth, ipday);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int weekday = cal.get(Calendar.DAY_OF_WEEK);

		String[] dayofweeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
								"October", "November", "December" };
		String stm = monthNames[month];

		System.out.println(day + " " + stm + " " + year + " is a " + dayofweeks[cal.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("* Additional facts:");
		System.out.println("It is day number " + cal.get(Calendar.DAY_OF_YEAR) + " of the year, "
							+ (cal.getActualMaximum(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR)) + " day left.");
		System.out.println("It is " + dayofweeks[cal.get(Calendar.DAY_OF_WEEK) - 1] + " number "
							+ cal.get(Calendar.WEEK_OF_YEAR) + " out of 52 in " + cal.get(Calendar.YEAR));
		System.out.println("It is " + dayofweeks[cal.get(Calendar.DAY_OF_WEEK) - 1] + " number "
							+ cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " out of 4 in " + stm + " " + year);
		System.out.println("Year " + year + " has " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		System.out.println(stm + " " + year + " has " + cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}

}
