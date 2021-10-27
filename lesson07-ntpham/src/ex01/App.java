package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2018, Calendar.JANUARY, 21);
		System.out.println("Thời gian bắt đầu hẹn hò: " + dayFormat(c));
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("Ngày bắt đầu hẹn hò là thứ: " + dowEnum[c.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("Mối tình đã bắt đầu được: " + convert(c));
	}

	public static String dayFormat(Calendar c) {
		LocalDate date = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateAsString = date.format(formatter);
		return dateAsString;
	}

	public static String convert(Calendar c) {
		LocalDate startDate = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
				c.get(Calendar.DAY_OF_MONTH));
		LocalDate currentDate = LocalDate.now();
		LocalTime startTime = LocalTime.of(0, 0, 0);
		LocalTime currentTime = LocalTime.now();

		Period period = Period.between(startDate, currentDate);
		Duration duration = Duration.between(startTime, currentTime);

		long seconds = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(seconds);
		seconds = seconds - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(seconds);
		seconds = seconds - TimeUnit.MINUTES.toSeconds(minutes);

		return "" + period.getYears() + " năm " + period.getMonths() + " tháng " + period.getDays() + " ngày " + hours
				+ " giờ " + minutes + " phút " + seconds + " giây! ";
	}
}
