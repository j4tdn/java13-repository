package ex01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println("Inout time love(YYYY/MM/DD): ");

		int ipyear = ip.nextInt();
		int ipmonth = ip.nextInt() - 1;
		int ipday = ip.nextInt();
		cal1.set(ipyear, ipmonth, ipday);

		String[] dayofweeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println("Day Of Week begin love: " + dayofweeks[cal1.get(Calendar.DAY_OF_WEEK) - 1]);

		int day2 = cal2.get(Calendar.DAY_OF_MONTH);
		int month2 = cal2.get(Calendar.MONTH);
		int year2 = cal2.get(Calendar.YEAR);

		int day1 = cal1.get(Calendar.DAY_OF_MONTH);
		int month1 = cal1.get(Calendar.MONTH);
		int year1 = cal1.get(Calendar.YEAR);

		System.out.println("Your Love: " + (year2 - year1) + " Year, " + (month2 - month1) + " Month, " + (day2 - day1)
				    		+ " day, " + cal2.get(Calendar.HOUR_OF_DAY) + " Hour, " + cal2.get(Calendar.MINUTE) + " Minute, "
				    		+ cal2.get(Calendar.SECOND) + " Second.");
	}
}
