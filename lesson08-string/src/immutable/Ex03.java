package immutable;

import static utils.JvmUtils.hash;

public class Ex03 {
	public static void main(String[] args) {
		// why String immutable (Bất biến)
		
		// String literal
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "Student";
		System.out.println("====BEFORE====");
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		
		// IMMUTABLE VALUE
		// Cannot change original string heap value
		// Reassign to new String memory
		
		// Immutable = Cannot change original string heap value
		System.out.println("====AFTER====");
		s1 = "Home";
		hash("s1 hash", s1);
		hash("s2 hash", s2);
	}
}
