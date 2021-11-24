package strategy;

@FunctionalInterface
public interface Requirement {
	boolean check(int a);
}
