package ex05;

// strategy
@FunctionalInterface
public interface Condition {
	
	// algorithm
	boolean check(Book book);
	
	// other abstract methods
	// boolean validate(Book book);
	
	// Book get();
}
