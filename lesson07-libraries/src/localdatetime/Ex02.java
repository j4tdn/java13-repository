package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime start = LocalTime.now();
		System.out.println("start: " + start);
		System.out.println("start format: " + dft.format(start));
		LocalTime end = start.plusHours(2).plusMinutes(4).plusSeconds(7);
		System.out.println("end: " + end);
		System.out.println("end format : " + dft.format(end));
		Duration duration = Duration.between(start, end);
		System.out.println("duration: " + duration);
		System.out.println(duration.toHoursPart() + " hours\n" +
				  duration.toMinutesPart() + " minutes\n" +
				  duration.toSecondsPart() + " seconds");

		
	}
}
