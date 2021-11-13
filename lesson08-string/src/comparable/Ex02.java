package comparable;

public class Ex02 {
	
	public static void main(String[] args) {
		// Compare address:.equals(: coding
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		System.out.println("s1.equals(s2: " + (s1.equals(s2)));
		System.out.println("s1.equals(s3: " + (s1.equals(s3)));
		System.out.println("s2.equals(s3: " + (s2.equals(s3)));
		
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");
		
		System.out.println("o1.equals(o2: " + (o1.equals(o2)));
		System.out.println("o1.equals(o3: " + (o1.equals(o3)));
		System.out.println("o2.equals(o3: " + (o1.equals(o3)));
		
		// Compare content
	}
}
