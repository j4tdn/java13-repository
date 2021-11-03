package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02 {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		System.out.println("start: " + start);
		
		LocalTime end = start.plusHours(2).plusMinutes(54).plusSeconds(23);
		System.out.println("end: " + end);
		
		Duration duration = Duration.between(start, end);
		System.out.println("duration: " + duration);
	}
}
