package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "tôi yêu sách";
		task(a);
	}
	
	private static void task(String a) {
		
		char[] s = a.toCharArray();
		for (char c: s) {
			System.out.println(c);
		}
		
		System.out.println("====================");
		
		String[] s1 = a.split("[\\s]+");
		for (String c: s1) {
			System.out.println(c);
		}
		
		System.out.println("====================");
		
		StringBuilder stb1 = new StringBuilder(a);
		String s2 = stb1.reverse().toString();
		System.out.println(s2);
		
		System.out.println("====================");
		
		String s3 ="";
		for (String c: s1) {
			StringBuilder stb2 = new StringBuilder(c);
			c= stb2.reverse().toString();
			s3= s3+c+" ";
		}
		System.out.println(s3);
		
		System.out.println("====================");
		
		
		
	}

}
