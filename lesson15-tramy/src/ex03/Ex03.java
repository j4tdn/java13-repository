package ex03;

public class Ex03 {
	public static void main(String[] args) {
		String st1 = "Word";
		String st2 = "orWd";
		st1 = st1.toLowerCase();
		st2 = st2.toLowerCase();
		String st = "aaaababbbddc";
		check1(st1, st2);
		check2(st);

	}

	private static void check1(String st1, String st2) {
		int n1 = st1.length();
		int n2 = st2.length();
		if (n1 != n2) {
			System.out.println("False2");
			return;
		}
		int[] c1 = new int[st1.length()];
		String st11 = "";
		int tmp;
		for (int i = 0; i < n1; i++) {
			tmp = 0;
			char a1 = st1.charAt(i);
			for (int j = 0; j < st11.length(); j++) {
				char a2 = st11.charAt(j);
				if (a1 == a2) {
					c1[j] += 1;
					tmp = 1;
					break;
				}
			}
			if (tmp == 0) {
				st11 = st11 + a1;
			}
		}

		int[] c2 = new int[st1.length()];
		String st22 = "";
		for (int i = 0; i < n2; i++) {
			tmp = 0;
			char a1 = st2.charAt(i);
			for (int j = 0; j < st11.length(); j++) {
				char a2 = st11.charAt(j);
				if (a1 == a2) {
					c2[j] += 1;
					tmp = 1;
					break;
				}
			}
			if (tmp == 0) {
				System.out.println("False1");
				return;
			}
		}
		for (int t = 0; t < c1.length; t++) {
			c1[t] += 1;
			if (c1[t] != c2[t]) {
				System.out.println("False");
				return;
			}
		}

		System.out.println("True");
		return;
	}

	private static void check2(String st) {
		int[] c = new int[st.length()];
		String st2 = "";
		int n = st.length();
		int tmp;
		int maxa = 0;
		for (int i = 0; i < n; i++) {
			tmp = 0;
			char a1 = st.charAt(i);
			for (int j = 0; j < st2.length(); j++) {
				char a2 = st2.charAt(j);
				if (a1 == a2) {
					c[j] += 1;
					if (c[j] > maxa) {
						maxa = c[j];
					}
					tmp = 1;
					break;
				}
			}
			if (tmp == 0) {
				st2 = st2 + a1;
			}
		}
		System.out.println("kí tự có số lần xuất hiện nhiều nhất trong chuỗi");
		for (int i = 0; i < st2.length(); i++) {
			if (c[i] == maxa) {
				System.out.print(st2.charAt(i) + " ");
			}
		}
	}
}
