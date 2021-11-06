package immutable;

public class Ex02 {
	private static int COUNT = 200000;
	
	public static void main(String[] args) {
		// Which one we will use in reality ?
		// String literal || object
		
		// String literal because:
		// Save memory >> reduce performance issue
		
		String o1 = new String ("Welcome");
		String o2 = new String ("Welcome");
		
		// 100000*2 + 1 memory cells will be used 
		long start = System.currentTimeMillis();		
		for(int i = 1; i <= COUNT; i++) {
			String s1 = "Welcome";
			String s2 = "Welcome";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start));
	}
}
