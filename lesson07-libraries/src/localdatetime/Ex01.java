package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * localDate
 * localTime
 * Local DateTime
 * DateTimeFormater
 */
public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now().withDayOfMonth(8).withYear(0);
		String formatter = dft.format(date);
		System.out.println("date: " + date);
		System.out.println("formatter: " + date);
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		//time Range
		Period period = Period.between(date, anotherDate);
		System.out.println("period: " + period);
		System.out.println(period.getYears() + " years\n" +
						  period.getMonths() + " months\n" +
						  period.getDays() + " days");
		
		
	}
}
