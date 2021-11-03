package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *LocalDate
 *LocalTime
 *LocalDateTime
 *DateTimeFormatter 
 */
public class Ex01 {
	public static void main(String[] args) {
		//03.08.2022
		LocalDate date = LocalDate.now().withMonth(8).withYear(2022);
		System.out.println("date: " + date);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatted = dtf.format(date);
		System.out.println("formatted: " + formatted);
		
		//LocalDate.of(year, month, date)
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		
		//Time range
		Period period = Period.between(date, anotherDate);
		System.out.println("period: " + period);
		System.out.println("Years: " + period.getYears() + "\nMonths: " + period.getMonths() + "\nDays: " + period.getDays());
		
	}
}
