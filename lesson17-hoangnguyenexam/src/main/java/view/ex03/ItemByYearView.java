package view.ex03;

import java.util.List;

import service.ex03.ItemService;
import service.ex03.ItemServiceImpl;

public class ItemByYearView {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		List<String> result = itemService.getItemByYear(2020);
		result.forEach(System.out::println);
	}
}
