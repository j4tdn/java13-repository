package view;

import java.util.List;

import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

/**
 * @author Pho Dac Biet
 *	2. Viết chương trình đếm số lượng các mặt hàng của từng loại hàng
 */

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Số lượng các mặt hàng của từng loại hàng: ");
		List<ItemGroupDto> itemsOfItemGroup = itemGroupService.count();
		itemsOfItemGroup.forEach(System.out::println);
	}
}
