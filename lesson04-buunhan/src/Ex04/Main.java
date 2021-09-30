package Ex04;

import java.time.LocalDate;	
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Director d1 = new Director("Dung", LocalDate.parse("04/03/1995"), 0.8 , 200);
		Manager m1 = new Manager("Nhan", LocalDate.parse("03/02/2001", dtf), 0.9, 100);
		Staff s1 = new Staff("Nghia", LocalDate.parse("08/09/1989", dtf), 0.5, "ABC");
		Staff s2 = new Staff("Lien", LocalDate.parse("01/04/1992", dtf), 0.6, "XYZ");
		
		System.out.println("Thong tin nhan su:");
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
