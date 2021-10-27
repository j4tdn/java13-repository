package ex04;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * Bài 4: Hôm nay ngày 27.11. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu
 * thực hiện các chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ
 * nhật được xem như ngày nghỉ nên không tính vào trong thời gian thực hiện 110
 * ngày. Nếu trúng dịp lễ tết sẽ được nghỉ từ ngày 29.12 đến 05.01 năm sau. Hỏi
 * ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2021, Calendar.NOVEMBER, 27);
		Calendar c1 = Calendar.getInstance();
		c1.setFirstDayOfWeek(2);
		c1.setTimeInMillis(c.getTimeInMillis());
		int deadline = 110;
		do {
			c1.add(Calendar.DAY_OF_MONTH, 1);
			if (satisfy(c1)) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				deadline--;
			}
		} while (deadline != 0);
		//c1.add(Calendar.DAY_OF_MONTH, 141);
		System.out.println("Nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B vào: " + formatDay(c1));
	
	}

	public static String formatDay(Calendar c) {
		SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
		String date = dtf.format(c.getTime());
		return date;
	}

	public static boolean satisfy(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int month = c.get(Calendar.MONTH)+1;
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		if (dayOfWeek == 7 || dayOfWeek == 1) {
			return false;
		} else if (month == 12) {
			if (dayOfMonth == 29 || dayOfMonth == 30 || dayOfMonth == 31) {
				return false;
			}
		} else if (month == 1) {
			if (dayOfMonth == 1 || dayOfMonth == 2 || dayOfMonth == 3 || dayOfMonth == 4 || dayOfMonth == 5) {
				return false;
			}
		}
		return true;
	}

}
