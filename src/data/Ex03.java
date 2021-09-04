package data;
import bean.Digit;

public class Ex03 {
	public static void main(String[] args) {
		int a = 4;
		int b = 22;
		System.out.println(a);
		System.out.println(b);
		
		swap(a, b);
		System.out.println(a);
		System.out.println(b);//van ko hoan doi dc
		
		Digit d1 = new Digit(15);
		Digit d2 = new Digit(25);
		
		swap(d1,d2);
		System.out.println(d1);
		System.out.println(d2);//van ko hoan doi dc
		
	}
	private static void swap(Digit a, Digit b) {
		int tam = a.value;
		a.value = b.value;
		b.value = tam;
	}
	
	private static void swap(int a, int b) {
		int tam = a;
		a = b;
		b = tam;
	}
}
