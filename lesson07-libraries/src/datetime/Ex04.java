package datetime;

/**
 * đếm xem tháng, năm hiện tại có bao nhiêu ngày chủ nhật
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private static int nos;
	public static void main(String[] args) {
		// Month - Year
		int nos = getNOSundays(9, 2021);
		System.out.println("nos: " + nos);
	}

	private static void getAllSundayInMonth(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, Calendar.FEBRUARY, 1);
		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			cal.add(Calendar.DATE, 1);
		}
		
		while (cal.get(Calendar.MONTH) == year) {
			System.out.println(df.format(cal.getTime()));
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
    // 
	private static int getNOSundays(int month, int year) {
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));// 30.10.2021
	   // System.out.println(" days: " + dateEnd.getActualMaximum(year));
		
		for(Calendar c = dateStart ; c.before(dateEnd); c.add(Calendar.DAY_OF_MONTH, 1)) {
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				nos ++;
			}
			
		}
		
		return nos;

	}
}
