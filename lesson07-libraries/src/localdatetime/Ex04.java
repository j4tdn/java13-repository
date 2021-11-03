package localdatetime;
/*
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04 {
	private static final String pattern = "HH:mm:ss dd/MM/yyy";
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDateTime start = LocalDateTime.parse("22:20:40 13/08/2018", dtf );
		LocalDateTime end = LocalDateTime.parse("23:25:45 15/08/2020", dtf);
		
		// Y M D / H m s 
		
		if(start.isAfter(end)) {
			throw new IllegalArgumentException("Date Start connot exceed datte End !!!");
		}
		
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = start.toLocalTime();
		

		Duration duration = Duration.between(startTime, endTime); 
		
		if(endTime.isBefore(startTime)) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}
		Period period = Period.between(startDate, endDate);
		
		System.out.println(period.getYears() + " year, " + period.getMonths() + " month, " + period.getDays() + " day, "
				+ duration.toHoursPart() + " hour, " + duration.toMinutesPart() + " minutes, " + duration.toSecondsPart()
				+ " sencond ");
	}
}
