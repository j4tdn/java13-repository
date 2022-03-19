package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
/**
 *	Tuổi 22 => Cần ngủ 7-9H / ngày => Trung bình: 8H = (7+9) / 2
	Đã ngủ: 1H15P
	Còn lại: 8H - 1H15P = 6H45P
	Đi ngủ: 23H
	=> Bạn nên thức dậy: 23H + 6H45 = 5H45 sáng
 *
 */
public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhap tuoi hien tai cua ban: ");
		int age = sc.nextInt();
		
		LocalTime sleptTime = getTime("Nhap thoi gian da ngu trong ngay: ");
		LocalTime startSleepTime = getTime("Nhap thoi gian bat dau ngu: ");

		wakeUpTime(age, sleptTime, startSleepTime);
	}

	private static void wakeUpTime(int age, LocalTime sleptTime, LocalTime startSleepTime) {
		LocalTime wakeUpTime = null;
		LocalTime requiredTime = null;
		if(1 <= age && age <= 3) {
			requiredTime = LocalTime.of(20, 0);
		}
		if(4 <= age && age <= 13) {
			requiredTime = LocalTime.of(11, 0);
		}
		if(14 <= age && age <= 17) {
			requiredTime = LocalTime.of(9, 0);
		}
		if(18 <= age && age <= 64) {
			requiredTime = LocalTime.of(8, 0);
		}
		else {
			requiredTime = LocalTime.of(7, 30);
		}
		
		long totalSecond = Duration.between(sleptTime, requiredTime).toSeconds();
		long requiredHour = totalSecond/3600;
		long requiredMinute = (totalSecond % 3600) / 60;
		wakeUpTime = startSleepTime.plusHours(requiredHour).plusMinutes(requiredMinute);
		System.out.println("\n===============================================\n");
		System.out.println("Tuoi : " + age);
		System.out.println("Thoi gian ngu toi thieu: " + requiredTime);
		System.out.println("Thoi gian da ngu: " + sleptTime);
		System.out.println("Thoi gian bat dau ngu: " + startSleepTime);
		System.out.println("=> Ban nen thuc day luc: " + wakeUpTime);
	}

	private static LocalTime getTime(String str) {
		System.out.println(str);
		System.out.print("Gio: ");
		int hour = sc.nextInt();
		System.out.print("Phut: ");
		int minute = sc.nextInt();
		return LocalTime.of(hour, minute);
	}
}
