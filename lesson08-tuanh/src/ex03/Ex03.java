package ex03;
/**
 * Bài 3: Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi
không dấu.
 */
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String str = "Em có yêu anh không anh để anh biết còn chờ"
				+ "Em xin lỗi em đã có thái độ không đúng với anh";
		// tiêu chuẩn hóa S theo định dạng NFD
		String tmp = Normalizer.normalize(str, Form.NFD); 
		// regex Unicode Blocks: các dấu phụ
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+"); 
		Matcher matcher = pattern.matcher(tmp);

		// trả về chuỗi mà các dấu phụ đã được thay thế bằng rỗng. 
		String result = matcher.replaceAll(""); 

		System.out.println(result);
	}
}
