package ex02;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Input hours sleeped: ");
		int hoursSleeped = Integer.parseInt(sc.nextLine());
		System.out.println("Input minutes sleeped: ");
		int minutesSleeped = Integer.parseInt(sc.nextLine());
		System.out.println("Input time to go to the bed: ");
		int sleepTime = Integer.parseInt(sc.nextLine());
		
		int totalTimeSleepedByMinutes = (hoursSleeped * 60) + minutesSleeped;
		int idealTime = 0;
		if(age >= 1 && age <= 3) {
			idealTime = 20 * 60;
			
		} else if(age >= 4 && age <= 13) {
			idealTime = 11 * 60;
		} else if(age >= 14 && age <= 17) {
			idealTime = 9 * 60;
		} else if(age >= 18 && age <= 64) {
			idealTime = 8 * 60;
		} else {
			idealTime = 870;
		}
		
		int timeToWakeUp = (sleepTime * 60) + (idealTime - totalTimeSleepedByMinutes);
		
		if(timeToWakeUp > (24 * 60)) {
			timeToWakeUp -= 24 * 60;
		}
		System.out.println((timeToWakeUp / 60) + "H" + (timeToWakeUp % 60) + "M");
	}
}
