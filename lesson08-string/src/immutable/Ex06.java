package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String str1 = "hoc java co ban den nang cao.";
        String line = "John Smith, 18, 17T1, 15/08/2002";
		String str2 = "java co ban";
		String hobbies = "Game - -------Tennis - Badminton      ";
		String text = "sdf523sdf3s25d3fs5df3s5df3s5df";
        System.out.println(str1.contains(str2));
        
        String words[] = str1.split("\\s");
        String properties[] = line.split(",\\s");
        String[] games = hobbies.split("[\\s-]+");
        String[] digits = text.split("[a-z]+");
        showText(words);
        showText(properties);
        showText(games);
        showText(digits);
	}
	
	private static void showText(String[] elements) {
		for(String word : elements) {
			if(!word.isEmpty()) {
				System.out.println(word);
			}
        }
	}
}
