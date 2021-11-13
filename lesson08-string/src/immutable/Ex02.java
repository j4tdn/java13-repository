package immutable;

import utils.JVMUtils;

public class Ex02 {
	
	private static int COUNT = 100000;
	
	public static void main(String[] args) {
		// Which one we will use in reality
		// String literal || object
		
		// Save memory >> solve performance issue
		
		
		// 100000 * 2 stack + 1 HEAP memory cells will be used
		long start = System.currentTimeMillis();
		for(int i = 1; i <= COUNT; i++) {
			// Took 2ms
//			String s1 = "Welcome";
//			String s2 = "Welcome";
			
			// String o1 = new String("Welcome");
			// String o2 = new String("Welcome");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Duration: " + (end - start)); // 5ms
		
	}
}
