package ex05;

public interface filterPriceFrom100To200 extends Condition{
	@Override
	default boolean check(Book book) {
		return book.getPrice() <= 200 && book.getPrice() >= 100;
	}
}
