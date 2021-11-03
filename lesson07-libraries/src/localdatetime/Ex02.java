package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime start = LocalTime.now();
		System.out.println(dateTimeFormatter.format(start));
		LocalTime end   = start.plusHours(2)
								.plusMinutes(50)
								.plusSeconds(30);
		System.out.println(dateTimeFormatter.format(end));
		
		Duration duration = Duration.between(start, end);
		System.out.println(duration);
		System.out.println(duration.toHoursPart() +
						   duration.toMinutesPart() +
						   duration.toSecondsPart());	
		
	}
}
