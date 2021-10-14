package ex04;

import java.util.Scanner;

/**
 * Viết phương thức readNumer (đọc số sang chữ đối với các số có tối đa 3 chữ
 * số), phương thức nhận vào 1 tham số thuộc kiểu int (có tối đa 3 chữ số), trả
 * về chuỗi (String) cho biết cách đọc số n ra dạng chữ
 * 
 * @author tranc
 *
 */

public class Main {
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
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers do you want to read? ");
		int number = sc.nextInt();
		int arr[] = new int[number];
		for (int i = 0; i < number; i++) {
			while (true) {
				try {
					arr[i] = enterNumber(i);
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("READING...");
		for (int i = 0; i < number; i++) {
			System.out.println(arr[i] + " = " + readNumber(arr[i]));
		}

	}

	private static String readNumber(int number) {
		if (number < 10) {
			return readNumber1Digit(number);
		} else if (number >= 10 && number < 100) {
			return readNumber2Digits(number);
		} else
			return readNumber3Digits(number);
	}

	private static String readNumber3Digits(int number) {
		int remainder = number % 100;
		String form = readNumber1Digit(number / 100) + TRAM;
		if (number == 100) {
			return form;
		} else if (remainder >= 1 && remainder <= 9) {
			return form + LE + readNumber1Digit(remainder);
		} else {
			return form + readNumber2Digits(remainder);
		}
	}

	private static String readNumber2Digits(int number) {
		String form = readNumber1Digit(number / 10) + MUOI;
		if (number == 10) {
			return MUOIF;
		}

		if (number > 10 && number < 20) {
			if (number == 15) {
				return MUOIF + LAM;
			}
			return MUOIF + readNumber1Digit(number % 10);
		}
		if (number >= 20 && number < 100) {
			int remainder = number % 10;
			if (remainder == 0) {
				return form;
			} else if (number % 5 == 0) {
				return form + LAM;
			} else if (remainder == 1) {
				return form + MOTS;
			} else {
				return form + readNumber1Digit(number % 10);
			}
		}
		return null;
	}

	private static String readNumber1Digit(int number) {
		switch (number) {
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

	private static int enterNumber(int index) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("arr[" + index + "] = ");
		int number = 0;
		try {
			number = Integer.parseInt(sc.nextLine());
		} catch (Exception ex) {
			throw new Exception("<EXCEPTION> Please input the correct format!");
		}
		if (number > 999) {
			throw new Exception("<EXCEPTION> Please input a number with up to 3 digits!!!");
		}
		return number;
	}
}
