package immutable;

public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid ";
		String s1 = "Layout";
		
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		System.out.println(s.charAt(3));
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("First 'a':" + s.indexOf("a"));
	}
}
