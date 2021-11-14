package immutable;

public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid ";
		String s1 = "Layout";
		
		System.out.println("length: " + s.length());
		
		System.out.println("s concat: " + s.concat(s1));
		
		System.out.println("Value at index 3: " + s.charAt(3));
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println(s.indexOf("i"));
	}
}
