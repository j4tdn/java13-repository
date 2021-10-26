package ex02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeekdayCalculator {
	private static String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
	private static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public static void main(String[] args) {
		
		
		try {
			Calendar date = validate(19,1,2001);
			weekdayCal(date);
			
		} catch (DateFormatException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	private static Calendar validate(int day, int month, int year) throws DateFormatException {
		GregorianCalendar c = new GregorianCalendar();
		if (day>=32 || day <=0) {
			throw new DateFormatException("A day can not be >= 32 or <= 0");
		}
		if(month<=0 || month>12 ) {
			throw new DateFormatException("A month can not be > 12 or <1!!");
		}
		if(year<=0) {
			throw new DateFormatException("Year cannot be < 0");
		}
		
		if((month==4||month==6||month==9||month==11)&&day==31) {
			throw new DateFormatException(month + "can not have 31 days");
		}
		if(month==2&&c.isLeapYear(year)&&day>29) {
			throw new DateFormatException("Is leap year, day cannot be > 29");
		}
		if(month==2&&(!c.isLeapYear(year))&&day>28) {
			throw new DateFormatException("Is not leap year, day cannot be >28");
		}
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DAY_OF_MONTH, day);
		date.set(Calendar.MONTH, (month-1));
		date.set(Calendar.YEAR, year);
		return date;
	}
	
	private static void weekdayCal(Calendar c) {
		GregorianCalendar isLeap = new GregorianCalendar();
		int daysMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int dayOfYear =  c.get(Calendar.DAY_OF_YEAR);
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + " "+ months[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR) + " is a " + dayOfWeeks[c.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println();
		System.out.println("Additional facts");
		System.out.println("It is day number " + dayOfYear + " of the year, " + (daysYear - dayOfYear) +" days left.");
		System.out.println("It is " + dayOfWeeks[c.get(Calendar.DAY_OF_WEEK)-1] + " number " + (dayOfYear/7 + (dayOfYear%7!=0 ? 1 : 0)) + " out of " + ((dayOfYear/7 + (dayOfYear%7!=0 ? 1 : 0)) + (daysYear-dayOfYear)/7) + " in " + c.get(Calendar.YEAR));
		System.out.println("It is " + dayOfWeeks[c.get(Calendar.DAY_OF_WEEK)-1] + " number " + (c.get(Calendar.DAY_OF_MONTH)/7+1) + " out of " + ((c.get(Calendar.DAY_OF_MONTH)/7+1) + (daysMonth-c.get(Calendar.DAY_OF_MONTH))/7) + " in " + months[c.get(Calendar.MONTH)] +" "+ c.get(Calendar.YEAR));
		System.out.println("Year " + c.get(Calendar.YEAR) + " has " + daysYear + " days");
		System.out.println(months[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR) + " has " + daysMonth + " days");
	}
}
