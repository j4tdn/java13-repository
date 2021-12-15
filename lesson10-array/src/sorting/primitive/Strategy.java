package sorting.primitive;

@FunctionalInterface
public interface Strategy {
	int compare(int a, int b);
}
