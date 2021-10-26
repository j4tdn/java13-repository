package baitap;

import java.util.Calendar;
import java.util.Scanner;


	
public class Ex02 {
	
	
	public static void main(String[] args) {
		Calendar date; 
		date = validDay();
		String [] months = {"January", "February", "March" , "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String [] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
		int dow = date.get(Calendar.DAY_OF_WEEK);
		int month = date.get(Calendar.MONTH);
		System.out.println(date.get(Calendar.DATE) + " " + months[month] + " " + date.get(Calendar.YEAR) + " is a " + dayOfWeeks[dow-1]);
		System.out.println("Addition fact: ");
		int doy = date.getActualMaximum(Calendar.DAY_OF_YEAR);
		int dayOfYear = date.get(Calendar.DAY_OF_YEAR);
		System.out.println("it is day number " + dayOfYear + " of the year "+  (doy - dayOfYear ) + " day left.");
		int dayOfWeek = dayOfYear/7;
		if(dayOfYear % 7 != 0) {
			dayOfWeek = dayOfWeek +1;
		}		
		System.out.println("It is " + dayOfWeeks[dow - 1] + " number " + dayOfWeek 
							+ " out of " +(dayOfWeek + (doy-dayOfYear)/7) + " in " + date.get(Calendar.YEAR));
		
		System.out.println("It is " + dayOfWeeks[dow - 1] + " number " +  (date.get(Calendar.DAY_OF_MONTH)/7 + 1)
		+ " out of " +(date.get(Calendar.DAY_OF_MONTH)/7 + 1 + (date.getActualMaximum(Calendar.DATE)-date.get(Calendar.DAY_OF_MONTH))/7)+ " in " + date.get(Calendar.YEAR));
		System.out.println("Year " + date.get(Calendar.YEAR) + " has " + doy + " days");
		System.out.println(months[date.get(Calendar.MONTH) ] + " " + date.get(Calendar.YEAR) + " has " + date.getActualMaximum(Calendar.DATE));
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
