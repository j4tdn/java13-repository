package view;

import bean.Car;

public class Ex03 {
	public static void main(String[] args) {
		//100%>> operator == alway compare values at stack
		int a1 = 5;
		int a2 = 10;
		System.out.println("(a1==a2) >>"+(a1==a2));//f
		
		System.out.println("--------------------------");
		
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println("(c1==c2) >>"+(c1==c2));//f
		System.out.println("(c1 eq c2)>>"+(c1.equals(c2)));//f

		System.out.println("--------------------------");
		
		Car c3 = new Car("S123","Mazda","Black");
		Car c4 = new Car("S123","Mazda","Black");
		System.out.println("(c3==c4) >>"+(c3==c4));//f
		System.out.println("(c3 eq c4)>>"+(c3.equals(c4)));//f
		
		
		//constant pool
		String s1 ="hello";
		String s2 ="hello";
		hash("s1 hash",s1);
		hash("s2 hash",s2);
		System.out.println("(s1==s2) >>"+(s1==s2));//t
		System.out.println("(s1 eq s2)>>"+(s1.equals(s2)));//t
		
		
		//heap
		String s3 = new String("hello");
		String s4 = new String("hello");
		hash("s3 hash",s3);
		hash("s4 hash",s4);
		System.out.println("(s3==s4) >>"+(s3==s4));//f
		System.out.println("(s3 eq s4)>>"+(s3.equals(s4)));//t
		
		
		
	}
	
	private static void hash(String prefix,String s1) {
		System.out.println(prefix+": "+System.identityHashCode(s1));
	}
}
