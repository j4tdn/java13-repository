package localdatetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * 
 * LocalDate
 * LocalTime
 * LocalDateTime
 * DateTimeFormatter
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now()
								  .withMonth(8)
								  .withYear(2022);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatted = dtf.format(date);
		System.out.println(formatted);
		
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		
		Period period = Period.between(date, anotherDate);
		System.out.println(period);
		System.out.println(period.getYears() +" "+ period.getMonths() +" " + period.getDays());
	}
	
}
