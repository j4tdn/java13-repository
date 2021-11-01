package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// c.set(Calendar.MONTH, 1);
		// c.set(Calendar.YEAR, 2020);
		// System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		int nos = getNOSundays(Calendar.NOVEMBER, 2021);
		System.out.println("nos: " + nos);
	}

	private static int getNOSundays(int month, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		Calendar c = dateStart;
		while (c.before(dateEnd)) {
			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				c.add(Calendar.DAY_OF_MONTH, 1);
			}
			nos++;
			c.add(Calendar.DAY_OF_MONTH, 7);

			// System.out.println(DateUtils.toString(c));
		}
		return nos;
	}
}
