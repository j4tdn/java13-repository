package data;
import bean.Digit;
public class Ex10 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a1: " + a);
		modify(a);
		System.out.println("a2: " + a);
		
		Integer b = 20;
		System.out.println("b1: " + b);
		update(b);
		System.out.println("b2: " + b);
		
		Digit d = new Digit(30);
		System.out.println("d1: " + d);
		System.out.println("d1:" + System.identityHashCode(d));
		change(d);
		System.out.println("d2: " + d);
	}
	
	private static void change(Digit digit) {
		digit.value = 77;
	}
	private static void update(Integer input)
	{
		input = 88;
	}
	private static void modify(int input) {
		input = 99;
	}
}
