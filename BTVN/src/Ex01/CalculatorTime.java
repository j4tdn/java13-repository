package Ex01;

import java.util.Calendar;
import java.util.Scanner;

public class CalculatorTime {
	private static Scanner sc = new Scanner(System.in);
	private static String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday","Thusrday","Friday","Saturday"};
	private static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		int luachon = 0;
		do {
			System.out.println("Bạn đang trong mối quan hệ nào??");
			System.out.println("1. Chưa từng yêu đương");
			System.out.println("2.Đang hẹn hò  ");
			System.out.println("3.Đã từng yêu đương");
			System.out.println("0.Không muốn trả lời câu hỏi này!!");
			System.out.print("Lựa chọn: ");
			luachon = Integer.parseInt(sc.nextLine());
			switch (luachon) {
				case 1:{
					System.out.println("Hãy chăm chỉ tìm người yêu rồi quay lại đây để lựa chọn nhé !!!");
					break;
				}
				case 2:{
					Calendar NgayHenHo = Calendar.getInstance();
					NgayHenHo=nhapHenHo();
					Calendar now = Calendar.getInstance();
					
					Calculator(NgayHenHo,now);
					
					break;
				}
				case 3:{
					Calendar NgayHenHo = Calendar.getInstance();
					NgayHenHo=nhapHenHo();
					Calendar NgayChiaTay = Calendar.getInstance();
					NgayChiaTay=nhapChiaTay();
					Calculator(NgayHenHo,NgayChiaTay);
					break;
				}
				
				case 0:{
					
					break;
				}
				


			}

		}while(luachon >3);


	}
	
	public static Calendar nhapHenHo() {
		System.out.println("Nhập thời gian theo format dd/MM/yyy HH:mm:ss ");
		System.out.println("Nhập ngày bắt đầu hẹn hò: ");
		int d = sc.nextInt();
		System.out.println("Nhập tháng bắt đầu hẹn hò: ");
		int m = sc.nextInt();
		System.out.println("Nhập năm bắt đầu hẹn hò: ");
		int y = sc.nextInt();
		System.out.println("Nhập giờ bắt đầu hẹn hò: ");
		int ho = sc.nextInt();
		System.out.println("Nhập phút bắt đầu hẹn hò: ");
		int mi = sc.nextInt();
		System.out.println("Nhập giây bắt đầu hẹn hò: ");
		int se = sc.nextInt();
		Calendar start = Calendar.getInstance();
		start.set(Calendar.DAY_OF_MONTH, d);
		start.set(Calendar.MONTH, m);
		start.set(Calendar.YEAR, y);
		start.set(Calendar.HOUR_OF_DAY, ho);
		start.set(Calendar.MINUTE, mi);
		start.set(Calendar.SECOND, se);
		
		return start;
	}
	public static Calendar nhapChiaTay() {
		System.out.println("Nhập thời gian theo format dd/MM/yyy HH:mm:ss ");
		System.out.println("Nhập ngày chia tay: ");
		int d = sc.nextInt();
		System.out.println("Nhập tháng chia tay: ");
		int m = sc.nextInt();
		System.out.println("Nhập năm chia tay: ");
		int y = sc.nextInt();
		System.out.println("Nhập giờ chia tay:");
		int ho = sc.nextInt();
		System.out.println("Nhập phút chia tay: ");
		int mi = sc.nextInt();
		System.out.println("Nhập giây chia tay: ");
		int se = sc.nextInt();
		Calendar start = Calendar.getInstance();
		start.set(Calendar.DAY_OF_MONTH, d);
		start.set(Calendar.MONTH, m);
		start.set(Calendar.YEAR, y);
		start.set(Calendar.HOUR_OF_DAY, ho);
		start.set(Calendar.MINUTE, mi);
		start.set(Calendar.SECOND, se);
		
		return start;
	}
	private static void Calculator(Calendar start, Calendar finish) {
		int year =0; 
		int month=0;
		int day_month=0;
		int day =0;
		int hour=0;
		int min=0;
		int sec=0;
		
			year = finish.get(Calendar.YEAR) - start.get(Calendar.YEAR) ;
			month =/* 12*year*/ + finish.get(Calendar.MONTH) + 12 - start.get(Calendar.MONTH);
			for(int i=start.get(Calendar.MONTH);i<=11;i++) {
				day_month += dayOfMonth[i];
			}
			for(int i=0;i<=finish.get(Calendar.MONTH)-1;i++) {
				day_month += dayOfMonth[i];
			}
			day=/*365*year +day_month +*/ dayOfMonth[start.get(Calendar.MONTH)-1]- start.get(Calendar.DAY_OF_MONTH)+finish.get(Calendar.DAY_OF_MONTH);
			
		
		
		hour=24- start.get(Calendar.HOUR_OF_DAY)+finish.get(Calendar.HOUR_OF_DAY);
		min= 60- start.get(Calendar.MINUTE)+finish.get(Calendar.MINUTE);
		sec=60- start.get(Calendar.SECOND)+finish.get(Calendar.SECOND);
		
        
		System.out.println("Ngày bắt đầu hẹn hò là ngày: " + dayOfWeeks[start.get(Calendar.DAY_OF_WEEK) - 1]);
		
		
		if(month<12) {
		year=year-1;
		}
		else month=month-12;
		if(day<30) {
			month=month-1;}
			else day=day-30;
		if(hour<24) {
			day=day-1;}
			else {hour=hour-24;}
		if(min<60) {
			hour=hour-1;}
			else {min=min-60;}
		if(sec<60) {
			min=min-1;}
			else {sec=sec-60;}
		System.out.println("Mối tình đã xuất hiện trong "+year+" năm - "+month+" tháng - "+day+" ngày - "+hour+" giờ - "+min+" phút - "+sec+" giây ");
		
	}
}



