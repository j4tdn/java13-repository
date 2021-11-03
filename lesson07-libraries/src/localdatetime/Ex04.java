package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04 {
	
	private static final String pattern = "HH:mm:ss dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDateTime start = LocalDateTime.parse("15:20:40 01/01/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("20:25:45 01/01/2018", dtf);
		
		if (start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exeed dateEnd !!!");
		}
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();
		
		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
		
		if (endTime.isBefore(startTime)) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}
		
		period = Period.between(startDate, endDate.minusDays(1));
		
		System.out.println(period.getYears() + " years\n" +
				   period.getMonths() + " month\n" +
				   period.getDays() + " days\n" +
				   duration.toHoursPart() + " hour\n" +
				   duration.toMinutesPart() + " minutes\n" +
		           duration.toSecondsPart() + " seconds");
	}
}
