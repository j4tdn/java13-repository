package ex05;

@FunctionalInterface
public interface Condition {
	boolean check(Book book);
}