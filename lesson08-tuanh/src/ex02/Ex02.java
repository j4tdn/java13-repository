package ex02;

/**
 * Bài 2: Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu
sau:
* Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
* Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
* Các kí tự cách nhau một khoảng trắng
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Enter String: ");
		String str = "Nguyễn thị       TÚ ANh      ";
		while(true) {
			try {
				for(int i = 0; i < str.length(); i++) {
					if((str.charAt(i) < 'A') && str.charAt(i) > 'Z'
					|| (str.charAt(i) < 'a' && str.charAt(i) > 'z')) {
						throw new RuntimeException();
					}
				}
				break;
			} catch (RuntimeException e) {
				e.getStackTrace();
				System.out.println("Enter again, please: ");
			}
		}
		
		str = str.replaceAll("[\\s]+", " ").trim();
		System.out.println(str);
		
		String[] words = str.split("\\s");
		for(int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1, words[i].length()).toLowerCase();
		}
		String result = new String().join(" ", words);
		System.out.println(result);
	}
}
