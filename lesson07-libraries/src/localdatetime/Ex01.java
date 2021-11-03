package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * LocalDate
 * LocalTime
 * LocalDateTime
 * DateTimeFormatter
 */
public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// builder pattern
		LocalDate date = LocalDate.now()
								  .withMonth(8)
								  .withYear(2022);
		String formatted = dtf.format(date);
		
		System.out.println("date: " + date);
		System.out.println("formatted: " + formatted);
		
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		
		// Time Range
		Period period = Period.between(date, anotherDate);
		System.out.println("period: " + period);
		System.out.println(period.getYears() + "years\n" 
						   + period.getMonths() + "month\n"
						   + period.getDays() + "day");
	}
}
