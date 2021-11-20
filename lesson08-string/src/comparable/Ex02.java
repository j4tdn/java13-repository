package comparable;

public class Ex02 {
	public static void main(String[] args) {
		// Compare address: .equals( : coding >> rarely use
		// Compare content: equals(override from Object class), compareTo
		
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		System.out.println("s1,s2: " + (s1.equals(s2))); // F
		System.out.println("s1,s3: " + (s1.equals(s3))); // T
		System.out.println("s2,s3: " + (s2.equals(s3))); // F
		
		// rarely use
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");
		
		System.out.println("o1,o2: " + (o1.equals(o2))); // F
		System.out.println("o1,o3: " + (o1.equals(o3))); // T
		System.out.println("o2,o3: " + (o2.equals(o3))); // F
		
		
	}
}
