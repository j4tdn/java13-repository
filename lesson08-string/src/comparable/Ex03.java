package comparable;

public class Ex03 {
	public static void main(String[] args) {
		// Compare content >> compareTo(Override from Object class)
		// Return integer
		// Compare the value in heap
		/*
		 * if(s1 < s2) return < 0; (base on Ascii)  >> Example : A - B = -1, A - D = -3
		 * else if(s1 = s2) return 0;
		 * else return > 0;
		 */
		
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
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
