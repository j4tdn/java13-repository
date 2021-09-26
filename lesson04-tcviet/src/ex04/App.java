/**
 * Bài 4: Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
 */
package ex04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class App {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Director d1 = new Director("D1", LocalDate.parse("07/10/2001", dtf), 1.2, 1.3);
		Manager m1 = new Manager("M1", LocalDate.parse("05/10/2001", dtf), 0.9, 100);
		Staff s1 = new Staff("S1", LocalDate.parse("10/10/2001", dtf), 0.5, "ABC");
		Staff s2 = new Staff("S3", LocalDate.parse("01/10/2001", dtf), 0.6, "XYZ");
		
		System.out.println("=> Infomation of all Personnels:");
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
