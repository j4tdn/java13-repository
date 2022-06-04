package view;

import java.util.List;

import persistence.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;
	private static String igName;
	
	static {
		itemService = new ItemServiceImpl();
		igName = "Áo";
	}
	
	public static void main(String[] args) {
		System.out.println("1. Liệt kê mặt hàng, loại hàng theo tên loại");
		List<Item> itemsByIgName = itemService.findItemsByItemGroupName(igName);
		itemsByIgName.forEach(System.out::println);
	}
}
