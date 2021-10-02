package ex5;

public class OrderUtils {
	private OrderUtils() {
		
	}
	
	public static float getTotalMoney(Order order) {
		float sum = 0;
		for (Book booki : order.getBooks()) {
			sum += booki.getBill();
		}
		return sum;
	}
}
