package immutable;

import utils.JvmUtils;


/**
 * String Immutable : Bất biến = Không thể thay đổi
 * +String Literal
 * +String object
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		//Literal stores in HEAP (constant pool)
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		JvmUtils.hash("s1 hash ", s1);
		JvmUtils.hash("s2 hash ", s2);
		JvmUtils.hash("s3 hash ", s3);
		
		System.out.println("===========================");
		//Object stores in HEAP (normal)
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		String o3 = new String("Student");
		
		JvmUtils.hash("o1 hash ", o1);
		JvmUtils.hash("o2 hash ", o2);
		JvmUtils.hash("o3 hash ", o3);
		
	}
	
}
