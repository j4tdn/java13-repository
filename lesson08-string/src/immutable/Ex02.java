package immutable;

public class Ex02 {
	private static final int COUNT = 200000;

	public static void main(String[] args) {
		// which one we will use in reality
		// String literal || object
		//String s1 = "Welcome";
		//String s2 = "Welcome";
		//String s3 = "Student";
		
		
		
		// String Object stores in HEAP(normal)
		//String o1 = new String ("Welcome");
		//String o2 = new String ("Welcome");
		//String o3 = new String ("Welcome");
		
	// 100000*2 + 1 cells will be used 
		long start = System.currentTimeMillis();
		for(int i = 1; i<= COUNT; i ++) {
			// took ~ 5 ms
			String s1 = "Welcome";
			String s2 = "Welcome";
			
			//Took ~ 50ms
			String o1 = new String ("Welcome");
			String o2 = new String ("Welcome");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " +(end - start));
	}

}
