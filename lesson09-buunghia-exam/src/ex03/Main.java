package ex03;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str= sc.nextLine();
		System.out.println(revert(str));
		sc.close();
	}
	public static String revert (String str) {
		str=str.replaceAll("( +)"," ").trim();
		char[] chArray=str.toCharArray();
		String reverseStr="";
		for (int i = str.length()-1; i>=0; i--)
			reverseStr+=chArray[i];
		return reverseStr;
	}
}
