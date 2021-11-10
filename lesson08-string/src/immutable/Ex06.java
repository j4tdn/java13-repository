package immutable;

public class Ex06 {
	
	//Thao tac voi split theo space+, compa&space, text&num
	
	public static void main(String[] args) {
		String greeting = "cheers out of my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game - - Tennis      - Badminton ------- Baseball";
		String text = "sadas21314sand012a23";
		
		String[] words = greeting.split("\\s+");
		String[] properties = line.split(",\\s");
		
		// [\\s-]+ >> \s\s-\s-\s
		//		   >> \s\s\s\s
		//		   >> ---------
		String[] games = hobbies.split("[\\s-]+"); //\\s-\\s
		String[] digits = text.split("[a-z]+");
		
		// DATABASE - Store Data >> query
		// Item:	  10m items		  	>> 5s
		// ItemGroup: 04m item groups 	>> 2s
		
		showText(words);
		System.out.println("================");
		showText(properties);
		System.out.println("================");
		showText(games);
		System.out.println("================");
		showText(digits);
	}
	
	private static void showText(String[] elements) {
		for(String element: elements) {
			if (!element.isEmpty())
				System.out.println(element);
		}
	}
}
