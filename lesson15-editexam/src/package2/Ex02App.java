package package2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex02App {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Tuổi: ");
		int age = Integer.parseInt(sc.nextLine());
		
		// B1: Tuổi ===> Thời gian cần ngủ tối thiểu
		//   : age, standardsleepTime => neededTime
		LocalTime neededSleepTime = getNeededSleepTime(age, getStandardSleepTime());
		System.out.println("Thời gian tối thiểu cần ngủ: " + neededSleepTime.getHour() + " hours, " + neededSleepTime.getMinute() + " minutes");
				
		System.out.println("Thời gian đã ngủ trong ngày: ");
		System.out.print("  + Số giờ: ");
		int sleptHours = Integer.parseInt(sc.nextLine());
		System.out.print("  + Số phút: ");
		int sleptMinutes = Integer.parseInt(sc.nextLine());
		LocalTime sleptTime = LocalTime.of(sleptHours, sleptMinutes);
		
		System.out.println("Thời gian bắt đầu ngủ: ");
		System.out.print("  + Giờ: ");
		int startedSleepHours = Integer.parseInt(sc.nextLine());
		System.out.print("  + Phút: ");
		int startedSleepMinutes = Integer.parseInt(sc.nextLine());
		LocalTime startedSleepTime = LocalTime.of(startedSleepHours, startedSleepMinutes);
		LocalTime wakeupTime = getWakeUpTime(neededSleepTime, sleptTime, startedSleepTime);
		System.out.println("Thời gian thức dậy: " + wakeupTime.getHour() + " hours, " + wakeupTime.getMinute() + " minutes");
		
	}
	
	private static LocalTime getWakeUpTime(LocalTime neededSleepTime, LocalTime sleptTime, LocalTime startedSleepTime) {
		
		// Thời gian cẩn ngủ(8), thời gian đã ngủ(2m 30), thời gian đi ngủ ===> Thời gian thức dậy
		// wakeUpTime = startedSleepTime + (neededTime - sleptTime)
		// Duration
		Duration remainingNeededSleepTime = Duration.between(sleptTime, neededSleepTime);
		
		//int remainingNeededSleepHours = remainingNeededSleepTime.toHoursPart();
		//int remainingNeededSleepMinutes = remainingNeededSleepTime.toMillisPart();
		
		//return startedSleepTime.plusHours(remainingNeededSleepHours).plusMinutes(remainingNeededSleepMinutes);
		
		if(remainingNeededSleepTime.isNegative()) {
			System.out.println("Hôm nay bạn đã ngủ quá nhiều rồi - Hệ thống không có gợi ý");
			System.exit(0);
		}
		
		return startedSleepTime.plusMinutes(remainingNeededSleepTime.toMinutes());
	}
	
	private static LocalTime getNeededSleepTime(int age, Map<AgeRange, LocalTime> standardSleepTimes) {
		for(Entry<AgeRange, LocalTime> standardSleepTime : standardSleepTimes.entrySet()) {
			if(standardSleepTime.getKey().contains(age)) {
				return standardSleepTime.getValue();
			}
		}
		// throw error || return default sleep time
		return LocalTime.of(10, 0);
		
	}
	
	private static Map<AgeRange, LocalTime> getStandardSleepTime() {
		return new HashMap<AgeRange, LocalTime>() {
			private static final long serialVersionUID = 1L;
			{
				put(AgeRange.init(1, 3), LocalTime.of(20, 0)); // 20
				put(AgeRange.init(4, 13), LocalTime.of(11, 0)); // 10 - 12
				put(AgeRange.init(14, 17), LocalTime.of(9, 0)); // 10 - 12
				put(AgeRange.init(18, 64), LocalTime.of(8, 0)); // 10 - 12
				put(AgeRange.init(65), LocalTime.of(7, 30)); // 10 - 12
			}
			
		};
	}
}
