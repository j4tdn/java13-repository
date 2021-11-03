package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

/**
 * Đếm xem tháng, năm hiện tại có bao nhiêu ngày chủ nhật
 * */
public class Ex04 {
	public static void main(String[] args) {
		//Month - year
		int nos = getNOSundays(Calendar.OCTOBER, 2021);
		System.out.println("nos: " + nos);
	}
	
	private static int getNOSundays(int month, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		for(Calendar c = dateStart; c.before(dateEnd); c.add(Calendar.DAY_OF_MONTH, 1)) {
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				nos++;
			}
		}
		
		return nos;
	}
}
