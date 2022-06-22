package view;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemSizeRelation;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	
	private static ItemService itemService;
	
	static  {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Item> items = itemService.getAll();
		System.out.println("size: " + items.size());
		
		System.out.println("=======================");
		
		Item item0 = items.get(0);
		List<ItemSizeRelation> itemSizeRelations = item0.getItemSizeRelations();
		System.out.println("item0: " + item0);
		System.out.println("itemSizeRelations: " + itemSizeRelations.size());
		
		
		System.out.println("=======================");
		Map<ItemGroup, List<Item>> itemgroups = items.stream().collect(Collectors.groupingBy(Item::getItemGroup));
		itemgroups.entrySet().forEach(System.out::println);
		
		System.out.println("=======================");
		Optional<Item> optItem = itemService.get(6);
		if (optItem.isPresent()) {
			System.out.println("Item 6: " + optItem.get());
		}
		
		System.out.println("==========1st=============");
		itemService.demoHibernate1stLevelCache();
	}
}
