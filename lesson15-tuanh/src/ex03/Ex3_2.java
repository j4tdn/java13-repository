package ex03;

public class Ex3_2 {
	public static void main(String[] args)
	{
		String str = "aaaababbbddc";
		System.out.println("String is: "+ str);
		characterCount(str);
		// E tìm ra chính xác rồi, chỉ cần tìm phần tử có count là max in ra là xong
	}
	public static void characterCount(String str)
	{
		int counter[] = new int[256];
		int len = str.length();
		for (int i = 0; i < len; i++)
			counter[str.charAt(i)]++;
		char array[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			array[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == array[j])
					flag++;
			}
			if (flag == 1)
				System.out.println("The number of occurrences of " + str.charAt(i)
				+ " in the string is: " + counter[str.charAt(i)]);
		}
	}

}