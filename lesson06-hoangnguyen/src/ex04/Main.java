package ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String isContinue = "y";
		int number;
		do {
			System.out.println("Input number: ");
			number = Integer.parseInt(sc.nextLine());
			System.out.println(readNumber(number));
			
			System.out.println("Do you want continue? [Y/N]");
			isContinue = sc.nextLine();
		} while ((number < 0 || number > 999) || "y".equalsIgnoreCase(isContinue));
	}

	private static String readNumber(int number) {
		String result = "";
		String[] unitsArr = { "Mươi", "Một", "Hai", "Ba", "Bốn", "Lăm", "Sáu", "Bảy", "Tám", "Chín" };
		String[] dozensArr = { "Lẻ", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi",
				"Tám Mươi", "Chín Mươi" };
		String[] hundredsArr = { "", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm",
				"Tám trăm", "Chín trăm" };

		int units = number % 10;
		int dozens = (number / 10) % 10;
		int hundreds = number / 100;

		if (dozens == 0 && units == 0) {
			dozensArr[0] = "";
			unitsArr[0] = "";
		}

		if (dozens == 0 && hundreds == 0) {
			dozensArr[0] = "";
			unitsArr[5] = "Năm";
		}

		if (dozens > 1) {
			unitsArr[1] = "Mốt";
		}

		if (dozens == 1 && units == 0) {
			unitsArr[0] = "";
		}

		return result = hundredsArr[hundreds] + " " + dozensArr[dozens] + " " + unitsArr[units];
	}
}
