package data;

public class Ex06 {
	public static void main(String[] args) {
		//Object type
		//Integer class
		//i1 : variable === reference
		//new Integer(15): call constructor method & return integer object
		//'new': operator
		
		// constructor method: access modi Classname(para)
		
		//Class >> constructor >> create a object
		//inmutable class
		Integer i1 = new Integer(15);
		Integer i2 = new Integer(20);
		
		System.out.println("i1: "+ i1);
		System.out.println("i2: "+ i2);
		
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
		
		i1 = i2;
		//operator '=' always work at stack
		System.out.println("============");
		System.out.println("i1: "+ i1);
		System.out.println("i2: "+ i2);
		
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
	}
}
