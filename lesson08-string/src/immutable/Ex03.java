package immutable;

import static utils.JvmUtils.hash;

public class Ex03 {
	public static void main(String[] args) {
		// Why String Immutable (Bất biến)?
		
		// String literal
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		System.out.println("======Before=======");
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		
		// Immutable value?
		// Cannot change original String HEAP value
		// Reassign to new String memory
		
		// Immutable = 
		s1 = "home";
		
		System.out.println("======After========");
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		hash("s1 hash", s1);
		hash("s2 hash", s2);
	}
}
