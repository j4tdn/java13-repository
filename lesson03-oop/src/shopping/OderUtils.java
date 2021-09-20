package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OderUtils {
	
	private OderUtils() {
	}
	
	public static double export(Order order) {

		System.out.println("Customer: " + order.getCustomer().getName());
		double totalOfMoney = 0;

		ItemDetail []ids = order.getItemDetails();
		for(ItemDetail id:ids) {
			Item item = id.getItem();
			System.out.print("Item: " + item.getId());
			int quantity = id.getQuantity();
			System.out.println("\tQuantity: " + quantity);
			double Cost = item.getCost() * quantity;
			if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				Cost *= 0.9;
			}
			totalOfMoney += Cost;

		}

		return totalOfMoney;
	}
}
