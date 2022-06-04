package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;

public class ItermGroupView {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2019, 11, 23);
		Date date = Date.valueOf(localDate);


		System.out.println("Bai 1");
		List<Item> list1 = itemGroupService.items(date);
		list1.forEach(System.out::println);
		System.out.println("====================================");


		System.out.println("Bai 2");
		List<ItemGroup> list2 = itemGroupService.itemGroups();
		list2.forEach(System.out::println);
		System.out.println("====================================");
	}
} 