package exception;

import java.util.Objects;
import java.util.Random;

import self.InvalidAgeException;

public class Ex06 {
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		// name, age >> required: age >= 18 (cinema's ticket)
		// 16-20
		
		int age = 16 + rd.nextInt(5); // from 0 to 4 => random 5
		String ticket;
		try {
			ticket = bookTicket(null, 16 + rd.nextInt(5));
			System.out.println(ticket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String bookTicket(String name, int age) throws Exception {
		Objects.requireNonNull(name, "Name cannot be null");
		if (age < 18) {
			throw new InvalidAgeException("Invalid Age (>=18)");	
		}
		return "tk123";
	}

}
