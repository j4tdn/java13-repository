package sorting;

@FunctionalInterface
public interface Strategy {
	/**
	 * a > b return positive, negative if a < b, zero if a = b
	 */
	int compare(int a, int b);
}
