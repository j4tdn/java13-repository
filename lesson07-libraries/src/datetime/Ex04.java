package datetime;

import java.util.Calendar;

import utils.DateUtils;

/*
 * đến xem tháng, năm hiện tại có bao nhiêu ngày chủ nhật
 */
public class Ex04 {
	public static void main(String[] args) {
		// Month - year
		
		int nos = getNOfSundays(Calendar.OCTOBER, 2021);
		System.out.println("nos: " + nos);
		
	}
	
	private static int getNOfSundays(int month, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Calendar c = dateStart;
		while(c.before(dateEnd)) {
			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY ) {
				nos++;
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			}
			nos++;
			c.add(Calendar.DAY_OF_MONTH, 7);
		}
		
		return nos;
	}
}
