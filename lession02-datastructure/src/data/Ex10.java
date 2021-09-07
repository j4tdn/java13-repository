package data;
import bean.Digit;

public class Ex10 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a1: " + a);
		modify(a);
		System.out.println("a2: " +a);
		update(a);
		
		Digit d = new Digit(30);
		System.out.println("d1 : " + d);
		System.out.println("d1 : " + d);
		change(d);
		System.out.println("d2 : " + d);
	}
	
	private static void update(Integer input) {
		input = 88;
	}
	private static void modify(int input) {
		input = 99;
	}
	private static void change(Digit digit) {
		digit.value = 77;
		digit = new Digit(66);
		digit.value = 55;
	}
}
