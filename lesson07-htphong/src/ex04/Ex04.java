package ex04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/** Hôm nay ngày 27.11. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực hiện các
chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ nên
không tính vào trong thời gian thực hiện 110 ngày. Nếu trúng dịp lễ tết sẽ được nghỉ từ ngày 29.12
đến 05.01 năm sau. Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
*/

public class Ex04 {
	private static SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.set(2021, 10, 27);
		System.out.println("Release Day: " + calculate(now));
	}
	
	private static String calculate(Calendar c ) {
		Calendar event = Calendar.getInstance();
		event.set(2021, 11, 29);
		
		Calendar c1 = Calendar.getInstance();
		int i = 1;
		int days = c.get(Calendar.DAY_OF_YEAR);
		while (i<=110) {
			c1.set(Calendar.DAY_OF_YEAR, days);
			if(days > c1.getActualMaximum(Calendar.DAY_OF_YEAR)) {
				c1.set((c1.get(Calendar.YEAR)), 0, (days-c1.get(Calendar.DAY_OF_YEAR)));
				days = days-c1.get(Calendar.DAY_OF_YEAR);
				c1.set(Calendar.DAY_OF_YEAR, days);
			}
//			System.out.println(fm.format(c1.getTime()) +" " + c1.get(Calendar.DAY_OF_WEEK) + " " + days);
			if(days == event.get(Calendar.DAY_OF_YEAR)) {
				days+=7;
			}
			else {
				days++;
				if(c1.get(Calendar.DAY_OF_WEEK) != 7 && c1.get(Calendar.DAY_OF_WEEK) != 1) {
					i++;
				}
			}
			
		}
		
		return fm.format(c1.getTime());
	}
}
