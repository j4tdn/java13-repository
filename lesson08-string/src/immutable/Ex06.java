package immutable;

public class Ex06 {
	public static void main(String[] args) {
		
		// single thread >> thread - main
		System.out.println("Thread: " + Thread.currentThread());
		
		String greeting = "cheers out of my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game   -   Tenis - Badminton";
		String text = "a567bhc87okt012xyz";
		
		String[] words = greeting.split("\\s+");
		String[] properties = line.split(",\\s");
		
		// [\\s-]+ >> \s\s-\s-\s
		//         >> \s\s\s\s
		//         >> -------
		String[] games = hobbies.split("[\\s-]+");// \\s-\\s
		String[] digits = text.split("[a-z]+");
		
		// DATABASE - Store Data >> query
		// Item     :10m items       >> 5s
		// ItemGroup: 04 item groups >> 2s
		
		//for (String word:words) {
			//System.out.println(word);
		//}
		showText(words);
		System.out.println("====");
		showText(properties);
		System.out.println("====");
		showText(games);
		System.out.println("====");
		showText(digits);
	}
	private static void showText(String[] elements) {
		for (String element: elements) {
			System.out.println(element);
		}
	}

}
