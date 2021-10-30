package datetime;

import java.util.Calendar;

import utils.DateUtils;

/**
 * 
 * Đếm xem tháng, năm hiện tại có bao nhiêu ngày chủ nhật.
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		// Month - Year
		int nos = getNOfSundays(Calendar.OCTOBER, 2021);
		System.out.println("nos: " + nos);
	}
	
	private static int getNOfSundays(int month, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		// get actual days of month
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		for(Calendar c = dateStart; c.before(dateEnd); ) {
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println("Date: " + DateUtils.toString(c));
				nos++;
				c.add(Calendar.DAY_OF_MONTH, 7);
			}else
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		return nos;
	}
}
