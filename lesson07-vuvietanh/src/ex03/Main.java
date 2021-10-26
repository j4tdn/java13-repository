package ex03;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

/**Viết chương trình, mỗi chức năng một phương thức
1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ. 
2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày
 */
public class Main {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY EEEE HH:mm:ss");
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY EEEE ");
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Giờ hiện tại là :" + sdf.format(c.getTime()));
		int dayMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(dayMonth);
		int fdow = c.getFirstDayOfWeek();
		c.add(Calendar.DAY_OF_MONTH, fdow - c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getTime());
		
		int dayIndex = 1;
		while(dayIndex <= 7) {
			System.out.println(sdf1.format(c.getTime()));
			c.add(Calendar.DAY_OF_MONTH, 1);
			dayIndex++;
		}
		
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("20 ngày nữa là ngày: " + sdf.format(c.getTime()));
}	
}
