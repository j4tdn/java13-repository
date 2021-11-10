package comparebale;

public class Ex02 {
	public static void main(String[] args) {
		// Literal store in constant pool
		String s1 = "Welcome";
		String s2 = "Hello";
		String s3 = "Welcome";
		
		System.out.println("s1,s2: " + (s1.equals(s2)));//F
		System.out.println("s1,s3: " + (s1.equals(s3)));//T
		System.out.println("s3,s2: " + (s3.equals(s2)));//F
		
		// String Object stores in HEAP(normal)
		String o1 = new String ("Welcome");
		String o2 = new String ("Hello");
		String o3 = new String ("Welcome");
		
		System.out.println("o1,o2: " + (o1.equals(o3)));//F
		System.out.println("o1,o3: " + (o1.equals(o3)));//T
		System.out.println("o3,o2: " + (o3.equals(o2)));//F
		
		
		
	}

}
