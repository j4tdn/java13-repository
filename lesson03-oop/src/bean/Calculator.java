package bean;
//static được tạo ngay khi class được tạo ra
//non-static chỉ được tạo khi đối tượng được tạo ra
//Cho nên: method static chỉ dùng được static attribute
//non-static method vừa dùng được static attribute, vừa dùng được non-static attribute
//Vì static method được tạo khi class vừa có nhưng non-static thì chưa thì sẽ gây ra lỗi
public class Calculator {
	private int a;
	private int b;
	public Calculator(int a) {
		this(a, 0);
	}
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return this.a + this.b;
	}
}
