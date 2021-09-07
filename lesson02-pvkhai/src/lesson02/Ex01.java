package lesson02;

public class Ex01 {
	public static void main(String[] args) {
		int n = 4;
		
		if(isCheck(n)) System.out.println(+ n + " la so luy thua cua 2");
		else System.out.println(+ n + " khong phai la so luy thua cua 2");
	}
	//kiểm tra số lũy thừa của 2
	private static boolean isCheck(int input) {
		if( input == 0 || input == 1 ) return true;
		int x = input / 2;
		int y = input % 2;
		if( y ==1 ) return false;
		else return isCheck(x);
	} 
}
 