package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		/*
		 * c1: KH1, Adam, 123, NewYork
			c2: KH2, Kate, 234, California
			
			i1: SS10+, Android, Black, 620
			i2: SS20U, Android, Green, 840
			i3: IP4, IOS, While, 500
			i4: IP12, IOS, Black, 880
			i5: WP8, WindowPhone, Blue, 560
		 */
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "234", "California");
				
		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 840);
		Item i3 = new Item("IP4", "IOS", "While", 500);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);
		
		/*
		o1: c1, {id1(i1, 3), id(i4,1), i3(id3,1)}, 10:10:10 08.05.2021 
		o2: c2, {id1(i3, 2), id(i5,1)}, 20:10:10 07.05.2021
		o3: c2, {id1(i4, 1)}, 09:28:32 08.05.2021
		*/
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3),
				new ItemDetail(i4,5),
				new ItemDetail(i2,1),
				
		}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3,2),
				new ItemDetail(i5,1),
				
		}, LocalDateTime.of(2021, 5, 7, 20, 10, 10));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4,1),
				
		}, LocalDateTime.of(2021, 5, 8, 21, 28, 32));
		
		System.out.println("Order 1: " + o1.export());
		System.out.println("Order 2: " + o2.export());
		System.out.println("Order 3: " + o3.export());
	}
}
