package immutable;

public class Ex02 {
	private static int COUNT = 100000;
	
	public static void main(String[] args) {
		
		
		long start = System.currentTimeMillis();
		for(int i = 1; i <= COUNT; i++) {
			String s1 = "wellcome";
			String s2 = "wellcome";
		}
		
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start));
	}
}
