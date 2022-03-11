 package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04 {
	
	private static final String pattern = "HH:mm:ss dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDateTime start = LocalDateTime.parse("22:20:40 01/01/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("20:25:45 01/01/2020", dtf);
		
		if(start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd!!!");
		}
		
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());

		if(end.toLocalTime().isBefore(start.toLocalTime())) {
			duration = duration.plusDays(1);
			period = Period.between(start.toLocalDate(), end.toLocalDate().minusDays(1));
		}
		
		System.out.println(
				period.getYears() 	+ " Years\n" + 
				period.getMonths()  + " Months\n"+
				period.getDays()	+ " Days\n"  +
				duration.toHoursPart() + " Hours\n" +
				duration.toMinutesPart() + " Minutes\n" +
				duration.toSecondsPart() + " Seconds"
				);
		
		
		
	}
}
