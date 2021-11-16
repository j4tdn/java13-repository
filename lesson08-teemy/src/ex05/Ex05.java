package ex05;

public class Ex05 {
	public static void main(String[] args) {
		String s1="ABCEDEABC";
		String s2="ABCEDCBBCK";
		child_longest(s1, s2);
	}

	private static void child_longest(String a1, String b1) {
		char[] a = a1.toCharArray();
		char[] b = b1.toCharArray();
		int n = a1.length();
		int m = b1.length();
		int max_size;
		String sub = "";
		int L[][] = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++)
			L[i][0] = 0;
		for (int j = 0; j <= m; j++)
			L[0][j] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (a[i - 1] == b[j - 1]) {
					L[i][j] = L[i - 1][j - 1] + 1;
				} else {
					if (L[i - 1][j] >= L[i][j - 1])
						L[i][j] = L[i - 1][j];
					else
						L[i][j] = L[i][j - 1];
				}
			}
		}
		max_size = L[n][m];
		int i = n;
		int j = m;
		while (L[i][j] != 0) {
			if (a[i - 1] == b[j - 1]) {
				sub += a[i - 1];
				i--;
				j--;
			} else {
				if (L[i - 1][j] >= L[i][j - 1])
					i--;
				else
					j--;
			}
		}
		for(int t=max_size-1;t>=0;t--) {
			System.out.print(sub.charAt(t));
		}
		
	}
}
