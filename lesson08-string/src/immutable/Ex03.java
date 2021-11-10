package immutable;

import static utils.JvmUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		// Why String Immutable(Bất biến) ? VALUE?
		
		// String literal
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		System.out.println("========BEFORE========");
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		
		// Immutable value?
		// Cannot change original String HEAP value
		// Reassign to new String memory
		
		// Immutable = Cannot change original String HEAP value
		s1 = "Home";
		
		System.out.println("========AFTER========");	
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		hash("s1 hash", s1);
		hash("s2 hash", s2);
	}
}
