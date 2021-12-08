package sorting.primitive;

@FunctionalInterface
public interface Condition {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return positive if a>b, negative if a<b, zero if a=b
	 */
	// boolean check(int a, int b);
	int check(int a, int b);
}
