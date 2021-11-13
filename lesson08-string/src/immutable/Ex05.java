package immutable;

/**
 * 
 * 
 *
 */
public class Ex05 {
	
	public static void main(String[] args) {
		String s = "STK123"; // SGK246
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "    Welcome to      our class             ";
		
		// nature: never update original String value in HEAP memory
		System.out.println("Start: " + s.startsWith(s1));
		System.out.println("End: " + s.endsWith(s1));
		System.out.println("Replaced: " + s.replace(s1,s2));
		// \s: space == ' ' space
		System.out.println("Seperate words by one space: " + s3.replaceAll("\\s\\s+", " ").trim());
		
		String s4 = s.substring(4);
		System.out.println("s4 subString: " + s4);
		
		String s5 = s.substring(0, 6);
		System.out.println("s5 subString(0, 5): " + s5);
		
		String s6 = s.substring(2, 6);
		System.out.println("s6 subString(2, 6): " + s6);
		
		System.out.println("s contains s1 ? " + s.contains(s1));
		System.out.println("s contains s2 ? " + s.contains(s2));
	}
}
