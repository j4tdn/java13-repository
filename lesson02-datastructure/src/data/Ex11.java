package data;

public class Ex11 {
	public static void main(String[] args) {
		Integer a=10;
		Integer b=20;
		swap(a,b);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	private static void swap(Integer first, Integer second) {
		Integer tmp=first;
		first=second;
		second=tmp;
	}
}
