package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDetailDto;
import persistence.ItemDto;
import persistence.NumberItemDto;
import service.ItemDtoService;
import service.ItemDtoServiceImp;

public class ItemDtoView {
	private static ItemDtoService itemDtoService;
	static {
		itemDtoService = new ItemDtoServiceImp();
	}
	public static void main(String[] args) {
		List<ItemDto> itemDtos = itemDtoService.getItem(LocalDate.of(2020, 12, 18));
		
		System.out.println("1.");
		for(ItemDto item: itemDtos) {
			System.out.println(item.toString());
		}
		
		List<ItemDetailDto> itemDetails = itemDtoService.getItemDetail();
		System.out.println("4.");
		for(ItemDetailDto item: itemDetails) {
			System.out.println(item.toString());
		}
		
		List<NumberItemDto> numbers = itemDtoService.getNumberItemDto();
		System.out.println("2.");
		for(NumberItemDto n: numbers) {
			System.out.println(n.toString());
		}
		
		List<String> itemMax3 = itemDtoService.getItemMax(2020);
		System.out.println("3.");
		for(String s: itemMax3) {
			System.out.println(s);
		}
	}
}
