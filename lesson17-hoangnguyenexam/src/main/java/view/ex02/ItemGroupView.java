package view.ex02;

import java.util.List;

import persistence.ItemGroupDto;
import service.ex02.ItemGroupService;
import service.ex02.ItemGroupServiceImpl;

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroupDto> result = itemGroupService.getItemByItemGroup();
		result.forEach(System.out::println);
	}
}
