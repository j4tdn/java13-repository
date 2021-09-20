package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH01", "Ann", "012345", "NewYork");
		Customer c2 = new Customer("KH02", "Quinn", "0145", "Ohio");
		Item i1 = new Item("SS10", "Android", "Black", 620);
		Item i2 = new Item("IP10", "IOS", "White", 500);
		Item i3 = new Item("XMN7", "IOS", "Black", 430);
		Item i4 = new Item("WP8", "WindownPhone", "Blue", 770);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3 ),
				new ItemDetail(i4,5 ),
				new ItemDetail(i3,2 ),
				new ItemDetail(i2,1 ),
				}, LocalDateTime.of(2021, 5, 8, 10, 10, 10) );
		
		Order o2 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,2 ),
				new ItemDetail(i4,1 ),
				}, LocalDateTime.of(2021, 5, 8, 9,28, 32) );
		
		Order o3 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i4,1 ),	
		}, LocalDateTime.of(2021, 5, 7, 20, 10, 12) );
	
		System.out.println("Order 1: "+ o1.export());
		System.out.println("Order 2: "+ o2.export());
		System.out.println("Order 3: "+ o3.export());
	}
	
	
	
	
}
