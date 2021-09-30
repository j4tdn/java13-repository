package ex02;

/**
 * 	Cho một dãy số nguyên ngẫu nhiên gồm n chữ số, viết chương trình:
	Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. Các số
	vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
	Input: 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18
	Output: 21, 49, 14 , 12, 19, 32, 35, 33, 18, 25, 10
 */

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
	
		int[] divisibleBySevenNotByFive = new int[11];
		int[] divisibleByFiveNotBySeven = new int[11];
		int[] bothDivisibleOrNotdivisible = new int[11];
		int bound1 = 0, bound2 = 0, bound3 = 0;
		
		for(int digit : digits) {
			if(digit % 35 == 0) {
				bothDivisibleOrNotdivisible[bound2++] = digit;
			} else if(digit % 7 == 0) {
				divisibleBySevenNotByFive[bound1++] = digit;
			} else if(digit % 5 == 0) {
				divisibleByFiveNotBySeven[bound3++] = digit;
			} else {
				bothDivisibleOrNotdivisible[bound2++] = digit;
			}
		}
		
		printArray(divisibleBySevenNotByFive, bound1);
		printArray(bothDivisibleOrNotdivisible, bound2);
		printArray(divisibleByFiveNotBySeven, bound3);
		
	}
	
	private static void printArray(int [] digits, int numberOfDigits) {
		for(int i = 0; i < numberOfDigits; i++) {
			System.out.print(digits[i] + " ");
		}
	}
}
