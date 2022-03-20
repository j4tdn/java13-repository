package bai4;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so tuoi hien tai: ");
		int age = input.nextInt();
		System.out.println("Nhap thoi gian da ngu: ");
		System.out.print("Gio: ");
		int hours = input.nextInt();
		System.out.print("Phut: ");
		int minutes = input.nextInt();
		System.out.print("Nhap thoi gian bat dau ngu: ");
		int begin = input.nextInt();
		
		LocalTime end = LocalTime.now();
		LocalTime start = LocalTime.of(begin, 0);
		
		if (0 < age && age < 4) {
			end = start.plus(Duration.ofMinutes(20 * 60).minus(Duration.ofMinutes(hours * 60 + minutes)));
		} 
		if (age >= 4 && age <= 13) {
			end = start.plus(Duration.ofMinutes(11 * 60).minus(Duration.ofMinutes(hours * 60 + minutes)));
		} 
		if (age >= 14 && age <= 17) {
			end = start.plus(Duration.ofMinutes(9 * 60).minus(Duration.ofMinutes(hours * 60 + minutes)));
		} 
		if (age >= 18 && age <= 64) {
			end = start.plus(Duration.ofMinutes(8 * 60).minus(Duration.ofMinutes(hours * 60 + minutes)));
		} 
		if(age == 65) {
			Duration duration = Duration.ofMinutes(7 * 60 + 30).minus(Duration.ofMinutes(hours * 60 + minutes));
			end = start.plus(duration);
		}

		System.out.println("Thoi gian thuc day: " + dtf.format(end));
	}
}
