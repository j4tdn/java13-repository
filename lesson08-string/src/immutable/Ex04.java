package immutable;
/**
 * Demo String utility method
 * 1 Tính chiều dài chuỗi s
 * 2 Nối s1 với chuỗi s
 * 
 */
public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid";
		String s1 = "Layout dow";
		
		int length = s.length();
		System.out.println("length s : " + length );
		
		System.out.println("s1 + 2 : " + s + s1);
		String s1s = s.concat(s1);
		System.out.println("s1 + s: " + s1s);
		
		char S = s.charAt(3);
		System.out.println(S);
		
		for(int i = 0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("First 'a' position" + s.indexOf('d'));
		System.out.println("First 'a' position" + s1.lastIndexOf('d'));
	}
}
