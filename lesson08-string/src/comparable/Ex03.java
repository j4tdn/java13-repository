package comparable;

public class Ex03 {
	
	public static void main(String[] args) {
		// Compare address:.compareTo : coding >> rarely
		// Compare content: compareTo(override from Object class), compareTo(override from
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		// return positive/negative value
		// A: 65
		// B: 66
		// a: 92
		// b: 93
		// "A".compareTo("B") >> -1
		// "AaB".compareTo("AeG") >> 4
		
		// > 0: 1st < 2nd
		// = 0: 1st = 2nd
		// < 0: 1st < 2nd
		
		// Address.contains("Quang Nam")
		
		System.out.println("s1.compareTo(s2: " + (s1.compareTo(s2)));
		System.out.println("s1.compareTo(s3: " + (s1.compareTo(s3)));
		System.out.println("s2.compareTo(s3: " + (s2.compareTo(s3)));
		
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");
		
		System.out.println("o1.compareTo(o2: " + (o1.compareTo(o2)));
		System.out.println("o1.compareTo(o3: " + (o1.compareTo(o3)));
		System.out.println("o2.compareTo(o3: " + (o1.compareTo(o3)));
		
		// Compare content
	}
}
