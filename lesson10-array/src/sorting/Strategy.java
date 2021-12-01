package sorting;

@FunctionalInterface
public interface Strategy {
	int compare(int a, int b);
}
