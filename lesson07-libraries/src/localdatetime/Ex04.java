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
		LocalDateTime start = LocalDateTime.parse("22:20:40 15/06/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("23:25:45 13/06/2020", dtf);

		if (start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd!!!");
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
		
		System.out.println(period.getYears() + " years\n" + period.getMonths() + " months\n" + period.getDays()
				+ " days\n" + duration.toHoursPart() + " hours\n" + duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds\n");
	}
}
