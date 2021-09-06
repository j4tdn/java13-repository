package data;

public class Ex13 {
	public static void main(String[] args) {
		//array of primitive type
		
		//declaration & initial
		//int[] >>object type
		//each element >>int type >>primitive type
		//consta
		int[] digits = new int	[4];
		int first = digits[0];
		System.out.println("first: "+first);
		
		digits[2]=99;
		System.out.println("third: "+digits[2]);
		
		int[] numbers = {1,9,4,7,5,6};
		System.out.println("number[3]: "+numbers[3]);
		
		//loop
		for (int i=0;i<numbers.length;i++) {
			System.out.println("nbr["+i+"]="+numbers[i]);
		}
		
		System.out.println("=========");
		
		//for-each>>get value
		for (int each:numbers) {
			//each = numbers[i]
			System.out.println("each: "+each);
		}
	}
}
