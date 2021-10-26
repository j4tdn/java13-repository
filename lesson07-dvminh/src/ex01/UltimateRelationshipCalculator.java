package ex01;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UltimateRelationshipCalculator {
	private static final int DAY_OF_MONTH = 0;
	private static final int MONTH = 0;
	private static final int YEAR = 0;
	private static final int HOUR_OF_DAY = 0;
	private static final int MINUTE = 0;
	private static final int SECOND = 0;
	private static final int DAY_OF_WEEK = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		System.out.println("Nhập ngày hẹn hò");
		System.out.println("Tháng: ");
		int startMonth = Integer.parseInt(sc.nextLine());
		System.out.println("Ngày: ");
		int startDay = Integer.parseInt(sc.nextLine());
		System.out.println("Năm: ");
		int startYear = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập thời gian cụ thể ");
		System.out.println("Giờ: ");
		int startHour = Integer.parseInt(sc.nextLine());
		System.out.println("Phút: ");
		int startMinute = Integer.parseInt(sc.nextLine());
		System.out.println("Giây: ");
		int startSecond = Integer.parseInt(sc.nextLine());
		
		start.set(DAY_OF_MONTH, startDay);
		start.set(MONTH, startMonth - 1);
		start.set(YEAR, startYear);
		start.set(HOUR_OF_DAY, startHour);
		start.set(MINUTE, startMinute);
		start.set(SECOND, startSecond);
		
		System.out.println("Bạn đã chia tay chưa(Nhập yes nếu đã chia tay và no nếu chưa)");
		String check = sc.nextLine();
		if (check.equals("yes")) {
			System.out.println("Nhập ngày chia tay");
			System.out.println("Tháng: ");
			int endMonth = Integer.parseInt(sc.nextLine());
			System.out.println("Ngày: ");
			int endDay = Integer.parseInt(sc.nextLine());
			System.out.println("Năm: ");
			int endYear = Integer.parseInt(sc.nextLine());
			System.out.println("Nhập thời gian cụ thể ");
			System.out.println("Giờ: ");
			int endHour = Integer.parseInt(sc.nextLine());
			System.out.println("Phút: ");
			int endMinute = Integer.parseInt(sc.nextLine());
			System.out.println("Giây: ");
			int endSecond = Integer.parseInt(sc.nextLine());
			
			end.set(DAY_OF_MONTH, endDay);
			end.set(MONTH, endMonth - 1);
			end.set(YEAR, endYear);
			end.set(HOUR_OF_DAY, endHour);
			end.set(MINUTE, endMinute);
			end.set(SECOND, endSecond);
		}
		
		DayOfWeek[] d = DayOfWeek.values();
		System.out.println("Ngày mắt đầu hẹn hò là thứ:" + d[start.get(DAY_OF_WEEK) - 1]);

		if (end.before(start)) {
			throw new RuntimeException("Bạn đã nhập sai!");
		}


		long month = 0;
		Calendar tmp = Calendar.getInstance();
		do
		{
			tmp = (Calendar) start.clone();
			tmp.add(MONTH, 1);
			if (tmp.before(end) || tmp.equals(end)) {
				start =tmp;
				month++;
			} else {
				break;
			}
			
		} while (true);
		
		long year = month / 12;
		month = month % 12;
		
		long startMillis = start.getTimeInMillis();
		long endMillis = end.getTimeInMillis();
		long duration = endMillis - startMillis;
		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);

		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
		long minute = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);

		long remainingSecond = remainingMinutes - TimeUnit.MINUTES.toMillis(minute);
		long second = TimeUnit.MILLISECONDS.toSeconds(remainingSecond);
		System.out.println(year +" năm " + month +" tháng " + days +" ngày " + hours +" giờ "+ minute +" giây " + second +" phút");
		
	}

}
