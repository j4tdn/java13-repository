package immutable;

import utils.JvmUtils;
import static utils.JvmUtils.hash;

/*
 * String Immutable : baats bieesn = ko change
 * + String literal
 * + String object
 */

public class Ex01 {
	public static void main(String[] args) {
		String s1 = "wellcome";
		String s2 = "wellcome";
		String s3 = "Student";
		
		hash("s1 hash",s1);
		hash("s1 hash",s2);
		hash("s1 hash",s3);
	
		String o1 = new String("Wellcome");
		String o2 = new String("Wellcome");
		String o3 = new String("Student");
		
		hash("s1 hash",o1);
		hash("s1 hash",o2);
		hash("s1 hash",o3);
	}
}
