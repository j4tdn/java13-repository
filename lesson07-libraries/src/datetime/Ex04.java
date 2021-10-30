package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		getNumberOfSunday(Calendar.OCTOBER, 2021);
	}
	
	private static int getNumberOfSunday(int month, int year) {
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		for(Calendar c = dateStart; c.before(dateEnd); c.add(Calendar.DAY_OF_MONTH, 1)) {
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
			System.out.println(DateUtils.toString(c));
		}
		return 0;
	}
}
