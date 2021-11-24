package ex05_review;

@FunctionalInterface 
public interface Condition {
	
	boolean check(Book book);
	
	//boolean validate(Book book );
}
