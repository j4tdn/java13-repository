package baitap;

import java.util.Scanner;

/**
 * 
 * Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi không dấu.
 * Input: Em có yêu anh không anh để anh biết còn chờ
 * Em xin lỗi em đã có thái độ không đúng với anh
 * Output: Em co yeu anh khong de anh biet con cho
 * Em xin loi em da co thai do khong dung voi anh
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.println("Nhập chuỗi: ");
		s = input.nextLine();
		System.out.println("Kết quả: " + VNCharacterUtils.removeAccent(s).toString());
	}
}
