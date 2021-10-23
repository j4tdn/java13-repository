package ex05;

public class ShoppingUtils {
	private ShoppingUtils() {
		
	}
	public static double getToTalPrice(Shopping s) {
		double toTalPrice = 0d;
		for(Book tb: s.getBooks()) {
			toTalPrice += tb.getPrice();
		}
		return toTalPrice;
	}
}
