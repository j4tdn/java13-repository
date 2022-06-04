package view;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

/**
 * Hello world!
 *
 */
public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;

	private static LocalDate orderDate;
	private static int year;

	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();

		orderDate = LocalDate.of(2019, 11, 23);
		year = 2020;
	}

	public static void main(String[] args) {

		// cau1
		List<ItemDto> itemsByOrderDate = itemService.getItemsByDate(orderDate);
		SqlUtils.print(itemsByOrderDate);

		// cau2
		List<ItemGroupDto> itemsByItemGroup = itemGroupService.getItemsByItemGroup();
		SqlUtils.print(itemsByItemGroup);

		// cau3
		List<String> ThreeItemsBestSeelingOfTheYear = itemService.getThreeItemBestSellingOfTheYear(year);
		SqlUtils.print(ThreeItemsBestSeelingOfTheYear);

		// Cau4
		List<Item> statistics = itemService.statistic();
		SqlUtils.print(statistics);
	}
}