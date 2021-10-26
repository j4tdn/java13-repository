package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập ngày bắt đầu hẹn hò của 2 người: ");

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date start = new Date();
		Date end = new Date();

		try {
			start = df.parse(ip.nextLine());
			long startValue = start.getTime();
			long endValue = end.getTime();

			System.out.println("Đã chia tay? (Y/N)");

			String breakUp;
			do {
				breakUp = ip.nextLine();
			} while (!breakUp.equals("Y") && !breakUp.equals("N"));

			if (breakUp.equals("Y")) {
				while (true) {
					System.out.println("Nhập ngày chia tay: ");
					end = df.parse(ip.nextLine());
					endValue = end.getTime();
					if (end.after(start)) {
						break;
					}
				}
			}

			String[] dayOfWeeks = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
			// index: 0-6
			// start.getDay(): 0-6
			String dayOfWeeksAsString = dayOfWeeks[start.getDay()];
			System.out.println("Ngày bắt đầu hẹn hò của họ là " + dayOfWeeksAsString);
			System.out.println("Mối tình đã bắt đầu được " + yearsDifference(startValue, endValue) + " năm.");
			System.out.println("Mối tình đã bắt đầu được " + monthsDifference(startValue, endValue) + " tháng.");
			System.out.println("Mối tình đã bắt đầu được " + daysDifference(startValue, endValue) + " ngày.");
			System.out.println("Mối tình đã bắt đầu được " + hoursDifference(startValue, endValue) + " giờ.");
			System.out.println("Mối tình đã bắt đầu được " + minutesDifference(startValue, endValue) + " phút.");
			System.out.println("Mối tình đã bắt đầu được " + secondsDifference(startValue, endValue) + " giây.");

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private static long daysDifference(long startValue, long endValue) {
		return (endValue - startValue) / (24 * 60 * 60 * 1000);
	}

	private static long monthsDifference(long startValue, long endValue) {
		return (endValue - startValue) / (24 * 60 * 60 * 1000) / 30;
	}

	private static long yearsDifference(long startValue, long endValue) {
		return (endValue - startValue) / (24 * 60 * 60 * 1000) / 365;
	}

	private static long hoursDifference(long startValue, long endValue) {
		return (endValue - startValue) / (60 * 60 * 1000);
	}

	private static long minutesDifference(long startValue, long endValue) {
		return (endValue - startValue) / (60 * 1000);
	}

	private static long secondsDifference(long startValue, long endValue) {
		return (endValue - startValue) / 1000;
	}
}
