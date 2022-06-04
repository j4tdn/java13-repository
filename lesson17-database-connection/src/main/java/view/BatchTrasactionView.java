package view;

import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;
import service.ItemDetailService;
import service.ItemDetailServiceImpl;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class BatchTrasactionView {

	private static ItemGroupService itemGroupService;
	private static ItemDetailService itemDetailService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemDetailService = new ItemDetailServiceImpl();
	}
	
	private static List<ItemGroup> movkItemGroups(){
		return Arrays.asList(
				new ItemGroup(111, "IG 111"),
				new ItemGroup(222, "IG 222"),
				new ItemGroup(333, "IG 333")
				);
	}
	
	public static void main(String[] args) {
		itemDetailService.doTranfer();
//		int[] affectedRows = itemGroupService.save(movkItemGroups());
//		
//		if(affectedRows  != null) {
//			Arrays.stream(affectedRows)
//			.forEach(affectedRow -> System.out.println(affectedRow + "  ") );
//		}
		
		
	}
}
