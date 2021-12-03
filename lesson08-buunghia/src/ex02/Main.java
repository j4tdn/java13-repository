package ex02;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String name=sc.nextLine().trim();
		if (!isValidName(name)) {
			System.out.println("Name must contain only alphabetic characters");
		}
		else {
			System.out.println("Correct name format:"+standardName(name));	
		}
	}
	public static boolean isValidName(String name){
		if(Pattern.matches("[a-zA-Z\\s]+", name)) 
			return true;
		return false;
	}
	public static String standardName(String name) {
		String result="";
		String words[] = name.split("[\\s]+");
		for (int i = 0; i < words.length ; i++) {
			char[] word = words[i].toCharArray();
			word[0]=Character.toUpperCase(word[0]);
			for (int j = 1;j < word.length ; j++) {
				word[j]=Character.toLowerCase(word[j]);
			}
			result+=" "+String.valueOf(word);
		}
		return result.trim();
	}
}
