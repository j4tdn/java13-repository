package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * Utility of Order Class
 * Normally: Utility is place where contains helper method
 * No care created class's object
 * 
 */

public class OrderUtils {
	
	private OrderUtils() {}
	
	public static double export(Order order) {
		double totalOfMoney = 0;

		ItemDetail[] itemDetails = order.getItemDetails();
		for (ItemDetail itemDetail : itemDetails) {
			Item item = itemDetail.getItem();
			int quantity = itemDetail.getQuantity();
			double idCost = item.getCost() * quantity;

			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			} 
			
			totalOfMoney += idCost;

		}

		return totalOfMoney;

	}
}
