package ex04;

/**
 * Bài 4: Viết chương trình từ điển tiếng anh. Trong đó, 1 word bao gồm từ, nghĩa, loại từ, và ghi chú.
	Chương trình từ điển bao gồm các phuơng thức sau đây:
	- Thêm mới từ vựng
	- Tra từ điển
 * @author tranc
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import utils.Utils;

public class App {
	public static void main(String[] args) {
		Map<String, Vocab> vocabs = mockVocab();
		// Utils.printMap(vocabs);

		// Thêm mới từ vựng
		vocabs.put("It", new Vocab("It", "Nó", WordType.NOUN, "X"));
		vocabs.put("Go", new Vocab("Go", "Đi", WordType.VERB, "X"));
		System.out.println("****DICTIONARY****");
		Utils.printMap(vocabs);

		// Tra từ điển
		System.out.println("\n\n\n=================================\n\n\n");
		String word = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter 'Q' to exit!\nSearch English: ");
			word = sc.nextLine();
			searchEnglish(word, vocabs);
		} while (!word.equals("Q"));
		sc.close();
	}

	private static void searchEnglish(String word, Map<String, Vocab> vocabs) {
		System.out.println(vocabs.get(word));
	}
	
	private static Map<String, Vocab> mockVocab() {
		Map<String, Vocab> vocabs = new HashMap<>();
		vocabs.put("I", new Vocab("I", "Tôi", WordType.NOUN, "X"));
		vocabs.put("You", new Vocab("You", "Bạn", WordType.NOUN, "X"));
		vocabs.put("She", new Vocab("She", "Cô ấy", WordType.NOUN, "X"));
		vocabs.put("He", new Vocab("He", "Cô ấy", WordType.NOUN, "X"));
		vocabs.put("Hello", new Vocab("Hello", "Xin chào", WordType.VERB, "X"));
		vocabs.put("Hi", new Vocab("Hi", "Xin chào", WordType.VERB, "X"));
		vocabs.put("Sorry", new Vocab("Sorry", "Xin lỗi", WordType.VERB, "X"));
		vocabs.put("How", new Vocab("How", "Như thế nào", WordType.ADJECTIVE, "X"));
		vocabs.put("What", new Vocab("What", "Cái gì", WordType.ADJECTIVE, "X"));
		vocabs.put("Which", new Vocab("Which", "Cái nào", WordType.ADJECTIVE, "X"));
		vocabs.put("Who", new Vocab("Who", "Ai đó", WordType.ADJECTIVE, "X"));
		return vocabs;
	}
}
