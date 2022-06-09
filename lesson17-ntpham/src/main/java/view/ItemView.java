package view;

import java.time.LocalDate;
import java.util.List;

import persistence.HighestPriceItemDto;
import persistence.ItemCountDto;
import persistence.ItemDto;
import service.ItemService;
import service.ItemServiceImpl;


/**
 * @author Pho Dac Biet
 * 
 * 1. Liệt kê các mặt hàng được bán trong ngày 23-11-2019. Với ngày bán là tham số
	truyền vào kiểu dữ liệu LocalDate. Kết quả trả về có dạng như sau
	
   3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020. Với năm là tham số
	truyền vào.
	
   4.Viết chương trình tìm mặt hàng có giá bán cao nhất của mỗi loại hàng. Nếu các
	mặt hàng trong cùng loại hàng có giá bán cao nhất và bằng nhau thì hiển thị tất
	cả mặt hàng đó
 */
public class ItemView {
	private static ItemService itemService;
	private static LocalDate saleDate;
	
	
	static {
		itemService = new ItemServiceImpl();
		saleDate = LocalDate.of(2019, 11, 23);
	}
	
	public static void main(String[] args) {
		
		// 1. Liệt kê các mặt hàng được bán trong ngày 23-11-2019
		System.out.println("1. Các mặt hàng được bán trong ngày 23-11-2019: ");
		List<ItemDto> itemDtoBySaleDates = itemService.get(saleDate);
		itemDtoBySaleDates.forEach(System.out::println);
		
		System.out.println("====================================================");
		
		// 3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020
		System.out.println("3. Top 3 mặt hàng được bán nhiều nhất năm 2020: ");
		List<ItemCountDto> saledItemsByYear = itemService.count("2020");
		saledItemsByYear.forEach(System.out::println);
		
		System.out.println("====================================================");
		
		// 4. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng.
		System.out.println("4. Mặt hàng có giá bán cao nhất của mỗi loại hàng: ");
		List<HighestPriceItemDto> highestPriceItemOfItemGroup = itemService.getHighestPriceItem();
		highestPriceItemOfItemGroup.forEach(System.out::println);
	}
}
