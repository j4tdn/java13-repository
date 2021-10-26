package baitap;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		currentTime(date);
		lastDayOfMonth(date);
		firstAndLastDay(date);
		weekOfyear(date);
		twentyDayslater(date);
		System.out.print("Enter your day of birth: ");
		Calendar birthDay = Calendar.getInstance();
		birthDay = validDay();
		System.out.println("You lived: " + myDay(birthDay) +" days.");
	}
	
	private static void currentTime(Calendar date) {
		int day = date.get(Calendar.DATE);
		int month = date.get(Calendar.MONTH) + 1;
		int year = date.get(Calendar.YEAR);
		int hour = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		System.out.println("Current time: " + day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second );
	}
	
	private static void lastDayOfMonth(Calendar date) {
		System.out.println("Last day of current month: " + date.getActualMaximum(Calendar.DAY_OF_MONTH) + "/" + (date.get(Calendar.MONTH)+1) + "/" + date.get(Calendar.YEAR) );
	}
	
	private static void firstAndLastDay(Calendar date) {
		Calendar firstDayOFWeek = Calendar.getInstance();
		firstDayOFWeek.setTimeInMillis(date.getTimeInMillis());
		firstDayOFWeek.add(Calendar.DAY_OF_MONTH, date.getFirstDayOfWeek()- date.get(Calendar.DAY_OF_WEEK)); 
		System.out.println("First day of week: " + firstDayOFWeek.get(Calendar.DATE) + "/" + (firstDayOFWeek.get(Calendar.MONTH) +1) + "/" + firstDayOFWeek.get(Calendar.YEAR));
	
		Calendar lastDayOFWeek = Calendar.getInstance();
		lastDayOFWeek.setTimeInMillis(date.getTimeInMillis());
		lastDayOFWeek.add(Calendar.DAY_OF_MONTH, date.getFirstDayOfWeek()- date.get(Calendar.DAY_OF_WEEK) + 6); 
		System.out.println("Last day of week: " + lastDayOFWeek.get(Calendar.DATE) + "/" + (lastDayOFWeek.get(Calendar.MONTH) +1) + "/" + lastDayOFWeek.get(Calendar.YEAR));
	}
	
	private static void weekOfyear(Calendar date) {
		int dayOfYear = date.get(Calendar.DAY_OF_YEAR);
		int dayOfWeek = dayOfYear/7;
		if(dayOfYear % 7 != 0) {
			dayOfWeek = dayOfWeek +1;
		}
				
		System.out.println( "It is week number " + dayOfWeek 
							+ " out of " +(dayOfWeek + (date.getActualMaximum(Calendar.DAY_OF_YEAR)-dayOfYear)/7) + " in " + date.get(Calendar.YEAR));
	}
	
	private static void twentyDayslater(Calendar date) {
		Calendar day = Calendar.getInstance();
		day.setTimeInMillis(date.getTimeInMillis());
		int currentDay = date.get(Calendar.DATE);
		int maxDayOfMonth = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		if (currentDay + 20 <= maxDayOfMonth) {
			day.add(Calendar.DATE, currentDay + 20);
		} else {
			int crMonth = date.get(Calendar.MONTH);
			int addDay = 20 - (maxDayOfMonth - currentDay);
			day.set(Calendar.MONTH, crMonth + 1);
			day.set(Calendar.DATE, addDay);
		}
		System.out.println("20 day later of " +date.get(Calendar.DATE) + "/" + (date.get(Calendar.MONTH)+1) + "/" + date.get(Calendar.YEAR) +  " is " 
				+ day.get(Calendar.DATE) + "/" + (day.get(Calendar.MONTH)+1) + "/" + day.get(Calendar.YEAR));
	}
	
	private static long myDay(Calendar birthDay) {
		GregorianCalendar calendar = new GregorianCalendar();
		long time = 0;
		Calendar  currentTime = Calendar.getInstance();
		int birthY = birthDay.get(Calendar.YEAR) + 1;
		int currentY = currentTime.get(Calendar.YEAR);
		time = birthDay.getActualMaximum(Calendar.DAY_OF_YEAR) -  birthDay.get(Calendar.DAY_OF_YEAR);
		while(birthY < currentY ) {
			time += (calendar.isLeapYear(birthY)?366:365);
			birthY++;
		}
		time = time + currentTime.get(Calendar.DAY_OF_YEAR);
		return time;
	}
	
	private static String enterYear() {
		Scanner input = new Scanner(System.in);
		String yearAsString;
		do{
			System.out.print("Enter year (valid number): ");
			yearAsString = input.nextLine();
			
		}while(!yearAsString.matches("\\d+"));
		return yearAsString;
	}
	
	private static String  enterMonth() {
		Scanner input = new Scanner(System.in);
		String monthAsString;
		do {
			System.out.print("Enter month:");
			monthAsString = input.nextLine();
		}while (!monthAsString.matches("\\d+"));
		
		return monthAsString;
	}
	
	private static String  enterDay() {
		Scanner input = new Scanner(System.in);
		String dayAsString;
		do {
			System.out.print("Enter day:");
			dayAsString = input.nextLine();
		}while (!dayAsString.matches("\\d+"));
		return dayAsString;
	}
	
	private static Calendar validDay() {
		Calendar date = Calendar.getInstance();
		int year = Integer.parseInt(enterYear());
		date.set(Calendar.YEAR, year);
		int month = 0;
		while (month > 12 || month < 1) {
			month = Integer.parseInt(enterMonth());
		}
		date.set(Calendar.MONTH, month - 1);
		
		int day = 0;
		int maxDay = date.getActualMaximum(Calendar.DATE);
		do {
			day = Integer.parseInt(enterDay());
		} while (day < 1 || day > maxDay);
		date.set(Calendar.DATE, day);
				
		return date;
	}
}
