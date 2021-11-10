package immutable;
import static utils.JvmUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		//Why String Immutable (bat bien)?
		
		//String literal
		String s1 ="Welcome";
		String s2 ="Welcome";
		String s3 ="Student";
		
		hash("s1 hash",s1);
		hash("s2 hash",s2);
		
		System.out.println("==============");
		
		//Immutable value?
		s1 ="Home";
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		hash("s1 hash",s1);
		hash("s2 hash",s2);
		
	}
	
}
