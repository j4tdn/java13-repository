package ex04;

import java.util.Calendar;


/**
	Hôm nay ngày 27.11. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực hiện các
	chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ nên
	không tính vào trong thời gian thực hiện 110 ngày. Nếu trúng dịp lễ tết sẽ được nghỉ từ ngày 29.12
	đến 05.01 năm sau. Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */

public class App {
	
	public static void main(String[] args) {
		Calendar current = Calendar.getInstance();
		current.set(2021, 10, 27);
		System.out.println("Date of delivery: " + dateOfDelivery(current));
	}
	
	private static String dateOfDelivery(Calendar c) {
		// timeFromStartToDelivery
		int tfstd = timeFromStartToDelivery(c);
		// dateOfDelivery
		Calendar dod = Calendar.getInstance();
		for (int i = 1; i <= tfstd; i++) dod.setTimeInMillis(dod.getTimeInMillis() + 60 * 60 *24 * 1000);
		return dod.get(Calendar.DAY_OF_MONTH) + "/" + (dod.get(Calendar.MONTH) + 1) + "/" + dod.get(Calendar.YEAR);
	}
	
	private static int timeFromStartToDelivery(Calendar c) {
		// time start working
		Calendar tsw = Calendar.getInstance();
		tsw.setTimeInMillis(c.getTimeInMillis());
		// number of working days
		int nowd = 110;
		// time from start to delivery
		int tfstd = 0;
		// Tet holiday starts (milisecond)
		Calendar starts = Calendar.getInstance();
		starts.set(2021, 11, 29);
		// Tet holiday ends (milisecond)
		Calendar ends = Calendar.getInstance();
		ends.set(2022, 0, 5);	
		while (nowd > 0) {
			tfstd++;
			if (tsw.get(Calendar.DAY_OF_WEEK) == 7 || tsw.get(Calendar.DAY_OF_WEEK) == 1) {
				nowd++;
			}
			if (tsw.getTimeInMillis() > starts.getTimeInMillis() && tsw.getTimeInMillis() < starts.getTimeInMillis()) {
				nowd++;
			}
			tsw.setTimeInMillis(tsw.getTimeInMillis() + 60*60*24*1000);
			nowd--;
		}	
		return tfstd;
	}
	
}	
