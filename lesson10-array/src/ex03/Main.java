package ex03;

public class Main {
	public static void main(String[] args) {
		String text = "Welcome     to JAVA10    class";
		
		show(text);
	}
	
	private static void show(String text) {
		String [] words = text.split("\\s+");
		String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            System.out.println(word.length());
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
                System.out.println(reverseWord);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(reversedString);
        
	}
}
