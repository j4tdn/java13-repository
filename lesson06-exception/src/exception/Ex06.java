package exception;

import java.util.Objects;
import java.util.Random;

import self.InvalidAgeException;

public class Ex06 {
	private static Random rd = new Random();
public static void main(String[] args) {
	Random rd = new Random();
	//name,age >> required : age >= 18
	//16-20
	//int age = 16 + rd.nextInt(5);
try {	String ticket = bookTicket("Tani",16 +rd.nextInt(5));
	System.out.println(ticket);}catch(Exception e) {
		e.printStackTrace();
	}
	
}
private static String bookTicket(String name, int age) throws InvalidAgeException {
	//if(name == null) {
	//	throw new NullPointerException("Name cannot e null");
	//}
	Objects.requireNonNull(name,"Name cannot e null");
	if(age< 18) {
		throw new InvalidAgeException("Invalid Age (>=18)");
	}
return "tk123";
}}
