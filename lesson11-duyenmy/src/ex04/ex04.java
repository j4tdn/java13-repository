package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		List<Word> words = new ArrayList<>();
		words.add(new Word("sing", "hat", "V", " ho het"));
		words.add(new Word("dog", "con cho", "N", "hotdog là xuc xich"));
		System.out.println("Truoc khi add");
		printf(words);
		System.out.println("=================");
		Word wordnew = new Word("Cry", "Khoc", "V", " Nghia khac:keu, het len");
		addWords(words, wordnew);
		System.out.println("Sau khi add");
		printf(words);
		System.out.println("=================");
		System.out.println("Tim tu Cry");
		search(words, "Cry");
		System.out.println("=================");
		System.out.println("Tim tu smile");
		search(words, "Smile");
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap tu can them:");
		String w = sc.nextLine();
		System.out.println("Nhap nghia");
		String m = sc.nextLine();
		System.out.print("Nhap loai tu:");
		String t = sc.nextLine();
		System.out.println("Nhap mo ta");
		String no = sc.nextLine();
		Word wordnew2 = new Word(w, m, t,no);
		System.out.println("Sau khi add");
		printf(words);
		System.out.print("Nhap tu can tim:");
		String s = sc.nextLine();
		search(words,s);
		
	}

	private static void search(List<Word> words, String wordS) {
		int j = 0;
		for (Word word : words) {
			if (wordS.equals(word.getWord())) {
				j++;
				System.out.println(word);
			}
		}
		if (j == 0) {
			System.out.println("Khong tim thay tu " + wordS);
		}
	}

	private static List<Word> addWords(List<Word> words, Word wordnew) {
		words.add(wordnew);
		return words;
	}

	private static void printf(List<Word> words) {
		for (Word word : words) {
			System.out.println(word);
		}
	}
}
