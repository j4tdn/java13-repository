package immutable;

import static utils.JvmUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		// why String Immutable (Bat Bien) ? 
		
		// String literal
		String s1 = "Welcome";
		String s2 = "Welcome";
		
		// Immutable value ?
		// Cannot change original String HEAP value
		// Reassign to new String memory
		
		// Immutable = Cannot change original String HEAP value
		s1 = "Home";
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		
	}
}
