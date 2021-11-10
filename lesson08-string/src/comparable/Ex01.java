package comparable;

public class Ex01 {
	public static void main(String[] args) {
		// Compare address: == : coding >> rarely use
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";

		System.out.println("s1,s2: " + (s1 == s2)); // F
		System.out.println("s1,s3: " + (s1 == s3)); // T
		System.out.println("s2,s3: " + (s2 == s3)); // F

		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");

		System.out.println("o1,o2: " + (o1 == o2));// F
		System.out.println("o1,o3: " + (o1 == o3));// F
		System.out.println("o2,o3: " + (o2 == o3));// F

	}

}
