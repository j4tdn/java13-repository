package reference.method;

public class FinalExam {
	public static void main(String[] args) {
		boolean result = isPerfect(2);
		if (result) System.out.println("True");
		else System.out.println("False");
	}
	public static boolean isPerfect(int x) {
		if (x > 10000 || x < 4) {
			return false;
		}
		else {
			int S = 0;
			for(int i = 1; i < x; i++) {
				if (x % i == 0) {
					S+=i;
				}
			}
			if (S == x) return true;
		}
		return false;
	}
}
