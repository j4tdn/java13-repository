package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ex03 {
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH:mm:ss");
		
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2022, Month.APRIL, 22, 18, 20, 12);
		
		System.out.println("start: " + start);
		System.out.println("end: " + end);
		
		System.out.println("start formmat: " + dtf.format(start));
		System.out.println("end formmat: " + dtf.format(end));
		
		LocalDate dateStart = start.toLocalDate();
		LocalTime timeStart  = start.toLocalTime();
		
		System.out.println("dateStart: " + dateStart);
		System.out.println("timeStart: " + timeStart);
	}
}
