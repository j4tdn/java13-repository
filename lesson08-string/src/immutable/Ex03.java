package immutable;
import static utils.JVMUtils.*;
public class Ex03 {
	
	public static void main(String[] args) {
		// Why String Immutable (Bất biến) ?
		

		// String literal
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		has("s1: ", s1);
		has("s2: ", s2);
		
		System.out.println("======After======");
		
		// Immutable value ?
		// Cannot change original String HEAP value
		// Reassign to new String memory
		
		// Immutable = Cannot change original String HEAP value
		s1 = "Home";
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		has("s1: ", s1);
		has("s2: ", s2);
	}
}
