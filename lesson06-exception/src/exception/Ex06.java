package exception;

import java.util.Objects;
import java.util.Random;

import self.InvalidAgeException;

public class Ex06 {
	private static Random rd = new Random();
	public static void main(String[] args) {
		// name, age >> required: age >= 18
		// 16 - 20
		String ticket;
		try {
			ticket = bookTicket("Tani", 16 + rd.nextInt(5));
			System.out.println(ticket);
		} catch (Exception e) {
			e.printStackTrace();
//			e.getMessage();
		}
		
		
	}
	
	private static String bookTicket(String name, int age) throws Exception {
		Objects.requireNonNull(name, "Name cannot be null");
		if(age < 18) {
			throw new InvalidAgeException("Invalid Age (>=18)");
		}
		return "tk123";
		
	}
	
}
