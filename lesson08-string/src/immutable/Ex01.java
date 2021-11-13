package immutable;

import utils.JVMUtils;

import static utils.JVMUtils.has;
/**
 * 
 * String Immutable: Bất biến = Không thể thay đổi
 * + String Literal
 * + String Object
 *
 */

public class Ex01 {

	public static void main(String[] args) {
		// String Literal stores in HEAP(constant pool)
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		JVMUtils.has("S1: ", s1);
		JVMUtils.has("S2: ", s2);
		JVMUtils.has("S3: ", s3);
		
		System.out.println("=========================");
		
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		String o3 = new String("Student");
		
		JVMUtils.has("o1: ", o1);
		JVMUtils.has("o2: ", o2);
		JVMUtils.has("o3: ", o3);
	}
	
	
}
