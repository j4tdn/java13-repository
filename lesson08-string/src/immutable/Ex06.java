package immutable;

public class Ex06 {
	//thao tac voi split theo space ,compa&space, text&num
	public static void main(String[] args) {
		String greeting = "cheers out of my home";
		String line="John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game - -  Tennis - Badminton";
		String text="sch43h3hj5h5";
		
		String[] words=greeting.split("\\s");
		String[] properties = line.split(",\\s");
		String[] games=hobbies.split("[\\s-]+");//\\s-\\s
		String[] digits = text.split("[a-z]+");
		
		showText(words);
		System.out.println("========");
		showText(properties);
		System.out.println("========");
		showText(games);
		System.out.println("========");
		showText(digits);
		System.out.println("digits length: "+digits.length); 
		
		
		
	}
	private static void showText(String[] elements) {
		for (String element: elements) {
			System.out.println(element);
		}
	}
}
