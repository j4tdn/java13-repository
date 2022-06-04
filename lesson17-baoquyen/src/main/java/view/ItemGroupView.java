package view;

import java.util.List;

import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	 public static void main(String[] args) {
		 System.out.println("bai 2");
		List<ItemGroupDto> itemGroupDtos = itemGroupService.getItems();
		itemGroupDtos.forEach(System.out::println);
	}
}
