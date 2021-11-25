package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	
	public static double export(Order order) {
		double totalMoney = 0;
		
		for(ItemDetail itemDetail : order.getItemDetails()) {
			Item item = itemDetail.getItem();
			int quantity = itemDetail.getQuantity();
			
			double cost = item.getPrice() * quantity;
			if(item.getPrice() > 10000 && LocalDate.of(2021, Month.MAY, 5).isEqual(order.getOrderDate().toLocalDate())) {
				cost = cost * 0.9;
			}
			
			totalMoney += cost;
		}
		
		return totalMoney;
	}
}
