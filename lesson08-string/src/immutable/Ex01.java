package immutable;

import static utils.JvmUtils.*;
public class Ex01 {
	public static void main(String[] args) {
		// Literal store in constant pool
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		hash("s1 hash: " , s1);
		hash("s2 hash: " ,s2);
		hash("s3 hash: " ,s3);
		
		// String Object stores in HEAP(normal)
		String o1 = new String ("Welcome");
		String o2 = new String ("Welcome");
		String o3 = new String ("Welcome");
		
		hash("o1 hash", o1);
		hash("o2 hash", o2);
		hash("o3 hash", o3);
		
	}
}
