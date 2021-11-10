package comparable;

public class Ex03 {
	public static void main(String[] args) {
		// Compare address: .compareTo( : coding >> rarely use
		// Compare content: compareTo (override from Object class), compareTo (override from Comparable Interface)

		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		// return positive/negative value (+/-)
		// A: 65
		// B: 66
		// a: 92
		// b: 93
		// "A".compareTo("B") >> -1 >> A<B
		// "AaB".compareTo("AeG") >> -4
		// value > 0 : 1st > 2nd
		// value = 0 : 1st = 2nd
		// value < 0 : 1st < 2nd
		
		// Utilities methods of String
		// Another example Address.contains("Quang Nam"); // check address contains "Quang Nam" or not?

		System.out.println("s1,s2: " + (s1.compareTo(s2))); // -5
		System.out.println("s1,s3: " + (s1.compareTo(s3))); // 0
		System.out.println("s2,s3: " + (s2.compareTo(s3))); // 5

		// rarely use
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");

		System.out.println("o1,o2: " + (o1.compareTo(o2)));// -5
		System.out.println("o1,o3: " + (o1.compareTo(o3)));// 0
		System.out.println("o2,o3: " + (o2.compareTo(o3)));// 5

	}

}
