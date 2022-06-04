package view;

import java.util.List;

import persistence.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bai 3");
		List<Item> itemsByIgName = itemService.getBestSaleItem();
		itemsByIgName.forEach(System.out::println);
	}
}
