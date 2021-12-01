package sorting;

public interface Strategy {
	/**
	 * If a > b return true and false if vice versa
	 * @param a first element
	 * @param b second element
	 * @return true if a > b, negative if a < b, zero if a = b
	 */
	int compare(int a, int b);
}
