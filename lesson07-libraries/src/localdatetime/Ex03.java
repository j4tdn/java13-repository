package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03 {
	
	public static void main(String[] args) {	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH:mm:ss");
		
		LocalDateTime start = LocalDateTime.now();	
		LocalDateTime end = LocalDateTime.of(2020, 1, 22, 18, 20, 15);
		
		System.out.println("Start: " + start);
		System.out.println("End: " + end);
		
		System.out.println("Start formatted: " + dtf.format(start));
		System.out.println("End formatted: " + dtf.format(end));
		
		LocalDate dateStart = start.toLocalDate();
		LocalTime timeStart = start.toLocalTime();
		
		start = dateStart.atTime(timeStart);
		start = timeStart.atDate(dateStart);
		
		System.out.println("dateStart: " + dateStart);
		System.out.println("timeStart: " + timeStart);
	}
}
