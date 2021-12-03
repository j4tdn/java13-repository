package ex05;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string:");
		String str1=sc.nextLine();
		System.out.print("Enter second string:");
		String str2=sc.nextLine();
		System.out.println("Longest common substring is :"+longestCommonSubString(str1, str2));
	}
	public static String longestCommonSubString(String a, String b) {
		String result="";
		for (int i = 0 ;i < a.length(); i++) {
			for (int j = i; j < a.length(); j++){
				String sub=a.substring(i,j);
				if (b.contains(sub)) {
					if (result.length() < sub.length())
						result = sub;
				}
				else break;
			}
		}
		return result;
	}
}
