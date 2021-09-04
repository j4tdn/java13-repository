package data;

public class Ex06 {
	public static void main(String[] args) {
		// Object type
		// Integer: class
		// i1: 'variable' >< reference4
		// new Integer(15)>> HEAP: call constructor method (gọi hàm khởi tạo) & return integer object
		// new: operator (thao tác)
		
		// constructor method: [access modifier] ClassName(parameter)
		
		// Class >> constructor >> create a object
		// immutable class (class bất biến)
		Integer i1 = null;
		i1 = new Integer(15);
		Integer i2 = new Integer(20);
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		
		// Dãy số in ra là địa chỉ lưu trữ của đối tượng 
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
		
		i1 = i2;
		// operator '=': Always work at STACK 100%
		System.out.println("===========");
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
		
	}

}
