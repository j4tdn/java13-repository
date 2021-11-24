package strategy;

@FunctionalInterface
public interface Condition {
	double calculate(int a, int b);
}
