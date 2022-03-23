package package02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Ex02App {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Tuổi: ");
		int age = Integer.parseInt(ip.nextLine());
		
		LocalTime neededSleepTime = getNeededSleepTime(age, getStandardSleepTimes());
		System.out.println("Thời gian tối thiểu cần ngủ mỗi ngày: " 
				+ neededSleepTime.getHour() + " hours" + (neededSleepTime.getMinute() > 0 ? ", " + neededSleepTime.getMinute() + " minutes" : "") );
		
		System.out.println("====================================");
		
		System.out.println("Thời gian đã ngủ trong ngày");
		System.out.print("  + Số giờ: ");
		int sleptHours = Integer.parseInt(ip.nextLine());
		System.out.print("  + Số phút: ");
		int sleptMinutes = Integer.parseInt(ip.nextLine());
		LocalTime sleptTime = LocalTime.of(sleptHours, sleptMinutes);
		
		System.out.println("Thời gian bắt đầu ngủ");
		System.out.print("  + Giờ: ");
		int startedSleepHours = Integer.parseInt(ip.nextLine());
		System.out.print("  + Phút: ");
		int startedSleepMinutes = Integer.parseInt(ip.nextLine());
		LocalTime startedSleepTime = LocalTime.of(startedSleepHours, startedSleepMinutes);
	
		LocalTime wakeupTime = getWakeupTime(neededSleepTime, sleptTime, startedSleepTime);
		System.out.println("Thời gian thức dậy: " 
				+ wakeupTime.getHour() + " hours" + (wakeupTime.getMinute() > 0 ? ", " + wakeupTime.getMinute() + " minutes" : "") );
	}
	
	private static LocalTime getWakeupTime(LocalTime neededSleepTime, 
				LocalTime sleptTime, LocalTime startedSleepTime) {
		Duration remainingNeededSleepTime = Duration.between(sleptTime, neededSleepTime);
		if (remainingNeededSleepTime.isNegative()) {
			System.out.println("Hôm nay bạn đã ngủ quá nhiều rồi - Hệ thống không có gợi ý");
			System.exit(0);
		}
		
		System.out.println("remainingNeededSleepTime: " + remainingNeededSleepTime);
		return startedSleepTime.plusMinutes(remainingNeededSleepTime.toMinutes());
	}
	
	private static LocalTime getNeededSleepTime(int age, Map<AgeRange, LocalTime> standardSleepTimes) {
		for (Entry<AgeRange, LocalTime> standardSleepTime: standardSleepTimes.entrySet()) {
			if (standardSleepTime.getKey().contains(age)) {
				return standardSleepTime.getValue();
			}
		}
		// throw error || return default sleep time
		return LocalTime.of(10, 0);
	}
	
	private static Map<AgeRange, LocalTime> getStandardSleepTimes() {
		return new HashMap<AgeRange, LocalTime>() {
			private static final long serialVersionUID = -6186346563674004230L;
			{
				put(AgeRange.of(1, 3), LocalTime.of(20, 0));   // 20
				put(AgeRange.of(4, 13), LocalTime.of(11, 0));  // 10-12
				put(AgeRange.of(14, 17), LocalTime.of(9, 0));  // 08-10
				put(AgeRange.of(18, 64), LocalTime.of(8, 0));  // 07-09
				put(AgeRange.of(65)    , LocalTime.of(7, 30)); // 07-08
			}
		};
	}
	
	
}
