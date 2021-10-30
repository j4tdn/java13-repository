package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		// Calendar c = Calendar.getInstance();
		int nos = getNOSundays(Calendar.FEBRUARY, 2012);
		System.out.println("nos: " + nos);

	}

	private static int getNOSundays(int month, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		Calendar c = dateStart;
		while (c.before(dateEnd)) {
			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				// System.out.println(DateUtils.toString(c));
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			}
			nos++;
			c.add(Calendar.DAY_OF_MONTH, 7);

		}

		return 0;
	}
}
