package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/** B1. Nhập tuổi hiện tại của bạn
    B2. Nhập thời gian đã ngủ trong ngày (giờ-phút)
    B3. Nhập thời gian bắt đầu ngủ
    B4. In ra thời gian bạn nên thức dậy để có một sức khỏe tốt */

public class Ex02 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		Scanner input = new Scanner(System.in);
		int age, hours, minutes, begin;
		do {
			System.out.print("Nhap so tuoi hien tai: ");
			age = input.nextInt();
			System.out.println("Nhap thoi gian da ngu: ");
			System.out.print("Gio: ");
			hours = input.nextInt();
			System.out.print("Phut: ");
			minutes = input.nextInt();
			System.out.print("Nhap thoi gian bat dau ngu: ");
			begin = input.nextInt();
			
			if (age < 0 || hours < 0 || minutes < 0 || begin < 0) {
				System.out.println("=================================");
				System.out.println("Nhap lai");
			}
		} while (age < 0 || hours < 0 || minutes < 0 || begin < 0);
		
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
