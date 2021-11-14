package comparable;

public class Ex03 {
	public static void main(String[] args) {
		// Compare address: .compareTo( : coding >> rarely use
		// Compare content: compareTo(override from Object class), compareTo(override from comparable class)
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		// Return positive/negative value 
		// A: 65
		// B: 66
		// a: 92
		// b: 93
		// "A".compareTo("D")     >> -3
		// "AeB".compareTo("AaG") >> 4
		// > 0 : 1st > 2nd
		// = 0 : 1st = 2nd
		// < 0 : 1st < 2nd
		
		System.out.println("s1,s2: " + (s1.compareTo(s2))); // F
		System.out.println("s1,s3: " + (s1.compareTo(s3))); // T
		System.out.println("s2,s3: " + (s2.compareTo(s3))); // F
		
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");
		
		System.out.println("o1,o2: " + (o1.compareTo(o2))); // F
		System.out.println("o1,o3: " + (o1.compareTo(o3))); // T
		System.out.println("o2,o3: " + (o2.compareTo(o3))); // F
		
	}
}
