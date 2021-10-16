package ex4;

import java.util.Scanner;

/**
 * 
	Viết phương thức readNumer (đọc số sang chữ đối với các số có tối đa 3 chữ số),
	phương thức nhận vào 1 tham số thuộc kiểu int (có tối đa 3 chữ số), trả về chuỗi (String) cho
	biết cách đọc số n ra dạng chữ:
 *
 */
public class App {
	public static final String KHONG = " Không";
	public static final String MOT = " Một";
	public static final String HAI = " Hai";
	public static final String BA = " Ba";
	public static final String BON = " Bốn";
	public static final String NAM = " Năm";
	public static final String SAU = " Sáu";
	public static final String BAY = " Bảy";
	public static final String TAM = " Tám";
	public static final String CHIN = " Chín";
	public static final String LAM = " Lăm";
	public static final String LE = " Lẻ";
	public static final String MUOI = " Mươi";
	public static final String MUOIF = " Mười";
	public static final String MOTS = " Mốt";
	public static final String TRAM = " Trăm";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers of digits: ");
		int numbers = 0;
		try {
			numbers = Integer.parseInt(input.nextLine());
		} catch(Exception e) {
			System.out.println("Please enter number!!");
		}
		input.close();
		int arr[] = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			while(true) {
				try {
					arr[i] = enterNumber(i);
					break;
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("READING >>>>>>");
		for (int i = 0; i < numbers; i++) {
			System.out.println("arr["+ i + "] = " + readNumber(arr[i]));
		}
	}
	
	public static String readNumber(int number) {
		if (number < 10) {
			return readNumberHas1Digit(number);
		} else if (number >= 10 && number < 100) {
			return readNumberHas2Digit(number);
		} else
			return readNumberHas3Digit(number);
	}
	
	public static String readNumberHas3Digit(int number) {
		String format = readNumberHas1Digit(number / 100) + TRAM;
		int remainder = number % 100;
		if (number == 100) return format;
		if (remainder >= 10) return format + readNumberHas2Digit(remainder);
		return format + readNumberHas1Digit(remainder);
	}
	
	public static String readNumberHas2Digit(int number) {
		if (number == 10) return MUOIF;
		if (number > 10 && number < 20) {
			if (number == 15) return MUOIF + LAM;
			return MUOIF + readNumberHas1Digit(number % 10);
		}
		String format = readNumberHas1Digit(number / 10) + MUOI;
		if (number > 20 && number < 99) {
			int unit = number % 10;
			if (unit == 0) return format;
			if (unit == 1) return format + MOTS;
			if (unit == 5) return format + LAM;
			return format + readNumberHas1Digit(unit);
		}
		return null;
	}
	
	public static String readNumberHas1Digit(int number) {
		switch(number) {
		case 0:
			return KHONG;
		case 1:
			return MOT;
		case 2:
			return HAI;
		case 3:
			return BA;
		case 4:
			return BON;
		case 5:
			return NAM;
		case 6:
			return SAU;
		case 7:
			return BAY;
		case 8:
			return TAM;
		case 9:
			return CHIN;
		default:
			return "";
		}
	}
	
	public static int enterNumber(int index) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("arr[" + index + "] = ");
		input.close();
		int number = 0;
		try {
			number = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Please enter number");
		}
		if (number > 999) {
			throw new Exception("Please enter number has 3 digits");
		}
		return number;
	}
}
