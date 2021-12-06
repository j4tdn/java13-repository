//package utils;
//
//import java.util.Arrays;
//
//public class ArrayUtils {
//	private ArrayUtils() {
//
//	}
//
//	public static int getPriority(String s) {
//		int priority = 0;
//		if ("Special".equals(s)) {
//			priority = 1;
//		} else if (isDigit(s)) {
//			priority = Integer.parseInt(s) < 0 ? 2 : 3;
//		} else if (s == null) {
//			priority = 5;
//		} else {
//			priority = 4;
//		}
//		return priority;
//	}
//
//	public static int getNumberOfNullString(String[] strings) {
//		int count = 0;
//		for (int i = 0; i < strings.length; i++) {
//			if (strings[i] == null) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static int getSpecialString(String[] strings) {
//		int count = 0;
//		for (int i = 0; i < strings.length; i++) {
//			if ("Special".equals(strings[i])) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static String[] getNumber(String[] strings) {
//		String[] result = new String[strings.length];
//		int count = 0;
//		for (int i = 0; i < strings.length; i++) {
//			if (isDigit(strings[i])) {
//				result[count++] = strings[i];
//			}
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//	public static String[] getString(String[] strings) {
//		String[] result = new String[strings.length];
//		int count = 0;
//		for (int i = 0; i < strings.length; i++) {
//			if (strings[i] != null && "Special".equals(strings[i]) && !isDigit(strings[i])) {
//				result[count++] = strings[i];
//			}
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
//
//	private static boolean isDigit(String s) {
//		try {
//			Integer.parseInt(s);
//		} catch (Exception ex) {
//			return false;
//		}
//		return true;
//	}
//}
