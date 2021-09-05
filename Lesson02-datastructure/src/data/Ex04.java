package data;

public class Ex04 {
	    // global variable >< attribute >< property
		// Program: data structure + algorith
		// class: attribute + method
		// access modifier : pham vi truy cap
		public static int x = 20;
		private static int a = 15;
		
		public static void main(String[] args) {
			// local variable
			int a = 10;
			System.out.println("a = " + Ex04.a);
			System.out.println("x = " + x);
			x = 30;
			System.out.println("x1 = " + x);
			test();
		}
		
		
		private static void test() {
			// local variable
			int a = 10;
			System.out.println("a = " + a);
			x = 40;
			System.out.println("x2 = " + x);
		}

}
