/**
 * Bài 3: Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi
không dấu.
	Input: Em có yêu anh không anh để anh biết còn chờ
	Em xin lỗi em đã có thái độ không đúng với anh
	Output: Em co yeu anh khong de anh biet con cho
	Em xin loi em da co thai do khong dung voi anh
 */
package ex03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Nhập vào chuỗi TIẾNG VIỆT có dấu bất kì: ");
		Scanner sc = new Scanner(System.in);
		String input = "";
//		String input = "Em có yêu anh không anh để anh biết còn chờ\n"
//		+ "	Em xin lỗi em đã có thái độ không đúng với anh";
		do {
			try {
				System.out.print("Input: ");
				input = sc.nextLine();
				if (isValid(input)) {
					break;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		} while (true);

		String output = convert(input);
		System.out.println("=============================================");
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
		sc.close();
	}

	private static boolean isValid(String input) throws Exception {
		for(int i = 0; i<input.length(); i++) {
			if(!Character.isLetter(input.charAt(i)) && input.charAt(i) != ' ') {
				throw new Exception("*Chuỗi tiếng việt chỉ gồm chữ cái và khoảng cách*");
			}
		}
		return true;
	}

	private static String convert(String input) {
		input = input.replaceAll("[áàãảạăắằẵẳặâấầẫẩậ]", "a");
		input = input.replaceAll("[óòõỏọơớờỡởợôốồỗổộ]", "o");
		input = input.replaceAll("[éèẽẻẹêếềễểệ]", "e");
		input = input.replaceAll("[úùũủụưứừữửự]", "u");
		input = input.replaceAll("[íìĩỉị]", "i");
		input = input.replaceAll("[đ]", "d");
		input = input.replaceAll("ý|ỳ|ỹ|ỷ|ỵ", "y");

		input = input.replaceAll("[ÁÀÃẢẠĂẮẰẴẲẶÂẤẦẪẨẬ]", "A");
		input = input.replaceAll("[ÓÒÕỎỌƠỚỜỠỞỢÔỐỒỖỔỘ]", "O");
		input = input.replaceAll("[ÉÈẼẺẸÊẾỀỄỂỆ]", "E");
		input = input.replaceAll("[ÚÙŨỦỤƯỨỪỮỬỰ]", "U");
		input = input.replaceAll("[ÍÌĨỈỊ]", "I");
		input = input.replaceAll("[Đ]", "D");
		input = input.replaceAll("Ý|Ỳ|Ỹ|Ỷ|Ỵ", "Y");

		return input;
	}

}
