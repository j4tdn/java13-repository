package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime start = LocalTime.now();
		System.out.println("Start: " + start);
		
		LocalTime end = start.plusHours(2).plusMinutes(4).plusSeconds(10);
		System.out.println("End: " + end);
		
		System.out.println("start format: " + dtf.format(start));
		System.out.println("end format: " + dtf.format(end));
		
		Duration duration = Duration.between(start, end);
		System.out.println("Duration: " + duration);
		System.out.println(duration.toHoursPart() + " hours\n" + duration.toMinutesPart() + " minutes\n" + duration.toSecondsPart() + " seconds"); 
	}
}
