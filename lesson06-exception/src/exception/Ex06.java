package exception;

import java.util.Random;


public class Ex06 {
	private static Random rd = new Random();
	public static void main(String[] args) {
		//name, age>>required:age>=18
		//16-20
		//int age = 16 +rd.nextInt(5);
		try {
			String ticket = bookTicket("Tani",16+rd.nextInt(5));
			System.out.println(ticket);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static String bookTicket(String name,int age) throws Exception {
		Object.requireNonNull(name,"Name cannot be null");
		if (age<18) {
			throw new InvalidAgeException("invalid age (>=18)");
		}
		return "tk123'";
	}
}
