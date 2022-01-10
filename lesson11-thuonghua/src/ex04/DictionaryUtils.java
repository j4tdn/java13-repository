package ex04;

import java.util.List;
import java.util.Scanner;

public class DictionaryUtils {
	private static Scanner ip = new Scanner(System.in);

	private DictionaryUtils() {

	}

	public static void addWord(List<Dictionary> dictionaries) {
		System.out.println("Input word: ");
		String word = ip.nextLine();
		System.out.println("Input means: ");
		String means = ip.nextLine();
		System.out.println("Input wordType: ");
		String wordType = ip.nextLine();
		System.out.println("Input note: ");
		String note = ip.nextLine();

		dictionaries.add(new Dictionary(word, means, wordType, note));
		System.out.println("Add word done!!!");
	}

	public static void getWord(List<Dictionary> dictionaries) {
		System.out.println("Input word: ");
		String word = ip.nextLine();
		Dictionary haveWord = new Dictionary();
		for (Dictionary words : dictionaries) {
			if (word.equals(words.getWord())) {
				haveWord = words;
				break;
			}
		}
		if (haveWord.getWord() != null) {
			System.out.println(haveWord);
		} else {
			System.out.println("Don't have word");
		}
	}

}
