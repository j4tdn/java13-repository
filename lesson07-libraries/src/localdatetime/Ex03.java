package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ex03 {
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH:mm:ss");
		
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2020, Month.FEBRUARY, 22, 18, 20, 15);
		
		System.out.println("start: " + start);
		System.out.println("end: " + end);
		
		System.out.println("start format: " + dtf.format(start));
		System.out.println("end format: " + dtf.format(end));
		
		LocalDate dateStart = start.toLocalDate();
		LocalDate timeStart = start.toLocalDate();
		
		//start = dateStart.atTime(timeStart);
		//start = timeStart.atDate(timeStart);
		
		System.out.println("dateStart: " + dateStart);
		System.out.println("timeStart: " + timeStart);
		
	}

}
