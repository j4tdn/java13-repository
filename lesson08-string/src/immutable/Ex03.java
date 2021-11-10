package immutable;
import static utils.JvmUtils.*;
public class Ex03 {
public static void main(String[] args) {
	String s1 = "Welcome";
	String s2 = "Welcome";
	String s3 = "Student";
	System.out.println("=========Before=========");
	System.out.println("s1: "+s1);
	System.out.println("s2: "+s2);
	
	hash("s1 hash",s1);
	hash("s2 hash",s2);
	
	s1="Home";
	System.out.println("=========After=========");
	
	System.out.println("s1: "+s1);
	System.out.println("s2: "+s2);
	
	hash("s1 hash",s1);
	hash("s2 hash",s2);
	
	
}
}
