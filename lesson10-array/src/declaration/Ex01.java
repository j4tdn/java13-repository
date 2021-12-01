package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int [] digits = new int[6];
		digits[2]=11;
		modify(digits);
		System.out.println("digits: " + Arrays.toString(digits) );
		
		//default element:null
		String[] sequences = new String[4];
		sequences[0]= "Empty";
		System.out.println("sequences:" + Arrays.toString(sequences));
		
		//check does second element in sequences starts with "SKG"
		boolean startWithSgk = (sequences[1] != null && sequences[1].startsWith("SKG"));
		System.out.println("startWith: " +startWithSgk);
		
		System.out.println("====================");
		
		//default element 
	}
	private static void modify(int[] input) {
		input[0]=99;
	}

}
