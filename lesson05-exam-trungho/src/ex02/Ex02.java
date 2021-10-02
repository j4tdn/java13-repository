package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[] arrayA = {3, 2, 1, 6, 5};
		getMissingNumber(arrayA);
	}
	
	public static int getMissingNumber(int[] arrayA) {
		int maxNumber = arrayA.length + 1;
		
		// Create the array with full value
		int[] arrayFull = new int[maxNumber];
		for(int i = 0; i < maxNumber; i++) {
			arrayFull[i] = i+1;
		}
		
		// Get the number that in arrayFull but not in arrayA
		for (int j = 0; j < maxNumber; j++) {
			for (int k = 0; k < maxNumber - 1; k++) {
				int count = 0;
				if(arrayFull[j] == arrayA[k]) {
					count = count + 1;
				}
				if(count == 0) {
					System.out.println(arrayFull[j]);
					return arrayFull[j];
				}
			}
			
		}
		return -1;
	}
}
