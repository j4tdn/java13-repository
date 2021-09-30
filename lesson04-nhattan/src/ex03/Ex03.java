package ex03;

/**
 * Viết chương trình in ra màn hình tam giác Pascal. 
 * Ví dụ, với n=4 sẽ in ra hình sau:
	1 1
	1 2 1
	1 3 3 1
	1 4 6 4 1
	1 5 10 10 5 1
... Hàng thứ n được xác định từ hàng n-1:
- Phần tử đầu tiên và phần tử cuối cùng đều bằng 1.
- Phần tử thứ 2 là tổng của phần tử thứ nhất và thứ 2 của hàng n-1
- Phần tử thứ k của hàng thứ n là tổng của phần tử thứ k-1 và k của hàng thứ n-1.
 */

public class Ex03 {
	public static void main(String[] args) {
		int n = 4;
		for(int i = 1; i <= n + 1; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print(combination(i, j) + "  ");
			System.out.println();
		}
	}
	
	private static long combination(int n, int k) {
		return factorial(n) / (factorial(n - k) * factorial(k)) ;
	}
	
	private static long factorial(int n) {
		long fact = 1;
		while (n > 1) {
			fact *= n;
			n--;
		}
		return fact;
	}
	
	
}
