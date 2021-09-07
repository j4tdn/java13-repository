package hw;

public class Ex06 {

	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		do {
			if (isCheck(i)) {
				count++;
			}
			i++;
		} while(count <= 200);
		System.out.println(i);
	}
	
	private static Boolean isCheck(int input) {
		if (input < 2) {
			return false;
		}
		
		int count = 0;
		for (int i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				count++;
				
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
}
