package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123STK"; // SGK246
		String s1 = "STK";
		String s2 = "SGK";
		
		// separate words by one space
		String s3 = "	Welcome   to    our class";
		s.startsWith(s1);
		s.endsWith(s1);
		s.replace(s1, s2);
		
		System.out.println(s3.trim().replaceAll("[\\s]+", " ")); // trim = strip(java11), stripLeading, stripTrailing
		
		// replace 1 or N spaces by 1 space
		
		String s4 = s.substring(4);
		System.out.println("s4 substring: " + s4);
		
		String s5 = s.substring(0, 5);
		System.out.println("s5 sub(0, 5): " + s5);
		
		String s6 = s.substring(2, 6);
		System.out.println("s6 sub(2, 6): " + s6);
		
		System.out.println("s contain s1 ? " + s.contains(s1));
		System.out.println("s contain s2 ? " + s.contains(s2));
	}
}
