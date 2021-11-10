package comparable;

public class Ex01 {
	 
	public static void main(String[] args) {
		// Compare address: == coding >> rarely use 
		String s1 = "Hello";
		String s2 = "machine";
		String s3 = "Hello";
		
		System.out.println("s1,s2: " + (s1 == s2));
		System.out.println("s1,s3: " + (s1 == s3));
		System.out.println("s3,s2: " + (s3 == s2));
		
		String o1 = new String("Hello");
		String o2 = new String("machine");
		String o3 = new String("Hello");
		
		System.out.println("o1,o2: " + (o1 == o2));
		System.out.println("o1,o3: " + (o1 == o3));
		System.out.println("o3,o2: " + (o3 == o2));
		// Compare content: equal, compareTo
	}
}
