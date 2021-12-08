package sorting.primitive;

/**
 * Compare 2 values a and b
 * a first element
 * b second element
 *
 */
@FunctionalInterface
public interface Strategy {
	int compare(int a, int b);
}
