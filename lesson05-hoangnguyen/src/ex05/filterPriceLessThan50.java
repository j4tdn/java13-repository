package ex05;

public interface filterPriceLessThan50 extends Condition{
	@Override
	default boolean check(Book book) {
		return book.getPrice() < 50;
	}
}
