package strategy;
/**
 * 1 . Cho 2 số nguyên a , b
 * Viết chương trình thực hiện các thao tác sau đây
 * +Tính tổng
 * +Tính hiệu
 * +Tính tích
 * +Tính thương
 * +Tính log(a)/log(b)
 *
 */
public class App {
	public static void main(String[] args) {
	
		
		int sum = operate(10, 6, ( a, b)-> a + b);
		System.out.println("sum :" + sum);
		int sub = operate(10, 6, ( a, b)-> a - b);
		System.out.println("sub :" + sub);
		int mul = operate(10, 6, ( a, b)-> a * b);
		System.out.println("mul :" + mul);
		int log = operate(10, 6, ( a, b)-> (int)Math.log(a)/(int)Math.log(b));
		System.out.println("log :" + log);
		
	}
	private static int operate(int a, int b, Calculator c) {
		return c.execute(a, b);
	}
}