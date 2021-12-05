package ex01;

/**
 * Compare average of first n/2 elements and last n/2 elements of an array
 */
public class App_2 {
	public static void main(String[] args) {
		int[] origin = { 1, 2, 3, 4, 3, 1 };
		int i = origin.length / 2;

		int sumFirstHalfElements = 0, sumLastHalfElements = 0;

		for (int j = 0; j < i; j++) {
			sumFirstHalfElements += origin[j];
		}

		for (int j = i; j < origin.length; j++) {
			sumLastHalfElements += origin[j];
		}

		if (sumFirstHalfElements == sumLastHalfElements) {
			System.out.println("Average of First Half Elements is EQUAL to Average of Last Half Elements");
		} else if (sumFirstHalfElements > sumLastHalfElements) {
			System.out.println("Average of First Half Elements is BIGGER than Average of Last Half Elements");
		} else {
			System.out.println("Average of First Half Elements is LESS than Average of Last Half Elements");
		}
	}
}
