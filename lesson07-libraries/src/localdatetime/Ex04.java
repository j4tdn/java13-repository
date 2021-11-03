package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Ex04 {
	private static final String pattern = "HH:mm:ss dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime start = LocalDateTime.parse("15:20:40 15/06/2018", dft);
		LocalDateTime end = LocalDateTime.parse("20:25:45 15/08/2020", dft);
	    if(start.isAfter(end)) {
	    	throw new IllegalArgumentException("dateStart cannot exceed dateEnd ");
	    }
	    LocalDate dateStart = start.toLocalDate();
		LocalTime timeStart = start.toLocalTime();
		LocalDate dateEnd = end.toLocalDate();
		LocalTime timeEnd = end.toLocalTime();
		
		Duration duration = Duration.between(start.toLocalTime(),  end.toLocalTime());
		
		if(timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
//			period = period.minusDays(1);
			dateEnd = dateEnd.minusDays(1);
		}
		Period period = Period.between(dateStart, dateEnd);
		System.out.println(period.getYears() + " years\n" +
				  period.getMonths() + " months\n" +
				  period.getDays() + " days\n" +
				  duration.toHoursPart() + " hours\n" +
				  duration.toMinutesPart() + " minutes\n" +
				  duration.toSecondsPart() + " seconds");
		
		
	}
}
