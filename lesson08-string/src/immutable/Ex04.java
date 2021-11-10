package immutable;
/**
 * 
 * @author PC
 * Demo String utility methods
 * 
 */
public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid ";
		String s1 = "Layout down";
		
		int length = s.length();
		System.out.println("length: " + length);
		
		s = s + s1;
		System.out.println(s);
		
		System.out.println("3th character of s: " + s.charAt(3));
		
		for(int i = 0; i< s.length(); i++) {
			System.out.println("s[" + i + "] = " + s.charAt(i));
		}
		
		System.out.println("first 'd' position: " + s.indexOf('d'));
		System.out.println("first 'd' position: " + s.lastIndexOf('d'));
	}
}
