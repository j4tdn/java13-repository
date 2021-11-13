package ex02;

public class LargestNumber {
	public static void main(String[] args) {
		String n1 = "01sdj034hnxd657ns328dn6";
		String n2 = "bns823bdk0172nd7439nx7328";
		String n3 = "hjnsd372129ncu7326nxzkd888";

		String[] a1 = split(n1);
		String[] a2 = split(n2);
		String[] a3 = split(n3);
		int[] a = { maxa(a1), maxa(a2), maxa(a3) };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

	public static String[] split(String n) {
		String[] a = n.split("[a-z]+");
		return a;
	}

	public static int maxa(String[] a) {
		int max = 0;
		if (a == null) {
			max = 0;
		} else {
			for (String i : a) {
				if (max < Integer.parseInt(i)) {
					max = Integer.parseInt(i);
				}
			}
		}
		return max;
	}
}
