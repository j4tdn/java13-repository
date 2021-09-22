package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of Order Class
 * Normally: Utility is place where contains helper utility methods
 * (utility: truyền vào tham số ~ và trả về ~ chứ không quan tâm đến đối tượng gọi nó)
 * No cares created class's objects
 */

public class OrderUtils {
	
	private OrderUtils() { // đặt private ở defaul constructor để không cho tạo đối tượng một cách tùy ý
	}
	
	// o1, o2, o3 => phụ thuộc vào đối tượng => non-static
		public static double export(Order order) {
			double totalOfMoney = 0;
			ItemDetail[] ids = order.getItemDetails();
			// for index
			/*for (int i = 0; i < ids.length; i++) {
				ItemDetail id = ids[i]; */
			// for each => duyệt từng phần tử id trong ids
			for (ItemDetail id : ids) {
				Item item = id.getItem();
				int quantity = id.getQuantity();
				
				double idCost = item.getCost() * quantity;
				if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
					idCost *= 0.9;
				}
				totalOfMoney += idCost;
			}
			return totalOfMoney;
		}
}
