package immutable;

public class Ex06 {
	// Thao tác với split theo space+, compa&space, text&number
	public static void main(String[] args) {
		//Single thread >> thread-main
		System.out.println("Thread: " + Thread.currentThread().getName());
		
		String greeting = "cheers out of my home";
		String line = "Trần Công Việt, 20, 19TCLCDT6, 07/10/2001";
		String hobbies = "Game   -  - Tennis - Badminton--------------Basketball";
		String text = "a567bhc876sdfdsf345345"; // => Cắt theo [a-z] phía trước a là một empty string
		String[] words = greeting.split("\\s+");
		String[] properties = line.split(",\\s+");
		String[] games = hobbies.split("[\\s-]+");
		String[] numbers = text.split("[a-z]+");
		showText(words);
		System.out.println("============================");
		showText(properties);
		System.out.println("============================");
		showText(games);
		System.out.println("============================");
		showText(numbers);
		System.out.println("numbers.length: " + numbers.length);

	}

	private static void showText(String[] words) {
		for (String word : words) {
			if (!word.isEmpty()) {
				System.out.println(word);
			}
		}
	}
}
