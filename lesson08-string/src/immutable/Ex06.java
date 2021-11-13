package immutable;

public class Ex06 {
	// Thao tác với split theo space+, compa&space, text&number
	public static void main(String[] args) {
		
		// Single thread >> thread main
		System.out.println("Thread: " + Thread.currentThread().getName());
		String greeting = "Cheers out of my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game - Football - - - - Swimming ----------- Billiard";
		String text = "a56bhc8764okt012xyz";
		
		String[] words = greeting.split("[\\s]+");
		String[] properties = line.split(",\\s");
		
		// [\\s-]+ >> \s\s-\s\s
		//         >> \s\s\s\s
		//		   >> --------
		String[] games = hobbies.split("[\\s-]+");
		String[] digits = text.split("[a-z]+");
		
		// DATABASE - Store Data >> query
		// Item: 10 milion items
		// ItemGroup: 4 milion items groups
		
		showText(words);
		System.out.println("=================");
		showText(properties);
		System.out.println("=================");
		showText(games);
		System.out.println("=================");
		showText(digits);
		System.out.println("digits length: " + digits.length);
		
	}
	
	private static void showText(String[] words) {
		for(String word: words) {
			if(!word.isEmpty()) {
				System.out.println(word);
			}
			
		}
	}
}
