package bean;

public class Calculator {
	private int a;
	private int b;
	
    // non-static
	//Phương thuwsc sum không phụ thuộc vào đối tượng đang gọi thì nên để là static
	//public static int sum(int a, int b) {
		//return a + b;
	//}
	public Calculator(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return a + b;
	}
}
