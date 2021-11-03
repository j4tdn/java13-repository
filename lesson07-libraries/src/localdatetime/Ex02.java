package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime start = LocalTime.now();
		System.out.println("Start: " + start);
		
		LocalTime end = start.plusHours(2).plusMinutes(4).plusSeconds(6);
		System.out.println("End: " + end);
		
		System.out.println("Start format: " + dtf.format(start));
		System.out.println("End format: " + dtf.format(end));
		
		Duration duration = Duration.between(start, end);
		System.out.println("duration: " + duration);
		System.out.println(duration.toHoursPart()  	+ " hours\n" +
						   duration.toMinutesPart() + " minutes\n" +
						   duration.toSecondsPart() + " second");
	}
}
