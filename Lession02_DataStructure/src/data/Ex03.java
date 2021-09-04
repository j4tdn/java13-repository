package data;

public class Ex03 {
	public static void main(String[] args) {
		int a = 4;
		int b = 22;
		System.out.println("a1 = "+ a);
		System.out.println("b1 = "+ b);
		System.out.println("-------------- after swap-----");
		swap(a, b);
		System.out.println("a2 = "+ a);
		System.out.println("b2 = "+ b);
		
	}
	private static void swap(int x, int y ) {
		int t = x; 
		x = y;
		y = t;
	}
	
}
