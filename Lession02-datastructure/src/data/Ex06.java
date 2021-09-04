package data;

public class Ex06 {
	public static void main(String[] args) {
			//object type
			//Integer la 1 class
			//i1: là 1 biến
			//new Integer(15): gọi là phương thức khởi tạo, hàm khởi tạo
			//construction methed: 
			int a = 15;
			//chỉ khởi tạo đối tượng không thể cập nhật được : Immutable class
		Integer i1 = new Integer(16);
		Integer i2 = new Integer(20);
		System.out.println("i1 " + i1);
		System.out.println("i2 " + i2);
		
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
		i1 = i2;
		System.out.println("==============");
		System.out.println("i1 " + i1);
		System.out.println("i2 " + i2);
		//operator : '=' luon luon luu o stack
		System.out.println("i1 code: " + System.identityHashCode(i1));
		System.out.println("i2 code: " + System.identityHashCode(i2));
	}
}
