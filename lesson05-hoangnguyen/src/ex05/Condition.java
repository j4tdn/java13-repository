package ex05;

@FunctionalInterface
public interface Condition {
	boolean check(Book book);
	
	// Other abstract methods
//	boolean validate(Book book);
//	
//	Book get();
}
