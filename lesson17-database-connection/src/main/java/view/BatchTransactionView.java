package view;

import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;
import service.ItemDetailService;
import service.ItemDetailServiceImpl;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class BatchTransactionView {
	private static ItemGroupService itemGroupService;
	private static ItemDetailService itemDetailService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemDetailService = new ItemDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		itemDetailService.doTransfer();
		
		
		/*int[] affectedRows = itemGroupService.save(mockItemGroups());
		
		if (affectedRows != null) {
			Arrays.stream(affectedRows)
			  	  .forEach(affectedRow -> System.out.print(affectedRow + " "));
		}*/
	}
	
	private static List<ItemGroup> mockItemGroups() {
		return Arrays.asList(
				new ItemGroup(1111, "IG 1111"),
				new ItemGroup(222, "IG 222"),
				new ItemGroup(3333, "IG 3333")
		);
	}
}
