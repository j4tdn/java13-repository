package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		// Month - Year
		int nos = getNOSunDays(Calendar.OCTOBER, 2021);
		System.out.println("nos: " + nos);
	}
	
	private static int getNOSunDays(int month, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		dateStart.set(year, month, 1);
		
		Calendar c = dateStart;
		while(c.before(dateEnd)) {
			if(c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				c.add(Calendar.DAY_OF_WEEK, 1);
				continue;
			}
			nos++;
			c.add(Calendar.DAY_OF_MONTH, 7);
		}
		
		
		return nos;
	}
}
