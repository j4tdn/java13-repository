package Ex02;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int randomNumber[] = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int[] randomNumberSorted = new int[randomNumber.length];
		
		int count = 0;
		
		for(int i = 0; i < randomNumber.length; i++) {
			if((randomNumber[i] % 7 == 0) && (randomNumber[i] % 5 != 0)) {
				randomNumberSorted[count] = randomNumber[i];
				count++;
			}
		}
		
		for(int i = 0; i < randomNumber.length; i++) {
			if((randomNumber[i] % 7 == 0) && (randomNumber[i] % 5 == 0) || (randomNumber[i] % 7 != 0) && (randomNumber[i] % 5 != 0)) {
				randomNumberSorted[count] = randomNumber[i];
				count++;
			}
		}
		
		for(int i = 0; i < randomNumber.length; i++) {
			if((randomNumber[i] % 7 != 0) && (randomNumber[i] % 5 == 0)) {
				randomNumberSorted[count] = randomNumber[i];
				count++;
			}
		}

		System.out.println(Arrays.toString(randomNumberSorted));
	}
}
