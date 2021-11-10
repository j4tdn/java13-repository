package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123";
		String s1 = "STK";
		String s2 = "SGK";
		
		String s3 = "    welcome to   our    class";
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));
		System.out.println(s.replace(s1, s2));
		System.out.println(s3.replaceAll(" ",""));
		
		System.out.println("remove redundant spaces : |||" + s3.trim().replaceAll("[\\s]+", "-"));
		// replace 1 ỏ N spaces by space
		
		String s4 = s.substring(4);
		System.out.println("s4 substring: " + s4);
		
		String s5 = s.substring(0,5);
		System.out.println("s5 sub(0,5): " + s5);
		
		String s6 = s.substring(2,6);
		System.out.println("s6 sub(2,6): "+s6);
		
		System.out.println("s contains s1 ?" + s.contains(s1));
		System.out.println("s contains s2 ?" + s.contains(s2));
		
		
	}


}
