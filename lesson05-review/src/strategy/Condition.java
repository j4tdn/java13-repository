package strategy;

@FunctionalInterface
public interface Condition {
	boolean execute(int a);
}
