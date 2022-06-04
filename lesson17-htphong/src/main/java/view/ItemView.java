package view;

import java.util.List;

import service.ItemService;
import service.ItemServiceImple;

public class ItemView {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImple();
	}
	public static void main(String[] args) {
		System.out.println("Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020.:");
		List<String> itemGroups = itemService.getTopThreeItem();
		itemGroups.forEach(System.out::println);
	}
}
