package ex02;

import java.util.ArrayList;
import java.util.Comparator;
/**
 * Bài 2: Viết ứng dụng quản lý cửa hàng băng đĩa CD. Mỗi đĩa CD chứa các thông tin sau
	Mã CD : số nguyên
	Loại CD : chuỗi ký tự
	Ca sỹ : chuỗi ký tự
	Số bài hát : số nguyên dương
	Giá thành : số thực dương
	Tạo danh sách các đĩa CD và thực hiện các yêu cầu sau đây:
	- Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.
	- Tìm số lượng CD có trong danh sách.
	- Tính tổng giá thành của các CD.
	- Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
	- Viết phương thức sắp xếp danh sách tăng dần theo mã CD.
 */
import java.util.List;

import utils.Utils;

public class App {
	public static void main(String[] args) {
		List<Disk> disks = mockData();
		Utils.printAll(disks);
		space();
		// 1.Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng  mã CD
		Disk d1 = new Disk(1, "abc", "xyz", 10, 10000d);
		Disk d2 = new Disk(4, "def", "yzt", 9, 20000d);
		add(d1, disks);
		add(d2, disks);
		System.out.println("List after added: ");
		Utils.printAll(disks);
		space();
		
		// 2.Tìm số lượng CD có trong danh sách.
		System.out.println("Number of CD in list: " + disks.size());
		space();
		
		// 3.Tính tổng giá thành của các CD.
		System.out.println("Total price: " + Utils.getTotalPrice(disks));
		space();
		
		// 4. Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
		disks.sort(Comparator.comparing(Disk::getPrice, Comparator.reverseOrder()));
		System.out.println("List after sorted based on descending price: ");
		Utils.printAll(disks);
		space();
		
		// 5. Viết phương thức sắp xếp danh sách tăng dần theo mã CD.
		disks.sort(Comparator.comparing(Disk::getId));
		System.out.println("List after sorted based on ascending id: ");
		Utils.printAll(disks);
	}
	private static void space() {
		System.out.println("\n==================================\n");
	}
	private static List<Disk> mockData() {
		List<Disk> disks = new ArrayList<>();

		disks.add(new Disk(1, "Thieu Nhi", "Xuan Mai", 4, 35000d));
		disks.add(new Disk(2, "Tre Con", "HKT-M", 5, 45000d));
		disks.add(new Disk(3, "Nguoi Lon", "HKT", 6, 25000d));

		return disks;
	}

	private static void add(Disk d, List<Disk> disks) {
		if (!isExist(d, disks)) {
			disks.add(d);
			System.out.println("Add successfully!!!");
		} else {
			System.out.println("XXX => Duplicated ID(" + d.getId() + ")!!!");
		}
	}

	private static boolean isExist(Disk d, List<Disk> disks) {
		for (Disk disk : disks) {
			if (disk.getId() == d.getId()) {
				return true;
			}
		}
		return false;
	}
}
