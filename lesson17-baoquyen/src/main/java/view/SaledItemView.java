package view;

import java.time.LocalDate;
import java.util.List;

import persistence.SaledItems;
import service.SaledItemServiceImpl;
import service.SaledItemsService;

public class SaledItemView {
	private static SaledItemsService itemsService;
	private static LocalDate date;
	
	static {
		itemsService = new SaledItemServiceImpl();
		date = LocalDate.of(2020, 12,17);
	}
	
	public static void main(String[] args) {
		System.out.println("1.");
		List<SaledItems> itemsByDate = itemsService.findItemBySalesDate(date);
		itemsByDate.stream().forEachOrdered(System.out::println);
	}
}
