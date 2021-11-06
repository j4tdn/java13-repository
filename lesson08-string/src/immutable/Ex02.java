package immutable;

public class Ex02 {
	private static int COUNT = 20000; 
	public static void main(String[] args) {
		// Which one we will use in reality ?
		// String >> literal
		
		// Save money >> solve performance issue
		
		// 100000*2 + 1 memory cells will be used
		long start = System.currentTimeMillis();
		for (int i = 1; i <= COUNT; i++) {
			// Took 5ms
			String s1 = "Welcome";
			String s2 = "Welcome";
		
			// Took 50ms
			// String o1 = new String("Welcome");
			// String o2 = new String("Welcome");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start));
	}
	
}
