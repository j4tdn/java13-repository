package ex01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String str = "Phan Hoàng Ái Nhi";
		printEachCharacterOnNewLine(str);
		System.out.println("================");
		printEachWordOnNewLine(str);
		System.out.println("================");
		reverseChar(str);
		System.out.println("================");
		reverseWord(str);
	}
	
	private static void reverseWord(String str) {
		String[] stringArr = str.split("[\\s]+");
		for(String word : stringArr) {
			System.out.print(new StringBuffer().append(word).reverse() + " ");
		}
	}
	
	private static void reverseChar(String str) {
		StringBuilder stb = new StringBuilder();
		stb.append(str);
		System.out.println(stb.reverse());
	}
	
	private static void printEachWordOnNewLine(String str) {
		String[] stringArr = str.split("[\\s]+");
		for(String word : stringArr) {
			System.out.println(word);
		}
	}
	
	private static void printEachCharacterOnNewLine(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				System.out.println(str.charAt(i));
			}
		}
	}
	
	
}
