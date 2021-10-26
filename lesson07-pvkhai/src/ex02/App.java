package ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Date date = null;
		while(true) {
			try {
				date = EnterDate();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		String dayOfWeek = dayOfWeek(date);
		String month = monthString(date);
		System.out.println(date.getDate() + " " + month+ " " + (date.getYear()+1900) + " is a " + dayOfWeek);
		dayOfYear(date);
		dayOfWeekInYear(date);
		dayOfWeekInMonth(date);
		numberDayOfYear(date);
		numberDayOfMonth(date);
	}
	
	private static String monthString(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		String[] monthsString= {"January", "February", "Match", "April", "May", "June", "July", "August"
								, "September", "October", "November", "December"};
		int m = cal.get(Calendar.MONTH);
		return monthsString[m];
	}
	
	private static void numberDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		String month = monthString(date);
		int year = cal.get(Calendar.YEAR);
		
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(month + " " + year + " has " + day + " days");
	}
	
	private static void numberDayOfYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		int year = cal.get(Calendar.YEAR);
		
		GregorianCalendar gc = new GregorianCalendar();
		int number = gc.isLeapYear(year) ? 366 : 365;
		
		System.out.println("Year " + year + " has " + number + " days");
	}
	
	private static void dayOfWeekInYear(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		String dayOfWeek = dayOfWeek(date);
		int year = cal.get(Calendar.YEAR);
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		int number = dayOfYear/7 + (dayOfYear%7 != 0 ? 1:0) ;
		
		int lastDayYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		int outof = dayOfYear/7 + (dayOfYear%7!=0 ? 1:0) + (lastDayYear-dayOfYear)/7;
		
		System.out.println("It is " + dayOfWeek + " number " + number + " out of " + outof + " in " + year);

	}
	
	private static void dayOfWeekInMonth(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		int numberDay = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		String dayOfWeek = dayOfWeek(date);
		String month = monthString(date);
		
		int year = cal.get(Calendar.YEAR);
		
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int outof = numberDay + (lastDayOfMonth - cal.get(Calendar.DAY_OF_MONTH)) / 7;
		
		System.out.println("It is " + dayOfWeek + " number " + numberDay + " out of " + outof + " in " + month + " " + year);
		
		
		
	}
	
	private static String dayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		String[] dayOfWeeks= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		return dayOfWeeks[dow - 1];
	}
	
	private static void dayOfYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		GregorianCalendar gc = new GregorianCalendar();
		int leftDay = gc.isLeapYear(cal.get(Calendar.YEAR)) ?  (366 - dayOfYear) : (365 - dayOfYear);
		
		System.out.println("It is number " + dayOfYear + " of the year, " + leftDay + " left day");
		
	}
	
	private static Date EnterDate() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day: ");
		int day = sc.nextInt();
		if(day < 1 || day > 31) {
			throw new Exception("day no valid");
		}
		
		System.out.println("enter month: ");
		int month = sc.nextInt();
		GregorianCalendar gc = new GregorianCalendar();
		if(month < 1 || month > 12) {
			throw new Exception("month no vlaid");
		}
		if((month==4||month==6||month==9||month==11)&&day==31) {
			throw new Exception("month" + month + "can not have 31 days");
		}
		if(month==2 && day > 29) {
			throw new Exception("February can not have > 29");
		}
		System.out.println("enter year: ");
		int year = sc.nextInt();
		
		if(month==2 && !gc.isLeapYear(year) && day > 28) {
			throw new Exception("February can not have > 28");
		}
		
		
		String timeString = "" + day + "/" + month + "/" +year;
 		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(f.parse(timeString));
		Date date = cal.getTime();

		return date;
	}
	
	
}	
