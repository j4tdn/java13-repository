package view;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImple;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImple();
	}
	public static void main(String[] args) {
		System.out.println("2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng.");
		List<ItemGroup> itemGroups = itemGroupService.getAllByItemGroup();
		itemGroups.forEach(System.out::println);
		System.out.println("============================");
		System.out.println("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng.");
		List<ItemGroupDto> itemGroupDtos = itemGroupService.getItemByItemGroup();
		itemGroupDtos.forEach(System.out::println);
	}
}
