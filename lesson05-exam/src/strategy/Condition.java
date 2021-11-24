package strategy;


@FunctionalInterface
public interface Condition {
	boolean check(int number);
}
