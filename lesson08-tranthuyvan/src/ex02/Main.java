package ex02;

/**
 * Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu sau:
 * Họ tên nhập vào chỉ bao gồm các kí tự [A-Z a-z]
 * Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
 * Các kí tự cách nhau một khoảng trắng
 * Example : aDam Le vAN john Son => Adam Le Van John Son
 * Anne frAnk => Lê Phan
 */

public class Main {
	public static void main(String[] args) {
		String name = "  tran tHi thUY vAN   ";
		outputName(name);
	}

	public static void outputName(String name) {
		name = name.trim().toLowerCase();
		name = name.replaceAll("\\s+", " ");
		String[] Str = name.split(" ");
		name = "";
		for (int i = 0; i < Str.length; i++) {
			name += String.valueOf(Str[i].charAt(0)).toUpperCase() + Str[i].substring(1);
			if (i < Str.length - 1)
				name += " ";
		}
		System.out.println(name);
	}

}
