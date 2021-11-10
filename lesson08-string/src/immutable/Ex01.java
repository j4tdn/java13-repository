package immutable;

import utils.JVMUtils;

/*
 * String immutable: Bất biến
 * + String literal
 * + String Object
 */
public class Ex01 {
	public static void main(String[] args) {
		
		//String literal stores in HEAP(constant pool) 
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		JVMUtils.hash("s1 hash", s1);
		JVMUtils.hash("s2 hash", s2);
		JVMUtils.hash("s3 hash", s3);
		
		//String Object stores in HEAP(normal)
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		String o3 = new String("Student");
		
		JVMUtils.hash("o1 hash", o1);
		JVMUtils.hash("o2 hash", o2);
		JVMUtils.hash("o3 hash", o3);
	}
}
