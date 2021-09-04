package data;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		
		//Example: JAVA project: version 9
		int sum = sumAll(10,20,30,40);
		System.out.println("sum: " + sum);
		
		
	}
	//JAVA version: 8
	/*public static int sum(int a,int b){
	  	return a + b;
	  }
	 */
	
	//JAVA version 9
	@Deprecated(since = "9")
	//should use sumAll()
	public static int sum(int a,int b) {
		return a + b;
	}
	
	public static int sumAll(int ...nbrs) {
		return Arrays.stream(nbrs).sum();
	}
}
