package bean;

public class Testing extends Apple {
	
	public static final float PI = 3.14f;
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("123");
		System.out.println("s1 code: " + s);
		s.append("456");
		System.out.println("s2 code: " + s);
		
		String s1 = "abc"; // HEAP - constant pool
		String s3 = "abc";
		s3 = "xyz";
		
		System.out.println("s1: " + s1);
		
		String s2 = new String("xyz"); // HEAP - normal
		
		final int a = 5;
		int b = 0;
		try {
			System.out.println("a/b: " + (a/b));
			System.out.println("method: " + divide(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("==============");
	}
	
	public static int divide(int a, int b) throws ArithmeticException{
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
