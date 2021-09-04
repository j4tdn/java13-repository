package data;

public class Ex06 {
	
	public static void main(String[] args) {
		// Object type
		// Integer: class
		// i1: variable >< reference
		// new Integer(15) >> HEAP : call constructor method && return integer object
		// new: operator
		
		// Class >> constructor >> create a object
		int a = 5;
		Integer i1 = new Integer(15);
		Integer i2 = new Integer(20);
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
				
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
		
		System.out.println("===================");
		i1 = i2;
		// operator '=': Always work at stack 100%
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
	}
}
