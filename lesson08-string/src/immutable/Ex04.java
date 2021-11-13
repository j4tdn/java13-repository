package immutable;

public class Ex04 {
	
	public static void main(String[] args) {
		String s = "Grid ";
		String s1 = "Layout";
		
		System.out.println(s.length());
		s = s.concat(s1);
		System.out.println(s.charAt(3));
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("First: " + s.charAt(0));
		System.out.println("Last: " + s.charAt(s.length() - 1));
	}
}
