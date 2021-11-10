package comparable;

public class Ex03 {
	public static void main(String[] args) {
		// Compare address >>  .equal( : coding >> rarely use
		// Compare content >> equal(Override from Object class), compareTo(override from Comparable interface)
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		// utilities
		// Nguyen Pham >> NP
		
		// return positive/negative value
		// A:65
		// A:66
		// a:97
		// b:98
		// "A".compareTo("D") >> -3
		// "AaB".compareTo("AaG") >> -4
		
		// >0 : 1st > 2nd
		// =0 : 1st = 2nd
		// <0 : 1st < 2nd
		
		// Address.contains("Quang Nam")
		
		System.out.println("s1, s2: " + (s1.compareTo(s2)));
		System.out.println("s1, s3: " + (s1.compareTo(s3)));
		System.out.println("s2, s3: " + (s2.compareTo(s3)));
		
		// rarely use
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");
		
		System.out.println("o1, s2: " + o1.compareTo(o2));
		System.out.println("o1, o3: " + o1.compareTo(o3));
		System.out.println("o2, o3: " + o2.compareTo(o3));
		
	}
}
