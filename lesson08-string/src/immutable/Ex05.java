package immutable;

public class Ex05 {
public static void main(String[] args) {
	//1.Kiểm tra kí tự , chuỗi bắt đầu, kết thúc của s có phải là s1 ko
	String s="STK123"; //SGK246
	String s1="STK";
	String s2 ="SGK";
	String s3 ="    Welcome to     our class    ";
	 
	 s.startsWith(s1);
	s.endsWith(s1);
	// 2.đổi vị trí s1 thành s2 trong s
	String s5 = s.replace(s1, s2);
	//3.xóa dấu cách dư
	String s6=s3.trim().replaceAll("[\\s]+", " ");
	//s3.trim().replaceAll("[\\s]{1,}", " ");
	String s7=s3.stripLeading();//xóa ở đầu
	String s8=s3.stripTrailing();//xóa ở cuối
	
	//4.cắt chuỗi từ vị trí thứ 2
	String s9=s.substring(2);
	//5.chuỗi s có chứa chuỗi s1, s2 ko
	s.contains(s1);
	s.contains(s2);
	//6.cắt chuỗi dựa vào kí tự
	s.split(" ");//cắt thnahf các từ và gán vào mảng string
	s.split(" ", 5);//cắt là thấy 5 từ đầu tiên vào 1 mảng
}
}
