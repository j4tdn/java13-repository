package ex05;

public class ShoppingUtils {
	private ShoppingUtils() {
		
	}
	public static double getToTalPrice(Shopping s) {
		double toTalPrice = 0d;
		for(TextBook tb: s.getTbs()) {
			toTalPrice += tb.getPrice();
		}
		for(ReferenceBook rb: s.getRbs()) {
			toTalPrice += rb.getPrice();
		}
		return toTalPrice;
	}
}
