package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * 
 * B1. Nhập tuổi hiện tại của bạn
 * B2. Nhập thời gian đã ngủ trong ngày (giờ-phút)
 * B3. Nhập thời gian bắt đầu ngủ
 * B4. In ra thời gian bạn nên thức dậy để có một sức khỏe tốt
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		do {
			System.out.println("Nhập tuổi: ");
			age = input.nextInt();
		} while (age <= 0);
		System.out.println("Thời gian đã ngủ: ");
		System.out.print("- Giờ: ");
		int hour = input.nextInt();
		System.out.print("- Phút: ");
		int minute = input.nextInt();
		LocalTime sleptedTime = LocalTime.of(hour, minute);
		System.out.println("Thời gian bắt đầu ngủ:");
		System.out.print("- Giờ: ");
		int startHour = input.nextInt();
		System.out.print("- Phút: ");
		int StartMinute = input.nextInt();
		LocalTime startSleptTime = LocalTime.of(startHour, StartMinute);
		LocalTime result = wakeUpTime(age, sleptedTime, startSleptTime);
		System.out.println("" + result);
	}
	
	// Good solution - E có thể tham khảo thêm cách hồi tối a hướng dẫn nha
	public static LocalTime wakeUpTime(int age, LocalTime sleptTime, LocalTime startSleptTime) {
		LocalTime wakeUpTime = null;
		long duration = 0;
		if(age <= 3) {
			duration = Duration.between(sleptTime, LocalTime.of(20, 0)).toMinutes();
		}
		else if (age <= 13) {
			duration = Duration.between(sleptTime, LocalTime.of(11, 0)).toMinutes();
		}
		else if (age <= 17) {
			duration = Duration.between(sleptTime, LocalTime.of(9, 0)).toMinutes();
		}
		else if (age <= 64) {
			duration = Duration.between(sleptTime, LocalTime.of(8, 0)).toMinutes();
		}
		else {
			duration = Duration.between(sleptTime, LocalTime.of(7, 30)).toMinutes();
			
		}
		int plusHour =  (int)duration / 60;
		int plusMinute =  (int)duration % 60;
		wakeUpTime = startSleptTime.plusHours(plusHour).plusMinutes(plusMinute);
		return wakeUpTime;
	}
}
