package immutable;

import static utils.JvmUtils.hash;

public class Ex02 {
	
	private static int COUNT = 100000;
	
	public static void main(String[] args) {
		// Which one we will use in reality ?
		// String literal || object
		// => Answer: String literal
		// Because of saving memory >> solve performance issue
		
		// 100000*2 + 1 memory cells will be used
		long start = System.currentTimeMillis();
		for (int i = 1; i <= COUNT; i++) {
			// Took 5ms
			String s1 = "Welcome";
			String s2 = "Welcome";
			
			// Took ~50ms
			//String o1 = new String("Welcome");
			//String o2 = new String("Welcome");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start));
		
	}

}
