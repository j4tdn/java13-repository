package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
 * LocalDate
 * LocalTime
 * LocalDateTime
 * DateTimeFormatter
 */
public class Ex01 {
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//builder pattern
		LocalDate now = LocalDate.now().withMonth(8).withYear(2020);
		System.out.println("Date: " + now);
		
		String dateAsString = dtf.format(now);
		System.out.println("Date As String: " + dateAsString);
		
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		
		//Time Range
		Period per = Period.between(now, anotherDate);
		System.out.println("Period: " + per);
	}
}
