package datetime;

import java.util.Calendar;

import Utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		// Count number of SUNDAY in this month
		int nowd = nOfWeekDay(Calendar.NOVEMBER, 2021, Calendar.SUNDAY);
		System.out.println("Number of Sunday: " + nowd);
	}
	private static int nOfWeekDay(int month, int year, int weekday) {
		Calendar dayStart = DateUtils.toCalendar(month, year, 1);
		Calendar dayEnd = DateUtils.toCalendar(month, year, dayStart.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar c = dayStart;
		int count = 0;
		while (c.before(dayEnd)) {
			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			}
			count++;
			dayStart.add(Calendar.DAY_OF_MONTH, 7);
		}

		return count;
	}

}
