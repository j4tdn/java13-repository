package comparebale;

public class Ex03 {
	public static void main(String[] args) {
		// Literal store in constant pool
		String s1 = "Welcome";
		String s2 = "Hello";
		String s3 = "Welcome";
		
		System.out.println("s1,s2: " + (s1.compareTo(s2)));
		System.out.println("s1,s3: " + (s1.compareTo(s3)));
		System.out.println("s3,s2: " + (s3.compareTo(s2)));
		
		// String Object stores in HEAP(normal)
		String o1 = new String ("Welcome");
		String o2 = new String ("Hello");
		String o3 = new String ("Welcome");
		
		System.out.println("o1,o2: " + (o1.compareTo(o3)));
		System.out.println("o1,o3: " + (o1.compareTo(o3)));
		System.out.println("o3,o2: " + (o3.compareTo(o2)));
		
		
		
	}

}
