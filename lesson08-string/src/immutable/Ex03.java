package immutable;

import utils.JVMUtils;

/*
 * Why Immutable?
 */
public class Ex03 {
	public static void main(String[] args) {
		
		//String literal
		String s1 = "Welcome";//H1
		String s2 = "Welcome";//H1
		String s3 = "Student";//H2
		
		System.out.println("========before=========");
		JVMUtils.hash("s1 hash", s1);
		JVMUtils.hash("s2 hash", s2);
		
		//cannot change original String HEAP value
		//Reassign to new String memory
		s1 = "home";
		System.out.println("=========after=========");
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		JVMUtils.hash("s1 hash", s1);
		JVMUtils.hash("s2 hash", s2);
	}
}
