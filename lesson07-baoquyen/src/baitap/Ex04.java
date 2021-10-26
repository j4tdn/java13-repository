package baitap;

import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();
		day.set(2021, 10, 27);
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(day.getTimeInMillis());
		int count = 0 - holiday(day);
		while(count <= 110 ) {
			if(c.get(Calendar.DAY_OF_WEEK) != 7 && c.get(Calendar.DAY_OF_WEEK) != 1 ) {
				count++;
			}
			if(c.get(Calendar.DATE) <= c.getActualMaximum(Calendar.DAY_OF_MONTH)) {
				c.set(Calendar.DATE, c.get(Calendar.DATE) + 1);
			}
			else if (c.get(Calendar.MONTH) <= c.getActualMaximum(Calendar.MONTH)) {
				c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);
				c.set(Calendar.DATE, 1);
			}else {
				c.set(Calendar.MONTH, 0);
				c.set(Calendar.DATE, 1);
			}
		}
		System.out.println("release day: " + c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1 ) + "/" +c.get(Calendar.YEAR) );
		
	}
	
	private static int holiday (Calendar day) {
		Calendar dayOff = Calendar.getInstance();
		dayOff.set(day.get(Calendar.YEAR),11,29);
		int count = 0;
		while(dayOff.get(Calendar.DATE) != 6) {
			if(dayOff.get(Calendar.DAY_OF_WEEK) != 7 && dayOff.get(Calendar.DAY_OF_WEEK) != 1 ) {
				count++;
			}	
			if(dayOff.get(Calendar.DATE) <= dayOff.getActualMaximum(Calendar.DAY_OF_MONTH)) {
				dayOff.set(Calendar.DATE, dayOff.get(Calendar.DATE) + 1);
			} else {
				dayOff.set(Calendar.MONTH,0);
				dayOff.set(Calendar.DATE, 1);
			}
		}
		return count;
	}		
	
}
