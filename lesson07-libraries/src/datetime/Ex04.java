package datetime;

import java.util.Calendar;

import utils.DateUtils;

/**
 * 
 * Đếm số ngày chủ nhật của tháng, năm bất kỳ
 *
 */

public class Ex04 {

	public static void main(String[] args) {
		// Month - Year
		int numberOfSundays = getNumberOfSundays(Calendar.OCTOBER, 2021);
		System.out.println("Number of Sunday: " + numberOfSundays);
		

	}

	private static int getNumberOfSundays(int month, int year) {
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar c = dateStart;
		int result = 0;
		while (c.before(dateEnd)) {
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				result++;
				c.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				c.add(Calendar.DAY_OF_MONTH, 1);
			}
		}

		return result;
	}
}
