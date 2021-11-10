package immutable;

public class Ex06 {
	// Thao tác với Split theo space+, compa&space, text&number
	public static void main(String[] args) {
		
		// simple thread >> thread-main 
		System.out.println("Thread: " + Thread.currentThread().getName());
		
		String greeting = "cheers    out of my home";
		String line = "John Smith, 18, 1712, 15/08/2002";
		String hobbies = "Game   -   - Tennis - Badminton";
		String text = "a567bhc8764okt012xyz";

		String[] words = greeting.split("\\s+"); // 1 hay nhiều => dùng "ký tự+"
		String[] properties = line.split(",\\s");
		String[] games = hobbies.split("[\\s-]+"); // 1 hay nhiều khoảng trắng (\\s) hoặc dấu -

		// [\\s-]+ >> \s\s-\s-\s
		// >> \s\s\s\s
		// >> --------

		String[] digits = text.split("[a-z]+"); // [0-9]

		showText(words);
		System.out.println("===============");
		showText(properties);
		System.out.println("===============");
		showText(games);
		System.out.println("===============");
		showText(digits);
		System.out.println("digits length: " + digits.length);

	}

	private static void showText(String[] elements) {
		for (String element : elements) {
			System.out.println(element);
		}

	}

}
