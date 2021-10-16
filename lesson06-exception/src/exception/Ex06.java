package exception;

import java.util.Objects;
import java.util.Random;

import self.InvalidAgeException;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// name, age >> required: age >= 18
		int age = new Random().nextInt(5) + 16;
		try {
			System.out.println(bookTicket("Rol", age));
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}
	
	private static String bookTicket(String name, int age) throws InvalidAgeException {
		
		Objects.requireNonNull(name, "Name cannot be null");
		
		if(age < 18) {
			throw new InvalidAgeException("Invalid age (>=18)");
		}
		
		return "Book Complete";
	}
}
