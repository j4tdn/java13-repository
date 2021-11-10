package immutable;

public class Ex06 {
	// Thao tác với split theo space+, compa&space, text&number
	public static void main(String[] args) {
		
		// single thread >> thread-main
		System.out.println("Thread: " + Thread.currentThread().getName());
		
		String greeting = "cheers out of my home";
		String line = "Jonh Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game - - Tennis  Badminton------Basketball";
		String text = "a567agnbzxcj134nmc1231xyz";
		
		String[] words = greeting.split("\\s");
		String[] properties = line.split(",\\s");
		
		// [\\s-]+ \s\s\-\s-\s
		// 			>> \s\s\s\s
		// 			>> -----
		String[] games = hobbies.split("[\\s-]+"); //  \\s-\\s;
		String[] digits = text.split("[a-z]+");
		
		// DATABASE - Store data >> query
		// Item: 		10m items		>> 5s
		// ItemGroup: 	04m item groups	>> 2s
		
		showText(words);
		System.out.println("=========");
		showText(properties);
		System.out.println("=========");
		showText(games);
		System.out.println("=========");
		showText(digits);
	}
	
	private static void showText(String[] elements) {
		for(String element: elements) {
			if(!element.isEmpty()) {
				System.out.println(element);
			}
		}
	}
}
