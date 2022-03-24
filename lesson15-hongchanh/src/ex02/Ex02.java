package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhập tuổi hiện tại: ");
		int age = sc.nextInt();
		
		LocalTime sleptTime = getTime("thời gian đã ngủ: ");
		LocalTime startSleepTime = getTime("thời gian bắt đầu ngủ: ");

		wakeUpTime(age, sleptTime, startSleepTime);
	}

	// good way - e có thể tham khảo cách a làm để biết thêm solution nha
	private static void wakeUpTime(int age, LocalTime time1, LocalTime time2) {
		LocalTime wakeUpTime = null;
		LocalTime sleep = null;
		
		if(1 <= age && age <= 3) {
			sleep = LocalTime.of(20, 0);
		}
		if(4 <= age && age <= 13) {
			sleep = LocalTime.of(11, 0);
		}
		if(14 <= age && age <= 17) {
			sleep = LocalTime.of(9, 0);
		}
		if(18 <= age && age <= 64) {
			sleep = LocalTime.of(8, 0);
		}
		else {
			sleep = LocalTime.of(7, 30);
		}
		
		long sum = Duration.between(time1, sleep).toSeconds();
		
		long h = sum/3600;
		long m = (sum % 3600) / 60;
		wakeUpTime = time2.plusHours(h).plusMinutes(m);

		System.out.println("tuổi : " + age);
		System.out.println("thời gian cần ngủ: " + sleep);
		System.out.println("thời gian đã ngủ: " + time1);
		System.out.println("bắt đầu ngủ: " + time2);
		System.out.println("=> nên thức dậy: " + wakeUpTime);
	}

	private static LocalTime getTime(String s) {
		System.out.println(s);
		System.out.print("giờ: ");
		int hour = sc.nextInt();
		System.out.print("phút: ");
		int minute = sc.nextInt();
		return LocalTime.of(hour, minute);
	}
}