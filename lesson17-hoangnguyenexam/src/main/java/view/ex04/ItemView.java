package view.ex04;

import java.util.List;

import persistence.ItemDto;
import service.ex04.ItemDtoService;
import service.ex04.ItemDtoServiceImpl;

public class ItemView {
	private static ItemDtoService itemDtoService;
	
	static {
		itemDtoService = new ItemDtoServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemDto> result = itemDtoService.getItems();
		result.forEach(System.out::println);
	}
}
