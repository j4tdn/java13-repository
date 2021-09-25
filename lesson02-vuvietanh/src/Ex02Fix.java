
public class Ex02Fix {
	public static void main(String[] args) {
		int[] numbers = { 4, 7, 12, 18 };
		long result = 1;
		for(int number : numbers) {
			result += soGiaiThua(number);
		}
		System.out.println(result);
	}

	private static long soGiaiThua(int a) {
		long result = 1;
		while (a > 1) {
			result *= a;
			a--;
		}
		return result;
	}

}
