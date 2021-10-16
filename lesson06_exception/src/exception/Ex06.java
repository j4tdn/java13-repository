package exception;

import java.util.Objects;
import java.util.Random;

import javax.management.RuntimeErrorException;

import self.InvalidAgeException;

public class Ex06 {
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		//name , age >> require age >= 18
		int age = 16 + rd.nextInt(5);
		
		String ticket;
		try {
			ticket = bookTicket("Queen", age);
			System.out.println(ticket);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static String bookTicket(String name, int age) throws Exception{
//		if(name == null) {
//			throw new NullPointerException("Name cannot be null");
//		}
		Objects.requireNonNull(name, "Name cannot be null");
		if (age < 18) {
			throw new InvalidAgeException("Invalid Age (>=18)");
		}
		return "TK123";
	}
}
