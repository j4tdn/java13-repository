package exception;

import java.util.Objects;
import java.util.Random;

import self.InvalidAgeException;

public class Ex06 {
	public static void main(String[] args) {
		Random rd = new Random();
		int age = 16 + rd.nextInt(5);
		String ticket = "";
		try {
			ticket = bookTicket(null, age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ticket);
	}
	private static String bookTicket(String name, int age) throws Exception {
//		if(name == null) {
//			throw new NullPointerException("Name cannot be null!");
//		}
		Objects.requireNonNull(name,"Name can't be null");
		if(age < 18) {
			throw new InvalidAgeException("Invalid Age (>=18)");
		}
		return "TK123";
	}
	
}
