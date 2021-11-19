package ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 * Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi không dấu.
 * Input: 
 * Em có yêu anh không anh để anh biết còn chờ
 * Em xin lỗi em đã có thái độ không đúng với anh
 * Output: 
 * Em co yeu anh khong de anh biet con cho
 * Em xin loi em da co thai do khong dung voi anh
 */

public class Main {
	public static void main(String[] args) {
		String str = "Em có yêu anh không anh để anh biết còn chờ\n" + "Em xin lỗi em đã có thái độ không đúng với anh";
		System.out.println(removeAccent(str));
	}

	private static String removeAccent(String str) {
		String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		String result = pattern.matcher(temp).replaceAll("");
		return result;
	}

}
