package immutable;

import static utils.JvmUtils.hash;
// import "hash" method from class "JvmUtils" 
// this way = they way (import utils.JvmUtils; and JvmUtils.hash(...))

/**
 * String Immutable: Bất biến = Không thể thay đổi 
 * + String Literal
 * + String Object
 */

public class Ex01 {
	public static void main(String[] args) {
		// String Literal stores in HEAP (Constant pool)
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		hash("s3 hash", s3);
		
		// String Object stores in HEAP (normal)
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		String o3 = new String("Student");
		
		hash("o1 hash", o1);
		hash("o2 hash", o2);
		hash("o3 hash", o3);
		
	}
	
	

}
