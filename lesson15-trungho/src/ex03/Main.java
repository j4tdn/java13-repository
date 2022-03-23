package ex03;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String str1 = " Wor  d";
		String str2 = "  or Wd ";

		String str3 = "Hello";
		String str4 = "Hellloo";

		System.out.println("Is 'String 1' and 'String 2' anagram? ---> " + anagram(str1, str2));
		System.out.println("Is 'String 3' and 'String 4' anagram? ---> " + anagram(str3, str4));

		System.out.println("------------------------------------------------");
		String inputString = "aaaababbbddc";

		// A có thể thay thế đoạn này getCharacterWithMaxFrequency(splitSameStringToArray(inputString))
		// với code collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		// nhưng cách này cũng ok và quá tốt rồi
		System.out.println("Character with highest frequency in the string: "
				+ getCharacterWithMaxFrequency(splitSameStringToArray(inputString)));
	}

	private static boolean anagram(String str1, String str2) {
		String str1AfterProcess = sortInline(str1.replaceAll("\\s+", "").toLowerCase());
		String str2AfterProcess = sortInline(str2.replaceAll("\\s+", "").toLowerCase());

		
		if (str1AfterProcess.length() != str2AfterProcess.length()) {
			return false;
		}

		return (str1AfterProcess.equals(str2AfterProcess));
	}

	public static String sortInline(String input) {
		char[] temps = input.toCharArray();
		Arrays.sort(temps);
		return String.valueOf(temps);
	}

	public static String[] splitSameStringToArray(String input) {
		String s1 = sortInline(input);
		// good solution
		String[] out = s1.split("(?<=(.))(?!\\1)");
		Arrays.sort(out);
		return out;
	}

	public static char getCharacterWithMaxFrequency(String[] stringArray) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if (max < stringArray[i].length()) {
				max = stringArray[i].length();
				index = i;
			}
		}
		return stringArray[index].charAt(0);
	}
}
