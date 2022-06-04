package view;

import java.util.List;
import java.util.Scanner;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

/**
 * 
 * 1. Liệt kê toàn bộ các loại hàng trong hệ thống
 *	MVC: View, Service, Dao
 *  Dao, Service Design Pattern
 *  + Better for searching, updating the legacy code
 *  + Better for designing, working in a group
 */
public class ItemGroupView {
	
	private static Scanner ip = new Scanner(System.in);
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("6. Đếm số lượng mặt hàng theo loại hàng");
		List<ItemGroupDto> itemGroupDtos = itemGroupService.getItemsByItemGroup();
		itemGroupDtos.forEach(System.out::println);
		System.out.println("===================");
//		System.out.println("5. Enter item group name:");
//		String igName = ip.nextLine();
//		ItemGroup itemGroupsByName = itemGroupService.getItemGroup(igName);
//		System.out.println(itemGroupsByName);
//		System.out.println("===================");
//		System.out.println("4. Update");
//		int updateitemGroup = itemGroupService.update(new ItemGroup(10, "TuiSach"));
//		System.out.println("is update success ? = " + (updateitemGroup != -1) );
//		System.out.println("===================");
//		System.out.println("3. Insert");
//		int insertitemGroup = itemGroupService.save(new ItemGroup(10, "Vay"));
//		System.out.println("is insert success ? = " + (insertitemGroup != -1) );
//		System.out.println("===================");
//		System.out.println("2. ");
//		ItemGroup itemGroupsByID = itemGroupService.getItemGroup(1);
//		System.out.println(itemGroupsByID);
//		System.out.println("===================");
		System.out.println("1. ");
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		itemGroups.forEach(System.out::println);
	}
	
}
