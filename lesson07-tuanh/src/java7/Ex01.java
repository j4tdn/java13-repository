package java7;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import utils.DateTimeUtils;

/**
 * Bài tập 1: Làm theo Java7
 * Xây dựng ứng dụng The Ultimate Relationship Calculator
 * Nhập thời gian bắt đầu hẹn hò của 2 người.
 * Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
 * Nhấn Enter để thực hiện tính toán. Hỏi:
 * Ngày bắt đầu hẹn hò là ngày thứ mấy.
 * Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây.
 */

public class Ex01 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String dayStart;

		System.out.print("Enter Start Dating? (dd/MM/yyyy) ");
		dayStart = scanner.nextLine();
		dayLove(dayStart);
	}

	private static void dayLove(String daystartLove) {
		Calendar today = Calendar.getInstance();
		Calendar startDay = DateTimeUtils.toCalendar(daystartLove);
		
		System.out.print("Have they broken up yet? (yes/no)");
		String breakUp = scanner.nextLine();
		Calendar lastDay = Calendar.getInstance();
		
		long lastInMils = 0;
		if(breakUp.equals("yes")) {
			System.out.println("What time was you break up? (dd/MM/yyy)");
			lastDay = DateTimeUtils.toCalendar(scanner.nextLine());
			lastInMils = lastDay.getTimeInMillis();
		}else
			lastInMils = today.getTimeInMillis();
		
		String dayOfWeek = DateTimeUtils.getWeekDayAsString(startDay.get(Calendar.DAY_OF_WEEK));
		System.out.println("You was start dating on: " + dayOfWeek);
		
		if (startDay.after(today)) {
			throw new RuntimeException("Love cannot greated than today !");
		}

		long loveInMils = startDay.getTimeInMillis();

		long duration = lastInMils - loveInMils;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);

		System.out.println(days + " Day, " + hours + " Hour, " + minutes + " Minute, " + seconds + " Seconds " + duration + " millisSecond ");
	}
}




