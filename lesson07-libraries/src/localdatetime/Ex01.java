package localdatetime;

import java.time.LocalDate;
import java.time.Month;
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
		// builder pattern
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now()
								  .withMonth(8)
								  .withYear(2022);
		String formatted = dtf.format(date);
		
		System.out.println("date: " + date);
		System.out.println("formatted" + formatted);
		
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		
		//time range
		Period period = Period.between(date, anotherDate);
		System.out.println("period: " + period);
		System.out.println(period.getYears() + " years\n" +
						   period.getMonths() + " months\n" + 
						   period.getDays()   + " days");
	}	
}
