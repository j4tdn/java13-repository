package sorting.primitive;

public interface Strategy {
	/**
	 * Compare two values a and b.
	 * 
	 * @param a first element
	 * @param b second element
	 * @return positive if a > b, negative if a < b, zero if a = b
	 */
	int compare(int a, int b);
}
