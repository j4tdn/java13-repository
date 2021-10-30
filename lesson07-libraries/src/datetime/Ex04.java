package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		
		System.out.println("nos: " + getNoOfSunday(Calendar.OCTOBER, 2021));
		
	}
	
	private static int getNoOfSunday(int month, int year) {
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		int count= 0;
		Calendar c = dateStart;
		while(c.before(dateEnd)) {
			if(c.get(Calendar.DAY_OF_WEEK ) != Calendar.SUNDAY) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			}
			count++;
			c.add(Calendar.DAY_OF_MONTH, 7);
		}
		return count;
	}
	
}
