package immutable;

import static utils.JvmUtils.hash;

public class Ex02 {
	private static int COUNT=100000;
public static void main(String[] args) {
	 
    //String o1= new String("Welcome");
    //String o2= new String("Welcome");
    String o3= new String("Student");
    long start=System.currentTimeMillis();
    for(int i=1; i<=COUNT;i++) {
    	//took 4ms
    	String s1 = "Welcome";
    	String s2 = "Welcome";
    	//took 5ms
    	//String o1= new String("Welcome");
        //String o2= new String("Welcome");
    }
    long end=System.currentTimeMillis();
    
    System.out.println("duration: "+(end-start));
}
}
