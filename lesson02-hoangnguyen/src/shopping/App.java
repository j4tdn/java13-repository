package shopping;

import java.time.LocalDateTime;

public class App {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("KH1", "Roll", "0772190059", "Da Nang");
		Customer c2 = new Customer("KH2", "Nhi", "0799334505", "Da Nang");
		
		Item samsungS10 = new Item("Samsung S10", "Android", "Black", 12000);
		Item samsungS20 = new Item("Samsung S20", "Android", "Gold", 22000);
		Item iPhone10 = new Item("iPhone 10", "iOS", "White", 15000);
		Item xiaomi = new Item("Mi Mix 5", "Android", "Black", 9000);
		
		ItemDetail[] i1 = {new ItemDetail(samsungS10, 1)}; 
		ItemDetail[] i2 = {new ItemDetail(samsungS20, 1), new ItemDetail(iPhone10, 2)}; 
		ItemDetail[] i3 = {new ItemDetail(xiaomi, 1)};
		
		Order o1 = new Order(c1, i1, LocalDateTime.of(2021, 5, 5, 8, 19, 3));
		Order o2 = new Order(c2, i2, LocalDateTime.of(2021, 5, 6, 8, 19, 3));
		Order o3 = new Order(c1, i3, LocalDateTime.of(2021, 5, 7, 8, 19, 3));
		
		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));
	}
}
