package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
public static void main(String[] args) {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date=LocalDate.now().withMonth(8).withYear(2022);
	System.out.println("date:" +date);
	
	
	String formatted= dtf.format(date);
	System.out.println("formatted: "+formatted);
	
	LocalDate anotherdate=LocalDate.of(2022,9,5);
	
	Period period = Period.between(date, anotherdate);
	System.out.println("period: "+period);
	System.out.println(period.getYears() + " years\n" + period.getMonths()+" months\n"+period.getDays()+" days");
	
	
	
}
}
