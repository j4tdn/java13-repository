package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04 {
	
	private static final String PATTERN = "HH:mm:ss dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		
		LocalDateTime start = LocalDateTime.parse("15:20:40 01/01/2018", dtf);
		LocalDateTime end   = LocalDateTime.parse("13:15:45 01/01/2020", dtf);
		
		// Y M D / H m s
		
		if (start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd !!!");
		}
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();
		
		Duration duration = Duration.between(startTime, endTime);
		
		if (endTime.isBefore(startTime)) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}
		
		Period period = Period.between(startDate, endDate);
		
		// UTC GMT ICT CET ... Europe//Berlin/Bangkok
		
		System.out.println(
				period.getYears() 			+ " years\n" 	+
				period.getMonths() 			+ " months\n" 	+
				period.getDays() 			+ " days\n" 	+
				duration.toHoursPart() 		+ " hours\n" 	+
				duration.toMinutesPart() 	+ " minutes\n" 	+ 
				duration.toSecondsPart() 	+ " seconds");
	}
}
