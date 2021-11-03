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
		
		LocalDateTime start = LocalDateTime.parse("23:20:40 01/01/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("20:25:45 01/03/2020", dtf);
		
		if (start.isAfter(end) ) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd !!!");
		}
		
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();
		
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		
		
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			dateEnd = dateEnd.minusDays(1);
		}
		
		Period period = Period.between(dateStart, dateEnd);
		
		System.out.println(
					period.getYears() 		+ " years\n" +
					period.getMonths() 		+ " months\n" + 
					period.getDays()   		+ " days\n" +
					duration.toHoursPart() 	+ " hours\n" +
					duration.toMinutesPart()+ " minutes\n" + 
					duration.toSecondsPart()+ " seconds");
	}
}
