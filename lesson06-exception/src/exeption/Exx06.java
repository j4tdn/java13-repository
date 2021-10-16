package exeption;

import java.util.Random;

import javax.management.RuntimeErrorException;

import self.InvalidAgeException;

public class Exx06 {
	private static Random rd = new Random();
	public static void main(String[] args) {
		// name, age, >> required: age >= 18
		// age 16 -> 20
		try {
			int age = 16 + rd.nextInt(5);
			String ticket = bookTicket(null, age);
			System.out.println(ticket);
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	private static String bookTicket(String name, int age) throws Exception{
		if(name == null) {
			throw new NullPointerException("Name cannot be null");
		}
		
		if(age < 18) {
			throw new InvalidAgeException("Invalid Age (>=18)");
		}
		
		return name;
	}
}
