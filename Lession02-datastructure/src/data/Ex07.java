package data;

public class Ex07 {
	
	public static void main(String[] args) {
		//2 cách khai báo của đối tượng có sẵn của java Integer , String , Douple
		//hàm  bị gạch ( Deprecated)
		//cách 1
		Integer a1 = new Integer(10);
		Integer a2 = new Integer(12);
		Integer a3 = new Integer(10);
		//==> stack 3 heap 3
		System.out.println("a1 code" + System.identityHashCode(a1));
		System.out.println("a2 code" + System.identityHashCode(a2));
		System.out.println("a3 code" + System.identityHashCode(a3));
		System.out.println("=========================");
		//cách 2 : Có thể không dùng new nhưng vẫn có ô nhớ heap
		Integer b1 = 20;// 20 vẫn ở Heap1 ==> b1 ==> Heap 1
		Integer b2 = 22;// 22 vẫn ở Heap2 ==> b2 ==> Heap 2
		Integer b3 = 20;// b3 ==> Heap 1 vì đã có ô nhớ 20 trên rồi
		
		// 3 stack 2 heap
		System.out.println("b1 code" + System.identityHashCode(b1));
		System.out.println("b2 code" + System.identityHashCode(b2));
		System.out.println("b3 code" + System.identityHashCode(b3));
		// nên dùng cách 2 vì sẽ đỡ tạo vùng nhớ hơn.
		//b1,a1 là biến lưu trữ cái địa chỉ của đối tượng
	}
	
	
	
	
	
}
