package ex02;
/*
 * Bài 2: Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu
sau:

Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
Các kí tự cách nhau một khoảng trắng
Example : aDam Le vAN john Son => Adam Le Van John Son
Anne frAnk => Lê Phan
 */
public class Ex02 {
	public static void main(String[] args) {
		String text = "aDam Le vAN john Son";

		String[] texts = text.split("\\s");
		revert(texts);

	}
	
	private static void revert(String[] elements) {
		
		for (String element : elements) {
			String text ="";
			text += element.toUpperCase().charAt(0);
			for (int i =1; i <element.length(); i++) {
				text += element.toLowerCase().charAt(i);
			}
			System.out.print(text+" ");
		}
		
	}
}
