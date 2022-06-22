package view;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n===============2nd cache==================\n");
		itemGroupService.secondLevelCache();
		
		
		System.out.println("\n=================================\n");
		
		List<ItemGroupDto> countedItemsByIgroup = itemGroupService.getItemsByItemGroup();
		countedItemsByIgroup.forEach(System.out::println);
		
		System.out.println("\n=================================\n");
		
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		itemGroups.forEach(group -> {
			System.out.println(">>> " + group);
			List<Item> items = group.getItems();
			items.forEach(System.out::println);
			System.out.println();
		});
	}
}
