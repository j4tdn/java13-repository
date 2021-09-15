package view;

import bean.Car;

public class Ex03 {
	public static void main(String[] args) {
		// method
		// native method
		 
		// 100% >>  Operator == always compare value at Stack
		
		// Objects#equals >> this==object
		// 
		 
		// equals
		int a1 = 5;
		int a2 = 10;
		System.out.println("a1==a2 >> " + (a1==a2));
		System.out.println("===================");
		
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println("c1==c2 >> " + (c1==c2)); // F
		hash("c1 hash", c1);
		hash("c2 hash", c2);
		System.out.println("c1 equal c2 >> " + c1.equals(c2)); // F
		System.out.println("===================");
		
		Car c3 = new Car("S123", "Mazda", "Black");
		Car c4 = new Car("S123", "Mazda", "Black");
		System.out.println("c3==c4 >> " + (c3==c4)); // F
		System.out.println("c3 equal c4 >> " + c3.equals(c4)); // F
		hash("c3 hash", c3);
		hash("c4 hash", c4);
		System.out.println("===================");
		
		String s1 = "hello";
		String s2 = "hello";
		hash("s1 hash: ", s1);
		hash("s2 hash: ", s2);
		System.out.println("s1==s2 >> " + (s1==s2)); // T
		System.out.println("s1 equal s2 >> " + s1.equals(s2)); // T
		System.out.println("===================");
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		hash("s3 hash: ", s3);
		hash("s4 hash: ", s4);
		System.out.println("s3==s4 >> " + (s3==s4)); // F
		System.out.println("s3 equal s4 >> " + s3.equals(s4)); // T
		
	}

	private static void hash(String prefix, Object c) {
		System.out.println(prefix + ": " + System.identityHashCode(c));
	}
	
}
