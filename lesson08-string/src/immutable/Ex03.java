package immutable;

import utils.JvmUtils;

public class Ex03 {
	public static void main(String[] args) {
		//Why String Immutabel (Bất biến)
		
		//String literal
		
		String s1 = "Welcome";//H1
		String s2 = "Welcome";//H1
		String s3 = "Student";//H2
		
		JvmUtils.hash("s1 hash" , s1);
		JvmUtils.hash("s2 hash" , s2);
		
		System.out.println("===Before====");
		//Immutable value ?
		//Cannot change original String HEAP value
		//Reassign to new String memory
		
		//Immutable = Cannot change original String HEAP value
		s1 = "home";
		
		System.out.println("s1: " + s1);
		System.out.println("s1: " + s2);
		
		System.out.println("===After====");
		
		JvmUtils.hash("s1 hash" , s1);
		JvmUtils.hash("s2 hash" , s2);
		
	}
}
