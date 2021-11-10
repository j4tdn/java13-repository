package comparable;

public class Ex02 {
	public static void main(String[] args) {
		
		//compare content: equals, compareTo
		
		String s1 = "hello";
		String s2 = "java";
		String s3 = "hello";
		
		System.out.println("s1, s2: " + (s1.equals(s2)));//F
		System.out.println("s1, s3: " + (s1.equals(s3)));//T
		System.out.println("s2, s3: " + (s2.equals(s3)));//F
		
		String o1 = new String("hello");
		String o2 = new String("java");
		String o3 = new String("hello");
		
		System.out.println("o1, o2: " + (o1.equals(o2)));//F
		System.out.println("o1, o3: " + (o1.equals(o3)));//T
		System.out.println("o2, o3: " + (o2.equals(o3)));//F
		
		
	}
}
