package datetime;

import java.util.Calendar;

import utils.DateUtils;
/*
 * Đếm xem số ngày chủ nhật của 1 năm bất kỳ
 */
public class Ex04 {
	public static void main(String[] args) {
		// Month - Year
		int nos = getNumberOfSundayInCurrentMonth(Calendar.OCTOBER, 2021);
		System.out.println("nos: " + nos);
	}
	
	
	// month = 2 , year = 2021 
	private static int getNumberOfSundayInCurrentMonth(int month, int year) {
		// number of Sunday
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);	
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Calendar c = dateStart;
		while(c.before(dateEnd)) {
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
