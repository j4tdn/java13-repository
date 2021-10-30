package datetime;

import java.util.Calendar;

import utils.DateUtils;

/*
 * Đếm xem số ngày chủ nhật của tháng năm bất kỳ
 *  */
public class Ex04 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println(getNumberOfSundays(Calendar.OCTOBER, 2021));
	}
	
	private static int getNumberOfSundays(int month, int year) {
		
		int nos = 0;
		Calendar dayStartOfMonth = DateUtils.toCalendar(year, month, 1);
		
		Calendar dayEndOfMonth = DateUtils.toCalendar(year, month, dayStartOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		for(Calendar c = dayStartOfMonth; c.before(dayEndOfMonth); c.add(Calendar.DAY_OF_MONTH, 1)) {
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				nos++;
			}
		}
		
		return nos;
	}
}
