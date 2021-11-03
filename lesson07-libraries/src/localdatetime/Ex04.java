package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
		LocalDateTime start = LocalDateTime.parse("15:20:40 01/01/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("23:25:45 01/01/2020 ", dtf);

		if(start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd !!!");
		}
		 LocalDate dateStart = start.toLocalDate();
		   LocalTime timeStart = start.toLocalTime();
		   
		   
		   
		   LocalDate dateEnd = end.toLocalDate();
		   LocalTime timeEnd = end.toLocalTime();
		   
		   
		
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if(timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			dateEnd= dateEnd.minusDays(1);
		}
		Period period = Period.between(dateStart, dateEnd);
		
		System.out.println(period.getYears() + " years\n" + period.getMonths() + " months\n" + period.getDays()
				+ " days" + duration.toHoursPart() + " hours\n" + duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds");

	}
}
