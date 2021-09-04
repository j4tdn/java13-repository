package data;

import bean.Digit;

public class Ex08 {
	public static void main(String[] args) {
		//String literal .. constant pool
		//Immutable class
		String s1 = "cake";
		String s2 = "cake";
		String s3 = "cake";
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		System.out.println("s3: " + System.identityHashCode(s3));
		
		System.out.println("====================");
		s2 = "candy";
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		System.out.println("s3: " + System.identityHashCode(s3));
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
	
		Integer a = new Integer(55);
		Integer b = new Integer(54);
		System.out.println(a + "," + b);
		swap(a, b);
		System.out.println(a + "," + b);
	}

		private static void swap(Integer c,  Integer d) {
			int tmp = c;
			c = d;
			d = tmp;
		System.out.println( c + "," + d);
		}
			
}
