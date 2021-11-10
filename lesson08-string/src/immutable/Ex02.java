package immutable;

public class Ex02 {
	public static void main(String[] args) {
		//which one we will use in reality?
		//String literal || String object
		//alway use String literal >> save memory >> faster process
		for(int i = 1; i <= 200000; i++) {
			//took 5ms
			String s1 = "Welcome";
			String s2 = "Welcome";
			
			//took 50ms
			String o1 = new String("Welcome");
			String o2 = new String("Welcome");
		}
	}
}
