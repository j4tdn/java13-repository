package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DayAsString;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2021, Calendar.NOVEMBER, 3);
		
		System.out.println("thoi gian bat dau " + dateBegin(c));
		
		DayAsString[] dayAsString = DayAsString.values();
		System.out.println("ngay hen ho la: " + dayAsString[c.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("moi quan he keo dai: " + convert(c));
	}
	
	public static String dateBegin(Calendar c) {
		LocalDate d = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		String asString = d.format(format);
		return asString;
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

		return "" + period.getYears() + " nam " + period.getMonths() + " thang " + period.getDays() + " ngay " + hours
				+ " gio " + minutes + " phut " + seconds + " giay! ";
	}
}
