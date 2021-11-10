package comparable;

public class Ex03 {
	 
	public static void main(String[] args) {
		// Compare address:.compareTo(coding >> rarely use
		// Compare content: compareTo (override from Object class), compareTo (
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		//return positive/negative value
		// A: 65
		// B: 66
		// a: 92
		// b: 93
		// "A".compareTo("D") >> -3
		// > 0 : 1st > 2st
		// = 0 : 1st = 2st
		// < 0 : 1st < 2st
		System.out.println("s1,s2: " + (s1.compareTo(s2)));
		System.out.println("s1,s3: " + (s1.compareTo(s3)));
		System.out.println("s3,s2: " + (s3.compareTo(s2)));
		
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");
		
		System.out.println("o1,o2: " + (o1.compareTo(o2)));
		System.out.println("o1,o3: " + (o1.compareTo(o3)));
		System.out.println("o3,o2: " + (o3.compareTo(o2)));
		// Compare content: equal, compareTo
	}
}
