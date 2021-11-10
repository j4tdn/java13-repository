package immutable;

import static  utils.JvmUtils.hash;

/**
 * String Immutable : Bất biến = không thể thay đổi
 * string Literal
 * String Object
 */
public class Ex01 {
	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "Student";
		
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		hash("s3 hash", s3);
		
		String o1 = new String("welcome");
		String o2 = new String("welcome");
		String o3 = new String("Student");
		
		hash("o1 hash", o1);
		hash("o2 hash", o2);
		hash("o3 hash", o3);
		
	}
	
}
