package immutable;

import static utils.JvmUtils.*;

public class Ex01 {
public static void main(String[] args) {
	String s1 = "Welcome";
	String s2 = "Welcome";
	String s3 = "Student";
	
	//System.out.println("s1 hash: "+System.identityHashCode(s1));
	//System.out.println("s2 hash: "+System.identityHashCode(s2));
    //System.out.println("s3 hash: "+System.identityHashCode(s3));
    hash("s1 hash ", s1);
    hash("s2 hash ", s2);
    hash("s3 hash ", s3);
    
    String o1= new String("Welcome");
    String o2= new String("Welcome");
    String o3= new String("Student");
    
    hash("o1 hash ", o1);
    hash("o2 hash ", o2);
    hash("o3 hash ", o3);
}

}
