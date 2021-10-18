package homework;
import java.util.Scanner;
import java.util.Random;
public class exercise4 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Input array size:");
		int n = validInt(1,20);
		int[] arr= new int[n];
		for (int i =0 ;i < n ; i++) {
			System.out.print("Array["+i+"] = ");
			arr[i] = validInt(0,999);
		}
		for (int i =0 ; i < n ; i++) {
			System.out.println(arr[i]+" = "+readNumber(arr[i]));
		}
	}
	public static int validInt(int min,int max) {
		while(true) {
			try {
				int n = Integer.parseInt(sc.nextLine());
				if (n < min || n > max) 
					throw new NumberFormatException();
				return n;
			}catch(NumberFormatException e) {
				System.err.println("Please input number in range["+min+","+max+"]");
				System.out.print("Enter an integer:");
			}
		}
	}
	public static String readOneDigit(int x) {
		if (x == 1) return "một";
		if (x == 2) return "hai";
		if (x == 3) return "ba";
		if (x == 4) return "bốn";
		if (x == 5) return "năm";
		if (x == 6) return "sáu";
		if (x == 7) return "bảy";
		if (x == 8) return "tám";
		if (x == 9) return "chín";
		return "";
		
	}
	public static String readNumber(int x) {
		String result="";
		if (x == 0) return "Không";
		int a = x / 100;//chu so hang tram
		if(a != 0) 
			result += readOneDigit(a) + " trăm ";
		x -= a * 100;//loai bo chu so hang tram
		int b = x / 10; // chu so hang chuc
		if (b != 0) {
			if (b == 1) 
				result += "mười ";
			else
				result += readOneDigit(b) + " mươi ";
		}
		x -= b * 10; // loai bo chu so hang chuc
		if (x != 0) {
			if (a != 0 && b == 0) 
				result += "linh ";
			if ( b != 0 && (x == 1 || x == 5)) {
				if  (x == 1) {
					if (b != 1)
						result += "mốt";
					else
						result += "một";
				}	
				if (x == 5)
					result += "lăm";
			}
			else
				result += readOneDigit(x);
		}
		return result;
		
	}
}
