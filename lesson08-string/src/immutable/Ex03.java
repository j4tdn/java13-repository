package immutable;

import static utils.JvmUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		//Why String Immutable(bất biến) ? VALUE ?
		
		//String literal || object
				String s1 = "Welcome";//H1
				String s2 = "Welcome";//H1
				String s3 = "Student";//H2
				System.out.println("==========Before========");
				hash("s1 hash: " , s1);
				hash("s2 hash: " ,s2);
				
		// Immutable value ?
		// Cannot change original String HEAP value
		// Reassign to new string memory
				
		// Immutable = cannot change original
				s1 = "Home";
				
				System.out.println("====After===");
				
				System.out.println("s1: " +s1);
				System.out.println("s2: " +s2);
				
				hash("s1 hash",s1);
				hash("s2 hash",s2);
	}

}
