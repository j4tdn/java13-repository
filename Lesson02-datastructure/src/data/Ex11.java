package data;
import bean.Digit;
public class Ex11 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Integer d1 = 10;
		Integer d2 = 20;
		swap(d1,d2);
		
		System.out.println("d1: " + d1);
		System.out.println("s2: " + d2);
	}
	
	//swapped
	private static void swap(Digit df , Digit ds) {
		int tmpV = df.value;
		df.value = ds.value;
		ds.value = tmpV;
	}
	// no swap with primitive type
	
	// swap with object type
	private static void swap(Integer first, Integer second) {
		Integer tmp = first;
		first = second;
		second = tmp;
	}
}
