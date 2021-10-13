package exception;

public class Ex04 {
	public static void main(String[] args) {
		// int [] a = null;
		// int [] a = 
		
		int [] a = {1,2,3};
		test(a);
		
		
	}
	private static void test(int [] a) {
		// Null Pointer Exception
		a[1] =0;
		a[2] = 1;
		
		// ArrayIndexOutOfBoudary  
		a[3] = 20;
	}
}
