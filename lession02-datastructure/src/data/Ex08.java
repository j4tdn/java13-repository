package data;

public class Ex08 {
	public static void main(String[] args) {
		String s1 = "cake";
		String s2 = "cake";
		String s3 = "cake";
		
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		System.out.println("s3: " + System.identityHashCode(s3));
		
		s2 = "candy";
		
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		System.out.println("s3: " + System.identityHashCode(s3));
		
	}
}
