package immutable;

import static utils.JvmUtils.hash;
public class Ex03 {
	//Why String Immutable(bat bien)?
	
	//String literal
	
	
	public static void main(String[] args) {
		String s1 = "wellcome";
		String s2 = "wellcome";
		String s3 = "Student";
		
		System.out.println("BF==");
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		
		s1 = "Home";
		
		System.out.println("After++");
		
		System.out.println(s1);
		System.out.println(s2);
		
		hash("s1 hash", s1);
		hash("s2 hash", s2);
	}
}
