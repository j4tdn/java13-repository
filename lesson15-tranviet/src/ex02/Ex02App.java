package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *	Tuổi 22 => Cần ngủ 7-9H / ngày => Trung bình: 8H = (7+9) / 2
	Đã ngủ: 1H15P
	Còn lại: 8H - 1H15P = 6H45P
	Đi ngủ: 23H
	=> Bạn nên thức dậy: 23H + 6H45 = 5H45 sáng
 * ==> Good
 */
public class Ex02App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhap tuoi hien tai cua ban: ");
		int age = Integer.parseInt(sc.nextLine());
		LocalTime sleptTime = getTime("Nhap thoi gian da ngu trong ngay: ");
		LocalTime startSleepTime = getTime("Nhap thoi gian bat dau ngu: ");
		System.out.println("\n======================================\n");
		LocalTime minimumSleepTimeByAge = getMinimumSleepTimeByAge(age);
		System.out.println("Thoi gian toi thieu can ngu la: " + minimumSleepTimeByAge);
		System.out.println("Thoi gian da ngu: " + sleptTime);
		System.out.println("Thoi gian bat dau ngu: " + startSleepTime);
		LocalTime wakeUpTime = getWakeUpTime(sleptTime, startSleepTime, minimumSleepTimeByAge);
		System.out.println("Thoi gian nen thuc day: " + wakeUpTime);

	}
	private static LocalTime getWakeUpTime(LocalTime sleptTime, LocalTime startSleepTime, LocalTime minimumSleepTimeByAge){
		Duration duration = Duration.between(sleptTime, minimumSleepTimeByAge);
		return startSleepTime.plusMinutes(duration.toMinutes());
	}
	private static LocalTime getMinimumSleepTimeByAge(int age) {
		for (Map.Entry<TimeRange, LocalTime> entry: suitableSleepTimeByAge().entrySet()){
			if(entry.getKey().contains(age)){
				return entry.getValue();
			}
		}
		return LocalTime.of(10, 0);
	}

	private static Map<TimeRange, LocalTime> suitableSleepTimeByAge() {
		return new HashMap<>(){
			{
				put(TimeRange.of(1,3), LocalTime.of(20, 0));
				put(TimeRange.of(4,13), LocalTime.of(11, 0));
				put(TimeRange.of(14,17), LocalTime.of(9, 0));
				put(TimeRange.of(18,64), LocalTime.of(8, 0));
				put(TimeRange.of(65, Integer.MAX_VALUE), LocalTime.of(7,30));
			}
		};
	}
	private static LocalTime getTime(String str) {
		System.out.println(str);
		System.out.print("Gio: ");
		int hour = Integer.parseInt(sc.nextLine());
		System.out.print("Phut: ");
		int minute = Integer.parseInt(sc.nextLine());
		return LocalTime.of(hour, minute);
	}
}
