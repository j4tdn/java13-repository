package bai3;

import java.util.Scanner;

// 14đ
public class BCNN {
public static void main(String[] args) {
	int[] A = new int[1000];
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("\n\nNhap vao so phan tu: ");
    n = sc.nextInt();
    for(int i=0;i<n;i++){
    	System.out.println("\n\nNhap phan tu thu "+i+": ");
       A[i]= sc.nextInt();
        }
    System.out.println(BCNNOfM(A,n));
}
public static int UCLN(int a, int b){
	// E dùng đệ quy nhưng đang lỗi
	// Hoặc dùng cách này cũng được. A copy từ bài 1 bạn khác
	// Có idea. Chỉ đang bị stuck chỗ UCLN
	if (a == 0 || b == 0) {
		return a + b;
	}
	while (a != b) {
		if (a > b) {
			a -= b;
		} else {
			b -= a;
		}
	}
	return a;
}

public static int BCNN(int a, int b){
    return (a*b/UCLN(a,b) );
}

public static int BCNNOfM(int a[],int n){
		// Nên kiểm tra độ dài của mảng a >= 2 trước khi truy cập a[0], a[1]
	    // Tránh ArrayIndexOutOfBoundException
        int temp = BCNN(a[0], a[1] );
        for(int i=2;i<n;i++){
            temp = BCNN(temp, a[i]);    
        }
        return temp;
    }
}

