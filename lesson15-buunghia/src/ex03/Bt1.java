package ex03;
import java.util.Arrays;


public class Bt1 {
	//1. Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không
	public static boolean isAnargram(String s1,String s2) {
		s1= s1.replaceAll(" ","").toLowerCase();
		s2= s2.replaceAll(" ","").toLowerCase();
		if (s1.length() != s2.length()) 
			return false;
		char[] arr1= s1.toCharArray();
		char[] arr2= s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
}
