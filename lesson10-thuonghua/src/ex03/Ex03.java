package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import utils.Utils;

public class Ex03 {
	public static String PATTERN_DIGIT = "-?[1-9][0-9]*";
	public static String PATTERN_STRING = "[a-zA-Z]+";

	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "8", "4", null, "Special", "a", "c", "b", "xx" };
		System.out.println(Arrays.toString(sortStringsAsc(strings)));
		System.out.println(Arrays.toString(sortStringsDesc(strings)));
	}

	private static String[] removeSpecialElement(String[] strings) {
		String[] array = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == "Special") {
				array[0] = strings[i];
				strings = Utils.removeElement(strings, i);
			}
		}

		return strings;
	}

	private static String[] sortDigit(String[] strings) {
		int digit = 0;
		strings = removeSpecialElement(strings);
		String[] stringDigit = new String[strings.length];
		for (String string : strings) {
			if (string == null) {
				continue;
			}
			if (string.matches(PATTERN_DIGIT)) {
				stringDigit[digit++] = string;
			}
		}
		stringDigit = Arrays.copyOfRange(stringDigit, 0, digit);

		int[] convertInt = new int[stringDigit.length];

		for (int i = 0; i < stringDigit.length; i++) {
			convertInt[i] = Integer.parseInt(stringDigit[i]);
		}

		convertInt = Utils.sort(convertInt, (a, b) -> a > b);

		for (int i = 0; i < convertInt.length; i++) {
			stringDigit[i] = String.valueOf(convertInt[i]);
		}

		return stringDigit;
	}

	private static String[] sortString(String[] strings) {
		int characters = 0;
		strings = removeSpecialElement(strings);

		String[] stringCharacters = new String[strings.length];

		for (String string : strings) {
			if (string == null) {
				continue;
			}
			if (string.matches(PATTERN_STRING)) {
				stringCharacters[characters++] = string;
			}
		}

		stringCharacters = Arrays.copyOfRange(stringCharacters, 0, characters);

		for (int i = 0; i < stringCharacters.length; i++) {
			for (int j = i + 1; j < stringCharacters.length; j++) {
				if (stringCharacters[i].compareTo(stringCharacters[j]) > 0) {
					String temp = stringCharacters[i];
					stringCharacters[i] = stringCharacters[j];
					stringCharacters[j] = temp;
				}
			}
		}

		return stringCharacters;
	}

	private static String[] sortStringsAsc(String[] strings) {

		String[] stringDigit = sortDigit(strings);
		String[] stringCharacters = sortString(strings);

		String[] array = new String[strings.length];
		array[0] = "Special";
		int count = 1;
		for (String digitConcatenation : stringDigit) {
			array[count++] = digitConcatenation;
		}

		for (String stringConcatenation : stringCharacters) {
			array[count++] = stringConcatenation;
		}

		return Arrays.copyOfRange(array, 0, array.length);
	}

	private static String[] sortStringsDesc(String[] strings) {
		String[] sortDesc = new String[strings.length];
		int count = 0;
		strings = sortStringsAsc(strings);

		for (int i = strings.length - 1; i >= 0; i--) {
			sortDesc[count++] = strings[i];
		}
		return sortDesc;
	}

}
