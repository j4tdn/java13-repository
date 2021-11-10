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
		LocalDateTime start = LocalDateTime.parse("15:20:30 15/08/2018", dtf);
		LocalDateTime end   = LocalDateTime.parse("14:22:24 13/06/2020", dtf);
		
		if(start.isAfter(end)) {
			throw new IllegalArgumentException("Fail");
		}
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate   = end.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime   = end.toLocalTime();
		
		
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
		
		if(startDate.isBefore(endDate)) {
			duration = duration.plusDays(1);
			endDate = 	endDate.minusDays(1);
		}
		
		Period period = Period.between(startDate, endDate);
		
		System.out.println(period.getYears() +"/"+ period.getMonths() +"/" + period.getDays());
		System.out.println(duration.toHoursPart() +":"+
				   duration.toMinutesPart() + ":"+
				   duration.toSecondsPart());	
	}
}
