package immutable;

//demo string utility methods

public class Ex04 {
	public static void main(String[] args) {
		String  s = "Grid ";
		String s1 = "Layout";
		System.out.println("s length : "+s.length());
		String s2 = s+s1;//s2=s.concat(s1);
		System.out.println("s2 : "+s2);
		System.out.println("s[3]: "+s.charAt(3));
		for (int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("First 'a' position : "+s2.indexOf('a'));
		System.out.println("Last 'a' position : "+s2.lastIndexOf('a'));
		
	}
}
