package ex05;

/**
 * 25đ
 */
public class Ex05 {
	
	public static void main(String[] args) {
		// Bài làm khá tốt
		TextBook gk1 = new TextBook("SGK1", 10, "Nhi Đồng", "mới");
		TextBook gk2 = new TextBook("SGK2", 100, "Kim Đồng", "mới");
		TextBook gk3 = new TextBook("SGK3", 83, "Nhi Đồng", "cũ");
		ReferBook tk1 = new ReferBook("STK1", 205, "Nhi Đồng", 20);
		ReferBook tk2 = new ReferBook("STK2", 15, "Kim Đồng", 30);
		Book[] a = { gk1, gk2, gk3, tk1, tk2 };

		// Nếu các method là get >> thì nên return về value chứ k phải return void
		// Tham số a.length bị thừa >> Truyền a rồi vào hàm gọi a.length
		// anw, kết quả chính xác. Chỉnh cách code, convention là oke
		getBookByPublisher(a, a.length);
		System.out.println("-----------------------------------------");

		getBookByPriceLess50(a, a.length);
		System.out.println("-----------------------------------------");

		getBookByPriceFrom100to200(a, a.length);
		System.out.println("-----------------------------------------");

		Customer cus1 = new Customer(1, "My", "0969740147", "Tam Ky");
		Shopping sp1 = new Shopping(cus1, gk1, tk1);
		System.out.println(sp1.totalprice2());

	}

	private static void getBookByPublisher(Book[] a, int n) {
		for (int i = 0; i < n; i++) {
			if (a[i].publisher == "Nhi Đồng") {
				System.out.println(a[i]);
			}
		}
		return;
	}

	private static void getBookByPriceLess50(Book[] a, int n) {
		for (int i = 0; i < n; i++) {
			if (a[i].price < 50) {
				System.out.println(a[i]);
			}
		}
		return;
	}

	private static void getBookByPriceFrom100to200(Book[] a, int n) {
		for (int i = 0; i < n; i++) {
			if ((a[i].price >= 100) && (a[i].price <= 200)) {
				System.out.println(a[i]);
			}
		}
		return;
	}

	private static void getTotalPrice(Book[] a, int n) {

		for (int i = 0; i < n; i++) {
			if ((a[i].price >= 100) && (a[i].price <= 200)) {
				System.out.println(a[i]);
			}
		}
		return;
	}
}
