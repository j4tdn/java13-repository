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
		LocalDateTime start = LocalDateTime.parse("22:20:40 01/01/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("20:25:45 01/03/2020", dtf);

		if (start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot greater than dateEnd");
		}

		LocalDate dayStart = start.toLocalDate();
		LocalTime timeStart = start.toLocalTime();
		LocalDate dayEnd = end.toLocalDate();
		LocalTime timeEnd = end.toLocalTime();

		Duration durationTime = Duration.between(timeStart, timeEnd);

		if (timeEnd.isBefore(timeStart)) {
			durationTime = durationTime.plusDays(1);
			dayEnd = dayEnd.minusDays(1);
		}

		Period periodDay = Period.between(dayStart, dayEnd);
		
		// UTC GMT ICT CET ... Europe/Berlin Asia/Bangkok 

		System.out.println(periodDay.getYears() + " years\n" + periodDay.getMonths() + " months\n" + periodDay.getDays()
				+ " days\n" + durationTime.toHoursPart() + " hours\n" + durationTime.toMinutesPart() + " minutes\n"
				+ +durationTime.toSecondsPart() + " seconds");
	}
}
