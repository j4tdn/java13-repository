package immutable;
/*
 * Demo String utility methods
 */
public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid " ;
		String s1 = "Layout";
		
		System.out.println("Length s: " + s.length());
		
		s = s + s1;
		System.out.println("chuoi noi: " + s);
		System.out.println(s.charAt(3));
		
		for(int i = 0; i < s.length(); i++){
			System.out.println(s.charAt(i));
		}
		
		// Exist >> [0,length]
		// Not Exist >> -1
		System.out.println("First 'a' position: " + s.indexOf("a"));
		System.out.println("Last 'a' position: " + s.lastIndexOf("a"));
	}
}
