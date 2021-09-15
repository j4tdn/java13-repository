package view;

import bean.Car;

public class Ex03 {
	public static void main(String[] args) {
		// method: show code
		
		// native method
		
		// Object#equals >> this==object
	    // Class#equals  >> override >> could be compare value
		
		int a1 = 5;
		int a2 = 10;
		System.out.println("(a1 == a2) >> " + (a1 == a2));
		
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println("(c1 == c2) >> " + (c1 == c2));	
		System.out.println("(c1 eq c2) >> " + (c1.equals(c2))); //  False
		
		hash("c1 hash", c1);
		hash("c2 hash", c2);
		
		System.out.println("==========");
		
		Car c3 = new Car("S123", "Mazda", "Black");
		Car c4 = new Car("S123", "Mazda", "Black");
		System.out.println("(c3 == c4) >> " + (c3 == c4));
		System.out.println("(c3 eq c4) >> " + (c3.equals(c4))); //  False
		hash("c3 hash", c3);
		hash("c4 hash", c4);
		
		// heap >> constant pool
		String s1 = "hello";
		String s2 = "hello";
		hash("s1: ", s1);
		hash("s2: ", s2);
		System.out.println("(s1==s2) >> " + (s1==s2));          // T
		System.out.println("(s1 eq s2) >> " + (s1.equals(s2))); // T
				
	    // heap
		String s3 = new String("hello");
		String s4 = new String("hello");
		hash("s3: ", s3);
		hash("s4: ", s4);
		System.out.println("(s3==s4) >> " + (s3==s4));          // F
		System.out.println("(s3 eq s4) >> " + (s3.equals(s4))); // T
	}
	
	private static void hash(String prefix, Object c) {
		System.out.println(prefix + ": " + System.identityHashCode(c));
	}
}
