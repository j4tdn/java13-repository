package view;

import java.util.List;
import java.util.Scanner;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

/**
 * 1. Liệt kê toàn bộ các loại hàng trong hệ thống
 *    MVC: View, Service, Dao
 *    Dao, Service Design Pattern
 *    + Better for searching, updating the legacy code
 *    + Better for design, working in a group
 *    + ...
 * 2. Liệt kê LoaiHang theo MaLoai
 * 3. Thêm mới LoaiHang
 *
 */
public class ItemGroupView {
	
	private static Scanner ip = new Scanner(System.in);
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("6. Đếm số lượng mặt hàng theo loại hàng");
		List<ItemGroupDto> itemsByItemGroup = itemGroupService.getItemsByItemGroup();
		itemsByItemGroup.forEach(System.out::println);
		
		System.out.println("\n=============================\n");
		
		System.out.print("Enter item group name:|||");
		String igName = ip.nextLine();
		System.out.println("5. Liệt kê LoaiHang theo Tên Loại");
		ItemGroup itemGroupByName = itemGroupService.get(igName);
		System.out.println(itemGroupByName);
		
		System.out.println("\n=============================\n");
		
		System.out.println("4. Cập nhật loại hàng");
		int updatedRows = itemGroupService.update(new ItemGroup(123, "LH123"));
		System.out.println(updatedRows);
		
		// System.out.println("3. Thêm mới loại hàng");
		// int insertCounter = itemGroupService.save(new ItemGroup(999, "Loại Hàng 999"));
		// System.out.println("is insert success ? " + (insertCounter != -1));
		
		System.out.println("\n=============================\n");
		
		System.out.println("2. Liệt kê LoaiHang theo MaLoai");
		ItemGroup itemGroup = itemGroupService.get(3);
		System.out.println(itemGroup);
		
		System.out.println("\n=============================\n");
		
		System.out.println("1. Liệt kê toàn bộ các loại hàng trong hệ thống");
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		itemGroups.forEach(System.out::println);
	}
}
