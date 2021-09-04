package data;

public class Ex07 {
	public static void main(String[] args) {
		// line through >> deprecated
		Integer a = new Integer(10); //take time, space
		
		// Example: JAVA project : version 9
		// int sum = sumAll(10, 29, 39, 39);
		// System.out.println("sum" + sum);
	}
	
	//JAVA version 9
	@Deprecated(since = "9") //annotation
	//Should use sumAll
	public static int sum() {
		return 0;
	}
	
	public static int sumALL() {
		return 0;
	}
}
