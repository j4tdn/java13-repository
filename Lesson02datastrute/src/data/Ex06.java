package data;

public class Ex06 {
	public static void main(String[] args) {
		// object type
		// Integer: class 
		// i1: 'variable' >< reference
		// new Integer(15) >> HEAP: call constructor method( goi phuong thuc khoi tao) & return object
		// new: operator (toan tu)
		
		// constructor method: [access modifier] className(parameter)
		
		// class >> constructor >> create a object
		int a = 15;
		int b = 20; 
		Integer i1 = new Integer(15);
		Integer i2 = new Integer(20);
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		
		System.out.println("i1 code: " + System.identityHashCode(i1) );
		// in ra địa chỉ
		System.out.println("i2 code: " + System.identityHashCode(i2) );
		
		i1 = i2;
		// operator '=': Always work at stack 100%
		System.out.println("========");
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		
		System.out.println("i1 code: " + System.identityHashCode(i1) );
		System.out.println("i2 code: " + System.identityHashCode(i2) );
		
	}
	// public Integer(int value){
	//    this.value = value;
	// }

}
