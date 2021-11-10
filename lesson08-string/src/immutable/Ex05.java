package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123";
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "   Welcome to    our class  ";
		
		System.out.println("Start with" + s.startsWith(s1));
		System.out.println("End with" + s.endsWith(s1));
		System.out.println("After replace" + s.replace(s1, s2));
		System.out.println("Detele blank space: " + s3.trim().replaceAll("[\\s]+", " "));
		String s4 = s.substring(2,5);
		System.out.println("s4: " + s4);
		String s5 = s.substring(0,5);
		System.out.println("s5: " + s5);
		
		System.out.println("s contains s1 " + s.contains(s1));
		System.out.println("s contains s2 " + s.contains(s2));
	}
}
