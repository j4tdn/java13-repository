package baitap;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calendar startDay = Calendar.getInstance();
		System.out.println("enter start day: ");
		try {
			System.out.print("day: ");
			startDay.set(Calendar.DATE, Integer.parseInt(input.nextLine()));
			System.out.print("month: ");
			startDay.set(Calendar.MONTH,Integer.parseInt(input.nextLine())-1);
			System.out.print("year: ");
			startDay.set(Calendar.YEAR, Integer.parseInt(input.nextLine()));
		} catch (Exception e) {
			System.out.println("input date is not valid");
		}
		
		System.out.println("Did you guys break up? enter 'Y' for yes 'N' for no");
		String breakUp = input.nextLine();
		breakUp.toUpperCase();
		if("Y".equals(breakUp)) {
			System.out.println("Enter break up date: ");
			try {
				Calendar breakUpDay = Calendar.getInstance();
				System.out.print("day: ");
				breakUpDay.set(Calendar.DATE, Integer.parseInt(input.nextLine()));
				System.out.print("month: ");
				breakUpDay.set(Calendar.MONTH,Integer.parseInt(input.nextLine()) - 1);
				System.out.print("year: ");
				breakUpDay.set(Calendar.YEAR, Integer.parseInt(input.nextLine()));
			} catch (Exception e) {
				System.out.println("input date is not valid");
			}
		} else {
			Calendar currentDay = Calendar.getInstance();
			int dow = startDay.get(Calendar.DAY_OF_WEEK);		
			String [] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
			System.out.println("Start day is : "+ dayOfWeeks[dow-1]);
			int y = currentDay.get(Calendar.YEAR)- startDay.get(Calendar.YEAR);
			int days = y*365 - startDay.get(Calendar.DAY_OF_YEAR) + currentDay.get(Calendar.DAY_OF_YEAR);
			System.out.println("Your relationship: ");
			System.out.println( y + " Year(s) " + days%365 + " days");
			System.out.println( days + " days");
			System.out.println( days*24 + " hours");
			System.out.println( days*24*60 + " minutes");
			System.out.println( days*24*60*60 + " seconds");
		}
	}
}
