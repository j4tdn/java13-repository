package ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import bean.CD;
import model.CDData;

/**
 * @author Pho Dac Biet 
 * Viết ứng dụng quản lý cửa hàng băng đĩa CD. Mỗi đĩa CD chứa các thông tin sau
	Mã CD : số nguyên
	Loại CD : chuỗi ký tự
	Ca sỹ : chuỗi ký tự
	Số bài hát : số nguyên dương
	Giá thành : số thực dương
	Tạo danh sách các đĩa CD và thực hiện các yêu cầu sau đây:
	- Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.
	- Tìm số lượng CD có trong danh sách.
	- Tình tổng giá thành của các CD.
	- Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
	- Viết phương thức sắp xếp danh sách tĕng dần theo mã CD.
 */

public class App {
	public static void main(String[] args) {
		Set<CD> cds = CDData.getAll();

		System.out.println("List origin CD : ");
		CDData.print(cds);

		System.out.println("=========================");

		// 1. Thêm 1 CD vào danh sách
		System.out.println("Add CD successfully : " + cds.add(new CD(2, "DVD", "Smith", 2, 120)));
		// System.out.println("Add CD successfully : " + cds.add(new CD(7, "DVD",
		// "Smith", 2, 120)));
		System.out.println("=========================");

		// 2. Tìm số lượng CD có trong danh sách.
		System.out.println("Number of CDs : " + cds.size());
		System.out.println("=========================");

		// 3. Tình tổng giá thành của các CD.
		System.out.println("Total prices of CDs: " + totalPrice(cds));
		System.out.println("==========================");

		// 4. Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
		Set<CD> sortedList1 = sort(cds, Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
		System.out.println("Cd's list sorted by descending order of price: ");
		CDData.print(sortedList1);
		System.out.println("==========================");

		// 5. Viết phương thức sắp xếp danh sách tĕng dần theo mã CD.
		Set<CD> sortedList2 = sort(cds, Comparator.comparing(CD::getId));
		System.out.println("Cd's list sorted by ascending order of cd's id: ");
		CDData.print(sortedList2);
		System.out.println("==========================");
	}

	private static double totalPrice(Set<CD> cds) {
		double total = 0;
		for (CD cd : cds) {
			total += cd.getPrice();
		}
		return total;
	}

	private static Set<CD> sort(Set<CD> cds, Comparator<CD> predicate) {
		List<CD> sortedList = new ArrayList<>(cds);
		sortedList.sort(predicate);
		Set<CD> sortedSet = new LinkedHashSet<CD>();
		for (CD cd : sortedList) {
			sortedSet.add(cd);
		}
		return sortedSet;
	}
}
