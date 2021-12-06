package ex04;

public class Utils {
	private Utils() {

	}

	public static void swap(int[] origin, int i, int j) {
		int tmp = origin[i];
		origin[i] = origin[j];
		origin[j] = tmp;
	}

}
