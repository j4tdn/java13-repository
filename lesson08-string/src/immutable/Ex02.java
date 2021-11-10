package immutable;

import static utils.JvmUtils.hash;

public class Ex02 {
	private static int COUNT = 200000;
	
	public static void main(String[] args) {
		//which one we will use in reality?
		// String >> literal || object
		
		// Save money >> solve performance issue
		
		
		long start = System.currentTimeMillis();
		for(int i = 1; i <= COUNT; i++) {
//			String s1 = "welcome";
//			String s2 = "welcome";
			String o1 = new String("welcome");
			String o2 = new String("welcome");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start));
	}
}
