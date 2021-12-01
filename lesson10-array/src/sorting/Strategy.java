package sorting;

public interface Strategy {
	/**
	 * Compare two values a and b.
	 * a: first element
	 * b: second element
	 * return positive if a > b, negative if a < b, zero: if a = b
	 */
	int compare(int a, int b);

}
