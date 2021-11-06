package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123STK";
		String s1 = "STK";
		String s2 = "SGK";

		// separate words by one space
		String s3 = "Welcome    to     our class           ";
		
		System.out.println("start with STK: " + s.startsWith(s1));
		System.out.println("end with STK: " + s.endsWith(s1));
		System.out.println("after replace: " + s.replace(s1, s2));
		System.out.println("after replace s: " + s);
		
		// Replace versus replaceAll
	    // replace 1 or N spaces by 1 space
		s3 = s3.trim().replaceAll("[\\s]+", " ");
	    System.out.println("Remove redundant spaces:|||" + s3 + "|||");
		
	    // Create a Sub String
	    String s4 = s.substring(2);
	    System.out.println("s4 is sub-function of s: " + s4);
	}
}
