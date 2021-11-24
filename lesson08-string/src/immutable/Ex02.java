package immutable;

public class Ex02 {
	private static int COUNT = 20000000;
	public static void main(String[] args) {
		//Which one we will use in reality
		//String >>Literal<< || object
		//Save memory >> solve performance issue
		
		long start = System.currentTimeMillis();
		for (int i = 1;i <= COUNT;i++) {
			//String s1 = "Welcome";
			//String s2 = "Welcome";
			
			String o1 = new String("Welcome");
			String o2 = new String("Welcome");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + ( end - start));
		
		
		
		
		
	}
}
