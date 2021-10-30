package datetime;

import java.util.Calendar;

import utils.DateUtils;

/**
 * Đếm xem tháng, năm có bao nhiêu ngày chủ nhật
 */

public class Ex04 {
	public static void main(String[] args) {
		// Month - Year
		int nos = getNOSundays(Calendar.OCTOBER, 2021);
		System.out.println("nos: " + nos); // nos = number of Sundays
	}

	// month = 10, year = 2010
	private static int getNOSundays(int month, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar c = dateStart;
		while (c.before(dateEnd)) {

			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			}
			nos++;
			c.add(Calendar.DAY_OF_MONTH, 7);
		}
		return nos;
	}

}
