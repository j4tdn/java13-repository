package ex02;

public class Ex02 {
	public static void main(String[] args) {
		String string = "do vAn Minh";
		print(string);
	}
	private static void print(String s) {
		String s1 = "";
		String[] word = s.split("\\s");
		for(String w : word) {
			String w1 = w.substring(0,1).toUpperCase();
			String w2 = w.substring(1).toLowerCase();
			s1 += " " + w1 + w2;   
		}
		System.out.println(s1);
	}
}
